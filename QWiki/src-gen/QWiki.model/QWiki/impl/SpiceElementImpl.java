/**
 */
package QWiki.impl;

import QWiki.Element;
import QWiki.ProcessReferenceModel;
import QWiki.QWikiPackage;
import QWiki.Role;
import QWiki.Section;
import QWiki.SpiceElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spice Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.impl.SpiceElementImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link QWiki.impl.SpiceElementImpl#getRole <em>Role</em>}</li>
 *   <li>{@link QWiki.impl.SpiceElementImpl#getOwningProcessReferenceModel <em>Owning Process Reference Model</em>}</li>
 *   <li>{@link QWiki.impl.SpiceElementImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link QWiki.impl.SpiceElementImpl#getOwningRole <em>Owning Role</em>}</li>
 *   <li>{@link QWiki.impl.SpiceElementImpl#getManagingRole <em>Managing Role</em>}</li>
 *   <li>{@link QWiki.impl.SpiceElementImpl#getParticipatingRole <em>Participating Role</em>}</li>
 *   <li>{@link QWiki.impl.SpiceElementImpl#getFacilitatedSection <em>Facilitated Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SpiceElementImpl extends RasciElementImpl implements SpiceElement {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected String number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwningRole() <em>Owning Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningRole()
	 * @generated
	 * @ordered
	 */
	protected Role owningRole;

	/**
	 * The cached value of the '{@link #getManagingRole() <em>Managing Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagingRole()
	 * @generated
	 * @ordered
	 */
	protected Role managingRole;

	/**
	 * The cached value of the '{@link #getParticipatingRole() <em>Participating Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipatingRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> participatingRole;

	/**
	 * The cached value of the '{@link #getFacilitatedSection() <em>Facilitated Section</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitatedSection()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> facilitatedSection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpiceElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QWikiPackage.Literals.SPICE_ELEMENT;
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
		ProcessReferenceModel owningProcessReferenceModel = getOwningProcessReferenceModel();			
		if (owningProcessReferenceModel != null) {
			return owningProcessReferenceModel;
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getRole() {
		return new DerivedUnionEObjectEList<Role>(Role.class, this, QWikiPackage.SPICE_ELEMENT__ROLE, ROLE_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRole() <em>Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final int[] ROLE_ESUBSETS = new int[] {QWikiPackage.SPICE_ELEMENT__OWNING_ROLE, QWikiPackage.SPICE_ELEMENT__MANAGING_ROLE, QWikiPackage.SPICE_ELEMENT__PARTICIPATING_ROLE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessReferenceModel getOwningProcessReferenceModel() {
		if (eContainerFeatureID() != QWikiPackage.SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL) return null;
		return (ProcessReferenceModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningProcessReferenceModel(ProcessReferenceModel newOwningProcessReferenceModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningProcessReferenceModel, QWikiPackage.SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningProcessReferenceModel(ProcessReferenceModel newOwningProcessReferenceModel) {
		if (newOwningProcessReferenceModel != eInternalContainer() || (eContainerFeatureID() != QWikiPackage.SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL && newOwningProcessReferenceModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwningProcessReferenceModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningProcessReferenceModel != null)
				msgs = ((InternalEObject)newOwningProcessReferenceModel).eInverseAdd(this, QWikiPackage.PROCESS_REFERENCE_MODEL__OWNED_SPICE_ELEMENT, ProcessReferenceModel.class, msgs);
			msgs = basicSetOwningProcessReferenceModel(newOwningProcessReferenceModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL, newOwningProcessReferenceModel, newOwningProcessReferenceModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumber(String newNumber) {
		String oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.SPICE_ELEMENT__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role getOwningRole() {
		if (owningRole != null && owningRole.eIsProxy()) {
			InternalEObject oldOwningRole = (InternalEObject)owningRole;
			owningRole = (Role)eResolveProxy(oldOwningRole);
			if (owningRole != oldOwningRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QWikiPackage.SPICE_ELEMENT__OWNING_ROLE, oldOwningRole, owningRole));
			}
		}
		return owningRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetOwningRole() {
		return owningRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRole(Role newOwningRole) {
		Role oldOwningRole = owningRole;
		owningRole = newOwningRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.SPICE_ELEMENT__OWNING_ROLE, oldOwningRole, owningRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role getManagingRole() {
		if (managingRole != null && managingRole.eIsProxy()) {
			InternalEObject oldManagingRole = (InternalEObject)managingRole;
			managingRole = (Role)eResolveProxy(oldManagingRole);
			if (managingRole != oldManagingRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QWikiPackage.SPICE_ELEMENT__MANAGING_ROLE, oldManagingRole, managingRole));
			}
		}
		return managingRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetManagingRole() {
		return managingRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManagingRole(Role newManagingRole) {
		Role oldManagingRole = managingRole;
		managingRole = newManagingRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.SPICE_ELEMENT__MANAGING_ROLE, oldManagingRole, managingRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getParticipatingRole() {
		if (participatingRole == null) {
			participatingRole = new EObjectResolvingEList<Role>(Role.class, this, QWikiPackage.SPICE_ELEMENT__PARTICIPATING_ROLE);
		}
		return participatingRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Section> getFacilitatedSection() {
		if (facilitatedSection == null) {
			facilitatedSection = new EObjectWithInverseResolvingEList.ManyInverse<Section>(Section.class, this, QWikiPackage.SPICE_ELEMENT__FACILITATED_SECTION, QWikiPackage.SECTION__FACILITATING_SPICE_ELEMENT);
		}
		return facilitatedSection;
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
			case QWikiPackage.SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningProcessReferenceModel((ProcessReferenceModel)otherEnd, msgs);
			case QWikiPackage.SPICE_ELEMENT__FACILITATED_SECTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFacilitatedSection()).basicAdd(otherEnd, msgs);
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
			case QWikiPackage.SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL:
				return basicSetOwningProcessReferenceModel(null, msgs);
			case QWikiPackage.SPICE_ELEMENT__FACILITATED_SECTION:
				return ((InternalEList<?>)getFacilitatedSection()).basicRemove(otherEnd, msgs);
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
			case QWikiPackage.SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL:
				return eInternalContainer().eInverseRemove(this, QWikiPackage.PROCESS_REFERENCE_MODEL__OWNED_SPICE_ELEMENT, ProcessReferenceModel.class, msgs);
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
			case QWikiPackage.SPICE_ELEMENT__ROLE:
				return getRole();
			case QWikiPackage.SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL:
				return getOwningProcessReferenceModel();
			case QWikiPackage.SPICE_ELEMENT__NUMBER:
				return getNumber();
			case QWikiPackage.SPICE_ELEMENT__OWNING_ROLE:
				if (resolve) return getOwningRole();
				return basicGetOwningRole();
			case QWikiPackage.SPICE_ELEMENT__MANAGING_ROLE:
				if (resolve) return getManagingRole();
				return basicGetManagingRole();
			case QWikiPackage.SPICE_ELEMENT__PARTICIPATING_ROLE:
				return getParticipatingRole();
			case QWikiPackage.SPICE_ELEMENT__FACILITATED_SECTION:
				return getFacilitatedSection();
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
			case QWikiPackage.SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL:
				setOwningProcessReferenceModel((ProcessReferenceModel)newValue);
				return;
			case QWikiPackage.SPICE_ELEMENT__NUMBER:
				setNumber((String)newValue);
				return;
			case QWikiPackage.SPICE_ELEMENT__OWNING_ROLE:
				setOwningRole((Role)newValue);
				return;
			case QWikiPackage.SPICE_ELEMENT__MANAGING_ROLE:
				setManagingRole((Role)newValue);
				return;
			case QWikiPackage.SPICE_ELEMENT__PARTICIPATING_ROLE:
				getParticipatingRole().clear();
				getParticipatingRole().addAll((Collection<? extends Role>)newValue);
				return;
			case QWikiPackage.SPICE_ELEMENT__FACILITATED_SECTION:
				getFacilitatedSection().clear();
				getFacilitatedSection().addAll((Collection<? extends Section>)newValue);
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
			case QWikiPackage.SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL:
				setOwningProcessReferenceModel((ProcessReferenceModel)null);
				return;
			case QWikiPackage.SPICE_ELEMENT__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case QWikiPackage.SPICE_ELEMENT__OWNING_ROLE:
				setOwningRole((Role)null);
				return;
			case QWikiPackage.SPICE_ELEMENT__MANAGING_ROLE:
				setManagingRole((Role)null);
				return;
			case QWikiPackage.SPICE_ELEMENT__PARTICIPATING_ROLE:
				getParticipatingRole().clear();
				return;
			case QWikiPackage.SPICE_ELEMENT__FACILITATED_SECTION:
				getFacilitatedSection().clear();
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
			case QWikiPackage.SPICE_ELEMENT__OWNER:
				return isSetOwner();
			case QWikiPackage.SPICE_ELEMENT__ROLE:
				return isSetRole();
			case QWikiPackage.SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL:
				return getOwningProcessReferenceModel() != null;
			case QWikiPackage.SPICE_ELEMENT__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case QWikiPackage.SPICE_ELEMENT__OWNING_ROLE:
				return owningRole != null;
			case QWikiPackage.SPICE_ELEMENT__MANAGING_ROLE:
				return managingRole != null;
			case QWikiPackage.SPICE_ELEMENT__PARTICIPATING_ROLE:
				return participatingRole != null && !participatingRole.isEmpty();
			case QWikiPackage.SPICE_ELEMENT__FACILITATED_SECTION:
				return facilitatedSection != null && !facilitatedSection.isEmpty();
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
		result.append(" (number: ");
		result.append(number);
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
			|| eIsSet(QWikiPackage.SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRole() {
		return eIsSet(QWikiPackage.SPICE_ELEMENT__OWNING_ROLE)
			|| eIsSet(QWikiPackage.SPICE_ELEMENT__MANAGING_ROLE)
			|| eIsSet(QWikiPackage.SPICE_ELEMENT__PARTICIPATING_ROLE);
	}

} //SpiceElementImpl
