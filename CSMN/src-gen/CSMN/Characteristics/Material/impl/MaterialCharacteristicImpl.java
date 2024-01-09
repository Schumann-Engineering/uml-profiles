/**
 */
package CSMN.Characteristics.Material.impl;

import CSMN.Characteristics.Material.MaterialCharacteristic;
import CSMN.Characteristics.Material.MaterialPackage;
import CSMN.Characteristics.Material.MaterialType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Relationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CSMN.Characteristics.Material.impl.MaterialCharacteristicImpl#getBase_Port <em>Base Port</em>}</li>
 *   <li>{@link CSMN.Characteristics.Material.impl.MaterialCharacteristicImpl#getBase_Relationship <em>Base Relationship</em>}</li>
 *   <li>{@link CSMN.Characteristics.Material.impl.MaterialCharacteristicImpl#getMaterialType <em>Material Type</em>}</li>
 *   <li>{@link CSMN.Characteristics.Material.impl.MaterialCharacteristicImpl#getOtherMaterialType <em>Other Material Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaterialCharacteristicImpl extends MinimalEObjectImpl.Container implements MaterialCharacteristic {
	/**
	 * The cached value of the '{@link #getBase_Port() <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Port()
	 * @generated
	 * @ordered
	 */
	protected Port base_Port;

	/**
	 * The cached value of the '{@link #getBase_Relationship() <em>Base Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Relationship()
	 * @generated
	 * @ordered
	 */
	protected Relationship base_Relationship;

	/**
	 * The cached value of the '{@link #getMaterialType() <em>Material Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialType()
	 * @generated
	 * @ordered
	 */
	protected EList<MaterialType> materialType;

	/**
	 * The default value of the '{@link #getOtherMaterialType() <em>Other Material Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherMaterialType()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHER_MATERIAL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherMaterialType() <em>Other Material Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherMaterialType()
	 * @generated
	 * @ordered
	 */
	protected String otherMaterialType = OTHER_MATERIAL_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaterialCharacteristicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MaterialPackage.Literals.MATERIAL_CHARACTERISTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port getBase_Port() {
		if (base_Port != null && base_Port.eIsProxy()) {
			InternalEObject oldBase_Port = (InternalEObject)base_Port;
			base_Port = (Port)eResolveProxy(oldBase_Port);
			if (base_Port != oldBase_Port) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MaterialPackage.MATERIAL_CHARACTERISTIC__BASE_PORT, oldBase_Port, base_Port));
			}
		}
		return base_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port basicGetBase_Port() {
		return base_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Port(Port newBase_Port) {
		Port oldBase_Port = base_Port;
		base_Port = newBase_Port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaterialPackage.MATERIAL_CHARACTERISTIC__BASE_PORT, oldBase_Port, base_Port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relationship getBase_Relationship() {
		if (base_Relationship != null && base_Relationship.eIsProxy()) {
			InternalEObject oldBase_Relationship = (InternalEObject)base_Relationship;
			base_Relationship = (Relationship)eResolveProxy(oldBase_Relationship);
			if (base_Relationship != oldBase_Relationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MaterialPackage.MATERIAL_CHARACTERISTIC__BASE_RELATIONSHIP, oldBase_Relationship, base_Relationship));
			}
		}
		return base_Relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship basicGetBase_Relationship() {
		return base_Relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Relationship(Relationship newBase_Relationship) {
		Relationship oldBase_Relationship = base_Relationship;
		base_Relationship = newBase_Relationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaterialPackage.MATERIAL_CHARACTERISTIC__BASE_RELATIONSHIP, oldBase_Relationship, base_Relationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MaterialType> getMaterialType() {
		if (materialType == null) {
			materialType = new EDataTypeUniqueEList<MaterialType>(MaterialType.class, this, MaterialPackage.MATERIAL_CHARACTERISTIC__MATERIAL_TYPE);
		}
		return materialType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOtherMaterialType() {
		return otherMaterialType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOtherMaterialType(String newOtherMaterialType) {
		String oldOtherMaterialType = otherMaterialType;
		otherMaterialType = newOtherMaterialType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MaterialPackage.MATERIAL_CHARACTERISTIC__OTHER_MATERIAL_TYPE, oldOtherMaterialType, otherMaterialType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MaterialPackage.MATERIAL_CHARACTERISTIC__BASE_PORT:
				if (resolve) return getBase_Port();
				return basicGetBase_Port();
			case MaterialPackage.MATERIAL_CHARACTERISTIC__BASE_RELATIONSHIP:
				if (resolve) return getBase_Relationship();
				return basicGetBase_Relationship();
			case MaterialPackage.MATERIAL_CHARACTERISTIC__MATERIAL_TYPE:
				return getMaterialType();
			case MaterialPackage.MATERIAL_CHARACTERISTIC__OTHER_MATERIAL_TYPE:
				return getOtherMaterialType();
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
			case MaterialPackage.MATERIAL_CHARACTERISTIC__BASE_PORT:
				setBase_Port((Port)newValue);
				return;
			case MaterialPackage.MATERIAL_CHARACTERISTIC__BASE_RELATIONSHIP:
				setBase_Relationship((Relationship)newValue);
				return;
			case MaterialPackage.MATERIAL_CHARACTERISTIC__MATERIAL_TYPE:
				getMaterialType().clear();
				getMaterialType().addAll((Collection<? extends MaterialType>)newValue);
				return;
			case MaterialPackage.MATERIAL_CHARACTERISTIC__OTHER_MATERIAL_TYPE:
				setOtherMaterialType((String)newValue);
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
			case MaterialPackage.MATERIAL_CHARACTERISTIC__BASE_PORT:
				setBase_Port((Port)null);
				return;
			case MaterialPackage.MATERIAL_CHARACTERISTIC__BASE_RELATIONSHIP:
				setBase_Relationship((Relationship)null);
				return;
			case MaterialPackage.MATERIAL_CHARACTERISTIC__MATERIAL_TYPE:
				getMaterialType().clear();
				return;
			case MaterialPackage.MATERIAL_CHARACTERISTIC__OTHER_MATERIAL_TYPE:
				setOtherMaterialType(OTHER_MATERIAL_TYPE_EDEFAULT);
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
			case MaterialPackage.MATERIAL_CHARACTERISTIC__BASE_PORT:
				return base_Port != null;
			case MaterialPackage.MATERIAL_CHARACTERISTIC__BASE_RELATIONSHIP:
				return base_Relationship != null;
			case MaterialPackage.MATERIAL_CHARACTERISTIC__MATERIAL_TYPE:
				return materialType != null && !materialType.isEmpty();
			case MaterialPackage.MATERIAL_CHARACTERISTIC__OTHER_MATERIAL_TYPE:
				return OTHER_MATERIAL_TYPE_EDEFAULT == null ? otherMaterialType != null : !OTHER_MATERIAL_TYPE_EDEFAULT.equals(otherMaterialType);
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
		result.append(" (materialType: ");
		result.append(materialType);
		result.append(", otherMaterialType: ");
		result.append(otherMaterialType);
		result.append(')');
		return result.toString();
	}

} //MaterialCharacteristicImpl
