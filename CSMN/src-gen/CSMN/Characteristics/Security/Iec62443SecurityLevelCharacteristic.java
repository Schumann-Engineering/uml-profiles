/**
 */
package CSMN.Characteristics.Security;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iec62443 Security Level Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CSMN.Characteristics.Security.Iec62443SecurityLevelCharacteristic#getBase_NamedElement <em>Base Named Element</em>}</li>
 *   <li>{@link CSMN.Characteristics.Security.Iec62443SecurityLevelCharacteristic#getSecuritylevel <em>Securitylevel</em>}</li>
 * </ul>
 *
 * @see CSMN.Characteristics.Security.SecurityPackage#getIec62443SecurityLevelCharacteristic()
 * @model
 * @generated
 */
public interface Iec62443SecurityLevelCharacteristic extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Named Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Named Element</em>' reference.
	 * @see #setBase_NamedElement(NamedElement)
	 * @see CSMN.Characteristics.Security.SecurityPackage#getIec62443SecurityLevelCharacteristic_Base_NamedElement()
	 * @model ordered="false"
	 * @generated
	 */
	NamedElement getBase_NamedElement();

	/**
	 * Sets the value of the '{@link CSMN.Characteristics.Security.Iec62443SecurityLevelCharacteristic#getBase_NamedElement <em>Base Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Named Element</em>' reference.
	 * @see #getBase_NamedElement()
	 * @generated
	 */
	void setBase_NamedElement(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Securitylevel</b></em>' containment reference list.
	 * The list contents are of type {@link CSMN.Characteristics.Security.SecurityLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Securitylevel</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Securitylevel</em>' containment reference list.
	 * @see CSMN.Characteristics.Security.SecurityPackage#getIec62443SecurityLevelCharacteristic_Securitylevel()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SecurityLevel> getSecuritylevel();

} // Iec62443SecurityLevelCharacteristic
