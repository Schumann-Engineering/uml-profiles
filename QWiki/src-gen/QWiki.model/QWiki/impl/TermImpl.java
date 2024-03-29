/**
 */
package QWiki.impl;

import QWiki.I18nDescriptiveElement;
import QWiki.I18nString;
import QWiki.QWikiPackage;
import QWiki.Section;
import QWiki.Term;
import QWiki.TermDefinition;
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
 *   <li>{@link QWiki.impl.TermImpl#getTermDefinition <em>Term Definition</em>}</li>
 *   <li>{@link QWiki.impl.TermImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link QWiki.impl.TermImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link QWiki.impl.TermImpl#getSynonym <em>Synonym</em>}</li>
 *   <li>{@link QWiki.impl.TermImpl#getOwnedTermDefinition <em>Owned Term Definition</em>}</li>
 *   <li>{@link QWiki.impl.TermImpl#getExternalTermDefinition <em>External Term Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TermImpl extends I18nNamedElementImpl implements Term {
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
	 * The cached value of the '{@link #getOwnedTermDefinition() <em>Owned Term Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTermDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<TermDefinition> ownedTermDefinition;

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
	protected TermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QWikiPackage.Literals.TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UmlElement> getOwnedElement() {
		return new DerivedUnionEObjectEList<UmlElement>(UmlElement.class, this, QWikiPackage.TERM__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<I18nDescriptiveElement> getTermDefinition() {
		return new DerivedUnionEObjectEList<I18nDescriptiveElement>(I18nDescriptiveElement.class, this, QWikiPackage.TERM__TERM_DEFINITION, TERM_DEFINITION_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getTermDefinition() <em>Term Definition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final int[] TERM_DEFINITION_ESUBSETS = new int[] {QWikiPackage.TERM__OWNED_TERM_DEFINITION, QWikiPackage.TERM__EXTERNAL_TERM_DEFINITION};

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElement() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {QWikiPackage.TERM__OWNED_COMMENT, QWikiPackage.TERM__OWNED_TERM_DEFINITION};

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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QWikiPackage.TERM__ACRONYM, oldAcronym, newAcronym);
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
				msgs = ((InternalEObject)acronym).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QWikiPackage.TERM__ACRONYM, null, msgs);
			if (newAcronym != null)
				msgs = ((InternalEObject)newAcronym).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QWikiPackage.TERM__ACRONYM, null, msgs);
			msgs = basicSetAcronym(newAcronym, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.TERM__ACRONYM, newAcronym, newAcronym));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QWikiPackage.TERM__SYNONYM, oldSynonym, newSynonym);
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
				msgs = ((InternalEObject)synonym).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QWikiPackage.TERM__SYNONYM, null, msgs);
			if (newSynonym != null)
				msgs = ((InternalEObject)newSynonym).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QWikiPackage.TERM__SYNONYM, null, msgs);
			msgs = basicSetSynonym(newSynonym, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.TERM__SYNONYM, newSynonym, newSynonym));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TermDefinition> getOwnedTermDefinition() {
		if (ownedTermDefinition == null) {
			ownedTermDefinition = new EObjectContainmentWithInverseEList<TermDefinition>(TermDefinition.class, this, QWikiPackage.TERM__OWNED_TERM_DEFINITION, QWikiPackage.TERM_DEFINITION__OWNING_TERM);
		}
		return ownedTermDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Section> getExternalTermDefinition() {
		if (externalTermDefinition == null) {
			externalTermDefinition = new EObjectWithInverseResolvingEList.ManyInverse<Section>(Section.class, this, QWikiPackage.TERM__EXTERNAL_TERM_DEFINITION, QWikiPackage.SECTION__TERM);
		}
		return externalTermDefinition;
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
			case QWikiPackage.TERM__OWNED_TERM_DEFINITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedTermDefinition()).basicAdd(otherEnd, msgs);
			case QWikiPackage.TERM__EXTERNAL_TERM_DEFINITION:
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
			case QWikiPackage.TERM__ACRONYM:
				return basicSetAcronym(null, msgs);
			case QWikiPackage.TERM__SYNONYM:
				return basicSetSynonym(null, msgs);
			case QWikiPackage.TERM__OWNED_TERM_DEFINITION:
				return ((InternalEList<?>)getOwnedTermDefinition()).basicRemove(otherEnd, msgs);
			case QWikiPackage.TERM__EXTERNAL_TERM_DEFINITION:
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
			case QWikiPackage.TERM__TERM_DEFINITION:
				return getTermDefinition();
			case QWikiPackage.TERM__ACRONYM:
				return getAcronym();
			case QWikiPackage.TERM__SYNONYM:
				return getSynonym();
			case QWikiPackage.TERM__OWNED_TERM_DEFINITION:
				return getOwnedTermDefinition();
			case QWikiPackage.TERM__EXTERNAL_TERM_DEFINITION:
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
			case QWikiPackage.TERM__ACRONYM:
				setAcronym((I18nString)newValue);
				return;
			case QWikiPackage.TERM__SYNONYM:
				setSynonym((I18nString)newValue);
				return;
			case QWikiPackage.TERM__OWNED_TERM_DEFINITION:
				getOwnedTermDefinition().clear();
				getOwnedTermDefinition().addAll((Collection<? extends TermDefinition>)newValue);
				return;
			case QWikiPackage.TERM__EXTERNAL_TERM_DEFINITION:
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
			case QWikiPackage.TERM__ACRONYM:
				setAcronym((I18nString)null);
				return;
			case QWikiPackage.TERM__SYNONYM:
				setSynonym((I18nString)null);
				return;
			case QWikiPackage.TERM__OWNED_TERM_DEFINITION:
				getOwnedTermDefinition().clear();
				return;
			case QWikiPackage.TERM__EXTERNAL_TERM_DEFINITION:
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
			case QWikiPackage.TERM__TERM_DEFINITION:
				return isSetTermDefinition();
			case QWikiPackage.TERM__OWNED_ELEMENT:
				return isSetOwnedElement();
			case QWikiPackage.TERM__ACRONYM:
				return acronym != null;
			case QWikiPackage.TERM__SYNONYM:
				return synonym != null;
			case QWikiPackage.TERM__OWNED_TERM_DEFINITION:
				return ownedTermDefinition != null && !ownedTermDefinition.isEmpty();
			case QWikiPackage.TERM__EXTERNAL_TERM_DEFINITION:
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
			case QWikiPackage.TERM___OID:
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
	public boolean isSetOwnedElement() {
		return super.isSetOwnedElement()
			|| eIsSet(QWikiPackage.TERM__OWNED_TERM_DEFINITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTermDefinition() {
		return eIsSet(QWikiPackage.TERM__OWNED_TERM_DEFINITION)
			|| eIsSet(QWikiPackage.TERM__EXTERNAL_TERM_DEFINITION);
	}

} //TermImpl
