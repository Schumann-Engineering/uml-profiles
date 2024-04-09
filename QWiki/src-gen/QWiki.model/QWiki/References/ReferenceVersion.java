/**
 */
package QWiki.References;

import QWiki.Kernel.QWikiNamespace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.References.ReferenceVersion#getPublicationYear <em>Publication Year</em>}</li>
 *   <li>{@link QWiki.References.ReferenceVersion#getReferenceVersionType <em>Reference Version Type</em>}</li>
 *   <li>{@link QWiki.References.ReferenceVersion#getEdition <em>Edition</em>}</li>
 *   <li>{@link QWiki.References.ReferenceVersion#getOwnedSection <em>Owned Section</em>}</li>
 *   <li>{@link QWiki.References.ReferenceVersion#getOwningReference <em>Owning Reference</em>}</li>
 * </ul>
 *
 * @see QWiki.References.ReferencesPackage#getReferenceVersion()
 * @model
 * @generated
 */
public interface ReferenceVersion extends QWikiNamespace {
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
	 * @see QWiki.References.ReferencesPackage#getReferenceVersion_PublicationYear()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPublicationYear();

	/**
	 * Sets the value of the '{@link QWiki.References.ReferenceVersion#getPublicationYear <em>Publication Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publication Year</em>' attribute.
	 * @see #getPublicationYear()
	 * @generated
	 */
	void setPublicationYear(String value);

	/**
	 * Returns the value of the '<em><b>Reference Version Type</b></em>' attribute.
	 * The default value is <code>"FirstEdition"</code>.
	 * The literals are from the enumeration {@link QWiki.References.ReferenceVersionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Version Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Version Type</em>' attribute.
	 * @see QWiki.References.ReferenceVersionType
	 * @see #setReferenceVersionType(ReferenceVersionType)
	 * @see QWiki.References.ReferencesPackage#getReferenceVersion_ReferenceVersionType()
	 * @model default="FirstEdition" required="true" ordered="false"
	 * @generated
	 */
	ReferenceVersionType getReferenceVersionType();

	/**
	 * Sets the value of the '{@link QWiki.References.ReferenceVersion#getReferenceVersionType <em>Reference Version Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Version Type</em>' attribute.
	 * @see QWiki.References.ReferenceVersionType
	 * @see #getReferenceVersionType()
	 * @generated
	 */
	void setReferenceVersionType(ReferenceVersionType value);

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
	 * @see QWiki.References.ReferencesPackage#getReferenceVersion_Edition()
	 * @model ordered="false"
	 * @generated
	 */
	String getEdition();

	/**
	 * Sets the value of the '{@link QWiki.References.ReferenceVersion#getEdition <em>Edition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edition</em>' attribute.
	 * @see #getEdition()
	 * @generated
	 */
	void setEdition(String value);

	/**
	 * Returns the value of the '<em><b>Owned Section</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.References.Section}.
	 * It is bidirectional and its opposite is '{@link QWiki.References.Section#getOwningReferenceVersion <em>Owning Reference Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Section</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Section</em>' containment reference list.
	 * @see QWiki.References.ReferencesPackage#getReferenceVersion_OwnedSection()
	 * @see QWiki.References.Section#getOwningReferenceVersion
	 * @model opposite="owningReferenceVersion" containment="true" transient="true" ordered="false"
	 * @generated
	 */
	EList<Section> getOwnedSection();

	/**
	 * Retrieves the first {@link QWiki.References.Section} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.References.Section} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.References.Section} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedSection()
	 * @generated
	 */
	Section getOwnedSection(String name);

	/**
	 * Retrieves the first {@link QWiki.References.Section} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.References.Section} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link QWiki.References.Section} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedSection()
	 * @generated
	 */
	Section getOwnedSection(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Owning Reference</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.References.Reference#getOwnedVersion <em>Owned Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Reference</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Reference</em>' container reference.
	 * @see #setOwningReference(Reference)
	 * @see QWiki.References.ReferencesPackage#getReferenceVersion_OwningReference()
	 * @see QWiki.References.Reference#getOwnedVersion
	 * @model opposite="ownedVersion" ordered="false"
	 * @generated
	 */
	Reference getOwningReference();

	/**
	 * Sets the value of the '{@link QWiki.References.ReferenceVersion#getOwningReference <em>Owning Reference</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Reference</em>' container reference.
	 * @see #getOwningReference()
	 * @generated
	 */
	void setOwningReference(Reference value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='owningDocument.oid() + \'/\' + edition + if (owningDocument.documentType = DocumentType::Standard) then \'&lt;SDO-TBD&gt;\' else \'\' endif'"
	 * @generated
	 */
	String oid();

} // ReferenceVersion
