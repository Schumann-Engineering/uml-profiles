/**
 */
package QWiki.Spice;

import QWiki.Content.Section;
import QWiki.QWikiContainer;

import QWiki.Rasci.RasciElement;
import QWiki.Rasci.Role;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Spice.SpiceElement#getOwningProcessReferenceModel <em>Owning Process Reference Model</em>}</li>
 *   <li>{@link QWiki.Spice.SpiceElement#getNumber <em>Number</em>}</li>
 *   <li>{@link QWiki.Spice.SpiceElement#getFacilitatedSection <em>Facilitated Section</em>}</li>
 *   <li>{@link QWiki.Spice.SpiceElement#getOwnerRole <em>Owner Role</em>}</li>
 *   <li>{@link QWiki.Spice.SpiceElement#getManagerRole <em>Manager Role</em>}</li>
 *   <li>{@link QWiki.Spice.SpiceElement#getParticipantRole <em>Participant Role</em>}</li>
 *   <li>{@link QWiki.Spice.SpiceElement#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see QWiki.Spice.SpicePackage#getSpiceElement()
 * @model abstract="true"
 * @generated
 */
public interface SpiceElement extends QWikiContainer, RasciElement {
	/**
	 * Returns the value of the '<em><b>Owning Process Reference Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.ProcessReferenceModel#getOwnedSpiceElement <em>Owned Spice Element</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Process Reference Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Process Reference Model</em>' container reference.
	 * @see #setOwningProcessReferenceModel(ProcessReferenceModel)
	 * @see QWiki.Spice.SpicePackage#getSpiceElement_OwningProcessReferenceModel()
	 * @see QWiki.Spice.ProcessReferenceModel#getOwnedSpiceElement
	 * @model opposite="ownedSpiceElement" resolveProxies="false" ordered="false"
	 *        extendedMetaData="kind='element'"
	 *        annotation="subsets"
	 * @generated
	 */
	ProcessReferenceModel getOwningProcessReferenceModel();

	/**
	 * Sets the value of the '{@link QWiki.Spice.SpiceElement#getOwningProcessReferenceModel <em>Owning Process Reference Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Process Reference Model</em>' container reference.
	 * @see #getOwningProcessReferenceModel()
	 * @generated
	 */
	void setOwningProcessReferenceModel(ProcessReferenceModel value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see QWiki.Spice.SpicePackage#getSpiceElement_Number()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link QWiki.Spice.SpiceElement#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Facilitated Section</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Content.Section}.
	 * It is bidirectional and its opposite is '{@link QWiki.Content.Section#getFacilitatingSpiceElement <em>Facilitating Spice Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitated Section</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitated Section</em>' reference list.
	 * @see QWiki.Spice.SpicePackage#getSpiceElement_FacilitatedSection()
	 * @see QWiki.Content.Section#getFacilitatingSpiceElement
	 * @model opposite="facilitatingSpiceElement" resolveProxies="false" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<Section> getFacilitatedSection();

	/**
	 * Retrieves the first {@link QWiki.Content.Section} with the specified '<em><b>Name</b></em>' from the '<em><b>Facilitated Section</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Content.Section} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Content.Section} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFacilitatedSection()
	 * @generated
	 */
	Section getFacilitatedSection(String name);

	/**
	 * Retrieves the first {@link QWiki.Content.Section} with the specified '<em><b>Name</b></em>' from the '<em><b>Facilitated Section</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Content.Section} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link QWiki.Content.Section} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFacilitatedSection()
	 * @generated
	 */
	Section getFacilitatedSection(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Owner Role</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Spice.SpiceElement#getRole() <em>Role</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Role</em>' reference.
	 * @see #setOwnerRole(Role)
	 * @see QWiki.Spice.SpicePackage#getSpiceElement_OwnerRole()
	 * @model resolveProxies="false" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='spiceelement'"
	 *        extendedMetaData="kind='element'"
	 *        annotation="subsets"
	 * @generated
	 */
	Role getOwnerRole();

	/**
	 * Sets the value of the '{@link QWiki.Spice.SpiceElement#getOwnerRole <em>Owner Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Role</em>' reference.
	 * @see #getOwnerRole()
	 * @generated
	 */
	void setOwnerRole(Role value);

	/**
	 * Returns the value of the '<em><b>Manager Role</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Spice.SpiceElement#getRole() <em>Role</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager Role</em>' reference.
	 * @see #setManagerRole(Role)
	 * @see QWiki.Spice.SpicePackage#getSpiceElement_ManagerRole()
	 * @model resolveProxies="false" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='spiceelement'"
	 *        extendedMetaData="kind='element'"
	 *        annotation="subsets"
	 * @generated
	 */
	Role getManagerRole();

	/**
	 * Sets the value of the '{@link QWiki.Spice.SpiceElement#getManagerRole <em>Manager Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager Role</em>' reference.
	 * @see #getManagerRole()
	 * @generated
	 */
	void setManagerRole(Role value);

	/**
	 * Returns the value of the '<em><b>Participant Role</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Rasci.Role}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Spice.SpiceElement#getRole() <em>Role</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Role</em>' reference list.
	 * @see QWiki.Spice.SpicePackage#getSpiceElement_ParticipantRole()
	 * @model resolveProxies="false" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='spiceelement'"
	 *        extendedMetaData="kind='element'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Role> getParticipantRole();

	/**
	 * Retrieves the first {@link QWiki.Rasci.Role} with the specified '<em><b>Name</b></em>' from the '<em><b>Participant Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Rasci.Role} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Rasci.Role} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getParticipantRole()
	 * @generated
	 */
	Role getParticipantRole(String name);

	/**
	 * Retrieves the first {@link QWiki.Rasci.Role} with the specified '<em><b>Name</b></em>' from the '<em><b>Participant Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Rasci.Role} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link QWiki.Rasci.Role} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getParticipantRole()
	 * @generated
	 */
	Role getParticipantRole(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Rasci.Role}.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference list.
	 * @see QWiki.Spice.SpicePackage#getSpiceElement_Role()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='spiceelement'"
	 *        annotation="union"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<Role> getRole();

	/**
	 * Retrieves the first {@link QWiki.Rasci.Role} with the specified '<em><b>Name</b></em>' from the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Rasci.Role} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Rasci.Role} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRole()
	 * @generated
	 */
	Role getRole(String name);

	/**
	 * Retrieves the first {@link QWiki.Rasci.Role} with the specified '<em><b>Name</b></em>' from the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Rasci.Role} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link QWiki.Rasci.Role} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRole()
	 * @generated
	 */
	Role getRole(String name, boolean ignoreCase);

} // SpiceElement
