/**
 */
package CSMN.impl;

import CSMN.CSMNFactory;
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

import CSMN.Elements.ElementsPackage;

import CSMN.Elements.impl.ElementsPackageImpl;

import CSMN.Lifecycle.LifecyclePackage;

import CSMN.Lifecycle.impl.LifecyclePackageImpl;

import CSMN.PrimitiveTypes.PrimitiveTypesPackage;

import CSMN.PrimitiveTypes.impl.PrimitiveTypesPackageImpl;

import CSMN.PseudoElement;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
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
public class CSMNPackageImpl extends EPackageImpl implements CSMNPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pseudoElementEClass = null;

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
	 * @see CSMN.CSMNPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CSMNPackageImpl() {
		super(eNS_URI, CSMNFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CSMNPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CSMNPackage init() {
		if (isInited) return (CSMNPackage)EPackage.Registry.INSTANCE.getEPackage(CSMNPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCSMNPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CSMNPackageImpl theCSMNPackage = registeredCSMNPackage instanceof CSMNPackageImpl ? (CSMNPackageImpl)registeredCSMNPackage : new CSMNPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ElementsPackage.eNS_URI);
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);
		SecurityPackageImpl theSecurityPackage = (SecurityPackageImpl)(registeredPackage instanceof SecurityPackageImpl ? registeredPackage : SecurityPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StoragePackage.eNS_URI);
		StoragePackageImpl theStoragePackage = (StoragePackageImpl)(registeredPackage instanceof StoragePackageImpl ? registeredPackage : StoragePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI);
		PrimitiveTypesPackageImpl thePrimitiveTypesPackage = (PrimitiveTypesPackageImpl)(registeredPackage instanceof PrimitiveTypesPackageImpl ? registeredPackage : PrimitiveTypesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LifecyclePackage.eNS_URI);
		LifecyclePackageImpl theLifecyclePackage = (LifecyclePackageImpl)(registeredPackage instanceof LifecyclePackageImpl ? registeredPackage : LifecyclePackage.eINSTANCE);

		// Create package meta-data objects
		theCSMNPackage.createPackageContents();
		theElementsPackage.createPackageContents();
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
		theCSMNPackage.initializePackageContents();
		theElementsPackage.initializePackageContents();
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
		theCSMNPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CSMNPackage.eNS_URI, theCSMNPackage);
		return theCSMNPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPseudoElement() {
		return pseudoElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CSMNFactory getCSMNFactory() {
		return (CSMNFactory)getEFactoryInstance();
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
		pseudoElementEClass = createEClass(PSEUDO_ELEMENT);
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
		ElementsPackage theElementsPackage = (ElementsPackage)EPackage.Registry.INSTANCE.getEPackage(ElementsPackage.eNS_URI);
		ConnectionsPackage theConnectionsPackage = (ConnectionsPackage)EPackage.Registry.INSTANCE.getEPackage(ConnectionsPackage.eNS_URI);
		AssetPackage theAssetPackage = (AssetPackage)EPackage.Registry.INSTANCE.getEPackage(AssetPackage.eNS_URI);
		EnergyPackage theEnergyPackage = (EnergyPackage)EPackage.Registry.INSTANCE.getEPackage(EnergyPackage.eNS_URI);
		FlowPackage theFlowPackage = (FlowPackage)EPackage.Registry.INSTANCE.getEPackage(FlowPackage.eNS_URI);
		InterfacePackage theInterfacePackage = (InterfacePackage)EPackage.Registry.INSTANCE.getEPackage(InterfacePackage.eNS_URI);
		MaterialPackage theMaterialPackage = (MaterialPackage)EPackage.Registry.INSTANCE.getEPackage(MaterialPackage.eNS_URI);
		SecurityPackage theSecurityPackage = (SecurityPackage)EPackage.Registry.INSTANCE.getEPackage(SecurityPackage.eNS_URI);
		StoragePackage theStoragePackage = (StoragePackage)EPackage.Registry.INSTANCE.getEPackage(StoragePackage.eNS_URI);
		PrimitiveTypesPackage thePrimitiveTypesPackage = (PrimitiveTypesPackage)EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI);
		LifecyclePackage theLifecyclePackage = (LifecyclePackage)EPackage.Registry.INSTANCE.getEPackage(LifecyclePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theElementsPackage);
		getESubpackages().add(theConnectionsPackage);
		getESubpackages().add(theAssetPackage);
		getESubpackages().add(theEnergyPackage);
		getESubpackages().add(theFlowPackage);
		getESubpackages().add(theInterfacePackage);
		getESubpackages().add(theMaterialPackage);
		getESubpackages().add(theSecurityPackage);
		getESubpackages().add(theStoragePackage);
		getESubpackages().add(thePrimitiveTypesPackage);
		getESubpackages().add(theLifecyclePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(pseudoElementEClass, PseudoElement.class, "PseudoElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CSMNPackageImpl
