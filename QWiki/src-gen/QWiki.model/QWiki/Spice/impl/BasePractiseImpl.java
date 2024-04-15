/**
 */
package QWiki.Spice.impl;

import QWiki.QWikiElement;
import QWiki.QWikiNamedElement;
import QWiki.QWikiNamespace;
import QWiki.QWikiPackage;

import QWiki.Spice.BasePractise;
import QWiki.Spice.Outcome;
import QWiki.Spice.SpicePackage;
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

import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
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
	 * The cached value of the '{@link #getFacilitatedWorkProduct() <em>Facilitated Work Product</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitatedWorkProduct()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProduct> facilitatedWorkProduct;

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
		return SpicePackage.Literals.BASE_PRACTISE;
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
		if (eContainerFeatureID() != SpicePackage.BASE_PRACTISE__OWNING_PROCESS) return null;
		return (QWiki.Spice.Process)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningProcess(QWiki.Spice.Process newOwningProcess, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningProcess, SpicePackage.BASE_PRACTISE__OWNING_PROCESS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningProcess(QWiki.Spice.Process newOwningProcess) {
		if (newOwningProcess != eInternalContainer() || (eContainerFeatureID() != SpicePackage.BASE_PRACTISE__OWNING_PROCESS && newOwningProcess != null)) {
			if (EcoreUtil.isAncestor(this, newOwningProcess))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningProcess != null)
				msgs = ((InternalEObject)newOwningProcess).eInverseAdd(this, SpicePackage.PROCESS__OWNED_BASE_PRACTISE, QWiki.Spice.Process.class, msgs);
			msgs = basicSetOwningProcess(newOwningProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.BASE_PRACTISE__OWNING_PROCESS, newOwningProcess, newOwningProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Outcome> getFacilitatedOutcome() {
		if (facilitatedOutcome == null) {
			facilitatedOutcome = new EObjectWithInverseEList.ManyInverse<Outcome>(Outcome.class, this, SpicePackage.BASE_PRACTISE__FACILITATED_OUTCOME, SpicePackage.OUTCOME__FACILITATING_BASE_PRACTISE);
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
	public EList<WorkProduct> getFacilitatedWorkProduct() {
		if (facilitatedWorkProduct == null) {
			facilitatedWorkProduct = new EObjectEList<WorkProduct>(WorkProduct.class, this, SpicePackage.BASE_PRACTISE__FACILITATED_WORK_PRODUCT);
		}
		return facilitatedWorkProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProduct getFacilitatedWorkProduct(String name) {
		return getFacilitatedWorkProduct(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProduct getFacilitatedWorkProduct(String name, boolean ignoreCase, EClass eClass) {
		facilitatedWorkProductLoop: for (WorkProduct facilitatedWorkProduct : getFacilitatedWorkProduct()) {
			if (eClass != null && !eClass.isInstance(facilitatedWorkProduct))
				continue facilitatedWorkProductLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(facilitatedWorkProduct.getName()) : name.equals(facilitatedWorkProduct.getName())))
				continue facilitatedWorkProductLoop;
			return facilitatedWorkProduct;
		}
		return null;
	}

	/**
	 * The cached invocation delegate for the '{@link #objectId() <em>Object Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #objectId()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate OBJECT_ID__EINVOCATION_DELEGATE = ((EOperation.Internal)SpicePackage.Literals.BASE_PRACTISE___OBJECT_ID).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String objectId() {
		try {
			return (String)OBJECT_ID__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case SpicePackage.BASE_PRACTISE__OWNING_PROCESS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningProcess((QWiki.Spice.Process)otherEnd, msgs);
			case SpicePackage.BASE_PRACTISE__FACILITATED_OUTCOME:
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
			case SpicePackage.BASE_PRACTISE__OWNING_PROCESS:
				return basicSetOwningProcess(null, msgs);
			case SpicePackage.BASE_PRACTISE__FACILITATED_OUTCOME:
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
			case SpicePackage.BASE_PRACTISE__OWNING_PROCESS:
				return eInternalContainer().eInverseRemove(this, SpicePackage.PROCESS__OWNED_BASE_PRACTISE, QWiki.Spice.Process.class, msgs);
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
			case SpicePackage.BASE_PRACTISE__OWNING_PROCESS:
				return getOwningProcess();
			case SpicePackage.BASE_PRACTISE__FACILITATED_OUTCOME:
				return getFacilitatedOutcome();
			case SpicePackage.BASE_PRACTISE__FACILITATED_WORK_PRODUCT:
				return getFacilitatedWorkProduct();
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
			case SpicePackage.BASE_PRACTISE__OWNING_PROCESS:
				setOwningProcess((QWiki.Spice.Process)newValue);
				return;
			case SpicePackage.BASE_PRACTISE__FACILITATED_OUTCOME:
				getFacilitatedOutcome().clear();
				getFacilitatedOutcome().addAll((Collection<? extends Outcome>)newValue);
				return;
			case SpicePackage.BASE_PRACTISE__FACILITATED_WORK_PRODUCT:
				getFacilitatedWorkProduct().clear();
				getFacilitatedWorkProduct().addAll((Collection<? extends WorkProduct>)newValue);
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
			case SpicePackage.BASE_PRACTISE__OWNING_PROCESS:
				setOwningProcess((QWiki.Spice.Process)null);
				return;
			case SpicePackage.BASE_PRACTISE__FACILITATED_OUTCOME:
				getFacilitatedOutcome().clear();
				return;
			case SpicePackage.BASE_PRACTISE__FACILITATED_WORK_PRODUCT:
				getFacilitatedWorkProduct().clear();
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
			case SpicePackage.BASE_PRACTISE__NAMESPACE:
				return isSetNamespace();
			case SpicePackage.BASE_PRACTISE__OWNING_PROCESS:
				return getOwningProcess() != null;
			case SpicePackage.BASE_PRACTISE__FACILITATED_OUTCOME:
				return facilitatedOutcome != null && !facilitatedOutcome.isEmpty();
			case SpicePackage.BASE_PRACTISE__FACILITATED_WORK_PRODUCT:
				return facilitatedWorkProduct != null && !facilitatedWorkProduct.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == QWikiElement.class) {
			switch (baseOperationID) {
				case QWikiPackage.QWIKI_ELEMENT___OBJECT_ID: return SpicePackage.BASE_PRACTISE___OBJECT_ID;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == QWikiNamedElement.class) {
			switch (baseOperationID) {
				case QWikiPackage.QWIKI_NAMED_ELEMENT___OBJECT_ID: return SpicePackage.BASE_PRACTISE___OBJECT_ID;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == QWikiNamespace.class) {
			switch (baseOperationID) {
				case QWikiPackage.QWIKI_NAMESPACE___OBJECT_ID: return SpicePackage.BASE_PRACTISE___OBJECT_ID;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SpicePackage.BASE_PRACTISE___OBJECT_ID:
				return objectId();
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
			|| eIsSet(SpicePackage.BASE_PRACTISE__OWNING_PROCESS);
	}

} //BasePractiseImpl
