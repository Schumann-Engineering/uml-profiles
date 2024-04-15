/**
 */
package QWiki.References.impl;

import QWiki.Content.ContentPackage;
import QWiki.Content.Section;
import QWiki.QWikiElement;
import QWiki.QWikiNamedElement;
import QWiki.QWikiNamespace;
import QWiki.QWikiPackage;

import QWiki.References.Reference;
import QWiki.References.ReferenceVersion;
import QWiki.References.ReferenceVersionType;
import QWiki.References.ReferencesPackage;
import QWiki.impl.QWikiNamespaceImpl;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.References.impl.ReferenceVersionImpl#getOwningReference <em>Owning Reference</em>}</li>
 *   <li>{@link QWiki.References.impl.ReferenceVersionImpl#getPublicationYear <em>Publication Year</em>}</li>
 *   <li>{@link QWiki.References.impl.ReferenceVersionImpl#getReferenceVersionType <em>Reference Version Type</em>}</li>
 *   <li>{@link QWiki.References.impl.ReferenceVersionImpl#getEdition <em>Edition</em>}</li>
 *   <li>{@link QWiki.References.impl.ReferenceVersionImpl#getOwnedContent <em>Owned Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceVersionImpl extends QWikiNamespaceImpl implements ReferenceVersion {
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
	 * The default value of the '{@link #getReferenceVersionType() <em>Reference Version Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceVersionType()
	 * @generated
	 * @ordered
	 */
	protected static final ReferenceVersionType REFERENCE_VERSION_TYPE_EDEFAULT = ReferenceVersionType.FIRST_EDITION;

	/**
	 * The cached value of the '{@link #getReferenceVersionType() <em>Reference Version Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceVersionType()
	 * @generated
	 * @ordered
	 */
	protected ReferenceVersionType referenceVersionType = REFERENCE_VERSION_TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getOwnedContent() <em>Owned Content</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedContent()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> ownedContent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceVersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReferencesPackage.Literals.REFERENCE_VERSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencesPackage.REFERENCE_VERSION__PUBLICATION_YEAR, oldPublicationYear, publicationYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceVersionType getReferenceVersionType() {
		return referenceVersionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferenceVersionType(ReferenceVersionType newReferenceVersionType) {
		ReferenceVersionType oldReferenceVersionType = referenceVersionType;
		referenceVersionType = newReferenceVersionType == null ? REFERENCE_VERSION_TYPE_EDEFAULT : newReferenceVersionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencesPackage.REFERENCE_VERSION__REFERENCE_VERSION_TYPE, oldReferenceVersionType, referenceVersionType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencesPackage.REFERENCE_VERSION__EDITION, oldEdition, edition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Section> getOwnedContent() {
		if (ownedContent == null) {
			ownedContent = new EObjectContainmentWithInverseEList<Section>(Section.class, this, ReferencesPackage.REFERENCE_VERSION__OWNED_CONTENT, ContentPackage.SECTION__OWNING_REFERENCE_VERSION);
		}
		return ownedContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section getOwnedContent(String name) {
		return getOwnedContent(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section getOwnedContent(String name, boolean ignoreCase) {
		ownedContentLoop: for (Section ownedContent : getOwnedContent()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedContent.getName()) : name.equals(ownedContent.getName())))
				continue ownedContentLoop;
			return ownedContent;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getOwningReference() {
		if (eContainerFeatureID() != ReferencesPackage.REFERENCE_VERSION__OWNING_REFERENCE) return null;
		return (Reference)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningReference(Reference newOwningReference, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningReference, ReferencesPackage.REFERENCE_VERSION__OWNING_REFERENCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningReference(Reference newOwningReference) {
		if (newOwningReference != eInternalContainer() || (eContainerFeatureID() != ReferencesPackage.REFERENCE_VERSION__OWNING_REFERENCE && newOwningReference != null)) {
			if (EcoreUtil.isAncestor(this, newOwningReference))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningReference != null)
				msgs = ((InternalEObject)newOwningReference).eInverseAdd(this, ReferencesPackage.REFERENCE__OWNED_VERSION, Reference.class, msgs);
			msgs = basicSetOwningReference(newOwningReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencesPackage.REFERENCE_VERSION__OWNING_REFERENCE, newOwningReference, newOwningReference));
	}

	/**
	 * The cached invocation delegate for the '{@link #objectId() <em>Object Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #objectId()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate OBJECT_ID__EINVOCATION_DELEGATE = ((EOperation.Internal)ReferencesPackage.Literals.REFERENCE_VERSION___OBJECT_ID).getInvocationDelegate();

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
			case ReferencesPackage.REFERENCE_VERSION__OWNING_REFERENCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningReference((Reference)otherEnd, msgs);
			case ReferencesPackage.REFERENCE_VERSION__OWNED_CONTENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedContent()).basicAdd(otherEnd, msgs);
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
			case ReferencesPackage.REFERENCE_VERSION__OWNING_REFERENCE:
				return basicSetOwningReference(null, msgs);
			case ReferencesPackage.REFERENCE_VERSION__OWNED_CONTENT:
				return ((InternalEList<?>)getOwnedContent()).basicRemove(otherEnd, msgs);
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
			case ReferencesPackage.REFERENCE_VERSION__OWNING_REFERENCE:
				return eInternalContainer().eInverseRemove(this, ReferencesPackage.REFERENCE__OWNED_VERSION, Reference.class, msgs);
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
			case ReferencesPackage.REFERENCE_VERSION__OWNING_REFERENCE:
				return getOwningReference();
			case ReferencesPackage.REFERENCE_VERSION__PUBLICATION_YEAR:
				return getPublicationYear();
			case ReferencesPackage.REFERENCE_VERSION__REFERENCE_VERSION_TYPE:
				return getReferenceVersionType();
			case ReferencesPackage.REFERENCE_VERSION__EDITION:
				return getEdition();
			case ReferencesPackage.REFERENCE_VERSION__OWNED_CONTENT:
				return getOwnedContent();
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
			case ReferencesPackage.REFERENCE_VERSION__OWNING_REFERENCE:
				setOwningReference((Reference)newValue);
				return;
			case ReferencesPackage.REFERENCE_VERSION__PUBLICATION_YEAR:
				setPublicationYear((String)newValue);
				return;
			case ReferencesPackage.REFERENCE_VERSION__REFERENCE_VERSION_TYPE:
				setReferenceVersionType((ReferenceVersionType)newValue);
				return;
			case ReferencesPackage.REFERENCE_VERSION__EDITION:
				setEdition((String)newValue);
				return;
			case ReferencesPackage.REFERENCE_VERSION__OWNED_CONTENT:
				getOwnedContent().clear();
				getOwnedContent().addAll((Collection<? extends Section>)newValue);
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
			case ReferencesPackage.REFERENCE_VERSION__OWNING_REFERENCE:
				setOwningReference((Reference)null);
				return;
			case ReferencesPackage.REFERENCE_VERSION__PUBLICATION_YEAR:
				setPublicationYear(PUBLICATION_YEAR_EDEFAULT);
				return;
			case ReferencesPackage.REFERENCE_VERSION__REFERENCE_VERSION_TYPE:
				setReferenceVersionType(REFERENCE_VERSION_TYPE_EDEFAULT);
				return;
			case ReferencesPackage.REFERENCE_VERSION__EDITION:
				setEdition(EDITION_EDEFAULT);
				return;
			case ReferencesPackage.REFERENCE_VERSION__OWNED_CONTENT:
				getOwnedContent().clear();
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
			case ReferencesPackage.REFERENCE_VERSION__OWNING_REFERENCE:
				return getOwningReference() != null;
			case ReferencesPackage.REFERENCE_VERSION__PUBLICATION_YEAR:
				return PUBLICATION_YEAR_EDEFAULT == null ? publicationYear != null : !PUBLICATION_YEAR_EDEFAULT.equals(publicationYear);
			case ReferencesPackage.REFERENCE_VERSION__REFERENCE_VERSION_TYPE:
				return referenceVersionType != REFERENCE_VERSION_TYPE_EDEFAULT;
			case ReferencesPackage.REFERENCE_VERSION__EDITION:
				return EDITION_EDEFAULT == null ? edition != null : !EDITION_EDEFAULT.equals(edition);
			case ReferencesPackage.REFERENCE_VERSION__OWNED_CONTENT:
				return ownedContent != null && !ownedContent.isEmpty();
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
				case QWikiPackage.QWIKI_ELEMENT___OBJECT_ID: return ReferencesPackage.REFERENCE_VERSION___OBJECT_ID;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == QWikiNamedElement.class) {
			switch (baseOperationID) {
				case QWikiPackage.QWIKI_NAMED_ELEMENT___OBJECT_ID: return ReferencesPackage.REFERENCE_VERSION___OBJECT_ID;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == QWikiNamespace.class) {
			switch (baseOperationID) {
				case QWikiPackage.QWIKI_NAMESPACE___OBJECT_ID: return ReferencesPackage.REFERENCE_VERSION___OBJECT_ID;
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
			case ReferencesPackage.REFERENCE_VERSION___OBJECT_ID:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (publicationYear: ");
		result.append(publicationYear);
		result.append(", referenceVersionType: ");
		result.append(referenceVersionType);
		result.append(", edition: ");
		result.append(edition);
		result.append(')');
		return result.toString();
	}

} //ReferenceVersionImpl
