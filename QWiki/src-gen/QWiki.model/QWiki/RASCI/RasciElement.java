/**
 */
package QWiki.RASCI;

import QWiki.I18N.I18nDescriptiveElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rasci Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.RASCI.RasciElement#getResponsibleRole <em>Responsible Role</em>}</li>
 *   <li>{@link QWiki.RASCI.RasciElement#getAccountableRole <em>Accountable Role</em>}</li>
 *   <li>{@link QWiki.RASCI.RasciElement#getSupportingRole <em>Supporting Role</em>}</li>
 *   <li>{@link QWiki.RASCI.RasciElement#getConsultingRole <em>Consulting Role</em>}</li>
 *   <li>{@link QWiki.RASCI.RasciElement#getInformedRole <em>Informed Role</em>}</li>
 * </ul>
 *
 * @see QWiki.RASCI.RASCIPackage#getRasciElement()
 * @model abstract="true"
 * @generated
 */
public interface RasciElement extends I18nDescriptiveElement {
	/**
	 * Returns the value of the '<em><b>Responsible Role</b></em>' reference list.
	 * The list contents are of type {@link QWiki.RASCI.Role}.
	 * It is bidirectional and its opposite is '{@link QWiki.RASCI.Role#getResponsibleElement <em>Responsible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Role</em>' reference list.
	 * @see QWiki.RASCI.RASCIPackage#getRasciElement_ResponsibleRole()
	 * @see QWiki.RASCI.Role#getResponsibleElement
	 * @model opposite="responsibleElement" required="true" transient="true" ordered="false"
	 * @generated
	 */
	EList<Role> getResponsibleRole();

	/**
	 * Returns the value of the '<em><b>Accountable Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QWiki.RASCI.Role#getAccountableElement <em>Accountable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accountable Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accountable Role</em>' reference.
	 * @see #setAccountableRole(Role)
	 * @see QWiki.RASCI.RASCIPackage#getRasciElement_AccountableRole()
	 * @see QWiki.RASCI.Role#getAccountableElement
	 * @model opposite="accountableElement" transient="true" ordered="false"
	 * @generated
	 */
	Role getAccountableRole();

	/**
	 * Sets the value of the '{@link QWiki.RASCI.RasciElement#getAccountableRole <em>Accountable Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accountable Role</em>' reference.
	 * @see #getAccountableRole()
	 * @generated
	 */
	void setAccountableRole(Role value);

	/**
	 * Returns the value of the '<em><b>Supporting Role</b></em>' reference list.
	 * The list contents are of type {@link QWiki.RASCI.Role}.
	 * It is bidirectional and its opposite is '{@link QWiki.RASCI.Role#getSupportingElement <em>Supporting Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Role</em>' reference list.
	 * @see QWiki.RASCI.RASCIPackage#getRasciElement_SupportingRole()
	 * @see QWiki.RASCI.Role#getSupportingElement
	 * @model opposite="supportingElement" transient="true" ordered="false"
	 * @generated
	 */
	EList<Role> getSupportingRole();

	/**
	 * Returns the value of the '<em><b>Consulting Role</b></em>' reference list.
	 * The list contents are of type {@link QWiki.RASCI.Role}.
	 * It is bidirectional and its opposite is '{@link QWiki.RASCI.Role#getConsultingElement <em>Consulting Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consulting Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consulting Role</em>' reference list.
	 * @see QWiki.RASCI.RASCIPackage#getRasciElement_ConsultingRole()
	 * @see QWiki.RASCI.Role#getConsultingElement
	 * @model opposite="consultingElement" transient="true" ordered="false"
	 * @generated
	 */
	EList<Role> getConsultingRole();

	/**
	 * Returns the value of the '<em><b>Informed Role</b></em>' reference list.
	 * The list contents are of type {@link QWiki.RASCI.Role}.
	 * It is bidirectional and its opposite is '{@link QWiki.RASCI.Role#getInformedElement <em>Informed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Informed Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informed Role</em>' reference list.
	 * @see QWiki.RASCI.RASCIPackage#getRasciElement_InformedRole()
	 * @see QWiki.RASCI.Role#getInformedElement
	 * @model opposite="informedElement" transient="true" ordered="false"
	 * @generated
	 */
	EList<Role> getInformedRole();

} // RasciElement
