/**
 */
package QWiki;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>L1 0n Base String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.L10nBaseString#getText <em>Text</em>}</li>
 *   <li>{@link QWiki.L10nBaseString#getEncryptionKey <em>Encryption Key</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getL10nBaseString()
 * @model
 * @generated
 */
public interface L10nBaseString extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.L10nText}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' containment reference list.
	 * @see QWiki.QWikiPackage#getL10nBaseString_Text()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningElement'"
	 * @generated
	 */
	EList<L10nText> getText();

	/**
	 * Returns the value of the '<em><b>Encryption Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encryption Key</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryption Key</em>' reference.
	 * @see #setEncryptionKey(QWikiEncryptionKey)
	 * @see QWiki.QWikiPackage#getL10nBaseString_EncryptionKey()
	 * @model resolveProxies="false" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='l10nbasestring'"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	QWikiEncryptionKey getEncryptionKey();

	/**
	 * Sets the value of the '{@link QWiki.L10nBaseString#getEncryptionKey <em>Encryption Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption Key</em>' reference.
	 * @see #getEncryptionKey()
	 * @generated
	 */
	void setEncryptionKey(QWikiEncryptionKey value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" languageRequired="true" languageOrdered="false"
	 * @generated
	 */
	String value(String language);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='encryptionKey &lt;&gt; null'"
	 * @generated
	 */
	boolean isEncrypted();

} // L10nBaseString
