/**
 */
package QWiki.Content.provider;


import QWiki.Content.ContentContainer;
import QWiki.Content.ContentFactory;
import QWiki.Content.ContentPackage;

import QWiki.EMF.provider.QWikiEditPlugin;

import QWiki.QWikiFactory;
import QWiki.QWikiPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.providers.NamespaceItemProvider;

/**
 * This is the item provider adapter for a {@link QWiki.Content.ContentContainer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentContainerItemProvider extends NamespaceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentContainerItemProvider(AdapterFactory adapterFactory) {
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

			addUuidPropertyDescriptor(object);
			addTagPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Uuid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUuidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QWikiElement_uuid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QWikiElement_uuid_feature", "_UI_QWikiElement_type"),
				 QWikiPackage.Literals.QWIKI_ELEMENT__UUID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tag feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTagPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QWikiElement_tag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QWikiElement_tag_feature", "_UI_QWikiElement_type"),
				 QWikiPackage.Literals.QWIKI_ELEMENT__TAG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(QWikiPackage.Literals.QWIKI_ELEMENT__CUSTOM_PROPERTY);
			childrenFeatures.add(ContentPackage.Literals.CONTENT_CONTAINER__CAPTION);
			childrenFeatures.add(ContentPackage.Literals.CONTENT_CONTAINER__ITEM);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ContentContainer)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ContentContainer_type") :
			getString("_UI_ContentContainer_type") + " " + label;
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

		switch (notification.getFeatureID(ContentContainer.class)) {
			case ContentPackage.CONTENT_CONTAINER__UUID:
			case ContentPackage.CONTENT_CONTAINER__TAG:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ContentPackage.CONTENT_CONTAINER__CUSTOM_PROPERTY:
			case ContentPackage.CONTENT_CONTAINER__CAPTION:
			case ContentPackage.CONTENT_CONTAINER__ITEM:
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
				(UMLPackage.Literals.ELEMENT__OWNED_COMMENT,
				 QWikiFactory.eINSTANCE.createQWikiComment()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_ELEMENT__CUSTOM_PROPERTY,
				 QWikiFactory.eINSTANCE.createL10nKeyedString()));

		newChildDescriptors.add
			(createChildParameter
				(ContentPackage.Literals.CONTENT_CONTAINER__CAPTION,
				 QWikiFactory.eINSTANCE.createL10nString()));

		newChildDescriptors.add
			(createChildParameter
				(ContentPackage.Literals.CONTENT_CONTAINER__ITEM,
				 ContentFactory.eINSTANCE.createLayout()));

		newChildDescriptors.add
			(createChildParameter
				(ContentPackage.Literals.CONTENT_CONTAINER__ITEM,
				 ContentFactory.eINSTANCE.createText()));

		newChildDescriptors.add
			(createChildParameter
				(ContentPackage.Literals.CONTENT_CONTAINER__ITEM,
				 ContentFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(ContentPackage.Literals.CONTENT_CONTAINER__ITEM,
				 ContentFactory.eINSTANCE.createPanel()));

		newChildDescriptors.add
			(createChildParameter
				(ContentPackage.Literals.CONTENT_CONTAINER__ITEM,
				 ContentFactory.eINSTANCE.createSection()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return QWikiEditPlugin.INSTANCE;
	}

}
