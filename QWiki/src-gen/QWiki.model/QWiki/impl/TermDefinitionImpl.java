/**
 */
package QWiki.impl;

import QWiki.QWikiPackage;
import QWiki.Term;
import QWiki.TermDefinition;
import QWiki.UmlElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.impl.TermDefinitionImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link QWiki.impl.TermDefinitionImpl#getOwningTerm <em>Owning Term</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TermDefinitionImpl extends I18nDescriptiveElementImpl implements TermDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QWikiPackage.Literals.TERM_DEFINITION;
	}

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
		Term owningTerm = getOwningTerm();			
		if (owningTerm != null) {
			return owningTerm;
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Term getOwningTerm() {
		if (eContainerFeatureID() != QWikiPackage.TERM_DEFINITION__OWNING_TERM) return null;
		return (Term)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningTerm(Term newOwningTerm, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningTerm, QWikiPackage.TERM_DEFINITION__OWNING_TERM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningTerm(Term newOwningTerm) {
		if (newOwningTerm != eInternalContainer() || (eContainerFeatureID() != QWikiPackage.TERM_DEFINITION__OWNING_TERM && newOwningTerm != null)) {
			if (EcoreUtil.isAncestor(this, newOwningTerm))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningTerm != null)
				msgs = ((InternalEObject)newOwningTerm).eInverseAdd(this, QWikiPackage.TERM__OWNED_TERM_DEFINITION, Term.class, msgs);
			msgs = basicSetOwningTerm(newOwningTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.TERM_DEFINITION__OWNING_TERM, newOwningTerm, newOwningTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QWikiPackage.TERM_DEFINITION__OWNING_TERM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTerm((Term)otherEnd, msgs);
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
			case QWikiPackage.TERM_DEFINITION__OWNING_TERM:
				return basicSetOwningTerm(null, msgs);
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
			case QWikiPackage.TERM_DEFINITION__OWNING_TERM:
				return eInternalContainer().eInverseRemove(this, QWikiPackage.TERM__OWNED_TERM_DEFINITION, Term.class, msgs);
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
			case QWikiPackage.TERM_DEFINITION__OWNING_TERM:
				return getOwningTerm();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QWikiPackage.TERM_DEFINITION__OWNING_TERM:
				setOwningTerm((Term)newValue);
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
			case QWikiPackage.TERM_DEFINITION__OWNING_TERM:
				setOwningTerm((Term)null);
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
			case QWikiPackage.TERM_DEFINITION__OWNER:
				return isSetOwner();
			case QWikiPackage.TERM_DEFINITION__OWNING_TERM:
				return getOwningTerm() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(QWikiPackage.TERM_DEFINITION__OWNING_TERM);
	}

} //TermDefinitionImpl
