/**
 */
package QWiki;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.DomainElement#getDomain <em>Domain</em>}</li>
 *   <li>{@link QWiki.DomainElement#getAssignedDomain <em>Assigned Domain</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getDomainElement()
 * @model abstract="true"
 * @generated
 */
public interface DomainElement extends UmlNamedElement {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see QWiki.QWikiPackage#getDomainElement_Domain()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='namedelement'"
	 *        annotation="union"
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Returns the value of the '<em><b>Assigned Domain</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Domain#getDomainElement <em>Domain Element</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.DomainElement#getDomain() <em>Domain</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Domain</em>' reference.
	 * @see #setAssignedDomain(Domain)
	 * @see QWiki.QWikiPackage#getDomainElement_AssignedDomain()
	 * @see QWiki.Domain#getDomainElement
	 * @model opposite="domainElement" transient="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	Domain getAssignedDomain();

	/**
	 * Sets the value of the '{@link QWiki.DomainElement#getAssignedDomain <em>Assigned Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Domain</em>' reference.
	 * @see #getAssignedDomain()
	 * @generated
	 */
	void setAssignedDomain(Domain value);

} // DomainElement
