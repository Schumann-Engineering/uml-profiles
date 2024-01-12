/**
 */
package engineering.schumann.uml.profile.csmn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.Product#getUdiDi <em>Udi Di</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.Product#getUdiDiBase <em>Udi Di Base</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.Product#getSoftwareVersion <em>Software Version</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getProduct()
 * @model
 * @generated
 */
public interface Product extends CommonPlatformEnumeration {
	/**
	 * Returns the value of the '<em><b>Udi Di</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Udi Di</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Udi Di</em>' attribute.
	 * @see #setUdiDi(String)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getProduct_UdiDi()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getUdiDi();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.Product#getUdiDi <em>Udi Di</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Udi Di</em>' attribute.
	 * @see #getUdiDi()
	 * @generated
	 */
	void setUdiDi(String value);

	/**
	 * Returns the value of the '<em><b>Udi Di Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Udi Di Base</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Udi Di Base</em>' attribute.
	 * @see #setUdiDiBase(String)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getProduct_UdiDiBase()
	 * @model ordered="false"
	 * @generated
	 */
	String getUdiDiBase();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.Product#getUdiDiBase <em>Udi Di Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Udi Di Base</em>' attribute.
	 * @see #getUdiDiBase()
	 * @generated
	 */
	void setUdiDiBase(String value);

	/**
	 * Returns the value of the '<em><b>Software Version</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Version</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Version</em>' attribute list.
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getProduct_SoftwareVersion()
	 * @model ordered="false"
	 * @generated
	 */
	EList<String> getSoftwareVersion();

} // Product
