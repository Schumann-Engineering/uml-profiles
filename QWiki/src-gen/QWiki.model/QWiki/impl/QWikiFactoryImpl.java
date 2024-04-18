/**
 */
package QWiki.impl;

import QWiki.*;

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
public class QWikiFactoryImpl extends EFactoryImpl implements QWikiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QWikiFactory init() {
		try {
			QWikiFactory theQWikiFactory = (QWikiFactory)EPackage.Registry.INSTANCE.getEFactory(QWikiPackage.eNS_URI);
			if (theQWikiFactory != null) {
				return theQWikiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QWikiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWikiFactoryImpl() {
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
			case QWikiPackage.L1_0N_KEYED_STRING: return createL10nKeyedString();
			case QWikiPackage.L1_0N_BASE_STRING: return createL10nBaseString();
			case QWikiPackage.L1_0N_TEXT: return createL10nText();
			case QWikiPackage.QWIKI_ENCRYPTION_KEY: return createQWikiEncryptionKey();
			case QWikiPackage.QWIKI_MODEL: return createQWikiModel();
			case QWikiPackage.QWIKI_CONTAINER: return createQWikiContainer();
			case QWikiPackage.L1_0N_STRING: return createL10nString();
			case QWikiPackage.QWIKI_COMMENT: return createQWikiComment();
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
	public L10nKeyedString createL10nKeyedString() {
		L10nKeyedStringImpl l10nKeyedString = new L10nKeyedStringImpl();
		return l10nKeyedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public L10nBaseString createL10nBaseString() {
		L10nBaseStringImpl l10nBaseString = new L10nBaseStringImpl();
		return l10nBaseString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public L10nText createL10nText() {
		L10nTextImpl l10nText = new L10nTextImpl();
		return l10nText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QWikiEncryptionKey createQWikiEncryptionKey() {
		QWikiEncryptionKeyImpl qWikiEncryptionKey = new QWikiEncryptionKeyImpl();
		return qWikiEncryptionKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QWikiModel createQWikiModel() {
		QWikiModelImpl qWikiModel = new QWikiModelImpl();
		return qWikiModel;
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
	public L10nString createL10nString() {
		L10nStringImpl l10nString = new L10nStringImpl();
		return l10nString;
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
	public QWikiPackage getQWikiPackage() {
		return (QWikiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QWikiPackage getPackage() {
		return QWikiPackage.eINSTANCE;
	}

} //QWikiFactoryImpl
