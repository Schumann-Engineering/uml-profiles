/**
 */
package QWiki;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Superseeding Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.SuperseedingRelationship#getSuperseedingType <em>Superseeding Type</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getSuperseedingRelationship()
 * @model
 * @generated
 */
public interface SuperseedingRelationship extends UmlDirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Superseeding Type</b></em>' attribute.
	 * The default value is <code>"Equal"</code>.
	 * The literals are from the enumeration {@link QWiki.SuperseedingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superseeding Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superseeding Type</em>' attribute.
	 * @see QWiki.SuperseedingType
	 * @see #setSuperseedingType(SuperseedingType)
	 * @see QWiki.QWikiPackage#getSuperseedingRelationship_SuperseedingType()
	 * @model default="Equal" required="true" ordered="false"
	 * @generated
	 */
	SuperseedingType getSuperseedingType();

	/**
	 * Sets the value of the '{@link QWiki.SuperseedingRelationship#getSuperseedingType <em>Superseeding Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superseeding Type</em>' attribute.
	 * @see QWiki.SuperseedingType
	 * @see #getSuperseedingType()
	 * @generated
	 */
	void setSuperseedingType(SuperseedingType value);

} // SuperseedingRelationship
