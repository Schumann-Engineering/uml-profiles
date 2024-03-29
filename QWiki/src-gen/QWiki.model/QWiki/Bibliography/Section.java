/**
 */
package QWiki.Bibliography;

import QWiki.Glossary.GlossaryTerm;

import QWiki.Infrastructure.UmlElement;
import QWiki.Infrastructure.UmlNamespace;

import QWiki.SPICE.SpiceElement;

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
 *   <li>{@link QWiki.Bibliography.Section#getOwningDocument <em>Owning Document</em>}</li>
 *   <li>{@link QWiki.Bibliography.Section#getOwnedSection <em>Owned Section</em>}</li>
 *   <li>{@link QWiki.Bibliography.Section#getOwningSection <em>Owning Section</em>}</li>
 *   <li>{@link QWiki.Bibliography.Section#getNumber <em>Number</em>}</li>
 *   <li>{@link QWiki.Bibliography.Section#getFacilitatingElement <em>Facilitating Element</em>}</li>
 *   <li>{@link QWiki.Bibliography.Section#getTerm <em>Term</em>}</li>
 *   <li>{@link QWiki.Bibliography.Section#getFacilitatingSpiceElement <em>Facilitating Spice Element</em>}</li>
 * </ul>
 *
 * @see QWiki.Bibliography.BibliographyPackage#getSection()
 * @model annotation="duplicates"
 * @generated
 */
public interface Section extends UmlNamespace {
	/**
	 * Returns the value of the '<em><b>Owning Document</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Bibliography.DocumentVersion#getOwnedSection <em>Owned Section</em>}'.
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
	 * @see #setOwningDocument(DocumentVersion)
	 * @see QWiki.Bibliography.BibliographyPackage#getSection_OwningDocument()
	 * @see QWiki.Bibliography.DocumentVersion#getOwnedSection
	 * @model opposite="ownedSection" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	DocumentVersion getOwningDocument();

	/**
	 * Sets the value of the '{@link QWiki.Bibliography.Section#getOwningDocument <em>Owning Document</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Document</em>' container reference.
	 * @see #getOwningDocument()
	 * @generated
	 */
	void setOwningDocument(DocumentVersion value);

	/**
	 * Returns the value of the '<em><b>Owned Section</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.Bibliography.Section}.
	 * It is bidirectional and its opposite is '{@link QWiki.Bibliography.Section#getOwningSection <em>Owning Section</em>}'.
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
	 * @see QWiki.Bibliography.BibliographyPackage#getSection_OwnedSection()
	 * @see QWiki.Bibliography.Section#getOwningSection
	 * @model opposite="owningSection" containment="true" transient="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Section> getOwnedSection();

	/**
	 * Returns the value of the '<em><b>Owning Section</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Bibliography.Section#getOwnedSection <em>Owned Section</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Infrastructure.UmlElement#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Section</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Section</em>' container reference.
	 * @see #setOwningSection(Section)
	 * @see QWiki.Bibliography.BibliographyPackage#getSection_OwningSection()
	 * @see QWiki.Bibliography.Section#getOwnedSection
	 * @model opposite="ownedSection" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	Section getOwningSection();

	/**
	 * Sets the value of the '{@link QWiki.Bibliography.Section#getOwningSection <em>Owning Section</em>}' container reference.
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
	 * @see QWiki.Bibliography.BibliographyPackage#getSection_Number()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link QWiki.Bibliography.Section#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Facilitating Element</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Infrastructure.UmlElement}.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitating Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitating Element</em>' reference list.
	 * @see QWiki.Bibliography.BibliographyPackage#getSection_FacilitatingElement()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='facilitatedSection'"
	 *        annotation="union"
	 * @generated
	 */
	EList<UmlElement> getFacilitatingElement();

	/**
	 * Returns the value of the '<em><b>Term</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Glossary.GlossaryTerm}.
	 * It is bidirectional and its opposite is '{@link QWiki.Glossary.GlossaryTerm#getExternalTermDefinition <em>External Term Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' reference list.
	 * @see QWiki.Bibliography.BibliographyPackage#getSection_Term()
	 * @see QWiki.Glossary.GlossaryTerm#getExternalTermDefinition
	 * @model opposite="externalTermDefinition" transient="true" ordered="false"
	 * @generated
	 */
	EList<GlossaryTerm> getTerm();

	/**
	 * Returns the value of the '<em><b>Facilitating Spice Element</b></em>' reference list.
	 * The list contents are of type {@link QWiki.SPICE.SpiceElement}.
	 * It is bidirectional and its opposite is '{@link QWiki.SPICE.SpiceElement#getFacilitatedSection <em>Facilitated Section</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Bibliography.Section#getFacilitatingElement() <em>Facilitating Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitating Spice Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitating Spice Element</em>' reference list.
	 * @see QWiki.Bibliography.BibliographyPackage#getSection_FacilitatingSpiceElement()
	 * @see QWiki.SPICE.SpiceElement#getFacilitatedSection
	 * @model opposite="facilitatedSection" transient="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<SpiceElement> getFacilitatingSpiceElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if (owningDocument-&gt;notEmpty()) then owningDocument else owningSection.documentVersion() endif'"
	 * @generated
	 */
	DocumentVersion documentVersion();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if (owningSection-&gt;notEmpty()) then\r\n  owningSection.qualifiedNumber() + \'.\' + number\r\nelse\r\n  number\r\nendif'"
	 * @generated
	 */
	String qualifiedNumber();

} // Section
