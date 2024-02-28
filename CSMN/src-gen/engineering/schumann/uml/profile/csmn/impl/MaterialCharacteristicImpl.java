/**
 */
package engineering.schumann.uml.profile.csmn.impl;

import engineering.schumann.uml.profile.csmn.CSMNPackage;
import engineering.schumann.uml.profile.csmn.MaterialCharacteristic;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Material Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.MaterialCharacteristicImpl#getBase_Port <em>Base Port</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.MaterialCharacteristicImpl#getBase_Dependency <em>Base Dependency</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.MaterialCharacteristicImpl#getMaterialType <em>Material Type</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.MaterialCharacteristicImpl#getOtherMaterialType <em>Other Material Type</em>}</li>
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
	 * The cached value of the '{@link #getBase_Dependency() <em>Base Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Dependency()
	 * @generated
	 * @ordered
	 */
	protected Dependency base_Dependency;

	/**
	 * The cached value of the '{@link #getMaterialType() <em>Material Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterialType()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> materialType;

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
		return CSMNPackage.Literals.MATERIAL_CHARACTERISTIC;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CSMNPackage.MATERIAL_CHARACTERISTIC__BASE_PORT, oldBase_Port, base_Port));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.MATERIAL_CHARACTERISTIC__BASE_PORT, oldBase_Port, base_Port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataType> getMaterialType() {
		if (materialType == null) {
			materialType = new EObjectResolvingEList<DataType>(DataType.class, this, CSMNPackage.MATERIAL_CHARACTERISTIC__MATERIAL_TYPE);
		}
		return materialType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getMaterialType(String name) {
		return getMaterialType(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getMaterialType(String name, boolean ignoreCase, EClass eClass) {
		materialTypeLoop: for (DataType materialType : getMaterialType()) {
			if (eClass != null && !eClass.isInstance(materialType))
				continue materialTypeLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(materialType.getName()) : name.equals(materialType.getName())))
				continue materialTypeLoop;
			return materialType;
		}
		return null;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.MATERIAL_CHARACTERISTIC__OTHER_MATERIAL_TYPE, oldOtherMaterialType, otherMaterialType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dependency getBase_Dependency() {
		if (base_Dependency != null && base_Dependency.eIsProxy()) {
			InternalEObject oldBase_Dependency = (InternalEObject)base_Dependency;
			base_Dependency = (Dependency)eResolveProxy(oldBase_Dependency);
			if (base_Dependency != oldBase_Dependency) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CSMNPackage.MATERIAL_CHARACTERISTIC__BASE_DEPENDENCY, oldBase_Dependency, base_Dependency));
			}
		}
		return base_Dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency basicGetBase_Dependency() {
		return base_Dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Dependency(Dependency newBase_Dependency) {
		Dependency oldBase_Dependency = base_Dependency;
		base_Dependency = newBase_Dependency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.MATERIAL_CHARACTERISTIC__BASE_DEPENDENCY, oldBase_Dependency, base_Dependency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMNPackage.MATERIAL_CHARACTERISTIC__BASE_PORT:
				if (resolve) return getBase_Port();
				return basicGetBase_Port();
			case CSMNPackage.MATERIAL_CHARACTERISTIC__BASE_DEPENDENCY:
				if (resolve) return getBase_Dependency();
				return basicGetBase_Dependency();
			case CSMNPackage.MATERIAL_CHARACTERISTIC__MATERIAL_TYPE:
				return getMaterialType();
			case CSMNPackage.MATERIAL_CHARACTERISTIC__OTHER_MATERIAL_TYPE:
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
			case CSMNPackage.MATERIAL_CHARACTERISTIC__BASE_PORT:
				setBase_Port((Port)newValue);
				return;
			case CSMNPackage.MATERIAL_CHARACTERISTIC__BASE_DEPENDENCY:
				setBase_Dependency((Dependency)newValue);
				return;
			case CSMNPackage.MATERIAL_CHARACTERISTIC__MATERIAL_TYPE:
				getMaterialType().clear();
				getMaterialType().addAll((Collection<? extends DataType>)newValue);
				return;
			case CSMNPackage.MATERIAL_CHARACTERISTIC__OTHER_MATERIAL_TYPE:
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
			case CSMNPackage.MATERIAL_CHARACTERISTIC__BASE_PORT:
				setBase_Port((Port)null);
				return;
			case CSMNPackage.MATERIAL_CHARACTERISTIC__BASE_DEPENDENCY:
				setBase_Dependency((Dependency)null);
				return;
			case CSMNPackage.MATERIAL_CHARACTERISTIC__MATERIAL_TYPE:
				getMaterialType().clear();
				return;
			case CSMNPackage.MATERIAL_CHARACTERISTIC__OTHER_MATERIAL_TYPE:
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
			case CSMNPackage.MATERIAL_CHARACTERISTIC__BASE_PORT:
				return base_Port != null;
			case CSMNPackage.MATERIAL_CHARACTERISTIC__BASE_DEPENDENCY:
				return base_Dependency != null;
			case CSMNPackage.MATERIAL_CHARACTERISTIC__MATERIAL_TYPE:
				return materialType != null && !materialType.isEmpty();
			case CSMNPackage.MATERIAL_CHARACTERISTIC__OTHER_MATERIAL_TYPE:
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
		result.append(" (otherMaterialType: ");
		result.append(otherMaterialType);
		result.append(')');
		return result.toString();
	}

} //MaterialCharacteristicImpl
