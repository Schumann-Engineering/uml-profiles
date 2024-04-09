/**
 */
package QWiki.Spice;

import QWiki.Kernel.QWikiRelationship;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Product Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Spice.WorkProductRelationship#getLinkingWorkProduct <em>Linking Work Product</em>}</li>
 *   <li>{@link QWiki.Spice.WorkProductRelationship#getWorkProductRelationshipType <em>Work Product Relationship Type</em>}</li>
 *   <li>{@link QWiki.Spice.WorkProductRelationship#getLinkedWorkProduct <em>Linked Work Product</em>}</li>
 * </ul>
 *
 * @see QWiki.Spice.SPICEPackage#getWorkProductRelationship()
 * @model
 * @generated
 */
public interface WorkProductRelationship extends QWikiRelationship {
	/**
	 * Returns the value of the '<em><b>Linking Work Product</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.DirectedRelationship#getSources() <em>Source</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linking Work Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linking Work Product</em>' reference.
	 * @see #setLinkingWorkProduct(WorkProduct)
	 * @see QWiki.Spice.SPICEPackage#getWorkProductRelationship_LinkingWorkProduct()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='workproductlink'"
	 *        annotation="subsets"
	 * @generated
	 */
	WorkProduct getLinkingWorkProduct();

	/**
	 * Sets the value of the '{@link QWiki.Spice.WorkProductRelationship#getLinkingWorkProduct <em>Linking Work Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linking Work Product</em>' reference.
	 * @see #getLinkingWorkProduct()
	 * @generated
	 */
	void setLinkingWorkProduct(WorkProduct value);

	/**
	 * Returns the value of the '<em><b>Work Product Relationship Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.WorkProductRelationshipType#getWorkProductRelationship <em>Work Product Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Product Relationship Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Product Relationship Type</em>' reference.
	 * @see #setWorkProductRelationshipType(WorkProductRelationshipType)
	 * @see QWiki.Spice.SPICEPackage#getWorkProductRelationship_WorkProductRelationshipType()
	 * @see QWiki.Spice.WorkProductRelationshipType#getWorkProductRelationship
	 * @model opposite="workProductRelationship" ordered="false"
	 * @generated
	 */
	WorkProductRelationshipType getWorkProductRelationshipType();

	/**
	 * Sets the value of the '{@link QWiki.Spice.WorkProductRelationship#getWorkProductRelationshipType <em>Work Product Relationship Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Product Relationship Type</em>' reference.
	 * @see #getWorkProductRelationshipType()
	 * @generated
	 */
	void setWorkProductRelationshipType(WorkProductRelationshipType value);

	/**
	 * Returns the value of the '<em><b>Linked Work Product</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Spice.WorkProduct}.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.WorkProduct#getLink <em>Link</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.DirectedRelationship#getTargets() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Work Product</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Work Product</em>' reference list.
	 * @see QWiki.Spice.SPICEPackage#getWorkProductRelationship_LinkedWorkProduct()
	 * @see QWiki.Spice.WorkProduct#getLink
	 * @model opposite="link" required="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<WorkProduct> getLinkedWorkProduct();

	/**
	 * Retrieves the first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>' from the '<em><b>Linked Work Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.WorkProduct} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getLinkedWorkProduct()
	 * @generated
	 */
	WorkProduct getLinkedWorkProduct(String name);

	/**
	 * Retrieves the first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>' from the '<em><b>Linked Work Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.WorkProduct} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link QWiki.Spice.WorkProduct} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Spice.WorkProduct} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getLinkedWorkProduct()
	 * @generated
	 */
	WorkProduct getLinkedWorkProduct(String name, boolean ignoreCase, EClass eClass);

} // WorkProductRelationship
