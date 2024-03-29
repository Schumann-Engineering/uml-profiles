/**
 */
package QWiki.I18N.impl;

import QWiki.I18N.*;

import org.eclipse.emf.ecore.EClass;
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
public class I18NFactoryImpl extends EFactoryImpl implements I18NFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static I18NFactory init() {
		try {
			I18NFactory theI18NFactory = (I18NFactory)EPackage.Registry.INSTANCE.getEFactory(I18NPackage.eNS_URI);
			if (theI18NFactory != null) {
				return theI18NFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new I18NFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I18NFactoryImpl() {
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
			case I18NPackage.I1_8N_BASE_STRING: return createI18nBaseString();
			case I18NPackage.I1_8N_VALUE: return createI18nValue();
			case I18NPackage.I1_8N_STRING: return createI18nString();
			case I18NPackage.I1_8N_KEYED_STRING: return createI18nKeyedString();
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
	public I18nBaseString createI18nBaseString() {
		I18nBaseStringImpl i18nBaseString = new I18nBaseStringImpl();
		return i18nBaseString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public I18nValue createI18nValue() {
		I18nValueImpl i18nValue = new I18nValueImpl();
		return i18nValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public I18nString createI18nString() {
		I18nStringImpl i18nString = new I18nStringImpl();
		return i18nString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public I18nKeyedString createI18nKeyedString() {
		I18nKeyedStringImpl i18nKeyedString = new I18nKeyedStringImpl();
		return i18nKeyedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public I18NPackage getI18NPackage() {
		return (I18NPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static I18NPackage getPackage() {
		return I18NPackage.eINSTANCE;
	}

} //I18NFactoryImpl
