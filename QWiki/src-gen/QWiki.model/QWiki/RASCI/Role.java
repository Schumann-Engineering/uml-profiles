/**
 */
package QWiki.RASCI;

import QWiki.I18N.I18nDescriptiveElement;
import QWiki.I18N.I18nString;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.RASCI.Role#getSkills <em>Skills</em>}</li>
 *   <li>{@link QWiki.RASCI.Role#getResponsibleElement <em>Responsible Element</em>}</li>
 *   <li>{@link QWiki.RASCI.Role#getAccountableElement <em>Accountable Element</em>}</li>
 *   <li>{@link QWiki.RASCI.Role#getSupportingElement <em>Supporting Element</em>}</li>
 *   <li>{@link QWiki.RASCI.Role#getConsultingElement <em>Consulting Element</em>}</li>
 *   <li>{@link QWiki.RASCI.Role#getInformedElement <em>Informed Element</em>}</li>
 * </ul>
 *
 * @see QWiki.RASCI.RASCIPackage#getRole()
 * @model annotation="duplicates"
 * @generated
 */
public interface Role extends I18nDescriptiveElement {
	/**
	 * Returns the value of the '<em><b>Skills</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.I18N.I18nString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skills</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skills</em>' containment reference list.
	 * @see QWiki.RASCI.RASCIPackage#getRole_Skills()
	 * @model containment="true" transient="true" ordered="false"
	 * @generated
	 */
	EList<I18nString> getSkills();

	/**
	 * Returns the value of the '<em><b>Responsible Element</b></em>' reference list.
	 * The list contents are of type {@link QWiki.RASCI.RasciElement}.
	 * It is bidirectional and its opposite is '{@link QWiki.RASCI.RasciElement#getResponsibleRole <em>Responsible Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Element</em>' reference list.
	 * @see QWiki.RASCI.RASCIPackage#getRole_ResponsibleElement()
	 * @see QWiki.RASCI.RasciElement#getResponsibleRole
	 * @model opposite="responsibleRole" transient="true" ordered="false"
	 * @generated
	 */
	EList<RasciElement> getResponsibleElement();

	/**
	 * Returns the value of the '<em><b>Accountable Element</b></em>' reference list.
	 * The list contents are of type {@link QWiki.RASCI.RasciElement}.
	 * It is bidirectional and its opposite is '{@link QWiki.RASCI.RasciElement#getAccountableRole <em>Accountable Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accountable Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accountable Element</em>' reference list.
	 * @see QWiki.RASCI.RASCIPackage#getRole_AccountableElement()
	 * @see QWiki.RASCI.RasciElement#getAccountableRole
	 * @model opposite="accountableRole" transient="true" ordered="false"
	 * @generated
	 */
	EList<RasciElement> getAccountableElement();

	/**
	 * Returns the value of the '<em><b>Supporting Element</b></em>' reference list.
	 * The list contents are of type {@link QWiki.RASCI.RasciElement}.
	 * It is bidirectional and its opposite is '{@link QWiki.RASCI.RasciElement#getSupportingRole <em>Supporting Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Element</em>' reference list.
	 * @see QWiki.RASCI.RASCIPackage#getRole_SupportingElement()
	 * @see QWiki.RASCI.RasciElement#getSupportingRole
	 * @model opposite="supportingRole" transient="true" ordered="false"
	 * @generated
	 */
	EList<RasciElement> getSupportingElement();

	/**
	 * Returns the value of the '<em><b>Consulting Element</b></em>' reference list.
	 * The list contents are of type {@link QWiki.RASCI.RasciElement}.
	 * It is bidirectional and its opposite is '{@link QWiki.RASCI.RasciElement#getConsultingRole <em>Consulting Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consulting Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consulting Element</em>' reference list.
	 * @see QWiki.RASCI.RASCIPackage#getRole_ConsultingElement()
	 * @see QWiki.RASCI.RasciElement#getConsultingRole
	 * @model opposite="consultingRole" transient="true" ordered="false"
	 * @generated
	 */
	EList<RasciElement> getConsultingElement();

	/**
	 * Returns the value of the '<em><b>Informed Element</b></em>' reference list.
	 * The list contents are of type {@link QWiki.RASCI.RasciElement}.
	 * It is bidirectional and its opposite is '{@link QWiki.RASCI.RasciElement#getInformedRole <em>Informed Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Informed Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informed Element</em>' reference list.
	 * @see QWiki.RASCI.RASCIPackage#getRole_InformedElement()
	 * @see QWiki.RASCI.RasciElement#getInformedRole
	 * @model opposite="informedRole" transient="true" ordered="false"
	 * @generated
	 */
	EList<RasciElement> getInformedElement();

} // Role
