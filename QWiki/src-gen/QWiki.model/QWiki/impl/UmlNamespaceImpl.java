/**
 */
package QWiki.impl;

import QWiki.QWikiPackage;
import QWiki.UmlElement;
import QWiki.UmlNamedElement;
import QWiki.UmlNamespace;
import QWiki.UmlPackageableElement;

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
 *   <li>{@link QWiki.impl.UmlNamespaceImpl#getMember <em>Member</em>}</li>
 *   <li>{@link QWiki.impl.UmlNamespaceImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link QWiki.impl.UmlNamespaceImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link QWiki.impl.UmlNamespaceImpl#getImportedMember <em>Imported Member</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UmlNamespaceImpl extends UmlNamedElementImpl implements UmlNamespace {
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
		return QWikiPackage.Literals.UML_NAMESPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UmlNamedElement> getMember() {
		return new DerivedUnionEObjectEList<UmlNamedElement>(UmlNamedElement.class, this, QWikiPackage.UML_NAMESPACE__MEMBER, MEMBER_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getMember() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected static final int[] MEMBER_ESUBSETS = new int[] {QWikiPackage.UML_NAMESPACE__IMPORTED_MEMBER, QWikiPackage.UML_NAMESPACE__OWNED_MEMBER};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UmlNamedElement> getOwnedMember() {
		return new DerivedUnionEObjectEList<UmlNamedElement>(UmlNamedElement.class, this, QWikiPackage.UML_NAMESPACE__OWNED_MEMBER, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UmlElement> getOwnedElement() {
		return new DerivedUnionEObjectEList<UmlElement>(UmlElement.class, this, QWikiPackage.UML_NAMESPACE__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElement() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {QWikiPackage.UML_NAMESPACE__OWNED_COMMENT, QWikiPackage.UML_NAMESPACE__OWNED_MEMBER};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UmlPackageableElement> getImportedMember() {
		// TODO: implement this method to return the 'Imported Member' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QWikiPackage.UML_NAMESPACE__MEMBER:
				return getMember();
			case QWikiPackage.UML_NAMESPACE__OWNED_MEMBER:
				return getOwnedMember();
			case QWikiPackage.UML_NAMESPACE__IMPORTED_MEMBER:
				return getImportedMember();
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
			case QWikiPackage.UML_NAMESPACE__MEMBER:
				return isSetMember();
			case QWikiPackage.UML_NAMESPACE__OWNED_MEMBER:
				return isSetOwnedMember();
			case QWikiPackage.UML_NAMESPACE__OWNED_ELEMENT:
				return isSetOwnedElement();
			case QWikiPackage.UML_NAMESPACE__IMPORTED_MEMBER:
				return !getImportedMember().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMember() {
		return eIsSet(QWikiPackage.UML_NAMESPACE__IMPORTED_MEMBER)
			|| isSetOwnedMember();
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
	@Override
	public boolean isSetOwnedElement() {
		return super.isSetOwnedElement()
			|| isSetOwnedMember();
	}

} //UmlNamespaceImpl
