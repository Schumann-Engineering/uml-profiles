/**
 */
package engineering.schumann.uml.profile.csmn.impl;

import engineering.schumann.uml.profile.csmn.AccessCharacteristic;
import engineering.schumann.uml.profile.csmn.Asset;
import engineering.schumann.uml.profile.csmn.AssetCategory;
import engineering.schumann.uml.profile.csmn.AssetFlightLevel;
import engineering.schumann.uml.profile.csmn.AssetLibrary;
import engineering.schumann.uml.profile.csmn.AssetType;
import engineering.schumann.uml.profile.csmn.Bandwidth;
import engineering.schumann.uml.profile.csmn.BandwidthCharacteristic;
import engineering.schumann.uml.profile.csmn.Box;
import engineering.schumann.uml.profile.csmn.CSMNFactory;
import engineering.schumann.uml.profile.csmn.CSMNPackage;
import engineering.schumann.uml.profile.csmn.CommonPlatformEnumeration;
import engineering.schumann.uml.profile.csmn.CommonPlatformEnumerationType;
import engineering.schumann.uml.profile.csmn.Connection;
import engineering.schumann.uml.profile.csmn.ConnectionType;
import engineering.schumann.uml.profile.csmn.CpeCharacteristic;
import engineering.schumann.uml.profile.csmn.DirectionOfPrimaryFlow;
import engineering.schumann.uml.profile.csmn.DirectionType;
import engineering.schumann.uml.profile.csmn.EnergyCharacteristic;
import engineering.schumann.uml.profile.csmn.EnergyType;
import engineering.schumann.uml.profile.csmn.EnvironmentElement;
import engineering.schumann.uml.profile.csmn.EnvironmentLibrary;
import engineering.schumann.uml.profile.csmn.FirewallCharacteristic;
import engineering.schumann.uml.profile.csmn.FlowCharacteristic;
import engineering.schumann.uml.profile.csmn.FunctionalAccessLevel;
import engineering.schumann.uml.profile.csmn.Iec62443FoundationalRequirementType;
import engineering.schumann.uml.profile.csmn.Iec62443SecurityLevel;
import engineering.schumann.uml.profile.csmn.Iec62443SecurityLevelCharacteristic;
import engineering.schumann.uml.profile.csmn.Iec62443SecurityLevelType;
import engineering.schumann.uml.profile.csmn.InterfaceCharacteristic;
import engineering.schumann.uml.profile.csmn.InterfaceConnector;
import engineering.schumann.uml.profile.csmn.InterfaceType;
import engineering.schumann.uml.profile.csmn.MaterialCharacteristic;
import engineering.schumann.uml.profile.csmn.MechanicalAccessLevel;
import engineering.schumann.uml.profile.csmn.OsiCharacteristic;
import engineering.schumann.uml.profile.csmn.Product;
import engineering.schumann.uml.profile.csmn.ProductConstraint;
import engineering.schumann.uml.profile.csmn.ProtectionGoal;
import engineering.schumann.uml.profile.csmn.Scope;
import engineering.schumann.uml.profile.csmn.ScopeConstraint;
import engineering.schumann.uml.profile.csmn.ScopeConstraintType;
import engineering.schumann.uml.profile.csmn.SecurityLevel;
import engineering.schumann.uml.profile.csmn.SecurityZone;
import engineering.schumann.uml.profile.csmn.SizeUnitOfMeasure;
import engineering.schumann.uml.profile.csmn.Size_T;
import engineering.schumann.uml.profile.csmn.SoftwareConstraint;
import engineering.schumann.uml.profile.csmn.SpeedUnitOfMeasurement;
import engineering.schumann.uml.profile.csmn.StorageCharacteristic;
import engineering.schumann.uml.profile.csmn.StorageType;
import engineering.schumann.uml.profile.csmn.SystemElement;
import engineering.schumann.uml.profile.csmn.TcpCharacteristic;
import engineering.schumann.uml.profile.csmn.UsageCharacteristic;
import engineering.schumann.uml.profile.csmn.UsageType;
import engineering.schumann.uml.profile.csmn.User;
import engineering.schumann.uml.profile.csmn.UserType;

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
public class CSMNPackageImpl extends EPackageImpl implements CSMNPackage {
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
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass size_TEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bandwidthEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

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
	private EClass scopeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energyCharacteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osiCharacteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowCharacteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcpCharacteristicEClass = null;

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
	private EClass bandwidthCharacteristicEClass = null;

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
	private EClass materialCharacteristicEClass = null;

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
	private EClass storageCharacteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessCharacteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usageCharacteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum userTypeEEnum = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sizeUnitOfMeasureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum speedUnitOfMeasurementEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum commonPlatformEnumerationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scopeConstraintTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assetTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assetFlightLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assetCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum protectionGoalEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum strideEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum energyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interfaceConnectorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interfaceTypeEEnum = null;

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
	private EEnum storageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum functionalAccessLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mechanicalAccessLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum usageTypeEEnum = null;

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
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#eNS_URI
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

		// Create package meta-data objects
		theCSMNPackage.createPackageContents();

		// Initialize created meta-data
		theCSMNPackage.initializePackageContents();

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
	public EAttribute getSystemElement_PlatformType() {
		return (EAttribute)systemElementEClass.getEStructuralFeatures().get(1);
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
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_Base_Dependency() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnection_ConnectionType() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnection_DirectionPrimary() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnection_DirectionType() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_FlowToClient() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_FlowToSupplier() {
		return (EReference)connectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnection_IsRealTime() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnection_Purpose() {
		return (EAttribute)connectionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSize_T() {
		return size_TEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSize_T_Size() {
		return (EAttribute)size_TEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSize_T_Unit() {
		return (EAttribute)size_TEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBandwidth() {
		return bandwidthEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBandwidth_Size() {
		return (EAttribute)bandwidthEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBandwidth_Unit() {
		return (EAttribute)bandwidthEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScope() {
		return scopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScope_Base_NamedElement() {
		return (EReference)scopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScope_Product() {
		return (EReference)scopeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_UdiDi() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProduct_UdiDiBase() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getCommonPlatformEnumeration_PlatformType() {
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
	public EAttribute getCommonPlatformEnumeration_Model() {
		return (EAttribute)commonPlatformEnumerationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScopeConstraint() {
		return scopeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScopeConstraint_Base_NamedElement() {
		return (EReference)scopeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScopeConstraint_ProductConstraint() {
		return (EReference)scopeConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScopeConstraint_ConstraintType() {
		return (EAttribute)scopeConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScopeConstraint_SoftwareConstraint() {
		return (EReference)scopeConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductConstraint() {
		return productConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProductConstraint_Model() {
		return (EAttribute)productConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAsset() {
		return assetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsset_AssetType() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsset_FlightLevel() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsset_AssetCategory() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsset_ProtectionGoal() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsset_Stride() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAsset_Base_NamedElement() {
		return (EReference)assetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsset_AssetSpec() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssetLibrary() {
		return assetLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssetLibrary_Base_Package() {
		return (EReference)assetLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssetLibrary_AssetSpec() {
		return (EAttribute)assetLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssetLibrary_AssetType() {
		return (EAttribute)assetLibraryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnergyCharacteristic() {
		return energyCharacteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnergyCharacteristic_Base_Port() {
		return (EReference)energyCharacteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnergyCharacteristic_EnergyType() {
		return (EAttribute)energyCharacteristicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnergyCharacteristic_Base_Dependency() {
		return (EReference)energyCharacteristicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOsiCharacteristic() {
		return osiCharacteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOsiCharacteristic_Application() {
		return (EAttribute)osiCharacteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOsiCharacteristic_Presentation() {
		return (EAttribute)osiCharacteristicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOsiCharacteristic_Session() {
		return (EAttribute)osiCharacteristicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOsiCharacteristic_Transport() {
		return (EAttribute)osiCharacteristicEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOsiCharacteristic_Network() {
		return (EAttribute)osiCharacteristicEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOsiCharacteristic_DataLink() {
		return (EAttribute)osiCharacteristicEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOsiCharacteristic_Physical() {
		return (EAttribute)osiCharacteristicEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlowCharacteristic() {
		return flowCharacteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlowCharacteristic_Base_Dependency() {
		return (EReference)flowCharacteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTcpCharacteristic() {
		return tcpCharacteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTcpCharacteristic_Application() {
		return (EAttribute)tcpCharacteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTcpCharacteristic_Transport() {
		return (EAttribute)tcpCharacteristicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTcpCharacteristic_Network() {
		return (EAttribute)tcpCharacteristicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTcpCharacteristic_DataLink() {
		return (EAttribute)tcpCharacteristicEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTcpCharacteristic_Physical() {
		return (EAttribute)tcpCharacteristicEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getInterfaceCharacteristic_InterfaceConnector() {
		return (EAttribute)interfaceCharacteristicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceCharacteristic_InterfaceType() {
		return (EAttribute)interfaceCharacteristicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceCharacteristic_Purpose() {
		return (EAttribute)interfaceCharacteristicEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBandwidthCharacteristic() {
		return bandwidthCharacteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBandwidthCharacteristic_Base_Port() {
		return (EReference)bandwidthCharacteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBandwidthCharacteristic_Bandwidth() {
		return (EReference)bandwidthCharacteristicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBandwidthCharacteristic_Base_Dependency() {
		return (EReference)bandwidthCharacteristicEClass.getEStructuralFeatures().get(2);
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
	public EClass getMaterialCharacteristic() {
		return materialCharacteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMaterialCharacteristic_Base_Port() {
		return (EReference)materialCharacteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMaterialCharacteristic_MaterialType() {
		return (EReference)materialCharacteristicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMaterialCharacteristic_Base_Dependency() {
		return (EReference)materialCharacteristicEClass.getEStructuralFeatures().get(1);
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
	public EClass getStorageCharacteristic() {
		return storageCharacteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStorageCharacteristic_Base_Component() {
		return (EReference)storageCharacteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStorageCharacteristic_Base_Port() {
		return (EReference)storageCharacteristicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStorageCharacteristic_Encryption() {
		return (EAttribute)storageCharacteristicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStorageCharacteristic_StorageFormat() {
		return (EAttribute)storageCharacteristicEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStorageCharacteristic_StorageType() {
		return (EAttribute)storageCharacteristicEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStorageCharacteristic_StorageName() {
		return (EAttribute)storageCharacteristicEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStorageCharacteristic_TotalSize() {
		return (EReference)storageCharacteristicEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessCharacteristic() {
		return accessCharacteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccessCharacteristic_Base_NamedElement() {
		return (EReference)accessCharacteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessCharacteristic_FunctionalLevel() {
		return (EAttribute)accessCharacteristicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessCharacteristic_FunctionalSpec() {
		return (EAttribute)accessCharacteristicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessCharacteristic_MechanicalLevel() {
		return (EAttribute)accessCharacteristicEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessCharacteristic_MechanicalSpec() {
		return (EAttribute)accessCharacteristicEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUsageCharacteristic() {
		return usageCharacteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsageCharacteristic_Base_NamedElement() {
		return (EReference)usageCharacteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsageCharacteristic_IntendedUserGroup() {
		return (EReference)usageCharacteristicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsageCharacteristic_UsageSpec() {
		return (EAttribute)usageCharacteristicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsageCharacteristic_UsageType() {
		return (EAttribute)usageCharacteristicEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSoftwareConstraint() {
		return softwareConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSoftwareConstraint_SoftwareVersion() {
		return (EAttribute)softwareConstraintEClass.getEStructuralFeatures().get(0);
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
	public EEnum getSizeUnitOfMeasure() {
		return sizeUnitOfMeasureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSpeedUnitOfMeasurement() {
		return speedUnitOfMeasurementEEnum;
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
	public EEnum getScopeConstraintType() {
		return scopeConstraintTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAssetType() {
		return assetTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAssetFlightLevel() {
		return assetFlightLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAssetCategory() {
		return assetCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProtectionGoal() {
		return protectionGoalEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSTRIDE() {
		return strideEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEnergyType() {
		return energyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getInterfaceConnector() {
		return interfaceConnectorEEnum;
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
	public EEnum getStorageType() {
		return storageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFunctionalAccessLevel() {
		return functionalAccessLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMechanicalAccessLevel() {
		return mechanicalAccessLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUsageType() {
		return usageTypeEEnum;
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
		systemElementEClass = createEClass(SYSTEM_ELEMENT);
		createEReference(systemElementEClass, SYSTEM_ELEMENT__BASE_COMPONENT);
		createEAttribute(systemElementEClass, SYSTEM_ELEMENT__PLATFORM_TYPE);

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

		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__BASE_DEPENDENCY);
		createEAttribute(connectionEClass, CONNECTION__CONNECTION_TYPE);
		createEAttribute(connectionEClass, CONNECTION__DIRECTION_PRIMARY);
		createEAttribute(connectionEClass, CONNECTION__DIRECTION_TYPE);
		createEReference(connectionEClass, CONNECTION__FLOW_TO_CLIENT);
		createEReference(connectionEClass, CONNECTION__FLOW_TO_SUPPLIER);
		createEAttribute(connectionEClass, CONNECTION__IS_REAL_TIME);
		createEAttribute(connectionEClass, CONNECTION__PURPOSE);

		size_TEClass = createEClass(SIZE_T);
		createEAttribute(size_TEClass, SIZE_T__SIZE);
		createEAttribute(size_TEClass, SIZE_T__UNIT);

		bandwidthEClass = createEClass(BANDWIDTH);
		createEAttribute(bandwidthEClass, BANDWIDTH__SIZE);
		createEAttribute(bandwidthEClass, BANDWIDTH__UNIT);

		scopeEClass = createEClass(SCOPE);
		createEReference(scopeEClass, SCOPE__BASE_NAMED_ELEMENT);
		createEReference(scopeEClass, SCOPE__PRODUCT);

		productEClass = createEClass(PRODUCT);
		createEAttribute(productEClass, PRODUCT__UDI_DI);
		createEAttribute(productEClass, PRODUCT__UDI_DI_BASE);

		commonPlatformEnumerationEClass = createEClass(COMMON_PLATFORM_ENUMERATION);
		createEAttribute(commonPlatformEnumerationEClass, COMMON_PLATFORM_ENUMERATION__PLATFORM_TYPE);
		createEAttribute(commonPlatformEnumerationEClass, COMMON_PLATFORM_ENUMERATION__VENDOR_NAME);
		createEAttribute(commonPlatformEnumerationEClass, COMMON_PLATFORM_ENUMERATION__PRODUCT_NAME);
		createEAttribute(commonPlatformEnumerationEClass, COMMON_PLATFORM_ENUMERATION__MODEL);

		scopeConstraintEClass = createEClass(SCOPE_CONSTRAINT);
		createEReference(scopeConstraintEClass, SCOPE_CONSTRAINT__BASE_NAMED_ELEMENT);
		createEReference(scopeConstraintEClass, SCOPE_CONSTRAINT__PRODUCT_CONSTRAINT);
		createEAttribute(scopeConstraintEClass, SCOPE_CONSTRAINT__CONSTRAINT_TYPE);
		createEReference(scopeConstraintEClass, SCOPE_CONSTRAINT__SOFTWARE_CONSTRAINT);

		productConstraintEClass = createEClass(PRODUCT_CONSTRAINT);
		createEAttribute(productConstraintEClass, PRODUCT_CONSTRAINT__MODEL);

		softwareConstraintEClass = createEClass(SOFTWARE_CONSTRAINT);
		createEAttribute(softwareConstraintEClass, SOFTWARE_CONSTRAINT__SOFTWARE_VERSION);

		assetEClass = createEClass(ASSET);
		createEReference(assetEClass, ASSET__BASE_NAMED_ELEMENT);
		createEAttribute(assetEClass, ASSET__ASSET_SPEC);
		createEAttribute(assetEClass, ASSET__ASSET_TYPE);
		createEAttribute(assetEClass, ASSET__FLIGHT_LEVEL);
		createEAttribute(assetEClass, ASSET__ASSET_CATEGORY);
		createEAttribute(assetEClass, ASSET__PROTECTION_GOAL);
		createEAttribute(assetEClass, ASSET__STRIDE);

		assetLibraryEClass = createEClass(ASSET_LIBRARY);
		createEReference(assetLibraryEClass, ASSET_LIBRARY__BASE_PACKAGE);
		createEAttribute(assetLibraryEClass, ASSET_LIBRARY__ASSET_SPEC);
		createEAttribute(assetLibraryEClass, ASSET_LIBRARY__ASSET_TYPE);

		energyCharacteristicEClass = createEClass(ENERGY_CHARACTERISTIC);
		createEReference(energyCharacteristicEClass, ENERGY_CHARACTERISTIC__BASE_PORT);
		createEAttribute(energyCharacteristicEClass, ENERGY_CHARACTERISTIC__ENERGY_TYPE);
		createEReference(energyCharacteristicEClass, ENERGY_CHARACTERISTIC__BASE_DEPENDENCY);

		osiCharacteristicEClass = createEClass(OSI_CHARACTERISTIC);
		createEAttribute(osiCharacteristicEClass, OSI_CHARACTERISTIC__APPLICATION);
		createEAttribute(osiCharacteristicEClass, OSI_CHARACTERISTIC__PRESENTATION);
		createEAttribute(osiCharacteristicEClass, OSI_CHARACTERISTIC__SESSION);
		createEAttribute(osiCharacteristicEClass, OSI_CHARACTERISTIC__TRANSPORT);
		createEAttribute(osiCharacteristicEClass, OSI_CHARACTERISTIC__NETWORK);
		createEAttribute(osiCharacteristicEClass, OSI_CHARACTERISTIC__DATA_LINK);
		createEAttribute(osiCharacteristicEClass, OSI_CHARACTERISTIC__PHYSICAL);

		flowCharacteristicEClass = createEClass(FLOW_CHARACTERISTIC);
		createEReference(flowCharacteristicEClass, FLOW_CHARACTERISTIC__BASE_DEPENDENCY);

		tcpCharacteristicEClass = createEClass(TCP_CHARACTERISTIC);
		createEAttribute(tcpCharacteristicEClass, TCP_CHARACTERISTIC__APPLICATION);
		createEAttribute(tcpCharacteristicEClass, TCP_CHARACTERISTIC__TRANSPORT);
		createEAttribute(tcpCharacteristicEClass, TCP_CHARACTERISTIC__NETWORK);
		createEAttribute(tcpCharacteristicEClass, TCP_CHARACTERISTIC__DATA_LINK);
		createEAttribute(tcpCharacteristicEClass, TCP_CHARACTERISTIC__PHYSICAL);

		interfaceCharacteristicEClass = createEClass(INTERFACE_CHARACTERISTIC);
		createEReference(interfaceCharacteristicEClass, INTERFACE_CHARACTERISTIC__BASE_PORT);
		createEAttribute(interfaceCharacteristicEClass, INTERFACE_CHARACTERISTIC__INTERFACE_CONNECTOR);
		createEAttribute(interfaceCharacteristicEClass, INTERFACE_CHARACTERISTIC__INTERFACE_TYPE);
		createEAttribute(interfaceCharacteristicEClass, INTERFACE_CHARACTERISTIC__PURPOSE);

		bandwidthCharacteristicEClass = createEClass(BANDWIDTH_CHARACTERISTIC);
		createEReference(bandwidthCharacteristicEClass, BANDWIDTH_CHARACTERISTIC__BASE_PORT);
		createEReference(bandwidthCharacteristicEClass, BANDWIDTH_CHARACTERISTIC__BANDWIDTH);
		createEReference(bandwidthCharacteristicEClass, BANDWIDTH_CHARACTERISTIC__BASE_DEPENDENCY);

		firewallCharacteristicEClass = createEClass(FIREWALL_CHARACTERISTIC);
		createEReference(firewallCharacteristicEClass, FIREWALL_CHARACTERISTIC__BASE_PORT);

		materialCharacteristicEClass = createEClass(MATERIAL_CHARACTERISTIC);
		createEReference(materialCharacteristicEClass, MATERIAL_CHARACTERISTIC__BASE_PORT);
		createEReference(materialCharacteristicEClass, MATERIAL_CHARACTERISTIC__BASE_DEPENDENCY);
		createEReference(materialCharacteristicEClass, MATERIAL_CHARACTERISTIC__MATERIAL_TYPE);

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

		storageCharacteristicEClass = createEClass(STORAGE_CHARACTERISTIC);
		createEReference(storageCharacteristicEClass, STORAGE_CHARACTERISTIC__BASE_COMPONENT);
		createEReference(storageCharacteristicEClass, STORAGE_CHARACTERISTIC__BASE_PORT);
		createEAttribute(storageCharacteristicEClass, STORAGE_CHARACTERISTIC__ENCRYPTION);
		createEAttribute(storageCharacteristicEClass, STORAGE_CHARACTERISTIC__STORAGE_FORMAT);
		createEAttribute(storageCharacteristicEClass, STORAGE_CHARACTERISTIC__STORAGE_TYPE);
		createEAttribute(storageCharacteristicEClass, STORAGE_CHARACTERISTIC__STORAGE_NAME);
		createEReference(storageCharacteristicEClass, STORAGE_CHARACTERISTIC__TOTAL_SIZE);

		accessCharacteristicEClass = createEClass(ACCESS_CHARACTERISTIC);
		createEReference(accessCharacteristicEClass, ACCESS_CHARACTERISTIC__BASE_NAMED_ELEMENT);
		createEAttribute(accessCharacteristicEClass, ACCESS_CHARACTERISTIC__FUNCTIONAL_LEVEL);
		createEAttribute(accessCharacteristicEClass, ACCESS_CHARACTERISTIC__FUNCTIONAL_SPEC);
		createEAttribute(accessCharacteristicEClass, ACCESS_CHARACTERISTIC__MECHANICAL_LEVEL);
		createEAttribute(accessCharacteristicEClass, ACCESS_CHARACTERISTIC__MECHANICAL_SPEC);

		usageCharacteristicEClass = createEClass(USAGE_CHARACTERISTIC);
		createEReference(usageCharacteristicEClass, USAGE_CHARACTERISTIC__BASE_NAMED_ELEMENT);
		createEReference(usageCharacteristicEClass, USAGE_CHARACTERISTIC__INTENDED_USER_GROUP);
		createEAttribute(usageCharacteristicEClass, USAGE_CHARACTERISTIC__USAGE_SPEC);
		createEAttribute(usageCharacteristicEClass, USAGE_CHARACTERISTIC__USAGE_TYPE);

		// Create enums
		commonPlatformEnumerationTypeEEnum = createEEnum(COMMON_PLATFORM_ENUMERATION_TYPE);
		userTypeEEnum = createEEnum(USER_TYPE);
		connectionTypeEEnum = createEEnum(CONNECTION_TYPE);
		directionOfPrimaryFlowEEnum = createEEnum(DIRECTION_OF_PRIMARY_FLOW);
		directionTypeEEnum = createEEnum(DIRECTION_TYPE);
		sizeUnitOfMeasureEEnum = createEEnum(SIZE_UNIT_OF_MEASURE);
		speedUnitOfMeasurementEEnum = createEEnum(SPEED_UNIT_OF_MEASUREMENT);
		scopeConstraintTypeEEnum = createEEnum(SCOPE_CONSTRAINT_TYPE);
		assetTypeEEnum = createEEnum(ASSET_TYPE);
		assetFlightLevelEEnum = createEEnum(ASSET_FLIGHT_LEVEL);
		assetCategoryEEnum = createEEnum(ASSET_CATEGORY);
		protectionGoalEEnum = createEEnum(PROTECTION_GOAL);
		strideEEnum = createEEnum(STRIDE);
		energyTypeEEnum = createEEnum(ENERGY_TYPE);
		interfaceConnectorEEnum = createEEnum(INTERFACE_CONNECTOR);
		interfaceTypeEEnum = createEEnum(INTERFACE_TYPE);
		iec62443SecurityLevelEEnum = createEEnum(IEC62443_SECURITY_LEVEL);
		iec62443FoundationalRequirementTypeEEnum = createEEnum(IEC62443_FOUNDATIONAL_REQUIREMENT_TYPE);
		iec62443SecurityLevelTypeEEnum = createEEnum(IEC62443_SECURITY_LEVEL_TYPE);
		storageTypeEEnum = createEEnum(STORAGE_TYPE);
		functionalAccessLevelEEnum = createEEnum(FUNCTIONAL_ACCESS_LEVEL);
		mechanicalAccessLevelEEnum = createEEnum(MECHANICAL_ACCESS_LEVEL);
		usageTypeEEnum = createEEnum(USAGE_TYPE);
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
		productEClass.getESuperTypes().add(this.getCommonPlatformEnumeration());
		osiCharacteristicEClass.getESuperTypes().add(this.getFlowCharacteristic());
		tcpCharacteristicEClass.getESuperTypes().add(this.getFlowCharacteristic());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemElementEClass, SystemElement.class, "SystemElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemElement_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 0, 1, SystemElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSystemElement_PlatformType(), this.getCommonPlatformEnumerationType(), "platformType", "Hardware", 1, 1, SystemElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUser_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUser_UserType(), this.getUserType(), "userType", "Generic", 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUser_UseFilledIcon(), ecorePackage.getEBoolean(), "useFilledIcon", "false", 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
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

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConnection_ConnectionType(), this.getConnectionType(), "connectionType", "Information", 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConnection_DirectionPrimary(), this.getDirectionOfPrimaryFlow(), "directionPrimary", "Client", 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConnection_DirectionType(), this.getDirectionType(), "directionType", null, 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnection_FlowToClient(), theUMLPackage.getDataType(), null, "flowToClient", null, 0, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnection_FlowToSupplier(), theUMLPackage.getDataType(), null, "flowToSupplier", null, 0, -1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConnection_IsRealTime(), ecorePackage.getEBoolean(), "isRealTime", "false", 1, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConnection_Purpose(), ecorePackage.getEString(), "purpose", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(size_TEClass, Size_T.class, "Size_T", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSize_T_Size(), theTypesPackage.getInteger(), "size", null, 1, 1, Size_T.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSize_T_Unit(), this.getSizeUnitOfMeasure(), "unit", "Megabyte", 1, 1, Size_T.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bandwidthEClass, Bandwidth.class, "Bandwidth", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBandwidth_Size(), ecorePackage.getEInt(), "size", null, 1, 1, Bandwidth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBandwidth_Unit(), this.getSpeedUnitOfMeasurement(), "unit", "Baud", 1, 1, Bandwidth.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(scopeEClass, Scope.class, "Scope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScope_Base_NamedElement(), theUMLPackage.getNamedElement(), null, "base_NamedElement", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getScope_Product(), this.getProduct(), null, "product", null, 1, -1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProduct_UdiDi(), ecorePackage.getEString(), "udiDi", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProduct_UdiDiBase(), ecorePackage.getEString(), "udiDiBase", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(commonPlatformEnumerationEClass, CommonPlatformEnumeration.class, "CommonPlatformEnumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommonPlatformEnumeration_PlatformType(), this.getCommonPlatformEnumerationType(), "platformType", "Unspecified", 1, 1, CommonPlatformEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCommonPlatformEnumeration_VendorName(), ecorePackage.getEString(), "vendorName", null, 1, 1, CommonPlatformEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCommonPlatformEnumeration_ProductName(), ecorePackage.getEString(), "productName", null, 1, 1, CommonPlatformEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCommonPlatformEnumeration_Model(), ecorePackage.getEString(), "model", null, 0, 1, CommonPlatformEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(scopeConstraintEClass, ScopeConstraint.class, "ScopeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScopeConstraint_Base_NamedElement(), theUMLPackage.getNamedElement(), null, "base_NamedElement", null, 0, 1, ScopeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getScopeConstraint_ProductConstraint(), this.getProductConstraint(), null, "productConstraint", null, 0, -1, ScopeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getScopeConstraint_ConstraintType(), this.getScopeConstraintType(), "constraintType", "Added", 1, 1, ScopeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getScopeConstraint_SoftwareConstraint(), this.getSoftwareConstraint(), null, "softwareConstraint", null, 0, -1, ScopeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(productConstraintEClass, ProductConstraint.class, "ProductConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductConstraint_Model(), ecorePackage.getEString(), "model", null, 1, 1, ProductConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(softwareConstraintEClass, SoftwareConstraint.class, "SoftwareConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftwareConstraint_SoftwareVersion(), ecorePackage.getEString(), "softwareVersion", null, 1, 1, SoftwareConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(assetEClass, Asset.class, "Asset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAsset_Base_NamedElement(), theUMLPackage.getNamedElement(), null, "base_NamedElement", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAsset_AssetSpec(), ecorePackage.getEString(), "assetSpec", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAsset_AssetType(), this.getAssetType(), "assetType", null, 1, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAsset_FlightLevel(), this.getAssetFlightLevel(), "flightLevel", null, 1, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAsset_AssetCategory(), this.getAssetCategory(), "assetCategory", null, 1, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAsset_ProtectionGoal(), this.getProtectionGoal(), "protectionGoal", null, 0, -1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAsset_Stride(), this.getSTRIDE(), "stride", null, 0, -1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(assetLibraryEClass, AssetLibrary.class, "AssetLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssetLibrary_Base_Package(), theUMLPackage.getPackage(), null, "base_Package", null, 0, 1, AssetLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAssetLibrary_AssetSpec(), ecorePackage.getEString(), "assetSpec", null, 0, 1, AssetLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAssetLibrary_AssetType(), this.getAssetType(), "assetType", null, 1, 1, AssetLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(energyCharacteristicEClass, EnergyCharacteristic.class, "EnergyCharacteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnergyCharacteristic_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 0, 1, EnergyCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEnergyCharacteristic_EnergyType(), this.getEnergyType(), "energyType", "Unspecified", 1, 1, EnergyCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEnergyCharacteristic_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 0, 1, EnergyCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(osiCharacteristicEClass, OsiCharacteristic.class, "OsiCharacteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOsiCharacteristic_Application(), ecorePackage.getEString(), "application", null, 0, 1, OsiCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOsiCharacteristic_Presentation(), ecorePackage.getEString(), "presentation", null, 0, 1, OsiCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOsiCharacteristic_Session(), ecorePackage.getEString(), "session", null, 0, 1, OsiCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOsiCharacteristic_Transport(), ecorePackage.getEString(), "transport", null, 0, 1, OsiCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOsiCharacteristic_Network(), ecorePackage.getEString(), "network", null, 0, 1, OsiCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOsiCharacteristic_DataLink(), ecorePackage.getEString(), "dataLink", null, 1, 1, OsiCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOsiCharacteristic_Physical(), ecorePackage.getEString(), "physical", null, 1, 1, OsiCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(flowCharacteristicEClass, FlowCharacteristic.class, "FlowCharacteristic", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowCharacteristic_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 0, 1, FlowCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tcpCharacteristicEClass, TcpCharacteristic.class, "TcpCharacteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTcpCharacteristic_Application(), ecorePackage.getEString(), "application", null, 0, 1, TcpCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTcpCharacteristic_Transport(), ecorePackage.getEString(), "transport", null, 0, 1, TcpCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTcpCharacteristic_Network(), ecorePackage.getEString(), "network", null, 0, 1, TcpCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTcpCharacteristic_DataLink(), ecorePackage.getEString(), "dataLink", null, 1, 1, TcpCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTcpCharacteristic_Physical(), ecorePackage.getEString(), "physical", null, 1, 1, TcpCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(interfaceCharacteristicEClass, InterfaceCharacteristic.class, "InterfaceCharacteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceCharacteristic_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 0, 1, InterfaceCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceCharacteristic_InterfaceConnector(), this.getInterfaceConnector(), "interfaceConnector", "Unspecified", 0, 1, InterfaceCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceCharacteristic_InterfaceType(), this.getInterfaceType(), "interfaceType", "Unspecified", 1, 1, InterfaceCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInterfaceCharacteristic_Purpose(), ecorePackage.getEString(), "purpose", null, 1, 1, InterfaceCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bandwidthCharacteristicEClass, BandwidthCharacteristic.class, "BandwidthCharacteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBandwidthCharacteristic_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 0, 1, BandwidthCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBandwidthCharacteristic_Bandwidth(), this.getBandwidth(), null, "bandwidth", null, 1, 1, BandwidthCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBandwidthCharacteristic_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 0, 1, BandwidthCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(firewallCharacteristicEClass, FirewallCharacteristic.class, "FirewallCharacteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFirewallCharacteristic_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 0, 1, FirewallCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(materialCharacteristicEClass, MaterialCharacteristic.class, "MaterialCharacteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMaterialCharacteristic_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 0, 1, MaterialCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMaterialCharacteristic_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 0, 1, MaterialCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMaterialCharacteristic_MaterialType(), theUMLPackage.getDataType(), null, "materialType", null, 1, -1, MaterialCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iec62443SecurityLevelCharacteristicEClass, Iec62443SecurityLevelCharacteristic.class, "Iec62443SecurityLevelCharacteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIec62443SecurityLevelCharacteristic_Base_NamedElement(), theUMLPackage.getNamedElement(), null, "base_NamedElement", null, 0, 1, Iec62443SecurityLevelCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIec62443SecurityLevelCharacteristic_Securitylevel(), this.getSecurityLevel(), null, "securitylevel", null, 0, -1, Iec62443SecurityLevelCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(securityLevelEClass, SecurityLevel.class, "SecurityLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecurityLevel_FoundationalRequirement(), this.getIec62443FoundationalRequirementType(), "foundationalRequirement", null, 1, 1, SecurityLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSecurityLevel_Level(), this.getSecurityLevel(), null, "level", null, 1, 1, SecurityLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSecurityLevel_Rational(), ecorePackage.getEString(), "rational", null, 0, 1, SecurityLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSecurityLevel_Type(), this.getIec62443SecurityLevelType(), "type", null, 1, 1, SecurityLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSecurityLevel_Vector(), ecorePackage.getEString(), "vector", null, 1, 1, SecurityLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cpeCharacteristicEClass, CpeCharacteristic.class, "CpeCharacteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCpeCharacteristic_Base_NamedElement(), theUMLPackage.getNamedElement(), null, "base_NamedElement", null, 0, 1, CpeCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCpeCharacteristic_Cpe(), this.getCommonPlatformEnumeration(), null, "cpe", null, 1, -1, CpeCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(storageCharacteristicEClass, StorageCharacteristic.class, "StorageCharacteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStorageCharacteristic_Base_Component(), theUMLPackage.getComponent(), null, "base_Component", null, 0, 1, StorageCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStorageCharacteristic_Base_Port(), theUMLPackage.getPort(), null, "base_Port", null, 0, 1, StorageCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStorageCharacteristic_Encryption(), ecorePackage.getEString(), "encryption", null, 0, 1, StorageCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStorageCharacteristic_StorageFormat(), ecorePackage.getEString(), "storageFormat", null, 0, 1, StorageCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStorageCharacteristic_StorageType(), this.getStorageType(), "storageType", "Unknown", 1, 1, StorageCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStorageCharacteristic_StorageName(), ecorePackage.getEString(), "storageName", null, 0, 1, StorageCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStorageCharacteristic_TotalSize(), this.getSize_T(), null, "totalSize", null, 1, 1, StorageCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(accessCharacteristicEClass, AccessCharacteristic.class, "AccessCharacteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccessCharacteristic_Base_NamedElement(), theUMLPackage.getNamedElement(), null, "base_NamedElement", null, 0, 1, AccessCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccessCharacteristic_FunctionalLevel(), this.getFunctionalAccessLevel(), "functionalLevel", null, 0, 1, AccessCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccessCharacteristic_FunctionalSpec(), ecorePackage.getEString(), "functionalSpec", null, 0, 1, AccessCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccessCharacteristic_MechanicalLevel(), this.getMechanicalAccessLevel(), "mechanicalLevel", null, 0, 1, AccessCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAccessCharacteristic_MechanicalSpec(), ecorePackage.getEString(), "mechanicalSpec", null, 0, 1, AccessCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(usageCharacteristicEClass, UsageCharacteristic.class, "UsageCharacteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsageCharacteristic_Base_NamedElement(), theUMLPackage.getNamedElement(), null, "base_NamedElement", null, 0, 1, UsageCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUsageCharacteristic_IntendedUserGroup(), theUMLPackage.getActor(), null, "intendedUserGroup", null, 0, -1, UsageCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsageCharacteristic_UsageSpec(), ecorePackage.getEString(), "usageSpec", null, 0, 1, UsageCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUsageCharacteristic_UsageType(), this.getUsageType(), "usageType", null, 0, 1, UsageCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(commonPlatformEnumerationTypeEEnum, CommonPlatformEnumerationType.class, "CommonPlatformEnumerationType");
		addEEnumLiteral(commonPlatformEnumerationTypeEEnum, CommonPlatformEnumerationType.UNSPECIFIED);
		addEEnumLiteral(commonPlatformEnumerationTypeEEnum, CommonPlatformEnumerationType.APPLICATION);
		addEEnumLiteral(commonPlatformEnumerationTypeEEnum, CommonPlatformEnumerationType.FIRMWARE);
		addEEnumLiteral(commonPlatformEnumerationTypeEEnum, CommonPlatformEnumerationType.HARDWARE);
		addEEnumLiteral(commonPlatformEnumerationTypeEEnum, CommonPlatformEnumerationType.OPERATING_SYSTEM);

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

		initEEnum(sizeUnitOfMeasureEEnum, SizeUnitOfMeasure.class, "SizeUnitOfMeasure");
		addEEnumLiteral(sizeUnitOfMeasureEEnum, SizeUnitOfMeasure.GIGABYTE);
		addEEnumLiteral(sizeUnitOfMeasureEEnum, SizeUnitOfMeasure.MEGABYTE);
		addEEnumLiteral(sizeUnitOfMeasureEEnum, SizeUnitOfMeasure.KILOBYTE);
		addEEnumLiteral(sizeUnitOfMeasureEEnum, SizeUnitOfMeasure.BYTE);

		initEEnum(speedUnitOfMeasurementEEnum, SpeedUnitOfMeasurement.class, "SpeedUnitOfMeasurement");
		addEEnumLiteral(speedUnitOfMeasurementEEnum, SpeedUnitOfMeasurement.GIGABIT);
		addEEnumLiteral(speedUnitOfMeasurementEEnum, SpeedUnitOfMeasurement.MEGABIT);
		addEEnumLiteral(speedUnitOfMeasurementEEnum, SpeedUnitOfMeasurement.KILOBIT);
		addEEnumLiteral(speedUnitOfMeasurementEEnum, SpeedUnitOfMeasurement.BAUD);

		initEEnum(scopeConstraintTypeEEnum, ScopeConstraintType.class, "ScopeConstraintType");
		addEEnumLiteral(scopeConstraintTypeEEnum, ScopeConstraintType.ADDED);
		addEEnumLiteral(scopeConstraintTypeEEnum, ScopeConstraintType.REMOVED);

		initEEnum(assetTypeEEnum, AssetType.class, "AssetType");
		addEEnumLiteral(assetTypeEEnum, AssetType.UNSPECIFIED);
		addEEnumLiteral(assetTypeEEnum, AssetType.CREDENTIALS);
		addEEnumLiteral(assetTypeEEnum, AssetType.CONNECTION);
		addEEnumLiteral(assetTypeEEnum, AssetType.ENERGY);
		addEEnumLiteral(assetTypeEEnum, AssetType.DATA);
		addEEnumLiteral(assetTypeEEnum, AssetType.DISTURBANCE);
		addEEnumLiteral(assetTypeEEnum, AssetType.INFORMATION);
		addEEnumLiteral(assetTypeEEnum, AssetType.INTERFACE);
		addEEnumLiteral(assetTypeEEnum, AssetType.MATERIAL);
		addEEnumLiteral(assetTypeEEnum, AssetType.MECHANICAL);
		addEEnumLiteral(assetTypeEEnum, AssetType.SIGNAL);

		initEEnum(assetFlightLevelEEnum, AssetFlightLevel.class, "AssetFlightLevel");
		addEEnumLiteral(assetFlightLevelEEnum, AssetFlightLevel.UNSPECIFIED);
		addEEnumLiteral(assetFlightLevelEEnum, AssetFlightLevel.ENTERPRISE);
		addEEnumLiteral(assetFlightLevelEEnum, AssetFlightLevel.PRODUCT);
		addEEnumLiteral(assetFlightLevelEEnum, AssetFlightLevel.SYSTEM);
		addEEnumLiteral(assetFlightLevelEEnum, AssetFlightLevel.SUB_SYSTEM);
		addEEnumLiteral(assetFlightLevelEEnum, AssetFlightLevel.COMPONENT);

		initEEnum(assetCategoryEEnum, AssetCategory.class, "AssetCategory");
		addEEnumLiteral(assetCategoryEEnum, AssetCategory.UNSPECIFIED);
		addEEnumLiteral(assetCategoryEEnum, AssetCategory.ACCESSORY);
		addEEnumLiteral(assetCategoryEEnum, AssetCategory.ARCHITECTURE_COMPONENT);
		addEEnumLiteral(assetCategoryEEnum, AssetCategory.COMPLIANCE);
		addEEnumLiteral(assetCategoryEEnum, AssetCategory.DATA);
		addEEnumLiteral(assetCategoryEEnum, AssetCategory.ENVIRONMENT_AND_RESOURCE);
		addEEnumLiteral(assetCategoryEEnum, AssetCategory.ESSENTIAL_PERFORMANCE_FEATURE);
		addEEnumLiteral(assetCategoryEEnum, AssetCategory.FEATURE);
		addEEnumLiteral(assetCategoryEEnum, AssetCategory.HARDWARE);
		addEEnumLiteral(assetCategoryEEnum, AssetCategory.INFRASTRUCTURE_AND_NETWORK);
		addEEnumLiteral(assetCategoryEEnum, AssetCategory.INTELLECTUAL_PROPERTY);
		addEEnumLiteral(assetCategoryEEnum, AssetCategory.INTERFACE);
		addEEnumLiteral(assetCategoryEEnum, AssetCategory.INTERFACES_AND_ACCESS);
		addEEnumLiteral(assetCategoryEEnum, AssetCategory.MANUFACTURING_PROCESS);
		addEEnumLiteral(assetCategoryEEnum, AssetCategory.PEOPLE);
		addEEnumLiteral(assetCategoryEEnum, AssetCategory.PRIMARY_OPERATING_FUNCTION);
		addEEnumLiteral(assetCategoryEEnum, AssetCategory.PROPERTY);
		addEEnumLiteral(assetCategoryEEnum, AssetCategory.REPUTATION);

		initEEnum(protectionGoalEEnum, ProtectionGoal.class, "ProtectionGoal");
		addEEnumLiteral(protectionGoalEEnum, ProtectionGoal.CONFIDENTIALITY);
		addEEnumLiteral(protectionGoalEEnum, ProtectionGoal.INTEGRITY);
		addEEnumLiteral(protectionGoalEEnum, ProtectionGoal.AVAILABILITY);
		addEEnumLiteral(protectionGoalEEnum, ProtectionGoal.USABILITY);
		addEEnumLiteral(protectionGoalEEnum, ProtectionGoal.MONEY);
		addEEnumLiteral(protectionGoalEEnum, ProtectionGoal.LEGAL);

		initEEnum(strideEEnum, engineering.schumann.uml.profile.csmn.STRIDE.class, "STRIDE");
		addEEnumLiteral(strideEEnum, engineering.schumann.uml.profile.csmn.STRIDE.SPOOFING);
		addEEnumLiteral(strideEEnum, engineering.schumann.uml.profile.csmn.STRIDE.TAMPERING);
		addEEnumLiteral(strideEEnum, engineering.schumann.uml.profile.csmn.STRIDE.REPUDIATION);
		addEEnumLiteral(strideEEnum, engineering.schumann.uml.profile.csmn.STRIDE.INFORMATION_DISCLOSURE);
		addEEnumLiteral(strideEEnum, engineering.schumann.uml.profile.csmn.STRIDE.DENIAL_OF_SERVICE);
		addEEnumLiteral(strideEEnum, engineering.schumann.uml.profile.csmn.STRIDE.ELEVATION_OF_PRIVILEGE);

		initEEnum(energyTypeEEnum, EnergyType.class, "EnergyType");
		addEEnumLiteral(energyTypeEEnum, EnergyType.UNSPECIFIED);
		addEEnumLiteral(energyTypeEEnum, EnergyType.FORCE);
		addEEnumLiteral(energyTypeEEnum, EnergyType.HEAT);
		addEEnumLiteral(energyTypeEEnum, EnergyType.KINETIC);
		addEEnumLiteral(energyTypeEEnum, EnergyType.LIGHT);
		addEEnumLiteral(energyTypeEEnum, EnergyType.POWER);
		addEEnumLiteral(energyTypeEEnum, EnergyType.SOUND);
		addEEnumLiteral(energyTypeEEnum, EnergyType.VIBRATION);

		initEEnum(interfaceConnectorEEnum, InterfaceConnector.class, "InterfaceConnector");
		addEEnumLiteral(interfaceConnectorEEnum, InterfaceConnector.UNSPECIFIED);
		addEEnumLiteral(interfaceConnectorEEnum, InterfaceConnector.NONE);
		addEEnumLiteral(interfaceConnectorEEnum, InterfaceConnector.HARDWIRED);
		addEEnumLiteral(interfaceConnectorEEnum, InterfaceConnector.HDMI);
		addEEnumLiteral(interfaceConnectorEEnum, InterfaceConnector.KNOB);
		addEEnumLiteral(interfaceConnectorEEnum, InterfaceConnector.LUER);
		addEEnumLiteral(interfaceConnectorEEnum, InterfaceConnector.RJ45);
		addEEnumLiteral(interfaceConnectorEEnum, InterfaceConnector.IEC_PLUG_C);
		addEEnumLiteral(interfaceConnectorEEnum, InterfaceConnector.IEC_PLUG_C13);
		addEEnumLiteral(interfaceConnectorEEnum, InterfaceConnector.IEC_SOCKET_C14);
		addEEnumLiteral(interfaceConnectorEEnum, InterfaceConnector.PROPRIETARY);
		addEEnumLiteral(interfaceConnectorEEnum, InterfaceConnector.SD_CARD);
		addEEnumLiteral(interfaceConnectorEEnum, InterfaceConnector.SUB_D);
		addEEnumLiteral(interfaceConnectorEEnum, InterfaceConnector.TOSLINK);
		addEEnumLiteral(interfaceConnectorEEnum, InterfaceConnector.USB_A);
		addEEnumLiteral(interfaceConnectorEEnum, InterfaceConnector.USB_C);
		addEEnumLiteral(interfaceConnectorEEnum, InterfaceConnector.WIRELESS);

		initEEnum(interfaceTypeEEnum, InterfaceType.class, "InterfaceType");
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.UNSPECIFIED);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.AIR_BY_FAN);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.AIR_BY_TURBINE);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.ALARMLIGHT);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.BLUETOOTH);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.CELLULAR);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.CELLULAR2_G);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.CELLULAR3_G);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.CELLULAR4_G);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.CELLULAR5_G);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.DISPLAY);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.DISPLAY_SMALL);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.ELECTRICAL);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.ETHERNET);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.HDMI);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.KNOB);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.NFC);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.OPTICAL);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.PROPRIETARY);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.POWER);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.SD_CARD);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.SERIAL);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.SPEAKER);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.TOUCH);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.USB);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.USB_A);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.USB_C);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.USB_FLASH);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.WATER);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.WIFI_ACCESS_POINT);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.WIFI_CLIENT);
		addEEnumLiteral(interfaceTypeEEnum, InterfaceType.ZIGBEE);

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

		initEEnum(storageTypeEEnum, StorageType.class, "StorageType");
		addEEnumLiteral(storageTypeEEnum, StorageType.UNKNOWN);
		addEEnumLiteral(storageTypeEEnum, StorageType.REMOVABLE_BY_OPERATOR);
		addEEnumLiteral(storageTypeEEnum, StorageType.REMOVABLE_BY_TECHNICIAN);
		addEEnumLiteral(storageTypeEEnum, StorageType.FIXED);
		addEEnumLiteral(storageTypeEEnum, StorageType.NETWORK);
		addEEnumLiteral(storageTypeEEnum, StorageType.CD_ROM);
		addEEnumLiteral(storageTypeEEnum, StorageType.RAM);

		initEEnum(functionalAccessLevelEEnum, FunctionalAccessLevel.class, "FunctionalAccessLevel");
		addEEnumLiteral(functionalAccessLevelEEnum, FunctionalAccessLevel.UNSPECIFIED);
		addEEnumLiteral(functionalAccessLevelEEnum, FunctionalAccessLevel.OPEN);
		addEEnumLiteral(functionalAccessLevelEEnum, FunctionalAccessLevel.OPERATOR);
		addEEnumLiteral(functionalAccessLevelEEnum, FunctionalAccessLevel.SERVICE);
		addEEnumLiteral(functionalAccessLevelEEnum, FunctionalAccessLevel.VENDOR);
		addEEnumLiteral(functionalAccessLevelEEnum, FunctionalAccessLevel.DISABLED);

		initEEnum(mechanicalAccessLevelEEnum, MechanicalAccessLevel.class, "MechanicalAccessLevel");
		addEEnumLiteral(mechanicalAccessLevelEEnum, MechanicalAccessLevel.UNSPECIFIED);
		addEEnumLiteral(mechanicalAccessLevelEEnum, MechanicalAccessLevel.OPEN);
		addEEnumLiteral(mechanicalAccessLevelEEnum, MechanicalAccessLevel.COVERED_NO_TOOLS);
		addEEnumLiteral(mechanicalAccessLevelEEnum, MechanicalAccessLevel.COVERED_SIMPLE_TOOLS);
		addEEnumLiteral(mechanicalAccessLevelEEnum, MechanicalAccessLevel.DISMANTLE_REQUIRED);
		addEEnumLiteral(mechanicalAccessLevelEEnum, MechanicalAccessLevel.NONE);

		initEEnum(usageTypeEEnum, UsageType.class, "UsageType");
		addEEnumLiteral(usageTypeEEnum, UsageType.UNSPECIFIED);
		addEEnumLiteral(usageTypeEEnum, UsageType.EVERYTIME);
		addEEnumLiteral(usageTypeEEnum, UsageType.MOSTTIME);
		addEEnumLiteral(usageTypeEEnum, UsageType.SOMETIMES);
		addEEnumLiteral(usageTypeEEnum, UsageType.SETUP);
		addEEnumLiteral(usageTypeEEnum, UsageType.MAINTENANCE);
		addEEnumLiteral(usageTypeEEnum, UsageType.MANUFACTURING);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "originalName", "CSMN"
		   });
	}

} //CSMNPackageImpl
