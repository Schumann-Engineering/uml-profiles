/**
 */
package QWiki.Glossary.impl;

import QWiki.Glossary.GlossaryPackage;
import QWiki.Glossary.GlossaryTerm;
import QWiki.Glossary.GlossaryTermDefinition;

import QWiki.Kernel.impl.I18nDescriptiveElementImpl;

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
 *   <li>{@link QWiki.Glossary.impl.GlossaryTermDefinitionImpl#getOwningTerm <em>Owning Term</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlossaryTermDefinitionImpl extends I18nDescriptiveElementImpl implements GlossaryTermDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlossaryTermDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GlossaryPackage.Literals.GLOSSARY_TERM_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlossaryTerm getOwningTerm() {
		if (eContainerFeatureID() != GlossaryPackage.GLOSSARY_TERM_DEFINITION__OWNING_TERM) return null;
		return (GlossaryTerm)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningTerm(GlossaryTerm newOwningTerm, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningTerm, GlossaryPackage.GLOSSARY_TERM_DEFINITION__OWNING_TERM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningTerm(GlossaryTerm newOwningTerm) {
		if (newOwningTerm != eInternalContainer() || (eContainerFeatureID() != GlossaryPackage.GLOSSARY_TERM_DEFINITION__OWNING_TERM && newOwningTerm != null)) {
			if (EcoreUtil.isAncestor(this, newOwningTerm))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningTerm != null)
				msgs = ((InternalEObject)newOwningTerm).eInverseAdd(this, GlossaryPackage.GLOSSARY_TERM__OWNED_TERM_DEFINITION, GlossaryTerm.class, msgs);
			msgs = basicSetOwningTerm(newOwningTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GlossaryPackage.GLOSSARY_TERM_DEFINITION__OWNING_TERM, newOwningTerm, newOwningTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GlossaryPackage.GLOSSARY_TERM_DEFINITION__OWNING_TERM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTerm((GlossaryTerm)otherEnd, msgs);
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
			case GlossaryPackage.GLOSSARY_TERM_DEFINITION__OWNING_TERM:
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
			case GlossaryPackage.GLOSSARY_TERM_DEFINITION__OWNING_TERM:
				return eInternalContainer().eInverseRemove(this, GlossaryPackage.GLOSSARY_TERM__OWNED_TERM_DEFINITION, GlossaryTerm.class, msgs);
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
			case GlossaryPackage.GLOSSARY_TERM_DEFINITION__OWNING_TERM:
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
			case GlossaryPackage.GLOSSARY_TERM_DEFINITION__OWNING_TERM:
				setOwningTerm((GlossaryTerm)newValue);
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
			case GlossaryPackage.GLOSSARY_TERM_DEFINITION__OWNING_TERM:
				setOwningTerm((GlossaryTerm)null);
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
			case GlossaryPackage.GLOSSARY_TERM_DEFINITION__OWNING_TERM:
				return getOwningTerm() != null;
		}
		return super.eIsSet(featureID);
	}

} //GlossaryTermDefinitionImpl
