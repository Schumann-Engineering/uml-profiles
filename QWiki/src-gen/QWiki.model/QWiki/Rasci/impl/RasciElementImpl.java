/**
 */
package QWiki.Rasci.impl;

import QWiki.Rasci.RasciElement;
import QWiki.Rasci.RasciPackage;
import QWiki.Rasci.Role;
import QWiki.impl.L10nDescriptiveElementImpl;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
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
public abstract class RasciElementImpl extends L10nDescriptiveElementImpl implements RasciElement {
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
		return RasciPackage.Literals.RASCI_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getResponsibleRole() {
		if (responsibleRole == null) {
			responsibleRole = new EObjectWithInverseEList.ManyInverse<Role>(Role.class, this, RasciPackage.RASCI_ELEMENT__RESPONSIBLE_ROLE, RasciPackage.ROLE__RESPONSIBLE_ELEMENT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RasciPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE, oldAccountableRole, newAccountableRole);
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
				msgs = ((InternalEObject)accountableRole).eInverseRemove(this, RasciPackage.ROLE__ACCOUNTABLE_ELEMENT, Role.class, msgs);
			if (newAccountableRole != null)
				msgs = ((InternalEObject)newAccountableRole).eInverseAdd(this, RasciPackage.ROLE__ACCOUNTABLE_ELEMENT, Role.class, msgs);
			msgs = basicSetAccountableRole(newAccountableRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RasciPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE, newAccountableRole, newAccountableRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getSupportRole() {
		if (supportRole == null) {
			supportRole = new EObjectWithInverseEList.ManyInverse<Role>(Role.class, this, RasciPackage.RASCI_ELEMENT__SUPPORT_ROLE, RasciPackage.ROLE__SUPPORTING_ELEMENT);
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
			consultedRole = new EObjectWithInverseEList.ManyInverse<Role>(Role.class, this, RasciPackage.RASCI_ELEMENT__CONSULTED_ROLE, RasciPackage.ROLE__CONSULTING_ELEMENT);
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
			informedRole = new EObjectWithInverseEList.ManyInverse<Role>(Role.class, this, RasciPackage.RASCI_ELEMENT__INFORMED_ROLE, RasciPackage.ROLE__INFORMED_ELEMENT);
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
			case RasciPackage.RASCI_ELEMENT__RESPONSIBLE_ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResponsibleRole()).basicAdd(otherEnd, msgs);
			case RasciPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE:
				if (accountableRole != null)
					msgs = ((InternalEObject)accountableRole).eInverseRemove(this, RasciPackage.ROLE__ACCOUNTABLE_ELEMENT, Role.class, msgs);
				return basicSetAccountableRole((Role)otherEnd, msgs);
			case RasciPackage.RASCI_ELEMENT__SUPPORT_ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupportRole()).basicAdd(otherEnd, msgs);
			case RasciPackage.RASCI_ELEMENT__CONSULTED_ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConsultedRole()).basicAdd(otherEnd, msgs);
			case RasciPackage.RASCI_ELEMENT__INFORMED_ROLE:
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
			case RasciPackage.RASCI_ELEMENT__RESPONSIBLE_ROLE:
				return ((InternalEList<?>)getResponsibleRole()).basicRemove(otherEnd, msgs);
			case RasciPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE:
				return basicSetAccountableRole(null, msgs);
			case RasciPackage.RASCI_ELEMENT__SUPPORT_ROLE:
				return ((InternalEList<?>)getSupportRole()).basicRemove(otherEnd, msgs);
			case RasciPackage.RASCI_ELEMENT__CONSULTED_ROLE:
				return ((InternalEList<?>)getConsultedRole()).basicRemove(otherEnd, msgs);
			case RasciPackage.RASCI_ELEMENT__INFORMED_ROLE:
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
			case RasciPackage.RASCI_ELEMENT__RESPONSIBLE_ROLE:
				return getResponsibleRole();
			case RasciPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE:
				return getAccountableRole();
			case RasciPackage.RASCI_ELEMENT__SUPPORT_ROLE:
				return getSupportRole();
			case RasciPackage.RASCI_ELEMENT__CONSULTED_ROLE:
				return getConsultedRole();
			case RasciPackage.RASCI_ELEMENT__INFORMED_ROLE:
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
			case RasciPackage.RASCI_ELEMENT__RESPONSIBLE_ROLE:
				getResponsibleRole().clear();
				getResponsibleRole().addAll((Collection<? extends Role>)newValue);
				return;
			case RasciPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE:
				setAccountableRole((Role)newValue);
				return;
			case RasciPackage.RASCI_ELEMENT__SUPPORT_ROLE:
				getSupportRole().clear();
				getSupportRole().addAll((Collection<? extends Role>)newValue);
				return;
			case RasciPackage.RASCI_ELEMENT__CONSULTED_ROLE:
				getConsultedRole().clear();
				getConsultedRole().addAll((Collection<? extends Role>)newValue);
				return;
			case RasciPackage.RASCI_ELEMENT__INFORMED_ROLE:
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
			case RasciPackage.RASCI_ELEMENT__RESPONSIBLE_ROLE:
				getResponsibleRole().clear();
				return;
			case RasciPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE:
				setAccountableRole((Role)null);
				return;
			case RasciPackage.RASCI_ELEMENT__SUPPORT_ROLE:
				getSupportRole().clear();
				return;
			case RasciPackage.RASCI_ELEMENT__CONSULTED_ROLE:
				getConsultedRole().clear();
				return;
			case RasciPackage.RASCI_ELEMENT__INFORMED_ROLE:
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
			case RasciPackage.RASCI_ELEMENT__RESPONSIBLE_ROLE:
				return responsibleRole != null && !responsibleRole.isEmpty();
			case RasciPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE:
				return accountableRole != null;
			case RasciPackage.RASCI_ELEMENT__SUPPORT_ROLE:
				return supportRole != null && !supportRole.isEmpty();
			case RasciPackage.RASCI_ELEMENT__CONSULTED_ROLE:
				return consultedRole != null && !consultedRole.isEmpty();
			case RasciPackage.RASCI_ELEMENT__INFORMED_ROLE:
				return informedRole != null && !informedRole.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RasciElementImpl
