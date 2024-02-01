package engineering.schumann.uml.m2t.uml.services;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;


public class AnnotationServiceImpl {
	/**
	 * 
	 **/
	public String getAnnotation(
			EClass object,
			String source,
			String detailsKey
	)
	{
		// === GUARD ===
		if (object == null)
			return null;
		if (source == null)
			return null;
		
		// === BODY ===
		for (EAnnotation annotation : object.getEAnnotations())
			if (source.equalsIgnoreCase(annotation.getSource()))
				// === SUCCESS ===
				return getAnnotation(annotation, detailsKey);
		
		// === FAILURE ===
		return null;
	}
	
	
	/**
	 * 
	 **/
	public String getAnnotation(
			EAnnotation annotation,
			String detailsKey
	)
	{
		// === GUARDS ===
		if (annotation == null)
			return null;
		if (detailsKey == null || detailsKey.isBlank())
			return null;
		
		// === BODY ===
		var value = annotation.getDetails().get(detailsKey);
		if (value == null)
			// === FAILURE ===
			return null;
		
		// === SUCCESS ===
		return value;
	}
}
