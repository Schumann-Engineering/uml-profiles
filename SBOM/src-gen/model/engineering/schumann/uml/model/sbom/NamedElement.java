/**
 */
package engineering.schumann.uml.model.sbom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.model.sbom.NamedElement#getName <em>Name</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.NamedElement#getVersion <em>Version</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.NamedElement#getSupplier <em>Supplier</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface NamedElement extends Element {
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
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getNamedElement_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.model.sbom.NamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getNamedElement_Version()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.model.sbom.NamedElement#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier</em>' attribute.
	 * @see #setSupplier(String)
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getNamedElement_Supplier()
	 * @model ordered="false"
	 * @generated
	 */
	String getSupplier();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.model.sbom.NamedElement#getSupplier <em>Supplier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier</em>' attribute.
	 * @see #getSupplier()
	 * @generated
	 */
	void setSupplier(String value);

} // NamedElement
