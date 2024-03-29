/**
 */
package QWiki.Bibliography.util;

import QWiki.Bibliography.Author;
import QWiki.Bibliography.BibliographyPackage;
import QWiki.Bibliography.Document;
import QWiki.Bibliography.DocumentVersion;
import QWiki.Bibliography.Section;

import QWiki.Infrastructure.InfrastructurePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.impl.AdapterImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An adapter that propagates notifications for derived unions.
 * <!-- end-user-doc -->
 * @see QWiki.Bibliography.BibliographyPackage
 * @generated
 */
public class BibliographyDerivedUnionAdapter extends AdapterImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BibliographyPackage modelPackage;

	/**
	 * Creates an instance of the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BibliographyDerivedUnionAdapter() {
		if (modelPackage == null) {
			modelPackage = BibliographyPackage.eINSTANCE;
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
			case BibliographyPackage.AUTHOR:
				notifyAuthorChanged(notification, eClass);
				break;
			case BibliographyPackage.DOCUMENT:
				notifyDocumentChanged(notification, eClass);
				break;
			case BibliographyPackage.DOCUMENT_VERSION:
				notifyDocumentVersionChanged(notification, eClass);
				break;
			case BibliographyPackage.SECTION:
				notifySectionChanged(notification, eClass);
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
			case BibliographyPackage.AUTHOR__OWNED_COMMENT:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case BibliographyPackage.AUTHOR__DIRECTED_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case BibliographyPackage.AUTHOR__MODEL:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case BibliographyPackage.AUTHOR__SUPERSEEDING_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case BibliographyPackage.AUTHOR__NAMESPACE:
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
	protected void notifyDocumentChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Document.class)) {
			case BibliographyPackage.DOCUMENT__OWNED_COMMENT:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case BibliographyPackage.DOCUMENT__DIRECTED_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case BibliographyPackage.DOCUMENT__MODEL:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case BibliographyPackage.DOCUMENT__SUPERSEEDING_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case BibliographyPackage.DOCUMENT__NAMESPACE:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case BibliographyPackage.DOCUMENT__OWNED_MEMBER:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case BibliographyPackage.DOCUMENT__OWNED_VERSION:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_NAMESPACE__MEMBER);
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
	protected void notifyDocumentVersionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(DocumentVersion.class)) {
			case BibliographyPackage.DOCUMENT_VERSION__OWNED_COMMENT:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case BibliographyPackage.DOCUMENT_VERSION__DIRECTED_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case BibliographyPackage.DOCUMENT_VERSION__MODEL:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case BibliographyPackage.DOCUMENT_VERSION__SUPERSEEDING_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case BibliographyPackage.DOCUMENT_VERSION__NAMESPACE:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case BibliographyPackage.DOCUMENT_VERSION__OWNED_MEMBER:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case BibliographyPackage.DOCUMENT_VERSION__OWNED_SECTION:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case BibliographyPackage.DOCUMENT_VERSION__OWNING_DOCUMENT:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_NAMED_ELEMENT__NAMESPACE);
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
	protected void notifySectionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Section.class)) {
			case BibliographyPackage.SECTION__OWNED_COMMENT:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case BibliographyPackage.SECTION__DIRECTED_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case BibliographyPackage.SECTION__MODEL:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case BibliographyPackage.SECTION__SUPERSEEDING_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case BibliographyPackage.SECTION__NAMESPACE:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case BibliographyPackage.SECTION__OWNED_MEMBER:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case BibliographyPackage.SECTION__OWNING_DOCUMENT:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case BibliographyPackage.SECTION__OWNED_SECTION:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case BibliographyPackage.SECTION__OWNING_SECTION:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case BibliographyPackage.SECTION__FACILITATING_SPICE_ELEMENT:
				notifyChanged(notification, eClass, BibliographyPackage.Literals.SECTION__FACILITATING_ELEMENT);
				break;
		}
	}

} //BibliographyDerivedUnionAdapter
