/**
 */
package CSMN.Lifecycle;

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
 *   <li>{@link CSMN.Lifecycle.ScopeConstraint#getBase_NamedElement <em>Base Named Element</em>}</li>
 *   <li>{@link CSMN.Lifecycle.ScopeConstraint#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link CSMN.Lifecycle.ScopeConstraint#getConstraintType <em>Constraint Type</em>}</li>
 * </ul>
 *
 * @see CSMN.Lifecycle.LifecyclePackage#getScopeConstraint()
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
	 * @see CSMN.Lifecycle.LifecyclePackage#getScopeConstraint_Base_NamedElement()
	 * @model ordered="false"
	 * @generated
	 */
	NamedElement getBase_NamedElement();

	/**
	 * Sets the value of the '{@link CSMN.Lifecycle.ScopeConstraint#getBase_NamedElement <em>Base Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Named Element</em>' reference.
	 * @see #getBase_NamedElement()
	 * @generated
	 */
	void setBase_NamedElement(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link CSMN.Lifecycle.ProductConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see CSMN.Lifecycle.LifecyclePackage#getScopeConstraint_Constraint()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ProductConstraint> getConstraint();

	/**
	 * Returns the value of the '<em><b>Constraint Type</b></em>' attribute.
	 * The default value is <code>"Added"</code>.
	 * The literals are from the enumeration {@link CSMN.Lifecycle.ScopeConstraintType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Type</em>' attribute.
	 * @see CSMN.Lifecycle.ScopeConstraintType
	 * @see #setConstraintType(ScopeConstraintType)
	 * @see CSMN.Lifecycle.LifecyclePackage#getScopeConstraint_ConstraintType()
	 * @model default="Added" required="true" ordered="false"
	 * @generated
	 */
	ScopeConstraintType getConstraintType();

	/**
	 * Sets the value of the '{@link CSMN.Lifecycle.ScopeConstraint#getConstraintType <em>Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Type</em>' attribute.
	 * @see CSMN.Lifecycle.ScopeConstraintType
	 * @see #getConstraintType()
	 * @generated
	 */
	void setConstraintType(ScopeConstraintType value);

} // ScopeConstraint
