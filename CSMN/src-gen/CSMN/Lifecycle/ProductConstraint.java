/**
 */
package CSMN.Lifecycle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CSMN.Lifecycle.ProductConstraint#getModel <em>Model</em>}</li>
 *   <li>{@link CSMN.Lifecycle.ProductConstraint#getSoftwareVersion <em>Software Version</em>}</li>
 * </ul>
 *
 * @see CSMN.Lifecycle.LifecyclePackage#getProductConstraint()
 * @model
 * @generated
 */
public interface ProductConstraint extends EObject {
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
	 * @see CSMN.Lifecycle.LifecyclePackage#getProductConstraint_Model()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link CSMN.Lifecycle.ProductConstraint#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

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
	 * @see CSMN.Lifecycle.LifecyclePackage#getProductConstraint_SoftwareVersion()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getSoftwareVersion();

} // ProductConstraint
