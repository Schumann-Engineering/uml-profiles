/**
 */
package CSMN.Characteristics.Security;

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
 * @see CSMN.Characteristics.Security.SecurityFactory
 * @model kind="package"
 * @generated
 */
public interface SecurityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Security";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schumann-engineering/csmn/1/Characteristics/Security";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CSMN.Characteristics.Security";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecurityPackage eINSTANCE = CSMN.Characteristics.Security.impl.SecurityPackageImpl.init();

	/**
	 * The meta object id for the '{@link CSMN.Characteristics.Security.impl.Iec62443SecurityLevelCharacteristicImpl <em>Iec62443 Security Level Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Characteristics.Security.impl.Iec62443SecurityLevelCharacteristicImpl
	 * @see CSMN.Characteristics.Security.impl.SecurityPackageImpl#getIec62443SecurityLevelCharacteristic()
	 * @generated
	 */
	int IEC62443_SECURITY_LEVEL_CHARACTERISTIC = 0;

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
	 * The meta object id for the '{@link CSMN.Characteristics.Security.impl.SecurityLevelImpl <em>Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Characteristics.Security.impl.SecurityLevelImpl
	 * @see CSMN.Characteristics.Security.impl.SecurityPackageImpl#getSecurityLevel()
	 * @generated
	 */
	int SECURITY_LEVEL = 1;

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
	 * The number of structural features of the '<em>Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_LEVEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSMN.Characteristics.Security.Iec62443SecurityLevel <em>Iec62443 Security Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Characteristics.Security.Iec62443SecurityLevel
	 * @see CSMN.Characteristics.Security.impl.SecurityPackageImpl#getIec62443SecurityLevel()
	 * @generated
	 */
	int IEC62443_SECURITY_LEVEL = 2;

	/**
	 * The meta object id for the '{@link CSMN.Characteristics.Security.Iec62443FoundationalRequirementType <em>Iec62443 Foundational Requirement Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Characteristics.Security.Iec62443FoundationalRequirementType
	 * @see CSMN.Characteristics.Security.impl.SecurityPackageImpl#getIec62443FoundationalRequirementType()
	 * @generated
	 */
	int IEC62443_FOUNDATIONAL_REQUIREMENT_TYPE = 3;

	/**
	 * The meta object id for the '{@link CSMN.Characteristics.Security.Iec62443SecurityLevelType <em>Iec62443 Security Level Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.Characteristics.Security.Iec62443SecurityLevelType
	 * @see CSMN.Characteristics.Security.impl.SecurityPackageImpl#getIec62443SecurityLevelType()
	 * @generated
	 */
	int IEC62443_SECURITY_LEVEL_TYPE = 4;


	/**
	 * Returns the meta object for class '{@link CSMN.Characteristics.Security.Iec62443SecurityLevelCharacteristic <em>Iec62443 Security Level Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iec62443 Security Level Characteristic</em>'.
	 * @see CSMN.Characteristics.Security.Iec62443SecurityLevelCharacteristic
	 * @generated
	 */
	EClass getIec62443SecurityLevelCharacteristic();

	/**
	 * Returns the meta object for the reference '{@link CSMN.Characteristics.Security.Iec62443SecurityLevelCharacteristic#getBase_NamedElement <em>Base Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Named Element</em>'.
	 * @see CSMN.Characteristics.Security.Iec62443SecurityLevelCharacteristic#getBase_NamedElement()
	 * @see #getIec62443SecurityLevelCharacteristic()
	 * @generated
	 */
	EReference getIec62443SecurityLevelCharacteristic_Base_NamedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link CSMN.Characteristics.Security.Iec62443SecurityLevelCharacteristic#getSecuritylevel <em>Securitylevel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Securitylevel</em>'.
	 * @see CSMN.Characteristics.Security.Iec62443SecurityLevelCharacteristic#getSecuritylevel()
	 * @see #getIec62443SecurityLevelCharacteristic()
	 * @generated
	 */
	EReference getIec62443SecurityLevelCharacteristic_Securitylevel();

	/**
	 * Returns the meta object for class '{@link CSMN.Characteristics.Security.SecurityLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Level</em>'.
	 * @see CSMN.Characteristics.Security.SecurityLevel
	 * @generated
	 */
	EClass getSecurityLevel();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Characteristics.Security.SecurityLevel#getFoundationalRequirement <em>Foundational Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foundational Requirement</em>'.
	 * @see CSMN.Characteristics.Security.SecurityLevel#getFoundationalRequirement()
	 * @see #getSecurityLevel()
	 * @generated
	 */
	EAttribute getSecurityLevel_FoundationalRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link CSMN.Characteristics.Security.SecurityLevel#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Level</em>'.
	 * @see CSMN.Characteristics.Security.SecurityLevel#getLevel()
	 * @see #getSecurityLevel()
	 * @generated
	 */
	EReference getSecurityLevel_Level();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Characteristics.Security.SecurityLevel#getRational <em>Rational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rational</em>'.
	 * @see CSMN.Characteristics.Security.SecurityLevel#getRational()
	 * @see #getSecurityLevel()
	 * @generated
	 */
	EAttribute getSecurityLevel_Rational();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Characteristics.Security.SecurityLevel#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CSMN.Characteristics.Security.SecurityLevel#getType()
	 * @see #getSecurityLevel()
	 * @generated
	 */
	EAttribute getSecurityLevel_Type();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.Characteristics.Security.SecurityLevel#getVector <em>Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vector</em>'.
	 * @see CSMN.Characteristics.Security.SecurityLevel#getVector()
	 * @see #getSecurityLevel()
	 * @generated
	 */
	EAttribute getSecurityLevel_Vector();

	/**
	 * Returns the meta object for enum '{@link CSMN.Characteristics.Security.Iec62443SecurityLevel <em>Iec62443 Security Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Iec62443 Security Level</em>'.
	 * @see CSMN.Characteristics.Security.Iec62443SecurityLevel
	 * @generated
	 */
	EEnum getIec62443SecurityLevel();

	/**
	 * Returns the meta object for enum '{@link CSMN.Characteristics.Security.Iec62443FoundationalRequirementType <em>Iec62443 Foundational Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Iec62443 Foundational Requirement Type</em>'.
	 * @see CSMN.Characteristics.Security.Iec62443FoundationalRequirementType
	 * @generated
	 */
	EEnum getIec62443FoundationalRequirementType();

	/**
	 * Returns the meta object for enum '{@link CSMN.Characteristics.Security.Iec62443SecurityLevelType <em>Iec62443 Security Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Iec62443 Security Level Type</em>'.
	 * @see CSMN.Characteristics.Security.Iec62443SecurityLevelType
	 * @generated
	 */
	EEnum getIec62443SecurityLevelType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SecurityFactory getSecurityFactory();

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
		 * The meta object literal for the '{@link CSMN.Characteristics.Security.impl.Iec62443SecurityLevelCharacteristicImpl <em>Iec62443 Security Level Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Characteristics.Security.impl.Iec62443SecurityLevelCharacteristicImpl
		 * @see CSMN.Characteristics.Security.impl.SecurityPackageImpl#getIec62443SecurityLevelCharacteristic()
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
		 * The meta object literal for the '{@link CSMN.Characteristics.Security.impl.SecurityLevelImpl <em>Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Characteristics.Security.impl.SecurityLevelImpl
		 * @see CSMN.Characteristics.Security.impl.SecurityPackageImpl#getSecurityLevel()
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
		 * The meta object literal for the '{@link CSMN.Characteristics.Security.Iec62443SecurityLevel <em>Iec62443 Security Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Characteristics.Security.Iec62443SecurityLevel
		 * @see CSMN.Characteristics.Security.impl.SecurityPackageImpl#getIec62443SecurityLevel()
		 * @generated
		 */
		EEnum IEC62443_SECURITY_LEVEL = eINSTANCE.getIec62443SecurityLevel();

		/**
		 * The meta object literal for the '{@link CSMN.Characteristics.Security.Iec62443FoundationalRequirementType <em>Iec62443 Foundational Requirement Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Characteristics.Security.Iec62443FoundationalRequirementType
		 * @see CSMN.Characteristics.Security.impl.SecurityPackageImpl#getIec62443FoundationalRequirementType()
		 * @generated
		 */
		EEnum IEC62443_FOUNDATIONAL_REQUIREMENT_TYPE = eINSTANCE.getIec62443FoundationalRequirementType();

		/**
		 * The meta object literal for the '{@link CSMN.Characteristics.Security.Iec62443SecurityLevelType <em>Iec62443 Security Level Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.Characteristics.Security.Iec62443SecurityLevelType
		 * @see CSMN.Characteristics.Security.impl.SecurityPackageImpl#getIec62443SecurityLevelType()
		 * @generated
		 */
		EEnum IEC62443_SECURITY_LEVEL_TYPE = eINSTANCE.getIec62443SecurityLevelType();

	}

} //SecurityPackage
