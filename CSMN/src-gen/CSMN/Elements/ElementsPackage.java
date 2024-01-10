/**
 */
package CSMN.Elements;

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
 * @see CSMN.Elements.ElementsFactory
 * @model kind="package"
 * @generated
 */
public interface ElementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Elements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schumann.engineering/csmn/1/Elements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CSMN.Elements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ElementsPackage eINSTANCE = CSMN.Elements.impl.ElementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link CSMN.Elements.impl.SystemElementImpl <em>System Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Elements.impl.SystemElementImpl
	 * @see CSMN.Elements.impl.ElementsPackageImpl#getSystemElement()
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
	 * The number of structural features of the '<em>System Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>System Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSMN.Elements.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Elements.impl.UserImpl
	 * @see CSMN.Elements.impl.ElementsPackageImpl#getUser()
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
	 * The meta object id for the '{@link CSMN.Elements.impl.EnvironmentElementImpl <em>Environment Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Elements.impl.EnvironmentElementImpl
	 * @see CSMN.Elements.impl.ElementsPackageImpl#getEnvironmentElement()
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
	 * The meta object id for the '{@link CSMN.Elements.impl.SecurityZoneImpl <em>Security Zone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Elements.impl.SecurityZoneImpl
	 * @see CSMN.Elements.impl.ElementsPackageImpl#getSecurityZone()
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
	 * The meta object id for the '{@link CSMN.Elements.impl.BoxImpl <em>Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Elements.impl.BoxImpl
	 * @see CSMN.Elements.impl.ElementsPackageImpl#getBox()
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
	 * The meta object id for the '{@link CSMN.Elements.impl.EnvironmentLibraryImpl <em>Environment Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Elements.impl.EnvironmentLibraryImpl
	 * @see CSMN.Elements.impl.ElementsPackageImpl#getEnvironmentLibrary()
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
	 * The meta object id for the '{@link CSMN.Elements.UserType <em>User Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Elements.UserType
	 * @see CSMN.Elements.impl.ElementsPackageImpl#getUserType()
	 * @generated
	 */
	int USER_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link CSMN.Elements.SystemElement <em>System Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Element</em>'.
	 * @see CSMN.Elements.SystemElement
	 * @generated
	 */
	EClass getSystemElement();

	/**
	 * Returns the meta object for the reference '{@link CSMN.Elements.SystemElement#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see CSMN.Elements.SystemElement#getBase_Component()
	 * @see #getSystemElement()
	 * @generated
	 */
	EReference getSystemElement_Base_Component();

	/**
	 * Returns the meta object for class '{@link CSMN.Elements.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see CSMN.Elements.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the reference '{@link CSMN.Elements.User#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see CSMN.Elements.User#getBase_Component()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Base_Component();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Elements.User#getUserType <em>User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Type</em>'.
	 * @see CSMN.Elements.User#getUserType()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserType();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Elements.User#isUseFilledIcon <em>Use Filled Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Filled Icon</em>'.
	 * @see CSMN.Elements.User#isUseFilledIcon()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UseFilledIcon();

	/**
	 * Returns the meta object for the reference '{@link CSMN.Elements.User#getBase_Actor <em>Base Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Actor</em>'.
	 * @see CSMN.Elements.User#getBase_Actor()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Base_Actor();

	/**
	 * Returns the meta object for class '{@link CSMN.Elements.EnvironmentElement <em>Environment Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Element</em>'.
	 * @see CSMN.Elements.EnvironmentElement
	 * @generated
	 */
	EClass getEnvironmentElement();

	/**
	 * Returns the meta object for the reference '{@link CSMN.Elements.EnvironmentElement#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see CSMN.Elements.EnvironmentElement#getBase_Component()
	 * @see #getEnvironmentElement()
	 * @generated
	 */
	EReference getEnvironmentElement_Base_Component();

	/**
	 * Returns the meta object for class '{@link CSMN.Elements.SecurityZone <em>Security Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Zone</em>'.
	 * @see CSMN.Elements.SecurityZone
	 * @generated
	 */
	EClass getSecurityZone();

	/**
	 * Returns the meta object for the reference '{@link CSMN.Elements.SecurityZone#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see CSMN.Elements.SecurityZone#getBase_Package()
	 * @see #getSecurityZone()
	 * @generated
	 */
	EReference getSecurityZone_Base_Package();

	/**
	 * Returns the meta object for the reference '{@link CSMN.Elements.SecurityZone#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see CSMN.Elements.SecurityZone#getBase_Component()
	 * @see #getSecurityZone()
	 * @generated
	 */
	EReference getSecurityZone_Base_Component();

	/**
	 * Returns the meta object for class '{@link CSMN.Elements.Box <em>Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Box</em>'.
	 * @see CSMN.Elements.Box
	 * @generated
	 */
	EClass getBox();

	/**
	 * Returns the meta object for the reference '{@link CSMN.Elements.Box#getBase_Comment <em>Base Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Comment</em>'.
	 * @see CSMN.Elements.Box#getBase_Comment()
	 * @see #getBox()
	 * @generated
	 */
	EReference getBox_Base_Comment();

	/**
	 * Returns the meta object for the reference '{@link CSMN.Elements.Box#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see CSMN.Elements.Box#getBase_Package()
	 * @see #getBox()
	 * @generated
	 */
	EReference getBox_Base_Package();

	/**
	 * Returns the meta object for class '{@link CSMN.Elements.EnvironmentLibrary <em>Environment Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Library</em>'.
	 * @see CSMN.Elements.EnvironmentLibrary
	 * @generated
	 */
	EClass getEnvironmentLibrary();

	/**
	 * Returns the meta object for the reference '{@link CSMN.Elements.EnvironmentLibrary#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see CSMN.Elements.EnvironmentLibrary#getBase_Package()
	 * @see #getEnvironmentLibrary()
	 * @generated
	 */
	EReference getEnvironmentLibrary_Base_Package();

	/**
	 * Returns the meta object for enum '{@link CSMN.Elements.UserType <em>User Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>User Type</em>'.
	 * @see CSMN.Elements.UserType
	 * @generated
	 */
	EEnum getUserType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ElementsFactory getElementsFactory();

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
		 * The meta object literal for the '{@link CSMN.Elements.impl.SystemElementImpl <em>System Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Elements.impl.SystemElementImpl
		 * @see CSMN.Elements.impl.ElementsPackageImpl#getSystemElement()
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
		 * The meta object literal for the '{@link CSMN.Elements.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Elements.impl.UserImpl
		 * @see CSMN.Elements.impl.ElementsPackageImpl#getUser()
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
		 * The meta object literal for the '{@link CSMN.Elements.impl.EnvironmentElementImpl <em>Environment Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Elements.impl.EnvironmentElementImpl
		 * @see CSMN.Elements.impl.ElementsPackageImpl#getEnvironmentElement()
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
		 * The meta object literal for the '{@link CSMN.Elements.impl.SecurityZoneImpl <em>Security Zone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Elements.impl.SecurityZoneImpl
		 * @see CSMN.Elements.impl.ElementsPackageImpl#getSecurityZone()
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
		 * The meta object literal for the '{@link CSMN.Elements.impl.BoxImpl <em>Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Elements.impl.BoxImpl
		 * @see CSMN.Elements.impl.ElementsPackageImpl#getBox()
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
		 * The meta object literal for the '{@link CSMN.Elements.impl.EnvironmentLibraryImpl <em>Environment Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Elements.impl.EnvironmentLibraryImpl
		 * @see CSMN.Elements.impl.ElementsPackageImpl#getEnvironmentLibrary()
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
		 * The meta object literal for the '{@link CSMN.Elements.UserType <em>User Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Elements.UserType
		 * @see CSMN.Elements.impl.ElementsPackageImpl#getUserType()
		 * @generated
		 */
		EEnum USER_TYPE = eINSTANCE.getUserType();

	}

} //ElementsPackage
