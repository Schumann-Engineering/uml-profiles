/**
 */
package QWiki.Infrastructure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uml Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A package is used to group elements, and provides a namespace for the grouped elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Infrastructure.UmlPackage#getPackagedElement <em>Packaged Element</em>}</li>
 *   <li>{@link QWiki.Infrastructure.UmlPackage#getNestedPackage <em>Nested Package</em>}</li>
 *   <li>{@link QWiki.Infrastructure.UmlPackage#getNestingPackage <em>Nesting Package</em>}</li>
 * </ul>
 *
 * @see QWiki.Infrastructure.InfrastructurePackage#getUmlPackage()
 * @model annotation="duplicates"
 * @generated
 */
public interface UmlPackage extends UmlNamespace, UmlPackageableElement {
	/**
	 * Returns the value of the '<em><b>Packaged Element</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.Infrastructure.UmlPackageableElement}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Infrastructure.UmlNamespace#getOwnedMember() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the packageable elements that are owned by this Package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Packaged Element</em>' containment reference list.
	 * @see QWiki.Infrastructure.InfrastructurePackage#getUmlPackage_PackagedElement()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningPackage'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<UmlPackageableElement> getPackagedElement();

	/**
	 * Returns the value of the '<em><b>Nested Package</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Infrastructure.UmlPackage}.
	 * It is bidirectional and its opposite is '{@link QWiki.Infrastructure.UmlPackage#getNestingPackage <em>Nesting Package</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Infrastructure.UmlPackage#getPackagedElement() <em>Packaged Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the packaged elements that are Packages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Package</em>' reference list.
	 * @see QWiki.Infrastructure.InfrastructurePackage#getUmlPackage_NestedPackage()
	 * @see QWiki.Infrastructure.UmlPackage#getNestingPackage
	 * @model opposite="nestingPackage" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<UmlPackage> getNestedPackage();

	/**
	 * Returns the value of the '<em><b>Nesting Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Infrastructure.UmlPackage#getNestedPackage <em>Nested Package</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Infrastructure.UmlNamedElement#getNamespace() <em>Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Package that owns this Package.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nesting Package</em>' reference.
	 * @see #setNestingPackage(UmlPackage)
	 * @see QWiki.Infrastructure.InfrastructurePackage#getUmlPackage_NestingPackage()
	 * @see QWiki.Infrastructure.UmlPackage#getNestedPackage
	 * @model opposite="nestedPackage" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	UmlPackage getNestingPackage();

	/**
	 * Sets the value of the '{@link QWiki.Infrastructure.UmlPackage#getNestingPackage <em>Nesting Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nesting Package</em>' reference.
	 * @see #getNestingPackage()
	 * @generated
	 */
	void setNestingPackage(UmlPackage value);

} // UmlPackage
