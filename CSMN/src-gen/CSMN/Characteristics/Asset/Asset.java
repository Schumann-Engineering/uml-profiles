/**
 */
package CSMN.Characteristics.Asset;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Port;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CSMN.Characteristics.Asset.Asset#getBase_DataType <em>Base Data Type</em>}</li>
 *   <li>{@link CSMN.Characteristics.Asset.Asset#getAssetType <em>Asset Type</em>}</li>
 *   <li>{@link CSMN.Characteristics.Asset.Asset#getBase_Port <em>Base Port</em>}</li>
 * </ul>
 *
 * @see CSMN.Characteristics.Asset.AssetPackage#getAsset()
 * @model
 * @generated
 */
public interface Asset extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Data Type</em>' reference.
	 * @see #setBase_DataType(DataType)
	 * @see CSMN.Characteristics.Asset.AssetPackage#getAsset_Base_DataType()
	 * @model ordered="false"
	 * @generated
	 */
	DataType getBase_DataType();

	/**
	 * Sets the value of the '{@link CSMN.Characteristics.Asset.Asset#getBase_DataType <em>Base Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Data Type</em>' reference.
	 * @see #getBase_DataType()
	 * @generated
	 */
	void setBase_DataType(DataType value);

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
	 * @see CSMN.Characteristics.Asset.AssetPackage#getAsset_AssetType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AssetType getAssetType();

	/**
	 * Sets the value of the '{@link CSMN.Characteristics.Asset.Asset#getAssetType <em>Asset Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Type</em>' attribute.
	 * @see CSMN.Characteristics.Asset.AssetType
	 * @see #getAssetType()
	 * @generated
	 */
	void setAssetType(AssetType value);

	/**
	 * Returns the value of the '<em><b>Base Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Port</em>' reference.
	 * @see #setBase_Port(Port)
	 * @see CSMN.Characteristics.Asset.AssetPackage#getAsset_Base_Port()
	 * @model ordered="false"
	 * @generated
	 */
	Port getBase_Port();

	/**
	 * Sets the value of the '{@link CSMN.Characteristics.Asset.Asset#getBase_Port <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Port</em>' reference.
	 * @see #getBase_Port()
	 * @generated
	 */
	void setBase_Port(Port value);

} // Asset
