/**
 */
package QWiki.Kernel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>I1 8n Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Kernel.I18nNamedElement#getDisplayName <em>Display Name</em>}</li>
 * </ul>
 *
 * @see QWiki.Kernel.KernelPackage#getI18nNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface I18nNamedElement extends QWikiNamedElement {
	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' containment reference.
	 * @see #setDisplayName(I18nString)
	 * @see QWiki.Kernel.KernelPackage#getI18nNamedElement_DisplayName()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	I18nString getDisplayName();

	/**
	 * Sets the value of the '{@link QWiki.Kernel.I18nNamedElement#getDisplayName <em>Display Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' containment reference.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(I18nString value);

} // I18nNamedElement
