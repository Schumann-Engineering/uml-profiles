/**
 */
package QWiki;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>I1 8n Descriptive Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.I18nDescriptiveElement#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link QWiki.I18nDescriptiveElement#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getI18nDescriptiveElement()
 * @model abstract="true"
 * @generated
 */
public interface I18nDescriptiveElement extends I18nNamedElement {
	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' containment reference.
	 * @see #setPurpose(I18nString)
	 * @see QWiki.QWikiPackage#getI18nDescriptiveElement_Purpose()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	I18nString getPurpose();

	/**
	 * Sets the value of the '{@link QWiki.I18nDescriptiveElement#getPurpose <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' containment reference.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(I18nString value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(I18nString)
	 * @see QWiki.QWikiPackage#getI18nDescriptiveElement_Body()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	I18nString getBody();

	/**
	 * Sets the value of the '{@link QWiki.I18nDescriptiveElement#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(I18nString value);

} // I18nDescriptiveElement
