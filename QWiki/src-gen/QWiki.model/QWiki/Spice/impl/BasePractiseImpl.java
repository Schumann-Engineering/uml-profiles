/**
 */
package QWiki.Spice.impl;

import QWiki.Spice.BasePractise;
import QWiki.Spice.Outcome;
import QWiki.Spice.SPICEPackage;
import QWiki.Spice.WorkProduct;

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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Namespace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Practise</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Spice.impl.BasePractiseImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link QWiki.Spice.impl.BasePractiseImpl#getOwningProcess <em>Owning Process</em>}</li>
 *   <li>{@link QWiki.Spice.impl.BasePractiseImpl#getFacilitatedOutcome <em>Facilitated Outcome</em>}</li>
 *   <li>{@link QWiki.Spice.impl.BasePractiseImpl#getFacilitatedWorkProduct <em>Facilitated Work Product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasePractiseImpl extends SpiceElementImpl implements BasePractise {
	/**
	 * The cached value of the '{@link #getFacilitatedOutcome() <em>Facilitated Outcome</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitatedOutcome()
	 * @generated
	 * @ordered
	 */
	protected EList<Outcome> facilitatedOutcome;

	/**
	 * The cached value of the '{@link #getFacilitatedWorkProduct() <em>Facilitated Work Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitatedWorkProduct()
	 * @generated
	 * @ordered
	 */
	protected WorkProduct facilitatedWorkProduct;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasePractiseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SPICEPackage.Literals.BASE_PRACTISE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace getNamespace() {
		Namespace namespace = basicGetNamespace();
		return namespace != null && namespace.eIsProxy() ? (Namespace)eResolveProxy((InternalEObject)namespace) : namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace basicGetNamespace() {
		QWiki.Spice.Process owningProcess = getOwningProcess();			
		if (owningProcess != null) {
			return owningProcess;
		}
		return super.basicGetNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QWiki.Spice.Process getOwningProcess() {
		if (eContainerFeatureID() != SPICEPackage.BASE_PRACTISE__OWNING_PROCESS) return null;
		return (QWiki.Spice.Process)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningProcess(QWiki.Spice.Process newOwningProcess, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningProcess, SPICEPackage.BASE_PRACTISE__OWNING_PROCESS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningProcess(QWiki.Spice.Process newOwningProcess) {
		if (newOwningProcess != eInternalContainer() || (eContainerFeatureID() != SPICEPackage.BASE_PRACTISE__OWNING_PROCESS && newOwningProcess != null)) {
			if (EcoreUtil.isAncestor(this, newOwningProcess))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningProcess != null)
				msgs = ((InternalEObject)newOwningProcess).eInverseAdd(this, SPICEPackage.PROCESS__OWNED_BASE_PRACTISE, QWiki.Spice.Process.class, msgs);
			msgs = basicSetOwningProcess(newOwningProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SPICEPackage.BASE_PRACTISE__OWNING_PROCESS, newOwningProcess, newOwningProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Outcome> getFacilitatedOutcome() {
		if (facilitatedOutcome == null) {
			facilitatedOutcome = new EObjectWithInverseResolvingEList.ManyInverse<Outcome>(Outcome.class, this, SPICEPackage.BASE_PRACTISE__FACILITATED_OUTCOME, SPICEPackage.OUTCOME__FACILITATING_BASE_PRACTISE);
		}
		return facilitatedOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Outcome getFacilitatedOutcome(String name) {
		return getFacilitatedOutcome(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Outcome getFacilitatedOutcome(String name, boolean ignoreCase) {
		facilitatedOutcomeLoop: for (Outcome facilitatedOutcome : getFacilitatedOutcome()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(facilitatedOutcome.getName()) : name.equals(facilitatedOutcome.getName())))
				continue facilitatedOutcomeLoop;
			return facilitatedOutcome;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkProduct getFacilitatedWorkProduct() {
		if (facilitatedWorkProduct != null && facilitatedWorkProduct.eIsProxy()) {
			InternalEObject oldFacilitatedWorkProduct = (InternalEObject)facilitatedWorkProduct;
			facilitatedWorkProduct = (WorkProduct)eResolveProxy(oldFacilitatedWorkProduct);
			if (facilitatedWorkProduct != oldFacilitatedWorkProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SPICEPackage.BASE_PRACTISE__FACILITATED_WORK_PRODUCT, oldFacilitatedWorkProduct, facilitatedWorkProduct));
			}
		}
		return facilitatedWorkProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProduct basicGetFacilitatedWorkProduct() {
		return facilitatedWorkProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFacilitatedWorkProduct(WorkProduct newFacilitatedWorkProduct) {
		WorkProduct oldFacilitatedWorkProduct = facilitatedWorkProduct;
		facilitatedWorkProduct = newFacilitatedWorkProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SPICEPackage.BASE_PRACTISE__FACILITATED_WORK_PRODUCT, oldFacilitatedWorkProduct, facilitatedWorkProduct));
	}

	/**
	 * The cached invocation delegate for the '{@link #oid() <em>Oid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #oid()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate OID_1__EINVOCATION_DELEGATE = ((EOperation.Internal)SPICEPackage.Literals.BASE_PRACTISE___OID).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String oid() {
		try {
			return (String)OID_1__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case SPICEPackage.BASE_PRACTISE__OWNING_PROCESS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningProcess((QWiki.Spice.Process)otherEnd, msgs);
			case SPICEPackage.BASE_PRACTISE__FACILITATED_OUTCOME:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFacilitatedOutcome()).basicAdd(otherEnd, msgs);
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
			case SPICEPackage.BASE_PRACTISE__OWNING_PROCESS:
				return basicSetOwningProcess(null, msgs);
			case SPICEPackage.BASE_PRACTISE__FACILITATED_OUTCOME:
				return ((InternalEList<?>)getFacilitatedOutcome()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SPICEPackage.BASE_PRACTISE__OWNING_PROCESS:
				return eInternalContainer().eInverseRemove(this, SPICEPackage.PROCESS__OWNED_BASE_PRACTISE, QWiki.Spice.Process.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SPICEPackage.BASE_PRACTISE__OWNING_PROCESS:
				return getOwningProcess();
			case SPICEPackage.BASE_PRACTISE__FACILITATED_OUTCOME:
				return getFacilitatedOutcome();
			case SPICEPackage.BASE_PRACTISE__FACILITATED_WORK_PRODUCT:
				if (resolve) return getFacilitatedWorkProduct();
				return basicGetFacilitatedWorkProduct();
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
			case SPICEPackage.BASE_PRACTISE__OWNING_PROCESS:
				setOwningProcess((QWiki.Spice.Process)newValue);
				return;
			case SPICEPackage.BASE_PRACTISE__FACILITATED_OUTCOME:
				getFacilitatedOutcome().clear();
				getFacilitatedOutcome().addAll((Collection<? extends Outcome>)newValue);
				return;
			case SPICEPackage.BASE_PRACTISE__FACILITATED_WORK_PRODUCT:
				setFacilitatedWorkProduct((WorkProduct)newValue);
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
			case SPICEPackage.BASE_PRACTISE__OWNING_PROCESS:
				setOwningProcess((QWiki.Spice.Process)null);
				return;
			case SPICEPackage.BASE_PRACTISE__FACILITATED_OUTCOME:
				getFacilitatedOutcome().clear();
				return;
			case SPICEPackage.BASE_PRACTISE__FACILITATED_WORK_PRODUCT:
				setFacilitatedWorkProduct((WorkProduct)null);
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
			case SPICEPackage.BASE_PRACTISE__NAMESPACE:
				return isSetNamespace();
			case SPICEPackage.BASE_PRACTISE__OWNING_PROCESS:
				return getOwningProcess() != null;
			case SPICEPackage.BASE_PRACTISE__FACILITATED_OUTCOME:
				return facilitatedOutcome != null && !facilitatedOutcome.isEmpty();
			case SPICEPackage.BASE_PRACTISE__FACILITATED_WORK_PRODUCT:
				return facilitatedWorkProduct != null;
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
			case SPICEPackage.BASE_PRACTISE___OID:
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
	public boolean isSetNamespace() {
		return super.isSetNamespace()
			|| eIsSet(SPICEPackage.BASE_PRACTISE__OWNING_PROCESS);
	}

} //BasePractiseImpl
