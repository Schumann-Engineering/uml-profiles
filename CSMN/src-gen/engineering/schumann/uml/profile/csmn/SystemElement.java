/**
 */
package engineering.schumann.uml.profile.csmn;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.SystemElement#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.SystemElement#getPlatformType <em>Platform Type</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getSystemElement()
 * @model
 * @generated
 */
public interface SystemElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Component</em>' reference.
	 * @see #setBase_Component(Component)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getSystemElement_Base_Component()
	 * @model ordered="false"
	 * @generated
	 */
	Component getBase_Component();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.SystemElement#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(Component value);

	/**
	 * Returns the value of the '<em><b>Platform Type</b></em>' attribute.
	 * The default value is <code>"Hardware"</code>.
	 * The literals are from the enumeration {@link engineering.schumann.uml.profile.csmn.CommonPlatformEnumerationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Type</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.CommonPlatformEnumerationType
	 * @see #setPlatformType(CommonPlatformEnumerationType)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getSystemElement_PlatformType()
	 * @model default="Hardware" required="true" ordered="false"
	 * @generated
	 */
	CommonPlatformEnumerationType getPlatformType();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.SystemElement#getPlatformType <em>Platform Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform Type</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.CommonPlatformEnumerationType
	 * @see #getPlatformType()
	 * @generated
	 */
	void setPlatformType(CommonPlatformEnumerationType value);

} // SystemElement
