/**
 */
package QWiki.provider;

import QWiki.util.QWikiAdapterFactory;

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
public class QWikiItemProviderAdapterFactory extends QWikiAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public QWikiItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link QWiki.L10nKeyedString} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected L10nKeyedStringItemProvider l10nKeyedStringItemProvider;

	/**
	 * This creates an adapter for a {@link QWiki.L10nKeyedString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createL10nKeyedStringAdapter() {
		if (l10nKeyedStringItemProvider == null) {
			l10nKeyedStringItemProvider = new L10nKeyedStringItemProvider(this);
		}

		return l10nKeyedStringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link QWiki.L10nBaseString} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected L10nBaseStringItemProvider l10nBaseStringItemProvider;

	/**
	 * This creates an adapter for a {@link QWiki.L10nBaseString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createL10nBaseStringAdapter() {
		if (l10nBaseStringItemProvider == null) {
			l10nBaseStringItemProvider = new L10nBaseStringItemProvider(this);
		}

		return l10nBaseStringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link QWiki.L10nText} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected L10nTextItemProvider l10nTextItemProvider;

	/**
	 * This creates an adapter for a {@link QWiki.L10nText}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createL10nTextAdapter() {
		if (l10nTextItemProvider == null) {
			l10nTextItemProvider = new L10nTextItemProvider(this);
		}

		return l10nTextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link QWiki.QWikiEncryptionKey} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QWikiEncryptionKeyItemProvider qWikiEncryptionKeyItemProvider;

	/**
	 * This creates an adapter for a {@link QWiki.QWikiEncryptionKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQWikiEncryptionKeyAdapter() {
		if (qWikiEncryptionKeyItemProvider == null) {
			qWikiEncryptionKeyItemProvider = new QWikiEncryptionKeyItemProvider(this);
		}

		return qWikiEncryptionKeyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link QWiki.QWikiModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QWikiModelItemProvider qWikiModelItemProvider;

	/**
	 * This creates an adapter for a {@link QWiki.QWikiModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQWikiModelAdapter() {
		if (qWikiModelItemProvider == null) {
			qWikiModelItemProvider = new QWikiModelItemProvider(this);
		}

		return qWikiModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link QWiki.QWikiContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QWikiContainerItemProvider qWikiContainerItemProvider;

	/**
	 * This creates an adapter for a {@link QWiki.QWikiContainer}.
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
	 * This keeps track of the one adapter used for all {@link QWiki.L10nString} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected L10nStringItemProvider l10nStringItemProvider;

	/**
	 * This creates an adapter for a {@link QWiki.L10nString}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createL10nStringAdapter() {
		if (l10nStringItemProvider == null) {
			l10nStringItemProvider = new L10nStringItemProvider(this);
		}

		return l10nStringItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link QWiki.QWikiComment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QWikiCommentItemProvider qWikiCommentItemProvider;

	/**
	 * This creates an adapter for a {@link QWiki.QWikiComment}.
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
		if (l10nKeyedStringItemProvider != null) l10nKeyedStringItemProvider.dispose();
		if (l10nBaseStringItemProvider != null) l10nBaseStringItemProvider.dispose();
		if (l10nTextItemProvider != null) l10nTextItemProvider.dispose();
		if (qWikiEncryptionKeyItemProvider != null) qWikiEncryptionKeyItemProvider.dispose();
		if (qWikiModelItemProvider != null) qWikiModelItemProvider.dispose();
		if (qWikiContainerItemProvider != null) qWikiContainerItemProvider.dispose();
		if (l10nStringItemProvider != null) l10nStringItemProvider.dispose();
		if (qWikiCommentItemProvider != null) qWikiCommentItemProvider.dispose();
	}

}
