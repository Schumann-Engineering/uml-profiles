/**
 */
package CSMN.Characteristics.Interface.impl;

import CSMN.CSMNPackage;

import CSMN.Characteristics.Asset.AssetPackage;

import CSMN.Characteristics.Asset.impl.AssetPackageImpl;

import CSMN.Characteristics.Energy.EnergyPackage;

import CSMN.Characteristics.Energy.impl.EnergyPackageImpl;

import CSMN.Characteristics.Flow.FlowPackage;

import CSMN.Characteristics.Flow.impl.FlowPackageImpl;

import CSMN.Characteristics.Interface.BandwidthCharacteristics;
import CSMN.Characteristics.Interface.FirewallCharacteristic;
import CSMN.Characteristics.Interface.InterfaceCharacteristic;
import CSMN.Characteristics.Interface.InterfaceFactory;
import CSMN.Characteristics.Interface.InterfacePackage;
import CSMN.Characteristics.Interface.InterfaceType;

import CSMN.Characteristics.Material.MaterialPackage;

import CSMN.Characteristics.Material.impl.MaterialPackageImpl;

import CSMN.Characteristics.Security.SecurityPackage;

import CSMN.Characteristics.Security.impl.SecurityPackageImpl;

import CSMN.Characteristics.Storage.StoragePackage;

import CSMN.Characteristics.Storage.impl.StoragePackageImpl;

import CSMN.Connections.ConnectionsPackage;

import CSMN.Connections.impl.ConnectionsPackageImpl;

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
public class InterfacePackageImpl extends EPackageImpl implements InterfacePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceCharacteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bandwidthCharacteristicsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firewallCharacteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interfaceTypeEEnum = null;

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
	 * @see CSMN.Characteristics.Interface.InterfacePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InterfacePackageImpl() {
		super(eNS_URI, InterfaceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InterfacePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InterfacePackage init() {
		if (isInited) return (InterfacePackage)EPackage.Registry.INSTANCE.getEPackage(InterfacePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredInterfacePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		InterfacePackageImpl theInterfacePackage = registeredInterfacePackage instanceof InterfacePackageImpl ? (InterfacePackageImpl)registeredInterfacePackage : new InterfacePackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConnectionsPackage.eNS_URI);
		ConnectionsPackageImpl theConnectionsPackage = (ConnectionsPackageImpl)(registeredPackage instanceof ConnectionsPackageImpl ? registeredPackage : ConnectionsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AssetPackage.eNS_URI);
		AssetPackageImpl theAssetPackage = (AssetPackageImpl)(registeredPackage instanceof AssetPackageImpl ? registeredPackage : AssetPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EnergyPackage.eNS_URI);
		EnergyPackageImpl theEnergyPackage = (EnergyPackageImpl)(registeredPackage instanceof EnergyPackageImpl ? registeredPackage : EnergyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FlowPackage.eNS_URI);
		FlowPackageImpl theFlowPackage = (FlowPackageImpl)(registeredPackage instanceof FlowPackageImpl ? registeredPackage : FlowPackage.eINSTANCE);
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
		theInterfacePackage.createPackageContents();
		theCSMNPackage.createPackageContents();
		theElementsPackage.createPackageContents();
		theConnectionsPackage.createPackageContents();
		theAssetPackage.createPackageContents();
		theEnergyPackage.createPackageContents();
		theFlowPackage.createPackageContents();
		theMaterialPackage.createPackageContents();
		theSecurityPackage.createPackageContents();
		theStoragePackage.createPackageContents();
		thePrimitiveTypesPackage.createPackageContents();
		theLifecyclePackage.createPackageContents();

		// Initialize created meta-data
		theInterfacePackage.initializePackageContents();
		theCSMNPackage.initializePackageContents();
		theElementsPackage.initializePackageContents();
		theConnectionsPackage.initializePackageContents();
		theAssetPackage.initializePackageContents();
		theEnergyPackage.initializePackageContents();
		theFlowPackage.initializePackageContents();
		theMaterialPackage.initializePackageContents();
		theSecurityPackage.initializePackageContents();
		theStoragePackage.initializePackageContents();
		thePrimitiveTypesPackage.initializePackageContents();
		theLifecyclePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInterfacePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InterfacePackage.eNS_URI, theInterfacePackage);
		return theInterfacePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaceCharacteristic() {
		return interfaceCharacteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceCharacteristic_Base_Port() {
		return (EReference)interfaceCharacteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceCharacteristic_InterfaceType() {
		return (EAttribute)interfaceCharacteristicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceCharacteristic_Purpose() {
		return (EAttribute)interfaceCharacteristicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBandwidthCharacteristics() {
		return bandwidthCharacteristicsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBandwidthCharacteristics_Base_Relationship() {
		return (EReference)bandwidthCharacteristicsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBandwidthCharacteristics_Base_Port() {
		return (EReference)bandwidthCharacteristicsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBandwidthCharacteristics_Bandwidth() {
		return (EReference)bandwidthCharacteristicsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFirewallCharacteristic() {
		return firewallCharacteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFirewallCharacteristic_Base_Port() {
		return (EReference)firewallCharacteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getInterfaceType() {
		return interfaceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceFactory getInterfaceFactory() {
		return (InterfaceFactory)getEFactoryInstance();
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
		interfaceCharacteristicEClass = createEClass(INTERFACE_CHARACTERISTIC);
		createEReference(interfaceCharacteristicEClass, INTERFACE_CHARACTERISTIC__BASE_PORT);
		createEAttribute(interfaceCharacteristicEClass, INTERFACE_CHARACTERISTIC__INTERFACE_TYPE);
		createEAttribute(interfaceCharacteristicEClass, INTERFACE_CHARACTERISTIC__PURPOSE);

		bandwidthCharacteristicsEClass = createEClass(BANDWIDTH_CHARACTERISTICS);
		createEReference(bandwidthCharacteristicsEClass, BANDWIDTH_CHARACTERISTICS__BASE_RELATIONSHIP);
		createEReference(bandwidthCharacteristicsEClass, BANDWIDTH_CHARACTERISTICS__BASE_PORT);
		createEReference(bandwidthCharacteristicsEClass, BANDWIDTH_CHARACTERISTICS__BANDWIDTH);

		firewallCharacteristicEClass = createEClass(FIREWALL_CHARACTERISTIC);
		createEReference(firewallCharacteristicEClass, FIREWALL_CHARACTERISTIC__BASE_PORT);

		// Create enums
		interfaceTypeEEnum = createEEnum(INTERFACE_TYPE);
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
		PrimitiveTypesPackage thePrimitiveTypesPackage = (PrimitiveTypesPackage)EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(interfaceCharacteristicEClass, InterfaceCharacteristic.class, "InterfaceCharacteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceCharacteristic_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 0, 1, InterfaceCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceCharacteristic_InterfaceType(), this.getInterfaceType(), "interfaceType", "Unspecified", 1, 1, InterfaceCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceCharacteristic_Purpose(), theTypesPackage.getString(), "purpose", null, 1, 1, InterfaceCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bandwidthCharacteristicsEClass, BandwidthCharacteristics.class, "BandwidthCharacteristics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBandwidthCharacteristics_Base_Relationship(), theUMLPackage.getRelationship(), null, "base_Relationship", null, 0, 1, BandwidthCharacteristics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBandwidthCharacteristics_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 0, 1, BandwidthCharacteristics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBandwidthCharacteristics_Bandwidth(), thePrimitiveTypesPackage.getBandwidth(), null, "bandwidth", null, 1, 1, BandwidthCharacteristics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(firewallCharacteristicEClass, FirewallCharacteristic.class, "FirewallCharacteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFirewallCharacteristic_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 0, 1, FirewallCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(interfaceTypeEEnum, InterfaceType.class, "InterfaceType");
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.UNSPECIFIED);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.AIR_BY_FAN);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.AIR_BY_TURBINE);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.ALARM);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.BLUETOOTH);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.CELLULAR);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.CELLULAR2_G);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.CELLULAR3_G);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.CELLULAR4_G);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.CELLULAR5_G);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.DISPLAY);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.DISPLAY_SMALL);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.ETHERNET);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.HARDWIRED);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.HDMI);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.KNOB);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.NFC);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.OPTICAL);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.PROPRIETARY);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.POWER_BATTERY);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.POWER_PLUG);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.POWER_SOCKET);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.SD_CARD);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.SERIAL);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.SPEAKER);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.TOUCH);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.USB);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.USB_A);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.USB_C);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.USB_FLASH);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.WIFI_ACCESS_POINT);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.WIFI_CLIENT);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.ZIGBEE);
	}

} //InterfacePackageImpl
