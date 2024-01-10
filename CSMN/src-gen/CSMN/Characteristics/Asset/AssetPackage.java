/**
 */
package CSMN.Characteristics.Asset;

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
 * @see CSMN.Characteristics.Asset.AssetFactory
 * @model kind="package"
 * @generated
 */
public interface AssetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Asset";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schumann.engineering/csmn/1/Characteristics/Asset";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CSMN.Characteristics.Asset";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AssetPackage eINSTANCE = CSMN.Characteristics.Asset.impl.AssetPackageImpl.init();

	/**
	 * The meta object id for the '{@link CSMN.Characteristics.Asset.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Characteristics.Asset.impl.AssetImpl
	 * @see CSMN.Characteristics.Asset.impl.AssetPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 0;

	/**
	 * The feature id for the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__BASE_DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Asset Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ASSET_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__BASE_PORT = 2;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSMN.Characteristics.Asset.impl.AssetLibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Characteristics.Asset.impl.AssetLibraryImpl
	 * @see CSMN.Characteristics.Asset.impl.AssetPackageImpl#getAssetLibrary()
	 * @generated
	 */
	int ASSET_LIBRARY = 1;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_LIBRARY__BASE_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Asset Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_LIBRARY__ASSET_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_LIBRARY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSMN.Characteristics.Asset.AssetType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Characteristics.Asset.AssetType
	 * @see CSMN.Characteristics.Asset.impl.AssetPackageImpl#getAssetType()
	 * @generated
	 */
	int ASSET_TYPE = 2;


	/**
	 * Returns the meta object for class '{@link CSMN.Characteristics.Asset.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see CSMN.Characteristics.Asset.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the reference '{@link CSMN.Characteristics.Asset.Asset#getBase_DataType <em>Base Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Data Type</em>'.
	 * @see CSMN.Characteristics.Asset.Asset#getBase_DataType()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Base_DataType();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Characteristics.Asset.Asset#getAssetType <em>Asset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset Type</em>'.
	 * @see CSMN.Characteristics.Asset.Asset#getAssetType()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_AssetType();

	/**
	 * Returns the meta object for the reference '{@link CSMN.Characteristics.Asset.Asset#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see CSMN.Characteristics.Asset.Asset#getBase_Port()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Base_Port();

	/**
	 * Returns the meta object for class '{@link CSMN.Characteristics.Asset.AssetLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see CSMN.Characteristics.Asset.AssetLibrary
	 * @generated
	 */
	EClass getAssetLibrary();

	/**
	 * Returns the meta object for the reference '{@link CSMN.Characteristics.Asset.AssetLibrary#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see CSMN.Characteristics.Asset.AssetLibrary#getBase_Package()
	 * @see #getAssetLibrary()
	 * @generated
	 */
	EReference getAssetLibrary_Base_Package();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Characteristics.Asset.AssetLibrary#getAssetType <em>Asset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset Type</em>'.
	 * @see CSMN.Characteristics.Asset.AssetLibrary#getAssetType()
	 * @see #getAssetLibrary()
	 * @generated
	 */
	EAttribute getAssetLibrary_AssetType();

	/**
	 * Returns the meta object for enum '{@link CSMN.Characteristics.Asset.AssetType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see CSMN.Characteristics.Asset.AssetType
	 * @generated
	 */
	EEnum getAssetType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AssetFactory getAssetFactory();

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
		 * The meta object literal for the '{@link CSMN.Characteristics.Asset.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Characteristics.Asset.impl.AssetImpl
		 * @see CSMN.Characteristics.Asset.impl.AssetPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Base Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__BASE_DATA_TYPE = eINSTANCE.getAsset_Base_DataType();

		/**
		 * The meta object literal for the '<em><b>Asset Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__ASSET_TYPE = eINSTANCE.getAsset_AssetType();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__BASE_PORT = eINSTANCE.getAsset_Base_Port();

		/**
		 * The meta object literal for the '{@link CSMN.Characteristics.Asset.impl.AssetLibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Characteristics.Asset.impl.AssetLibraryImpl
		 * @see CSMN.Characteristics.Asset.impl.AssetPackageImpl#getAssetLibrary()
		 * @generated
		 */
		EClass ASSET_LIBRARY = eINSTANCE.getAssetLibrary();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_LIBRARY__BASE_PACKAGE = eINSTANCE.getAssetLibrary_Base_Package();

		/**
		 * The meta object literal for the '<em><b>Asset Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_LIBRARY__ASSET_TYPE = eINSTANCE.getAssetLibrary_AssetType();

		/**
		 * The meta object literal for the '{@link CSMN.Characteristics.Asset.AssetType <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Characteristics.Asset.AssetType
		 * @see CSMN.Characteristics.Asset.impl.AssetPackageImpl#getAssetType()
		 * @generated
		 */
		EEnum ASSET_TYPE = eINSTANCE.getAssetType();

	}

} //AssetPackage
