/**
 */
package QWiki.Spice;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Spice.Process#getOwningProcessGroup <em>Owning Process Group</em>}</li>
 *   <li>{@link QWiki.Spice.Process#getOwnedOutcome <em>Owned Outcome</em>}</li>
 *   <li>{@link QWiki.Spice.Process#getFacilitatingWorkProduct <em>Facilitating Work Product</em>}</li>
 *   <li>{@link QWiki.Spice.Process#getFacilitatedWorkProduct <em>Facilitated Work Product</em>}</li>
 *   <li>{@link QWiki.Spice.Process#getOwnedBasePractise <em>Owned Base Practise</em>}</li>
 * </ul>
 *
 * @see QWiki.Spice.SpicePackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends SpiceElement {
	/**
	 * Returns the value of the '<em><b>Owning Process Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.ProcessGroup#getOwnedProcess <em>Owned Process</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Process Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Process Group</em>' container reference.
	 * @see #setOwningProcessGroup(ProcessGroup)
	 * @see QWiki.Spice.SpicePackage#getProcess_OwningProcessGroup()
	 * @see QWiki.Spice.ProcessGroup#getOwnedProcess
	 * @model opposite="ownedProcess" resolveProxies="false" ordered="false"
	 *        extendedMetaData="kind='element'"
	 *        annotation="subsets"
	 * @generated
	 */
	ProcessGroup getOwningProcessGroup();

	/**
	 * Sets the value of the '{@link QWiki.Spice.Process#getOwningProcessGroup <em>Owning Process Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Process Group</em>' container reference.
	 * @see #getOwningProcessGroup()
	 * @generated
	 */
	void setOwningProcessGroup(ProcessGroup value);

	/**
	 * Returns the value of the '<em><b>Owned Outcome</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.Spice.Outcome}.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.Outcome#getOwningProcess <em>Owning Process</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Outcome</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Outcome</em>' containment reference list.
	 * @see QWiki.Spice.SpicePackage#getProcess_OwnedOutcome()
	 * @see QWiki.Spice.Outcome#getOwningProcess
	 * @model opposite="owningProcess" containment="true"
	 *        extendedMetaData="kind='element'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Outcome> getOwnedOutcome();

	/**
	 * Retrieves the first {@link QWiki.Spice.Outcome} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Outcome</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.Outcome} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Spice.Outcome} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedOutcome()
	 * @generated
	 */
	Outcome getOwnedOutcome(String name);

	/**
	 * Retrieves the first {@link QWiki.Spice.Outcome} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Outcome</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.Outcome} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link QWiki.Spice.Outcome} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedOutcome()
	 * @generated
	 */
	Outcome getOwnedOutcome(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Facilitating Work Product</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Spice.WorkProduct}.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.WorkProduct#getFacilitatedProcess <em>Facilitated Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitating Work Product</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitating Work Product</em>' reference list.
	 * @see QWiki.Spice.SpicePackage#getProcess_FacilitatingWorkProduct()
	 * @see QWiki.Spice.WorkProduct#getFacilitatedProcess
	 * @model opposite="facilitatedProcess" resolveProxies="false" transient="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<WorkProduct> getFacilitatingWorkProduct();

	/**
	 * Retrieves the first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>' from the '<em><b>Facilitating Work Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.WorkProduct} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFacilitatingWorkProduct()
	 * @generated
	 */
	WorkProduct getFacilitatingWorkProduct(String name);

	/**
	 * Retrieves the first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>' from the '<em><b>Facilitating Work Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.WorkProduct} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link QWiki.Spice.WorkProduct} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFacilitatingWorkProduct()
	 * @generated
	 */
	WorkProduct getFacilitatingWorkProduct(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Facilitated Work Product</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Spice.WorkProduct}.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.WorkProduct#getFacilitatingProcess <em>Facilitating Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitated Work Product</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitated Work Product</em>' reference list.
	 * @see QWiki.Spice.SpicePackage#getProcess_FacilitatedWorkProduct()
	 * @see QWiki.Spice.WorkProduct#getFacilitatingProcess
	 * @model opposite="facilitatingProcess" resolveProxies="false" transient="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<WorkProduct> getFacilitatedWorkProduct();

	/**
	 * Retrieves the first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>' from the '<em><b>Facilitated Work Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.WorkProduct} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFacilitatedWorkProduct()
	 * @generated
	 */
	WorkProduct getFacilitatedWorkProduct(String name);

	/**
	 * Retrieves the first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>' from the '<em><b>Facilitated Work Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.WorkProduct} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link QWiki.Spice.WorkProduct} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFacilitatedWorkProduct()
	 * @generated
	 */
	WorkProduct getFacilitatedWorkProduct(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Owned Base Practise</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.Spice.BasePractise}.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.BasePractise#getOwningProcess <em>Owning Process</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Base Practise</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Base Practise</em>' containment reference list.
	 * @see QWiki.Spice.SpicePackage#getProcess_OwnedBasePractise()
	 * @see QWiki.Spice.BasePractise#getOwningProcess
	 * @model opposite="owningProcess" containment="true"
	 *        extendedMetaData="kind='element'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<BasePractise> getOwnedBasePractise();

	/**
	 * Retrieves the first {@link QWiki.Spice.BasePractise} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Base Practise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.BasePractise} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Spice.BasePractise} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedBasePractise()
	 * @generated
	 */
	BasePractise getOwnedBasePractise(String name);

	/**
	 * Retrieves the first {@link QWiki.Spice.BasePractise} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Base Practise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.BasePractise} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link QWiki.Spice.BasePractise} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedBasePractise()
	 * @generated
	 */
	BasePractise getOwnedBasePractise(String name, boolean ignoreCase);

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
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='owningProcessGroup.objectId() +  \'.\' + number'"
	 * @generated
	 */
	String objectId();

} // Process
