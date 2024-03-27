/**
 */
package QWiki;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.TermDefinition#getOwningTerm <em>Owning Term</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getTermDefinition()
 * @model
 * @generated
 */
public interface TermDefinition extends I18nDescriptiveElement {
	/**
	 * Returns the value of the '<em><b>Owning Term</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Term#getOwnedTermDefinition <em>Owned Term Definition</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Term</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Term</em>' container reference.
	 * @see #setOwningTerm(Term)
	 * @see QWiki.QWikiPackage#getTermDefinition_OwningTerm()
	 * @see QWiki.Term#getOwnedTermDefinition
	 * @model opposite="ownedTermDefinition" transient="false" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	Term getOwningTerm();

	/**
	 * Sets the value of the '{@link QWiki.TermDefinition#getOwningTerm <em>Owning Term</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Term</em>' container reference.
	 * @see #getOwningTerm()
	 * @generated
	 */
	void setOwningTerm(Term value);

} // TermDefinition
