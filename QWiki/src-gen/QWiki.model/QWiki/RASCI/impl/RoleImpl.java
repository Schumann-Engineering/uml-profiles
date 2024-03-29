/**
 */
package QWiki.RASCI.impl;

import QWiki.I18N.I18nString;

import QWiki.I18N.impl.I18nDescriptiveElementImpl;

import QWiki.Kernel.KernelPackage;

import QWiki.RASCI.RASCIPackage;
import QWiki.RASCI.RasciElement;
import QWiki.RASCI.Role;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.RASCI.impl.RoleImpl#getSkills <em>Skills</em>}</li>
 *   <li>{@link QWiki.RASCI.impl.RoleImpl#getResponsibleElement <em>Responsible Element</em>}</li>
 *   <li>{@link QWiki.RASCI.impl.RoleImpl#getAccountableElement <em>Accountable Element</em>}</li>
 *   <li>{@link QWiki.RASCI.impl.RoleImpl#getSupportingElement <em>Supporting Element</em>}</li>
 *   <li>{@link QWiki.RASCI.impl.RoleImpl#getConsultingElement <em>Consulting Element</em>}</li>
 *   <li>{@link QWiki.RASCI.impl.RoleImpl#getInformedElement <em>Informed Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleImpl extends I18nDescriptiveElementImpl implements Role {
	/**
	 * The cached value of the '{@link #getSkills() <em>Skills</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkills()
	 * @generated
	 * @ordered
	 */
	protected EList<I18nString> skills;

	/**
	 * The cached value of the '{@link #getResponsibleElement() <em>Responsible Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleElement()
	 * @generated
	 * @ordered
	 */
	protected EList<RasciElement> responsibleElement;

	/**
	 * The cached value of the '{@link #getAccountableElement() <em>Accountable Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountableElement()
	 * @generated
	 * @ordered
	 */
	protected EList<RasciElement> accountableElement;

	/**
	 * The cached value of the '{@link #getSupportingElement() <em>Supporting Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingElement()
	 * @generated
	 * @ordered
	 */
	protected EList<RasciElement> supportingElement;

	/**
	 * The cached value of the '{@link #getConsultingElement() <em>Consulting Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsultingElement()
	 * @generated
	 * @ordered
	 */
	protected EList<RasciElement> consultingElement;

	/**
	 * The cached value of the '{@link #getInformedElement() <em>Informed Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<RasciElement> informedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RASCIPackage.Literals.ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<I18nString> getSkills() {
		if (skills == null) {
			skills = new EObjectContainmentEList<I18nString>(I18nString.class, this, RASCIPackage.ROLE__SKILLS);
		}
		return skills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RasciElement> getResponsibleElement() {
		if (responsibleElement == null) {
			responsibleElement = new EObjectWithInverseResolvingEList.ManyInverse<RasciElement>(RasciElement.class, this, RASCIPackage.ROLE__RESPONSIBLE_ELEMENT, RASCIPackage.RASCI_ELEMENT__RESPONSIBLE_ROLE);
		}
		return responsibleElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RasciElement> getAccountableElement() {
		if (accountableElement == null) {
			accountableElement = new EObjectWithInverseResolvingEList<RasciElement>(RasciElement.class, this, RASCIPackage.ROLE__ACCOUNTABLE_ELEMENT, RASCIPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE);
		}
		return accountableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RasciElement> getSupportingElement() {
		if (supportingElement == null) {
			supportingElement = new EObjectWithInverseResolvingEList.ManyInverse<RasciElement>(RasciElement.class, this, RASCIPackage.ROLE__SUPPORTING_ELEMENT, RASCIPackage.RASCI_ELEMENT__SUPPORTING_ROLE);
		}
		return supportingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RasciElement> getConsultingElement() {
		if (consultingElement == null) {
			consultingElement = new EObjectWithInverseResolvingEList.ManyInverse<RasciElement>(RasciElement.class, this, RASCIPackage.ROLE__CONSULTING_ELEMENT, RASCIPackage.RASCI_ELEMENT__CONSULTING_ROLE);
		}
		return consultingElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RasciElement> getInformedElement() {
		if (informedElement == null) {
			informedElement = new EObjectWithInverseResolvingEList.ManyInverse<RasciElement>(RasciElement.class, this, RASCIPackage.ROLE__INFORMED_ELEMENT, RASCIPackage.RASCI_ELEMENT__INFORMED_ROLE);
		}
		return informedElement;
	}

	/**
	 * The cached invocation delegate for the '{@link #oid() <em>Oid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #oid()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate OID__EINVOCATION_DELEGATE = ((EOperation.Internal)KernelPackage.Literals.MODEL_ELEMENT___OID).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String oid() {
		try {
			return (String)OID__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
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
			case RASCIPackage.ROLE__RESPONSIBLE_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResponsibleElement()).basicAdd(otherEnd, msgs);
			case RASCIPackage.ROLE__ACCOUNTABLE_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccountableElement()).basicAdd(otherEnd, msgs);
			case RASCIPackage.ROLE__SUPPORTING_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupportingElement()).basicAdd(otherEnd, msgs);
			case RASCIPackage.ROLE__CONSULTING_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConsultingElement()).basicAdd(otherEnd, msgs);
			case RASCIPackage.ROLE__INFORMED_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInformedElement()).basicAdd(otherEnd, msgs);
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
			case RASCIPackage.ROLE__SKILLS:
				return ((InternalEList<?>)getSkills()).basicRemove(otherEnd, msgs);
			case RASCIPackage.ROLE__RESPONSIBLE_ELEMENT:
				return ((InternalEList<?>)getResponsibleElement()).basicRemove(otherEnd, msgs);
			case RASCIPackage.ROLE__ACCOUNTABLE_ELEMENT:
				return ((InternalEList<?>)getAccountableElement()).basicRemove(otherEnd, msgs);
			case RASCIPackage.ROLE__SUPPORTING_ELEMENT:
				return ((InternalEList<?>)getSupportingElement()).basicRemove(otherEnd, msgs);
			case RASCIPackage.ROLE__CONSULTING_ELEMENT:
				return ((InternalEList<?>)getConsultingElement()).basicRemove(otherEnd, msgs);
			case RASCIPackage.ROLE__INFORMED_ELEMENT:
				return ((InternalEList<?>)getInformedElement()).basicRemove(otherEnd, msgs);
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
			case RASCIPackage.ROLE__SKILLS:
				return getSkills();
			case RASCIPackage.ROLE__RESPONSIBLE_ELEMENT:
				return getResponsibleElement();
			case RASCIPackage.ROLE__ACCOUNTABLE_ELEMENT:
				return getAccountableElement();
			case RASCIPackage.ROLE__SUPPORTING_ELEMENT:
				return getSupportingElement();
			case RASCIPackage.ROLE__CONSULTING_ELEMENT:
				return getConsultingElement();
			case RASCIPackage.ROLE__INFORMED_ELEMENT:
				return getInformedElement();
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
			case RASCIPackage.ROLE__SKILLS:
				getSkills().clear();
				getSkills().addAll((Collection<? extends I18nString>)newValue);
				return;
			case RASCIPackage.ROLE__RESPONSIBLE_ELEMENT:
				getResponsibleElement().clear();
				getResponsibleElement().addAll((Collection<? extends RasciElement>)newValue);
				return;
			case RASCIPackage.ROLE__ACCOUNTABLE_ELEMENT:
				getAccountableElement().clear();
				getAccountableElement().addAll((Collection<? extends RasciElement>)newValue);
				return;
			case RASCIPackage.ROLE__SUPPORTING_ELEMENT:
				getSupportingElement().clear();
				getSupportingElement().addAll((Collection<? extends RasciElement>)newValue);
				return;
			case RASCIPackage.ROLE__CONSULTING_ELEMENT:
				getConsultingElement().clear();
				getConsultingElement().addAll((Collection<? extends RasciElement>)newValue);
				return;
			case RASCIPackage.ROLE__INFORMED_ELEMENT:
				getInformedElement().clear();
				getInformedElement().addAll((Collection<? extends RasciElement>)newValue);
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
			case RASCIPackage.ROLE__SKILLS:
				getSkills().clear();
				return;
			case RASCIPackage.ROLE__RESPONSIBLE_ELEMENT:
				getResponsibleElement().clear();
				return;
			case RASCIPackage.ROLE__ACCOUNTABLE_ELEMENT:
				getAccountableElement().clear();
				return;
			case RASCIPackage.ROLE__SUPPORTING_ELEMENT:
				getSupportingElement().clear();
				return;
			case RASCIPackage.ROLE__CONSULTING_ELEMENT:
				getConsultingElement().clear();
				return;
			case RASCIPackage.ROLE__INFORMED_ELEMENT:
				getInformedElement().clear();
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
			case RASCIPackage.ROLE__SKILLS:
				return skills != null && !skills.isEmpty();
			case RASCIPackage.ROLE__RESPONSIBLE_ELEMENT:
				return responsibleElement != null && !responsibleElement.isEmpty();
			case RASCIPackage.ROLE__ACCOUNTABLE_ELEMENT:
				return accountableElement != null && !accountableElement.isEmpty();
			case RASCIPackage.ROLE__SUPPORTING_ELEMENT:
				return supportingElement != null && !supportingElement.isEmpty();
			case RASCIPackage.ROLE__CONSULTING_ELEMENT:
				return consultingElement != null && !consultingElement.isEmpty();
			case RASCIPackage.ROLE__INFORMED_ELEMENT:
				return informedElement != null && !informedElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RASCIPackage.ROLE___OID:
				return oid();
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoleImpl
