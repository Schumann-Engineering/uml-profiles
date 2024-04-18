/**
 */
package QWiki.Kernel.provider;

import QWiki.Kernel.util.KernelAdapterFactory;

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
public class KernelItemProviderAdapterFactory extends KernelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public KernelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link QWiki.Kernel.I18nKeyedString} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected I18nKeyedStringItemProvider i18nKeyedStringItemProvider;

	/**
	 * This creates an adapter for a {@link QWiki.Kernel.I18nKeyedString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createI18nKeyedStringAdapter() {
		if (i18nKeyedStringItemProvider == null) {
			i18nKeyedStringItemProvider = new I18nKeyedStringItemProvider(this);
		}

		return i18nKeyedStringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link QWiki.Kernel.I18nBaseString} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected I18nBaseStringItemProvider i18nBaseStringItemProvider;

	/**
	 * This creates an adapter for a {@link QWiki.Kernel.I18nBaseString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createI18nBaseStringAdapter() {
		if (i18nBaseStringItemProvider == null) {
			i18nBaseStringItemProvider = new I18nBaseStringItemProvider(this);
		}

		return i18nBaseStringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link QWiki.Kernel.I18nValue} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected I18nValueItemProvider i18nValueItemProvider;

	/**
	 * This creates an adapter for a {@link QWiki.Kernel.I18nValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createI18nValueAdapter() {
		if (i18nValueItemProvider == null) {
			i18nValueItemProvider = new I18nValueItemProvider(this);
		}

		return i18nValueItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link QWiki.Kernel.I18nString} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected I18nStringItemProvider i18nStringItemProvider;

	/**
	 * This creates an adapter for a {@link QWiki.Kernel.I18nString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createI18nStringAdapter() {
		if (i18nStringItemProvider == null) {
			i18nStringItemProvider = new I18nStringItemProvider(this);
		}

		return i18nStringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link QWiki.Kernel.QWikiComment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QWikiCommentItemProvider qWikiCommentItemProvider;

	/**
	 * This creates an adapter for a {@link QWiki.Kernel.QWikiComment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQWikiCommentAdapter() {
		if (qWikiCommentItemProvider == null) {
			qWikiCommentItemProvider = new QWikiCommentItemProvider(this);
		}

		return qWikiCommentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link QWiki.Kernel.QWikiContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QWikiContainerItemProvider qWikiContainerItemProvider;

	/**
	 * This creates an adapter for a {@link QWiki.Kernel.QWikiContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQWikiContainerAdapter() {
		if (qWikiContainerItemProvider == null) {
			qWikiContainerItemProvider = new QWikiContainerItemProvider(this);
		}

		return qWikiContainerItemProvider;
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
		if (i18nKeyedStringItemProvider != null) i18nKeyedStringItemProvider.dispose();
		if (i18nBaseStringItemProvider != null) i18nBaseStringItemProvider.dispose();
		if (i18nValueItemProvider != null) i18nValueItemProvider.dispose();
		if (i18nStringItemProvider != null) i18nStringItemProvider.dispose();
		if (qWikiCommentItemProvider != null) qWikiCommentItemProvider.dispose();
		if (qWikiContainerItemProvider != null) qWikiContainerItemProvider.dispose();
	}

}