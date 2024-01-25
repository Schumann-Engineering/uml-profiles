/**
 */
package engineering.schumann.uml.model.sbom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.model.sbom.System#getSbom <em>Sbom</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends Namespace {

	/**
	 * Returns the value of the '<em><b>Sbom</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link engineering.schumann.uml.model.sbom.Sbom#getOwnedSystem <em>Owned System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sbom</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sbom</em>' container reference.
	 * @see #setSbom(Sbom)
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getSystem_Sbom()
	 * @see engineering.schumann.uml.model.sbom.Sbom#getOwnedSystem
	 * @model opposite="ownedSystem" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Sbom getSbom();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.model.sbom.System#getSbom <em>Sbom</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sbom</em>' container reference.
	 * @see #getSbom()
	 * @generated
	 */
	void setSbom(Sbom value);
} // System
