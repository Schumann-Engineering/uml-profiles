/**
 */
package QWiki.Spice.impl;

import QWiki.QWikiElement;
import QWiki.QWikiNamedElement;
import QWiki.QWikiNamespace;
import QWiki.QWikiPackage;

import QWiki.Spice.BasePractise;
import QWiki.Spice.Outcome;
import QWiki.Spice.ProcessGroup;
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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Spice.impl.ProcessImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link QWiki.Spice.impl.ProcessImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link QWiki.Spice.impl.ProcessImpl#getOwningProcessGroup <em>Owning Process Group</em>}</li>
 *   <li>{@link QWiki.Spice.impl.ProcessImpl#getOwnedOutcome <em>Owned Outcome</em>}</li>
 *   <li>{@link QWiki.Spice.impl.ProcessImpl#getFacilitatingWorkProduct <em>Facilitating Work Product</em>}</li>
 *   <li>{@link QWiki.Spice.impl.ProcessImpl#getFacilitatedWorkProduct <em>Facilitated Work Product</em>}</li>
 *   <li>{@link QWiki.Spice.impl.ProcessImpl#getOwnedBasePractise <em>Owned Base Practise</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends SpiceElementImpl implements QWiki.Spice.Process {
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
		return SpicePackage.Literals.PROCESS;
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
		ProcessGroup owningProcessGroup = getOwningProcessGroup();			
		if (owningProcessGroup != null) {
			return owningProcessGroup;
		}
		return super.basicGetNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getOwnedMembers() {
		return new DerivedUnionEObjectEList<NamedElement>(NamedElement.class, this, SpicePackage.PROCESS__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[] {SpicePackage.PROCESS__OWNED_RULE, SpicePackage.PROCESS__QWIKI_ELEMENT, SpicePackage.PROCESS__OWNED_OUTCOME, SpicePackage.PROCESS__OWNED_BASE_PRACTISE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessGroup getOwningProcessGroup() {
		if (eContainerFeatureID() != SpicePackage.PROCESS__OWNING_PROCESS_GROUP) return null;
		return (ProcessGroup)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningProcessGroup(ProcessGroup newOwningProcessGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningProcessGroup, SpicePackage.PROCESS__OWNING_PROCESS_GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningProcessGroup(ProcessGroup newOwningProcessGroup) {
		if (newOwningProcessGroup != eInternalContainer() || (eContainerFeatureID() != SpicePackage.PROCESS__OWNING_PROCESS_GROUP && newOwningProcessGroup != null)) {
			if (EcoreUtil.isAncestor(this, newOwningProcessGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningProcessGroup != null)
				msgs = ((InternalEObject)newOwningProcessGroup).eInverseAdd(this, SpicePackage.PROCESS_GROUP__OWNED_PROCESS, ProcessGroup.class, msgs);
			msgs = basicSetOwningProcessGroup(newOwningProcessGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.PROCESS__OWNING_PROCESS_GROUP, newOwningProcessGroup, newOwningProcessGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Outcome> getOwnedOutcome() {
		if (ownedOutcome == null) {
			ownedOutcome = new EObjectContainmentWithInverseEList<Outcome>(Outcome.class, this, SpicePackage.PROCESS__OWNED_OUTCOME, SpicePackage.OUTCOME__OWNING_PROCESS);
		}
		return ownedOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Outcome getOwnedOutcome(String name) {
		return getOwnedOutcome(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Outcome getOwnedOutcome(String name, boolean ignoreCase) {
		ownedOutcomeLoop: for (Outcome ownedOutcome : getOwnedOutcome()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedOutcome.getName()) : name.equals(ownedOutcome.getName())))
				continue ownedOutcomeLoop;
			return ownedOutcome;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkProduct> getFacilitatingWorkProduct() {
		if (facilitatingWorkProduct == null) {
			facilitatingWorkProduct = new EObjectWithInverseEList.ManyInverse<WorkProduct>(WorkProduct.class, this, SpicePackage.PROCESS__FACILITATING_WORK_PRODUCT, SpicePackage.WORK_PRODUCT__FACILITATED_PROCESS);
		}
		return facilitatingWorkProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProduct getFacilitatingWorkProduct(String name) {
		return getFacilitatingWorkProduct(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProduct getFacilitatingWorkProduct(String name, boolean ignoreCase, EClass eClass) {
		facilitatingWorkProductLoop: for (WorkProduct facilitatingWorkProduct : getFacilitatingWorkProduct()) {
			if (eClass != null && !eClass.isInstance(facilitatingWorkProduct))
				continue facilitatingWorkProductLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(facilitatingWorkProduct.getName()) : name.equals(facilitatingWorkProduct.getName())))
				continue facilitatingWorkProductLoop;
			return facilitatingWorkProduct;
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
			facilitatedWorkProduct = new EObjectWithInverseEList.ManyInverse<WorkProduct>(WorkProduct.class, this, SpicePackage.PROCESS__FACILITATED_WORK_PRODUCT, SpicePackage.WORK_PRODUCT__FACILITATING_PROCESS);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BasePractise> getOwnedBasePractise() {
		if (ownedBasePractise == null) {
			ownedBasePractise = new EObjectContainmentWithInverseEList<BasePractise>(BasePractise.class, this, SpicePackage.PROCESS__OWNED_BASE_PRACTISE, SpicePackage.BASE_PRACTISE__OWNING_PROCESS);
		}
		return ownedBasePractise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasePractise getOwnedBasePractise(String name) {
		return getOwnedBasePractise(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasePractise getOwnedBasePractise(String name, boolean ignoreCase) {
		ownedBasePractiseLoop: for (BasePractise ownedBasePractise : getOwnedBasePractise()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedBasePractise.getName()) : name.equals(ownedBasePractise.getName())))
				continue ownedBasePractiseLoop;
			return ownedBasePractise;
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
	protected static final EOperation.Internal.InvocationDelegate OBJECT_ID__EINVOCATION_DELEGATE = ((EOperation.Internal)SpicePackage.Literals.PROCESS___OBJECT_ID).getInvocationDelegate();

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
			case SpicePackage.PROCESS__OWNING_PROCESS_GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningProcessGroup((ProcessGroup)otherEnd, msgs);
			case SpicePackage.PROCESS__OWNED_OUTCOME:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedOutcome()).basicAdd(otherEnd, msgs);
			case SpicePackage.PROCESS__FACILITATING_WORK_PRODUCT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFacilitatingWorkProduct()).basicAdd(otherEnd, msgs);
			case SpicePackage.PROCESS__FACILITATED_WORK_PRODUCT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFacilitatedWorkProduct()).basicAdd(otherEnd, msgs);
			case SpicePackage.PROCESS__OWNED_BASE_PRACTISE:
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
			case SpicePackage.PROCESS__OWNING_PROCESS_GROUP:
				return basicSetOwningProcessGroup(null, msgs);
			case SpicePackage.PROCESS__OWNED_OUTCOME:
				return ((InternalEList<?>)getOwnedOutcome()).basicRemove(otherEnd, msgs);
			case SpicePackage.PROCESS__FACILITATING_WORK_PRODUCT:
				return ((InternalEList<?>)getFacilitatingWorkProduct()).basicRemove(otherEnd, msgs);
			case SpicePackage.PROCESS__FACILITATED_WORK_PRODUCT:
				return ((InternalEList<?>)getFacilitatedWorkProduct()).basicRemove(otherEnd, msgs);
			case SpicePackage.PROCESS__OWNED_BASE_PRACTISE:
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
			case SpicePackage.PROCESS__OWNING_PROCESS_GROUP:
				return eInternalContainer().eInverseRemove(this, SpicePackage.PROCESS_GROUP__OWNED_PROCESS, ProcessGroup.class, msgs);
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
			case SpicePackage.PROCESS__OWNING_PROCESS_GROUP:
				return getOwningProcessGroup();
			case SpicePackage.PROCESS__OWNED_OUTCOME:
				return getOwnedOutcome();
			case SpicePackage.PROCESS__FACILITATING_WORK_PRODUCT:
				return getFacilitatingWorkProduct();
			case SpicePackage.PROCESS__FACILITATED_WORK_PRODUCT:
				return getFacilitatedWorkProduct();
			case SpicePackage.PROCESS__OWNED_BASE_PRACTISE:
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
			case SpicePackage.PROCESS__OWNING_PROCESS_GROUP:
				setOwningProcessGroup((ProcessGroup)newValue);
				return;
			case SpicePackage.PROCESS__OWNED_OUTCOME:
				getOwnedOutcome().clear();
				getOwnedOutcome().addAll((Collection<? extends Outcome>)newValue);
				return;
			case SpicePackage.PROCESS__FACILITATING_WORK_PRODUCT:
				getFacilitatingWorkProduct().clear();
				getFacilitatingWorkProduct().addAll((Collection<? extends WorkProduct>)newValue);
				return;
			case SpicePackage.PROCESS__FACILITATED_WORK_PRODUCT:
				getFacilitatedWorkProduct().clear();
				getFacilitatedWorkProduct().addAll((Collection<? extends WorkProduct>)newValue);
				return;
			case SpicePackage.PROCESS__OWNED_BASE_PRACTISE:
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
			case SpicePackage.PROCESS__OWNING_PROCESS_GROUP:
				setOwningProcessGroup((ProcessGroup)null);
				return;
			case SpicePackage.PROCESS__OWNED_OUTCOME:
				getOwnedOutcome().clear();
				return;
			case SpicePackage.PROCESS__FACILITATING_WORK_PRODUCT:
				getFacilitatingWorkProduct().clear();
				return;
			case SpicePackage.PROCESS__FACILITATED_WORK_PRODUCT:
				getFacilitatedWorkProduct().clear();
				return;
			case SpicePackage.PROCESS__OWNED_BASE_PRACTISE:
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
			case SpicePackage.PROCESS__NAMESPACE:
				return isSetNamespace();
			case SpicePackage.PROCESS__OWNED_MEMBER:
				return isSetOwnedMembers();
			case SpicePackage.PROCESS__OWNING_PROCESS_GROUP:
				return getOwningProcessGroup() != null;
			case SpicePackage.PROCESS__OWNED_OUTCOME:
				return ownedOutcome != null && !ownedOutcome.isEmpty();
			case SpicePackage.PROCESS__FACILITATING_WORK_PRODUCT:
				return facilitatingWorkProduct != null && !facilitatingWorkProduct.isEmpty();
			case SpicePackage.PROCESS__FACILITATED_WORK_PRODUCT:
				return facilitatedWorkProduct != null && !facilitatedWorkProduct.isEmpty();
			case SpicePackage.PROCESS__OWNED_BASE_PRACTISE:
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == QWikiElement.class) {
			switch (baseOperationID) {
				case QWikiPackage.QWIKI_ELEMENT___OBJECT_ID: return SpicePackage.PROCESS___OBJECT_ID;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == QWikiNamedElement.class) {
			switch (baseOperationID) {
				case QWikiPackage.QWIKI_NAMED_ELEMENT___OBJECT_ID: return SpicePackage.PROCESS___OBJECT_ID;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == QWikiNamespace.class) {
			switch (baseOperationID) {
				case QWikiPackage.QWIKI_NAMESPACE___OBJECT_ID: return SpicePackage.PROCESS___OBJECT_ID;
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
			case SpicePackage.PROCESS___OBJECT_ID:
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
			|| eIsSet(SpicePackage.PROCESS__OWNING_PROCESS_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(SpicePackage.PROCESS__OWNED_OUTCOME)
			|| eIsSet(SpicePackage.PROCESS__OWNED_BASE_PRACTISE);
	}

} //ProcessImpl
