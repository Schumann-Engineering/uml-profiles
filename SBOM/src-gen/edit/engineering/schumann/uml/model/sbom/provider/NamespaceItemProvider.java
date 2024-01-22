/**
 */
package engineering.schumann.uml.model.sbom.provider;


import engineering.schumann.uml.model.sbom.Namespace;
import engineering.schumann.uml.model.sbom.SBOMFactory;
import engineering.schumann.uml.model.sbom.SBOMPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link engineering.schumann.uml.model.sbom.Namespace} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NamespaceItemProvider extends DescribedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceItemProvider(AdapterFactory adapterFactory) {
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

			addRequiredComponentPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addIsSOUPPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Required Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Namespace_requiredComponent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Namespace_requiredComponent_feature", "_UI_Namespace_type"),
				 SBOMPackage.Literals.NAMESPACE__REQUIRED_COMPONENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Namespace_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Namespace_type_feature", "_UI_Namespace_type"),
				 SBOMPackage.Literals.NAMESPACE__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is SOUP feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSOUPPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Namespace_isSOUP_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Namespace_isSOUP_feature", "_UI_Namespace_type"),
				 SBOMPackage.Literals.NAMESPACE__IS_SOUP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(SBOMPackage.Literals.NAMESPACE__OWNED_COMPONENT);
			childrenFeatures.add(SBOMPackage.Literals.NAMESPACE__OWNED_PROPERTY);
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
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		var typeValue = ((engineering.schumann.uml.model.sbom.Namespace)object).getType();
		var isSOUP = ((engineering.schumann.uml.model.sbom.Namespace)object).isSOUP();
		return
			((isSOUP || typeValue != null)
			?
				"«" +
					(typeValue == null ? "" :  typeValue.toString() + ", ") +
					(isSOUP ? "SOUP" : "") +
				"» "
			:
				"") +
			super.getText(object);
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

		switch (notification.getFeatureID(Namespace.class)) {
			case SBOMPackage.NAMESPACE__TYPE:
			case SBOMPackage.NAMESPACE__IS_SOUP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SBOMPackage.NAMESPACE__OWNED_COMPONENT:
			case SBOMPackage.NAMESPACE__OWNED_PROPERTY:
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
				(SBOMPackage.Literals.NAMESPACE__OWNED_COMPONENT,
				 SBOMFactory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(SBOMPackage.Literals.NAMESPACE__OWNED_PROPERTY,
				 SBOMFactory.eINSTANCE.createPropety()));
	}

}
