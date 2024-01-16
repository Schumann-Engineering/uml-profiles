/**
 */
package engineering.schumann.uml.profile.csmn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Actor;
import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.UsageCharacteristic#getBase_NamedElement <em>Base Named Element</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.UsageCharacteristic#getIntendedUserGroup <em>Intended User Group</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.UsageCharacteristic#getUsageSpec <em>Usage Spec</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.UsageCharacteristic#getUsageType <em>Usage Type</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getUsageCharacteristic()
 * @model
 * @generated
 */
public interface UsageCharacteristic extends EObject {
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
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getUsageCharacteristic_Base_NamedElement()
	 * @model ordered="false"
	 * @generated
	 */
	NamedElement getBase_NamedElement();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.UsageCharacteristic#getBase_NamedElement <em>Base Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Named Element</em>' reference.
	 * @see #getBase_NamedElement()
	 * @generated
	 */
	void setBase_NamedElement(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Intended User Group</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intended User Group</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intended User Group</em>' reference list.
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getUsageCharacteristic_IntendedUserGroup()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Actor> getIntendedUserGroup();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Actor} with the specified '<em><b>Name</b></em>' from the '<em><b>Intended User Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Actor} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.Actor} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getIntendedUserGroup()
	 * @generated
	 */
	Actor getIntendedUserGroup(String name);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.Actor} with the specified '<em><b>Name</b></em>' from the '<em><b>Intended User Group</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.Actor} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link org.eclipse.uml2.uml.Actor} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getIntendedUserGroup()
	 * @generated
	 */
	Actor getIntendedUserGroup(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Usage Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Spec</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Spec</em>' attribute.
	 * @see #setUsageSpec(String)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getUsageCharacteristic_UsageSpec()
	 * @model ordered="false"
	 * @generated
	 */
	String getUsageSpec();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.UsageCharacteristic#getUsageSpec <em>Usage Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Spec</em>' attribute.
	 * @see #getUsageSpec()
	 * @generated
	 */
	void setUsageSpec(String value);

	/**
	 * Returns the value of the '<em><b>Usage Type</b></em>' attribute.
	 * The literals are from the enumeration {@link engineering.schumann.uml.profile.csmn.UsageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage Type</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.UsageType
	 * @see #setUsageType(UsageType)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getUsageCharacteristic_UsageType()
	 * @model ordered="false"
	 * @generated
	 */
	UsageType getUsageType();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.UsageCharacteristic#getUsageType <em>Usage Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage Type</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.UsageType
	 * @see #getUsageType()
	 * @generated
	 */
	void setUsageType(UsageType value);

} // UsageCharacteristic
