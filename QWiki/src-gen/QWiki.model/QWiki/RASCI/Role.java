/**
 */
package QWiki.Rasci;

import QWiki.L10nDescriptiveElement;
import QWiki.L10nString;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Rasci.Role#getSkills <em>Skills</em>}</li>
 *   <li>{@link QWiki.Rasci.Role#getResponsibleElement <em>Responsible Element</em>}</li>
 *   <li>{@link QWiki.Rasci.Role#getAccountableElement <em>Accountable Element</em>}</li>
 *   <li>{@link QWiki.Rasci.Role#getSupportingElement <em>Supporting Element</em>}</li>
 *   <li>{@link QWiki.Rasci.Role#getConsultingElement <em>Consulting Element</em>}</li>
 *   <li>{@link QWiki.Rasci.Role#getInformedElement <em>Informed Element</em>}</li>
 * </ul>
 *
 * @see QWiki.Rasci.RasciPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends L10nDescriptiveElement {
	/**
	 * Returns the value of the '<em><b>Skills</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skills</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skills</em>' containment reference.
	 * @see #setSkills(L10nString)
	 * @see QWiki.Rasci.RasciPackage#getRole_Skills()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	L10nString getSkills();

	/**
	 * Sets the value of the '{@link QWiki.Rasci.Role#getSkills <em>Skills</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skills</em>' containment reference.
	 * @see #getSkills()
	 * @generated
	 */
	void setSkills(L10nString value);

	/**
	 * Returns the value of the '<em><b>Responsible Element</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Rasci.RasciElement}.
	 * It is bidirectional and its opposite is '{@link QWiki.Rasci.RasciElement#getResponsibleRole <em>Responsible Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Element</em>' reference list.
	 * @see QWiki.Rasci.RasciPackage#getRole_ResponsibleElement()
	 * @see QWiki.Rasci.RasciElement#getResponsibleRole
	 * @model opposite="responsibleRole" resolveProxies="false" transient="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<RasciElement> getResponsibleElement();

	/**
	 * Retrieves the first {@link QWiki.Rasci.RasciElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Responsible Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Rasci.RasciElement} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Rasci.RasciElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getResponsibleElement()
	 * @generated
	 */
	RasciElement getResponsibleElement(String name);

	/**
	 * Retrieves the first {@link QWiki.Rasci.RasciElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Responsible Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Rasci.RasciElement} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link QWiki.Rasci.RasciElement} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Rasci.RasciElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getResponsibleElement()
	 * @generated
	 */
	RasciElement getResponsibleElement(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Accountable Element</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Rasci.RasciElement}.
	 * It is bidirectional and its opposite is '{@link QWiki.Rasci.RasciElement#getAccountableRole <em>Accountable Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accountable Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accountable Element</em>' reference list.
	 * @see QWiki.Rasci.RasciPackage#getRole_AccountableElement()
	 * @see QWiki.Rasci.RasciElement#getAccountableRole
	 * @model opposite="accountableRole" resolveProxies="false" transient="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<RasciElement> getAccountableElement();

	/**
	 * Retrieves the first {@link QWiki.Rasci.RasciElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Accountable Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Rasci.RasciElement} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Rasci.RasciElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getAccountableElement()
	 * @generated
	 */
	RasciElement getAccountableElement(String name);

	/**
	 * Retrieves the first {@link QWiki.Rasci.RasciElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Accountable Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Rasci.RasciElement} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link QWiki.Rasci.RasciElement} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Rasci.RasciElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getAccountableElement()
	 * @generated
	 */
	RasciElement getAccountableElement(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Supporting Element</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Rasci.RasciElement}.
	 * It is bidirectional and its opposite is '{@link QWiki.Rasci.RasciElement#getSupportRole <em>Support Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Element</em>' reference list.
	 * @see QWiki.Rasci.RasciPackage#getRole_SupportingElement()
	 * @see QWiki.Rasci.RasciElement#getSupportRole
	 * @model opposite="supportRole" resolveProxies="false" transient="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<RasciElement> getSupportingElement();

	/**
	 * Retrieves the first {@link QWiki.Rasci.RasciElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Supporting Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Rasci.RasciElement} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Rasci.RasciElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSupportingElement()
	 * @generated
	 */
	RasciElement getSupportingElement(String name);

	/**
	 * Retrieves the first {@link QWiki.Rasci.RasciElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Supporting Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Rasci.RasciElement} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link QWiki.Rasci.RasciElement} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Rasci.RasciElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSupportingElement()
	 * @generated
	 */
	RasciElement getSupportingElement(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Consulting Element</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Rasci.RasciElement}.
	 * It is bidirectional and its opposite is '{@link QWiki.Rasci.RasciElement#getConsultedRole <em>Consulted Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consulting Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consulting Element</em>' reference list.
	 * @see QWiki.Rasci.RasciPackage#getRole_ConsultingElement()
	 * @see QWiki.Rasci.RasciElement#getConsultedRole
	 * @model opposite="consultedRole" resolveProxies="false" transient="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<RasciElement> getConsultingElement();

	/**
	 * Retrieves the first {@link QWiki.Rasci.RasciElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Consulting Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Rasci.RasciElement} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Rasci.RasciElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getConsultingElement()
	 * @generated
	 */
	RasciElement getConsultingElement(String name);

	/**
	 * Retrieves the first {@link QWiki.Rasci.RasciElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Consulting Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Rasci.RasciElement} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link QWiki.Rasci.RasciElement} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Rasci.RasciElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getConsultingElement()
	 * @generated
	 */
	RasciElement getConsultingElement(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Informed Element</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Rasci.RasciElement}.
	 * It is bidirectional and its opposite is '{@link QWiki.Rasci.RasciElement#getInformedRole <em>Informed Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Informed Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informed Element</em>' reference list.
	 * @see QWiki.Rasci.RasciPackage#getRole_InformedElement()
	 * @see QWiki.Rasci.RasciElement#getInformedRole
	 * @model opposite="informedRole" resolveProxies="false" transient="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<RasciElement> getInformedElement();

	/**
	 * Retrieves the first {@link QWiki.Rasci.RasciElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Informed Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Rasci.RasciElement} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Rasci.RasciElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInformedElement()
	 * @generated
	 */
	RasciElement getInformedElement(String name);

	/**
	 * Retrieves the first {@link QWiki.Rasci.RasciElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Informed Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Rasci.RasciElement} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link QWiki.Rasci.RasciElement} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Rasci.RasciElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInformedElement()
	 * @generated
	 */
	RasciElement getInformedElement(String name, boolean ignoreCase, EClass eClass);

	/**
	 * <p>
	 * This operation redefines the following operations:
	 * <ul>
	 *   <li>'{@link QWiki.QWikiElement#objectId() <em>Object Id</em>}' </li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='\'r/\' + name'"
	 * @generated
	 */
	String objectId();

} // Role
