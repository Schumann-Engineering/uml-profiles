/**
 */
package engineering.schumann.uml.model.sbom.impl;

import engineering.schumann.uml.model.sbom.ArtifactMetadata;
import engineering.schumann.uml.model.sbom.MetadataLibrary;
import engineering.schumann.uml.model.sbom.SBOMPackage;
import engineering.schumann.uml.model.sbom.SupplierMetadata;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.model.sbom.impl.ArtifactMetadataImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.impl.ArtifactMetadataImpl#getLibrary <em>Library</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactMetadataImpl extends ElementImpl implements ArtifactMetadata {
	/**
	 * The cached value of the '{@link #getSupplier() <em>Supplier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier()
	 * @generated
	 * @ordered
	 */
	protected SupplierMetadata supplier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactMetadataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBOMPackage.Literals.ARTIFACT_METADATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplierMetadata getSupplier() {
		if (supplier != null && supplier.eIsProxy()) {
			InternalEObject oldSupplier = (InternalEObject)supplier;
			supplier = (SupplierMetadata)eResolveProxy(oldSupplier);
			if (supplier != oldSupplier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBOMPackage.ARTIFACT_METADATA__SUPPLIER, oldSupplier, supplier));
			}
		}
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplierMetadata basicGetSupplier() {
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplier(SupplierMetadata newSupplier, NotificationChain msgs) {
		SupplierMetadata oldSupplier = supplier;
		supplier = newSupplier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SBOMPackage.ARTIFACT_METADATA__SUPPLIER, oldSupplier, newSupplier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplier(SupplierMetadata newSupplier) {
		if (newSupplier != supplier) {
			NotificationChain msgs = null;
			if (supplier != null)
				msgs = ((InternalEObject)supplier).eInverseRemove(this, SBOMPackage.SUPPLIER_METADATA__COMPONENT, SupplierMetadata.class, msgs);
			if (newSupplier != null)
				msgs = ((InternalEObject)newSupplier).eInverseAdd(this, SBOMPackage.SUPPLIER_METADATA__COMPONENT, SupplierMetadata.class, msgs);
			msgs = basicSetSupplier(newSupplier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBOMPackage.ARTIFACT_METADATA__SUPPLIER, newSupplier, newSupplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetadataLibrary getLibrary() {
		if (eContainerFeatureID() != SBOMPackage.ARTIFACT_METADATA__LIBRARY) return null;
		return (MetadataLibrary)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibrary(MetadataLibrary newLibrary, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLibrary, SBOMPackage.ARTIFACT_METADATA__LIBRARY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLibrary(MetadataLibrary newLibrary) {
		if (newLibrary != eInternalContainer() || (eContainerFeatureID() != SBOMPackage.ARTIFACT_METADATA__LIBRARY && newLibrary != null)) {
			if (EcoreUtil.isAncestor(this, newLibrary))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLibrary != null)
				msgs = ((InternalEObject)newLibrary).eInverseAdd(this, SBOMPackage.METADATA_LIBRARY__ARTIFACT_META, MetadataLibrary.class, msgs);
			msgs = basicSetLibrary(newLibrary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBOMPackage.ARTIFACT_METADATA__LIBRARY, newLibrary, newLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SBOMPackage.ARTIFACT_METADATA__SUPPLIER:
				if (supplier != null)
					msgs = ((InternalEObject)supplier).eInverseRemove(this, SBOMPackage.SUPPLIER_METADATA__COMPONENT, SupplierMetadata.class, msgs);
				return basicSetSupplier((SupplierMetadata)otherEnd, msgs);
			case SBOMPackage.ARTIFACT_METADATA__LIBRARY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLibrary((MetadataLibrary)otherEnd, msgs);
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
			case SBOMPackage.ARTIFACT_METADATA__SUPPLIER:
				return basicSetSupplier(null, msgs);
			case SBOMPackage.ARTIFACT_METADATA__LIBRARY:
				return basicSetLibrary(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SBOMPackage.ARTIFACT_METADATA__LIBRARY:
				return eInternalContainer().eInverseRemove(this, SBOMPackage.METADATA_LIBRARY__ARTIFACT_META, MetadataLibrary.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SBOMPackage.ARTIFACT_METADATA__SUPPLIER:
				if (resolve) return getSupplier();
				return basicGetSupplier();
			case SBOMPackage.ARTIFACT_METADATA__LIBRARY:
				return getLibrary();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SBOMPackage.ARTIFACT_METADATA__SUPPLIER:
				setSupplier((SupplierMetadata)newValue);
				return;
			case SBOMPackage.ARTIFACT_METADATA__LIBRARY:
				setLibrary((MetadataLibrary)newValue);
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
			case SBOMPackage.ARTIFACT_METADATA__SUPPLIER:
				setSupplier((SupplierMetadata)null);
				return;
			case SBOMPackage.ARTIFACT_METADATA__LIBRARY:
				setLibrary((MetadataLibrary)null);
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
			case SBOMPackage.ARTIFACT_METADATA__SUPPLIER:
				return supplier != null;
			case SBOMPackage.ARTIFACT_METADATA__LIBRARY:
				return getLibrary() != null;
		}
		return super.eIsSet(featureID);
	}

} //ArtifactMetadataImpl
