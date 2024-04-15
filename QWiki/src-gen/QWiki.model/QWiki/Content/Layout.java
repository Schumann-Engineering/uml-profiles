/**
 */
package QWiki.Content;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Content.Layout#getLayoutType <em>Layout Type</em>}</li>
 * </ul>
 *
 * @see QWiki.Content.ContentPackage#getLayout()
 * @model
 * @generated
 */
public interface Layout extends Content {
	/**
	 * Returns the value of the '<em><b>Layout Type</b></em>' attribute.
	 * The literals are from the enumeration {@link QWiki.Content.LayoutType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Type</em>' attribute.
	 * @see QWiki.Content.LayoutType
	 * @see #setLayoutType(LayoutType)
	 * @see QWiki.Content.ContentPackage#getLayout_LayoutType()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	LayoutType getLayoutType();

	/**
	 * Sets the value of the '{@link QWiki.Content.Layout#getLayoutType <em>Layout Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Type</em>' attribute.
	 * @see QWiki.Content.LayoutType
	 * @see #getLayoutType()
	 * @generated
	 */
	void setLayoutType(LayoutType value);

} // Layout
