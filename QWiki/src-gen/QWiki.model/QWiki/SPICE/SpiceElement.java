/**
 */
package QWiki.SPICE;

import QWiki.Bibliography.Section;

import QWiki.RASCI.RasciElement;
import QWiki.RASCI.Role;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spice Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.SPICE.SpiceElement#getOwningProcessReferenceModel <em>Owning Process Reference Model</em>}</li>
 *   <li>{@link QWiki.SPICE.SpiceElement#getNumber <em>Number</em>}</li>
 *   <li>{@link QWiki.SPICE.SpiceElement#getFacilitatedSection <em>Facilitated Section</em>}</li>
 *   <li>{@link QWiki.SPICE.SpiceElement#getOwningRole <em>Owning Role</em>}</li>
 *   <li>{@link QWiki.SPICE.SpiceElement#getManagingRole <em>Managing Role</em>}</li>
 *   <li>{@link QWiki.SPICE.SpiceElement#getParticipatingRole <em>Participating Role</em>}</li>
 *   <li>{@link QWiki.SPICE.SpiceElement#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see QWiki.SPICE.SPICEPackage#getSpiceElement()
 * @model abstract="true"
 * @generated
 */
public interface SpiceElement extends RasciElement {
	/**
	 * Returns the value of the '<em><b>Owning Process Reference Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.SPICE.ProcessReferenceModel#getOwnedSpiceElement <em>Owned Spice Element</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Infrastructure.UmlElement#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Process Reference Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Process Reference Model</em>' container reference.
	 * @see #setOwningProcessReferenceModel(ProcessReferenceModel)
	 * @see QWiki.SPICE.SPICEPackage#getSpiceElement_OwningProcessReferenceModel()
	 * @see QWiki.SPICE.ProcessReferenceModel#getOwnedSpiceElement
	 * @model opposite="ownedSpiceElement" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	ProcessReferenceModel getOwningProcessReferenceModel();

	/**
	 * Sets the value of the '{@link QWiki.SPICE.SpiceElement#getOwningProcessReferenceModel <em>Owning Process Reference Model</em>}' container reference.
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
	 * @see QWiki.SPICE.SPICEPackage#getSpiceElement_Number()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link QWiki.SPICE.SpiceElement#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Facilitated Section</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Bibliography.Section}.
	 * It is bidirectional and its opposite is '{@link QWiki.Bibliography.Section#getFacilitatingSpiceElement <em>Facilitating Spice Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitated Section</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitated Section</em>' reference list.
	 * @see QWiki.SPICE.SPICEPackage#getSpiceElement_FacilitatedSection()
	 * @see QWiki.Bibliography.Section#getFacilitatingSpiceElement
	 * @model opposite="facilitatingSpiceElement" transient="true" ordered="false"
	 * @generated
	 */
	EList<Section> getFacilitatedSection();

	/**
	 * Returns the value of the '<em><b>Owning Role</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.SPICE.SpiceElement#getRole() <em>Role</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Role</em>' reference.
	 * @see #setOwningRole(Role)
	 * @see QWiki.SPICE.SPICEPackage#getSpiceElement_OwningRole()
	 * @model transient="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='spiceelement'"
	 *        annotation="subsets"
	 * @generated
	 */
	Role getOwningRole();

	/**
	 * Sets the value of the '{@link QWiki.SPICE.SpiceElement#getOwningRole <em>Owning Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Role</em>' reference.
	 * @see #getOwningRole()
	 * @generated
	 */
	void setOwningRole(Role value);

	/**
	 * Returns the value of the '<em><b>Managing Role</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.SPICE.SpiceElement#getRole() <em>Role</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Managing Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Managing Role</em>' reference.
	 * @see #setManagingRole(Role)
	 * @see QWiki.SPICE.SPICEPackage#getSpiceElement_ManagingRole()
	 * @model transient="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='spiceelement'"
	 *        annotation="subsets"
	 * @generated
	 */
	Role getManagingRole();

	/**
	 * Sets the value of the '{@link QWiki.SPICE.SpiceElement#getManagingRole <em>Managing Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managing Role</em>' reference.
	 * @see #getManagingRole()
	 * @generated
	 */
	void setManagingRole(Role value);

	/**
	 * Returns the value of the '<em><b>Participating Role</b></em>' reference list.
	 * The list contents are of type {@link QWiki.RASCI.Role}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.SPICE.SpiceElement#getRole() <em>Role</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participating Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participating Role</em>' reference list.
	 * @see QWiki.SPICE.SPICEPackage#getSpiceElement_ParticipatingRole()
	 * @model transient="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='spiceelement'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Role> getParticipatingRole();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' reference list.
	 * The list contents are of type {@link QWiki.RASCI.Role}.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' reference list.
	 * @see QWiki.SPICE.SPICEPackage#getSpiceElement_Role()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='spiceelement'"
	 *        annotation="union"
	 * @generated
	 */
	EList<Role> getRole();

} // SpiceElement
