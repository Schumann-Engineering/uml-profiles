/**
 */
package engineering.schumann.uml.model.sbom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.model.sbom.ArtifactMetadata#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.ArtifactMetadata#getLibrary <em>Library</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getArtifactMetadata()
 * @model
 * @generated
 */
public interface ArtifactMetadata extends Element {
	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link engineering.schumann.uml.model.sbom.SupplierMetadata#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' reference.
	 * @see #setSupplier(SupplierMetadata)
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getArtifactMetadata_Supplier()
	 * @see engineering.schumann.uml.model.sbom.SupplierMetadata#getComponent
	 * @model opposite="component" required="true" ordered="false"
	 * @generated
	 */
	SupplierMetadata getSupplier();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.model.sbom.ArtifactMetadata#getSupplier <em>Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier</em>' reference.
	 * @see #getSupplier()
	 * @generated
	 */
	void setSupplier(SupplierMetadata value);

	/**
	 * Returns the value of the '<em><b>Library</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link engineering.schumann.uml.model.sbom.MetadataLibrary#getArtifactMeta <em>Artifact Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' container reference.
	 * @see #setLibrary(MetadataLibrary)
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getArtifactMetadata_Library()
	 * @see engineering.schumann.uml.model.sbom.MetadataLibrary#getArtifactMeta
	 * @model opposite="artifactMeta" required="true" transient="false" ordered="false"
	 * @generated
	 */
	MetadataLibrary getLibrary();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.model.sbom.ArtifactMetadata#getLibrary <em>Library</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' container reference.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(MetadataLibrary value);

} // ArtifactMetadata
