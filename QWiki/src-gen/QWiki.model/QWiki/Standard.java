/**
 */
package QWiki;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see QWiki.QWikiPackage#getStandard()
 * @model
 * @generated
 */
public interface Standard extends Document {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='author-&gt;select(authorType = StandardsDevelopmentOrganization)'"
	 * @generated
	 */
	EList<Author> sdo();

} // Standard
