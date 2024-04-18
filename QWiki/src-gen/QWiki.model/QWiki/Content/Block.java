/**
 */
package QWiki.Content;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Content.Block#getBlockType <em>Block Type</em>}</li>
 * </ul>
 *
 * @see QWiki.Content.ContentPackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends ContentContainer {
	/**
	 * Returns the value of the '<em><b>Block Type</b></em>' attribute.
	 * The literals are from the enumeration {@link QWiki.Content.BlockType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Type</em>' attribute.
	 * @see QWiki.Content.BlockType
	 * @see #setBlockType(BlockType)
	 * @see QWiki.Content.ContentPackage#getBlock_BlockType()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	BlockType getBlockType();

	/**
	 * Sets the value of the '{@link QWiki.Content.Block#getBlockType <em>Block Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Type</em>' attribute.
	 * @see QWiki.Content.BlockType
	 * @see #getBlockType()
	 * @generated
	 */
	void setBlockType(BlockType value);

} // Block
