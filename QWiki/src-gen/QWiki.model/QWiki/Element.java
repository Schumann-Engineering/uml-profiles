/**
 */
package QWiki;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An element is a constituent of a model. As such, it has the capability of owning other elements.
 * not self.allOwnedElements()->includes(self)
 * self.mustBeOwned() implies owner->notEmpty()
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Element#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link QWiki.Element#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link QWiki.Element#getOwner <em>Owner</em>}</li>
 *   <li>{@link QWiki.Element#getUuid <em>Uuid</em>}</li>
 *   <li>{@link QWiki.Element#getOid <em>Oid</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='not_own_self has_owner'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL not_own_self='not self.allOwnedElements()-&gt;includes(self)' has_owner='self.mustBeOwned() implies owner-&gt;notEmpty()'"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Comment</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.Comment}.
	 * It is bidirectional and its opposite is '{@link QWiki.Comment#getOwningElement <em>Owning Element</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Element#getOwnedElement() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Comment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Comment</em>' containment reference list.
	 * @see QWiki.QWikiPackage#getElement_OwnedComment()
	 * @see QWiki.Comment#getOwningElement
	 * @model opposite="owningElement" containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Comment> getOwnedComment();

	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Element}.
	 * It is bidirectional and its opposite is '{@link QWiki.Element#getOwner <em>Owner</em>}'.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Element</em>' reference list.
	 * @see QWiki.QWikiPackage#getElement_OwnedElement()
	 * @see QWiki.Element#getOwner
	 * @model opposite="owner" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="union"
	 * @generated
	 */
	EList<Element> getOwnedElement();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Element#getOwnedElement <em>Owned Element</em>}'.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see QWiki.QWikiPackage#getElement_Owner()
	 * @see QWiki.Element#getOwnedElement
	 * @model opposite="ownedElement" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="union"
	 * @generated
	 */
	Element getOwner();

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uuid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #isSetUuid()
	 * @see #unsetUuid()
	 * @see #setUuid(String)
	 * @see QWiki.QWikiPackage#getElement_Uuid()
	 * @model unsettable="true" id="true" required="true" ordered="false"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link QWiki.Element#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #isSetUuid()
	 * @see #unsetUuid()
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

	/**
	 * Unsets the value of the '{@link QWiki.Element#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUuid()
	 * @see #getUuid()
	 * @see #setUuid(String)
	 * @generated
	 */
	void unsetUuid();

	/**
	 * Returns whether the value of the '{@link QWiki.Element#getUuid <em>Uuid</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Uuid</em>' attribute is set.
	 * @see #unsetUuid()
	 * @see #getUuid()
	 * @see #setUuid(String)
	 * @generated
	 */
	boolean isSetUuid();

	/**
	 * Returns the value of the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oid</em>' attribute.
	 * @see QWiki.QWikiPackage#getElement_Oid()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	String getOid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allOwnedElements() gives all of the direct and indirect owned elements of an element.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='ownedElement-&gt;union(ownedElement-&gt;collect(e | e.allOwnedElements()))-&gt;asSet()'"
	 * @generated
	 */
	EList<Element> allOwnedElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query mustBeOwned() indicates whether elements of this type must have an owner. Subclasses of Element that do not require an owner must override this operation.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='true'"
	 * @generated
	 */
	boolean mustBeOwned();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if (owner = null) then\r\n\tnull\r\nelse if (owner.oclIsKindOf(QWikiModel)) then\r\n  owner.oclAsType(QWikiModel)\r\nelse\r\n  owner.model()\r\nendif\r\nendif\r\n  '"
	 * @generated
	 */
	QWikiModel model();

} // Element
