/**
 */
package QWiki.SPICE;

import QWiki.I18N.I18nString;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.SPICE.WorkProduct#getOwningWorkProductGroup <em>Owning Work Product Group</em>}</li>
 *   <li>{@link QWiki.SPICE.WorkProduct#getCharacteristic <em>Characteristic</em>}</li>
 *   <li>{@link QWiki.SPICE.WorkProduct#getContent <em>Content</em>}</li>
 *   <li>{@link QWiki.SPICE.WorkProduct#getFacilitatingOutcome <em>Facilitating Outcome</em>}</li>
 *   <li>{@link QWiki.SPICE.WorkProduct#getFacilitatedProcess <em>Facilitated Process</em>}</li>
 *   <li>{@link QWiki.SPICE.WorkProduct#getFacilitatingProcess <em>Facilitating Process</em>}</li>
 *   <li>{@link QWiki.SPICE.WorkProduct#getWorkProductType <em>Work Product Type</em>}</li>
 *   <li>{@link QWiki.SPICE.WorkProduct#getFacilitatedOutcome <em>Facilitated Outcome</em>}</li>
 * </ul>
 *
 * @see QWiki.SPICE.SPICEPackage#getWorkProduct()
 * @model annotation="duplicates"
 * @generated
 */
public interface WorkProduct extends SpiceElement {
	/**
	 * Returns the value of the '<em><b>Owning Work Product Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.SPICE.GenericWorkProduct#getOwnedWorkProduct <em>Owned Work Product</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Infrastructure.UmlElement#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Work Product Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Work Product Group</em>' container reference.
	 * @see #setOwningWorkProductGroup(GenericWorkProduct)
	 * @see QWiki.SPICE.SPICEPackage#getWorkProduct_OwningWorkProductGroup()
	 * @see QWiki.SPICE.GenericWorkProduct#getOwnedWorkProduct
	 * @model opposite="ownedWorkProduct" ordered="false"
	 *        extendedMetaData="kind='attribute'"
	 *        annotation="subsets"
	 * @generated
	 */
	GenericWorkProduct getOwningWorkProductGroup();

	/**
	 * Sets the value of the '{@link QWiki.SPICE.WorkProduct#getOwningWorkProductGroup <em>Owning Work Product Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Work Product Group</em>' container reference.
	 * @see #getOwningWorkProductGroup()
	 * @generated
	 */
	void setOwningWorkProductGroup(GenericWorkProduct value);

	/**
	 * Returns the value of the '<em><b>Characteristic</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.I18N.I18nString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristic</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristic</em>' containment reference list.
	 * @see QWiki.SPICE.SPICEPackage#getWorkProduct_Characteristic()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<I18nString> getCharacteristic();

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.I18N.I18nString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see QWiki.SPICE.SPICEPackage#getWorkProduct_Content()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<I18nString> getContent();

	/**
	 * Returns the value of the '<em><b>Facilitating Outcome</b></em>' reference list.
	 * The list contents are of type {@link QWiki.SPICE.Outcome}.
	 * It is bidirectional and its opposite is '{@link QWiki.SPICE.Outcome#getResultingWorkproduct <em>Resulting Workproduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitating Outcome</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitating Outcome</em>' reference list.
	 * @see QWiki.SPICE.SPICEPackage#getWorkProduct_FacilitatingOutcome()
	 * @see QWiki.SPICE.Outcome#getResultingWorkproduct
	 * @model opposite="resultingWorkproduct" transient="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<Outcome> getFacilitatingOutcome();

	/**
	 * Returns the value of the '<em><b>Facilitated Process</b></em>' reference list.
	 * The list contents are of type {@link QWiki.SPICE.Process}.
	 * It is bidirectional and its opposite is '{@link QWiki.SPICE.Process#getFacilitatingWorkProduct <em>Facilitating Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitated Process</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitated Process</em>' reference list.
	 * @see QWiki.SPICE.SPICEPackage#getWorkProduct_FacilitatedProcess()
	 * @see QWiki.SPICE.Process#getFacilitatingWorkProduct
	 * @model opposite="facilitatingWorkProduct" transient="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<QWiki.SPICE.Process> getFacilitatedProcess();

	/**
	 * Returns the value of the '<em><b>Facilitating Process</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QWiki.SPICE.Process#getFacilitatedWorkProduct <em>Facilitated Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitating Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitating Process</em>' reference.
	 * @see #setFacilitatingProcess(QWiki.SPICE.Process)
	 * @see QWiki.SPICE.SPICEPackage#getWorkProduct_FacilitatingProcess()
	 * @see QWiki.SPICE.Process#getFacilitatedWorkProduct
	 * @model opposite="facilitatedWorkProduct" transient="true" ordered="false"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	QWiki.SPICE.Process getFacilitatingProcess();

	/**
	 * Sets the value of the '{@link QWiki.SPICE.WorkProduct#getFacilitatingProcess <em>Facilitating Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facilitating Process</em>' reference.
	 * @see #getFacilitatingProcess()
	 * @generated
	 */
	void setFacilitatingProcess(QWiki.SPICE.Process value);

	/**
	 * Returns the value of the '<em><b>Work Product Type</b></em>' attribute.
	 * The literals are from the enumeration {@link QWiki.SPICE.WorkProductType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Product Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Product Type</em>' attribute.
	 * @see QWiki.SPICE.WorkProductType
	 * @see #setWorkProductType(WorkProductType)
	 * @see QWiki.SPICE.SPICEPackage#getWorkProduct_WorkProductType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	WorkProductType getWorkProductType();

	/**
	 * Sets the value of the '{@link QWiki.SPICE.WorkProduct#getWorkProductType <em>Work Product Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Product Type</em>' attribute.
	 * @see QWiki.SPICE.WorkProductType
	 * @see #getWorkProductType()
	 * @generated
	 */
	void setWorkProductType(WorkProductType value);

	/**
	 * Returns the value of the '<em><b>Facilitated Outcome</b></em>' reference list.
	 * The list contents are of type {@link QWiki.SPICE.Outcome}.
	 * It is bidirectional and its opposite is '{@link QWiki.SPICE.Outcome#getRequiredWorkproduct <em>Required Workproduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitated Outcome</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitated Outcome</em>' reference list.
	 * @see QWiki.SPICE.SPICEPackage#getWorkProduct_FacilitatedOutcome()
	 * @see QWiki.SPICE.Outcome#getRequiredWorkproduct
	 * @model opposite="requiredWorkproduct" transient="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<Outcome> getFacilitatedOutcome();

} // WorkProduct
