/**
 */
package QWiki;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.QWikiNamedElement#getQwikiNamespace <em>Qwiki Namespace</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getQWikiNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface QWikiNamedElement extends NamedElement, QWikiElement {
	/**
	 * Returns the value of the '<em><b>Qwiki Namespace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link QWiki.QWikiNamespace#getQwikiElement <em>Qwiki Element</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.NamedElement#getNamespace() <em>Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qwiki Namespace</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qwiki Namespace</em>' container reference.
	 * @see #setQwikiNamespace(QWikiNamespace)
	 * @see QWiki.QWikiPackage#getQWikiNamedElement_QwikiNamespace()
	 * @see QWiki.QWikiNamespace#getQwikiElement
	 * @model opposite="qwikiElement" resolveProxies="false" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	QWikiNamespace getQwikiNamespace();

	/**
	 * Sets the value of the '{@link QWiki.QWikiNamedElement#getQwikiNamespace <em>Qwiki Namespace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qwiki Namespace</em>' container reference.
	 * @see #getQwikiNamespace()
	 * @generated
	 */
	void setQwikiNamespace(QWikiNamespace value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='let namespaces : OrderedSet(UML::Namespace) = self.allNamespaces()-&gt;select(oclIsKindOf(QWiki::QWikiModel)) in\r\nif (namespaces-&gt;notEmpty()) then\r\n  namespaces-&gt;first().oclAsType(QWiki::QWikiModel)\r\nelse\r\n  null\r\nendif'"
	 * @generated
	 */
	QWikiModel qwikiModel();

} // QWikiNamedElement
