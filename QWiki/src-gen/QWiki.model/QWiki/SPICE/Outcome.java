/**
 */
package QWiki.Spice;

import QWiki.Kernel.I18nNamedElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outcome</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Spice.Outcome#getFacilitatingBasePractise <em>Facilitating Base Practise</em>}</li>
 *   <li>{@link QWiki.Spice.Outcome#getRequiredWorkproduct <em>Required Workproduct</em>}</li>
 *   <li>{@link QWiki.Spice.Outcome#getResultingWorkproduct <em>Resulting Workproduct</em>}</li>
 *   <li>{@link QWiki.Spice.Outcome#getOwningProcess <em>Owning Process</em>}</li>
 * </ul>
 *
 * @see QWiki.Spice.SPICEPackage#getOutcome()
 * @model
 * @generated
 */
public interface Outcome extends I18nNamedElement {
	/**
	 * Returns the value of the '<em><b>Facilitating Base Practise</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Spice.BasePractise}.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.BasePractise#getFacilitatedOutcome <em>Facilitated Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitating Base Practise</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitating Base Practise</em>' reference list.
	 * @see QWiki.Spice.SPICEPackage#getOutcome_FacilitatingBasePractise()
	 * @see QWiki.Spice.BasePractise#getFacilitatedOutcome
	 * @model opposite="facilitatedOutcome" required="true" transient="true" ordered="false"
	 * @generated
	 */
	EList<BasePractise> getFacilitatingBasePractise();

	/**
	 * Retrieves the first {@link QWiki.Spice.BasePractise} with the specified '<em><b>Name</b></em>' from the '<em><b>Facilitating Base Practise</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.BasePractise} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Spice.BasePractise} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFacilitatingBasePractise()
	 * @generated
	 */
	BasePractise getFacilitatingBasePractise(String name);

	/**
	 * Retrieves the first {@link QWiki.Spice.BasePractise} with the specified '<em><b>Name</b></em>' from the '<em><b>Facilitating Base Practise</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.BasePractise} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link QWiki.Spice.BasePractise} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFacilitatingBasePractise()
	 * @generated
	 */
	BasePractise getFacilitatingBasePractise(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Required Workproduct</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Spice.WorkProduct}.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.WorkProduct#getFacilitatedOutcome <em>Facilitated Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Workproduct</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Workproduct</em>' reference list.
	 * @see QWiki.Spice.SPICEPackage#getOutcome_RequiredWorkproduct()
	 * @see QWiki.Spice.WorkProduct#getFacilitatedOutcome
	 * @model opposite="facilitatedOutcome" transient="true" ordered="false"
	 * @generated
	 */
	EList<WorkProduct> getRequiredWorkproduct();

	/**
	 * Retrieves the first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>' from the '<em><b>Required Workproduct</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.WorkProduct} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRequiredWorkproduct()
	 * @generated
	 */
	WorkProduct getRequiredWorkproduct(String name);

	/**
	 * Retrieves the first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>' from the '<em><b>Required Workproduct</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.WorkProduct} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link QWiki.Spice.WorkProduct} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getRequiredWorkproduct()
	 * @generated
	 */
	WorkProduct getRequiredWorkproduct(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Resulting Workproduct</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Spice.WorkProduct}.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.WorkProduct#getFacilitatingOutcome <em>Facilitating Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resulting Workproduct</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resulting Workproduct</em>' reference list.
	 * @see QWiki.Spice.SPICEPackage#getOutcome_ResultingWorkproduct()
	 * @see QWiki.Spice.WorkProduct#getFacilitatingOutcome
	 * @model opposite="facilitatingOutcome" transient="true" ordered="false"
	 * @generated
	 */
	EList<WorkProduct> getResultingWorkproduct();

	/**
	 * Retrieves the first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>' from the '<em><b>Resulting Workproduct</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.WorkProduct} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getResultingWorkproduct()
	 * @generated
	 */
	WorkProduct getResultingWorkproduct(String name);

	/**
	 * Retrieves the first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>' from the '<em><b>Resulting Workproduct</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.WorkProduct} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link QWiki.Spice.WorkProduct} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getResultingWorkproduct()
	 * @generated
	 */
	WorkProduct getResultingWorkproduct(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Owning Process</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.Process#getOwnedOutcome <em>Owned Outcome</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Process</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Process</em>' container reference.
	 * @see #setOwningProcess(QWiki.Spice.Process)
	 * @see QWiki.Spice.SPICEPackage#getOutcome_OwningProcess()
	 * @see QWiki.Spice.Process#getOwnedOutcome
	 * @model opposite="ownedOutcome" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	QWiki.Spice.Process getOwningProcess();

	/**
	 * Sets the value of the '{@link QWiki.Spice.Outcome#getOwningProcess <em>Owning Process</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Process</em>' container reference.
	 * @see #getOwningProcess()
	 * @generated
	 */
	void setOwningProcess(QWiki.Spice.Process value);

	/**
	 * <p>
	 * This operation redefines the following operations:
	 * <ul>
	 *   <li>'{@link QWiki.Kernel.QWikiElement#oid() <em>Oid</em>}' </li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='\'oc/\' + uuid + \'@\' + owningProcess.oid()'"
	 * @generated
	 */
	String oid();

} // Outcome
