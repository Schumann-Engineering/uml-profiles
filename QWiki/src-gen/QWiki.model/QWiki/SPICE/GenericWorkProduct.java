/**
 */
package QWiki.Spice;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Work Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Spice.GenericWorkProduct#getOwnedWorkProduct <em>Owned Work Product</em>}</li>
 * </ul>
 *
 * @see QWiki.Spice.SPICEPackage#getGenericWorkProduct()
 * @model
 * @generated
 */
public interface GenericWorkProduct extends WorkProduct {
	/**
	 * Returns the value of the '<em><b>Owned Work Product</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.Spice.WorkProduct}.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.WorkProduct#getOwningWorkProductGroup <em>Owning Work Product Group</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Work Product</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Work Product</em>' containment reference list.
	 * @see QWiki.Spice.SPICEPackage#getGenericWorkProduct_OwnedWorkProduct()
	 * @see QWiki.Spice.WorkProduct#getOwningWorkProductGroup
	 * @model opposite="owningWorkProductGroup" containment="true" transient="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<WorkProduct> getOwnedWorkProduct();

	/**
	 * Retrieves the first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Work Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.WorkProduct} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedWorkProduct()
	 * @generated
	 */
	WorkProduct getOwnedWorkProduct(String name);

	/**
	 * Retrieves the first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Work Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.WorkProduct} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link QWiki.Spice.WorkProduct} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedWorkProduct()
	 * @generated
	 */
	WorkProduct getOwnedWorkProduct(String name, boolean ignoreCase, EClass eClass);

} // GenericWorkProduct
