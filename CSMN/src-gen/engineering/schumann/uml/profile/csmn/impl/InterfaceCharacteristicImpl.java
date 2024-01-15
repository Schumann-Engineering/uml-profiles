/**
 */
package engineering.schumann.uml.profile.csmn.impl;

import engineering.schumann.uml.profile.csmn.CSMNPackage;
import engineering.schumann.uml.profile.csmn.InterfaceCharacteristic;
import engineering.schumann.uml.profile.csmn.InterfaceConnector;
import engineering.schumann.uml.profile.csmn.InterfaceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.InterfaceCharacteristicImpl#getBase_Port <em>Base Port</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.InterfaceCharacteristicImpl#getInterfaceType <em>Interface Type</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.InterfaceCharacteristicImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.InterfaceCharacteristicImpl#getInterfaceConnector <em>Interface Connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceCharacteristicImpl extends MinimalEObjectImpl.Container implements InterfaceCharacteristic {
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
	 * The default value of the '{@link #getInterfaceType() <em>Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceType()
	 * @generated
	 * @ordered
	 */
	protected static final InterfaceType INTERFACE_TYPE_EDEFAULT = InterfaceType.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getInterfaceType() <em>Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceType()
	 * @generated
	 * @ordered
	 */
	protected InterfaceType interfaceType = INTERFACE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterfaceConnector() <em>Interface Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceConnector()
	 * @generated
	 * @ordered
	 */
	protected static final InterfaceConnector INTERFACE_CONNECTOR_EDEFAULT = InterfaceConnector.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getInterfaceConnector() <em>Interface Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceConnector()
	 * @generated
	 * @ordered
	 */
	protected InterfaceConnector interfaceConnector = INTERFACE_CONNECTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceCharacteristicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMNPackage.Literals.INTERFACE_CHARACTERISTIC;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CSMNPackage.INTERFACE_CHARACTERISTIC__BASE_PORT, oldBase_Port, base_Port));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.INTERFACE_CHARACTERISTIC__BASE_PORT, oldBase_Port, base_Port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceType getInterfaceType() {
		return interfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterfaceType(InterfaceType newInterfaceType) {
		InterfaceType oldInterfaceType = interfaceType;
		interfaceType = newInterfaceType == null ? INTERFACE_TYPE_EDEFAULT : newInterfaceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.INTERFACE_CHARACTERISTIC__INTERFACE_TYPE, oldInterfaceType, interfaceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.INTERFACE_CHARACTERISTIC__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceConnector getInterfaceConnector() {
		return interfaceConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterfaceConnector(InterfaceConnector newInterfaceConnector) {
		InterfaceConnector oldInterfaceConnector = interfaceConnector;
		interfaceConnector = newInterfaceConnector == null ? INTERFACE_CONNECTOR_EDEFAULT : newInterfaceConnector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.INTERFACE_CHARACTERISTIC__INTERFACE_CONNECTOR, oldInterfaceConnector, interfaceConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMNPackage.INTERFACE_CHARACTERISTIC__BASE_PORT:
				if (resolve) return getBase_Port();
				return basicGetBase_Port();
			case CSMNPackage.INTERFACE_CHARACTERISTIC__INTERFACE_TYPE:
				return getInterfaceType();
			case CSMNPackage.INTERFACE_CHARACTERISTIC__PURPOSE:
				return getPurpose();
			case CSMNPackage.INTERFACE_CHARACTERISTIC__INTERFACE_CONNECTOR:
				return getInterfaceConnector();
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
			case CSMNPackage.INTERFACE_CHARACTERISTIC__BASE_PORT:
				setBase_Port((Port)newValue);
				return;
			case CSMNPackage.INTERFACE_CHARACTERISTIC__INTERFACE_TYPE:
				setInterfaceType((InterfaceType)newValue);
				return;
			case CSMNPackage.INTERFACE_CHARACTERISTIC__PURPOSE:
				setPurpose((String)newValue);
				return;
			case CSMNPackage.INTERFACE_CHARACTERISTIC__INTERFACE_CONNECTOR:
				setInterfaceConnector((InterfaceConnector)newValue);
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
			case CSMNPackage.INTERFACE_CHARACTERISTIC__BASE_PORT:
				setBase_Port((Port)null);
				return;
			case CSMNPackage.INTERFACE_CHARACTERISTIC__INTERFACE_TYPE:
				setInterfaceType(INTERFACE_TYPE_EDEFAULT);
				return;
			case CSMNPackage.INTERFACE_CHARACTERISTIC__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case CSMNPackage.INTERFACE_CHARACTERISTIC__INTERFACE_CONNECTOR:
				setInterfaceConnector(INTERFACE_CONNECTOR_EDEFAULT);
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
			case CSMNPackage.INTERFACE_CHARACTERISTIC__BASE_PORT:
				return base_Port != null;
			case CSMNPackage.INTERFACE_CHARACTERISTIC__INTERFACE_TYPE:
				return interfaceType != INTERFACE_TYPE_EDEFAULT;
			case CSMNPackage.INTERFACE_CHARACTERISTIC__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case CSMNPackage.INTERFACE_CHARACTERISTIC__INTERFACE_CONNECTOR:
				return interfaceConnector != INTERFACE_CONNECTOR_EDEFAULT;
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
		result.append(" (interfaceType: ");
		result.append(interfaceType);
		result.append(", purpose: ");
		result.append(purpose);
		result.append(", interfaceConnector: ");
		result.append(interfaceConnector);
		result.append(')');
		return result.toString();
	}

} //InterfaceCharacteristicImpl
