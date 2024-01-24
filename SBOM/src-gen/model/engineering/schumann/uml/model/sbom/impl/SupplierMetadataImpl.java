/**
 */
package engineering.schumann.uml.model.sbom.impl;

import engineering.schumann.uml.model.sbom.ArtifactMetadata;
import engineering.schumann.uml.model.sbom.MetadataLibrary;
import engineering.schumann.uml.model.sbom.SBOMPackage;
import engineering.schumann.uml.model.sbom.SupplierMetadata;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supplier Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.model.sbom.impl.SupplierMetadataImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.impl.SupplierMetadataImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplierMetadataImpl extends ElementImpl implements SupplierMetadata {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtifactMetadata> component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplierMetadataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBOMPackage.Literals.SUPPLIER_METADATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetadataLibrary getLibrary() {
		if (eContainerFeatureID() != SBOMPackage.SUPPLIER_METADATA__LIBRARY) return null;
		return (MetadataLibrary)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLibrary(MetadataLibrary newLibrary, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLibrary, SBOMPackage.SUPPLIER_METADATA__LIBRARY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLibrary(MetadataLibrary newLibrary) {
		if (newLibrary != eInternalContainer() || (eContainerFeatureID() != SBOMPackage.SUPPLIER_METADATA__LIBRARY && newLibrary != null)) {
			if (EcoreUtil.isAncestor(this, newLibrary))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLibrary != null)
				msgs = ((InternalEObject)newLibrary).eInverseAdd(this, SBOMPackage.METADATA_LIBRARY__SUPPLIER_META, MetadataLibrary.class, msgs);
			msgs = basicSetLibrary(newLibrary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBOMPackage.SUPPLIER_METADATA__LIBRARY, newLibrary, newLibrary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArtifactMetadata> getComponent() {
		if (component == null) {
			component = new EObjectWithInverseResolvingEList<ArtifactMetadata>(ArtifactMetadata.class, this, SBOMPackage.SUPPLIER_METADATA__COMPONENT, SBOMPackage.ARTIFACT_METADATA__SUPPLIER);
		}
		return component;
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
			case SBOMPackage.SUPPLIER_METADATA__LIBRARY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLibrary((MetadataLibrary)otherEnd, msgs);
			case SBOMPackage.SUPPLIER_METADATA__COMPONENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponent()).basicAdd(otherEnd, msgs);
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
			case SBOMPackage.SUPPLIER_METADATA__LIBRARY:
				return basicSetLibrary(null, msgs);
			case SBOMPackage.SUPPLIER_METADATA__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
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
			case SBOMPackage.SUPPLIER_METADATA__LIBRARY:
				return eInternalContainer().eInverseRemove(this, SBOMPackage.METADATA_LIBRARY__SUPPLIER_META, MetadataLibrary.class, msgs);
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
			case SBOMPackage.SUPPLIER_METADATA__LIBRARY:
				return getLibrary();
			case SBOMPackage.SUPPLIER_METADATA__COMPONENT:
				return getComponent();
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
			case SBOMPackage.SUPPLIER_METADATA__LIBRARY:
				setLibrary((MetadataLibrary)newValue);
				return;
			case SBOMPackage.SUPPLIER_METADATA__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends ArtifactMetadata>)newValue);
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
			case SBOMPackage.SUPPLIER_METADATA__LIBRARY:
				setLibrary((MetadataLibrary)null);
				return;
			case SBOMPackage.SUPPLIER_METADATA__COMPONENT:
				getComponent().clear();
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
			case SBOMPackage.SUPPLIER_METADATA__LIBRARY:
				return getLibrary() != null;
			case SBOMPackage.SUPPLIER_METADATA__COMPONENT:
				return component != null && !component.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SupplierMetadataImpl
