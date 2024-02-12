/**
 */
package engineering.schumann.uml.profile.csmn.util;

import engineering.schumann.uml.profile.csmn.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage
 * @generated
 */
public class CSMNAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CSMNPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSMNAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CSMNPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSMNSwitch<Adapter> modelSwitch =
		new CSMNSwitch<Adapter>() {
			@Override
			public Adapter caseSystemElement(SystemElement object) {
				return createSystemElementAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseEnvironmentElement(EnvironmentElement object) {
				return createEnvironmentElementAdapter();
			}
			@Override
			public Adapter caseSecurityZone(SecurityZone object) {
				return createSecurityZoneAdapter();
			}
			@Override
			public Adapter caseBox(Box object) {
				return createBoxAdapter();
			}
			@Override
			public Adapter caseEnvironmentLibrary(EnvironmentLibrary object) {
				return createEnvironmentLibraryAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseSize_T(Size_T object) {
				return createSize_TAdapter();
			}
			@Override
			public Adapter caseBandwidth(Bandwidth object) {
				return createBandwidthAdapter();
			}
			@Override
			public Adapter caseScope(Scope object) {
				return createScopeAdapter();
			}
			@Override
			public Adapter caseProduct(Product object) {
				return createProductAdapter();
			}
			@Override
			public Adapter caseCommonPlatformEnumeration(CommonPlatformEnumeration object) {
				return createCommonPlatformEnumerationAdapter();
			}
			@Override
			public Adapter caseScopeConstraint(ScopeConstraint object) {
				return createScopeConstraintAdapter();
			}
			@Override
			public Adapter caseProductConstraint(ProductConstraint object) {
				return createProductConstraintAdapter();
			}
			@Override
			public Adapter caseSoftwareConstraint(SoftwareConstraint object) {
				return createSoftwareConstraintAdapter();
			}
			@Override
			public Adapter caseAsset(Asset object) {
				return createAssetAdapter();
			}
			@Override
			public Adapter caseAssetLibrary(AssetLibrary object) {
				return createAssetLibraryAdapter();
			}
			@Override
			public Adapter caseEnergyCharacteristic(EnergyCharacteristic object) {
				return createEnergyCharacteristicAdapter();
			}
			@Override
			public Adapter caseOsiCharacteristic(OsiCharacteristic object) {
				return createOsiCharacteristicAdapter();
			}
			@Override
			public Adapter caseFlowCharacteristic(FlowCharacteristic object) {
				return createFlowCharacteristicAdapter();
			}
			@Override
			public Adapter caseTcpCharacteristic(TcpCharacteristic object) {
				return createTcpCharacteristicAdapter();
			}
			@Override
			public Adapter caseInterfaceCharacteristic(InterfaceCharacteristic object) {
				return createInterfaceCharacteristicAdapter();
			}
			@Override
			public Adapter caseBandwidthCharacteristic(BandwidthCharacteristic object) {
				return createBandwidthCharacteristicAdapter();
			}
			@Override
			public Adapter caseFirewallCharacteristic(FirewallCharacteristic object) {
				return createFirewallCharacteristicAdapter();
			}
			@Override
			public Adapter caseMaterialCharacteristic(MaterialCharacteristic object) {
				return createMaterialCharacteristicAdapter();
			}
			@Override
			public Adapter caseIec62443SecurityLevelCharacteristic(Iec62443SecurityLevelCharacteristic object) {
				return createIec62443SecurityLevelCharacteristicAdapter();
			}
			@Override
			public Adapter caseSecurityLevel(SecurityLevel object) {
				return createSecurityLevelAdapter();
			}
			@Override
			public Adapter caseCpeCharacteristic(CpeCharacteristic object) {
				return createCpeCharacteristicAdapter();
			}
			@Override
			public Adapter caseStorageCharacteristic(StorageCharacteristic object) {
				return createStorageCharacteristicAdapter();
			}
			@Override
			public Adapter caseAccessCharacteristic(AccessCharacteristic object) {
				return createAccessCharacteristicAdapter();
			}
			@Override
			public Adapter caseUsageCharacteristic(UsageCharacteristic object) {
				return createUsageCharacteristicAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.SystemElement <em>System Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.SystemElement
	 * @generated
	 */
	public Adapter createSystemElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.EnvironmentElement <em>Environment Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.EnvironmentElement
	 * @generated
	 */
	public Adapter createEnvironmentElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.SecurityZone <em>Security Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.SecurityZone
	 * @generated
	 */
	public Adapter createSecurityZoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.Box <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.Box
	 * @generated
	 */
	public Adapter createBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.EnvironmentLibrary <em>Environment Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.EnvironmentLibrary
	 * @generated
	 */
	public Adapter createEnvironmentLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.Size_T <em>Size T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.Size_T
	 * @generated
	 */
	public Adapter createSize_TAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.Bandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.Bandwidth
	 * @generated
	 */
	public Adapter createBandwidthAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.Scope
	 * @generated
	 */
	public Adapter createScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.Product
	 * @generated
	 */
	public Adapter createProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.CommonPlatformEnumeration <em>Common Platform Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.CommonPlatformEnumeration
	 * @generated
	 */
	public Adapter createCommonPlatformEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.ScopeConstraint <em>Scope Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.ScopeConstraint
	 * @generated
	 */
	public Adapter createScopeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.ProductConstraint <em>Product Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.ProductConstraint
	 * @generated
	 */
	public Adapter createProductConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.Asset
	 * @generated
	 */
	public Adapter createAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.AssetLibrary <em>Asset Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.AssetLibrary
	 * @generated
	 */
	public Adapter createAssetLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.EnergyCharacteristic <em>Energy Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.EnergyCharacteristic
	 * @generated
	 */
	public Adapter createEnergyCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.OsiCharacteristic <em>Osi Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.OsiCharacteristic
	 * @generated
	 */
	public Adapter createOsiCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.FlowCharacteristic <em>Flow Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.FlowCharacteristic
	 * @generated
	 */
	public Adapter createFlowCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.TcpCharacteristic <em>Tcp Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.TcpCharacteristic
	 * @generated
	 */
	public Adapter createTcpCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.InterfaceCharacteristic <em>Interface Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.InterfaceCharacteristic
	 * @generated
	 */
	public Adapter createInterfaceCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.BandwidthCharacteristic <em>Bandwidth Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.BandwidthCharacteristic
	 * @generated
	 */
	public Adapter createBandwidthCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.FirewallCharacteristic <em>Firewall Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.FirewallCharacteristic
	 * @generated
	 */
	public Adapter createFirewallCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.MaterialCharacteristic <em>Material Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.MaterialCharacteristic
	 * @generated
	 */
	public Adapter createMaterialCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.Iec62443SecurityLevelCharacteristic <em>Iec62443 Security Level Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.Iec62443SecurityLevelCharacteristic
	 * @generated
	 */
	public Adapter createIec62443SecurityLevelCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.SecurityLevel <em>Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.SecurityLevel
	 * @generated
	 */
	public Adapter createSecurityLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.CpeCharacteristic <em>Cpe Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.CpeCharacteristic
	 * @generated
	 */
	public Adapter createCpeCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.StorageCharacteristic <em>Storage Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.StorageCharacteristic
	 * @generated
	 */
	public Adapter createStorageCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.AccessCharacteristic <em>Access Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.AccessCharacteristic
	 * @generated
	 */
	public Adapter createAccessCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.UsageCharacteristic <em>Usage Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.UsageCharacteristic
	 * @generated
	 */
	public Adapter createUsageCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.profile.csmn.SoftwareConstraint <em>Software Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.profile.csmn.SoftwareConstraint
	 * @generated
	 */
	public Adapter createSoftwareConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CSMNAdapterFactory
