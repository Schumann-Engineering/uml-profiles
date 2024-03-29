/**
 */
package QWiki.impl;

import QWiki.QWikiPackage;
import QWiki.UmlDirectedRelationship;
import QWiki.UmlElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uml Directed Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.impl.UmlDirectedRelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link QWiki.impl.UmlDirectedRelationshipImpl#getRelatedElement <em>Related Element</em>}</li>
 *   <li>{@link QWiki.impl.UmlDirectedRelationshipImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UmlDirectedRelationshipImpl extends UmlRelationshipImpl implements UmlDirectedRelationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UmlDirectedRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QWikiPackage.Literals.UML_DIRECTED_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UmlElement> getSource() {
		return new DerivedUnionEObjectEList<UmlElement>(UmlElement.class, this, QWikiPackage.UML_DIRECTED_RELATIONSHIP__SOURCE, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UmlElement> getRelatedElement() {
		return new DerivedUnionEObjectEList<UmlElement>(UmlElement.class, this, QWikiPackage.UML_DIRECTED_RELATIONSHIP__RELATED_ELEMENT, RELATED_ELEMENT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRelatedElement() <em>Related Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] RELATED_ELEMENT_ESUBSETS = new int[] {QWikiPackage.UML_DIRECTED_RELATIONSHIP__SOURCE, QWikiPackage.UML_DIRECTED_RELATIONSHIP__TARGET};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UmlElement> getTarget() {
		return new DerivedUnionEObjectEList<UmlElement>(UmlElement.class, this, QWikiPackage.UML_DIRECTED_RELATIONSHIP__TARGET, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QWikiPackage.UML_DIRECTED_RELATIONSHIP__SOURCE:
				return getSource();
			case QWikiPackage.UML_DIRECTED_RELATIONSHIP__TARGET:
				return getTarget();
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
			case QWikiPackage.UML_DIRECTED_RELATIONSHIP__SOURCE:
				return isSetSource();
			case QWikiPackage.UML_DIRECTED_RELATIONSHIP__RELATED_ELEMENT:
				return isSetRelatedElement();
			case QWikiPackage.UML_DIRECTED_RELATIONSHIP__TARGET:
				return isSetTarget();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSource() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRelatedElement() {
		return super.isSetRelatedElement()
			|| isSetSource()
			|| isSetTarget();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTarget() {
		return false;
	}

} //UmlDirectedRelationshipImpl
