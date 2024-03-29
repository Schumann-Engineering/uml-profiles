/**
 */
package QWiki.Kernel;

import QWiki.I18N.I18nNamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Kernel.ModelDomain#getDomainElement <em>Domain Element</em>}</li>
 * </ul>
 *
 * @see QWiki.Kernel.KernelPackage#getModelDomain()
 * @model
 * @generated
 */
public interface ModelDomain extends I18nNamedElement {
	/**
	 * Returns the value of the '<em><b>Domain Element</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Kernel.ModelDomainElement}.
	 * It is bidirectional and its opposite is '{@link QWiki.Kernel.ModelDomainElement#getAssignedDomain <em>Assigned Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Element</em>' reference list.
	 * @see QWiki.Kernel.KernelPackage#getModelDomain_DomainElement()
	 * @see QWiki.Kernel.ModelDomainElement#getAssignedDomain
	 * @model opposite="assignedDomain" transient="true" ordered="false"
	 * @generated
	 */
	EList<ModelDomainElement> getDomainElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<ModelDomainElement> allDomainElement();

} // ModelDomain
