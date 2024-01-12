/**
 */
package engineering.schumann.uml.profile.csmn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Common Platform Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.CommonPlatformEnumeration#getPlatformType <em>Platform Type</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.CommonPlatformEnumeration#getVendorName <em>Vendor Name</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.CommonPlatformEnumeration#getProductName <em>Product Name</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.CommonPlatformEnumeration#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getCommonPlatformEnumeration()
 * @model
 * @generated
 */
public interface CommonPlatformEnumeration extends EObject {
	/**
	 * Returns the value of the '<em><b>Platform Type</b></em>' attribute.
	 * The default value is <code>"Unspecified"</code>.
	 * The literals are from the enumeration {@link engineering.schumann.uml.profile.csmn.CommonPlatformEnumerationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platform Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform Type</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.CommonPlatformEnumerationType
	 * @see #setPlatformType(CommonPlatformEnumerationType)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getCommonPlatformEnumeration_PlatformType()
	 * @model default="Unspecified" required="true" ordered="false"
	 * @generated
	 */
	CommonPlatformEnumerationType getPlatformType();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.CommonPlatformEnumeration#getPlatformType <em>Platform Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform Type</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.CommonPlatformEnumerationType
	 * @see #getPlatformType()
	 * @generated
	 */
	void setPlatformType(CommonPlatformEnumerationType value);

	/**
	 * Returns the value of the '<em><b>Vendor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vendor Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor Name</em>' attribute.
	 * @see #setVendorName(String)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getCommonPlatformEnumeration_VendorName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getVendorName();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.CommonPlatformEnumeration#getVendorName <em>Vendor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Name</em>' attribute.
	 * @see #getVendorName()
	 * @generated
	 */
	void setVendorName(String value);

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
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getCommonPlatformEnumeration_ProductName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getProductName();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.CommonPlatformEnumeration#getProductName <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Name</em>' attribute.
	 * @see #getProductName()
	 * @generated
	 */
	void setProductName(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getCommonPlatformEnumeration_Model()
	 * @model ordered="false"
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.CommonPlatformEnumeration#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

} // CommonPlatformEnumeration
