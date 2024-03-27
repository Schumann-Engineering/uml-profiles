/**
 */
package QWiki.impl;

import QWiki.Association;
import QWiki.QWikiPackage;
import QWiki.RelationshipType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.impl.RelationshipTypeImpl#getTypedAssociation <em>Typed Association</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipTypeImpl extends I18nNamedElementImpl implements RelationshipType {
	/**
	 * The cached value of the '{@link #getTypedAssociation() <em>Typed Association</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypedAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> typedAssociation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QWikiPackage.Literals.RELATIONSHIP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Association> getTypedAssociation() {
		if (typedAssociation == null) {
			typedAssociation = new EObjectWithInverseResolvingEList.ManyInverse<Association>(Association.class, this, QWikiPackage.RELATIONSHIP_TYPE__TYPED_ASSOCIATION, QWikiPackage.ASSOCIATION__END_RELATIONSHIP_TYPE);
		}
		return typedAssociation;
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
			case QWikiPackage.RELATIONSHIP_TYPE__TYPED_ASSOCIATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTypedAssociation()).basicAdd(otherEnd, msgs);
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
			case QWikiPackage.RELATIONSHIP_TYPE__TYPED_ASSOCIATION:
				return ((InternalEList<?>)getTypedAssociation()).basicRemove(otherEnd, msgs);
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
			case QWikiPackage.RELATIONSHIP_TYPE__TYPED_ASSOCIATION:
				return getTypedAssociation();
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
			case QWikiPackage.RELATIONSHIP_TYPE__TYPED_ASSOCIATION:
				getTypedAssociation().clear();
				getTypedAssociation().addAll((Collection<? extends Association>)newValue);
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
			case QWikiPackage.RELATIONSHIP_TYPE__TYPED_ASSOCIATION:
				getTypedAssociation().clear();
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
			case QWikiPackage.RELATIONSHIP_TYPE__TYPED_ASSOCIATION:
				return typedAssociation != null && !typedAssociation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RelationshipTypeImpl
