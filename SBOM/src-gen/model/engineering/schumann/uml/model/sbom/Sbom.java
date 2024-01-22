/**
 */
package engineering.schumann.uml.model.sbom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sbom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.model.sbom.Sbom#getOwnedSystem <em>Owned System</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.Sbom#getOwnedRelationship <em>Owned Relationship</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getSbom()
 * @model
 * @generated
 */
public interface Sbom extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned System</b></em>' containment reference list.
	 * The list contents are of type {@link engineering.schumann.uml.model.sbom.System}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned System</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned System</em>' containment reference list.
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getSbom_OwnedSystem()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<engineering.schumann.uml.model.sbom.System> getOwnedSystem();

	/**
	 * Returns the value of the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link engineering.schumann.uml.model.sbom.Relationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Relationship</em>' containment reference list.
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getSbom_OwnedRelationship()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Relationship> getOwnedRelationship();

} // Sbom
