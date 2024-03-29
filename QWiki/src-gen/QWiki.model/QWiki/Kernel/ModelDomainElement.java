/**
 */
package QWiki.Kernel;

import QWiki.Infrastructure.UmlNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Domain Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Kernel.ModelDomainElement#getDomain <em>Domain</em>}</li>
 *   <li>{@link QWiki.Kernel.ModelDomainElement#getAssignedDomain <em>Assigned Domain</em>}</li>
 * </ul>
 *
 * @see QWiki.Kernel.KernelPackage#getModelDomainElement()
 * @model abstract="true"
 * @generated
 */
public interface ModelDomainElement extends UmlNamedElement {
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
	 * @see QWiki.Kernel.KernelPackage#getModelDomainElement_Domain()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='namedelement'"
	 *        annotation="union"
	 * @generated
	 */
	ModelDomain getDomain();

	/**
	 * Returns the value of the '<em><b>Assigned Domain</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Kernel.ModelDomain#getDomainElement <em>Domain Element</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Kernel.ModelDomainElement#getDomain() <em>Domain</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Domain</em>' reference.
	 * @see #setAssignedDomain(ModelDomain)
	 * @see QWiki.Kernel.KernelPackage#getModelDomainElement_AssignedDomain()
	 * @see QWiki.Kernel.ModelDomain#getDomainElement
	 * @model opposite="domainElement" transient="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	ModelDomain getAssignedDomain();

	/**
	 * Sets the value of the '{@link QWiki.Kernel.ModelDomainElement#getAssignedDomain <em>Assigned Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Domain</em>' reference.
	 * @see #getAssignedDomain()
	 * @generated
	 */
	void setAssignedDomain(ModelDomain value);

} // ModelDomainElement
