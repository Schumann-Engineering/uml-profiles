/**
 */
package QWiki;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see QWiki.QWikiPackage#getQWikiNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface QWikiNamedElement extends NamedElement, QWikiElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='let namespaces : OrderedSet(UML::Namespace) = self.allNamespaces()-&gt;select(oclIsKindOf(QWiki::QWikiModel)) in\r\nif (namespaces-&gt;notEmpty()) then\r\n  namespaces-&gt;first().oclAsType(QWiki::QWikiModel)\r\nelse\r\n  null\r\nendif'"
	 * @generated
	 */
	QWikiModel qwikiModel();

} // QWikiNamedElement
