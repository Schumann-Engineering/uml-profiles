/**
 */
package QWiki;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Namespace#getOwnedMember <em>Owned Member</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getNamespace()
 * @model abstract="true"
 * @generated
 */
public interface Namespace extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Member</b></em>' reference list.
	 * The list contents are of type {@link QWiki.NamedElement}.
	 * It is bidirectional and its opposite is '{@link QWiki.NamedElement#getNamespace <em>Namespace</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Element#getOwnedElement() <em>Owned Element</em>}'</li>
	 * </ul>
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Member</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Member</em>' reference list.
	 * @see QWiki.QWikiPackage#getNamespace_OwnedMember()
	 * @see QWiki.NamedElement#getNamespace
	 * @model opposite="namespace" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="union"
	 *        extendedMetaData="kind='element'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<NamedElement> getOwnedMember();

} // Namespace
