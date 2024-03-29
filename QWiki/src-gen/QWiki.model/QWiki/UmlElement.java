/**
 */
package QWiki;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uml Element</b></em>'.
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
 *   <li>{@link QWiki.UmlElement#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link QWiki.UmlElement#getOwner <em>Owner</em>}</li>
 *   <li>{@link QWiki.UmlElement#getOwnedComment <em>Owned Comment</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getUmlElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='not_own_self has_owner'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL not_own_self='not self.allOwnedElements()-&gt;includes(self)' has_owner='self.mustBeOwned() implies owner-&gt;notEmpty()'"
 * @generated
 */
public interface UmlElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Element</b></em>' reference list.
	 * The list contents are of type {@link QWiki.UmlElement}.
	 * It is bidirectional and its opposite is '{@link QWiki.UmlElement#getOwner <em>Owner</em>}'.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Elements owned by this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Element</em>' reference list.
	 * @see QWiki.QWikiPackage#getUmlElement_OwnedElement()
	 * @see QWiki.UmlElement#getOwner
	 * @model opposite="owner" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="union"
	 * @generated
	 */
	EList<UmlElement> getOwnedElement();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QWiki.UmlElement#getOwnedElement <em>Owned Element</em>}'.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Element that owns this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see QWiki.QWikiPackage#getUmlElement_Owner()
	 * @see QWiki.UmlElement#getOwnedElement
	 * @model opposite="ownedElement" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="union"
	 * @generated
	 */
	UmlElement getOwner();

	/**
	 * Returns the value of the '<em><b>Owned Comment</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.UmlComment}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.UmlElement#getOwnedElement() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Comments owned by this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Comment</em>' containment reference list.
	 * @see QWiki.QWikiPackage#getUmlElement_OwnedComment()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningElement'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<UmlComment> getOwnedComment();

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
	EList<UmlElement> allOwnedElements();

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

} // UmlElement
