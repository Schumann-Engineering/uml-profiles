/**
 */
package QWiki.Glossary.impl;

import QWiki.Glossary.GlossaryPackage;
import QWiki.Glossary.GlossaryTerm;
import QWiki.Glossary.GlossaryTermDefinition;

import QWiki.Kernel.I18nDescriptiveElement;
import QWiki.Kernel.I18nString;

import QWiki.Kernel.impl.I18nNamedElementImpl;

import QWiki.References.ReferencesPackage;
import QWiki.References.Section;
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
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Glossary.impl.GlossaryTermImpl#getTermDefinition <em>Term Definition</em>}</li>
 *   <li>{@link QWiki.Glossary.impl.GlossaryTermImpl#getOwnedTermDefinition <em>Owned Term Definition</em>}</li>
 *   <li>{@link QWiki.Glossary.impl.GlossaryTermImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link QWiki.Glossary.impl.GlossaryTermImpl#getSynonym <em>Synonym</em>}</li>
 *   <li>{@link QWiki.Glossary.impl.GlossaryTermImpl#getExternalTermDefinition <em>External Term Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlossaryTermImpl extends I18nNamedElementImpl implements GlossaryTerm {
	/**
	 * The cached value of the '{@link #getOwnedTermDefinition() <em>Owned Term Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTermDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<GlossaryTermDefinition> ownedTermDefinition;

	/**
	 * The cached value of the '{@link #getAcronym() <em>Acronym</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcronym()
	 * @generated
	 * @ordered
	 */
	protected I18nString acronym;

	/**
	 * The cached value of the '{@link #getSynonym() <em>Synonym</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynonym()
	 * @generated
	 * @ordered
	 */
	protected I18nString synonym;

	/**
	 * The cached value of the '{@link #getExternalTermDefinition() <em>External Term Definition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalTermDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> externalTermDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlossaryTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlossaryPackage.Literals.GLOSSARY_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<I18nDescriptiveElement> getTermDefinition() {
		return new DerivedUnionEObjectEList<I18nDescriptiveElement>(I18nDescriptiveElement.class, this, GlossaryPackage.GLOSSARY_TERM__TERM_DEFINITION, TERM_DEFINITION_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getTermDefinition() <em>Term Definition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final int[] TERM_DEFINITION_ESUBSETS = new int[] {GlossaryPackage.GLOSSARY_TERM__OWNED_TERM_DEFINITION, GlossaryPackage.GLOSSARY_TERM__EXTERNAL_TERM_DEFINITION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I18nDescriptiveElement getTermDefinition(String name) {
		return getTermDefinition(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I18nDescriptiveElement getTermDefinition(String name, boolean ignoreCase, EClass eClass) {
		termDefinitionLoop: for (I18nDescriptiveElement termDefinition : getTermDefinition()) {
			if (eClass != null && !eClass.isInstance(termDefinition))
				continue termDefinitionLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(termDefinition.getName()) : name.equals(termDefinition.getName())))
				continue termDefinitionLoop;
			return termDefinition;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GlossaryTermDefinition> getOwnedTermDefinition() {
		if (ownedTermDefinition == null) {
			ownedTermDefinition = new EObjectContainmentWithInverseEList<GlossaryTermDefinition>(GlossaryTermDefinition.class, this, GlossaryPackage.GLOSSARY_TERM__OWNED_TERM_DEFINITION, GlossaryPackage.GLOSSARY_TERM_DEFINITION__OWNING_TERM);
		}
		return ownedTermDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlossaryTermDefinition getOwnedTermDefinition(String name) {
		return getOwnedTermDefinition(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlossaryTermDefinition getOwnedTermDefinition(String name, boolean ignoreCase) {
		ownedTermDefinitionLoop: for (GlossaryTermDefinition ownedTermDefinition : getOwnedTermDefinition()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedTermDefinition.getName()) : name.equals(ownedTermDefinition.getName())))
				continue ownedTermDefinitionLoop;
			return ownedTermDefinition;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public I18nString getAcronym() {
		return acronym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcronym(I18nString newAcronym, NotificationChain msgs) {
		I18nString oldAcronym = acronym;
		acronym = newAcronym;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GlossaryPackage.GLOSSARY_TERM__ACRONYM, oldAcronym, newAcronym);
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
	public void setAcronym(I18nString newAcronym) {
		if (newAcronym != acronym) {
			NotificationChain msgs = null;
			if (acronym != null)
				msgs = ((InternalEObject)acronym).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GlossaryPackage.GLOSSARY_TERM__ACRONYM, null, msgs);
			if (newAcronym != null)
				msgs = ((InternalEObject)newAcronym).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GlossaryPackage.GLOSSARY_TERM__ACRONYM, null, msgs);
			msgs = basicSetAcronym(newAcronym, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlossaryPackage.GLOSSARY_TERM__ACRONYM, newAcronym, newAcronym));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public I18nString getSynonym() {
		return synonym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSynonym(I18nString newSynonym, NotificationChain msgs) {
		I18nString oldSynonym = synonym;
		synonym = newSynonym;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GlossaryPackage.GLOSSARY_TERM__SYNONYM, oldSynonym, newSynonym);
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
	public void setSynonym(I18nString newSynonym) {
		if (newSynonym != synonym) {
			NotificationChain msgs = null;
			if (synonym != null)
				msgs = ((InternalEObject)synonym).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GlossaryPackage.GLOSSARY_TERM__SYNONYM, null, msgs);
			if (newSynonym != null)
				msgs = ((InternalEObject)newSynonym).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GlossaryPackage.GLOSSARY_TERM__SYNONYM, null, msgs);
			msgs = basicSetSynonym(newSynonym, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlossaryPackage.GLOSSARY_TERM__SYNONYM, newSynonym, newSynonym));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Section> getExternalTermDefinition() {
		if (externalTermDefinition == null) {
			externalTermDefinition = new EObjectWithInverseResolvingEList.ManyInverse<Section>(Section.class, this, GlossaryPackage.GLOSSARY_TERM__EXTERNAL_TERM_DEFINITION, ReferencesPackage.SECTION__TERM);
		}
		return externalTermDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section getExternalTermDefinition(String name) {
		return getExternalTermDefinition(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section getExternalTermDefinition(String name, boolean ignoreCase) {
		externalTermDefinitionLoop: for (Section externalTermDefinition : getExternalTermDefinition()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(externalTermDefinition.getName()) : name.equals(externalTermDefinition.getName())))
				continue externalTermDefinitionLoop;
			return externalTermDefinition;
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
	protected static final EOperation.Internal.InvocationDelegate OID__EINVOCATION_DELEGATE = ((EOperation.Internal)GlossaryPackage.Literals.GLOSSARY_TERM___OID).getInvocationDelegate();

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
			case GlossaryPackage.GLOSSARY_TERM__OWNED_TERM_DEFINITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedTermDefinition()).basicAdd(otherEnd, msgs);
			case GlossaryPackage.GLOSSARY_TERM__EXTERNAL_TERM_DEFINITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExternalTermDefinition()).basicAdd(otherEnd, msgs);
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
			case GlossaryPackage.GLOSSARY_TERM__OWNED_TERM_DEFINITION:
				return ((InternalEList<?>)getOwnedTermDefinition()).basicRemove(otherEnd, msgs);
			case GlossaryPackage.GLOSSARY_TERM__ACRONYM:
				return basicSetAcronym(null, msgs);
			case GlossaryPackage.GLOSSARY_TERM__SYNONYM:
				return basicSetSynonym(null, msgs);
			case GlossaryPackage.GLOSSARY_TERM__EXTERNAL_TERM_DEFINITION:
				return ((InternalEList<?>)getExternalTermDefinition()).basicRemove(otherEnd, msgs);
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
			case GlossaryPackage.GLOSSARY_TERM__TERM_DEFINITION:
				return getTermDefinition();
			case GlossaryPackage.GLOSSARY_TERM__OWNED_TERM_DEFINITION:
				return getOwnedTermDefinition();
			case GlossaryPackage.GLOSSARY_TERM__ACRONYM:
				return getAcronym();
			case GlossaryPackage.GLOSSARY_TERM__SYNONYM:
				return getSynonym();
			case GlossaryPackage.GLOSSARY_TERM__EXTERNAL_TERM_DEFINITION:
				return getExternalTermDefinition();
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
			case GlossaryPackage.GLOSSARY_TERM__OWNED_TERM_DEFINITION:
				getOwnedTermDefinition().clear();
				getOwnedTermDefinition().addAll((Collection<? extends GlossaryTermDefinition>)newValue);
				return;
			case GlossaryPackage.GLOSSARY_TERM__ACRONYM:
				setAcronym((I18nString)newValue);
				return;
			case GlossaryPackage.GLOSSARY_TERM__SYNONYM:
				setSynonym((I18nString)newValue);
				return;
			case GlossaryPackage.GLOSSARY_TERM__EXTERNAL_TERM_DEFINITION:
				getExternalTermDefinition().clear();
				getExternalTermDefinition().addAll((Collection<? extends Section>)newValue);
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
			case GlossaryPackage.GLOSSARY_TERM__OWNED_TERM_DEFINITION:
				getOwnedTermDefinition().clear();
				return;
			case GlossaryPackage.GLOSSARY_TERM__ACRONYM:
				setAcronym((I18nString)null);
				return;
			case GlossaryPackage.GLOSSARY_TERM__SYNONYM:
				setSynonym((I18nString)null);
				return;
			case GlossaryPackage.GLOSSARY_TERM__EXTERNAL_TERM_DEFINITION:
				getExternalTermDefinition().clear();
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
			case GlossaryPackage.GLOSSARY_TERM__TERM_DEFINITION:
				return isSetTermDefinition();
			case GlossaryPackage.GLOSSARY_TERM__OWNED_TERM_DEFINITION:
				return ownedTermDefinition != null && !ownedTermDefinition.isEmpty();
			case GlossaryPackage.GLOSSARY_TERM__ACRONYM:
				return acronym != null;
			case GlossaryPackage.GLOSSARY_TERM__SYNONYM:
				return synonym != null;
			case GlossaryPackage.GLOSSARY_TERM__EXTERNAL_TERM_DEFINITION:
				return externalTermDefinition != null && !externalTermDefinition.isEmpty();
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
			case GlossaryPackage.GLOSSARY_TERM___OID:
				return oid();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTermDefinition() {
		return eIsSet(GlossaryPackage.GLOSSARY_TERM__OWNED_TERM_DEFINITION)
			|| eIsSet(GlossaryPackage.GLOSSARY_TERM__EXTERNAL_TERM_DEFINITION);
	}

} //GlossaryTermImpl
