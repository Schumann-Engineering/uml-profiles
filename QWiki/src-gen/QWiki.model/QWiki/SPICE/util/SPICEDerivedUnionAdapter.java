/**
 */
package QWiki.SPICE.util;

import QWiki.Infrastructure.InfrastructurePackage;

import QWiki.SPICE.GenericWorkProduct;
import QWiki.SPICE.Outcome;
import QWiki.SPICE.ProcessGroup;
import QWiki.SPICE.ProcessReferenceModel;
import QWiki.SPICE.SPICEPackage;
import QWiki.SPICE.SpiceBasePractise;
import QWiki.SPICE.WorkProduct;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.impl.AdapterImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An adapter that propagates notifications for derived unions.
 * <!-- end-user-doc -->
 * @see QWiki.SPICE.SPICEPackage
 * @generated
 */
public class SPICEDerivedUnionAdapter extends AdapterImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SPICEPackage modelPackage;

	/**
	 * Creates an instance of the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPICEDerivedUnionAdapter() {
		if (modelPackage == null) {
			modelPackage = SPICEPackage.eINSTANCE;
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
			case SPICEPackage.SPICE_BASE_PRACTISE:
				notifySpiceBasePractiseChanged(notification, eClass);
				break;
			case SPICEPackage.PROCESS_REFERENCE_MODEL:
				notifyProcessReferenceModelChanged(notification, eClass);
				break;
			case SPICEPackage.PROCESS:
				notifyProcessChanged(notification, eClass);
				break;
			case SPICEPackage.PROCESS_GROUP:
				notifyProcessGroupChanged(notification, eClass);
				break;
			case SPICEPackage.OUTCOME:
				notifyOutcomeChanged(notification, eClass);
				break;
			case SPICEPackage.WORK_PRODUCT:
				notifyWorkProductChanged(notification, eClass);
				break;
			case SPICEPackage.GENERIC_WORK_PRODUCT:
				notifyGenericWorkProductChanged(notification, eClass);
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
	protected void notifySpiceBasePractiseChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(SpiceBasePractise.class)) {
			case SPICEPackage.SPICE_BASE_PRACTISE__OWNED_COMMENT:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.SPICE_BASE_PRACTISE__DIRECTED_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case SPICEPackage.SPICE_BASE_PRACTISE__MODEL:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case SPICEPackage.SPICE_BASE_PRACTISE__SUPERSEEDING_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case SPICEPackage.SPICE_BASE_PRACTISE__NAMESPACE:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case SPICEPackage.SPICE_BASE_PRACTISE__OWNING_PROCESS_REFERENCE_MODEL:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case SPICEPackage.SPICE_BASE_PRACTISE__OWNING_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.SPICE_BASE_PRACTISE__MANAGING_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.SPICE_BASE_PRACTISE__PARTICIPATING_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.SPICE_BASE_PRACTISE__OWNING_PROCESS:
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
	protected void notifyProcessReferenceModelChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ProcessReferenceModel.class)) {
			case SPICEPackage.PROCESS_REFERENCE_MODEL__OWNED_COMMENT:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.PROCESS_REFERENCE_MODEL__DIRECTED_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case SPICEPackage.PROCESS_REFERENCE_MODEL__MODEL:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case SPICEPackage.PROCESS_REFERENCE_MODEL__SUPERSEEDING_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case SPICEPackage.PROCESS_REFERENCE_MODEL__NAMESPACE:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case SPICEPackage.PROCESS_REFERENCE_MODEL__OWNED_SPICE_ELEMENT:
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
	protected void notifyProcessChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(QWiki.SPICE.Process.class)) {
			case SPICEPackage.PROCESS__OWNED_COMMENT:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.PROCESS__DIRECTED_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case SPICEPackage.PROCESS__MODEL:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case SPICEPackage.PROCESS__SUPERSEEDING_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case SPICEPackage.PROCESS__NAMESPACE:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case SPICEPackage.PROCESS__OWNING_PROCESS_REFERENCE_MODEL:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case SPICEPackage.PROCESS__OWNING_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.PROCESS__MANAGING_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.PROCESS__PARTICIPATING_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.PROCESS__OWNING_PROCESS_GROUP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case SPICEPackage.PROCESS__OWNED_OUTCOME:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.PROCESS__OWNED_BASE_PRACTISE:
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
	protected void notifyProcessGroupChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ProcessGroup.class)) {
			case SPICEPackage.PROCESS_GROUP__OWNED_COMMENT:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.PROCESS_GROUP__DIRECTED_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case SPICEPackage.PROCESS_GROUP__MODEL:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case SPICEPackage.PROCESS_GROUP__SUPERSEEDING_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case SPICEPackage.PROCESS_GROUP__NAMESPACE:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case SPICEPackage.PROCESS_GROUP__OWNING_PROCESS_REFERENCE_MODEL:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case SPICEPackage.PROCESS_GROUP__OWNING_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.PROCESS_GROUP__MANAGING_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.PROCESS_GROUP__PARTICIPATING_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.PROCESS_GROUP__OWNED_PROCESS:
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
	protected void notifyOutcomeChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Outcome.class)) {
			case SPICEPackage.OUTCOME__OWNED_COMMENT:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.OUTCOME__DIRECTED_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case SPICEPackage.OUTCOME__MODEL:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case SPICEPackage.OUTCOME__SUPERSEEDING_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case SPICEPackage.OUTCOME__NAMESPACE:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case SPICEPackage.OUTCOME__OWNING_PROCESS:
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
	protected void notifyWorkProductChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(WorkProduct.class)) {
			case SPICEPackage.WORK_PRODUCT__OWNED_COMMENT:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.WORK_PRODUCT__DIRECTED_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case SPICEPackage.WORK_PRODUCT__MODEL:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case SPICEPackage.WORK_PRODUCT__SUPERSEEDING_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case SPICEPackage.WORK_PRODUCT__NAMESPACE:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case SPICEPackage.WORK_PRODUCT__OWNING_PROCESS_REFERENCE_MODEL:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case SPICEPackage.WORK_PRODUCT__OWNING_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.WORK_PRODUCT__MANAGING_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.WORK_PRODUCT__PARTICIPATING_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP:
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
	protected void notifyGenericWorkProductChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(GenericWorkProduct.class)) {
			case SPICEPackage.GENERIC_WORK_PRODUCT__OWNED_COMMENT:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.GENERIC_WORK_PRODUCT__DIRECTED_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case SPICEPackage.GENERIC_WORK_PRODUCT__MODEL:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case SPICEPackage.GENERIC_WORK_PRODUCT__SUPERSEEDING_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case SPICEPackage.GENERIC_WORK_PRODUCT__NAMESPACE:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case SPICEPackage.GENERIC_WORK_PRODUCT__OWNING_PROCESS_REFERENCE_MODEL:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case SPICEPackage.GENERIC_WORK_PRODUCT__OWNING_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.GENERIC_WORK_PRODUCT__MANAGING_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.GENERIC_WORK_PRODUCT__PARTICIPATING_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.GENERIC_WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case SPICEPackage.GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

} //SPICEDerivedUnionAdapter
