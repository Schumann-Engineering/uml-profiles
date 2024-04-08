/**
 */
package QWiki.Spice;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Practise</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Spice.BasePractise#getOwningProcess <em>Owning Process</em>}</li>
 *   <li>{@link QWiki.Spice.BasePractise#getFacilitatedOutcome <em>Facilitated Outcome</em>}</li>
 *   <li>{@link QWiki.Spice.BasePractise#getFacilitatedWorkProduct <em>Facilitated Work Product</em>}</li>
 * </ul>
 *
 * @see QWiki.Spice.SPICEPackage#getBasePractise()
 * @model
 * @generated
 */
public interface BasePractise extends SpiceElement {
	/**
	 * Returns the value of the '<em><b>Owning Process</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.Process#getOwnedBasePractise <em>Owned Base Practise</em>}'.
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
	 * @see QWiki.Spice.SPICEPackage#getBasePractise_OwningProcess()
	 * @see QWiki.Spice.Process#getOwnedBasePractise
	 * @model opposite="ownedBasePractise" required="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	QWiki.Spice.Process getOwningProcess();

	/**
	 * Sets the value of the '{@link QWiki.Spice.BasePractise#getOwningProcess <em>Owning Process</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Process</em>' container reference.
	 * @see #getOwningProcess()
	 * @generated
	 */
	void setOwningProcess(QWiki.Spice.Process value);

	/**
	 * Returns the value of the '<em><b>Facilitated Outcome</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Spice.Outcome}.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.Outcome#getFacilitatingBasePractise <em>Facilitating Base Practise</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitated Outcome</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitated Outcome</em>' reference list.
	 * @see QWiki.Spice.SPICEPackage#getBasePractise_FacilitatedOutcome()
	 * @see QWiki.Spice.Outcome#getFacilitatingBasePractise
	 * @model opposite="facilitatingBasePractise" required="true" transient="true" ordered="false"
	 * @generated
	 */
	EList<Outcome> getFacilitatedOutcome();

	/**
	 * Retrieves the first {@link QWiki.Spice.Outcome} with the specified '<em><b>Name</b></em>' from the '<em><b>Facilitated Outcome</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.Outcome} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Spice.Outcome} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFacilitatedOutcome()
	 * @generated
	 */
	Outcome getFacilitatedOutcome(String name);

	/**
	 * Retrieves the first {@link QWiki.Spice.Outcome} with the specified '<em><b>Name</b></em>' from the '<em><b>Facilitated Outcome</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.Outcome} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link QWiki.Spice.Outcome} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFacilitatedOutcome()
	 * @generated
	 */
	Outcome getFacilitatedOutcome(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Facilitated Work Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitated Work Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitated Work Product</em>' reference.
	 * @see #setFacilitatedWorkProduct(WorkProduct)
	 * @see QWiki.Spice.SPICEPackage#getBasePractise_FacilitatedWorkProduct()
	 * @model transient="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='facilitatingBacePractise'"
	 * @generated
	 */
	WorkProduct getFacilitatedWorkProduct();

	/**
	 * Sets the value of the '{@link QWiki.Spice.BasePractise#getFacilitatedWorkProduct <em>Facilitated Work Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facilitated Work Product</em>' reference.
	 * @see #getFacilitatedWorkProduct()
	 * @generated
	 */
	void setFacilitatedWorkProduct(WorkProduct value);

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
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='\'bp/\' + number + \'@\' + owningProcess.oid()'"
	 * @generated
	 */
	String oid();

} // BasePractise
