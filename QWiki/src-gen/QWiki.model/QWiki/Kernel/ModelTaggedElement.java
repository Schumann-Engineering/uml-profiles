/**
 */
package QWiki.Kernel;

import QWiki.I18N.I18nKeyedString;

import QWiki.Infrastructure.UmlElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Tagged Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Kernel.ModelTaggedElement#getTag <em>Tag</em>}</li>
 *   <li>{@link QWiki.Kernel.ModelTaggedElement#getCustomProperty <em>Custom Property</em>}</li>
 * </ul>
 *
 * @see QWiki.Kernel.KernelPackage#getModelTaggedElement()
 * @model abstract="true"
 * @generated
 */
public interface ModelTaggedElement extends UmlElement {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute list.
	 * @see QWiki.Kernel.KernelPackage#getModelTaggedElement_Tag()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getTag();

	/**
	 * Returns the value of the '<em><b>Custom Property</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.I18N.I18nKeyedString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Property</em>' containment reference list.
	 * @see QWiki.Kernel.KernelPackage#getModelTaggedElement_CustomProperty()
	 * @model containment="true" transient="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningElement'"
	 * @generated
	 */
	EList<I18nKeyedString> getCustomProperty();

} // ModelTaggedElement
