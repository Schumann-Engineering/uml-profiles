/**
 */
package QWiki;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Reference Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.ProcessReferenceModel#isNonStandard <em>Is Non Standard</em>}</li>
 *   <li>{@link QWiki.ProcessReferenceModel#getPrmDomain <em>Prm Domain</em>}</li>
 *   <li>{@link QWiki.ProcessReferenceModel#getOwnedSpiceElement <em>Owned Spice Element</em>}</li>
 * </ul>
 *
 * @see QWiki.QWikiPackage#getProcessReferenceModel()
 * @model annotation="duplicates"
 * @generated
 */
public interface ProcessReferenceModel extends I18nDescriptiveElement {
	/**
	 * Returns the value of the '<em><b>Is Non Standard</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Non Standard</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Non Standard</em>' attribute.
	 * @see #setIsNonStandard(boolean)
	 * @see QWiki.QWikiPackage#getProcessReferenceModel_IsNonStandard()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isNonStandard();

	/**
	 * Sets the value of the '{@link QWiki.ProcessReferenceModel#isNonStandard <em>Is Non Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Non Standard</em>' attribute.
	 * @see #isNonStandard()
	 * @generated
	 */
	void setIsNonStandard(boolean value);

	/**
	 * Returns the value of the '<em><b>Prm Domain</b></em>' attribute.
	 * The literals are from the enumeration {@link QWiki.ProcessReferenceModelDomain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prm Domain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prm Domain</em>' attribute.
	 * @see QWiki.ProcessReferenceModelDomain
	 * @see #setPrmDomain(ProcessReferenceModelDomain)
	 * @see QWiki.QWikiPackage#getProcessReferenceModel_PrmDomain()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ProcessReferenceModelDomain getPrmDomain();

	/**
	 * Sets the value of the '{@link QWiki.ProcessReferenceModel#getPrmDomain <em>Prm Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prm Domain</em>' attribute.
	 * @see QWiki.ProcessReferenceModelDomain
	 * @see #getPrmDomain()
	 * @generated
	 */
	void setPrmDomain(ProcessReferenceModelDomain value);

	/**
	 * Returns the value of the '<em><b>Owned Spice Element</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.SpiceElement}.
	 * It is bidirectional and its opposite is '{@link QWiki.SpiceElement#getOwningProcessReferenceModel <em>Owning Process Reference Model</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link QWiki.Element#getOwnedElement() <em>Owned Element</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Spice Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Spice Element</em>' containment reference list.
	 * @see QWiki.QWikiPackage#getProcessReferenceModel_OwnedSpiceElement()
	 * @see QWiki.SpiceElement#getOwningProcessReferenceModel
	 * @model opposite="owningProcessReferenceModel" containment="true" transient="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<SpiceElement> getOwnedSpiceElement();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='\tif (prmDomain = ProcessReferenceModelDomain::Agile) then \'Agl\' else\r\nif (prmDomain = ProcessReferenceModelDomain::Automotive) then \'A\' else\r\nif (prmDomain = ProcessReferenceModelDomain::Cybersecurity) then \'CS\' else\r\nif (prmDomain = ProcessReferenceModelDomain::DataManagement) then \'DM\' else\r\nif (prmDomain = ProcessReferenceModelDomain::Hardware) then \'HW\' else\r\nif (prmDomain = ProcessReferenceModelDomain::ITServices) then \'ITS\' else\r\nif (prmDomain = ProcessReferenceModelDomain::Mechanical) then \'ME\' else\r\nif (prmDomain = ProcessReferenceModelDomain::Medical) then \'M\' else\r\nif (prmDomain = ProcessReferenceModelDomain::Organizational) then \'Org\' else\r\nif (prmDomain = ProcessReferenceModelDomain::Test) then \'T\' else\r\n\'?\'\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif'"
	 * @generated
	 */
	String oidForDomain();

} // ProcessReferenceModel
