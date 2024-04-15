/**
 */
package QWiki;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>I1 8n Base String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.I18nBaseString#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getI18nBaseString()
 * @model
 * @generated
 */
public interface I18nBaseString extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.I18nValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see QWiki.QWikiPackage#getI18nBaseString_Value()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningElement'"
	 * @generated
	 */
	EList<I18nValue> getValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" languageRequired="true" languageOrdered="false"
	 * @generated
	 */
	String value(String language);

} // I18nBaseString
