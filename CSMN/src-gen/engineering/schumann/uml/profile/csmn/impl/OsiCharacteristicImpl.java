/**
 */
package engineering.schumann.uml.profile.csmn.impl;

import engineering.schumann.uml.profile.csmn.CSMNPackage;
import engineering.schumann.uml.profile.csmn.OsiCharacteristic;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Osi Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.OsiCharacteristicImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.OsiCharacteristicImpl#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.OsiCharacteristicImpl#getSession <em>Session</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.OsiCharacteristicImpl#getTransport <em>Transport</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.OsiCharacteristicImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.OsiCharacteristicImpl#getDataLink <em>Data Link</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.OsiCharacteristicImpl#getPhysical <em>Physical</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OsiCharacteristicImpl extends FlowCharacteristicImpl implements OsiCharacteristic {
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
	 * The default value of the '{@link #getPresentation() <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentation()
	 * @generated
	 * @ordered
	 */
	protected static final String PRESENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPresentation() <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentation()
	 * @generated
	 * @ordered
	 */
	protected String presentation = PRESENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSession() <em>Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSession()
	 * @generated
	 * @ordered
	 */
	protected static final String SESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSession() <em>Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSession()
	 * @generated
	 * @ordered
	 */
	protected String session = SESSION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OsiCharacteristicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMNPackage.Literals.OSI_CHARACTERISTIC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.OSI_CHARACTERISTIC__APPLICATION, oldApplication, application));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPresentation() {
		return presentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPresentation(String newPresentation) {
		String oldPresentation = presentation;
		presentation = newPresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.OSI_CHARACTERISTIC__PRESENTATION, oldPresentation, presentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSession() {
		return session;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSession(String newSession) {
		String oldSession = session;
		session = newSession;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.OSI_CHARACTERISTIC__SESSION, oldSession, session));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.OSI_CHARACTERISTIC__TRANSPORT, oldTransport, transport));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.OSI_CHARACTERISTIC__NETWORK, oldNetwork, network));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.OSI_CHARACTERISTIC__DATA_LINK, oldDataLink, dataLink));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.OSI_CHARACTERISTIC__PHYSICAL, oldPhysical, physical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMNPackage.OSI_CHARACTERISTIC__APPLICATION:
				return getApplication();
			case CSMNPackage.OSI_CHARACTERISTIC__PRESENTATION:
				return getPresentation();
			case CSMNPackage.OSI_CHARACTERISTIC__SESSION:
				return getSession();
			case CSMNPackage.OSI_CHARACTERISTIC__TRANSPORT:
				return getTransport();
			case CSMNPackage.OSI_CHARACTERISTIC__NETWORK:
				return getNetwork();
			case CSMNPackage.OSI_CHARACTERISTIC__DATA_LINK:
				return getDataLink();
			case CSMNPackage.OSI_CHARACTERISTIC__PHYSICAL:
				return getPhysical();
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
			case CSMNPackage.OSI_CHARACTERISTIC__APPLICATION:
				setApplication((String)newValue);
				return;
			case CSMNPackage.OSI_CHARACTERISTIC__PRESENTATION:
				setPresentation((String)newValue);
				return;
			case CSMNPackage.OSI_CHARACTERISTIC__SESSION:
				setSession((String)newValue);
				return;
			case CSMNPackage.OSI_CHARACTERISTIC__TRANSPORT:
				setTransport((String)newValue);
				return;
			case CSMNPackage.OSI_CHARACTERISTIC__NETWORK:
				setNetwork((String)newValue);
				return;
			case CSMNPackage.OSI_CHARACTERISTIC__DATA_LINK:
				setDataLink((String)newValue);
				return;
			case CSMNPackage.OSI_CHARACTERISTIC__PHYSICAL:
				setPhysical((String)newValue);
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
			case CSMNPackage.OSI_CHARACTERISTIC__APPLICATION:
				setApplication(APPLICATION_EDEFAULT);
				return;
			case CSMNPackage.OSI_CHARACTERISTIC__PRESENTATION:
				setPresentation(PRESENTATION_EDEFAULT);
				return;
			case CSMNPackage.OSI_CHARACTERISTIC__SESSION:
				setSession(SESSION_EDEFAULT);
				return;
			case CSMNPackage.OSI_CHARACTERISTIC__TRANSPORT:
				setTransport(TRANSPORT_EDEFAULT);
				return;
			case CSMNPackage.OSI_CHARACTERISTIC__NETWORK:
				setNetwork(NETWORK_EDEFAULT);
				return;
			case CSMNPackage.OSI_CHARACTERISTIC__DATA_LINK:
				setDataLink(DATA_LINK_EDEFAULT);
				return;
			case CSMNPackage.OSI_CHARACTERISTIC__PHYSICAL:
				setPhysical(PHYSICAL_EDEFAULT);
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
			case CSMNPackage.OSI_CHARACTERISTIC__APPLICATION:
				return APPLICATION_EDEFAULT == null ? application != null : !APPLICATION_EDEFAULT.equals(application);
			case CSMNPackage.OSI_CHARACTERISTIC__PRESENTATION:
				return PRESENTATION_EDEFAULT == null ? presentation != null : !PRESENTATION_EDEFAULT.equals(presentation);
			case CSMNPackage.OSI_CHARACTERISTIC__SESSION:
				return SESSION_EDEFAULT == null ? session != null : !SESSION_EDEFAULT.equals(session);
			case CSMNPackage.OSI_CHARACTERISTIC__TRANSPORT:
				return TRANSPORT_EDEFAULT == null ? transport != null : !TRANSPORT_EDEFAULT.equals(transport);
			case CSMNPackage.OSI_CHARACTERISTIC__NETWORK:
				return NETWORK_EDEFAULT == null ? network != null : !NETWORK_EDEFAULT.equals(network);
			case CSMNPackage.OSI_CHARACTERISTIC__DATA_LINK:
				return DATA_LINK_EDEFAULT == null ? dataLink != null : !DATA_LINK_EDEFAULT.equals(dataLink);
			case CSMNPackage.OSI_CHARACTERISTIC__PHYSICAL:
				return PHYSICAL_EDEFAULT == null ? physical != null : !PHYSICAL_EDEFAULT.equals(physical);
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
		result.append(", presentation: ");
		result.append(presentation);
		result.append(", session: ");
		result.append(session);
		result.append(", transport: ");
		result.append(transport);
		result.append(", network: ");
		result.append(network);
		result.append(", dataLink: ");
		result.append(dataLink);
		result.append(", physical: ");
		result.append(physical);
		result.append(')');
		return result.toString();
	}

} //OsiCharacteristicImpl
