/**
 */
package QWiki.Infrastructure.impl;

import QWiki.I18N.impl.I18nDescriptiveElementImpl;

import QWiki.Infrastructure.InfrastructurePackage;
import QWiki.Infrastructure.UmlElement;
import QWiki.Infrastructure.UmlNamedElement;
import QWiki.Infrastructure.UmlNamespace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uml Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Infrastructure.impl.UmlNamespaceImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link QWiki.Infrastructure.impl.UmlNamespaceImpl#getMember <em>Member</em>}</li>
 *   <li>{@link QWiki.Infrastructure.impl.UmlNamespaceImpl#getOwnedElement <em>Owned Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UmlNamespaceImpl extends I18nDescriptiveElementImpl implements UmlNamespace {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UmlNamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.UML_NAMESPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UmlNamedElement> getOwnedMember() {
		return new DerivedUnionEObjectEList<UmlNamedElement>(UmlNamedElement.class, this, InfrastructurePackage.UML_NAMESPACE__OWNED_MEMBER, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UmlNamedElement> getMember() {
		return new DerivedUnionEObjectEList<UmlNamedElement>(UmlNamedElement.class, this, InfrastructurePackage.UML_NAMESPACE__MEMBER, MEMBER_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getMember() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected static final int[] MEMBER_ESUBSETS = new int[] {InfrastructurePackage.UML_NAMESPACE__OWNED_MEMBER};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UmlElement> getOwnedElement() {
		return new DerivedUnionEObjectEList<UmlElement>(UmlElement.class, this, InfrastructurePackage.UML_NAMESPACE__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElement() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {InfrastructurePackage.UML_NAMESPACE__OWNED_COMMENT, InfrastructurePackage.UML_NAMESPACE__OWNED_MEMBER};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfrastructurePackage.UML_NAMESPACE__OWNED_MEMBER:
				return getOwnedMember();
			case InfrastructurePackage.UML_NAMESPACE__MEMBER:
				return getMember();
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
			case InfrastructurePackage.UML_NAMESPACE__OWNED_MEMBER:
				return isSetOwnedMember();
			case InfrastructurePackage.UML_NAMESPACE__MEMBER:
				return isSetMember();
			case InfrastructurePackage.UML_NAMESPACE__OWNED_ELEMENT:
				return isSetOwnedElement();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMember() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMember() {
		return isSetOwnedMember();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElement() {
		return super.isSetOwnedElement()
			|| isSetOwnedMember();
	}

} //UmlNamespaceImpl
