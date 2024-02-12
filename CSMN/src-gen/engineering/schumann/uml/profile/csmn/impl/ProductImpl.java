/**
 */
package engineering.schumann.uml.profile.csmn.impl;

import engineering.schumann.uml.profile.csmn.CSMNPackage;
import engineering.schumann.uml.profile.csmn.Product;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMNPackage.PRODUCT__UDI_DI:
				return getUdiDi();
			case CSMNPackage.PRODUCT__UDI_DI_BASE:
				return getUdiDiBase();
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
		result.append(')');
		return result.toString();
	}

} //ProductImpl
