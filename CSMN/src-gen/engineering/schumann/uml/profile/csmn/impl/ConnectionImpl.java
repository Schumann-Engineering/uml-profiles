/**
 */
package engineering.schumann.uml.profile.csmn.impl;

import engineering.schumann.uml.profile.csmn.CSMNPackage;
import engineering.schumann.uml.profile.csmn.Connection;
import engineering.schumann.uml.profile.csmn.ConnectionType;
import engineering.schumann.uml.profile.csmn.DirectionOfPrimaryFlow;
import engineering.schumann.uml.profile.csmn.DirectionType;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.ConnectionImpl#getBase_Dependency <em>Base Dependency</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.ConnectionImpl#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.ConnectionImpl#getDirectionPrimary <em>Direction Primary</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.ConnectionImpl#getDirectionType <em>Direction Type</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.ConnectionImpl#getFlowToClient <em>Flow To Client</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.ConnectionImpl#getFlowToSupplier <em>Flow To Supplier</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.ConnectionImpl#isRealTime <em>Is Real Time</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.ConnectionImpl#getPurpose <em>Purpose</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
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
	 * The default value of the '{@link #getConnectionType() <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionType()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectionType CONNECTION_TYPE_EDEFAULT = ConnectionType.INFORMATION;

	/**
	 * The cached value of the '{@link #getConnectionType() <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionType()
	 * @generated
	 * @ordered
	 */
	protected ConnectionType connectionType = CONNECTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirectionPrimary() <em>Direction Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionPrimary()
	 * @generated
	 * @ordered
	 */
	protected static final DirectionOfPrimaryFlow DIRECTION_PRIMARY_EDEFAULT = DirectionOfPrimaryFlow.CLIENT;

	/**
	 * The cached value of the '{@link #getDirectionPrimary() <em>Direction Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionPrimary()
	 * @generated
	 * @ordered
	 */
	protected DirectionOfPrimaryFlow directionPrimary = DIRECTION_PRIMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirectionType() <em>Direction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionType()
	 * @generated
	 * @ordered
	 */
	protected static final DirectionType DIRECTION_TYPE_EDEFAULT = DirectionType.UNI_DIRECTIONAL;

	/**
	 * The cached value of the '{@link #getDirectionType() <em>Direction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionType()
	 * @generated
	 * @ordered
	 */
	protected DirectionType directionType = DIRECTION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFlowToClient() <em>Flow To Client</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowToClient()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> flowToClient;

	/**
	 * The cached value of the '{@link #getFlowToSupplier() <em>Flow To Supplier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowToSupplier()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> flowToSupplier;

	/**
	 * The default value of the '{@link #isRealTime() <em>Is Real Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRealTime()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REAL_TIME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRealTime() <em>Is Real Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRealTime()
	 * @generated
	 * @ordered
	 */
	protected boolean isRealTime = IS_REAL_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMNPackage.Literals.CONNECTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CSMNPackage.CONNECTION__BASE_DEPENDENCY, oldBase_Dependency, base_Dependency));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.CONNECTION__BASE_DEPENDENCY, oldBase_Dependency, base_Dependency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConnectionType getConnectionType() {
		return connectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConnectionType(ConnectionType newConnectionType) {
		ConnectionType oldConnectionType = connectionType;
		connectionType = newConnectionType == null ? CONNECTION_TYPE_EDEFAULT : newConnectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.CONNECTION__CONNECTION_TYPE, oldConnectionType, connectionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectionOfPrimaryFlow getDirectionPrimary() {
		return directionPrimary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirectionPrimary(DirectionOfPrimaryFlow newDirectionPrimary) {
		DirectionOfPrimaryFlow oldDirectionPrimary = directionPrimary;
		directionPrimary = newDirectionPrimary == null ? DIRECTION_PRIMARY_EDEFAULT : newDirectionPrimary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.CONNECTION__DIRECTION_PRIMARY, oldDirectionPrimary, directionPrimary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectionType getDirectionType() {
		return directionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirectionType(DirectionType newDirectionType) {
		DirectionType oldDirectionType = directionType;
		directionType = newDirectionType == null ? DIRECTION_TYPE_EDEFAULT : newDirectionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.CONNECTION__DIRECTION_TYPE, oldDirectionType, directionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataType> getFlowToClient() {
		if (flowToClient == null) {
			flowToClient = new EObjectResolvingEList<DataType>(DataType.class, this, CSMNPackage.CONNECTION__FLOW_TO_CLIENT);
		}
		return flowToClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getFlowToClient(String name) {
		return getFlowToClient(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getFlowToClient(String name, boolean ignoreCase, EClass eClass) {
		flowToClientLoop: for (DataType flowToClient : getFlowToClient()) {
			if (eClass != null && !eClass.isInstance(flowToClient))
				continue flowToClientLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(flowToClient.getName()) : name.equals(flowToClient.getName())))
				continue flowToClientLoop;
			return flowToClient;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataType> getFlowToSupplier() {
		if (flowToSupplier == null) {
			flowToSupplier = new EObjectResolvingEList<DataType>(DataType.class, this, CSMNPackage.CONNECTION__FLOW_TO_SUPPLIER);
		}
		return flowToSupplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getFlowToSupplier(String name) {
		return getFlowToSupplier(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getFlowToSupplier(String name, boolean ignoreCase, EClass eClass) {
		flowToSupplierLoop: for (DataType flowToSupplier : getFlowToSupplier()) {
			if (eClass != null && !eClass.isInstance(flowToSupplier))
				continue flowToSupplierLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(flowToSupplier.getName()) : name.equals(flowToSupplier.getName())))
				continue flowToSupplierLoop;
			return flowToSupplier;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRealTime() {
		return isRealTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsRealTime(boolean newIsRealTime) {
		boolean oldIsRealTime = isRealTime;
		isRealTime = newIsRealTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.CONNECTION__IS_REAL_TIME, oldIsRealTime, isRealTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.CONNECTION__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMNPackage.CONNECTION__BASE_DEPENDENCY:
				if (resolve) return getBase_Dependency();
				return basicGetBase_Dependency();
			case CSMNPackage.CONNECTION__CONNECTION_TYPE:
				return getConnectionType();
			case CSMNPackage.CONNECTION__DIRECTION_PRIMARY:
				return getDirectionPrimary();
			case CSMNPackage.CONNECTION__DIRECTION_TYPE:
				return getDirectionType();
			case CSMNPackage.CONNECTION__FLOW_TO_CLIENT:
				return getFlowToClient();
			case CSMNPackage.CONNECTION__FLOW_TO_SUPPLIER:
				return getFlowToSupplier();
			case CSMNPackage.CONNECTION__IS_REAL_TIME:
				return isRealTime();
			case CSMNPackage.CONNECTION__PURPOSE:
				return getPurpose();
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
			case CSMNPackage.CONNECTION__BASE_DEPENDENCY:
				setBase_Dependency((Dependency)newValue);
				return;
			case CSMNPackage.CONNECTION__CONNECTION_TYPE:
				setConnectionType((ConnectionType)newValue);
				return;
			case CSMNPackage.CONNECTION__DIRECTION_PRIMARY:
				setDirectionPrimary((DirectionOfPrimaryFlow)newValue);
				return;
			case CSMNPackage.CONNECTION__DIRECTION_TYPE:
				setDirectionType((DirectionType)newValue);
				return;
			case CSMNPackage.CONNECTION__FLOW_TO_CLIENT:
				getFlowToClient().clear();
				getFlowToClient().addAll((Collection<? extends DataType>)newValue);
				return;
			case CSMNPackage.CONNECTION__FLOW_TO_SUPPLIER:
				getFlowToSupplier().clear();
				getFlowToSupplier().addAll((Collection<? extends DataType>)newValue);
				return;
			case CSMNPackage.CONNECTION__IS_REAL_TIME:
				setIsRealTime((Boolean)newValue);
				return;
			case CSMNPackage.CONNECTION__PURPOSE:
				setPurpose((String)newValue);
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
			case CSMNPackage.CONNECTION__BASE_DEPENDENCY:
				setBase_Dependency((Dependency)null);
				return;
			case CSMNPackage.CONNECTION__CONNECTION_TYPE:
				setConnectionType(CONNECTION_TYPE_EDEFAULT);
				return;
			case CSMNPackage.CONNECTION__DIRECTION_PRIMARY:
				setDirectionPrimary(DIRECTION_PRIMARY_EDEFAULT);
				return;
			case CSMNPackage.CONNECTION__DIRECTION_TYPE:
				setDirectionType(DIRECTION_TYPE_EDEFAULT);
				return;
			case CSMNPackage.CONNECTION__FLOW_TO_CLIENT:
				getFlowToClient().clear();
				return;
			case CSMNPackage.CONNECTION__FLOW_TO_SUPPLIER:
				getFlowToSupplier().clear();
				return;
			case CSMNPackage.CONNECTION__IS_REAL_TIME:
				setIsRealTime(IS_REAL_TIME_EDEFAULT);
				return;
			case CSMNPackage.CONNECTION__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
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
			case CSMNPackage.CONNECTION__BASE_DEPENDENCY:
				return base_Dependency != null;
			case CSMNPackage.CONNECTION__CONNECTION_TYPE:
				return connectionType != CONNECTION_TYPE_EDEFAULT;
			case CSMNPackage.CONNECTION__DIRECTION_PRIMARY:
				return directionPrimary != DIRECTION_PRIMARY_EDEFAULT;
			case CSMNPackage.CONNECTION__DIRECTION_TYPE:
				return directionType != DIRECTION_TYPE_EDEFAULT;
			case CSMNPackage.CONNECTION__FLOW_TO_CLIENT:
				return flowToClient != null && !flowToClient.isEmpty();
			case CSMNPackage.CONNECTION__FLOW_TO_SUPPLIER:
				return flowToSupplier != null && !flowToSupplier.isEmpty();
			case CSMNPackage.CONNECTION__IS_REAL_TIME:
				return isRealTime != IS_REAL_TIME_EDEFAULT;
			case CSMNPackage.CONNECTION__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
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
		result.append(" (connectionType: ");
		result.append(connectionType);
		result.append(", directionPrimary: ");
		result.append(directionPrimary);
		result.append(", directionType: ");
		result.append(directionType);
		result.append(", isRealTime: ");
		result.append(isRealTime);
		result.append(", purpose: ");
		result.append(purpose);
		result.append(')');
		return result.toString();
	}

} //ConnectionImpl
