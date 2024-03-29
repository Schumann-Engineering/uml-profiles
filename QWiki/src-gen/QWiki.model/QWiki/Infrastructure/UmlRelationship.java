/**
 */
package QWiki.Infrastructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uml Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Relationship is an abstract concept that specifies some kind of relationship between elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Infrastructure.UmlRelationship#getRelatedElement <em>Related Element</em>}</li>
 * </ul>
 *
 * @see QWiki.Infrastructure.InfrastructurePackage#getUmlRelationship()
 * @model abstract="true"
 * @generated
 */
public interface UmlRelationship extends UmlElement {
	/**
	 * Returns the value of the '<em><b>Related Element</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Infrastructure.UmlElement}.
	 * It is bidirectional and its opposite is '{@link QWiki.Infrastructure.UmlElement#getRelationship <em>Relationship</em>}'.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the elements related by the Relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Element</em>' reference list.
	 * @see QWiki.Infrastructure.InfrastructurePackage#getUmlRelationship_RelatedElement()
	 * @see QWiki.Infrastructure.UmlElement#getRelationship
	 * @model opposite="relationship" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="union"
	 * @generated
	 */
	EList<UmlElement> getRelatedElement();

} // UmlRelationship
