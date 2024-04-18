/**
 */
package QWiki.Relationships;

import org.eclipse.uml2.uml.DirectedRelationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DO NOT USE Superseeding Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Relationships.DO_NOT_USE_SuperseedingRelationship#getSuperseedingType <em>Superseeding Type</em>}</li>
 * </ul>
 *
 * @see QWiki.Relationships.RelationshipsPackage#getDO_NOT_USE_SuperseedingRelationship()
 * @model
 * @generated
 */
public interface DO_NOT_USE_SuperseedingRelationship extends DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Superseeding Type</b></em>' attribute.
	 * The default value is <code>"Equal"</code>.
	 * The literals are from the enumeration {@link QWiki.Relationships.DO_NOT_USE_SuperseedingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superseeding Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superseeding Type</em>' attribute.
	 * @see QWiki.Relationships.DO_NOT_USE_SuperseedingType
	 * @see #setSuperseedingType(DO_NOT_USE_SuperseedingType)
	 * @see QWiki.Relationships.RelationshipsPackage#getDO_NOT_USE_SuperseedingRelationship_SuperseedingType()
	 * @model default="Equal" required="true" ordered="false"
	 * @generated
	 */
	DO_NOT_USE_SuperseedingType getSuperseedingType();

	/**
	 * Sets the value of the '{@link QWiki.Relationships.DO_NOT_USE_SuperseedingRelationship#getSuperseedingType <em>Superseeding Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Superseeding Type</em>' attribute.
	 * @see QWiki.Relationships.DO_NOT_USE_SuperseedingType
	 * @see #getSuperseedingType()
	 * @generated
	 */
	void setSuperseedingType(DO_NOT_USE_SuperseedingType value);

} // DO_NOT_USE_SuperseedingRelationship
