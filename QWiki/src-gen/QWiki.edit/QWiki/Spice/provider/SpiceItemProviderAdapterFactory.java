/**
 */
package QWiki.Spice.provider;

import QWiki.Spice.util.SpiceAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SpiceItemProviderAdapterFactory extends SpiceAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpiceItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link QWiki.Spice.BasePractise} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasePractiseItemProvider basePractiseItemProvider;

	/**
	 * This creates an adapter for a {@link QWiki.Spice.BasePractise}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBasePractiseAdapter() {
		if (basePractiseItemProvider == null) {
			basePractiseItemProvider = new BasePractiseItemProvider(this);
		}

		return basePractiseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link QWiki.Spice.ProcessReferenceModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessReferenceModelItemProvider processReferenceModelItemProvider;

	/**
	 * This creates an adapter for a {@link QWiki.Spice.ProcessReferenceModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessReferenceModelAdapter() {
		if (processReferenceModelItemProvider == null) {
			processReferenceModelItemProvider = new ProcessReferenceModelItemProvider(this);
		}

		return processReferenceModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link QWiki.Spice.Process} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessItemProvider processItemProvider;

	/**
	 * This creates an adapter for a {@link QWiki.Spice.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessAdapter() {
		if (processItemProvider == null) {
			processItemProvider = new ProcessItemProvider(this);
		}

		return processItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link QWiki.Spice.ProcessGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessGroupItemProvider processGroupItemProvider;

	/**
	 * This creates an adapter for a {@link QWiki.Spice.ProcessGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessGroupAdapter() {
		if (processGroupItemProvider == null) {
			processGroupItemProvider = new ProcessGroupItemProvider(this);
		}

		return processGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link QWiki.Spice.Outcome} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutcomeItemProvider outcomeItemProvider;

	/**
	 * This creates an adapter for a {@link QWiki.Spice.Outcome}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutcomeAdapter() {
		if (outcomeItemProvider == null) {
			outcomeItemProvider = new OutcomeItemProvider(this);
		}

		return outcomeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link QWiki.Spice.WorkProduct} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkProductItemProvider workProductItemProvider;

	/**
	 * This creates an adapter for a {@link QWiki.Spice.WorkProduct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkProductAdapter() {
		if (workProductItemProvider == null) {
			workProductItemProvider = new WorkProductItemProvider(this);
		}

		return workProductItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link QWiki.Spice.GenericWorkProduct} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericWorkProductItemProvider genericWorkProductItemProvider;

	/**
	 * This creates an adapter for a {@link QWiki.Spice.GenericWorkProduct}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenericWorkProductAdapter() {
		if (genericWorkProductItemProvider == null) {
			genericWorkProductItemProvider = new GenericWorkProductItemProvider(this);
		}

		return genericWorkProductItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link QWiki.Spice.WorkProductRelationship} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkProductRelationshipItemProvider workProductRelationshipItemProvider;

	/**
	 * This creates an adapter for a {@link QWiki.Spice.WorkProductRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkProductRelationshipAdapter() {
		if (workProductRelationshipItemProvider == null) {
			workProductRelationshipItemProvider = new WorkProductRelationshipItemProvider(this);
		}

		return workProductRelationshipItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link QWiki.Spice.WorkProductRelationshipType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkProductRelationshipTypeItemProvider workProductRelationshipTypeItemProvider;

	/**
	 * This creates an adapter for a {@link QWiki.Spice.WorkProductRelationshipType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorkProductRelationshipTypeAdapter() {
		if (workProductRelationshipTypeItemProvider == null) {
			workProductRelationshipTypeItemProvider = new WorkProductRelationshipTypeItemProvider(this);
		}

		return workProductRelationshipTypeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (basePractiseItemProvider != null) basePractiseItemProvider.dispose();
		if (processReferenceModelItemProvider != null) processReferenceModelItemProvider.dispose();
		if (processItemProvider != null) processItemProvider.dispose();
		if (processGroupItemProvider != null) processGroupItemProvider.dispose();
		if (outcomeItemProvider != null) outcomeItemProvider.dispose();
		if (workProductItemProvider != null) workProductItemProvider.dispose();
		if (genericWorkProductItemProvider != null) genericWorkProductItemProvider.dispose();
		if (workProductRelationshipItemProvider != null) workProductRelationshipItemProvider.dispose();
		if (workProductRelationshipTypeItemProvider != null) workProductRelationshipTypeItemProvider.dispose();
	}

}