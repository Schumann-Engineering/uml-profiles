/**
 */
package QWiki;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.uml.Namespace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.QWikiNamespace#getQwikiElement <em>Qwiki Element</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getQWikiNamespace()
 * @model abstract="true"
 * @generated
 */
public interface QWikiNamespace extends Namespace, L10nNamedElement, QWikiElement {

	/**
	 * Returns the value of the '<em><b>Qwiki Element</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.QWikiNamedElement}.
	 * It is bidirectional and its opposite is '{@link QWiki.QWikiNamedElement#getQwikiNamespace <em>Qwiki Namespace</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qwiki Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qwiki Element</em>' containment reference list.
	 * @see QWiki.QWikiPackage#getQWikiNamespace_QwikiElement()
	 * @see QWiki.QWikiNamedElement#getQwikiNamespace
	 * @model opposite="qwikiNamespace" containment="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<QWikiNamedElement> getQwikiElement();

	/**
	 * Retrieves the first {@link QWiki.QWikiNamedElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Qwiki Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.QWikiNamedElement} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.QWikiNamedElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getQwikiElement()
	 * @generated
	 */
	QWikiNamedElement getQwikiElement(String name);

	/**
	 * Retrieves the first {@link QWiki.QWikiNamedElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Qwiki Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.QWikiNamedElement} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link QWiki.QWikiNamedElement} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.QWikiNamedElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getQwikiElement()
	 * @generated
	 */
	QWikiNamedElement getQwikiElement(String name, boolean ignoreCase, EClass eClass);
} // QWikiNamespace
