/**
 */
package QWiki;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see QWiki.QWikiPackage
 * @generated
 */
public interface QWikiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QWikiFactory eINSTANCE = QWiki.impl.QWikiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>L1 0n Keyed String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>L1 0n Keyed String</em>'.
	 * @generated
	 */
	L10nKeyedString createL10nKeyedString();

	/**
	 * Returns a new object of class '<em>L1 0n Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>L1 0n Value</em>'.
	 * @generated
	 */
	L10nValue createL10nValue();

	/**
	 * Returns a new object of class '<em>Encryption Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encryption Key</em>'.
	 * @generated
	 */
	QWikiEncryptionKey createQWikiEncryptionKey();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	QWikiModel createQWikiModel();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	QWikiContainer createQWikiContainer();

	/**
	 * Returns a new object of class '<em>L1 0n String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>L1 0n String</em>'.
	 * @generated
	 */
	L10nString createL10nString();

	/**
	 * Returns a new object of class '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment</em>'.
	 * @generated
	 */
	QWikiComment createQWikiComment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QWikiPackage getQWikiPackage();

} //QWikiFactory
