package engineering.schumann.uml.m2t.sbom.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import engineering.schumann.uml.m2t.common.services.FileServiceImpl;
import engineering.schumann.uml.model.sbom.Component;
import engineering.schumann.uml.model.sbom.Namespace;
import engineering.schumann.uml.model.sbom.RelationshipType;
import engineering.schumann.uml.model.sbom.Sbom;
import engineering.schumann.uml.model.sbom.impl.SBOMFactoryImpl;

public class ManifestParserServiceImpl {
	public static final List<String> MANIFEST_EXTENSIONS = Arrays.asList(".manifest", ".sbom.manifest");

	
	public static Boolean hasSbomManifest(
			String		locator
	) throws Exception
	{
		return hasSbomManifest(locator, FileServiceImpl.EMPTY_PATH_LIST);
	}
	
	
	public static Boolean hasSbomManifest(
			String		locator,
			Object		pathsObj
	)
	{
		try
		{
			return FileServiceImpl.resolveFilename(locator, pathsObj, MANIFEST_EXTENSIONS, false) != null;
		}
		catch (Exception e)
		{
			return false;
		}
	}
	
	
	public static Sbom loadSbomManifest(
			String		locator
	) throws Exception
	{
		return loadSbomManifest(locator, FileServiceImpl.EMPTY_PATH_LIST);
	}
	
	
	public static Sbom loadSbomManifest(
			String		locator,
			Object		pathsObj
	) throws Exception, IOException
	{
		// === GUARDS ===
		
		// === BODY ===
		// resolve filename
		var filename = FileServiceImpl.resolveFilename(locator, pathsObj, MANIFEST_EXTENSIONS, true);
		
		// read file
		var manifest = Files.readString(Path.of(filename));
		var result = parseSbomManifest(manifest);
		
		/*
		 * enrich, if possible
		 */
		try
		{
			var metadata = LibraryServiceImpl.ReadSbomLibrary(locator, pathsObj);
			if (metadata != null)
			{
				System.out.println("found SBOM metadata database. Proceeding with enrichment.");
				
				SbomEnrichmentServiceImpl.EnrichSbom(result, metadata);
			}
		}
		catch (IOException e)
		{
			System.err.println("couldn't find SBOM metadata database. Proceeding without enrichment! (error: " + e.getMessage() + ")");
		}

		// === RESULT ===
		return result;		
	}
	

	public static Sbom parseSbomManifest(
			String content
	) throws Exception
	{
		// === GUARDS ===
		if (content == null)
			throw new Exception("content not provided");
		
		// === BODY ===
		// create resource
		var result = SBOMFactoryImpl.eINSTANCE.createSbom();
		var system = SBOMFactoryImpl.eINSTANCE.createSystem();
		result.getOwnedSystem().add(system);
		
		var components = new HashMap<String, Namespace>();
		var relationships = new ArrayList<AbstractMap.SimpleEntry<Namespace, String[]>>();
		
		Namespace lastComponent = null;
		var lines = content.split("\n|\r");
		for (int i=0; i<lines.length; i++)
		{
			var line = lines[i];
			
			if (line.isBlank())
				continue;
			if (line.startsWith("#"))
				continue;
			
			// parse line
			String[] parts = null;
			// advanced manifest file uses tabs
			if (line.contains("\t"))
				parts = line.split("\t");
			// standard manifest uses space
			else
				parts = line.split(" ");
			
			var firstPart = parts[0].trim();
			
			/*
			 * RELATIONSHIP
			 */
			if (firstPart.equals("->"))
			{
				// GUARD
				if (lastComponent == null)
					throw new Exception("found relationship '" + line + "' without component (line number: " + i + ")");
				if (parts.length < 3)
					throw new Exception("at least 3 parts to a relationship required: -> <type> <target>. Found only " + parts.length + " in: " + line + " (line number: " + i + ")");

				// remember relationship for now...
				// ... we need to resolve the target later after parsing all components
				relationships.add(new AbstractMap.SimpleEntry<Namespace, String[]>(lastComponent, parts));
			}
			/*
			 * PROPERTY
			 */
			else if (firstPart.equals("-") || firstPart.isBlank())
			{
				for (int p=1; p<=2 && p<parts.length; p++)
					PropertyServiceImpl.SetProperty(lastComponent, parts[p]);
			}
			/*
			 * COMPONENT
			 */
			else
			{
				if (parts.length <= 2)
					throw new Exception("Component needs more than information. Maybe missing tab? (line: '" + line + "'; line number: " + i + ")");
				
				var name = parts[0];
				//var componentArch = parts[1];
				var version = parts[2];
				
				// first line is used as system
				if (lastComponent == null)
				{
					system.setName(name);
					system.setVersion(version);			
					
					lastComponent = system;
				}
				// create component
				else
				{
					var component = SBOMFactoryImpl.eINSTANCE.createComponent();
					component.setName(name);
					component.setVersion(version);
				
					// add to system
					system.getOwnedComponent().add(component);
					// remember last
					lastComponent = component;
				}
				
				// remember
				components.put(name, lastComponent);
			}
			
			/*
			 * PROPERTIES
			 */
			for (int p=3; p<parts.length; p++)
				PropertyServiceImpl.SetProperty(lastComponent, parts[p]);
		}

		/*
		 * RESOLVE RELATIONSHIPS
		 */
		for (var relationshipMeta : relationships)
		{
			var source = relationshipMeta.getKey();

			// map target string -> component object 
			var targetName = relationshipMeta.getValue()[2];
			if (!components.containsKey(targetName))
				throw new Exception("couldn't find component '" + targetName + "' in relationship '" + String.join("\t", relationshipMeta.getValue()) + "'");
			var target = components.get(targetName);
			
			
			// create relationship
			var relationship = SBOMFactoryImpl.eINSTANCE.createRelationship();			
			// ... source
			relationship.setSource(source);
			// ... relationship type
			PropertyServiceImpl.SetType(relationship, relationshipMeta.getValue()[1]);
			if (relationship.getType() == RelationshipType.IS_REQUIRED_BY)
			{
				if (!(target instanceof Component))
					throw new Exception("expected a Component, but found '" + target.eClass().getName() + "' for target '" + targetName + "'");
				
				// add to component
				source.getRequiredComponent().add((Component)target);
			}
			if (relationship.getType() == RelationshipType.REQUIRES)
			{
				if (!(target instanceof Component))
					throw new Exception("expected a Component, but found '" + target.eClass().getName() + "' for target '" + targetName + "'");
				if (!(source instanceof Component))
					throw new Exception("expected a Component, but found '" + source.eClass().getName() + "' for target '" + source.getName() + "'");
				
				// add to component
				((Component)target).getRequiredComponent().add((Component)source);
			}
			// ... target
			relationship.setTarget(target);
			
			// add to sbom
			result.getOwnedRelationship().add(relationship);
		}
		
		// === RESULT ===
		return result;
	}
}
