/**
 */
package QWiki;

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
 *   <li>{@link QWiki.ProcessGroup#getOnwedProcess <em>Onwed Process</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getProcessGroup()
 * @model
 * @generated
 */
public interface ProcessGroup extends SpiceElement {
	/**
	 * Returns the value of the '<em><b>Onwed Process</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.Process}.
	 * It is bidirectional and its opposite is '{@link QWiki.Process#getOwningProcessGroup <em>Owning Process Group</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Element#getOwnedElement() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onwed Process</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onwed Process</em>' containment reference list.
	 * @see QWiki.QWikiPackage#getProcessGroup_OnwedProcess()
	 * @see QWiki.Process#getOwningProcessGroup
	 * @model opposite="owningProcessGroup" containment="true"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<QWiki.Process> getOnwedProcess();

} // ProcessGroup
