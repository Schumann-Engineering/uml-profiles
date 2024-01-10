/**
 */
package CSMN.Characteristics.Energy;

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
 * @see CSMN.Characteristics.Energy.EnergyFactory
 * @model kind="package"
 * @generated
 */
public interface EnergyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Energy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schumann.engineering/csmn/1/Characteristics/Energy";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CSMN.Characteristics.Energy";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnergyPackage eINSTANCE = CSMN.Characteristics.Energy.impl.EnergyPackageImpl.init();

	/**
	 * The meta object id for the '{@link CSMN.Characteristics.Energy.impl.EnergyCharacteristicImpl <em>Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Characteristics.Energy.impl.EnergyCharacteristicImpl
	 * @see CSMN.Characteristics.Energy.impl.EnergyPackageImpl#getEnergyCharacteristic()
	 * @generated
	 */
	int ENERGY_CHARACTERISTIC = 0;

	/**
	 * The feature id for the '<em><b>Base Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CHARACTERISTIC__BASE_RELATIONSHIP = 0;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CHARACTERISTIC__BASE_PORT = 1;

	/**
	 * The feature id for the '<em><b>Energy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CHARACTERISTIC__ENERGY_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CHARACTERISTIC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CHARACTERISTIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSMN.Characteristics.Energy.EnergyType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Characteristics.Energy.EnergyType
	 * @see CSMN.Characteristics.Energy.impl.EnergyPackageImpl#getEnergyType()
	 * @generated
	 */
	int ENERGY_TYPE = 1;


	/**
	 * Returns the meta object for class '{@link CSMN.Characteristics.Energy.EnergyCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic</em>'.
	 * @see CSMN.Characteristics.Energy.EnergyCharacteristic
	 * @generated
	 */
	EClass getEnergyCharacteristic();

	/**
	 * Returns the meta object for the reference '{@link CSMN.Characteristics.Energy.EnergyCharacteristic#getBase_Relationship <em>Base Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Relationship</em>'.
	 * @see CSMN.Characteristics.Energy.EnergyCharacteristic#getBase_Relationship()
	 * @see #getEnergyCharacteristic()
	 * @generated
	 */
	EReference getEnergyCharacteristic_Base_Relationship();

	/**
	 * Returns the meta object for the reference '{@link CSMN.Characteristics.Energy.EnergyCharacteristic#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see CSMN.Characteristics.Energy.EnergyCharacteristic#getBase_Port()
	 * @see #getEnergyCharacteristic()
	 * @generated
	 */
	EReference getEnergyCharacteristic_Base_Port();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Characteristics.Energy.EnergyCharacteristic#getEnergyType <em>Energy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy Type</em>'.
	 * @see CSMN.Characteristics.Energy.EnergyCharacteristic#getEnergyType()
	 * @see #getEnergyCharacteristic()
	 * @generated
	 */
	EAttribute getEnergyCharacteristic_EnergyType();

	/**
	 * Returns the meta object for enum '{@link CSMN.Characteristics.Energy.EnergyType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see CSMN.Characteristics.Energy.EnergyType
	 * @generated
	 */
	EEnum getEnergyType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnergyFactory getEnergyFactory();

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
		 * The meta object literal for the '{@link CSMN.Characteristics.Energy.impl.EnergyCharacteristicImpl <em>Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Characteristics.Energy.impl.EnergyCharacteristicImpl
		 * @see CSMN.Characteristics.Energy.impl.EnergyPackageImpl#getEnergyCharacteristic()
		 * @generated
		 */
		EClass ENERGY_CHARACTERISTIC = eINSTANCE.getEnergyCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Base Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_CHARACTERISTIC__BASE_RELATIONSHIP = eINSTANCE.getEnergyCharacteristic_Base_Relationship();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_CHARACTERISTIC__BASE_PORT = eINSTANCE.getEnergyCharacteristic_Base_Port();

		/**
		 * The meta object literal for the '<em><b>Energy Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_CHARACTERISTIC__ENERGY_TYPE = eINSTANCE.getEnergyCharacteristic_EnergyType();

		/**
		 * The meta object literal for the '{@link CSMN.Characteristics.Energy.EnergyType <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Characteristics.Energy.EnergyType
		 * @see CSMN.Characteristics.Energy.impl.EnergyPackageImpl#getEnergyType()
		 * @generated
		 */
		EEnum ENERGY_TYPE = eINSTANCE.getEnergyType();

	}

} //EnergyPackage
