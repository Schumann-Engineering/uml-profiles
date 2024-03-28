/**
 */
package QWiki.impl;

import QWiki.DocumentVersion;
import QWiki.Element;
import QWiki.QWikiPackage;
import QWiki.Section;
import QWiki.SpiceElement;
import QWiki.SuperseedingRelationship;
import QWiki.Term;

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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.impl.SectionImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link QWiki.impl.SectionImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link QWiki.impl.SectionImpl#getFacilitatingElement <em>Facilitating Element</em>}</li>
 *   <li>{@link QWiki.impl.SectionImpl#getOwnedSection <em>Owned Section</em>}</li>
 *   <li>{@link QWiki.impl.SectionImpl#getOwningSection <em>Owning Section</em>}</li>
 *   <li>{@link QWiki.impl.SectionImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link QWiki.impl.SectionImpl#getFacilitatingSpiceElement <em>Facilitating Spice Element</em>}</li>
 *   <li>{@link QWiki.impl.SectionImpl#getSuperseedingRelationship <em>Superseeding Relationship</em>}</li>
 *   <li>{@link QWiki.impl.SectionImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link QWiki.impl.SectionImpl#getOwningDocument <em>Owning Document</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionImpl extends I18nDescriptiveElementImpl implements Section {
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
	 * The cached value of the '{@link #getFacilitatingSpiceElement() <em>Facilitating Spice Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitatingSpiceElement()
	 * @generated
	 * @ordered
	 */
	protected EList<SpiceElement> facilitatingSpiceElement;

	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected EList<Term> term;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QWikiPackage.Literals.SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedElement() {
		return new DerivedUnionEObjectEList<Element>(Element.class, this, QWikiPackage.SECTION__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElement() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {QWikiPackage.SECTION__OWNED_COMMENT, QWikiPackage.SECTION__OWNED_SECTION};

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
		Section owningSection = getOwningSection();			
		if (owningSection != null) {
			return owningSection;
		}
		DocumentVersion owningDocument = getOwningDocument();			
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
	public EList<Element> getFacilitatingElement() {
		return new DerivedUnionEObjectEList<Element>(Element.class, this, QWikiPackage.SECTION__FACILITATING_ELEMENT, FACILITATING_ELEMENT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getFacilitatingElement() <em>Facilitating Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitatingElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] FACILITATING_ELEMENT_ESUBSETS = new int[] {QWikiPackage.SECTION__FACILITATING_SPICE_ELEMENT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Section> getOwnedSection() {
		if (ownedSection == null) {
			ownedSection = new EObjectContainmentWithInverseEList<Section>(Section.class, this, QWikiPackage.SECTION__OWNED_SECTION, QWikiPackage.SECTION__OWNING_SECTION);
		}
		return ownedSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Section getOwningSection() {
		if (eContainerFeatureID() != QWikiPackage.SECTION__OWNING_SECTION) return null;
		return (Section)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningSection(Section newOwningSection, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningSection, QWikiPackage.SECTION__OWNING_SECTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningSection(Section newOwningSection) {
		if (newOwningSection != eInternalContainer() || (eContainerFeatureID() != QWikiPackage.SECTION__OWNING_SECTION && newOwningSection != null)) {
			if (EcoreUtil.isAncestor(this, newOwningSection))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningSection != null)
				msgs = ((InternalEObject)newOwningSection).eInverseAdd(this, QWikiPackage.SECTION__OWNED_SECTION, Section.class, msgs);
			msgs = basicSetOwningSection(newOwningSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.SECTION__OWNING_SECTION, newOwningSection, newOwningSection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.SECTION__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpiceElement> getFacilitatingSpiceElement() {
		if (facilitatingSpiceElement == null) {
			facilitatingSpiceElement = new EObjectWithInverseResolvingEList.ManyInverse<SpiceElement>(SpiceElement.class, this, QWikiPackage.SECTION__FACILITATING_SPICE_ELEMENT, QWikiPackage.SPICE_ELEMENT__FACILITATED_SECTION);
		}
		return facilitatingSpiceElement;
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
	public EList<Term> getTerm() {
		if (term == null) {
			term = new EObjectWithInverseResolvingEList.ManyInverse<Term>(Term.class, this, QWikiPackage.SECTION__TERM, QWikiPackage.TERM__EXTERNAL_TERM_DEFINITION);
		}
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentVersion getOwningDocument() {
		if (eContainerFeatureID() != QWikiPackage.SECTION__OWNING_DOCUMENT) return null;
		return (DocumentVersion)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningDocument(DocumentVersion newOwningDocument, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningDocument, QWikiPackage.SECTION__OWNING_DOCUMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningDocument(DocumentVersion newOwningDocument) {
		if (newOwningDocument != eInternalContainer() || (eContainerFeatureID() != QWikiPackage.SECTION__OWNING_DOCUMENT && newOwningDocument != null)) {
			if (EcoreUtil.isAncestor(this, newOwningDocument))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningDocument != null)
				msgs = ((InternalEObject)newOwningDocument).eInverseAdd(this, QWikiPackage.DOCUMENT_VERSION__OWNED_SECTION, DocumentVersion.class, msgs);
			msgs = basicSetOwningDocument(newOwningDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.SECTION__OWNING_DOCUMENT, newOwningDocument, newOwningDocument));
	}

	/**
	 * The cached invocation delegate for the '{@link #documentVersion() <em>Document Version</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #documentVersion()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DOCUMENT_VERSION__EINVOCATION_DELEGATE = ((EOperation.Internal)QWikiPackage.Literals.SECTION___DOCUMENT_VERSION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentVersion documentVersion() {
		try {
			return (DocumentVersion)DOCUMENT_VERSION__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #qualifiedNumber() <em>Qualified Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #qualifiedNumber()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate QUALIFIED_NUMBER__EINVOCATION_DELEGATE = ((EOperation.Internal)QWikiPackage.Literals.SECTION___QUALIFIED_NUMBER).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String qualifiedNumber() {
		try {
			return (String)QUALIFIED_NUMBER__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
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
			case QWikiPackage.SECTION__OWNED_SECTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedSection()).basicAdd(otherEnd, msgs);
			case QWikiPackage.SECTION__OWNING_SECTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningSection((Section)otherEnd, msgs);
			case QWikiPackage.SECTION__FACILITATING_SPICE_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFacilitatingSpiceElement()).basicAdd(otherEnd, msgs);
			case QWikiPackage.SECTION__TERM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTerm()).basicAdd(otherEnd, msgs);
			case QWikiPackage.SECTION__OWNING_DOCUMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningDocument((DocumentVersion)otherEnd, msgs);
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
			case QWikiPackage.SECTION__OWNED_SECTION:
				return ((InternalEList<?>)getOwnedSection()).basicRemove(otherEnd, msgs);
			case QWikiPackage.SECTION__OWNING_SECTION:
				return basicSetOwningSection(null, msgs);
			case QWikiPackage.SECTION__FACILITATING_SPICE_ELEMENT:
				return ((InternalEList<?>)getFacilitatingSpiceElement()).basicRemove(otherEnd, msgs);
			case QWikiPackage.SECTION__TERM:
				return ((InternalEList<?>)getTerm()).basicRemove(otherEnd, msgs);
			case QWikiPackage.SECTION__OWNING_DOCUMENT:
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
			case QWikiPackage.SECTION__OWNING_SECTION:
				return eInternalContainer().eInverseRemove(this, QWikiPackage.SECTION__OWNED_SECTION, Section.class, msgs);
			case QWikiPackage.SECTION__OWNING_DOCUMENT:
				return eInternalContainer().eInverseRemove(this, QWikiPackage.DOCUMENT_VERSION__OWNED_SECTION, DocumentVersion.class, msgs);
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
			case QWikiPackage.SECTION__FACILITATING_ELEMENT:
				return getFacilitatingElement();
			case QWikiPackage.SECTION__OWNED_SECTION:
				return getOwnedSection();
			case QWikiPackage.SECTION__OWNING_SECTION:
				return getOwningSection();
			case QWikiPackage.SECTION__NUMBER:
				return getNumber();
			case QWikiPackage.SECTION__FACILITATING_SPICE_ELEMENT:
				return getFacilitatingSpiceElement();
			case QWikiPackage.SECTION__SUPERSEEDING_RELATIONSHIP:
				return getSuperseedingRelationship();
			case QWikiPackage.SECTION__TERM:
				return getTerm();
			case QWikiPackage.SECTION__OWNING_DOCUMENT:
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
			case QWikiPackage.SECTION__OWNED_SECTION:
				getOwnedSection().clear();
				getOwnedSection().addAll((Collection<? extends Section>)newValue);
				return;
			case QWikiPackage.SECTION__OWNING_SECTION:
				setOwningSection((Section)newValue);
				return;
			case QWikiPackage.SECTION__NUMBER:
				setNumber((String)newValue);
				return;
			case QWikiPackage.SECTION__FACILITATING_SPICE_ELEMENT:
				getFacilitatingSpiceElement().clear();
				getFacilitatingSpiceElement().addAll((Collection<? extends SpiceElement>)newValue);
				return;
			case QWikiPackage.SECTION__TERM:
				getTerm().clear();
				getTerm().addAll((Collection<? extends Term>)newValue);
				return;
			case QWikiPackage.SECTION__OWNING_DOCUMENT:
				setOwningDocument((DocumentVersion)newValue);
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
			case QWikiPackage.SECTION__OWNED_SECTION:
				getOwnedSection().clear();
				return;
			case QWikiPackage.SECTION__OWNING_SECTION:
				setOwningSection((Section)null);
				return;
			case QWikiPackage.SECTION__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case QWikiPackage.SECTION__FACILITATING_SPICE_ELEMENT:
				getFacilitatingSpiceElement().clear();
				return;
			case QWikiPackage.SECTION__TERM:
				getTerm().clear();
				return;
			case QWikiPackage.SECTION__OWNING_DOCUMENT:
				setOwningDocument((DocumentVersion)null);
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
			case QWikiPackage.SECTION__OWNED_ELEMENT:
				return isSetOwnedElement();
			case QWikiPackage.SECTION__OWNER:
				return isSetOwner();
			case QWikiPackage.SECTION__FACILITATING_ELEMENT:
				return isSetFacilitatingElement();
			case QWikiPackage.SECTION__OWNED_SECTION:
				return ownedSection != null && !ownedSection.isEmpty();
			case QWikiPackage.SECTION__OWNING_SECTION:
				return getOwningSection() != null;
			case QWikiPackage.SECTION__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case QWikiPackage.SECTION__FACILITATING_SPICE_ELEMENT:
				return facilitatingSpiceElement != null && !facilitatingSpiceElement.isEmpty();
			case QWikiPackage.SECTION__SUPERSEEDING_RELATIONSHIP:
				return !getSuperseedingRelationship().isEmpty();
			case QWikiPackage.SECTION__TERM:
				return term != null && !term.isEmpty();
			case QWikiPackage.SECTION__OWNING_DOCUMENT:
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
			case QWikiPackage.SECTION___DOCUMENT_VERSION:
				return documentVersion();
			case QWikiPackage.SECTION___QUALIFIED_NUMBER:
				return qualifiedNumber();
			case QWikiPackage.SECTION___OID:
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
			|| eIsSet(QWikiPackage.SECTION__OWNED_SECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(QWikiPackage.SECTION__OWNING_SECTION)
			|| eIsSet(QWikiPackage.SECTION__OWNING_DOCUMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFacilitatingElement() {
		return eIsSet(QWikiPackage.SECTION__FACILITATING_SPICE_ELEMENT);
	}

} //SectionImpl
