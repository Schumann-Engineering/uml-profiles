/**
 */
package QWiki.Bibliography;

import QWiki.Infrastructure.UmlNamedElement;
import QWiki.Infrastructure.UmlNamespace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Bibliography.DocumentVersion#getPublicationYear <em>Publication Year</em>}</li>
 *   <li>{@link QWiki.Bibliography.DocumentVersion#getDocumentVersionType <em>Document Version Type</em>}</li>
 *   <li>{@link QWiki.Bibliography.DocumentVersion#getEdition <em>Edition</em>}</li>
 *   <li>{@link QWiki.Bibliography.DocumentVersion#getOwnedSection <em>Owned Section</em>}</li>
 *   <li>{@link QWiki.Bibliography.DocumentVersion#getOwningDocument <em>Owning Document</em>}</li>
 * </ul>
 *
 * @see QWiki.Bibliography.BibliographyPackage#getDocumentVersion()
 * @model annotation="duplicates"
 * @generated
 */
public interface DocumentVersion extends UmlNamespace, UmlNamedElement {
	/**
	 * Returns the value of the '<em><b>Publication Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publication Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publication Year</em>' attribute.
	 * @see #setPublicationYear(String)
	 * @see QWiki.Bibliography.BibliographyPackage#getDocumentVersion_PublicationYear()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPublicationYear();

	/**
	 * Sets the value of the '{@link QWiki.Bibliography.DocumentVersion#getPublicationYear <em>Publication Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Year</em>' attribute.
	 * @see #getPublicationYear()
	 * @generated
	 */
	void setPublicationYear(String value);

	/**
	 * Returns the value of the '<em><b>Document Version Type</b></em>' attribute.
	 * The default value is <code>"FirstEdition"</code>.
	 * The literals are from the enumeration {@link QWiki.Bibliography.DocumentVersionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Version Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Version Type</em>' attribute.
	 * @see QWiki.Bibliography.DocumentVersionType
	 * @see #setDocumentVersionType(DocumentVersionType)
	 * @see QWiki.Bibliography.BibliographyPackage#getDocumentVersion_DocumentVersionType()
	 * @model default="FirstEdition" required="true" ordered="false"
	 * @generated
	 */
	DocumentVersionType getDocumentVersionType();

	/**
	 * Sets the value of the '{@link QWiki.Bibliography.DocumentVersion#getDocumentVersionType <em>Document Version Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Version Type</em>' attribute.
	 * @see QWiki.Bibliography.DocumentVersionType
	 * @see #getDocumentVersionType()
	 * @generated
	 */
	void setDocumentVersionType(DocumentVersionType value);

	/**
	 * Returns the value of the '<em><b>Edition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edition</em>' attribute.
	 * @see #setEdition(String)
	 * @see QWiki.Bibliography.BibliographyPackage#getDocumentVersion_Edition()
	 * @model ordered="false"
	 * @generated
	 */
	String getEdition();

	/**
	 * Sets the value of the '{@link QWiki.Bibliography.DocumentVersion#getEdition <em>Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edition</em>' attribute.
	 * @see #getEdition()
	 * @generated
	 */
	void setEdition(String value);

	/**
	 * Returns the value of the '<em><b>Owned Section</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.Bibliography.Section}.
	 * It is bidirectional and its opposite is '{@link QWiki.Bibliography.Section#getOwningDocument <em>Owning Document</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Infrastructure.UmlNamespace#getOwnedMember() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Section</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Section</em>' containment reference list.
	 * @see QWiki.Bibliography.BibliographyPackage#getDocumentVersion_OwnedSection()
	 * @see QWiki.Bibliography.Section#getOwningDocument
	 * @model opposite="owningDocument" containment="true" transient="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Section> getOwnedSection();

	/**
	 * Returns the value of the '<em><b>Owning Document</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Bibliography.Document#getOwnedVersion <em>Owned Version</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Infrastructure.UmlNamedElement#getNamespace() <em>Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Document</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Document</em>' container reference.
	 * @see #setOwningDocument(Document)
	 * @see QWiki.Bibliography.BibliographyPackage#getDocumentVersion_OwningDocument()
	 * @see QWiki.Bibliography.Document#getOwnedVersion
	 * @model opposite="ownedVersion" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	Document getOwningDocument();

	/**
	 * Sets the value of the '{@link QWiki.Bibliography.DocumentVersion#getOwningDocument <em>Owning Document</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Document</em>' container reference.
	 * @see #getOwningDocument()
	 * @generated
	 */
	void setOwningDocument(Document value);

} // DocumentVersion
