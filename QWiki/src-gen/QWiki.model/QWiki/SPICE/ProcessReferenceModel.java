/**
 */
package QWiki.Spice;

import QWiki.Kernel.QWikiContainer;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Reference Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Spice.ProcessReferenceModel#isNonStandard <em>Is Non Standard</em>}</li>
 *   <li>{@link QWiki.Spice.ProcessReferenceModel#getPrmDomain <em>Prm Domain</em>}</li>
 *   <li>{@link QWiki.Spice.ProcessReferenceModel#getOwnedSpiceElement <em>Owned Spice Element</em>}</li>
 * </ul>
 *
 * @see QWiki.Spice.SPICEPackage#getProcessReferenceModel()
 * @model
 * @generated
 */
public interface ProcessReferenceModel extends QWikiContainer {
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
	 * @see QWiki.Spice.SPICEPackage#getProcessReferenceModel_IsNonStandard()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isNonStandard();

	/**
	 * Sets the value of the '{@link QWiki.Spice.ProcessReferenceModel#isNonStandard <em>Is Non Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Non Standard</em>' attribute.
	 * @see #isNonStandard()
	 * @generated
	 */
	void setIsNonStandard(boolean value);

	/**
	 * Returns the value of the '<em><b>Prm Domain</b></em>' attribute.
	 * The literals are from the enumeration {@link QWiki.Spice.ProcessReferenceModelDomain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prm Domain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prm Domain</em>' attribute.
	 * @see QWiki.Spice.ProcessReferenceModelDomain
	 * @see #setPrmDomain(ProcessReferenceModelDomain)
	 * @see QWiki.Spice.SPICEPackage#getProcessReferenceModel_PrmDomain()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ProcessReferenceModelDomain getPrmDomain();

	/**
	 * Sets the value of the '{@link QWiki.Spice.ProcessReferenceModel#getPrmDomain <em>Prm Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prm Domain</em>' attribute.
	 * @see QWiki.Spice.ProcessReferenceModelDomain
	 * @see #getPrmDomain()
	 * @generated
	 */
	void setPrmDomain(ProcessReferenceModelDomain value);

	/**
	 * Returns the value of the '<em><b>Owned Spice Element</b></em>' containment reference list.
	 * The list contents are of type {@link QWiki.Spice.SpiceElement}.
	 * It is bidirectional and its opposite is '{@link QWiki.Spice.SpiceElement#getOwningProcessReferenceModel <em>Owning Process Reference Model</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.eclipse.uml2.uml.Namespace#getOwnedMembers() <em>Owned Member</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Spice Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Spice Element</em>' containment reference list.
	 * @see QWiki.Spice.SPICEPackage#getProcessReferenceModel_OwnedSpiceElement()
	 * @see QWiki.Spice.SpiceElement#getOwningProcessReferenceModel
	 * @model opposite="owningProcessReferenceModel" containment="true" transient="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<SpiceElement> getOwnedSpiceElement();

	/**
	 * Retrieves the first {@link QWiki.Spice.SpiceElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Spice Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.SpiceElement} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Spice.SpiceElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedSpiceElement()
	 * @generated
	 */
	SpiceElement getOwnedSpiceElement(String name);

	/**
	 * Retrieves the first {@link QWiki.Spice.SpiceElement} with the specified '<em><b>Name</b></em>' from the '<em><b>Owned Spice Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link QWiki.Spice.SpiceElement} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link QWiki.Spice.SpiceElement} to retrieve, or <code>null</code>.
	 * @return The first {@link QWiki.Spice.SpiceElement} with the specified '<em><b>Name</b></em>', or <code>null</code>.
	 * @see #getOwnedSpiceElement()
	 * @generated
	 */
	SpiceElement getOwnedSpiceElement(String name, boolean ignoreCase, EClass eClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='\tif (prmDomain = ProcessReferenceModelDomain::Agile) then \'Agl\' else\r\nif (prmDomain = ProcessReferenceModelDomain::Automotive) then \'A\' else\r\nif (prmDomain = ProcessReferenceModelDomain::Cybersecurity) then \'CS\' else\r\nif (prmDomain = ProcessReferenceModelDomain::DataManagement) then \'DM\' else\r\nif (prmDomain = ProcessReferenceModelDomain::Hardware) then \'HW\' else\r\nif (prmDomain = ProcessReferenceModelDomain::ITServices) then \'ITS\' else\r\nif (prmDomain = ProcessReferenceModelDomain::Mechanical) then \'ME\' else\r\nif (prmDomain = ProcessReferenceModelDomain::Medical) then \'M\' else\r\nif (prmDomain = ProcessReferenceModelDomain::Organizational) then \'Org\' else\r\nif (prmDomain = ProcessReferenceModelDomain::Test) then \'T\' else\r\n\'?\'\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif'"
	 * @generated
	 */
	String oidForDomain();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if (isNonStandard = true) then oidForDomain() + \'-xt\' else oidForDomain() + \'\' endif'"
	 * @generated
	 */
	String oid();

} // ProcessReferenceModel
