/**
 */
package QWiki.Kernel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>I1 8n Keyed String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Kernel.I18nKeyedString#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see QWiki.Kernel.KernelPackage#getI18nKeyedString()
 * @model
 * @generated
 */
public interface I18nKeyedString extends I18nBaseString {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see QWiki.Kernel.KernelPackage#getI18nKeyedString_Key()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link QWiki.Kernel.I18nKeyedString#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

} // I18nKeyedString
