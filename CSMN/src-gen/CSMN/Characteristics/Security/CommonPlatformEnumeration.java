/**
 */
package CSMN.Characteristics.Security;

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
 *   <li>{@link CSMN.Characteristics.Security.CommonPlatformEnumeration#getCpeType <em>Cpe Type</em>}</li>
 *   <li>{@link CSMN.Characteristics.Security.CommonPlatformEnumeration#getVendorName <em>Vendor Name</em>}</li>
 *   <li>{@link CSMN.Characteristics.Security.CommonPlatformEnumeration#getProductName <em>Product Name</em>}</li>
 *   <li>{@link CSMN.Characteristics.Security.CommonPlatformEnumeration#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see CSMN.Characteristics.Security.SecurityPackage#getCommonPlatformEnumeration()
 * @model
 * @generated
 */
public interface CommonPlatformEnumeration extends EObject {
	/**
	 * Returns the value of the '<em><b>Cpe Type</b></em>' attribute.
	 * The default value is <code>"Unspecified"</code>.
	 * The literals are from the enumeration {@link CSMN.Characteristics.Security.CommonPlatformEnumerationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpe Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpe Type</em>' attribute.
	 * @see CSMN.Characteristics.Security.CommonPlatformEnumerationType
	 * @see #setCpeType(CommonPlatformEnumerationType)
	 * @see CSMN.Characteristics.Security.SecurityPackage#getCommonPlatformEnumeration_CpeType()
	 * @model default="Unspecified" required="true" ordered="false"
	 * @generated
	 */
	CommonPlatformEnumerationType getCpeType();

	/**
	 * Sets the value of the '{@link CSMN.Characteristics.Security.CommonPlatformEnumeration#getCpeType <em>Cpe Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpe Type</em>' attribute.
	 * @see CSMN.Characteristics.Security.CommonPlatformEnumerationType
	 * @see #getCpeType()
	 * @generated
	 */
	void setCpeType(CommonPlatformEnumerationType value);

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
	 * @see CSMN.Characteristics.Security.SecurityPackage#getCommonPlatformEnumeration_VendorName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getVendorName();

	/**
	 * Sets the value of the '{@link CSMN.Characteristics.Security.CommonPlatformEnumeration#getVendorName <em>Vendor Name</em>}' attribute.
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
	 * @see CSMN.Characteristics.Security.SecurityPackage#getCommonPlatformEnumeration_ProductName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getProductName();

	/**
	 * Sets the value of the '{@link CSMN.Characteristics.Security.CommonPlatformEnumeration#getProductName <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Name</em>' attribute.
	 * @see #getProductName()
	 * @generated
	 */
	void setProductName(String value);

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
	 * @see CSMN.Characteristics.Security.SecurityPackage#getCommonPlatformEnumeration_Version()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link CSMN.Characteristics.Security.CommonPlatformEnumeration#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // CommonPlatformEnumeration
