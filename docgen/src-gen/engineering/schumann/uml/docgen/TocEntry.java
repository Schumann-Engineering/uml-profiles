/**
 */
package engineering.schumann.uml.docgen;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Toc Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.docgen.TocEntry#getId <em>Id</em>}</li>
 *   <li>{@link engineering.schumann.uml.docgen.TocEntry#getDisplayText <em>Display Text</em>}</li>
 *   <li>{@link engineering.schumann.uml.docgen.TocEntry#getChild <em>Child</em>}</li>
 *   <li>{@link engineering.schumann.uml.docgen.TocEntry#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.docgen.DocGenPackage#getTocEntry()
 * @model
 * @generated
 */
public interface TocEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see engineering.schumann.uml.docgen.DocGenPackage#getTocEntry_Id()
	 * @model ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.docgen.TocEntry#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Display Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Text</em>' attribute.
	 * @see #setDisplayText(String)
	 * @see engineering.schumann.uml.docgen.DocGenPackage#getTocEntry_DisplayText()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDisplayText();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.docgen.TocEntry#getDisplayText <em>Display Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Text</em>' attribute.
	 * @see #getDisplayText()
	 * @generated
	 */
	void setDisplayText(String value);

	/**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference list.
	 * The list contents are of type {@link engineering.schumann.uml.docgen.TocEntry}.
	 * It is bidirectional and its opposite is '{@link engineering.schumann.uml.docgen.TocEntry#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference list.
	 * @see engineering.schumann.uml.docgen.DocGenPackage#getTocEntry_Child()
	 * @see engineering.schumann.uml.docgen.TocEntry#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<TocEntry> getChild();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link engineering.schumann.uml.docgen.TocEntry#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TocEntry)
	 * @see engineering.schumann.uml.docgen.DocGenPackage#getTocEntry_Parent()
	 * @see engineering.schumann.uml.docgen.TocEntry#getChild
	 * @model opposite="child" transient="false" ordered="false"
	 * @generated
	 */
	TocEntry getParent();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.docgen.TocEntry#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TocEntry value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * if (parent = null) then
	 * 	1
	 * else
	 * 	parent.depth() + 1
	 * endif
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int depth();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" delimiterRequired="true" delimiterOrdered="false"
	 * @generated
	 */
	String id(String delimiter);

} // TocEntry
