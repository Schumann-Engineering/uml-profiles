/**
 */
package QWiki;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uml Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A named element is an element in a model that may have a name.
 * (self.name->isEmpty() or self.allNamespaces()->select(ns | ns.name->isEmpty())->notEmpty())
 *   implies self.qualifiedName->isEmpty()
 * (self.name->notEmpty() and self.allNamespaces()->select(ns | ns.name->isEmpty())->isEmpty()) implies
 *   self.qualifiedName = self.allNamespaces()->iterate( ns : UmlNamespace; result: String = self.name | ns.name + self.separator() + result)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.UmlNamedElement#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link QWiki.UmlNamedElement#getName <em>Name</em>}</li>
 *   <li>{@link QWiki.UmlNamedElement#getQualifiedName <em>Qualified Name</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getUmlNamedElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='has_no_qualified_name has_qualified_name'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL has_no_qualified_name='(self.name-&gt;isEmpty() or self.allNamespaces()-&gt;select(ns | ns.name-&gt;isEmpty())-&gt;notEmpty())\r\n  implies self.qualifiedName-&gt;isEmpty()' has_qualified_name='(self.name-&gt;notEmpty() and self.allNamespaces()-&gt;select(ns | ns.name-&gt;isEmpty())-&gt;isEmpty()) implies\n  self.qualifiedName = self.allNamespaces()-&gt;iterate( ns : UmlNamespace; result: String = self.name | ns.name + self.separator() + result)'"
 * @generated
 */
public interface UmlNamedElement extends ModelElement, UmlElement {
	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link QWiki.UmlNamespace#getOwnedMember <em>Owned Member</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.UmlElement#getOwner() <em>Owner</em>}'</li>
	 * </ul>
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the namespace that owns the NamedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Namespace</em>' reference.
	 * @see QWiki.QWikiPackage#getUmlNamedElement_Namespace()
	 * @see QWiki.UmlNamespace#getOwnedMember
	 * @model opposite="ownedMember" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="union"
	 *        annotation="subsets"
	 * @generated
	 */
	UmlNamespace getNamespace();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the NamedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see QWiki.QWikiPackage#getUmlNamedElement_Name()
	 * @model ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link QWiki.UmlNamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name which allows the NamedElement to be identified within a hierarchy of nested Namespaces. It is constructed from the names of the containing namespaces starting at the root of the hierarchy and ending with the name of the NamedElement itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see QWiki.QWikiPackage#getUmlNamedElement_QualifiedName()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allNamespaces() gives the sequence of namespaces in which the NamedElement is nested, working outwards.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if self.namespace-&gt;isEmpty()\nthen Sequence{}\nelse self.namespace.allNamespaces()-&gt;prepend(self.namespace)\nendif'"
	 * @generated
	 */
	EList<UmlNamespace> allNamespaces();

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When there is a name, and all of the containing namespaces have a name, the qualified name is constructed from the names of the containing namespaces.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if (self.name-&gt;notEmpty() and self.allNamespaces()-&gt;select(ns | ns.name &lt;&gt; null)-&gt;isEmpty()) then \n    self.allNamespaces()-&gt;iterate( ns : UmlNamespace; result: String = self.name | ns.name + self.separator() + result)\nelse\n    null\nendif'"
	 * @generated
	 */
	String qualifiedName();

} // UmlNamedElement
