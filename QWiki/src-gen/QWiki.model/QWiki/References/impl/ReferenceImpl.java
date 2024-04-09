/**
 */
package QWiki.References.impl;

import QWiki.Kernel.impl.QWikiContainerImpl;

import QWiki.References.Author;
import QWiki.References.Reference;
import QWiki.References.ReferenceType;
import QWiki.References.ReferenceVersion;
import QWiki.References.ReferencesPackage;

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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.References.impl.ReferenceImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link QWiki.References.impl.ReferenceImpl#getOwnedVersion <em>Owned Version</em>}</li>
 *   <li>{@link QWiki.References.impl.ReferenceImpl#getReferenceType <em>Reference Type</em>}</li>
 *   <li>{@link QWiki.References.impl.ReferenceImpl#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceImpl extends QWikiContainerImpl implements Reference {
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
	 * The cached value of the '{@link #getOwnedVersion() <em>Owned Version</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedVersion()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceVersion> ownedVersion;

	/**
	 * The default value of the '{@link #getReferenceType() <em>Reference Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceType()
	 * @generated
	 * @ordered
	 */
	protected static final ReferenceType REFERENCE_TYPE_EDEFAULT = ReferenceType.DOCUMENT;

	/**
	 * The cached value of the '{@link #getReferenceType() <em>Reference Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceType()
	 * @generated
	 * @ordered
	 */
	protected ReferenceType referenceType = REFERENCE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected EList<Author> author;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReferencesPackage.Literals.REFERENCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencesPackage.REFERENCE__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReferenceVersion> getOwnedVersion() {
		if (ownedVersion == null) {
			ownedVersion = new EObjectContainmentWithInverseEList<ReferenceVersion>(ReferenceVersion.class, this, ReferencesPackage.REFERENCE__OWNED_VERSION, ReferencesPackage.REFERENCE_VERSION__OWNING_REFERENCE);
		}
		return ownedVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceVersion getOwnedVersion(String name) {
		return getOwnedVersion(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceVersion getOwnedVersion(String name, boolean ignoreCase) {
		ownedVersionLoop: for (ReferenceVersion ownedVersion : getOwnedVersion()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedVersion.getName()) : name.equals(ownedVersion.getName())))
				continue ownedVersionLoop;
			return ownedVersion;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceType getReferenceType() {
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceType(ReferenceType newReferenceType) {
		ReferenceType oldReferenceType = referenceType;
		referenceType = newReferenceType == null ? REFERENCE_TYPE_EDEFAULT : newReferenceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencesPackage.REFERENCE__REFERENCE_TYPE, oldReferenceType, referenceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Author> getAuthor() {
		if (author == null) {
			author = new EObjectResolvingEList<Author>(Author.class, this, ReferencesPackage.REFERENCE__AUTHOR);
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Author getAuthor(String name) {
		return getAuthor(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Author getAuthor(String name, boolean ignoreCase) {
		authorLoop: for (Author author : getAuthor()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(author.getName()) : name.equals(author.getName())))
				continue authorLoop;
			return author;
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
	protected static final EOperation.Internal.InvocationDelegate OID__EINVOCATION_DELEGATE = ((EOperation.Internal)ReferencesPackage.Literals.REFERENCE___OID).getInvocationDelegate();

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
			case ReferencesPackage.REFERENCE__OWNED_VERSION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedVersion()).basicAdd(otherEnd, msgs);
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
			case ReferencesPackage.REFERENCE__OWNED_VERSION:
				return ((InternalEList<?>)getOwnedVersion()).basicRemove(otherEnd, msgs);
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
			case ReferencesPackage.REFERENCE__NUMBER:
				return getNumber();
			case ReferencesPackage.REFERENCE__OWNED_VERSION:
				return getOwnedVersion();
			case ReferencesPackage.REFERENCE__REFERENCE_TYPE:
				return getReferenceType();
			case ReferencesPackage.REFERENCE__AUTHOR:
				return getAuthor();
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
			case ReferencesPackage.REFERENCE__NUMBER:
				setNumber((String)newValue);
				return;
			case ReferencesPackage.REFERENCE__OWNED_VERSION:
				getOwnedVersion().clear();
				getOwnedVersion().addAll((Collection<? extends ReferenceVersion>)newValue);
				return;
			case ReferencesPackage.REFERENCE__REFERENCE_TYPE:
				setReferenceType((ReferenceType)newValue);
				return;
			case ReferencesPackage.REFERENCE__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends Author>)newValue);
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
			case ReferencesPackage.REFERENCE__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case ReferencesPackage.REFERENCE__OWNED_VERSION:
				getOwnedVersion().clear();
				return;
			case ReferencesPackage.REFERENCE__REFERENCE_TYPE:
				setReferenceType(REFERENCE_TYPE_EDEFAULT);
				return;
			case ReferencesPackage.REFERENCE__AUTHOR:
				getAuthor().clear();
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
			case ReferencesPackage.REFERENCE__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case ReferencesPackage.REFERENCE__OWNED_VERSION:
				return ownedVersion != null && !ownedVersion.isEmpty();
			case ReferencesPackage.REFERENCE__REFERENCE_TYPE:
				return referenceType != REFERENCE_TYPE_EDEFAULT;
			case ReferencesPackage.REFERENCE__AUTHOR:
				return author != null && !author.isEmpty();
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
			case ReferencesPackage.REFERENCE___OID:
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
		result.append(" (number: ");
		result.append(number);
		result.append(", referenceType: ");
		result.append(referenceType);
		result.append(')');
		return result.toString();
	}

} //ReferenceImpl
