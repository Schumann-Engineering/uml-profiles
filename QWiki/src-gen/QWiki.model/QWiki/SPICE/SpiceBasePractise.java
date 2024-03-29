/**
 */
package QWiki.SPICE;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spice Base Practise</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.SPICE.SpiceBasePractise#getOwningProcess <em>Owning Process</em>}</li>
 *   <li>{@link QWiki.SPICE.SpiceBasePractise#getFacilitatedOutcome <em>Facilitated Outcome</em>}</li>
 *   <li>{@link QWiki.SPICE.SpiceBasePractise#getFacilitatedWorkProduct <em>Facilitated Work Product</em>}</li>
 * </ul>
 *
 * @see QWiki.SPICE.SPICEPackage#getSpiceBasePractise()
 * @model annotation="duplicates"
 * @generated
 */
public interface SpiceBasePractise extends SpiceElement {
	/**
	 * Returns the value of the '<em><b>Owning Process</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.SPICE.Process#getOwnedBasePractise <em>Owned Base Practise</em>}'.
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
	 * @see QWiki.SPICE.SPICEPackage#getSpiceBasePractise_OwningProcess()
	 * @see QWiki.SPICE.Process#getOwnedBasePractise
	 * @model opposite="ownedBasePractise" required="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	QWiki.SPICE.Process getOwningProcess();

	/**
	 * Sets the value of the '{@link QWiki.SPICE.SpiceBasePractise#getOwningProcess <em>Owning Process</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Process</em>' container reference.
	 * @see #getOwningProcess()
	 * @generated
	 */
	void setOwningProcess(QWiki.SPICE.Process value);

	/**
	 * Returns the value of the '<em><b>Facilitated Outcome</b></em>' reference list.
	 * The list contents are of type {@link QWiki.SPICE.Outcome}.
	 * It is bidirectional and its opposite is '{@link QWiki.SPICE.Outcome#getFacilitatingBasePractise <em>Facilitating Base Practise</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitated Outcome</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitated Outcome</em>' reference list.
	 * @see QWiki.SPICE.SPICEPackage#getSpiceBasePractise_FacilitatedOutcome()
	 * @see QWiki.SPICE.Outcome#getFacilitatingBasePractise
	 * @model opposite="facilitatingBasePractise" required="true" transient="true" ordered="false"
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
	 * @see QWiki.SPICE.SPICEPackage#getSpiceBasePractise_FacilitatedWorkProduct()
	 * @model transient="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='facilitatingBacePractise'"
	 * @generated
	 */
	WorkProduct getFacilitatedWorkProduct();

	/**
	 * Sets the value of the '{@link QWiki.SPICE.SpiceBasePractise#getFacilitatedWorkProduct <em>Facilitated Work Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facilitated Work Product</em>' reference.
	 * @see #getFacilitatedWorkProduct()
	 * @generated
	 */
	void setFacilitatedWorkProduct(WorkProduct value);

} // SpiceBasePractise
