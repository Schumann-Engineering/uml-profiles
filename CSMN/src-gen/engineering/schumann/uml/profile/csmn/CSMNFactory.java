/**
 */
package engineering.schumann.uml.profile.csmn;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage
 * @generated
 */
public interface CSMNFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CSMNFactory eINSTANCE = engineering.schumann.uml.profile.csmn.impl.CSMNFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Element</em>'.
	 * @generated
	 */
	SystemElement createSystemElement();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Environment Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment Element</em>'.
	 * @generated
	 */
	EnvironmentElement createEnvironmentElement();

	/**
	 * Returns a new object of class '<em>Security Zone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Zone</em>'.
	 * @generated
	 */
	SecurityZone createSecurityZone();

	/**
	 * Returns a new object of class '<em>Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Box</em>'.
	 * @generated
	 */
	Box createBox();

	/**
	 * Returns a new object of class '<em>Environment Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment Library</em>'.
	 * @generated
	 */
	EnvironmentLibrary createEnvironmentLibrary();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	Connection createConnection();

	/**
	 * Returns a new object of class '<em>Size T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Size T</em>'.
	 * @generated
	 */
	Size_T createSize_T();

	/**
	 * Returns a new object of class '<em>Bandwidth</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bandwidth</em>'.
	 * @generated
	 */
	Bandwidth createBandwidth();

	/**
	 * Returns a new object of class '<em>Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scope</em>'.
	 * @generated
	 */
	Scope createScope();

	/**
	 * Returns a new object of class '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product</em>'.
	 * @generated
	 */
	Product createProduct();

	/**
	 * Returns a new object of class '<em>Common Platform Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Common Platform Enumeration</em>'.
	 * @generated
	 */
	CommonPlatformEnumeration createCommonPlatformEnumeration();

	/**
	 * Returns a new object of class '<em>Scope Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scope Constraint</em>'.
	 * @generated
	 */
	ScopeConstraint createScopeConstraint();

	/**
	 * Returns a new object of class '<em>Product Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Constraint</em>'.
	 * @generated
	 */
	ProductConstraint createProductConstraint();

	/**
	 * Returns a new object of class '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asset</em>'.
	 * @generated
	 */
	Asset createAsset();

	/**
	 * Returns a new object of class '<em>Asset Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asset Library</em>'.
	 * @generated
	 */
	AssetLibrary createAssetLibrary();

	/**
	 * Returns a new object of class '<em>Energy Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Energy Characteristic</em>'.
	 * @generated
	 */
	EnergyCharacteristic createEnergyCharacteristic();

	/**
	 * Returns a new object of class '<em>Osi Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Osi Characteristic</em>'.
	 * @generated
	 */
	OsiCharacteristic createOsiCharacteristic();

	/**
	 * Returns a new object of class '<em>Tcp Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tcp Characteristic</em>'.
	 * @generated
	 */
	TcpCharacteristic createTcpCharacteristic();

	/**
	 * Returns a new object of class '<em>Interface Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Characteristic</em>'.
	 * @generated
	 */
	InterfaceCharacteristic createInterfaceCharacteristic();

	/**
	 * Returns a new object of class '<em>Bandwidth Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bandwidth Characteristic</em>'.
	 * @generated
	 */
	BandwidthCharacteristic createBandwidthCharacteristic();

	/**
	 * Returns a new object of class '<em>Firewall Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Firewall Characteristic</em>'.
	 * @generated
	 */
	FirewallCharacteristic createFirewallCharacteristic();

	/**
	 * Returns a new object of class '<em>Material Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Material Characteristic</em>'.
	 * @generated
	 */
	MaterialCharacteristic createMaterialCharacteristic();

	/**
	 * Returns a new object of class '<em>Iec62443 Security Level Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Iec62443 Security Level Characteristic</em>'.
	 * @generated
	 */
	Iec62443SecurityLevelCharacteristic createIec62443SecurityLevelCharacteristic();

	/**
	 * Returns a new object of class '<em>Security Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Level</em>'.
	 * @generated
	 */
	SecurityLevel createSecurityLevel();

	/**
	 * Returns a new object of class '<em>Cpe Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cpe Characteristic</em>'.
	 * @generated
	 */
	CpeCharacteristic createCpeCharacteristic();

	/**
	 * Returns a new object of class '<em>Storage Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storage Characteristic</em>'.
	 * @generated
	 */
	StorageCharacteristic createStorageCharacteristic();

	/**
	 * Returns a new object of class '<em>Access Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Characteristic</em>'.
	 * @generated
	 */
	AccessCharacteristic createAccessCharacteristic();

	/**
	 * Returns a new object of class '<em>Usage Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usage Characteristic</em>'.
	 * @generated
	 */
	UsageCharacteristic createUsageCharacteristic();

	/**
	 * Returns a new object of class '<em>Software Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Constraint</em>'.
	 * @generated
	 */
	SoftwareConstraint createSoftwareConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CSMNPackage getCSMNPackage();

} //CSMNFactory
