/**
 */
package engineering.schumann.uml.profile.csmn.impl;

import engineering.schumann.uml.profile.csmn.Asset;
import engineering.schumann.uml.profile.csmn.AssetCategory;
import engineering.schumann.uml.profile.csmn.AssetFlightLevel;
import engineering.schumann.uml.profile.csmn.AssetType;
import engineering.schumann.uml.profile.csmn.CSMNPackage;

import engineering.schumann.uml.profile.csmn.ProtectionGoal;
import engineering.schumann.uml.profile.csmn.STRIDE;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.AssetImpl#getBase_NamedElement <em>Base Named Element</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.AssetImpl#getAssetSpec <em>Asset Spec</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.AssetImpl#getAssetType <em>Asset Type</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.AssetImpl#getFlightLevel <em>Flight Level</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.AssetImpl#getAssetCategory <em>Asset Category</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.AssetImpl#getProtectionGoal <em>Protection Goal</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.AssetImpl#getStride <em>Stride</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetImpl extends MinimalEObjectImpl.Container implements Asset {
	/**
	 * The cached value of the '{@link #getBase_NamedElement() <em>Base Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_NamedElement()
	 * @generated
	 * @ordered
	 */
	protected NamedElement base_NamedElement;

	/**
	 * The default value of the '{@link #getAssetSpec() <em>Asset Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetSpec()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSET_SPEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssetSpec() <em>Asset Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetSpec()
	 * @generated
	 * @ordered
	 */
	protected String assetSpec = ASSET_SPEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssetType() <em>Asset Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetType()
	 * @generated
	 * @ordered
	 */
	protected static final AssetType ASSET_TYPE_EDEFAULT = AssetType.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getAssetType() <em>Asset Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetType()
	 * @generated
	 * @ordered
	 */
	protected AssetType assetType = ASSET_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlightLevel() <em>Flight Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightLevel()
	 * @generated
	 * @ordered
	 */
	protected static final AssetFlightLevel FLIGHT_LEVEL_EDEFAULT = AssetFlightLevel.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getFlightLevel() <em>Flight Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlightLevel()
	 * @generated
	 * @ordered
	 */
	protected AssetFlightLevel flightLevel = FLIGHT_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssetCategory() <em>Asset Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetCategory()
	 * @generated
	 * @ordered
	 */
	protected static final AssetCategory ASSET_CATEGORY_EDEFAULT = AssetCategory.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getAssetCategory() <em>Asset Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetCategory()
	 * @generated
	 * @ordered
	 */
	protected AssetCategory assetCategory = ASSET_CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProtectionGoal() <em>Protection Goal</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionGoal()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtectionGoal> protectionGoal;

	/**
	 * The cached value of the '{@link #getStride() <em>Stride</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStride()
	 * @generated
	 * @ordered
	 */
	protected EList<STRIDE> stride;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMNPackage.Literals.ASSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssetType getAssetType() {
		return assetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssetType(AssetType newAssetType) {
		AssetType oldAssetType = assetType;
		assetType = newAssetType == null ? ASSET_TYPE_EDEFAULT : newAssetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.ASSET__ASSET_TYPE, oldAssetType, assetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssetFlightLevel getFlightLevel() {
		return flightLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlightLevel(AssetFlightLevel newFlightLevel) {
		AssetFlightLevel oldFlightLevel = flightLevel;
		flightLevel = newFlightLevel == null ? FLIGHT_LEVEL_EDEFAULT : newFlightLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.ASSET__FLIGHT_LEVEL, oldFlightLevel, flightLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssetCategory getAssetCategory() {
		return assetCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssetCategory(AssetCategory newAssetCategory) {
		AssetCategory oldAssetCategory = assetCategory;
		assetCategory = newAssetCategory == null ? ASSET_CATEGORY_EDEFAULT : newAssetCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.ASSET__ASSET_CATEGORY, oldAssetCategory, assetCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProtectionGoal> getProtectionGoal() {
		if (protectionGoal == null) {
			protectionGoal = new EDataTypeUniqueEList<ProtectionGoal>(ProtectionGoal.class, this, CSMNPackage.ASSET__PROTECTION_GOAL);
		}
		return protectionGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<STRIDE> getStride() {
		if (stride == null) {
			stride = new EDataTypeUniqueEList<STRIDE>(STRIDE.class, this, CSMNPackage.ASSET__STRIDE);
		}
		return stride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement getBase_NamedElement() {
		if (base_NamedElement != null && base_NamedElement.eIsProxy()) {
			InternalEObject oldBase_NamedElement = (InternalEObject)base_NamedElement;
			base_NamedElement = (NamedElement)eResolveProxy(oldBase_NamedElement);
			if (base_NamedElement != oldBase_NamedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CSMNPackage.ASSET__BASE_NAMED_ELEMENT, oldBase_NamedElement, base_NamedElement));
			}
		}
		return base_NamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetBase_NamedElement() {
		return base_NamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_NamedElement(NamedElement newBase_NamedElement) {
		NamedElement oldBase_NamedElement = base_NamedElement;
		base_NamedElement = newBase_NamedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.ASSET__BASE_NAMED_ELEMENT, oldBase_NamedElement, base_NamedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssetSpec() {
		return assetSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssetSpec(String newAssetSpec) {
		String oldAssetSpec = assetSpec;
		assetSpec = newAssetSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.ASSET__ASSET_SPEC, oldAssetSpec, assetSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMNPackage.ASSET__BASE_NAMED_ELEMENT:
				if (resolve) return getBase_NamedElement();
				return basicGetBase_NamedElement();
			case CSMNPackage.ASSET__ASSET_SPEC:
				return getAssetSpec();
			case CSMNPackage.ASSET__ASSET_TYPE:
				return getAssetType();
			case CSMNPackage.ASSET__FLIGHT_LEVEL:
				return getFlightLevel();
			case CSMNPackage.ASSET__ASSET_CATEGORY:
				return getAssetCategory();
			case CSMNPackage.ASSET__PROTECTION_GOAL:
				return getProtectionGoal();
			case CSMNPackage.ASSET__STRIDE:
				return getStride();
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
			case CSMNPackage.ASSET__BASE_NAMED_ELEMENT:
				setBase_NamedElement((NamedElement)newValue);
				return;
			case CSMNPackage.ASSET__ASSET_SPEC:
				setAssetSpec((String)newValue);
				return;
			case CSMNPackage.ASSET__ASSET_TYPE:
				setAssetType((AssetType)newValue);
				return;
			case CSMNPackage.ASSET__FLIGHT_LEVEL:
				setFlightLevel((AssetFlightLevel)newValue);
				return;
			case CSMNPackage.ASSET__ASSET_CATEGORY:
				setAssetCategory((AssetCategory)newValue);
				return;
			case CSMNPackage.ASSET__PROTECTION_GOAL:
				getProtectionGoal().clear();
				getProtectionGoal().addAll((Collection<? extends ProtectionGoal>)newValue);
				return;
			case CSMNPackage.ASSET__STRIDE:
				getStride().clear();
				getStride().addAll((Collection<? extends STRIDE>)newValue);
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
			case CSMNPackage.ASSET__BASE_NAMED_ELEMENT:
				setBase_NamedElement((NamedElement)null);
				return;
			case CSMNPackage.ASSET__ASSET_SPEC:
				setAssetSpec(ASSET_SPEC_EDEFAULT);
				return;
			case CSMNPackage.ASSET__ASSET_TYPE:
				setAssetType(ASSET_TYPE_EDEFAULT);
				return;
			case CSMNPackage.ASSET__FLIGHT_LEVEL:
				setFlightLevel(FLIGHT_LEVEL_EDEFAULT);
				return;
			case CSMNPackage.ASSET__ASSET_CATEGORY:
				setAssetCategory(ASSET_CATEGORY_EDEFAULT);
				return;
			case CSMNPackage.ASSET__PROTECTION_GOAL:
				getProtectionGoal().clear();
				return;
			case CSMNPackage.ASSET__STRIDE:
				getStride().clear();
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
			case CSMNPackage.ASSET__BASE_NAMED_ELEMENT:
				return base_NamedElement != null;
			case CSMNPackage.ASSET__ASSET_SPEC:
				return ASSET_SPEC_EDEFAULT == null ? assetSpec != null : !ASSET_SPEC_EDEFAULT.equals(assetSpec);
			case CSMNPackage.ASSET__ASSET_TYPE:
				return assetType != ASSET_TYPE_EDEFAULT;
			case CSMNPackage.ASSET__FLIGHT_LEVEL:
				return flightLevel != FLIGHT_LEVEL_EDEFAULT;
			case CSMNPackage.ASSET__ASSET_CATEGORY:
				return assetCategory != ASSET_CATEGORY_EDEFAULT;
			case CSMNPackage.ASSET__PROTECTION_GOAL:
				return protectionGoal != null && !protectionGoal.isEmpty();
			case CSMNPackage.ASSET__STRIDE:
				return stride != null && !stride.isEmpty();
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
		result.append(" (assetSpec: ");
		result.append(assetSpec);
		result.append(", assetType: ");
		result.append(assetType);
		result.append(", flightLevel: ");
		result.append(flightLevel);
		result.append(", assetCategory: ");
		result.append(assetCategory);
		result.append(", protectionGoal: ");
		result.append(protectionGoal);
		result.append(", stride: ");
		result.append(stride);
		result.append(')');
		return result.toString();
	}

} //AssetImpl
