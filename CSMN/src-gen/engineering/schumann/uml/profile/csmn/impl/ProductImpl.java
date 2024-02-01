/**
 */
package engineering.schumann.uml.profile.csmn.impl;

import engineering.schumann.uml.profile.csmn.CSMNPackage;
import engineering.schumann.uml.profile.csmn.CommonPlatformEnumerationType;
import engineering.schumann.uml.profile.csmn.Product;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.ProductImpl#getUdiDi <em>Udi Di</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.ProductImpl#getUdiDiBase <em>Udi Di Base</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.ProductImpl#getSoftwareVersion <em>Software Version</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.ProductImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductImpl extends CommonPlatformEnumerationImpl implements Product {
	/**
	 * The default value of the '{@link #getUdiDi() <em>Udi Di</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdiDi()
	 * @generated
	 * @ordered
	 */
	protected static final String UDI_DI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUdiDi() <em>Udi Di</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdiDi()
	 * @generated
	 * @ordered
	 */
	protected String udiDi = UDI_DI_EDEFAULT;

	/**
	 * The default value of the '{@link #getUdiDiBase() <em>Udi Di Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdiDiBase()
	 * @generated
	 * @ordered
	 */
	protected static final String UDI_DI_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUdiDiBase() <em>Udi Di Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdiDiBase()
	 * @generated
	 * @ordered
	 */
	protected String udiDiBase = UDI_DI_BASE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSoftwareVersion() <em>Software Version</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareVersion()
	 * @generated
	 * @ordered
	 */
	protected EList<String> softwareVersion;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final CommonPlatformEnumerationType TYPE_EDEFAULT = CommonPlatformEnumerationType.HARDWARE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CommonPlatformEnumerationType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMNPackage.Literals.PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUdiDi() {
		return udiDi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUdiDi(String newUdiDi) {
		String oldUdiDi = udiDi;
		udiDi = newUdiDi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.PRODUCT__UDI_DI, oldUdiDi, udiDi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUdiDiBase() {
		return udiDiBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUdiDiBase(String newUdiDiBase) {
		String oldUdiDiBase = udiDiBase;
		udiDiBase = newUdiDiBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.PRODUCT__UDI_DI_BASE, oldUdiDiBase, udiDiBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSoftwareVersion() {
		if (softwareVersion == null) {
			softwareVersion = new EDataTypeUniqueEList<String>(String.class, this, CSMNPackage.PRODUCT__SOFTWARE_VERSION);
		}
		return softwareVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommonPlatformEnumerationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(CommonPlatformEnumerationType newType) {
		CommonPlatformEnumerationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.PRODUCT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMNPackage.PRODUCT__UDI_DI:
				return getUdiDi();
			case CSMNPackage.PRODUCT__UDI_DI_BASE:
				return getUdiDiBase();
			case CSMNPackage.PRODUCT__SOFTWARE_VERSION:
				return getSoftwareVersion();
			case CSMNPackage.PRODUCT__TYPE:
				return getType();
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
			case CSMNPackage.PRODUCT__UDI_DI:
				setUdiDi((String)newValue);
				return;
			case CSMNPackage.PRODUCT__UDI_DI_BASE:
				setUdiDiBase((String)newValue);
				return;
			case CSMNPackage.PRODUCT__SOFTWARE_VERSION:
				getSoftwareVersion().clear();
				getSoftwareVersion().addAll((Collection<? extends String>)newValue);
				return;
			case CSMNPackage.PRODUCT__TYPE:
				setType((CommonPlatformEnumerationType)newValue);
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
			case CSMNPackage.PRODUCT__UDI_DI:
				setUdiDi(UDI_DI_EDEFAULT);
				return;
			case CSMNPackage.PRODUCT__UDI_DI_BASE:
				setUdiDiBase(UDI_DI_BASE_EDEFAULT);
				return;
			case CSMNPackage.PRODUCT__SOFTWARE_VERSION:
				getSoftwareVersion().clear();
				return;
			case CSMNPackage.PRODUCT__TYPE:
				setType(TYPE_EDEFAULT);
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
			case CSMNPackage.PRODUCT__UDI_DI:
				return UDI_DI_EDEFAULT == null ? udiDi != null : !UDI_DI_EDEFAULT.equals(udiDi);
			case CSMNPackage.PRODUCT__UDI_DI_BASE:
				return UDI_DI_BASE_EDEFAULT == null ? udiDiBase != null : !UDI_DI_BASE_EDEFAULT.equals(udiDiBase);
			case CSMNPackage.PRODUCT__SOFTWARE_VERSION:
				return softwareVersion != null && !softwareVersion.isEmpty();
			case CSMNPackage.PRODUCT__TYPE:
				return type != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (udiDi: ");
		result.append(udiDi);
		result.append(", udiDiBase: ");
		result.append(udiDiBase);
		result.append(", softwareVersion: ");
		result.append(softwareVersion);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ProductImpl
