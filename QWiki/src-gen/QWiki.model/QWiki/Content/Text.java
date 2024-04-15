/**
 */
package QWiki.Content;

import QWiki.L10nString;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Content.Text#getTextType <em>Text Type</em>}</li>
 *   <li>{@link QWiki.Content.Text#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see QWiki.Content.ContentPackage#getText()
 * @model
 * @generated
 */
public interface Text extends Content {
	/**
	 * Returns the value of the '<em><b>Text Type</b></em>' attribute.
	 * The literals are from the enumeration {@link QWiki.Content.TextType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Type</em>' attribute.
	 * @see QWiki.Content.TextType
	 * @see #setTextType(TextType)
	 * @see QWiki.Content.ContentPackage#getText_TextType()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	TextType getTextType();

	/**
	 * Sets the value of the '{@link QWiki.Content.Text#getTextType <em>Text Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Type</em>' attribute.
	 * @see QWiki.Content.TextType
	 * @see #getTextType()
	 * @generated
	 */
	void setTextType(TextType value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' reference.
	 * @see #setBody(L10nString)
	 * @see QWiki.Content.ContentPackage#getText_Body()
	 * @model ordered="false"
	 * @generated
	 */
	L10nString getBody();

	/**
	 * Sets the value of the '{@link QWiki.Content.Text#getBody <em>Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(L10nString value);

} // Text
