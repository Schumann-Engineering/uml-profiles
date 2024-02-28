/**
 */
package engineering.schumann.uml.profile.csmn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.DataType;
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
 *   <li>{@link engineering.schumann.uml.profile.csmn.MaterialCharacteristic#getBase_Dependency <em>Base Dependency</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.MaterialCharacteristic#getMaterialType <em>Material Type</em>}</li>
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
	 * Returns the value of the '<em><b>Material Type</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Type</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Type</em>' reference list.
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getMaterialCharacteristic_MaterialType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<DataType> getMaterialType();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.DataType} with the specified '<em><b>Name</b></em>' from the '<em><b>Material Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.DataType} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.DataType} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getMaterialType()
	 * @generated
	 */
	DataType getMaterialType(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.DataType} with the specified '<em><b>Name</b></em>' from the '<em><b>Material Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.DataType} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.DataType} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.DataType} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getMaterialType()
	 * @generated
	 */
	DataType getMaterialType(String name, boolean ignoreCase, EClass eClass);

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
