/**
 */
package QWiki.Spice.provider;


import QWiki.Kernel.KernelFactory;
import QWiki.Kernel.KernelPackage;

import QWiki.Spice.SPICEPackage;
import QWiki.Spice.WorkProduct;

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
 * This is the item provider adapter for a {@link QWiki.Spice.WorkProduct} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkProductItemProvider extends SpiceElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductItemProvider(AdapterFactory adapterFactory) {
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

			addFacilitatingOutcomePropertyDescriptor(object);
			addFacilitatedProcessPropertyDescriptor(object);
			addFacilitatingProcessPropertyDescriptor(object);
			addWorkProductTypePropertyDescriptor(object);
			addContainedWorkProductPropertyDescriptor(object);
			addContainingWorkProductPropertyDescriptor(object);
			addLinkedWorkProductPropertyDescriptor(object);
			addLinkPropertyDescriptor(object);
			addFacilitatedOutcomePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Facilitating Outcome feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFacilitatingOutcomePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WorkProduct_facilitatingOutcome_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WorkProduct_facilitatingOutcome_feature", "_UI_WorkProduct_type"),
				 SPICEPackage.Literals.WORK_PRODUCT__FACILITATING_OUTCOME,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Facilitated Process feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFacilitatedProcessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WorkProduct_facilitatedProcess_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WorkProduct_facilitatedProcess_feature", "_UI_WorkProduct_type"),
				 SPICEPackage.Literals.WORK_PRODUCT__FACILITATED_PROCESS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Facilitating Process feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFacilitatingProcessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WorkProduct_facilitatingProcess_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WorkProduct_facilitatingProcess_feature", "_UI_WorkProduct_type"),
				 SPICEPackage.Literals.WORK_PRODUCT__FACILITATING_PROCESS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Work Product Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorkProductTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WorkProduct_workProductType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WorkProduct_workProductType_feature", "_UI_WorkProduct_type"),
				 SPICEPackage.Literals.WORK_PRODUCT__WORK_PRODUCT_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Contained Work Product feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainedWorkProductPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WorkProduct_containedWorkProduct_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WorkProduct_containedWorkProduct_feature", "_UI_WorkProduct_type"),
				 SPICEPackage.Literals.WORK_PRODUCT__CONTAINED_WORK_PRODUCT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Containing Work Product feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainingWorkProductPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WorkProduct_containingWorkProduct_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WorkProduct_containingWorkProduct_feature", "_UI_WorkProduct_type"),
				 SPICEPackage.Literals.WORK_PRODUCT__CONTAINING_WORK_PRODUCT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Linked Work Product feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkedWorkProductPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WorkProduct_linkedWorkProduct_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WorkProduct_linkedWorkProduct_feature", "_UI_WorkProduct_type"),
				 SPICEPackage.Literals.WORK_PRODUCT__LINKED_WORK_PRODUCT,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Link feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WorkProduct_link_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WorkProduct_link_feature", "_UI_WorkProduct_type"),
				 SPICEPackage.Literals.WORK_PRODUCT__LINK,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Facilitated Outcome feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFacilitatedOutcomePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_WorkProduct_facilitatedOutcome_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_WorkProduct_facilitatedOutcome_feature", "_UI_WorkProduct_type"),
				 SPICEPackage.Literals.WORK_PRODUCT__FACILITATED_OUTCOME,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(SPICEPackage.Literals.WORK_PRODUCT__CHARACTERISTIC);
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
	 * This returns WorkProduct.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/WorkProduct"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((WorkProduct)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_WorkProduct_type") :
			getString("_UI_WorkProduct_type") + " " + label;
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

		switch (notification.getFeatureID(WorkProduct.class)) {
			case SPICEPackage.WORK_PRODUCT__WORK_PRODUCT_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SPICEPackage.WORK_PRODUCT__CHARACTERISTIC:
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
				(SPICEPackage.Literals.WORK_PRODUCT__CHARACTERISTIC,
				 KernelFactory.eINSTANCE.createI18nString()));
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
			childFeature == KernelPackage.Literals.I1_8N_NAMED_ELEMENT__DISPLAY_NAME ||
			childFeature == KernelPackage.Literals.I1_8N_DESCRIPTIVE_ELEMENT__PURPOSE ||
			childFeature == KernelPackage.Literals.I1_8N_DESCRIPTIVE_ELEMENT__CONTENT ||
			childFeature == SPICEPackage.Literals.WORK_PRODUCT__CHARACTERISTIC;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
