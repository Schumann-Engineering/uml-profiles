package engineering.schumann.uml.m2t.sbom.services;

import engineering.schumann.uml.model.sbom.MetadataLibrary;
import engineering.schumann.uml.model.sbom.Namespace;
import engineering.schumann.uml.model.sbom.Sbom;

public class SbomEnrichmentServiceImpl {
	public static void EnrichSbom(
			Sbom sbom
	) {
		EnrichSbom(sbom, LibraryServiceImpl.LIBRARY);
	}
	
	
	public static void EnrichSbom(
			Sbom sbom,
			MetadataLibrary metadata
	) {
		// === GUARDS ===
		if (sbom == null)
			return;
		if (metadata == null)
			return;
		
		// === BODY ===
		sbom.eAllContents().forEachRemaining( c -> {
			// only process NamedElement to have name and version
			if (!(c instanceof Namespace))
				return;
			
			var element = (Namespace)c;
			
			EnrichSbom(element, metadata);
		});
		
		
		// === RESULT ===
		// none
	}

	
	public static void EnrichSbom(
			Namespace element,
			MetadataLibrary metadata
	)
	{
		// === GUARDS ===
		if (element == null)
			return;
		if (metadata == null)
			return;
		
		
		// === BODY ===
		// try to find artifact matching element
		var artifact = ArtifactMetaServiceImpl.FindArtifact(element, metadata);
		if (artifact == null)
			return;
		
		System.out.println(String.format(
				"INFO: [SBOM] enriching element '%s' with metadata",
				element.getName()
			));
		
		// copy all properties from metadata to element
		for (var property : artifact.getOwnedProperty())
		{
			var key = property.getKey();
			if (key == null)
				continue;
			key = key.trim();
			if (key.isBlank())
				continue;
			
			var value = property.getValue();
			if (value == null)
				continue;
			value = value.trim();
			
			// add some properties to first class properties of element
			// the rest we add as generic property
			try
			{
				switch (key.toLowerCase())
				{
					case "name":
					case "full name":
						// try to find full name instead
						var fullName = PropertyServiceImpl.GetPropertyValue("full name", artifact.getOwnedProperty(), null);
						if (fullName != null)
							element.setName(fullName);
						else
							element.setName(value);
						break;
						
					case "supplier":
						// try to find supplier in metadata
						// goal: we want to have a richer output for the supplier
						var supplier = SupplierMetaServiceImpl.FindSupplier(value, metadata);
						if (supplier == null)
						{
							element.setSupplier(value);
							break;
						}
						
						var supplierName = PropertyServiceImpl.GetPropertyValue("full name", supplier.getOwnedProperty(), null);
						if (supplierName == null)
							supplierName = PropertyServiceImpl.GetPropertyValue("name", supplier.getOwnedProperty(), value);
						
						element.setSupplier(String.format(
							"%s (address: %s; website: %s)",
							supplierName,
							PropertyServiceImpl.GetPropertyValue("address", supplier.getOwnedProperty(), "unknown"),
							PropertyServiceImpl.GetPropertyValue("website", supplier.getOwnedProperty(), "unknown")
						));
						break;
						
						
					default:
						// use default implementation
						PropertyServiceImpl.SetProperty(element, key, value);
						break;
				}			
			}
			catch (Exception e)
			{
				System.err.println(String.format(
						"ERROR: [SBOM] while enrichting element '%s': %s",
						element.getName(),
						e.getMessage()
					));
			}
			
			
			// === RESULT ===
			// none
		}
	}
}
