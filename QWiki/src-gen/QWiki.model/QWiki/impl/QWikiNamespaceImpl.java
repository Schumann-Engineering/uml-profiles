/**
 */
package QWiki.impl;

import QWiki.L10nKeyedString;
import QWiki.L10nNamedElement;
import QWiki.L10nString;
import QWiki.QWikiElement;
import QWiki.QWikiModel;
import QWiki.QWikiNamedElement;
import QWiki.QWikiNamespace;
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

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.internal.impl.NamespaceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.impl.QWikiNamespaceImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link QWiki.impl.QWikiNamespaceImpl#getCustomProperty <em>Custom Property</em>}</li>
 *   <li>{@link QWiki.impl.QWikiNamespaceImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link QWiki.impl.QWikiNamespaceImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link QWiki.impl.QWikiNamespaceImpl#getQwikiNamespace <em>Qwiki Namespace</em>}</li>
 *   <li>{@link QWiki.impl.QWikiNamespaceImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link QWiki.impl.QWikiNamespaceImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link QWiki.impl.QWikiNamespaceImpl#getQwikiElement <em>Qwiki Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class QWikiNamespaceImpl extends NamespaceImpl implements QWikiNamespace {
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
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected L10nString displayName;

	/**
	 * The cached value of the '{@link #getQwikiElement() <em>Qwiki Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQwikiElement()
	 * @generated
	 * @ordered
	 */
	protected EList<QWikiNamedElement> qwikiElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QWikiNamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QWikiPackage.Literals.QWIKI_NAMESPACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.QWIKI_NAMESPACE__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<L10nKeyedString> getCustomProperty() {
		if (customProperty == null) {
			customProperty = new EObjectContainmentEList<L10nKeyedString>(L10nKeyedString.class, this, QWikiPackage.QWIKI_NAMESPACE__CUSTOM_PROPERTY);
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
			tag = new EDataTypeUniqueEList<String>(String.class, this, QWikiPackage.QWIKI_NAMESPACE__TAG);
		}
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace getNamespace() {
		Namespace namespace = basicGetNamespace();
		return namespace != null && namespace.eIsProxy() ? (Namespace)eResolveProxy((InternalEObject)namespace) : namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace basicGetNamespace() {
		QWikiNamespace qwikiNamespace = getQwikiNamespace();			
		if (qwikiNamespace != null) {
			return qwikiNamespace;
		}
		return super.basicGetNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QWikiNamespace getQwikiNamespace() {
		if (eContainerFeatureID() != QWikiPackage.QWIKI_NAMESPACE__QWIKI_NAMESPACE) return null;
		return (QWikiNamespace)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQwikiNamespace(QWikiNamespace newQwikiNamespace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newQwikiNamespace, QWikiPackage.QWIKI_NAMESPACE__QWIKI_NAMESPACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQwikiNamespace(QWikiNamespace newQwikiNamespace) {
		if (newQwikiNamespace != eInternalContainer() || (eContainerFeatureID() != QWikiPackage.QWIKI_NAMESPACE__QWIKI_NAMESPACE && newQwikiNamespace != null)) {
			if (EcoreUtil.isAncestor(this, newQwikiNamespace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newQwikiNamespace != null)
				msgs = ((InternalEObject)newQwikiNamespace).eInverseAdd(this, QWikiPackage.QWIKI_NAMESPACE__QWIKI_ELEMENT, QWikiNamespace.class, msgs);
			msgs = basicSetQwikiNamespace(newQwikiNamespace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.QWIKI_NAMESPACE__QWIKI_NAMESPACE, newQwikiNamespace, newQwikiNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public L10nString getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplayName(L10nString newDisplayName, NotificationChain msgs) {
		L10nString oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QWikiPackage.QWIKI_NAMESPACE__DISPLAY_NAME, oldDisplayName, newDisplayName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayName(L10nString newDisplayName) {
		if (newDisplayName != displayName) {
			NotificationChain msgs = null;
			if (displayName != null)
				msgs = ((InternalEObject)displayName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QWikiPackage.QWIKI_NAMESPACE__DISPLAY_NAME, null, msgs);
			if (newDisplayName != null)
				msgs = ((InternalEObject)newDisplayName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QWikiPackage.QWIKI_NAMESPACE__DISPLAY_NAME, null, msgs);
			msgs = basicSetDisplayName(newDisplayName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.QWIKI_NAMESPACE__DISPLAY_NAME, newDisplayName, newDisplayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getOwnedMembers() {
		return new DerivedUnionEObjectEList<NamedElement>(NamedElement.class, this, QWikiPackage.QWIKI_NAMESPACE__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[] {QWikiPackage.QWIKI_NAMESPACE__OWNED_RULE, QWikiPackage.QWIKI_NAMESPACE__QWIKI_ELEMENT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QWikiNamedElement> getQwikiElement() {
		if (qwikiElement == null) {
			qwikiElement = new EObjectContainmentWithInverseEList<QWikiNamedElement>(QWikiNamedElement.class, this, QWikiPackage.QWIKI_NAMESPACE__QWIKI_ELEMENT, QWikiPackage.QWIKI_NAMED_ELEMENT__QWIKI_NAMESPACE);
		}
		return qwikiElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWikiNamedElement getQwikiElement(String name) {
		return getQwikiElement(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWikiNamedElement getQwikiElement(String name, boolean ignoreCase, EClass eClass) {
		qwikiElementLoop: for (QWikiNamedElement qwikiElement : getQwikiElement()) {
			if (eClass != null && !eClass.isInstance(qwikiElement))
				continue qwikiElementLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(qwikiElement.getName()) : name.equals(qwikiElement.getName())))
				continue qwikiElementLoop;
			return qwikiElement;
		}
		return null;
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
	 * The cached invocation delegate for the '{@link #qwikiModel() <em>Qwiki Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #qwikiModel()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate QWIKI_MODEL__EINVOCATION_DELEGATE = ((EOperation.Internal)QWikiPackage.Literals.QWIKI_NAMED_ELEMENT___QWIKI_MODEL).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWikiModel qwikiModel() {
		try {
			return (QWikiModel)QWIKI_MODEL__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case QWikiPackage.QWIKI_NAMESPACE__QWIKI_NAMESPACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetQwikiNamespace((QWikiNamespace)otherEnd, msgs);
			case QWikiPackage.QWIKI_NAMESPACE__QWIKI_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getQwikiElement()).basicAdd(otherEnd, msgs);
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
			case QWikiPackage.QWIKI_NAMESPACE__CUSTOM_PROPERTY:
				return ((InternalEList<?>)getCustomProperty()).basicRemove(otherEnd, msgs);
			case QWikiPackage.QWIKI_NAMESPACE__QWIKI_NAMESPACE:
				return basicSetQwikiNamespace(null, msgs);
			case QWikiPackage.QWIKI_NAMESPACE__DISPLAY_NAME:
				return basicSetDisplayName(null, msgs);
			case QWikiPackage.QWIKI_NAMESPACE__QWIKI_ELEMENT:
				return ((InternalEList<?>)getQwikiElement()).basicRemove(otherEnd, msgs);
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
			case QWikiPackage.QWIKI_NAMESPACE__QWIKI_NAMESPACE:
				return eInternalContainer().eInverseRemove(this, QWikiPackage.QWIKI_NAMESPACE__QWIKI_ELEMENT, QWikiNamespace.class, msgs);
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
			case QWikiPackage.QWIKI_NAMESPACE__UUID:
				return getUuid();
			case QWikiPackage.QWIKI_NAMESPACE__CUSTOM_PROPERTY:
				return getCustomProperty();
			case QWikiPackage.QWIKI_NAMESPACE__TAG:
				return getTag();
			case QWikiPackage.QWIKI_NAMESPACE__QWIKI_NAMESPACE:
				return getQwikiNamespace();
			case QWikiPackage.QWIKI_NAMESPACE__DISPLAY_NAME:
				return getDisplayName();
			case QWikiPackage.QWIKI_NAMESPACE__QWIKI_ELEMENT:
				return getQwikiElement();
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
			case QWikiPackage.QWIKI_NAMESPACE__UUID:
				setUuid((String)newValue);
				return;
			case QWikiPackage.QWIKI_NAMESPACE__CUSTOM_PROPERTY:
				getCustomProperty().clear();
				getCustomProperty().addAll((Collection<? extends L10nKeyedString>)newValue);
				return;
			case QWikiPackage.QWIKI_NAMESPACE__TAG:
				getTag().clear();
				getTag().addAll((Collection<? extends String>)newValue);
				return;
			case QWikiPackage.QWIKI_NAMESPACE__QWIKI_NAMESPACE:
				setQwikiNamespace((QWikiNamespace)newValue);
				return;
			case QWikiPackage.QWIKI_NAMESPACE__DISPLAY_NAME:
				setDisplayName((L10nString)newValue);
				return;
			case QWikiPackage.QWIKI_NAMESPACE__QWIKI_ELEMENT:
				getQwikiElement().clear();
				getQwikiElement().addAll((Collection<? extends QWikiNamedElement>)newValue);
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
			case QWikiPackage.QWIKI_NAMESPACE__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case QWikiPackage.QWIKI_NAMESPACE__CUSTOM_PROPERTY:
				getCustomProperty().clear();
				return;
			case QWikiPackage.QWIKI_NAMESPACE__TAG:
				getTag().clear();
				return;
			case QWikiPackage.QWIKI_NAMESPACE__QWIKI_NAMESPACE:
				setQwikiNamespace((QWikiNamespace)null);
				return;
			case QWikiPackage.QWIKI_NAMESPACE__DISPLAY_NAME:
				setDisplayName((L10nString)null);
				return;
			case QWikiPackage.QWIKI_NAMESPACE__QWIKI_ELEMENT:
				getQwikiElement().clear();
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
			case QWikiPackage.QWIKI_NAMESPACE__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case QWikiPackage.QWIKI_NAMESPACE__CUSTOM_PROPERTY:
				return customProperty != null && !customProperty.isEmpty();
			case QWikiPackage.QWIKI_NAMESPACE__TAG:
				return tag != null && !tag.isEmpty();
			case QWikiPackage.QWIKI_NAMESPACE__NAMESPACE:
				return isSetNamespace();
			case QWikiPackage.QWIKI_NAMESPACE__QWIKI_NAMESPACE:
				return getQwikiNamespace() != null;
			case QWikiPackage.QWIKI_NAMESPACE__DISPLAY_NAME:
				return displayName != null;
			case QWikiPackage.QWIKI_NAMESPACE__OWNED_MEMBER:
				return isSetOwnedMembers();
			case QWikiPackage.QWIKI_NAMESPACE__QWIKI_ELEMENT:
				return qwikiElement != null && !qwikiElement.isEmpty();
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
				case QWikiPackage.QWIKI_NAMESPACE__UUID: return QWikiPackage.QWIKI_ELEMENT__UUID;
				case QWikiPackage.QWIKI_NAMESPACE__CUSTOM_PROPERTY: return QWikiPackage.QWIKI_ELEMENT__CUSTOM_PROPERTY;
				case QWikiPackage.QWIKI_NAMESPACE__TAG: return QWikiPackage.QWIKI_ELEMENT__TAG;
				default: return -1;
			}
		}
		if (baseClass == QWikiNamedElement.class) {
			switch (derivedFeatureID) {
				case QWikiPackage.QWIKI_NAMESPACE__QWIKI_NAMESPACE: return QWikiPackage.QWIKI_NAMED_ELEMENT__QWIKI_NAMESPACE;
				default: return -1;
			}
		}
		if (baseClass == L10nNamedElement.class) {
			switch (derivedFeatureID) {
				case QWikiPackage.QWIKI_NAMESPACE__DISPLAY_NAME: return QWikiPackage.L1_0N_NAMED_ELEMENT__DISPLAY_NAME;
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
				case QWikiPackage.QWIKI_ELEMENT__UUID: return QWikiPackage.QWIKI_NAMESPACE__UUID;
				case QWikiPackage.QWIKI_ELEMENT__CUSTOM_PROPERTY: return QWikiPackage.QWIKI_NAMESPACE__CUSTOM_PROPERTY;
				case QWikiPackage.QWIKI_ELEMENT__TAG: return QWikiPackage.QWIKI_NAMESPACE__TAG;
				default: return -1;
			}
		}
		if (baseClass == QWikiNamedElement.class) {
			switch (baseFeatureID) {
				case QWikiPackage.QWIKI_NAMED_ELEMENT__QWIKI_NAMESPACE: return QWikiPackage.QWIKI_NAMESPACE__QWIKI_NAMESPACE;
				default: return -1;
			}
		}
		if (baseClass == L10nNamedElement.class) {
			switch (baseFeatureID) {
				case QWikiPackage.L1_0N_NAMED_ELEMENT__DISPLAY_NAME: return QWikiPackage.QWIKI_NAMESPACE__DISPLAY_NAME;
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
				case QWikiPackage.QWIKI_ELEMENT___OBJECT_ID: return QWikiPackage.QWIKI_NAMESPACE___OBJECT_ID;
				default: return -1;
			}
		}
		if (baseClass == QWikiNamedElement.class) {
			switch (baseOperationID) {
				case QWikiPackage.QWIKI_NAMED_ELEMENT___QWIKI_MODEL: return QWikiPackage.QWIKI_NAMESPACE___QWIKI_MODEL;
				default: return -1;
			}
		}
		if (baseClass == L10nNamedElement.class) {
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
			case QWikiPackage.QWIKI_NAMESPACE___OBJECT_ID:
				return objectId();
			case QWikiPackage.QWIKI_NAMESPACE___QWIKI_MODEL:
				return qwikiModel();
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
	public boolean isSetNamespace() {
		return super.isSetNamespace()
			|| eIsSet(QWikiPackage.QWIKI_NAMESPACE__QWIKI_NAMESPACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(QWikiPackage.QWIKI_NAMESPACE__QWIKI_ELEMENT);
	}

} //QWikiNamespaceImpl
