/**
 */
package QWiki.Kernel.impl;

import QWiki.Kernel.KernelPackage;
import QWiki.Kernel.QWikiRelationship;
import QWiki.Kernel.QWikiRelationshipType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.uml2.uml.internal.impl.DirectedRelationshipImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QWiki Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Kernel.impl.QWikiRelationshipImpl#getRelationshipType <em>Relationship Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class QWikiRelationshipImpl extends DirectedRelationshipImpl implements QWikiRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QWikiRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelPackage.Literals.QWIKI_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QWikiRelationshipType getRelationshipType() {
		QWikiRelationshipType relationshipType = basicGetRelationshipType();
		return relationshipType != null && relationshipType.eIsProxy() ? (QWikiRelationshipType)eResolveProxy((InternalEObject)relationshipType) : relationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWikiRelationshipType basicGetRelationshipType() {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KernelPackage.QWIKI_RELATIONSHIP__RELATIONSHIP_TYPE:
				if (resolve) return getRelationshipType();
				return basicGetRelationshipType();
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
			case KernelPackage.QWIKI_RELATIONSHIP__RELATIONSHIP_TYPE:
				return isSetRelationshipType();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelationshipType() {
		return false;
	}

} //QWikiRelationshipImpl
