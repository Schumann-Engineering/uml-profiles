/**
 */
package QWiki.References;

import QWiki.Glossary.GlossaryTerm;

import QWiki.QWikiElement;
import QWiki.QWikiNamespace;

import QWiki.Spice.SpiceElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.References.Section#getOwningReferenceVersion <em>Owning Reference Version</em>}</li>
 *   <li>{@link QWiki.References.Section#getOwnedSection <em>Owned Section</em>}</li>
 *   <li>{@link QWiki.References.Section#getOwningSection <em>Owning Section</em>}</li>
 *   <li>{@link QWiki.References.Section#getNumber <em>Number</em>}</li>
 *   <li>{@link QWiki.References.Section#getFacilitatingElement <em>Facilitating Element</em>}</li>
 *   <li>{@link QWiki.References.Section#getTerm <em>Term</em>}</li>
 *   <li>{@link QWiki.References.Section#getFacilitatingSpiceElement <em>Facilitating Spice Element</em>}</li>
 * </ul>
 *
 * @see QWiki.References.ReferencesPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends QWikiNamespace {
	/**
	 * Returns the value of the '<em><b>Owning Reference Version</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.References.ReferenceVersion#getOwnedSection <em>Owned Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Reference Version</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Reference Version</em>' container reference.
	 * @see #setOwningReferenceVersion(ReferenceVersion)
	 * @see QWiki.References.ReferencesPackage#getSection_OwningReferenceVersion()
	 * @see QWiki.References.ReferenceVersion#getOwnedSection
	 * @model opposite="ownedSection" resolveProxies="false" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	ReferenceVersion getOwningReferenceVersion();

	/**
	 * Sets the value of the '{@link QWiki.References.Section#getOwningReferenceVersion <em>Owning Reference Version</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Reference Version</em>' container reference.
	 * @see #getOwningReferenceVersion()
	 * @generated
	 */
	void setOwningReferenceVersion(ReferenceVersion value);

	/**
	 * Returns the value of the '<em><b>Owned Section</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.References.Section}.
	 * It is bidirectional and its opposite is '{@link QWiki.References.Section#getOwningSection <em>Owning Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Section</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Section</em>' containment reference list.
	 * @see QWiki.References.ReferencesPackage#getSection_OwnedSection()
	 * @see QWiki.References.Section#getOwningSection
	 * @model opposite="owningSection" containment="true" ordered="false"
	 *        extendedMetaData="kind='element'"
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
	 * Returns the value of the '<em><b>Owning Section</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.References.Section#getOwnedSection <em>Owned Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Section</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Section</em>' container reference.
	 * @see #setOwningSection(Section)
	 * @see QWiki.References.ReferencesPackage#getSection_OwningSection()
	 * @see QWiki.References.Section#getOwnedSection
	 * @model opposite="ownedSection" resolveProxies="false" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	Section getOwningSection();

	/**
	 * Sets the value of the '{@link QWiki.References.Section#getOwningSection <em>Owning Section</em>}' container reference.
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
	 * @see QWiki.References.ReferencesPackage#getSection_Number()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link QWiki.References.Section#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Facilitating Element</b></em>' reference list.
	 * The list contents are of type {@link QWiki.QWikiElement}.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitating Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitating Element</em>' reference list.
	 * @see QWiki.References.ReferencesPackage#getSection_FacilitatingElement()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='facilitatedSection'"
	 *        annotation="union"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<QWikiElement> getFacilitatingElement();

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
	 * @see QWiki.References.ReferencesPackage#getSection_Term()
	 * @see QWiki.Glossary.GlossaryTerm#getExternalTermDefinition
	 * @model opposite="externalTermDefinition" resolveProxies="false" transient="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<GlossaryTerm> getTerm();

	/**
	 * Retrieves the first {@link QWiki.Glossary.GlossaryTerm} with the specified '<em><b>Name</b></em>' from the '<em><b>Term</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Glossary.GlossaryTerm} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Glossary.GlossaryTerm} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getTerm()
	 * @generated
	 */
	GlossaryTerm getTerm(String name);

	/**
	 * Retrieves the first {@link QWiki.Glossary.GlossaryTerm} with the specified '<em><b>Name</b></em>' from the '<em><b>Term</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Glossary.GlossaryTerm} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @return The first {@link QWiki.Glossary.GlossaryTerm} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getTerm()
	 * @generated
	 */
	GlossaryTerm getTerm(String name, boolean ignoreCase);

	/**
	 * Returns the value of the '<em><b>Facilitating Spice Element</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Spice.SpiceElement}.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.SpiceElement#getFacilitatedSection <em>Facilitated Section</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.References.Section#getFacilitatingElement() <em>Facilitating Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitating Spice Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitating Spice Element</em>' reference list.
	 * @see QWiki.References.ReferencesPackage#getSection_FacilitatingSpiceElement()
	 * @see QWiki.Spice.SpiceElement#getFacilitatedSection
	 * @model opposite="facilitatedSection" resolveProxies="false" transient="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<SpiceElement> getFacilitatingSpiceElement();

	/**
	 * Retrieves the first {@link QWiki.Spice.SpiceElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Facilitating Spice Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.SpiceElement} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Spice.SpiceElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFacilitatingSpiceElement()
	 * @generated
	 */
	SpiceElement getFacilitatingSpiceElement(String name);

	/**
	 * Retrieves the first {@link QWiki.Spice.SpiceElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Facilitating Spice Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.SpiceElement} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link QWiki.Spice.SpiceElement} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Spice.SpiceElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getFacilitatingSpiceElement()
	 * @generated
	 */
	SpiceElement getFacilitatingSpiceElement(String name, boolean ignoreCase, EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if (owningReferenceVersion-&gt;notEmpty()) then owningReferenceVersion else owningSection.referenceVersion() endif'"
	 * @generated
	 */
	ReferenceVersion referenceVersion();

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
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='qualifiedNumber() + \'@\' + referenceVersion().objectId()'"
	 * @generated
	 */
	String objectId();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if (owningSection-&gt;notEmpty()) then\r\n  owningSection.qualifiedNumber() + \'.\' + number\r\nelse\r\n  number\r\nendif'"
	 * @generated
	 */
	String qualifiedNumber();

} // Section
