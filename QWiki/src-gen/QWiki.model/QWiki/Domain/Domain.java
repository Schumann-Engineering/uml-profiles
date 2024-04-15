/**
 */
package QWiki.Domain;

import QWiki.QWikiElement;

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
 *   <li>{@link QWiki.Domain.Domain#getDomainElement <em>Domain Element</em>}</li>
 * </ul>
 *
 * @see QWiki.Domain.DomainPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends QWikiElement {
	/**
	 * Returns the value of the '<em><b>Domain Element</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Domain.DomainElement}.
	 * It is bidirectional and its opposite is '{@link QWiki.Domain.DomainElement#getAssignedDomain <em>Assigned Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Element</em>' reference list.
	 * @see QWiki.Domain.DomainPackage#getDomain_DomainElement()
	 * @see QWiki.Domain.DomainElement#getAssignedDomain
	 * @model opposite="assignedDomain" resolveProxies="false" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<DomainElement> getDomainElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<DomainElement> allDomainElement();

} // Domain
