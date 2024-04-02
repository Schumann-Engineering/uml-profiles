/**
 */
package QWiki.Kernel.Relationships;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DO NOT USE Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Kernel.Relationships.DO_NOT_USE_ModelElement#getSuperseedingRelationship <em>Superseeding Relationship</em>}</li>
 * </ul>
 *
 * @see QWiki.Kernel.Relationships.RelationshipsPackage#getDO_NOT_USE_ModelElement()
 * @model abstract="true"
 * @generated
 */
public interface DO_NOT_USE_ModelElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Kernel.Relationships.DO_NOT_USE_SuperseedingRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superseeding Relationship</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superseeding Relationship</em>' reference list.
	 * @see QWiki.Kernel.Relationships.RelationshipsPackage#getDO_NOT_USE_ModelElement_SuperseedingRelationship()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='document'"
	 * @generated
	 */
	EList<DO_NOT_USE_SuperseedingRelationship> getSuperseedingRelationship();

} // DO_NOT_USE_ModelElement
