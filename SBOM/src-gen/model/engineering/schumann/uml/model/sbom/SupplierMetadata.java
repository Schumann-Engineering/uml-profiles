/**
 */
package engineering.schumann.uml.model.sbom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplier Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.model.sbom.SupplierMetadata#getLibrary <em>Library</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.SupplierMetadata#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getSupplierMetadata()
 * @model
 * @generated
 */
public interface SupplierMetadata extends Element {
	/**
	 * Returns the value of the '<em><b>Library</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link engineering.schumann.uml.model.sbom.MetadataLibrary#getSupplierMeta <em>Supplier Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' container reference.
	 * @see #setLibrary(MetadataLibrary)
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getSupplierMetadata_Library()
	 * @see engineering.schumann.uml.model.sbom.MetadataLibrary#getSupplierMeta
	 * @model opposite="supplierMeta" required="true" transient="false" ordered="false"
	 * @generated
	 */
	MetadataLibrary getLibrary();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.model.sbom.SupplierMetadata#getLibrary <em>Library</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' container reference.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(MetadataLibrary value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference list.
	 * The list contents are of type {@link engineering.schumann.uml.model.sbom.ArtifactMetadata}.
	 * It is bidirectional and its opposite is '{@link engineering.schumann.uml.model.sbom.ArtifactMetadata#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference list.
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getSupplierMetadata_Component()
	 * @see engineering.schumann.uml.model.sbom.ArtifactMetadata#getSupplier
	 * @model opposite="supplier" ordered="false"
	 * @generated
	 */
	EList<ArtifactMetadata> getComponent();

} // SupplierMetadata
