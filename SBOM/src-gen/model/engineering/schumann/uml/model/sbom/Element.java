/**
 */
package engineering.schumann.uml.model.sbom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.model.sbom.Element#getId <em>Id</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.Element#getReference <em>Reference</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.Element#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.Element#getOwnedProperty <em>Owned Property</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getElement_Id()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.model.sbom.Element#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' attribute list.
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getElement_Reference()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getReference();

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(String)
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getElement_Timestamp()
	 * @model ordered="false"
	 * @generated
	 */
	String getTimestamp();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.model.sbom.Element#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(String value);

	/**
	 * Returns the value of the '<em><b>Owned Property</b></em>' containment reference list.
	 * The list contents are of type {@link engineering.schumann.uml.model.sbom.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Property</em>' containment reference list.
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getElement_OwnedProperty()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Property> getOwnedProperty();

} // Element
