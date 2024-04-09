/**
 */
package QWiki.Glossary.util;

import QWiki.Glossary.GlossaryPackage;
import QWiki.Glossary.GlossaryTerm;
import QWiki.Glossary.GlossaryTermDefinition;

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
 * @see QWiki.Glossary.GlossaryPackage
 * @generated
 */
public class GlossaryDerivedUnionAdapter extends AdapterImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GlossaryPackage modelPackage;

	/**
	 * Creates an instance of the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlossaryDerivedUnionAdapter() {
		if (modelPackage == null) {
			modelPackage = GlossaryPackage.eINSTANCE;
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
			case GlossaryPackage.GLOSSARY_TERM_DEFINITION:
				notifyGlossaryTermDefinitionChanged(notification, eClass);
				break;
			case GlossaryPackage.GLOSSARY_TERM:
				notifyGlossaryTermChanged(notification, eClass);
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
	protected void notifyGlossaryTermDefinitionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(GlossaryTermDefinition.class)) {
			case GlossaryPackage.GLOSSARY_TERM_DEFINITION__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case GlossaryPackage.GLOSSARY_TERM_DEFINITION__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case GlossaryPackage.GLOSSARY_TERM_DEFINITION__NAMESPACE:
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
	protected void notifyGlossaryTermChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(GlossaryTerm.class)) {
			case GlossaryPackage.GLOSSARY_TERM__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case GlossaryPackage.GLOSSARY_TERM__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case GlossaryPackage.GLOSSARY_TERM__NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case GlossaryPackage.GLOSSARY_TERM__OWNED_TERM_DEFINITION:
				notifyChanged(notification, eClass, GlossaryPackage.Literals.GLOSSARY_TERM__TERM_DEFINITION);
				break;
			case GlossaryPackage.GLOSSARY_TERM__EXTERNAL_TERM_DEFINITION:
				notifyChanged(notification, eClass, GlossaryPackage.Literals.GLOSSARY_TERM__TERM_DEFINITION);
				break;
		}
	}

} //GlossaryDerivedUnionAdapter
