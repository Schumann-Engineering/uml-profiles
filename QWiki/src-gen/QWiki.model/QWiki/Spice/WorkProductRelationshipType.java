/**
 */
package QWiki.Spice;

import QWiki.Kernel.QWikiRelationshipType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Product Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Spice.WorkProductRelationshipType#getWorkProductRelationship <em>Work Product Relationship</em>}</li>
 * </ul>
 *
 * @see QWiki.Spice.SPICEPackage#getWorkProductRelationshipType()
 * @model
 * @generated
 */
public interface WorkProductRelationshipType extends QWikiRelationshipType {
	/**
	 * Returns the value of the '<em><b>Work Product Relationship</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Spice.WorkProductRelationship}.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.WorkProductRelationship#getWorkProductRelationshipType <em>Work Product Relationship Type</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Kernel.QWikiRelationshipType#getRelationship() <em>Relationship</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Product Relationship</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Product Relationship</em>' reference list.
	 * @see QWiki.Spice.SPICEPackage#getWorkProductRelationshipType_WorkProductRelationship()
	 * @see QWiki.Spice.WorkProductRelationship#getWorkProductRelationshipType
	 * @model opposite="workProductRelationshipType" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<WorkProductRelationship> getWorkProductRelationship();

} // WorkProductRelationshipType
