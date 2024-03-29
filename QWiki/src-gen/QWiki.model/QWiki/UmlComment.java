/**
 */
package QWiki;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uml Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A comment is a textual annotation that can be attached to a set of elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.UmlComment#getBody <em>Body</em>}</li>
 *   <li>{@link QWiki.UmlComment#getAnnotatedElement <em>Annotated Element</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getUmlComment()
 * @model
 * @generated
 */
public interface UmlComment extends UmlElement {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a string that is the comment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see QWiki.QWikiPackage#getUmlComment_Body()
	 * @model ordered="false"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link QWiki.UmlComment#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Annotated Element</b></em>' reference list.
	 * The list contents are of type {@link QWiki.UmlElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Element(s) being commented.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotated Element</em>' reference list.
	 * @see QWiki.QWikiPackage#getUmlComment_AnnotatedElement()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='comment'"
	 * @generated
	 */
	EList<UmlElement> getAnnotatedElement();

} // UmlComment
