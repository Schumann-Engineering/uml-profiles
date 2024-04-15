/**
 */
package QWiki.References.util;

import QWiki.References.Author;
import QWiki.References.Reference;
import QWiki.References.ReferenceVersion;
import QWiki.References.ReferencesPackage;
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
 * @see QWiki.References.ReferencesPackage
 * @generated
 */
public class ReferencesDerivedUnionAdapter extends AdapterImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReferencesPackage modelPackage;

	/**
	 * Creates an instance of the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencesDerivedUnionAdapter() {
		if (modelPackage == null) {
			modelPackage = ReferencesPackage.eINSTANCE;
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
			case ReferencesPackage.AUTHOR:
				notifyAuthorChanged(notification, eClass);
				break;
			case ReferencesPackage.REFERENCE:
				notifyReferenceChanged(notification, eClass);
				break;
			case ReferencesPackage.REFERENCE_VERSION:
				notifyReferenceVersionChanged(notification, eClass);
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
	protected void notifyAuthorChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Author.class)) {
			case ReferencesPackage.AUTHOR__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case ReferencesPackage.AUTHOR__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case ReferencesPackage.AUTHOR__NAMESPACE:
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
	protected void notifyReferenceChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Reference.class)) {
			case ReferencesPackage.REFERENCE__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case ReferencesPackage.REFERENCE__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case ReferencesPackage.REFERENCE__NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case ReferencesPackage.REFERENCE__OWNED_RULE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case ReferencesPackage.REFERENCE__ELEMENT_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case ReferencesPackage.REFERENCE__PACKAGE_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case ReferencesPackage.REFERENCE__OWNED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case ReferencesPackage.REFERENCE__IMPORTED_MEMBER:
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
	protected void notifyReferenceVersionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ReferenceVersion.class)) {
			case ReferencesPackage.REFERENCE_VERSION__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case ReferencesPackage.REFERENCE_VERSION__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case ReferencesPackage.REFERENCE_VERSION__NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case ReferencesPackage.REFERENCE_VERSION__OWNED_RULE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case ReferencesPackage.REFERENCE_VERSION__ELEMENT_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case ReferencesPackage.REFERENCE_VERSION__PACKAGE_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case ReferencesPackage.REFERENCE_VERSION__OWNED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case ReferencesPackage.REFERENCE_VERSION__IMPORTED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
		}
	}

} //ReferencesDerivedUnionAdapter
