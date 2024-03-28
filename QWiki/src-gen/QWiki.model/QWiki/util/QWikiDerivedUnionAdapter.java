/**
 */
package QWiki.util;

import QWiki.Association;
import QWiki.Author;
import QWiki.BasePractise;
import QWiki.Comment;
import QWiki.Document;
import QWiki.DocumentVersion;
import QWiki.Domain;
import QWiki.GenericWorkProduct;
import QWiki.Outcome;
import QWiki.ProcessGroup;
import QWiki.ProcessReferenceModel;
import QWiki.QWikiModel;
import QWiki.QWikiPackage;
import QWiki.RelationshipType;
import QWiki.Role;
import QWiki.Section;
import QWiki.SuperseedingRelationship;
import QWiki.Term;
import QWiki.TermDefinition;
import QWiki.WorkProduct;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.impl.AdapterImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

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
			case QWikiPackage.AUTHOR:
				notifyAuthorChanged(notification, eClass);
				break;
			case QWikiPackage.COMMENT:
				notifyCommentChanged(notification, eClass);
				break;
			case QWikiPackage.QWIKI_MODEL:
				notifyQWikiModelChanged(notification, eClass);
				break;
			case QWikiPackage.DOMAIN:
				notifyDomainChanged(notification, eClass);
				break;
			case QWikiPackage.PACKAGE:
				notifyPackageChanged(notification, eClass);
				break;
			case QWikiPackage.DOCUMENT:
				notifyDocumentChanged(notification, eClass);
				break;
			case QWikiPackage.DOCUMENT_VERSION:
				notifyDocumentVersionChanged(notification, eClass);
				break;
			case QWikiPackage.SECTION:
				notifySectionChanged(notification, eClass);
				break;
			case QWikiPackage.ROLE:
				notifyRoleChanged(notification, eClass);
				break;
			case QWikiPackage.PROCESS_REFERENCE_MODEL:
				notifyProcessReferenceModelChanged(notification, eClass);
				break;
			case QWikiPackage.SUPERSEEDING_RELATIONSHIP:
				notifySuperseedingRelationshipChanged(notification, eClass);
				break;
			case QWikiPackage.TERM:
				notifyTermChanged(notification, eClass);
				break;
			case QWikiPackage.TERM_DEFINITION:
				notifyTermDefinitionChanged(notification, eClass);
				break;
			case QWikiPackage.ASSOCIATION:
				notifyAssociationChanged(notification, eClass);
				break;
			case QWikiPackage.RELATIONSHIP_TYPE:
				notifyRelationshipTypeChanged(notification, eClass);
				break;
			case QWikiPackage.BASE_PRACTISE:
				notifyBasePractiseChanged(notification, eClass);
				break;
			case QWikiPackage.PROCESS:
				notifyProcessChanged(notification, eClass);
				break;
			case QWikiPackage.PROCESS_GROUP:
				notifyProcessGroupChanged(notification, eClass);
				break;
			case QWikiPackage.OUTCOME:
				notifyOutcomeChanged(notification, eClass);
				break;
			case QWikiPackage.WORK_PRODUCT:
				notifyWorkProductChanged(notification, eClass);
				break;
			case QWikiPackage.GENERIC_WORK_PRODUCT:
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
	protected void notifyAuthorChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Author.class)) {
			case QWikiPackage.AUTHOR__OWNED_COMMENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.AUTHOR__MODEL:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.AUTHOR__ASSIGNED_DOMAIN:
				notifyChanged(notification, eClass, QWikiPackage.Literals.NAMED_ELEMENT__DOMAIN);
				break;
			case QWikiPackage.AUTHOR__NAMESPACE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.AUTHOR__OWNING_PACKAGE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
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
	protected void notifyCommentChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Comment.class)) {
			case QWikiPackage.COMMENT__OWNED_COMMENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.COMMENT__MODEL:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.COMMENT__OWNING_ELEMENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
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
	protected void notifyAssociationChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Association.class)) {
			case QWikiPackage.ASSOCIATION__OWNED_COMMENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.ASSOCIATION__MODEL:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
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
	protected void notifyRelationshipTypeChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(RelationshipType.class)) {
			case QWikiPackage.RELATIONSHIP_TYPE__OWNED_COMMENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.RELATIONSHIP_TYPE__MODEL:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.RELATIONSHIP_TYPE__ASSIGNED_DOMAIN:
				notifyChanged(notification, eClass, QWikiPackage.Literals.NAMED_ELEMENT__DOMAIN);
				break;
			case QWikiPackage.RELATIONSHIP_TYPE__NAMESPACE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.RELATIONSHIP_TYPE__OWNING_PACKAGE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
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
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.QWIKI_MODEL__MODEL:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.QWIKI_MODEL__OWNED_MODEL_ELEMENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
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
	protected void notifyDomainChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Domain.class)) {
			case QWikiPackage.DOMAIN__OWNED_COMMENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.DOMAIN__MODEL:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.DOMAIN__ASSIGNED_DOMAIN:
				notifyChanged(notification, eClass, QWikiPackage.Literals.NAMED_ELEMENT__DOMAIN);
				break;
			case QWikiPackage.DOMAIN__NAMESPACE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.DOMAIN__OWNING_PACKAGE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
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
	protected void notifyPackageChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(QWiki.Package.class)) {
			case QWikiPackage.PACKAGE__OWNED_COMMENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.PACKAGE__MODEL:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.PACKAGE__ASSIGNED_DOMAIN:
				notifyChanged(notification, eClass, QWikiPackage.Literals.NAMED_ELEMENT__DOMAIN);
				break;
			case QWikiPackage.PACKAGE__NAMESPACE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.PACKAGE__OWNING_PACKAGE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.PACKAGE__OWNED_MEMBER:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.PACKAGE__NESTING_PACKAGE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.PACKAGE__NESTED_PACKAGE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.PACKAGE__PACKAGED_ELEMENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
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
	protected void notifyDocumentChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Document.class)) {
			case QWikiPackage.DOCUMENT__OWNED_COMMENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.DOCUMENT__MODEL:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.DOCUMENT__ASSIGNED_DOMAIN:
				notifyChanged(notification, eClass, QWikiPackage.Literals.NAMED_ELEMENT__DOMAIN);
				break;
			case QWikiPackage.DOCUMENT__NAMESPACE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.DOCUMENT__OWNING_PACKAGE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.DOCUMENT__OWNED_VERSION:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
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
	protected void notifyDocumentVersionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(DocumentVersion.class)) {
			case QWikiPackage.DOCUMENT_VERSION__OWNED_COMMENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.DOCUMENT_VERSION__MODEL:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.DOCUMENT_VERSION__OWNED_SECTION:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.DOCUMENT_VERSION__OWNING_DOCUMENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
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
	protected void notifySectionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Section.class)) {
			case QWikiPackage.SECTION__OWNED_COMMENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.SECTION__MODEL:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.SECTION__ASSIGNED_DOMAIN:
				notifyChanged(notification, eClass, QWikiPackage.Literals.NAMED_ELEMENT__DOMAIN);
				break;
			case QWikiPackage.SECTION__NAMESPACE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.SECTION__OWNING_PACKAGE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.SECTION__OWNED_SECTION:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.SECTION__OWNING_SECTION:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.SECTION__FACILITATING_SPICE_ELEMENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.SECTION__FACILITATING_ELEMENT);
				break;
			case QWikiPackage.SECTION__OWNING_DOCUMENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
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
	protected void notifyRoleChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Role.class)) {
			case QWikiPackage.ROLE__OWNED_COMMENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.ROLE__MODEL:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.ROLE__ASSIGNED_DOMAIN:
				notifyChanged(notification, eClass, QWikiPackage.Literals.NAMED_ELEMENT__DOMAIN);
				break;
			case QWikiPackage.ROLE__NAMESPACE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.ROLE__OWNING_PACKAGE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
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
			case QWikiPackage.PROCESS_REFERENCE_MODEL__OWNED_COMMENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.PROCESS_REFERENCE_MODEL__MODEL:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.PROCESS_REFERENCE_MODEL__ASSIGNED_DOMAIN:
				notifyChanged(notification, eClass, QWikiPackage.Literals.NAMED_ELEMENT__DOMAIN);
				break;
			case QWikiPackage.PROCESS_REFERENCE_MODEL__NAMESPACE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.PROCESS_REFERENCE_MODEL__OWNING_PACKAGE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.PROCESS_REFERENCE_MODEL__OWNED_SPICE_ELEMENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
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
			case QWikiPackage.SUPERSEEDING_RELATIONSHIP__OWNED_COMMENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.SUPERSEEDING_RELATIONSHIP__MODEL:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.SUPERSEEDING_RELATIONSHIP__SOURCE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
				break;
			case QWikiPackage.SUPERSEEDING_RELATIONSHIP__TARGET:
				notifyChanged(notification, eClass, QWikiPackage.Literals.RELATIONSHIP__RELATED_ELEMENT);
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
	protected void notifyTermChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Term.class)) {
			case QWikiPackage.TERM__OWNED_COMMENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.TERM__MODEL:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.TERM__ASSIGNED_DOMAIN:
				notifyChanged(notification, eClass, QWikiPackage.Literals.NAMED_ELEMENT__DOMAIN);
				break;
			case QWikiPackage.TERM__NAMESPACE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.TERM__OWNING_PACKAGE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.TERM__ACRONYM:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.TERM__SYNONYM:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.TERM__OWNED_TERM_DEFINITION:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, QWikiPackage.Literals.TERM__TERM_DEFINITION);
				break;
			case QWikiPackage.TERM__EXTERNAL_TERM_DEFINITION:
				notifyChanged(notification, eClass, QWikiPackage.Literals.TERM__TERM_DEFINITION);
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
	protected void notifyTermDefinitionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(TermDefinition.class)) {
			case QWikiPackage.TERM_DEFINITION__OWNED_COMMENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.TERM_DEFINITION__MODEL:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.TERM_DEFINITION__ASSIGNED_DOMAIN:
				notifyChanged(notification, eClass, QWikiPackage.Literals.NAMED_ELEMENT__DOMAIN);
				break;
			case QWikiPackage.TERM_DEFINITION__NAMESPACE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.TERM_DEFINITION__OWNING_PACKAGE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.TERM_DEFINITION__OWNING_TERM:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
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
	protected void notifyBasePractiseChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(BasePractise.class)) {
			case QWikiPackage.BASE_PRACTISE__OWNED_COMMENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.BASE_PRACTISE__MODEL:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.BASE_PRACTISE__ASSIGNED_DOMAIN:
				notifyChanged(notification, eClass, QWikiPackage.Literals.NAMED_ELEMENT__DOMAIN);
				break;
			case QWikiPackage.BASE_PRACTISE__NAMESPACE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.BASE_PRACTISE__OWNING_PACKAGE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.BASE_PRACTISE__OWNING_PROCESS_REFERENCE_MODEL:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.BASE_PRACTISE__OWNING_ROLE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case QWikiPackage.BASE_PRACTISE__MANAGING_ROLE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case QWikiPackage.BASE_PRACTISE__PARTICIPATING_ROLE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case QWikiPackage.BASE_PRACTISE__OWNING_PROCESS:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
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
		switch (notification.getFeatureID(QWiki.Process.class)) {
			case QWikiPackage.PROCESS__OWNED_COMMENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.PROCESS__MODEL:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.PROCESS__ASSIGNED_DOMAIN:
				notifyChanged(notification, eClass, QWikiPackage.Literals.NAMED_ELEMENT__DOMAIN);
				break;
			case QWikiPackage.PROCESS__NAMESPACE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.PROCESS__OWNING_PACKAGE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.PROCESS__OWNING_PROCESS_REFERENCE_MODEL:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.PROCESS__OWNING_ROLE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case QWikiPackage.PROCESS__MANAGING_ROLE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case QWikiPackage.PROCESS__PARTICIPATING_ROLE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case QWikiPackage.PROCESS__OWNING_PROCESS_GROUP:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.PROCESS__OWNED_OUTCOME:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.PROCESS__OWNED_BASE_PRACTISE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
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
			case QWikiPackage.PROCESS_GROUP__OWNED_COMMENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.PROCESS_GROUP__MODEL:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.PROCESS_GROUP__ASSIGNED_DOMAIN:
				notifyChanged(notification, eClass, QWikiPackage.Literals.NAMED_ELEMENT__DOMAIN);
				break;
			case QWikiPackage.PROCESS_GROUP__NAMESPACE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.PROCESS_GROUP__OWNING_PACKAGE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.PROCESS_GROUP__OWNING_PROCESS_REFERENCE_MODEL:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.PROCESS_GROUP__OWNING_ROLE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case QWikiPackage.PROCESS_GROUP__MANAGING_ROLE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case QWikiPackage.PROCESS_GROUP__PARTICIPATING_ROLE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case QWikiPackage.PROCESS_GROUP__OWNED_PROCESS:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
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
			case QWikiPackage.OUTCOME__OWNED_COMMENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.OUTCOME__MODEL:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.OUTCOME__ASSIGNED_DOMAIN:
				notifyChanged(notification, eClass, QWikiPackage.Literals.NAMED_ELEMENT__DOMAIN);
				break;
			case QWikiPackage.OUTCOME__NAMESPACE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.OUTCOME__OWNING_PACKAGE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.OUTCOME__OWNING_PROCESS:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
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
			case QWikiPackage.WORK_PRODUCT__OWNED_COMMENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.WORK_PRODUCT__MODEL:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.WORK_PRODUCT__ASSIGNED_DOMAIN:
				notifyChanged(notification, eClass, QWikiPackage.Literals.NAMED_ELEMENT__DOMAIN);
				break;
			case QWikiPackage.WORK_PRODUCT__NAMESPACE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.WORK_PRODUCT__OWNING_PACKAGE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.WORK_PRODUCT__OWNING_PROCESS_REFERENCE_MODEL:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.WORK_PRODUCT__OWNING_ROLE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case QWikiPackage.WORK_PRODUCT__MANAGING_ROLE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case QWikiPackage.WORK_PRODUCT__PARTICIPATING_ROLE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case QWikiPackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.WORK_PRODUCT__OWNED_CHARACTERISTIC:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.WORK_PRODUCT__OWNED_CONTENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
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
			case QWikiPackage.GENERIC_WORK_PRODUCT__OWNED_COMMENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.GENERIC_WORK_PRODUCT__MODEL:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.GENERIC_WORK_PRODUCT__ASSIGNED_DOMAIN:
				notifyChanged(notification, eClass, QWikiPackage.Literals.NAMED_ELEMENT__DOMAIN);
				break;
			case QWikiPackage.GENERIC_WORK_PRODUCT__NAMESPACE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.GENERIC_WORK_PRODUCT__OWNING_PACKAGE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.GENERIC_WORK_PRODUCT__OWNING_PROCESS_REFERENCE_MODEL:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.GENERIC_WORK_PRODUCT__OWNING_ROLE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case QWikiPackage.GENERIC_WORK_PRODUCT__MANAGING_ROLE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case QWikiPackage.GENERIC_WORK_PRODUCT__PARTICIPATING_ROLE:
				notifyChanged(notification, eClass, QWikiPackage.Literals.SPICE_ELEMENT__ROLE);
				break;
			case QWikiPackage.GENERIC_WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNER);
				break;
			case QWikiPackage.GENERIC_WORK_PRODUCT__OWNED_CHARACTERISTIC:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.GENERIC_WORK_PRODUCT__OWNED_CONTENT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case QWikiPackage.GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT:
				notifyChanged(notification, eClass, QWikiPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

} //QWikiDerivedUnionAdapter
