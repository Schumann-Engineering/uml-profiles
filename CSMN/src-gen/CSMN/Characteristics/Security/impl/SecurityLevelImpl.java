/**
 */
package CSMN.Characteristics.Security.impl;

import CSMN.Characteristics.Security.Iec62443FoundationalRequirementType;
import CSMN.Characteristics.Security.Iec62443SecurityLevelType;
import CSMN.Characteristics.Security.SecurityLevel;
import CSMN.Characteristics.Security.SecurityPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CSMN.Characteristics.Security.impl.SecurityLevelImpl#getFoundationalRequirement <em>Foundational Requirement</em>}</li>
 *   <li>{@link CSMN.Characteristics.Security.impl.SecurityLevelImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link CSMN.Characteristics.Security.impl.SecurityLevelImpl#getRational <em>Rational</em>}</li>
 *   <li>{@link CSMN.Characteristics.Security.impl.SecurityLevelImpl#getType <em>Type</em>}</li>
 *   <li>{@link CSMN.Characteristics.Security.impl.SecurityLevelImpl#getVector <em>Vector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityLevelImpl extends MinimalEObjectImpl.Container implements SecurityLevel {
	/**
	 * The default value of the '{@link #getFoundationalRequirement() <em>Foundational Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoundationalRequirement()
	 * @generated
	 * @ordered
	 */
	protected static final Iec62443FoundationalRequirementType FOUNDATIONAL_REQUIREMENT_EDEFAULT = Iec62443FoundationalRequirementType.IAC;

	/**
	 * The cached value of the '{@link #getFoundationalRequirement() <em>Foundational Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFoundationalRequirement()
	 * @generated
	 * @ordered
	 */
	protected Iec62443FoundationalRequirementType foundationalRequirement = FOUNDATIONAL_REQUIREMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected SecurityLevel level;

	/**
	 * The default value of the '{@link #getRational() <em>Rational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRational()
	 * @generated
	 * @ordered
	 */
	protected static final String RATIONAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRational() <em>Rational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRational()
	 * @generated
	 * @ordered
	 */
	protected String rational = RATIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Iec62443SecurityLevelType TYPE_EDEFAULT = Iec62443SecurityLevelType.CAPABILITY;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Iec62443SecurityLevelType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVector() <em>Vector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVector()
	 * @generated
	 * @ordered
	 */
	protected static final String VECTOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVector() <em>Vector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVector()
	 * @generated
	 * @ordered
	 */
	protected String vector = VECTOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityLevelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.SECURITY_LEVEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Iec62443FoundationalRequirementType getFoundationalRequirement() {
		return foundationalRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFoundationalRequirement(Iec62443FoundationalRequirementType newFoundationalRequirement) {
		Iec62443FoundationalRequirementType oldFoundationalRequirement = foundationalRequirement;
		foundationalRequirement = newFoundationalRequirement == null ? FOUNDATIONAL_REQUIREMENT_EDEFAULT : newFoundationalRequirement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.SECURITY_LEVEL__FOUNDATIONAL_REQUIREMENT, oldFoundationalRequirement, foundationalRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityLevel getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLevel(SecurityLevel newLevel, NotificationChain msgs) {
		SecurityLevel oldLevel = level;
		level = newLevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SecurityPackage.SECURITY_LEVEL__LEVEL, oldLevel, newLevel);
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
	public void setLevel(SecurityLevel newLevel) {
		if (newLevel != level) {
			NotificationChain msgs = null;
			if (level != null)
				msgs = ((InternalEObject)level).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SecurityPackage.SECURITY_LEVEL__LEVEL, null, msgs);
			if (newLevel != null)
				msgs = ((InternalEObject)newLevel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SecurityPackage.SECURITY_LEVEL__LEVEL, null, msgs);
			msgs = basicSetLevel(newLevel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.SECURITY_LEVEL__LEVEL, newLevel, newLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRational() {
		return rational;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRational(String newRational) {
		String oldRational = rational;
		rational = newRational;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.SECURITY_LEVEL__RATIONAL, oldRational, rational));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Iec62443SecurityLevelType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Iec62443SecurityLevelType newType) {
		Iec62443SecurityLevelType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.SECURITY_LEVEL__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVector() {
		return vector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVector(String newVector) {
		String oldVector = vector;
		vector = newVector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.SECURITY_LEVEL__VECTOR, oldVector, vector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecurityPackage.SECURITY_LEVEL__LEVEL:
				return basicSetLevel(null, msgs);
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
			case SecurityPackage.SECURITY_LEVEL__FOUNDATIONAL_REQUIREMENT:
				return getFoundationalRequirement();
			case SecurityPackage.SECURITY_LEVEL__LEVEL:
				return getLevel();
			case SecurityPackage.SECURITY_LEVEL__RATIONAL:
				return getRational();
			case SecurityPackage.SECURITY_LEVEL__TYPE:
				return getType();
			case SecurityPackage.SECURITY_LEVEL__VECTOR:
				return getVector();
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
			case SecurityPackage.SECURITY_LEVEL__FOUNDATIONAL_REQUIREMENT:
				setFoundationalRequirement((Iec62443FoundationalRequirementType)newValue);
				return;
			case SecurityPackage.SECURITY_LEVEL__LEVEL:
				setLevel((SecurityLevel)newValue);
				return;
			case SecurityPackage.SECURITY_LEVEL__RATIONAL:
				setRational((String)newValue);
				return;
			case SecurityPackage.SECURITY_LEVEL__TYPE:
				setType((Iec62443SecurityLevelType)newValue);
				return;
			case SecurityPackage.SECURITY_LEVEL__VECTOR:
				setVector((String)newValue);
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
			case SecurityPackage.SECURITY_LEVEL__FOUNDATIONAL_REQUIREMENT:
				setFoundationalRequirement(FOUNDATIONAL_REQUIREMENT_EDEFAULT);
				return;
			case SecurityPackage.SECURITY_LEVEL__LEVEL:
				setLevel((SecurityLevel)null);
				return;
			case SecurityPackage.SECURITY_LEVEL__RATIONAL:
				setRational(RATIONAL_EDEFAULT);
				return;
			case SecurityPackage.SECURITY_LEVEL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SecurityPackage.SECURITY_LEVEL__VECTOR:
				setVector(VECTOR_EDEFAULT);
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
			case SecurityPackage.SECURITY_LEVEL__FOUNDATIONAL_REQUIREMENT:
				return foundationalRequirement != FOUNDATIONAL_REQUIREMENT_EDEFAULT;
			case SecurityPackage.SECURITY_LEVEL__LEVEL:
				return level != null;
			case SecurityPackage.SECURITY_LEVEL__RATIONAL:
				return RATIONAL_EDEFAULT == null ? rational != null : !RATIONAL_EDEFAULT.equals(rational);
			case SecurityPackage.SECURITY_LEVEL__TYPE:
				return type != TYPE_EDEFAULT;
			case SecurityPackage.SECURITY_LEVEL__VECTOR:
				return VECTOR_EDEFAULT == null ? vector != null : !VECTOR_EDEFAULT.equals(vector);
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
		result.append(" (foundationalRequirement: ");
		result.append(foundationalRequirement);
		result.append(", rational: ");
		result.append(rational);
		result.append(", type: ");
		result.append(type);
		result.append(", vector: ");
		result.append(vector);
		result.append(')');
		return result.toString();
	}

} //SecurityLevelImpl
