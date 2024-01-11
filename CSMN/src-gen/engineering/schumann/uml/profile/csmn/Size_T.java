/**
 */
package engineering.schumann.uml.profile.csmn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Size T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.Size_T#getSize <em>Size</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.Size_T#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getSize_T()
 * @model
 * @generated
 */
public interface Size_T extends EObject {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total size of the drive. See unit of measurement for more
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getSize_T_Size()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.Size_T#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The default value is <code>"Megabyte"</code>.
	 * The literals are from the enumeration {@link engineering.schumann.uml.profile.csmn.SizeUnitOfMeasure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.SizeUnitOfMeasure
	 * @see #setUnit(SizeUnitOfMeasure)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getSize_T_Unit()
	 * @model default="Megabyte" required="true" ordered="false"
	 * @generated
	 */
	SizeUnitOfMeasure getUnit();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.Size_T#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.SizeUnitOfMeasure
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(SizeUnitOfMeasure value);

} // Size_T
