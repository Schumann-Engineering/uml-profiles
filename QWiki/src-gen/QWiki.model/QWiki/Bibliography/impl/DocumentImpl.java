/**
 */
package QWiki.Bibliography.impl;

import QWiki.Bibliography.Author;
import QWiki.Bibliography.BibliographyPackage;
import QWiki.Bibliography.Document;
import QWiki.Bibliography.DocumentType;
import QWiki.Bibliography.DocumentVersion;

import QWiki.Infrastructure.UmlNamedElement;

import QWiki.Infrastructure.impl.UmlNamespaceImpl;

import QWiki.Kernel.KernelPackage;

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

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Bibliography.impl.DocumentImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link QWiki.Bibliography.impl.DocumentImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link QWiki.Bibliography.impl.DocumentImpl#getOwnedVersion <em>Owned Version</em>}</li>
 *   <li>{@link QWiki.Bibliography.impl.DocumentImpl#getDocumentType <em>Document Type</em>}</li>
 *   <li>{@link QWiki.Bibliography.impl.DocumentImpl#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentImpl extends UmlNamespaceImpl implements Document {
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
	protected EList<DocumentVersion> ownedVersion;

	/**
	 * The default value of the '{@link #getDocumentType() <em>Document Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentType()
	 * @generated
	 * @ordered
	 */
	protected static final DocumentType DOCUMENT_TYPE_EDEFAULT = DocumentType.DOCUMENT;

	/**
	 * The cached value of the '{@link #getDocumentType() <em>Document Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentType()
	 * @generated
	 * @ordered
	 */
	protected DocumentType documentType = DOCUMENT_TYPE_EDEFAULT;

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
	protected DocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BibliographyPackage.Literals.DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UmlNamedElement> getOwnedMember() {
		return new DerivedUnionEObjectEList<UmlNamedElement>(UmlNamedElement.class, this, BibliographyPackage.DOCUMENT__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMember() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMember()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[] {BibliographyPackage.DOCUMENT__OWNED_VERSION};

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
			eNotify(new ENotificationImpl(this, Notification.SET, BibliographyPackage.DOCUMENT__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DocumentVersion> getOwnedVersion() {
		if (ownedVersion == null) {
			ownedVersion = new EObjectContainmentWithInverseEList<DocumentVersion>(DocumentVersion.class, this, BibliographyPackage.DOCUMENT__OWNED_VERSION, BibliographyPackage.DOCUMENT_VERSION__OWNING_DOCUMENT);
		}
		return ownedVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentType getDocumentType() {
		return documentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentType(DocumentType newDocumentType) {
		DocumentType oldDocumentType = documentType;
		documentType = newDocumentType == null ? DOCUMENT_TYPE_EDEFAULT : newDocumentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BibliographyPackage.DOCUMENT__DOCUMENT_TYPE, oldDocumentType, documentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Author> getAuthor() {
		if (author == null) {
			author = new EObjectResolvingEList<Author>(Author.class, this, BibliographyPackage.DOCUMENT__AUTHOR);
		}
		return author;
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
			case BibliographyPackage.DOCUMENT__OWNED_VERSION:
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
			case BibliographyPackage.DOCUMENT__OWNED_VERSION:
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
			case BibliographyPackage.DOCUMENT__NUMBER:
				return getNumber();
			case BibliographyPackage.DOCUMENT__OWNED_VERSION:
				return getOwnedVersion();
			case BibliographyPackage.DOCUMENT__DOCUMENT_TYPE:
				return getDocumentType();
			case BibliographyPackage.DOCUMENT__AUTHOR:
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
			case BibliographyPackage.DOCUMENT__NUMBER:
				setNumber((String)newValue);
				return;
			case BibliographyPackage.DOCUMENT__OWNED_VERSION:
				getOwnedVersion().clear();
				getOwnedVersion().addAll((Collection<? extends DocumentVersion>)newValue);
				return;
			case BibliographyPackage.DOCUMENT__DOCUMENT_TYPE:
				setDocumentType((DocumentType)newValue);
				return;
			case BibliographyPackage.DOCUMENT__AUTHOR:
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
			case BibliographyPackage.DOCUMENT__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case BibliographyPackage.DOCUMENT__OWNED_VERSION:
				getOwnedVersion().clear();
				return;
			case BibliographyPackage.DOCUMENT__DOCUMENT_TYPE:
				setDocumentType(DOCUMENT_TYPE_EDEFAULT);
				return;
			case BibliographyPackage.DOCUMENT__AUTHOR:
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
			case BibliographyPackage.DOCUMENT__OWNED_MEMBER:
				return isSetOwnedMember();
			case BibliographyPackage.DOCUMENT__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case BibliographyPackage.DOCUMENT__OWNED_VERSION:
				return ownedVersion != null && !ownedVersion.isEmpty();
			case BibliographyPackage.DOCUMENT__DOCUMENT_TYPE:
				return documentType != DOCUMENT_TYPE_EDEFAULT;
			case BibliographyPackage.DOCUMENT__AUTHOR:
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
			case BibliographyPackage.DOCUMENT___OID:
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
		result.append(", documentType: ");
		result.append(documentType);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedMember() {
		return super.isSetOwnedMember()
			|| eIsSet(BibliographyPackage.DOCUMENT__OWNED_VERSION);
	}

} //DocumentImpl
