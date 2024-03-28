/**
 */
package QWiki;

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
 *   <li>{@link QWiki.RasciElement#getResponsibleRole <em>Responsible Role</em>}</li>
 *   <li>{@link QWiki.RasciElement#getAccountableRole <em>Accountable Role</em>}</li>
 *   <li>{@link QWiki.RasciElement#getSupportingRole <em>Supporting Role</em>}</li>
 *   <li>{@link QWiki.RasciElement#getConsultingRole <em>Consulting Role</em>}</li>
 *   <li>{@link QWiki.RasciElement#getInformedRole <em>Informed Role</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getRasciElement()
 * @model abstract="true"
 * @generated
 */
public interface RasciElement extends I18nDescriptiveElement {
	/**
	 * Returns the value of the '<em><b>Responsible Role</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Role}.
	 * It is bidirectional and its opposite is '{@link QWiki.Role#getResponsibleElement <em>Responsible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Role</em>' reference list.
	 * @see QWiki.QWikiPackage#getRasciElement_ResponsibleRole()
	 * @see QWiki.Role#getResponsibleElement
	 * @model opposite="responsibleElement" required="true" transient="true" ordered="false"
	 * @generated
	 */
	EList<Role> getResponsibleRole();

	/**
	 * Returns the value of the '<em><b>Accountable Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Role#getAccountableElement <em>Accountable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accountable Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accountable Role</em>' reference.
	 * @see #setAccountableRole(Role)
	 * @see QWiki.QWikiPackage#getRasciElement_AccountableRole()
	 * @see QWiki.Role#getAccountableElement
	 * @model opposite="accountableElement" transient="true" ordered="false"
	 * @generated
	 */
	Role getAccountableRole();

	/**
	 * Sets the value of the '{@link QWiki.RasciElement#getAccountableRole <em>Accountable Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accountable Role</em>' reference.
	 * @see #getAccountableRole()
	 * @generated
	 */
	void setAccountableRole(Role value);

	/**
	 * Returns the value of the '<em><b>Supporting Role</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Role}.
	 * It is bidirectional and its opposite is '{@link QWiki.Role#getSupportingElement <em>Supporting Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Role</em>' reference list.
	 * @see QWiki.QWikiPackage#getRasciElement_SupportingRole()
	 * @see QWiki.Role#getSupportingElement
	 * @model opposite="supportingElement" transient="true" ordered="false"
	 * @generated
	 */
	EList<Role> getSupportingRole();

	/**
	 * Returns the value of the '<em><b>Consulting Role</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Role}.
	 * It is bidirectional and its opposite is '{@link QWiki.Role#getConsultingElement <em>Consulting Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consulting Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consulting Role</em>' reference list.
	 * @see QWiki.QWikiPackage#getRasciElement_ConsultingRole()
	 * @see QWiki.Role#getConsultingElement
	 * @model opposite="consultingElement" transient="true" ordered="false"
	 * @generated
	 */
	EList<Role> getConsultingRole();

	/**
	 * Returns the value of the '<em><b>Informed Role</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Role}.
	 * It is bidirectional and its opposite is '{@link QWiki.Role#getInformedElement <em>Informed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Informed Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informed Role</em>' reference list.
	 * @see QWiki.QWikiPackage#getRasciElement_InformedRole()
	 * @see QWiki.Role#getInformedElement
	 * @model opposite="informedElement" transient="true" ordered="false"
	 * @generated
	 */
	EList<Role> getInformedRole();

} // RasciElement
