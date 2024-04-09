/**
 */
package QWiki.Kernel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see QWiki.Kernel.KernelPackage
 * @generated
 */
public interface KernelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KernelFactory eINSTANCE = QWiki.Kernel.impl.KernelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>I1 8n Keyed String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>I1 8n Keyed String</em>'.
	 * @generated
	 */
	I18nKeyedString createI18nKeyedString();

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
	 * Returns a new object of class '<em>QWiki Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QWiki Comment</em>'.
	 * @generated
	 */
	QWikiComment createQWikiComment();

	/**
	 * Returns a new object of class '<em>QWiki Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QWiki Container</em>'.
	 * @generated
	 */
	QWikiContainer createQWikiContainer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KernelPackage getKernelPackage();

} //KernelFactory
