/**
 */
package CSMN.Characteristics.Flow;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Relationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CSMN.Characteristics.Flow.FlowCharacteristic#getBase_Relationship <em>Base Relationship</em>}</li>
 * </ul>
 *
 * @see CSMN.Characteristics.Flow.FlowPackage#getFlowCharacteristic()
 * @model abstract="true"
 * @generated
 */
public interface FlowCharacteristic extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Relationship</em>' reference.
	 * @see #setBase_Relationship(Relationship)
	 * @see CSMN.Characteristics.Flow.FlowPackage#getFlowCharacteristic_Base_Relationship()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Relationship getBase_Relationship();

	/**
	 * Sets the value of the '{@link CSMN.Characteristics.Flow.FlowCharacteristic#getBase_Relationship <em>Base Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Relationship</em>' reference.
	 * @see #getBase_Relationship()
	 * @generated
	 */
	void setBase_Relationship(Relationship value);

} // FlowCharacteristic
