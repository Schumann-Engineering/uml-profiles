/**
 */
package QWiki;

import org.eclipse.uml2.uml.DirectedRelationship;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.QWikiRelationship#getRelationshipType <em>Relationship Type</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getQWikiRelationship()
 * @model abstract="true"
 * @generated
 */
public interface QWikiRelationship extends DirectedRelationship, QWikiElement {
	/**
	 * Returns the value of the '<em><b>Relationship Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QWiki.QWikiRelationshipType#getRelationship <em>Relationship</em>}'.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Type</em>' reference.
	 * @see QWiki.QWikiPackage#getQWikiRelationship_RelationshipType()
	 * @see QWiki.QWikiRelationshipType#getRelationship
	 * @model opposite="relationship" resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="union"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	QWikiRelationshipType getRelationshipType();

} // QWikiRelationship
