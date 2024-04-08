/**
 */
package QWiki.Spice.impl;

import QWiki.Kernel.QWikiRelationship;

import QWiki.Kernel.impl.QWikiRelationshipTypeImpl;

import QWiki.Spice.SPICEPackage;
import QWiki.Spice.WorkProductRelationship;
import QWiki.Spice.WorkProductRelationshipType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Product Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Spice.impl.WorkProductRelationshipTypeImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link QWiki.Spice.impl.WorkProductRelationshipTypeImpl#getWorkProductRelationship <em>Work Product Relationship</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkProductRelationshipTypeImpl extends QWikiRelationshipTypeImpl implements WorkProductRelationshipType {
	/**
	 * The cached value of the '{@link #getWorkProductRelationship() <em>Work Product Relationship</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkProductRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProductRelationship> workProductRelationship;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkProductRelationshipTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SPICEPackage.Literals.WORK_PRODUCT_RELATIONSHIP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QWikiRelationship> getRelationship() {
		return new DerivedUnionEObjectEList<QWikiRelationship>(QWikiRelationship.class, this, SPICEPackage.WORK_PRODUCT_RELATIONSHIP_TYPE__RELATIONSHIP, RELATIONSHIP_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRelationship() <em>Relationship</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected static final int[] RELATIONSHIP_ESUBSETS = new int[] {SPICEPackage.WORK_PRODUCT_RELATIONSHIP_TYPE__WORK_PRODUCT_RELATIONSHIP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkProductRelationship> getWorkProductRelationship() {
		if (workProductRelationship == null) {
			workProductRelationship = new EObjectWithInverseResolvingEList<WorkProductRelationship>(WorkProductRelationship.class, this, SPICEPackage.WORK_PRODUCT_RELATIONSHIP_TYPE__WORK_PRODUCT_RELATIONSHIP, SPICEPackage.WORK_PRODUCT_RELATIONSHIP__WORK_PRODUCT_RELATIONSHIP_TYPE);
		}
		return workProductRelationship;
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
			case SPICEPackage.WORK_PRODUCT_RELATIONSHIP_TYPE__WORK_PRODUCT_RELATIONSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWorkProductRelationship()).basicAdd(otherEnd, msgs);
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
			case SPICEPackage.WORK_PRODUCT_RELATIONSHIP_TYPE__WORK_PRODUCT_RELATIONSHIP:
				return ((InternalEList<?>)getWorkProductRelationship()).basicRemove(otherEnd, msgs);
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
			case SPICEPackage.WORK_PRODUCT_RELATIONSHIP_TYPE__WORK_PRODUCT_RELATIONSHIP:
				return getWorkProductRelationship();
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
			case SPICEPackage.WORK_PRODUCT_RELATIONSHIP_TYPE__WORK_PRODUCT_RELATIONSHIP:
				getWorkProductRelationship().clear();
				getWorkProductRelationship().addAll((Collection<? extends WorkProductRelationship>)newValue);
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
			case SPICEPackage.WORK_PRODUCT_RELATIONSHIP_TYPE__WORK_PRODUCT_RELATIONSHIP:
				getWorkProductRelationship().clear();
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
			case SPICEPackage.WORK_PRODUCT_RELATIONSHIP_TYPE__RELATIONSHIP:
				return isSetRelationship();
			case SPICEPackage.WORK_PRODUCT_RELATIONSHIP_TYPE__WORK_PRODUCT_RELATIONSHIP:
				return workProductRelationship != null && !workProductRelationship.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRelationship() {
		return super.isSetRelationship()
			|| eIsSet(SPICEPackage.WORK_PRODUCT_RELATIONSHIP_TYPE__WORK_PRODUCT_RELATIONSHIP);
	}

} //WorkProductRelationshipTypeImpl
