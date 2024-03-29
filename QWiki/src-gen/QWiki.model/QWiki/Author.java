/**
 */
package QWiki;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Author</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Author#getAuthorType <em>Author Type</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getAuthor()
 * @model
 * @generated
 */
public interface Author extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Author Type</b></em>' attribute.
	 * The default value is <code>"Person"</code>.
	 * The literals are from the enumeration {@link QWiki.AuthorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author Type</em>' attribute.
	 * @see QWiki.AuthorType
	 * @see #setAuthorType(AuthorType)
	 * @see QWiki.QWikiPackage#getAuthor_AuthorType()
	 * @model default="Person" required="true" ordered="false"
	 * @generated
	 */
	AuthorType getAuthorType();

	/**
	 * Sets the value of the '{@link QWiki.Author#getAuthorType <em>Author Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Type</em>' attribute.
	 * @see QWiki.AuthorType
	 * @see #getAuthorType()
	 * @generated
	 */
	void setAuthorType(AuthorType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='model.ownedElement-&gt;select(oclIsKindOf(QWiki::Document)).oclAsType(QWiki::Document)-&gt;select(author-&gt;includes(self))-&gt;asSet()'"
	 * @generated
	 */
	EList<Document> authoredDocument();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='model.ownedElement-&gt;select(oclIsKindOf(QWiki::Standard)).oclAsType(QWiki::Standard)-&gt;select(author-&gt;includes(self))-&gt;asSet()'"
	 * @generated
	 */
	EList<Standard> authoredStandard();

} // Author
