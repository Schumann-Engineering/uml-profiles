/**
 */
package QWiki.Spice.impl;

import QWiki.Kernel.I18nString;

import QWiki.Spice.GenericWorkProduct;
import QWiki.Spice.Outcome;
import QWiki.Spice.SPICEPackage;
import QWiki.Spice.WorkProduct;
import QWiki.Spice.WorkProductRelationship;
import QWiki.Spice.WorkProductType;

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

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.uml.Namespace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Spice.impl.WorkProductImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link QWiki.Spice.impl.WorkProductImpl#getLinkedWorkProduct <em>Linked Work Product</em>}</li>
 *   <li>{@link QWiki.Spice.impl.WorkProductImpl#getOwningWorkProductGroup <em>Owning Work Product Group</em>}</li>
 *   <li>{@link QWiki.Spice.impl.WorkProductImpl#getCharacteristic <em>Characteristic</em>}</li>
 *   <li>{@link QWiki.Spice.impl.WorkProductImpl#getFacilitatingOutcome <em>Facilitating Outcome</em>}</li>
 *   <li>{@link QWiki.Spice.impl.WorkProductImpl#getFacilitatedProcess <em>Facilitated Process</em>}</li>
 *   <li>{@link QWiki.Spice.impl.WorkProductImpl#getFacilitatingProcess <em>Facilitating Process</em>}</li>
 *   <li>{@link QWiki.Spice.impl.WorkProductImpl#getWorkProductType <em>Work Product Type</em>}</li>
 *   <li>{@link QWiki.Spice.impl.WorkProductImpl#getContainedWorkProduct <em>Contained Work Product</em>}</li>
 *   <li>{@link QWiki.Spice.impl.WorkProductImpl#getContainingWorkProduct <em>Containing Work Product</em>}</li>
 *   <li>{@link QWiki.Spice.impl.WorkProductImpl#getLink <em>Link</em>}</li>
 *   <li>{@link QWiki.Spice.impl.WorkProductImpl#getFacilitatedOutcome <em>Facilitated Outcome</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkProductImpl extends SpiceElementImpl implements WorkProduct {
	/**
	 * The cached value of the '{@link #getCharacteristic() <em>Characteristic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected I18nString characteristic;

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
	protected EList<QWiki.Spice.Process> facilitatedProcess;

	/**
	 * The cached value of the '{@link #getFacilitatingProcess() <em>Facilitating Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitatingProcess()
	 * @generated
	 * @ordered
	 */
	protected QWiki.Spice.Process facilitatingProcess;

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
	 * The cached value of the '{@link #getContainedWorkProduct() <em>Contained Work Product</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedWorkProduct()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProduct> containedWorkProduct;

	/**
	 * The cached value of the '{@link #getContainingWorkProduct() <em>Containing Work Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainingWorkProduct()
	 * @generated
	 * @ordered
	 */
	protected WorkProduct containingWorkProduct;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProductRelationship> link;

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
		GenericWorkProduct owningWorkProductGroup = getOwningWorkProductGroup();			
		if (owningWorkProductGroup != null) {
			return owningWorkProductGroup;
		}
		return super.basicGetNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkProduct> getLinkedWorkProduct() {
		return new DerivedUnionEObjectEList<WorkProduct>(WorkProduct.class, this, SPICEPackage.WORK_PRODUCT__LINKED_WORK_PRODUCT, LINKED_WORK_PRODUCT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getLinkedWorkProduct() <em>Linked Work Product</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedWorkProduct()
	 * @generated
	 * @ordered
	 */
	protected static final int[] LINKED_WORK_PRODUCT_ESUBSETS = new int[] {SPICEPackage.WORK_PRODUCT__CONTAINED_WORK_PRODUCT, SPICEPackage.WORK_PRODUCT__CONTAINING_WORK_PRODUCT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProduct getLinkedWorkProduct(String name) {
		return getLinkedWorkProduct(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProduct getLinkedWorkProduct(String name, boolean ignoreCase, EClass eClass) {
		linkedWorkProductLoop: for (WorkProduct linkedWorkProduct : getLinkedWorkProduct()) {
			if (eClass != null && !eClass.isInstance(linkedWorkProduct))
				continue linkedWorkProductLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(linkedWorkProduct.getName()) : name.equals(linkedWorkProduct.getName())))
				continue linkedWorkProductLoop;
			return linkedWorkProduct;
		}
		return null;
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
	public I18nString getCharacteristic() {
		return characteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCharacteristic(I18nString newCharacteristic, NotificationChain msgs) {
		I18nString oldCharacteristic = characteristic;
		characteristic = newCharacteristic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPICEPackage.WORK_PRODUCT__CHARACTERISTIC, oldCharacteristic, newCharacteristic);
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
	public void setCharacteristic(I18nString newCharacteristic) {
		if (newCharacteristic != characteristic) {
			NotificationChain msgs = null;
			if (characteristic != null)
				msgs = ((InternalEObject)characteristic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPICEPackage.WORK_PRODUCT__CHARACTERISTIC, null, msgs);
			if (newCharacteristic != null)
				msgs = ((InternalEObject)newCharacteristic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPICEPackage.WORK_PRODUCT__CHARACTERISTIC, null, msgs);
			msgs = basicSetCharacteristic(newCharacteristic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SPICEPackage.WORK_PRODUCT__CHARACTERISTIC, newCharacteristic, newCharacteristic));
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
	public Outcome getFacilitatingOutcome(String name) {
		return getFacilitatingOutcome(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Outcome getFacilitatingOutcome(String name, boolean ignoreCase) {
		facilitatingOutcomeLoop: for (Outcome facilitatingOutcome : getFacilitatingOutcome()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(facilitatingOutcome.getName()) : name.equals(facilitatingOutcome.getName())))
				continue facilitatingOutcomeLoop;
			return facilitatingOutcome;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QWiki.Spice.Process> getFacilitatedProcess() {
		if (facilitatedProcess == null) {
			facilitatedProcess = new EObjectWithInverseResolvingEList.ManyInverse<QWiki.Spice.Process>(QWiki.Spice.Process.class, this, SPICEPackage.WORK_PRODUCT__FACILITATED_PROCESS, SPICEPackage.PROCESS__FACILITATING_WORK_PRODUCT);
		}
		return facilitatedProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWiki.Spice.Process getFacilitatedProcess(String name) {
		return getFacilitatedProcess(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWiki.Spice.Process getFacilitatedProcess(String name, boolean ignoreCase) {
		facilitatedProcessLoop: for (QWiki.Spice.Process facilitatedProcess : getFacilitatedProcess()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(facilitatedProcess.getName()) : name.equals(facilitatedProcess.getName())))
				continue facilitatedProcessLoop;
			return facilitatedProcess;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QWiki.Spice.Process getFacilitatingProcess() {
		if (facilitatingProcess != null && facilitatingProcess.eIsProxy()) {
			InternalEObject oldFacilitatingProcess = (InternalEObject)facilitatingProcess;
			facilitatingProcess = (QWiki.Spice.Process)eResolveProxy(oldFacilitatingProcess);
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
	public QWiki.Spice.Process basicGetFacilitatingProcess() {
		return facilitatingProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFacilitatingProcess(QWiki.Spice.Process newFacilitatingProcess, NotificationChain msgs) {
		QWiki.Spice.Process oldFacilitatingProcess = facilitatingProcess;
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
	public void setFacilitatingProcess(QWiki.Spice.Process newFacilitatingProcess) {
		if (newFacilitatingProcess != facilitatingProcess) {
			NotificationChain msgs = null;
			if (facilitatingProcess != null)
				msgs = ((InternalEObject)facilitatingProcess).eInverseRemove(this, SPICEPackage.PROCESS__FACILITATED_WORK_PRODUCT, QWiki.Spice.Process.class, msgs);
			if (newFacilitatingProcess != null)
				msgs = ((InternalEObject)newFacilitatingProcess).eInverseAdd(this, SPICEPackage.PROCESS__FACILITATED_WORK_PRODUCT, QWiki.Spice.Process.class, msgs);
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
	public EList<WorkProduct> getContainedWorkProduct() {
		if (containedWorkProduct == null) {
			containedWorkProduct = new EObjectWithInverseResolvingEList<WorkProduct>(WorkProduct.class, this, SPICEPackage.WORK_PRODUCT__CONTAINED_WORK_PRODUCT, SPICEPackage.WORK_PRODUCT__CONTAINING_WORK_PRODUCT);
		}
		return containedWorkProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProduct getContainedWorkProduct(String name) {
		return getContainedWorkProduct(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProduct getContainedWorkProduct(String name, boolean ignoreCase, EClass eClass) {
		containedWorkProductLoop: for (WorkProduct containedWorkProduct : getContainedWorkProduct()) {
			if (eClass != null && !eClass.isInstance(containedWorkProduct))
				continue containedWorkProductLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(containedWorkProduct.getName()) : name.equals(containedWorkProduct.getName())))
				continue containedWorkProductLoop;
			return containedWorkProduct;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkProduct getContainingWorkProduct() {
		if (containingWorkProduct != null && containingWorkProduct.eIsProxy()) {
			InternalEObject oldContainingWorkProduct = (InternalEObject)containingWorkProduct;
			containingWorkProduct = (WorkProduct)eResolveProxy(oldContainingWorkProduct);
			if (containingWorkProduct != oldContainingWorkProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SPICEPackage.WORK_PRODUCT__CONTAINING_WORK_PRODUCT, oldContainingWorkProduct, containingWorkProduct));
			}
		}
		return containingWorkProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProduct basicGetContainingWorkProduct() {
		return containingWorkProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainingWorkProduct(WorkProduct newContainingWorkProduct, NotificationChain msgs) {
		WorkProduct oldContainingWorkProduct = containingWorkProduct;
		containingWorkProduct = newContainingWorkProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPICEPackage.WORK_PRODUCT__CONTAINING_WORK_PRODUCT, oldContainingWorkProduct, newContainingWorkProduct);
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
	public void setContainingWorkProduct(WorkProduct newContainingWorkProduct) {
		if (newContainingWorkProduct != containingWorkProduct) {
			NotificationChain msgs = null;
			if (containingWorkProduct != null)
				msgs = ((InternalEObject)containingWorkProduct).eInverseRemove(this, SPICEPackage.WORK_PRODUCT__CONTAINED_WORK_PRODUCT, WorkProduct.class, msgs);
			if (newContainingWorkProduct != null)
				msgs = ((InternalEObject)newContainingWorkProduct).eInverseAdd(this, SPICEPackage.WORK_PRODUCT__CONTAINED_WORK_PRODUCT, WorkProduct.class, msgs);
			msgs = basicSetContainingWorkProduct(newContainingWorkProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SPICEPackage.WORK_PRODUCT__CONTAINING_WORK_PRODUCT, newContainingWorkProduct, newContainingWorkProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkProductRelationship> getLink() {
		if (link == null) {
			link = new EObjectWithInverseResolvingEList.ManyInverse<WorkProductRelationship>(WorkProductRelationship.class, this, SPICEPackage.WORK_PRODUCT__LINK, SPICEPackage.WORK_PRODUCT_RELATIONSHIP__LINKED_WORK_PRODUCT);
		}
		return link;
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
	 * The cached invocation delegate for the '{@link #oid() <em>Oid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #oid()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate OID__EINVOCATION_DELEGATE = ((EOperation.Internal)SPICEPackage.Literals.WORK_PRODUCT___OID).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
					msgs = ((InternalEObject)facilitatingProcess).eInverseRemove(this, SPICEPackage.PROCESS__FACILITATED_WORK_PRODUCT, QWiki.Spice.Process.class, msgs);
				return basicSetFacilitatingProcess((QWiki.Spice.Process)otherEnd, msgs);
			case SPICEPackage.WORK_PRODUCT__CONTAINED_WORK_PRODUCT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedWorkProduct()).basicAdd(otherEnd, msgs);
			case SPICEPackage.WORK_PRODUCT__CONTAINING_WORK_PRODUCT:
				if (containingWorkProduct != null)
					msgs = ((InternalEObject)containingWorkProduct).eInverseRemove(this, SPICEPackage.WORK_PRODUCT__CONTAINED_WORK_PRODUCT, WorkProduct.class, msgs);
				return basicSetContainingWorkProduct((WorkProduct)otherEnd, msgs);
			case SPICEPackage.WORK_PRODUCT__LINK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLink()).basicAdd(otherEnd, msgs);
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
				return basicSetCharacteristic(null, msgs);
			case SPICEPackage.WORK_PRODUCT__FACILITATING_OUTCOME:
				return ((InternalEList<?>)getFacilitatingOutcome()).basicRemove(otherEnd, msgs);
			case SPICEPackage.WORK_PRODUCT__FACILITATED_PROCESS:
				return ((InternalEList<?>)getFacilitatedProcess()).basicRemove(otherEnd, msgs);
			case SPICEPackage.WORK_PRODUCT__FACILITATING_PROCESS:
				return basicSetFacilitatingProcess(null, msgs);
			case SPICEPackage.WORK_PRODUCT__CONTAINED_WORK_PRODUCT:
				return ((InternalEList<?>)getContainedWorkProduct()).basicRemove(otherEnd, msgs);
			case SPICEPackage.WORK_PRODUCT__CONTAINING_WORK_PRODUCT:
				return basicSetContainingWorkProduct(null, msgs);
			case SPICEPackage.WORK_PRODUCT__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
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
			case SPICEPackage.WORK_PRODUCT__LINKED_WORK_PRODUCT:
				return getLinkedWorkProduct();
			case SPICEPackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP:
				return getOwningWorkProductGroup();
			case SPICEPackage.WORK_PRODUCT__CHARACTERISTIC:
				return getCharacteristic();
			case SPICEPackage.WORK_PRODUCT__FACILITATING_OUTCOME:
				return getFacilitatingOutcome();
			case SPICEPackage.WORK_PRODUCT__FACILITATED_PROCESS:
				return getFacilitatedProcess();
			case SPICEPackage.WORK_PRODUCT__FACILITATING_PROCESS:
				if (resolve) return getFacilitatingProcess();
				return basicGetFacilitatingProcess();
			case SPICEPackage.WORK_PRODUCT__WORK_PRODUCT_TYPE:
				return getWorkProductType();
			case SPICEPackage.WORK_PRODUCT__CONTAINED_WORK_PRODUCT:
				return getContainedWorkProduct();
			case SPICEPackage.WORK_PRODUCT__CONTAINING_WORK_PRODUCT:
				if (resolve) return getContainingWorkProduct();
				return basicGetContainingWorkProduct();
			case SPICEPackage.WORK_PRODUCT__LINK:
				return getLink();
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
				setCharacteristic((I18nString)newValue);
				return;
			case SPICEPackage.WORK_PRODUCT__FACILITATING_OUTCOME:
				getFacilitatingOutcome().clear();
				getFacilitatingOutcome().addAll((Collection<? extends Outcome>)newValue);
				return;
			case SPICEPackage.WORK_PRODUCT__FACILITATED_PROCESS:
				getFacilitatedProcess().clear();
				getFacilitatedProcess().addAll((Collection<? extends QWiki.Spice.Process>)newValue);
				return;
			case SPICEPackage.WORK_PRODUCT__FACILITATING_PROCESS:
				setFacilitatingProcess((QWiki.Spice.Process)newValue);
				return;
			case SPICEPackage.WORK_PRODUCT__WORK_PRODUCT_TYPE:
				setWorkProductType((WorkProductType)newValue);
				return;
			case SPICEPackage.WORK_PRODUCT__CONTAINED_WORK_PRODUCT:
				getContainedWorkProduct().clear();
				getContainedWorkProduct().addAll((Collection<? extends WorkProduct>)newValue);
				return;
			case SPICEPackage.WORK_PRODUCT__CONTAINING_WORK_PRODUCT:
				setContainingWorkProduct((WorkProduct)newValue);
				return;
			case SPICEPackage.WORK_PRODUCT__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends WorkProductRelationship>)newValue);
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
				setCharacteristic((I18nString)null);
				return;
			case SPICEPackage.WORK_PRODUCT__FACILITATING_OUTCOME:
				getFacilitatingOutcome().clear();
				return;
			case SPICEPackage.WORK_PRODUCT__FACILITATED_PROCESS:
				getFacilitatedProcess().clear();
				return;
			case SPICEPackage.WORK_PRODUCT__FACILITATING_PROCESS:
				setFacilitatingProcess((QWiki.Spice.Process)null);
				return;
			case SPICEPackage.WORK_PRODUCT__WORK_PRODUCT_TYPE:
				setWorkProductType(WORK_PRODUCT_TYPE_EDEFAULT);
				return;
			case SPICEPackage.WORK_PRODUCT__CONTAINED_WORK_PRODUCT:
				getContainedWorkProduct().clear();
				return;
			case SPICEPackage.WORK_PRODUCT__CONTAINING_WORK_PRODUCT:
				setContainingWorkProduct((WorkProduct)null);
				return;
			case SPICEPackage.WORK_PRODUCT__LINK:
				getLink().clear();
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
			case SPICEPackage.WORK_PRODUCT__NAMESPACE:
				return isSetNamespace();
			case SPICEPackage.WORK_PRODUCT__LINKED_WORK_PRODUCT:
				return isSetLinkedWorkProduct();
			case SPICEPackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP:
				return getOwningWorkProductGroup() != null;
			case SPICEPackage.WORK_PRODUCT__CHARACTERISTIC:
				return characteristic != null;
			case SPICEPackage.WORK_PRODUCT__FACILITATING_OUTCOME:
				return facilitatingOutcome != null && !facilitatingOutcome.isEmpty();
			case SPICEPackage.WORK_PRODUCT__FACILITATED_PROCESS:
				return facilitatedProcess != null && !facilitatedProcess.isEmpty();
			case SPICEPackage.WORK_PRODUCT__FACILITATING_PROCESS:
				return facilitatingProcess != null;
			case SPICEPackage.WORK_PRODUCT__WORK_PRODUCT_TYPE:
				return workProductType != WORK_PRODUCT_TYPE_EDEFAULT;
			case SPICEPackage.WORK_PRODUCT__CONTAINED_WORK_PRODUCT:
				return containedWorkProduct != null && !containedWorkProduct.isEmpty();
			case SPICEPackage.WORK_PRODUCT__CONTAINING_WORK_PRODUCT:
				return containingWorkProduct != null;
			case SPICEPackage.WORK_PRODUCT__LINK:
				return link != null && !link.isEmpty();
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
	public boolean isSetNamespace() {
		return super.isSetNamespace()
			|| eIsSet(SPICEPackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinkedWorkProduct() {
		return eIsSet(SPICEPackage.WORK_PRODUCT__CONTAINED_WORK_PRODUCT)
			|| eIsSet(SPICEPackage.WORK_PRODUCT__CONTAINING_WORK_PRODUCT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String oidBasic() {
		return oid();
	}

} //WorkProductImpl
