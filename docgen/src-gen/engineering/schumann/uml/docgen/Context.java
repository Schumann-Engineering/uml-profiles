/**
 */
package engineering.schumann.uml.docgen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.docgen.Context#getUmlElement <em>Uml Element</em>}</li>
 *   <li>{@link engineering.schumann.uml.docgen.Context#getProductName <em>Product Name</em>}</li>
 *   <li>{@link engineering.schumann.uml.docgen.Context#getProductModel <em>Product Model</em>}</li>
 *   <li>{@link engineering.schumann.uml.docgen.Context#getSoftwareVersion <em>Software Version</em>}</li>
 *   <li>{@link engineering.schumann.uml.docgen.Context#getTemplateUUID <em>Template UUID</em>}</li>
 *   <li>{@link engineering.schumann.uml.docgen.Context#getUUID <em>UUID</em>}</li>
 *   <li>{@link engineering.schumann.uml.docgen.Context#getDocumentTitle <em>Document Title</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.docgen.DocGenPackage#getContext()
 * @model
 * @generated
 */
public interface Context extends EObject {
	/**
	 * Returns the value of the '<em><b>Uml Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Element</em>' attribute.
	 * @see #setUmlElement(Object)
	 * @see engineering.schumann.uml.docgen.DocGenPackage#getContext_UmlElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getUmlElement();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.docgen.Context#getUmlElement <em>Uml Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Element</em>' attribute.
	 * @see #getUmlElement()
	 * @generated
	 */
	void setUmlElement(Object value);

	/**
	 * Returns the value of the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Name</em>' attribute.
	 * @see #setProductName(String)
	 * @see engineering.schumann.uml.docgen.DocGenPackage#getContext_ProductName()
	 * @model ordered="false"
	 * @generated
	 */
	String getProductName();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.docgen.Context#getProductName <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Name</em>' attribute.
	 * @see #getProductName()
	 * @generated
	 */
	void setProductName(String value);

	/**
	 * Returns the value of the '<em><b>Product Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Model</em>' attribute.
	 * @see #setProductModel(String)
	 * @see engineering.schumann.uml.docgen.DocGenPackage#getContext_ProductModel()
	 * @model ordered="false"
	 * @generated
	 */
	String getProductModel();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.docgen.Context#getProductModel <em>Product Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Model</em>' attribute.
	 * @see #getProductModel()
	 * @generated
	 */
	void setProductModel(String value);

	/**
	 * Returns the value of the '<em><b>Software Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Version</em>' attribute.
	 * @see #setSoftwareVersion(String)
	 * @see engineering.schumann.uml.docgen.DocGenPackage#getContext_SoftwareVersion()
	 * @model ordered="false"
	 * @generated
	 */
	String getSoftwareVersion();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.docgen.Context#getSoftwareVersion <em>Software Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Version</em>' attribute.
	 * @see #getSoftwareVersion()
	 * @generated
	 */
	void setSoftwareVersion(String value);

	/**
	 * Returns the value of the '<em><b>Template UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template UUID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template UUID</em>' attribute.
	 * @see #setTemplateUUID(String)
	 * @see engineering.schumann.uml.docgen.DocGenPackage#getContext_TemplateUUID()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getTemplateUUID();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.docgen.Context#getTemplateUUID <em>Template UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template UUID</em>' attribute.
	 * @see #getTemplateUUID()
	 * @generated
	 */
	void setTemplateUUID(String value);

	/**
	 * Returns the value of the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UUID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UUID</em>' attribute.
	 * @see #setUUID(String)
	 * @see engineering.schumann.uml.docgen.DocGenPackage#getContext_UUID()
	 * @model id="true" required="true" ordered="false"
	 * @generated
	 */
	String getUUID();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.docgen.Context#getUUID <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UUID</em>' attribute.
	 * @see #getUUID()
	 * @generated
	 */
	void setUUID(String value);

	/**
	 * Returns the value of the '<em><b>Document Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Title</em>' attribute.
	 * @see #setDocumentTitle(String)
	 * @see engineering.schumann.uml.docgen.DocGenPackage#getContext_DocumentTitle()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDocumentTitle();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.docgen.Context#getDocumentTitle <em>Document Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Title</em>' attribute.
	 * @see #getDocumentTitle()
	 * @generated
	 */
	void setDocumentTitle(String value);

} // Context
