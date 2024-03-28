/**
 */
package QWiki;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.QWikiModel#getOwnedModelElement <em>Owned Model Element</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getQWikiModel()
 * @model annotation="duplicates"
 * @generated
 */
public interface QWikiModel extends Element {

	/**
	 * Returns the value of the '<em><b>Owned Model Element</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.Element}.
	 * It is bidirectional and its opposite is '{@link QWiki.Element#getModel <em>Model</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Element#getOwnedElement() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Model Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Model Element</em>' containment reference list.
	 * @see QWiki.QWikiPackage#getQWikiModel_OwnedModelElement()
	 * @see QWiki.Element#getModel
	 * @model opposite="model" containment="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Element> getOwnedModelElement();

} // QWikiModel
