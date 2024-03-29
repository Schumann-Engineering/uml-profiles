/**
 */
package QWiki.impl;

import QWiki.Author;
import QWiki.Document;
import QWiki.DocumentType;
import QWiki.DocumentVersion;
import QWiki.QWikiPackage;
import QWiki.SuperseedingRelationship;
import QWiki.UmlElement;

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
 *   <li>{@link QWiki.impl.DocumentImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link QWiki.impl.DocumentImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link QWiki.impl.DocumentImpl#getOwnedVersion <em>Owned Version</em>}</li>
 *   <li>{@link QWiki.impl.DocumentImpl#getSuperseedingRelationship <em>Superseeding Relationship</em>}</li>
 *   <li>{@link QWiki.impl.DocumentImpl#getDocumentType <em>Document Type</em>}</li>
 *   <li>{@link QWiki.impl.DocumentImpl#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentImpl extends I18nDescriptiveElementImpl implements Document {
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
		return QWikiPackage.Literals.DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UmlElement> getOwnedElement() {
		return new DerivedUnionEObjectEList<UmlElement>(UmlElement.class, this, QWikiPackage.DOCUMENT__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElement() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {QWikiPackage.DOCUMENT__OWNED_COMMENT, QWikiPackage.DOCUMENT__OWNED_VERSION};

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
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.DOCUMENT__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DocumentVersion> getOwnedVersion() {
		if (ownedVersion == null) {
			ownedVersion = new EObjectContainmentWithInverseEList<DocumentVersion>(DocumentVersion.class, this, QWikiPackage.DOCUMENT__OWNED_VERSION, QWikiPackage.DOCUMENT_VERSION__OWNING_DOCUMENT);
		}
		return ownedVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SuperseedingRelationship> getSuperseedingRelationship() {
		// TODO: implement this method to return the 'Superseeding Relationship' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.DOCUMENT__DOCUMENT_TYPE, oldDocumentType, documentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Author> getAuthor() {
		if (author == null) {
			author = new EObjectResolvingEList<Author>(Author.class, this, QWikiPackage.DOCUMENT__AUTHOR);
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
	protected static final EOperation.Internal.InvocationDelegate OID__EINVOCATION_DELEGATE = ((EOperation.Internal)QWikiPackage.Literals.MODEL_ELEMENT___OID).getInvocationDelegate();

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
			case QWikiPackage.DOCUMENT__OWNED_VERSION:
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
			case QWikiPackage.DOCUMENT__OWNED_VERSION:
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
			case QWikiPackage.DOCUMENT__NUMBER:
				return getNumber();
			case QWikiPackage.DOCUMENT__OWNED_VERSION:
				return getOwnedVersion();
			case QWikiPackage.DOCUMENT__SUPERSEEDING_RELATIONSHIP:
				return getSuperseedingRelationship();
			case QWikiPackage.DOCUMENT__DOCUMENT_TYPE:
				return getDocumentType();
			case QWikiPackage.DOCUMENT__AUTHOR:
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
			case QWikiPackage.DOCUMENT__NUMBER:
				setNumber((String)newValue);
				return;
			case QWikiPackage.DOCUMENT__OWNED_VERSION:
				getOwnedVersion().clear();
				getOwnedVersion().addAll((Collection<? extends DocumentVersion>)newValue);
				return;
			case QWikiPackage.DOCUMENT__DOCUMENT_TYPE:
				setDocumentType((DocumentType)newValue);
				return;
			case QWikiPackage.DOCUMENT__AUTHOR:
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
			case QWikiPackage.DOCUMENT__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case QWikiPackage.DOCUMENT__OWNED_VERSION:
				getOwnedVersion().clear();
				return;
			case QWikiPackage.DOCUMENT__DOCUMENT_TYPE:
				setDocumentType(DOCUMENT_TYPE_EDEFAULT);
				return;
			case QWikiPackage.DOCUMENT__AUTHOR:
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
			case QWikiPackage.DOCUMENT__OWNED_ELEMENT:
				return isSetOwnedElement();
			case QWikiPackage.DOCUMENT__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case QWikiPackage.DOCUMENT__OWNED_VERSION:
				return ownedVersion != null && !ownedVersion.isEmpty();
			case QWikiPackage.DOCUMENT__SUPERSEEDING_RELATIONSHIP:
				return !getSuperseedingRelationship().isEmpty();
			case QWikiPackage.DOCUMENT__DOCUMENT_TYPE:
				return documentType != DOCUMENT_TYPE_EDEFAULT;
			case QWikiPackage.DOCUMENT__AUTHOR:
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
			case QWikiPackage.DOCUMENT___OID:
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
	public boolean isSetOwnedElement() {
		return super.isSetOwnedElement()
			|| eIsSet(QWikiPackage.DOCUMENT__OWNED_VERSION);
	}

} //DocumentImpl
