/**
 */
package CSMN.Characteristics.Storage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CSMN.Characteristics.Storage.StorageFactory
 * @model kind="package"
 * @generated
 */
public interface StoragePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Storage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schumann.engineering/csmn/1/Characteristics/Storage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CSMN.Characteristics.Storage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StoragePackage eINSTANCE = CSMN.Characteristics.Storage.impl.StoragePackageImpl.init();

	/**
	 * The meta object id for the '{@link CSMN.Characteristics.Storage.impl.StorageCharacteristicImpl <em>Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Characteristics.Storage.impl.StorageCharacteristicImpl
	 * @see CSMN.Characteristics.Storage.impl.StoragePackageImpl#getStorageCharacteristic()
	 * @generated
	 */
	int STORAGE_CHARACTERISTIC = 0;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CHARACTERISTIC__BASE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CHARACTERISTIC__BASE_PORT = 1;

	/**
	 * The feature id for the '<em><b>Encryption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CHARACTERISTIC__ENCRYPTION = 2;

	/**
	 * The feature id for the '<em><b>Storage Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CHARACTERISTIC__STORAGE_FORMAT = 3;

	/**
	 * The feature id for the '<em><b>Storage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CHARACTERISTIC__STORAGE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Storage Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CHARACTERISTIC__STORAGE_NAME = 5;

	/**
	 * The feature id for the '<em><b>Total Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CHARACTERISTIC__TOTAL_SIZE = 6;

	/**
	 * The number of structural features of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CHARACTERISTIC_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CHARACTERISTIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSMN.Characteristics.Storage.StorageType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Characteristics.Storage.StorageType
	 * @see CSMN.Characteristics.Storage.impl.StoragePackageImpl#getStorageType()
	 * @generated
	 */
	int STORAGE_TYPE = 1;


	/**
	 * Returns the meta object for class '{@link CSMN.Characteristics.Storage.StorageCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic</em>'.
	 * @see CSMN.Characteristics.Storage.StorageCharacteristic
	 * @generated
	 */
	EClass getStorageCharacteristic();

	/**
	 * Returns the meta object for the reference '{@link CSMN.Characteristics.Storage.StorageCharacteristic#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see CSMN.Characteristics.Storage.StorageCharacteristic#getBase_Component()
	 * @see #getStorageCharacteristic()
	 * @generated
	 */
	EReference getStorageCharacteristic_Base_Component();

	/**
	 * Returns the meta object for the reference '{@link CSMN.Characteristics.Storage.StorageCharacteristic#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see CSMN.Characteristics.Storage.StorageCharacteristic#getBase_Port()
	 * @see #getStorageCharacteristic()
	 * @generated
	 */
	EReference getStorageCharacteristic_Base_Port();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Characteristics.Storage.StorageCharacteristic#getEncryption <em>Encryption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encryption</em>'.
	 * @see CSMN.Characteristics.Storage.StorageCharacteristic#getEncryption()
	 * @see #getStorageCharacteristic()
	 * @generated
	 */
	EAttribute getStorageCharacteristic_Encryption();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Characteristics.Storage.StorageCharacteristic#getStorageFormat <em>Storage Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Format</em>'.
	 * @see CSMN.Characteristics.Storage.StorageCharacteristic#getStorageFormat()
	 * @see #getStorageCharacteristic()
	 * @generated
	 */
	EAttribute getStorageCharacteristic_StorageFormat();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Characteristics.Storage.StorageCharacteristic#getStorageType <em>Storage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Type</em>'.
	 * @see CSMN.Characteristics.Storage.StorageCharacteristic#getStorageType()
	 * @see #getStorageCharacteristic()
	 * @generated
	 */
	EAttribute getStorageCharacteristic_StorageType();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Characteristics.Storage.StorageCharacteristic#getStorageName <em>Storage Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Name</em>'.
	 * @see CSMN.Characteristics.Storage.StorageCharacteristic#getStorageName()
	 * @see #getStorageCharacteristic()
	 * @generated
	 */
	EAttribute getStorageCharacteristic_StorageName();

	/**
	 * Returns the meta object for the containment reference '{@link CSMN.Characteristics.Storage.StorageCharacteristic#getTotalSize <em>Total Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Total Size</em>'.
	 * @see CSMN.Characteristics.Storage.StorageCharacteristic#getTotalSize()
	 * @see #getStorageCharacteristic()
	 * @generated
	 */
	EReference getStorageCharacteristic_TotalSize();

	/**
	 * Returns the meta object for enum '{@link CSMN.Characteristics.Storage.StorageType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see CSMN.Characteristics.Storage.StorageType
	 * @generated
	 */
	EEnum getStorageType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StorageFactory getStorageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CSMN.Characteristics.Storage.impl.StorageCharacteristicImpl <em>Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Characteristics.Storage.impl.StorageCharacteristicImpl
		 * @see CSMN.Characteristics.Storage.impl.StoragePackageImpl#getStorageCharacteristic()
		 * @generated
		 */
		EClass STORAGE_CHARACTERISTIC = eINSTANCE.getStorageCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_CHARACTERISTIC__BASE_COMPONENT = eINSTANCE.getStorageCharacteristic_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_CHARACTERISTIC__BASE_PORT = eINSTANCE.getStorageCharacteristic_Base_Port();

		/**
		 * The meta object literal for the '<em><b>Encryption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_CHARACTERISTIC__ENCRYPTION = eINSTANCE.getStorageCharacteristic_Encryption();

		/**
		 * The meta object literal for the '<em><b>Storage Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_CHARACTERISTIC__STORAGE_FORMAT = eINSTANCE.getStorageCharacteristic_StorageFormat();

		/**
		 * The meta object literal for the '<em><b>Storage Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_CHARACTERISTIC__STORAGE_TYPE = eINSTANCE.getStorageCharacteristic_StorageType();

		/**
		 * The meta object literal for the '<em><b>Storage Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_CHARACTERISTIC__STORAGE_NAME = eINSTANCE.getStorageCharacteristic_StorageName();

		/**
		 * The meta object literal for the '<em><b>Total Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_CHARACTERISTIC__TOTAL_SIZE = eINSTANCE.getStorageCharacteristic_TotalSize();

		/**
		 * The meta object literal for the '{@link CSMN.Characteristics.Storage.StorageType <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Characteristics.Storage.StorageType
		 * @see CSMN.Characteristics.Storage.impl.StoragePackageImpl#getStorageType()
		 * @generated
		 */
		EEnum STORAGE_TYPE = eINSTANCE.getStorageType();

	}

} //StoragePackage
