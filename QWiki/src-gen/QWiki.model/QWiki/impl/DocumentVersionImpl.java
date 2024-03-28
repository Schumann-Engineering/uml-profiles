/**
 */
package QWiki.impl;

import QWiki.Document;
import QWiki.DocumentVersion;
import QWiki.DocumentVersionType;
import QWiki.Element;
import QWiki.QWikiPackage;
import QWiki.Section;
import QWiki.SuperseedingRelationship;

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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.impl.DocumentVersionImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link QWiki.impl.DocumentVersionImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link QWiki.impl.DocumentVersionImpl#getPublicationYear <em>Publication Year</em>}</li>
 *   <li>{@link QWiki.impl.DocumentVersionImpl#getDocumentVersionType <em>Document Version Type</em>}</li>
 *   <li>{@link QWiki.impl.DocumentVersionImpl#getEdition <em>Edition</em>}</li>
 *   <li>{@link QWiki.impl.DocumentVersionImpl#getOwnedSection <em>Owned Section</em>}</li>
 *   <li>{@link QWiki.impl.DocumentVersionImpl#getSuperseedingRelationship <em>Superseeding Relationship</em>}</li>
 *   <li>{@link QWiki.impl.DocumentVersionImpl#getOwningDocument <em>Owning Document</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentVersionImpl extends ElementImpl implements DocumentVersion {
	/**
	 * The default value of the '{@link #getPublicationYear() <em>Publication Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationYear()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLICATION_YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicationYear() <em>Publication Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationYear()
	 * @generated
	 * @ordered
	 */
	protected String publicationYear = PUBLICATION_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentVersionType() <em>Document Version Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentVersionType()
	 * @generated
	 * @ordered
	 */
	protected static final DocumentVersionType DOCUMENT_VERSION_TYPE_EDEFAULT = DocumentVersionType.FIRST_EDITION;

	/**
	 * The cached value of the '{@link #getDocumentVersionType() <em>Document Version Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentVersionType()
	 * @generated
	 * @ordered
	 */
	protected DocumentVersionType documentVersionType = DOCUMENT_VERSION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEdition() <em>Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdition()
	 * @generated
	 * @ordered
	 */
	protected static final String EDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEdition() <em>Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdition()
	 * @generated
	 * @ordered
	 */
	protected String edition = EDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedSection() <em>Owned Section</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSection()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> ownedSection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentVersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QWikiPackage.Literals.DOCUMENT_VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedElement() {
		return new DerivedUnionEObjectEList<Element>(Element.class, this, QWikiPackage.DOCUMENT_VERSION__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElement() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {QWikiPackage.DOCUMENT_VERSION__OWNED_COMMENT, QWikiPackage.DOCUMENT_VERSION__OWNED_SECTION};

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
		Document owningDocument = getOwningDocument();			
		if (owningDocument != null) {
			return owningDocument;
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPublicationYear() {
		return publicationYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicationYear(String newPublicationYear) {
		String oldPublicationYear = publicationYear;
		publicationYear = newPublicationYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.DOCUMENT_VERSION__PUBLICATION_YEAR, oldPublicationYear, publicationYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentVersionType getDocumentVersionType() {
		return documentVersionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentVersionType(DocumentVersionType newDocumentVersionType) {
		DocumentVersionType oldDocumentVersionType = documentVersionType;
		documentVersionType = newDocumentVersionType == null ? DOCUMENT_VERSION_TYPE_EDEFAULT : newDocumentVersionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.DOCUMENT_VERSION__DOCUMENT_VERSION_TYPE, oldDocumentVersionType, documentVersionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEdition() {
		return edition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEdition(String newEdition) {
		String oldEdition = edition;
		edition = newEdition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.DOCUMENT_VERSION__EDITION, oldEdition, edition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Section> getOwnedSection() {
		if (ownedSection == null) {
			ownedSection = new EObjectContainmentWithInverseEList<Section>(Section.class, this, QWikiPackage.DOCUMENT_VERSION__OWNED_SECTION, QWikiPackage.SECTION__OWNING_DOCUMENT);
		}
		return ownedSection;
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
	public Document getOwningDocument() {
		if (eContainerFeatureID() != QWikiPackage.DOCUMENT_VERSION__OWNING_DOCUMENT) return null;
		return (Document)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningDocument(Document newOwningDocument, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningDocument, QWikiPackage.DOCUMENT_VERSION__OWNING_DOCUMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningDocument(Document newOwningDocument) {
		if (newOwningDocument != eInternalContainer() || (eContainerFeatureID() != QWikiPackage.DOCUMENT_VERSION__OWNING_DOCUMENT && newOwningDocument != null)) {
			if (EcoreUtil.isAncestor(this, newOwningDocument))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningDocument != null)
				msgs = ((InternalEObject)newOwningDocument).eInverseAdd(this, QWikiPackage.DOCUMENT__OWNED_VERSION, Document.class, msgs);
			msgs = basicSetOwningDocument(newOwningDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.DOCUMENT_VERSION__OWNING_DOCUMENT, newOwningDocument, newOwningDocument));
	}

	/**
	 * The cached invocation delegate for the '{@link #oid() <em>Oid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #oid()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate OID__EINVOCATION_DELEGATE = ((EOperation.Internal)QWikiPackage.Literals.ELEMENT___OID).getInvocationDelegate();

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
			case QWikiPackage.DOCUMENT_VERSION__OWNED_SECTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedSection()).basicAdd(otherEnd, msgs);
			case QWikiPackage.DOCUMENT_VERSION__OWNING_DOCUMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningDocument((Document)otherEnd, msgs);
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
			case QWikiPackage.DOCUMENT_VERSION__OWNED_SECTION:
				return ((InternalEList<?>)getOwnedSection()).basicRemove(otherEnd, msgs);
			case QWikiPackage.DOCUMENT_VERSION__OWNING_DOCUMENT:
				return basicSetOwningDocument(null, msgs);
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
			case QWikiPackage.DOCUMENT_VERSION__OWNING_DOCUMENT:
				return eInternalContainer().eInverseRemove(this, QWikiPackage.DOCUMENT__OWNED_VERSION, Document.class, msgs);
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
			case QWikiPackage.DOCUMENT_VERSION__PUBLICATION_YEAR:
				return getPublicationYear();
			case QWikiPackage.DOCUMENT_VERSION__DOCUMENT_VERSION_TYPE:
				return getDocumentVersionType();
			case QWikiPackage.DOCUMENT_VERSION__EDITION:
				return getEdition();
			case QWikiPackage.DOCUMENT_VERSION__OWNED_SECTION:
				return getOwnedSection();
			case QWikiPackage.DOCUMENT_VERSION__SUPERSEEDING_RELATIONSHIP:
				return getSuperseedingRelationship();
			case QWikiPackage.DOCUMENT_VERSION__OWNING_DOCUMENT:
				return getOwningDocument();
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
			case QWikiPackage.DOCUMENT_VERSION__PUBLICATION_YEAR:
				setPublicationYear((String)newValue);
				return;
			case QWikiPackage.DOCUMENT_VERSION__DOCUMENT_VERSION_TYPE:
				setDocumentVersionType((DocumentVersionType)newValue);
				return;
			case QWikiPackage.DOCUMENT_VERSION__EDITION:
				setEdition((String)newValue);
				return;
			case QWikiPackage.DOCUMENT_VERSION__OWNED_SECTION:
				getOwnedSection().clear();
				getOwnedSection().addAll((Collection<? extends Section>)newValue);
				return;
			case QWikiPackage.DOCUMENT_VERSION__OWNING_DOCUMENT:
				setOwningDocument((Document)newValue);
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
			case QWikiPackage.DOCUMENT_VERSION__PUBLICATION_YEAR:
				setPublicationYear(PUBLICATION_YEAR_EDEFAULT);
				return;
			case QWikiPackage.DOCUMENT_VERSION__DOCUMENT_VERSION_TYPE:
				setDocumentVersionType(DOCUMENT_VERSION_TYPE_EDEFAULT);
				return;
			case QWikiPackage.DOCUMENT_VERSION__EDITION:
				setEdition(EDITION_EDEFAULT);
				return;
			case QWikiPackage.DOCUMENT_VERSION__OWNED_SECTION:
				getOwnedSection().clear();
				return;
			case QWikiPackage.DOCUMENT_VERSION__OWNING_DOCUMENT:
				setOwningDocument((Document)null);
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
			case QWikiPackage.DOCUMENT_VERSION__OWNED_ELEMENT:
				return isSetOwnedElement();
			case QWikiPackage.DOCUMENT_VERSION__OWNER:
				return isSetOwner();
			case QWikiPackage.DOCUMENT_VERSION__PUBLICATION_YEAR:
				return PUBLICATION_YEAR_EDEFAULT == null ? publicationYear != null : !PUBLICATION_YEAR_EDEFAULT.equals(publicationYear);
			case QWikiPackage.DOCUMENT_VERSION__DOCUMENT_VERSION_TYPE:
				return documentVersionType != DOCUMENT_VERSION_TYPE_EDEFAULT;
			case QWikiPackage.DOCUMENT_VERSION__EDITION:
				return EDITION_EDEFAULT == null ? edition != null : !EDITION_EDEFAULT.equals(edition);
			case QWikiPackage.DOCUMENT_VERSION__OWNED_SECTION:
				return ownedSection != null && !ownedSection.isEmpty();
			case QWikiPackage.DOCUMENT_VERSION__SUPERSEEDING_RELATIONSHIP:
				return !getSuperseedingRelationship().isEmpty();
			case QWikiPackage.DOCUMENT_VERSION__OWNING_DOCUMENT:
				return getOwningDocument() != null;
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
			case QWikiPackage.DOCUMENT_VERSION___OID:
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
		result.append(" (publicationYear: ");
		result.append(publicationYear);
		result.append(", documentVersionType: ");
		result.append(documentVersionType);
		result.append(", edition: ");
		result.append(edition);
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
			|| eIsSet(QWikiPackage.DOCUMENT_VERSION__OWNED_SECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(QWikiPackage.DOCUMENT_VERSION__OWNING_DOCUMENT);
	}

} //DocumentVersionImpl
