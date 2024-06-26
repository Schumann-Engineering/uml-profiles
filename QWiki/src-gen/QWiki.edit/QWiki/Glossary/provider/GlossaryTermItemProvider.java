/**
 */
package QWiki.Glossary.provider;


import QWiki.EMF.provider.QWikiEditPlugin;

import QWiki.Glossary.GlossaryFactory;
import QWiki.Glossary.GlossaryPackage;
import QWiki.Glossary.GlossaryTerm;

import QWiki.QWikiFactory;
import QWiki.QWikiPackage;
import QWiki.provider.L10nNamedElementItemProvider;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link QWiki.Glossary.GlossaryTerm} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GlossaryTermItemProvider extends L10nNamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlossaryTermItemProvider(AdapterFactory adapterFactory) {
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

			addTermDefinitionPropertyDescriptor(object);
			addExternalTermDefinitionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Term Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTermDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GlossaryTerm_termDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlossaryTerm_termDefinition_feature", "_UI_GlossaryTerm_type"),
				 GlossaryPackage.Literals.GLOSSARY_TERM__TERM_DEFINITION,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the External Term Definition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExternalTermDefinitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GlossaryTerm_externalTermDefinition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlossaryTerm_externalTermDefinition_feature", "_UI_GlossaryTerm_type"),
				 GlossaryPackage.Literals.GLOSSARY_TERM__EXTERNAL_TERM_DEFINITION,
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
			childrenFeatures.add(GlossaryPackage.Literals.GLOSSARY_TERM__OWNED_TERM_DEFINITION);
			childrenFeatures.add(GlossaryPackage.Literals.GLOSSARY_TERM__ACRONYM);
			childrenFeatures.add(GlossaryPackage.Literals.GLOSSARY_TERM__SYNONYM);
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
	 * This returns GlossaryTerm.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GlossaryTerm"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GlossaryTerm)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GlossaryTerm_type") :
			getString("_UI_GlossaryTerm_type") + " " + label;
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

		switch (notification.getFeatureID(GlossaryTerm.class)) {
			case GlossaryPackage.GLOSSARY_TERM__OWNED_TERM_DEFINITION:
			case GlossaryPackage.GLOSSARY_TERM__ACRONYM:
			case GlossaryPackage.GLOSSARY_TERM__SYNONYM:
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
				(GlossaryPackage.Literals.GLOSSARY_TERM__OWNED_TERM_DEFINITION,
				 GlossaryFactory.eINSTANCE.createGlossaryTermDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(GlossaryPackage.Literals.GLOSSARY_TERM__ACRONYM,
				 QWikiFactory.eINSTANCE.createL10nString()));

		newChildDescriptors.add
			(createChildParameter
				(GlossaryPackage.Literals.GLOSSARY_TERM__SYNONYM,
				 QWikiFactory.eINSTANCE.createL10nString()));
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
			childFeature == QWikiPackage.Literals.L1_0N_NAMED_ELEMENT__DISPLAY_NAME ||
			childFeature == GlossaryPackage.Literals.GLOSSARY_TERM__ACRONYM ||
			childFeature == GlossaryPackage.Literals.GLOSSARY_TERM__SYNONYM;

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
