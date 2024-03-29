/**
 */
package QWiki.Infrastructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uml Directed Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A directed relationship represents a relationship between a collection of source model elements and a collection of target model elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Infrastructure.UmlDirectedRelationship#getTarget <em>Target</em>}</li>
 *   <li>{@link QWiki.Infrastructure.UmlDirectedRelationship#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see QWiki.Infrastructure.InfrastructurePackage#getUmlDirectedRelationship()
 * @model abstract="true"
 * @generated
 */
public interface UmlDirectedRelationship extends UmlRelationship {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Infrastructure.UmlElement}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Infrastructure.UmlRelationship#getRelatedElement() <em>Related Element</em>}'</li>
	 * </ul>
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the targets of the DirectedRelationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see QWiki.Infrastructure.InfrastructurePackage#getUmlDirectedRelationship_Target()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='directedRelationship'"
	 *        annotation="union"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<UmlElement> getTarget();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Infrastructure.UmlElement}.
	 * It is bidirectional and its opposite is '{@link QWiki.Infrastructure.UmlElement#getDirectedRelationship <em>Directed Relationship</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Infrastructure.UmlRelationship#getRelatedElement() <em>Related Element</em>}'</li>
	 * </ul>
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the sources of the DirectedRelationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see QWiki.Infrastructure.InfrastructurePackage#getUmlDirectedRelationship_Source()
	 * @see QWiki.Infrastructure.UmlElement#getDirectedRelationship
	 * @model opposite="directedRelationship" required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="union"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<UmlElement> getSource();

} // UmlDirectedRelationship
