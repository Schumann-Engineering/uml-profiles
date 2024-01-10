/**
 */
package CSMN.Characteristics.Security.impl;

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

import CSMN.Characteristics.Security.CommonPlatformEnumeration;
import CSMN.Characteristics.Security.CommonPlatformEnumerationType;
import CSMN.Characteristics.Security.CpeCharacteristic;
import CSMN.Characteristics.Security.Iec62443FoundationalRequirementType;
import CSMN.Characteristics.Security.Iec62443SecurityLevel;
import CSMN.Characteristics.Security.Iec62443SecurityLevelCharacteristic;
import CSMN.Characteristics.Security.Iec62443SecurityLevelType;
import CSMN.Characteristics.Security.SecurityFactory;
import CSMN.Characteristics.Security.SecurityLevel;
import CSMN.Characteristics.Security.SecurityPackage;

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
public class SecurityPackageImpl extends EPackageImpl implements SecurityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iec62443SecurityLevelCharacteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpeCharacteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonPlatformEnumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum iec62443SecurityLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum iec62443FoundationalRequirementTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum iec62443SecurityLevelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum commonPlatformEnumerationTypeEEnum = null;

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
	 * @see CSMN.Characteristics.Security.SecurityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SecurityPackageImpl() {
		super(eNS_URI, SecurityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SecurityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SecurityPackage init() {
		if (isInited) return (SecurityPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSecurityPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SecurityPackageImpl theSecurityPackage = registeredSecurityPackage instanceof SecurityPackageImpl ? (SecurityPackageImpl)registeredSecurityPackage : new SecurityPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InterfacePackage.eNS_URI);
		InterfacePackageImpl theInterfacePackage = (InterfacePackageImpl)(registeredPackage instanceof InterfacePackageImpl ? registeredPackage : InterfacePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MaterialPackage.eNS_URI);
		MaterialPackageImpl theMaterialPackage = (MaterialPackageImpl)(registeredPackage instanceof MaterialPackageImpl ? registeredPackage : MaterialPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StoragePackage.eNS_URI);
		StoragePackageImpl theStoragePackage = (StoragePackageImpl)(registeredPackage instanceof StoragePackageImpl ? registeredPackage : StoragePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI);
		PrimitiveTypesPackageImpl thePrimitiveTypesPackage = (PrimitiveTypesPackageImpl)(registeredPackage instanceof PrimitiveTypesPackageImpl ? registeredPackage : PrimitiveTypesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LifecyclePackage.eNS_URI);
		LifecyclePackageImpl theLifecyclePackage = (LifecyclePackageImpl)(registeredPackage instanceof LifecyclePackageImpl ? registeredPackage : LifecyclePackage.eINSTANCE);

		// Create package meta-data objects
		theSecurityPackage.createPackageContents();
		theCSMNPackage.createPackageContents();
		theElementsPackage.createPackageContents();
		theConnectionsPackage.createPackageContents();
		theAssetPackage.createPackageContents();
		theEnergyPackage.createPackageContents();
		theFlowPackage.createPackageContents();
		theInterfacePackage.createPackageContents();
		theMaterialPackage.createPackageContents();
		theStoragePackage.createPackageContents();
		thePrimitiveTypesPackage.createPackageContents();
		theLifecyclePackage.createPackageContents();

		// Initialize created meta-data
		theSecurityPackage.initializePackageContents();
		theCSMNPackage.initializePackageContents();
		theElementsPackage.initializePackageContents();
		theConnectionsPackage.initializePackageContents();
		theAssetPackage.initializePackageContents();
		theEnergyPackage.initializePackageContents();
		theFlowPackage.initializePackageContents();
		theInterfacePackage.initializePackageContents();
		theMaterialPackage.initializePackageContents();
		theStoragePackage.initializePackageContents();
		thePrimitiveTypesPackage.initializePackageContents();
		theLifecyclePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSecurityPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SecurityPackage.eNS_URI, theSecurityPackage);
		return theSecurityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIec62443SecurityLevelCharacteristic() {
		return iec62443SecurityLevelCharacteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIec62443SecurityLevelCharacteristic_Base_NamedElement() {
		return (EReference)iec62443SecurityLevelCharacteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIec62443SecurityLevelCharacteristic_Securitylevel() {
		return (EReference)iec62443SecurityLevelCharacteristicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurityLevel() {
		return securityLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityLevel_FoundationalRequirement() {
		return (EAttribute)securityLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecurityLevel_Level() {
		return (EReference)securityLevelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityLevel_Rational() {
		return (EAttribute)securityLevelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityLevel_Type() {
		return (EAttribute)securityLevelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecurityLevel_Vector() {
		return (EAttribute)securityLevelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCpeCharacteristic() {
		return cpeCharacteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCpeCharacteristic_Base_NamedElement() {
		return (EReference)cpeCharacteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCpeCharacteristic_Cpe() {
		return (EReference)cpeCharacteristicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommonPlatformEnumeration() {
		return commonPlatformEnumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommonPlatformEnumeration_CpeType() {
		return (EAttribute)commonPlatformEnumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommonPlatformEnumeration_VendorName() {
		return (EAttribute)commonPlatformEnumerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommonPlatformEnumeration_ProductName() {
		return (EAttribute)commonPlatformEnumerationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommonPlatformEnumeration_Version() {
		return (EAttribute)commonPlatformEnumerationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIec62443SecurityLevel() {
		return iec62443SecurityLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIec62443FoundationalRequirementType() {
		return iec62443FoundationalRequirementTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIec62443SecurityLevelType() {
		return iec62443SecurityLevelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCommonPlatformEnumerationType() {
		return commonPlatformEnumerationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityFactory getSecurityFactory() {
		return (SecurityFactory)getEFactoryInstance();
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
		iec62443SecurityLevelCharacteristicEClass = createEClass(IEC62443_SECURITY_LEVEL_CHARACTERISTIC);
		createEReference(iec62443SecurityLevelCharacteristicEClass, IEC62443_SECURITY_LEVEL_CHARACTERISTIC__BASE_NAMED_ELEMENT);
		createEReference(iec62443SecurityLevelCharacteristicEClass, IEC62443_SECURITY_LEVEL_CHARACTERISTIC__SECURITYLEVEL);

		securityLevelEClass = createEClass(SECURITY_LEVEL);
		createEAttribute(securityLevelEClass, SECURITY_LEVEL__FOUNDATIONAL_REQUIREMENT);
		createEReference(securityLevelEClass, SECURITY_LEVEL__LEVEL);
		createEAttribute(securityLevelEClass, SECURITY_LEVEL__RATIONAL);
		createEAttribute(securityLevelEClass, SECURITY_LEVEL__TYPE);
		createEAttribute(securityLevelEClass, SECURITY_LEVEL__VECTOR);

		cpeCharacteristicEClass = createEClass(CPE_CHARACTERISTIC);
		createEReference(cpeCharacteristicEClass, CPE_CHARACTERISTIC__BASE_NAMED_ELEMENT);
		createEReference(cpeCharacteristicEClass, CPE_CHARACTERISTIC__CPE);

		commonPlatformEnumerationEClass = createEClass(COMMON_PLATFORM_ENUMERATION);
		createEAttribute(commonPlatformEnumerationEClass, COMMON_PLATFORM_ENUMERATION__CPE_TYPE);
		createEAttribute(commonPlatformEnumerationEClass, COMMON_PLATFORM_ENUMERATION__VENDOR_NAME);
		createEAttribute(commonPlatformEnumerationEClass, COMMON_PLATFORM_ENUMERATION__PRODUCT_NAME);
		createEAttribute(commonPlatformEnumerationEClass, COMMON_PLATFORM_ENUMERATION__VERSION);

		// Create enums
		iec62443SecurityLevelEEnum = createEEnum(IEC62443_SECURITY_LEVEL);
		iec62443FoundationalRequirementTypeEEnum = createEEnum(IEC62443_FOUNDATIONAL_REQUIREMENT_TYPE);
		iec62443SecurityLevelTypeEEnum = createEEnum(IEC62443_SECURITY_LEVEL_TYPE);
		commonPlatformEnumerationTypeEEnum = createEEnum(COMMON_PLATFORM_ENUMERATION_TYPE);
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
		initEClass(iec62443SecurityLevelCharacteristicEClass, Iec62443SecurityLevelCharacteristic.class, "Iec62443SecurityLevelCharacteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIec62443SecurityLevelCharacteristic_Base_NamedElement(), theUMLPackage.getNamedElement(), null, "base_NamedElement", null, 0, 1, Iec62443SecurityLevelCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIec62443SecurityLevelCharacteristic_Securitylevel(), this.getSecurityLevel(), null, "securitylevel", null, 0, -1, Iec62443SecurityLevelCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(securityLevelEClass, SecurityLevel.class, "SecurityLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityLevel_FoundationalRequirement(), this.getIec62443FoundationalRequirementType(), "foundationalRequirement", null, 1, 1, SecurityLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSecurityLevel_Level(), this.getSecurityLevel(), null, "level", null, 1, 1, SecurityLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSecurityLevel_Rational(), theTypesPackage.getString(), "rational", null, 0, 1, SecurityLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSecurityLevel_Type(), this.getIec62443SecurityLevelType(), "type", null, 1, 1, SecurityLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSecurityLevel_Vector(), theTypesPackage.getString(), "vector", null, 1, 1, SecurityLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cpeCharacteristicEClass, CpeCharacteristic.class, "CpeCharacteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCpeCharacteristic_Base_NamedElement(), theUMLPackage.getNamedElement(), null, "base_NamedElement", null, 0, 1, CpeCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCpeCharacteristic_Cpe(), this.getCommonPlatformEnumeration(), null, "cpe", null, 1, -1, CpeCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(commonPlatformEnumerationEClass, CommonPlatformEnumeration.class, "CommonPlatformEnumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommonPlatformEnumeration_CpeType(), this.getCommonPlatformEnumerationType(), "cpeType", "Unspecified", 1, 1, CommonPlatformEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCommonPlatformEnumeration_VendorName(), theTypesPackage.getString(), "vendorName", null, 1, 1, CommonPlatformEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCommonPlatformEnumeration_ProductName(), theTypesPackage.getString(), "productName", null, 1, 1, CommonPlatformEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCommonPlatformEnumeration_Version(), theTypesPackage.getString(), "version", null, 0, 1, CommonPlatformEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(iec62443SecurityLevelEEnum, Iec62443SecurityLevel.class, "Iec62443SecurityLevel");
		addEEnumLiteral(iec62443SecurityLevelEEnum, Iec62443SecurityLevel.UNKNOWN);
		addEEnumLiteral(iec62443SecurityLevelEEnum, Iec62443SecurityLevel.NOT_APPLICABLE);
		addEEnumLiteral(iec62443SecurityLevelEEnum, Iec62443SecurityLevel.LEVEL0);
		addEEnumLiteral(iec62443SecurityLevelEEnum, Iec62443SecurityLevel.LEVEL1);
		addEEnumLiteral(iec62443SecurityLevelEEnum, Iec62443SecurityLevel.LEVEL2);
		addEEnumLiteral(iec62443SecurityLevelEEnum, Iec62443SecurityLevel.LEVEL3);
		addEEnumLiteral(iec62443SecurityLevelEEnum, Iec62443SecurityLevel.LEVEL4);

		initEEnum(iec62443FoundationalRequirementTypeEEnum, Iec62443FoundationalRequirementType.class, "Iec62443FoundationalRequirementType");
		addEEnumLiteral(iec62443FoundationalRequirementTypeEEnum, Iec62443FoundationalRequirementType.IAC);
		addEEnumLiteral(iec62443FoundationalRequirementTypeEEnum, Iec62443FoundationalRequirementType.UC);
		addEEnumLiteral(iec62443FoundationalRequirementTypeEEnum, Iec62443FoundationalRequirementType.SI);
		addEEnumLiteral(iec62443FoundationalRequirementTypeEEnum, Iec62443FoundationalRequirementType.DC);
		addEEnumLiteral(iec62443FoundationalRequirementTypeEEnum, Iec62443FoundationalRequirementType.RDF);
		addEEnumLiteral(iec62443FoundationalRequirementTypeEEnum, Iec62443FoundationalRequirementType.TRE);
		addEEnumLiteral(iec62443FoundationalRequirementTypeEEnum, Iec62443FoundationalRequirementType.RA);

		initEEnum(iec62443SecurityLevelTypeEEnum, Iec62443SecurityLevelType.class, "Iec62443SecurityLevelType");
		addEEnumLiteral(iec62443SecurityLevelTypeEEnum, Iec62443SecurityLevelType.CAPABILITY);
		addEEnumLiteral(iec62443SecurityLevelTypeEEnum, Iec62443SecurityLevelType.TARGET);
		addEEnumLiteral(iec62443SecurityLevelTypeEEnum, Iec62443SecurityLevelType.ACHIEVED);

		initEEnum(commonPlatformEnumerationTypeEEnum, CommonPlatformEnumerationType.class, "CommonPlatformEnumerationType");
		addEEnumLiteral(commonPlatformEnumerationTypeEEnum, CommonPlatformEnumerationType.UNSPECIFIED);
		addEEnumLiteral(commonPlatformEnumerationTypeEEnum, CommonPlatformEnumerationType.APPLICATION);
		addEEnumLiteral(commonPlatformEnumerationTypeEEnum, CommonPlatformEnumerationType.FIRMWARE);
		addEEnumLiteral(commonPlatformEnumerationTypeEEnum, CommonPlatformEnumerationType.HARDWARE);
		addEEnumLiteral(commonPlatformEnumerationTypeEEnum, CommonPlatformEnumerationType.OPERATING_SYSTEM);
	}

} //SecurityPackageImpl
