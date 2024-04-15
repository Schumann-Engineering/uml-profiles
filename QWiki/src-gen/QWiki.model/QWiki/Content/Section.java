/**
 */
package QWiki.Content;

import QWiki.Glossary.GlossaryTerm;

import QWiki.QWikiElement;

import QWiki.References.ReferenceVersion;

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
 *   <li>{@link QWiki.Content.Section#getTerm <em>Term</em>}</li>
 *   <li>{@link QWiki.Content.Section#getNumber <em>Number</em>}</li>
 *   <li>{@link QWiki.Content.Section#getFacilitatingElement <em>Facilitating Element</em>}</li>
 *   <li>{@link QWiki.Content.Section#getOwningReferenceVersion <em>Owning Reference Version</em>}</li>
 *   <li>{@link QWiki.Content.Section#getFacilitatingSpiceElement <em>Facilitating Spice Element</em>}</li>
 * </ul>
 *
 * @see QWiki.Content.ContentPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends ContentContainer {
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
	 * @see QWiki.Content.ContentPackage#getSection_Term()
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
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see QWiki.Content.ContentPackage#getSection_Number()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link QWiki.Content.Section#getNumber <em>Number</em>}' attribute.
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
	 * @see QWiki.Content.ContentPackage#getSection_FacilitatingElement()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='facilitatedContent'"
	 *        annotation="union"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<QWikiElement> getFacilitatingElement();

	/**
	 * Returns the value of the '<em><b>Owning Reference Version</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.References.ReferenceVersion#getOwnedContent <em>Owned Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Reference Version</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Reference Version</em>' container reference.
	 * @see #setOwningReferenceVersion(ReferenceVersion)
	 * @see QWiki.Content.ContentPackage#getSection_OwningReferenceVersion()
	 * @see QWiki.References.ReferenceVersion#getOwnedContent
	 * @model opposite="ownedContent" resolveProxies="false" ordered="false"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	ReferenceVersion getOwningReferenceVersion();

	/**
	 * Sets the value of the '{@link QWiki.Content.Section#getOwningReferenceVersion <em>Owning Reference Version</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Reference Version</em>' container reference.
	 * @see #getOwningReferenceVersion()
	 * @generated
	 */
	void setOwningReferenceVersion(ReferenceVersion value);

	/**
	 * Returns the value of the '<em><b>Facilitating Spice Element</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Spice.SpiceElement}.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.SpiceElement#getFacilitatedSection <em>Facilitated Section</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Content.Section#getFacilitatingElement() <em>Facilitating Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facilitating Spice Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facilitating Spice Element</em>' reference list.
	 * @see QWiki.Content.ContentPackage#getSection_FacilitatingSpiceElement()
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if (owningSection-&gt;notEmpty()) then\r\n  owningSection.qualifiedNumber() + \'.\' + number\r\nelse\r\n  number\r\nendif'"
	 * @generated
	 */
	String qualifiedNumber();

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
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='qualifiedNumber() + \'@\' + owningReferenceVersion().objectId()'"
	 * @generated
	 */
	String objectId();

} // Section
