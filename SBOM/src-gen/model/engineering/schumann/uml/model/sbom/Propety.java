/**
 */
package engineering.schumann.uml.model.sbom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propety</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.model.sbom.Propety#getKey <em>Key</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.Propety#getValue <em>Value</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.Propety#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getPropety()
 * @model
 * @generated
 */
public interface Propety extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getPropety_Key()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.model.sbom.Propety#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getPropety_Value()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.model.sbom.Propety#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getPropety_Type()
	 * @model ordered="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.model.sbom.Propety#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Propety
