/**
 */
package QWiki.Kernel.impl;

import QWiki.Kernel.KernelPackage;
import QWiki.Kernel.QWikiRelationship;
import QWiki.Kernel.QWikiRelationshipType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QWiki Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Kernel.impl.QWikiRelationshipTypeImpl#getRelationship <em>Relationship</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class QWikiRelationshipTypeImpl extends QWikiNamedElementImpl implements QWikiRelationshipType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QWikiRelationshipTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelPackage.Literals.QWIKI_RELATIONSHIP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QWikiRelationship> getRelationship() {
		return new DerivedUnionEObjectEList<QWikiRelationship>(QWikiRelationship.class, this, KernelPackage.QWIKI_RELATIONSHIP_TYPE__RELATIONSHIP, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KernelPackage.QWIKI_RELATIONSHIP_TYPE__RELATIONSHIP:
				return getRelationship();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KernelPackage.QWIKI_RELATIONSHIP_TYPE__RELATIONSHIP:
				return isSetRelationship();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelationship() {
		return false;
	}

} //QWikiRelationshipTypeImpl
