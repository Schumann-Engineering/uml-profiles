/**
 */
package QWiki.provider;


import QWiki.QWikiFactory;
import QWiki.QWikiModel;
import QWiki.QWikiPackage;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link QWiki.QWikiModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QWikiModelItemProvider 
	extends ElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWikiModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(QWikiPackage.Literals.QWIKI_MODEL__OWNED_MODEL_ELEMENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns QWikiModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/QWikiModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((QWikiModel)object).getUuid();
		return label == null || label.length() == 0 ?
			getString("_UI_QWikiModel_type") :
			getString("_UI_QWikiModel_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(QWikiModel.class)) {
			case QWikiPackage.QWIKI_MODEL__OWNED_MODEL_ELEMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_MODEL_ELEMENT,
				 QWikiFactory.eINSTANCE.createAuthor()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_MODEL_ELEMENT,
				 QWikiFactory.eINSTANCE.createComment()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_MODEL_ELEMENT,
				 QWikiFactory.eINSTANCE.createQWikiModel()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_MODEL_ELEMENT,
				 QWikiFactory.eINSTANCE.createDomain()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_MODEL_ELEMENT,
				 QWikiFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_MODEL_ELEMENT,
				 QWikiFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_MODEL_ELEMENT,
				 QWikiFactory.eINSTANCE.createDocumentVersion()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_MODEL_ELEMENT,
				 QWikiFactory.eINSTANCE.createSection()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_MODEL_ELEMENT,
				 QWikiFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_MODEL_ELEMENT,
				 QWikiFactory.eINSTANCE.createProcessReferenceModel()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_MODEL_ELEMENT,
				 QWikiFactory.eINSTANCE.createSuperseedingRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_MODEL_ELEMENT,
				 QWikiFactory.eINSTANCE.createTerm()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_MODEL_ELEMENT,
				 QWikiFactory.eINSTANCE.createTermDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_MODEL_ELEMENT,
				 QWikiFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_MODEL_ELEMENT,
				 QWikiFactory.eINSTANCE.createRelationshipType()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_MODEL_ELEMENT,
				 QWikiFactory.eINSTANCE.createBasePractise()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_MODEL_ELEMENT,
				 QWikiFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_MODEL_ELEMENT,
				 QWikiFactory.eINSTANCE.createProcessGroup()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_MODEL_ELEMENT,
				 QWikiFactory.eINSTANCE.createOutcome()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_MODEL_ELEMENT,
				 QWikiFactory.eINSTANCE.createWorkProduct()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_MODEL_ELEMENT,
				 QWikiFactory.eINSTANCE.createGenericWorkProduct()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == QWikiPackage.Literals.ELEMENT__OWNED_COMMENT ||
			childFeature == QWikiPackage.Literals.QWIKI_MODEL__OWNED_MODEL_ELEMENT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
