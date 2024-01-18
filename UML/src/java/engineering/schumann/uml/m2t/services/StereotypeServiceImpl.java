package engineering.schumann.uml.m2t.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Stereotype;

public class StereotypeServiceImpl {
	public static final List<String> URI_IGNORE = Collections.unmodifiableList(new ArrayList<String>() {
		private static final long serialVersionUID = 1L;

		{
			add("pathmap://UML_PROFILES/Ecore.profile.uml");
			add("pathmap://UML_METAMODELS/UML.metamodel.uml");
		}
	});

	
	/**
	 * ================================================
	 * getStereotypeValue 
	 * ================================================
	 **/
	/**
	 * Returns the value of an stereotype
	 * 
	 * @param Element element
	 * @param Stereotype stereotype
	 * @param propertyName
	 * @return String
	**/
	public static String getStereotypeValue(
			Element element,
			Stereotype stereotype,			
			String propertyName)
	{
		// guard
		if (!hasStereotype(element, stereotype))
			return null;
		
		if (!element.hasValue(stereotype, propertyName))
			return null;
		
		Object value = element.getValue(stereotype, propertyName);
		
		if (value instanceof String) return (String)value;
		if (value instanceof Operation) return ((Operation)value).getName();
		if (value instanceof EnumerationLiteral) return ((EnumerationLiteral)value).getName();
	
		// otherwise
		return value.toString();
	}


	
	/**
	 * This method looks for stereotypes in the entire ResourceSet, not only the
	 * resource of the element itself.
	 * 
	 * NOTE:
	 * 	element.getAppliedStereotypes() always returns null for Papyrus UML models, because
	 *  stereotypes are stored besides the UML Model in the XMI file, and not as packaged element!
	 * 
	 * @param element
	 * @return
	 */
	public static Boolean hasStereotypes(
			Element element
	)
	{
		/* ====================
		 * DEFAULT, if all works well
		 * 
		 * NOTE:
		 * this only works, if profiles use file-URIs or have been mapped to file-URIs using
		 * the global URIConverter.URI_MAP!
		 * 
		 * Eclipse-pathmap-URI or Eclipse-platform-URIs ***DO NOT WORK***
		 * ==================== */
		EList<Stereotype> stereotypes = element.getAppliedStereotypes();
		
		if (stereotypes != null)
			return stereotypes.size() > 0;

			
		/* ====================
		 * FALL-BACK
		 * 
		 * NOTE:
		 * This tries to find Stereotypes by hand.
		 * ==================== */
		System.err.println("Couldn't find any applied stereotypes! Fallback to search algorithm.");

/*
		
		System.out.println("trying to find stereotype for element: " + element);
		
		EList<Stereotype> stereotypeCandidates = element.getApplicableStereotypes();
		if (stereotypeCandidates.size() == 0)
			System.out.println("    - found CANDIDATE: !!! NONE !!!");		
		else
			for (Stereotype stereotypeCandidate : stereotypeCandidates)
			{
				System.out.println("    - found CANDIDATE: " + stereotypeCandidate);		
			}
		
		// navigate to the resource
		Resource res = element.eResource();
		// navigate to the resource set
		ResourceSet resSet = res.getResourceSet();
		// get all resources in the set
		EList<Resource> allRes = resSet.getResources();
		
		// iterate over resources and try to find stereotypes
		for (Resource globalRes : allRes)
		{
			String uri = globalRes.getURI().toString();
			
			// ignore element resource itself
			if (globalRes == res)
			{
				System.out.println("    - IGNORE (origin): " + uri);
				continue;
			}
			
			// ignore certain meta-models
			if (URI_IGNORE.contains(uri))
			{
				System.out.println("    - IGNORE (ignore list): " + uri);
				continue;
			}
			
			System.out.println("    - found RESSOURCE: " + uri);
			
			TreeIterator<EObject> directElements = globalRes.getAllContents();
			// System.out.println("        - found NO. OF ELEMENT: " + directElements. .size());
			
			while (directElements.hasNext())
			{
				EObject candidate = directElements.next();

				System.out.println("        - checking ELEMENT: " + candidate);
				
				if (!(candidate instanceof EClass))
				{
					System.out.println("            - abort: not an EClass");
					
					continue;
				}
				
				EClass candidateClass = (EClass)candidate;				
				
				EList<EAnnotation> annotations = candidateClass.getEAnnotations();
				if (annotations == null || annotations.size() == 0)
				{
					System.out.println("            - abort: no annotations");
					continue;
				}
				
				for (EAnnotation annotation : annotations)
				{
					System.out.println("            - annotation found: " + annotation);
				}
				
				//boolean check = .  instanceof Stereotype;
				//System.out.println("            - is stereotype: " + check);
			}
		}
		
		System.out.println( "" );
*/	
		
		return false;
	}
	
	
	public static EObject getStereotypeInstance(
			Element element,
			Stereotype stereotype
	)
	{		
		// === GUARDS ===
		if (element == null)
			return null;
		if (stereotype == null)
			return null;
		
		
		// === BODY ===
		// we only look in the same resource as the element itself
		// = same model file
		Resource resource = element.eResource();
		
		// search for elements
		TreeIterator<EObject> elements = resource.getAllContents();
		while (elements.hasNext())
		{
			EObject candidate = elements.next();
			
			if (isMatch(element, stereotype, candidate))
				// === SUCCESS ===
				return candidate;
		}
		
		// === FAILURE ===
		return null;
	}


	
	/**
	 * 
	 * 
	 * @param element
	 * @param stereotype
	 * @return
	 */
	protected static Boolean hasStereotype(
			Element element,
			Stereotype stereotype)
	{
		// === BODY ===
		for (Stereotype st : element.getAppliedStereotypes())
			if (st.equals(stereotype))
				// === SUCCESS ===
				return true;
		
		// === FAILURE ===
		return false;		
	}
	
	
	protected static Boolean isMatch(
			Element element,
			Stereotype stereotype,
			EObject candidate
	)
	{
		// === GUARDS ===
		if (element == null)
			return false;
		if (stereotype == null)
			return false;
		if (candidate == null)
			return false;
		
		// === BODY ===
		var metaClass = candidate.eClass();
		
		// CHECK 1: name has to match
		var candidateName = metaClass.getName();
		var stereotypeName = stereotype.getName();

// FIXME this should look for the EPackage Annotation and match FQNs, not only name.
		if (!candidateName.equals(stereotypeName))
			// === FAILURE ===
			return false;

		// CHECK 2: candidate needs a "base_*" property matching element
		for (var attribute : metaClass.getEAllStructuralFeatures())
		{
			// GUARD: has to start with "base_"
			if (!attribute.getName().startsWith("base_"))
				continue;
			
			// try it!
			var value = candidate.eGet(attribute);
			if (value == element)
				// === SUCCESS ===
				return true;
		}

		
		// === FAILURE ===
		return false;
	}
	
}
