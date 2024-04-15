/**
 */
package QWiki.Spice.impl;

import QWiki.L10nString;
import QWiki.QWikiElement;
import QWiki.QWikiNamedElement;
import QWiki.QWikiNamespace;
import QWiki.QWikiPackage;

import QWiki.Spice.GenericWorkProduct;
import QWiki.Spice.Outcome;
import QWiki.Spice.SpicePackage;
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

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
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
	 * The cached value of the '{@link #getCharacteristic() <em>Characteristic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected L10nString characteristic;

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
	 * The cached value of the '{@link #getFacilitatingProcess() <em>Facilitating Process</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitatingProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<QWiki.Spice.Process> facilitatingProcess;

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
		return SpicePackage.Literals.WORK_PRODUCT;
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
		return new DerivedUnionEObjectEList<WorkProduct>(WorkProduct.class, this, SpicePackage.WORK_PRODUCT__LINKED_WORK_PRODUCT, LINKED_WORK_PRODUCT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getLinkedWorkProduct() <em>Linked Work Product</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedWorkProduct()
	 * @generated
	 * @ordered
	 */
	protected static final int[] LINKED_WORK_PRODUCT_ESUBSETS = new int[] {SpicePackage.WORK_PRODUCT__CONTAINED_WORK_PRODUCT, SpicePackage.WORK_PRODUCT__CONTAINING_WORK_PRODUCT};

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
		if (eContainerFeatureID() != SpicePackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP) return null;
		return (GenericWorkProduct)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningWorkProductGroup(GenericWorkProduct newOwningWorkProductGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningWorkProductGroup, SpicePackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningWorkProductGroup(GenericWorkProduct newOwningWorkProductGroup) {
		if (newOwningWorkProductGroup != eInternalContainer() || (eContainerFeatureID() != SpicePackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP && newOwningWorkProductGroup != null)) {
			if (EcoreUtil.isAncestor(this, newOwningWorkProductGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningWorkProductGroup != null)
				msgs = ((InternalEObject)newOwningWorkProductGroup).eInverseAdd(this, SpicePackage.GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT, GenericWorkProduct.class, msgs);
			msgs = basicSetOwningWorkProductGroup(newOwningWorkProductGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP, newOwningWorkProductGroup, newOwningWorkProductGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public L10nString getCharacteristic() {
		if (characteristic != null && characteristic.eIsProxy()) {
			InternalEObject oldCharacteristic = (InternalEObject)characteristic;
			characteristic = (L10nString)eResolveProxy(oldCharacteristic);
			if (characteristic != oldCharacteristic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SpicePackage.WORK_PRODUCT__CHARACTERISTIC, oldCharacteristic, characteristic));
			}
		}
		return characteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public L10nString basicGetCharacteristic() {
		return characteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharacteristic(L10nString newCharacteristic) {
		L10nString oldCharacteristic = characteristic;
		characteristic = newCharacteristic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.WORK_PRODUCT__CHARACTERISTIC, oldCharacteristic, characteristic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Outcome> getFacilitatingOutcome() {
		if (facilitatingOutcome == null) {
			facilitatingOutcome = new EObjectWithInverseEList.ManyInverse<Outcome>(Outcome.class, this, SpicePackage.WORK_PRODUCT__FACILITATING_OUTCOME, SpicePackage.OUTCOME__RESULTING_WORKPRODUCT);
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
			facilitatedProcess = new EObjectWithInverseEList.ManyInverse<QWiki.Spice.Process>(QWiki.Spice.Process.class, this, SpicePackage.WORK_PRODUCT__FACILITATED_PROCESS, SpicePackage.PROCESS__FACILITATING_WORK_PRODUCT);
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
	public EList<QWiki.Spice.Process> getFacilitatingProcess() {
		if (facilitatingProcess == null) {
			facilitatingProcess = new EObjectWithInverseEList.ManyInverse<QWiki.Spice.Process>(QWiki.Spice.Process.class, this, SpicePackage.WORK_PRODUCT__FACILITATING_PROCESS, SpicePackage.PROCESS__FACILITATED_WORK_PRODUCT);
		}
		return facilitatingProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWiki.Spice.Process getFacilitatingProcess(String name) {
		return getFacilitatingProcess(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWiki.Spice.Process getFacilitatingProcess(String name, boolean ignoreCase) {
		facilitatingProcessLoop: for (QWiki.Spice.Process facilitatingProcess : getFacilitatingProcess()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(facilitatingProcess.getName()) : name.equals(facilitatingProcess.getName())))
				continue facilitatingProcessLoop;
			return facilitatingProcess;
		}
		return null;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.WORK_PRODUCT__WORK_PRODUCT_TYPE, oldWorkProductType, workProductType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkProduct> getContainedWorkProduct() {
		if (containedWorkProduct == null) {
			containedWorkProduct = new EObjectWithInverseEList<WorkProduct>(WorkProduct.class, this, SpicePackage.WORK_PRODUCT__CONTAINED_WORK_PRODUCT, SpicePackage.WORK_PRODUCT__CONTAINING_WORK_PRODUCT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpicePackage.WORK_PRODUCT__CONTAINING_WORK_PRODUCT, oldContainingWorkProduct, newContainingWorkProduct);
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
				msgs = ((InternalEObject)containingWorkProduct).eInverseRemove(this, SpicePackage.WORK_PRODUCT__CONTAINED_WORK_PRODUCT, WorkProduct.class, msgs);
			if (newContainingWorkProduct != null)
				msgs = ((InternalEObject)newContainingWorkProduct).eInverseAdd(this, SpicePackage.WORK_PRODUCT__CONTAINED_WORK_PRODUCT, WorkProduct.class, msgs);
			msgs = basicSetContainingWorkProduct(newContainingWorkProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.WORK_PRODUCT__CONTAINING_WORK_PRODUCT, newContainingWorkProduct, newContainingWorkProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkProductRelationship> getLink() {
		if (link == null) {
			link = new EObjectWithInverseEList.ManyInverse<WorkProductRelationship>(WorkProductRelationship.class, this, SpicePackage.WORK_PRODUCT__LINK, SpicePackage.WORK_PRODUCT_RELATIONSHIP__LINKED_WORK_PRODUCT);
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
			facilitatedOutcome = new EObjectWithInverseEList.ManyInverse<Outcome>(Outcome.class, this, SpicePackage.WORK_PRODUCT__FACILITATED_OUTCOME, SpicePackage.OUTCOME__REQUIRED_WORKPRODUCT);
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
	 * The cached invocation delegate for the '{@link #objectId() <em>Object Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #objectId()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate OBJECT_ID__EINVOCATION_DELEGATE = ((EOperation.Internal)SpicePackage.Literals.WORK_PRODUCT___OBJECT_ID).getInvocationDelegate();

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
			case SpicePackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningWorkProductGroup((GenericWorkProduct)otherEnd, msgs);
			case SpicePackage.WORK_PRODUCT__FACILITATING_OUTCOME:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFacilitatingOutcome()).basicAdd(otherEnd, msgs);
			case SpicePackage.WORK_PRODUCT__FACILITATED_PROCESS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFacilitatedProcess()).basicAdd(otherEnd, msgs);
			case SpicePackage.WORK_PRODUCT__FACILITATING_PROCESS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFacilitatingProcess()).basicAdd(otherEnd, msgs);
			case SpicePackage.WORK_PRODUCT__CONTAINED_WORK_PRODUCT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainedWorkProduct()).basicAdd(otherEnd, msgs);
			case SpicePackage.WORK_PRODUCT__CONTAINING_WORK_PRODUCT:
				if (containingWorkProduct != null)
					msgs = ((InternalEObject)containingWorkProduct).eInverseRemove(this, SpicePackage.WORK_PRODUCT__CONTAINED_WORK_PRODUCT, WorkProduct.class, msgs);
				return basicSetContainingWorkProduct((WorkProduct)otherEnd, msgs);
			case SpicePackage.WORK_PRODUCT__LINK:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLink()).basicAdd(otherEnd, msgs);
			case SpicePackage.WORK_PRODUCT__FACILITATED_OUTCOME:
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
			case SpicePackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP:
				return basicSetOwningWorkProductGroup(null, msgs);
			case SpicePackage.WORK_PRODUCT__FACILITATING_OUTCOME:
				return ((InternalEList<?>)getFacilitatingOutcome()).basicRemove(otherEnd, msgs);
			case SpicePackage.WORK_PRODUCT__FACILITATED_PROCESS:
				return ((InternalEList<?>)getFacilitatedProcess()).basicRemove(otherEnd, msgs);
			case SpicePackage.WORK_PRODUCT__FACILITATING_PROCESS:
				return ((InternalEList<?>)getFacilitatingProcess()).basicRemove(otherEnd, msgs);
			case SpicePackage.WORK_PRODUCT__CONTAINED_WORK_PRODUCT:
				return ((InternalEList<?>)getContainedWorkProduct()).basicRemove(otherEnd, msgs);
			case SpicePackage.WORK_PRODUCT__CONTAINING_WORK_PRODUCT:
				return basicSetContainingWorkProduct(null, msgs);
			case SpicePackage.WORK_PRODUCT__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case SpicePackage.WORK_PRODUCT__FACILITATED_OUTCOME:
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
			case SpicePackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP:
				return eInternalContainer().eInverseRemove(this, SpicePackage.GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT, GenericWorkProduct.class, msgs);
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
			case SpicePackage.WORK_PRODUCT__LINKED_WORK_PRODUCT:
				return getLinkedWorkProduct();
			case SpicePackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP:
				return getOwningWorkProductGroup();
			case SpicePackage.WORK_PRODUCT__CHARACTERISTIC:
				if (resolve) return getCharacteristic();
				return basicGetCharacteristic();
			case SpicePackage.WORK_PRODUCT__FACILITATING_OUTCOME:
				return getFacilitatingOutcome();
			case SpicePackage.WORK_PRODUCT__FACILITATED_PROCESS:
				return getFacilitatedProcess();
			case SpicePackage.WORK_PRODUCT__FACILITATING_PROCESS:
				return getFacilitatingProcess();
			case SpicePackage.WORK_PRODUCT__WORK_PRODUCT_TYPE:
				return getWorkProductType();
			case SpicePackage.WORK_PRODUCT__CONTAINED_WORK_PRODUCT:
				return getContainedWorkProduct();
			case SpicePackage.WORK_PRODUCT__CONTAINING_WORK_PRODUCT:
				return getContainingWorkProduct();
			case SpicePackage.WORK_PRODUCT__LINK:
				return getLink();
			case SpicePackage.WORK_PRODUCT__FACILITATED_OUTCOME:
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
			case SpicePackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP:
				setOwningWorkProductGroup((GenericWorkProduct)newValue);
				return;
			case SpicePackage.WORK_PRODUCT__CHARACTERISTIC:
				setCharacteristic((L10nString)newValue);
				return;
			case SpicePackage.WORK_PRODUCT__FACILITATING_OUTCOME:
				getFacilitatingOutcome().clear();
				getFacilitatingOutcome().addAll((Collection<? extends Outcome>)newValue);
				return;
			case SpicePackage.WORK_PRODUCT__FACILITATED_PROCESS:
				getFacilitatedProcess().clear();
				getFacilitatedProcess().addAll((Collection<? extends QWiki.Spice.Process>)newValue);
				return;
			case SpicePackage.WORK_PRODUCT__FACILITATING_PROCESS:
				getFacilitatingProcess().clear();
				getFacilitatingProcess().addAll((Collection<? extends QWiki.Spice.Process>)newValue);
				return;
			case SpicePackage.WORK_PRODUCT__WORK_PRODUCT_TYPE:
				setWorkProductType((WorkProductType)newValue);
				return;
			case SpicePackage.WORK_PRODUCT__CONTAINED_WORK_PRODUCT:
				getContainedWorkProduct().clear();
				getContainedWorkProduct().addAll((Collection<? extends WorkProduct>)newValue);
				return;
			case SpicePackage.WORK_PRODUCT__CONTAINING_WORK_PRODUCT:
				setContainingWorkProduct((WorkProduct)newValue);
				return;
			case SpicePackage.WORK_PRODUCT__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends WorkProductRelationship>)newValue);
				return;
			case SpicePackage.WORK_PRODUCT__FACILITATED_OUTCOME:
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
			case SpicePackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP:
				setOwningWorkProductGroup((GenericWorkProduct)null);
				return;
			case SpicePackage.WORK_PRODUCT__CHARACTERISTIC:
				setCharacteristic((L10nString)null);
				return;
			case SpicePackage.WORK_PRODUCT__FACILITATING_OUTCOME:
				getFacilitatingOutcome().clear();
				return;
			case SpicePackage.WORK_PRODUCT__FACILITATED_PROCESS:
				getFacilitatedProcess().clear();
				return;
			case SpicePackage.WORK_PRODUCT__FACILITATING_PROCESS:
				getFacilitatingProcess().clear();
				return;
			case SpicePackage.WORK_PRODUCT__WORK_PRODUCT_TYPE:
				setWorkProductType(WORK_PRODUCT_TYPE_EDEFAULT);
				return;
			case SpicePackage.WORK_PRODUCT__CONTAINED_WORK_PRODUCT:
				getContainedWorkProduct().clear();
				return;
			case SpicePackage.WORK_PRODUCT__CONTAINING_WORK_PRODUCT:
				setContainingWorkProduct((WorkProduct)null);
				return;
			case SpicePackage.WORK_PRODUCT__LINK:
				getLink().clear();
				return;
			case SpicePackage.WORK_PRODUCT__FACILITATED_OUTCOME:
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
			case SpicePackage.WORK_PRODUCT__NAMESPACE:
				return isSetNamespace();
			case SpicePackage.WORK_PRODUCT__LINKED_WORK_PRODUCT:
				return isSetLinkedWorkProduct();
			case SpicePackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP:
				return getOwningWorkProductGroup() != null;
			case SpicePackage.WORK_PRODUCT__CHARACTERISTIC:
				return characteristic != null;
			case SpicePackage.WORK_PRODUCT__FACILITATING_OUTCOME:
				return facilitatingOutcome != null && !facilitatingOutcome.isEmpty();
			case SpicePackage.WORK_PRODUCT__FACILITATED_PROCESS:
				return facilitatedProcess != null && !facilitatedProcess.isEmpty();
			case SpicePackage.WORK_PRODUCT__FACILITATING_PROCESS:
				return facilitatingProcess != null && !facilitatingProcess.isEmpty();
			case SpicePackage.WORK_PRODUCT__WORK_PRODUCT_TYPE:
				return workProductType != WORK_PRODUCT_TYPE_EDEFAULT;
			case SpicePackage.WORK_PRODUCT__CONTAINED_WORK_PRODUCT:
				return containedWorkProduct != null && !containedWorkProduct.isEmpty();
			case SpicePackage.WORK_PRODUCT__CONTAINING_WORK_PRODUCT:
				return containingWorkProduct != null;
			case SpicePackage.WORK_PRODUCT__LINK:
				return link != null && !link.isEmpty();
			case SpicePackage.WORK_PRODUCT__FACILITATED_OUTCOME:
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == QWikiElement.class) {
			switch (baseOperationID) {
				case QWikiPackage.QWIKI_ELEMENT___OBJECT_ID: return SpicePackage.WORK_PRODUCT___OBJECT_ID;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == QWikiNamedElement.class) {
			switch (baseOperationID) {
				case QWikiPackage.QWIKI_NAMED_ELEMENT___OBJECT_ID: return SpicePackage.WORK_PRODUCT___OBJECT_ID;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == QWikiNamespace.class) {
			switch (baseOperationID) {
				case QWikiPackage.QWIKI_NAMESPACE___OBJECT_ID: return SpicePackage.WORK_PRODUCT___OBJECT_ID;
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
			case SpicePackage.WORK_PRODUCT___OBJECT_ID:
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
			|| eIsSet(SpicePackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLinkedWorkProduct() {
		return eIsSet(SpicePackage.WORK_PRODUCT__CONTAINED_WORK_PRODUCT)
			|| eIsSet(SpicePackage.WORK_PRODUCT__CONTAINING_WORK_PRODUCT);
	}

} //WorkProductImpl
