/**
 */
package QWiki.Glossary;

import QWiki.Kernel.I18nDescriptiveElement;
import QWiki.Kernel.I18nNamedElement;
import QWiki.Kernel.I18nString;

import QWiki.References.Section;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

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
 * @model
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
	 * Retrieves the first {@link QWiki.Glossary.GlossaryTermDefinition} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Term Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Glossary.GlossaryTermDefinition} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Glossary.GlossaryTermDefinition} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedTermDefinition()
	 * @generated
	 */
	GlossaryTermDefinition getOwnedTermDefinition(String name);

	/**
	 * Retrieves the first {@link QWiki.Glossary.GlossaryTermDefinition} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Term Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Glossary.GlossaryTermDefinition} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link QWiki.Glossary.GlossaryTermDefinition} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedTermDefinition()
	 * @generated
	 */
	GlossaryTermDefinition getOwnedTermDefinition(String name, boolean ignoreCase);

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
	 * The list contents are of type {@link QWiki.Kernel.I18nDescriptiveElement}.
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
	 * Retrieves the first {@link QWiki.Kernel.I18nDescriptiveElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Term Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Kernel.I18nDescriptiveElement} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Kernel.I18nDescriptiveElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getTermDefinition()
	 * @generated
	 */
	I18nDescriptiveElement getTermDefinition(String name);

	/**
	 * Retrieves the first {@link QWiki.Kernel.I18nDescriptiveElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Term Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Kernel.I18nDescriptiveElement} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link QWiki.Kernel.I18nDescriptiveElement} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Kernel.I18nDescriptiveElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getTermDefinition()
	 * @generated
	 */
	I18nDescriptiveElement getTermDefinition(String name, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>External Term Definition</b></em>' reference list.
	 * The list contents are of type {@link QWiki.References.Section}.
	 * It is bidirectional and its opposite is '{@link QWiki.References.Section#getTerm <em>Term</em>}'.
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
	 * @see QWiki.References.Section#getTerm
	 * @model opposite="term" transient="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Section> getExternalTermDefinition();

	/**
	 * Retrieves the first {@link QWiki.References.Section} with the specified '<em><b>Name</b></em>' from the '<em><b>External Term Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.References.Section} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.References.Section} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExternalTermDefinition()
	 * @generated
	 */
	Section getExternalTermDefinition(String name);

	/**
	 * Retrieves the first {@link QWiki.References.Section} with the specified '<em><b>Name</b></em>' from the '<em><b>External Term Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.References.Section} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link QWiki.References.Section} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getExternalTermDefinition()
	 * @generated
	 */
	Section getExternalTermDefinition(String name, boolean ignoreCase);

	/**
	 * <p>
	 * This operation redefines the following operations:
	 * <ul>
	 *   <li>'{@link QWiki.Kernel.QWikiElement#oid() <em>Oid</em>}' </li>
	 * </ul>
	 * </p>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='\'t/\' + name'"
	 * @generated
	 */
	String oid();

} // GlossaryTerm
