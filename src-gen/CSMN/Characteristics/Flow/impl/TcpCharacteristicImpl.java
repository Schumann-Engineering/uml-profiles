/**
 */
package CSMN.Characteristics.Flow.impl;

import CSMN.Characteristics.Flow.FlowPackage;
import CSMN.Characteristics.Flow.TcpCharacteristic;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tcp Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CSMN.Characteristics.Flow.impl.TcpCharacteristicImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link CSMN.Characteristics.Flow.impl.TcpCharacteristicImpl#getTransport <em>Transport</em>}</li>
 *   <li>{@link CSMN.Characteristics.Flow.impl.TcpCharacteristicImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link CSMN.Characteristics.Flow.impl.TcpCharacteristicImpl#getDataLink <em>Data Link</em>}</li>
 *   <li>{@link CSMN.Characteristics.Flow.impl.TcpCharacteristicImpl#getPhysical <em>Physical</em>}</li>
 *   <li>{@link CSMN.Characteristics.Flow.impl.TcpCharacteristicImpl#getMechanical <em>Mechanical</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TcpCharacteristicImpl extends FlowCharacteristicImpl implements TcpCharacteristic {
	/**
	 * The default value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected String application = APPLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransport() <em>Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransport()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransport() <em>Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransport()
	 * @generated
	 * @ordered
	 */
	protected String transport = TRANSPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNetwork() <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected String network = NETWORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataLink() <em>Data Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataLink()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_LINK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataLink() <em>Data Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataLink()
	 * @generated
	 * @ordered
	 */
	protected String dataLink = DATA_LINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhysical() <em>Physical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysical()
	 * @generated
	 * @ordered
	 */
	protected static final String PHYSICAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysical() <em>Physical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysical()
	 * @generated
	 * @ordered
	 */
	protected String physical = PHYSICAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMechanical() <em>Mechanical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanical()
	 * @generated
	 * @ordered
	 */
	protected static final String MECHANICAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMechanical() <em>Mechanical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMechanical()
	 * @generated
	 * @ordered
	 */
	protected String mechanical = MECHANICAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TcpCharacteristicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.TCP_CHARACTERISTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplication(String newApplication) {
		String oldApplication = application;
		application = newApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.TCP_CHARACTERISTIC__APPLICATION, oldApplication, application));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTransport() {
		return transport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransport(String newTransport) {
		String oldTransport = transport;
		transport = newTransport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.TCP_CHARACTERISTIC__TRANSPORT, oldTransport, transport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetwork(String newNetwork) {
		String oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.TCP_CHARACTERISTIC__NETWORK, oldNetwork, network));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDataLink() {
		return dataLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataLink(String newDataLink) {
		String oldDataLink = dataLink;
		dataLink = newDataLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.TCP_CHARACTERISTIC__DATA_LINK, oldDataLink, dataLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPhysical() {
		return physical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysical(String newPhysical) {
		String oldPhysical = physical;
		physical = newPhysical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.TCP_CHARACTERISTIC__PHYSICAL, oldPhysical, physical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMechanical() {
		return mechanical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMechanical(String newMechanical) {
		String oldMechanical = mechanical;
		mechanical = newMechanical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.TCP_CHARACTERISTIC__MECHANICAL, oldMechanical, mechanical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlowPackage.TCP_CHARACTERISTIC__APPLICATION:
				return getApplication();
			case FlowPackage.TCP_CHARACTERISTIC__TRANSPORT:
				return getTransport();
			case FlowPackage.TCP_CHARACTERISTIC__NETWORK:
				return getNetwork();
			case FlowPackage.TCP_CHARACTERISTIC__DATA_LINK:
				return getDataLink();
			case FlowPackage.TCP_CHARACTERISTIC__PHYSICAL:
				return getPhysical();
			case FlowPackage.TCP_CHARACTERISTIC__MECHANICAL:
				return getMechanical();
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
			case FlowPackage.TCP_CHARACTERISTIC__APPLICATION:
				setApplication((String)newValue);
				return;
			case FlowPackage.TCP_CHARACTERISTIC__TRANSPORT:
				setTransport((String)newValue);
				return;
			case FlowPackage.TCP_CHARACTERISTIC__NETWORK:
				setNetwork((String)newValue);
				return;
			case FlowPackage.TCP_CHARACTERISTIC__DATA_LINK:
				setDataLink((String)newValue);
				return;
			case FlowPackage.TCP_CHARACTERISTIC__PHYSICAL:
				setPhysical((String)newValue);
				return;
			case FlowPackage.TCP_CHARACTERISTIC__MECHANICAL:
				setMechanical((String)newValue);
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
			case FlowPackage.TCP_CHARACTERISTIC__APPLICATION:
				setApplication(APPLICATION_EDEFAULT);
				return;
			case FlowPackage.TCP_CHARACTERISTIC__TRANSPORT:
				setTransport(TRANSPORT_EDEFAULT);
				return;
			case FlowPackage.TCP_CHARACTERISTIC__NETWORK:
				setNetwork(NETWORK_EDEFAULT);
				return;
			case FlowPackage.TCP_CHARACTERISTIC__DATA_LINK:
				setDataLink(DATA_LINK_EDEFAULT);
				return;
			case FlowPackage.TCP_CHARACTERISTIC__PHYSICAL:
				setPhysical(PHYSICAL_EDEFAULT);
				return;
			case FlowPackage.TCP_CHARACTERISTIC__MECHANICAL:
				setMechanical(MECHANICAL_EDEFAULT);
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
			case FlowPackage.TCP_CHARACTERISTIC__APPLICATION:
				return APPLICATION_EDEFAULT == null ? application != null : !APPLICATION_EDEFAULT.equals(application);
			case FlowPackage.TCP_CHARACTERISTIC__TRANSPORT:
				return TRANSPORT_EDEFAULT == null ? transport != null : !TRANSPORT_EDEFAULT.equals(transport);
			case FlowPackage.TCP_CHARACTERISTIC__NETWORK:
				return NETWORK_EDEFAULT == null ? network != null : !NETWORK_EDEFAULT.equals(network);
			case FlowPackage.TCP_CHARACTERISTIC__DATA_LINK:
				return DATA_LINK_EDEFAULT == null ? dataLink != null : !DATA_LINK_EDEFAULT.equals(dataLink);
			case FlowPackage.TCP_CHARACTERISTIC__PHYSICAL:
				return PHYSICAL_EDEFAULT == null ? physical != null : !PHYSICAL_EDEFAULT.equals(physical);
			case FlowPackage.TCP_CHARACTERISTIC__MECHANICAL:
				return MECHANICAL_EDEFAULT == null ? mechanical != null : !MECHANICAL_EDEFAULT.equals(mechanical);
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
		result.append(" (application: ");
		result.append(application);
		result.append(", transport: ");
		result.append(transport);
		result.append(", network: ");
		result.append(network);
		result.append(", dataLink: ");
		result.append(dataLink);
		result.append(", physical: ");
		result.append(physical);
		result.append(", mechanical: ");
		result.append(mechanical);
		result.append(')');
		return result.toString();
	}

} //TcpCharacteristicImpl
