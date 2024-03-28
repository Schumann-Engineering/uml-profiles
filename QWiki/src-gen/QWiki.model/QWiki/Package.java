/**
 */
package QWiki;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Package#getNestingPackage <em>Nesting Package</em>}</li>
 *   <li>{@link QWiki.Package#getNestedPackage <em>Nested Package</em>}</li>
 *   <li>{@link QWiki.Package#getPackagedElement <em>Packaged Element</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends Namespace {
	/**
	 * Returns the value of the '<em><b>Nesting Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Package#getNestedPackage <em>Nested Package</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.NamedElement#getOwningPackage() <em>Owning Package</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nesting Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nesting Package</em>' reference.
	 * @see #setNestingPackage(Package)
	 * @see QWiki.QWikiPackage#getPackage_NestingPackage()
	 * @see QWiki.Package#getNestedPackage
	 * @model opposite="nestedPackage" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	Package getNestingPackage();

	/**
	 * Sets the value of the '{@link QWiki.Package#getNestingPackage <em>Nesting Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nesting Package</em>' reference.
	 * @see #getNestingPackage()
	 * @generated
	 */
	void setNestingPackage(Package value);

	/**
	 * Returns the value of the '<em><b>Nested Package</b></em>' reference list.
	 * The list contents are of type {@link QWiki.Package}.
	 * It is bidirectional and its opposite is '{@link QWiki.Package#getNestingPackage <em>Nesting Package</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Package#getPackagedElement() <em>Packaged Element</em>}'</li>
	 * </ul>
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Package</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Package</em>' reference list.
	 * @see QWiki.QWikiPackage#getPackage_NestedPackage()
	 * @see QWiki.Package#getNestingPackage
	 * @model opposite="nestingPackage" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="union"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Package> getNestedPackage();

	/**
	 * Returns the value of the '<em><b>Packaged Element</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.NamedElement}.
	 * It is bidirectional and its opposite is '{@link QWiki.NamedElement#getOwningPackage <em>Owning Package</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Namespace#getOwnedMember() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packaged Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packaged Element</em>' containment reference list.
	 * @see QWiki.QWikiPackage#getPackage_PackagedElement()
	 * @see QWiki.NamedElement#getOwningPackage
	 * @model opposite="owningPackage" containment="true" transient="true" ordered="false"
	 *        extendedMetaData="kind='element'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<NamedElement> getPackagedElement();

} // Package
