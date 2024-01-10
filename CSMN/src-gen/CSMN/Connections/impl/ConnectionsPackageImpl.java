/**
 */
package CSMN.Connections.impl;

import CSMN.CSMNPackage;

import CSMN.Characteristics.Asset.AssetPackage;

import CSMN.Characteristics.Asset.impl.AssetPackageImpl;

import CSMN.Characteristics.Energy.EnergyPackage;

import CSMN.Characteristics.Energy.impl.EnergyPackageImpl;

import CSMN.Characteristics.Flow.FlowPackage;

import CSMN.Characteristics.Flow.impl.FlowPackageImpl;

import CSMN.Characteristics.Interface.InterfacePackage;

import CSMN.Characteristics.Interface.impl.InterfacePackageImpl;

import CSMN.Characteristics.Material.MaterialPackage;

import CSMN.Characteristics.Material.impl.MaterialPackageImpl;

import CSMN.Characteristics.Security.SecurityPackage;

import CSMN.Characteristics.Security.impl.SecurityPackageImpl;

import CSMN.Characteristics.Storage.StoragePackage;

import CSMN.Characteristics.Storage.impl.StoragePackageImpl;

import CSMN.Connections.Connection;
import CSMN.Connections.ConnectionType;
import CSMN.Connections.ConnectionsFactory;
import CSMN.Connections.ConnectionsPackage;
import CSMN.Connections.DirectionOfPrimaryFlow;
import CSMN.Connections.DirectionType;

import CSMN.Elements.ElementsPackage;

import CSMN.Elements.impl.ElementsPackageImpl;

import CSMN.Lifecycle.LifecyclePackage;

import CSMN.Lifecycle.impl.LifecyclePackageImpl;

import CSMN.PrimitiveTypes.PrimitiveTypesPackage;

import CSMN.PrimitiveTypes.impl.PrimitiveTypesPackageImpl;

import CSMN.impl.CSMNPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConnectionsPackageImpl extends EPackageImpl implements ConnectionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionOfPrimaryFlowEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see CSMN.Connections.ConnectionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConnectionsPackageImpl() {
		super(eNS_URI, ConnectionsFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ConnectionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConnectionsPackage init() {
		if (isInited) return (ConnectionsPackage)EPackage.Registry.INSTANCE.getEPackage(ConnectionsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredConnectionsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ConnectionsPackageImpl theConnectionsPackage = registeredConnectionsPackage instanceof ConnectionsPackageImpl ? (ConnectionsPackageImpl)registeredConnectionsPackage : new ConnectionsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CSMNPackage.eNS_URI);
		CSMNPackageImpl theCSMNPackage = (CSMNPackageImpl)(registeredPackage instanceof CSMNPackageImpl ? registeredPackage : CSMNPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ElementsPackage.eNS_URI);
		ElementsPackageImpl theElementsPackage = (ElementsPackageImpl)(registeredPackage instanceof ElementsPackageImpl ? registeredPackage : ElementsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AssetPackage.eNS_URI);
		AssetPackageImpl theAssetPackage = (AssetPackageImpl)(registeredPackage instanceof AssetPackageImpl ? registeredPackage : AssetPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EnergyPackage.eNS_URI);
		EnergyPackageImpl theEnergyPackage = (EnergyPackageImpl)(registeredPackage instanceof EnergyPackageImpl ? registeredPackage : EnergyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FlowPackage.eNS_URI);
		FlowPackageImpl theFlowPackage = (FlowPackageImpl)(registeredPackage instanceof FlowPackageImpl ? registeredPackage : FlowPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InterfacePackage.eNS_URI);
		InterfacePackageImpl theInterfacePackage = (InterfacePackageImpl)(registeredPackage instanceof InterfacePackageImpl ? registeredPackage : InterfacePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MaterialPackage.eNS_URI);
		MaterialPackageImpl theMaterialPackage = (MaterialPackageImpl)(registeredPackage instanceof MaterialPackageImpl ? registeredPackage : MaterialPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);
		SecurityPackageImpl theSecurityPackage = (SecurityPackageImpl)(registeredPackage instanceof SecurityPackageImpl ? registeredPackage : SecurityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StoragePackage.eNS_URI);
		StoragePackageImpl theStoragePackage = (StoragePackageImpl)(registeredPackage instanceof StoragePackageImpl ? registeredPackage : StoragePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI);
		PrimitiveTypesPackageImpl thePrimitiveTypesPackage = (PrimitiveTypesPackageImpl)(registeredPackage instanceof PrimitiveTypesPackageImpl ? registeredPackage : PrimitiveTypesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LifecyclePackage.eNS_URI);
		LifecyclePackageImpl theLifecyclePackage = (LifecyclePackageImpl)(registeredPackage instanceof LifecyclePackageImpl ? registeredPackage : LifecyclePackage.eINSTANCE);

		// Create package meta-data objects
		theConnectionsPackage.createPackageContents();
		theCSMNPackage.createPackageContents();
		theElementsPackage.createPackageContents();
		theAssetPackage.createPackageContents();
		theEnergyPackage.createPackageContents();
		theFlowPackage.createPackageContents();
		theInterfacePackage.createPackageContents();
		theMaterialPackage.createPackageContents();
		theSecurityPackage.createPackageContents();
		theStoragePackage.createPackageContents();
		thePrimitiveTypesPackage.createPackageContents();
		theLifecyclePackage.createPackageContents();

		// Initialize created meta-data
		theConnectionsPackage.initializePackageContents();
		theCSMNPackage.initializePackageContents();
		theElementsPackage.initializePackageContents();
		theAssetPackage.initializePackageContents();
		theEnergyPackage.initializePackageContents();
		theFlowPackage.initializePackageContents();
		theInterfacePackage.initializePackageContents();
		theMaterialPackage.initializePackageContents();
		theSecurityPackage.initializePackageContents();
		theStoragePackage.initializePackageContents();
		thePrimitiveTypesPackage.initializePackageContents();
		theLifecyclePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConnectionsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConnectionsPackage.eNS_URI, theConnectionsPackage);
		return theConnectionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnection_ConnectionType() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnection_DirectionPrimary() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnection_DirectionType() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_FlowToClient() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_FlowToSupplier() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnection_IsRealTime() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnection_Purpose() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_Base_DirectedRelationship() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConnectionType() {
		return connectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDirectionOfPrimaryFlow() {
		return directionOfPrimaryFlowEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDirectionType() {
		return directionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionsFactory getConnectionsFactory() {
		return (ConnectionsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		connectionEClass = createEClass(CONNECTION);
		createEAttribute(connectionEClass, CONNECTION__CONNECTION_TYPE);
		createEAttribute(connectionEClass, CONNECTION__DIRECTION_PRIMARY);
		createEAttribute(connectionEClass, CONNECTION__DIRECTION_TYPE);
		createEReference(connectionEClass, CONNECTION__FLOW_TO_CLIENT);
		createEReference(connectionEClass, CONNECTION__FLOW_TO_SUPPLIER);
		createEAttribute(connectionEClass, CONNECTION__IS_REAL_TIME);
		createEAttribute(connectionEClass, CONNECTION__PURPOSE);
		createEReference(connectionEClass, CONNECTION__BASE_DIRECTED_RELATIONSHIP);

		// Create enums
		connectionTypeEEnum = createEEnum(CONNECTION_TYPE);
		directionOfPrimaryFlowEEnum = createEEnum(DIRECTION_OF_PRIMARY_FLOW);
		directionTypeEEnum = createEEnum(DIRECTION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConnection_ConnectionType(), this.getConnectionType(), "connectionType", "Information", 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConnection_DirectionPrimary(), this.getDirectionOfPrimaryFlow(), "directionPrimary", "Client", 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConnection_DirectionType(), this.getDirectionType(), "directionType", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnection_FlowToClient(), theUMLPackage.getDataType(), null, "flowToClient", null, 0, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnection_FlowToSupplier(), theUMLPackage.getDataType(), null, "flowToSupplier", null, 0, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConnection_IsRealTime(), theTypesPackage.getBoolean(), "isRealTime", "false", 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConnection_Purpose(), theTypesPackage.getString(), "purpose", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnection_Base_DirectedRelationship(), theUMLPackage.getDirectedRelationship(), null, "base_DirectedRelationship", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(connectionTypeEEnum, ConnectionType.class, "ConnectionType");
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.ENERGY);
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.DISTURBANCE);
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.INFORMATION);
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.MATERIAL);
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.MECHANICAL);
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.UNSPECIFIED);

		initEEnum(directionOfPrimaryFlowEEnum, DirectionOfPrimaryFlow.class, "DirectionOfPrimaryFlow");
		addEEnumLiteral(directionOfPrimaryFlowEEnum, DirectionOfPrimaryFlow.CLIENT);
		addEEnumLiteral(directionOfPrimaryFlowEEnum, DirectionOfPrimaryFlow.EQUAL);
		addEEnumLiteral(directionOfPrimaryFlowEEnum, DirectionOfPrimaryFlow.SUPPLIER);

		initEEnum(directionTypeEEnum, DirectionType.class, "DirectionType");
		addEEnumLiteral(directionTypeEEnum, DirectionType.UNI_DIRECTIONAL);
		addEEnumLiteral(directionTypeEEnum, DirectionType.BI_DIRECTIONAL);
	}

} //ConnectionsPackageImpl
