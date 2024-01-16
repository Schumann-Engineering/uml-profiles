/**
 */
package engineering.schumann.uml.profile.csmn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Dependency;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.Connection#getBase_Dependency <em>Base Dependency</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.Connection#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.Connection#getDirectionPrimary <em>Direction Primary</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.Connection#getDirectionType <em>Direction Type</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.Connection#getFlowToClient <em>Flow To Client</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.Connection#getFlowToSupplier <em>Flow To Supplier</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.Connection#isRealTime <em>Is Real Time</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.Connection#getPurpose <em>Purpose</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Dependency</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Dependency</em>' reference.
	 * @see #setBase_Dependency(Dependency)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getConnection_Base_Dependency()
	 * @model ordered="false"
	 * @generated
	 */
	Dependency getBase_Dependency();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.Connection#getBase_Dependency <em>Base Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Dependency</em>' reference.
	 * @see #getBase_Dependency()
	 * @generated
	 */
	void setBase_Dependency(Dependency value);

	/**
	 * Returns the value of the '<em><b>Connection Type</b></em>' attribute.
	 * The default value is <code>"Information"</code>.
	 * The literals are from the enumeration {@link engineering.schumann.uml.profile.csmn.ConnectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Type</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.ConnectionType
	 * @see #setConnectionType(ConnectionType)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getConnection_ConnectionType()
	 * @model default="Information" required="true" ordered="false"
	 * @generated
	 */
	ConnectionType getConnectionType();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.Connection#getConnectionType <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Type</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.ConnectionType
	 * @see #getConnectionType()
	 * @generated
	 */
	void setConnectionType(ConnectionType value);

	/**
	 * Returns the value of the '<em><b>Direction Primary</b></em>' attribute.
	 * The default value is <code>"Client"</code>.
	 * The literals are from the enumeration {@link engineering.schumann.uml.profile.csmn.DirectionOfPrimaryFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Primary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Primary</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.DirectionOfPrimaryFlow
	 * @see #setDirectionPrimary(DirectionOfPrimaryFlow)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getConnection_DirectionPrimary()
	 * @model default="Client" required="true" ordered="false"
	 * @generated
	 */
	DirectionOfPrimaryFlow getDirectionPrimary();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.Connection#getDirectionPrimary <em>Direction Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Primary</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.DirectionOfPrimaryFlow
	 * @see #getDirectionPrimary()
	 * @generated
	 */
	void setDirectionPrimary(DirectionOfPrimaryFlow value);

	/**
	 * Returns the value of the '<em><b>Direction Type</b></em>' attribute.
	 * The literals are from the enumeration {@link engineering.schumann.uml.profile.csmn.DirectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Type</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.DirectionType
	 * @see #setDirectionType(DirectionType)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getConnection_DirectionType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DirectionType getDirectionType();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.Connection#getDirectionType <em>Direction Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction Type</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.DirectionType
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
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getConnection_FlowToClient()
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
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getConnection_FlowToSupplier()
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
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getConnection_IsRealTime()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isRealTime();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.Connection#isRealTime <em>Is Real Time</em>}' attribute.
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
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getConnection_Purpose()
	 * @model ordered="false"
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.Connection#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

} // Connection
