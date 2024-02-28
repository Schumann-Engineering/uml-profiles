/**
 */
package engineering.schumann.uml.profile.csmn;

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
 * @see engineering.schumann.uml.profile.csmn.CSMNFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CSMN'"
 * @generated
 */
public interface CSMNPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "csmn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schumann.engineering/csmn/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "csmn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CSMNPackage eINSTANCE = engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl.init();

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.SystemElementImpl <em>System Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.SystemElementImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getSystemElement()
	 * @generated
	 */
	int SYSTEM_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT__BASE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Platform Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT__PLATFORM_TYPE = 1;

	/**
	 * The number of structural features of the '<em>System Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>System Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.UserImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getUser()
	 * @generated
	 */
	int USER = 1;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__BASE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>User Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Use Filled Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USE_FILLED_ICON = 2;

	/**
	 * The feature id for the '<em><b>Base Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__BASE_ACTOR = 3;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.EnvironmentElementImpl <em>Environment Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.EnvironmentElementImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getEnvironmentElement()
	 * @generated
	 */
	int ENVIRONMENT_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ELEMENT__BASE_COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Environment Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Environment Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.SecurityZoneImpl <em>Security Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.SecurityZoneImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getSecurityZone()
	 * @generated
	 */
	int SECURITY_ZONE = 3;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ZONE__BASE_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ZONE__BASE_COMPONENT = 1;

	/**
	 * The number of structural features of the '<em>Security Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ZONE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Security Zone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_ZONE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.BoxImpl <em>Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.BoxImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getBox()
	 * @generated
	 */
	int BOX = 4;

	/**
	 * The feature id for the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__BASE_COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX__BASE_PACKAGE = 1;

	/**
	 * The number of structural features of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.EnvironmentLibraryImpl <em>Environment Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.EnvironmentLibraryImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getEnvironmentLibrary()
	 * @generated
	 */
	int ENVIRONMENT_LIBRARY = 5;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_LIBRARY__BASE_PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Environment Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_LIBRARY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Environment Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.ConnectionImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 6;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__BASE_DEPENDENCY = 0;

	/**
	 * The feature id for the '<em><b>Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__CONNECTION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Direction Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DIRECTION_PRIMARY = 2;

	/**
	 * The feature id for the '<em><b>Direction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__DIRECTION_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Flow To Client</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__FLOW_TO_CLIENT = 4;

	/**
	 * The feature id for the '<em><b>Flow To Supplier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__FLOW_TO_SUPPLIER = 5;

	/**
	 * The feature id for the '<em><b>Is Real Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__IS_REAL_TIME = 6;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PURPOSE = 7;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.Size_TImpl <em>Size T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.Size_TImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getSize_T()
	 * @generated
	 */
	int SIZE_T = 7;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_T__SIZE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_T__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Size T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_T_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Size T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_T_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.BandwidthImpl <em>Bandwidth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.BandwidthImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getBandwidth()
	 * @generated
	 */
	int BANDWIDTH = 8;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH__SIZE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Bandwidth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bandwidth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.ScopeImpl <em>Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.ScopeImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 9;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__BASE_NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__PRODUCT = 1;

	/**
	 * The number of structural features of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.CommonPlatformEnumerationImpl <em>Common Platform Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.CommonPlatformEnumerationImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getCommonPlatformEnumeration()
	 * @generated
	 */
	int COMMON_PLATFORM_ENUMERATION = 11;

	/**
	 * The feature id for the '<em><b>Platform Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_PLATFORM_ENUMERATION__PLATFORM_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Vendor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_PLATFORM_ENUMERATION__VENDOR_NAME = 1;

	/**
	 * The feature id for the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_PLATFORM_ENUMERATION__PRODUCT_NAME = 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_PLATFORM_ENUMERATION__MODEL = 3;

	/**
	 * The number of structural features of the '<em>Common Platform Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_PLATFORM_ENUMERATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Common Platform Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_PLATFORM_ENUMERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.ProductImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 10;

	/**
	 * The feature id for the '<em><b>Platform Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PLATFORM_TYPE = COMMON_PLATFORM_ENUMERATION__PLATFORM_TYPE;

	/**
	 * The feature id for the '<em><b>Vendor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__VENDOR_NAME = COMMON_PLATFORM_ENUMERATION__VENDOR_NAME;

	/**
	 * The feature id for the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PRODUCT_NAME = COMMON_PLATFORM_ENUMERATION__PRODUCT_NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__MODEL = COMMON_PLATFORM_ENUMERATION__MODEL;

	/**
	 * The feature id for the '<em><b>Udi Di</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__UDI_DI = COMMON_PLATFORM_ENUMERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Udi Di Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__UDI_DI_BASE = COMMON_PLATFORM_ENUMERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = COMMON_PLATFORM_ENUMERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = COMMON_PLATFORM_ENUMERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.ScopeConstraintImpl <em>Scope Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.ScopeConstraintImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getScopeConstraint()
	 * @generated
	 */
	int SCOPE_CONSTRAINT = 12;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_CONSTRAINT__BASE_NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Product Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_CONSTRAINT__PRODUCT_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Constraint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_CONSTRAINT__CONSTRAINT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Software Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_CONSTRAINT__SOFTWARE_CONSTRAINT = 3;

	/**
	 * The number of structural features of the '<em>Scope Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Scope Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.ProductConstraintImpl <em>Product Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.ProductConstraintImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getProductConstraint()
	 * @generated
	 */
	int PRODUCT_CONSTRAINT = 13;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONSTRAINT__MODEL = 0;

	/**
	 * The number of structural features of the '<em>Product Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Product Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.AssetImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 15;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.AssetLibraryImpl <em>Asset Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.AssetLibraryImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getAssetLibrary()
	 * @generated
	 */
	int ASSET_LIBRARY = 16;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.EnergyCharacteristicImpl <em>Energy Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.EnergyCharacteristicImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getEnergyCharacteristic()
	 * @generated
	 */
	int ENERGY_CHARACTERISTIC = 17;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.FlowCharacteristicImpl <em>Flow Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.FlowCharacteristicImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getFlowCharacteristic()
	 * @generated
	 */
	int FLOW_CHARACTERISTIC = 19;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.OsiCharacteristicImpl <em>Osi Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.OsiCharacteristicImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getOsiCharacteristic()
	 * @generated
	 */
	int OSI_CHARACTERISTIC = 18;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.TcpCharacteristicImpl <em>Tcp Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.TcpCharacteristicImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getTcpCharacteristic()
	 * @generated
	 */
	int TCP_CHARACTERISTIC = 20;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.InterfaceCharacteristicImpl <em>Interface Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.InterfaceCharacteristicImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getInterfaceCharacteristic()
	 * @generated
	 */
	int INTERFACE_CHARACTERISTIC = 21;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.BandwidthCharacteristicImpl <em>Bandwidth Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.BandwidthCharacteristicImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getBandwidthCharacteristic()
	 * @generated
	 */
	int BANDWIDTH_CHARACTERISTIC = 22;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.FirewallCharacteristicImpl <em>Firewall Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.FirewallCharacteristicImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getFirewallCharacteristic()
	 * @generated
	 */
	int FIREWALL_CHARACTERISTIC = 23;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.MaterialCharacteristicImpl <em>Material Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.MaterialCharacteristicImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getMaterialCharacteristic()
	 * @generated
	 */
	int MATERIAL_CHARACTERISTIC = 24;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.Iec62443SecurityLevelCharacteristicImpl <em>Iec62443 Security Level Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.Iec62443SecurityLevelCharacteristicImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getIec62443SecurityLevelCharacteristic()
	 * @generated
	 */
	int IEC62443_SECURITY_LEVEL_CHARACTERISTIC = 25;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.SecurityLevelImpl <em>Security Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.SecurityLevelImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getSecurityLevel()
	 * @generated
	 */
	int SECURITY_LEVEL = 26;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.CpeCharacteristicImpl <em>Cpe Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.CpeCharacteristicImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getCpeCharacteristic()
	 * @generated
	 */
	int CPE_CHARACTERISTIC = 27;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.StorageCharacteristicImpl <em>Storage Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.StorageCharacteristicImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getStorageCharacteristic()
	 * @generated
	 */
	int STORAGE_CHARACTERISTIC = 28;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.AccessCharacteristicImpl <em>Access Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.AccessCharacteristicImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getAccessCharacteristic()
	 * @generated
	 */
	int ACCESS_CHARACTERISTIC = 29;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.UsageCharacteristicImpl <em>Usage Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.UsageCharacteristicImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getUsageCharacteristic()
	 * @generated
	 */
	int USAGE_CHARACTERISTIC = 30;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.impl.SoftwareConstraintImpl <em>Software Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.impl.SoftwareConstraintImpl
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getSoftwareConstraint()
	 * @generated
	 */
	int SOFTWARE_CONSTRAINT = 14;

	/**
	 * The feature id for the '<em><b>Software Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONSTRAINT__SOFTWARE_VERSION = 0;

	/**
	 * The number of structural features of the '<em>Software Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONSTRAINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Software Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__BASE_NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Asset Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ASSET_SPEC = 1;

	/**
	 * The feature id for the '<em><b>Asset Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ASSET_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Flight Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__FLIGHT_LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Asset Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ASSET_CATEGORY = 4;

	/**
	 * The feature id for the '<em><b>Protection Goal</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__PROTECTION_GOAL = 5;

	/**
	 * The feature id for the '<em><b>Stride</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__STRIDE = 6;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_LIBRARY__BASE_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Asset Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_LIBRARY__ASSET_SPEC = 1;

	/**
	 * The feature id for the '<em><b>Asset Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_LIBRARY__ASSET_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Asset Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_LIBRARY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Asset Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CHARACTERISTIC__BASE_PORT = 0;

	/**
	 * The feature id for the '<em><b>Energy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CHARACTERISTIC__ENERGY_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CHARACTERISTIC__BASE_DEPENDENCY = 2;

	/**
	 * The number of structural features of the '<em>Energy Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CHARACTERISTIC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Energy Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_CHARACTERISTIC_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CHARACTERISTIC__BASE_DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Flow Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CHARACTERISTIC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Flow Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_CHARACTERISTIC_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI_CHARACTERISTIC__BASE_DEPENDENCY = FLOW_CHARACTERISTIC__BASE_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI_CHARACTERISTIC__APPLICATION = FLOW_CHARACTERISTIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Presentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI_CHARACTERISTIC__PRESENTATION = FLOW_CHARACTERISTIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Session</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI_CHARACTERISTIC__SESSION = FLOW_CHARACTERISTIC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI_CHARACTERISTIC__TRANSPORT = FLOW_CHARACTERISTIC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI_CHARACTERISTIC__NETWORK = FLOW_CHARACTERISTIC_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Data Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI_CHARACTERISTIC__DATA_LINK = FLOW_CHARACTERISTIC_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Physical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI_CHARACTERISTIC__PHYSICAL = FLOW_CHARACTERISTIC_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Osi Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI_CHARACTERISTIC_FEATURE_COUNT = FLOW_CHARACTERISTIC_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Osi Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI_CHARACTERISTIC_OPERATION_COUNT = FLOW_CHARACTERISTIC_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_CHARACTERISTIC__BASE_DEPENDENCY = FLOW_CHARACTERISTIC__BASE_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_CHARACTERISTIC__APPLICATION = FLOW_CHARACTERISTIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_CHARACTERISTIC__TRANSPORT = FLOW_CHARACTERISTIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_CHARACTERISTIC__NETWORK = FLOW_CHARACTERISTIC_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_CHARACTERISTIC__DATA_LINK = FLOW_CHARACTERISTIC_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Physical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_CHARACTERISTIC__PHYSICAL = FLOW_CHARACTERISTIC_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Tcp Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_CHARACTERISTIC_FEATURE_COUNT = FLOW_CHARACTERISTIC_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Tcp Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCP_CHARACTERISTIC_OPERATION_COUNT = FLOW_CHARACTERISTIC_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CHARACTERISTIC__BASE_PORT = 0;

	/**
	 * The feature id for the '<em><b>Interface Connector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CHARACTERISTIC__INTERFACE_CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CHARACTERISTIC__INTERFACE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CHARACTERISTIC__PURPOSE = 3;

	/**
	 * The number of structural features of the '<em>Interface Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CHARACTERISTIC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Interface Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CHARACTERISTIC_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH_CHARACTERISTIC__BASE_PORT = 0;

	/**
	 * The feature id for the '<em><b>Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH_CHARACTERISTIC__BANDWIDTH = 1;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH_CHARACTERISTIC__BASE_DEPENDENCY = 2;

	/**
	 * The number of structural features of the '<em>Bandwidth Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH_CHARACTERISTIC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Bandwidth Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH_CHARACTERISTIC_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_CHARACTERISTIC__BASE_PORT = 0;

	/**
	 * The number of structural features of the '<em>Firewall Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_CHARACTERISTIC_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Firewall Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIREWALL_CHARACTERISTIC_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_CHARACTERISTIC__BASE_PORT = 0;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_CHARACTERISTIC__BASE_DEPENDENCY = 1;

	/**
	 * The feature id for the '<em><b>Material Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_CHARACTERISTIC__MATERIAL_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Material Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_CHARACTERISTIC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Material Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATERIAL_CHARACTERISTIC_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC62443_SECURITY_LEVEL_CHARACTERISTIC__BASE_NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Securitylevel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC62443_SECURITY_LEVEL_CHARACTERISTIC__SECURITYLEVEL = 1;

	/**
	 * The number of structural features of the '<em>Iec62443 Security Level Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC62443_SECURITY_LEVEL_CHARACTERISTIC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Iec62443 Security Level Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEC62443_SECURITY_LEVEL_CHARACTERISTIC_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Foundational Requirement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL__FOUNDATIONAL_REQUIREMENT = 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL__LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Rational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL__RATIONAL = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Vector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL__VECTOR = 4;

	/**
	 * The number of structural features of the '<em>Security Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Security Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPE_CHARACTERISTIC__BASE_NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Cpe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPE_CHARACTERISTIC__CPE = 1;

	/**
	 * The number of structural features of the '<em>Cpe Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPE_CHARACTERISTIC_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cpe Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPE_CHARACTERISTIC_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CHARACTERISTIC__BASE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CHARACTERISTIC__BASE_PORT = 1;

	/**
	 * The feature id for the '<em><b>Encryption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CHARACTERISTIC__ENCRYPTION = 2;

	/**
	 * The feature id for the '<em><b>Storage Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CHARACTERISTIC__STORAGE_FORMAT = 3;

	/**
	 * The feature id for the '<em><b>Storage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CHARACTERISTIC__STORAGE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Storage Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CHARACTERISTIC__STORAGE_NAME = 5;

	/**
	 * The feature id for the '<em><b>Total Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CHARACTERISTIC__TOTAL_SIZE = 6;

	/**
	 * The number of structural features of the '<em>Storage Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CHARACTERISTIC_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Storage Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORAGE_CHARACTERISTIC_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CHARACTERISTIC__BASE_NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Functional Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CHARACTERISTIC__FUNCTIONAL_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Functional Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CHARACTERISTIC__FUNCTIONAL_SPEC = 2;

	/**
	 * The feature id for the '<em><b>Mechanical Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CHARACTERISTIC__MECHANICAL_LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Mechanical Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CHARACTERISTIC__MECHANICAL_SPEC = 4;

	/**
	 * The number of structural features of the '<em>Access Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CHARACTERISTIC_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Access Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_CHARACTERISTIC_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CHARACTERISTIC__BASE_NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Intended User Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CHARACTERISTIC__INTENDED_USER_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Usage Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CHARACTERISTIC__USAGE_SPEC = 2;

	/**
	 * The feature id for the '<em><b>Usage Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CHARACTERISTIC__USAGE_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Usage Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CHARACTERISTIC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Usage Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USAGE_CHARACTERISTIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.UserType <em>User Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.UserType
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getUserType()
	 * @generated
	 */
	int USER_TYPE = 32;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.ConnectionType <em>Connection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.ConnectionType
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getConnectionType()
	 * @generated
	 */
	int CONNECTION_TYPE = 33;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.DirectionOfPrimaryFlow <em>Direction Of Primary Flow</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.DirectionOfPrimaryFlow
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getDirectionOfPrimaryFlow()
	 * @generated
	 */
	int DIRECTION_OF_PRIMARY_FLOW = 34;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.DirectionType <em>Direction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.DirectionType
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getDirectionType()
	 * @generated
	 */
	int DIRECTION_TYPE = 35;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.SizeUnitOfMeasure <em>Size Unit Of Measure</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.SizeUnitOfMeasure
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getSizeUnitOfMeasure()
	 * @generated
	 */
	int SIZE_UNIT_OF_MEASURE = 36;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.SpeedUnitOfMeasurement <em>Speed Unit Of Measurement</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.SpeedUnitOfMeasurement
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getSpeedUnitOfMeasurement()
	 * @generated
	 */
	int SPEED_UNIT_OF_MEASUREMENT = 37;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.CommonPlatformEnumerationType <em>Common Platform Enumeration Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.CommonPlatformEnumerationType
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getCommonPlatformEnumerationType()
	 * @generated
	 */
	int COMMON_PLATFORM_ENUMERATION_TYPE = 31;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.ScopeConstraintType <em>Scope Constraint Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.ScopeConstraintType
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getScopeConstraintType()
	 * @generated
	 */
	int SCOPE_CONSTRAINT_TYPE = 38;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.AssetType <em>Asset Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.AssetType
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getAssetType()
	 * @generated
	 */
	int ASSET_TYPE = 39;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.AssetFlightLevel <em>Asset Flight Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.AssetFlightLevel
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getAssetFlightLevel()
	 * @generated
	 */
	int ASSET_FLIGHT_LEVEL = 40;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.AssetCategory <em>Asset Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.AssetCategory
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getAssetCategory()
	 * @generated
	 */
	int ASSET_CATEGORY = 41;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.ProtectionGoal <em>Protection Goal</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.ProtectionGoal
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getProtectionGoal()
	 * @generated
	 */
	int PROTECTION_GOAL = 42;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.STRIDE <em>STRIDE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.STRIDE
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getSTRIDE()
	 * @generated
	 */
	int STRIDE = 43;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.EnergyType <em>Energy Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.EnergyType
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getEnergyType()
	 * @generated
	 */
	int ENERGY_TYPE = 44;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.InterfaceConnector <em>Interface Connector</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.InterfaceConnector
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getInterfaceConnector()
	 * @generated
	 */
	int INTERFACE_CONNECTOR = 45;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.InterfaceType <em>Interface Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.InterfaceType
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getInterfaceType()
	 * @generated
	 */
	int INTERFACE_TYPE = 46;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.Iec62443SecurityLevel <em>Iec62443 Security Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.Iec62443SecurityLevel
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getIec62443SecurityLevel()
	 * @generated
	 */
	int IEC62443_SECURITY_LEVEL = 47;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.Iec62443FoundationalRequirementType <em>Iec62443 Foundational Requirement Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.Iec62443FoundationalRequirementType
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getIec62443FoundationalRequirementType()
	 * @generated
	 */
	int IEC62443_FOUNDATIONAL_REQUIREMENT_TYPE = 48;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.Iec62443SecurityLevelType <em>Iec62443 Security Level Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.Iec62443SecurityLevelType
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getIec62443SecurityLevelType()
	 * @generated
	 */
	int IEC62443_SECURITY_LEVEL_TYPE = 49;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.StorageType <em>Storage Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.StorageType
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getStorageType()
	 * @generated
	 */
	int STORAGE_TYPE = 50;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.FunctionalAccessLevel <em>Functional Access Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.FunctionalAccessLevel
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getFunctionalAccessLevel()
	 * @generated
	 */
	int FUNCTIONAL_ACCESS_LEVEL = 51;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.MechanicalAccessLevel <em>Mechanical Access Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.MechanicalAccessLevel
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getMechanicalAccessLevel()
	 * @generated
	 */
	int MECHANICAL_ACCESS_LEVEL = 52;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.profile.csmn.UsageType <em>Usage Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.profile.csmn.UsageType
	 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getUsageType()
	 * @generated
	 */
	int USAGE_TYPE = 53;


	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.SystemElement <em>System Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Element</em>'.
	 * @see engineering.schumann.uml.profile.csmn.SystemElement
	 * @generated
	 */
	EClass getSystemElement();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.SystemElement#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see engineering.schumann.uml.profile.csmn.SystemElement#getBase_Component()
	 * @see #getSystemElement()
	 * @generated
	 */
	EReference getSystemElement_Base_Component();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.SystemElement#getPlatformType <em>Platform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform Type</em>'.
	 * @see engineering.schumann.uml.profile.csmn.SystemElement#getPlatformType()
	 * @see #getSystemElement()
	 * @generated
	 */
	EAttribute getSystemElement_PlatformType();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see engineering.schumann.uml.profile.csmn.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.User#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see engineering.schumann.uml.profile.csmn.User#getBase_Component()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Base_Component();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.User#getUserType <em>User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Type</em>'.
	 * @see engineering.schumann.uml.profile.csmn.User#getUserType()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserType();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.User#isUseFilledIcon <em>Use Filled Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Filled Icon</em>'.
	 * @see engineering.schumann.uml.profile.csmn.User#isUseFilledIcon()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UseFilledIcon();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.User#getBase_Actor <em>Base Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Actor</em>'.
	 * @see engineering.schumann.uml.profile.csmn.User#getBase_Actor()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Base_Actor();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.EnvironmentElement <em>Environment Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Element</em>'.
	 * @see engineering.schumann.uml.profile.csmn.EnvironmentElement
	 * @generated
	 */
	EClass getEnvironmentElement();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.EnvironmentElement#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see engineering.schumann.uml.profile.csmn.EnvironmentElement#getBase_Component()
	 * @see #getEnvironmentElement()
	 * @generated
	 */
	EReference getEnvironmentElement_Base_Component();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.SecurityZone <em>Security Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Zone</em>'.
	 * @see engineering.schumann.uml.profile.csmn.SecurityZone
	 * @generated
	 */
	EClass getSecurityZone();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.SecurityZone#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see engineering.schumann.uml.profile.csmn.SecurityZone#getBase_Package()
	 * @see #getSecurityZone()
	 * @generated
	 */
	EReference getSecurityZone_Base_Package();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.SecurityZone#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see engineering.schumann.uml.profile.csmn.SecurityZone#getBase_Component()
	 * @see #getSecurityZone()
	 * @generated
	 */
	EReference getSecurityZone_Base_Component();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.Box <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Box</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Box
	 * @generated
	 */
	EClass getBox();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.Box#getBase_Comment <em>Base Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Comment</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Box#getBase_Comment()
	 * @see #getBox()
	 * @generated
	 */
	EReference getBox_Base_Comment();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.Box#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Box#getBase_Package()
	 * @see #getBox()
	 * @generated
	 */
	EReference getBox_Base_Package();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.EnvironmentLibrary <em>Environment Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Library</em>'.
	 * @see engineering.schumann.uml.profile.csmn.EnvironmentLibrary
	 * @generated
	 */
	EClass getEnvironmentLibrary();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.EnvironmentLibrary#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see engineering.schumann.uml.profile.csmn.EnvironmentLibrary#getBase_Package()
	 * @see #getEnvironmentLibrary()
	 * @generated
	 */
	EReference getEnvironmentLibrary_Base_Package();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.Connection#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Connection#getBase_Dependency()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_Base_Dependency();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.Connection#getConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Type</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Connection#getConnectionType()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_ConnectionType();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.Connection#getDirectionPrimary <em>Direction Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction Primary</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Connection#getDirectionPrimary()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_DirectionPrimary();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.Connection#getDirectionType <em>Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction Type</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Connection#getDirectionType()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_DirectionType();

	/**
	 * Returns the meta object for the reference list '{@link engineering.schumann.uml.profile.csmn.Connection#getFlowToClient <em>Flow To Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flow To Client</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Connection#getFlowToClient()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_FlowToClient();

	/**
	 * Returns the meta object for the reference list '{@link engineering.schumann.uml.profile.csmn.Connection#getFlowToSupplier <em>Flow To Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Flow To Supplier</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Connection#getFlowToSupplier()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_FlowToSupplier();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.Connection#isRealTime <em>Is Real Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Real Time</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Connection#isRealTime()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_IsRealTime();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.Connection#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Connection#getPurpose()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Purpose();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.Size_T <em>Size T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Size T</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Size_T
	 * @generated
	 */
	EClass getSize_T();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.Size_T#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Size_T#getSize()
	 * @see #getSize_T()
	 * @generated
	 */
	EAttribute getSize_T_Size();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.Size_T#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Size_T#getUnit()
	 * @see #getSize_T()
	 * @generated
	 */
	EAttribute getSize_T_Unit();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.Bandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bandwidth</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Bandwidth
	 * @generated
	 */
	EClass getBandwidth();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.Bandwidth#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Bandwidth#getSize()
	 * @see #getBandwidth()
	 * @generated
	 */
	EAttribute getBandwidth_Size();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.Bandwidth#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Bandwidth#getUnit()
	 * @see #getBandwidth()
	 * @generated
	 */
	EAttribute getBandwidth_Unit();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Scope
	 * @generated
	 */
	EClass getScope();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.Scope#getBase_NamedElement <em>Base Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Named Element</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Scope#getBase_NamedElement()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Base_NamedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link engineering.schumann.uml.profile.csmn.Scope#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Scope#getProduct()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Product();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.Product#getUdiDi <em>Udi Di</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Udi Di</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Product#getUdiDi()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_UdiDi();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.Product#getUdiDiBase <em>Udi Di Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Udi Di Base</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Product#getUdiDiBase()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_UdiDiBase();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.CommonPlatformEnumeration <em>Common Platform Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Platform Enumeration</em>'.
	 * @see engineering.schumann.uml.profile.csmn.CommonPlatformEnumeration
	 * @generated
	 */
	EClass getCommonPlatformEnumeration();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.CommonPlatformEnumeration#getPlatformType <em>Platform Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform Type</em>'.
	 * @see engineering.schumann.uml.profile.csmn.CommonPlatformEnumeration#getPlatformType()
	 * @see #getCommonPlatformEnumeration()
	 * @generated
	 */
	EAttribute getCommonPlatformEnumeration_PlatformType();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.CommonPlatformEnumeration#getVendorName <em>Vendor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor Name</em>'.
	 * @see engineering.schumann.uml.profile.csmn.CommonPlatformEnumeration#getVendorName()
	 * @see #getCommonPlatformEnumeration()
	 * @generated
	 */
	EAttribute getCommonPlatformEnumeration_VendorName();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.CommonPlatformEnumeration#getProductName <em>Product Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Name</em>'.
	 * @see engineering.schumann.uml.profile.csmn.CommonPlatformEnumeration#getProductName()
	 * @see #getCommonPlatformEnumeration()
	 * @generated
	 */
	EAttribute getCommonPlatformEnumeration_ProductName();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.CommonPlatformEnumeration#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see engineering.schumann.uml.profile.csmn.CommonPlatformEnumeration#getModel()
	 * @see #getCommonPlatformEnumeration()
	 * @generated
	 */
	EAttribute getCommonPlatformEnumeration_Model();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.ScopeConstraint <em>Scope Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope Constraint</em>'.
	 * @see engineering.schumann.uml.profile.csmn.ScopeConstraint
	 * @generated
	 */
	EClass getScopeConstraint();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.ScopeConstraint#getBase_NamedElement <em>Base Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Named Element</em>'.
	 * @see engineering.schumann.uml.profile.csmn.ScopeConstraint#getBase_NamedElement()
	 * @see #getScopeConstraint()
	 * @generated
	 */
	EReference getScopeConstraint_Base_NamedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link engineering.schumann.uml.profile.csmn.ScopeConstraint#getProductConstraint <em>Product Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product Constraint</em>'.
	 * @see engineering.schumann.uml.profile.csmn.ScopeConstraint#getProductConstraint()
	 * @see #getScopeConstraint()
	 * @generated
	 */
	EReference getScopeConstraint_ProductConstraint();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.ScopeConstraint#getConstraintType <em>Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Type</em>'.
	 * @see engineering.schumann.uml.profile.csmn.ScopeConstraint#getConstraintType()
	 * @see #getScopeConstraint()
	 * @generated
	 */
	EAttribute getScopeConstraint_ConstraintType();

	/**
	 * Returns the meta object for the containment reference list '{@link engineering.schumann.uml.profile.csmn.ScopeConstraint#getSoftwareConstraint <em>Software Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Software Constraint</em>'.
	 * @see engineering.schumann.uml.profile.csmn.ScopeConstraint#getSoftwareConstraint()
	 * @see #getScopeConstraint()
	 * @generated
	 */
	EReference getScopeConstraint_SoftwareConstraint();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.ProductConstraint <em>Product Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Constraint</em>'.
	 * @see engineering.schumann.uml.profile.csmn.ProductConstraint
	 * @generated
	 */
	EClass getProductConstraint();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.ProductConstraint#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see engineering.schumann.uml.profile.csmn.ProductConstraint#getModel()
	 * @see #getProductConstraint()
	 * @generated
	 */
	EAttribute getProductConstraint_Model();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.Asset#getAssetType <em>Asset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset Type</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Asset#getAssetType()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_AssetType();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.Asset#getFlightLevel <em>Flight Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flight Level</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Asset#getFlightLevel()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_FlightLevel();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.Asset#getAssetCategory <em>Asset Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset Category</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Asset#getAssetCategory()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_AssetCategory();

	/**
	 * Returns the meta object for the attribute list '{@link engineering.schumann.uml.profile.csmn.Asset#getProtectionGoal <em>Protection Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Protection Goal</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Asset#getProtectionGoal()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_ProtectionGoal();

	/**
	 * Returns the meta object for the attribute list '{@link engineering.schumann.uml.profile.csmn.Asset#getStride <em>Stride</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Stride</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Asset#getStride()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Stride();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.Asset#getBase_NamedElement <em>Base Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Named Element</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Asset#getBase_NamedElement()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Base_NamedElement();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.Asset#getAssetSpec <em>Asset Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset Spec</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Asset#getAssetSpec()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_AssetSpec();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.AssetLibrary <em>Asset Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Library</em>'.
	 * @see engineering.schumann.uml.profile.csmn.AssetLibrary
	 * @generated
	 */
	EClass getAssetLibrary();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.AssetLibrary#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see engineering.schumann.uml.profile.csmn.AssetLibrary#getBase_Package()
	 * @see #getAssetLibrary()
	 * @generated
	 */
	EReference getAssetLibrary_Base_Package();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.AssetLibrary#getAssetSpec <em>Asset Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset Spec</em>'.
	 * @see engineering.schumann.uml.profile.csmn.AssetLibrary#getAssetSpec()
	 * @see #getAssetLibrary()
	 * @generated
	 */
	EAttribute getAssetLibrary_AssetSpec();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.AssetLibrary#getAssetType <em>Asset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset Type</em>'.
	 * @see engineering.schumann.uml.profile.csmn.AssetLibrary#getAssetType()
	 * @see #getAssetLibrary()
	 * @generated
	 */
	EAttribute getAssetLibrary_AssetType();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.EnergyCharacteristic <em>Energy Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Characteristic</em>'.
	 * @see engineering.schumann.uml.profile.csmn.EnergyCharacteristic
	 * @generated
	 */
	EClass getEnergyCharacteristic();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.EnergyCharacteristic#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see engineering.schumann.uml.profile.csmn.EnergyCharacteristic#getBase_Port()
	 * @see #getEnergyCharacteristic()
	 * @generated
	 */
	EReference getEnergyCharacteristic_Base_Port();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.EnergyCharacteristic#getEnergyType <em>Energy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Energy Type</em>'.
	 * @see engineering.schumann.uml.profile.csmn.EnergyCharacteristic#getEnergyType()
	 * @see #getEnergyCharacteristic()
	 * @generated
	 */
	EAttribute getEnergyCharacteristic_EnergyType();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.EnergyCharacteristic#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see engineering.schumann.uml.profile.csmn.EnergyCharacteristic#getBase_Dependency()
	 * @see #getEnergyCharacteristic()
	 * @generated
	 */
	EReference getEnergyCharacteristic_Base_Dependency();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.OsiCharacteristic <em>Osi Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Osi Characteristic</em>'.
	 * @see engineering.schumann.uml.profile.csmn.OsiCharacteristic
	 * @generated
	 */
	EClass getOsiCharacteristic();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.OsiCharacteristic#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application</em>'.
	 * @see engineering.schumann.uml.profile.csmn.OsiCharacteristic#getApplication()
	 * @see #getOsiCharacteristic()
	 * @generated
	 */
	EAttribute getOsiCharacteristic_Application();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.OsiCharacteristic#getPresentation <em>Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presentation</em>'.
	 * @see engineering.schumann.uml.profile.csmn.OsiCharacteristic#getPresentation()
	 * @see #getOsiCharacteristic()
	 * @generated
	 */
	EAttribute getOsiCharacteristic_Presentation();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.OsiCharacteristic#getSession <em>Session</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session</em>'.
	 * @see engineering.schumann.uml.profile.csmn.OsiCharacteristic#getSession()
	 * @see #getOsiCharacteristic()
	 * @generated
	 */
	EAttribute getOsiCharacteristic_Session();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.OsiCharacteristic#getTransport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transport</em>'.
	 * @see engineering.schumann.uml.profile.csmn.OsiCharacteristic#getTransport()
	 * @see #getOsiCharacteristic()
	 * @generated
	 */
	EAttribute getOsiCharacteristic_Transport();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.OsiCharacteristic#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network</em>'.
	 * @see engineering.schumann.uml.profile.csmn.OsiCharacteristic#getNetwork()
	 * @see #getOsiCharacteristic()
	 * @generated
	 */
	EAttribute getOsiCharacteristic_Network();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.OsiCharacteristic#getDataLink <em>Data Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Link</em>'.
	 * @see engineering.schumann.uml.profile.csmn.OsiCharacteristic#getDataLink()
	 * @see #getOsiCharacteristic()
	 * @generated
	 */
	EAttribute getOsiCharacteristic_DataLink();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.OsiCharacteristic#getPhysical <em>Physical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical</em>'.
	 * @see engineering.schumann.uml.profile.csmn.OsiCharacteristic#getPhysical()
	 * @see #getOsiCharacteristic()
	 * @generated
	 */
	EAttribute getOsiCharacteristic_Physical();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.FlowCharacteristic <em>Flow Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Characteristic</em>'.
	 * @see engineering.schumann.uml.profile.csmn.FlowCharacteristic
	 * @generated
	 */
	EClass getFlowCharacteristic();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.FlowCharacteristic#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see engineering.schumann.uml.profile.csmn.FlowCharacteristic#getBase_Dependency()
	 * @see #getFlowCharacteristic()
	 * @generated
	 */
	EReference getFlowCharacteristic_Base_Dependency();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.TcpCharacteristic <em>Tcp Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tcp Characteristic</em>'.
	 * @see engineering.schumann.uml.profile.csmn.TcpCharacteristic
	 * @generated
	 */
	EClass getTcpCharacteristic();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.TcpCharacteristic#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application</em>'.
	 * @see engineering.schumann.uml.profile.csmn.TcpCharacteristic#getApplication()
	 * @see #getTcpCharacteristic()
	 * @generated
	 */
	EAttribute getTcpCharacteristic_Application();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.TcpCharacteristic#getTransport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transport</em>'.
	 * @see engineering.schumann.uml.profile.csmn.TcpCharacteristic#getTransport()
	 * @see #getTcpCharacteristic()
	 * @generated
	 */
	EAttribute getTcpCharacteristic_Transport();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.TcpCharacteristic#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network</em>'.
	 * @see engineering.schumann.uml.profile.csmn.TcpCharacteristic#getNetwork()
	 * @see #getTcpCharacteristic()
	 * @generated
	 */
	EAttribute getTcpCharacteristic_Network();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.TcpCharacteristic#getDataLink <em>Data Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Link</em>'.
	 * @see engineering.schumann.uml.profile.csmn.TcpCharacteristic#getDataLink()
	 * @see #getTcpCharacteristic()
	 * @generated
	 */
	EAttribute getTcpCharacteristic_DataLink();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.TcpCharacteristic#getPhysical <em>Physical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical</em>'.
	 * @see engineering.schumann.uml.profile.csmn.TcpCharacteristic#getPhysical()
	 * @see #getTcpCharacteristic()
	 * @generated
	 */
	EAttribute getTcpCharacteristic_Physical();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.InterfaceCharacteristic <em>Interface Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Characteristic</em>'.
	 * @see engineering.schumann.uml.profile.csmn.InterfaceCharacteristic
	 * @generated
	 */
	EClass getInterfaceCharacteristic();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.InterfaceCharacteristic#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see engineering.schumann.uml.profile.csmn.InterfaceCharacteristic#getBase_Port()
	 * @see #getInterfaceCharacteristic()
	 * @generated
	 */
	EReference getInterfaceCharacteristic_Base_Port();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.InterfaceCharacteristic#getInterfaceConnector <em>Interface Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Connector</em>'.
	 * @see engineering.schumann.uml.profile.csmn.InterfaceCharacteristic#getInterfaceConnector()
	 * @see #getInterfaceCharacteristic()
	 * @generated
	 */
	EAttribute getInterfaceCharacteristic_InterfaceConnector();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.InterfaceCharacteristic#getInterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Type</em>'.
	 * @see engineering.schumann.uml.profile.csmn.InterfaceCharacteristic#getInterfaceType()
	 * @see #getInterfaceCharacteristic()
	 * @generated
	 */
	EAttribute getInterfaceCharacteristic_InterfaceType();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.InterfaceCharacteristic#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see engineering.schumann.uml.profile.csmn.InterfaceCharacteristic#getPurpose()
	 * @see #getInterfaceCharacteristic()
	 * @generated
	 */
	EAttribute getInterfaceCharacteristic_Purpose();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.BandwidthCharacteristic <em>Bandwidth Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bandwidth Characteristic</em>'.
	 * @see engineering.schumann.uml.profile.csmn.BandwidthCharacteristic
	 * @generated
	 */
	EClass getBandwidthCharacteristic();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.BandwidthCharacteristic#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see engineering.schumann.uml.profile.csmn.BandwidthCharacteristic#getBase_Port()
	 * @see #getBandwidthCharacteristic()
	 * @generated
	 */
	EReference getBandwidthCharacteristic_Base_Port();

	/**
	 * Returns the meta object for the containment reference '{@link engineering.schumann.uml.profile.csmn.BandwidthCharacteristic#getBandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bandwidth</em>'.
	 * @see engineering.schumann.uml.profile.csmn.BandwidthCharacteristic#getBandwidth()
	 * @see #getBandwidthCharacteristic()
	 * @generated
	 */
	EReference getBandwidthCharacteristic_Bandwidth();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.BandwidthCharacteristic#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see engineering.schumann.uml.profile.csmn.BandwidthCharacteristic#getBase_Dependency()
	 * @see #getBandwidthCharacteristic()
	 * @generated
	 */
	EReference getBandwidthCharacteristic_Base_Dependency();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.FirewallCharacteristic <em>Firewall Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firewall Characteristic</em>'.
	 * @see engineering.schumann.uml.profile.csmn.FirewallCharacteristic
	 * @generated
	 */
	EClass getFirewallCharacteristic();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.FirewallCharacteristic#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see engineering.schumann.uml.profile.csmn.FirewallCharacteristic#getBase_Port()
	 * @see #getFirewallCharacteristic()
	 * @generated
	 */
	EReference getFirewallCharacteristic_Base_Port();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.MaterialCharacteristic <em>Material Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Material Characteristic</em>'.
	 * @see engineering.schumann.uml.profile.csmn.MaterialCharacteristic
	 * @generated
	 */
	EClass getMaterialCharacteristic();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.MaterialCharacteristic#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see engineering.schumann.uml.profile.csmn.MaterialCharacteristic#getBase_Port()
	 * @see #getMaterialCharacteristic()
	 * @generated
	 */
	EReference getMaterialCharacteristic_Base_Port();

	/**
	 * Returns the meta object for the reference list '{@link engineering.schumann.uml.profile.csmn.MaterialCharacteristic#getMaterialType <em>Material Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Material Type</em>'.
	 * @see engineering.schumann.uml.profile.csmn.MaterialCharacteristic#getMaterialType()
	 * @see #getMaterialCharacteristic()
	 * @generated
	 */
	EReference getMaterialCharacteristic_MaterialType();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.MaterialCharacteristic#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see engineering.schumann.uml.profile.csmn.MaterialCharacteristic#getBase_Dependency()
	 * @see #getMaterialCharacteristic()
	 * @generated
	 */
	EReference getMaterialCharacteristic_Base_Dependency();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.Iec62443SecurityLevelCharacteristic <em>Iec62443 Security Level Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iec62443 Security Level Characteristic</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Iec62443SecurityLevelCharacteristic
	 * @generated
	 */
	EClass getIec62443SecurityLevelCharacteristic();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.Iec62443SecurityLevelCharacteristic#getBase_NamedElement <em>Base Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Named Element</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Iec62443SecurityLevelCharacteristic#getBase_NamedElement()
	 * @see #getIec62443SecurityLevelCharacteristic()
	 * @generated
	 */
	EReference getIec62443SecurityLevelCharacteristic_Base_NamedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link engineering.schumann.uml.profile.csmn.Iec62443SecurityLevelCharacteristic#getSecuritylevel <em>Securitylevel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Securitylevel</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Iec62443SecurityLevelCharacteristic#getSecuritylevel()
	 * @see #getIec62443SecurityLevelCharacteristic()
	 * @generated
	 */
	EReference getIec62443SecurityLevelCharacteristic_Securitylevel();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.SecurityLevel <em>Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Level</em>'.
	 * @see engineering.schumann.uml.profile.csmn.SecurityLevel
	 * @generated
	 */
	EClass getSecurityLevel();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.SecurityLevel#getFoundationalRequirement <em>Foundational Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foundational Requirement</em>'.
	 * @see engineering.schumann.uml.profile.csmn.SecurityLevel#getFoundationalRequirement()
	 * @see #getSecurityLevel()
	 * @generated
	 */
	EAttribute getSecurityLevel_FoundationalRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link engineering.schumann.uml.profile.csmn.SecurityLevel#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Level</em>'.
	 * @see engineering.schumann.uml.profile.csmn.SecurityLevel#getLevel()
	 * @see #getSecurityLevel()
	 * @generated
	 */
	EReference getSecurityLevel_Level();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.SecurityLevel#getRational <em>Rational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rational</em>'.
	 * @see engineering.schumann.uml.profile.csmn.SecurityLevel#getRational()
	 * @see #getSecurityLevel()
	 * @generated
	 */
	EAttribute getSecurityLevel_Rational();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.SecurityLevel#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see engineering.schumann.uml.profile.csmn.SecurityLevel#getType()
	 * @see #getSecurityLevel()
	 * @generated
	 */
	EAttribute getSecurityLevel_Type();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.SecurityLevel#getVector <em>Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector</em>'.
	 * @see engineering.schumann.uml.profile.csmn.SecurityLevel#getVector()
	 * @see #getSecurityLevel()
	 * @generated
	 */
	EAttribute getSecurityLevel_Vector();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.CpeCharacteristic <em>Cpe Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cpe Characteristic</em>'.
	 * @see engineering.schumann.uml.profile.csmn.CpeCharacteristic
	 * @generated
	 */
	EClass getCpeCharacteristic();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.CpeCharacteristic#getBase_NamedElement <em>Base Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Named Element</em>'.
	 * @see engineering.schumann.uml.profile.csmn.CpeCharacteristic#getBase_NamedElement()
	 * @see #getCpeCharacteristic()
	 * @generated
	 */
	EReference getCpeCharacteristic_Base_NamedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link engineering.schumann.uml.profile.csmn.CpeCharacteristic#getCpe <em>Cpe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cpe</em>'.
	 * @see engineering.schumann.uml.profile.csmn.CpeCharacteristic#getCpe()
	 * @see #getCpeCharacteristic()
	 * @generated
	 */
	EReference getCpeCharacteristic_Cpe();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.StorageCharacteristic <em>Storage Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Characteristic</em>'.
	 * @see engineering.schumann.uml.profile.csmn.StorageCharacteristic
	 * @generated
	 */
	EClass getStorageCharacteristic();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.StorageCharacteristic#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see engineering.schumann.uml.profile.csmn.StorageCharacteristic#getBase_Component()
	 * @see #getStorageCharacteristic()
	 * @generated
	 */
	EReference getStorageCharacteristic_Base_Component();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.StorageCharacteristic#getBase_Port <em>Base Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Port</em>'.
	 * @see engineering.schumann.uml.profile.csmn.StorageCharacteristic#getBase_Port()
	 * @see #getStorageCharacteristic()
	 * @generated
	 */
	EReference getStorageCharacteristic_Base_Port();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.StorageCharacteristic#getEncryption <em>Encryption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encryption</em>'.
	 * @see engineering.schumann.uml.profile.csmn.StorageCharacteristic#getEncryption()
	 * @see #getStorageCharacteristic()
	 * @generated
	 */
	EAttribute getStorageCharacteristic_Encryption();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.StorageCharacteristic#getStorageFormat <em>Storage Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Format</em>'.
	 * @see engineering.schumann.uml.profile.csmn.StorageCharacteristic#getStorageFormat()
	 * @see #getStorageCharacteristic()
	 * @generated
	 */
	EAttribute getStorageCharacteristic_StorageFormat();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.StorageCharacteristic#getStorageType <em>Storage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Type</em>'.
	 * @see engineering.schumann.uml.profile.csmn.StorageCharacteristic#getStorageType()
	 * @see #getStorageCharacteristic()
	 * @generated
	 */
	EAttribute getStorageCharacteristic_StorageType();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.StorageCharacteristic#getStorageName <em>Storage Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Name</em>'.
	 * @see engineering.schumann.uml.profile.csmn.StorageCharacteristic#getStorageName()
	 * @see #getStorageCharacteristic()
	 * @generated
	 */
	EAttribute getStorageCharacteristic_StorageName();

	/**
	 * Returns the meta object for the containment reference '{@link engineering.schumann.uml.profile.csmn.StorageCharacteristic#getTotalSize <em>Total Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Total Size</em>'.
	 * @see engineering.schumann.uml.profile.csmn.StorageCharacteristic#getTotalSize()
	 * @see #getStorageCharacteristic()
	 * @generated
	 */
	EReference getStorageCharacteristic_TotalSize();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.AccessCharacteristic <em>Access Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Characteristic</em>'.
	 * @see engineering.schumann.uml.profile.csmn.AccessCharacteristic
	 * @generated
	 */
	EClass getAccessCharacteristic();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.AccessCharacteristic#getBase_NamedElement <em>Base Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Named Element</em>'.
	 * @see engineering.schumann.uml.profile.csmn.AccessCharacteristic#getBase_NamedElement()
	 * @see #getAccessCharacteristic()
	 * @generated
	 */
	EReference getAccessCharacteristic_Base_NamedElement();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.AccessCharacteristic#getFunctionalLevel <em>Functional Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Functional Level</em>'.
	 * @see engineering.schumann.uml.profile.csmn.AccessCharacteristic#getFunctionalLevel()
	 * @see #getAccessCharacteristic()
	 * @generated
	 */
	EAttribute getAccessCharacteristic_FunctionalLevel();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.AccessCharacteristic#getFunctionalSpec <em>Functional Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Functional Spec</em>'.
	 * @see engineering.schumann.uml.profile.csmn.AccessCharacteristic#getFunctionalSpec()
	 * @see #getAccessCharacteristic()
	 * @generated
	 */
	EAttribute getAccessCharacteristic_FunctionalSpec();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.AccessCharacteristic#getMechanicalLevel <em>Mechanical Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mechanical Level</em>'.
	 * @see engineering.schumann.uml.profile.csmn.AccessCharacteristic#getMechanicalLevel()
	 * @see #getAccessCharacteristic()
	 * @generated
	 */
	EAttribute getAccessCharacteristic_MechanicalLevel();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.AccessCharacteristic#getMechanicalSpec <em>Mechanical Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mechanical Spec</em>'.
	 * @see engineering.schumann.uml.profile.csmn.AccessCharacteristic#getMechanicalSpec()
	 * @see #getAccessCharacteristic()
	 * @generated
	 */
	EAttribute getAccessCharacteristic_MechanicalSpec();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.UsageCharacteristic <em>Usage Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Usage Characteristic</em>'.
	 * @see engineering.schumann.uml.profile.csmn.UsageCharacteristic
	 * @generated
	 */
	EClass getUsageCharacteristic();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.profile.csmn.UsageCharacteristic#getBase_NamedElement <em>Base Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Named Element</em>'.
	 * @see engineering.schumann.uml.profile.csmn.UsageCharacteristic#getBase_NamedElement()
	 * @see #getUsageCharacteristic()
	 * @generated
	 */
	EReference getUsageCharacteristic_Base_NamedElement();

	/**
	 * Returns the meta object for the reference list '{@link engineering.schumann.uml.profile.csmn.UsageCharacteristic#getIntendedUserGroup <em>Intended User Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Intended User Group</em>'.
	 * @see engineering.schumann.uml.profile.csmn.UsageCharacteristic#getIntendedUserGroup()
	 * @see #getUsageCharacteristic()
	 * @generated
	 */
	EReference getUsageCharacteristic_IntendedUserGroup();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.UsageCharacteristic#getUsageSpec <em>Usage Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Spec</em>'.
	 * @see engineering.schumann.uml.profile.csmn.UsageCharacteristic#getUsageSpec()
	 * @see #getUsageCharacteristic()
	 * @generated
	 */
	EAttribute getUsageCharacteristic_UsageSpec();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.UsageCharacteristic#getUsageType <em>Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage Type</em>'.
	 * @see engineering.schumann.uml.profile.csmn.UsageCharacteristic#getUsageType()
	 * @see #getUsageCharacteristic()
	 * @generated
	 */
	EAttribute getUsageCharacteristic_UsageType();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.profile.csmn.SoftwareConstraint <em>Software Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software Constraint</em>'.
	 * @see engineering.schumann.uml.profile.csmn.SoftwareConstraint
	 * @generated
	 */
	EClass getSoftwareConstraint();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.profile.csmn.SoftwareConstraint#getSoftwareVersion <em>Software Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Software Version</em>'.
	 * @see engineering.schumann.uml.profile.csmn.SoftwareConstraint#getSoftwareVersion()
	 * @see #getSoftwareConstraint()
	 * @generated
	 */
	EAttribute getSoftwareConstraint_SoftwareVersion();

	/**
	 * Returns the meta object for enum '{@link engineering.schumann.uml.profile.csmn.UserType <em>User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>User Type</em>'.
	 * @see engineering.schumann.uml.profile.csmn.UserType
	 * @generated
	 */
	EEnum getUserType();

	/**
	 * Returns the meta object for enum '{@link engineering.schumann.uml.profile.csmn.ConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connection Type</em>'.
	 * @see engineering.schumann.uml.profile.csmn.ConnectionType
	 * @generated
	 */
	EEnum getConnectionType();

	/**
	 * Returns the meta object for enum '{@link engineering.schumann.uml.profile.csmn.DirectionOfPrimaryFlow <em>Direction Of Primary Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction Of Primary Flow</em>'.
	 * @see engineering.schumann.uml.profile.csmn.DirectionOfPrimaryFlow
	 * @generated
	 */
	EEnum getDirectionOfPrimaryFlow();

	/**
	 * Returns the meta object for enum '{@link engineering.schumann.uml.profile.csmn.DirectionType <em>Direction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction Type</em>'.
	 * @see engineering.schumann.uml.profile.csmn.DirectionType
	 * @generated
	 */
	EEnum getDirectionType();

	/**
	 * Returns the meta object for enum '{@link engineering.schumann.uml.profile.csmn.SizeUnitOfMeasure <em>Size Unit Of Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Size Unit Of Measure</em>'.
	 * @see engineering.schumann.uml.profile.csmn.SizeUnitOfMeasure
	 * @generated
	 */
	EEnum getSizeUnitOfMeasure();

	/**
	 * Returns the meta object for enum '{@link engineering.schumann.uml.profile.csmn.SpeedUnitOfMeasurement <em>Speed Unit Of Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Speed Unit Of Measurement</em>'.
	 * @see engineering.schumann.uml.profile.csmn.SpeedUnitOfMeasurement
	 * @generated
	 */
	EEnum getSpeedUnitOfMeasurement();

	/**
	 * Returns the meta object for enum '{@link engineering.schumann.uml.profile.csmn.CommonPlatformEnumerationType <em>Common Platform Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Common Platform Enumeration Type</em>'.
	 * @see engineering.schumann.uml.profile.csmn.CommonPlatformEnumerationType
	 * @generated
	 */
	EEnum getCommonPlatformEnumerationType();

	/**
	 * Returns the meta object for enum '{@link engineering.schumann.uml.profile.csmn.ScopeConstraintType <em>Scope Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scope Constraint Type</em>'.
	 * @see engineering.schumann.uml.profile.csmn.ScopeConstraintType
	 * @generated
	 */
	EEnum getScopeConstraintType();

	/**
	 * Returns the meta object for enum '{@link engineering.schumann.uml.profile.csmn.AssetType <em>Asset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Asset Type</em>'.
	 * @see engineering.schumann.uml.profile.csmn.AssetType
	 * @generated
	 */
	EEnum getAssetType();

	/**
	 * Returns the meta object for enum '{@link engineering.schumann.uml.profile.csmn.AssetFlightLevel <em>Asset Flight Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Asset Flight Level</em>'.
	 * @see engineering.schumann.uml.profile.csmn.AssetFlightLevel
	 * @generated
	 */
	EEnum getAssetFlightLevel();

	/**
	 * Returns the meta object for enum '{@link engineering.schumann.uml.profile.csmn.AssetCategory <em>Asset Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Asset Category</em>'.
	 * @see engineering.schumann.uml.profile.csmn.AssetCategory
	 * @generated
	 */
	EEnum getAssetCategory();

	/**
	 * Returns the meta object for enum '{@link engineering.schumann.uml.profile.csmn.ProtectionGoal <em>Protection Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protection Goal</em>'.
	 * @see engineering.schumann.uml.profile.csmn.ProtectionGoal
	 * @generated
	 */
	EEnum getProtectionGoal();

	/**
	 * Returns the meta object for enum '{@link engineering.schumann.uml.profile.csmn.STRIDE <em>STRIDE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>STRIDE</em>'.
	 * @see engineering.schumann.uml.profile.csmn.STRIDE
	 * @generated
	 */
	EEnum getSTRIDE();

	/**
	 * Returns the meta object for enum '{@link engineering.schumann.uml.profile.csmn.EnergyType <em>Energy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Energy Type</em>'.
	 * @see engineering.schumann.uml.profile.csmn.EnergyType
	 * @generated
	 */
	EEnum getEnergyType();

	/**
	 * Returns the meta object for enum '{@link engineering.schumann.uml.profile.csmn.InterfaceConnector <em>Interface Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interface Connector</em>'.
	 * @see engineering.schumann.uml.profile.csmn.InterfaceConnector
	 * @generated
	 */
	EEnum getInterfaceConnector();

	/**
	 * Returns the meta object for enum '{@link engineering.schumann.uml.profile.csmn.InterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interface Type</em>'.
	 * @see engineering.schumann.uml.profile.csmn.InterfaceType
	 * @generated
	 */
	EEnum getInterfaceType();

	/**
	 * Returns the meta object for enum '{@link engineering.schumann.uml.profile.csmn.Iec62443SecurityLevel <em>Iec62443 Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Iec62443 Security Level</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Iec62443SecurityLevel
	 * @generated
	 */
	EEnum getIec62443SecurityLevel();

	/**
	 * Returns the meta object for enum '{@link engineering.schumann.uml.profile.csmn.Iec62443FoundationalRequirementType <em>Iec62443 Foundational Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Iec62443 Foundational Requirement Type</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Iec62443FoundationalRequirementType
	 * @generated
	 */
	EEnum getIec62443FoundationalRequirementType();

	/**
	 * Returns the meta object for enum '{@link engineering.schumann.uml.profile.csmn.Iec62443SecurityLevelType <em>Iec62443 Security Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Iec62443 Security Level Type</em>'.
	 * @see engineering.schumann.uml.profile.csmn.Iec62443SecurityLevelType
	 * @generated
	 */
	EEnum getIec62443SecurityLevelType();

	/**
	 * Returns the meta object for enum '{@link engineering.schumann.uml.profile.csmn.StorageType <em>Storage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Storage Type</em>'.
	 * @see engineering.schumann.uml.profile.csmn.StorageType
	 * @generated
	 */
	EEnum getStorageType();

	/**
	 * Returns the meta object for enum '{@link engineering.schumann.uml.profile.csmn.FunctionalAccessLevel <em>Functional Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Functional Access Level</em>'.
	 * @see engineering.schumann.uml.profile.csmn.FunctionalAccessLevel
	 * @generated
	 */
	EEnum getFunctionalAccessLevel();

	/**
	 * Returns the meta object for enum '{@link engineering.schumann.uml.profile.csmn.MechanicalAccessLevel <em>Mechanical Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mechanical Access Level</em>'.
	 * @see engineering.schumann.uml.profile.csmn.MechanicalAccessLevel
	 * @generated
	 */
	EEnum getMechanicalAccessLevel();

	/**
	 * Returns the meta object for enum '{@link engineering.schumann.uml.profile.csmn.UsageType <em>Usage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Usage Type</em>'.
	 * @see engineering.schumann.uml.profile.csmn.UsageType
	 * @generated
	 */
	EEnum getUsageType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CSMNFactory getCSMNFactory();

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
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.SystemElementImpl <em>System Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.SystemElementImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getSystemElement()
		 * @generated
		 */
		EClass SYSTEM_ELEMENT = eINSTANCE.getSystemElement();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_ELEMENT__BASE_COMPONENT = eINSTANCE.getSystemElement_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Platform Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_ELEMENT__PLATFORM_TYPE = eINSTANCE.getSystemElement_PlatformType();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.UserImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__BASE_COMPONENT = eINSTANCE.getUser_Base_Component();

		/**
		 * The meta object literal for the '<em><b>User Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USER_TYPE = eINSTANCE.getUser_UserType();

		/**
		 * The meta object literal for the '<em><b>Use Filled Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USE_FILLED_ICON = eINSTANCE.getUser_UseFilledIcon();

		/**
		 * The meta object literal for the '<em><b>Base Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__BASE_ACTOR = eINSTANCE.getUser_Base_Actor();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.EnvironmentElementImpl <em>Environment Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.EnvironmentElementImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getEnvironmentElement()
		 * @generated
		 */
		EClass ENVIRONMENT_ELEMENT = eINSTANCE.getEnvironmentElement();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_ELEMENT__BASE_COMPONENT = eINSTANCE.getEnvironmentElement_Base_Component();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.SecurityZoneImpl <em>Security Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.SecurityZoneImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getSecurityZone()
		 * @generated
		 */
		EClass SECURITY_ZONE = eINSTANCE.getSecurityZone();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_ZONE__BASE_PACKAGE = eINSTANCE.getSecurityZone_Base_Package();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_ZONE__BASE_COMPONENT = eINSTANCE.getSecurityZone_Base_Component();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.BoxImpl <em>Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.BoxImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getBox()
		 * @generated
		 */
		EClass BOX = eINSTANCE.getBox();

		/**
		 * The meta object literal for the '<em><b>Base Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOX__BASE_COMMENT = eINSTANCE.getBox_Base_Comment();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOX__BASE_PACKAGE = eINSTANCE.getBox_Base_Package();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.EnvironmentLibraryImpl <em>Environment Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.EnvironmentLibraryImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getEnvironmentLibrary()
		 * @generated
		 */
		EClass ENVIRONMENT_LIBRARY = eINSTANCE.getEnvironmentLibrary();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVIRONMENT_LIBRARY__BASE_PACKAGE = eINSTANCE.getEnvironmentLibrary_Base_Package();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.ConnectionImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__BASE_DEPENDENCY = eINSTANCE.getConnection_Base_Dependency();

		/**
		 * The meta object literal for the '<em><b>Connection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__CONNECTION_TYPE = eINSTANCE.getConnection_ConnectionType();

		/**
		 * The meta object literal for the '<em><b>Direction Primary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__DIRECTION_PRIMARY = eINSTANCE.getConnection_DirectionPrimary();

		/**
		 * The meta object literal for the '<em><b>Direction Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__DIRECTION_TYPE = eINSTANCE.getConnection_DirectionType();

		/**
		 * The meta object literal for the '<em><b>Flow To Client</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__FLOW_TO_CLIENT = eINSTANCE.getConnection_FlowToClient();

		/**
		 * The meta object literal for the '<em><b>Flow To Supplier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__FLOW_TO_SUPPLIER = eINSTANCE.getConnection_FlowToSupplier();

		/**
		 * The meta object literal for the '<em><b>Is Real Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__IS_REAL_TIME = eINSTANCE.getConnection_IsRealTime();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__PURPOSE = eINSTANCE.getConnection_Purpose();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.Size_TImpl <em>Size T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.Size_TImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getSize_T()
		 * @generated
		 */
		EClass SIZE_T = eINSTANCE.getSize_T();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE_T__SIZE = eINSTANCE.getSize_T_Size();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE_T__UNIT = eINSTANCE.getSize_T_Unit();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.BandwidthImpl <em>Bandwidth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.BandwidthImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getBandwidth()
		 * @generated
		 */
		EClass BANDWIDTH = eINSTANCE.getBandwidth();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANDWIDTH__SIZE = eINSTANCE.getBandwidth_Size();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANDWIDTH__UNIT = eINSTANCE.getBandwidth_Unit();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.ScopeImpl <em>Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.ScopeImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getScope()
		 * @generated
		 */
		EClass SCOPE = eINSTANCE.getScope();

		/**
		 * The meta object literal for the '<em><b>Base Named Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__BASE_NAMED_ELEMENT = eINSTANCE.getScope_Base_NamedElement();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__PRODUCT = eINSTANCE.getScope_Product();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.ProductImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Udi Di</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__UDI_DI = eINSTANCE.getProduct_UdiDi();

		/**
		 * The meta object literal for the '<em><b>Udi Di Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__UDI_DI_BASE = eINSTANCE.getProduct_UdiDiBase();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.CommonPlatformEnumerationImpl <em>Common Platform Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.CommonPlatformEnumerationImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getCommonPlatformEnumeration()
		 * @generated
		 */
		EClass COMMON_PLATFORM_ENUMERATION = eINSTANCE.getCommonPlatformEnumeration();

		/**
		 * The meta object literal for the '<em><b>Platform Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_PLATFORM_ENUMERATION__PLATFORM_TYPE = eINSTANCE.getCommonPlatformEnumeration_PlatformType();

		/**
		 * The meta object literal for the '<em><b>Vendor Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_PLATFORM_ENUMERATION__VENDOR_NAME = eINSTANCE.getCommonPlatformEnumeration_VendorName();

		/**
		 * The meta object literal for the '<em><b>Product Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_PLATFORM_ENUMERATION__PRODUCT_NAME = eINSTANCE.getCommonPlatformEnumeration_ProductName();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMON_PLATFORM_ENUMERATION__MODEL = eINSTANCE.getCommonPlatformEnumeration_Model();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.ScopeConstraintImpl <em>Scope Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.ScopeConstraintImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getScopeConstraint()
		 * @generated
		 */
		EClass SCOPE_CONSTRAINT = eINSTANCE.getScopeConstraint();

		/**
		 * The meta object literal for the '<em><b>Base Named Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE_CONSTRAINT__BASE_NAMED_ELEMENT = eINSTANCE.getScopeConstraint_Base_NamedElement();

		/**
		 * The meta object literal for the '<em><b>Product Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE_CONSTRAINT__PRODUCT_CONSTRAINT = eINSTANCE.getScopeConstraint_ProductConstraint();

		/**
		 * The meta object literal for the '<em><b>Constraint Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE_CONSTRAINT__CONSTRAINT_TYPE = eINSTANCE.getScopeConstraint_ConstraintType();

		/**
		 * The meta object literal for the '<em><b>Software Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE_CONSTRAINT__SOFTWARE_CONSTRAINT = eINSTANCE.getScopeConstraint_SoftwareConstraint();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.ProductConstraintImpl <em>Product Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.ProductConstraintImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getProductConstraint()
		 * @generated
		 */
		EClass PRODUCT_CONSTRAINT = eINSTANCE.getProductConstraint();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONSTRAINT__MODEL = eINSTANCE.getProductConstraint_Model();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.AssetImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Asset Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__ASSET_TYPE = eINSTANCE.getAsset_AssetType();

		/**
		 * The meta object literal for the '<em><b>Flight Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__FLIGHT_LEVEL = eINSTANCE.getAsset_FlightLevel();

		/**
		 * The meta object literal for the '<em><b>Asset Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__ASSET_CATEGORY = eINSTANCE.getAsset_AssetCategory();

		/**
		 * The meta object literal for the '<em><b>Protection Goal</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__PROTECTION_GOAL = eINSTANCE.getAsset_ProtectionGoal();

		/**
		 * The meta object literal for the '<em><b>Stride</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__STRIDE = eINSTANCE.getAsset_Stride();

		/**
		 * The meta object literal for the '<em><b>Base Named Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__BASE_NAMED_ELEMENT = eINSTANCE.getAsset_Base_NamedElement();

		/**
		 * The meta object literal for the '<em><b>Asset Spec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__ASSET_SPEC = eINSTANCE.getAsset_AssetSpec();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.AssetLibraryImpl <em>Asset Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.AssetLibraryImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getAssetLibrary()
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
		 * The meta object literal for the '<em><b>Asset Spec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_LIBRARY__ASSET_SPEC = eINSTANCE.getAssetLibrary_AssetSpec();

		/**
		 * The meta object literal for the '<em><b>Asset Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_LIBRARY__ASSET_TYPE = eINSTANCE.getAssetLibrary_AssetType();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.EnergyCharacteristicImpl <em>Energy Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.EnergyCharacteristicImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getEnergyCharacteristic()
		 * @generated
		 */
		EClass ENERGY_CHARACTERISTIC = eINSTANCE.getEnergyCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_CHARACTERISTIC__BASE_PORT = eINSTANCE.getEnergyCharacteristic_Base_Port();

		/**
		 * The meta object literal for the '<em><b>Energy Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_CHARACTERISTIC__ENERGY_TYPE = eINSTANCE.getEnergyCharacteristic_EnergyType();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_CHARACTERISTIC__BASE_DEPENDENCY = eINSTANCE.getEnergyCharacteristic_Base_Dependency();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.OsiCharacteristicImpl <em>Osi Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.OsiCharacteristicImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getOsiCharacteristic()
		 * @generated
		 */
		EClass OSI_CHARACTERISTIC = eINSTANCE.getOsiCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSI_CHARACTERISTIC__APPLICATION = eINSTANCE.getOsiCharacteristic_Application();

		/**
		 * The meta object literal for the '<em><b>Presentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSI_CHARACTERISTIC__PRESENTATION = eINSTANCE.getOsiCharacteristic_Presentation();

		/**
		 * The meta object literal for the '<em><b>Session</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSI_CHARACTERISTIC__SESSION = eINSTANCE.getOsiCharacteristic_Session();

		/**
		 * The meta object literal for the '<em><b>Transport</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSI_CHARACTERISTIC__TRANSPORT = eINSTANCE.getOsiCharacteristic_Transport();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSI_CHARACTERISTIC__NETWORK = eINSTANCE.getOsiCharacteristic_Network();

		/**
		 * The meta object literal for the '<em><b>Data Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSI_CHARACTERISTIC__DATA_LINK = eINSTANCE.getOsiCharacteristic_DataLink();

		/**
		 * The meta object literal for the '<em><b>Physical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSI_CHARACTERISTIC__PHYSICAL = eINSTANCE.getOsiCharacteristic_Physical();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.FlowCharacteristicImpl <em>Flow Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.FlowCharacteristicImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getFlowCharacteristic()
		 * @generated
		 */
		EClass FLOW_CHARACTERISTIC = eINSTANCE.getFlowCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_CHARACTERISTIC__BASE_DEPENDENCY = eINSTANCE.getFlowCharacteristic_Base_Dependency();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.TcpCharacteristicImpl <em>Tcp Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.TcpCharacteristicImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getTcpCharacteristic()
		 * @generated
		 */
		EClass TCP_CHARACTERISTIC = eINSTANCE.getTcpCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCP_CHARACTERISTIC__APPLICATION = eINSTANCE.getTcpCharacteristic_Application();

		/**
		 * The meta object literal for the '<em><b>Transport</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCP_CHARACTERISTIC__TRANSPORT = eINSTANCE.getTcpCharacteristic_Transport();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCP_CHARACTERISTIC__NETWORK = eINSTANCE.getTcpCharacteristic_Network();

		/**
		 * The meta object literal for the '<em><b>Data Link</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCP_CHARACTERISTIC__DATA_LINK = eINSTANCE.getTcpCharacteristic_DataLink();

		/**
		 * The meta object literal for the '<em><b>Physical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCP_CHARACTERISTIC__PHYSICAL = eINSTANCE.getTcpCharacteristic_Physical();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.InterfaceCharacteristicImpl <em>Interface Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.InterfaceCharacteristicImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getInterfaceCharacteristic()
		 * @generated
		 */
		EClass INTERFACE_CHARACTERISTIC = eINSTANCE.getInterfaceCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE_CHARACTERISTIC__BASE_PORT = eINSTANCE.getInterfaceCharacteristic_Base_Port();

		/**
		 * The meta object literal for the '<em><b>Interface Connector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_CHARACTERISTIC__INTERFACE_CONNECTOR = eINSTANCE.getInterfaceCharacteristic_InterfaceConnector();

		/**
		 * The meta object literal for the '<em><b>Interface Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_CHARACTERISTIC__INTERFACE_TYPE = eINSTANCE.getInterfaceCharacteristic_InterfaceType();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_CHARACTERISTIC__PURPOSE = eINSTANCE.getInterfaceCharacteristic_Purpose();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.BandwidthCharacteristicImpl <em>Bandwidth Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.BandwidthCharacteristicImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getBandwidthCharacteristic()
		 * @generated
		 */
		EClass BANDWIDTH_CHARACTERISTIC = eINSTANCE.getBandwidthCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANDWIDTH_CHARACTERISTIC__BASE_PORT = eINSTANCE.getBandwidthCharacteristic_Base_Port();

		/**
		 * The meta object literal for the '<em><b>Bandwidth</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANDWIDTH_CHARACTERISTIC__BANDWIDTH = eINSTANCE.getBandwidthCharacteristic_Bandwidth();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANDWIDTH_CHARACTERISTIC__BASE_DEPENDENCY = eINSTANCE.getBandwidthCharacteristic_Base_Dependency();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.FirewallCharacteristicImpl <em>Firewall Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.FirewallCharacteristicImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getFirewallCharacteristic()
		 * @generated
		 */
		EClass FIREWALL_CHARACTERISTIC = eINSTANCE.getFirewallCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIREWALL_CHARACTERISTIC__BASE_PORT = eINSTANCE.getFirewallCharacteristic_Base_Port();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.MaterialCharacteristicImpl <em>Material Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.MaterialCharacteristicImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getMaterialCharacteristic()
		 * @generated
		 */
		EClass MATERIAL_CHARACTERISTIC = eINSTANCE.getMaterialCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL_CHARACTERISTIC__BASE_PORT = eINSTANCE.getMaterialCharacteristic_Base_Port();

		/**
		 * The meta object literal for the '<em><b>Material Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL_CHARACTERISTIC__MATERIAL_TYPE = eINSTANCE.getMaterialCharacteristic_MaterialType();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATERIAL_CHARACTERISTIC__BASE_DEPENDENCY = eINSTANCE.getMaterialCharacteristic_Base_Dependency();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.Iec62443SecurityLevelCharacteristicImpl <em>Iec62443 Security Level Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.Iec62443SecurityLevelCharacteristicImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getIec62443SecurityLevelCharacteristic()
		 * @generated
		 */
		EClass IEC62443_SECURITY_LEVEL_CHARACTERISTIC = eINSTANCE.getIec62443SecurityLevelCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Base Named Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC62443_SECURITY_LEVEL_CHARACTERISTIC__BASE_NAMED_ELEMENT = eINSTANCE.getIec62443SecurityLevelCharacteristic_Base_NamedElement();

		/**
		 * The meta object literal for the '<em><b>Securitylevel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IEC62443_SECURITY_LEVEL_CHARACTERISTIC__SECURITYLEVEL = eINSTANCE.getIec62443SecurityLevelCharacteristic_Securitylevel();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.SecurityLevelImpl <em>Security Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.SecurityLevelImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getSecurityLevel()
		 * @generated
		 */
		EClass SECURITY_LEVEL = eINSTANCE.getSecurityLevel();

		/**
		 * The meta object literal for the '<em><b>Foundational Requirement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_LEVEL__FOUNDATIONAL_REQUIREMENT = eINSTANCE.getSecurityLevel_FoundationalRequirement();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_LEVEL__LEVEL = eINSTANCE.getSecurityLevel_Level();

		/**
		 * The meta object literal for the '<em><b>Rational</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_LEVEL__RATIONAL = eINSTANCE.getSecurityLevel_Rational();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_LEVEL__TYPE = eINSTANCE.getSecurityLevel_Type();

		/**
		 * The meta object literal for the '<em><b>Vector</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_LEVEL__VECTOR = eINSTANCE.getSecurityLevel_Vector();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.CpeCharacteristicImpl <em>Cpe Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.CpeCharacteristicImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getCpeCharacteristic()
		 * @generated
		 */
		EClass CPE_CHARACTERISTIC = eINSTANCE.getCpeCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Base Named Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPE_CHARACTERISTIC__BASE_NAMED_ELEMENT = eINSTANCE.getCpeCharacteristic_Base_NamedElement();

		/**
		 * The meta object literal for the '<em><b>Cpe</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CPE_CHARACTERISTIC__CPE = eINSTANCE.getCpeCharacteristic_Cpe();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.StorageCharacteristicImpl <em>Storage Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.StorageCharacteristicImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getStorageCharacteristic()
		 * @generated
		 */
		EClass STORAGE_CHARACTERISTIC = eINSTANCE.getStorageCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_CHARACTERISTIC__BASE_COMPONENT = eINSTANCE.getStorageCharacteristic_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Base Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_CHARACTERISTIC__BASE_PORT = eINSTANCE.getStorageCharacteristic_Base_Port();

		/**
		 * The meta object literal for the '<em><b>Encryption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_CHARACTERISTIC__ENCRYPTION = eINSTANCE.getStorageCharacteristic_Encryption();

		/**
		 * The meta object literal for the '<em><b>Storage Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_CHARACTERISTIC__STORAGE_FORMAT = eINSTANCE.getStorageCharacteristic_StorageFormat();

		/**
		 * The meta object literal for the '<em><b>Storage Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_CHARACTERISTIC__STORAGE_TYPE = eINSTANCE.getStorageCharacteristic_StorageType();

		/**
		 * The meta object literal for the '<em><b>Storage Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORAGE_CHARACTERISTIC__STORAGE_NAME = eINSTANCE.getStorageCharacteristic_StorageName();

		/**
		 * The meta object literal for the '<em><b>Total Size</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORAGE_CHARACTERISTIC__TOTAL_SIZE = eINSTANCE.getStorageCharacteristic_TotalSize();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.AccessCharacteristicImpl <em>Access Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.AccessCharacteristicImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getAccessCharacteristic()
		 * @generated
		 */
		EClass ACCESS_CHARACTERISTIC = eINSTANCE.getAccessCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Base Named Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_CHARACTERISTIC__BASE_NAMED_ELEMENT = eINSTANCE.getAccessCharacteristic_Base_NamedElement();

		/**
		 * The meta object literal for the '<em><b>Functional Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_CHARACTERISTIC__FUNCTIONAL_LEVEL = eINSTANCE.getAccessCharacteristic_FunctionalLevel();

		/**
		 * The meta object literal for the '<em><b>Functional Spec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_CHARACTERISTIC__FUNCTIONAL_SPEC = eINSTANCE.getAccessCharacteristic_FunctionalSpec();

		/**
		 * The meta object literal for the '<em><b>Mechanical Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_CHARACTERISTIC__MECHANICAL_LEVEL = eINSTANCE.getAccessCharacteristic_MechanicalLevel();

		/**
		 * The meta object literal for the '<em><b>Mechanical Spec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESS_CHARACTERISTIC__MECHANICAL_SPEC = eINSTANCE.getAccessCharacteristic_MechanicalSpec();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.UsageCharacteristicImpl <em>Usage Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.UsageCharacteristicImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getUsageCharacteristic()
		 * @generated
		 */
		EClass USAGE_CHARACTERISTIC = eINSTANCE.getUsageCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Base Named Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE_CHARACTERISTIC__BASE_NAMED_ELEMENT = eINSTANCE.getUsageCharacteristic_Base_NamedElement();

		/**
		 * The meta object literal for the '<em><b>Intended User Group</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USAGE_CHARACTERISTIC__INTENDED_USER_GROUP = eINSTANCE.getUsageCharacteristic_IntendedUserGroup();

		/**
		 * The meta object literal for the '<em><b>Usage Spec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE_CHARACTERISTIC__USAGE_SPEC = eINSTANCE.getUsageCharacteristic_UsageSpec();

		/**
		 * The meta object literal for the '<em><b>Usage Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USAGE_CHARACTERISTIC__USAGE_TYPE = eINSTANCE.getUsageCharacteristic_UsageType();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.impl.SoftwareConstraintImpl <em>Software Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.impl.SoftwareConstraintImpl
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getSoftwareConstraint()
		 * @generated
		 */
		EClass SOFTWARE_CONSTRAINT = eINSTANCE.getSoftwareConstraint();

		/**
		 * The meta object literal for the '<em><b>Software Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE_CONSTRAINT__SOFTWARE_VERSION = eINSTANCE.getSoftwareConstraint_SoftwareVersion();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.UserType <em>User Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.UserType
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getUserType()
		 * @generated
		 */
		EEnum USER_TYPE = eINSTANCE.getUserType();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.ConnectionType <em>Connection Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.ConnectionType
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getConnectionType()
		 * @generated
		 */
		EEnum CONNECTION_TYPE = eINSTANCE.getConnectionType();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.DirectionOfPrimaryFlow <em>Direction Of Primary Flow</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.DirectionOfPrimaryFlow
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getDirectionOfPrimaryFlow()
		 * @generated
		 */
		EEnum DIRECTION_OF_PRIMARY_FLOW = eINSTANCE.getDirectionOfPrimaryFlow();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.DirectionType <em>Direction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.DirectionType
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getDirectionType()
		 * @generated
		 */
		EEnum DIRECTION_TYPE = eINSTANCE.getDirectionType();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.SizeUnitOfMeasure <em>Size Unit Of Measure</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.SizeUnitOfMeasure
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getSizeUnitOfMeasure()
		 * @generated
		 */
		EEnum SIZE_UNIT_OF_MEASURE = eINSTANCE.getSizeUnitOfMeasure();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.SpeedUnitOfMeasurement <em>Speed Unit Of Measurement</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.SpeedUnitOfMeasurement
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getSpeedUnitOfMeasurement()
		 * @generated
		 */
		EEnum SPEED_UNIT_OF_MEASUREMENT = eINSTANCE.getSpeedUnitOfMeasurement();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.CommonPlatformEnumerationType <em>Common Platform Enumeration Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.CommonPlatformEnumerationType
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getCommonPlatformEnumerationType()
		 * @generated
		 */
		EEnum COMMON_PLATFORM_ENUMERATION_TYPE = eINSTANCE.getCommonPlatformEnumerationType();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.ScopeConstraintType <em>Scope Constraint Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.ScopeConstraintType
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getScopeConstraintType()
		 * @generated
		 */
		EEnum SCOPE_CONSTRAINT_TYPE = eINSTANCE.getScopeConstraintType();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.AssetType <em>Asset Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.AssetType
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getAssetType()
		 * @generated
		 */
		EEnum ASSET_TYPE = eINSTANCE.getAssetType();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.AssetFlightLevel <em>Asset Flight Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.AssetFlightLevel
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getAssetFlightLevel()
		 * @generated
		 */
		EEnum ASSET_FLIGHT_LEVEL = eINSTANCE.getAssetFlightLevel();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.AssetCategory <em>Asset Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.AssetCategory
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getAssetCategory()
		 * @generated
		 */
		EEnum ASSET_CATEGORY = eINSTANCE.getAssetCategory();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.ProtectionGoal <em>Protection Goal</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.ProtectionGoal
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getProtectionGoal()
		 * @generated
		 */
		EEnum PROTECTION_GOAL = eINSTANCE.getProtectionGoal();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.STRIDE <em>STRIDE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.STRIDE
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getSTRIDE()
		 * @generated
		 */
		EEnum STRIDE = eINSTANCE.getSTRIDE();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.EnergyType <em>Energy Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.EnergyType
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getEnergyType()
		 * @generated
		 */
		EEnum ENERGY_TYPE = eINSTANCE.getEnergyType();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.InterfaceConnector <em>Interface Connector</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.InterfaceConnector
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getInterfaceConnector()
		 * @generated
		 */
		EEnum INTERFACE_CONNECTOR = eINSTANCE.getInterfaceConnector();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.InterfaceType <em>Interface Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.InterfaceType
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getInterfaceType()
		 * @generated
		 */
		EEnum INTERFACE_TYPE = eINSTANCE.getInterfaceType();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.Iec62443SecurityLevel <em>Iec62443 Security Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.Iec62443SecurityLevel
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getIec62443SecurityLevel()
		 * @generated
		 */
		EEnum IEC62443_SECURITY_LEVEL = eINSTANCE.getIec62443SecurityLevel();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.Iec62443FoundationalRequirementType <em>Iec62443 Foundational Requirement Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.Iec62443FoundationalRequirementType
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getIec62443FoundationalRequirementType()
		 * @generated
		 */
		EEnum IEC62443_FOUNDATIONAL_REQUIREMENT_TYPE = eINSTANCE.getIec62443FoundationalRequirementType();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.Iec62443SecurityLevelType <em>Iec62443 Security Level Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.Iec62443SecurityLevelType
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getIec62443SecurityLevelType()
		 * @generated
		 */
		EEnum IEC62443_SECURITY_LEVEL_TYPE = eINSTANCE.getIec62443SecurityLevelType();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.StorageType <em>Storage Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.StorageType
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getStorageType()
		 * @generated
		 */
		EEnum STORAGE_TYPE = eINSTANCE.getStorageType();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.FunctionalAccessLevel <em>Functional Access Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.FunctionalAccessLevel
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getFunctionalAccessLevel()
		 * @generated
		 */
		EEnum FUNCTIONAL_ACCESS_LEVEL = eINSTANCE.getFunctionalAccessLevel();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.MechanicalAccessLevel <em>Mechanical Access Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.MechanicalAccessLevel
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getMechanicalAccessLevel()
		 * @generated
		 */
		EEnum MECHANICAL_ACCESS_LEVEL = eINSTANCE.getMechanicalAccessLevel();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.profile.csmn.UsageType <em>Usage Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.profile.csmn.UsageType
		 * @see engineering.schumann.uml.profile.csmn.impl.CSMNPackageImpl#getUsageType()
		 * @generated
		 */
		EEnum USAGE_TYPE = eINSTANCE.getUsageType();

	}

} //CSMNPackage
