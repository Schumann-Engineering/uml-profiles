/**
 */
package QWiki.Kernel.impl;

import QWiki.Kernel.*;

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
public class KernelFactoryImpl extends EFactoryImpl implements KernelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KernelFactory init() {
		try {
			KernelFactory theKernelFactory = (KernelFactory)EPackage.Registry.INSTANCE.getEFactory(KernelPackage.eNS_URI);
			if (theKernelFactory != null) {
				return theKernelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KernelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KernelFactoryImpl() {
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
			case KernelPackage.I1_8N_KEYED_STRING: return createI18nKeyedString();
			case KernelPackage.I1_8N_BASE_STRING: return createI18nBaseString();
			case KernelPackage.I1_8N_VALUE: return createI18nValue();
			case KernelPackage.I1_8N_STRING: return createI18nString();
			case KernelPackage.QWIKI_COMMENT: return createQWikiComment();
			case KernelPackage.QWIKI_CONTAINER: return createQWikiContainer();
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
	public QWikiComment createQWikiComment() {
		QWikiCommentImpl qWikiComment = new QWikiCommentImpl();
		return qWikiComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QWikiContainer createQWikiContainer() {
		QWikiContainerImpl qWikiContainer = new QWikiContainerImpl();
		return qWikiContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KernelPackage getKernelPackage() {
		return (KernelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KernelPackage getPackage() {
		return KernelPackage.eINSTANCE;
	}

} //KernelFactoryImpl
