/**
 */
package QWiki.impl;

import QWiki.Element;
import QWiki.GenericWorkProduct;
import QWiki.I18nString;
import QWiki.Outcome;
import QWiki.QWikiPackage;
import QWiki.WorkProduct;
import QWiki.WorkProductType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link QWiki.impl.WorkProductImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link QWiki.impl.WorkProductImpl#getOwningWorkingGroup <em>Owning Working Group</em>}</li>
 *   <li>{@link QWiki.impl.WorkProductImpl#getCharacteristic <em>Characteristic</em>}</li>
 *   <li>{@link QWiki.impl.WorkProductImpl#getContent <em>Content</em>}</li>
 *   <li>{@link QWiki.impl.WorkProductImpl#getFacilitatingOutcome <em>Facilitating Outcome</em>}</li>
 *   <li>{@link QWiki.impl.WorkProductImpl#getFacilitatedProcess <em>Facilitated Process</em>}</li>
 *   <li>{@link QWiki.impl.WorkProductImpl#getFacilitatingProcess <em>Facilitating Process</em>}</li>
 *   <li>{@link QWiki.impl.WorkProductImpl#getWorkProductType <em>Work Product Type</em>}</li>
 *   <li>{@link QWiki.impl.WorkProductImpl#getFacilitatedOutcome <em>Facilitated Outcome</em>}</li>
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
	protected EList<QWiki.Process> facilitatedProcess;

	/**
	 * The cached value of the '{@link #getFacilitatingProcess() <em>Facilitating Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitatingProcess()
	 * @generated
	 * @ordered
	 */
	protected QWiki.Process facilitatingProcess;

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
		return QWikiPackage.Literals.WORK_PRODUCT;
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
		GenericWorkProduct owningWorkingGroup = getOwningWorkingGroup();			
		if (owningWorkingGroup != null) {
			return owningWorkingGroup;
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericWorkProduct getOwningWorkingGroup() {
		if (eContainerFeatureID() != QWikiPackage.WORK_PRODUCT__OWNING_WORKING_GROUP) return null;
		return (GenericWorkProduct)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningWorkingGroup(GenericWorkProduct newOwningWorkingGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningWorkingGroup, QWikiPackage.WORK_PRODUCT__OWNING_WORKING_GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningWorkingGroup(GenericWorkProduct newOwningWorkingGroup) {
		if (newOwningWorkingGroup != eInternalContainer() || (eContainerFeatureID() != QWikiPackage.WORK_PRODUCT__OWNING_WORKING_GROUP && newOwningWorkingGroup != null)) {
			if (EcoreUtil.isAncestor(this, newOwningWorkingGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningWorkingGroup != null)
				msgs = ((InternalEObject)newOwningWorkingGroup).eInverseAdd(this, QWikiPackage.GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT, GenericWorkProduct.class, msgs);
			msgs = basicSetOwningWorkingGroup(newOwningWorkingGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.WORK_PRODUCT__OWNING_WORKING_GROUP, newOwningWorkingGroup, newOwningWorkingGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<I18nString> getCharacteristic() {
		if (characteristic == null) {
			characteristic = new EObjectContainmentEList<I18nString>(I18nString.class, this, QWikiPackage.WORK_PRODUCT__CHARACTERISTIC);
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
			content = new EObjectContainmentEList<I18nString>(I18nString.class, this, QWikiPackage.WORK_PRODUCT__CONTENT);
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
			facilitatingOutcome = new EObjectWithInverseResolvingEList.ManyInverse<Outcome>(Outcome.class, this, QWikiPackage.WORK_PRODUCT__FACILITATING_OUTCOME, QWikiPackage.OUTCOME__RESULTING_WORKPRODUCT);
		}
		return facilitatingOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QWiki.Process> getFacilitatedProcess() {
		if (facilitatedProcess == null) {
			facilitatedProcess = new EObjectWithInverseResolvingEList.ManyInverse<QWiki.Process>(QWiki.Process.class, this, QWikiPackage.WORK_PRODUCT__FACILITATED_PROCESS, QWikiPackage.PROCESS__FACILITATING_WORK_PRODUCT);
		}
		return facilitatedProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QWiki.Process getFacilitatingProcess() {
		if (facilitatingProcess != null && facilitatingProcess.eIsProxy()) {
			InternalEObject oldFacilitatingProcess = (InternalEObject)facilitatingProcess;
			facilitatingProcess = (QWiki.Process)eResolveProxy(oldFacilitatingProcess);
			if (facilitatingProcess != oldFacilitatingProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QWikiPackage.WORK_PRODUCT__FACILITATING_PROCESS, oldFacilitatingProcess, facilitatingProcess));
			}
		}
		return facilitatingProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWiki.Process basicGetFacilitatingProcess() {
		return facilitatingProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFacilitatingProcess(QWiki.Process newFacilitatingProcess, NotificationChain msgs) {
		QWiki.Process oldFacilitatingProcess = facilitatingProcess;
		facilitatingProcess = newFacilitatingProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QWikiPackage.WORK_PRODUCT__FACILITATING_PROCESS, oldFacilitatingProcess, newFacilitatingProcess);
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
	public void setFacilitatingProcess(QWiki.Process newFacilitatingProcess) {
		if (newFacilitatingProcess != facilitatingProcess) {
			NotificationChain msgs = null;
			if (facilitatingProcess != null)
				msgs = ((InternalEObject)facilitatingProcess).eInverseRemove(this, QWikiPackage.PROCESS__FACILITATED_WORK_PRODUCT, QWiki.Process.class, msgs);
			if (newFacilitatingProcess != null)
				msgs = ((InternalEObject)newFacilitatingProcess).eInverseAdd(this, QWikiPackage.PROCESS__FACILITATED_WORK_PRODUCT, QWiki.Process.class, msgs);
			msgs = basicSetFacilitatingProcess(newFacilitatingProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.WORK_PRODUCT__FACILITATING_PROCESS, newFacilitatingProcess, newFacilitatingProcess));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.WORK_PRODUCT__WORK_PRODUCT_TYPE, oldWorkProductType, workProductType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Outcome> getFacilitatedOutcome() {
		if (facilitatedOutcome == null) {
			facilitatedOutcome = new EObjectWithInverseResolvingEList.ManyInverse<Outcome>(Outcome.class, this, QWikiPackage.WORK_PRODUCT__FACILITATED_OUTCOME, QWikiPackage.OUTCOME__REQUIRED_WORKPRODUCT);
		}
		return facilitatedOutcome;
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
			case QWikiPackage.WORK_PRODUCT__OWNING_WORKING_GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningWorkingGroup((GenericWorkProduct)otherEnd, msgs);
			case QWikiPackage.WORK_PRODUCT__FACILITATING_OUTCOME:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFacilitatingOutcome()).basicAdd(otherEnd, msgs);
			case QWikiPackage.WORK_PRODUCT__FACILITATED_PROCESS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFacilitatedProcess()).basicAdd(otherEnd, msgs);
			case QWikiPackage.WORK_PRODUCT__FACILITATING_PROCESS:
				if (facilitatingProcess != null)
					msgs = ((InternalEObject)facilitatingProcess).eInverseRemove(this, QWikiPackage.PROCESS__FACILITATED_WORK_PRODUCT, QWiki.Process.class, msgs);
				return basicSetFacilitatingProcess((QWiki.Process)otherEnd, msgs);
			case QWikiPackage.WORK_PRODUCT__FACILITATED_OUTCOME:
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
			case QWikiPackage.WORK_PRODUCT__OWNING_WORKING_GROUP:
				return basicSetOwningWorkingGroup(null, msgs);
			case QWikiPackage.WORK_PRODUCT__CHARACTERISTIC:
				return ((InternalEList<?>)getCharacteristic()).basicRemove(otherEnd, msgs);
			case QWikiPackage.WORK_PRODUCT__CONTENT:
				return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
			case QWikiPackage.WORK_PRODUCT__FACILITATING_OUTCOME:
				return ((InternalEList<?>)getFacilitatingOutcome()).basicRemove(otherEnd, msgs);
			case QWikiPackage.WORK_PRODUCT__FACILITATED_PROCESS:
				return ((InternalEList<?>)getFacilitatedProcess()).basicRemove(otherEnd, msgs);
			case QWikiPackage.WORK_PRODUCT__FACILITATING_PROCESS:
				return basicSetFacilitatingProcess(null, msgs);
			case QWikiPackage.WORK_PRODUCT__FACILITATED_OUTCOME:
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
			case QWikiPackage.WORK_PRODUCT__OWNING_WORKING_GROUP:
				return eInternalContainer().eInverseRemove(this, QWikiPackage.GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT, GenericWorkProduct.class, msgs);
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
			case QWikiPackage.WORK_PRODUCT__OWNING_WORKING_GROUP:
				return getOwningWorkingGroup();
			case QWikiPackage.WORK_PRODUCT__CHARACTERISTIC:
				return getCharacteristic();
			case QWikiPackage.WORK_PRODUCT__CONTENT:
				return getContent();
			case QWikiPackage.WORK_PRODUCT__FACILITATING_OUTCOME:
				return getFacilitatingOutcome();
			case QWikiPackage.WORK_PRODUCT__FACILITATED_PROCESS:
				return getFacilitatedProcess();
			case QWikiPackage.WORK_PRODUCT__FACILITATING_PROCESS:
				if (resolve) return getFacilitatingProcess();
				return basicGetFacilitatingProcess();
			case QWikiPackage.WORK_PRODUCT__WORK_PRODUCT_TYPE:
				return getWorkProductType();
			case QWikiPackage.WORK_PRODUCT__FACILITATED_OUTCOME:
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
			case QWikiPackage.WORK_PRODUCT__OWNING_WORKING_GROUP:
				setOwningWorkingGroup((GenericWorkProduct)newValue);
				return;
			case QWikiPackage.WORK_PRODUCT__CHARACTERISTIC:
				getCharacteristic().clear();
				getCharacteristic().addAll((Collection<? extends I18nString>)newValue);
				return;
			case QWikiPackage.WORK_PRODUCT__CONTENT:
				getContent().clear();
				getContent().addAll((Collection<? extends I18nString>)newValue);
				return;
			case QWikiPackage.WORK_PRODUCT__FACILITATING_OUTCOME:
				getFacilitatingOutcome().clear();
				getFacilitatingOutcome().addAll((Collection<? extends Outcome>)newValue);
				return;
			case QWikiPackage.WORK_PRODUCT__FACILITATED_PROCESS:
				getFacilitatedProcess().clear();
				getFacilitatedProcess().addAll((Collection<? extends QWiki.Process>)newValue);
				return;
			case QWikiPackage.WORK_PRODUCT__FACILITATING_PROCESS:
				setFacilitatingProcess((QWiki.Process)newValue);
				return;
			case QWikiPackage.WORK_PRODUCT__WORK_PRODUCT_TYPE:
				setWorkProductType((WorkProductType)newValue);
				return;
			case QWikiPackage.WORK_PRODUCT__FACILITATED_OUTCOME:
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
			case QWikiPackage.WORK_PRODUCT__OWNING_WORKING_GROUP:
				setOwningWorkingGroup((GenericWorkProduct)null);
				return;
			case QWikiPackage.WORK_PRODUCT__CHARACTERISTIC:
				getCharacteristic().clear();
				return;
			case QWikiPackage.WORK_PRODUCT__CONTENT:
				getContent().clear();
				return;
			case QWikiPackage.WORK_PRODUCT__FACILITATING_OUTCOME:
				getFacilitatingOutcome().clear();
				return;
			case QWikiPackage.WORK_PRODUCT__FACILITATED_PROCESS:
				getFacilitatedProcess().clear();
				return;
			case QWikiPackage.WORK_PRODUCT__FACILITATING_PROCESS:
				setFacilitatingProcess((QWiki.Process)null);
				return;
			case QWikiPackage.WORK_PRODUCT__WORK_PRODUCT_TYPE:
				setWorkProductType(WORK_PRODUCT_TYPE_EDEFAULT);
				return;
			case QWikiPackage.WORK_PRODUCT__FACILITATED_OUTCOME:
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
			case QWikiPackage.WORK_PRODUCT__OWNER:
				return isSetOwner();
			case QWikiPackage.WORK_PRODUCT__OWNING_WORKING_GROUP:
				return getOwningWorkingGroup() != null;
			case QWikiPackage.WORK_PRODUCT__CHARACTERISTIC:
				return characteristic != null && !characteristic.isEmpty();
			case QWikiPackage.WORK_PRODUCT__CONTENT:
				return content != null && !content.isEmpty();
			case QWikiPackage.WORK_PRODUCT__FACILITATING_OUTCOME:
				return facilitatingOutcome != null && !facilitatingOutcome.isEmpty();
			case QWikiPackage.WORK_PRODUCT__FACILITATED_PROCESS:
				return facilitatedProcess != null && !facilitatedProcess.isEmpty();
			case QWikiPackage.WORK_PRODUCT__FACILITATING_PROCESS:
				return facilitatingProcess != null;
			case QWikiPackage.WORK_PRODUCT__WORK_PRODUCT_TYPE:
				return workProductType != WORK_PRODUCT_TYPE_EDEFAULT;
			case QWikiPackage.WORK_PRODUCT__FACILITATED_OUTCOME:
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
			|| eIsSet(QWikiPackage.WORK_PRODUCT__OWNING_WORKING_GROUP);
	}

} //WorkProductImpl
