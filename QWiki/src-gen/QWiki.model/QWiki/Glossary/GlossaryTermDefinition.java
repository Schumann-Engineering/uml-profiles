/**
 */
package QWiki.Glossary;

import QWiki.I18N.I18nDescriptiveElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Glossary.GlossaryTermDefinition#getOwningTerm <em>Owning Term</em>}</li>
 * </ul>
 *
 * @see QWiki.Glossary.GlossaryPackage#getGlossaryTermDefinition()
 * @model
 * @generated
 */
public interface GlossaryTermDefinition extends I18nDescriptiveElement {
	/**
	 * Returns the value of the '<em><b>Owning Term</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Glossary.GlossaryTerm#getOwnedTermDefinition <em>Owned Term Definition</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Infrastructure.UmlElement#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Term</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Term</em>' container reference.
	 * @see #setOwningTerm(GlossaryTerm)
	 * @see QWiki.Glossary.GlossaryPackage#getGlossaryTermDefinition_OwningTerm()
	 * @see QWiki.Glossary.GlossaryTerm#getOwnedTermDefinition
	 * @model opposite="ownedTermDefinition" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	GlossaryTerm getOwningTerm();

	/**
	 * Sets the value of the '{@link QWiki.Glossary.GlossaryTermDefinition#getOwningTerm <em>Owning Term</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Term</em>' container reference.
	 * @see #getOwningTerm()
	 * @generated
	 */
	void setOwningTerm(GlossaryTerm value);

} // GlossaryTermDefinition
