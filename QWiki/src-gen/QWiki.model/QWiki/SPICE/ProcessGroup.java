/**
 */
package QWiki.Spice;

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
 *   <li>{@link QWiki.Spice.ProcessGroup#getOwnedProcess <em>Owned Process</em>}</li>
 * </ul>
 *
 * @see QWiki.Spice.SPICEPackage#getProcessGroup()
 * @model
 * @generated
 */
public interface ProcessGroup extends SpiceElement {
	/**
	 * Returns the value of the '<em><b>Owned Process</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.Spice.Process}.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.Process#getOwningProcessGroup <em>Owning Process Group</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Process</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Process</em>' containment reference list.
	 * @see QWiki.Spice.SPICEPackage#getProcessGroup_OwnedProcess()
	 * @see QWiki.Spice.Process#getOwningProcessGroup
	 * @model opposite="owningProcessGroup" containment="true" transient="true"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<QWiki.Spice.Process> getOwnedProcess();

	/**
	 * Retrieves the first {@link QWiki.Spice.Process} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.Process} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Spice.Process} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedProcess()
	 * @generated
	 */
	QWiki.Spice.Process getOwnedProcess(String name);

	/**
	 * Retrieves the first {@link QWiki.Spice.Process} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.Process} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link QWiki.Spice.Process} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedProcess()
	 * @generated
	 */
	QWiki.Spice.Process getOwnedProcess(String name, boolean ignoreCase);

	/**
	 * <p>
	 * This operation redefines the following operations:
	 * <ul>
	 *   <li>'{@link QWiki.Kernel.QWikiElement#oidBasic() <em>Oid Basic</em>}' </li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='\'p/\' + number'"
	 * @generated
	 */
	String oid();

} // ProcessGroup
