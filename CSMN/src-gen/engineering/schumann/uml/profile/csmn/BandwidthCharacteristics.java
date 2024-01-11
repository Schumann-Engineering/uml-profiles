/**
 */
package engineering.schumann.uml.profile.csmn;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Relationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bandwidth Characteristics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.BandwidthCharacteristics#getBase_Relationship <em>Base Relationship</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.BandwidthCharacteristics#getBase_Port <em>Base Port</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.BandwidthCharacteristics#getBandwidth <em>Bandwidth</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getBandwidthCharacteristics()
 * @model
 * @generated
 */
public interface BandwidthCharacteristics extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Relationship</em>' reference.
	 * @see #setBase_Relationship(Relationship)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getBandwidthCharacteristics_Base_Relationship()
	 * @model ordered="false"
	 * @generated
	 */
	Relationship getBase_Relationship();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.BandwidthCharacteristics#getBase_Relationship <em>Base Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Relationship</em>' reference.
	 * @see #getBase_Relationship()
	 * @generated
	 */
	void setBase_Relationship(Relationship value);

	/**
	 * Returns the value of the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Port</em>' reference.
	 * @see #setBase_Port(Port)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getBandwidthCharacteristics_Base_Port()
	 * @model ordered="false"
	 * @generated
	 */
	Port getBase_Port();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.BandwidthCharacteristics#getBase_Port <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Port</em>' reference.
	 * @see #getBase_Port()
	 * @generated
	 */
	void setBase_Port(Port value);

	/**
	 * Returns the value of the '<em><b>Bandwidth</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bandwidth</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bandwidth</em>' containment reference.
	 * @see #setBandwidth(Bandwidth)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getBandwidthCharacteristics_Bandwidth()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Bandwidth getBandwidth();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.BandwidthCharacteristics#getBandwidth <em>Bandwidth</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bandwidth</em>' containment reference.
	 * @see #getBandwidth()
	 * @generated
	 */
	void setBandwidth(Bandwidth value);

} // BandwidthCharacteristics
