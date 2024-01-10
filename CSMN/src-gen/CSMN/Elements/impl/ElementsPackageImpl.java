/**
 */
package CSMN.Elements.impl;

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

import CSMN.Connections.ConnectionsPackage;

import CSMN.Connections.impl.ConnectionsPackageImpl;

import CSMN.Elements.Box;
import CSMN.Elements.ElementsFactory;
import CSMN.Elements.ElementsPackage;
import CSMN.Elements.EnvironmentElement;
import CSMN.Elements.EnvironmentLibrary;
import CSMN.Elements.SecurityZone;
import CSMN.Elements.SystemElement;
import CSMN.Elements.User;
import CSMN.Elements.UserType;

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
public class ElementsPackageImpl extends EPackageImpl implements ElementsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityZoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum userTypeEEnum = null;

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
	 * @see CSMN.Elements.ElementsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ElementsPackageImpl() {
		super(eNS_URI, ElementsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ElementsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ElementsPackage init() {
		if (isInited) return (ElementsPackage)EPackage.Registry.INSTANCE.getEPackage(ElementsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredElementsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ElementsPackageImpl theElementsPackage = registeredElementsPackage instanceof ElementsPackageImpl ? (ElementsPackageImpl)registeredElementsPackage : new ElementsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CSMNPackage.eNS_URI);
		CSMNPackageImpl theCSMNPackage = (CSMNPackageImpl)(registeredPackage instanceof CSMNPackageImpl ? registeredPackage : CSMNPackage.eINSTANCE);
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);
		SecurityPackageImpl theSecurityPackage = (SecurityPackageImpl)(registeredPackage instanceof SecurityPackageImpl ? registeredPackage : SecurityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StoragePackage.eNS_URI);
		StoragePackageImpl theStoragePackage = (StoragePackageImpl)(registeredPackage instanceof StoragePackageImpl ? registeredPackage : StoragePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI);
		PrimitiveTypesPackageImpl thePrimitiveTypesPackage = (PrimitiveTypesPackageImpl)(registeredPackage instanceof PrimitiveTypesPackageImpl ? registeredPackage : PrimitiveTypesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LifecyclePackage.eNS_URI);
		LifecyclePackageImpl theLifecyclePackage = (LifecyclePackageImpl)(registeredPackage instanceof LifecyclePackageImpl ? registeredPackage : LifecyclePackage.eINSTANCE);

		// Create package meta-data objects
		theElementsPackage.createPackageContents();
		theCSMNPackage.createPackageContents();
		theConnectionsPackage.createPackageContents();
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
		theElementsPackage.initializePackageContents();
		theCSMNPackage.initializePackageContents();
		theConnectionsPackage.initializePackageContents();
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
		theElementsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ElementsPackage.eNS_URI, theElementsPackage);
		return theElementsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemElement() {
		return systemElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemElement_Base_Component() {
		return (EReference)systemElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_Base_Component() {
		return (EReference)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_UserType() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_UseFilledIcon() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_Base_Actor() {
		return (EReference)userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvironmentElement() {
		return environmentElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvironmentElement_Base_Component() {
		return (EReference)environmentElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecurityZone() {
		return securityZoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecurityZone_Base_Package() {
		return (EReference)securityZoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSecurityZone_Base_Component() {
		return (EReference)securityZoneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBox() {
		return boxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBox_Base_Comment() {
		return (EReference)boxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBox_Base_Package() {
		return (EReference)boxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvironmentLibrary() {
		return environmentLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvironmentLibrary_Base_Package() {
		return (EReference)environmentLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUserType() {
		return userTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementsFactory getElementsFactory() {
		return (ElementsFactory)getEFactoryInstance();
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
		systemElementEClass = createEClass(SYSTEM_ELEMENT);
		createEReference(systemElementEClass, SYSTEM_ELEMENT__BASE_COMPONENT);

		userEClass = createEClass(USER);
		createEReference(userEClass, USER__BASE_COMPONENT);
		createEAttribute(userEClass, USER__USER_TYPE);
		createEAttribute(userEClass, USER__USE_FILLED_ICON);
		createEReference(userEClass, USER__BASE_ACTOR);

		environmentElementEClass = createEClass(ENVIRONMENT_ELEMENT);
		createEReference(environmentElementEClass, ENVIRONMENT_ELEMENT__BASE_COMPONENT);

		securityZoneEClass = createEClass(SECURITY_ZONE);
		createEReference(securityZoneEClass, SECURITY_ZONE__BASE_PACKAGE);
		createEReference(securityZoneEClass, SECURITY_ZONE__BASE_COMPONENT);

		boxEClass = createEClass(BOX);
		createEReference(boxEClass, BOX__BASE_COMMENT);
		createEReference(boxEClass, BOX__BASE_PACKAGE);

		environmentLibraryEClass = createEClass(ENVIRONMENT_LIBRARY);
		createEReference(environmentLibraryEClass, ENVIRONMENT_LIBRARY__BASE_PACKAGE);

		// Create enums
		userTypeEEnum = createEEnum(USER_TYPE);
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
		initEClass(systemElementEClass, SystemElement.class, "SystemElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemElement_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 0, 1, SystemElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUser_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUser_UserType(), this.getUserType(), "userType", "Generic", 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUser_UseFilledIcon(), theTypesPackage.getBoolean(), "useFilledIcon", "false", 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUser_Base_Actor(), theUMLPackage.getActor(), null, "base_Actor", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(environmentElementEClass, EnvironmentElement.class, "EnvironmentElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnvironmentElement_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 0, 1, EnvironmentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(securityZoneEClass, SecurityZone.class, "SecurityZone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecurityZone_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, SecurityZone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSecurityZone_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 0, 1, SecurityZone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(boxEClass, Box.class, "Box", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBox_Base_Comment(), theUMLPackage.getComment(), null, "base_Comment", null, 0, 1, Box.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBox_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, Box.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(environmentLibraryEClass, EnvironmentLibrary.class, "EnvironmentLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnvironmentLibrary_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 1, 1, EnvironmentLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(userTypeEEnum, UserType.class, "UserType");
		addEEnumLiteral(userTypeEEnum, UserType.GENERIC);
		addEEnumLiteral(userTypeEEnum, UserType.ADMINISTRATOR);
		addEEnumLiteral(userTypeEEnum, UserType.ATTACKER);
		addEEnumLiteral(userTypeEEnum, UserType.AUDITOR);
		addEEnumLiteral(userTypeEEnum, UserType.AUTHORITY);
		addEEnumLiteral(userTypeEEnum, UserType.ETHICAL_HACKER);
		addEEnumLiteral(userTypeEEnum, UserType.OPERATOR);
		addEEnumLiteral(userTypeEEnum, UserType.OPERATOR_EDUCATED);
		addEEnumLiteral(userTypeEEnum, UserType.OWNER);
		addEEnumLiteral(userTypeEEnum, UserType.PATIENT);
		addEEnumLiteral(userTypeEEnum, UserType.SERVICE);
		addEEnumLiteral(userTypeEEnum, UserType.UNKNOWN);
		addEEnumLiteral(userTypeEEnum, UserType.VENDOR);
	}

} //ElementsPackageImpl
