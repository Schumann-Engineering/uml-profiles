/**
 */
package QWiki.Kernel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>I1 8n Descriptive Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Kernel.I18nDescriptiveElement#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link QWiki.Kernel.I18nDescriptiveElement#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see QWiki.Kernel.KernelPackage#getI18nDescriptiveElement()
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
	 * @see QWiki.Kernel.KernelPackage#getI18nDescriptiveElement_Purpose()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	I18nString getPurpose();

	/**
	 * Sets the value of the '{@link QWiki.Kernel.I18nDescriptiveElement#getPurpose <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' containment reference.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(I18nString value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(I18nString)
	 * @see QWiki.Kernel.KernelPackage#getI18nDescriptiveElement_Content()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	I18nString getContent();

	/**
	 * Sets the value of the '{@link QWiki.Kernel.I18nDescriptiveElement#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(I18nString value);

} // I18nDescriptiveElement
