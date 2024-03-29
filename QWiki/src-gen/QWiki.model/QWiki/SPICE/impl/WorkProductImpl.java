/**
 */
package QWiki.SPICE.impl;

import QWiki.I18N.I18nString;

import QWiki.Infrastructure.UmlElement;

import QWiki.Kernel.KernelPackage;

import QWiki.SPICE.GenericWorkProduct;
import QWiki.SPICE.Outcome;
import QWiki.SPICE.SPICEPackage;
import QWiki.SPICE.WorkProduct;
import QWiki.SPICE.WorkProductType;

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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.SPICE.impl.WorkProductImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link QWiki.SPICE.impl.WorkProductImpl#getOwningWorkProductGroup <em>Owning Work Product Group</em>}</li>
 *   <li>{@link QWiki.SPICE.impl.WorkProductImpl#getCharacteristic <em>Characteristic</em>}</li>
 *   <li>{@link QWiki.SPICE.impl.WorkProductImpl#getContent <em>Content</em>}</li>
 *   <li>{@link QWiki.SPICE.impl.WorkProductImpl#getFacilitatingOutcome <em>Facilitating Outcome</em>}</li>
 *   <li>{@link QWiki.SPICE.impl.WorkProductImpl#getFacilitatedProcess <em>Facilitated Process</em>}</li>
 *   <li>{@link QWiki.SPICE.impl.WorkProductImpl#getFacilitatingProcess <em>Facilitating Process</em>}</li>
 *   <li>{@link QWiki.SPICE.impl.WorkProductImpl#getWorkProductType <em>Work Product Type</em>}</li>
 *   <li>{@link QWiki.SPICE.impl.WorkProductImpl#getFacilitatedOutcome <em>Facilitated Outcome</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkProductImpl extends SpiceElementImpl implements WorkProduct {
	/**
	 * The cached value of the '{@link #getCharacteristic() <em>Characteristic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected EList<I18nString> characteristic;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EList<I18nString> content;

	/**
	 * The cached value of the '{@link #getFacilitatingOutcome() <em>Facilitating Outcome</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitatingOutcome()
	 * @generated
	 * @ordered
	 */
	protected EList<Outcome> facilitatingOutcome;

	/**
	 * The cached value of the '{@link #getFacilitatedProcess() <em>Facilitated Process</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitatedProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<QWiki.SPICE.Process> facilitatedProcess;

	/**
	 * The cached value of the '{@link #getFacilitatingProcess() <em>Facilitating Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitatingProcess()
	 * @generated
	 * @ordered
	 */
	protected QWiki.SPICE.Process facilitatingProcess;

	/**
	 * The default value of the '{@link #getWorkProductType() <em>Work Product Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkProductType()
	 * @generated
	 * @ordered
	 */
	protected static final WorkProductType WORK_PRODUCT_TYPE_EDEFAULT = WorkProductType.ARTEFACT;

	/**
	 * The cached value of the '{@link #getWorkProductType() <em>Work Product Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkProductType()
	 * @generated
	 * @ordered
	 */
	protected WorkProductType workProductType = WORK_PRODUCT_TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SPICEPackage.Literals.WORK_PRODUCT;
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
		GenericWorkProduct owningWorkProductGroup = getOwningWorkProductGroup();			
		if (owningWorkProductGroup != null) {
			return owningWorkProductGroup;
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericWorkProduct getOwningWorkProductGroup() {
		if (eContainerFeatureID() != SPICEPackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP) return null;
		return (GenericWorkProduct)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningWorkProductGroup(GenericWorkProduct newOwningWorkProductGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningWorkProductGroup, SPICEPackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningWorkProductGroup(GenericWorkProduct newOwningWorkProductGroup) {
		if (newOwningWorkProductGroup != eInternalContainer() || (eContainerFeatureID() != SPICEPackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP && newOwningWorkProductGroup != null)) {
			if (EcoreUtil.isAncestor(this, newOwningWorkProductGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningWorkProductGroup != null)
				msgs = ((InternalEObject)newOwningWorkProductGroup).eInverseAdd(this, SPICEPackage.GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT, GenericWorkProduct.class, msgs);
			msgs = basicSetOwningWorkProductGroup(newOwningWorkProductGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SPICEPackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP, newOwningWorkProductGroup, newOwningWorkProductGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<I18nString> getCharacteristic() {
		if (characteristic == null) {
			characteristic = new EObjectContainmentEList<I18nString>(I18nString.class, this, SPICEPackage.WORK_PRODUCT__CHARACTERISTIC);
		}
		return characteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<I18nString> getContent() {
		if (content == null) {
			content = new EObjectContainmentEList<I18nString>(I18nString.class, this, SPICEPackage.WORK_PRODUCT__CONTENT);
		}
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Outcome> getFacilitatingOutcome() {
		if (facilitatingOutcome == null) {
			facilitatingOutcome = new EObjectWithInverseResolvingEList.ManyInverse<Outcome>(Outcome.class, this, SPICEPackage.WORK_PRODUCT__FACILITATING_OUTCOME, SPICEPackage.OUTCOME__RESULTING_WORKPRODUCT);
		}
		return facilitatingOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QWiki.SPICE.Process> getFacilitatedProcess() {
		if (facilitatedProcess == null) {
			facilitatedProcess = new EObjectWithInverseResolvingEList.ManyInverse<QWiki.SPICE.Process>(QWiki.SPICE.Process.class, this, SPICEPackage.WORK_PRODUCT__FACILITATED_PROCESS, SPICEPackage.PROCESS__FACILITATING_WORK_PRODUCT);
		}
		return facilitatedProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QWiki.SPICE.Process getFacilitatingProcess() {
		if (facilitatingProcess != null && facilitatingProcess.eIsProxy()) {
			InternalEObject oldFacilitatingProcess = (InternalEObject)facilitatingProcess;
			facilitatingProcess = (QWiki.SPICE.Process)eResolveProxy(oldFacilitatingProcess);
			if (facilitatingProcess != oldFacilitatingProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SPICEPackage.WORK_PRODUCT__FACILITATING_PROCESS, oldFacilitatingProcess, facilitatingProcess));
			}
		}
		return facilitatingProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWiki.SPICE.Process basicGetFacilitatingProcess() {
		return facilitatingProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFacilitatingProcess(QWiki.SPICE.Process newFacilitatingProcess, NotificationChain msgs) {
		QWiki.SPICE.Process oldFacilitatingProcess = facilitatingProcess;
		facilitatingProcess = newFacilitatingProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPICEPackage.WORK_PRODUCT__FACILITATING_PROCESS, oldFacilitatingProcess, newFacilitatingProcess);
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
	public void setFacilitatingProcess(QWiki.SPICE.Process newFacilitatingProcess) {
		if (newFacilitatingProcess != facilitatingProcess) {
			NotificationChain msgs = null;
			if (facilitatingProcess != null)
				msgs = ((InternalEObject)facilitatingProcess).eInverseRemove(this, SPICEPackage.PROCESS__FACILITATED_WORK_PRODUCT, QWiki.SPICE.Process.class, msgs);
			if (newFacilitatingProcess != null)
				msgs = ((InternalEObject)newFacilitatingProcess).eInverseAdd(this, SPICEPackage.PROCESS__FACILITATED_WORK_PRODUCT, QWiki.SPICE.Process.class, msgs);
			msgs = basicSetFacilitatingProcess(newFacilitatingProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SPICEPackage.WORK_PRODUCT__FACILITATING_PROCESS, newFacilitatingProcess, newFacilitatingProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkProductType getWorkProductType() {
		return workProductType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkProductType(WorkProductType newWorkProductType) {
		WorkProductType oldWorkProductType = workProductType;
		workProductType = newWorkProductType == null ? WORK_PRODUCT_TYPE_EDEFAULT : newWorkProductType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SPICEPackage.WORK_PRODUCT__WORK_PRODUCT_TYPE, oldWorkProductType, workProductType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Outcome> getFacilitatedOutcome() {
		if (facilitatedOutcome == null) {
			facilitatedOutcome = new EObjectWithInverseResolvingEList.ManyInverse<Outcome>(Outcome.class, this, SPICEPackage.WORK_PRODUCT__FACILITATED_OUTCOME, SPICEPackage.OUTCOME__REQUIRED_WORKPRODUCT);
		}
		return facilitatedOutcome;
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
			case SPICEPackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningWorkProductGroup((GenericWorkProduct)otherEnd, msgs);
			case SPICEPackage.WORK_PRODUCT__FACILITATING_OUTCOME:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFacilitatingOutcome()).basicAdd(otherEnd, msgs);
			case SPICEPackage.WORK_PRODUCT__FACILITATED_PROCESS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFacilitatedProcess()).basicAdd(otherEnd, msgs);
			case SPICEPackage.WORK_PRODUCT__FACILITATING_PROCESS:
				if (facilitatingProcess != null)
					msgs = ((InternalEObject)facilitatingProcess).eInverseRemove(this, SPICEPackage.PROCESS__FACILITATED_WORK_PRODUCT, QWiki.SPICE.Process.class, msgs);
				return basicSetFacilitatingProcess((QWiki.SPICE.Process)otherEnd, msgs);
			case SPICEPackage.WORK_PRODUCT__FACILITATED_OUTCOME:
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
			case SPICEPackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP:
				return basicSetOwningWorkProductGroup(null, msgs);
			case SPICEPackage.WORK_PRODUCT__CHARACTERISTIC:
				return ((InternalEList<?>)getCharacteristic()).basicRemove(otherEnd, msgs);
			case SPICEPackage.WORK_PRODUCT__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
			case SPICEPackage.WORK_PRODUCT__FACILITATING_OUTCOME:
				return ((InternalEList<?>)getFacilitatingOutcome()).basicRemove(otherEnd, msgs);
			case SPICEPackage.WORK_PRODUCT__FACILITATED_PROCESS:
				return ((InternalEList<?>)getFacilitatedProcess()).basicRemove(otherEnd, msgs);
			case SPICEPackage.WORK_PRODUCT__FACILITATING_PROCESS:
				return basicSetFacilitatingProcess(null, msgs);
			case SPICEPackage.WORK_PRODUCT__FACILITATED_OUTCOME:
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
			case SPICEPackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP:
				return eInternalContainer().eInverseRemove(this, SPICEPackage.GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT, GenericWorkProduct.class, msgs);
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
			case SPICEPackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP:
				return getOwningWorkProductGroup();
			case SPICEPackage.WORK_PRODUCT__CHARACTERISTIC:
				return getCharacteristic();
			case SPICEPackage.WORK_PRODUCT__CONTENT:
				return getContent();
			case SPICEPackage.WORK_PRODUCT__FACILITATING_OUTCOME:
				return getFacilitatingOutcome();
			case SPICEPackage.WORK_PRODUCT__FACILITATED_PROCESS:
				return getFacilitatedProcess();
			case SPICEPackage.WORK_PRODUCT__FACILITATING_PROCESS:
				if (resolve) return getFacilitatingProcess();
				return basicGetFacilitatingProcess();
			case SPICEPackage.WORK_PRODUCT__WORK_PRODUCT_TYPE:
				return getWorkProductType();
			case SPICEPackage.WORK_PRODUCT__FACILITATED_OUTCOME:
				return getFacilitatedOutcome();
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
			case SPICEPackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP:
				setOwningWorkProductGroup((GenericWorkProduct)newValue);
				return;
			case SPICEPackage.WORK_PRODUCT__CHARACTERISTIC:
				getCharacteristic().clear();
				getCharacteristic().addAll((Collection<? extends I18nString>)newValue);
				return;
			case SPICEPackage.WORK_PRODUCT__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends I18nString>)newValue);
				return;
			case SPICEPackage.WORK_PRODUCT__FACILITATING_OUTCOME:
				getFacilitatingOutcome().clear();
				getFacilitatingOutcome().addAll((Collection<? extends Outcome>)newValue);
				return;
			case SPICEPackage.WORK_PRODUCT__FACILITATED_PROCESS:
				getFacilitatedProcess().clear();
				getFacilitatedProcess().addAll((Collection<? extends QWiki.SPICE.Process>)newValue);
				return;
			case SPICEPackage.WORK_PRODUCT__FACILITATING_PROCESS:
				setFacilitatingProcess((QWiki.SPICE.Process)newValue);
				return;
			case SPICEPackage.WORK_PRODUCT__WORK_PRODUCT_TYPE:
				setWorkProductType((WorkProductType)newValue);
				return;
			case SPICEPackage.WORK_PRODUCT__FACILITATED_OUTCOME:
				getFacilitatedOutcome().clear();
				getFacilitatedOutcome().addAll((Collection<? extends Outcome>)newValue);
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
			case SPICEPackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP:
				setOwningWorkProductGroup((GenericWorkProduct)null);
				return;
			case SPICEPackage.WORK_PRODUCT__CHARACTERISTIC:
				getCharacteristic().clear();
				return;
			case SPICEPackage.WORK_PRODUCT__CONTENT:
				getContent().clear();
				return;
			case SPICEPackage.WORK_PRODUCT__FACILITATING_OUTCOME:
				getFacilitatingOutcome().clear();
				return;
			case SPICEPackage.WORK_PRODUCT__FACILITATED_PROCESS:
				getFacilitatedProcess().clear();
				return;
			case SPICEPackage.WORK_PRODUCT__FACILITATING_PROCESS:
				setFacilitatingProcess((QWiki.SPICE.Process)null);
				return;
			case SPICEPackage.WORK_PRODUCT__WORK_PRODUCT_TYPE:
				setWorkProductType(WORK_PRODUCT_TYPE_EDEFAULT);
				return;
			case SPICEPackage.WORK_PRODUCT__FACILITATED_OUTCOME:
				getFacilitatedOutcome().clear();
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
			case SPICEPackage.WORK_PRODUCT__OWNER:
				return isSetOwner();
			case SPICEPackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP:
				return getOwningWorkProductGroup() != null;
			case SPICEPackage.WORK_PRODUCT__CHARACTERISTIC:
				return characteristic != null && !characteristic.isEmpty();
			case SPICEPackage.WORK_PRODUCT__CONTENT:
				return content != null && !content.isEmpty();
			case SPICEPackage.WORK_PRODUCT__FACILITATING_OUTCOME:
				return facilitatingOutcome != null && !facilitatingOutcome.isEmpty();
			case SPICEPackage.WORK_PRODUCT__FACILITATED_PROCESS:
				return facilitatedProcess != null && !facilitatedProcess.isEmpty();
			case SPICEPackage.WORK_PRODUCT__FACILITATING_PROCESS:
				return facilitatingProcess != null;
			case SPICEPackage.WORK_PRODUCT__WORK_PRODUCT_TYPE:
				return workProductType != WORK_PRODUCT_TYPE_EDEFAULT;
			case SPICEPackage.WORK_PRODUCT__FACILITATED_OUTCOME:
				return facilitatedOutcome != null && !facilitatedOutcome.isEmpty();
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
			case SPICEPackage.WORK_PRODUCT___OID:
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
		result.append(" (workProductType: ");
		result.append(workProductType);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(SPICEPackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP);
	}

} //WorkProductImpl
