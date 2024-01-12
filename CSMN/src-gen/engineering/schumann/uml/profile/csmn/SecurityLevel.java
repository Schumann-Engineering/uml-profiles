/**
 */
package engineering.schumann.uml.profile.csmn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.SecurityLevel#getFoundationalRequirement <em>Foundational Requirement</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.SecurityLevel#getLevel <em>Level</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.SecurityLevel#getRational <em>Rational</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.SecurityLevel#getType <em>Type</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.SecurityLevel#getVector <em>Vector</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getSecurityLevel()
 * @model
 * @generated
 */
public interface SecurityLevel extends EObject {
	/**
	 * Returns the value of the '<em><b>Foundational Requirement</b></em>' attribute.
	 * The literals are from the enumeration {@link engineering.schumann.uml.profile.csmn.Iec62443FoundationalRequirementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foundational Requirement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foundational Requirement</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.Iec62443FoundationalRequirementType
	 * @see #setFoundationalRequirement(Iec62443FoundationalRequirementType)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getSecurityLevel_FoundationalRequirement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Iec62443FoundationalRequirementType getFoundationalRequirement();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.SecurityLevel#getFoundationalRequirement <em>Foundational Requirement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foundational Requirement</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.Iec62443FoundationalRequirementType
	 * @see #getFoundationalRequirement()
	 * @generated
	 */
	void setFoundationalRequirement(Iec62443FoundationalRequirementType value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' containment reference.
	 * @see #setLevel(SecurityLevel)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getSecurityLevel_Level()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	SecurityLevel getLevel();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.SecurityLevel#getLevel <em>Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' containment reference.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(SecurityLevel value);

	/**
	 * Returns the value of the '<em><b>Rational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rational</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rational</em>' attribute.
	 * @see #setRational(String)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getSecurityLevel_Rational()
	 * @model ordered="false"
	 * @generated
	 */
	String getRational();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.SecurityLevel#getRational <em>Rational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rational</em>' attribute.
	 * @see #getRational()
	 * @generated
	 */
	void setRational(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link engineering.schumann.uml.profile.csmn.Iec62443SecurityLevelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.Iec62443SecurityLevelType
	 * @see #setType(Iec62443SecurityLevelType)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getSecurityLevel_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Iec62443SecurityLevelType getType();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.SecurityLevel#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.Iec62443SecurityLevelType
	 * @see #getType()
	 * @generated
	 */
	void setType(Iec62443SecurityLevelType value);

	/**
	 * Returns the value of the '<em><b>Vector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector</em>' attribute.
	 * @see #setVector(String)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getSecurityLevel_Vector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getVector();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.SecurityLevel#getVector <em>Vector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector</em>' attribute.
	 * @see #getVector()
	 * @generated
	 */
	void setVector(String value);

} // SecurityLevel
