/**
 */
package QWiki;

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
 *   <li>{@link QWiki.UmlDirectedRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link QWiki.UmlDirectedRelationship#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getUmlDirectedRelationship()
 * @model abstract="true"
 * @generated
 */
public interface UmlDirectedRelationship extends UmlRelationship {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link QWiki.UmlElement}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.UmlRelationship#getRelatedElement() <em>Related Element</em>}'</li>
	 * </ul>
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the sources of the DirectedRelationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see QWiki.QWikiPackage#getUmlDirectedRelationship_Source()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='directedRelationship'"
	 *        annotation="union"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<UmlElement> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link QWiki.UmlElement}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.UmlRelationship#getRelatedElement() <em>Related Element</em>}'</li>
	 * </ul>
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the targets of the DirectedRelationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see QWiki.QWikiPackage#getUmlDirectedRelationship_Target()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='directedRelationship'"
	 *        annotation="union"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<UmlElement> getTarget();

} // UmlDirectedRelationship
