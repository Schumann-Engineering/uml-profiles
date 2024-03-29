/**
 */
package QWiki.SPICE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.SPICE.Process#getOwningProcessGroup <em>Owning Process Group</em>}</li>
 *   <li>{@link QWiki.SPICE.Process#getOwnedOutcome <em>Owned Outcome</em>}</li>
 *   <li>{@link QWiki.SPICE.Process#getFacilitatingWorkProduct <em>Facilitating Work Product</em>}</li>
 *   <li>{@link QWiki.SPICE.Process#getFacilitatedWorkProduct <em>Facilitated Work Product</em>}</li>
 *   <li>{@link QWiki.SPICE.Process#getOwnedBasePractise <em>Owned Base Practise</em>}</li>
 * </ul>
 *
 * @see QWiki.SPICE.SPICEPackage#getProcess()
 * @model annotation="duplicates"
 * @generated
 */
public interface Process extends SpiceElement {
	/**
	 * Returns the value of the '<em><b>Owning Process Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.SPICE.ProcessGroup#getOwnedProcess <em>Owned Process</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Infrastructure.UmlElement#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Process Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Process Group</em>' container reference.
	 * @see #setOwningProcessGroup(ProcessGroup)
	 * @see QWiki.SPICE.SPICEPackage#getProcess_OwningProcessGroup()
	 * @see QWiki.SPICE.ProcessGroup#getOwnedProcess
	 * @model opposite="ownedProcess" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	ProcessGroup getOwningProcessGroup();

	/**
	 * Sets the value of the '{@link QWiki.SPICE.Process#getOwningProcessGroup <em>Owning Process Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Process Group</em>' container reference.
	 * @see #getOwningProcessGroup()
	 * @generated
	 */
	void setOwningProcessGroup(ProcessGroup value);

	/**
	 * Returns the value of the '<em><b>Owned Outcome</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.SPICE.Outcome}.
	 * It is bidirectional and its opposite is '{@link QWiki.SPICE.Outcome#getOwningProcess <em>Owning Process</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Infrastructure.UmlElement#getOwnedElement() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Outcome</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Outcome</em>' containment reference list.
	 * @see QWiki.SPICE.SPICEPackage#getProcess_OwnedOutcome()
	 * @see QWiki.SPICE.Outcome#getOwningProcess
	 * @model opposite="owningProcess" containment="true" transient="true"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Outcome> getOwnedOutcome();

	/**
	 * Returns the value of the '<em><b>Facilitating Work Product</b></em>' reference list.
	 * The list contents are of type {@link QWiki.SPICE.WorkProduct}.
	 * It is bidirectional and its opposite is '{@link QWiki.SPICE.WorkProduct#getFacilitatedProcess <em>Facilitated Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitating Work Product</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitating Work Product</em>' reference list.
	 * @see QWiki.SPICE.SPICEPackage#getProcess_FacilitatingWorkProduct()
	 * @see QWiki.SPICE.WorkProduct#getFacilitatedProcess
	 * @model opposite="facilitatedProcess" transient="true" ordered="false"
	 * @generated
	 */
	EList<WorkProduct> getFacilitatingWorkProduct();

	/**
	 * Returns the value of the '<em><b>Facilitated Work Product</b></em>' reference list.
	 * The list contents are of type {@link QWiki.SPICE.WorkProduct}.
	 * It is bidirectional and its opposite is '{@link QWiki.SPICE.WorkProduct#getFacilitatingProcess <em>Facilitating Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitated Work Product</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitated Work Product</em>' reference list.
	 * @see QWiki.SPICE.SPICEPackage#getProcess_FacilitatedWorkProduct()
	 * @see QWiki.SPICE.WorkProduct#getFacilitatingProcess
	 * @model opposite="facilitatingProcess" transient="true" ordered="false"
	 * @generated
	 */
	EList<WorkProduct> getFacilitatedWorkProduct();

	/**
	 * Returns the value of the '<em><b>Owned Base Practise</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.SPICE.SpiceBasePractise}.
	 * It is bidirectional and its opposite is '{@link QWiki.SPICE.SpiceBasePractise#getOwningProcess <em>Owning Process</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Infrastructure.UmlElement#getOwnedElement() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Base Practise</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Base Practise</em>' containment reference list.
	 * @see QWiki.SPICE.SPICEPackage#getProcess_OwnedBasePractise()
	 * @see QWiki.SPICE.SpiceBasePractise#getOwningProcess
	 * @model opposite="owningProcess" containment="true" transient="true"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<SpiceBasePractise> getOwnedBasePractise();

} // Process
