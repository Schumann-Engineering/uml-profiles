/**
 */
package QWiki.Spice;

import QWiki.Kernel.I18nString;

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
 *   <li>{@link QWiki.Spice.WorkProduct#getOwningWorkProductGroup <em>Owning Work Product Group</em>}</li>
 *   <li>{@link QWiki.Spice.WorkProduct#getCharacteristic <em>Characteristic</em>}</li>
 *   <li>{@link QWiki.Spice.WorkProduct#getFacilitatingOutcome <em>Facilitating Outcome</em>}</li>
 *   <li>{@link QWiki.Spice.WorkProduct#getFacilitatedProcess <em>Facilitated Process</em>}</li>
 *   <li>{@link QWiki.Spice.WorkProduct#getFacilitatingProcess <em>Facilitating Process</em>}</li>
 *   <li>{@link QWiki.Spice.WorkProduct#getWorkProductType <em>Work Product Type</em>}</li>
 *   <li>{@link QWiki.Spice.WorkProduct#getFacilitatedOutcome <em>Facilitated Outcome</em>}</li>
 * </ul>
 *
 * @see QWiki.Spice.SPICEPackage#getWorkProduct()
 * @model
 * @generated
 */
public interface WorkProduct extends SpiceElement {
	/**
	 * Returns the value of the '<em><b>Owning Work Product Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.GenericWorkProduct#getOwnedWorkProduct <em>Owned Work Product</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Work Product Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Work Product Group</em>' container reference.
	 * @see #setOwningWorkProductGroup(GenericWorkProduct)
	 * @see QWiki.Spice.SPICEPackage#getWorkProduct_OwningWorkProductGroup()
	 * @see QWiki.Spice.GenericWorkProduct#getOwnedWorkProduct
	 * @model opposite="ownedWorkProduct" ordered="false"
	 *        extendedMetaData="kind='attribute'"
	 *        annotation="subsets"
	 * @generated
	 */
	GenericWorkProduct getOwningWorkProductGroup();

	/**
	 * Sets the value of the '{@link QWiki.Spice.WorkProduct#getOwningWorkProductGroup <em>Owning Work Product Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Work Product Group</em>' container reference.
	 * @see #getOwningWorkProductGroup()
	 * @generated
	 */
	void setOwningWorkProductGroup(GenericWorkProduct value);

	/**
	 * Returns the value of the '<em><b>Characteristic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristic</em>' containment reference.
	 * @see #setCharacteristic(I18nString)
	 * @see QWiki.Spice.SPICEPackage#getWorkProduct_Characteristic()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	I18nString getCharacteristic();

	/**
	 * Sets the value of the '{@link QWiki.Spice.WorkProduct#getCharacteristic <em>Characteristic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Characteristic</em>' containment reference.
	 * @see #getCharacteristic()
	 * @generated
	 */
	void setCharacteristic(I18nString value);

	/**
	 * Returns the value of the '<em><b>Facilitating Outcome</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Spice.Outcome}.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.Outcome#getResultingWorkproduct <em>Resulting Workproduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitating Outcome</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitating Outcome</em>' reference list.
	 * @see QWiki.Spice.SPICEPackage#getWorkProduct_FacilitatingOutcome()
	 * @see QWiki.Spice.Outcome#getResultingWorkproduct
	 * @model opposite="resultingWorkproduct" transient="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<Outcome> getFacilitatingOutcome();

	/**
	 * Retrieves the first {@link QWiki.Spice.Outcome} with the specified '<em><b>Name</b></em>' from the '<em><b>Facilitating Outcome</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.Outcome} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Spice.Outcome} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFacilitatingOutcome()
	 * @generated
	 */
	Outcome getFacilitatingOutcome(String name);

	/**
	 * Retrieves the first {@link QWiki.Spice.Outcome} with the specified '<em><b>Name</b></em>' from the '<em><b>Facilitating Outcome</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.Outcome} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link QWiki.Spice.Outcome} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFacilitatingOutcome()
	 * @generated
	 */
	Outcome getFacilitatingOutcome(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Facilitated Process</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Spice.Process}.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.Process#getFacilitatingWorkProduct <em>Facilitating Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitated Process</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitated Process</em>' reference list.
	 * @see QWiki.Spice.SPICEPackage#getWorkProduct_FacilitatedProcess()
	 * @see QWiki.Spice.Process#getFacilitatingWorkProduct
	 * @model opposite="facilitatingWorkProduct" transient="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<QWiki.Spice.Process> getFacilitatedProcess();

	/**
	 * Retrieves the first {@link QWiki.Spice.Process} with the specified '<em><b>Name</b></em>' from the '<em><b>Facilitated Process</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.Process} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Spice.Process} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFacilitatedProcess()
	 * @generated
	 */
	QWiki.Spice.Process getFacilitatedProcess(String name);

	/**
	 * Retrieves the first {@link QWiki.Spice.Process} with the specified '<em><b>Name</b></em>' from the '<em><b>Facilitated Process</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.Process} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link QWiki.Spice.Process} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFacilitatedProcess()
	 * @generated
	 */
	QWiki.Spice.Process getFacilitatedProcess(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Facilitating Process</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.Process#getFacilitatedWorkProduct <em>Facilitated Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitating Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitating Process</em>' reference.
	 * @see #setFacilitatingProcess(QWiki.Spice.Process)
	 * @see QWiki.Spice.SPICEPackage#getWorkProduct_FacilitatingProcess()
	 * @see QWiki.Spice.Process#getFacilitatedWorkProduct
	 * @model opposite="facilitatedWorkProduct" transient="true" ordered="false"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	QWiki.Spice.Process getFacilitatingProcess();

	/**
	 * Sets the value of the '{@link QWiki.Spice.WorkProduct#getFacilitatingProcess <em>Facilitating Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facilitating Process</em>' reference.
	 * @see #getFacilitatingProcess()
	 * @generated
	 */
	void setFacilitatingProcess(QWiki.Spice.Process value);

	/**
	 * Returns the value of the '<em><b>Work Product Type</b></em>' attribute.
	 * The literals are from the enumeration {@link QWiki.Spice.WorkProductType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Product Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Product Type</em>' attribute.
	 * @see QWiki.Spice.WorkProductType
	 * @see #setWorkProductType(WorkProductType)
	 * @see QWiki.Spice.SPICEPackage#getWorkProduct_WorkProductType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	WorkProductType getWorkProductType();

	/**
	 * Sets the value of the '{@link QWiki.Spice.WorkProduct#getWorkProductType <em>Work Product Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Product Type</em>' attribute.
	 * @see QWiki.Spice.WorkProductType
	 * @see #getWorkProductType()
	 * @generated
	 */
	void setWorkProductType(WorkProductType value);

	/**
	 * Returns the value of the '<em><b>Facilitated Outcome</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Spice.Outcome}.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.Outcome#getRequiredWorkproduct <em>Required Workproduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitated Outcome</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitated Outcome</em>' reference list.
	 * @see QWiki.Spice.SPICEPackage#getWorkProduct_FacilitatedOutcome()
	 * @see QWiki.Spice.Outcome#getRequiredWorkproduct
	 * @model opposite="requiredWorkproduct" transient="true" ordered="false"
	 *        extendedMetaData="kind='element'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='\'wp/\' + if (owningWorkProductGroup-&gt;notEmpty()) then owningWorkProductGroup.number + \'-\' else \'\' endif + number + \'/\' + owningProcessReferenceModel.oid()'"
	 * @generated
	 */
	String oid();

} // WorkProduct
