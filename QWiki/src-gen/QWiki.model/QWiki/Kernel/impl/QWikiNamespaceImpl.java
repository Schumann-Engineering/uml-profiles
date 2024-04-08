/**
 */
package QWiki.Kernel.impl;

import QWiki.Kernel.I18nKeyedString;
import QWiki.Kernel.I18nNamedElement;
import QWiki.Kernel.I18nString;
import QWiki.Kernel.KernelPackage;
import QWiki.Kernel.QWikiElement;
import QWiki.Kernel.QWikiNamedElement;
import QWiki.Kernel.QWikiNamespace;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.uml.internal.impl.NamespaceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QWiki Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Kernel.impl.QWikiNamespaceImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link QWiki.Kernel.impl.QWikiNamespaceImpl#getCustomProperty <em>Custom Property</em>}</li>
 *   <li>{@link QWiki.Kernel.impl.QWikiNamespaceImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link QWiki.Kernel.impl.QWikiNamespaceImpl#getDisplayName <em>Display Name</em>}</li>
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
	protected EList<I18nKeyedString> customProperty;

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
	protected I18nString displayName;

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
		return KernelPackage.Literals.QWIKI_NAMESPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.QWIKI_NAMESPACE__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<I18nKeyedString> getCustomProperty() {
		if (customProperty == null) {
			customProperty = new EObjectContainmentEList<I18nKeyedString>(I18nKeyedString.class, this, KernelPackage.QWIKI_NAMESPACE__CUSTOM_PROPERTY);
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
			tag = new EDataTypeUniqueEList<String>(String.class, this, KernelPackage.QWIKI_NAMESPACE__TAG);
		}
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public I18nString getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplayName(I18nString newDisplayName, NotificationChain msgs) {
		I18nString oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KernelPackage.QWIKI_NAMESPACE__DISPLAY_NAME, oldDisplayName, newDisplayName);
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
	public void setDisplayName(I18nString newDisplayName) {
		if (newDisplayName != displayName) {
			NotificationChain msgs = null;
			if (displayName != null)
				msgs = ((InternalEObject)displayName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KernelPackage.QWIKI_NAMESPACE__DISPLAY_NAME, null, msgs);
			if (newDisplayName != null)
				msgs = ((InternalEObject)newDisplayName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KernelPackage.QWIKI_NAMESPACE__DISPLAY_NAME, null, msgs);
			msgs = basicSetDisplayName(newDisplayName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.QWIKI_NAMESPACE__DISPLAY_NAME, newDisplayName, newDisplayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String oidBasic() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KernelPackage.QWIKI_NAMESPACE__CUSTOM_PROPERTY:
				return ((InternalEList<?>)getCustomProperty()).basicRemove(otherEnd, msgs);
			case KernelPackage.QWIKI_NAMESPACE__DISPLAY_NAME:
				return basicSetDisplayName(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KernelPackage.QWIKI_NAMESPACE__UUID:
				return getUuid();
			case KernelPackage.QWIKI_NAMESPACE__CUSTOM_PROPERTY:
				return getCustomProperty();
			case KernelPackage.QWIKI_NAMESPACE__TAG:
				return getTag();
			case KernelPackage.QWIKI_NAMESPACE__DISPLAY_NAME:
				return getDisplayName();
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
			case KernelPackage.QWIKI_NAMESPACE__UUID:
				setUuid((String)newValue);
				return;
			case KernelPackage.QWIKI_NAMESPACE__CUSTOM_PROPERTY:
				getCustomProperty().clear();
				getCustomProperty().addAll((Collection<? extends I18nKeyedString>)newValue);
				return;
			case KernelPackage.QWIKI_NAMESPACE__TAG:
				getTag().clear();
				getTag().addAll((Collection<? extends String>)newValue);
				return;
			case KernelPackage.QWIKI_NAMESPACE__DISPLAY_NAME:
				setDisplayName((I18nString)newValue);
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
			case KernelPackage.QWIKI_NAMESPACE__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case KernelPackage.QWIKI_NAMESPACE__CUSTOM_PROPERTY:
				getCustomProperty().clear();
				return;
			case KernelPackage.QWIKI_NAMESPACE__TAG:
				getTag().clear();
				return;
			case KernelPackage.QWIKI_NAMESPACE__DISPLAY_NAME:
				setDisplayName((I18nString)null);
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
			case KernelPackage.QWIKI_NAMESPACE__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case KernelPackage.QWIKI_NAMESPACE__CUSTOM_PROPERTY:
				return customProperty != null && !customProperty.isEmpty();
			case KernelPackage.QWIKI_NAMESPACE__TAG:
				return tag != null && !tag.isEmpty();
			case KernelPackage.QWIKI_NAMESPACE__DISPLAY_NAME:
				return displayName != null;
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
				case KernelPackage.QWIKI_NAMESPACE__UUID: return KernelPackage.QWIKI_ELEMENT__UUID;
				case KernelPackage.QWIKI_NAMESPACE__CUSTOM_PROPERTY: return KernelPackage.QWIKI_ELEMENT__CUSTOM_PROPERTY;
				case KernelPackage.QWIKI_NAMESPACE__TAG: return KernelPackage.QWIKI_ELEMENT__TAG;
				default: return -1;
			}
		}
		if (baseClass == QWikiNamedElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == I18nNamedElement.class) {
			switch (derivedFeatureID) {
				case KernelPackage.QWIKI_NAMESPACE__DISPLAY_NAME: return KernelPackage.I1_8N_NAMED_ELEMENT__DISPLAY_NAME;
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
				case KernelPackage.QWIKI_ELEMENT__UUID: return KernelPackage.QWIKI_NAMESPACE__UUID;
				case KernelPackage.QWIKI_ELEMENT__CUSTOM_PROPERTY: return KernelPackage.QWIKI_NAMESPACE__CUSTOM_PROPERTY;
				case KernelPackage.QWIKI_ELEMENT__TAG: return KernelPackage.QWIKI_NAMESPACE__TAG;
				default: return -1;
			}
		}
		if (baseClass == QWikiNamedElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == I18nNamedElement.class) {
			switch (baseFeatureID) {
				case KernelPackage.I1_8N_NAMED_ELEMENT__DISPLAY_NAME: return KernelPackage.QWIKI_NAMESPACE__DISPLAY_NAME;
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
				case KernelPackage.QWIKI_ELEMENT___OID_BASIC: return KernelPackage.QWIKI_NAMESPACE___OID_BASIC;
				default: return -1;
			}
		}
		if (baseClass == QWikiNamedElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == I18nNamedElement.class) {
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case KernelPackage.QWIKI_NAMESPACE___OID_BASIC:
				return oidBasic();
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

} //QWikiNamespaceImpl
