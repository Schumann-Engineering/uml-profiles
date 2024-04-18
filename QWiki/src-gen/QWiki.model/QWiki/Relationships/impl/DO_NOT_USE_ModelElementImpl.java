/**
 */
package QWiki.Relationships.impl;

import QWiki.Relationships.DO_NOT_USE_ModelElement;
import QWiki.Relationships.DO_NOT_USE_SuperseedingRelationship;
import QWiki.Relationships.RelationshipsPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DO NOT USE Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Relationships.impl.DO_NOT_USE_ModelElementImpl#getSuperseedingRelationship <em>Superseeding Relationship</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DO_NOT_USE_ModelElementImpl extends MinimalEObjectImpl.Container implements DO_NOT_USE_ModelElement {
	/**
	 * The cached value of the '{@link #getSuperseedingRelationship() <em>Superseeding Relationship</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperseedingRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<DO_NOT_USE_SuperseedingRelationship> superseedingRelationship;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DO_NOT_USE_ModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RelationshipsPackage.Literals.DO_NOT_USE_MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DO_NOT_USE_SuperseedingRelationship> getSuperseedingRelationship() {
		if (superseedingRelationship == null) {
			superseedingRelationship = new EObjectResolvingEList<DO_NOT_USE_SuperseedingRelationship>(DO_NOT_USE_SuperseedingRelationship.class, this, RelationshipsPackage.DO_NOT_USE_MODEL_ELEMENT__SUPERSEEDING_RELATIONSHIP);
		}
		return superseedingRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RelationshipsPackage.DO_NOT_USE_MODEL_ELEMENT__SUPERSEEDING_RELATIONSHIP:
				return getSuperseedingRelationship();
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
			case RelationshipsPackage.DO_NOT_USE_MODEL_ELEMENT__SUPERSEEDING_RELATIONSHIP:
				getSuperseedingRelationship().clear();
				getSuperseedingRelationship().addAll((Collection<? extends DO_NOT_USE_SuperseedingRelationship>)newValue);
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
			case RelationshipsPackage.DO_NOT_USE_MODEL_ELEMENT__SUPERSEEDING_RELATIONSHIP:
				getSuperseedingRelationship().clear();
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
			case RelationshipsPackage.DO_NOT_USE_MODEL_ELEMENT__SUPERSEEDING_RELATIONSHIP:
				return superseedingRelationship != null && !superseedingRelationship.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DO_NOT_USE_ModelElementImpl
