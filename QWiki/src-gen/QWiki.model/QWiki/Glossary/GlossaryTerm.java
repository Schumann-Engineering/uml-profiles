/**
 */
package QWiki.Glossary;

import QWiki.Bibliography.Section;

import QWiki.I18N.I18nDescriptiveElement;
import QWiki.I18N.I18nNamedElement;
import QWiki.I18N.I18nString;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Glossary.GlossaryTerm#getOwnedTermDefinition <em>Owned Term Definition</em>}</li>
 *   <li>{@link QWiki.Glossary.GlossaryTerm#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link QWiki.Glossary.GlossaryTerm#getSynonym <em>Synonym</em>}</li>
 *   <li>{@link QWiki.Glossary.GlossaryTerm#getTermDefinition <em>Term Definition</em>}</li>
 *   <li>{@link QWiki.Glossary.GlossaryTerm#getExternalTermDefinition <em>External Term Definition</em>}</li>
 * </ul>
 *
 * @see QWiki.Glossary.GlossaryPackage#getGlossaryTerm()
 * @model annotation="duplicates"
 * @generated
 */
public interface GlossaryTerm extends I18nNamedElement {
	/**
	 * Returns the value of the '<em><b>Owned Term Definition</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.Glossary.GlossaryTermDefinition}.
	 * It is bidirectional and its opposite is '{@link QWiki.Glossary.GlossaryTermDefinition#getOwningTerm <em>Owning Term</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Glossary.GlossaryTerm#getTermDefinition() <em>Term Definition</em>}'</li>
	 *   <li>'{@link QWiki.Infrastructure.UmlElement#getOwnedElement() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Term Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Term Definition</em>' containment reference list.
	 * @see QWiki.Glossary.GlossaryPackage#getGlossaryTerm_OwnedTermDefinition()
	 * @see QWiki.Glossary.GlossaryTermDefinition#getOwningTerm
	 * @model opposite="owningTerm" containment="true" transient="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<GlossaryTermDefinition> getOwnedTermDefinition();

	/**
	 * Returns the value of the '<em><b>Acronym</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acronym</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acronym</em>' containment reference.
	 * @see #setAcronym(I18nString)
	 * @see QWiki.Glossary.GlossaryPackage#getGlossaryTerm_Acronym()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	I18nString getAcronym();

	/**
	 * Sets the value of the '{@link QWiki.Glossary.GlossaryTerm#getAcronym <em>Acronym</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acronym</em>' containment reference.
	 * @see #getAcronym()
	 * @generated
	 */
	void setAcronym(I18nString value);

	/**
	 * Returns the value of the '<em><b>Synonym</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synonym</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synonym</em>' containment reference.
	 * @see #setSynonym(I18nString)
	 * @see QWiki.Glossary.GlossaryPackage#getGlossaryTerm_Synonym()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	I18nString getSynonym();

	/**
	 * Sets the value of the '{@link QWiki.Glossary.GlossaryTerm#getSynonym <em>Synonym</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synonym</em>' containment reference.
	 * @see #getSynonym()
	 * @generated
	 */
	void setSynonym(I18nString value);

	/**
	 * Returns the value of the '<em><b>Term Definition</b></em>' reference list.
	 * The list contents are of type {@link QWiki.I18N.I18nDescriptiveElement}.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term Definition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term Definition</em>' reference list.
	 * @see QWiki.Glossary.GlossaryPackage#getGlossaryTerm_TermDefinition()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='term'"
	 *        annotation="union"
	 * @generated
	 */
	EList<I18nDescriptiveElement> getTermDefinition();

	/**
	 * Returns the value of the '<em><b>External Term Definition</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Bibliography.Section}.
	 * It is bidirectional and its opposite is '{@link QWiki.Bibliography.Section#getTerm <em>Term</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Glossary.GlossaryTerm#getTermDefinition() <em>Term Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Term Definition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Term Definition</em>' reference list.
	 * @see QWiki.Glossary.GlossaryPackage#getGlossaryTerm_ExternalTermDefinition()
	 * @see QWiki.Bibliography.Section#getTerm
	 * @model opposite="term" transient="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Section> getExternalTermDefinition();

} // GlossaryTerm
