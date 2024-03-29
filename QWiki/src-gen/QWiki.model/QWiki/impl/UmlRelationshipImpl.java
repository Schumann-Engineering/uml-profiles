/**
 */
package QWiki.impl;

import QWiki.QWikiPackage;
import QWiki.UmlElement;
import QWiki.UmlRelationship;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uml Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.impl.UmlRelationshipImpl#getRelatedElement <em>Related Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UmlRelationshipImpl extends UmlElementImpl implements UmlRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UmlRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QWikiPackage.Literals.UML_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UmlElement> getRelatedElement() {
		return new DerivedUnionEObjectEList<UmlElement>(UmlElement.class, this, QWikiPackage.UML_RELATIONSHIP__RELATED_ELEMENT, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QWikiPackage.UML_RELATIONSHIP__RELATED_ELEMENT:
				return getRelatedElement();
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
			case QWikiPackage.UML_RELATIONSHIP__RELATED_ELEMENT:
				return isSetRelatedElement();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedElement() {
		return false;
	}

} //UmlRelationshipImpl
