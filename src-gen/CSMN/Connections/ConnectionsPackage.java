/**
 */
package CSMN.Connections;

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
 * @see CSMN.Connections.ConnectionsFactory
 * @model kind="package"
 * @generated
 */
public interface ConnectionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Connections";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schumann-engineering/csmn/1/Connections";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CSMN.Connections";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConnectionsPackage eINSTANCE = CSMN.Connections.impl.ConnectionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link CSMN.Connections.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Connections.impl.ConnectionImpl
	 * @see CSMN.Connections.impl.ConnectionsPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONNECTION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Direction Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DIRECTION_PRIMARY = 1;

	/**
	 * The feature id for the '<em><b>Direction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DIRECTION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Flow To Client</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__FLOW_TO_CLIENT = 3;

	/**
	 * The feature id for the '<em><b>Flow To Supplier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__FLOW_TO_SUPPLIER = 4;

	/**
	 * The feature id for the '<em><b>Is Real Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__IS_REAL_TIME = 5;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PURPOSE = 6;

	/**
	 * The feature id for the '<em><b>Base Directed Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__BASE_DIRECTED_RELATIONSHIP = 7;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSMN.Connections.ConnectionType <em>Connection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Connections.ConnectionType
	 * @see CSMN.Connections.impl.ConnectionsPackageImpl#getConnectionType()
	 * @generated
	 */
	int CONNECTION_TYPE = 1;

	/**
	 * The meta object id for the '{@link CSMN.Connections.DirectionOfPrimaryFlow <em>Direction Of Primary Flow</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Connections.DirectionOfPrimaryFlow
	 * @see CSMN.Connections.impl.ConnectionsPackageImpl#getDirectionOfPrimaryFlow()
	 * @generated
	 */
	int DIRECTION_OF_PRIMARY_FLOW = 2;

	/**
	 * The meta object id for the '{@link CSMN.Connections.DirectionType <em>Direction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Connections.DirectionType
	 * @see CSMN.Connections.impl.ConnectionsPackageImpl#getDirectionType()
	 * @generated
	 */
	int DIRECTION_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link CSMN.Connections.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see CSMN.Connections.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Connections.Connection#getConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Type</em>'.
	 * @see CSMN.Connections.Connection#getConnectionType()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_ConnectionType();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Connections.Connection#getDirectionPrimary <em>Direction Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction Primary</em>'.
	 * @see CSMN.Connections.Connection#getDirectionPrimary()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_DirectionPrimary();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Connections.Connection#getDirectionType <em>Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction Type</em>'.
	 * @see CSMN.Connections.Connection#getDirectionType()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_DirectionType();

	/**
	 * Returns the meta object for the reference list '{@link CSMN.Connections.Connection#getFlowToClient <em>Flow To Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flow To Client</em>'.
	 * @see CSMN.Connections.Connection#getFlowToClient()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_FlowToClient();

	/**
	 * Returns the meta object for the reference list '{@link CSMN.Connections.Connection#getFlowToSupplier <em>Flow To Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flow To Supplier</em>'.
	 * @see CSMN.Connections.Connection#getFlowToSupplier()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_FlowToSupplier();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Connections.Connection#isRealTime <em>Is Real Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Real Time</em>'.
	 * @see CSMN.Connections.Connection#isRealTime()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_IsRealTime();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Connections.Connection#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see CSMN.Connections.Connection#getPurpose()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Purpose();

	/**
	 * Returns the meta object for the reference '{@link CSMN.Connections.Connection#getBase_DirectedRelationship <em>Base Directed Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Directed Relationship</em>'.
	 * @see CSMN.Connections.Connection#getBase_DirectedRelationship()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Base_DirectedRelationship();

	/**
	 * Returns the meta object for enum '{@link CSMN.Connections.ConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connection Type</em>'.
	 * @see CSMN.Connections.ConnectionType
	 * @generated
	 */
	EEnum getConnectionType();

	/**
	 * Returns the meta object for enum '{@link CSMN.Connections.DirectionOfPrimaryFlow <em>Direction Of Primary Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction Of Primary Flow</em>'.
	 * @see CSMN.Connections.DirectionOfPrimaryFlow
	 * @generated
	 */
	EEnum getDirectionOfPrimaryFlow();

	/**
	 * Returns the meta object for enum '{@link CSMN.Connections.DirectionType <em>Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction Type</em>'.
	 * @see CSMN.Connections.DirectionType
	 * @generated
	 */
	EEnum getDirectionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConnectionsFactory getConnectionsFactory();

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
		 * The meta object literal for the '{@link CSMN.Connections.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Connections.impl.ConnectionImpl
		 * @see CSMN.Connections.impl.ConnectionsPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Connection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__CONNECTION_TYPE = eINSTANCE.getConnection_ConnectionType();

		/**
		 * The meta object literal for the '<em><b>Direction Primary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__DIRECTION_PRIMARY = eINSTANCE.getConnection_DirectionPrimary();

		/**
		 * The meta object literal for the '<em><b>Direction Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__DIRECTION_TYPE = eINSTANCE.getConnection_DirectionType();

		/**
		 * The meta object literal for the '<em><b>Flow To Client</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__FLOW_TO_CLIENT = eINSTANCE.getConnection_FlowToClient();

		/**
		 * The meta object literal for the '<em><b>Flow To Supplier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__FLOW_TO_SUPPLIER = eINSTANCE.getConnection_FlowToSupplier();

		/**
		 * The meta object literal for the '<em><b>Is Real Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__IS_REAL_TIME = eINSTANCE.getConnection_IsRealTime();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__PURPOSE = eINSTANCE.getConnection_Purpose();

		/**
		 * The meta object literal for the '<em><b>Base Directed Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__BASE_DIRECTED_RELATIONSHIP = eINSTANCE.getConnection_Base_DirectedRelationship();

		/**
		 * The meta object literal for the '{@link CSMN.Connections.ConnectionType <em>Connection Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Connections.ConnectionType
		 * @see CSMN.Connections.impl.ConnectionsPackageImpl#getConnectionType()
		 * @generated
		 */
		EEnum CONNECTION_TYPE = eINSTANCE.getConnectionType();

		/**
		 * The meta object literal for the '{@link CSMN.Connections.DirectionOfPrimaryFlow <em>Direction Of Primary Flow</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Connections.DirectionOfPrimaryFlow
		 * @see CSMN.Connections.impl.ConnectionsPackageImpl#getDirectionOfPrimaryFlow()
		 * @generated
		 */
		EEnum DIRECTION_OF_PRIMARY_FLOW = eINSTANCE.getDirectionOfPrimaryFlow();

		/**
		 * The meta object literal for the '{@link CSMN.Connections.DirectionType <em>Direction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Connections.DirectionType
		 * @see CSMN.Connections.impl.ConnectionsPackageImpl#getDirectionType()
		 * @generated
		 */
		EEnum DIRECTION_TYPE = eINSTANCE.getDirectionType();

	}

} //ConnectionsPackage
