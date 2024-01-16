/**
 */
package engineering.schumann.uml.profile.csmn;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.AccessCharacteristic#getBase_NamedElement <em>Base Named Element</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.AccessCharacteristic#getFunctionalLevel <em>Functional Level</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.AccessCharacteristic#getFunctionalSpec <em>Functional Spec</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.AccessCharacteristic#getMechanicalLevel <em>Mechanical Level</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.AccessCharacteristic#getMechanicalSpec <em>Mechanical Spec</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getAccessCharacteristic()
 * @model
 * @generated
 */
public interface AccessCharacteristic extends EObject {
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
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getAccessCharacteristic_Base_NamedElement()
	 * @model ordered="false"
	 * @generated
	 */
	NamedElement getBase_NamedElement();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.AccessCharacteristic#getBase_NamedElement <em>Base Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Named Element</em>' reference.
	 * @see #getBase_NamedElement()
	 * @generated
	 */
	void setBase_NamedElement(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Functional Level</b></em>' attribute.
	 * The literals are from the enumeration {@link engineering.schumann.uml.profile.csmn.FunctionalAccessLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Level</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.FunctionalAccessLevel
	 * @see #setFunctionalLevel(FunctionalAccessLevel)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getAccessCharacteristic_FunctionalLevel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FunctionalAccessLevel getFunctionalLevel();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.AccessCharacteristic#getFunctionalLevel <em>Functional Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Level</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.FunctionalAccessLevel
	 * @see #getFunctionalLevel()
	 * @generated
	 */
	void setFunctionalLevel(FunctionalAccessLevel value);

	/**
	 * Returns the value of the '<em><b>Functional Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional Spec</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Spec</em>' attribute.
	 * @see #setFunctionalSpec(String)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getAccessCharacteristic_FunctionalSpec()
	 * @model ordered="false"
	 * @generated
	 */
	String getFunctionalSpec();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.AccessCharacteristic#getFunctionalSpec <em>Functional Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Spec</em>' attribute.
	 * @see #getFunctionalSpec()
	 * @generated
	 */
	void setFunctionalSpec(String value);

	/**
	 * Returns the value of the '<em><b>Mechanical Level</b></em>' attribute.
	 * The literals are from the enumeration {@link engineering.schumann.uml.profile.csmn.MechanicalAccessLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mechanical Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mechanical Level</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.MechanicalAccessLevel
	 * @see #setMechanicalLevel(MechanicalAccessLevel)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getAccessCharacteristic_MechanicalLevel()
	 * @model ordered="false"
	 * @generated
	 */
	MechanicalAccessLevel getMechanicalLevel();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.AccessCharacteristic#getMechanicalLevel <em>Mechanical Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mechanical Level</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.MechanicalAccessLevel
	 * @see #getMechanicalLevel()
	 * @generated
	 */
	void setMechanicalLevel(MechanicalAccessLevel value);

	/**
	 * Returns the value of the '<em><b>Mechanical Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mechanical Spec</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mechanical Spec</em>' attribute.
	 * @see #setMechanicalSpec(String)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getAccessCharacteristic_MechanicalSpec()
	 * @model ordered="false"
	 * @generated
	 */
	String getMechanicalSpec();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.AccessCharacteristic#getMechanicalSpec <em>Mechanical Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mechanical Spec</em>' attribute.
	 * @see #getMechanicalSpec()
	 * @generated
	 */
	void setMechanicalSpec(String value);

} // AccessCharacteristic
