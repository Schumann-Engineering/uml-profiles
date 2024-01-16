/**
 */
package engineering.schumann.uml.profile.csmn;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Energy Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.EnergyCharacteristic#getBase_Port <em>Base Port</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.EnergyCharacteristic#getEnergyType <em>Energy Type</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.EnergyCharacteristic#getBase_Dependency <em>Base Dependency</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getEnergyCharacteristic()
 * @model
 * @generated
 */
public interface EnergyCharacteristic extends EObject {
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
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getEnergyCharacteristic_Base_Port()
	 * @model ordered="false"
	 * @generated
	 */
	Port getBase_Port();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.EnergyCharacteristic#getBase_Port <em>Base Port</em>}' reference.
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
	 * The literals are from the enumeration {@link engineering.schumann.uml.profile.csmn.EnergyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Energy Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Energy Type</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.EnergyType
	 * @see #setEnergyType(EnergyType)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getEnergyCharacteristic_EnergyType()
	 * @model default="Unspecified" required="true" ordered="false"
	 * @generated
	 */
	EnergyType getEnergyType();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.EnergyCharacteristic#getEnergyType <em>Energy Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energy Type</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.EnergyType
	 * @see #getEnergyType()
	 * @generated
	 */
	void setEnergyType(EnergyType value);

	/**
	 * Returns the value of the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Dependency</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Dependency</em>' reference.
	 * @see #setBase_Dependency(Dependency)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getEnergyCharacteristic_Base_Dependency()
	 * @model ordered="false"
	 * @generated
	 */
	Dependency getBase_Dependency();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.EnergyCharacteristic#getBase_Dependency <em>Base Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Dependency</em>' reference.
	 * @see #getBase_Dependency()
	 * @generated
	 */
	void setBase_Dependency(Dependency value);

} // EnergyCharacteristic
