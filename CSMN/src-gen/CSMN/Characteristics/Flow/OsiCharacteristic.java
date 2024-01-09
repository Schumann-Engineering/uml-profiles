/**
 */
package CSMN.Characteristics.Flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Osi Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CSMN.Characteristics.Flow.OsiCharacteristic#getApplication <em>Application</em>}</li>
 *   <li>{@link CSMN.Characteristics.Flow.OsiCharacteristic#getPresentation <em>Presentation</em>}</li>
 *   <li>{@link CSMN.Characteristics.Flow.OsiCharacteristic#getSession <em>Session</em>}</li>
 *   <li>{@link CSMN.Characteristics.Flow.OsiCharacteristic#getTransport <em>Transport</em>}</li>
 *   <li>{@link CSMN.Characteristics.Flow.OsiCharacteristic#getNetwork <em>Network</em>}</li>
 *   <li>{@link CSMN.Characteristics.Flow.OsiCharacteristic#getDataLink <em>Data Link</em>}</li>
 *   <li>{@link CSMN.Characteristics.Flow.OsiCharacteristic#getPhysical <em>Physical</em>}</li>
 * </ul>
 *
 * @see CSMN.Characteristics.Flow.FlowPackage#getOsiCharacteristic()
 * @model
 * @generated
 */
public interface OsiCharacteristic extends FlowCharacteristic {
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
	 * @see CSMN.Characteristics.Flow.FlowPackage#getOsiCharacteristic_Application()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getApplication();

	/**
	 * Sets the value of the '{@link CSMN.Characteristics.Flow.OsiCharacteristic#getApplication <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' attribute.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(String value);

	/**
	 * Returns the value of the '<em><b>Presentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation</em>' attribute.
	 * @see #setPresentation(String)
	 * @see CSMN.Characteristics.Flow.FlowPackage#getOsiCharacteristic_Presentation()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getPresentation();

	/**
	 * Sets the value of the '{@link CSMN.Characteristics.Flow.OsiCharacteristic#getPresentation <em>Presentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation</em>' attribute.
	 * @see #getPresentation()
	 * @generated
	 */
	void setPresentation(String value);

	/**
	 * Returns the value of the '<em><b>Session</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session</em>' attribute.
	 * @see #setSession(String)
	 * @see CSMN.Characteristics.Flow.FlowPackage#getOsiCharacteristic_Session()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getSession();

	/**
	 * Sets the value of the '{@link CSMN.Characteristics.Flow.OsiCharacteristic#getSession <em>Session</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session</em>' attribute.
	 * @see #getSession()
	 * @generated
	 */
	void setSession(String value);

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
	 * @see CSMN.Characteristics.Flow.FlowPackage#getOsiCharacteristic_Transport()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getTransport();

	/**
	 * Sets the value of the '{@link CSMN.Characteristics.Flow.OsiCharacteristic#getTransport <em>Transport</em>}' attribute.
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
	 * @see CSMN.Characteristics.Flow.FlowPackage#getOsiCharacteristic_Network()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getNetwork();

	/**
	 * Sets the value of the '{@link CSMN.Characteristics.Flow.OsiCharacteristic#getNetwork <em>Network</em>}' attribute.
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
	 * @see CSMN.Characteristics.Flow.FlowPackage#getOsiCharacteristic_DataLink()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDataLink();

	/**
	 * Sets the value of the '{@link CSMN.Characteristics.Flow.OsiCharacteristic#getDataLink <em>Data Link</em>}' attribute.
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
	 * @see CSMN.Characteristics.Flow.FlowPackage#getOsiCharacteristic_Physical()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPhysical();

	/**
	 * Sets the value of the '{@link CSMN.Characteristics.Flow.OsiCharacteristic#getPhysical <em>Physical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical</em>' attribute.
	 * @see #getPhysical()
	 * @generated
	 */
	void setPhysical(String value);

} // OsiCharacteristic
