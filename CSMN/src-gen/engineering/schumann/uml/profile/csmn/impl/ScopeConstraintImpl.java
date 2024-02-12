/**
 */
package engineering.schumann.uml.profile.csmn.impl;

import engineering.schumann.uml.profile.csmn.CSMNPackage;
import engineering.schumann.uml.profile.csmn.ProductConstraint;
import engineering.schumann.uml.profile.csmn.ScopeConstraint;
import engineering.schumann.uml.profile.csmn.ScopeConstraintType;

import engineering.schumann.uml.profile.csmn.SoftwareConstraint;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.ScopeConstraintImpl#getBase_NamedElement <em>Base Named Element</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.ScopeConstraintImpl#getProductConstraint <em>Product Constraint</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.ScopeConstraintImpl#getConstraintType <em>Constraint Type</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.ScopeConstraintImpl#getSoftwareConstraint <em>Software Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScopeConstraintImpl extends MinimalEObjectImpl.Container implements ScopeConstraint {
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
	 * The cached value of the '{@link #getProductConstraint() <em>Product Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductConstraint> productConstraint;

	/**
	 * The default value of the '{@link #getConstraintType() <em>Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintType()
	 * @generated
	 * @ordered
	 */
	protected static final ScopeConstraintType CONSTRAINT_TYPE_EDEFAULT = ScopeConstraintType.ADDED;

	/**
	 * The cached value of the '{@link #getConstraintType() <em>Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintType()
	 * @generated
	 * @ordered
	 */
	protected ScopeConstraintType constraintType = CONSTRAINT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSoftwareConstraint() <em>Software Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftwareConstraint> softwareConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScopeConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMNPackage.Literals.SCOPE_CONSTRAINT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CSMNPackage.SCOPE_CONSTRAINT__BASE_NAMED_ELEMENT, oldBase_NamedElement, base_NamedElement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.SCOPE_CONSTRAINT__BASE_NAMED_ELEMENT, oldBase_NamedElement, base_NamedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductConstraint> getProductConstraint() {
		if (productConstraint == null) {
			productConstraint = new EObjectContainmentEList<ProductConstraint>(ProductConstraint.class, this, CSMNPackage.SCOPE_CONSTRAINT__PRODUCT_CONSTRAINT);
		}
		return productConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScopeConstraintType getConstraintType() {
		return constraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstraintType(ScopeConstraintType newConstraintType) {
		ScopeConstraintType oldConstraintType = constraintType;
		constraintType = newConstraintType == null ? CONSTRAINT_TYPE_EDEFAULT : newConstraintType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.SCOPE_CONSTRAINT__CONSTRAINT_TYPE, oldConstraintType, constraintType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SoftwareConstraint> getSoftwareConstraint() {
		if (softwareConstraint == null) {
			softwareConstraint = new EObjectContainmentEList<SoftwareConstraint>(SoftwareConstraint.class, this, CSMNPackage.SCOPE_CONSTRAINT__SOFTWARE_CONSTRAINT);
		}
		return softwareConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CSMNPackage.SCOPE_CONSTRAINT__PRODUCT_CONSTRAINT:
				return ((InternalEList<?>)getProductConstraint()).basicRemove(otherEnd, msgs);
			case CSMNPackage.SCOPE_CONSTRAINT__SOFTWARE_CONSTRAINT:
				return ((InternalEList<?>)getSoftwareConstraint()).basicRemove(otherEnd, msgs);
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
			case CSMNPackage.SCOPE_CONSTRAINT__BASE_NAMED_ELEMENT:
				if (resolve) return getBase_NamedElement();
				return basicGetBase_NamedElement();
			case CSMNPackage.SCOPE_CONSTRAINT__PRODUCT_CONSTRAINT:
				return getProductConstraint();
			case CSMNPackage.SCOPE_CONSTRAINT__CONSTRAINT_TYPE:
				return getConstraintType();
			case CSMNPackage.SCOPE_CONSTRAINT__SOFTWARE_CONSTRAINT:
				return getSoftwareConstraint();
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
			case CSMNPackage.SCOPE_CONSTRAINT__BASE_NAMED_ELEMENT:
				setBase_NamedElement((NamedElement)newValue);
				return;
			case CSMNPackage.SCOPE_CONSTRAINT__PRODUCT_CONSTRAINT:
				getProductConstraint().clear();
				getProductConstraint().addAll((Collection<? extends ProductConstraint>)newValue);
				return;
			case CSMNPackage.SCOPE_CONSTRAINT__CONSTRAINT_TYPE:
				setConstraintType((ScopeConstraintType)newValue);
				return;
			case CSMNPackage.SCOPE_CONSTRAINT__SOFTWARE_CONSTRAINT:
				getSoftwareConstraint().clear();
				getSoftwareConstraint().addAll((Collection<? extends SoftwareConstraint>)newValue);
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
			case CSMNPackage.SCOPE_CONSTRAINT__BASE_NAMED_ELEMENT:
				setBase_NamedElement((NamedElement)null);
				return;
			case CSMNPackage.SCOPE_CONSTRAINT__PRODUCT_CONSTRAINT:
				getProductConstraint().clear();
				return;
			case CSMNPackage.SCOPE_CONSTRAINT__CONSTRAINT_TYPE:
				setConstraintType(CONSTRAINT_TYPE_EDEFAULT);
				return;
			case CSMNPackage.SCOPE_CONSTRAINT__SOFTWARE_CONSTRAINT:
				getSoftwareConstraint().clear();
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
			case CSMNPackage.SCOPE_CONSTRAINT__BASE_NAMED_ELEMENT:
				return base_NamedElement != null;
			case CSMNPackage.SCOPE_CONSTRAINT__PRODUCT_CONSTRAINT:
				return productConstraint != null && !productConstraint.isEmpty();
			case CSMNPackage.SCOPE_CONSTRAINT__CONSTRAINT_TYPE:
				return constraintType != CONSTRAINT_TYPE_EDEFAULT;
			case CSMNPackage.SCOPE_CONSTRAINT__SOFTWARE_CONSTRAINT:
				return softwareConstraint != null && !softwareConstraint.isEmpty();
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
		result.append(" (constraintType: ");
		result.append(constraintType);
		result.append(')');
		return result.toString();
	}

} //ScopeConstraintImpl
