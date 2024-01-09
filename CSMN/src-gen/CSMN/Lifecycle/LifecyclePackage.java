/**
 */
package CSMN.Lifecycle;

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
 * @see CSMN.Lifecycle.LifecycleFactory
 * @model kind="package"
 * @generated
 */
public interface LifecyclePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Lifecycle";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schumann-engineering/csmn/1/Lifecycle";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CSMN.Lifecycle";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LifecyclePackage eINSTANCE = CSMN.Lifecycle.impl.LifecyclePackageImpl.init();

	/**
	 * The meta object id for the '{@link CSMN.Lifecycle.impl.ScopeImpl <em>Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Lifecycle.impl.ScopeImpl
	 * @see CSMN.Lifecycle.impl.LifecyclePackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 0;

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
	 * The meta object id for the '{@link CSMN.Lifecycle.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Lifecycle.impl.ProductImpl
	 * @see CSMN.Lifecycle.impl.LifecyclePackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__MODEL = 1;

	/**
	 * The feature id for the '<em><b>Udi Di</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__UDI_DI = 2;

	/**
	 * The feature id for the '<em><b>Udi Di Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__UDI_DI_BASE = 3;

	/**
	 * The feature id for the '<em><b>Software Version</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__SOFTWARE_VERSION = 4;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSMN.Lifecycle.impl.ScopeConstraintImpl <em>Scope Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Lifecycle.impl.ScopeConstraintImpl
	 * @see CSMN.Lifecycle.impl.LifecyclePackageImpl#getScopeConstraint()
	 * @generated
	 */
	int SCOPE_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_CONSTRAINT__BASE_NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_CONSTRAINT__CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Constraint Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_CONSTRAINT__CONSTRAINT_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Scope Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Scope Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSMN.Lifecycle.impl.ProductConstraintImpl <em>Product Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Lifecycle.impl.ProductConstraintImpl
	 * @see CSMN.Lifecycle.impl.LifecyclePackageImpl#getProductConstraint()
	 * @generated
	 */
	int PRODUCT_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONSTRAINT__MODEL = 0;

	/**
	 * The feature id for the '<em><b>Software Version</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONSTRAINT__SOFTWARE_VERSION = 1;

	/**
	 * The number of structural features of the '<em>Product Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Product Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSMN.Lifecycle.ScopeConstraintType <em>Scope Constraint Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Lifecycle.ScopeConstraintType
	 * @see CSMN.Lifecycle.impl.LifecyclePackageImpl#getScopeConstraintType()
	 * @generated
	 */
	int SCOPE_CONSTRAINT_TYPE = 4;


	/**
	 * Returns the meta object for class '{@link CSMN.Lifecycle.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope</em>'.
	 * @see CSMN.Lifecycle.Scope
	 * @generated
	 */
	EClass getScope();

	/**
	 * Returns the meta object for the reference '{@link CSMN.Lifecycle.Scope#getBase_NamedElement <em>Base Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Named Element</em>'.
	 * @see CSMN.Lifecycle.Scope#getBase_NamedElement()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Base_NamedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link CSMN.Lifecycle.Scope#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Product</em>'.
	 * @see CSMN.Lifecycle.Scope#getProduct()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_Product();

	/**
	 * Returns the meta object for class '{@link CSMN.Lifecycle.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see CSMN.Lifecycle.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Lifecycle.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CSMN.Lifecycle.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Name();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Lifecycle.Product#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see CSMN.Lifecycle.Product#getModel()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Model();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Lifecycle.Product#getUdiDi <em>Udi Di</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Udi Di</em>'.
	 * @see CSMN.Lifecycle.Product#getUdiDi()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_UdiDi();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Lifecycle.Product#getUdiDiBase <em>Udi Di Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Udi Di Base</em>'.
	 * @see CSMN.Lifecycle.Product#getUdiDiBase()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_UdiDiBase();

	/**
	 * Returns the meta object for the attribute list '{@link CSMN.Lifecycle.Product#getSoftwareVersion <em>Software Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Software Version</em>'.
	 * @see CSMN.Lifecycle.Product#getSoftwareVersion()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_SoftwareVersion();

	/**
	 * Returns the meta object for class '{@link CSMN.Lifecycle.ScopeConstraint <em>Scope Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope Constraint</em>'.
	 * @see CSMN.Lifecycle.ScopeConstraint
	 * @generated
	 */
	EClass getScopeConstraint();

	/**
	 * Returns the meta object for the reference '{@link CSMN.Lifecycle.ScopeConstraint#getBase_NamedElement <em>Base Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Named Element</em>'.
	 * @see CSMN.Lifecycle.ScopeConstraint#getBase_NamedElement()
	 * @see #getScopeConstraint()
	 * @generated
	 */
	EReference getScopeConstraint_Base_NamedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link CSMN.Lifecycle.ScopeConstraint#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint</em>'.
	 * @see CSMN.Lifecycle.ScopeConstraint#getConstraint()
	 * @see #getScopeConstraint()
	 * @generated
	 */
	EReference getScopeConstraint_Constraint();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Lifecycle.ScopeConstraint#getConstraintType <em>Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Type</em>'.
	 * @see CSMN.Lifecycle.ScopeConstraint#getConstraintType()
	 * @see #getScopeConstraint()
	 * @generated
	 */
	EAttribute getScopeConstraint_ConstraintType();

	/**
	 * Returns the meta object for class '{@link CSMN.Lifecycle.ProductConstraint <em>Product Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Constraint</em>'.
	 * @see CSMN.Lifecycle.ProductConstraint
	 * @generated
	 */
	EClass getProductConstraint();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Lifecycle.ProductConstraint#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see CSMN.Lifecycle.ProductConstraint#getModel()
	 * @see #getProductConstraint()
	 * @generated
	 */
	EAttribute getProductConstraint_Model();

	/**
	 * Returns the meta object for the attribute list '{@link CSMN.Lifecycle.ProductConstraint#getSoftwareVersion <em>Software Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Software Version</em>'.
	 * @see CSMN.Lifecycle.ProductConstraint#getSoftwareVersion()
	 * @see #getProductConstraint()
	 * @generated
	 */
	EAttribute getProductConstraint_SoftwareVersion();

	/**
	 * Returns the meta object for enum '{@link CSMN.Lifecycle.ScopeConstraintType <em>Scope Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scope Constraint Type</em>'.
	 * @see CSMN.Lifecycle.ScopeConstraintType
	 * @generated
	 */
	EEnum getScopeConstraintType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LifecycleFactory getLifecycleFactory();

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
		 * The meta object literal for the '{@link CSMN.Lifecycle.impl.ScopeImpl <em>Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Lifecycle.impl.ScopeImpl
		 * @see CSMN.Lifecycle.impl.LifecyclePackageImpl#getScope()
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
		 * The meta object literal for the '{@link CSMN.Lifecycle.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Lifecycle.impl.ProductImpl
		 * @see CSMN.Lifecycle.impl.LifecyclePackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__MODEL = eINSTANCE.getProduct_Model();

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
		 * The meta object literal for the '<em><b>Software Version</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__SOFTWARE_VERSION = eINSTANCE.getProduct_SoftwareVersion();

		/**
		 * The meta object literal for the '{@link CSMN.Lifecycle.impl.ScopeConstraintImpl <em>Scope Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Lifecycle.impl.ScopeConstraintImpl
		 * @see CSMN.Lifecycle.impl.LifecyclePackageImpl#getScopeConstraint()
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
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE_CONSTRAINT__CONSTRAINT = eINSTANCE.getScopeConstraint_Constraint();

		/**
		 * The meta object literal for the '<em><b>Constraint Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE_CONSTRAINT__CONSTRAINT_TYPE = eINSTANCE.getScopeConstraint_ConstraintType();

		/**
		 * The meta object literal for the '{@link CSMN.Lifecycle.impl.ProductConstraintImpl <em>Product Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Lifecycle.impl.ProductConstraintImpl
		 * @see CSMN.Lifecycle.impl.LifecyclePackageImpl#getProductConstraint()
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
		 * The meta object literal for the '<em><b>Software Version</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_CONSTRAINT__SOFTWARE_VERSION = eINSTANCE.getProductConstraint_SoftwareVersion();

		/**
		 * The meta object literal for the '{@link CSMN.Lifecycle.ScopeConstraintType <em>Scope Constraint Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Lifecycle.ScopeConstraintType
		 * @see CSMN.Lifecycle.impl.LifecyclePackageImpl#getScopeConstraintType()
		 * @generated
		 */
		EEnum SCOPE_CONSTRAINT_TYPE = eINSTANCE.getScopeConstraintType();

	}

} //LifecyclePackage
