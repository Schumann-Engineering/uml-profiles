/**
 */
package engineering.schumann.uml.profile.csmn.impl;

import engineering.schumann.uml.profile.csmn.CSMNPackage;
import engineering.schumann.uml.profile.csmn.EnergyCharacteristic;
import engineering.schumann.uml.profile.csmn.EnergyType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Energy Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.EnergyCharacteristicImpl#getBase_Port <em>Base Port</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.EnergyCharacteristicImpl#getEnergyType <em>Energy Type</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.EnergyCharacteristicImpl#getBase_Dependency <em>Base Dependency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnergyCharacteristicImpl extends MinimalEObjectImpl.Container implements EnergyCharacteristic {
	/**
	 * The cached value of the '{@link #getBase_Port() <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Port()
	 * @generated
	 * @ordered
	 */
	protected Port base_Port;

	/**
	 * The default value of the '{@link #getEnergyType() <em>Energy Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyType()
	 * @generated
	 * @ordered
	 */
	protected static final EnergyType ENERGY_TYPE_EDEFAULT = EnergyType.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getEnergyType() <em>Energy Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyType()
	 * @generated
	 * @ordered
	 */
	protected EnergyType energyType = ENERGY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Dependency() <em>Base Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Dependency()
	 * @generated
	 * @ordered
	 */
	protected Dependency base_Dependency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnergyCharacteristicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMNPackage.Literals.ENERGY_CHARACTERISTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port getBase_Port() {
		if (base_Port != null && base_Port.eIsProxy()) {
			InternalEObject oldBase_Port = (InternalEObject)base_Port;
			base_Port = (Port)eResolveProxy(oldBase_Port);
			if (base_Port != oldBase_Port) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CSMNPackage.ENERGY_CHARACTERISTIC__BASE_PORT, oldBase_Port, base_Port));
			}
		}
		return base_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetBase_Port() {
		return base_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Port(Port newBase_Port) {
		Port oldBase_Port = base_Port;
		base_Port = newBase_Port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.ENERGY_CHARACTERISTIC__BASE_PORT, oldBase_Port, base_Port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnergyType getEnergyType() {
		return energyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnergyType(EnergyType newEnergyType) {
		EnergyType oldEnergyType = energyType;
		energyType = newEnergyType == null ? ENERGY_TYPE_EDEFAULT : newEnergyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.ENERGY_CHARACTERISTIC__ENERGY_TYPE, oldEnergyType, energyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dependency getBase_Dependency() {
		if (base_Dependency != null && base_Dependency.eIsProxy()) {
			InternalEObject oldBase_Dependency = (InternalEObject)base_Dependency;
			base_Dependency = (Dependency)eResolveProxy(oldBase_Dependency);
			if (base_Dependency != oldBase_Dependency) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CSMNPackage.ENERGY_CHARACTERISTIC__BASE_DEPENDENCY, oldBase_Dependency, base_Dependency));
			}
		}
		return base_Dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency basicGetBase_Dependency() {
		return base_Dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Dependency(Dependency newBase_Dependency) {
		Dependency oldBase_Dependency = base_Dependency;
		base_Dependency = newBase_Dependency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.ENERGY_CHARACTERISTIC__BASE_DEPENDENCY, oldBase_Dependency, base_Dependency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMNPackage.ENERGY_CHARACTERISTIC__BASE_PORT:
				if (resolve) return getBase_Port();
				return basicGetBase_Port();
			case CSMNPackage.ENERGY_CHARACTERISTIC__ENERGY_TYPE:
				return getEnergyType();
			case CSMNPackage.ENERGY_CHARACTERISTIC__BASE_DEPENDENCY:
				if (resolve) return getBase_Dependency();
				return basicGetBase_Dependency();
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
			case CSMNPackage.ENERGY_CHARACTERISTIC__BASE_PORT:
				setBase_Port((Port)newValue);
				return;
			case CSMNPackage.ENERGY_CHARACTERISTIC__ENERGY_TYPE:
				setEnergyType((EnergyType)newValue);
				return;
			case CSMNPackage.ENERGY_CHARACTERISTIC__BASE_DEPENDENCY:
				setBase_Dependency((Dependency)newValue);
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
			case CSMNPackage.ENERGY_CHARACTERISTIC__BASE_PORT:
				setBase_Port((Port)null);
				return;
			case CSMNPackage.ENERGY_CHARACTERISTIC__ENERGY_TYPE:
				setEnergyType(ENERGY_TYPE_EDEFAULT);
				return;
			case CSMNPackage.ENERGY_CHARACTERISTIC__BASE_DEPENDENCY:
				setBase_Dependency((Dependency)null);
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
			case CSMNPackage.ENERGY_CHARACTERISTIC__BASE_PORT:
				return base_Port != null;
			case CSMNPackage.ENERGY_CHARACTERISTIC__ENERGY_TYPE:
				return energyType != ENERGY_TYPE_EDEFAULT;
			case CSMNPackage.ENERGY_CHARACTERISTIC__BASE_DEPENDENCY:
				return base_Dependency != null;
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
		result.append(" (energyType: ");
		result.append(energyType);
		result.append(')');
		return result.toString();
	}

} //EnergyCharacteristicImpl
