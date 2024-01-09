/**
 */
package CSMN.Characteristics.Security.impl;

import CSMN.Characteristics.Security.CommonPlatformEnumeration;
import CSMN.Characteristics.Security.CommonPlatformEnumerationType;
import CSMN.Characteristics.Security.SecurityPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Common Platform Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CSMN.Characteristics.Security.impl.CommonPlatformEnumerationImpl#getCpeType <em>Cpe Type</em>}</li>
 *   <li>{@link CSMN.Characteristics.Security.impl.CommonPlatformEnumerationImpl#getVendorName <em>Vendor Name</em>}</li>
 *   <li>{@link CSMN.Characteristics.Security.impl.CommonPlatformEnumerationImpl#getProductName <em>Product Name</em>}</li>
 *   <li>{@link CSMN.Characteristics.Security.impl.CommonPlatformEnumerationImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommonPlatformEnumerationImpl extends MinimalEObjectImpl.Container implements CommonPlatformEnumeration {
	/**
	 * The default value of the '{@link #getCpeType() <em>Cpe Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpeType()
	 * @generated
	 * @ordered
	 */
	protected static final CommonPlatformEnumerationType CPE_TYPE_EDEFAULT = CommonPlatformEnumerationType.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getCpeType() <em>Cpe Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpeType()
	 * @generated
	 * @ordered
	 */
	protected CommonPlatformEnumerationType cpeType = CPE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVendorName() <em>Vendor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorName()
	 * @generated
	 * @ordered
	 */
	protected static final String VENDOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVendorName() <em>Vendor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVendorName()
	 * @generated
	 * @ordered
	 */
	protected String vendorName = VENDOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected String productName = PRODUCT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommonPlatformEnumerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecurityPackage.Literals.COMMON_PLATFORM_ENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommonPlatformEnumerationType getCpeType() {
		return cpeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCpeType(CommonPlatformEnumerationType newCpeType) {
		CommonPlatformEnumerationType oldCpeType = cpeType;
		cpeType = newCpeType == null ? CPE_TYPE_EDEFAULT : newCpeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.COMMON_PLATFORM_ENUMERATION__CPE_TYPE, oldCpeType, cpeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVendorName() {
		return vendorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVendorName(String newVendorName) {
		String oldVendorName = vendorName;
		vendorName = newVendorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.COMMON_PLATFORM_ENUMERATION__VENDOR_NAME, oldVendorName, vendorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductName() {
		return productName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductName(String newProductName) {
		String oldProductName = productName;
		productName = newProductName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.COMMON_PLATFORM_ENUMERATION__PRODUCT_NAME, oldProductName, productName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecurityPackage.COMMON_PLATFORM_ENUMERATION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecurityPackage.COMMON_PLATFORM_ENUMERATION__CPE_TYPE:
				return getCpeType();
			case SecurityPackage.COMMON_PLATFORM_ENUMERATION__VENDOR_NAME:
				return getVendorName();
			case SecurityPackage.COMMON_PLATFORM_ENUMERATION__PRODUCT_NAME:
				return getProductName();
			case SecurityPackage.COMMON_PLATFORM_ENUMERATION__VERSION:
				return getVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SecurityPackage.COMMON_PLATFORM_ENUMERATION__CPE_TYPE:
				setCpeType((CommonPlatformEnumerationType)newValue);
				return;
			case SecurityPackage.COMMON_PLATFORM_ENUMERATION__VENDOR_NAME:
				setVendorName((String)newValue);
				return;
			case SecurityPackage.COMMON_PLATFORM_ENUMERATION__PRODUCT_NAME:
				setProductName((String)newValue);
				return;
			case SecurityPackage.COMMON_PLATFORM_ENUMERATION__VERSION:
				setVersion((String)newValue);
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
			case SecurityPackage.COMMON_PLATFORM_ENUMERATION__CPE_TYPE:
				setCpeType(CPE_TYPE_EDEFAULT);
				return;
			case SecurityPackage.COMMON_PLATFORM_ENUMERATION__VENDOR_NAME:
				setVendorName(VENDOR_NAME_EDEFAULT);
				return;
			case SecurityPackage.COMMON_PLATFORM_ENUMERATION__PRODUCT_NAME:
				setProductName(PRODUCT_NAME_EDEFAULT);
				return;
			case SecurityPackage.COMMON_PLATFORM_ENUMERATION__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case SecurityPackage.COMMON_PLATFORM_ENUMERATION__CPE_TYPE:
				return cpeType != CPE_TYPE_EDEFAULT;
			case SecurityPackage.COMMON_PLATFORM_ENUMERATION__VENDOR_NAME:
				return VENDOR_NAME_EDEFAULT == null ? vendorName != null : !VENDOR_NAME_EDEFAULT.equals(vendorName);
			case SecurityPackage.COMMON_PLATFORM_ENUMERATION__PRODUCT_NAME:
				return PRODUCT_NAME_EDEFAULT == null ? productName != null : !PRODUCT_NAME_EDEFAULT.equals(productName);
			case SecurityPackage.COMMON_PLATFORM_ENUMERATION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (cpeType: ");
		result.append(cpeType);
		result.append(", vendorName: ");
		result.append(vendorName);
		result.append(", productName: ");
		result.append(productName);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //CommonPlatformEnumerationImpl
