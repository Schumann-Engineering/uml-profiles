/**
 */
package CSMN.Characteristics.Asset;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CSMN.Characteristics.Asset.AssetLibrary#getBase_Package <em>Base Package</em>}</li>
 *   <li>{@link CSMN.Characteristics.Asset.AssetLibrary#getAssetType <em>Asset Type</em>}</li>
 * </ul>
 *
 * @see CSMN.Characteristics.Asset.AssetPackage#getAssetLibrary()
 * @model
 * @generated
 */
public interface AssetLibrary extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' reference.
	 * @see #setBase_Package(org.eclipse.uml2.uml.Package)
	 * @see CSMN.Characteristics.Asset.AssetPackage#getAssetLibrary_Base_Package()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getBase_Package();

	/**
	 * Sets the value of the '{@link CSMN.Characteristics.Asset.AssetLibrary#getBase_Package <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' reference.
	 * @see #getBase_Package()
	 * @generated
	 */
	void setBase_Package(org.eclipse.uml2.uml.Package value);

	/**
	 * Returns the value of the '<em><b>Asset Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CSMN.Characteristics.Asset.AssetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Type</em>' attribute.
	 * @see CSMN.Characteristics.Asset.AssetType
	 * @see #setAssetType(AssetType)
	 * @see CSMN.Characteristics.Asset.AssetPackage#getAssetLibrary_AssetType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AssetType getAssetType();

	/**
	 * Sets the value of the '{@link CSMN.Characteristics.Asset.AssetLibrary#getAssetType <em>Asset Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Type</em>' attribute.
	 * @see CSMN.Characteristics.Asset.AssetType
	 * @see #getAssetType()
	 * @generated
	 */
	void setAssetType(AssetType value);

} // AssetLibrary
