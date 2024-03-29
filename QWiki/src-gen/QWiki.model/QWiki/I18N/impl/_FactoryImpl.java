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
public class _FactoryImpl extends EFactoryImpl implements _Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static _Factory init() {
		try {
			_Factory the_Factory = (_Factory)EPackage.Registry.INSTANCE.getEFactory(_Package.eNS_URI);
			if (the_Factory != null) {
				return the_Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new _FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _FactoryImpl() {
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
			case _Package.I1_8N_BASE_STRING: return createI18nBaseString();
			case _Package.I1_8N_VALUE: return createI18nValue();
			case _Package.I1_8N_STRING: return createI18nString();
			case _Package.I1_8N_KEYED_STRING: return createI18nKeyedString();
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
	public _Package get_Package() {
		return (_Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static _Package getPackage() {
		return _Package.eINSTANCE;
	}

} //_FactoryImpl
