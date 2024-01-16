/**
 */
package engineering.schumann.uml.profile.csmn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Material Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.MaterialCharacteristic#getBase_Port <em>Base Port</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.MaterialCharacteristic#getMaterialType <em>Material Type</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.MaterialCharacteristic#getOtherMaterialType <em>Other Material Type</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.MaterialCharacteristic#getBase_Dependency <em>Base Dependency</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getMaterialCharacteristic()
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
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getMaterialCharacteristic_Base_Port()
	 * @model ordered="false"
	 * @generated
	 */
	Port getBase_Port();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.MaterialCharacteristic#getBase_Port <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Port</em>' reference.
	 * @see #getBase_Port()
	 * @generated
	 */
	void setBase_Port(Port value);

	/**
	 * Returns the value of the '<em><b>Material Type</b></em>' attribute list.
	 * The list contents are of type {@link engineering.schumann.uml.profile.csmn.MaterialType}.
	 * The literals are from the enumeration {@link engineering.schumann.uml.profile.csmn.MaterialType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Type</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Type</em>' attribute list.
	 * @see engineering.schumann.uml.profile.csmn.MaterialType
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getMaterialCharacteristic_MaterialType()
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
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getMaterialCharacteristic_OtherMaterialType()
	 * @model ordered="false"
	 * @generated
	 */
	String getOtherMaterialType();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.MaterialCharacteristic#getOtherMaterialType <em>Other Material Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Material Type</em>' attribute.
	 * @see #getOtherMaterialType()
	 * @generated
	 */
	void setOtherMaterialType(String value);

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
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getMaterialCharacteristic_Base_Dependency()
	 * @model ordered="false"
	 * @generated
	 */
	Dependency getBase_Dependency();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.MaterialCharacteristic#getBase_Dependency <em>Base Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Dependency</em>' reference.
	 * @see #getBase_Dependency()
	 * @generated
	 */
	void setBase_Dependency(Dependency value);

} // MaterialCharacteristic
