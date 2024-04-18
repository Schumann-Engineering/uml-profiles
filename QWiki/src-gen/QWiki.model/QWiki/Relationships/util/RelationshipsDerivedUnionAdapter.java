/**
 */
package QWiki.Relationships.util;

import QWiki.Relationships.DO_NOT_USE_RelationshipType;
import QWiki.Relationships.DO_NOT_USE_SuperseedingRelationship;
import QWiki.Relationships.RelationshipsPackage;

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
 * @see QWiki.Relationships.RelationshipsPackage
 * @generated
 */
public class RelationshipsDerivedUnionAdapter extends AdapterImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RelationshipsPackage modelPackage;

	/**
	 * Creates an instance of the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipsDerivedUnionAdapter() {
		if (modelPackage == null) {
			modelPackage = RelationshipsPackage.eINSTANCE;
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
			case RelationshipsPackage.DO_NOT_USE_RELATIONSHIP_TYPE:
				notifyDO_NOT_USE_RelationshipTypeChanged(notification, eClass);
				break;
			case RelationshipsPackage.DO_NOT_USE_SUPERSEEDING_RELATIONSHIP:
				notifyDO_NOT_USE_SuperseedingRelationshipChanged(notification, eClass);
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
	protected void notifyDO_NOT_USE_RelationshipTypeChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(DO_NOT_USE_RelationshipType.class)) {
			case RelationshipsPackage.DO_NOT_USE_RELATIONSHIP_TYPE__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case RelationshipsPackage.DO_NOT_USE_RELATIONSHIP_TYPE__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case RelationshipsPackage.DO_NOT_USE_RELATIONSHIP_TYPE__NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case RelationshipsPackage.DO_NOT_USE_RELATIONSHIP_TYPE__QWIKI_NAMESPACE:
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
	protected void notifyDO_NOT_USE_SuperseedingRelationshipChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(DO_NOT_USE_SuperseedingRelationship.class)) {
			case RelationshipsPackage.DO_NOT_USE_SUPERSEEDING_RELATIONSHIP__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case RelationshipsPackage.DO_NOT_USE_SUPERSEEDING_RELATIONSHIP__SOURCE:
				notifyChanged(notification, eClass, UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case RelationshipsPackage.DO_NOT_USE_SUPERSEEDING_RELATIONSHIP__TARGET:
				notifyChanged(notification, eClass, UMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
		}
	}

} //RelationshipsDerivedUnionAdapter
