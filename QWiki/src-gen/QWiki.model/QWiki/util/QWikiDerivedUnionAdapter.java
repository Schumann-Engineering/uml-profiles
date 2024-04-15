/**
 */
package QWiki.util;

import QWiki.QWikiComment;
import QWiki.QWikiContainer;
import QWiki.QWikiEncryptionKey;
import QWiki.QWikiModel;
import QWiki.QWikiPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.impl.AdapterImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An adapter that propagates notifications for derived unions.
 * <!-- end-user-doc -->
 * @see QWiki.QWikiPackage
 * @generated
 */
public class QWikiDerivedUnionAdapter extends AdapterImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QWikiPackage modelPackage;

	/**
	 * Creates an instance of the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWikiDerivedUnionAdapter() {
		if (modelPackage == null) {
			modelPackage = QWikiPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> with the appropriate model class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		Object notifier = notification.getNotifier();
		if (notifier instanceof EObject) {
			EClass eClass = ((EObject)notifier).eClass();
			if (eClass.eContainer() == modelPackage) {
				notifyChanged(notification, eClass);
			}
		}
	}

	/**
	 * Calls <code>notifyXXXChanged</code> for the corresponding class of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyChanged(Notification notification, EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QWikiPackage.QWIKI_ENCRYPTION_KEY:
				notifyQWikiEncryptionKeyChanged(notification, eClass);
				break;
			case QWikiPackage.QWIKI_MODEL:
				notifyQWikiModelChanged(notification, eClass);
				break;
			case QWikiPackage.QWIKI_CONTAINER:
				notifyQWikiContainerChanged(notification, eClass);
				break;
			case QWikiPackage.QWIKI_COMMENT:
				notifyQWikiCommentChanged(notification, eClass);
				break;
		}
	}

	/**
	 * Does nothing; clients may override so that it does something.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @param derivedUnion the derived union affected by the change.
	 * @generated
	 */
	public void notifyChanged(Notification notification, EClass eClass, EStructuralFeature derivedUnion) {
		// Do nothing.
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyQWikiEncryptionKeyChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(QWikiEncryptionKey.class)) {
			case QWikiPackage.QWIKI_ENCRYPTION_KEY__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.QWIKI_ENCRYPTION_KEY__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.QWIKI_ENCRYPTION_KEY__NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyQWikiModelChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(QWikiModel.class)) {
			case QWikiPackage.QWIKI_MODEL__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.QWIKI_MODEL__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.QWIKI_MODEL__NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.QWIKI_MODEL__OWNED_RULE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case QWikiPackage.QWIKI_MODEL__ELEMENT_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.QWIKI_MODEL__PACKAGE_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.QWIKI_MODEL__OWNED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case QWikiPackage.QWIKI_MODEL__IMPORTED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case QWikiPackage.QWIKI_MODEL__OWNED_QWIKI_ELEMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyQWikiContainerChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(QWikiContainer.class)) {
			case QWikiPackage.QWIKI_CONTAINER__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.QWIKI_CONTAINER__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.QWIKI_CONTAINER__NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.QWIKI_CONTAINER__OWNED_RULE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case QWikiPackage.QWIKI_CONTAINER__ELEMENT_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.QWIKI_CONTAINER__PACKAGE_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.QWIKI_CONTAINER__OWNED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case QWikiPackage.QWIKI_CONTAINER__IMPORTED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyQWikiCommentChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(QWikiComment.class)) {
			case QWikiPackage.QWIKI_COMMENT__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

} //QWikiDerivedUnionAdapter
