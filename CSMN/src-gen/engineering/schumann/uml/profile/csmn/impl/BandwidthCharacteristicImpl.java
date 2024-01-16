/**
 */
package engineering.schumann.uml.profile.csmn.impl;

import engineering.schumann.uml.profile.csmn.Bandwidth;
import engineering.schumann.uml.profile.csmn.BandwidthCharacteristic;
import engineering.schumann.uml.profile.csmn.CSMNPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bandwidth Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.BandwidthCharacteristicImpl#getBase_Port <em>Base Port</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.BandwidthCharacteristicImpl#getBandwidth <em>Bandwidth</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.BandwidthCharacteristicImpl#getBase_Dependency <em>Base Dependency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BandwidthCharacteristicImpl extends MinimalEObjectImpl.Container implements BandwidthCharacteristic {
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
	 * The cached value of the '{@link #getBandwidth() <em>Bandwidth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBandwidth()
	 * @generated
	 * @ordered
	 */
	protected Bandwidth bandwidth;

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
	protected BandwidthCharacteristicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMNPackage.Literals.BANDWIDTH_CHARACTERISTIC;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CSMNPackage.BANDWIDTH_CHARACTERISTIC__BASE_PORT, oldBase_Port, base_Port));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.BANDWIDTH_CHARACTERISTIC__BASE_PORT, oldBase_Port, base_Port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bandwidth getBandwidth() {
		return bandwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBandwidth(Bandwidth newBandwidth, NotificationChain msgs) {
		Bandwidth oldBandwidth = bandwidth;
		bandwidth = newBandwidth;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CSMNPackage.BANDWIDTH_CHARACTERISTIC__BANDWIDTH, oldBandwidth, newBandwidth);
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
	public void setBandwidth(Bandwidth newBandwidth) {
		if (newBandwidth != bandwidth) {
			NotificationChain msgs = null;
			if (bandwidth != null)
				msgs = ((InternalEObject)bandwidth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CSMNPackage.BANDWIDTH_CHARACTERISTIC__BANDWIDTH, null, msgs);
			if (newBandwidth != null)
				msgs = ((InternalEObject)newBandwidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CSMNPackage.BANDWIDTH_CHARACTERISTIC__BANDWIDTH, null, msgs);
			msgs = basicSetBandwidth(newBandwidth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.BANDWIDTH_CHARACTERISTIC__BANDWIDTH, newBandwidth, newBandwidth));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CSMNPackage.BANDWIDTH_CHARACTERISTIC__BASE_DEPENDENCY, oldBase_Dependency, base_Dependency));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.BANDWIDTH_CHARACTERISTIC__BASE_DEPENDENCY, oldBase_Dependency, base_Dependency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CSMNPackage.BANDWIDTH_CHARACTERISTIC__BANDWIDTH:
				return basicSetBandwidth(null, msgs);
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
			case CSMNPackage.BANDWIDTH_CHARACTERISTIC__BASE_PORT:
				if (resolve) return getBase_Port();
				return basicGetBase_Port();
			case CSMNPackage.BANDWIDTH_CHARACTERISTIC__BANDWIDTH:
				return getBandwidth();
			case CSMNPackage.BANDWIDTH_CHARACTERISTIC__BASE_DEPENDENCY:
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
			case CSMNPackage.BANDWIDTH_CHARACTERISTIC__BASE_PORT:
				setBase_Port((Port)newValue);
				return;
			case CSMNPackage.BANDWIDTH_CHARACTERISTIC__BANDWIDTH:
				setBandwidth((Bandwidth)newValue);
				return;
			case CSMNPackage.BANDWIDTH_CHARACTERISTIC__BASE_DEPENDENCY:
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
			case CSMNPackage.BANDWIDTH_CHARACTERISTIC__BASE_PORT:
				setBase_Port((Port)null);
				return;
			case CSMNPackage.BANDWIDTH_CHARACTERISTIC__BANDWIDTH:
				setBandwidth((Bandwidth)null);
				return;
			case CSMNPackage.BANDWIDTH_CHARACTERISTIC__BASE_DEPENDENCY:
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
			case CSMNPackage.BANDWIDTH_CHARACTERISTIC__BASE_PORT:
				return base_Port != null;
			case CSMNPackage.BANDWIDTH_CHARACTERISTIC__BANDWIDTH:
				return bandwidth != null;
			case CSMNPackage.BANDWIDTH_CHARACTERISTIC__BASE_DEPENDENCY:
				return base_Dependency != null;
		}
		return super.eIsSet(featureID);
	}

} //BandwidthCharacteristicImpl
