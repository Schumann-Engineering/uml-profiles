/**
 */
package QWiki;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.QWikiElement#getUuid <em>Uuid</em>}</li>
 *   <li>{@link QWiki.QWikiElement#getCustomProperty <em>Custom Property</em>}</li>
 *   <li>{@link QWiki.QWikiElement#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getQWikiElement()
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
	 * @see QWiki.QWikiPackage#getQWikiElement_Uuid()
	 * @model id="true" required="true" ordered="false"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link QWiki.QWikiElement#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

	/**
	 * Returns the value of the '<em><b>Custom Property</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.L10nKeyedString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Property</em>' containment reference list.
	 * @see QWiki.QWikiPackage#getQWikiElement_CustomProperty()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningElement'"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<L10nKeyedString> getCustomProperty();

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
	 * @see QWiki.QWikiPackage#getQWikiElement_Tag()
	 * @model ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<String> getTag();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.uuid'"
	 * @generated
	 */
	String objectId();

} // QWikiElement
