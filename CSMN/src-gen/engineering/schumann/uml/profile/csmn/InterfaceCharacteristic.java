/**
 */
package engineering.schumann.uml.profile.csmn;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.InterfaceCharacteristic#getBase_Port <em>Base Port</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.InterfaceCharacteristic#getInterfaceType <em>Interface Type</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.InterfaceCharacteristic#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.InterfaceCharacteristic#getInterfaceConnector <em>Interface Connector</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getInterfaceCharacteristic()
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
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getInterfaceCharacteristic_Base_Port()
	 * @model ordered="false"
	 * @generated
	 */
	Port getBase_Port();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.InterfaceCharacteristic#getBase_Port <em>Base Port</em>}' reference.
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
	 * The literals are from the enumeration {@link engineering.schumann.uml.profile.csmn.InterfaceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Type</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.InterfaceType
	 * @see #setInterfaceType(InterfaceType)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getInterfaceCharacteristic_InterfaceType()
	 * @model default="Unspecified" required="true" ordered="false"
	 * @generated
	 */
	InterfaceType getInterfaceType();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.InterfaceCharacteristic#getInterfaceType <em>Interface Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Type</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.InterfaceType
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
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getInterfaceCharacteristic_Purpose()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.InterfaceCharacteristic#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Interface Connector</b></em>' attribute.
	 * The literals are from the enumeration {@link engineering.schumann.uml.profile.csmn.InterfaceConnector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Connector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Connector</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.InterfaceConnector
	 * @see #setInterfaceConnector(InterfaceConnector)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getInterfaceCharacteristic_InterfaceConnector()
	 * @model ordered="false"
	 * @generated
	 */
	InterfaceConnector getInterfaceConnector();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.InterfaceCharacteristic#getInterfaceConnector <em>Interface Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Connector</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.InterfaceConnector
	 * @see #getInterfaceConnector()
	 * @generated
	 */
	void setInterfaceConnector(InterfaceConnector value);

} // InterfaceCharacteristic
