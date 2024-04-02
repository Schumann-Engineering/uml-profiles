/**
 */
package QWiki.Kernel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QWiki Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Kernel.QWikiElement#getUuid <em>Uuid</em>}</li>
 *   <li>{@link QWiki.Kernel.QWikiElement#getCustomProperty <em>Custom Property</em>}</li>
 *   <li>{@link QWiki.Kernel.QWikiElement#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @see QWiki.Kernel.KernelPackage#getQWikiElement()
 * @model abstract="true"
 * @generated
 */
public interface QWikiElement extends Element {
	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uuid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see QWiki.Kernel.KernelPackage#getQWikiElement_Uuid()
	 * @model id="true" ordered="false"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link QWiki.Kernel.QWikiElement#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

	/**
	 * Returns the value of the '<em><b>Custom Property</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.Kernel.I18nKeyedString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Property</em>' containment reference list.
	 * @see QWiki.Kernel.KernelPackage#getQWikiElement_CustomProperty()
	 * @model containment="true" transient="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningElement'"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<I18nKeyedString> getCustomProperty();

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
	 * @see QWiki.Kernel.KernelPackage#getQWikiElement_Tag()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getTag();

	/**
	 * <p>
	 * This operation redefines the following operations:
	 * <ul>
	 *   <li>'{@link QWiki.Kernel.QWikiElement#oid() <em>Oid</em>}' </li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='uuid'"
	 * @generated
	 */
	String oid();

} // QWikiElement
