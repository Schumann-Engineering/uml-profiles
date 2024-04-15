/**
 */
package QWiki;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>L1 0n Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.L10nValue#getLanguage <em>Language</em>}</li>
 *   <li>{@link QWiki.L10nValue#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getL10nValue()
 * @model
 * @generated
 */
public interface L10nValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see QWiki.QWikiPackage#getL10nValue_Language()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link QWiki.L10nValue#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see QWiki.QWikiPackage#getL10nValue_Body()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link QWiki.L10nValue#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

} // L10nValue
