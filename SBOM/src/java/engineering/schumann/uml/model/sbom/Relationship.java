/**
 */
package engineering.schumann.uml.model.sbom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.model.sbom.Relationship#getSource <em>Source</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.Relationship#getTarget <em>Target</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.Relationship#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(NamedElement)
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getRelationship_Source()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NamedElement getSource();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.model.sbom.Relationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(NamedElement)
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getRelationship_Target()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NamedElement getTarget();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.model.sbom.Relationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link engineering.schumann.uml.model.sbom.RelationshipType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see engineering.schumann.uml.model.sbom.RelationshipType
	 * @see #setType(RelationshipType)
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getRelationship_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RelationshipType getType();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.model.sbom.Relationship#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see engineering.schumann.uml.model.sbom.RelationshipType
	 * @see #getType()
	 * @generated
	 */
	void setType(RelationshipType value);

} // Relationship
