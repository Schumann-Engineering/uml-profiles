/**
 */
package QWiki.Rasci.impl;

import QWiki.Kernel.impl.I18nDescriptiveElementImpl;

import QWiki.Rasci.RASCIPackage;
import QWiki.Rasci.RasciElement;
import QWiki.Rasci.Role;

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
 *   <li>{@link QWiki.Rasci.impl.RasciElementImpl#getResponsibleRole <em>Responsible Role</em>}</li>
 *   <li>{@link QWiki.Rasci.impl.RasciElementImpl#getAccountableRole <em>Accountable Role</em>}</li>
 *   <li>{@link QWiki.Rasci.impl.RasciElementImpl#getSupportRole <em>Support Role</em>}</li>
 *   <li>{@link QWiki.Rasci.impl.RasciElementImpl#getConsultedRole <em>Consulted Role</em>}</li>
 *   <li>{@link QWiki.Rasci.impl.RasciElementImpl#getInformedRole <em>Informed Role</em>}</li>
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
	 * The cached value of the '{@link #getSupportRole() <em>Support Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> supportRole;

	/**
	 * The cached value of the '{@link #getConsultedRole() <em>Consulted Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsultedRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> consultedRole;

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
		return RASCIPackage.Literals.RASCI_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getResponsibleRole() {
		if (responsibleRole == null) {
			responsibleRole = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, RASCIPackage.RASCI_ELEMENT__RESPONSIBLE_ROLE, RASCIPackage.ROLE__RESPONSIBLE_ELEMENT);
		}
		return responsibleRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getResponsibleRole(String name) {
		return getResponsibleRole(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getResponsibleRole(String name, boolean ignoreCase) {
		responsibleRoleLoop: for (Role responsibleRole : getResponsibleRole()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(responsibleRole.getName()) : name.equals(responsibleRole.getName())))
				continue responsibleRoleLoop;
			return responsibleRole;
		}
		return null;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RASCIPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE, oldAccountableRole, accountableRole));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RASCIPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE, oldAccountableRole, newAccountableRole);
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
				msgs = ((InternalEObject)accountableRole).eInverseRemove(this, RASCIPackage.ROLE__ACCOUNTABLE_ELEMENT, Role.class, msgs);
			if (newAccountableRole != null)
				msgs = ((InternalEObject)newAccountableRole).eInverseAdd(this, RASCIPackage.ROLE__ACCOUNTABLE_ELEMENT, Role.class, msgs);
			msgs = basicSetAccountableRole(newAccountableRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RASCIPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE, newAccountableRole, newAccountableRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getSupportRole() {
		if (supportRole == null) {
			supportRole = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, RASCIPackage.RASCI_ELEMENT__SUPPORT_ROLE, RASCIPackage.ROLE__SUPPORTING_ELEMENT);
		}
		return supportRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getSupportRole(String name) {
		return getSupportRole(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getSupportRole(String name, boolean ignoreCase) {
		supportRoleLoop: for (Role supportRole : getSupportRole()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(supportRole.getName()) : name.equals(supportRole.getName())))
				continue supportRoleLoop;
			return supportRole;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getConsultedRole() {
		if (consultedRole == null) {
			consultedRole = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, RASCIPackage.RASCI_ELEMENT__CONSULTED_ROLE, RASCIPackage.ROLE__CONSULTING_ELEMENT);
		}
		return consultedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getConsultedRole(String name) {
		return getConsultedRole(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getConsultedRole(String name, boolean ignoreCase) {
		consultedRoleLoop: for (Role consultedRole : getConsultedRole()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(consultedRole.getName()) : name.equals(consultedRole.getName())))
				continue consultedRoleLoop;
			return consultedRole;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getInformedRole() {
		if (informedRole == null) {
			informedRole = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, RASCIPackage.RASCI_ELEMENT__INFORMED_ROLE, RASCIPackage.ROLE__INFORMED_ELEMENT);
		}
		return informedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getInformedRole(String name) {
		return getInformedRole(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getInformedRole(String name, boolean ignoreCase) {
		informedRoleLoop: for (Role informedRole : getInformedRole()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(informedRole.getName()) : name.equals(informedRole.getName())))
				continue informedRoleLoop;
			return informedRole;
		}
		return null;
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
			case RASCIPackage.RASCI_ELEMENT__RESPONSIBLE_ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResponsibleRole()).basicAdd(otherEnd, msgs);
			case RASCIPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE:
				if (accountableRole != null)
					msgs = ((InternalEObject)accountableRole).eInverseRemove(this, RASCIPackage.ROLE__ACCOUNTABLE_ELEMENT, Role.class, msgs);
				return basicSetAccountableRole((Role)otherEnd, msgs);
			case RASCIPackage.RASCI_ELEMENT__SUPPORT_ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupportRole()).basicAdd(otherEnd, msgs);
			case RASCIPackage.RASCI_ELEMENT__CONSULTED_ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConsultedRole()).basicAdd(otherEnd, msgs);
			case RASCIPackage.RASCI_ELEMENT__INFORMED_ROLE:
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
			case RASCIPackage.RASCI_ELEMENT__RESPONSIBLE_ROLE:
				return ((InternalEList<?>)getResponsibleRole()).basicRemove(otherEnd, msgs);
			case RASCIPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE:
				return basicSetAccountableRole(null, msgs);
			case RASCIPackage.RASCI_ELEMENT__SUPPORT_ROLE:
				return ((InternalEList<?>)getSupportRole()).basicRemove(otherEnd, msgs);
			case RASCIPackage.RASCI_ELEMENT__CONSULTED_ROLE:
				return ((InternalEList<?>)getConsultedRole()).basicRemove(otherEnd, msgs);
			case RASCIPackage.RASCI_ELEMENT__INFORMED_ROLE:
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
			case RASCIPackage.RASCI_ELEMENT__RESPONSIBLE_ROLE:
				return getResponsibleRole();
			case RASCIPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE:
				if (resolve) return getAccountableRole();
				return basicGetAccountableRole();
			case RASCIPackage.RASCI_ELEMENT__SUPPORT_ROLE:
				return getSupportRole();
			case RASCIPackage.RASCI_ELEMENT__CONSULTED_ROLE:
				return getConsultedRole();
			case RASCIPackage.RASCI_ELEMENT__INFORMED_ROLE:
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
			case RASCIPackage.RASCI_ELEMENT__RESPONSIBLE_ROLE:
				getResponsibleRole().clear();
				getResponsibleRole().addAll((Collection<? extends Role>)newValue);
				return;
			case RASCIPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE:
				setAccountableRole((Role)newValue);
				return;
			case RASCIPackage.RASCI_ELEMENT__SUPPORT_ROLE:
				getSupportRole().clear();
				getSupportRole().addAll((Collection<? extends Role>)newValue);
				return;
			case RASCIPackage.RASCI_ELEMENT__CONSULTED_ROLE:
				getConsultedRole().clear();
				getConsultedRole().addAll((Collection<? extends Role>)newValue);
				return;
			case RASCIPackage.RASCI_ELEMENT__INFORMED_ROLE:
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
			case RASCIPackage.RASCI_ELEMENT__RESPONSIBLE_ROLE:
				getResponsibleRole().clear();
				return;
			case RASCIPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE:
				setAccountableRole((Role)null);
				return;
			case RASCIPackage.RASCI_ELEMENT__SUPPORT_ROLE:
				getSupportRole().clear();
				return;
			case RASCIPackage.RASCI_ELEMENT__CONSULTED_ROLE:
				getConsultedRole().clear();
				return;
			case RASCIPackage.RASCI_ELEMENT__INFORMED_ROLE:
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
			case RASCIPackage.RASCI_ELEMENT__RESPONSIBLE_ROLE:
				return responsibleRole != null && !responsibleRole.isEmpty();
			case RASCIPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE:
				return accountableRole != null;
			case RASCIPackage.RASCI_ELEMENT__SUPPORT_ROLE:
				return supportRole != null && !supportRole.isEmpty();
			case RASCIPackage.RASCI_ELEMENT__CONSULTED_ROLE:
				return consultedRole != null && !consultedRole.isEmpty();
			case RASCIPackage.RASCI_ELEMENT__INFORMED_ROLE:
				return informedRole != null && !informedRole.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RasciElementImpl
