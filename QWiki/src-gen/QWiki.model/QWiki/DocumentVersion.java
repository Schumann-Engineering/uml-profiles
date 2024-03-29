/**
 */
package QWiki;

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
 *   <li>{@link QWiki.DocumentVersion#getPublicationYear <em>Publication Year</em>}</li>
 *   <li>{@link QWiki.DocumentVersion#getDocumentVersionType <em>Document Version Type</em>}</li>
 *   <li>{@link QWiki.DocumentVersion#getEdition <em>Edition</em>}</li>
 *   <li>{@link QWiki.DocumentVersion#getOwnedSection <em>Owned Section</em>}</li>
 *   <li>{@link QWiki.DocumentVersion#getSuperseedingRelationship <em>Superseeding Relationship</em>}</li>
 *   <li>{@link QWiki.DocumentVersion#getOwningDocument <em>Owning Document</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getDocumentVersion()
 * @model annotation="duplicates"
 * @generated
 */
public interface DocumentVersion extends ModelElement {
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
	 * @see QWiki.QWikiPackage#getDocumentVersion_PublicationYear()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPublicationYear();

	/**
	 * Sets the value of the '{@link QWiki.DocumentVersion#getPublicationYear <em>Publication Year</em>}' attribute.
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
	 * The literals are from the enumeration {@link QWiki.DocumentVersionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Version Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Version Type</em>' attribute.
	 * @see QWiki.DocumentVersionType
	 * @see #setDocumentVersionType(DocumentVersionType)
	 * @see QWiki.QWikiPackage#getDocumentVersion_DocumentVersionType()
	 * @model default="FirstEdition" required="true" ordered="false"
	 * @generated
	 */
	DocumentVersionType getDocumentVersionType();

	/**
	 * Sets the value of the '{@link QWiki.DocumentVersion#getDocumentVersionType <em>Document Version Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Version Type</em>' attribute.
	 * @see QWiki.DocumentVersionType
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
	 * @see QWiki.QWikiPackage#getDocumentVersion_Edition()
	 * @model ordered="false"
	 * @generated
	 */
	String getEdition();

	/**
	 * Sets the value of the '{@link QWiki.DocumentVersion#getEdition <em>Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edition</em>' attribute.
	 * @see #getEdition()
	 * @generated
	 */
	void setEdition(String value);

	/**
	 * Returns the value of the '<em><b>Owned Section</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.Section}.
	 * It is bidirectional and its opposite is '{@link QWiki.Section#getOwningDocument <em>Owning Document</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.UmlElement#getOwnedElement() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Section</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Section</em>' containment reference list.
	 * @see QWiki.QWikiPackage#getDocumentVersion_OwnedSection()
	 * @see QWiki.Section#getOwningDocument
	 * @model opposite="owningDocument" containment="true" transient="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Section> getOwnedSection();

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
	 * @see QWiki.QWikiPackage#getDocumentVersion_SuperseedingRelationship()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='documentversion'"
	 * @generated
	 */
	EList<SuperseedingRelationship> getSuperseedingRelationship();

	/**
	 * Returns the value of the '<em><b>Owning Document</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Document#getOwnedVersion <em>Owned Version</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.UmlElement#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Document</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Document</em>' container reference.
	 * @see #setOwningDocument(Document)
	 * @see QWiki.QWikiPackage#getDocumentVersion_OwningDocument()
	 * @see QWiki.Document#getOwnedVersion
	 * @model opposite="ownedVersion" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	Document getOwningDocument();

	/**
	 * Sets the value of the '{@link QWiki.DocumentVersion#getOwningDocument <em>Owning Document</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Document</em>' container reference.
	 * @see #getOwningDocument()
	 * @generated
	 */
	void setOwningDocument(Document value);

} // DocumentVersion
