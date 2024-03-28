/**
 */
package QWiki;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A named element is an element in a model that may have a name.
 * (self.name->isEmpty() or self.allNamespaces()->select(ns | ns.name->isEmpty())->notEmpty())
 * implies self.qualifiedName()->isEmpty()
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.NamedElement#getName <em>Name</em>}</li>
 *   <li>{@link QWiki.NamedElement#getAssignedDomain <em>Assigned Domain</em>}</li>
 *   <li>{@link QWiki.NamedElement#getDomain <em>Domain</em>}</li>
 *   <li>{@link QWiki.NamedElement#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link QWiki.NamedElement#getOwningPackage <em>Owning Package</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getNamedElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='has_no_qualified_name'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL has_no_qualified_name='(self.name-&gt;isEmpty() or self.allNamespaces()-&gt;select(ns | ns.name-&gt;isEmpty())-&gt;notEmpty())\r\nimplies self.qualifiedName()-&gt;isEmpty()'"
 * @generated
 */
public interface NamedElement extends TaggedElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see QWiki.QWikiPackage#getNamedElement_Name()
	 * @model ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link QWiki.NamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Assigned Domain</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Domain#getDomainElement <em>Domain Element</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.NamedElement#getDomain() <em>Domain</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Domain</em>' reference.
	 * @see #setAssignedDomain(Domain)
	 * @see QWiki.QWikiPackage#getNamedElement_AssignedDomain()
	 * @see QWiki.Domain#getDomainElement
	 * @model opposite="domainElement" transient="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	Domain getAssignedDomain();

	/**
	 * Sets the value of the '{@link QWiki.NamedElement#getAssignedDomain <em>Assigned Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Domain</em>' reference.
	 * @see #getAssignedDomain()
	 * @generated
	 */
	void setAssignedDomain(Domain value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see QWiki.QWikiPackage#getNamedElement_Domain()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='namedelement'"
	 *        annotation="union"
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Namespace#getOwnedMember <em>Owned Member</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Element#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' reference.
	 * @see #setNamespace(Namespace)
	 * @see QWiki.QWikiPackage#getNamedElement_Namespace()
	 * @see QWiki.Namespace#getOwnedMember
	 * @model opposite="ownedMember" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	Namespace getNamespace();

	/**
	 * Sets the value of the '{@link QWiki.NamedElement#getNamespace <em>Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' reference.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(Namespace value);

	/**
	 * Returns the value of the '<em><b>Owning Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.Package#getPackagedElement <em>Packaged Element</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Package</em>' container reference.
	 * @see #setOwningPackage(QWiki.Package)
	 * @see QWiki.QWikiPackage#getNamedElement_OwningPackage()
	 * @see QWiki.Package#getPackagedElement
	 * @model opposite="packagedElement" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	QWiki.Package getOwningPackage();

	/**
	 * Sets the value of the '{@link QWiki.NamedElement#getOwningPackage <em>Owning Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Package</em>' container reference.
	 * @see #getOwningPackage()
	 * @generated
	 */
	void setOwningPackage(QWiki.Package value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When there is a name, and all of the containing namespaces have a name, the qualified name is constructed from the names of the containing namespaces.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if (self.name-&gt;notEmpty() and self.allNamespaces()-&gt;select(ns | ns.name-&gt;isEmpty())-&gt;isEmpty()) then \r\n    self.allNamespaces()-&gt;iterate( ns : Namespace; result: String = self.name | ns.name + self.separator() + result)\r\nelse\r\n    null\r\nendif'"
	 * @generated
	 */
	String qualifiedName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if (self.namespace-&gt;isEmpty()) then\r\n  Sequence{}\r\nelse\r\n  self.namespace.allNamespaces()-&gt;prepend(self.namespace)\r\nendif'"
	 * @generated
	 */
	EList<Namespace> allNamespaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query separator() gives the string that is used to separate names when constructing a qualified name.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='\'::\''"
	 * @generated
	 */
	String separator();

} // NamedElement
