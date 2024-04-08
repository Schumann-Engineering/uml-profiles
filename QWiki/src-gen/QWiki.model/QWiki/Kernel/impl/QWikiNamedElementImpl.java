/**
 */
package QWiki.Kernel.impl;

import QWiki.Kernel.I18nKeyedString;
import QWiki.Kernel.KernelPackage;
import QWiki.Kernel.QWikiElement;
import QWiki.Kernel.QWikiNamedElement;

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
import org.eclipse.uml2.uml.internal.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QWiki Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Kernel.impl.QWikiNamedElementImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link QWiki.Kernel.impl.QWikiNamedElementImpl#getCustomProperty <em>Custom Property</em>}</li>
 *   <li>{@link QWiki.Kernel.impl.QWikiNamedElementImpl#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class QWikiNamedElementImpl extends NamedElementImpl implements QWikiNamedElement {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QWikiNamedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelPackage.Literals.QWIKI_NAMED_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.QWIKI_NAMED_ELEMENT__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<I18nKeyedString> getCustomProperty() {
		if (customProperty == null) {
			customProperty = new EObjectContainmentEList<I18nKeyedString>(I18nKeyedString.class, this, KernelPackage.QWIKI_NAMED_ELEMENT__CUSTOM_PROPERTY);
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
			tag = new EDataTypeUniqueEList<String>(String.class, this, KernelPackage.QWIKI_NAMED_ELEMENT__TAG);
		}
		return tag;
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
			case KernelPackage.QWIKI_NAMED_ELEMENT__CUSTOM_PROPERTY:
				return ((InternalEList<?>)getCustomProperty()).basicRemove(otherEnd, msgs);
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
			case KernelPackage.QWIKI_NAMED_ELEMENT__UUID:
				return getUuid();
			case KernelPackage.QWIKI_NAMED_ELEMENT__CUSTOM_PROPERTY:
				return getCustomProperty();
			case KernelPackage.QWIKI_NAMED_ELEMENT__TAG:
				return getTag();
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
			case KernelPackage.QWIKI_NAMED_ELEMENT__UUID:
				setUuid((String)newValue);
				return;
			case KernelPackage.QWIKI_NAMED_ELEMENT__CUSTOM_PROPERTY:
				getCustomProperty().clear();
				getCustomProperty().addAll((Collection<? extends I18nKeyedString>)newValue);
				return;
			case KernelPackage.QWIKI_NAMED_ELEMENT__TAG:
				getTag().clear();
				getTag().addAll((Collection<? extends String>)newValue);
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
			case KernelPackage.QWIKI_NAMED_ELEMENT__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case KernelPackage.QWIKI_NAMED_ELEMENT__CUSTOM_PROPERTY:
				getCustomProperty().clear();
				return;
			case KernelPackage.QWIKI_NAMED_ELEMENT__TAG:
				getTag().clear();
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
			case KernelPackage.QWIKI_NAMED_ELEMENT__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case KernelPackage.QWIKI_NAMED_ELEMENT__CUSTOM_PROPERTY:
				return customProperty != null && !customProperty.isEmpty();
			case KernelPackage.QWIKI_NAMED_ELEMENT__TAG:
				return tag != null && !tag.isEmpty();
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
				case KernelPackage.QWIKI_NAMED_ELEMENT__UUID: return KernelPackage.QWIKI_ELEMENT__UUID;
				case KernelPackage.QWIKI_NAMED_ELEMENT__CUSTOM_PROPERTY: return KernelPackage.QWIKI_ELEMENT__CUSTOM_PROPERTY;
				case KernelPackage.QWIKI_NAMED_ELEMENT__TAG: return KernelPackage.QWIKI_ELEMENT__TAG;
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
				case KernelPackage.QWIKI_ELEMENT__UUID: return KernelPackage.QWIKI_NAMED_ELEMENT__UUID;
				case KernelPackage.QWIKI_ELEMENT__CUSTOM_PROPERTY: return KernelPackage.QWIKI_NAMED_ELEMENT__CUSTOM_PROPERTY;
				case KernelPackage.QWIKI_ELEMENT__TAG: return KernelPackage.QWIKI_NAMED_ELEMENT__TAG;
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
				case KernelPackage.QWIKI_ELEMENT___OID_BASIC: return KernelPackage.QWIKI_NAMED_ELEMENT___OID_BASIC;
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
			case KernelPackage.QWIKI_NAMED_ELEMENT___OID_BASIC:
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

} //QWikiNamedElementImpl
