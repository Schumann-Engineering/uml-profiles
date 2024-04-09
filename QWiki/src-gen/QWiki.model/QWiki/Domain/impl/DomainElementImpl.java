/**
 */
package QWiki.Domain.impl;

import QWiki.Domain.Domain;
import QWiki.Domain.DomainElement;
import QWiki.Domain.DomainPackage;

import QWiki.Kernel.impl.QWikiElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Domain.impl.DomainElementImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link QWiki.Domain.impl.DomainElementImpl#getAssignedDomain <em>Assigned Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DomainElementImpl extends QWikiElementImpl implements DomainElement {
	/**
	 * The cached value of the '{@link #getAssignedDomain() <em>Assigned Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedDomain()
	 * @generated
	 * @ordered
	 */
	protected Domain assignedDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.DOMAIN_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Domain getDomain() {
		Domain domain = basicGetDomain();
		return domain != null && domain.eIsProxy() ? (Domain)eResolveProxy((InternalEObject)domain) : domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain basicGetDomain() {
		if (eIsSet(DomainPackage.DOMAIN_ELEMENT__ASSIGNED_DOMAIN)) {
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
	public Domain getAssignedDomain() {
		if (assignedDomain != null && assignedDomain.eIsProxy()) {
			InternalEObject oldAssignedDomain = (InternalEObject)assignedDomain;
			assignedDomain = (Domain)eResolveProxy(oldAssignedDomain);
			if (assignedDomain != oldAssignedDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.DOMAIN_ELEMENT__ASSIGNED_DOMAIN, oldAssignedDomain, assignedDomain));
			}
		}
		return assignedDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain basicGetAssignedDomain() {
		return assignedDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignedDomain(Domain newAssignedDomain, NotificationChain msgs) {
		Domain oldAssignedDomain = assignedDomain;
		assignedDomain = newAssignedDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_ELEMENT__ASSIGNED_DOMAIN, oldAssignedDomain, newAssignedDomain);
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
	public void setAssignedDomain(Domain newAssignedDomain) {
		if (newAssignedDomain != assignedDomain) {
			NotificationChain msgs = null;
			if (assignedDomain != null)
				msgs = ((InternalEObject)assignedDomain).eInverseRemove(this, DomainPackage.DOMAIN__DOMAIN_ELEMENT, Domain.class, msgs);
			if (newAssignedDomain != null)
				msgs = ((InternalEObject)newAssignedDomain).eInverseAdd(this, DomainPackage.DOMAIN__DOMAIN_ELEMENT, Domain.class, msgs);
			msgs = basicSetAssignedDomain(newAssignedDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.DOMAIN_ELEMENT__ASSIGNED_DOMAIN, newAssignedDomain, newAssignedDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.DOMAIN_ELEMENT__ASSIGNED_DOMAIN:
				if (assignedDomain != null)
					msgs = ((InternalEObject)assignedDomain).eInverseRemove(this, DomainPackage.DOMAIN__DOMAIN_ELEMENT, Domain.class, msgs);
				return basicSetAssignedDomain((Domain)otherEnd, msgs);
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
			case DomainPackage.DOMAIN_ELEMENT__ASSIGNED_DOMAIN:
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
			case DomainPackage.DOMAIN_ELEMENT__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case DomainPackage.DOMAIN_ELEMENT__ASSIGNED_DOMAIN:
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
			case DomainPackage.DOMAIN_ELEMENT__ASSIGNED_DOMAIN:
				setAssignedDomain((Domain)newValue);
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
			case DomainPackage.DOMAIN_ELEMENT__ASSIGNED_DOMAIN:
				setAssignedDomain((Domain)null);
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
			case DomainPackage.DOMAIN_ELEMENT__DOMAIN:
				return isSetDomain();
			case DomainPackage.DOMAIN_ELEMENT__ASSIGNED_DOMAIN:
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
		return eIsSet(DomainPackage.DOMAIN_ELEMENT__ASSIGNED_DOMAIN);
	}

} //DomainElementImpl
