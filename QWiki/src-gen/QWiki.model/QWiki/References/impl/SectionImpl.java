/**
 */
package QWiki.References.impl;

import QWiki.Glossary.GlossaryPackage;
import QWiki.Glossary.GlossaryTerm;

import QWiki.Kernel.QWikiElement;

import QWiki.Kernel.impl.QWikiNamespaceImpl;

import QWiki.References.ReferenceVersion;
import QWiki.References.ReferencesPackage;
import QWiki.References.Section;

import QWiki.Spice.SPICEPackage;
import QWiki.Spice.SpiceElement;

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
 *   <li>{@link QWiki.References.impl.SectionImpl#getFacilitatingElement <em>Facilitating Element</em>}</li>
 *   <li>{@link QWiki.References.impl.SectionImpl#getOwningReferenceVersion <em>Owning Reference Version</em>}</li>
 *   <li>{@link QWiki.References.impl.SectionImpl#getOwnedSection <em>Owned Section</em>}</li>
 *   <li>{@link QWiki.References.impl.SectionImpl#getOwningSection <em>Owning Section</em>}</li>
 *   <li>{@link QWiki.References.impl.SectionImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link QWiki.References.impl.SectionImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link QWiki.References.impl.SectionImpl#getFacilitatingSpiceElement <em>Facilitating Spice Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionImpl extends QWikiNamespaceImpl implements Section {
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
		return ReferencesPackage.Literals.SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QWikiElement> getFacilitatingElement() {
		return new DerivedUnionEObjectEList<QWikiElement>(QWikiElement.class, this, ReferencesPackage.SECTION__FACILITATING_ELEMENT, FACILITATING_ELEMENT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getFacilitatingElement() <em>Facilitating Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitatingElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] FACILITATING_ELEMENT_ESUBSETS = new int[] {ReferencesPackage.SECTION__FACILITATING_SPICE_ELEMENT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceVersion getOwningReferenceVersion() {
		if (eContainerFeatureID() != ReferencesPackage.SECTION__OWNING_REFERENCE_VERSION) return null;
		return (ReferenceVersion)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningReferenceVersion(ReferenceVersion newOwningReferenceVersion, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningReferenceVersion, ReferencesPackage.SECTION__OWNING_REFERENCE_VERSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningReferenceVersion(ReferenceVersion newOwningReferenceVersion) {
		if (newOwningReferenceVersion != eInternalContainer() || (eContainerFeatureID() != ReferencesPackage.SECTION__OWNING_REFERENCE_VERSION && newOwningReferenceVersion != null)) {
			if (EcoreUtil.isAncestor(this, newOwningReferenceVersion))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningReferenceVersion != null)
				msgs = ((InternalEObject)newOwningReferenceVersion).eInverseAdd(this, ReferencesPackage.REFERENCE_VERSION__OWNED_SECTION, ReferenceVersion.class, msgs);
			msgs = basicSetOwningReferenceVersion(newOwningReferenceVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencesPackage.SECTION__OWNING_REFERENCE_VERSION, newOwningReferenceVersion, newOwningReferenceVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Section> getOwnedSection() {
		if (ownedSection == null) {
			ownedSection = new EObjectContainmentWithInverseEList<Section>(Section.class, this, ReferencesPackage.SECTION__OWNED_SECTION, ReferencesPackage.SECTION__OWNING_SECTION);
		}
		return ownedSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section getOwnedSection(String name) {
		return getOwnedSection(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section getOwnedSection(String name, boolean ignoreCase) {
		ownedSectionLoop: for (Section ownedSection : getOwnedSection()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedSection.getName()) : name.equals(ownedSection.getName())))
				continue ownedSectionLoop;
			return ownedSection;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Section getOwningSection() {
		if (eContainerFeatureID() != ReferencesPackage.SECTION__OWNING_SECTION) return null;
		return (Section)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningSection(Section newOwningSection, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningSection, ReferencesPackage.SECTION__OWNING_SECTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningSection(Section newOwningSection) {
		if (newOwningSection != eInternalContainer() || (eContainerFeatureID() != ReferencesPackage.SECTION__OWNING_SECTION && newOwningSection != null)) {
			if (EcoreUtil.isAncestor(this, newOwningSection))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningSection != null)
				msgs = ((InternalEObject)newOwningSection).eInverseAdd(this, ReferencesPackage.SECTION__OWNED_SECTION, Section.class, msgs);
			msgs = basicSetOwningSection(newOwningSection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencesPackage.SECTION__OWNING_SECTION, newOwningSection, newOwningSection));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencesPackage.SECTION__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GlossaryTerm> getTerm() {
		if (term == null) {
			term = new EObjectWithInverseResolvingEList.ManyInverse<GlossaryTerm>(GlossaryTerm.class, this, ReferencesPackage.SECTION__TERM, GlossaryPackage.GLOSSARY_TERM__EXTERNAL_TERM_DEFINITION);
		}
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlossaryTerm getTerm(String name) {
		return getTerm(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlossaryTerm getTerm(String name, boolean ignoreCase) {
		termLoop: for (GlossaryTerm term : getTerm()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(term.getName()) : name.equals(term.getName())))
				continue termLoop;
			return term;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpiceElement> getFacilitatingSpiceElement() {
		if (facilitatingSpiceElement == null) {
			facilitatingSpiceElement = new EObjectWithInverseResolvingEList.ManyInverse<SpiceElement>(SpiceElement.class, this, ReferencesPackage.SECTION__FACILITATING_SPICE_ELEMENT, SPICEPackage.SPICE_ELEMENT__FACILITATED_SECTION);
		}
		return facilitatingSpiceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpiceElement getFacilitatingSpiceElement(String name) {
		return getFacilitatingSpiceElement(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpiceElement getFacilitatingSpiceElement(String name, boolean ignoreCase, EClass eClass) {
		facilitatingSpiceElementLoop: for (SpiceElement facilitatingSpiceElement : getFacilitatingSpiceElement()) {
			if (eClass != null && !eClass.isInstance(facilitatingSpiceElement))
				continue facilitatingSpiceElementLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(facilitatingSpiceElement.getName()) : name.equals(facilitatingSpiceElement.getName())))
				continue facilitatingSpiceElementLoop;
			return facilitatingSpiceElement;
		}
		return null;
	}

	/**
	 * The cached invocation delegate for the '{@link #documentVersion() <em>Document Version</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #documentVersion()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DOCUMENT_VERSION__EINVOCATION_DELEGATE = ((EOperation.Internal)ReferencesPackage.Literals.SECTION___DOCUMENT_VERSION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceVersion documentVersion() {
		try {
			return (ReferenceVersion)DOCUMENT_VERSION__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	protected static final EOperation.Internal.InvocationDelegate OID_1__EINVOCATION_DELEGATE = ((EOperation.Internal)ReferencesPackage.Literals.SECTION___OID).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String oid() {
		try {
			return (String)OID_1__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	protected static final EOperation.Internal.InvocationDelegate QUALIFIED_NUMBER__EINVOCATION_DELEGATE = ((EOperation.Internal)ReferencesPackage.Literals.SECTION___QUALIFIED_NUMBER).getInvocationDelegate();

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReferencesPackage.SECTION__OWNING_REFERENCE_VERSION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningReferenceVersion((ReferenceVersion)otherEnd, msgs);
			case ReferencesPackage.SECTION__OWNED_SECTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedSection()).basicAdd(otherEnd, msgs);
			case ReferencesPackage.SECTION__OWNING_SECTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningSection((Section)otherEnd, msgs);
			case ReferencesPackage.SECTION__TERM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTerm()).basicAdd(otherEnd, msgs);
			case ReferencesPackage.SECTION__FACILITATING_SPICE_ELEMENT:
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
			case ReferencesPackage.SECTION__OWNING_REFERENCE_VERSION:
				return basicSetOwningReferenceVersion(null, msgs);
			case ReferencesPackage.SECTION__OWNED_SECTION:
				return ((InternalEList<?>)getOwnedSection()).basicRemove(otherEnd, msgs);
			case ReferencesPackage.SECTION__OWNING_SECTION:
				return basicSetOwningSection(null, msgs);
			case ReferencesPackage.SECTION__TERM:
				return ((InternalEList<?>)getTerm()).basicRemove(otherEnd, msgs);
			case ReferencesPackage.SECTION__FACILITATING_SPICE_ELEMENT:
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
			case ReferencesPackage.SECTION__OWNING_REFERENCE_VERSION:
				return eInternalContainer().eInverseRemove(this, ReferencesPackage.REFERENCE_VERSION__OWNED_SECTION, ReferenceVersion.class, msgs);
			case ReferencesPackage.SECTION__OWNING_SECTION:
				return eInternalContainer().eInverseRemove(this, ReferencesPackage.SECTION__OWNED_SECTION, Section.class, msgs);
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
			case ReferencesPackage.SECTION__FACILITATING_ELEMENT:
				return getFacilitatingElement();
			case ReferencesPackage.SECTION__OWNING_REFERENCE_VERSION:
				return getOwningReferenceVersion();
			case ReferencesPackage.SECTION__OWNED_SECTION:
				return getOwnedSection();
			case ReferencesPackage.SECTION__OWNING_SECTION:
				return getOwningSection();
			case ReferencesPackage.SECTION__NUMBER:
				return getNumber();
			case ReferencesPackage.SECTION__TERM:
				return getTerm();
			case ReferencesPackage.SECTION__FACILITATING_SPICE_ELEMENT:
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
			case ReferencesPackage.SECTION__OWNING_REFERENCE_VERSION:
				setOwningReferenceVersion((ReferenceVersion)newValue);
				return;
			case ReferencesPackage.SECTION__OWNED_SECTION:
				getOwnedSection().clear();
				getOwnedSection().addAll((Collection<? extends Section>)newValue);
				return;
			case ReferencesPackage.SECTION__OWNING_SECTION:
				setOwningSection((Section)newValue);
				return;
			case ReferencesPackage.SECTION__NUMBER:
				setNumber((String)newValue);
				return;
			case ReferencesPackage.SECTION__TERM:
				getTerm().clear();
				getTerm().addAll((Collection<? extends GlossaryTerm>)newValue);
				return;
			case ReferencesPackage.SECTION__FACILITATING_SPICE_ELEMENT:
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
			case ReferencesPackage.SECTION__OWNING_REFERENCE_VERSION:
				setOwningReferenceVersion((ReferenceVersion)null);
				return;
			case ReferencesPackage.SECTION__OWNED_SECTION:
				getOwnedSection().clear();
				return;
			case ReferencesPackage.SECTION__OWNING_SECTION:
				setOwningSection((Section)null);
				return;
			case ReferencesPackage.SECTION__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case ReferencesPackage.SECTION__TERM:
				getTerm().clear();
				return;
			case ReferencesPackage.SECTION__FACILITATING_SPICE_ELEMENT:
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
			case ReferencesPackage.SECTION__FACILITATING_ELEMENT:
				return isSetFacilitatingElement();
			case ReferencesPackage.SECTION__OWNING_REFERENCE_VERSION:
				return getOwningReferenceVersion() != null;
			case ReferencesPackage.SECTION__OWNED_SECTION:
				return ownedSection != null && !ownedSection.isEmpty();
			case ReferencesPackage.SECTION__OWNING_SECTION:
				return getOwningSection() != null;
			case ReferencesPackage.SECTION__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case ReferencesPackage.SECTION__TERM:
				return term != null && !term.isEmpty();
			case ReferencesPackage.SECTION__FACILITATING_SPICE_ELEMENT:
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
			case ReferencesPackage.SECTION___DOCUMENT_VERSION:
				return documentVersion();
			case ReferencesPackage.SECTION___OID:
				return oid();
			case ReferencesPackage.SECTION___QUALIFIED_NUMBER:
				return qualifiedNumber();
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
	public boolean isSetFacilitatingElement() {
		return eIsSet(ReferencesPackage.SECTION__FACILITATING_SPICE_ELEMENT);
	}

} //SectionImpl
