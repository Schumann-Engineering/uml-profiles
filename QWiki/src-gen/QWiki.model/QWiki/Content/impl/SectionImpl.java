/**
 */
package QWiki.Content.impl;

import QWiki.Content.ContentContainer;
import QWiki.Content.ContentPackage;
import QWiki.Content.Section;

import QWiki.Glossary.GlossaryPackage;
import QWiki.Glossary.GlossaryTerm;

import QWiki.QWikiElement;
import QWiki.QWikiPackage;

import QWiki.References.ReferenceVersion;
import QWiki.References.ReferencesPackage;

import QWiki.Spice.SpiceElement;
import QWiki.Spice.SpicePackage;

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

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
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
 *   <li>{@link QWiki.Content.impl.SectionImpl#getFacilitatingElement <em>Facilitating Element</em>}</li>
 *   <li>{@link QWiki.Content.impl.SectionImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link QWiki.Content.impl.SectionImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link QWiki.Content.impl.SectionImpl#getOwningReferenceVersion <em>Owning Reference Version</em>}</li>
 *   <li>{@link QWiki.Content.impl.SectionImpl#getFacilitatingSpiceElement <em>Facilitating Spice Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionImpl extends ContentContainerImpl implements Section {
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
		return ContentPackage.Literals.SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QWikiElement> getFacilitatingElement() {
		return new DerivedUnionEObjectEList<QWikiElement>(QWikiElement.class, this, ContentPackage.SECTION__FACILITATING_ELEMENT, FACILITATING_ELEMENT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getFacilitatingElement() <em>Facilitating Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitatingElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] FACILITATING_ELEMENT_ESUBSETS = new int[] {ContentPackage.SECTION__FACILITATING_SPICE_ELEMENT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GlossaryTerm> getTerm() {
		if (term == null) {
			term = new EObjectWithInverseEList.ManyInverse<GlossaryTerm>(GlossaryTerm.class, this, ContentPackage.SECTION__TERM, GlossaryPackage.GLOSSARY_TERM__EXTERNAL_TERM_DEFINITION);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.SECTION__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceVersion getOwningReferenceVersion() {
		if (eContainerFeatureID() != ContentPackage.SECTION__OWNING_REFERENCE_VERSION) return null;
		return (ReferenceVersion)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningReferenceVersion(ReferenceVersion newOwningReferenceVersion, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningReferenceVersion, ContentPackage.SECTION__OWNING_REFERENCE_VERSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningReferenceVersion(ReferenceVersion newOwningReferenceVersion) {
		if (newOwningReferenceVersion != eInternalContainer() || (eContainerFeatureID() != ContentPackage.SECTION__OWNING_REFERENCE_VERSION && newOwningReferenceVersion != null)) {
			if (EcoreUtil.isAncestor(this, newOwningReferenceVersion))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningReferenceVersion != null)
				msgs = ((InternalEObject)newOwningReferenceVersion).eInverseAdd(this, ReferencesPackage.REFERENCE_VERSION__OWNED_CONTENT, ReferenceVersion.class, msgs);
			msgs = basicSetOwningReferenceVersion(newOwningReferenceVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.SECTION__OWNING_REFERENCE_VERSION, newOwningReferenceVersion, newOwningReferenceVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpiceElement> getFacilitatingSpiceElement() {
		if (facilitatingSpiceElement == null) {
			facilitatingSpiceElement = new EObjectWithInverseEList.ManyInverse<SpiceElement>(SpiceElement.class, this, ContentPackage.SECTION__FACILITATING_SPICE_ELEMENT, SpicePackage.SPICE_ELEMENT__FACILITATED_SECTION);
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
	 * The cached invocation delegate for the '{@link #referenceVersion() <em>Reference Version</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #referenceVersion()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate REFERENCE_VERSION__EINVOCATION_DELEGATE = ((EOperation.Internal)ContentPackage.Literals.SECTION___REFERENCE_VERSION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceVersion referenceVersion() {
		try {
			return (ReferenceVersion)REFERENCE_VERSION__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	protected static final EOperation.Internal.InvocationDelegate QUALIFIED_NUMBER__EINVOCATION_DELEGATE = ((EOperation.Internal)ContentPackage.Literals.SECTION___QUALIFIED_NUMBER).getInvocationDelegate();

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
	 * The cached invocation delegate for the '{@link #objectId() <em>Object Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #objectId()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate OBJECT_ID__EINVOCATION_DELEGATE = ((EOperation.Internal)ContentPackage.Literals.SECTION___OBJECT_ID).getInvocationDelegate();

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
			case ContentPackage.SECTION__TERM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTerm()).basicAdd(otherEnd, msgs);
			case ContentPackage.SECTION__OWNING_REFERENCE_VERSION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningReferenceVersion((ReferenceVersion)otherEnd, msgs);
			case ContentPackage.SECTION__FACILITATING_SPICE_ELEMENT:
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
			case ContentPackage.SECTION__TERM:
				return ((InternalEList<?>)getTerm()).basicRemove(otherEnd, msgs);
			case ContentPackage.SECTION__OWNING_REFERENCE_VERSION:
				return basicSetOwningReferenceVersion(null, msgs);
			case ContentPackage.SECTION__FACILITATING_SPICE_ELEMENT:
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
			case ContentPackage.SECTION__OWNING_REFERENCE_VERSION:
				return eInternalContainer().eInverseRemove(this, ReferencesPackage.REFERENCE_VERSION__OWNED_CONTENT, ReferenceVersion.class, msgs);
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
			case ContentPackage.SECTION__FACILITATING_ELEMENT:
				return getFacilitatingElement();
			case ContentPackage.SECTION__TERM:
				return getTerm();
			case ContentPackage.SECTION__NUMBER:
				return getNumber();
			case ContentPackage.SECTION__OWNING_REFERENCE_VERSION:
				return getOwningReferenceVersion();
			case ContentPackage.SECTION__FACILITATING_SPICE_ELEMENT:
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
			case ContentPackage.SECTION__TERM:
				getTerm().clear();
				getTerm().addAll((Collection<? extends GlossaryTerm>)newValue);
				return;
			case ContentPackage.SECTION__NUMBER:
				setNumber((String)newValue);
				return;
			case ContentPackage.SECTION__OWNING_REFERENCE_VERSION:
				setOwningReferenceVersion((ReferenceVersion)newValue);
				return;
			case ContentPackage.SECTION__FACILITATING_SPICE_ELEMENT:
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
			case ContentPackage.SECTION__TERM:
				getTerm().clear();
				return;
			case ContentPackage.SECTION__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case ContentPackage.SECTION__OWNING_REFERENCE_VERSION:
				setOwningReferenceVersion((ReferenceVersion)null);
				return;
			case ContentPackage.SECTION__FACILITATING_SPICE_ELEMENT:
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
			case ContentPackage.SECTION__FACILITATING_ELEMENT:
				return isSetFacilitatingElement();
			case ContentPackage.SECTION__TERM:
				return term != null && !term.isEmpty();
			case ContentPackage.SECTION__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case ContentPackage.SECTION__OWNING_REFERENCE_VERSION:
				return getOwningReferenceVersion() != null;
			case ContentPackage.SECTION__FACILITATING_SPICE_ELEMENT:
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == QWikiElement.class) {
			switch (baseOperationID) {
				case QWikiPackage.QWIKI_ELEMENT___OBJECT_ID: return ContentPackage.SECTION___OBJECT_ID;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == ContentContainer.class) {
			switch (baseOperationID) {
				case ContentPackage.CONTENT_CONTAINER___OBJECT_ID: return ContentPackage.SECTION___OBJECT_ID;
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
			case ContentPackage.SECTION___REFERENCE_VERSION:
				return referenceVersion();
			case ContentPackage.SECTION___QUALIFIED_NUMBER:
				return qualifiedNumber();
			case ContentPackage.SECTION___OBJECT_ID:
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
		return eIsSet(ContentPackage.SECTION__FACILITATING_SPICE_ELEMENT);
	}

} //SectionImpl
