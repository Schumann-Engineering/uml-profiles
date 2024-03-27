/**
 */
package QWiki;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Section#getOwnedSection <em>Owned Section</em>}</li>
 *   <li>{@link QWiki.Section#getOwningSection <em>Owning Section</em>}</li>
 *   <li>{@link QWiki.Section#getNumber <em>Number</em>}</li>
 *   <li>{@link QWiki.Section#getFacilitatingSpiceElement <em>Facilitating Spice Element</em>}</li>
 *   <li>{@link QWiki.Section#getFacilitatingElement <em>Facilitating Element</em>}</li>
 *   <li>{@link QWiki.Section#getSuperseedingRelationship <em>Superseeding Relationship</em>}</li>
 *   <li>{@link QWiki.Section#getQualifiedNumber <em>Qualified Number</em>}</li>
 *   <li>{@link QWiki.Section#getTerm <em>Term</em>}</li>
 *   <li>{@link QWiki.Section#getOwningDocument <em>Owning Document</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends I18nDescriptiveElement {
	/**
	 * Returns the value of the '<em><b>Owned Section</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.Section}.
	 * It is bidirectional and its opposite is '{@link QWiki.Section#getOwningSection <em>Owning Section</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Element#getOwnedElement() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Section</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Section</em>' containment reference list.
	 * @see QWiki.QWikiPackage#getSection_OwnedSection()
	 * @see QWiki.Section#getOwningSection
	 * @model opposite="owningSection" containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Section> getOwnedSection();

	/**
	 * Returns the value of the '<em><b>Owning Section</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Section#getOwnedSection <em>Owned Section</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Section</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Section</em>' container reference.
	 * @see #setOwningSection(Section)
	 * @see QWiki.QWikiPackage#getSection_OwningSection()
	 * @see QWiki.Section#getOwnedSection
	 * @model opposite="ownedSection" transient="false" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	Section getOwningSection();

	/**
	 * Sets the value of the '{@link QWiki.Section#getOwningSection <em>Owning Section</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Section</em>' container reference.
	 * @see #getOwningSection()
	 * @generated
	 */
	void setOwningSection(Section value);

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
	 * @see QWiki.QWikiPackage#getSection_Number()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link QWiki.Section#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Facilitating Spice Element</b></em>' reference list.
	 * The list contents are of type {@link QWiki.SpiceElement}.
	 * It is bidirectional and its opposite is '{@link QWiki.SpiceElement#getFacilitatedSection <em>Facilitated Section</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Section#getFacilitatingElement() <em>Facilitating Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitating Spice Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitating Spice Element</em>' reference list.
	 * @see QWiki.QWikiPackage#getSection_FacilitatingSpiceElement()
	 * @see QWiki.SpiceElement#getFacilitatedSection
	 * @model opposite="facilitatedSection" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<SpiceElement> getFacilitatingSpiceElement();

	/**
	 * Returns the value of the '<em><b>Facilitating Element</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Element}.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitating Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitating Element</em>' reference list.
	 * @see QWiki.QWikiPackage#getSection_FacilitatingElement()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='facilitatedSection'"
	 *        annotation="union"
	 * @generated
	 */
	EList<Element> getFacilitatingElement();

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
	 * @see QWiki.QWikiPackage#getSection_SuperseedingRelationship()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='section'"
	 * @generated
	 */
	EList<SuperseedingRelationship> getSuperseedingRelationship();

	/**
	 * Returns the value of the '<em><b>Qualified Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Number</em>' attribute.
	 * @see QWiki.QWikiPackage#getSection_QualifiedNumber()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	String getQualifiedNumber();

	/**
	 * Returns the value of the '<em><b>Term</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Term}.
	 * It is bidirectional and its opposite is '{@link QWiki.Term#getExternalTermDefinition <em>External Term Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' reference list.
	 * @see QWiki.QWikiPackage#getSection_Term()
	 * @see QWiki.Term#getExternalTermDefinition
	 * @model opposite="externalTermDefinition" ordered="false"
	 * @generated
	 */
	EList<Term> getTerm();

	/**
	 * Returns the value of the '<em><b>Owning Document</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.DocumentVersion#getOwnedSection <em>Owned Section</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Document</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Document</em>' container reference.
	 * @see #setOwningDocument(DocumentVersion)
	 * @see QWiki.QWikiPackage#getSection_OwningDocument()
	 * @see QWiki.DocumentVersion#getOwnedSection
	 * @model opposite="ownedSection" transient="false" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	DocumentVersion getOwningDocument();

	/**
	 * Sets the value of the '{@link QWiki.Section#getOwningDocument <em>Owning Document</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Document</em>' container reference.
	 * @see #getOwningDocument()
	 * @generated
	 */
	void setOwningDocument(DocumentVersion value);

} // Section
