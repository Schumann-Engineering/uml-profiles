/**
 */
package QWiki.Kernel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Kernel.ModelElement#getModel <em>Model</em>}</li>
 *   <li>{@link QWiki.Kernel.ModelElement#getUuid <em>Uuid</em>}</li>
 *   <li>{@link QWiki.Kernel.ModelElement#getSuperseedingRelationship <em>Superseeding Relationship</em>}</li>
 * </ul>
 *
 * @see QWiki.Kernel.KernelPackage#getModelElement()
 * @model abstract="true"
 * @generated
 */
public interface ModelElement extends ModelTaggedElement {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Kernel.ModelRoot#getOwnedModelElement <em>Owned Model Element</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Infrastructure.UmlElement#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' container reference.
	 * @see #setModel(ModelRoot)
	 * @see QWiki.Kernel.KernelPackage#getModelElement_Model()
	 * @see QWiki.Kernel.ModelRoot#getOwnedModelElement
	 * @model opposite="ownedModelElement" transient="false" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	ModelRoot getModel();

	/**
	 * Sets the value of the '{@link QWiki.Kernel.ModelElement#getModel <em>Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' container reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(ModelRoot value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uuid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #isSetUuid()
	 * @see #unsetUuid()
	 * @see #setUuid(String)
	 * @see QWiki.Kernel.KernelPackage#getModelElement_Uuid()
	 * @model unsettable="true" id="true" required="true" ordered="false"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link QWiki.Kernel.ModelElement#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #isSetUuid()
	 * @see #unsetUuid()
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

	/**
	 * Unsets the value of the '{@link QWiki.Kernel.ModelElement#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUuid()
	 * @see #getUuid()
	 * @see #setUuid(String)
	 * @generated
	 */
	void unsetUuid();

	/**
	 * Returns whether the value of the '{@link QWiki.Kernel.ModelElement#getUuid <em>Uuid</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Uuid</em>' attribute is set.
	 * @see #unsetUuid()
	 * @see #getUuid()
	 * @see #setUuid(String)
	 * @generated
	 */
	boolean isSetUuid();

	/**
	 * Returns the value of the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Kernel.SuperseedingRelationship}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Infrastructure.UmlElement#getRelationship() <em>Relationship</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superseeding Relationship</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superseeding Relationship</em>' reference list.
	 * @see QWiki.Kernel.KernelPackage#getModelElement_SuperseedingRelationship()
	 * @model transient="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='document'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<SuperseedingRelationship> getSuperseedingRelationship();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if (model-&gt;notEmpty()) then\r\n  model\r\nelse if (owner-&gt;notEmpty() and owner-&gt;oclIsKindOf(ModelElement)) then\r\n  owner.oclAsType(ModelElement).model()\r\nelse\r\n  null\r\nendif\r\nendif'"
	 * @generated
	 */
	ModelRoot model();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='uuid'"
	 * @generated
	 */
	String oid();

} // ModelElement
