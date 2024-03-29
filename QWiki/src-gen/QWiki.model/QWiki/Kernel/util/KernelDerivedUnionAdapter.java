/**
 */
package QWiki.Kernel.util;

import QWiki.Infrastructure.InfrastructurePackage;

import QWiki.Kernel.DO_NOT_USE_RelationshipType;
import QWiki.Kernel.KernelPackage;
import QWiki.Kernel.ModelDomain;
import QWiki.Kernel.ModelRoot;
import QWiki.Kernel.SuperseedingRelationship;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.impl.AdapterImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An adapter that propagates notifications for derived unions.
 * <!-- end-user-doc -->
 * @see QWiki.Kernel.KernelPackage
 * @generated
 */
public class KernelDerivedUnionAdapter extends AdapterImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KernelPackage modelPackage;

	/**
	 * Creates an instance of the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KernelDerivedUnionAdapter() {
		if (modelPackage == null) {
			modelPackage = KernelPackage.eINSTANCE;
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
			case KernelPackage.MODEL_DOMAIN:
				notifyModelDomainChanged(notification, eClass);
				break;
			case KernelPackage.MODEL_ROOT:
				notifyModelRootChanged(notification, eClass);
				break;
			case KernelPackage.DO_NOT_USE_RELATIONSHIP_TYPE:
				notifyDO_NOT_USE_RelationshipTypeChanged(notification, eClass);
				break;
			case KernelPackage.SUPERSEEDING_RELATIONSHIP:
				notifySuperseedingRelationshipChanged(notification, eClass);
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
	protected void notifyModelDomainChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ModelDomain.class)) {
			case KernelPackage.MODEL_DOMAIN__OWNED_COMMENT:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case KernelPackage.MODEL_DOMAIN__DIRECTED_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case KernelPackage.MODEL_DOMAIN__MODEL:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case KernelPackage.MODEL_DOMAIN__SUPERSEEDING_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case KernelPackage.MODEL_DOMAIN__NAMESPACE:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
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
	protected void notifyModelRootChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ModelRoot.class)) {
			case KernelPackage.MODEL_ROOT__OWNED_COMMENT:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case KernelPackage.MODEL_ROOT__DIRECTED_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case KernelPackage.MODEL_ROOT__MODEL:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case KernelPackage.MODEL_ROOT__SUPERSEEDING_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case KernelPackage.MODEL_ROOT__NAMESPACE:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case KernelPackage.MODEL_ROOT__OWNED_MEMBER:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case KernelPackage.MODEL_ROOT__PACKAGED_ELEMENT:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case KernelPackage.MODEL_ROOT__NESTED_PACKAGE:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case KernelPackage.MODEL_ROOT__NESTING_PACKAGE:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case KernelPackage.MODEL_ROOT__OWNED_MODEL_ELEMENT:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
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
	protected void notifyDO_NOT_USE_RelationshipTypeChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(DO_NOT_USE_RelationshipType.class)) {
			case KernelPackage.DO_NOT_USE_RELATIONSHIP_TYPE__OWNED_COMMENT:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case KernelPackage.DO_NOT_USE_RELATIONSHIP_TYPE__DIRECTED_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case KernelPackage.DO_NOT_USE_RELATIONSHIP_TYPE__MODEL:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case KernelPackage.DO_NOT_USE_RELATIONSHIP_TYPE__SUPERSEEDING_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case KernelPackage.DO_NOT_USE_RELATIONSHIP_TYPE__NAMESPACE:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
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
	protected void notifySuperseedingRelationshipChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(SuperseedingRelationship.class)) {
			case KernelPackage.SUPERSEEDING_RELATIONSHIP__OWNED_COMMENT:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case KernelPackage.SUPERSEEDING_RELATIONSHIP__DIRECTED_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case KernelPackage.SUPERSEEDING_RELATIONSHIP__TARGET:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_RELATIONSHIP__RELATED_ELEMENT);
				break;
			case KernelPackage.SUPERSEEDING_RELATIONSHIP__SOURCE:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

} //KernelDerivedUnionAdapter
