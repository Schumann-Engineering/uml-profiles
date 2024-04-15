/**
 */
package QWiki.Content.impl;

import QWiki.Content.Content;
import QWiki.Content.ContentContainer;
import QWiki.Content.ContentPackage;

import QWiki.L10nKeyedString;
import QWiki.L10nString;
import QWiki.QWikiElement;
import QWiki.QWikiPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.Element;

import org.eclipse.uml2.uml.internal.impl.NamespaceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Content.impl.ContentContainerImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link QWiki.Content.impl.ContentContainerImpl#getCustomProperty <em>Custom Property</em>}</li>
 *   <li>{@link QWiki.Content.impl.ContentContainerImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link QWiki.Content.impl.ContentContainerImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link QWiki.Content.impl.ContentContainerImpl#getOwningContent <em>Owning Content</em>}</li>
 *   <li>{@link QWiki.Content.impl.ContentContainerImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link QWiki.Content.impl.ContentContainerImpl#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContentContainerImpl extends NamespaceImpl implements ContentContainer {
	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomProperty() <em>Custom Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<L10nKeyedString> customProperty;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tag;

	/**
	 * The cached value of the '{@link #getCaption() <em>Caption</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaption()
	 * @generated
	 * @ordered
	 */
	protected L10nString caption;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<Content> item;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.CONTENT_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getUuid() {
		if (uuid == null)
			setUuid(java.util.UUID.randomUUID().toString());		
			
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_CONTAINER__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<L10nKeyedString> getCustomProperty() {
		if (customProperty == null) {
			customProperty = new EObjectContainmentEList<L10nKeyedString>(L10nKeyedString.class, this, ContentPackage.CONTENT_CONTAINER__CUSTOM_PROPERTY);
		}
		return customProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTag() {
		if (tag == null) {
			tag = new EDataTypeUniqueEList<String>(String.class, this, ContentPackage.CONTENT_CONTAINER__TAG);
		}
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy() ? (Element)eResolveProxy((InternalEObject)owner) : owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element basicGetOwner() {
		ContentContainer owningContent = getOwningContent();			
		if (owningContent != null) {
			return owningContent;
		}
		return super.basicGetOwner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentContainer getOwningContent() {
		if (eContainerFeatureID() != ContentPackage.CONTENT_CONTAINER__OWNING_CONTENT) return null;
		return (ContentContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningContent(ContentContainer newOwningContent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningContent, ContentPackage.CONTENT_CONTAINER__OWNING_CONTENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningContent(ContentContainer newOwningContent) {
		if (newOwningContent != eInternalContainer() || (eContainerFeatureID() != ContentPackage.CONTENT_CONTAINER__OWNING_CONTENT && newOwningContent != null)) {
			if (EcoreUtil.isAncestor(this, newOwningContent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningContent != null)
				msgs = ((InternalEObject)newOwningContent).eInverseAdd(this, ContentPackage.CONTENT_CONTAINER__ITEM, ContentContainer.class, msgs);
			msgs = basicSetOwningContent(newOwningContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_CONTAINER__OWNING_CONTENT, newOwningContent, newOwningContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public L10nString getCaption() {
		if (caption != null && caption.eIsProxy()) {
			InternalEObject oldCaption = (InternalEObject)caption;
			caption = (L10nString)eResolveProxy(oldCaption);
			if (caption != oldCaption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentPackage.CONTENT_CONTAINER__CAPTION, oldCaption, caption));
			}
		}
		return caption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public L10nString basicGetCaption() {
		return caption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaption(L10nString newCaption) {
		L10nString oldCaption = caption;
		caption = newCaption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.CONTENT_CONTAINER__CAPTION, oldCaption, caption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Content> getItem() {
		if (item == null) {
			item = new EObjectContainmentWithInverseEList<Content>(Content.class, this, ContentPackage.CONTENT_CONTAINER__ITEM, ContentPackage.CONTENT__OWNING_CONTENT);
		}
		return item;
	}

	/**
	 * The cached invocation delegate for the '{@link #objectId() <em>Object Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #objectId()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate OBJECT_ID__EINVOCATION_DELEGATE = ((EOperation.Internal)QWikiPackage.Literals.QWIKI_ELEMENT___OBJECT_ID).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String objectId() {
		try {
			return (String)OBJECT_ID__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentPackage.CONTENT_CONTAINER__OWNING_CONTENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningContent((ContentContainer)otherEnd, msgs);
			case ContentPackage.CONTENT_CONTAINER__ITEM:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getItem()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentPackage.CONTENT_CONTAINER__CUSTOM_PROPERTY:
				return ((InternalEList<?>)getCustomProperty()).basicRemove(otherEnd, msgs);
			case ContentPackage.CONTENT_CONTAINER__OWNING_CONTENT:
				return basicSetOwningContent(null, msgs);
			case ContentPackage.CONTENT_CONTAINER__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ContentPackage.CONTENT_CONTAINER__OWNING_CONTENT:
				return eInternalContainer().eInverseRemove(this, ContentPackage.CONTENT_CONTAINER__ITEM, ContentContainer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentPackage.CONTENT_CONTAINER__UUID:
				return getUuid();
			case ContentPackage.CONTENT_CONTAINER__CUSTOM_PROPERTY:
				return getCustomProperty();
			case ContentPackage.CONTENT_CONTAINER__TAG:
				return getTag();
			case ContentPackage.CONTENT_CONTAINER__OWNING_CONTENT:
				return getOwningContent();
			case ContentPackage.CONTENT_CONTAINER__CAPTION:
				if (resolve) return getCaption();
				return basicGetCaption();
			case ContentPackage.CONTENT_CONTAINER__ITEM:
				return getItem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContentPackage.CONTENT_CONTAINER__UUID:
				setUuid((String)newValue);
				return;
			case ContentPackage.CONTENT_CONTAINER__CUSTOM_PROPERTY:
				getCustomProperty().clear();
				getCustomProperty().addAll((Collection<? extends L10nKeyedString>)newValue);
				return;
			case ContentPackage.CONTENT_CONTAINER__TAG:
				getTag().clear();
				getTag().addAll((Collection<? extends String>)newValue);
				return;
			case ContentPackage.CONTENT_CONTAINER__OWNING_CONTENT:
				setOwningContent((ContentContainer)newValue);
				return;
			case ContentPackage.CONTENT_CONTAINER__CAPTION:
				setCaption((L10nString)newValue);
				return;
			case ContentPackage.CONTENT_CONTAINER__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends Content>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ContentPackage.CONTENT_CONTAINER__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case ContentPackage.CONTENT_CONTAINER__CUSTOM_PROPERTY:
				getCustomProperty().clear();
				return;
			case ContentPackage.CONTENT_CONTAINER__TAG:
				getTag().clear();
				return;
			case ContentPackage.CONTENT_CONTAINER__OWNING_CONTENT:
				setOwningContent((ContentContainer)null);
				return;
			case ContentPackage.CONTENT_CONTAINER__CAPTION:
				setCaption((L10nString)null);
				return;
			case ContentPackage.CONTENT_CONTAINER__ITEM:
				getItem().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ContentPackage.CONTENT_CONTAINER__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case ContentPackage.CONTENT_CONTAINER__CUSTOM_PROPERTY:
				return customProperty != null && !customProperty.isEmpty();
			case ContentPackage.CONTENT_CONTAINER__TAG:
				return tag != null && !tag.isEmpty();
			case ContentPackage.CONTENT_CONTAINER__OWNER:
				return isSetOwner();
			case ContentPackage.CONTENT_CONTAINER__OWNING_CONTENT:
				return getOwningContent() != null;
			case ContentPackage.CONTENT_CONTAINER__CAPTION:
				return caption != null;
			case ContentPackage.CONTENT_CONTAINER__ITEM:
				return item != null && !item.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == QWikiElement.class) {
			switch (derivedFeatureID) {
				case ContentPackage.CONTENT_CONTAINER__UUID: return QWikiPackage.QWIKI_ELEMENT__UUID;
				case ContentPackage.CONTENT_CONTAINER__CUSTOM_PROPERTY: return QWikiPackage.QWIKI_ELEMENT__CUSTOM_PROPERTY;
				case ContentPackage.CONTENT_CONTAINER__TAG: return QWikiPackage.QWIKI_ELEMENT__TAG;
				default: return -1;
			}
		}
		if (baseClass == Content.class) {
			switch (derivedFeatureID) {
				case ContentPackage.CONTENT_CONTAINER__OWNING_CONTENT: return ContentPackage.CONTENT__OWNING_CONTENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == QWikiElement.class) {
			switch (baseFeatureID) {
				case QWikiPackage.QWIKI_ELEMENT__UUID: return ContentPackage.CONTENT_CONTAINER__UUID;
				case QWikiPackage.QWIKI_ELEMENT__CUSTOM_PROPERTY: return ContentPackage.CONTENT_CONTAINER__CUSTOM_PROPERTY;
				case QWikiPackage.QWIKI_ELEMENT__TAG: return ContentPackage.CONTENT_CONTAINER__TAG;
				default: return -1;
			}
		}
		if (baseClass == Content.class) {
			switch (baseFeatureID) {
				case ContentPackage.CONTENT__OWNING_CONTENT: return ContentPackage.CONTENT_CONTAINER__OWNING_CONTENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == QWikiElement.class) {
			switch (baseOperationID) {
				case QWikiPackage.QWIKI_ELEMENT___OBJECT_ID: return ContentPackage.CONTENT_CONTAINER___OBJECT_ID;
				default: return -1;
			}
		}
		if (baseClass == Content.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ContentPackage.CONTENT_CONTAINER___OBJECT_ID:
				return objectId();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uuid: ");
		result.append(uuid);
		result.append(", tag: ");
		result.append(tag);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwner() {
		return super.isSetOwner()
			|| eIsSet(ContentPackage.CONTENT_CONTAINER__OWNING_CONTENT);
	}

} //ContentContainerImpl
