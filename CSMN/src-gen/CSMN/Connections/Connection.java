/**
 */
package CSMN.Connections;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.DirectedRelationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CSMN.Connections.Connection#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link CSMN.Connections.Connection#getDirectionPrimary <em>Direction Primary</em>}</li>
 *   <li>{@link CSMN.Connections.Connection#getDirectionType <em>Direction Type</em>}</li>
 *   <li>{@link CSMN.Connections.Connection#getFlowToClient <em>Flow To Client</em>}</li>
 *   <li>{@link CSMN.Connections.Connection#getFlowToSupplier <em>Flow To Supplier</em>}</li>
 *   <li>{@link CSMN.Connections.Connection#isRealTime <em>Is Real Time</em>}</li>
 *   <li>{@link CSMN.Connections.Connection#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link CSMN.Connections.Connection#getBase_DirectedRelationship <em>Base Directed Relationship</em>}</li>
 * </ul>
 *
 * @see CSMN.Connections.ConnectionsPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Connection Type</b></em>' attribute.
	 * The default value is <code>"Information"</code>.
	 * The literals are from the enumeration {@link CSMN.Connections.ConnectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Type</em>' attribute.
	 * @see CSMN.Connections.ConnectionType
	 * @see #setConnectionType(ConnectionType)
	 * @see CSMN.Connections.ConnectionsPackage#getConnection_ConnectionType()
	 * @model default="Information" required="true" ordered="false"
	 * @generated
	 */
	ConnectionType getConnectionType();

	/**
	 * Sets the value of the '{@link CSMN.Connections.Connection#getConnectionType <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Type</em>' attribute.
	 * @see CSMN.Connections.ConnectionType
	 * @see #getConnectionType()
	 * @generated
	 */
	void setConnectionType(ConnectionType value);

	/**
	 * Returns the value of the '<em><b>Direction Primary</b></em>' attribute.
	 * The default value is <code>"Client"</code>.
	 * The literals are from the enumeration {@link CSMN.Connections.DirectionOfPrimaryFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Primary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Primary</em>' attribute.
	 * @see CSMN.Connections.DirectionOfPrimaryFlow
	 * @see #setDirectionPrimary(DirectionOfPrimaryFlow)
	 * @see CSMN.Connections.ConnectionsPackage#getConnection_DirectionPrimary()
	 * @model default="Client" required="true" ordered="false"
	 * @generated
	 */
	DirectionOfPrimaryFlow getDirectionPrimary();

	/**
	 * Sets the value of the '{@link CSMN.Connections.Connection#getDirectionPrimary <em>Direction Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Primary</em>' attribute.
	 * @see CSMN.Connections.DirectionOfPrimaryFlow
	 * @see #getDirectionPrimary()
	 * @generated
	 */
	void setDirectionPrimary(DirectionOfPrimaryFlow value);

	/**
	 * Returns the value of the '<em><b>Direction Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CSMN.Connections.DirectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Type</em>' attribute.
	 * @see CSMN.Connections.DirectionType
	 * @see #setDirectionType(DirectionType)
	 * @see CSMN.Connections.ConnectionsPackage#getConnection_DirectionType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DirectionType getDirectionType();

	/**
	 * Sets the value of the '{@link CSMN.Connections.Connection#getDirectionType <em>Direction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Type</em>' attribute.
	 * @see CSMN.Connections.DirectionType
	 * @see #getDirectionType()
	 * @generated
	 */
	void setDirectionType(DirectionType value);

	/**
	 * Returns the value of the '<em><b>Flow To Client</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow To Client</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow To Client</em>' reference list.
	 * @see CSMN.Connections.ConnectionsPackage#getConnection_FlowToClient()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DataType> getFlowToClient();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.DataType} with the specified '<em><b>Name</b></em>' from the '<em><b>Flow To Client</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.DataType} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.DataType} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFlowToClient()
	 * @generated
	 */
	DataType getFlowToClient(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.DataType} with the specified '<em><b>Name</b></em>' from the '<em><b>Flow To Client</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.DataType} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.DataType} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.DataType} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFlowToClient()
	 * @generated
	 */
	DataType getFlowToClient(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Flow To Supplier</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow To Supplier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow To Supplier</em>' reference list.
	 * @see CSMN.Connections.ConnectionsPackage#getConnection_FlowToSupplier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DataType> getFlowToSupplier();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.DataType} with the specified '<em><b>Name</b></em>' from the '<em><b>Flow To Supplier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.DataType} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.DataType} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFlowToSupplier()
	 * @generated
	 */
	DataType getFlowToSupplier(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.DataType} with the specified '<em><b>Name</b></em>' from the '<em><b>Flow To Supplier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.DataType} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.DataType} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.DataType} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFlowToSupplier()
	 * @generated
	 */
	DataType getFlowToSupplier(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Is Real Time</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Real Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Real Time</em>' attribute.
	 * @see #setIsRealTime(boolean)
	 * @see CSMN.Connections.ConnectionsPackage#getConnection_IsRealTime()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isRealTime();

	/**
	 * Sets the value of the '{@link CSMN.Connections.Connection#isRealTime <em>Is Real Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Real Time</em>' attribute.
	 * @see #isRealTime()
	 * @generated
	 */
	void setIsRealTime(boolean value);

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see CSMN.Connections.ConnectionsPackage#getConnection_Purpose()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link CSMN.Connections.Connection#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Base Directed Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Directed Relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Directed Relationship</em>' reference.
	 * @see #setBase_DirectedRelationship(DirectedRelationship)
	 * @see CSMN.Connections.ConnectionsPackage#getConnection_Base_DirectedRelationship()
	 * @model ordered="false"
	 * @generated
	 */
	DirectedRelationship getBase_DirectedRelationship();

	/**
	 * Sets the value of the '{@link CSMN.Connections.Connection#getBase_DirectedRelationship <em>Base Directed Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Directed Relationship</em>' reference.
	 * @see #getBase_DirectedRelationship()
	 * @generated
	 */
	void setBase_DirectedRelationship(DirectedRelationship value);

} // Connection
