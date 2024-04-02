/**
 */
package QWiki.Spice.util;

import QWiki.Spice.BasePractise;
import QWiki.Spice.GenericWorkProduct;
import QWiki.Spice.Outcome;
import QWiki.Spice.ProcessGroup;
import QWiki.Spice.ProcessReferenceModel;
import QWiki.Spice.SPICEPackage;
import QWiki.Spice.WorkProduct;

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
 * @see QWiki.Spice.SPICEPackage
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
			case SPICEPackage.BASE_PRACTISE:
				notifyBasePractiseChanged(notification, eClass);
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
	protected void notifyBasePractiseChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(BasePractise.class)) {
			case SPICEPackage.BASE_PRACTISE__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.BASE_PRACTISE__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.BASE_PRACTISE__NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SPICEPackage.BASE_PRACTISE__OWNED_RULE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SPICEPackage.BASE_PRACTISE__ELEMENT_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.BASE_PRACTISE__PACKAGE_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.BASE_PRACTISE__OWNED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SPICEPackage.BASE_PRACTISE__IMPORTED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SPICEPackage.BASE_PRACTISE__OWNING_PROCESS_REFERENCE_MODEL:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SPICEPackage.BASE_PRACTISE__OWNER_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.BASE_PRACTISE__MANAGER_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.BASE_PRACTISE__PARTICIPANT_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.BASE_PRACTISE__OWNING_PROCESS:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
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
	protected void notifyProcessReferenceModelChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ProcessReferenceModel.class)) {
			case SPICEPackage.PROCESS_REFERENCE_MODEL__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.PROCESS_REFERENCE_MODEL__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.PROCESS_REFERENCE_MODEL__NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SPICEPackage.PROCESS_REFERENCE_MODEL__OWNED_RULE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SPICEPackage.PROCESS_REFERENCE_MODEL__ELEMENT_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.PROCESS_REFERENCE_MODEL__PACKAGE_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.PROCESS_REFERENCE_MODEL__OWNED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SPICEPackage.PROCESS_REFERENCE_MODEL__IMPORTED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SPICEPackage.PROCESS_REFERENCE_MODEL__OWNED_SPICE_ELEMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
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
	protected void notifyProcessChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(QWiki.Spice.Process.class)) {
			case SPICEPackage.PROCESS__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.PROCESS__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.PROCESS__NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SPICEPackage.PROCESS__OWNED_RULE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SPICEPackage.PROCESS__ELEMENT_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.PROCESS__PACKAGE_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.PROCESS__OWNED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SPICEPackage.PROCESS__IMPORTED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SPICEPackage.PROCESS__OWNING_PROCESS_REFERENCE_MODEL:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SPICEPackage.PROCESS__OWNER_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.PROCESS__MANAGER_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.PROCESS__PARTICIPANT_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.PROCESS__OWNING_PROCESS_GROUP:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SPICEPackage.PROCESS__OWNED_OUTCOME:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SPICEPackage.PROCESS__OWNED_BASE_PRACTISE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
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
	protected void notifyProcessGroupChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(ProcessGroup.class)) {
			case SPICEPackage.PROCESS_GROUP__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.PROCESS_GROUP__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.PROCESS_GROUP__NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SPICEPackage.PROCESS_GROUP__OWNED_RULE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SPICEPackage.PROCESS_GROUP__ELEMENT_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.PROCESS_GROUP__PACKAGE_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.PROCESS_GROUP__OWNED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SPICEPackage.PROCESS_GROUP__IMPORTED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SPICEPackage.PROCESS_GROUP__OWNING_PROCESS_REFERENCE_MODEL:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SPICEPackage.PROCESS_GROUP__OWNER_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.PROCESS_GROUP__MANAGER_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.PROCESS_GROUP__PARTICIPANT_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.PROCESS_GROUP__OWNED_PROCESS:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
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
	protected void notifyOutcomeChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Outcome.class)) {
			case SPICEPackage.OUTCOME__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.OUTCOME__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.OUTCOME__NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SPICEPackage.OUTCOME__OWNING_PROCESS:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
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
	protected void notifyWorkProductChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(WorkProduct.class)) {
			case SPICEPackage.WORK_PRODUCT__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.WORK_PRODUCT__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.WORK_PRODUCT__NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SPICEPackage.WORK_PRODUCT__OWNED_RULE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SPICEPackage.WORK_PRODUCT__ELEMENT_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.WORK_PRODUCT__PACKAGE_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.WORK_PRODUCT__OWNED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SPICEPackage.WORK_PRODUCT__IMPORTED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SPICEPackage.WORK_PRODUCT__OWNING_PROCESS_REFERENCE_MODEL:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SPICEPackage.WORK_PRODUCT__OWNER_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.WORK_PRODUCT__MANAGER_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.WORK_PRODUCT__PARTICIPANT_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
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
	protected void notifyGenericWorkProductChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(GenericWorkProduct.class)) {
			case SPICEPackage.GENERIC_WORK_PRODUCT__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.GENERIC_WORK_PRODUCT__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.GENERIC_WORK_PRODUCT__NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SPICEPackage.GENERIC_WORK_PRODUCT__OWNED_RULE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SPICEPackage.GENERIC_WORK_PRODUCT__ELEMENT_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.GENERIC_WORK_PRODUCT__PACKAGE_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SPICEPackage.GENERIC_WORK_PRODUCT__OWNED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SPICEPackage.GENERIC_WORK_PRODUCT__IMPORTED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SPICEPackage.GENERIC_WORK_PRODUCT__OWNING_PROCESS_REFERENCE_MODEL:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SPICEPackage.GENERIC_WORK_PRODUCT__OWNER_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.GENERIC_WORK_PRODUCT__MANAGER_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.GENERIC_WORK_PRODUCT__PARTICIPANT_ROLE:
				notifyChanged(notification, eClass, SPICEPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SPICEPackage.GENERIC_WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SPICEPackage.GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
		}
	}

} //SPICEDerivedUnionAdapter
