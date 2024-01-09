/**
 */
package CSMN.Characteristics.Interface;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CSMN.Characteristics.Interface.InterfaceCharacteristic#getBase_Port <em>Base Port</em>}</li>
 *   <li>{@link CSMN.Characteristics.Interface.InterfaceCharacteristic#getInterfaceType <em>Interface Type</em>}</li>
 *   <li>{@link CSMN.Characteristics.Interface.InterfaceCharacteristic#getPurpose <em>Purpose</em>}</li>
 * </ul>
 *
 * @see CSMN.Characteristics.Interface.InterfacePackage#getInterfaceCharacteristic()
 * @model
 * @generated
 */
public interface InterfaceCharacteristic extends EObject {
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
	 * @see CSMN.Characteristics.Interface.InterfacePackage#getInterfaceCharacteristic_Base_Port()
	 * @model ordered="false"
	 * @generated
	 */
	Port getBase_Port();

	/**
	 * Sets the value of the '{@link CSMN.Characteristics.Interface.InterfaceCharacteristic#getBase_Port <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Port</em>' reference.
	 * @see #getBase_Port()
	 * @generated
	 */
	void setBase_Port(Port value);

	/**
	 * Returns the value of the '<em><b>Interface Type</b></em>' attribute.
	 * The default value is <code>"Unspecified"</code>.
	 * The literals are from the enumeration {@link CSMN.Characteristics.Interface.InterfaceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Type</em>' attribute.
	 * @see CSMN.Characteristics.Interface.InterfaceType
	 * @see #setInterfaceType(InterfaceType)
	 * @see CSMN.Characteristics.Interface.InterfacePackage#getInterfaceCharacteristic_InterfaceType()
	 * @model default="Unspecified" required="true" ordered="false"
	 * @generated
	 */
	InterfaceType getInterfaceType();

	/**
	 * Sets the value of the '{@link CSMN.Characteristics.Interface.InterfaceCharacteristic#getInterfaceType <em>Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Type</em>' attribute.
	 * @see CSMN.Characteristics.Interface.InterfaceType
	 * @see #getInterfaceType()
	 * @generated
	 */
	void setInterfaceType(InterfaceType value);

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see CSMN.Characteristics.Interface.InterfacePackage#getInterfaceCharacteristic_Purpose()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link CSMN.Characteristics.Interface.InterfaceCharacteristic#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

} // InterfaceCharacteristic
