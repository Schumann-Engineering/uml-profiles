/**
 */
package CSMN.Characteristics.Security;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cpe Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CSMN.Characteristics.Security.CpeCharacteristic#getBase_NamedElement <em>Base Named Element</em>}</li>
 *   <li>{@link CSMN.Characteristics.Security.CpeCharacteristic#getCpe <em>Cpe</em>}</li>
 * </ul>
 *
 * @see CSMN.Characteristics.Security.SecurityPackage#getCpeCharacteristic()
 * @model
 * @generated
 */
public interface CpeCharacteristic extends EObject {
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
	 * @see CSMN.Characteristics.Security.SecurityPackage#getCpeCharacteristic_Base_NamedElement()
	 * @model ordered="false"
	 * @generated
	 */
	NamedElement getBase_NamedElement();

	/**
	 * Sets the value of the '{@link CSMN.Characteristics.Security.CpeCharacteristic#getBase_NamedElement <em>Base Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Named Element</em>' reference.
	 * @see #getBase_NamedElement()
	 * @generated
	 */
	void setBase_NamedElement(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Cpe</b></em>' containment reference list.
	 * The list contents are of type {@link CSMN.Characteristics.Security.CommonPlatformEnumeration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpe</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpe</em>' containment reference list.
	 * @see CSMN.Characteristics.Security.SecurityPackage#getCpeCharacteristic_Cpe()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<CommonPlatformEnumeration> getCpe();

} // CpeCharacteristic
