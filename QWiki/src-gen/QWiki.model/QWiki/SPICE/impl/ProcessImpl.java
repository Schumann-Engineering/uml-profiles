/**
 */
package QWiki.SPICE.impl;

import QWiki.Infrastructure.UmlElement;

import QWiki.Kernel.KernelPackage;

import QWiki.SPICE.Outcome;
import QWiki.SPICE.ProcessGroup;
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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.SPICE.impl.ProcessImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link QWiki.SPICE.impl.ProcessImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link QWiki.SPICE.impl.ProcessImpl#getOwningProcessGroup <em>Owning Process Group</em>}</li>
 *   <li>{@link QWiki.SPICE.impl.ProcessImpl#getOwnedOutcome <em>Owned Outcome</em>}</li>
 *   <li>{@link QWiki.SPICE.impl.ProcessImpl#getFacilitatingWorkProduct <em>Facilitating Work Product</em>}</li>
 *   <li>{@link QWiki.SPICE.impl.ProcessImpl#getFacilitatedWorkProduct <em>Facilitated Work Product</em>}</li>
 *   <li>{@link QWiki.SPICE.impl.ProcessImpl#getOwnedBasePractise <em>Owned Base Practise</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends SpiceElementImpl implements QWiki.SPICE.Process {
	/**
	 * The cached value of the '{@link #getOwnedOutcome() <em>Owned Outcome</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOutcome()
	 * @generated
	 * @ordered
	 */
	protected EList<Outcome> ownedOutcome;

	/**
	 * The cached value of the '{@link #getFacilitatingWorkProduct() <em>Facilitating Work Product</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitatingWorkProduct()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProduct> facilitatingWorkProduct;

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
	 * The cached value of the '{@link #getOwnedBasePractise() <em>Owned Base Practise</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBasePractise()
	 * @generated
	 * @ordered
	 */
	protected EList<SpiceBasePractise> ownedBasePractise;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SPICEPackage.Literals.PROCESS;
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
		ProcessGroup owningProcessGroup = getOwningProcessGroup();			
		if (owningProcessGroup != null) {
			return owningProcessGroup;
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UmlElement> getOwnedElement() {
		return new DerivedUnionEObjectEList<UmlElement>(UmlElement.class, this, SPICEPackage.PROCESS__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElement() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {SPICEPackage.PROCESS__OWNED_COMMENT, SPICEPackage.PROCESS__OWNED_OUTCOME, SPICEPackage.PROCESS__OWNED_BASE_PRACTISE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessGroup getOwningProcessGroup() {
		if (eContainerFeatureID() != SPICEPackage.PROCESS__OWNING_PROCESS_GROUP) return null;
		return (ProcessGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningProcessGroup(ProcessGroup newOwningProcessGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningProcessGroup, SPICEPackage.PROCESS__OWNING_PROCESS_GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningProcessGroup(ProcessGroup newOwningProcessGroup) {
		if (newOwningProcessGroup != eInternalContainer() || (eContainerFeatureID() != SPICEPackage.PROCESS__OWNING_PROCESS_GROUP && newOwningProcessGroup != null)) {
			if (EcoreUtil.isAncestor(this, newOwningProcessGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningProcessGroup != null)
				msgs = ((InternalEObject)newOwningProcessGroup).eInverseAdd(this, SPICEPackage.PROCESS_GROUP__OWNED_PROCESS, ProcessGroup.class, msgs);
			msgs = basicSetOwningProcessGroup(newOwningProcessGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SPICEPackage.PROCESS__OWNING_PROCESS_GROUP, newOwningProcessGroup, newOwningProcessGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Outcome> getOwnedOutcome() {
		if (ownedOutcome == null) {
			ownedOutcome = new EObjectContainmentWithInverseEList<Outcome>(Outcome.class, this, SPICEPackage.PROCESS__OWNED_OUTCOME, SPICEPackage.OUTCOME__OWNING_PROCESS);
		}
		return ownedOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkProduct> getFacilitatingWorkProduct() {
		if (facilitatingWorkProduct == null) {
			facilitatingWorkProduct = new EObjectWithInverseResolvingEList.ManyInverse<WorkProduct>(WorkProduct.class, this, SPICEPackage.PROCESS__FACILITATING_WORK_PRODUCT, SPICEPackage.WORK_PRODUCT__FACILITATED_PROCESS);
		}
		return facilitatingWorkProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkProduct> getFacilitatedWorkProduct() {
		if (facilitatedWorkProduct == null) {
			facilitatedWorkProduct = new EObjectWithInverseResolvingEList<WorkProduct>(WorkProduct.class, this, SPICEPackage.PROCESS__FACILITATED_WORK_PRODUCT, SPICEPackage.WORK_PRODUCT__FACILITATING_PROCESS);
		}
		return facilitatedWorkProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpiceBasePractise> getOwnedBasePractise() {
		if (ownedBasePractise == null) {
			ownedBasePractise = new EObjectContainmentWithInverseEList<SpiceBasePractise>(SpiceBasePractise.class, this, SPICEPackage.PROCESS__OWNED_BASE_PRACTISE, SPICEPackage.SPICE_BASE_PRACTISE__OWNING_PROCESS);
		}
		return ownedBasePractise;
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
			case SPICEPackage.PROCESS__OWNING_PROCESS_GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningProcessGroup((ProcessGroup)otherEnd, msgs);
			case SPICEPackage.PROCESS__OWNED_OUTCOME:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedOutcome()).basicAdd(otherEnd, msgs);
			case SPICEPackage.PROCESS__FACILITATING_WORK_PRODUCT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFacilitatingWorkProduct()).basicAdd(otherEnd, msgs);
			case SPICEPackage.PROCESS__FACILITATED_WORK_PRODUCT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFacilitatedWorkProduct()).basicAdd(otherEnd, msgs);
			case SPICEPackage.PROCESS__OWNED_BASE_PRACTISE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedBasePractise()).basicAdd(otherEnd, msgs);
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
			case SPICEPackage.PROCESS__OWNING_PROCESS_GROUP:
				return basicSetOwningProcessGroup(null, msgs);
			case SPICEPackage.PROCESS__OWNED_OUTCOME:
				return ((InternalEList<?>)getOwnedOutcome()).basicRemove(otherEnd, msgs);
			case SPICEPackage.PROCESS__FACILITATING_WORK_PRODUCT:
				return ((InternalEList<?>)getFacilitatingWorkProduct()).basicRemove(otherEnd, msgs);
			case SPICEPackage.PROCESS__FACILITATED_WORK_PRODUCT:
				return ((InternalEList<?>)getFacilitatedWorkProduct()).basicRemove(otherEnd, msgs);
			case SPICEPackage.PROCESS__OWNED_BASE_PRACTISE:
				return ((InternalEList<?>)getOwnedBasePractise()).basicRemove(otherEnd, msgs);
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
			case SPICEPackage.PROCESS__OWNING_PROCESS_GROUP:
				return eInternalContainer().eInverseRemove(this, SPICEPackage.PROCESS_GROUP__OWNED_PROCESS, ProcessGroup.class, msgs);
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
			case SPICEPackage.PROCESS__OWNING_PROCESS_GROUP:
				return getOwningProcessGroup();
			case SPICEPackage.PROCESS__OWNED_OUTCOME:
				return getOwnedOutcome();
			case SPICEPackage.PROCESS__FACILITATING_WORK_PRODUCT:
				return getFacilitatingWorkProduct();
			case SPICEPackage.PROCESS__FACILITATED_WORK_PRODUCT:
				return getFacilitatedWorkProduct();
			case SPICEPackage.PROCESS__OWNED_BASE_PRACTISE:
				return getOwnedBasePractise();
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
			case SPICEPackage.PROCESS__OWNING_PROCESS_GROUP:
				setOwningProcessGroup((ProcessGroup)newValue);
				return;
			case SPICEPackage.PROCESS__OWNED_OUTCOME:
				getOwnedOutcome().clear();
				getOwnedOutcome().addAll((Collection<? extends Outcome>)newValue);
				return;
			case SPICEPackage.PROCESS__FACILITATING_WORK_PRODUCT:
				getFacilitatingWorkProduct().clear();
				getFacilitatingWorkProduct().addAll((Collection<? extends WorkProduct>)newValue);
				return;
			case SPICEPackage.PROCESS__FACILITATED_WORK_PRODUCT:
				getFacilitatedWorkProduct().clear();
				getFacilitatedWorkProduct().addAll((Collection<? extends WorkProduct>)newValue);
				return;
			case SPICEPackage.PROCESS__OWNED_BASE_PRACTISE:
				getOwnedBasePractise().clear();
				getOwnedBasePractise().addAll((Collection<? extends SpiceBasePractise>)newValue);
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
			case SPICEPackage.PROCESS__OWNING_PROCESS_GROUP:
				setOwningProcessGroup((ProcessGroup)null);
				return;
			case SPICEPackage.PROCESS__OWNED_OUTCOME:
				getOwnedOutcome().clear();
				return;
			case SPICEPackage.PROCESS__FACILITATING_WORK_PRODUCT:
				getFacilitatingWorkProduct().clear();
				return;
			case SPICEPackage.PROCESS__FACILITATED_WORK_PRODUCT:
				getFacilitatedWorkProduct().clear();
				return;
			case SPICEPackage.PROCESS__OWNED_BASE_PRACTISE:
				getOwnedBasePractise().clear();
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
			case SPICEPackage.PROCESS__OWNER:
				return isSetOwner();
			case SPICEPackage.PROCESS__OWNED_ELEMENT:
				return isSetOwnedElement();
			case SPICEPackage.PROCESS__OWNING_PROCESS_GROUP:
				return getOwningProcessGroup() != null;
			case SPICEPackage.PROCESS__OWNED_OUTCOME:
				return ownedOutcome != null && !ownedOutcome.isEmpty();
			case SPICEPackage.PROCESS__FACILITATING_WORK_PRODUCT:
				return facilitatingWorkProduct != null && !facilitatingWorkProduct.isEmpty();
			case SPICEPackage.PROCESS__FACILITATED_WORK_PRODUCT:
				return facilitatedWorkProduct != null && !facilitatedWorkProduct.isEmpty();
			case SPICEPackage.PROCESS__OWNED_BASE_PRACTISE:
				return ownedBasePractise != null && !ownedBasePractise.isEmpty();
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
			case SPICEPackage.PROCESS___OID:
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
			|| eIsSet(SPICEPackage.PROCESS__OWNING_PROCESS_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElement() {
		return super.isSetOwnedElement()
			|| eIsSet(SPICEPackage.PROCESS__OWNED_OUTCOME)
			|| eIsSet(SPICEPackage.PROCESS__OWNED_BASE_PRACTISE);
	}

} //ProcessImpl
