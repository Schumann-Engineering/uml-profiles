/**
 */
package QWiki.Spice;

import QWiki.L10nString;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

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
 *   <li>{@link QWiki.Spice.WorkProduct#getContainedWorkProduct <em>Contained Work Product</em>}</li>
 *   <li>{@link QWiki.Spice.WorkProduct#getContainingWorkProduct <em>Containing Work Product</em>}</li>
 *   <li>{@link QWiki.Spice.WorkProduct#getLinkedWorkProduct <em>Linked Work Product</em>}</li>
 *   <li>{@link QWiki.Spice.WorkProduct#getLink <em>Link</em>}</li>
 *   <li>{@link QWiki.Spice.WorkProduct#getFacilitatedOutcome <em>Facilitated Outcome</em>}</li>
 * </ul>
 *
 * @see QWiki.Spice.SpicePackage#getWorkProduct()
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
	 * @see QWiki.Spice.SpicePackage#getWorkProduct_OwningWorkProductGroup()
	 * @see QWiki.Spice.GenericWorkProduct#getOwnedWorkProduct
	 * @model opposite="ownedWorkProduct" resolveProxies="false" ordered="false"
	 *        extendedMetaData="kind='element'"
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
	 * Returns the value of the '<em><b>Characteristic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristic</em>' reference.
	 * @see #setCharacteristic(L10nString)
	 * @see QWiki.Spice.SpicePackage#getWorkProduct_Characteristic()
	 * @model ordered="false"
	 * @generated
	 */
	L10nString getCharacteristic();

	/**
	 * Sets the value of the '{@link QWiki.Spice.WorkProduct#getCharacteristic <em>Characteristic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Characteristic</em>' reference.
	 * @see #getCharacteristic()
	 * @generated
	 */
	void setCharacteristic(L10nString value);

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
	 * @see QWiki.Spice.SpicePackage#getWorkProduct_FacilitatingOutcome()
	 * @see QWiki.Spice.Outcome#getResultingWorkproduct
	 * @model opposite="resultingWorkproduct" resolveProxies="false" ordered="false"
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
	 * @see QWiki.Spice.SpicePackage#getWorkProduct_FacilitatedProcess()
	 * @see QWiki.Spice.Process#getFacilitatingWorkProduct
	 * @model opposite="facilitatingWorkProduct" resolveProxies="false" ordered="false"
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
	 * Returns the value of the '<em><b>Facilitating Process</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Spice.Process}.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.Process#getFacilitatedWorkProduct <em>Facilitated Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitating Process</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitating Process</em>' reference list.
	 * @see QWiki.Spice.SpicePackage#getWorkProduct_FacilitatingProcess()
	 * @see QWiki.Spice.Process#getFacilitatedWorkProduct
	 * @model opposite="facilitatedWorkProduct" resolveProxies="false" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<QWiki.Spice.Process> getFacilitatingProcess();

	/**
	 * Retrieves the first {@link QWiki.Spice.Process} with the specified '<em><b>Name</b></em>' from the '<em><b>Facilitating Process</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.Process} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Spice.Process} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFacilitatingProcess()
	 * @generated
	 */
	QWiki.Spice.Process getFacilitatingProcess(String name);

	/**
	 * Retrieves the first {@link QWiki.Spice.Process} with the specified '<em><b>Name</b></em>' from the '<em><b>Facilitating Process</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.Process} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link QWiki.Spice.Process} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFacilitatingProcess()
	 * @generated
	 */
	QWiki.Spice.Process getFacilitatingProcess(String name, boolean ignoreCase);

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
	 * @see QWiki.Spice.SpicePackage#getWorkProduct_WorkProductType()
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
	 * Returns the value of the '<em><b>Contained Work Product</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Spice.WorkProduct}.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.WorkProduct#getContainingWorkProduct <em>Containing Work Product</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Spice.WorkProduct#getLinkedWorkProduct() <em>Linked Work Product</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Work Product</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Work Product</em>' reference list.
	 * @see QWiki.Spice.SpicePackage#getWorkProduct_ContainedWorkProduct()
	 * @see QWiki.Spice.WorkProduct#getContainingWorkProduct
	 * @model opposite="containingWorkProduct" resolveProxies="false" ordered="false"
	 *        extendedMetaData="kind='element'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<WorkProduct> getContainedWorkProduct();

	/**
	 * Retrieves the first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>' from the '<em><b>Contained Work Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.WorkProduct} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getContainedWorkProduct()
	 * @generated
	 */
	WorkProduct getContainedWorkProduct(String name);

	/**
	 * Retrieves the first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>' from the '<em><b>Contained Work Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.WorkProduct} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link QWiki.Spice.WorkProduct} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getContainedWorkProduct()
	 * @generated
	 */
	WorkProduct getContainedWorkProduct(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Containing Work Product</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.WorkProduct#getContainedWorkProduct <em>Contained Work Product</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Spice.WorkProduct#getLinkedWorkProduct() <em>Linked Work Product</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containing Work Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Work Product</em>' reference.
	 * @see #setContainingWorkProduct(WorkProduct)
	 * @see QWiki.Spice.SpicePackage#getWorkProduct_ContainingWorkProduct()
	 * @see QWiki.Spice.WorkProduct#getContainedWorkProduct
	 * @model opposite="containedWorkProduct" resolveProxies="false" transient="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 *        annotation="subsets"
	 * @generated
	 */
	WorkProduct getContainingWorkProduct();

	/**
	 * Sets the value of the '{@link QWiki.Spice.WorkProduct#getContainingWorkProduct <em>Containing Work Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containing Work Product</em>' reference.
	 * @see #getContainingWorkProduct()
	 * @generated
	 */
	void setContainingWorkProduct(WorkProduct value);

	/**
	 * Returns the value of the '<em><b>Linked Work Product</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Spice.WorkProduct}.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Work Product</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Work Product</em>' reference list.
	 * @see QWiki.Spice.SpicePackage#getWorkProduct_LinkedWorkProduct()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='workproduct'"
	 *        annotation="union"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<WorkProduct> getLinkedWorkProduct();

	/**
	 * Retrieves the first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>' from the '<em><b>Linked Work Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.WorkProduct} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getLinkedWorkProduct()
	 * @generated
	 */
	WorkProduct getLinkedWorkProduct(String name);

	/**
	 * Retrieves the first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>' from the '<em><b>Linked Work Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.WorkProduct} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link QWiki.Spice.WorkProduct} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getLinkedWorkProduct()
	 * @generated
	 */
	WorkProduct getLinkedWorkProduct(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Spice.WorkProductRelationship}.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.WorkProductRelationship#getLinkedWorkProduct <em>Linked Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference list.
	 * @see QWiki.Spice.SpicePackage#getWorkProduct_Link()
	 * @see QWiki.Spice.WorkProductRelationship#getLinkedWorkProduct
	 * @model opposite="linkedWorkProduct" resolveProxies="false" transient="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<WorkProductRelationship> getLink();

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
	 * @see QWiki.Spice.SpicePackage#getWorkProduct_FacilitatedOutcome()
	 * @see QWiki.Spice.Outcome#getRequiredWorkproduct
	 * @model opposite="requiredWorkproduct" resolveProxies="false" ordered="false"
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
	 *   <li>'{@link QWiki.QWikiElement#objectId() <em>Object Id</em>}' </li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='\'wp/\'\r\n+\r\nif (owningWorkProductGroup-&gt;notEmpty()) then\r\n  owningWorkProductGroup.number + \'-\'\r\nelse\r\n  \'\'\r\nendif\r\n+\r\nnumber + \'/\' + owningProcessReferenceModel.objectId()'"
	 * @generated
	 */
	String objectId();

} // WorkProduct
