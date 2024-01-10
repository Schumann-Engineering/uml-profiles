/**
 */
package CSMN;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see CSMN.CSMNFactory
 * @model kind="package"
 * @generated
 */
public interface CSMNPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CSMN";

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
	String eNS_PREFIX = "CSMN";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CSMNPackage eINSTANCE = CSMN.impl.CSMNPackageImpl.init();

	/**
	 * The meta object id for the '{@link CSMN.impl.PseudoElementImpl <em>Pseudo Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.impl.PseudoElementImpl
	 * @see CSMN.impl.CSMNPackageImpl#getPseudoElement()
	 * @generated
	 */
	int PSEUDO_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Pseudo Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Pseudo Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_ELEMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link CSMN.PseudoElement <em>Pseudo Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pseudo Element</em>'.
	 * @see CSMN.PseudoElement
	 * @generated
	 */
	EClass getPseudoElement();

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
		 * The meta object literal for the '{@link CSMN.impl.PseudoElementImpl <em>Pseudo Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.impl.PseudoElementImpl
		 * @see CSMN.impl.CSMNPackageImpl#getPseudoElement()
		 * @generated
		 */
		EClass PSEUDO_ELEMENT = eINSTANCE.getPseudoElement();

	}

} //CSMNPackage
