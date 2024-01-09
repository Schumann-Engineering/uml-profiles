/**
 */
package CSMN.Elements.impl;

import CSMN.Elements.ElementsPackage;
import CSMN.Elements.User;
import CSMN.Elements.userType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CSMN.Elements.impl.UserImpl#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link CSMN.Elements.impl.UserImpl#getUserType <em>User Type</em>}</li>
 *   <li>{@link CSMN.Elements.impl.UserImpl#isUseFilledIcon <em>Use Filled Icon</em>}</li>
 *   <li>{@link CSMN.Elements.impl.UserImpl#getBase_Actor <em>Base Actor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends MinimalEObjectImpl.Container implements User {
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
	 * The default value of the '{@link #getUserType() <em>User Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserType()
	 * @generated
	 * @ordered
	 */
	protected static final userType USER_TYPE_EDEFAULT = userType.GENERIC;

	/**
	 * The cached value of the '{@link #getUserType() <em>User Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserType()
	 * @generated
	 * @ordered
	 */
	protected userType userType = USER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseFilledIcon() <em>Use Filled Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseFilledIcon()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_FILLED_ICON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseFilledIcon() <em>Use Filled Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseFilledIcon()
	 * @generated
	 * @ordered
	 */
	protected boolean useFilledIcon = USE_FILLED_ICON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Actor() <em>Base Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Actor()
	 * @generated
	 * @ordered
	 */
	protected Actor base_Actor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElementsPackage.Literals.USER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ElementsPackage.USER__BASE_COMPONENT, oldBase_Component, base_Component));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ElementsPackage.USER__BASE_COMPONENT, oldBase_Component, base_Component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public userType getUserType() {
		return userType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserType(userType newUserType) {
		userType oldUserType = userType;
		userType = newUserType == null ? USER_TYPE_EDEFAULT : newUserType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElementsPackage.USER__USER_TYPE, oldUserType, userType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseFilledIcon() {
		return useFilledIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseFilledIcon(boolean newUseFilledIcon) {
		boolean oldUseFilledIcon = useFilledIcon;
		useFilledIcon = newUseFilledIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElementsPackage.USER__USE_FILLED_ICON, oldUseFilledIcon, useFilledIcon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actor getBase_Actor() {
		if (base_Actor != null && base_Actor.eIsProxy()) {
			InternalEObject oldBase_Actor = (InternalEObject)base_Actor;
			base_Actor = (Actor)eResolveProxy(oldBase_Actor);
			if (base_Actor != oldBase_Actor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ElementsPackage.USER__BASE_ACTOR, oldBase_Actor, base_Actor));
			}
		}
		return base_Actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetBase_Actor() {
		return base_Actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Actor(Actor newBase_Actor) {
		Actor oldBase_Actor = base_Actor;
		base_Actor = newBase_Actor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElementsPackage.USER__BASE_ACTOR, oldBase_Actor, base_Actor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ElementsPackage.USER__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
			case ElementsPackage.USER__USER_TYPE:
				return getUserType();
			case ElementsPackage.USER__USE_FILLED_ICON:
				return isUseFilledIcon();
			case ElementsPackage.USER__BASE_ACTOR:
				if (resolve) return getBase_Actor();
				return basicGetBase_Actor();
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
			case ElementsPackage.USER__BASE_COMPONENT:
				setBase_Component((Component)newValue);
				return;
			case ElementsPackage.USER__USER_TYPE:
				setUserType((userType)newValue);
				return;
			case ElementsPackage.USER__USE_FILLED_ICON:
				setUseFilledIcon((Boolean)newValue);
				return;
			case ElementsPackage.USER__BASE_ACTOR:
				setBase_Actor((Actor)newValue);
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
			case ElementsPackage.USER__BASE_COMPONENT:
				setBase_Component((Component)null);
				return;
			case ElementsPackage.USER__USER_TYPE:
				setUserType(USER_TYPE_EDEFAULT);
				return;
			case ElementsPackage.USER__USE_FILLED_ICON:
				setUseFilledIcon(USE_FILLED_ICON_EDEFAULT);
				return;
			case ElementsPackage.USER__BASE_ACTOR:
				setBase_Actor((Actor)null);
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
			case ElementsPackage.USER__BASE_COMPONENT:
				return base_Component != null;
			case ElementsPackage.USER__USER_TYPE:
				return userType != USER_TYPE_EDEFAULT;
			case ElementsPackage.USER__USE_FILLED_ICON:
				return useFilledIcon != USE_FILLED_ICON_EDEFAULT;
			case ElementsPackage.USER__BASE_ACTOR:
				return base_Actor != null;
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
		result.append(" (userType: ");
		result.append(userType);
		result.append(", useFilledIcon: ");
		result.append(useFilledIcon);
		result.append(')');
		return result.toString();
	}

} //UserImpl
