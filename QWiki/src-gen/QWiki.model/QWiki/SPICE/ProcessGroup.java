/**
 */
package QWiki.SPICE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.SPICE.ProcessGroup#getOwnedProcess <em>Owned Process</em>}</li>
 * </ul>
 *
 * @see QWiki.SPICE.SPICEPackage#getProcessGroup()
 * @model annotation="duplicates"
 * @generated
 */
public interface ProcessGroup extends SpiceElement {
	/**
	 * Returns the value of the '<em><b>Owned Process</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.SPICE.Process}.
	 * It is bidirectional and its opposite is '{@link QWiki.SPICE.Process#getOwningProcessGroup <em>Owning Process Group</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Infrastructure.UmlElement#getOwnedElement() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Process</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Process</em>' containment reference list.
	 * @see QWiki.SPICE.SPICEPackage#getProcessGroup_OwnedProcess()
	 * @see QWiki.SPICE.Process#getOwningProcessGroup
	 * @model opposite="owningProcessGroup" containment="true" transient="true"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<QWiki.SPICE.Process> getOwnedProcess();

} // ProcessGroup
