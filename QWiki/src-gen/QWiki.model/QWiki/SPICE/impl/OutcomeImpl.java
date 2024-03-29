/**
 */
package QWiki.SPICE.impl;

import QWiki.I18N.impl.I18nNamedElementImpl;

import QWiki.Infrastructure.UmlElement;

import QWiki.Kernel.KernelPackage;

import QWiki.SPICE.Outcome;
import QWiki.SPICE.SPICEPackage;
import QWiki.SPICE.SpiceBasePractise;
import QWiki.SPICE.WorkProduct;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outcome</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.SPICE.impl.OutcomeImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link QWiki.SPICE.impl.OutcomeImpl#getFacilitatingBasePractise <em>Facilitating Base Practise</em>}</li>
 *   <li>{@link QWiki.SPICE.impl.OutcomeImpl#getRequiredWorkproduct <em>Required Workproduct</em>}</li>
 *   <li>{@link QWiki.SPICE.impl.OutcomeImpl#getResultingWorkproduct <em>Resulting Workproduct</em>}</li>
 *   <li>{@link QWiki.SPICE.impl.OutcomeImpl#getOwningProcess <em>Owning Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutcomeImpl extends I18nNamedElementImpl implements Outcome {
	/**
	 * The cached value of the '{@link #getFacilitatingBasePractise() <em>Facilitating Base Practise</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitatingBasePractise()
	 * @generated
	 * @ordered
	 */
	protected EList<SpiceBasePractise> facilitatingBasePractise;

	/**
	 * The cached value of the '{@link #getRequiredWorkproduct() <em>Required Workproduct</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredWorkproduct()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProduct> requiredWorkproduct;

	/**
	 * The cached value of the '{@link #getResultingWorkproduct() <em>Resulting Workproduct</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultingWorkproduct()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProduct> resultingWorkproduct;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutcomeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SPICEPackage.Literals.OUTCOME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UmlElement getOwner() {
		UmlElement owner = basicGetOwner();
		return owner != null && owner.eIsProxy() ? (UmlElement)eResolveProxy((InternalEObject)owner) : owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UmlElement basicGetOwner() {
		QWiki.SPICE.Process owningProcess = getOwningProcess();			
		if (owningProcess != null) {
			return owningProcess;
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpiceBasePractise> getFacilitatingBasePractise() {
		if (facilitatingBasePractise == null) {
			facilitatingBasePractise = new EObjectWithInverseResolvingEList.ManyInverse<SpiceBasePractise>(SpiceBasePractise.class, this, SPICEPackage.OUTCOME__FACILITATING_BASE_PRACTISE, SPICEPackage.SPICE_BASE_PRACTISE__FACILITATED_OUTCOME);
		}
		return facilitatingBasePractise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkProduct> getRequiredWorkproduct() {
		if (requiredWorkproduct == null) {
			requiredWorkproduct = new EObjectWithInverseResolvingEList.ManyInverse<WorkProduct>(WorkProduct.class, this, SPICEPackage.OUTCOME__REQUIRED_WORKPRODUCT, SPICEPackage.WORK_PRODUCT__FACILITATED_OUTCOME);
		}
		return requiredWorkproduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkProduct> getResultingWorkproduct() {
		if (resultingWorkproduct == null) {
			resultingWorkproduct = new EObjectWithInverseResolvingEList.ManyInverse<WorkProduct>(WorkProduct.class, this, SPICEPackage.OUTCOME__RESULTING_WORKPRODUCT, SPICEPackage.WORK_PRODUCT__FACILITATING_OUTCOME);
		}
		return resultingWorkproduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QWiki.SPICE.Process getOwningProcess() {
		if (eContainerFeatureID() != SPICEPackage.OUTCOME__OWNING_PROCESS) return null;
		return (QWiki.SPICE.Process)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningProcess(QWiki.SPICE.Process newOwningProcess, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningProcess, SPICEPackage.OUTCOME__OWNING_PROCESS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningProcess(QWiki.SPICE.Process newOwningProcess) {
		if (newOwningProcess != eInternalContainer() || (eContainerFeatureID() != SPICEPackage.OUTCOME__OWNING_PROCESS && newOwningProcess != null)) {
			if (EcoreUtil.isAncestor(this, newOwningProcess))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningProcess != null)
				msgs = ((InternalEObject)newOwningProcess).eInverseAdd(this, SPICEPackage.PROCESS__OWNED_OUTCOME, QWiki.SPICE.Process.class, msgs);
			msgs = basicSetOwningProcess(newOwningProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SPICEPackage.OUTCOME__OWNING_PROCESS, newOwningProcess, newOwningProcess));
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
			case SPICEPackage.OUTCOME__FACILITATING_BASE_PRACTISE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFacilitatingBasePractise()).basicAdd(otherEnd, msgs);
			case SPICEPackage.OUTCOME__REQUIRED_WORKPRODUCT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredWorkproduct()).basicAdd(otherEnd, msgs);
			case SPICEPackage.OUTCOME__RESULTING_WORKPRODUCT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResultingWorkproduct()).basicAdd(otherEnd, msgs);
			case SPICEPackage.OUTCOME__OWNING_PROCESS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningProcess((QWiki.SPICE.Process)otherEnd, msgs);
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
			case SPICEPackage.OUTCOME__FACILITATING_BASE_PRACTISE:
				return ((InternalEList<?>)getFacilitatingBasePractise()).basicRemove(otherEnd, msgs);
			case SPICEPackage.OUTCOME__REQUIRED_WORKPRODUCT:
				return ((InternalEList<?>)getRequiredWorkproduct()).basicRemove(otherEnd, msgs);
			case SPICEPackage.OUTCOME__RESULTING_WORKPRODUCT:
				return ((InternalEList<?>)getResultingWorkproduct()).basicRemove(otherEnd, msgs);
			case SPICEPackage.OUTCOME__OWNING_PROCESS:
				return basicSetOwningProcess(null, msgs);
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
			case SPICEPackage.OUTCOME__OWNING_PROCESS:
				return eInternalContainer().eInverseRemove(this, SPICEPackage.PROCESS__OWNED_OUTCOME, QWiki.SPICE.Process.class, msgs);
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
			case SPICEPackage.OUTCOME__FACILITATING_BASE_PRACTISE:
				return getFacilitatingBasePractise();
			case SPICEPackage.OUTCOME__REQUIRED_WORKPRODUCT:
				return getRequiredWorkproduct();
			case SPICEPackage.OUTCOME__RESULTING_WORKPRODUCT:
				return getResultingWorkproduct();
			case SPICEPackage.OUTCOME__OWNING_PROCESS:
				return getOwningProcess();
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
			case SPICEPackage.OUTCOME__FACILITATING_BASE_PRACTISE:
				getFacilitatingBasePractise().clear();
				getFacilitatingBasePractise().addAll((Collection<? extends SpiceBasePractise>)newValue);
				return;
			case SPICEPackage.OUTCOME__REQUIRED_WORKPRODUCT:
				getRequiredWorkproduct().clear();
				getRequiredWorkproduct().addAll((Collection<? extends WorkProduct>)newValue);
				return;
			case SPICEPackage.OUTCOME__RESULTING_WORKPRODUCT:
				getResultingWorkproduct().clear();
				getResultingWorkproduct().addAll((Collection<? extends WorkProduct>)newValue);
				return;
			case SPICEPackage.OUTCOME__OWNING_PROCESS:
				setOwningProcess((QWiki.SPICE.Process)newValue);
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
			case SPICEPackage.OUTCOME__FACILITATING_BASE_PRACTISE:
				getFacilitatingBasePractise().clear();
				return;
			case SPICEPackage.OUTCOME__REQUIRED_WORKPRODUCT:
				getRequiredWorkproduct().clear();
				return;
			case SPICEPackage.OUTCOME__RESULTING_WORKPRODUCT:
				getResultingWorkproduct().clear();
				return;
			case SPICEPackage.OUTCOME__OWNING_PROCESS:
				setOwningProcess((QWiki.SPICE.Process)null);
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
			case SPICEPackage.OUTCOME__OWNER:
				return isSetOwner();
			case SPICEPackage.OUTCOME__FACILITATING_BASE_PRACTISE:
				return facilitatingBasePractise != null && !facilitatingBasePractise.isEmpty();
			case SPICEPackage.OUTCOME__REQUIRED_WORKPRODUCT:
				return requiredWorkproduct != null && !requiredWorkproduct.isEmpty();
			case SPICEPackage.OUTCOME__RESULTING_WORKPRODUCT:
				return resultingWorkproduct != null && !resultingWorkproduct.isEmpty();
			case SPICEPackage.OUTCOME__OWNING_PROCESS:
				return getOwningProcess() != null;
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
			case SPICEPackage.OUTCOME___OID:
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
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(SPICEPackage.OUTCOME__OWNING_PROCESS);
	}

} //OutcomeImpl
