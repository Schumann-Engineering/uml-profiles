/**
 */
package QWiki.Spice.impl;

import QWiki.Kernel.impl.QWikiContainerImpl;

import QWiki.Rasci.RASCIPackage;
import QWiki.Rasci.RasciElement;
import QWiki.Rasci.Role;

import QWiki.References.ReferencesPackage;
import QWiki.References.Section;

import QWiki.Spice.ProcessReferenceModel;
import QWiki.Spice.SPICEPackage;
import QWiki.Spice.SpiceElement;

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

import org.eclipse.uml2.uml.Namespace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spice Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Spice.impl.SpiceElementImpl#getResponsibleRole <em>Responsible Role</em>}</li>
 *   <li>{@link QWiki.Spice.impl.SpiceElementImpl#getAccountableRole <em>Accountable Role</em>}</li>
 *   <li>{@link QWiki.Spice.impl.SpiceElementImpl#getSupportRole <em>Support Role</em>}</li>
 *   <li>{@link QWiki.Spice.impl.SpiceElementImpl#getConsultedRole <em>Consulted Role</em>}</li>
 *   <li>{@link QWiki.Spice.impl.SpiceElementImpl#getInformedRole <em>Informed Role</em>}</li>
 *   <li>{@link QWiki.Spice.impl.SpiceElementImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link QWiki.Spice.impl.SpiceElementImpl#getRole <em>Role</em>}</li>
 *   <li>{@link QWiki.Spice.impl.SpiceElementImpl#getOwningProcessReferenceModel <em>Owning Process Reference Model</em>}</li>
 *   <li>{@link QWiki.Spice.impl.SpiceElementImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link QWiki.Spice.impl.SpiceElementImpl#getFacilitatedSection <em>Facilitated Section</em>}</li>
 *   <li>{@link QWiki.Spice.impl.SpiceElementImpl#getOwnerRole <em>Owner Role</em>}</li>
 *   <li>{@link QWiki.Spice.impl.SpiceElementImpl#getManagerRole <em>Manager Role</em>}</li>
 *   <li>{@link QWiki.Spice.impl.SpiceElementImpl#getParticipantRole <em>Participant Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SpiceElementImpl extends QWikiContainerImpl implements SpiceElement {
	/**
	 * The cached value of the '{@link #getResponsibleRole() <em>Responsible Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> responsibleRole;

	/**
	 * The cached value of the '{@link #getAccountableRole() <em>Accountable Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountableRole()
	 * @generated
	 * @ordered
	 */
	protected Role accountableRole;

	/**
	 * The cached value of the '{@link #getSupportRole() <em>Support Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> supportRole;

	/**
	 * The cached value of the '{@link #getConsultedRole() <em>Consulted Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsultedRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> consultedRole;

	/**
	 * The cached value of the '{@link #getInformedRole() <em>Informed Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformedRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> informedRole;

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
	 * The cached value of the '{@link #getFacilitatedSection() <em>Facilitated Section</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitatedSection()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> facilitatedSection;

	/**
	 * The cached value of the '{@link #getOwnerRole() <em>Owner Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerRole()
	 * @generated
	 * @ordered
	 */
	protected Role ownerRole;

	/**
	 * The cached value of the '{@link #getManagerRole() <em>Manager Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagerRole()
	 * @generated
	 * @ordered
	 */
	protected Role managerRole;

	/**
	 * The cached value of the '{@link #getParticipantRole() <em>Participant Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> participantRole;

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
		return SPICEPackage.Literals.SPICE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getResponsibleRole() {
		if (responsibleRole == null) {
			responsibleRole = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, SPICEPackage.SPICE_ELEMENT__RESPONSIBLE_ROLE, RASCIPackage.ROLE__RESPONSIBLE_ELEMENT);
		}
		return responsibleRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getResponsibleRole(String name) {
		return getResponsibleRole(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getResponsibleRole(String name, boolean ignoreCase) {
		responsibleRoleLoop: for (Role responsibleRole : getResponsibleRole()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(responsibleRole.getName()) : name.equals(responsibleRole.getName())))
				continue responsibleRoleLoop;
			return responsibleRole;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role getAccountableRole() {
		if (accountableRole != null && accountableRole.eIsProxy()) {
			InternalEObject oldAccountableRole = (InternalEObject)accountableRole;
			accountableRole = (Role)eResolveProxy(oldAccountableRole);
			if (accountableRole != oldAccountableRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SPICEPackage.SPICE_ELEMENT__ACCOUNTABLE_ROLE, oldAccountableRole, accountableRole));
			}
		}
		return accountableRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetAccountableRole() {
		return accountableRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccountableRole(Role newAccountableRole, NotificationChain msgs) {
		Role oldAccountableRole = accountableRole;
		accountableRole = newAccountableRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPICEPackage.SPICE_ELEMENT__ACCOUNTABLE_ROLE, oldAccountableRole, newAccountableRole);
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
	public void setAccountableRole(Role newAccountableRole) {
		if (newAccountableRole != accountableRole) {
			NotificationChain msgs = null;
			if (accountableRole != null)
				msgs = ((InternalEObject)accountableRole).eInverseRemove(this, RASCIPackage.ROLE__ACCOUNTABLE_ELEMENT, Role.class, msgs);
			if (newAccountableRole != null)
				msgs = ((InternalEObject)newAccountableRole).eInverseAdd(this, RASCIPackage.ROLE__ACCOUNTABLE_ELEMENT, Role.class, msgs);
			msgs = basicSetAccountableRole(newAccountableRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SPICEPackage.SPICE_ELEMENT__ACCOUNTABLE_ROLE, newAccountableRole, newAccountableRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getSupportRole() {
		if (supportRole == null) {
			supportRole = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, SPICEPackage.SPICE_ELEMENT__SUPPORT_ROLE, RASCIPackage.ROLE__SUPPORTING_ELEMENT);
		}
		return supportRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getSupportRole(String name) {
		return getSupportRole(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getSupportRole(String name, boolean ignoreCase) {
		supportRoleLoop: for (Role supportRole : getSupportRole()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(supportRole.getName()) : name.equals(supportRole.getName())))
				continue supportRoleLoop;
			return supportRole;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getConsultedRole() {
		if (consultedRole == null) {
			consultedRole = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, SPICEPackage.SPICE_ELEMENT__CONSULTED_ROLE, RASCIPackage.ROLE__CONSULTING_ELEMENT);
		}
		return consultedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getConsultedRole(String name) {
		return getConsultedRole(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getConsultedRole(String name, boolean ignoreCase) {
		consultedRoleLoop: for (Role consultedRole : getConsultedRole()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(consultedRole.getName()) : name.equals(consultedRole.getName())))
				continue consultedRoleLoop;
			return consultedRole;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getInformedRole() {
		if (informedRole == null) {
			informedRole = new EObjectWithInverseResolvingEList.ManyInverse<Role>(Role.class, this, SPICEPackage.SPICE_ELEMENT__INFORMED_ROLE, RASCIPackage.ROLE__INFORMED_ELEMENT);
		}
		return informedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getInformedRole(String name) {
		return getInformedRole(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getInformedRole(String name, boolean ignoreCase) {
		informedRoleLoop: for (Role informedRole : getInformedRole()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(informedRole.getName()) : name.equals(informedRole.getName())))
				continue informedRoleLoop;
			return informedRole;
		}
		return null;
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
		ProcessReferenceModel owningProcessReferenceModel = getOwningProcessReferenceModel();			
		if (owningProcessReferenceModel != null) {
			return owningProcessReferenceModel;
		}
		return super.basicGetNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getRole() {
		return new DerivedUnionEObjectEList<Role>(Role.class, this, SPICEPackage.SPICE_ELEMENT__ROLE, ROLE_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRole() <em>Role</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final int[] ROLE_ESUBSETS = new int[] {SPICEPackage.SPICE_ELEMENT__OWNER_ROLE, SPICEPackage.SPICE_ELEMENT__MANAGER_ROLE, SPICEPackage.SPICE_ELEMENT__PARTICIPANT_ROLE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole(String name) {
		return getRole(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole(String name, boolean ignoreCase) {
		roleLoop: for (Role role : getRole()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(role.getName()) : name.equals(role.getName())))
				continue roleLoop;
			return role;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessReferenceModel getOwningProcessReferenceModel() {
		if (eContainerFeatureID() != SPICEPackage.SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL) return null;
		return (ProcessReferenceModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningProcessReferenceModel(ProcessReferenceModel newOwningProcessReferenceModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningProcessReferenceModel, SPICEPackage.SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningProcessReferenceModel(ProcessReferenceModel newOwningProcessReferenceModel) {
		if (newOwningProcessReferenceModel != eInternalContainer() || (eContainerFeatureID() != SPICEPackage.SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL && newOwningProcessReferenceModel != null)) {
			if (EcoreUtil.isAncestor(this, newOwningProcessReferenceModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningProcessReferenceModel != null)
				msgs = ((InternalEObject)newOwningProcessReferenceModel).eInverseAdd(this, SPICEPackage.PROCESS_REFERENCE_MODEL__OWNED_SPICE_ELEMENT, ProcessReferenceModel.class, msgs);
			msgs = basicSetOwningProcessReferenceModel(newOwningProcessReferenceModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SPICEPackage.SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL, newOwningProcessReferenceModel, newOwningProcessReferenceModel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SPICEPackage.SPICE_ELEMENT__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Section> getFacilitatedSection() {
		if (facilitatedSection == null) {
			facilitatedSection = new EObjectWithInverseResolvingEList.ManyInverse<Section>(Section.class, this, SPICEPackage.SPICE_ELEMENT__FACILITATED_SECTION, ReferencesPackage.SECTION__FACILITATING_SPICE_ELEMENT);
		}
		return facilitatedSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section getFacilitatedSection(String name) {
		return getFacilitatedSection(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section getFacilitatedSection(String name, boolean ignoreCase) {
		facilitatedSectionLoop: for (Section facilitatedSection : getFacilitatedSection()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(facilitatedSection.getName()) : name.equals(facilitatedSection.getName())))
				continue facilitatedSectionLoop;
			return facilitatedSection;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role getOwnerRole() {
		if (ownerRole != null && ownerRole.eIsProxy()) {
			InternalEObject oldOwnerRole = (InternalEObject)ownerRole;
			ownerRole = (Role)eResolveProxy(oldOwnerRole);
			if (ownerRole != oldOwnerRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SPICEPackage.SPICE_ELEMENT__OWNER_ROLE, oldOwnerRole, ownerRole));
			}
		}
		return ownerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetOwnerRole() {
		return ownerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnerRole(Role newOwnerRole) {
		Role oldOwnerRole = ownerRole;
		ownerRole = newOwnerRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SPICEPackage.SPICE_ELEMENT__OWNER_ROLE, oldOwnerRole, ownerRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role getManagerRole() {
		if (managerRole != null && managerRole.eIsProxy()) {
			InternalEObject oldManagerRole = (InternalEObject)managerRole;
			managerRole = (Role)eResolveProxy(oldManagerRole);
			if (managerRole != oldManagerRole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SPICEPackage.SPICE_ELEMENT__MANAGER_ROLE, oldManagerRole, managerRole));
			}
		}
		return managerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetManagerRole() {
		return managerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManagerRole(Role newManagerRole) {
		Role oldManagerRole = managerRole;
		managerRole = newManagerRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SPICEPackage.SPICE_ELEMENT__MANAGER_ROLE, oldManagerRole, managerRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getParticipantRole() {
		if (participantRole == null) {
			participantRole = new EObjectResolvingEList<Role>(Role.class, this, SPICEPackage.SPICE_ELEMENT__PARTICIPANT_ROLE);
		}
		return participantRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getParticipantRole(String name) {
		return getParticipantRole(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getParticipantRole(String name, boolean ignoreCase) {
		participantRoleLoop: for (Role participantRole : getParticipantRole()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(participantRole.getName()) : name.equals(participantRole.getName())))
				continue participantRoleLoop;
			return participantRole;
		}
		return null;
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
			case SPICEPackage.SPICE_ELEMENT__RESPONSIBLE_ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResponsibleRole()).basicAdd(otherEnd, msgs);
			case SPICEPackage.SPICE_ELEMENT__ACCOUNTABLE_ROLE:
				if (accountableRole != null)
					msgs = ((InternalEObject)accountableRole).eInverseRemove(this, RASCIPackage.ROLE__ACCOUNTABLE_ELEMENT, Role.class, msgs);
				return basicSetAccountableRole((Role)otherEnd, msgs);
			case SPICEPackage.SPICE_ELEMENT__SUPPORT_ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSupportRole()).basicAdd(otherEnd, msgs);
			case SPICEPackage.SPICE_ELEMENT__CONSULTED_ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConsultedRole()).basicAdd(otherEnd, msgs);
			case SPICEPackage.SPICE_ELEMENT__INFORMED_ROLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInformedRole()).basicAdd(otherEnd, msgs);
			case SPICEPackage.SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningProcessReferenceModel((ProcessReferenceModel)otherEnd, msgs);
			case SPICEPackage.SPICE_ELEMENT__FACILITATED_SECTION:
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
			case SPICEPackage.SPICE_ELEMENT__RESPONSIBLE_ROLE:
				return ((InternalEList<?>)getResponsibleRole()).basicRemove(otherEnd, msgs);
			case SPICEPackage.SPICE_ELEMENT__ACCOUNTABLE_ROLE:
				return basicSetAccountableRole(null, msgs);
			case SPICEPackage.SPICE_ELEMENT__SUPPORT_ROLE:
				return ((InternalEList<?>)getSupportRole()).basicRemove(otherEnd, msgs);
			case SPICEPackage.SPICE_ELEMENT__CONSULTED_ROLE:
				return ((InternalEList<?>)getConsultedRole()).basicRemove(otherEnd, msgs);
			case SPICEPackage.SPICE_ELEMENT__INFORMED_ROLE:
				return ((InternalEList<?>)getInformedRole()).basicRemove(otherEnd, msgs);
			case SPICEPackage.SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL:
				return basicSetOwningProcessReferenceModel(null, msgs);
			case SPICEPackage.SPICE_ELEMENT__FACILITATED_SECTION:
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
			case SPICEPackage.SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL:
				return eInternalContainer().eInverseRemove(this, SPICEPackage.PROCESS_REFERENCE_MODEL__OWNED_SPICE_ELEMENT, ProcessReferenceModel.class, msgs);
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
			case SPICEPackage.SPICE_ELEMENT__RESPONSIBLE_ROLE:
				return getResponsibleRole();
			case SPICEPackage.SPICE_ELEMENT__ACCOUNTABLE_ROLE:
				if (resolve) return getAccountableRole();
				return basicGetAccountableRole();
			case SPICEPackage.SPICE_ELEMENT__SUPPORT_ROLE:
				return getSupportRole();
			case SPICEPackage.SPICE_ELEMENT__CONSULTED_ROLE:
				return getConsultedRole();
			case SPICEPackage.SPICE_ELEMENT__INFORMED_ROLE:
				return getInformedRole();
			case SPICEPackage.SPICE_ELEMENT__ROLE:
				return getRole();
			case SPICEPackage.SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL:
				return getOwningProcessReferenceModel();
			case SPICEPackage.SPICE_ELEMENT__NUMBER:
				return getNumber();
			case SPICEPackage.SPICE_ELEMENT__FACILITATED_SECTION:
				return getFacilitatedSection();
			case SPICEPackage.SPICE_ELEMENT__OWNER_ROLE:
				if (resolve) return getOwnerRole();
				return basicGetOwnerRole();
			case SPICEPackage.SPICE_ELEMENT__MANAGER_ROLE:
				if (resolve) return getManagerRole();
				return basicGetManagerRole();
			case SPICEPackage.SPICE_ELEMENT__PARTICIPANT_ROLE:
				return getParticipantRole();
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
			case SPICEPackage.SPICE_ELEMENT__RESPONSIBLE_ROLE:
				getResponsibleRole().clear();
				getResponsibleRole().addAll((Collection<? extends Role>)newValue);
				return;
			case SPICEPackage.SPICE_ELEMENT__ACCOUNTABLE_ROLE:
				setAccountableRole((Role)newValue);
				return;
			case SPICEPackage.SPICE_ELEMENT__SUPPORT_ROLE:
				getSupportRole().clear();
				getSupportRole().addAll((Collection<? extends Role>)newValue);
				return;
			case SPICEPackage.SPICE_ELEMENT__CONSULTED_ROLE:
				getConsultedRole().clear();
				getConsultedRole().addAll((Collection<? extends Role>)newValue);
				return;
			case SPICEPackage.SPICE_ELEMENT__INFORMED_ROLE:
				getInformedRole().clear();
				getInformedRole().addAll((Collection<? extends Role>)newValue);
				return;
			case SPICEPackage.SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL:
				setOwningProcessReferenceModel((ProcessReferenceModel)newValue);
				return;
			case SPICEPackage.SPICE_ELEMENT__NUMBER:
				setNumber((String)newValue);
				return;
			case SPICEPackage.SPICE_ELEMENT__FACILITATED_SECTION:
				getFacilitatedSection().clear();
				getFacilitatedSection().addAll((Collection<? extends Section>)newValue);
				return;
			case SPICEPackage.SPICE_ELEMENT__OWNER_ROLE:
				setOwnerRole((Role)newValue);
				return;
			case SPICEPackage.SPICE_ELEMENT__MANAGER_ROLE:
				setManagerRole((Role)newValue);
				return;
			case SPICEPackage.SPICE_ELEMENT__PARTICIPANT_ROLE:
				getParticipantRole().clear();
				getParticipantRole().addAll((Collection<? extends Role>)newValue);
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
			case SPICEPackage.SPICE_ELEMENT__RESPONSIBLE_ROLE:
				getResponsibleRole().clear();
				return;
			case SPICEPackage.SPICE_ELEMENT__ACCOUNTABLE_ROLE:
				setAccountableRole((Role)null);
				return;
			case SPICEPackage.SPICE_ELEMENT__SUPPORT_ROLE:
				getSupportRole().clear();
				return;
			case SPICEPackage.SPICE_ELEMENT__CONSULTED_ROLE:
				getConsultedRole().clear();
				return;
			case SPICEPackage.SPICE_ELEMENT__INFORMED_ROLE:
				getInformedRole().clear();
				return;
			case SPICEPackage.SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL:
				setOwningProcessReferenceModel((ProcessReferenceModel)null);
				return;
			case SPICEPackage.SPICE_ELEMENT__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case SPICEPackage.SPICE_ELEMENT__FACILITATED_SECTION:
				getFacilitatedSection().clear();
				return;
			case SPICEPackage.SPICE_ELEMENT__OWNER_ROLE:
				setOwnerRole((Role)null);
				return;
			case SPICEPackage.SPICE_ELEMENT__MANAGER_ROLE:
				setManagerRole((Role)null);
				return;
			case SPICEPackage.SPICE_ELEMENT__PARTICIPANT_ROLE:
				getParticipantRole().clear();
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
			case SPICEPackage.SPICE_ELEMENT__RESPONSIBLE_ROLE:
				return responsibleRole != null && !responsibleRole.isEmpty();
			case SPICEPackage.SPICE_ELEMENT__ACCOUNTABLE_ROLE:
				return accountableRole != null;
			case SPICEPackage.SPICE_ELEMENT__SUPPORT_ROLE:
				return supportRole != null && !supportRole.isEmpty();
			case SPICEPackage.SPICE_ELEMENT__CONSULTED_ROLE:
				return consultedRole != null && !consultedRole.isEmpty();
			case SPICEPackage.SPICE_ELEMENT__INFORMED_ROLE:
				return informedRole != null && !informedRole.isEmpty();
			case SPICEPackage.SPICE_ELEMENT__NAMESPACE:
				return isSetNamespace();
			case SPICEPackage.SPICE_ELEMENT__ROLE:
				return isSetRole();
			case SPICEPackage.SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL:
				return getOwningProcessReferenceModel() != null;
			case SPICEPackage.SPICE_ELEMENT__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case SPICEPackage.SPICE_ELEMENT__FACILITATED_SECTION:
				return facilitatedSection != null && !facilitatedSection.isEmpty();
			case SPICEPackage.SPICE_ELEMENT__OWNER_ROLE:
				return ownerRole != null;
			case SPICEPackage.SPICE_ELEMENT__MANAGER_ROLE:
				return managerRole != null;
			case SPICEPackage.SPICE_ELEMENT__PARTICIPANT_ROLE:
				return participantRole != null && !participantRole.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == RasciElement.class) {
			switch (derivedFeatureID) {
				case SPICEPackage.SPICE_ELEMENT__RESPONSIBLE_ROLE: return RASCIPackage.RASCI_ELEMENT__RESPONSIBLE_ROLE;
				case SPICEPackage.SPICE_ELEMENT__ACCOUNTABLE_ROLE: return RASCIPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE;
				case SPICEPackage.SPICE_ELEMENT__SUPPORT_ROLE: return RASCIPackage.RASCI_ELEMENT__SUPPORT_ROLE;
				case SPICEPackage.SPICE_ELEMENT__CONSULTED_ROLE: return RASCIPackage.RASCI_ELEMENT__CONSULTED_ROLE;
				case SPICEPackage.SPICE_ELEMENT__INFORMED_ROLE: return RASCIPackage.RASCI_ELEMENT__INFORMED_ROLE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == RasciElement.class) {
			switch (baseFeatureID) {
				case RASCIPackage.RASCI_ELEMENT__RESPONSIBLE_ROLE: return SPICEPackage.SPICE_ELEMENT__RESPONSIBLE_ROLE;
				case RASCIPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE: return SPICEPackage.SPICE_ELEMENT__ACCOUNTABLE_ROLE;
				case RASCIPackage.RASCI_ELEMENT__SUPPORT_ROLE: return SPICEPackage.SPICE_ELEMENT__SUPPORT_ROLE;
				case RASCIPackage.RASCI_ELEMENT__CONSULTED_ROLE: return SPICEPackage.SPICE_ELEMENT__CONSULTED_ROLE;
				case RASCIPackage.RASCI_ELEMENT__INFORMED_ROLE: return SPICEPackage.SPICE_ELEMENT__INFORMED_ROLE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
	public boolean isSetNamespace() {
		return super.isSetNamespace()
			|| eIsSet(SPICEPackage.SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRole() {
		return eIsSet(SPICEPackage.SPICE_ELEMENT__OWNER_ROLE)
			|| eIsSet(SPICEPackage.SPICE_ELEMENT__MANAGER_ROLE)
			|| eIsSet(SPICEPackage.SPICE_ELEMENT__PARTICIPANT_ROLE);
	}

} //SpiceElementImpl