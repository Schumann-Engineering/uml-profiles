/**
 */
package CSMN.Elements;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CSMN.Elements.User#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link CSMN.Elements.User#getUserType <em>User Type</em>}</li>
 *   <li>{@link CSMN.Elements.User#isUseFilledIcon <em>Use Filled Icon</em>}</li>
 *   <li>{@link CSMN.Elements.User#getBase_Actor <em>Base Actor</em>}</li>
 * </ul>
 *
 * @see CSMN.Elements.ElementsPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
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
	 * @see CSMN.Elements.ElementsPackage#getUser_Base_Component()
	 * @model ordered="false"
	 * @generated
	 */
	Component getBase_Component();

	/**
	 * Sets the value of the '{@link CSMN.Elements.User#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(Component value);

	/**
	 * Returns the value of the '<em><b>User Type</b></em>' attribute.
	 * The default value is <code>"Generic"</code>.
	 * The literals are from the enumeration {@link CSMN.Elements.userType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Type</em>' attribute.
	 * @see CSMN.Elements.userType
	 * @see #setUserType(userType)
	 * @see CSMN.Elements.ElementsPackage#getUser_UserType()
	 * @model default="Generic" required="true" ordered="false"
	 * @generated
	 */
	userType getUserType();

	/**
	 * Sets the value of the '{@link CSMN.Elements.User#getUserType <em>User Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Type</em>' attribute.
	 * @see CSMN.Elements.userType
	 * @see #getUserType()
	 * @generated
	 */
	void setUserType(userType value);

	/**
	 * Returns the value of the '<em><b>Use Filled Icon</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Filled Icon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Filled Icon</em>' attribute.
	 * @see #setUseFilledIcon(boolean)
	 * @see CSMN.Elements.ElementsPackage#getUser_UseFilledIcon()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isUseFilledIcon();

	/**
	 * Sets the value of the '{@link CSMN.Elements.User#isUseFilledIcon <em>Use Filled Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Filled Icon</em>' attribute.
	 * @see #isUseFilledIcon()
	 * @generated
	 */
	void setUseFilledIcon(boolean value);

	/**
	 * Returns the value of the '<em><b>Base Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Actor</em>' reference.
	 * @see #setBase_Actor(Actor)
	 * @see CSMN.Elements.ElementsPackage#getUser_Base_Actor()
	 * @model ordered="false"
	 * @generated
	 */
	Actor getBase_Actor();

	/**
	 * Sets the value of the '{@link CSMN.Elements.User#getBase_Actor <em>Base Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Actor</em>' reference.
	 * @see #getBase_Actor()
	 * @generated
	 */
	void setBase_Actor(Actor value);

} // User
