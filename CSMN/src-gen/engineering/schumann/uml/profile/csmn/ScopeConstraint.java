/**
 */
package engineering.schumann.uml.profile.csmn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.ScopeConstraint#getBase_NamedElement <em>Base Named Element</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.ScopeConstraint#getProductConstraint <em>Product Constraint</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.ScopeConstraint#getConstraintType <em>Constraint Type</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.ScopeConstraint#getSoftwareConstraint <em>Software Constraint</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getScopeConstraint()
 * @model
 * @generated
 */
public interface ScopeConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Named Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Named Element</em>' reference.
	 * @see #setBase_NamedElement(NamedElement)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getScopeConstraint_Base_NamedElement()
	 * @model ordered="false"
	 * @generated
	 */
	NamedElement getBase_NamedElement();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.ScopeConstraint#getBase_NamedElement <em>Base Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Named Element</em>' reference.
	 * @see #getBase_NamedElement()
	 * @generated
	 */
	void setBase_NamedElement(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Product Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link engineering.schumann.uml.profile.csmn.ProductConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Constraint</em>' containment reference list.
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getScopeConstraint_ProductConstraint()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ProductConstraint> getProductConstraint();

	/**
	 * Returns the value of the '<em><b>Constraint Type</b></em>' attribute.
	 * The default value is <code>"Added"</code>.
	 * The literals are from the enumeration {@link engineering.schumann.uml.profile.csmn.ScopeConstraintType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Type</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.ScopeConstraintType
	 * @see #setConstraintType(ScopeConstraintType)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getScopeConstraint_ConstraintType()
	 * @model default="Added" required="true" ordered="false"
	 * @generated
	 */
	ScopeConstraintType getConstraintType();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.ScopeConstraint#getConstraintType <em>Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Type</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.ScopeConstraintType
	 * @see #getConstraintType()
	 * @generated
	 */
	void setConstraintType(ScopeConstraintType value);

	/**
	 * Returns the value of the '<em><b>Software Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link engineering.schumann.uml.profile.csmn.SoftwareConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Constraint</em>' containment reference list.
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getScopeConstraint_SoftwareConstraint()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SoftwareConstraint> getSoftwareConstraint();

} // ScopeConstraint
