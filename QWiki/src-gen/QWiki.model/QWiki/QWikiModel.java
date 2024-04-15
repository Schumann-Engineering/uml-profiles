/**
 */
package QWiki;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.QWikiModel#getOwnedQwikiElement <em>Owned Qwiki Element</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getQWikiModel()
 * @model
 * @generated
 */
public interface QWikiModel extends QWikiContainer {
	/**
	 * Returns the value of the '<em><b>Owned Qwiki Element</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.QWikiNamedElement}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getMembers() <em>Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Qwiki Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Qwiki Element</em>' containment reference list.
	 * @see QWiki.QWikiPackage#getQWikiModel_OwnedQwikiElement()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='qwikiModel'"
	 *        extendedMetaData="kind='element'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<QWikiNamedElement> getOwnedQwikiElement();

	/**
	 * Retrieves the first {@link QWiki.QWikiNamedElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Qwiki Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.QWikiNamedElement} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.QWikiNamedElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedQwikiElement()
	 * @generated
	 */
	QWikiNamedElement getOwnedQwikiElement(String name);

	/**
	 * Retrieves the first {@link QWiki.QWikiNamedElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Qwiki Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.QWikiNamedElement} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link QWiki.QWikiNamedElement} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.QWikiNamedElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedQwikiElement()
	 * @generated
	 */
	QWikiNamedElement getOwnedQwikiElement(String name, boolean ignoreCase, EClass eClass);

} // QWikiModel
