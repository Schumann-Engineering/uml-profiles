/**
 */
package QWiki.Infrastructure;

import QWiki.I18N.I18nDescriptiveElement;

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
 *   <li>{@link QWiki.Infrastructure.UmlNamespace#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link QWiki.Infrastructure.UmlNamespace#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see QWiki.Infrastructure.InfrastructurePackage#getUmlNamespace()
 * @model abstract="true"
 * @generated
 */
public interface UmlNamespace extends I18nDescriptiveElement, UmlNamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Member</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Infrastructure.UmlNamedElement}.
	 * It is bidirectional and its opposite is '{@link QWiki.Infrastructure.UmlNamedElement#getNamespace <em>Namespace</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Infrastructure.UmlNamespace#getMember() <em>Member</em>}'</li>
	 *   <li>'{@link QWiki.Infrastructure.UmlElement#getOwnedElement() <em>Owned Element</em>}'</li>
	 * </ul>
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of NamedElements owned by the Namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Member</em>' reference list.
	 * @see QWiki.Infrastructure.InfrastructurePackage#getUmlNamespace_OwnedMember()
	 * @see QWiki.Infrastructure.UmlNamedElement#getNamespace
	 * @model opposite="namespace" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="union"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<UmlNamedElement> getOwnedMember();

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Infrastructure.UmlNamedElement}.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of NamedElements identifiable within the Namespace, either by being owned or by being introduced by importing or inheritance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Member</em>' reference list.
	 * @see QWiki.Infrastructure.InfrastructurePackage#getUmlNamespace_Member()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="union"
	 * @generated
	 */
	EList<UmlNamedElement> getMember();

} // UmlNamespace
