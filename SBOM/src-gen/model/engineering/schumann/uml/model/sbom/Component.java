/**
 */
package engineering.schumann.uml.model.sbom;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.model.sbom.Component#getOwner <em>Owner</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.Component#getRequiredBy <em>Required By</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends Namespace {

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link engineering.schumann.uml.model.sbom.Namespace#getOwnedComponent <em>Owned Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Namespace)
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getComponent_Owner()
	 * @see engineering.schumann.uml.model.sbom.Namespace#getOwnedComponent
	 * @model opposite="ownedComponent" transient="false" ordered="false"
	 * @generated
	 */
	Namespace getOwner();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.model.sbom.Component#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Namespace value);

	/**
	 * Returns the value of the '<em><b>Required By</b></em>' reference list.
	 * The list contents are of type {@link engineering.schumann.uml.model.sbom.Namespace}.
	 * It is bidirectional and its opposite is '{@link engineering.schumann.uml.model.sbom.Namespace#getRequiredComponent <em>Required Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required By</em>' reference list.
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getComponent_RequiredBy()
	 * @see engineering.schumann.uml.model.sbom.Namespace#getRequiredComponent
	 * @model opposite="requiredComponent" ordered="false"
	 * @generated
	 */
	EList<Namespace> getRequiredBy();
} // Component
