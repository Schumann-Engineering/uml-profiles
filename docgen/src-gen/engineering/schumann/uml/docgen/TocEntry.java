/**
 */
package engineering.schumann.uml.docgen;

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
	 * @model required="true" ordered="false"
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
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(TocEntry)
	 * @see engineering.schumann.uml.docgen.DocGenPackage#getTocEntry_Parent()
	 * @model ordered="false"
	 * @generated
	 */
	TocEntry getParent();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.docgen.TocEntry#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TocEntry value);

} // TocEntry
