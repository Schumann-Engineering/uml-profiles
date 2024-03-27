/**
 */
package QWiki.impl;

import QWiki.QWikiPackage;
import QWiki.RasciElement;
import QWiki.Role;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rasci Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.impl.RasciElementImpl#getResponsibleRole <em>Responsible Role</em>}</li>
 *   <li>{@link QWiki.impl.RasciElementImpl#getAccountableRole <em>Accountable Role</em>}</li>
 *   <li>{@link QWiki.impl.RasciElementImpl#getSupportingRole <em>Supporting Role</em>}</li>
 *   <li>{@link QWiki.impl.RasciElementImpl#getConsultingRole <em>Consulting Role</em>}</li>
 *   <li>{@link QWiki.impl.RasciElementImpl#getInformedRole <em>Informed Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RasciElementImpl extends I18nDescriptiveElementImpl implements RasciElement {
	/**
	 * The cached value of the '{@link #getResponsibleRole() <em>Responsible Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> responsibleRole;

	/**
	 * The cached value of the '{@link #getAccountableRole() <em>Accountable Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountableRole()
	 * @generated
	 * @ordered
	 */
	protected Role accountableRole;

	/**
	 * The cached value of the '{@link #getSupportingRole() <em>Supporting Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> supportingRole;

	/**
	 * The cached value of the '{@link #getConsultingRole() <em>Consulting Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsultingRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> consultingRole;

	/**
	 * The cached value of the '{@link #getInformedRole() <em>Informed Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformedRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> informedRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RasciElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QWikiPackage.Literals.RASCI_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getResponsibleRole() {
		if (responsibleRole == null) {
			responsibleRole = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, QWikiPackage.RASCI_ELEMENT__RESPONSIBLE_ROLE, QWikiPackage.ROLE__RESPONSIBLE_ELEMENT);
		}
		return responsibleRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role getAccountableRole() {
		if (accountableRole != null && accountableRole.eIsProxy()) {
			InternalEObject oldAccountableRole = (InternalEObject)accountableRole;
			accountableRole = (Role)eResolveProxy(oldAccountableRole);
			if (accountableRole != oldAccountableRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QWikiPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE, oldAccountableRole, accountableRole));
			}
		}
		return accountableRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetAccountableRole() {
		return accountableRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccountableRole(Role newAccountableRole, NotificationChain msgs) {
		Role oldAccountableRole = accountableRole;
		accountableRole = newAccountableRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QWikiPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE, oldAccountableRole, newAccountableRole);
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
	public void setAccountableRole(Role newAccountableRole) {
		if (newAccountableRole != accountableRole) {
			NotificationChain msgs = null;
			if (accountableRole != null)
				msgs = ((InternalEObject)accountableRole).eInverseRemove(this, QWikiPackage.ROLE__ACCOUNTABLE_ELEMENT, Role.class, msgs);
			if (newAccountableRole != null)
				msgs = ((InternalEObject)newAccountableRole).eInverseAdd(this, QWikiPackage.ROLE__ACCOUNTABLE_ELEMENT, Role.class, msgs);
			msgs = basicSetAccountableRole(newAccountableRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE, newAccountableRole, newAccountableRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getSupportingRole() {
		if (supportingRole == null) {
			supportingRole = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, QWikiPackage.RASCI_ELEMENT__SUPPORTING_ROLE, QWikiPackage.ROLE__SUPPORTING_ELEMENT);
		}
		return supportingRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getConsultingRole() {
		if (consultingRole == null) {
			consultingRole = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, QWikiPackage.RASCI_ELEMENT__CONSULTING_ROLE, QWikiPackage.ROLE__CONSULTING_ELEMENT);
		}
		return consultingRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getInformedRole() {
		if (informedRole == null) {
			informedRole = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, QWikiPackage.RASCI_ELEMENT__INFORMED_ROLE, QWikiPackage.ROLE__INFORMED_ELEMENT);
		}
		return informedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QWikiPackage.RASCI_ELEMENT__RESPONSIBLE_ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResponsibleRole()).basicAdd(otherEnd, msgs);
			case QWikiPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE:
				if (accountableRole != null)
					msgs = ((InternalEObject)accountableRole).eInverseRemove(this, QWikiPackage.ROLE__ACCOUNTABLE_ELEMENT, Role.class, msgs);
				return basicSetAccountableRole((Role)otherEnd, msgs);
			case QWikiPackage.RASCI_ELEMENT__SUPPORTING_ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupportingRole()).basicAdd(otherEnd, msgs);
			case QWikiPackage.RASCI_ELEMENT__CONSULTING_ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConsultingRole()).basicAdd(otherEnd, msgs);
			case QWikiPackage.RASCI_ELEMENT__INFORMED_ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInformedRole()).basicAdd(otherEnd, msgs);
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
			case QWikiPackage.RASCI_ELEMENT__RESPONSIBLE_ROLE:
				return ((InternalEList<?>)getResponsibleRole()).basicRemove(otherEnd, msgs);
			case QWikiPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE:
				return basicSetAccountableRole(null, msgs);
			case QWikiPackage.RASCI_ELEMENT__SUPPORTING_ROLE:
				return ((InternalEList<?>)getSupportingRole()).basicRemove(otherEnd, msgs);
			case QWikiPackage.RASCI_ELEMENT__CONSULTING_ROLE:
				return ((InternalEList<?>)getConsultingRole()).basicRemove(otherEnd, msgs);
			case QWikiPackage.RASCI_ELEMENT__INFORMED_ROLE:
				return ((InternalEList<?>)getInformedRole()).basicRemove(otherEnd, msgs);
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
			case QWikiPackage.RASCI_ELEMENT__RESPONSIBLE_ROLE:
				return getResponsibleRole();
			case QWikiPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE:
				if (resolve) return getAccountableRole();
				return basicGetAccountableRole();
			case QWikiPackage.RASCI_ELEMENT__SUPPORTING_ROLE:
				return getSupportingRole();
			case QWikiPackage.RASCI_ELEMENT__CONSULTING_ROLE:
				return getConsultingRole();
			case QWikiPackage.RASCI_ELEMENT__INFORMED_ROLE:
				return getInformedRole();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QWikiPackage.RASCI_ELEMENT__RESPONSIBLE_ROLE:
				getResponsibleRole().clear();
				getResponsibleRole().addAll((Collection<? extends Role>)newValue);
				return;
			case QWikiPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE:
				setAccountableRole((Role)newValue);
				return;
			case QWikiPackage.RASCI_ELEMENT__SUPPORTING_ROLE:
				getSupportingRole().clear();
				getSupportingRole().addAll((Collection<? extends Role>)newValue);
				return;
			case QWikiPackage.RASCI_ELEMENT__CONSULTING_ROLE:
				getConsultingRole().clear();
				getConsultingRole().addAll((Collection<? extends Role>)newValue);
				return;
			case QWikiPackage.RASCI_ELEMENT__INFORMED_ROLE:
				getInformedRole().clear();
				getInformedRole().addAll((Collection<? extends Role>)newValue);
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
			case QWikiPackage.RASCI_ELEMENT__RESPONSIBLE_ROLE:
				getResponsibleRole().clear();
				return;
			case QWikiPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE:
				setAccountableRole((Role)null);
				return;
			case QWikiPackage.RASCI_ELEMENT__SUPPORTING_ROLE:
				getSupportingRole().clear();
				return;
			case QWikiPackage.RASCI_ELEMENT__CONSULTING_ROLE:
				getConsultingRole().clear();
				return;
			case QWikiPackage.RASCI_ELEMENT__INFORMED_ROLE:
				getInformedRole().clear();
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
			case QWikiPackage.RASCI_ELEMENT__RESPONSIBLE_ROLE:
				return responsibleRole != null && !responsibleRole.isEmpty();
			case QWikiPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE:
				return accountableRole != null;
			case QWikiPackage.RASCI_ELEMENT__SUPPORTING_ROLE:
				return supportingRole != null && !supportingRole.isEmpty();
			case QWikiPackage.RASCI_ELEMENT__CONSULTING_ROLE:
				return consultingRole != null && !consultingRole.isEmpty();
			case QWikiPackage.RASCI_ELEMENT__INFORMED_ROLE:
				return informedRole != null && !informedRole.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RasciElementImpl
