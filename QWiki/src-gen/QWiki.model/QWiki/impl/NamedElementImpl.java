/**
 */
package QWiki.impl;

import QWiki.Domain;
import QWiki.Element;
import QWiki.NamedElement;
import QWiki.Namespace;
import QWiki.QWikiPackage;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.impl.NamedElementImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link QWiki.impl.NamedElementImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link QWiki.impl.NamedElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link QWiki.impl.NamedElementImpl#getAssignedDomain <em>Assigned Domain</em>}</li>
 *   <li>{@link QWiki.impl.NamedElementImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link QWiki.impl.NamedElementImpl#getOwningPackage <em>Owning Package</em>}</li>
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
		Namespace namespace = basicGetNamespace();			
		if (namespace != null) {
			return namespace;
		}
		return super.basicGetOwner();
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
	public Namespace getNamespace() {
		Namespace namespace = basicGetNamespace();
		return namespace != null && namespace.eIsProxy() ? (Namespace)eResolveProxy((InternalEObject)namespace) : namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		// TODO: implement this method to return the 'Namespace' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNamespace(Namespace newNamespace) {
		// TODO: implement this method to set the 'Namespace' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QWiki.Package getOwningPackage() {
		if (eContainerFeatureID() != QWikiPackage.NAMED_ELEMENT__OWNING_PACKAGE) return null;
		return (QWiki.Package)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningPackage(QWiki.Package newOwningPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningPackage, QWikiPackage.NAMED_ELEMENT__OWNING_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningPackage(QWiki.Package newOwningPackage) {
		if (newOwningPackage != eInternalContainer() || (eContainerFeatureID() != QWikiPackage.NAMED_ELEMENT__OWNING_PACKAGE && newOwningPackage != null)) {
			if (EcoreUtil.isAncestor(this, newOwningPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningPackage != null)
				msgs = ((InternalEObject)newOwningPackage).eInverseAdd(this, QWikiPackage.PACKAGE__PACKAGED_ELEMENT, QWiki.Package.class, msgs);
			msgs = basicSetOwningPackage(newOwningPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.NAMED_ELEMENT__OWNING_PACKAGE, newOwningPackage, newOwningPackage));
	}

	/**
	 * The cached invocation delegate for the '{@link #qualifiedName() <em>Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #qualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate QUALIFIED_NAME__EINVOCATION_DELEGATE = ((EOperation.Internal)QWikiPackage.Literals.NAMED_ELEMENT___QUALIFIED_NAME).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String qualifiedName() {
		try {
			return (String)QUALIFIED_NAME__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #allNamespaces() <em>All Namespaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #allNamespaces()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ALL_NAMESPACES__EINVOCATION_DELEGATE = ((EOperation.Internal)QWikiPackage.Literals.NAMED_ELEMENT___ALL_NAMESPACES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Namespace> allNamespaces() {
		try {
			return (EList<Namespace>)ALL_NAMESPACES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #separator() <em>Separator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #separator()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate SEPARATOR__EINVOCATION_DELEGATE = ((EOperation.Internal)QWikiPackage.Literals.NAMED_ELEMENT___SEPARATOR).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String separator() {
		try {
			return (String)SEPARATOR__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QWikiPackage.NAMED_ELEMENT__ASSIGNED_DOMAIN:
				if (assignedDomain != null)
					msgs = ((InternalEObject)assignedDomain).eInverseRemove(this, QWikiPackage.DOMAIN__DOMAIN_ELEMENT, Domain.class, msgs);
				return basicSetAssignedDomain((Domain)otherEnd, msgs);
			case QWikiPackage.NAMED_ELEMENT__OWNING_PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningPackage((QWiki.Package)otherEnd, msgs);
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
			case QWikiPackage.NAMED_ELEMENT__OWNING_PACKAGE:
				return basicSetOwningPackage(null, msgs);
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
			case QWikiPackage.NAMED_ELEMENT__OWNING_PACKAGE:
				return eInternalContainer().eInverseRemove(this, QWikiPackage.PACKAGE__PACKAGED_ELEMENT, QWiki.Package.class, msgs);
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
			case QWikiPackage.NAMED_ELEMENT__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case QWikiPackage.NAMED_ELEMENT__NAME:
				return getName();
			case QWikiPackage.NAMED_ELEMENT__ASSIGNED_DOMAIN:
				if (resolve) return getAssignedDomain();
				return basicGetAssignedDomain();
			case QWikiPackage.NAMED_ELEMENT__NAMESPACE:
				if (resolve) return getNamespace();
				return basicGetNamespace();
			case QWikiPackage.NAMED_ELEMENT__OWNING_PACKAGE:
				return getOwningPackage();
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
			case QWikiPackage.NAMED_ELEMENT__NAMESPACE:
				setNamespace((Namespace)newValue);
				return;
			case QWikiPackage.NAMED_ELEMENT__OWNING_PACKAGE:
				setOwningPackage((QWiki.Package)newValue);
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
			case QWikiPackage.NAMED_ELEMENT__NAMESPACE:
				setNamespace((Namespace)null);
				return;
			case QWikiPackage.NAMED_ELEMENT__OWNING_PACKAGE:
				setOwningPackage((QWiki.Package)null);
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
			case QWikiPackage.NAMED_ELEMENT__OWNER:
				return isSetOwner();
			case QWikiPackage.NAMED_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QWikiPackage.NAMED_ELEMENT__ASSIGNED_DOMAIN:
				return assignedDomain != null;
			case QWikiPackage.NAMED_ELEMENT__NAMESPACE:
				return basicGetNamespace() != null;
			case QWikiPackage.NAMED_ELEMENT__OWNING_PACKAGE:
				return getOwningPackage() != null;
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
			case QWikiPackage.NAMED_ELEMENT___QUALIFIED_NAME:
				return qualifiedName();
			case QWikiPackage.NAMED_ELEMENT___ALL_NAMESPACES:
				return allNamespaces();
			case QWikiPackage.NAMED_ELEMENT___SEPARATOR:
				return separator();
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(QWikiPackage.NAMED_ELEMENT__NAMESPACE);
	}

} //NamedElementImpl
