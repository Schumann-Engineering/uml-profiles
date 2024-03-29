/**
 */
package QWiki.SPICE;

import QWiki.I18N.I18nNamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outcome</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.SPICE.Outcome#getFacilitatingBasePractise <em>Facilitating Base Practise</em>}</li>
 *   <li>{@link QWiki.SPICE.Outcome#getRequiredWorkproduct <em>Required Workproduct</em>}</li>
 *   <li>{@link QWiki.SPICE.Outcome#getResultingWorkproduct <em>Resulting Workproduct</em>}</li>
 *   <li>{@link QWiki.SPICE.Outcome#getOwningProcess <em>Owning Process</em>}</li>
 * </ul>
 *
 * @see QWiki.SPICE.SPICEPackage#getOutcome()
 * @model annotation="duplicates"
 * @generated
 */
public interface Outcome extends I18nNamedElement {
	/**
	 * Returns the value of the '<em><b>Facilitating Base Practise</b></em>' reference list.
	 * The list contents are of type {@link QWiki.SPICE.SpiceBasePractise}.
	 * It is bidirectional and its opposite is '{@link QWiki.SPICE.SpiceBasePractise#getFacilitatedOutcome <em>Facilitated Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitating Base Practise</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitating Base Practise</em>' reference list.
	 * @see QWiki.SPICE.SPICEPackage#getOutcome_FacilitatingBasePractise()
	 * @see QWiki.SPICE.SpiceBasePractise#getFacilitatedOutcome
	 * @model opposite="facilitatedOutcome" required="true" transient="true" ordered="false"
	 * @generated
	 */
	EList<SpiceBasePractise> getFacilitatingBasePractise();

	/**
	 * Returns the value of the '<em><b>Required Workproduct</b></em>' reference list.
	 * The list contents are of type {@link QWiki.SPICE.WorkProduct}.
	 * It is bidirectional and its opposite is '{@link QWiki.SPICE.WorkProduct#getFacilitatedOutcome <em>Facilitated Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Workproduct</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Workproduct</em>' reference list.
	 * @see QWiki.SPICE.SPICEPackage#getOutcome_RequiredWorkproduct()
	 * @see QWiki.SPICE.WorkProduct#getFacilitatedOutcome
	 * @model opposite="facilitatedOutcome" transient="true" ordered="false"
	 * @generated
	 */
	EList<WorkProduct> getRequiredWorkproduct();

	/**
	 * Returns the value of the '<em><b>Resulting Workproduct</b></em>' reference list.
	 * The list contents are of type {@link QWiki.SPICE.WorkProduct}.
	 * It is bidirectional and its opposite is '{@link QWiki.SPICE.WorkProduct#getFacilitatingOutcome <em>Facilitating Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resulting Workproduct</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resulting Workproduct</em>' reference list.
	 * @see QWiki.SPICE.SPICEPackage#getOutcome_ResultingWorkproduct()
	 * @see QWiki.SPICE.WorkProduct#getFacilitatingOutcome
	 * @model opposite="facilitatingOutcome" transient="true" ordered="false"
	 * @generated
	 */
	EList<WorkProduct> getResultingWorkproduct();

	/**
	 * Returns the value of the '<em><b>Owning Process</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.SPICE.Process#getOwnedOutcome <em>Owned Outcome</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Infrastructure.UmlElement#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Process</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Process</em>' container reference.
	 * @see #setOwningProcess(QWiki.SPICE.Process)
	 * @see QWiki.SPICE.SPICEPackage#getOutcome_OwningProcess()
	 * @see QWiki.SPICE.Process#getOwnedOutcome
	 * @model opposite="ownedOutcome" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	QWiki.SPICE.Process getOwningProcess();

	/**
	 * Sets the value of the '{@link QWiki.SPICE.Outcome#getOwningProcess <em>Owning Process</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Process</em>' container reference.
	 * @see #getOwningProcess()
	 * @generated
	 */
	void setOwningProcess(QWiki.SPICE.Process value);

} // Outcome
