/**
 */
package QWiki.Kernel.Relationships.impl;

import QWiki.Kernel.Relationships.DO_NOT_USE_SuperseedingRelationship;
import QWiki.Kernel.Relationships.DO_NOT_USE_SuperseedingType;
import QWiki.Kernel.Relationships.RelationshipsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.internal.impl.DirectedRelationshipImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DO NOT USE Superseeding Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Kernel.Relationships.impl.DO_NOT_USE_SuperseedingRelationshipImpl#getSuperseedingType <em>Superseeding Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DO_NOT_USE_SuperseedingRelationshipImpl extends DirectedRelationshipImpl implements DO_NOT_USE_SuperseedingRelationship {
	/**
	 * The default value of the '{@link #getSuperseedingType() <em>Superseeding Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperseedingType()
	 * @generated
	 * @ordered
	 */
	protected static final DO_NOT_USE_SuperseedingType SUPERSEEDING_TYPE_EDEFAULT = DO_NOT_USE_SuperseedingType.EQUAL;

	/**
	 * The cached value of the '{@link #getSuperseedingType() <em>Superseeding Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperseedingType()
	 * @generated
	 * @ordered
	 */
	protected DO_NOT_USE_SuperseedingType superseedingType = SUPERSEEDING_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DO_NOT_USE_SuperseedingRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationshipsPackage.Literals.DO_NOT_USE_SUPERSEEDING_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DO_NOT_USE_SuperseedingType getSuperseedingType() {
		return superseedingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuperseedingType(DO_NOT_USE_SuperseedingType newSuperseedingType) {
		DO_NOT_USE_SuperseedingType oldSuperseedingType = superseedingType;
		superseedingType = newSuperseedingType == null ? SUPERSEEDING_TYPE_EDEFAULT : newSuperseedingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RelationshipsPackage.DO_NOT_USE_SUPERSEEDING_RELATIONSHIP__SUPERSEEDING_TYPE, oldSuperseedingType, superseedingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelationshipsPackage.DO_NOT_USE_SUPERSEEDING_RELATIONSHIP__SUPERSEEDING_TYPE:
				return getSuperseedingType();
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
			case RelationshipsPackage.DO_NOT_USE_SUPERSEEDING_RELATIONSHIP__SUPERSEEDING_TYPE:
				setSuperseedingType((DO_NOT_USE_SuperseedingType)newValue);
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
			case RelationshipsPackage.DO_NOT_USE_SUPERSEEDING_RELATIONSHIP__SUPERSEEDING_TYPE:
				setSuperseedingType(SUPERSEEDING_TYPE_EDEFAULT);
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
			case RelationshipsPackage.DO_NOT_USE_SUPERSEEDING_RELATIONSHIP__SUPERSEEDING_TYPE:
				return superseedingType != SUPERSEEDING_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (superseedingType: ");
		result.append(superseedingType);
		result.append(')');
		return result.toString();
	}

} //DO_NOT_USE_SuperseedingRelationshipImpl
