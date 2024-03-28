/**
 */
package QWiki;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Association#getEnd <em>End</em>}</li>
 *   <li>{@link QWiki.Association#getEndRelationshipType <em>End Relationship Type</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Relationship {
	/**
	 * Returns the value of the '<em><b>End Relationship Type</b></em>' reference list.
	 * The list contents are of type {@link QWiki.RelationshipType}.
	 * It is bidirectional and its opposite is '{@link QWiki.RelationshipType#getTypedAssociation <em>Typed Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Relationship Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Relationship Type</em>' reference list.
	 * @see QWiki.QWikiPackage#getAssociation_EndRelationshipType()
	 * @see QWiki.RelationshipType#getTypedAssociation
	 * @model opposite="typedAssociation" lower="2" upper="2" transient="true" ordered="false"
	 * @generated
	 */
	EList<RelationshipType> getEndRelationshipType();

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' reference list.
	 * @see QWiki.QWikiPackage#getAssociation_End()
	 * @model lower="2" upper="2" transient="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='association'"
	 * @generated
	 */
	EList<Element> getEnd();

} // Association
