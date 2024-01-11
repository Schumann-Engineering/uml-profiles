/**
 */
package engineering.schumann.uml.profile.csmn.impl;

import engineering.schumann.uml.profile.csmn.CSMNPackage;
import engineering.schumann.uml.profile.csmn.FlowCharacteristic;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Relationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.FlowCharacteristicImpl#getBase_Relationship <em>Base Relationship</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FlowCharacteristicImpl extends MinimalEObjectImpl.Container implements FlowCharacteristic {
	/**
	 * The cached value of the '{@link #getBase_Relationship() <em>Base Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Relationship()
	 * @generated
	 * @ordered
	 */
	protected Relationship base_Relationship;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowCharacteristicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMNPackage.Literals.FLOW_CHARACTERISTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relationship getBase_Relationship() {
		if (base_Relationship != null && base_Relationship.eIsProxy()) {
			InternalEObject oldBase_Relationship = (InternalEObject)base_Relationship;
			base_Relationship = (Relationship)eResolveProxy(oldBase_Relationship);
			if (base_Relationship != oldBase_Relationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CSMNPackage.FLOW_CHARACTERISTIC__BASE_RELATIONSHIP, oldBase_Relationship, base_Relationship));
			}
		}
		return base_Relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship basicGetBase_Relationship() {
		return base_Relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Relationship(Relationship newBase_Relationship) {
		Relationship oldBase_Relationship = base_Relationship;
		base_Relationship = newBase_Relationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.FLOW_CHARACTERISTIC__BASE_RELATIONSHIP, oldBase_Relationship, base_Relationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMNPackage.FLOW_CHARACTERISTIC__BASE_RELATIONSHIP:
				if (resolve) return getBase_Relationship();
				return basicGetBase_Relationship();
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
			case CSMNPackage.FLOW_CHARACTERISTIC__BASE_RELATIONSHIP:
				setBase_Relationship((Relationship)newValue);
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
			case CSMNPackage.FLOW_CHARACTERISTIC__BASE_RELATIONSHIP:
				setBase_Relationship((Relationship)null);
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
			case CSMNPackage.FLOW_CHARACTERISTIC__BASE_RELATIONSHIP:
				return base_Relationship != null;
		}
		return super.eIsSet(featureID);
	}

} //FlowCharacteristicImpl
