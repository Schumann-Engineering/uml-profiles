/**
 */
package CSMN.Characteristics.Energy;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Port;
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
 *   <li>{@link CSMN.Characteristics.Energy.EnergyCharacteristic#getBase_Relationship <em>Base Relationship</em>}</li>
 *   <li>{@link CSMN.Characteristics.Energy.EnergyCharacteristic#getBase_Port <em>Base Port</em>}</li>
 *   <li>{@link CSMN.Characteristics.Energy.EnergyCharacteristic#getEnergyType <em>Energy Type</em>}</li>
 * </ul>
 *
 * @see CSMN.Characteristics.Energy.EnergyPackage#getEnergyCharacteristic()
 * @model
 * @generated
 */
public interface EnergyCharacteristic extends EObject {
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
	 * @see CSMN.Characteristics.Energy.EnergyPackage#getEnergyCharacteristic_Base_Relationship()
	 * @model ordered="false"
	 * @generated
	 */
	Relationship getBase_Relationship();

	/**
	 * Sets the value of the '{@link CSMN.Characteristics.Energy.EnergyCharacteristic#getBase_Relationship <em>Base Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Relationship</em>' reference.
	 * @see #getBase_Relationship()
	 * @generated
	 */
	void setBase_Relationship(Relationship value);

	/**
	 * Returns the value of the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Port</em>' reference.
	 * @see #setBase_Port(Port)
	 * @see CSMN.Characteristics.Energy.EnergyPackage#getEnergyCharacteristic_Base_Port()
	 * @model ordered="false"
	 * @generated
	 */
	Port getBase_Port();

	/**
	 * Sets the value of the '{@link CSMN.Characteristics.Energy.EnergyCharacteristic#getBase_Port <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Port</em>' reference.
	 * @see #getBase_Port()
	 * @generated
	 */
	void setBase_Port(Port value);

	/**
	 * Returns the value of the '<em><b>Energy Type</b></em>' attribute.
	 * The default value is <code>"Unspecified"</code>.
	 * The literals are from the enumeration {@link CSMN.Characteristics.Energy.EnergyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Type</em>' attribute.
	 * @see CSMN.Characteristics.Energy.EnergyType
	 * @see #setEnergyType(EnergyType)
	 * @see CSMN.Characteristics.Energy.EnergyPackage#getEnergyCharacteristic_EnergyType()
	 * @model default="Unspecified" required="true" ordered="false"
	 * @generated
	 */
	EnergyType getEnergyType();

	/**
	 * Sets the value of the '{@link CSMN.Characteristics.Energy.EnergyCharacteristic#getEnergyType <em>Energy Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Type</em>' attribute.
	 * @see CSMN.Characteristics.Energy.EnergyType
	 * @see #getEnergyType()
	 * @generated
	 */
	void setEnergyType(EnergyType value);

} // EnergyCharacteristic
