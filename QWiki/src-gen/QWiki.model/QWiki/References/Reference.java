/**
 */
package QWiki.References;

import QWiki.QWikiContainer;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.References.Reference#getNumber <em>Number</em>}</li>
 *   <li>{@link QWiki.References.Reference#getOwnedVersion <em>Owned Version</em>}</li>
 *   <li>{@link QWiki.References.Reference#getReferenceType <em>Reference Type</em>}</li>
 *   <li>{@link QWiki.References.Reference#getAuthor <em>Author</em>}</li>
 * </ul>
 *
 * @see QWiki.References.ReferencesPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends QWikiContainer {
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
	 * @see QWiki.References.ReferencesPackage#getReference_Number()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link QWiki.References.Reference#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Owned Version</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.References.ReferenceVersion}.
	 * It is bidirectional and its opposite is '{@link QWiki.References.ReferenceVersion#getOwningReference <em>Owning Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Version</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Version</em>' containment reference list.
	 * @see QWiki.References.ReferencesPackage#getReference_OwnedVersion()
	 * @see QWiki.References.ReferenceVersion#getOwningReference
	 * @model opposite="owningReference" containment="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<ReferenceVersion> getOwnedVersion();

	/**
	 * Retrieves the first {@link QWiki.References.ReferenceVersion} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Version</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.References.ReferenceVersion} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.References.ReferenceVersion} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedVersion()
	 * @generated
	 */
	ReferenceVersion getOwnedVersion(String name);

	/**
	 * Retrieves the first {@link QWiki.References.ReferenceVersion} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Version</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.References.ReferenceVersion} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link QWiki.References.ReferenceVersion} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedVersion()
	 * @generated
	 */
	ReferenceVersion getOwnedVersion(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Reference Type</b></em>' attribute.
	 * The literals are from the enumeration {@link QWiki.References.ReferenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Type</em>' attribute.
	 * @see QWiki.References.ReferenceType
	 * @see #setReferenceType(ReferenceType)
	 * @see QWiki.References.ReferencesPackage#getReference_ReferenceType()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='attribute'"
	 * @generated
	 */
	ReferenceType getReferenceType();

	/**
	 * Sets the value of the '{@link QWiki.References.Reference#getReferenceType <em>Reference Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Type</em>' attribute.
	 * @see QWiki.References.ReferenceType
	 * @see #getReferenceType()
	 * @generated
	 */
	void setReferenceType(ReferenceType value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference list.
	 * The list contents are of type {@link QWiki.References.Author}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference list.
	 * @see QWiki.References.ReferencesPackage#getReference_Author()
	 * @model resolveProxies="false" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='authoredDocument'"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<Author> getAuthor();

	/**
	 * Retrieves the first {@link QWiki.References.Author} with the specified '<em><b>Name</b></em>' from the '<em><b>Author</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.References.Author} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.References.Author} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getAuthor()
	 * @generated
	 */
	Author getAuthor(String name);

	/**
	 * Retrieves the first {@link QWiki.References.Author} with the specified '<em><b>Name</b></em>' from the '<em><b>Author</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.References.Author} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link QWiki.References.Author} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getAuthor()
	 * @generated
	 */
	Author getAuthor(String name, boolean ignoreCase);

	/**
	 * <p>
	 * This operation redefines the following operations:
	 * <ul>
	 *   <li>'{@link QWiki.QWikiElement#objectId() <em>Object Id</em>}' </li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if (referenceType = ReferenceType::Document) then \'d/\' + number else \r\nif (referenceType = ReferenceType::Guideline) then \'g/\' + number else\r\nif (referenceType = ReferenceType::Hyperlink) then \'href/\' + number else\r\nif (referenceType = ReferenceType::Legislation) then \'l/\' + number else\r\nif (referenceType = ReferenceType::Process) then \'p/\' + number else\r\nif (referenceType = ReferenceType::Standard) then \'s/\' + number else\r\nif (referenceType = ReferenceType::TechnicalReport) then \'tr/\' + number else \r\n\'?\'\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif'"
	 * @generated
	 */
	String objectId();

} // Reference
