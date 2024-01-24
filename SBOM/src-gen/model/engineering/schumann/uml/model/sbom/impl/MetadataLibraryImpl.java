/**
 */
package engineering.schumann.uml.model.sbom.impl;

import engineering.schumann.uml.model.sbom.ArtifactMetadata;
import engineering.schumann.uml.model.sbom.MetadataLibrary;
import engineering.schumann.uml.model.sbom.SBOMPackage;
import engineering.schumann.uml.model.sbom.SupplierMetadata;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metadata Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.model.sbom.impl.MetadataLibraryImpl#getArtifactMeta <em>Artifact Meta</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.impl.MetadataLibraryImpl#getSupplierMeta <em>Supplier Meta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetadataLibraryImpl extends MinimalEObjectImpl.Container implements MetadataLibrary {
	/**
	 * The cached value of the '{@link #getArtifactMeta() <em>Artifact Meta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactMeta()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtifactMetadata> artifactMeta;

	/**
	 * The cached value of the '{@link #getSupplierMeta() <em>Supplier Meta</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierMeta()
	 * @generated
	 * @ordered
	 */
	protected EList<SupplierMetadata> supplierMeta;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetadataLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBOMPackage.Literals.METADATA_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArtifactMetadata> getArtifactMeta() {
		if (artifactMeta == null) {
			artifactMeta = new EObjectContainmentWithInverseEList<ArtifactMetadata>(ArtifactMetadata.class, this, SBOMPackage.METADATA_LIBRARY__ARTIFACT_META, SBOMPackage.ARTIFACT_METADATA__LIBRARY);
		}
		return artifactMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SupplierMetadata> getSupplierMeta() {
		if (supplierMeta == null) {
			supplierMeta = new EObjectContainmentWithInverseEList<SupplierMetadata>(SupplierMetadata.class, this, SBOMPackage.METADATA_LIBRARY__SUPPLIER_META, SBOMPackage.SUPPLIER_METADATA__LIBRARY);
		}
		return supplierMeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SBOMPackage.METADATA_LIBRARY__ARTIFACT_META:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArtifactMeta()).basicAdd(otherEnd, msgs);
			case SBOMPackage.METADATA_LIBRARY__SUPPLIER_META:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupplierMeta()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SBOMPackage.METADATA_LIBRARY__ARTIFACT_META:
				return ((InternalEList<?>)getArtifactMeta()).basicRemove(otherEnd, msgs);
			case SBOMPackage.METADATA_LIBRARY__SUPPLIER_META:
				return ((InternalEList<?>)getSupplierMeta()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBOMPackage.METADATA_LIBRARY__ARTIFACT_META:
				return getArtifactMeta();
			case SBOMPackage.METADATA_LIBRARY__SUPPLIER_META:
				return getSupplierMeta();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SBOMPackage.METADATA_LIBRARY__ARTIFACT_META:
				getArtifactMeta().clear();
				getArtifactMeta().addAll((Collection<? extends ArtifactMetadata>)newValue);
				return;
			case SBOMPackage.METADATA_LIBRARY__SUPPLIER_META:
				getSupplierMeta().clear();
				getSupplierMeta().addAll((Collection<? extends SupplierMetadata>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SBOMPackage.METADATA_LIBRARY__ARTIFACT_META:
				getArtifactMeta().clear();
				return;
			case SBOMPackage.METADATA_LIBRARY__SUPPLIER_META:
				getSupplierMeta().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SBOMPackage.METADATA_LIBRARY__ARTIFACT_META:
				return artifactMeta != null && !artifactMeta.isEmpty();
			case SBOMPackage.METADATA_LIBRARY__SUPPLIER_META:
				return supplierMeta != null && !supplierMeta.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MetadataLibraryImpl
