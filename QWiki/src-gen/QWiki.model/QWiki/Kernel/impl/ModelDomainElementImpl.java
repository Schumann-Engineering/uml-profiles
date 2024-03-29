/**
 */
package QWiki.Kernel.impl;

import QWiki.Infrastructure.impl.UmlNamedElementImpl;

import QWiki.Kernel.KernelPackage;
import QWiki.Kernel.ModelDomain;
import QWiki.Kernel.ModelDomainElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Domain Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Kernel.impl.ModelDomainElementImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link QWiki.Kernel.impl.ModelDomainElementImpl#getAssignedDomain <em>Assigned Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelDomainElementImpl extends UmlNamedElementImpl implements ModelDomainElement {
	/**
	 * The cached value of the '{@link #getAssignedDomain() <em>Assigned Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedDomain()
	 * @generated
	 * @ordered
	 */
	protected ModelDomain assignedDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelDomainElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelPackage.Literals.MODEL_DOMAIN_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelDomain getDomain() {
		ModelDomain domain = basicGetDomain();
		return domain != null && domain.eIsProxy() ? (ModelDomain)eResolveProxy((InternalEObject)domain) : domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelDomain basicGetDomain() {
		if (eIsSet(KernelPackage.MODEL_DOMAIN_ELEMENT__ASSIGNED_DOMAIN)) {
			return basicGetAssignedDomain();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelDomain getAssignedDomain() {
		if (assignedDomain != null && assignedDomain.eIsProxy()) {
			InternalEObject oldAssignedDomain = (InternalEObject)assignedDomain;
			assignedDomain = (ModelDomain)eResolveProxy(oldAssignedDomain);
			if (assignedDomain != oldAssignedDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KernelPackage.MODEL_DOMAIN_ELEMENT__ASSIGNED_DOMAIN, oldAssignedDomain, assignedDomain));
			}
		}
		return assignedDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelDomain basicGetAssignedDomain() {
		return assignedDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignedDomain(ModelDomain newAssignedDomain, NotificationChain msgs) {
		ModelDomain oldAssignedDomain = assignedDomain;
		assignedDomain = newAssignedDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KernelPackage.MODEL_DOMAIN_ELEMENT__ASSIGNED_DOMAIN, oldAssignedDomain, newAssignedDomain);
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
	public void setAssignedDomain(ModelDomain newAssignedDomain) {
		if (newAssignedDomain != assignedDomain) {
			NotificationChain msgs = null;
			if (assignedDomain != null)
				msgs = ((InternalEObject)assignedDomain).eInverseRemove(this, KernelPackage.MODEL_DOMAIN__DOMAIN_ELEMENT, ModelDomain.class, msgs);
			if (newAssignedDomain != null)
				msgs = ((InternalEObject)newAssignedDomain).eInverseAdd(this, KernelPackage.MODEL_DOMAIN__DOMAIN_ELEMENT, ModelDomain.class, msgs);
			msgs = basicSetAssignedDomain(newAssignedDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.MODEL_DOMAIN_ELEMENT__ASSIGNED_DOMAIN, newAssignedDomain, newAssignedDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KernelPackage.MODEL_DOMAIN_ELEMENT__ASSIGNED_DOMAIN:
				if (assignedDomain != null)
					msgs = ((InternalEObject)assignedDomain).eInverseRemove(this, KernelPackage.MODEL_DOMAIN__DOMAIN_ELEMENT, ModelDomain.class, msgs);
				return basicSetAssignedDomain((ModelDomain)otherEnd, msgs);
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
			case KernelPackage.MODEL_DOMAIN_ELEMENT__ASSIGNED_DOMAIN:
				return basicSetAssignedDomain(null, msgs);
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
			case KernelPackage.MODEL_DOMAIN_ELEMENT__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case KernelPackage.MODEL_DOMAIN_ELEMENT__ASSIGNED_DOMAIN:
				if (resolve) return getAssignedDomain();
				return basicGetAssignedDomain();
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
			case KernelPackage.MODEL_DOMAIN_ELEMENT__ASSIGNED_DOMAIN:
				setAssignedDomain((ModelDomain)newValue);
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
			case KernelPackage.MODEL_DOMAIN_ELEMENT__ASSIGNED_DOMAIN:
				setAssignedDomain((ModelDomain)null);
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
			case KernelPackage.MODEL_DOMAIN_ELEMENT__DOMAIN:
				return isSetDomain();
			case KernelPackage.MODEL_DOMAIN_ELEMENT__ASSIGNED_DOMAIN:
				return assignedDomain != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDomain() {
		return eIsSet(KernelPackage.MODEL_DOMAIN_ELEMENT__ASSIGNED_DOMAIN);
	}

} //ModelDomainElementImpl
