/**
 */
package QWiki.Bibliography;

import QWiki.Infrastructure.UmlNamespace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Bibliography.Document#getNumber <em>Number</em>}</li>
 *   <li>{@link QWiki.Bibliography.Document#getOwnedVersion <em>Owned Version</em>}</li>
 *   <li>{@link QWiki.Bibliography.Document#getDocumentType <em>Document Type</em>}</li>
 *   <li>{@link QWiki.Bibliography.Document#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see QWiki.Bibliography.BibliographyPackage#getDocument()
 * @model annotation="duplicates"
 * @generated
 */
public interface Document extends UmlNamespace {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see QWiki.Bibliography.BibliographyPackage#getDocument_Number()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link QWiki.Bibliography.Document#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Owned Version</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.Bibliography.DocumentVersion}.
	 * It is bidirectional and its opposite is '{@link QWiki.Bibliography.DocumentVersion#getOwningDocument <em>Owning Document</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Infrastructure.UmlNamespace#getOwnedMember() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Version</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Version</em>' containment reference list.
	 * @see QWiki.Bibliography.BibliographyPackage#getDocument_OwnedVersion()
	 * @see QWiki.Bibliography.DocumentVersion#getOwningDocument
	 * @model opposite="owningDocument" containment="true" transient="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<DocumentVersion> getOwnedVersion();

	/**
	 * Returns the value of the '<em><b>Document Type</b></em>' attribute.
	 * The literals are from the enumeration {@link QWiki.Bibliography.DocumentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Type</em>' attribute.
	 * @see QWiki.Bibliography.DocumentType
	 * @see #setDocumentType(DocumentType)
	 * @see QWiki.Bibliography.BibliographyPackage#getDocument_DocumentType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DocumentType getDocumentType();

	/**
	 * Sets the value of the '{@link QWiki.Bibliography.Document#getDocumentType <em>Document Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Type</em>' attribute.
	 * @see QWiki.Bibliography.DocumentType
	 * @see #getDocumentType()
	 * @generated
	 */
	void setDocumentType(DocumentType value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Bibliography.Author}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference list.
	 * @see QWiki.Bibliography.BibliographyPackage#getDocument_Author()
	 * @model required="true" transient="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='authoredDocument'"
	 * @generated
	 */
	EList<Author> getAuthor();

} // Document
