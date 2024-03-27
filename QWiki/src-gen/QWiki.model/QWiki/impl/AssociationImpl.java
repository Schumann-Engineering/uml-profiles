/**
 */
package QWiki.impl;

import QWiki.Association;
import QWiki.Element;
import QWiki.QWikiPackage;
import QWiki.RelationshipType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.impl.AssociationImpl#getEnd <em>End</em>}</li>
 *   <li>{@link QWiki.impl.AssociationImpl#getEndRelationshipType <em>End Relationship Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends RelationshipImpl implements Association {
	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> end;

	/**
	 * The cached value of the '{@link #getEndRelationshipType() <em>End Relationship Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndRelationshipType()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationshipType> endRelationshipType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QWikiPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelationshipType> getEndRelationshipType() {
		if (endRelationshipType == null) {
			endRelationshipType = new EObjectWithInverseResolvingEList.ManyInverse<RelationshipType>(RelationshipType.class, this, QWikiPackage.ASSOCIATION__END_RELATIONSHIP_TYPE, QWikiPackage.RELATIONSHIP_TYPE__TYPED_ASSOCIATION);
		}
		return endRelationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getEnd() {
		if (end == null) {
			end = new EObjectResolvingEList<Element>(Element.class, this, QWikiPackage.ASSOCIATION__END);
		}
		return end;
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
			case QWikiPackage.ASSOCIATION__END_RELATIONSHIP_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndRelationshipType()).basicAdd(otherEnd, msgs);
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
			case QWikiPackage.ASSOCIATION__END_RELATIONSHIP_TYPE:
				return ((InternalEList<?>)getEndRelationshipType()).basicRemove(otherEnd, msgs);
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
			case QWikiPackage.ASSOCIATION__END:
				return getEnd();
			case QWikiPackage.ASSOCIATION__END_RELATIONSHIP_TYPE:
				return getEndRelationshipType();
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
			case QWikiPackage.ASSOCIATION__END:
				getEnd().clear();
				getEnd().addAll((Collection<? extends Element>)newValue);
				return;
			case QWikiPackage.ASSOCIATION__END_RELATIONSHIP_TYPE:
				getEndRelationshipType().clear();
				getEndRelationshipType().addAll((Collection<? extends RelationshipType>)newValue);
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
			case QWikiPackage.ASSOCIATION__END:
				getEnd().clear();
				return;
			case QWikiPackage.ASSOCIATION__END_RELATIONSHIP_TYPE:
				getEndRelationshipType().clear();
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
			case QWikiPackage.ASSOCIATION__END:
				return end != null && !end.isEmpty();
			case QWikiPackage.ASSOCIATION__END_RELATIONSHIP_TYPE:
				return endRelationshipType != null && !endRelationshipType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AssociationImpl
