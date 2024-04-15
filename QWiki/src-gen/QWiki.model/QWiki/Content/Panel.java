/**
 */
package QWiki.Content;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Content.Panel#getPanelType <em>Panel Type</em>}</li>
 * </ul>
 *
 * @see QWiki.Content.ContentPackage#getPanel()
 * @model
 * @generated
 */
public interface Panel extends ContentContainer {
	/**
	 * Returns the value of the '<em><b>Panel Type</b></em>' attribute.
	 * The literals are from the enumeration {@link QWiki.Content.PanelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Panel Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Panel Type</em>' attribute.
	 * @see QWiki.Content.PanelType
	 * @see #setPanelType(PanelType)
	 * @see QWiki.Content.ContentPackage#getPanel_PanelType()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	PanelType getPanelType();

	/**
	 * Sets the value of the '{@link QWiki.Content.Panel#getPanelType <em>Panel Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Panel Type</em>' attribute.
	 * @see QWiki.Content.PanelType
	 * @see #getPanelType()
	 * @generated
	 */
	void setPanelType(PanelType value);

} // Panel
