/**
 */
package QWiki.Spice.util;

import QWiki.QWikiPackage;

import QWiki.Spice.BasePractise;
import QWiki.Spice.GenericWorkProduct;
import QWiki.Spice.Outcome;
import QWiki.Spice.ProcessGroup;
import QWiki.Spice.ProcessReferenceModel;
import QWiki.Spice.SpicePackage;
import QWiki.Spice.WorkProduct;
import QWiki.Spice.WorkProductRelationship;
import QWiki.Spice.WorkProductRelationshipType;

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
 * @see QWiki.Spice.SpicePackage
 * @generated
 */
public class SpiceDerivedUnionAdapter extends AdapterImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpicePackage modelPackage;

	/**
	 * Creates an instance of the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpiceDerivedUnionAdapter() {
		if (modelPackage == null) {
			modelPackage = SpicePackage.eINSTANCE;
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
			case SpicePackage.BASE_PRACTISE:
				notifyBasePractiseChanged(notification, eClass);
				break;
			case SpicePackage.PROCESS_REFERENCE_MODEL:
				notifyProcessReferenceModelChanged(notification, eClass);
				break;
			case SpicePackage.PROCESS:
				notifyProcessChanged(notification, eClass);
				break;
			case SpicePackage.PROCESS_GROUP:
				notifyProcessGroupChanged(notification, eClass);
				break;
			case SpicePackage.OUTCOME:
				notifyOutcomeChanged(notification, eClass);
				break;
			case SpicePackage.WORK_PRODUCT:
				notifyWorkProductChanged(notification, eClass);
				break;
			case SpicePackage.GENERIC_WORK_PRODUCT:
				notifyGenericWorkProductChanged(notification, eClass);
				break;
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP:
				notifyWorkProductRelationshipChanged(notification, eClass);
				break;
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP_TYPE:
				notifyWorkProductRelationshipTypeChanged(notification, eClass);
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
			case SpicePackage.BASE_PRACTISE__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.BASE_PRACTISE__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.BASE_PRACTISE__NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SpicePackage.BASE_PRACTISE__OWNED_RULE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SpicePackage.BASE_PRACTISE__ELEMENT_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.BASE_PRACTISE__PACKAGE_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.BASE_PRACTISE__OWNED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SpicePackage.BASE_PRACTISE__IMPORTED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SpicePackage.BASE_PRACTISE__QWIKI_NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SpicePackage.BASE_PRACTISE__QWIKI_ELEMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SpicePackage.BASE_PRACTISE__OWNING_PROCESS_REFERENCE_MODEL:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SpicePackage.BASE_PRACTISE__OWNER_ROLE:
				notifyChanged(notification, eClass, SpicePackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SpicePackage.BASE_PRACTISE__MANAGER_ROLE:
				notifyChanged(notification, eClass, SpicePackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SpicePackage.BASE_PRACTISE__PARTICIPANT_ROLE:
				notifyChanged(notification, eClass, SpicePackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SpicePackage.BASE_PRACTISE__OWNING_PROCESS:
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
			case SpicePackage.PROCESS_REFERENCE_MODEL__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.PROCESS_REFERENCE_MODEL__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.PROCESS_REFERENCE_MODEL__NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SpicePackage.PROCESS_REFERENCE_MODEL__OWNED_RULE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SpicePackage.PROCESS_REFERENCE_MODEL__ELEMENT_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.PROCESS_REFERENCE_MODEL__PACKAGE_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.PROCESS_REFERENCE_MODEL__OWNED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SpicePackage.PROCESS_REFERENCE_MODEL__IMPORTED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SpicePackage.PROCESS_REFERENCE_MODEL__QWIKI_NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SpicePackage.PROCESS_REFERENCE_MODEL__QWIKI_ELEMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SpicePackage.PROCESS_REFERENCE_MODEL__OWNED_SPICE_ELEMENT:
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
			case SpicePackage.PROCESS__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.PROCESS__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.PROCESS__NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SpicePackage.PROCESS__OWNED_RULE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SpicePackage.PROCESS__ELEMENT_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.PROCESS__PACKAGE_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.PROCESS__OWNED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SpicePackage.PROCESS__IMPORTED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SpicePackage.PROCESS__QWIKI_NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SpicePackage.PROCESS__QWIKI_ELEMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SpicePackage.PROCESS__OWNING_PROCESS_REFERENCE_MODEL:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SpicePackage.PROCESS__OWNER_ROLE:
				notifyChanged(notification, eClass, SpicePackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SpicePackage.PROCESS__MANAGER_ROLE:
				notifyChanged(notification, eClass, SpicePackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SpicePackage.PROCESS__PARTICIPANT_ROLE:
				notifyChanged(notification, eClass, SpicePackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SpicePackage.PROCESS__OWNING_PROCESS_GROUP:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SpicePackage.PROCESS__OWNED_OUTCOME:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SpicePackage.PROCESS__OWNED_BASE_PRACTISE:
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
			case SpicePackage.PROCESS_GROUP__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.PROCESS_GROUP__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.PROCESS_GROUP__NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SpicePackage.PROCESS_GROUP__OWNED_RULE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SpicePackage.PROCESS_GROUP__ELEMENT_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.PROCESS_GROUP__PACKAGE_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.PROCESS_GROUP__OWNED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SpicePackage.PROCESS_GROUP__IMPORTED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SpicePackage.PROCESS_GROUP__QWIKI_NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SpicePackage.PROCESS_GROUP__QWIKI_ELEMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SpicePackage.PROCESS_GROUP__OWNING_PROCESS_REFERENCE_MODEL:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SpicePackage.PROCESS_GROUP__OWNER_ROLE:
				notifyChanged(notification, eClass, SpicePackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SpicePackage.PROCESS_GROUP__MANAGER_ROLE:
				notifyChanged(notification, eClass, SpicePackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SpicePackage.PROCESS_GROUP__PARTICIPANT_ROLE:
				notifyChanged(notification, eClass, SpicePackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SpicePackage.PROCESS_GROUP__OWNED_PROCESS:
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
			case SpicePackage.OUTCOME__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.OUTCOME__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.OUTCOME__NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SpicePackage.OUTCOME__QWIKI_NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SpicePackage.OUTCOME__OWNING_PROCESS:
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
			case SpicePackage.WORK_PRODUCT__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.WORK_PRODUCT__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.WORK_PRODUCT__NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SpicePackage.WORK_PRODUCT__OWNED_RULE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SpicePackage.WORK_PRODUCT__ELEMENT_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.WORK_PRODUCT__PACKAGE_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.WORK_PRODUCT__OWNED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SpicePackage.WORK_PRODUCT__IMPORTED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SpicePackage.WORK_PRODUCT__QWIKI_NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SpicePackage.WORK_PRODUCT__QWIKI_ELEMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SpicePackage.WORK_PRODUCT__OWNING_PROCESS_REFERENCE_MODEL:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SpicePackage.WORK_PRODUCT__OWNER_ROLE:
				notifyChanged(notification, eClass, SpicePackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SpicePackage.WORK_PRODUCT__MANAGER_ROLE:
				notifyChanged(notification, eClass, SpicePackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SpicePackage.WORK_PRODUCT__PARTICIPANT_ROLE:
				notifyChanged(notification, eClass, SpicePackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SpicePackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SpicePackage.WORK_PRODUCT__CONTAINED_WORK_PRODUCT:
				notifyChanged(notification, eClass, SpicePackage.Literals.WORK_PRODUCT__LINKED_WORK_PRODUCT);
				break;
			case SpicePackage.WORK_PRODUCT__CONTAINING_WORK_PRODUCT:
				notifyChanged(notification, eClass, SpicePackage.Literals.WORK_PRODUCT__LINKED_WORK_PRODUCT);
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
			case SpicePackage.GENERIC_WORK_PRODUCT__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.GENERIC_WORK_PRODUCT__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.GENERIC_WORK_PRODUCT__NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SpicePackage.GENERIC_WORK_PRODUCT__OWNED_RULE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SpicePackage.GENERIC_WORK_PRODUCT__ELEMENT_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.GENERIC_WORK_PRODUCT__PACKAGE_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.GENERIC_WORK_PRODUCT__OWNED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SpicePackage.GENERIC_WORK_PRODUCT__IMPORTED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SpicePackage.GENERIC_WORK_PRODUCT__QWIKI_NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SpicePackage.GENERIC_WORK_PRODUCT__QWIKI_ELEMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case SpicePackage.GENERIC_WORK_PRODUCT__OWNING_PROCESS_REFERENCE_MODEL:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SpicePackage.GENERIC_WORK_PRODUCT__OWNER_ROLE:
				notifyChanged(notification, eClass, SpicePackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SpicePackage.GENERIC_WORK_PRODUCT__MANAGER_ROLE:
				notifyChanged(notification, eClass, SpicePackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SpicePackage.GENERIC_WORK_PRODUCT__PARTICIPANT_ROLE:
				notifyChanged(notification, eClass, SpicePackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case SpicePackage.GENERIC_WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SpicePackage.GENERIC_WORK_PRODUCT__CONTAINED_WORK_PRODUCT:
				notifyChanged(notification, eClass, SpicePackage.Literals.WORK_PRODUCT__LINKED_WORK_PRODUCT);
				break;
			case SpicePackage.GENERIC_WORK_PRODUCT__CONTAINING_WORK_PRODUCT:
				notifyChanged(notification, eClass, SpicePackage.Literals.WORK_PRODUCT__LINKED_WORK_PRODUCT);
				break;
			case SpicePackage.GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT:
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
	protected void notifyWorkProductRelationshipChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(WorkProductRelationship.class)) {
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP__SOURCE:
				notifyChanged(notification, eClass, UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP__TARGET:
				notifyChanged(notification, eClass, UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP__LINKING_WORK_PRODUCT:
				notifyChanged(notification, eClass, UMLPackage.Literals.DIRECTED_RELATIONSHIP__SOURCE);
				notifyChanged(notification, eClass, UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP__LINKED_WORK_PRODUCT:
				notifyChanged(notification, eClass, UMLPackage.Literals.DIRECTED_RELATIONSHIP__TARGET);
				notifyChanged(notification, eClass, UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
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
	protected void notifyWorkProductRelationshipTypeChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(WorkProductRelationshipType.class)) {
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP_TYPE__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP_TYPE__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP_TYPE__NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP_TYPE__QWIKI_NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP_TYPE__WORK_PRODUCT_RELATIONSHIP:
				notifyChanged(notification, eClass, QWikiPackage.Literals.QWIKI_RELATIONSHIP_TYPE__RELATIONSHIP);
				break;
		}
	}

} //SpiceDerivedUnionAdapter
