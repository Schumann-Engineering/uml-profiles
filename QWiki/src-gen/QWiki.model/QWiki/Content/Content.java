/**
 */
package QWiki.Content;

import QWiki.QWikiElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Content.Content#getOwningContent <em>Owning Content</em>}</li>
 * </ul>
 *
 * @see QWiki.Content.ContentPackage#getContent()
 * @model abstract="true"
 * @generated
 */
public interface Content extends QWikiElement {
	/**
	 * Returns the value of the '<em><b>Owning Content</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Content.ContentContainer#getItem <em>Item</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Content</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Content</em>' container reference.
	 * @see #setOwningContent(ContentContainer)
	 * @see QWiki.Content.ContentPackage#getContent_OwningContent()
	 * @see QWiki.Content.ContentContainer#getItem
	 * @model opposite="item" resolveProxies="false" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	ContentContainer getOwningContent();

	/**
	 * Sets the value of the '{@link QWiki.Content.Content#getOwningContent <em>Owning Content</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Content</em>' container reference.
	 * @see #getOwningContent()
	 * @generated
	 */
	void setOwningContent(ContentContainer value);

} // Content
