/**
 */
package QWiki;

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
 *   <li>{@link QWiki.WorkProduct#getOwningWorkProductGroup <em>Owning Work Product Group</em>}</li>
 *   <li>{@link QWiki.WorkProduct#getOwnedCharacteristic <em>Owned Characteristic</em>}</li>
 *   <li>{@link QWiki.WorkProduct#getOwnedContent <em>Owned Content</em>}</li>
 *   <li>{@link QWiki.WorkProduct#getFacilitatingOutcome <em>Facilitating Outcome</em>}</li>
 *   <li>{@link QWiki.WorkProduct#getFacilitatedProcess <em>Facilitated Process</em>}</li>
 *   <li>{@link QWiki.WorkProduct#getFacilitatingProcess <em>Facilitating Process</em>}</li>
 *   <li>{@link QWiki.WorkProduct#getWorkProductType <em>Work Product Type</em>}</li>
 *   <li>{@link QWiki.WorkProduct#getFacilitatedOutcome <em>Facilitated Outcome</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getWorkProduct()
 * @model annotation="duplicates"
 * @generated
 */
public interface WorkProduct extends SpiceElement {
	/**
	 * Returns the value of the '<em><b>Owning Work Product Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.GenericWorkProduct#getOwnedWorkProduct <em>Owned Work Product</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Work Product Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Work Product Group</em>' container reference.
	 * @see #setOwningWorkProductGroup(GenericWorkProduct)
	 * @see QWiki.QWikiPackage#getWorkProduct_OwningWorkProductGroup()
	 * @see QWiki.GenericWorkProduct#getOwnedWorkProduct
	 * @model opposite="ownedWorkProduct" ordered="false"
	 *        extendedMetaData="kind='attribute'"
	 *        annotation="subsets"
	 * @generated
	 */
	GenericWorkProduct getOwningWorkProductGroup();

	/**
	 * Sets the value of the '{@link QWiki.WorkProduct#getOwningWorkProductGroup <em>Owning Work Product Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Work Product Group</em>' container reference.
	 * @see #getOwningWorkProductGroup()
	 * @generated
	 */
	void setOwningWorkProductGroup(GenericWorkProduct value);

	/**
	 * Returns the value of the '<em><b>Owned Characteristic</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.I18nString}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Element#getOwnedElement() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Characteristic</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Characteristic</em>' containment reference list.
	 * @see QWiki.QWikiPackage#getWorkProduct_OwnedCharacteristic()
	 * @model containment="true" transient="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<I18nString> getOwnedCharacteristic();

	/**
	 * Returns the value of the '<em><b>Owned Content</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.I18nString}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Element#getOwnedElement() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Content</em>' containment reference list.
	 * @see QWiki.QWikiPackage#getWorkProduct_OwnedContent()
	 * @model containment="true" transient="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<I18nString> getOwnedContent();

	/**
	 * Returns the value of the '<em><b>Facilitating Outcome</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Outcome}.
	 * It is bidirectional and its opposite is '{@link QWiki.Outcome#getResultingWorkproduct <em>Resulting Workproduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitating Outcome</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitating Outcome</em>' reference list.
	 * @see QWiki.QWikiPackage#getWorkProduct_FacilitatingOutcome()
	 * @see QWiki.Outcome#getResultingWorkproduct
	 * @model opposite="resultingWorkproduct" transient="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<Outcome> getFacilitatingOutcome();

	/**
	 * Returns the value of the '<em><b>Facilitated Process</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Process}.
	 * It is bidirectional and its opposite is '{@link QWiki.Process#getFacilitatingWorkProduct <em>Facilitating Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitated Process</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitated Process</em>' reference list.
	 * @see QWiki.QWikiPackage#getWorkProduct_FacilitatedProcess()
	 * @see QWiki.Process#getFacilitatingWorkProduct
	 * @model opposite="facilitatingWorkProduct" transient="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<QWiki.Process> getFacilitatedProcess();

	/**
	 * Returns the value of the '<em><b>Facilitating Process</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Process#getFacilitatedWorkProduct <em>Facilitated Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitating Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitating Process</em>' reference.
	 * @see #setFacilitatingProcess(QWiki.Process)
	 * @see QWiki.QWikiPackage#getWorkProduct_FacilitatingProcess()
	 * @see QWiki.Process#getFacilitatedWorkProduct
	 * @model opposite="facilitatedWorkProduct" transient="true" ordered="false"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	QWiki.Process getFacilitatingProcess();

	/**
	 * Sets the value of the '{@link QWiki.WorkProduct#getFacilitatingProcess <em>Facilitating Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facilitating Process</em>' reference.
	 * @see #getFacilitatingProcess()
	 * @generated
	 */
	void setFacilitatingProcess(QWiki.Process value);

	/**
	 * Returns the value of the '<em><b>Work Product Type</b></em>' attribute.
	 * The literals are from the enumeration {@link QWiki.WorkProductType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Product Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Product Type</em>' attribute.
	 * @see QWiki.WorkProductType
	 * @see #setWorkProductType(WorkProductType)
	 * @see QWiki.QWikiPackage#getWorkProduct_WorkProductType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	WorkProductType getWorkProductType();

	/**
	 * Sets the value of the '{@link QWiki.WorkProduct#getWorkProductType <em>Work Product Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Product Type</em>' attribute.
	 * @see QWiki.WorkProductType
	 * @see #getWorkProductType()
	 * @generated
	 */
	void setWorkProductType(WorkProductType value);

	/**
	 * Returns the value of the '<em><b>Facilitated Outcome</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Outcome}.
	 * It is bidirectional and its opposite is '{@link QWiki.Outcome#getRequiredWorkproduct <em>Required Workproduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitated Outcome</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitated Outcome</em>' reference list.
	 * @see QWiki.QWikiPackage#getWorkProduct_FacilitatedOutcome()
	 * @see QWiki.Outcome#getRequiredWorkproduct
	 * @model opposite="requiredWorkproduct" transient="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<Outcome> getFacilitatedOutcome();

} // WorkProduct
