/**
 */
package QWiki;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uml Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A namespace is an element in a model that contains a set of named elements that can be identified by name.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.UmlNamespace#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link QWiki.UmlNamespace#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link QWiki.UmlNamespace#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getUmlNamespace()
 * @model abstract="true"
 * @generated
 */
public interface UmlNamespace extends UmlNamedElement {
	/**
	 * Returns the value of the '<em><b>Imported Member</b></em>' reference list.
	 * The list contents are of type {@link QWiki.UmlPackageableElement}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.UmlNamespace#getMember() <em>Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the PackageableElements that are members of this Namespace as a result of either PackageImports or ElementImports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imported Member</em>' reference list.
	 * @see QWiki.QWikiPackage#getUmlNamespace_ImportedMember()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<UmlPackageableElement> getImportedMember();

	/**
	 * Returns the value of the '<em><b>Owned Member</b></em>' reference list.
	 * The list contents are of type {@link QWiki.UmlNamedElement}.
	 * It is bidirectional and its opposite is '{@link QWiki.UmlNamedElement#getNamespace <em>Namespace</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.UmlNamespace#getMember() <em>Member</em>}'</li>
	 *   <li>'{@link QWiki.UmlElement#getOwnedElement() <em>Owned Element</em>}'</li>
	 * </ul>
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of NamedElements owned by the Namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Member</em>' reference list.
	 * @see QWiki.QWikiPackage#getUmlNamespace_OwnedMember()
	 * @see QWiki.UmlNamedElement#getNamespace
	 * @model opposite="namespace" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="union"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<UmlNamedElement> getOwnedMember();

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link QWiki.UmlNamedElement}.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of NamedElements identifiable within the Namespace, either by being owned or by being introduced by importing or inheritance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see QWiki.QWikiPackage#getUmlNamespace_Member()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="union"
	 * @generated
	 */
	EList<UmlNamedElement> getMember();

} // UmlNamespace
