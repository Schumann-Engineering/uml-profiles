/**
 */
package QWiki;

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
 *   <li>{@link QWiki.Outcome#getFacilitatingBasePractise <em>Facilitating Base Practise</em>}</li>
 *   <li>{@link QWiki.Outcome#getRequiredWorkproduct <em>Required Workproduct</em>}</li>
 *   <li>{@link QWiki.Outcome#getResultingWorkproduct <em>Resulting Workproduct</em>}</li>
 *   <li>{@link QWiki.Outcome#getOwningProcess <em>Owning Process</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getOutcome()
 * @model
 * @generated
 */
public interface Outcome extends I18nNamedElement {
	/**
	 * Returns the value of the '<em><b>Facilitating Base Practise</b></em>' reference list.
	 * The list contents are of type {@link QWiki.BasePractise}.
	 * It is bidirectional and its opposite is '{@link QWiki.BasePractise#getFacilitatedOutcome <em>Facilitated Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitating Base Practise</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitating Base Practise</em>' reference list.
	 * @see QWiki.QWikiPackage#getOutcome_FacilitatingBasePractise()
	 * @see QWiki.BasePractise#getFacilitatedOutcome
	 * @model opposite="facilitatedOutcome" required="true" ordered="false"
	 * @generated
	 */
	EList<BasePractise> getFacilitatingBasePractise();

	/**
	 * Returns the value of the '<em><b>Required Workproduct</b></em>' reference list.
	 * The list contents are of type {@link QWiki.WorkProduct}.
	 * It is bidirectional and its opposite is '{@link QWiki.WorkProduct#getFacilitatedOutcome <em>Facilitated Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Workproduct</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Workproduct</em>' reference list.
	 * @see QWiki.QWikiPackage#getOutcome_RequiredWorkproduct()
	 * @see QWiki.WorkProduct#getFacilitatedOutcome
	 * @model opposite="facilitatedOutcome" ordered="false"
	 * @generated
	 */
	EList<WorkProduct> getRequiredWorkproduct();

	/**
	 * Returns the value of the '<em><b>Resulting Workproduct</b></em>' reference list.
	 * The list contents are of type {@link QWiki.WorkProduct}.
	 * It is bidirectional and its opposite is '{@link QWiki.WorkProduct#getFacilitatingOutcome <em>Facilitating Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resulting Workproduct</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resulting Workproduct</em>' reference list.
	 * @see QWiki.QWikiPackage#getOutcome_ResultingWorkproduct()
	 * @see QWiki.WorkProduct#getFacilitatingOutcome
	 * @model opposite="facilitatingOutcome" ordered="false"
	 * @generated
	 */
	EList<WorkProduct> getResultingWorkproduct();

	/**
	 * Returns the value of the '<em><b>Owning Process</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Process#getOwnedOutcome <em>Owned Outcome</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Process</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Process</em>' container reference.
	 * @see #setOwningProcess(QWiki.Process)
	 * @see QWiki.QWikiPackage#getOutcome_OwningProcess()
	 * @see QWiki.Process#getOwnedOutcome
	 * @model opposite="ownedOutcome" required="true" transient="false" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	QWiki.Process getOwningProcess();

	/**
	 * Sets the value of the '{@link QWiki.Outcome#getOwningProcess <em>Owning Process</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Process</em>' container reference.
	 * @see #getOwningProcess()
	 * @generated
	 */
	void setOwningProcess(QWiki.Process value);

} // Outcome
