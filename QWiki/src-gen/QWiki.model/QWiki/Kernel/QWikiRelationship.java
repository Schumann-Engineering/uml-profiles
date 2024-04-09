/**
 */
package QWiki.Kernel;

import org.eclipse.uml2.uml.DirectedRelationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QWiki Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Kernel.QWikiRelationship#getRelationshipType <em>Relationship Type</em>}</li>
 * </ul>
 *
 * @see QWiki.Kernel.KernelPackage#getQWikiRelationship()
 * @model abstract="true"
 * @generated
 */
public interface QWikiRelationship extends DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Relationship Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Kernel.QWikiRelationshipType#getRelationship <em>Relationship</em>}'.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Type</em>' reference.
	 * @see QWiki.Kernel.KernelPackage#getQWikiRelationship_RelationshipType()
	 * @see QWiki.Kernel.QWikiRelationshipType#getRelationship
	 * @model opposite="relationship" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="union"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	QWikiRelationshipType getRelationshipType();

} // QWikiRelationship
