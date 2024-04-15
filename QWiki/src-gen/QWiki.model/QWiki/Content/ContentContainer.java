/**
 */
package QWiki.Content;

import QWiki.L10nString;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Namespace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Content.ContentContainer#getCaption <em>Caption</em>}</li>
 *   <li>{@link QWiki.Content.ContentContainer#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see QWiki.Content.ContentPackage#getContentContainer()
 * @model abstract="true"
 * @generated
 */
public interface ContentContainer extends Namespace, Content {
	/**
	 * Returns the value of the '<em><b>Caption</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Caption</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Caption</em>' reference.
	 * @see #setCaption(L10nString)
	 * @see QWiki.Content.ContentPackage#getContentContainer_Caption()
	 * @model ordered="false"
	 * @generated
	 */
	L10nString getCaption();

	/**
	 * Sets the value of the '{@link QWiki.Content.ContentContainer#getCaption <em>Caption</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Caption</em>' reference.
	 * @see #getCaption()
	 * @generated
	 */
	void setCaption(L10nString value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.Content.Content}.
	 * It is bidirectional and its opposite is '{@link QWiki.Content.Content#getOwningContent <em>Owning Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see QWiki.Content.ContentPackage#getContentContainer_Item()
	 * @see QWiki.Content.Content#getOwningContent
	 * @model opposite="owningContent" containment="true" ordered="false"
	 * @generated
	 */
	EList<Content> getItem();

} // ContentContainer
