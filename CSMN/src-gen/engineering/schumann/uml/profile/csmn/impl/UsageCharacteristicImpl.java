/**
 */
package engineering.schumann.uml.profile.csmn.impl;

import engineering.schumann.uml.profile.csmn.CSMNPackage;
import engineering.schumann.uml.profile.csmn.UsageCharacteristic;
import engineering.schumann.uml.profile.csmn.UsageType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.UsageCharacteristicImpl#getBase_NamedElement <em>Base Named Element</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.UsageCharacteristicImpl#getIntendedUserGroup <em>Intended User Group</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.UsageCharacteristicImpl#getUsageSpec <em>Usage Spec</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.UsageCharacteristicImpl#getUsageType <em>Usage Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsageCharacteristicImpl extends MinimalEObjectImpl.Container implements UsageCharacteristic {
	/**
	 * The cached value of the '{@link #getBase_NamedElement() <em>Base Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_NamedElement()
	 * @generated
	 * @ordered
	 */
	protected NamedElement base_NamedElement;

	/**
	 * The cached value of the '{@link #getIntendedUserGroup() <em>Intended User Group</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedUserGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<Actor> intendedUserGroup;

	/**
	 * The default value of the '{@link #getUsageSpec() <em>Usage Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageSpec()
	 * @generated
	 * @ordered
	 */
	protected static final String USAGE_SPEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsageSpec() <em>Usage Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageSpec()
	 * @generated
	 * @ordered
	 */
	protected String usageSpec = USAGE_SPEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsageType() <em>Usage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageType()
	 * @generated
	 * @ordered
	 */
	protected static final UsageType USAGE_TYPE_EDEFAULT = UsageType.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getUsageType() <em>Usage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsageType()
	 * @generated
	 * @ordered
	 */
	protected UsageType usageType = USAGE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsageCharacteristicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMNPackage.Literals.USAGE_CHARACTERISTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement getBase_NamedElement() {
		if (base_NamedElement != null && base_NamedElement.eIsProxy()) {
			InternalEObject oldBase_NamedElement = (InternalEObject)base_NamedElement;
			base_NamedElement = (NamedElement)eResolveProxy(oldBase_NamedElement);
			if (base_NamedElement != oldBase_NamedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CSMNPackage.USAGE_CHARACTERISTIC__BASE_NAMED_ELEMENT, oldBase_NamedElement, base_NamedElement));
			}
		}
		return base_NamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetBase_NamedElement() {
		return base_NamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_NamedElement(NamedElement newBase_NamedElement) {
		NamedElement oldBase_NamedElement = base_NamedElement;
		base_NamedElement = newBase_NamedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.USAGE_CHARACTERISTIC__BASE_NAMED_ELEMENT, oldBase_NamedElement, base_NamedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Actor> getIntendedUserGroup() {
		if (intendedUserGroup == null) {
			intendedUserGroup = new EObjectResolvingEList<Actor>(Actor.class, this, CSMNPackage.USAGE_CHARACTERISTIC__INTENDED_USER_GROUP);
		}
		return intendedUserGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getIntendedUserGroup(String name) {
		return getIntendedUserGroup(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getIntendedUserGroup(String name, boolean ignoreCase) {
		intendedUserGroupLoop: for (Actor intendedUserGroup : getIntendedUserGroup()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(intendedUserGroup.getName()) : name.equals(intendedUserGroup.getName())))
				continue intendedUserGroupLoop;
			return intendedUserGroup;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsageSpec() {
		return usageSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsageSpec(String newUsageSpec) {
		String oldUsageSpec = usageSpec;
		usageSpec = newUsageSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.USAGE_CHARACTERISTIC__USAGE_SPEC, oldUsageSpec, usageSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsageType getUsageType() {
		return usageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsageType(UsageType newUsageType) {
		UsageType oldUsageType = usageType;
		usageType = newUsageType == null ? USAGE_TYPE_EDEFAULT : newUsageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.USAGE_CHARACTERISTIC__USAGE_TYPE, oldUsageType, usageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMNPackage.USAGE_CHARACTERISTIC__BASE_NAMED_ELEMENT:
				if (resolve) return getBase_NamedElement();
				return basicGetBase_NamedElement();
			case CSMNPackage.USAGE_CHARACTERISTIC__INTENDED_USER_GROUP:
				return getIntendedUserGroup();
			case CSMNPackage.USAGE_CHARACTERISTIC__USAGE_SPEC:
				return getUsageSpec();
			case CSMNPackage.USAGE_CHARACTERISTIC__USAGE_TYPE:
				return getUsageType();
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
			case CSMNPackage.USAGE_CHARACTERISTIC__BASE_NAMED_ELEMENT:
				setBase_NamedElement((NamedElement)newValue);
				return;
			case CSMNPackage.USAGE_CHARACTERISTIC__INTENDED_USER_GROUP:
				getIntendedUserGroup().clear();
				getIntendedUserGroup().addAll((Collection<? extends Actor>)newValue);
				return;
			case CSMNPackage.USAGE_CHARACTERISTIC__USAGE_SPEC:
				setUsageSpec((String)newValue);
				return;
			case CSMNPackage.USAGE_CHARACTERISTIC__USAGE_TYPE:
				setUsageType((UsageType)newValue);
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
			case CSMNPackage.USAGE_CHARACTERISTIC__BASE_NAMED_ELEMENT:
				setBase_NamedElement((NamedElement)null);
				return;
			case CSMNPackage.USAGE_CHARACTERISTIC__INTENDED_USER_GROUP:
				getIntendedUserGroup().clear();
				return;
			case CSMNPackage.USAGE_CHARACTERISTIC__USAGE_SPEC:
				setUsageSpec(USAGE_SPEC_EDEFAULT);
				return;
			case CSMNPackage.USAGE_CHARACTERISTIC__USAGE_TYPE:
				setUsageType(USAGE_TYPE_EDEFAULT);
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
			case CSMNPackage.USAGE_CHARACTERISTIC__BASE_NAMED_ELEMENT:
				return base_NamedElement != null;
			case CSMNPackage.USAGE_CHARACTERISTIC__INTENDED_USER_GROUP:
				return intendedUserGroup != null && !intendedUserGroup.isEmpty();
			case CSMNPackage.USAGE_CHARACTERISTIC__USAGE_SPEC:
				return USAGE_SPEC_EDEFAULT == null ? usageSpec != null : !USAGE_SPEC_EDEFAULT.equals(usageSpec);
			case CSMNPackage.USAGE_CHARACTERISTIC__USAGE_TYPE:
				return usageType != USAGE_TYPE_EDEFAULT;
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
		result.append(" (usageSpec: ");
		result.append(usageSpec);
		result.append(", usageType: ");
		result.append(usageType);
		result.append(')');
		return result.toString();
	}

} //UsageCharacteristicImpl
