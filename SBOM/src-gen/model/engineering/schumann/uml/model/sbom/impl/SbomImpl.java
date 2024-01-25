/**
 */
package engineering.schumann.uml.model.sbom.impl;

import engineering.schumann.uml.model.sbom.Relationship;
import engineering.schumann.uml.model.sbom.SBOMPackage;
import engineering.schumann.uml.model.sbom.Sbom;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sbom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.model.sbom.impl.SbomImpl#getOwnedSystem <em>Owned System</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.impl.SbomImpl#getOwnedRelationship <em>Owned Relationship</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SbomImpl extends NamedElementImpl implements Sbom {
	/**
	 * The cached value of the '{@link #getOwnedSystem() <em>Owned System</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSystem()
	 * @generated
	 * @ordered
	 */
	protected EList<engineering.schumann.uml.model.sbom.System> ownedSystem;

	/**
	 * The cached value of the '{@link #getOwnedRelationship() <em>Owned Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> ownedRelationship;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SbomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBOMPackage.Literals.SBOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<engineering.schumann.uml.model.sbom.System> getOwnedSystem() {
		if (ownedSystem == null) {
			ownedSystem = new EObjectContainmentWithInverseEList<engineering.schumann.uml.model.sbom.System>(engineering.schumann.uml.model.sbom.System.class, this, SBOMPackage.SBOM__OWNED_SYSTEM, SBOMPackage.SYSTEM__SBOM);
		}
		return ownedSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relationship> getOwnedRelationship() {
		if (ownedRelationship == null) {
			ownedRelationship = new EObjectContainmentWithInverseEList<Relationship>(Relationship.class, this, SBOMPackage.SBOM__OWNED_RELATIONSHIP, SBOMPackage.RELATIONSHIP__SBOM);
		}
		return ownedRelationship;
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
			case SBOMPackage.SBOM__OWNED_SYSTEM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedSystem()).basicAdd(otherEnd, msgs);
			case SBOMPackage.SBOM__OWNED_RELATIONSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelationship()).basicAdd(otherEnd, msgs);
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
			case SBOMPackage.SBOM__OWNED_SYSTEM:
				return ((InternalEList<?>)getOwnedSystem()).basicRemove(otherEnd, msgs);
			case SBOMPackage.SBOM__OWNED_RELATIONSHIP:
				return ((InternalEList<?>)getOwnedRelationship()).basicRemove(otherEnd, msgs);
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
			case SBOMPackage.SBOM__OWNED_SYSTEM:
				return getOwnedSystem();
			case SBOMPackage.SBOM__OWNED_RELATIONSHIP:
				return getOwnedRelationship();
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
			case SBOMPackage.SBOM__OWNED_SYSTEM:
				getOwnedSystem().clear();
				getOwnedSystem().addAll((Collection<? extends engineering.schumann.uml.model.sbom.System>)newValue);
				return;
			case SBOMPackage.SBOM__OWNED_RELATIONSHIP:
				getOwnedRelationship().clear();
				getOwnedRelationship().addAll((Collection<? extends Relationship>)newValue);
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
			case SBOMPackage.SBOM__OWNED_SYSTEM:
				getOwnedSystem().clear();
				return;
			case SBOMPackage.SBOM__OWNED_RELATIONSHIP:
				getOwnedRelationship().clear();
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
			case SBOMPackage.SBOM__OWNED_SYSTEM:
				return ownedSystem != null && !ownedSystem.isEmpty();
			case SBOMPackage.SBOM__OWNED_RELATIONSHIP:
				return ownedRelationship != null && !ownedRelationship.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SbomImpl
