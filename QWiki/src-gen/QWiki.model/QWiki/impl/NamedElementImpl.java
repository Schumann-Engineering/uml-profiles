/**
 */
package QWiki.impl;

import QWiki.Domain;
import QWiki.NamedElement;
import QWiki.QWikiPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.impl.NamedElementImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link QWiki.impl.NamedElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link QWiki.impl.NamedElementImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link QWiki.impl.NamedElementImpl#getAssignedDomain <em>Assigned Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NamedElementImpl extends TaggedElementImpl implements NamedElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssignedDomain() <em>Assigned Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedDomain()
	 * @generated
	 * @ordered
	 */
	protected Domain assignedDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QWikiPackage.Literals.NAMED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Domain getDomain() {
		Domain domain = basicGetDomain();
		return domain != null && domain.eIsProxy() ? (Domain)eResolveProxy((InternalEObject)domain) : domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain basicGetDomain() {
		if (eIsSet(QWikiPackage.NAMED_ELEMENT__ASSIGNED_DOMAIN)) {
			return basicGetAssignedDomain();
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.NAMED_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQualifiedName() {
		// TODO: implement this method to return the 'Qualified Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Domain getAssignedDomain() {
		if (assignedDomain != null && assignedDomain.eIsProxy()) {
			InternalEObject oldAssignedDomain = (InternalEObject)assignedDomain;
			assignedDomain = (Domain)eResolveProxy(oldAssignedDomain);
			if (assignedDomain != oldAssignedDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QWikiPackage.NAMED_ELEMENT__ASSIGNED_DOMAIN, oldAssignedDomain, assignedDomain));
			}
		}
		return assignedDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain basicGetAssignedDomain() {
		return assignedDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignedDomain(Domain newAssignedDomain, NotificationChain msgs) {
		Domain oldAssignedDomain = assignedDomain;
		assignedDomain = newAssignedDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QWikiPackage.NAMED_ELEMENT__ASSIGNED_DOMAIN, oldAssignedDomain, newAssignedDomain);
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
	public void setAssignedDomain(Domain newAssignedDomain) {
		if (newAssignedDomain != assignedDomain) {
			NotificationChain msgs = null;
			if (assignedDomain != null)
				msgs = ((InternalEObject)assignedDomain).eInverseRemove(this, QWikiPackage.DOMAIN__DOMAIN_ELEMENT, Domain.class, msgs);
			if (newAssignedDomain != null)
				msgs = ((InternalEObject)newAssignedDomain).eInverseAdd(this, QWikiPackage.DOMAIN__DOMAIN_ELEMENT, Domain.class, msgs);
			msgs = basicSetAssignedDomain(newAssignedDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.NAMED_ELEMENT__ASSIGNED_DOMAIN, newAssignedDomain, newAssignedDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QWikiPackage.NAMED_ELEMENT__ASSIGNED_DOMAIN:
				if (assignedDomain != null)
					msgs = ((InternalEObject)assignedDomain).eInverseRemove(this, QWikiPackage.DOMAIN__DOMAIN_ELEMENT, Domain.class, msgs);
				return basicSetAssignedDomain((Domain)otherEnd, msgs);
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
			case QWikiPackage.NAMED_ELEMENT__ASSIGNED_DOMAIN:
				return basicSetAssignedDomain(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QWikiPackage.NAMED_ELEMENT__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case QWikiPackage.NAMED_ELEMENT__NAME:
				return getName();
			case QWikiPackage.NAMED_ELEMENT__QUALIFIED_NAME:
				return getQualifiedName();
			case QWikiPackage.NAMED_ELEMENT__ASSIGNED_DOMAIN:
				if (resolve) return getAssignedDomain();
				return basicGetAssignedDomain();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QWikiPackage.NAMED_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case QWikiPackage.NAMED_ELEMENT__ASSIGNED_DOMAIN:
				setAssignedDomain((Domain)newValue);
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
			case QWikiPackage.NAMED_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QWikiPackage.NAMED_ELEMENT__ASSIGNED_DOMAIN:
				setAssignedDomain((Domain)null);
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
			case QWikiPackage.NAMED_ELEMENT__DOMAIN:
				return isSetDomain();
			case QWikiPackage.NAMED_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QWikiPackage.NAMED_ELEMENT__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case QWikiPackage.NAMED_ELEMENT__ASSIGNED_DOMAIN:
				return assignedDomain != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDomain() {
		return eIsSet(QWikiPackage.NAMED_ELEMENT__ASSIGNED_DOMAIN);
	}

} //NamedElementImpl
