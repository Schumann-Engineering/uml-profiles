package engineering.schumann.uml.m2t.services;

import org.eclipse.uml2.uml.*;

public class StereotypeService {
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
		for (Stereotype st : element.getAppliedStereotypes())
			if (st.equals(stereotype))
				return true;
		
		return false;		
	}
}
