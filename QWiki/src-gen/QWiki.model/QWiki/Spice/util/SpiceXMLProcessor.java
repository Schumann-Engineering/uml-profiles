/**
 */
package QWiki.Spice.util;

import QWiki.Spice.SpicePackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SpiceXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpiceXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		SpicePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the SpiceResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new SpiceResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new SpiceResourceFactoryImpl());
		}
		return registrations;
	}

} //SpiceXMLProcessor
