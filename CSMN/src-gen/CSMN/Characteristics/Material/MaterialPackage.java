/**
 */
package CSMN.Characteristics.Material;

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
 * @see CSMN.Characteristics.Material.MaterialFactory
 * @model kind="package"
 * @generated
 */
public interface MaterialPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Material";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schumann.engineering/csmn/1/Characteristics/Material";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CSMN.Characteristics.Material";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MaterialPackage eINSTANCE = CSMN.Characteristics.Material.impl.MaterialPackageImpl.init();

	/**
	 * The meta object id for the '{@link CSMN.Characteristics.Material.impl.MaterialCharacteristicImpl <em>Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Characteristics.Material.impl.MaterialCharacteristicImpl
	 * @see CSMN.Characteristics.Material.impl.MaterialPackageImpl#getMaterialCharacteristic()
	 * @generated
	 */
	int MATERIAL_CHARACTERISTIC = 0;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_CHARACTERISTIC__BASE_PORT = 0;

	/**
	 * The feature id for the '<em><b>Base Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_CHARACTERISTIC__BASE_RELATIONSHIP = 1;

	/**
	 * The feature id for the '<em><b>Material Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_CHARACTERISTIC__MATERIAL_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Other Material Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_CHARACTERISTIC__OTHER_MATERIAL_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_CHARACTERISTIC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_CHARACTERISTIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSMN.Characteristics.Material.MaterialType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Characteristics.Material.MaterialType
	 * @see CSMN.Characteristics.Material.impl.MaterialPackageImpl#getMaterialType()
	 * @generated
	 */
	int MATERIAL_TYPE = 1;


	/**
	 * Returns the meta object for class '{@link CSMN.Characteristics.Material.MaterialCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic</em>'.
	 * @see CSMN.Characteristics.Material.MaterialCharacteristic
	 * @generated
	 */
	EClass getMaterialCharacteristic();

	/**
	 * Returns the meta object for the reference '{@link CSMN.Characteristics.Material.MaterialCharacteristic#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see CSMN.Characteristics.Material.MaterialCharacteristic#getBase_Port()
	 * @see #getMaterialCharacteristic()
	 * @generated
	 */
	EReference getMaterialCharacteristic_Base_Port();

	/**
	 * Returns the meta object for the reference '{@link CSMN.Characteristics.Material.MaterialCharacteristic#getBase_Relationship <em>Base Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Relationship</em>'.
	 * @see CSMN.Characteristics.Material.MaterialCharacteristic#getBase_Relationship()
	 * @see #getMaterialCharacteristic()
	 * @generated
	 */
	EReference getMaterialCharacteristic_Base_Relationship();

	/**
	 * Returns the meta object for the attribute list '{@link CSMN.Characteristics.Material.MaterialCharacteristic#getMaterialType <em>Material Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Material Type</em>'.
	 * @see CSMN.Characteristics.Material.MaterialCharacteristic#getMaterialType()
	 * @see #getMaterialCharacteristic()
	 * @generated
	 */
	EAttribute getMaterialCharacteristic_MaterialType();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Characteristics.Material.MaterialCharacteristic#getOtherMaterialType <em>Other Material Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Other Material Type</em>'.
	 * @see CSMN.Characteristics.Material.MaterialCharacteristic#getOtherMaterialType()
	 * @see #getMaterialCharacteristic()
	 * @generated
	 */
	EAttribute getMaterialCharacteristic_OtherMaterialType();

	/**
	 * Returns the meta object for enum '{@link CSMN.Characteristics.Material.MaterialType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see CSMN.Characteristics.Material.MaterialType
	 * @generated
	 */
	EEnum getMaterialType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MaterialFactory getMaterialFactory();

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
		 * The meta object literal for the '{@link CSMN.Characteristics.Material.impl.MaterialCharacteristicImpl <em>Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Characteristics.Material.impl.MaterialCharacteristicImpl
		 * @see CSMN.Characteristics.Material.impl.MaterialPackageImpl#getMaterialCharacteristic()
		 * @generated
		 */
		EClass MATERIAL_CHARACTERISTIC = eINSTANCE.getMaterialCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL_CHARACTERISTIC__BASE_PORT = eINSTANCE.getMaterialCharacteristic_Base_Port();

		/**
		 * The meta object literal for the '<em><b>Base Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL_CHARACTERISTIC__BASE_RELATIONSHIP = eINSTANCE.getMaterialCharacteristic_Base_Relationship();

		/**
		 * The meta object literal for the '<em><b>Material Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL_CHARACTERISTIC__MATERIAL_TYPE = eINSTANCE.getMaterialCharacteristic_MaterialType();

		/**
		 * The meta object literal for the '<em><b>Other Material Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATERIAL_CHARACTERISTIC__OTHER_MATERIAL_TYPE = eINSTANCE.getMaterialCharacteristic_OtherMaterialType();

		/**
		 * The meta object literal for the '{@link CSMN.Characteristics.Material.MaterialType <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Characteristics.Material.MaterialType
		 * @see CSMN.Characteristics.Material.impl.MaterialPackageImpl#getMaterialType()
		 * @generated
		 */
		EEnum MATERIAL_TYPE = eINSTANCE.getMaterialType();

	}

} //MaterialPackage
