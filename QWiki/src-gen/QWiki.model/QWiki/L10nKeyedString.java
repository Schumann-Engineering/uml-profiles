/**
 */
package QWiki;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>L1 0n Keyed String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.L10nKeyedString#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getL10nKeyedString()
 * @model
 * @generated
 */
public interface L10nKeyedString extends L10nBaseString {
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
	 * @see QWiki.QWikiPackage#getL10nKeyedString_Key()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link QWiki.L10nKeyedString#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

} // L10nKeyedString
