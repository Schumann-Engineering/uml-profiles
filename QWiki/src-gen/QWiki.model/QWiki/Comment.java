/**
 */
package QWiki;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Comment#getBody <em>Body</em>}</li>
 *   <li>{@link QWiki.Comment#getOwningElement <em>Owning Element</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getComment()
 * @model
 * @generated
 */
public interface Comment extends Element {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(I18nString)
	 * @see QWiki.QWikiPackage#getComment_Body()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	I18nString getBody();

	/**
	 * Sets the value of the '{@link QWiki.Comment#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(I18nString value);

	/**
	 * Returns the value of the '<em><b>Owning Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Element#getOwnedComment <em>Owned Comment</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Element</em>' container reference.
	 * @see #setOwningElement(Element)
	 * @see QWiki.QWikiPackage#getComment_OwningElement()
	 * @see QWiki.Element#getOwnedComment
	 * @model opposite="ownedComment" transient="false" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	Element getOwningElement();

	/**
	 * Sets the value of the '{@link QWiki.Comment#getOwningElement <em>Owning Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Element</em>' container reference.
	 * @see #getOwningElement()
	 * @generated
	 */
	void setOwningElement(Element value);

} // Comment
