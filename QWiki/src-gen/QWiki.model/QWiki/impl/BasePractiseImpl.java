/**
 */
package QWiki.impl;

import QWiki.BasePractise;
import QWiki.Element;
import QWiki.Outcome;
import QWiki.QWikiPackage;
import QWiki.WorkProduct;

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
 * An implementation of the model object '<em><b>Base Practise</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.impl.BasePractiseImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link QWiki.impl.BasePractiseImpl#getOwningProcess <em>Owning Process</em>}</li>
 *   <li>{@link QWiki.impl.BasePractiseImpl#getFacilitatedOutcome <em>Facilitated Outcome</em>}</li>
 *   <li>{@link QWiki.impl.BasePractiseImpl#getFacilitatedWorkProduct <em>Facilitated Work Product</em>}</li>
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
		return QWikiPackage.Literals.BASE_PRACTISE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy() ? (Element)eResolveProxy((InternalEObject)owner) : owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element basicGetOwner() {
		QWiki.Process owningProcess = getOwningProcess();			
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
	public QWiki.Process getOwningProcess() {
		if (eContainerFeatureID() != QWikiPackage.BASE_PRACTISE__OWNING_PROCESS) return null;
		return (QWiki.Process)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningProcess(QWiki.Process newOwningProcess, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningProcess, QWikiPackage.BASE_PRACTISE__OWNING_PROCESS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningProcess(QWiki.Process newOwningProcess) {
		if (newOwningProcess != eInternalContainer() || (eContainerFeatureID() != QWikiPackage.BASE_PRACTISE__OWNING_PROCESS && newOwningProcess != null)) {
			if (EcoreUtil.isAncestor(this, newOwningProcess))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningProcess != null)
				msgs = ((InternalEObject)newOwningProcess).eInverseAdd(this, QWikiPackage.PROCESS__OWNED_BASE_PRACTISE, QWiki.Process.class, msgs);
			msgs = basicSetOwningProcess(newOwningProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.BASE_PRACTISE__OWNING_PROCESS, newOwningProcess, newOwningProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Outcome> getFacilitatedOutcome() {
		if (facilitatedOutcome == null) {
			facilitatedOutcome = new EObjectWithInverseResolvingEList.ManyInverse<Outcome>(Outcome.class, this, QWikiPackage.BASE_PRACTISE__FACILITATED_OUTCOME, QWikiPackage.OUTCOME__FACILITATING_BASE_PRACTISE);
		}
		return facilitatedOutcome;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QWikiPackage.BASE_PRACTISE__FACILITATED_WORK_PRODUCT, oldFacilitatedWorkProduct, facilitatedWorkProduct));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.BASE_PRACTISE__FACILITATED_WORK_PRODUCT, oldFacilitatedWorkProduct, facilitatedWorkProduct));
	}

	/**
	 * The cached invocation delegate for the '{@link #oid() <em>Oid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #oid()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate OID__EINVOCATION_DELEGATE = ((EOperation.Internal)QWikiPackage.Literals.ELEMENT___OID).getInvocationDelegate();

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
			case QWikiPackage.BASE_PRACTISE__OWNING_PROCESS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningProcess((QWiki.Process)otherEnd, msgs);
			case QWikiPackage.BASE_PRACTISE__FACILITATED_OUTCOME:
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
			case QWikiPackage.BASE_PRACTISE__OWNING_PROCESS:
				return basicSetOwningProcess(null, msgs);
			case QWikiPackage.BASE_PRACTISE__FACILITATED_OUTCOME:
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
			case QWikiPackage.BASE_PRACTISE__OWNING_PROCESS:
				return eInternalContainer().eInverseRemove(this, QWikiPackage.PROCESS__OWNED_BASE_PRACTISE, QWiki.Process.class, msgs);
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
			case QWikiPackage.BASE_PRACTISE__OWNING_PROCESS:
				return getOwningProcess();
			case QWikiPackage.BASE_PRACTISE__FACILITATED_OUTCOME:
				return getFacilitatedOutcome();
			case QWikiPackage.BASE_PRACTISE__FACILITATED_WORK_PRODUCT:
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
			case QWikiPackage.BASE_PRACTISE__OWNING_PROCESS:
				setOwningProcess((QWiki.Process)newValue);
				return;
			case QWikiPackage.BASE_PRACTISE__FACILITATED_OUTCOME:
				getFacilitatedOutcome().clear();
				getFacilitatedOutcome().addAll((Collection<? extends Outcome>)newValue);
				return;
			case QWikiPackage.BASE_PRACTISE__FACILITATED_WORK_PRODUCT:
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
			case QWikiPackage.BASE_PRACTISE__OWNING_PROCESS:
				setOwningProcess((QWiki.Process)null);
				return;
			case QWikiPackage.BASE_PRACTISE__FACILITATED_OUTCOME:
				getFacilitatedOutcome().clear();
				return;
			case QWikiPackage.BASE_PRACTISE__FACILITATED_WORK_PRODUCT:
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
			case QWikiPackage.BASE_PRACTISE__OWNER:
				return isSetOwner();
			case QWikiPackage.BASE_PRACTISE__OWNING_PROCESS:
				return getOwningProcess() != null;
			case QWikiPackage.BASE_PRACTISE__FACILITATED_OUTCOME:
				return facilitatedOutcome != null && !facilitatedOutcome.isEmpty();
			case QWikiPackage.BASE_PRACTISE__FACILITATED_WORK_PRODUCT:
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
			case QWikiPackage.BASE_PRACTISE___OID:
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
			|| eIsSet(QWikiPackage.BASE_PRACTISE__OWNING_PROCESS);
	}

} //BasePractiseImpl
