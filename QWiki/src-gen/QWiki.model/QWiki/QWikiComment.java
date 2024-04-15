/**
 */
package QWiki;

import org.eclipse.uml2.uml.Comment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.QWikiComment#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getQWikiComment()
 * @model
 * @generated
 */
public interface QWikiComment extends QWikiElement, Comment {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(L10nString)
	 * @see QWiki.QWikiPackage#getQWikiComment_Content()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	L10nString getContent();

	/**
	 * Sets the value of the '{@link QWiki.QWikiComment#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(L10nString value);

} // QWikiComment
