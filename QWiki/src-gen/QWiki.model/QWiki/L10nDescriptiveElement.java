/**
 */
package QWiki;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>L1 0n Descriptive Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.L10nDescriptiveElement#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link QWiki.L10nDescriptiveElement#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getL10nDescriptiveElement()
 * @model abstract="true"
 * @generated
 */
public interface L10nDescriptiveElement extends L10nNamedElement {
	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' containment reference.
	 * @see #setPurpose(L10nString)
	 * @see QWiki.QWikiPackage#getL10nDescriptiveElement_Purpose()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	L10nString getPurpose();

	/**
	 * Sets the value of the '{@link QWiki.L10nDescriptiveElement#getPurpose <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' containment reference.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(L10nString value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(L10nString)
	 * @see QWiki.QWikiPackage#getL10nDescriptiveElement_Content()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	L10nString getContent();

	/**
	 * Sets the value of the '{@link QWiki.L10nDescriptiveElement#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(L10nString value);

} // L10nDescriptiveElement
