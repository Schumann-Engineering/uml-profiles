/**
 */
package QWiki.Rasci;

import QWiki.Kernel.I18nDescriptiveElement;

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
 *   <li>{@link QWiki.Rasci.RasciElement#getResponsibleRole <em>Responsible Role</em>}</li>
 *   <li>{@link QWiki.Rasci.RasciElement#getAccountableRole <em>Accountable Role</em>}</li>
 *   <li>{@link QWiki.Rasci.RasciElement#getSupportRole <em>Support Role</em>}</li>
 *   <li>{@link QWiki.Rasci.RasciElement#getConsultedRole <em>Consulted Role</em>}</li>
 *   <li>{@link QWiki.Rasci.RasciElement#getInformedRole <em>Informed Role</em>}</li>
 * </ul>
 *
 * @see QWiki.Rasci.RASCIPackage#getRasciElement()
 * @model abstract="true"
 * @generated
 */
public interface RasciElement extends I18nDescriptiveElement {
	/**
	 * Returns the value of the '<em><b>Responsible Role</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Rasci.Role}.
	 * It is bidirectional and its opposite is '{@link QWiki.Rasci.Role#getResponsibleElement <em>Responsible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Role</em>' reference list.
	 * @see QWiki.Rasci.RASCIPackage#getRasciElement_ResponsibleRole()
	 * @see QWiki.Rasci.Role#getResponsibleElement
	 * @model opposite="responsibleElement" required="true" transient="true" ordered="false"
	 * @generated
	 */
	EList<Role> getResponsibleRole();

	/**
	 * Retrieves the first {@link QWiki.Rasci.Role} with the specified '<em><b>Name</b></em>' from the '<em><b>Responsible Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Rasci.Role} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Rasci.Role} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getResponsibleRole()
	 * @generated
	 */
	Role getResponsibleRole(String name);

	/**
	 * Retrieves the first {@link QWiki.Rasci.Role} with the specified '<em><b>Name</b></em>' from the '<em><b>Responsible Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Rasci.Role} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link QWiki.Rasci.Role} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getResponsibleRole()
	 * @generated
	 */
	Role getResponsibleRole(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Accountable Role</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Rasci.Role#getAccountableElement <em>Accountable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accountable Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accountable Role</em>' reference.
	 * @see #setAccountableRole(Role)
	 * @see QWiki.Rasci.RASCIPackage#getRasciElement_AccountableRole()
	 * @see QWiki.Rasci.Role#getAccountableElement
	 * @model opposite="accountableElement" transient="true" ordered="false"
	 * @generated
	 */
	Role getAccountableRole();

	/**
	 * Sets the value of the '{@link QWiki.Rasci.RasciElement#getAccountableRole <em>Accountable Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accountable Role</em>' reference.
	 * @see #getAccountableRole()
	 * @generated
	 */
	void setAccountableRole(Role value);

	/**
	 * Returns the value of the '<em><b>Support Role</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Rasci.Role}.
	 * It is bidirectional and its opposite is '{@link QWiki.Rasci.Role#getSupportingElement <em>Supporting Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Support Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Support Role</em>' reference list.
	 * @see QWiki.Rasci.RASCIPackage#getRasciElement_SupportRole()
	 * @see QWiki.Rasci.Role#getSupportingElement
	 * @model opposite="supportingElement" transient="true" ordered="false"
	 * @generated
	 */
	EList<Role> getSupportRole();

	/**
	 * Retrieves the first {@link QWiki.Rasci.Role} with the specified '<em><b>Name</b></em>' from the '<em><b>Support Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Rasci.Role} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Rasci.Role} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSupportRole()
	 * @generated
	 */
	Role getSupportRole(String name);

	/**
	 * Retrieves the first {@link QWiki.Rasci.Role} with the specified '<em><b>Name</b></em>' from the '<em><b>Support Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Rasci.Role} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link QWiki.Rasci.Role} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getSupportRole()
	 * @generated
	 */
	Role getSupportRole(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Consulted Role</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Rasci.Role}.
	 * It is bidirectional and its opposite is '{@link QWiki.Rasci.Role#getConsultingElement <em>Consulting Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consulted Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consulted Role</em>' reference list.
	 * @see QWiki.Rasci.RASCIPackage#getRasciElement_ConsultedRole()
	 * @see QWiki.Rasci.Role#getConsultingElement
	 * @model opposite="consultingElement" transient="true" ordered="false"
	 * @generated
	 */
	EList<Role> getConsultedRole();

	/**
	 * Retrieves the first {@link QWiki.Rasci.Role} with the specified '<em><b>Name</b></em>' from the '<em><b>Consulted Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Rasci.Role} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Rasci.Role} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getConsultedRole()
	 * @generated
	 */
	Role getConsultedRole(String name);

	/**
	 * Retrieves the first {@link QWiki.Rasci.Role} with the specified '<em><b>Name</b></em>' from the '<em><b>Consulted Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Rasci.Role} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link QWiki.Rasci.Role} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getConsultedRole()
	 * @generated
	 */
	Role getConsultedRole(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Informed Role</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Rasci.Role}.
	 * It is bidirectional and its opposite is '{@link QWiki.Rasci.Role#getInformedElement <em>Informed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Informed Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informed Role</em>' reference list.
	 * @see QWiki.Rasci.RASCIPackage#getRasciElement_InformedRole()
	 * @see QWiki.Rasci.Role#getInformedElement
	 * @model opposite="informedElement" transient="true" ordered="false"
	 * @generated
	 */
	EList<Role> getInformedRole();

	/**
	 * Retrieves the first {@link QWiki.Rasci.Role} with the specified '<em><b>Name</b></em>' from the '<em><b>Informed Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Rasci.Role} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Rasci.Role} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInformedRole()
	 * @generated
	 */
	Role getInformedRole(String name);

	/**
	 * Retrieves the first {@link QWiki.Rasci.Role} with the specified '<em><b>Name</b></em>' from the '<em><b>Informed Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Rasci.Role} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link QWiki.Rasci.Role} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getInformedRole()
	 * @generated
	 */
	Role getInformedRole(String name, boolean ignoreCase);

} // RasciElement
