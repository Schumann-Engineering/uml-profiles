/**
 */
package QWiki.Infrastructure.util;

import QWiki.Infrastructure.InfrastructurePackage;
import QWiki.Infrastructure.UmlAssociation;
import QWiki.Infrastructure.UmlComment;
import QWiki.Infrastructure.UmlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.impl.AdapterImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An adapter that propagates notifications for derived unions.
 * <!-- end-user-doc -->
 * @see QWiki.Infrastructure.InfrastructurePackage
 * @generated
 */
public class InfrastructureDerivedUnionAdapter extends AdapterImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InfrastructurePackage modelPackage;

	/**
	 * Creates an instance of the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureDerivedUnionAdapter() {
		if (modelPackage == null) {
			modelPackage = InfrastructurePackage.eINSTANCE;
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
			case InfrastructurePackage.UML_ASSOCIATION:
				notifyUmlAssociationChanged(notification, eClass);
				break;
			case InfrastructurePackage.UML_COMMENT:
				notifyUmlCommentChanged(notification, eClass);
				break;
			case InfrastructurePackage.UML_PACKAGE:
				notifyUmlPackageChanged(notification, eClass);
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
	protected void notifyUmlAssociationChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(UmlAssociation.class)) {
			case InfrastructurePackage.UML_ASSOCIATION__OWNED_COMMENT:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case InfrastructurePackage.UML_ASSOCIATION__DIRECTED_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
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
	protected void notifyUmlCommentChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(UmlComment.class)) {
			case InfrastructurePackage.UML_COMMENT__OWNED_COMMENT:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case InfrastructurePackage.UML_COMMENT__DIRECTED_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
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
	protected void notifyUmlPackageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(UmlPackage.class)) {
			case InfrastructurePackage.UML_PACKAGE__OWNED_COMMENT:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case InfrastructurePackage.UML_PACKAGE__DIRECTED_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case InfrastructurePackage.UML_PACKAGE__MODEL:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case InfrastructurePackage.UML_PACKAGE__SUPERSEEDING_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case InfrastructurePackage.UML_PACKAGE__NAMESPACE:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case InfrastructurePackage.UML_PACKAGE__OWNED_MEMBER:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case InfrastructurePackage.UML_PACKAGE__PACKAGED_ELEMENT:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case InfrastructurePackage.UML_PACKAGE__NESTED_PACKAGE:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case InfrastructurePackage.UML_PACKAGE__NESTING_PACKAGE:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
		}
	}

} //InfrastructureDerivedUnionAdapter
