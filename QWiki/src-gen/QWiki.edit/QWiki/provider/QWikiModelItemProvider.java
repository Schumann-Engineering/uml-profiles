/**
 */
package QWiki.provider;


import QWiki.Glossary.GlossaryFactory;

import QWiki.QWikiFactory;
import QWiki.QWikiModel;
import QWiki.QWikiPackage;

import QWiki.Rasci.RasciFactory;

import QWiki.References.ReferencesFactory;

import QWiki.Relationships.RelationshipsFactory;

import QWiki.Spice.SpiceFactory;

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
public class QWikiModelItemProvider extends QWikiContainerItemProvider {
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
			childrenFeatures.add(QWikiPackage.Literals.QWIKI_MODEL__OWNED_QWIKI_ELEMENT);
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
		String label = ((QWikiModel)object).getName();
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
			case QWikiPackage.QWIKI_MODEL__OWNED_QWIKI_ELEMENT:
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
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_QWIKI_ELEMENT,
				 QWikiFactory.eINSTANCE.createQWikiEncryptionKey()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_QWIKI_ELEMENT,
				 QWikiFactory.eINSTANCE.createQWikiContainer()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_QWIKI_ELEMENT,
				 QWikiFactory.eINSTANCE.createQWikiModel()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_QWIKI_ELEMENT,
				 SpiceFactory.eINSTANCE.createBasePractise()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_QWIKI_ELEMENT,
				 SpiceFactory.eINSTANCE.createProcessReferenceModel()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_QWIKI_ELEMENT,
				 SpiceFactory.eINSTANCE.createProcess()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_QWIKI_ELEMENT,
				 SpiceFactory.eINSTANCE.createProcessGroup()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_QWIKI_ELEMENT,
				 SpiceFactory.eINSTANCE.createOutcome()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_QWIKI_ELEMENT,
				 SpiceFactory.eINSTANCE.createWorkProduct()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_QWIKI_ELEMENT,
				 SpiceFactory.eINSTANCE.createGenericWorkProduct()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_QWIKI_ELEMENT,
				 SpiceFactory.eINSTANCE.createWorkProductRelationshipType()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_QWIKI_ELEMENT,
				 RasciFactory.eINSTANCE.createRole()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_QWIKI_ELEMENT,
				 GlossaryFactory.eINSTANCE.createGlossaryTermDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_QWIKI_ELEMENT,
				 GlossaryFactory.eINSTANCE.createGlossaryTerm()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_QWIKI_ELEMENT,
				 ReferencesFactory.eINSTANCE.createAuthor()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_QWIKI_ELEMENT,
				 ReferencesFactory.eINSTANCE.createReference()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_QWIKI_ELEMENT,
				 ReferencesFactory.eINSTANCE.createReferenceVersion()));

		newChildDescriptors.add
			(createChildParameter
				(QWikiPackage.Literals.QWIKI_MODEL__OWNED_QWIKI_ELEMENT,
				 RelationshipsFactory.eINSTANCE.createDO_NOT_USE_RelationshipType()));
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
			childFeature == QWikiPackage.Literals.L1_0N_DESCRIPTIVE_ELEMENT__PURPOSE ||
			childFeature == QWikiPackage.Literals.L1_0N_DESCRIPTIVE_ELEMENT__CONTENT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
