/**
 */
package QWiki;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.RelationshipType#getTypedAssociation <em>Typed Association</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getRelationshipType()
 * @model
 * @generated
 */
public interface RelationshipType extends I18nNamedElement {
	/**
	 * Returns the value of the '<em><b>Typed Association</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Association}.
	 * It is bidirectional and its opposite is '{@link QWiki.Association#getEndRelationshipType <em>End Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typed Association</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typed Association</em>' reference list.
	 * @see QWiki.QWikiPackage#getRelationshipType_TypedAssociation()
	 * @see QWiki.Association#getEndRelationshipType
	 * @model opposite="endRelationshipType" transient="true" ordered="false"
	 * @generated
	 */
	EList<Association> getTypedAssociation();

} // RelationshipType
