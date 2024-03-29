/**
 */
package QWiki.Bibliography.impl;

import QWiki.Bibliography.BibliographyPackage;
import QWiki.Bibliography.DocumentVersion;
import QWiki.Bibliography.Section;

import QWiki.Glossary.GlossaryPackage;
import QWiki.Glossary.GlossaryTerm;

import QWiki.Infrastructure.UmlElement;
import QWiki.Infrastructure.UmlNamedElement;
import QWiki.Infrastructure.UmlNamespace;

import QWiki.Infrastructure.impl.UmlNamespaceImpl;

import QWiki.Kernel.KernelPackage;

import QWiki.SPICE.SPICEPackage;
import QWiki.SPICE.SpiceElement;

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
 *   <li>{@link QWiki.Bibliography.impl.SectionImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link QWiki.Bibliography.impl.SectionImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link QWiki.Bibliography.impl.SectionImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link QWiki.Bibliography.impl.SectionImpl#getFacilitatingElement <em>Facilitating Element</em>}</li>
 *   <li>{@link QWiki.Bibliography.impl.SectionImpl#getOwningDocument <em>Owning Document</em>}</li>
 *   <li>{@link QWiki.Bibliography.impl.SectionImpl#getOwnedSection <em>Owned Section</em>}</li>
 *   <li>{@link QWiki.Bibliography.impl.SectionImpl#getOwningSection <em>Owning Section</em>}</li>
 *   <li>{@link QWiki.Bibliography.impl.SectionImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link QWiki.Bibliography.impl.SectionImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link QWiki.Bibliography.impl.SectionImpl#getFacilitatingSpiceElement <em>Facilitating Spice Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionImpl extends UmlNamespaceImpl implements Section {
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
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected EList<GlossaryTerm> term;

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
		return BibliographyPackage.Literals.SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UmlNamespace getNamespace() {
		UmlNamespace namespace = basicGetNamespace();
		return namespace != null && namespace.eIsProxy() ? (UmlNamespace)eResolveProxy((InternalEObject)namespace) : namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UmlNamespace basicGetNamespace() {
		DocumentVersion owningDocument = getOwningDocument();			
		if (owningDocument != null) {
			return owningDocument;
		}
		return super.basicGetNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UmlNamedElement> getOwnedMember() {
		return new DerivedUnionEObjectEList<UmlNamedElement>(UmlNamedElement.class, this, BibliographyPackage.SECTION__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMember() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMember()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[] {BibliographyPackage.SECTION__OWNED_SECTION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UmlElement getOwner() {
		UmlElement owner = basicGetOwner();
		return owner != null && owner.eIsProxy() ? (UmlElement)eResolveProxy((InternalEObject)owner) : owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UmlElement basicGetOwner() {
		Section owningSection = getOwningSection();			
		if (owningSection != null) {
			return owningSection;
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UmlElement> getFacilitatingElement() {
		return new DerivedUnionEObjectEList<UmlElement>(UmlElement.class, this, BibliographyPackage.SECTION__FACILITATING_ELEMENT, FACILITATING_ELEMENT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getFacilitatingElement() <em>Facilitating Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitatingElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] FACILITATING_ELEMENT_ESUBSETS = new int[] {BibliographyPackage.SECTION__FACILITATING_SPICE_ELEMENT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentVersion getOwningDocument() {
		if (eContainerFeatureID() != BibliographyPackage.SECTION__OWNING_DOCUMENT) return null;
		return (DocumentVersion)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningDocument(DocumentVersion newOwningDocument, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningDocument, BibliographyPackage.SECTION__OWNING_DOCUMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningDocument(DocumentVersion newOwningDocument) {
		if (newOwningDocument != eInternalContainer() || (eContainerFeatureID() != BibliographyPackage.SECTION__OWNING_DOCUMENT && newOwningDocument != null)) {
			if (EcoreUtil.isAncestor(this, newOwningDocument))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningDocument != null)
				msgs = ((InternalEObject)newOwningDocument).eInverseAdd(this, BibliographyPackage.DOCUMENT_VERSION__OWNED_SECTION, DocumentVersion.class, msgs);
			msgs = basicSetOwningDocument(newOwningDocument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BibliographyPackage.SECTION__OWNING_DOCUMENT, newOwningDocument, newOwningDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Section> getOwnedSection() {
		if (ownedSection == null) {
			ownedSection = new EObjectContainmentWithInverseEList<Section>(Section.class, this, BibliographyPackage.SECTION__OWNED_SECTION, BibliographyPackage.SECTION__OWNING_SECTION);
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
		if (eContainerFeatureID() != BibliographyPackage.SECTION__OWNING_SECTION) return null;
		return (Section)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningSection(Section newOwningSection, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningSection, BibliographyPackage.SECTION__OWNING_SECTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningSection(Section newOwningSection) {
		if (newOwningSection != eInternalContainer() || (eContainerFeatureID() != BibliographyPackage.SECTION__OWNING_SECTION && newOwningSection != null)) {
			if (EcoreUtil.isAncestor(this, newOwningSection))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningSection != null)
				msgs = ((InternalEObject)newOwningSection).eInverseAdd(this, BibliographyPackage.SECTION__OWNED_SECTION, Section.class, msgs);
			msgs = basicSetOwningSection(newOwningSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BibliographyPackage.SECTION__OWNING_SECTION, newOwningSection, newOwningSection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BibliographyPackage.SECTION__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GlossaryTerm> getTerm() {
		if (term == null) {
			term = new EObjectWithInverseResolvingEList.ManyInverse<GlossaryTerm>(GlossaryTerm.class, this, BibliographyPackage.SECTION__TERM, GlossaryPackage.GLOSSARY_TERM__EXTERNAL_TERM_DEFINITION);
		}
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpiceElement> getFacilitatingSpiceElement() {
		if (facilitatingSpiceElement == null) {
			facilitatingSpiceElement = new EObjectWithInverseResolvingEList.ManyInverse<SpiceElement>(SpiceElement.class, this, BibliographyPackage.SECTION__FACILITATING_SPICE_ELEMENT, SPICEPackage.SPICE_ELEMENT__FACILITATED_SECTION);
		}
		return facilitatingSpiceElement;
	}

	/**
	 * The cached invocation delegate for the '{@link #documentVersion() <em>Document Version</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #documentVersion()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DOCUMENT_VERSION__EINVOCATION_DELEGATE = ((EOperation.Internal)BibliographyPackage.Literals.SECTION___DOCUMENT_VERSION).getInvocationDelegate();

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
	protected static final EOperation.Internal.InvocationDelegate QUALIFIED_NUMBER__EINVOCATION_DELEGATE = ((EOperation.Internal)BibliographyPackage.Literals.SECTION___QUALIFIED_NUMBER).getInvocationDelegate();

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
			case BibliographyPackage.SECTION__OWNING_DOCUMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningDocument((DocumentVersion)otherEnd, msgs);
			case BibliographyPackage.SECTION__OWNED_SECTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedSection()).basicAdd(otherEnd, msgs);
			case BibliographyPackage.SECTION__OWNING_SECTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningSection((Section)otherEnd, msgs);
			case BibliographyPackage.SECTION__TERM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTerm()).basicAdd(otherEnd, msgs);
			case BibliographyPackage.SECTION__FACILITATING_SPICE_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFacilitatingSpiceElement()).basicAdd(otherEnd, msgs);
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
			case BibliographyPackage.SECTION__OWNING_DOCUMENT:
				return basicSetOwningDocument(null, msgs);
			case BibliographyPackage.SECTION__OWNED_SECTION:
				return ((InternalEList<?>)getOwnedSection()).basicRemove(otherEnd, msgs);
			case BibliographyPackage.SECTION__OWNING_SECTION:
				return basicSetOwningSection(null, msgs);
			case BibliographyPackage.SECTION__TERM:
				return ((InternalEList<?>)getTerm()).basicRemove(otherEnd, msgs);
			case BibliographyPackage.SECTION__FACILITATING_SPICE_ELEMENT:
				return ((InternalEList<?>)getFacilitatingSpiceElement()).basicRemove(otherEnd, msgs);
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
			case BibliographyPackage.SECTION__OWNING_DOCUMENT:
				return eInternalContainer().eInverseRemove(this, BibliographyPackage.DOCUMENT_VERSION__OWNED_SECTION, DocumentVersion.class, msgs);
			case BibliographyPackage.SECTION__OWNING_SECTION:
				return eInternalContainer().eInverseRemove(this, BibliographyPackage.SECTION__OWNED_SECTION, Section.class, msgs);
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
			case BibliographyPackage.SECTION__FACILITATING_ELEMENT:
				return getFacilitatingElement();
			case BibliographyPackage.SECTION__OWNING_DOCUMENT:
				return getOwningDocument();
			case BibliographyPackage.SECTION__OWNED_SECTION:
				return getOwnedSection();
			case BibliographyPackage.SECTION__OWNING_SECTION:
				return getOwningSection();
			case BibliographyPackage.SECTION__NUMBER:
				return getNumber();
			case BibliographyPackage.SECTION__TERM:
				return getTerm();
			case BibliographyPackage.SECTION__FACILITATING_SPICE_ELEMENT:
				return getFacilitatingSpiceElement();
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
			case BibliographyPackage.SECTION__OWNING_DOCUMENT:
				setOwningDocument((DocumentVersion)newValue);
				return;
			case BibliographyPackage.SECTION__OWNED_SECTION:
				getOwnedSection().clear();
				getOwnedSection().addAll((Collection<? extends Section>)newValue);
				return;
			case BibliographyPackage.SECTION__OWNING_SECTION:
				setOwningSection((Section)newValue);
				return;
			case BibliographyPackage.SECTION__NUMBER:
				setNumber((String)newValue);
				return;
			case BibliographyPackage.SECTION__TERM:
				getTerm().clear();
				getTerm().addAll((Collection<? extends GlossaryTerm>)newValue);
				return;
			case BibliographyPackage.SECTION__FACILITATING_SPICE_ELEMENT:
				getFacilitatingSpiceElement().clear();
				getFacilitatingSpiceElement().addAll((Collection<? extends SpiceElement>)newValue);
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
			case BibliographyPackage.SECTION__OWNING_DOCUMENT:
				setOwningDocument((DocumentVersion)null);
				return;
			case BibliographyPackage.SECTION__OWNED_SECTION:
				getOwnedSection().clear();
				return;
			case BibliographyPackage.SECTION__OWNING_SECTION:
				setOwningSection((Section)null);
				return;
			case BibliographyPackage.SECTION__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case BibliographyPackage.SECTION__TERM:
				getTerm().clear();
				return;
			case BibliographyPackage.SECTION__FACILITATING_SPICE_ELEMENT:
				getFacilitatingSpiceElement().clear();
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
			case BibliographyPackage.SECTION__NAMESPACE:
				return isSetNamespace();
			case BibliographyPackage.SECTION__OWNED_MEMBER:
				return isSetOwnedMember();
			case BibliographyPackage.SECTION__OWNER:
				return isSetOwner();
			case BibliographyPackage.SECTION__FACILITATING_ELEMENT:
				return isSetFacilitatingElement();
			case BibliographyPackage.SECTION__OWNING_DOCUMENT:
				return getOwningDocument() != null;
			case BibliographyPackage.SECTION__OWNED_SECTION:
				return ownedSection != null && !ownedSection.isEmpty();
			case BibliographyPackage.SECTION__OWNING_SECTION:
				return getOwningSection() != null;
			case BibliographyPackage.SECTION__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case BibliographyPackage.SECTION__TERM:
				return term != null && !term.isEmpty();
			case BibliographyPackage.SECTION__FACILITATING_SPICE_ELEMENT:
				return facilitatingSpiceElement != null && !facilitatingSpiceElement.isEmpty();
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
			case BibliographyPackage.SECTION___DOCUMENT_VERSION:
				return documentVersion();
			case BibliographyPackage.SECTION___QUALIFIED_NUMBER:
				return qualifiedNumber();
			case BibliographyPackage.SECTION___OID:
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
	public boolean isSetNamespace() {
		return super.isSetNamespace()
			|| eIsSet(BibliographyPackage.SECTION__OWNING_DOCUMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedMember() {
		return super.isSetOwnedMember()
			|| eIsSet(BibliographyPackage.SECTION__OWNED_SECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(BibliographyPackage.SECTION__OWNING_SECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFacilitatingElement() {
		return eIsSet(BibliographyPackage.SECTION__FACILITATING_SPICE_ELEMENT);
	}

} //SectionImpl
