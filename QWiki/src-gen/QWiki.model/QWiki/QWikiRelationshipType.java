/**
 */
package QWiki;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.QWikiRelationshipType#getRelationship <em>Relationship</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getQWikiRelationshipType()
 * @model abstract="true"
 * @generated
 */
public interface QWikiRelationshipType extends QWikiNamedElement {
	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' reference list.
	 * The list contents are of type {@link QWiki.QWikiRelationship}.
	 * It is bidirectional and its opposite is '{@link QWiki.QWikiRelationship#getRelationshipType <em>Relationship Type</em>}'.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' reference list.
	 * @see QWiki.QWikiPackage#getQWikiRelationshipType_Relationship()
	 * @see QWiki.QWikiRelationship#getRelationshipType
	 * @model opposite="relationshipType" resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="union"
	 *        extendedMetaData="kind='element'"
	 * @generated
	 */
	EList<QWikiRelationship> getRelationship();

} // QWikiRelationshipType
