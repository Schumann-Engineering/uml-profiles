/**
 */
package engineering.schumann.uml.profile.csmn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.SoftwareConstraint#getSoftwareVersion <em>Software Version</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getSoftwareConstraint()
 * @model
 * @generated
 */
public interface SoftwareConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Software Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Version</em>' attribute.
	 * @see #setSoftwareVersion(String)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getSoftwareConstraint_SoftwareVersion()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getSoftwareVersion();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.SoftwareConstraint#getSoftwareVersion <em>Software Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Version</em>' attribute.
	 * @see #getSoftwareVersion()
	 * @generated
	 */
	void setSoftwareVersion(String value);

} // SoftwareConstraint
