/**
 */
package CSMN.Characteristics.Flow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see CSMN.Characteristics.Flow.FlowFactory
 * @model kind="package"
 * @generated
 */
public interface FlowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Flow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schumann-engineering/csmn/1/Characteristics/Flow";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CSMN.Characteristics.Flow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FlowPackage eINSTANCE = CSMN.Characteristics.Flow.impl.FlowPackageImpl.init();

	/**
	 * The meta object id for the '{@link CSMN.Characteristics.Flow.impl.FlowCharacteristicImpl <em>Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Characteristics.Flow.impl.FlowCharacteristicImpl
	 * @see CSMN.Characteristics.Flow.impl.FlowPackageImpl#getFlowCharacteristic()
	 * @generated
	 */
	int FLOW_CHARACTERISTIC = 1;

	/**
	 * The feature id for the '<em><b>Base Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CHARACTERISTIC__BASE_RELATIONSHIP = 0;

	/**
	 * The number of structural features of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CHARACTERISTIC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CHARACTERISTIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSMN.Characteristics.Flow.impl.OsiCharacteristicImpl <em>Osi Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Characteristics.Flow.impl.OsiCharacteristicImpl
	 * @see CSMN.Characteristics.Flow.impl.FlowPackageImpl#getOsiCharacteristic()
	 * @generated
	 */
	int OSI_CHARACTERISTIC = 0;

	/**
	 * The feature id for the '<em><b>Base Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI_CHARACTERISTIC__BASE_RELATIONSHIP = FLOW_CHARACTERISTIC__BASE_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI_CHARACTERISTIC__APPLICATION = FLOW_CHARACTERISTIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Presentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI_CHARACTERISTIC__PRESENTATION = FLOW_CHARACTERISTIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Session</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI_CHARACTERISTIC__SESSION = FLOW_CHARACTERISTIC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI_CHARACTERISTIC__TRANSPORT = FLOW_CHARACTERISTIC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI_CHARACTERISTIC__NETWORK = FLOW_CHARACTERISTIC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Data Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI_CHARACTERISTIC__DATA_LINK = FLOW_CHARACTERISTIC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Physical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI_CHARACTERISTIC__PHYSICAL = FLOW_CHARACTERISTIC_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Osi Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI_CHARACTERISTIC_FEATURE_COUNT = FLOW_CHARACTERISTIC_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Osi Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI_CHARACTERISTIC_OPERATION_COUNT = FLOW_CHARACTERISTIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CSMN.Characteristics.Flow.impl.TcpCharacteristicImpl <em>Tcp Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Characteristics.Flow.impl.TcpCharacteristicImpl
	 * @see CSMN.Characteristics.Flow.impl.FlowPackageImpl#getTcpCharacteristic()
	 * @generated
	 */
	int TCP_CHARACTERISTIC = 2;

	/**
	 * The feature id for the '<em><b>Base Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_CHARACTERISTIC__BASE_RELATIONSHIP = FLOW_CHARACTERISTIC__BASE_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_CHARACTERISTIC__APPLICATION = FLOW_CHARACTERISTIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_CHARACTERISTIC__TRANSPORT = FLOW_CHARACTERISTIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_CHARACTERISTIC__NETWORK = FLOW_CHARACTERISTIC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_CHARACTERISTIC__DATA_LINK = FLOW_CHARACTERISTIC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Physical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_CHARACTERISTIC__PHYSICAL = FLOW_CHARACTERISTIC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mechanical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_CHARACTERISTIC__MECHANICAL = FLOW_CHARACTERISTIC_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Tcp Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_CHARACTERISTIC_FEATURE_COUNT = FLOW_CHARACTERISTIC_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Tcp Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_CHARACTERISTIC_OPERATION_COUNT = FLOW_CHARACTERISTIC_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link CSMN.Characteristics.Flow.OsiCharacteristic <em>Osi Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Osi Characteristic</em>'.
	 * @see CSMN.Characteristics.Flow.OsiCharacteristic
	 * @generated
	 */
	EClass getOsiCharacteristic();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Characteristics.Flow.OsiCharacteristic#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application</em>'.
	 * @see CSMN.Characteristics.Flow.OsiCharacteristic#getApplication()
	 * @see #getOsiCharacteristic()
	 * @generated
	 */
	EAttribute getOsiCharacteristic_Application();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Characteristics.Flow.OsiCharacteristic#getPresentation <em>Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presentation</em>'.
	 * @see CSMN.Characteristics.Flow.OsiCharacteristic#getPresentation()
	 * @see #getOsiCharacteristic()
	 * @generated
	 */
	EAttribute getOsiCharacteristic_Presentation();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Characteristics.Flow.OsiCharacteristic#getSession <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session</em>'.
	 * @see CSMN.Characteristics.Flow.OsiCharacteristic#getSession()
	 * @see #getOsiCharacteristic()
	 * @generated
	 */
	EAttribute getOsiCharacteristic_Session();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Characteristics.Flow.OsiCharacteristic#getTransport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transport</em>'.
	 * @see CSMN.Characteristics.Flow.OsiCharacteristic#getTransport()
	 * @see #getOsiCharacteristic()
	 * @generated
	 */
	EAttribute getOsiCharacteristic_Transport();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Characteristics.Flow.OsiCharacteristic#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network</em>'.
	 * @see CSMN.Characteristics.Flow.OsiCharacteristic#getNetwork()
	 * @see #getOsiCharacteristic()
	 * @generated
	 */
	EAttribute getOsiCharacteristic_Network();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Characteristics.Flow.OsiCharacteristic#getDataLink <em>Data Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Link</em>'.
	 * @see CSMN.Characteristics.Flow.OsiCharacteristic#getDataLink()
	 * @see #getOsiCharacteristic()
	 * @generated
	 */
	EAttribute getOsiCharacteristic_DataLink();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Characteristics.Flow.OsiCharacteristic#getPhysical <em>Physical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical</em>'.
	 * @see CSMN.Characteristics.Flow.OsiCharacteristic#getPhysical()
	 * @see #getOsiCharacteristic()
	 * @generated
	 */
	EAttribute getOsiCharacteristic_Physical();

	/**
	 * Returns the meta object for class '{@link CSMN.Characteristics.Flow.FlowCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic</em>'.
	 * @see CSMN.Characteristics.Flow.FlowCharacteristic
	 * @generated
	 */
	EClass getFlowCharacteristic();

	/**
	 * Returns the meta object for the reference '{@link CSMN.Characteristics.Flow.FlowCharacteristic#getBase_Relationship <em>Base Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Relationship</em>'.
	 * @see CSMN.Characteristics.Flow.FlowCharacteristic#getBase_Relationship()
	 * @see #getFlowCharacteristic()
	 * @generated
	 */
	EReference getFlowCharacteristic_Base_Relationship();

	/**
	 * Returns the meta object for class '{@link CSMN.Characteristics.Flow.TcpCharacteristic <em>Tcp Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcp Characteristic</em>'.
	 * @see CSMN.Characteristics.Flow.TcpCharacteristic
	 * @generated
	 */
	EClass getTcpCharacteristic();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Characteristics.Flow.TcpCharacteristic#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application</em>'.
	 * @see CSMN.Characteristics.Flow.TcpCharacteristic#getApplication()
	 * @see #getTcpCharacteristic()
	 * @generated
	 */
	EAttribute getTcpCharacteristic_Application();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Characteristics.Flow.TcpCharacteristic#getTransport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transport</em>'.
	 * @see CSMN.Characteristics.Flow.TcpCharacteristic#getTransport()
	 * @see #getTcpCharacteristic()
	 * @generated
	 */
	EAttribute getTcpCharacteristic_Transport();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Characteristics.Flow.TcpCharacteristic#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network</em>'.
	 * @see CSMN.Characteristics.Flow.TcpCharacteristic#getNetwork()
	 * @see #getTcpCharacteristic()
	 * @generated
	 */
	EAttribute getTcpCharacteristic_Network();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Characteristics.Flow.TcpCharacteristic#getDataLink <em>Data Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Link</em>'.
	 * @see CSMN.Characteristics.Flow.TcpCharacteristic#getDataLink()
	 * @see #getTcpCharacteristic()
	 * @generated
	 */
	EAttribute getTcpCharacteristic_DataLink();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Characteristics.Flow.TcpCharacteristic#getPhysical <em>Physical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical</em>'.
	 * @see CSMN.Characteristics.Flow.TcpCharacteristic#getPhysical()
	 * @see #getTcpCharacteristic()
	 * @generated
	 */
	EAttribute getTcpCharacteristic_Physical();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Characteristics.Flow.TcpCharacteristic#getMechanical <em>Mechanical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mechanical</em>'.
	 * @see CSMN.Characteristics.Flow.TcpCharacteristic#getMechanical()
	 * @see #getTcpCharacteristic()
	 * @generated
	 */
	EAttribute getTcpCharacteristic_Mechanical();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FlowFactory getFlowFactory();

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
		 * The meta object literal for the '{@link CSMN.Characteristics.Flow.impl.OsiCharacteristicImpl <em>Osi Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Characteristics.Flow.impl.OsiCharacteristicImpl
		 * @see CSMN.Characteristics.Flow.impl.FlowPackageImpl#getOsiCharacteristic()
		 * @generated
		 */
		EClass OSI_CHARACTERISTIC = eINSTANCE.getOsiCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSI_CHARACTERISTIC__APPLICATION = eINSTANCE.getOsiCharacteristic_Application();

		/**
		 * The meta object literal for the '<em><b>Presentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSI_CHARACTERISTIC__PRESENTATION = eINSTANCE.getOsiCharacteristic_Presentation();

		/**
		 * The meta object literal for the '<em><b>Session</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSI_CHARACTERISTIC__SESSION = eINSTANCE.getOsiCharacteristic_Session();

		/**
		 * The meta object literal for the '<em><b>Transport</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSI_CHARACTERISTIC__TRANSPORT = eINSTANCE.getOsiCharacteristic_Transport();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSI_CHARACTERISTIC__NETWORK = eINSTANCE.getOsiCharacteristic_Network();

		/**
		 * The meta object literal for the '<em><b>Data Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSI_CHARACTERISTIC__DATA_LINK = eINSTANCE.getOsiCharacteristic_DataLink();

		/**
		 * The meta object literal for the '<em><b>Physical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSI_CHARACTERISTIC__PHYSICAL = eINSTANCE.getOsiCharacteristic_Physical();

		/**
		 * The meta object literal for the '{@link CSMN.Characteristics.Flow.impl.FlowCharacteristicImpl <em>Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Characteristics.Flow.impl.FlowCharacteristicImpl
		 * @see CSMN.Characteristics.Flow.impl.FlowPackageImpl#getFlowCharacteristic()
		 * @generated
		 */
		EClass FLOW_CHARACTERISTIC = eINSTANCE.getFlowCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Base Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_CHARACTERISTIC__BASE_RELATIONSHIP = eINSTANCE.getFlowCharacteristic_Base_Relationship();

		/**
		 * The meta object literal for the '{@link CSMN.Characteristics.Flow.impl.TcpCharacteristicImpl <em>Tcp Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Characteristics.Flow.impl.TcpCharacteristicImpl
		 * @see CSMN.Characteristics.Flow.impl.FlowPackageImpl#getTcpCharacteristic()
		 * @generated
		 */
		EClass TCP_CHARACTERISTIC = eINSTANCE.getTcpCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCP_CHARACTERISTIC__APPLICATION = eINSTANCE.getTcpCharacteristic_Application();

		/**
		 * The meta object literal for the '<em><b>Transport</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCP_CHARACTERISTIC__TRANSPORT = eINSTANCE.getTcpCharacteristic_Transport();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCP_CHARACTERISTIC__NETWORK = eINSTANCE.getTcpCharacteristic_Network();

		/**
		 * The meta object literal for the '<em><b>Data Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCP_CHARACTERISTIC__DATA_LINK = eINSTANCE.getTcpCharacteristic_DataLink();

		/**
		 * The meta object literal for the '<em><b>Physical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCP_CHARACTERISTIC__PHYSICAL = eINSTANCE.getTcpCharacteristic_Physical();

		/**
		 * The meta object literal for the '<em><b>Mechanical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCP_CHARACTERISTIC__MECHANICAL = eINSTANCE.getTcpCharacteristic_Mechanical();

	}

} //FlowPackage
