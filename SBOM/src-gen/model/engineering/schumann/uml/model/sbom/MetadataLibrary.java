/**
 */
package engineering.schumann.uml.model.sbom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.model.sbom.MetadataLibrary#getArtifactMeta <em>Artifact Meta</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.MetadataLibrary#getSupplierMeta <em>Supplier Meta</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getMetadataLibrary()
 * @model
 * @generated
 */
public interface MetadataLibrary extends EObject {
	/**
	 * Returns the value of the '<em><b>Artifact Meta</b></em>' containment reference list.
	 * The list contents are of type {@link engineering.schumann.uml.model.sbom.ArtifactMetadata}.
	 * It is bidirectional and its opposite is '{@link engineering.schumann.uml.model.sbom.ArtifactMetadata#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Meta</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Meta</em>' containment reference list.
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getMetadataLibrary_ArtifactMeta()
	 * @see engineering.schumann.uml.model.sbom.ArtifactMetadata#getLibrary
	 * @model opposite="library" containment="true" ordered="false"
	 * @generated
	 */
	EList<ArtifactMetadata> getArtifactMeta();

	/**
	 * Returns the value of the '<em><b>Supplier Meta</b></em>' containment reference list.
	 * The list contents are of type {@link engineering.schumann.uml.model.sbom.SupplierMetadata}.
	 * It is bidirectional and its opposite is '{@link engineering.schumann.uml.model.sbom.SupplierMetadata#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier Meta</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier Meta</em>' containment reference list.
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getMetadataLibrary_SupplierMeta()
	 * @see engineering.schumann.uml.model.sbom.SupplierMetadata#getLibrary
	 * @model opposite="library" containment="true" ordered="false"
	 * @generated
	 */
	EList<SupplierMetadata> getSupplierMeta();

} // MetadataLibrary
