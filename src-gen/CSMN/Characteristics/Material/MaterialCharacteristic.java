/**
 */
package CSMN.Characteristics.Material;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link CSMN.Characteristics.Material.MaterialCharacteristic#getBase_Port <em>Base Port</em>}</li>
 *   <li>{@link CSMN.Characteristics.Material.MaterialCharacteristic#getBase_Relationship <em>Base Relationship</em>}</li>
 *   <li>{@link CSMN.Characteristics.Material.MaterialCharacteristic#getMaterialType <em>Material Type</em>}</li>
 *   <li>{@link CSMN.Characteristics.Material.MaterialCharacteristic#getOtherMaterialType <em>Other Material Type</em>}</li>
 * </ul>
 *
 * @see CSMN.Characteristics.Material.MaterialPackage#getMaterialCharacteristic()
 * @model
 * @generated
 */
public interface MaterialCharacteristic extends EObject {
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
	 * @see CSMN.Characteristics.Material.MaterialPackage#getMaterialCharacteristic_Base_Port()
	 * @model ordered="false"
	 * @generated
	 */
	Port getBase_Port();

	/**
	 * Sets the value of the '{@link CSMN.Characteristics.Material.MaterialCharacteristic#getBase_Port <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Port</em>' reference.
	 * @see #getBase_Port()
	 * @generated
	 */
	void setBase_Port(Port value);

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
	 * @see CSMN.Characteristics.Material.MaterialPackage#getMaterialCharacteristic_Base_Relationship()
	 * @model ordered="false"
	 * @generated
	 */
	Relationship getBase_Relationship();

	/**
	 * Sets the value of the '{@link CSMN.Characteristics.Material.MaterialCharacteristic#getBase_Relationship <em>Base Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Relationship</em>' reference.
	 * @see #getBase_Relationship()
	 * @generated
	 */
	void setBase_Relationship(Relationship value);

	/**
	 * Returns the value of the '<em><b>Material Type</b></em>' attribute list.
	 * The list contents are of type {@link CSMN.Characteristics.Material.MaterialType}.
	 * The literals are from the enumeration {@link CSMN.Characteristics.Material.MaterialType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Type</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Type</em>' attribute list.
	 * @see CSMN.Characteristics.Material.MaterialType
	 * @see CSMN.Characteristics.Material.MaterialPackage#getMaterialCharacteristic_MaterialType()
	 * @model default="Unspecified" required="true" ordered="false"
	 * @generated
	 */
	EList<MaterialType> getMaterialType();

	/**
	 * Returns the value of the '<em><b>Other Material Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Material Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Material Type</em>' attribute.
	 * @see #setOtherMaterialType(String)
	 * @see CSMN.Characteristics.Material.MaterialPackage#getMaterialCharacteristic_OtherMaterialType()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getOtherMaterialType();

	/**
	 * Sets the value of the '{@link CSMN.Characteristics.Material.MaterialCharacteristic#getOtherMaterialType <em>Other Material Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Material Type</em>' attribute.
	 * @see #getOtherMaterialType()
	 * @generated
	 */
	void setOtherMaterialType(String value);

} // MaterialCharacteristic
