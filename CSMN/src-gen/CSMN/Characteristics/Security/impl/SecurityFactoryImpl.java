/**
 */
package CSMN.Characteristics.Security.impl;

import CSMN.Characteristics.Security.*;

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
public class SecurityFactoryImpl extends EFactoryImpl implements SecurityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SecurityFactory init() {
		try {
			SecurityFactory theSecurityFactory = (SecurityFactory)EPackage.Registry.INSTANCE.getEFactory(SecurityPackage.eNS_URI);
			if (theSecurityFactory != null) {
				return theSecurityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SecurityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityFactoryImpl() {
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
			case SecurityPackage.IEC62443_SECURITY_LEVEL_CHARACTERISTIC: return createIec62443SecurityLevelCharacteristic();
			case SecurityPackage.SECURITY_LEVEL: return createSecurityLevel();
			case SecurityPackage.CPE_CHARACTERISTIC: return createCpeCharacteristic();
			case SecurityPackage.COMMON_PLATFORM_ENUMERATION: return createCommonPlatformEnumeration();
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
			case SecurityPackage.IEC62443_SECURITY_LEVEL:
				return createIec62443SecurityLevelFromString(eDataType, initialValue);
			case SecurityPackage.IEC62443_FOUNDATIONAL_REQUIREMENT_TYPE:
				return createIec62443FoundationalRequirementTypeFromString(eDataType, initialValue);
			case SecurityPackage.IEC62443_SECURITY_LEVEL_TYPE:
				return createIec62443SecurityLevelTypeFromString(eDataType, initialValue);
			case SecurityPackage.COMMON_PLATFORM_ENUMERATION_TYPE:
				return createCommonPlatformEnumerationTypeFromString(eDataType, initialValue);
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
			case SecurityPackage.IEC62443_SECURITY_LEVEL:
				return convertIec62443SecurityLevelToString(eDataType, instanceValue);
			case SecurityPackage.IEC62443_FOUNDATIONAL_REQUIREMENT_TYPE:
				return convertIec62443FoundationalRequirementTypeToString(eDataType, instanceValue);
			case SecurityPackage.IEC62443_SECURITY_LEVEL_TYPE:
				return convertIec62443SecurityLevelTypeToString(eDataType, instanceValue);
			case SecurityPackage.COMMON_PLATFORM_ENUMERATION_TYPE:
				return convertCommonPlatformEnumerationTypeToString(eDataType, instanceValue);
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
	@Override
	public SecurityPackage getSecurityPackage() {
		return (SecurityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SecurityPackage getPackage() {
		return SecurityPackage.eINSTANCE;
	}

} //SecurityFactoryImpl
