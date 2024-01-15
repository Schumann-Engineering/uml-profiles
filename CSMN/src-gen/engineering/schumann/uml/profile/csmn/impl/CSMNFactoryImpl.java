/**
 */
package engineering.schumann.uml.profile.csmn.impl;

import engineering.schumann.uml.profile.csmn.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CSMNFactoryImpl extends EFactoryImpl implements CSMNFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CSMNFactory init() {
		try {
			CSMNFactory theCSMNFactory = (CSMNFactory)EPackage.Registry.INSTANCE.getEFactory(CSMNPackage.eNS_URI);
			if (theCSMNFactory != null) {
				return theCSMNFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CSMNFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMNFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CSMNPackage.SYSTEM_ELEMENT: return createSystemElement();
			case CSMNPackage.USER: return createUser();
			case CSMNPackage.ENVIRONMENT_ELEMENT: return createEnvironmentElement();
			case CSMNPackage.SECURITY_ZONE: return createSecurityZone();
			case CSMNPackage.BOX: return createBox();
			case CSMNPackage.ENVIRONMENT_LIBRARY: return createEnvironmentLibrary();
			case CSMNPackage.CONNECTION: return createConnection();
			case CSMNPackage.SIZE_T: return createSize_T();
			case CSMNPackage.BANDWIDTH: return createBandwidth();
			case CSMNPackage.SCOPE: return createScope();
			case CSMNPackage.PRODUCT: return createProduct();
			case CSMNPackage.COMMON_PLATFORM_ENUMERATION: return createCommonPlatformEnumeration();
			case CSMNPackage.SCOPE_CONSTRAINT: return createScopeConstraint();
			case CSMNPackage.PRODUCT_CONSTRAINT: return createProductConstraint();
			case CSMNPackage.ASSET: return createAsset();
			case CSMNPackage.ASSET_LIBRARY: return createAssetLibrary();
			case CSMNPackage.ENERGY_CHARACTERISTIC: return createEnergyCharacteristic();
			case CSMNPackage.OSI_CHARACTERISTIC: return createOsiCharacteristic();
			case CSMNPackage.TCP_CHARACTERISTIC: return createTcpCharacteristic();
			case CSMNPackage.INTERFACE_CHARACTERISTIC: return createInterfaceCharacteristic();
			case CSMNPackage.BANDWIDTH_CHARACTERISTICS: return createBandwidthCharacteristics();
			case CSMNPackage.FIREWALL_CHARACTERISTIC: return createFirewallCharacteristic();
			case CSMNPackage.MATERIAL_CHARACTERISTIC: return createMaterialCharacteristic();
			case CSMNPackage.IEC62443_SECURITY_LEVEL_CHARACTERISTIC: return createIec62443SecurityLevelCharacteristic();
			case CSMNPackage.SECURITY_LEVEL: return createSecurityLevel();
			case CSMNPackage.CPE_CHARACTERISTIC: return createCpeCharacteristic();
			case CSMNPackage.STORAGE_CHARACTERISTIC: return createStorageCharacteristic();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CSMNPackage.USER_TYPE:
				return createUserTypeFromString(eDataType, initialValue);
			case CSMNPackage.CONNECTION_TYPE:
				return createConnectionTypeFromString(eDataType, initialValue);
			case CSMNPackage.DIRECTION_OF_PRIMARY_FLOW:
				return createDirectionOfPrimaryFlowFromString(eDataType, initialValue);
			case CSMNPackage.DIRECTION_TYPE:
				return createDirectionTypeFromString(eDataType, initialValue);
			case CSMNPackage.SIZE_UNIT_OF_MEASURE:
				return createSizeUnitOfMeasureFromString(eDataType, initialValue);
			case CSMNPackage.SPEED_UNIT_OF_MEASUREMENT:
				return createSpeedUnitOfMeasurementFromString(eDataType, initialValue);
			case CSMNPackage.COMMON_PLATFORM_ENUMERATION_TYPE:
				return createCommonPlatformEnumerationTypeFromString(eDataType, initialValue);
			case CSMNPackage.SCOPE_CONSTRAINT_TYPE:
				return createScopeConstraintTypeFromString(eDataType, initialValue);
			case CSMNPackage.ASSET_TYPE:
				return createAssetTypeFromString(eDataType, initialValue);
			case CSMNPackage.ENERGY_TYPE:
				return createEnergyTypeFromString(eDataType, initialValue);
			case CSMNPackage.INTERFACE_TYPE:
				return createInterfaceTypeFromString(eDataType, initialValue);
			case CSMNPackage.INTERFACE_CONNECTOR:
				return createInterfaceConnectorFromString(eDataType, initialValue);
			case CSMNPackage.MATERIAL_TYPE:
				return createMaterialTypeFromString(eDataType, initialValue);
			case CSMNPackage.IEC62443_SECURITY_LEVEL:
				return createIec62443SecurityLevelFromString(eDataType, initialValue);
			case CSMNPackage.IEC62443_FOUNDATIONAL_REQUIREMENT_TYPE:
				return createIec62443FoundationalRequirementTypeFromString(eDataType, initialValue);
			case CSMNPackage.IEC62443_SECURITY_LEVEL_TYPE:
				return createIec62443SecurityLevelTypeFromString(eDataType, initialValue);
			case CSMNPackage.STORAGE_TYPE:
				return createStorageTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CSMNPackage.USER_TYPE:
				return convertUserTypeToString(eDataType, instanceValue);
			case CSMNPackage.CONNECTION_TYPE:
				return convertConnectionTypeToString(eDataType, instanceValue);
			case CSMNPackage.DIRECTION_OF_PRIMARY_FLOW:
				return convertDirectionOfPrimaryFlowToString(eDataType, instanceValue);
			case CSMNPackage.DIRECTION_TYPE:
				return convertDirectionTypeToString(eDataType, instanceValue);
			case CSMNPackage.SIZE_UNIT_OF_MEASURE:
				return convertSizeUnitOfMeasureToString(eDataType, instanceValue);
			case CSMNPackage.SPEED_UNIT_OF_MEASUREMENT:
				return convertSpeedUnitOfMeasurementToString(eDataType, instanceValue);
			case CSMNPackage.COMMON_PLATFORM_ENUMERATION_TYPE:
				return convertCommonPlatformEnumerationTypeToString(eDataType, instanceValue);
			case CSMNPackage.SCOPE_CONSTRAINT_TYPE:
				return convertScopeConstraintTypeToString(eDataType, instanceValue);
			case CSMNPackage.ASSET_TYPE:
				return convertAssetTypeToString(eDataType, instanceValue);
			case CSMNPackage.ENERGY_TYPE:
				return convertEnergyTypeToString(eDataType, instanceValue);
			case CSMNPackage.INTERFACE_TYPE:
				return convertInterfaceTypeToString(eDataType, instanceValue);
			case CSMNPackage.INTERFACE_CONNECTOR:
				return convertInterfaceConnectorToString(eDataType, instanceValue);
			case CSMNPackage.MATERIAL_TYPE:
				return convertMaterialTypeToString(eDataType, instanceValue);
			case CSMNPackage.IEC62443_SECURITY_LEVEL:
				return convertIec62443SecurityLevelToString(eDataType, instanceValue);
			case CSMNPackage.IEC62443_FOUNDATIONAL_REQUIREMENT_TYPE:
				return convertIec62443FoundationalRequirementTypeToString(eDataType, instanceValue);
			case CSMNPackage.IEC62443_SECURITY_LEVEL_TYPE:
				return convertIec62443SecurityLevelTypeToString(eDataType, instanceValue);
			case CSMNPackage.STORAGE_TYPE:
				return convertStorageTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemElement createSystemElement() {
		SystemElementImpl systemElement = new SystemElementImpl();
		return systemElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvironmentElement createEnvironmentElement() {
		EnvironmentElementImpl environmentElement = new EnvironmentElementImpl();
		return environmentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityZone createSecurityZone() {
		SecurityZoneImpl securityZone = new SecurityZoneImpl();
		return securityZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Box createBox() {
		BoxImpl box = new BoxImpl();
		return box;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvironmentLibrary createEnvironmentLibrary() {
		EnvironmentLibraryImpl environmentLibrary = new EnvironmentLibraryImpl();
		return environmentLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Size_T createSize_T() {
		Size_TImpl size_T = new Size_TImpl();
		return size_T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bandwidth createBandwidth() {
		BandwidthImpl bandwidth = new BandwidthImpl();
		return bandwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scope createScope() {
		ScopeImpl scope = new ScopeImpl();
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScopeConstraint createScopeConstraint() {
		ScopeConstraintImpl scopeConstraint = new ScopeConstraintImpl();
		return scopeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductConstraint createProductConstraint() {
		ProductConstraintImpl productConstraint = new ProductConstraintImpl();
		return productConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Asset createAsset() {
		AssetImpl asset = new AssetImpl();
		return asset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssetLibrary createAssetLibrary() {
		AssetLibraryImpl assetLibrary = new AssetLibraryImpl();
		return assetLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnergyCharacteristic createEnergyCharacteristic() {
		EnergyCharacteristicImpl energyCharacteristic = new EnergyCharacteristicImpl();
		return energyCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OsiCharacteristic createOsiCharacteristic() {
		OsiCharacteristicImpl osiCharacteristic = new OsiCharacteristicImpl();
		return osiCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TcpCharacteristic createTcpCharacteristic() {
		TcpCharacteristicImpl tcpCharacteristic = new TcpCharacteristicImpl();
		return tcpCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceCharacteristic createInterfaceCharacteristic() {
		InterfaceCharacteristicImpl interfaceCharacteristic = new InterfaceCharacteristicImpl();
		return interfaceCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BandwidthCharacteristics createBandwidthCharacteristics() {
		BandwidthCharacteristicsImpl bandwidthCharacteristics = new BandwidthCharacteristicsImpl();
		return bandwidthCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FirewallCharacteristic createFirewallCharacteristic() {
		FirewallCharacteristicImpl firewallCharacteristic = new FirewallCharacteristicImpl();
		return firewallCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MaterialCharacteristic createMaterialCharacteristic() {
		MaterialCharacteristicImpl materialCharacteristic = new MaterialCharacteristicImpl();
		return materialCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Iec62443SecurityLevelCharacteristic createIec62443SecurityLevelCharacteristic() {
		Iec62443SecurityLevelCharacteristicImpl iec62443SecurityLevelCharacteristic = new Iec62443SecurityLevelCharacteristicImpl();
		return iec62443SecurityLevelCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityLevel createSecurityLevel() {
		SecurityLevelImpl securityLevel = new SecurityLevelImpl();
		return securityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CpeCharacteristic createCpeCharacteristic() {
		CpeCharacteristicImpl cpeCharacteristic = new CpeCharacteristicImpl();
		return cpeCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommonPlatformEnumeration createCommonPlatformEnumeration() {
		CommonPlatformEnumerationImpl commonPlatformEnumeration = new CommonPlatformEnumerationImpl();
		return commonPlatformEnumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StorageCharacteristic createStorageCharacteristic() {
		StorageCharacteristicImpl storageCharacteristic = new StorageCharacteristicImpl();
		return storageCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserType createUserTypeFromString(EDataType eDataType, String initialValue) {
		UserType result = UserType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUserTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionType createConnectionTypeFromString(EDataType eDataType, String initialValue) {
		ConnectionType result = ConnectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionOfPrimaryFlow createDirectionOfPrimaryFlowFromString(EDataType eDataType, String initialValue) {
		DirectionOfPrimaryFlow result = DirectionOfPrimaryFlow.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionOfPrimaryFlowToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionType createDirectionTypeFromString(EDataType eDataType, String initialValue) {
		DirectionType result = DirectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SizeUnitOfMeasure createSizeUnitOfMeasureFromString(EDataType eDataType, String initialValue) {
		SizeUnitOfMeasure result = SizeUnitOfMeasure.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSizeUnitOfMeasureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeedUnitOfMeasurement createSpeedUnitOfMeasurementFromString(EDataType eDataType, String initialValue) {
		SpeedUnitOfMeasurement result = SpeedUnitOfMeasurement.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpeedUnitOfMeasurementToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeConstraintType createScopeConstraintTypeFromString(EDataType eDataType, String initialValue) {
		ScopeConstraintType result = ScopeConstraintType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeConstraintTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetType createAssetTypeFromString(EDataType eDataType, String initialValue) {
		AssetType result = AssetType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssetTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyType createEnergyTypeFromString(EDataType eDataType, String initialValue) {
		EnergyType result = EnergyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnergyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceType createInterfaceTypeFromString(EDataType eDataType, String initialValue) {
		InterfaceType result = InterfaceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterfaceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceConnector createInterfaceConnectorFromString(EDataType eDataType, String initialValue) {
		InterfaceConnector result = InterfaceConnector.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterfaceConnectorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaterialType createMaterialTypeFromString(EDataType eDataType, String initialValue) {
		MaterialType result = MaterialType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaterialTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iec62443SecurityLevel createIec62443SecurityLevelFromString(EDataType eDataType, String initialValue) {
		Iec62443SecurityLevel result = Iec62443SecurityLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIec62443SecurityLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iec62443FoundationalRequirementType createIec62443FoundationalRequirementTypeFromString(EDataType eDataType, String initialValue) {
		Iec62443FoundationalRequirementType result = Iec62443FoundationalRequirementType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIec62443FoundationalRequirementTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iec62443SecurityLevelType createIec62443SecurityLevelTypeFromString(EDataType eDataType, String initialValue) {
		Iec62443SecurityLevelType result = Iec62443SecurityLevelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIec62443SecurityLevelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonPlatformEnumerationType createCommonPlatformEnumerationTypeFromString(EDataType eDataType, String initialValue) {
		CommonPlatformEnumerationType result = CommonPlatformEnumerationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommonPlatformEnumerationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StorageType createStorageTypeFromString(EDataType eDataType, String initialValue) {
		StorageType result = StorageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStorageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CSMNPackage getCSMNPackage() {
		return (CSMNPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CSMNPackage getPackage() {
		return CSMNPackage.eINSTANCE;
	}

} //CSMNFactoryImpl
