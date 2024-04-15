/**
 */
package QWiki;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>L1 0n Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.L10nNamedElement#getDisplayName <em>Display Name</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getL10nNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface L10nNamedElement extends QWikiNamedElement {
	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' containment reference.
	 * @see #setDisplayName(L10nString)
	 * @see QWiki.QWikiPackage#getL10nNamedElement_DisplayName()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	L10nString getDisplayName();

	/**
	 * Sets the value of the '{@link QWiki.L10nNamedElement#getDisplayName <em>Display Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' containment reference.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(L10nString value);

} // L10nNamedElement
