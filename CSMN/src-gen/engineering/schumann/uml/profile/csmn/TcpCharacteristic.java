/**
 */
package engineering.schumann.uml.profile.csmn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tcp Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.TcpCharacteristic#getApplication <em>Application</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.TcpCharacteristic#getTransport <em>Transport</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.TcpCharacteristic#getNetwork <em>Network</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.TcpCharacteristic#getDataLink <em>Data Link</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.TcpCharacteristic#getPhysical <em>Physical</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.TcpCharacteristic#getMechanical <em>Mechanical</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getTcpCharacteristic()
 * @model
 * @generated
 */
public interface TcpCharacteristic extends FlowCharacteristic {
	/**
	 * Returns the value of the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' attribute.
	 * @see #setApplication(String)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getTcpCharacteristic_Application()
	 * @model ordered="false"
	 * @generated
	 */
	String getApplication();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.TcpCharacteristic#getApplication <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' attribute.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(String value);

	/**
	 * Returns the value of the '<em><b>Transport</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transport</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transport</em>' attribute.
	 * @see #setTransport(String)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getTcpCharacteristic_Transport()
	 * @model ordered="false"
	 * @generated
	 */
	String getTransport();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.TcpCharacteristic#getTransport <em>Transport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transport</em>' attribute.
	 * @see #getTransport()
	 * @generated
	 */
	void setTransport(String value);

	/**
	 * Returns the value of the '<em><b>Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' attribute.
	 * @see #setNetwork(String)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getTcpCharacteristic_Network()
	 * @model ordered="false"
	 * @generated
	 */
	String getNetwork();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.TcpCharacteristic#getNetwork <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' attribute.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(String value);

	/**
	 * Returns the value of the '<em><b>Data Link</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Link</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Link</em>' attribute.
	 * @see #setDataLink(String)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getTcpCharacteristic_DataLink()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDataLink();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.TcpCharacteristic#getDataLink <em>Data Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Link</em>' attribute.
	 * @see #getDataLink()
	 * @generated
	 */
	void setDataLink(String value);

	/**
	 * Returns the value of the '<em><b>Physical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical</em>' attribute.
	 * @see #setPhysical(String)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getTcpCharacteristic_Physical()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPhysical();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.TcpCharacteristic#getPhysical <em>Physical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical</em>' attribute.
	 * @see #getPhysical()
	 * @generated
	 */
	void setPhysical(String value);

	/**
	 * Returns the value of the '<em><b>Mechanical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mechanical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mechanical</em>' attribute.
	 * @see #setMechanical(String)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getTcpCharacteristic_Mechanical()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getMechanical();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.TcpCharacteristic#getMechanical <em>Mechanical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mechanical</em>' attribute.
	 * @see #getMechanical()
	 * @generated
	 */
	void setMechanical(String value);

} // TcpCharacteristic
