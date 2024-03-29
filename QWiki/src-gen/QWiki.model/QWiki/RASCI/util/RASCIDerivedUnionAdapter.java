/**
 */
package QWiki.RASCI.util;

import QWiki.Infrastructure.InfrastructurePackage;

import QWiki.RASCI.RASCIPackage;
import QWiki.RASCI.Role;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.impl.AdapterImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An adapter that propagates notifications for derived unions.
 * <!-- end-user-doc -->
 * @see QWiki.RASCI.RASCIPackage
 * @generated
 */
public class RASCIDerivedUnionAdapter extends AdapterImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RASCIPackage modelPackage;

	/**
	 * Creates an instance of the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RASCIDerivedUnionAdapter() {
		if (modelPackage == null) {
			modelPackage = RASCIPackage.eINSTANCE;
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
			case RASCIPackage.ROLE:
				notifyRoleChanged(notification, eClass);
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
	protected void notifyRoleChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Role.class)) {
			case RASCIPackage.ROLE__OWNED_COMMENT:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNED_ELEMENT);
				break;
			case RASCIPackage.ROLE__DIRECTED_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case RASCIPackage.ROLE__MODEL:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
			case RASCIPackage.ROLE__SUPERSEEDING_RELATIONSHIP:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__RELATIONSHIP);
				break;
			case RASCIPackage.ROLE__NAMESPACE:
				notifyChanged(notification, eClass, InfrastructurePackage.Literals.UML_ELEMENT__OWNER);
				break;
		}
	}

} //RASCIDerivedUnionAdapter
