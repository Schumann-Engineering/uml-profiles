/**
 */
package CSMN.Lifecycle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CSMN.Lifecycle.Product#getName <em>Name</em>}</li>
 *   <li>{@link CSMN.Lifecycle.Product#getModel <em>Model</em>}</li>
 *   <li>{@link CSMN.Lifecycle.Product#getUdiDi <em>Udi Di</em>}</li>
 *   <li>{@link CSMN.Lifecycle.Product#getUdiDiBase <em>Udi Di Base</em>}</li>
 *   <li>{@link CSMN.Lifecycle.Product#getSoftwareVersion <em>Software Version</em>}</li>
 * </ul>
 *
 * @see CSMN.Lifecycle.LifecyclePackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see CSMN.Lifecycle.LifecyclePackage#getProduct_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CSMN.Lifecycle.Product#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see CSMN.Lifecycle.LifecyclePackage#getProduct_Model()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link CSMN.Lifecycle.Product#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Udi Di</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Udi Di</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Udi Di</em>' attribute.
	 * @see #setUdiDi(String)
	 * @see CSMN.Lifecycle.LifecyclePackage#getProduct_UdiDi()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getUdiDi();

	/**
	 * Sets the value of the '{@link CSMN.Lifecycle.Product#getUdiDi <em>Udi Di</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Udi Di</em>' attribute.
	 * @see #getUdiDi()
	 * @generated
	 */
	void setUdiDi(String value);

	/**
	 * Returns the value of the '<em><b>Udi Di Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Udi Di Base</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Udi Di Base</em>' attribute.
	 * @see #setUdiDiBase(String)
	 * @see CSMN.Lifecycle.LifecyclePackage#getProduct_UdiDiBase()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getUdiDiBase();

	/**
	 * Sets the value of the '{@link CSMN.Lifecycle.Product#getUdiDiBase <em>Udi Di Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Udi Di Base</em>' attribute.
	 * @see #getUdiDiBase()
	 * @generated
	 */
	void setUdiDiBase(String value);

	/**
	 * Returns the value of the '<em><b>Software Version</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Version</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Version</em>' attribute list.
	 * @see CSMN.Lifecycle.LifecyclePackage#getProduct_SoftwareVersion()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getSoftwareVersion();

} // Product
