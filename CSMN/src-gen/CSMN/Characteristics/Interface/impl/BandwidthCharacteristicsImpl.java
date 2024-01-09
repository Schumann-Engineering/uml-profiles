/**
 */
package CSMN.Characteristics.Interface.impl;

import CSMN.Characteristics.Interface.BandwidthCharacteristics;
import CSMN.Characteristics.Interface.InterfacePackage;

import CSMN.PrimitiveTypes.Bandwidth;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Relationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bandwidth Characteristics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CSMN.Characteristics.Interface.impl.BandwidthCharacteristicsImpl#getBase_Relationship <em>Base Relationship</em>}</li>
 *   <li>{@link CSMN.Characteristics.Interface.impl.BandwidthCharacteristicsImpl#getBase_Port <em>Base Port</em>}</li>
 *   <li>{@link CSMN.Characteristics.Interface.impl.BandwidthCharacteristicsImpl#getBandwidth <em>Bandwidth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BandwidthCharacteristicsImpl extends MinimalEObjectImpl.Container implements BandwidthCharacteristics {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BandwidthCharacteristicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InterfacePackage.Literals.BANDWIDTH_CHARACTERISTICS;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InterfacePackage.BANDWIDTH_CHARACTERISTICS__BASE_RELATIONSHIP, oldBase_Relationship, base_Relationship));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InterfacePackage.BANDWIDTH_CHARACTERISTICS__BASE_RELATIONSHIP, oldBase_Relationship, base_Relationship));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InterfacePackage.BANDWIDTH_CHARACTERISTICS__BASE_PORT, oldBase_Port, base_Port));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InterfacePackage.BANDWIDTH_CHARACTERISTICS__BASE_PORT, oldBase_Port, base_Port));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InterfacePackage.BANDWIDTH_CHARACTERISTICS__BANDWIDTH, oldBandwidth, newBandwidth);
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
				msgs = ((InternalEObject)bandwidth).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InterfacePackage.BANDWIDTH_CHARACTERISTICS__BANDWIDTH, null, msgs);
			if (newBandwidth != null)
				msgs = ((InternalEObject)newBandwidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InterfacePackage.BANDWIDTH_CHARACTERISTICS__BANDWIDTH, null, msgs);
			msgs = basicSetBandwidth(newBandwidth, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InterfacePackage.BANDWIDTH_CHARACTERISTICS__BANDWIDTH, newBandwidth, newBandwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InterfacePackage.BANDWIDTH_CHARACTERISTICS__BANDWIDTH:
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
			case InterfacePackage.BANDWIDTH_CHARACTERISTICS__BASE_RELATIONSHIP:
				if (resolve) return getBase_Relationship();
				return basicGetBase_Relationship();
			case InterfacePackage.BANDWIDTH_CHARACTERISTICS__BASE_PORT:
				if (resolve) return getBase_Port();
				return basicGetBase_Port();
			case InterfacePackage.BANDWIDTH_CHARACTERISTICS__BANDWIDTH:
				return getBandwidth();
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
			case InterfacePackage.BANDWIDTH_CHARACTERISTICS__BASE_RELATIONSHIP:
				setBase_Relationship((Relationship)newValue);
				return;
			case InterfacePackage.BANDWIDTH_CHARACTERISTICS__BASE_PORT:
				setBase_Port((Port)newValue);
				return;
			case InterfacePackage.BANDWIDTH_CHARACTERISTICS__BANDWIDTH:
				setBandwidth((Bandwidth)newValue);
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
			case InterfacePackage.BANDWIDTH_CHARACTERISTICS__BASE_RELATIONSHIP:
				setBase_Relationship((Relationship)null);
				return;
			case InterfacePackage.BANDWIDTH_CHARACTERISTICS__BASE_PORT:
				setBase_Port((Port)null);
				return;
			case InterfacePackage.BANDWIDTH_CHARACTERISTICS__BANDWIDTH:
				setBandwidth((Bandwidth)null);
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
			case InterfacePackage.BANDWIDTH_CHARACTERISTICS__BASE_RELATIONSHIP:
				return base_Relationship != null;
			case InterfacePackage.BANDWIDTH_CHARACTERISTICS__BASE_PORT:
				return base_Port != null;
			case InterfacePackage.BANDWIDTH_CHARACTERISTICS__BANDWIDTH:
				return bandwidth != null;
		}
		return super.eIsSet(featureID);
	}

} //BandwidthCharacteristicsImpl
