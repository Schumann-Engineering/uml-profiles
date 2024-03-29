/**
 */
package QWiki.impl;

import QWiki.QWikiPackage;
import QWiki.SuperseedingRelationship;
import QWiki.SuperseedingType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Superseeding Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.impl.SuperseedingRelationshipImpl#getSuperseedingType <em>Superseeding Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SuperseedingRelationshipImpl extends UmlDirectedRelationshipImpl implements SuperseedingRelationship {
	/**
	 * The default value of the '{@link #getSuperseedingType() <em>Superseeding Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperseedingType()
	 * @generated
	 * @ordered
	 */
	protected static final SuperseedingType SUPERSEEDING_TYPE_EDEFAULT = SuperseedingType.EQUAL;

	/**
	 * The cached value of the '{@link #getSuperseedingType() <em>Superseeding Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperseedingType()
	 * @generated
	 * @ordered
	 */
	protected SuperseedingType superseedingType = SUPERSEEDING_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SuperseedingRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QWikiPackage.Literals.SUPERSEEDING_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperseedingType getSuperseedingType() {
		return superseedingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuperseedingType(SuperseedingType newSuperseedingType) {
		SuperseedingType oldSuperseedingType = superseedingType;
		superseedingType = newSuperseedingType == null ? SUPERSEEDING_TYPE_EDEFAULT : newSuperseedingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.SUPERSEEDING_RELATIONSHIP__SUPERSEEDING_TYPE, oldSuperseedingType, superseedingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QWikiPackage.SUPERSEEDING_RELATIONSHIP__SUPERSEEDING_TYPE:
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
			case QWikiPackage.SUPERSEEDING_RELATIONSHIP__SUPERSEEDING_TYPE:
				setSuperseedingType((SuperseedingType)newValue);
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
			case QWikiPackage.SUPERSEEDING_RELATIONSHIP__SUPERSEEDING_TYPE:
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
			case QWikiPackage.SUPERSEEDING_RELATIONSHIP__SUPERSEEDING_TYPE:
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

} //SuperseedingRelationshipImpl
