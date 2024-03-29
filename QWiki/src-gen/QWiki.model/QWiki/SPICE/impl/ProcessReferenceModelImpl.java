/**
 */
package QWiki.SPICE.impl;

import QWiki.I18N.impl.I18nDescriptiveElementImpl;

import QWiki.Infrastructure.UmlElement;

import QWiki.Kernel.KernelPackage;

import QWiki.SPICE.ProcessReferenceModel;
import QWiki.SPICE.ProcessReferenceModelDomain;
import QWiki.SPICE.SPICEPackage;
import QWiki.SPICE.SpiceElement;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Reference Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.SPICE.impl.ProcessReferenceModelImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link QWiki.SPICE.impl.ProcessReferenceModelImpl#isNonStandard <em>Is Non Standard</em>}</li>
 *   <li>{@link QWiki.SPICE.impl.ProcessReferenceModelImpl#getPrmDomain <em>Prm Domain</em>}</li>
 *   <li>{@link QWiki.SPICE.impl.ProcessReferenceModelImpl#getOwnedSpiceElement <em>Owned Spice Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessReferenceModelImpl extends I18nDescriptiveElementImpl implements ProcessReferenceModel {
	/**
	 * The default value of the '{@link #isNonStandard() <em>Is Non Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNonStandard()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NON_STANDARD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNonStandard() <em>Is Non Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNonStandard()
	 * @generated
	 * @ordered
	 */
	protected boolean isNonStandard = IS_NON_STANDARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrmDomain() <em>Prm Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrmDomain()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessReferenceModelDomain PRM_DOMAIN_EDEFAULT = ProcessReferenceModelDomain.AGILE;

	/**
	 * The cached value of the '{@link #getPrmDomain() <em>Prm Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrmDomain()
	 * @generated
	 * @ordered
	 */
	protected ProcessReferenceModelDomain prmDomain = PRM_DOMAIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedSpiceElement() <em>Owned Spice Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSpiceElement()
	 * @generated
	 * @ordered
	 */
	protected EList<SpiceElement> ownedSpiceElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessReferenceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SPICEPackage.Literals.PROCESS_REFERENCE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UmlElement> getOwnedElement() {
		return new DerivedUnionEObjectEList<UmlElement>(UmlElement.class, this, SPICEPackage.PROCESS_REFERENCE_MODEL__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElement() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {SPICEPackage.PROCESS_REFERENCE_MODEL__OWNED_COMMENT, SPICEPackage.PROCESS_REFERENCE_MODEL__OWNED_SPICE_ELEMENT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNonStandard() {
		return isNonStandard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsNonStandard(boolean newIsNonStandard) {
		boolean oldIsNonStandard = isNonStandard;
		isNonStandard = newIsNonStandard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SPICEPackage.PROCESS_REFERENCE_MODEL__IS_NON_STANDARD, oldIsNonStandard, isNonStandard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessReferenceModelDomain getPrmDomain() {
		return prmDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrmDomain(ProcessReferenceModelDomain newPrmDomain) {
		ProcessReferenceModelDomain oldPrmDomain = prmDomain;
		prmDomain = newPrmDomain == null ? PRM_DOMAIN_EDEFAULT : newPrmDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SPICEPackage.PROCESS_REFERENCE_MODEL__PRM_DOMAIN, oldPrmDomain, prmDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpiceElement> getOwnedSpiceElement() {
		if (ownedSpiceElement == null) {
			ownedSpiceElement = new EObjectContainmentWithInverseEList<SpiceElement>(SpiceElement.class, this, SPICEPackage.PROCESS_REFERENCE_MODEL__OWNED_SPICE_ELEMENT, SPICEPackage.SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL);
		}
		return ownedSpiceElement;
	}

	/**
	 * The cached invocation delegate for the '{@link #oidForDomain() <em>Oid For Domain</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #oidForDomain()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate OID_FOR_DOMAIN__EINVOCATION_DELEGATE = ((EOperation.Internal)SPICEPackage.Literals.PROCESS_REFERENCE_MODEL___OID_FOR_DOMAIN).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String oidForDomain() {
		try {
			return (String)OID_FOR_DOMAIN__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
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
			case SPICEPackage.PROCESS_REFERENCE_MODEL__OWNED_SPICE_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedSpiceElement()).basicAdd(otherEnd, msgs);
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
			case SPICEPackage.PROCESS_REFERENCE_MODEL__OWNED_SPICE_ELEMENT:
				return ((InternalEList<?>)getOwnedSpiceElement()).basicRemove(otherEnd, msgs);
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
			case SPICEPackage.PROCESS_REFERENCE_MODEL__IS_NON_STANDARD:
				return isNonStandard();
			case SPICEPackage.PROCESS_REFERENCE_MODEL__PRM_DOMAIN:
				return getPrmDomain();
			case SPICEPackage.PROCESS_REFERENCE_MODEL__OWNED_SPICE_ELEMENT:
				return getOwnedSpiceElement();
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
			case SPICEPackage.PROCESS_REFERENCE_MODEL__IS_NON_STANDARD:
				setIsNonStandard((Boolean)newValue);
				return;
			case SPICEPackage.PROCESS_REFERENCE_MODEL__PRM_DOMAIN:
				setPrmDomain((ProcessReferenceModelDomain)newValue);
				return;
			case SPICEPackage.PROCESS_REFERENCE_MODEL__OWNED_SPICE_ELEMENT:
				getOwnedSpiceElement().clear();
				getOwnedSpiceElement().addAll((Collection<? extends SpiceElement>)newValue);
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
			case SPICEPackage.PROCESS_REFERENCE_MODEL__IS_NON_STANDARD:
				setIsNonStandard(IS_NON_STANDARD_EDEFAULT);
				return;
			case SPICEPackage.PROCESS_REFERENCE_MODEL__PRM_DOMAIN:
				setPrmDomain(PRM_DOMAIN_EDEFAULT);
				return;
			case SPICEPackage.PROCESS_REFERENCE_MODEL__OWNED_SPICE_ELEMENT:
				getOwnedSpiceElement().clear();
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
			case SPICEPackage.PROCESS_REFERENCE_MODEL__OWNED_ELEMENT:
				return isSetOwnedElement();
			case SPICEPackage.PROCESS_REFERENCE_MODEL__IS_NON_STANDARD:
				return isNonStandard != IS_NON_STANDARD_EDEFAULT;
			case SPICEPackage.PROCESS_REFERENCE_MODEL__PRM_DOMAIN:
				return prmDomain != PRM_DOMAIN_EDEFAULT;
			case SPICEPackage.PROCESS_REFERENCE_MODEL__OWNED_SPICE_ELEMENT:
				return ownedSpiceElement != null && !ownedSpiceElement.isEmpty();
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
			case SPICEPackage.PROCESS_REFERENCE_MODEL___OID_FOR_DOMAIN:
				return oidForDomain();
			case SPICEPackage.PROCESS_REFERENCE_MODEL___OID:
				return oid();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (isNonStandard: ");
		result.append(isNonStandard);
		result.append(", prmDomain: ");
		result.append(prmDomain);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElement() {
		return super.isSetOwnedElement()
			|| eIsSet(SPICEPackage.PROCESS_REFERENCE_MODEL__OWNED_SPICE_ELEMENT);
	}

} //ProcessReferenceModelImpl
