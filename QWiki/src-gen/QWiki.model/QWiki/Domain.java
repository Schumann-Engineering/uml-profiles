/**
 */
package QWiki;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Domain#getDomainElement <em>Domain Element</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends I18nNamedElement {
	/**
	 * Returns the value of the '<em><b>Domain Element</b></em>' reference list.
	 * The list contents are of type {@link QWiki.NamedElement}.
	 * It is bidirectional and its opposite is '{@link QWiki.NamedElement#getAssignedDomain <em>Assigned Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Element</em>' reference list.
	 * @see QWiki.QWikiPackage#getDomain_DomainElement()
	 * @see QWiki.NamedElement#getAssignedDomain
	 * @model opposite="assignedDomain" ordered="false"
	 * @generated
	 */
	EList<NamedElement> getDomainElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<NamedElement> allDomainElement();

} // Domain
