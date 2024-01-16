/**
 */
package engineering.schumann.uml.profile.csmn.impl;

import engineering.schumann.uml.profile.csmn.AccessCharacteristic;
import engineering.schumann.uml.profile.csmn.CSMNPackage;
import engineering.schumann.uml.profile.csmn.FunctionalAccessLevel;
import engineering.schumann.uml.profile.csmn.MechanicalAccessLevel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.AccessCharacteristicImpl#getBase_NamedElement <em>Base Named Element</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.AccessCharacteristicImpl#getFunctionalLevel <em>Functional Level</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.AccessCharacteristicImpl#getFunctionalSpec <em>Functional Spec</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.AccessCharacteristicImpl#getMechanicalLevel <em>Mechanical Level</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.AccessCharacteristicImpl#getMechanicalSpec <em>Mechanical Spec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessCharacteristicImpl extends MinimalEObjectImpl.Container implements AccessCharacteristic {
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
	 * The default value of the '{@link #getFunctionalLevel() <em>Functional Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalLevel()
	 * @generated
	 * @ordered
	 */
	protected static final FunctionalAccessLevel FUNCTIONAL_LEVEL_EDEFAULT = FunctionalAccessLevel.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getFunctionalLevel() <em>Functional Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalLevel()
	 * @generated
	 * @ordered
	 */
	protected FunctionalAccessLevel functionalLevel = FUNCTIONAL_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunctionalSpec() <em>Functional Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalSpec()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTIONAL_SPEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunctionalSpec() <em>Functional Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalSpec()
	 * @generated
	 * @ordered
	 */
	protected String functionalSpec = FUNCTIONAL_SPEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getMechanicalLevel() <em>Mechanical Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanicalLevel()
	 * @generated
	 * @ordered
	 */
	protected static final MechanicalAccessLevel MECHANICAL_LEVEL_EDEFAULT = MechanicalAccessLevel.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getMechanicalLevel() <em>Mechanical Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanicalLevel()
	 * @generated
	 * @ordered
	 */
	protected MechanicalAccessLevel mechanicalLevel = MECHANICAL_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMechanicalSpec() <em>Mechanical Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanicalSpec()
	 * @generated
	 * @ordered
	 */
	protected static final String MECHANICAL_SPEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMechanicalSpec() <em>Mechanical Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanicalSpec()
	 * @generated
	 * @ordered
	 */
	protected String mechanicalSpec = MECHANICAL_SPEC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessCharacteristicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMNPackage.Literals.ACCESS_CHARACTERISTIC;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CSMNPackage.ACCESS_CHARACTERISTIC__BASE_NAMED_ELEMENT, oldBase_NamedElement, base_NamedElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.ACCESS_CHARACTERISTIC__BASE_NAMED_ELEMENT, oldBase_NamedElement, base_NamedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalAccessLevel getFunctionalLevel() {
		return functionalLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunctionalLevel(FunctionalAccessLevel newFunctionalLevel) {
		FunctionalAccessLevel oldFunctionalLevel = functionalLevel;
		functionalLevel = newFunctionalLevel == null ? FUNCTIONAL_LEVEL_EDEFAULT : newFunctionalLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.ACCESS_CHARACTERISTIC__FUNCTIONAL_LEVEL, oldFunctionalLevel, functionalLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFunctionalSpec() {
		return functionalSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunctionalSpec(String newFunctionalSpec) {
		String oldFunctionalSpec = functionalSpec;
		functionalSpec = newFunctionalSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.ACCESS_CHARACTERISTIC__FUNCTIONAL_SPEC, oldFunctionalSpec, functionalSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MechanicalAccessLevel getMechanicalLevel() {
		return mechanicalLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMechanicalLevel(MechanicalAccessLevel newMechanicalLevel) {
		MechanicalAccessLevel oldMechanicalLevel = mechanicalLevel;
		mechanicalLevel = newMechanicalLevel == null ? MECHANICAL_LEVEL_EDEFAULT : newMechanicalLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.ACCESS_CHARACTERISTIC__MECHANICAL_LEVEL, oldMechanicalLevel, mechanicalLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMechanicalSpec() {
		return mechanicalSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMechanicalSpec(String newMechanicalSpec) {
		String oldMechanicalSpec = mechanicalSpec;
		mechanicalSpec = newMechanicalSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.ACCESS_CHARACTERISTIC__MECHANICAL_SPEC, oldMechanicalSpec, mechanicalSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMNPackage.ACCESS_CHARACTERISTIC__BASE_NAMED_ELEMENT:
				if (resolve) return getBase_NamedElement();
				return basicGetBase_NamedElement();
			case CSMNPackage.ACCESS_CHARACTERISTIC__FUNCTIONAL_LEVEL:
				return getFunctionalLevel();
			case CSMNPackage.ACCESS_CHARACTERISTIC__FUNCTIONAL_SPEC:
				return getFunctionalSpec();
			case CSMNPackage.ACCESS_CHARACTERISTIC__MECHANICAL_LEVEL:
				return getMechanicalLevel();
			case CSMNPackage.ACCESS_CHARACTERISTIC__MECHANICAL_SPEC:
				return getMechanicalSpec();
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
			case CSMNPackage.ACCESS_CHARACTERISTIC__BASE_NAMED_ELEMENT:
				setBase_NamedElement((NamedElement)newValue);
				return;
			case CSMNPackage.ACCESS_CHARACTERISTIC__FUNCTIONAL_LEVEL:
				setFunctionalLevel((FunctionalAccessLevel)newValue);
				return;
			case CSMNPackage.ACCESS_CHARACTERISTIC__FUNCTIONAL_SPEC:
				setFunctionalSpec((String)newValue);
				return;
			case CSMNPackage.ACCESS_CHARACTERISTIC__MECHANICAL_LEVEL:
				setMechanicalLevel((MechanicalAccessLevel)newValue);
				return;
			case CSMNPackage.ACCESS_CHARACTERISTIC__MECHANICAL_SPEC:
				setMechanicalSpec((String)newValue);
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
			case CSMNPackage.ACCESS_CHARACTERISTIC__BASE_NAMED_ELEMENT:
				setBase_NamedElement((NamedElement)null);
				return;
			case CSMNPackage.ACCESS_CHARACTERISTIC__FUNCTIONAL_LEVEL:
				setFunctionalLevel(FUNCTIONAL_LEVEL_EDEFAULT);
				return;
			case CSMNPackage.ACCESS_CHARACTERISTIC__FUNCTIONAL_SPEC:
				setFunctionalSpec(FUNCTIONAL_SPEC_EDEFAULT);
				return;
			case CSMNPackage.ACCESS_CHARACTERISTIC__MECHANICAL_LEVEL:
				setMechanicalLevel(MECHANICAL_LEVEL_EDEFAULT);
				return;
			case CSMNPackage.ACCESS_CHARACTERISTIC__MECHANICAL_SPEC:
				setMechanicalSpec(MECHANICAL_SPEC_EDEFAULT);
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
			case CSMNPackage.ACCESS_CHARACTERISTIC__BASE_NAMED_ELEMENT:
				return base_NamedElement != null;
			case CSMNPackage.ACCESS_CHARACTERISTIC__FUNCTIONAL_LEVEL:
				return functionalLevel != FUNCTIONAL_LEVEL_EDEFAULT;
			case CSMNPackage.ACCESS_CHARACTERISTIC__FUNCTIONAL_SPEC:
				return FUNCTIONAL_SPEC_EDEFAULT == null ? functionalSpec != null : !FUNCTIONAL_SPEC_EDEFAULT.equals(functionalSpec);
			case CSMNPackage.ACCESS_CHARACTERISTIC__MECHANICAL_LEVEL:
				return mechanicalLevel != MECHANICAL_LEVEL_EDEFAULT;
			case CSMNPackage.ACCESS_CHARACTERISTIC__MECHANICAL_SPEC:
				return MECHANICAL_SPEC_EDEFAULT == null ? mechanicalSpec != null : !MECHANICAL_SPEC_EDEFAULT.equals(mechanicalSpec);
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
		result.append(" (functionalLevel: ");
		result.append(functionalLevel);
		result.append(", functionalSpec: ");
		result.append(functionalSpec);
		result.append(", mechanicalLevel: ");
		result.append(mechanicalLevel);
		result.append(", mechanicalSpec: ");
		result.append(mechanicalSpec);
		result.append(')');
		return result.toString();
	}

} //AccessCharacteristicImpl
