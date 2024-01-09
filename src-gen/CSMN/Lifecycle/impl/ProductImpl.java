/**
 */
package CSMN.Lifecycle.impl;

import CSMN.Lifecycle.LifecyclePackage;
import CSMN.Lifecycle.Product;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CSMN.Lifecycle.impl.ProductImpl#getName <em>Name</em>}</li>
 *   <li>{@link CSMN.Lifecycle.impl.ProductImpl#getModel <em>Model</em>}</li>
 *   <li>{@link CSMN.Lifecycle.impl.ProductImpl#getUdiDi <em>Udi Di</em>}</li>
 *   <li>{@link CSMN.Lifecycle.impl.ProductImpl#getUdiDiBase <em>Udi Di Base</em>}</li>
 *   <li>{@link CSMN.Lifecycle.impl.ProductImpl#getSoftwareVersion <em>Software Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductImpl extends MinimalEObjectImpl.Container implements Product {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

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
		return LifecyclePackage.Literals.PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LifecyclePackage.PRODUCT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LifecyclePackage.PRODUCT__MODEL, oldModel, model));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LifecyclePackage.PRODUCT__UDI_DI, oldUdiDi, udiDi));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LifecyclePackage.PRODUCT__UDI_DI_BASE, oldUdiDiBase, udiDiBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSoftwareVersion() {
		if (softwareVersion == null) {
			softwareVersion = new EDataTypeUniqueEList<String>(String.class, this, LifecyclePackage.PRODUCT__SOFTWARE_VERSION);
		}
		return softwareVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LifecyclePackage.PRODUCT__NAME:
				return getName();
			case LifecyclePackage.PRODUCT__MODEL:
				return getModel();
			case LifecyclePackage.PRODUCT__UDI_DI:
				return getUdiDi();
			case LifecyclePackage.PRODUCT__UDI_DI_BASE:
				return getUdiDiBase();
			case LifecyclePackage.PRODUCT__SOFTWARE_VERSION:
				return getSoftwareVersion();
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
			case LifecyclePackage.PRODUCT__NAME:
				setName((String)newValue);
				return;
			case LifecyclePackage.PRODUCT__MODEL:
				setModel((String)newValue);
				return;
			case LifecyclePackage.PRODUCT__UDI_DI:
				setUdiDi((String)newValue);
				return;
			case LifecyclePackage.PRODUCT__UDI_DI_BASE:
				setUdiDiBase((String)newValue);
				return;
			case LifecyclePackage.PRODUCT__SOFTWARE_VERSION:
				getSoftwareVersion().clear();
				getSoftwareVersion().addAll((Collection<? extends String>)newValue);
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
			case LifecyclePackage.PRODUCT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LifecyclePackage.PRODUCT__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case LifecyclePackage.PRODUCT__UDI_DI:
				setUdiDi(UDI_DI_EDEFAULT);
				return;
			case LifecyclePackage.PRODUCT__UDI_DI_BASE:
				setUdiDiBase(UDI_DI_BASE_EDEFAULT);
				return;
			case LifecyclePackage.PRODUCT__SOFTWARE_VERSION:
				getSoftwareVersion().clear();
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
			case LifecyclePackage.PRODUCT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LifecyclePackage.PRODUCT__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
			case LifecyclePackage.PRODUCT__UDI_DI:
				return UDI_DI_EDEFAULT == null ? udiDi != null : !UDI_DI_EDEFAULT.equals(udiDi);
			case LifecyclePackage.PRODUCT__UDI_DI_BASE:
				return UDI_DI_BASE_EDEFAULT == null ? udiDiBase != null : !UDI_DI_BASE_EDEFAULT.equals(udiDiBase);
			case LifecyclePackage.PRODUCT__SOFTWARE_VERSION:
				return softwareVersion != null && !softwareVersion.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", model: ");
		result.append(model);
		result.append(", udiDi: ");
		result.append(udiDi);
		result.append(", udiDiBase: ");
		result.append(udiDiBase);
		result.append(", softwareVersion: ");
		result.append(softwareVersion);
		result.append(')');
		return result.toString();
	}

} //ProductImpl
