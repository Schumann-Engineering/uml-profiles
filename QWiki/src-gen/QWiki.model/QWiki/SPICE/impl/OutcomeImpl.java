/**
 */
package QWiki.Spice.impl;

import QWiki.QWikiElement;
import QWiki.QWikiNamedElement;
import QWiki.QWikiPackage;

import QWiki.Spice.BasePractise;
import QWiki.Spice.Outcome;
import QWiki.Spice.SpicePackage;
import QWiki.Spice.WorkProduct;
import QWiki.impl.L10nNamedElementImpl;
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

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Namespace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Outcome</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Spice.impl.OutcomeImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link QWiki.Spice.impl.OutcomeImpl#getFacilitatingBasePractise <em>Facilitating Base Practise</em>}</li>
 *   <li>{@link QWiki.Spice.impl.OutcomeImpl#getRequiredWorkproduct <em>Required Workproduct</em>}</li>
 *   <li>{@link QWiki.Spice.impl.OutcomeImpl#getResultingWorkproduct <em>Resulting Workproduct</em>}</li>
 *   <li>{@link QWiki.Spice.impl.OutcomeImpl#getOwningProcess <em>Owning Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutcomeImpl extends L10nNamedElementImpl implements Outcome {
	/**
	 * The cached value of the '{@link #getFacilitatingBasePractise() <em>Facilitating Base Practise</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitatingBasePractise()
	 * @generated
	 * @ordered
	 */
	protected EList<BasePractise> facilitatingBasePractise;

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
		return SpicePackage.Literals.OUTCOME;
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
	public EList<BasePractise> getFacilitatingBasePractise() {
		if (facilitatingBasePractise == null) {
			facilitatingBasePractise = new EObjectWithInverseEList.ManyInverse<BasePractise>(BasePractise.class, this, SpicePackage.OUTCOME__FACILITATING_BASE_PRACTISE, SpicePackage.BASE_PRACTISE__FACILITATED_OUTCOME);
		}
		return facilitatingBasePractise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasePractise getFacilitatingBasePractise(String name) {
		return getFacilitatingBasePractise(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasePractise getFacilitatingBasePractise(String name, boolean ignoreCase) {
		facilitatingBasePractiseLoop: for (BasePractise facilitatingBasePractise : getFacilitatingBasePractise()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(facilitatingBasePractise.getName()) : name.equals(facilitatingBasePractise.getName())))
				continue facilitatingBasePractiseLoop;
			return facilitatingBasePractise;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkProduct> getRequiredWorkproduct() {
		if (requiredWorkproduct == null) {
			requiredWorkproduct = new EObjectWithInverseEList.ManyInverse<WorkProduct>(WorkProduct.class, this, SpicePackage.OUTCOME__REQUIRED_WORKPRODUCT, SpicePackage.WORK_PRODUCT__FACILITATED_OUTCOME);
		}
		return requiredWorkproduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProduct getRequiredWorkproduct(String name) {
		return getRequiredWorkproduct(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProduct getRequiredWorkproduct(String name, boolean ignoreCase, EClass eClass) {
		requiredWorkproductLoop: for (WorkProduct requiredWorkproduct : getRequiredWorkproduct()) {
			if (eClass != null && !eClass.isInstance(requiredWorkproduct))
				continue requiredWorkproductLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(requiredWorkproduct.getName()) : name.equals(requiredWorkproduct.getName())))
				continue requiredWorkproductLoop;
			return requiredWorkproduct;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkProduct> getResultingWorkproduct() {
		if (resultingWorkproduct == null) {
			resultingWorkproduct = new EObjectWithInverseEList.ManyInverse<WorkProduct>(WorkProduct.class, this, SpicePackage.OUTCOME__RESULTING_WORKPRODUCT, SpicePackage.WORK_PRODUCT__FACILITATING_OUTCOME);
		}
		return resultingWorkproduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProduct getResultingWorkproduct(String name) {
		return getResultingWorkproduct(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProduct getResultingWorkproduct(String name, boolean ignoreCase, EClass eClass) {
		resultingWorkproductLoop: for (WorkProduct resultingWorkproduct : getResultingWorkproduct()) {
			if (eClass != null && !eClass.isInstance(resultingWorkproduct))
				continue resultingWorkproductLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(resultingWorkproduct.getName()) : name.equals(resultingWorkproduct.getName())))
				continue resultingWorkproductLoop;
			return resultingWorkproduct;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QWiki.Spice.Process getOwningProcess() {
		if (eContainerFeatureID() != SpicePackage.OUTCOME__OWNING_PROCESS) return null;
		return (QWiki.Spice.Process)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningProcess(QWiki.Spice.Process newOwningProcess, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningProcess, SpicePackage.OUTCOME__OWNING_PROCESS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningProcess(QWiki.Spice.Process newOwningProcess) {
		if (newOwningProcess != eInternalContainer() || (eContainerFeatureID() != SpicePackage.OUTCOME__OWNING_PROCESS && newOwningProcess != null)) {
			if (EcoreUtil.isAncestor(this, newOwningProcess))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningProcess != null)
				msgs = ((InternalEObject)newOwningProcess).eInverseAdd(this, SpicePackage.PROCESS__OWNED_OUTCOME, QWiki.Spice.Process.class, msgs);
			msgs = basicSetOwningProcess(newOwningProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.OUTCOME__OWNING_PROCESS, newOwningProcess, newOwningProcess));
	}

	/**
	 * The cached invocation delegate for the '{@link #objectId() <em>Object Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #objectId()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate OBJECT_ID__EINVOCATION_DELEGATE = ((EOperation.Internal)SpicePackage.Literals.OUTCOME___OBJECT_ID).getInvocationDelegate();

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
			case SpicePackage.OUTCOME__FACILITATING_BASE_PRACTISE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFacilitatingBasePractise()).basicAdd(otherEnd, msgs);
			case SpicePackage.OUTCOME__REQUIRED_WORKPRODUCT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredWorkproduct()).basicAdd(otherEnd, msgs);
			case SpicePackage.OUTCOME__RESULTING_WORKPRODUCT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResultingWorkproduct()).basicAdd(otherEnd, msgs);
			case SpicePackage.OUTCOME__OWNING_PROCESS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningProcess((QWiki.Spice.Process)otherEnd, msgs);
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
			case SpicePackage.OUTCOME__FACILITATING_BASE_PRACTISE:
				return ((InternalEList<?>)getFacilitatingBasePractise()).basicRemove(otherEnd, msgs);
			case SpicePackage.OUTCOME__REQUIRED_WORKPRODUCT:
				return ((InternalEList<?>)getRequiredWorkproduct()).basicRemove(otherEnd, msgs);
			case SpicePackage.OUTCOME__RESULTING_WORKPRODUCT:
				return ((InternalEList<?>)getResultingWorkproduct()).basicRemove(otherEnd, msgs);
			case SpicePackage.OUTCOME__OWNING_PROCESS:
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
			case SpicePackage.OUTCOME__OWNING_PROCESS:
				return eInternalContainer().eInverseRemove(this, SpicePackage.PROCESS__OWNED_OUTCOME, QWiki.Spice.Process.class, msgs);
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
			case SpicePackage.OUTCOME__FACILITATING_BASE_PRACTISE:
				return getFacilitatingBasePractise();
			case SpicePackage.OUTCOME__REQUIRED_WORKPRODUCT:
				return getRequiredWorkproduct();
			case SpicePackage.OUTCOME__RESULTING_WORKPRODUCT:
				return getResultingWorkproduct();
			case SpicePackage.OUTCOME__OWNING_PROCESS:
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
			case SpicePackage.OUTCOME__FACILITATING_BASE_PRACTISE:
				getFacilitatingBasePractise().clear();
				getFacilitatingBasePractise().addAll((Collection<? extends BasePractise>)newValue);
				return;
			case SpicePackage.OUTCOME__REQUIRED_WORKPRODUCT:
				getRequiredWorkproduct().clear();
				getRequiredWorkproduct().addAll((Collection<? extends WorkProduct>)newValue);
				return;
			case SpicePackage.OUTCOME__RESULTING_WORKPRODUCT:
				getResultingWorkproduct().clear();
				getResultingWorkproduct().addAll((Collection<? extends WorkProduct>)newValue);
				return;
			case SpicePackage.OUTCOME__OWNING_PROCESS:
				setOwningProcess((QWiki.Spice.Process)newValue);
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
			case SpicePackage.OUTCOME__FACILITATING_BASE_PRACTISE:
				getFacilitatingBasePractise().clear();
				return;
			case SpicePackage.OUTCOME__REQUIRED_WORKPRODUCT:
				getRequiredWorkproduct().clear();
				return;
			case SpicePackage.OUTCOME__RESULTING_WORKPRODUCT:
				getResultingWorkproduct().clear();
				return;
			case SpicePackage.OUTCOME__OWNING_PROCESS:
				setOwningProcess((QWiki.Spice.Process)null);
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
			case SpicePackage.OUTCOME__NAMESPACE:
				return isSetNamespace();
			case SpicePackage.OUTCOME__FACILITATING_BASE_PRACTISE:
				return facilitatingBasePractise != null && !facilitatingBasePractise.isEmpty();
			case SpicePackage.OUTCOME__REQUIRED_WORKPRODUCT:
				return requiredWorkproduct != null && !requiredWorkproduct.isEmpty();
			case SpicePackage.OUTCOME__RESULTING_WORKPRODUCT:
				return resultingWorkproduct != null && !resultingWorkproduct.isEmpty();
			case SpicePackage.OUTCOME__OWNING_PROCESS:
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == QWikiElement.class) {
			switch (baseOperationID) {
				case QWikiPackage.QWIKI_ELEMENT___OBJECT_ID: return SpicePackage.OUTCOME___OBJECT_ID;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == QWikiNamedElement.class) {
			switch (baseOperationID) {
				case QWikiPackage.QWIKI_NAMED_ELEMENT___OBJECT_ID: return SpicePackage.OUTCOME___OBJECT_ID;
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
			case SpicePackage.OUTCOME___OBJECT_ID:
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
			|| eIsSet(SpicePackage.OUTCOME__OWNING_PROCESS);
	}

} //OutcomeImpl
