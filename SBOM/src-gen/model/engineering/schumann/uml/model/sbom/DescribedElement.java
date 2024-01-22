/**
 */
package engineering.schumann.uml.model.sbom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Described Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.model.sbom.DescribedElement#getSummary <em>Summary</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.DescribedElement#getDescription <em>Description</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.DescribedElement#getLicense <em>License</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getDescribedElement()
 * @model abstract="true"
 * @generated
 */
public interface DescribedElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getDescribedElement_Summary()
	 * @model ordered="false"
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.model.sbom.DescribedElement#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getDescribedElement_Description()
	 * @model ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.model.sbom.DescribedElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' attribute list.
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getDescribedElement_License()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getLicense();

} // DescribedElement
