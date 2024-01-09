/**
 */
package CSMN.Characteristics.Interface;

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
 * @see CSMN.Characteristics.Interface.InterfaceFactory
 * @model kind="package"
 * @generated
 */
public interface InterfacePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Interface";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schumann-engineering/csmn/1/Characteristics/Interface";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CSMN.Characteristics.Interface";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InterfacePackage eINSTANCE = CSMN.Characteristics.Interface.impl.InterfacePackageImpl.init();

	/**
	 * The meta object id for the '{@link CSMN.Characteristics.Interface.impl.InterfaceCharacteristicImpl <em>Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Characteristics.Interface.impl.InterfaceCharacteristicImpl
	 * @see CSMN.Characteristics.Interface.impl.InterfacePackageImpl#getInterfaceCharacteristic()
	 * @generated
	 */
	int INTERFACE_CHARACTERISTIC = 0;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CHARACTERISTIC__BASE_PORT = 0;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CHARACTERISTIC__INTERFACE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CHARACTERISTIC__PURPOSE = 2;

	/**
	 * The number of structural features of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CHARACTERISTIC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CHARACTERISTIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSMN.Characteristics.Interface.impl.BandwidthCharacteristicsImpl <em>Bandwidth Characteristics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Characteristics.Interface.impl.BandwidthCharacteristicsImpl
	 * @see CSMN.Characteristics.Interface.impl.InterfacePackageImpl#getBandwidthCharacteristics()
	 * @generated
	 */
	int BANDWIDTH_CHARACTERISTICS = 1;

	/**
	 * The feature id for the '<em><b>Base Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH_CHARACTERISTICS__BASE_RELATIONSHIP = 0;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH_CHARACTERISTICS__BASE_PORT = 1;

	/**
	 * The feature id for the '<em><b>Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH_CHARACTERISTICS__BANDWIDTH = 2;

	/**
	 * The number of structural features of the '<em>Bandwidth Characteristics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH_CHARACTERISTICS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Bandwidth Characteristics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH_CHARACTERISTICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSMN.Characteristics.Interface.impl.FirewallCharacteristicImpl <em>Firewall Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Characteristics.Interface.impl.FirewallCharacteristicImpl
	 * @see CSMN.Characteristics.Interface.impl.InterfacePackageImpl#getFirewallCharacteristic()
	 * @generated
	 */
	int FIREWALL_CHARACTERISTIC = 2;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_CHARACTERISTIC__BASE_PORT = 0;

	/**
	 * The number of structural features of the '<em>Firewall Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_CHARACTERISTIC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Firewall Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_CHARACTERISTIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSMN.Characteristics.Interface.InterfaceType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Characteristics.Interface.InterfaceType
	 * @see CSMN.Characteristics.Interface.impl.InterfacePackageImpl#getInterfaceType()
	 * @generated
	 */
	int INTERFACE_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link CSMN.Characteristics.Interface.InterfaceCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic</em>'.
	 * @see CSMN.Characteristics.Interface.InterfaceCharacteristic
	 * @generated
	 */
	EClass getInterfaceCharacteristic();

	/**
	 * Returns the meta object for the reference '{@link CSMN.Characteristics.Interface.InterfaceCharacteristic#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see CSMN.Characteristics.Interface.InterfaceCharacteristic#getBase_Port()
	 * @see #getInterfaceCharacteristic()
	 * @generated
	 */
	EReference getInterfaceCharacteristic_Base_Port();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Characteristics.Interface.InterfaceCharacteristic#getInterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Type</em>'.
	 * @see CSMN.Characteristics.Interface.InterfaceCharacteristic#getInterfaceType()
	 * @see #getInterfaceCharacteristic()
	 * @generated
	 */
	EAttribute getInterfaceCharacteristic_InterfaceType();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Characteristics.Interface.InterfaceCharacteristic#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see CSMN.Characteristics.Interface.InterfaceCharacteristic#getPurpose()
	 * @see #getInterfaceCharacteristic()
	 * @generated
	 */
	EAttribute getInterfaceCharacteristic_Purpose();

	/**
	 * Returns the meta object for class '{@link CSMN.Characteristics.Interface.BandwidthCharacteristics <em>Bandwidth Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bandwidth Characteristics</em>'.
	 * @see CSMN.Characteristics.Interface.BandwidthCharacteristics
	 * @generated
	 */
	EClass getBandwidthCharacteristics();

	/**
	 * Returns the meta object for the reference '{@link CSMN.Characteristics.Interface.BandwidthCharacteristics#getBase_Relationship <em>Base Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Relationship</em>'.
	 * @see CSMN.Characteristics.Interface.BandwidthCharacteristics#getBase_Relationship()
	 * @see #getBandwidthCharacteristics()
	 * @generated
	 */
	EReference getBandwidthCharacteristics_Base_Relationship();

	/**
	 * Returns the meta object for the reference '{@link CSMN.Characteristics.Interface.BandwidthCharacteristics#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see CSMN.Characteristics.Interface.BandwidthCharacteristics#getBase_Port()
	 * @see #getBandwidthCharacteristics()
	 * @generated
	 */
	EReference getBandwidthCharacteristics_Base_Port();

	/**
	 * Returns the meta object for the containment reference '{@link CSMN.Characteristics.Interface.BandwidthCharacteristics#getBandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bandwidth</em>'.
	 * @see CSMN.Characteristics.Interface.BandwidthCharacteristics#getBandwidth()
	 * @see #getBandwidthCharacteristics()
	 * @generated
	 */
	EReference getBandwidthCharacteristics_Bandwidth();

	/**
	 * Returns the meta object for class '{@link CSMN.Characteristics.Interface.FirewallCharacteristic <em>Firewall Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firewall Characteristic</em>'.
	 * @see CSMN.Characteristics.Interface.FirewallCharacteristic
	 * @generated
	 */
	EClass getFirewallCharacteristic();

	/**
	 * Returns the meta object for the reference '{@link CSMN.Characteristics.Interface.FirewallCharacteristic#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see CSMN.Characteristics.Interface.FirewallCharacteristic#getBase_Port()
	 * @see #getFirewallCharacteristic()
	 * @generated
	 */
	EReference getFirewallCharacteristic_Base_Port();

	/**
	 * Returns the meta object for enum '{@link CSMN.Characteristics.Interface.InterfaceType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see CSMN.Characteristics.Interface.InterfaceType
	 * @generated
	 */
	EEnum getInterfaceType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InterfaceFactory getInterfaceFactory();

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
		 * The meta object literal for the '{@link CSMN.Characteristics.Interface.impl.InterfaceCharacteristicImpl <em>Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Characteristics.Interface.impl.InterfaceCharacteristicImpl
		 * @see CSMN.Characteristics.Interface.impl.InterfacePackageImpl#getInterfaceCharacteristic()
		 * @generated
		 */
		EClass INTERFACE_CHARACTERISTIC = eINSTANCE.getInterfaceCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CHARACTERISTIC__BASE_PORT = eINSTANCE.getInterfaceCharacteristic_Base_Port();

		/**
		 * The meta object literal for the '<em><b>Interface Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_CHARACTERISTIC__INTERFACE_TYPE = eINSTANCE.getInterfaceCharacteristic_InterfaceType();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_CHARACTERISTIC__PURPOSE = eINSTANCE.getInterfaceCharacteristic_Purpose();

		/**
		 * The meta object literal for the '{@link CSMN.Characteristics.Interface.impl.BandwidthCharacteristicsImpl <em>Bandwidth Characteristics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Characteristics.Interface.impl.BandwidthCharacteristicsImpl
		 * @see CSMN.Characteristics.Interface.impl.InterfacePackageImpl#getBandwidthCharacteristics()
		 * @generated
		 */
		EClass BANDWIDTH_CHARACTERISTICS = eINSTANCE.getBandwidthCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Base Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANDWIDTH_CHARACTERISTICS__BASE_RELATIONSHIP = eINSTANCE.getBandwidthCharacteristics_Base_Relationship();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANDWIDTH_CHARACTERISTICS__BASE_PORT = eINSTANCE.getBandwidthCharacteristics_Base_Port();

		/**
		 * The meta object literal for the '<em><b>Bandwidth</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANDWIDTH_CHARACTERISTICS__BANDWIDTH = eINSTANCE.getBandwidthCharacteristics_Bandwidth();

		/**
		 * The meta object literal for the '{@link CSMN.Characteristics.Interface.impl.FirewallCharacteristicImpl <em>Firewall Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Characteristics.Interface.impl.FirewallCharacteristicImpl
		 * @see CSMN.Characteristics.Interface.impl.InterfacePackageImpl#getFirewallCharacteristic()
		 * @generated
		 */
		EClass FIREWALL_CHARACTERISTIC = eINSTANCE.getFirewallCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIREWALL_CHARACTERISTIC__BASE_PORT = eINSTANCE.getFirewallCharacteristic_Base_Port();

		/**
		 * The meta object literal for the '{@link CSMN.Characteristics.Interface.InterfaceType <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Characteristics.Interface.InterfaceType
		 * @see CSMN.Characteristics.Interface.impl.InterfacePackageImpl#getInterfaceType()
		 * @generated
		 */
		EEnum INTERFACE_TYPE = eINSTANCE.getInterfaceType();

	}

} //InterfacePackage
