/**
 */
package QWiki.provider;


import QWiki.EMF.provider.QWikiEditPlugin;

import QWiki.Glossary.GlossaryFactory;
import QWiki.QWikiFactory;
import QWiki.QWikiNamespace;
import QWiki.QWikiPackage;

import QWiki.Rasci.RasciFactory;
import QWiki.References.ReferencesFactory;
import QWiki.Relationships.RelationshipsFactory;
import QWiki.Spice.SpiceFactory;
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
 * This is the item provider adapter for a {@link QWiki.QWikiNamespace} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QWikiNamespaceItemProvider extends NamespaceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWikiNamespaceItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(QWikiPackage.Literals.L1_0N_NAMED_ELEMENT__DISPLAY_NAME);
			childrenFeatures.add(QWikiPackage.Literals.QWIKI_NAMESPACE__QWIKI_ELEMENT);
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
		String label = ((QWikiNamespace)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_QWikiNamespace_type") :
			getString("_UI_QWikiNamespace_type") + " " + label;
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

		switch (notification.getFeatureID(QWikiNamespace.class)) {
			case QWikiPackage.QWIKI_NAMESPACE__UUID:
			case QWikiPackage.QWIKI_NAMESPACE__TAG:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case QWikiPackage.QWIKI_NAMESPACE__CUSTOM_PROPERTY:
			case QWikiPackage.QWIKI_NAMESPACE__DISPLAY_NAME:
			case QWikiPackage.QWIKI_NAMESPACE__QWIKI_ELEMENT:
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
				(QWikiPackage.Literals.L1_0N_NAMED_ELEMENT__DISPLAY_NAME,
				 QWikiFactory.eINSTANCE.createL10nString()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_NAMESPACE__QWIKI_ELEMENT,
				 QWikiFactory.eINSTANCE.createQWikiEncryptionKey()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_NAMESPACE__QWIKI_ELEMENT,
				 QWikiFactory.eINSTANCE.createQWikiContainer()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_NAMESPACE__QWIKI_ELEMENT,
				 QWikiFactory.eINSTANCE.createQWikiModel()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_NAMESPACE__QWIKI_ELEMENT,
				 SpiceFactory.eINSTANCE.createBasePractise()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_NAMESPACE__QWIKI_ELEMENT,
				 SpiceFactory.eINSTANCE.createProcessReferenceModel()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_NAMESPACE__QWIKI_ELEMENT,
				 SpiceFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_NAMESPACE__QWIKI_ELEMENT,
				 SpiceFactory.eINSTANCE.createProcessGroup()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_NAMESPACE__QWIKI_ELEMENT,
				 SpiceFactory.eINSTANCE.createOutcome()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_NAMESPACE__QWIKI_ELEMENT,
				 SpiceFactory.eINSTANCE.createWorkProduct()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_NAMESPACE__QWIKI_ELEMENT,
				 SpiceFactory.eINSTANCE.createGenericWorkProduct()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_NAMESPACE__QWIKI_ELEMENT,
				 SpiceFactory.eINSTANCE.createWorkProductRelationshipType()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_NAMESPACE__QWIKI_ELEMENT,
				 RasciFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_NAMESPACE__QWIKI_ELEMENT,
				 GlossaryFactory.eINSTANCE.createGlossaryTermDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_NAMESPACE__QWIKI_ELEMENT,
				 GlossaryFactory.eINSTANCE.createGlossaryTerm()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_NAMESPACE__QWIKI_ELEMENT,
				 ReferencesFactory.eINSTANCE.createAuthor()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_NAMESPACE__QWIKI_ELEMENT,
				 ReferencesFactory.eINSTANCE.createReference()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_NAMESPACE__QWIKI_ELEMENT,
				 ReferencesFactory.eINSTANCE.createReferenceVersion()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_NAMESPACE__QWIKI_ELEMENT,
				 RelationshipsFactory.eINSTANCE.createDO_NOT_USE_RelationshipType()));
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
