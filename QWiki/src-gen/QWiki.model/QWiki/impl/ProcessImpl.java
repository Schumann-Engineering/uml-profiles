/**
 */
package QWiki.impl;

import QWiki.BasePractise;
import QWiki.Element;
import QWiki.Outcome;
import QWiki.ProcessGroup;
import QWiki.QWikiPackage;
import QWiki.WorkProduct;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link QWiki.impl.ProcessImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link QWiki.impl.ProcessImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link QWiki.impl.ProcessImpl#getOwningProcessGroup <em>Owning Process Group</em>}</li>
 *   <li>{@link QWiki.impl.ProcessImpl#getOwnedOutcome <em>Owned Outcome</em>}</li>
 *   <li>{@link QWiki.impl.ProcessImpl#getFacilitatingWorkProduct <em>Facilitating Work Product</em>}</li>
 *   <li>{@link QWiki.impl.ProcessImpl#getFacilitatedWorkProduct <em>Facilitated Work Product</em>}</li>
 *   <li>{@link QWiki.impl.ProcessImpl#getOwnedBasePractise <em>Owned Base Practise</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends SpiceElementImpl implements QWiki.Process {
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
	 * The cached value of the '{@link #getFacilitatedWorkProduct() <em>Facilitated Work Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitatedWorkProduct()
	 * @generated
	 * @ordered
	 */
	protected WorkProduct facilitatedWorkProduct;

	/**
	 * The cached value of the '{@link #getOwnedBasePractise() <em>Owned Base Practise</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBasePractise()
	 * @generated
	 * @ordered
	 */
	protected EList<BasePractise> ownedBasePractise;

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
		return QWikiPackage.Literals.PROCESS;
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
	public EList<Element> getOwnedElement() {
		return new DerivedUnionEObjectEList<Element>(Element.class, this, QWikiPackage.PROCESS__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElement() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {QWikiPackage.PROCESS__OWNED_COMMENT, QWikiPackage.PROCESS__OWNED_OUTCOME, QWikiPackage.PROCESS__OWNED_BASE_PRACTISE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessGroup getOwningProcessGroup() {
		if (eContainerFeatureID() != QWikiPackage.PROCESS__OWNING_PROCESS_GROUP) return null;
		return (ProcessGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningProcessGroup(ProcessGroup newOwningProcessGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningProcessGroup, QWikiPackage.PROCESS__OWNING_PROCESS_GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningProcessGroup(ProcessGroup newOwningProcessGroup) {
		if (newOwningProcessGroup != eInternalContainer() || (eContainerFeatureID() != QWikiPackage.PROCESS__OWNING_PROCESS_GROUP && newOwningProcessGroup != null)) {
			if (EcoreUtil.isAncestor(this, newOwningProcessGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningProcessGroup != null)
				msgs = ((InternalEObject)newOwningProcessGroup).eInverseAdd(this, QWikiPackage.PROCESS_GROUP__ONWED_PROCESS, ProcessGroup.class, msgs);
			msgs = basicSetOwningProcessGroup(newOwningProcessGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.PROCESS__OWNING_PROCESS_GROUP, newOwningProcessGroup, newOwningProcessGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Outcome> getOwnedOutcome() {
		if (ownedOutcome == null) {
			ownedOutcome = new EObjectContainmentWithInverseEList<Outcome>(Outcome.class, this, QWikiPackage.PROCESS__OWNED_OUTCOME, QWikiPackage.OUTCOME__OWNING_PROCESS);
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
			facilitatingWorkProduct = new EObjectWithInverseResolvingEList.ManyInverse<WorkProduct>(WorkProduct.class, this, QWikiPackage.PROCESS__FACILITATING_WORK_PRODUCT, QWikiPackage.WORK_PRODUCT__FACILITATED_PROCESS);
		}
		return facilitatingWorkProduct;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QWikiPackage.PROCESS__FACILITATED_WORK_PRODUCT, oldFacilitatedWorkProduct, facilitatedWorkProduct));
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
	public NotificationChain basicSetFacilitatedWorkProduct(WorkProduct newFacilitatedWorkProduct, NotificationChain msgs) {
		WorkProduct oldFacilitatedWorkProduct = facilitatedWorkProduct;
		facilitatedWorkProduct = newFacilitatedWorkProduct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QWikiPackage.PROCESS__FACILITATED_WORK_PRODUCT, oldFacilitatedWorkProduct, newFacilitatedWorkProduct);
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
	public void setFacilitatedWorkProduct(WorkProduct newFacilitatedWorkProduct) {
		if (newFacilitatedWorkProduct != facilitatedWorkProduct) {
			NotificationChain msgs = null;
			if (facilitatedWorkProduct != null)
				msgs = ((InternalEObject)facilitatedWorkProduct).eInverseRemove(this, QWikiPackage.WORK_PRODUCT__FACILITATING_PROCESS, WorkProduct.class, msgs);
			if (newFacilitatedWorkProduct != null)
				msgs = ((InternalEObject)newFacilitatedWorkProduct).eInverseAdd(this, QWikiPackage.WORK_PRODUCT__FACILITATING_PROCESS, WorkProduct.class, msgs);
			msgs = basicSetFacilitatedWorkProduct(newFacilitatedWorkProduct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.PROCESS__FACILITATED_WORK_PRODUCT, newFacilitatedWorkProduct, newFacilitatedWorkProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BasePractise> getOwnedBasePractise() {
		if (ownedBasePractise == null) {
			ownedBasePractise = new EObjectContainmentWithInverseEList<BasePractise>(BasePractise.class, this, QWikiPackage.PROCESS__OWNED_BASE_PRACTISE, QWikiPackage.BASE_PRACTISE__OWNING_PROCESS);
		}
		return ownedBasePractise;
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
			case QWikiPackage.PROCESS__OWNING_PROCESS_GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningProcessGroup((ProcessGroup)otherEnd, msgs);
			case QWikiPackage.PROCESS__OWNED_OUTCOME:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedOutcome()).basicAdd(otherEnd, msgs);
			case QWikiPackage.PROCESS__FACILITATING_WORK_PRODUCT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFacilitatingWorkProduct()).basicAdd(otherEnd, msgs);
			case QWikiPackage.PROCESS__FACILITATED_WORK_PRODUCT:
				if (facilitatedWorkProduct != null)
					msgs = ((InternalEObject)facilitatedWorkProduct).eInverseRemove(this, QWikiPackage.WORK_PRODUCT__FACILITATING_PROCESS, WorkProduct.class, msgs);
				return basicSetFacilitatedWorkProduct((WorkProduct)otherEnd, msgs);
			case QWikiPackage.PROCESS__OWNED_BASE_PRACTISE:
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
			case QWikiPackage.PROCESS__OWNING_PROCESS_GROUP:
				return basicSetOwningProcessGroup(null, msgs);
			case QWikiPackage.PROCESS__OWNED_OUTCOME:
				return ((InternalEList<?>)getOwnedOutcome()).basicRemove(otherEnd, msgs);
			case QWikiPackage.PROCESS__FACILITATING_WORK_PRODUCT:
				return ((InternalEList<?>)getFacilitatingWorkProduct()).basicRemove(otherEnd, msgs);
			case QWikiPackage.PROCESS__FACILITATED_WORK_PRODUCT:
				return basicSetFacilitatedWorkProduct(null, msgs);
			case QWikiPackage.PROCESS__OWNED_BASE_PRACTISE:
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
			case QWikiPackage.PROCESS__OWNING_PROCESS_GROUP:
				return eInternalContainer().eInverseRemove(this, QWikiPackage.PROCESS_GROUP__ONWED_PROCESS, ProcessGroup.class, msgs);
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
			case QWikiPackage.PROCESS__OWNING_PROCESS_GROUP:
				return getOwningProcessGroup();
			case QWikiPackage.PROCESS__OWNED_OUTCOME:
				return getOwnedOutcome();
			case QWikiPackage.PROCESS__FACILITATING_WORK_PRODUCT:
				return getFacilitatingWorkProduct();
			case QWikiPackage.PROCESS__FACILITATED_WORK_PRODUCT:
				if (resolve) return getFacilitatedWorkProduct();
				return basicGetFacilitatedWorkProduct();
			case QWikiPackage.PROCESS__OWNED_BASE_PRACTISE:
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
			case QWikiPackage.PROCESS__OWNING_PROCESS_GROUP:
				setOwningProcessGroup((ProcessGroup)newValue);
				return;
			case QWikiPackage.PROCESS__OWNED_OUTCOME:
				getOwnedOutcome().clear();
				getOwnedOutcome().addAll((Collection<? extends Outcome>)newValue);
				return;
			case QWikiPackage.PROCESS__FACILITATING_WORK_PRODUCT:
				getFacilitatingWorkProduct().clear();
				getFacilitatingWorkProduct().addAll((Collection<? extends WorkProduct>)newValue);
				return;
			case QWikiPackage.PROCESS__FACILITATED_WORK_PRODUCT:
				setFacilitatedWorkProduct((WorkProduct)newValue);
				return;
			case QWikiPackage.PROCESS__OWNED_BASE_PRACTISE:
				getOwnedBasePractise().clear();
				getOwnedBasePractise().addAll((Collection<? extends BasePractise>)newValue);
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
			case QWikiPackage.PROCESS__OWNING_PROCESS_GROUP:
				setOwningProcessGroup((ProcessGroup)null);
				return;
			case QWikiPackage.PROCESS__OWNED_OUTCOME:
				getOwnedOutcome().clear();
				return;
			case QWikiPackage.PROCESS__FACILITATING_WORK_PRODUCT:
				getFacilitatingWorkProduct().clear();
				return;
			case QWikiPackage.PROCESS__FACILITATED_WORK_PRODUCT:
				setFacilitatedWorkProduct((WorkProduct)null);
				return;
			case QWikiPackage.PROCESS__OWNED_BASE_PRACTISE:
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
			case QWikiPackage.PROCESS__OWNER:
				return isSetOwner();
			case QWikiPackage.PROCESS__OWNED_ELEMENT:
				return isSetOwnedElement();
			case QWikiPackage.PROCESS__OWNING_PROCESS_GROUP:
				return getOwningProcessGroup() != null;
			case QWikiPackage.PROCESS__OWNED_OUTCOME:
				return ownedOutcome != null && !ownedOutcome.isEmpty();
			case QWikiPackage.PROCESS__FACILITATING_WORK_PRODUCT:
				return facilitatingWorkProduct != null && !facilitatingWorkProduct.isEmpty();
			case QWikiPackage.PROCESS__FACILITATED_WORK_PRODUCT:
				return facilitatedWorkProduct != null;
			case QWikiPackage.PROCESS__OWNED_BASE_PRACTISE:
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
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(QWikiPackage.PROCESS__OWNING_PROCESS_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElement() {
		return super.isSetOwnedElement()
			|| eIsSet(QWikiPackage.PROCESS__OWNED_OUTCOME)
			|| eIsSet(QWikiPackage.PROCESS__OWNED_BASE_PRACTISE);
	}

} //ProcessImpl
