/**
 */
package engineering.schumann.uml.profile.csmn.impl;

import engineering.schumann.uml.profile.csmn.CSMNPackage;
import engineering.schumann.uml.profile.csmn.Size_T;
import engineering.schumann.uml.profile.csmn.StorageCharacteristic;
import engineering.schumann.uml.profile.csmn.StorageType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storage Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.StorageCharacteristicImpl#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.StorageCharacteristicImpl#getBase_Port <em>Base Port</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.StorageCharacteristicImpl#getEncryption <em>Encryption</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.StorageCharacteristicImpl#getStorageFormat <em>Storage Format</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.StorageCharacteristicImpl#getStorageType <em>Storage Type</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.StorageCharacteristicImpl#getStorageName <em>Storage Name</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.StorageCharacteristicImpl#getTotalSize <em>Total Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StorageCharacteristicImpl extends MinimalEObjectImpl.Container implements StorageCharacteristic {
	/**
	 * The cached value of the '{@link #getBase_Component() <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Component()
	 * @generated
	 * @ordered
	 */
	protected Component base_Component;

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
	 * The default value of the '{@link #getEncryption() <em>Encryption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryption()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCRYPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncryption() <em>Encryption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryption()
	 * @generated
	 * @ordered
	 */
	protected String encryption = ENCRYPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStorageFormat() <em>Storage Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String STORAGE_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStorageFormat() <em>Storage Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageFormat()
	 * @generated
	 * @ordered
	 */
	protected String storageFormat = STORAGE_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStorageType() <em>Storage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageType()
	 * @generated
	 * @ordered
	 */
	protected static final StorageType STORAGE_TYPE_EDEFAULT = StorageType.UNKNOWN;

	/**
	 * The cached value of the '{@link #getStorageType() <em>Storage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageType()
	 * @generated
	 * @ordered
	 */
	protected StorageType storageType = STORAGE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStorageName() <em>Storage Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageName()
	 * @generated
	 * @ordered
	 */
	protected static final String STORAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStorageName() <em>Storage Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageName()
	 * @generated
	 * @ordered
	 */
	protected String storageName = STORAGE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTotalSize() <em>Total Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalSize()
	 * @generated
	 * @ordered
	 */
	protected Size_T totalSize;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StorageCharacteristicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMNPackage.Literals.STORAGE_CHARACTERISTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getBase_Component() {
		if (base_Component != null && base_Component.eIsProxy()) {
			InternalEObject oldBase_Component = (InternalEObject)base_Component;
			base_Component = (Component)eResolveProxy(oldBase_Component);
			if (base_Component != oldBase_Component) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CSMNPackage.STORAGE_CHARACTERISTIC__BASE_COMPONENT, oldBase_Component, base_Component));
			}
		}
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetBase_Component() {
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Component(Component newBase_Component) {
		Component oldBase_Component = base_Component;
		base_Component = newBase_Component;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.STORAGE_CHARACTERISTIC__BASE_COMPONENT, oldBase_Component, base_Component));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CSMNPackage.STORAGE_CHARACTERISTIC__BASE_PORT, oldBase_Port, base_Port));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.STORAGE_CHARACTERISTIC__BASE_PORT, oldBase_Port, base_Port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEncryption() {
		return encryption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncryption(String newEncryption) {
		String oldEncryption = encryption;
		encryption = newEncryption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.STORAGE_CHARACTERISTIC__ENCRYPTION, oldEncryption, encryption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStorageFormat() {
		return storageFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageFormat(String newStorageFormat) {
		String oldStorageFormat = storageFormat;
		storageFormat = newStorageFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.STORAGE_CHARACTERISTIC__STORAGE_FORMAT, oldStorageFormat, storageFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StorageType getStorageType() {
		return storageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageType(StorageType newStorageType) {
		StorageType oldStorageType = storageType;
		storageType = newStorageType == null ? STORAGE_TYPE_EDEFAULT : newStorageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.STORAGE_CHARACTERISTIC__STORAGE_TYPE, oldStorageType, storageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStorageName() {
		return storageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageName(String newStorageName) {
		String oldStorageName = storageName;
		storageName = newStorageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.STORAGE_CHARACTERISTIC__STORAGE_NAME, oldStorageName, storageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Size_T getTotalSize() {
		return totalSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotalSize(Size_T newTotalSize, NotificationChain msgs) {
		Size_T oldTotalSize = totalSize;
		totalSize = newTotalSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CSMNPackage.STORAGE_CHARACTERISTIC__TOTAL_SIZE, oldTotalSize, newTotalSize);
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
	public void setTotalSize(Size_T newTotalSize) {
		if (newTotalSize != totalSize) {
			NotificationChain msgs = null;
			if (totalSize != null)
				msgs = ((InternalEObject)totalSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CSMNPackage.STORAGE_CHARACTERISTIC__TOTAL_SIZE, null, msgs);
			if (newTotalSize != null)
				msgs = ((InternalEObject)newTotalSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CSMNPackage.STORAGE_CHARACTERISTIC__TOTAL_SIZE, null, msgs);
			msgs = basicSetTotalSize(newTotalSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.STORAGE_CHARACTERISTIC__TOTAL_SIZE, newTotalSize, newTotalSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CSMNPackage.STORAGE_CHARACTERISTIC__TOTAL_SIZE:
				return basicSetTotalSize(null, msgs);
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
			case CSMNPackage.STORAGE_CHARACTERISTIC__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
			case CSMNPackage.STORAGE_CHARACTERISTIC__BASE_PORT:
				if (resolve) return getBase_Port();
				return basicGetBase_Port();
			case CSMNPackage.STORAGE_CHARACTERISTIC__ENCRYPTION:
				return getEncryption();
			case CSMNPackage.STORAGE_CHARACTERISTIC__STORAGE_FORMAT:
				return getStorageFormat();
			case CSMNPackage.STORAGE_CHARACTERISTIC__STORAGE_TYPE:
				return getStorageType();
			case CSMNPackage.STORAGE_CHARACTERISTIC__STORAGE_NAME:
				return getStorageName();
			case CSMNPackage.STORAGE_CHARACTERISTIC__TOTAL_SIZE:
				return getTotalSize();
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
			case CSMNPackage.STORAGE_CHARACTERISTIC__BASE_COMPONENT:
				setBase_Component((Component)newValue);
				return;
			case CSMNPackage.STORAGE_CHARACTERISTIC__BASE_PORT:
				setBase_Port((Port)newValue);
				return;
			case CSMNPackage.STORAGE_CHARACTERISTIC__ENCRYPTION:
				setEncryption((String)newValue);
				return;
			case CSMNPackage.STORAGE_CHARACTERISTIC__STORAGE_FORMAT:
				setStorageFormat((String)newValue);
				return;
			case CSMNPackage.STORAGE_CHARACTERISTIC__STORAGE_TYPE:
				setStorageType((StorageType)newValue);
				return;
			case CSMNPackage.STORAGE_CHARACTERISTIC__STORAGE_NAME:
				setStorageName((String)newValue);
				return;
			case CSMNPackage.STORAGE_CHARACTERISTIC__TOTAL_SIZE:
				setTotalSize((Size_T)newValue);
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
			case CSMNPackage.STORAGE_CHARACTERISTIC__BASE_COMPONENT:
				setBase_Component((Component)null);
				return;
			case CSMNPackage.STORAGE_CHARACTERISTIC__BASE_PORT:
				setBase_Port((Port)null);
				return;
			case CSMNPackage.STORAGE_CHARACTERISTIC__ENCRYPTION:
				setEncryption(ENCRYPTION_EDEFAULT);
				return;
			case CSMNPackage.STORAGE_CHARACTERISTIC__STORAGE_FORMAT:
				setStorageFormat(STORAGE_FORMAT_EDEFAULT);
				return;
			case CSMNPackage.STORAGE_CHARACTERISTIC__STORAGE_TYPE:
				setStorageType(STORAGE_TYPE_EDEFAULT);
				return;
			case CSMNPackage.STORAGE_CHARACTERISTIC__STORAGE_NAME:
				setStorageName(STORAGE_NAME_EDEFAULT);
				return;
			case CSMNPackage.STORAGE_CHARACTERISTIC__TOTAL_SIZE:
				setTotalSize((Size_T)null);
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
			case CSMNPackage.STORAGE_CHARACTERISTIC__BASE_COMPONENT:
				return base_Component != null;
			case CSMNPackage.STORAGE_CHARACTERISTIC__BASE_PORT:
				return base_Port != null;
			case CSMNPackage.STORAGE_CHARACTERISTIC__ENCRYPTION:
				return ENCRYPTION_EDEFAULT == null ? encryption != null : !ENCRYPTION_EDEFAULT.equals(encryption);
			case CSMNPackage.STORAGE_CHARACTERISTIC__STORAGE_FORMAT:
				return STORAGE_FORMAT_EDEFAULT == null ? storageFormat != null : !STORAGE_FORMAT_EDEFAULT.equals(storageFormat);
			case CSMNPackage.STORAGE_CHARACTERISTIC__STORAGE_TYPE:
				return storageType != STORAGE_TYPE_EDEFAULT;
			case CSMNPackage.STORAGE_CHARACTERISTIC__STORAGE_NAME:
				return STORAGE_NAME_EDEFAULT == null ? storageName != null : !STORAGE_NAME_EDEFAULT.equals(storageName);
			case CSMNPackage.STORAGE_CHARACTERISTIC__TOTAL_SIZE:
				return totalSize != null;
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
		result.append(" (encryption: ");
		result.append(encryption);
		result.append(", storageFormat: ");
		result.append(storageFormat);
		result.append(", storageType: ");
		result.append(storageType);
		result.append(", storageName: ");
		result.append(storageName);
		result.append(')');
		return result.toString();
	}

} //StorageCharacteristicImpl
