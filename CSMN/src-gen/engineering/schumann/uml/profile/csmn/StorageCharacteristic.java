/**
 */
package engineering.schumann.uml.profile.csmn;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.StorageCharacteristic#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.StorageCharacteristic#getBase_Port <em>Base Port</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.StorageCharacteristic#getEncryption <em>Encryption</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.StorageCharacteristic#getStorageFormat <em>Storage Format</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.StorageCharacteristic#getStorageType <em>Storage Type</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.StorageCharacteristic#getStorageName <em>Storage Name</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.StorageCharacteristic#getTotalSize <em>Total Size</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getStorageCharacteristic()
 * @model
 * @generated
 */
public interface StorageCharacteristic extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Component</em>' reference.
	 * @see #setBase_Component(Component)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getStorageCharacteristic_Base_Component()
	 * @model ordered="false"
	 * @generated
	 */
	Component getBase_Component();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.StorageCharacteristic#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(Component value);

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
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getStorageCharacteristic_Base_Port()
	 * @model ordered="false"
	 * @generated
	 */
	Port getBase_Port();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.StorageCharacteristic#getBase_Port <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Port</em>' reference.
	 * @see #getBase_Port()
	 * @generated
	 */
	void setBase_Port(Port value);

	/**
	 * Returns the value of the '<em><b>Encryption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encryption</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryption</em>' attribute.
	 * @see #setEncryption(String)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getStorageCharacteristic_Encryption()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getEncryption();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.StorageCharacteristic#getEncryption <em>Encryption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption</em>' attribute.
	 * @see #getEncryption()
	 * @generated
	 */
	void setEncryption(String value);

	/**
	 * Returns the value of the '<em><b>Storage Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Format</em>' attribute.
	 * @see #setStorageFormat(String)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getStorageCharacteristic_StorageFormat()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getStorageFormat();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.StorageCharacteristic#getStorageFormat <em>Storage Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Format</em>' attribute.
	 * @see #getStorageFormat()
	 * @generated
	 */
	void setStorageFormat(String value);

	/**
	 * Returns the value of the '<em><b>Storage Type</b></em>' attribute.
	 * The default value is <code>"Unknown"</code>.
	 * The literals are from the enumeration {@link engineering.schumann.uml.profile.csmn.StorageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Type</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.StorageType
	 * @see #setStorageType(StorageType)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getStorageCharacteristic_StorageType()
	 * @model default="Unknown" required="true" ordered="false"
	 * @generated
	 */
	StorageType getStorageType();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.StorageCharacteristic#getStorageType <em>Storage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Type</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.StorageType
	 * @see #getStorageType()
	 * @generated
	 */
	void setStorageType(StorageType value);

	/**
	 * Returns the value of the '<em><b>Storage Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Storage Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Name</em>' attribute.
	 * @see #setStorageName(String)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getStorageCharacteristic_StorageName()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getStorageName();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.StorageCharacteristic#getStorageName <em>Storage Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Name</em>' attribute.
	 * @see #getStorageName()
	 * @generated
	 */
	void setStorageName(String value);

	/**
	 * Returns the value of the '<em><b>Total Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Size</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Size</em>' containment reference.
	 * @see #setTotalSize(Size_T)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getStorageCharacteristic_TotalSize()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Size_T getTotalSize();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.StorageCharacteristic#getTotalSize <em>Total Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Size</em>' containment reference.
	 * @see #getTotalSize()
	 * @generated
	 */
	void setTotalSize(Size_T value);

} // StorageCharacteristic
