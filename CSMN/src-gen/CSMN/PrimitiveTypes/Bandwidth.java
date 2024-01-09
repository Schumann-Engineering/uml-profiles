/**
 */
package CSMN.PrimitiveTypes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bandwidth</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CSMN.PrimitiveTypes.Bandwidth#getSize <em>Size</em>}</li>
 *   <li>{@link CSMN.PrimitiveTypes.Bandwidth#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see CSMN.PrimitiveTypes.PrimitiveTypesPackage#getBandwidth()
 * @model
 * @generated
 */
public interface Bandwidth extends EObject {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see CSMN.PrimitiveTypes.PrimitiveTypesPackage#getBandwidth_Size()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link CSMN.PrimitiveTypes.Bandwidth#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The default value is <code>"Baud"</code>.
	 * The literals are from the enumeration {@link CSMN.PrimitiveTypes.SpeedUnitOfMeasurement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see CSMN.PrimitiveTypes.SpeedUnitOfMeasurement
	 * @see #setUnit(SpeedUnitOfMeasurement)
	 * @see CSMN.PrimitiveTypes.PrimitiveTypesPackage#getBandwidth_Unit()
	 * @model default="Baud" required="true" ordered="false"
	 * @generated
	 */
	SpeedUnitOfMeasurement getUnit();

	/**
	 * Sets the value of the '{@link CSMN.PrimitiveTypes.Bandwidth#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see CSMN.PrimitiveTypes.SpeedUnitOfMeasurement
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(SpeedUnitOfMeasurement value);

} // Bandwidth
