/**
 */
package QWiki;

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
 *   <li>{@link QWiki.BasePractise#getOwningProcess <em>Owning Process</em>}</li>
 *   <li>{@link QWiki.BasePractise#getFacilitatedOutcome <em>Facilitated Outcome</em>}</li>
 *   <li>{@link QWiki.BasePractise#getFacilitatedWorkProduct <em>Facilitated Work Product</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getBasePractise()
 * @model
 * @generated
 */
public interface BasePractise extends SpiceElement {
	/**
	 * Returns the value of the '<em><b>Owning Process</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Process#getOwnedBasePractise <em>Owned Base Practise</em>}'.
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
	 * @see QWiki.QWikiPackage#getBasePractise_OwningProcess()
	 * @see QWiki.Process#getOwnedBasePractise
	 * @model opposite="ownedBasePractise" required="true" transient="false" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	QWiki.Process getOwningProcess();

	/**
	 * Sets the value of the '{@link QWiki.BasePractise#getOwningProcess <em>Owning Process</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Process</em>' container reference.
	 * @see #getOwningProcess()
	 * @generated
	 */
	void setOwningProcess(QWiki.Process value);

	/**
	 * Returns the value of the '<em><b>Facilitated Outcome</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Outcome}.
	 * It is bidirectional and its opposite is '{@link QWiki.Outcome#getFacilitatingBasePractise <em>Facilitating Base Practise</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitated Outcome</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitated Outcome</em>' reference list.
	 * @see QWiki.QWikiPackage#getBasePractise_FacilitatedOutcome()
	 * @see QWiki.Outcome#getFacilitatingBasePractise
	 * @model opposite="facilitatingBasePractise" required="true" ordered="false"
	 * @generated
	 */
	EList<Outcome> getFacilitatedOutcome();

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
	 * @see QWiki.QWikiPackage#getBasePractise_FacilitatedWorkProduct()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='facilitatingBacePractise'"
	 * @generated
	 */
	WorkProduct getFacilitatedWorkProduct();

	/**
	 * Sets the value of the '{@link QWiki.BasePractise#getFacilitatedWorkProduct <em>Facilitated Work Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facilitated Work Product</em>' reference.
	 * @see #getFacilitatedWorkProduct()
	 * @generated
	 */
	void setFacilitatedWorkProduct(WorkProduct value);

} // BasePractise
