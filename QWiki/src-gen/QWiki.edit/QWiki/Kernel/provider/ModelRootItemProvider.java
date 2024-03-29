/**
 */
package QWiki.Kernel.provider;


import QWiki.Bibliography.BibliographyFactory;

import QWiki.EMF.provider.QWikiEditPlugin;

import QWiki.Glossary.GlossaryFactory;

import QWiki.I18N.I18NPackage;
import QWiki.Infrastructure.InfrastructureFactory;
import QWiki.Infrastructure.InfrastructurePackage;

import QWiki.Infrastructure.provider.UmlPackageItemProvider;

import QWiki.Kernel.KernelFactory;
import QWiki.Kernel.KernelPackage;
import QWiki.Kernel.ModelRoot;

import QWiki.RASCI.RASCIFactory;

import QWiki.SPICE.SPICEFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link QWiki.Kernel.ModelRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelRootItemProvider extends UmlPackageItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelRootItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(KernelPackage.Literals.MODEL_ROOT__OWNED_MODEL_ELEMENT);
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
	 * This returns ModelRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModelRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ModelRoot)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ModelRoot_type") :
			getString("_UI_ModelRoot_type") + " " + label;
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

		switch (notification.getFeatureID(ModelRoot.class)) {
			case KernelPackage.MODEL_ROOT__OWNED_MODEL_ELEMENT:
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
				(KernelPackage.Literals.MODEL_ROOT__OWNED_MODEL_ELEMENT,
				 KernelFactory.eINSTANCE.createModelDomain()));

		newChildDescriptors.add
			(createChildParameter
				(KernelPackage.Literals.MODEL_ROOT__OWNED_MODEL_ELEMENT,
				 KernelFactory.eINSTANCE.createModelRoot()));

		newChildDescriptors.add
			(createChildParameter
				(KernelPackage.Literals.MODEL_ROOT__OWNED_MODEL_ELEMENT,
				 KernelFactory.eINSTANCE.createDO_NOT_USE_RelationshipType()));

		newChildDescriptors.add
			(createChildParameter
				(KernelPackage.Literals.MODEL_ROOT__OWNED_MODEL_ELEMENT,
				 InfrastructureFactory.eINSTANCE.createUmlPackage()));

		newChildDescriptors.add
			(createChildParameter
				(KernelPackage.Literals.MODEL_ROOT__OWNED_MODEL_ELEMENT,
				 SPICEFactory.eINSTANCE.createSpiceBasePractise()));

		newChildDescriptors.add
			(createChildParameter
				(KernelPackage.Literals.MODEL_ROOT__OWNED_MODEL_ELEMENT,
				 SPICEFactory.eINSTANCE.createProcessReferenceModel()));

		newChildDescriptors.add
			(createChildParameter
				(KernelPackage.Literals.MODEL_ROOT__OWNED_MODEL_ELEMENT,
				 SPICEFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(KernelPackage.Literals.MODEL_ROOT__OWNED_MODEL_ELEMENT,
				 SPICEFactory.eINSTANCE.createProcessGroup()));

		newChildDescriptors.add
			(createChildParameter
				(KernelPackage.Literals.MODEL_ROOT__OWNED_MODEL_ELEMENT,
				 SPICEFactory.eINSTANCE.createOutcome()));

		newChildDescriptors.add
			(createChildParameter
				(KernelPackage.Literals.MODEL_ROOT__OWNED_MODEL_ELEMENT,
				 SPICEFactory.eINSTANCE.createWorkProduct()));

		newChildDescriptors.add
			(createChildParameter
				(KernelPackage.Literals.MODEL_ROOT__OWNED_MODEL_ELEMENT,
				 SPICEFactory.eINSTANCE.createGenericWorkProduct()));

		newChildDescriptors.add
			(createChildParameter
				(KernelPackage.Literals.MODEL_ROOT__OWNED_MODEL_ELEMENT,
				 RASCIFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(KernelPackage.Literals.MODEL_ROOT__OWNED_MODEL_ELEMENT,
				 BibliographyFactory.eINSTANCE.createAuthor()));

		newChildDescriptors.add
			(createChildParameter
				(KernelPackage.Literals.MODEL_ROOT__OWNED_MODEL_ELEMENT,
				 BibliographyFactory.eINSTANCE.createDocument()));

		newChildDescriptors.add
			(createChildParameter
				(KernelPackage.Literals.MODEL_ROOT__OWNED_MODEL_ELEMENT,
				 BibliographyFactory.eINSTANCE.createDocumentVersion()));

		newChildDescriptors.add
			(createChildParameter
				(KernelPackage.Literals.MODEL_ROOT__OWNED_MODEL_ELEMENT,
				 BibliographyFactory.eINSTANCE.createSection()));

		newChildDescriptors.add
			(createChildParameter
				(KernelPackage.Literals.MODEL_ROOT__OWNED_MODEL_ELEMENT,
				 GlossaryFactory.eINSTANCE.createGlossaryTermDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(KernelPackage.Literals.MODEL_ROOT__OWNED_MODEL_ELEMENT,
				 GlossaryFactory.eINSTANCE.createGlossaryTerm()));
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
			childFeature == I18NPackage.Literals.I1_8N_NAMED_ELEMENT__DISPLAY_NAME ||
			childFeature == I18NPackage.Literals.I1_8N_DESCRIPTIVE_ELEMENT__PURPOSE ||
			childFeature == I18NPackage.Literals.I1_8N_DESCRIPTIVE_ELEMENT__BODY ||
			childFeature == InfrastructurePackage.Literals.UML_PACKAGE__PACKAGED_ELEMENT ||
			childFeature == InfrastructurePackage.Literals.UML_PACKAGE__NESTED_PACKAGE ||
			childFeature == KernelPackage.Literals.MODEL_ROOT__OWNED_MODEL_ELEMENT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
