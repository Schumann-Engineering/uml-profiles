/**
 */
package QWiki.I18N;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see QWiki.I18N._Package
 * @generated
 */
public interface _Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	_Factory eINSTANCE = QWiki.I18N.impl._FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>I1 8n Base String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>I1 8n Base String</em>'.
	 * @generated
	 */
	I18nBaseString createI18nBaseString();

	/**
	 * Returns a new object of class '<em>I1 8n Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>I1 8n Value</em>'.
	 * @generated
	 */
	I18nValue createI18nValue();

	/**
	 * Returns a new object of class '<em>I1 8n String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>I1 8n String</em>'.
	 * @generated
	 */
	I18nString createI18nString();

	/**
	 * Returns a new object of class '<em>I1 8n Keyed String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>I1 8n Keyed String</em>'.
	 * @generated
	 */
	I18nKeyedString createI18nKeyedString();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	_Package get_Package();

} //_Factory
