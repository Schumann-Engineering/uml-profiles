/**
 */
package QWiki;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Work Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.GenericWorkProduct#getOwnedWorkProduct <em>Owned Work Product</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getGenericWorkProduct()
 * @model
 * @generated
 */
public interface GenericWorkProduct extends WorkProduct {
	/**
	 * Returns the value of the '<em><b>Owned Work Product</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.WorkProduct}.
	 * It is bidirectional and its opposite is '{@link QWiki.WorkProduct#getOwningWorkProductGroup <em>Owning Work Product Group</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.UmlElement#getOwnedElement() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Work Product</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Work Product</em>' containment reference list.
	 * @see QWiki.QWikiPackage#getGenericWorkProduct_OwnedWorkProduct()
	 * @see QWiki.WorkProduct#getOwningWorkProductGroup
	 * @model opposite="owningWorkProductGroup" containment="true" transient="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<WorkProduct> getOwnedWorkProduct();

} // GenericWorkProduct
