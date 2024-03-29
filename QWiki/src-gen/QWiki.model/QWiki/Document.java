/**
 */
package QWiki;

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
 *   <li>{@link QWiki.Document#getNumber <em>Number</em>}</li>
 *   <li>{@link QWiki.Document#getOwnedVersion <em>Owned Version</em>}</li>
 *   <li>{@link QWiki.Document#getSuperseedingRelationship <em>Superseeding Relationship</em>}</li>
 *   <li>{@link QWiki.Document#getDocumentType <em>Document Type</em>}</li>
 *   <li>{@link QWiki.Document#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getDocument()
 * @model annotation="duplicates"
 * @generated
 */
public interface Document extends I18nDescriptiveElement {
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
	 * @see QWiki.QWikiPackage#getDocument_Number()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link QWiki.Document#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Owned Version</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.DocumentVersion}.
	 * It is bidirectional and its opposite is '{@link QWiki.DocumentVersion#getOwningDocument <em>Owning Document</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.UmlElement#getOwnedElement() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Version</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Version</em>' containment reference list.
	 * @see QWiki.QWikiPackage#getDocument_OwnedVersion()
	 * @see QWiki.DocumentVersion#getOwningDocument
	 * @model opposite="owningDocument" containment="true" transient="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<DocumentVersion> getOwnedVersion();

	/**
	 * Returns the value of the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * The list contents are of type {@link QWiki.SuperseedingRelationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superseeding Relationship</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superseeding Relationship</em>' reference list.
	 * @see QWiki.QWikiPackage#getDocument_SuperseedingRelationship()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='document'"
	 * @generated
	 */
	EList<SuperseedingRelationship> getSuperseedingRelationship();

	/**
	 * Returns the value of the '<em><b>Document Type</b></em>' attribute.
	 * The literals are from the enumeration {@link QWiki.DocumentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Type</em>' attribute.
	 * @see QWiki.DocumentType
	 * @see #setDocumentType(DocumentType)
	 * @see QWiki.QWikiPackage#getDocument_DocumentType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DocumentType getDocumentType();

	/**
	 * Sets the value of the '{@link QWiki.Document#getDocumentType <em>Document Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Type</em>' attribute.
	 * @see QWiki.DocumentType
	 * @see #getDocumentType()
	 * @generated
	 */
	void setDocumentType(DocumentType value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Author}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference list.
	 * @see QWiki.QWikiPackage#getDocument_Author()
	 * @model required="true" transient="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='authoredDocument'"
	 * @generated
	 */
	EList<Author> getAuthor();

} // Document
