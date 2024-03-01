/**
 */
package engineering.schumann.uml.profile.csmn;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.Asset#getBase_NamedElement <em>Base Named Element</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.Asset#getAssetSpec <em>Asset Spec</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.Asset#getAssetType <em>Asset Type</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.Asset#getFlightLevel <em>Flight Level</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.Asset#getAssetCategory <em>Asset Category</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.Asset#getProtectionGoal <em>Protection Goal</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.Asset#getStride <em>Stride</em>}</li>
 *   <li>{@link engineering.schumann.uml.profile.csmn.Asset#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getAsset()
 * @model
 * @generated
 */
public interface Asset extends EObject {
	/**
	 * Returns the value of the '<em><b>Asset Type</b></em>' attribute.
	 * The literals are from the enumeration {@link engineering.schumann.uml.profile.csmn.AssetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Type</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.AssetType
	 * @see #setAssetType(AssetType)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getAsset_AssetType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AssetType getAssetType();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.Asset#getAssetType <em>Asset Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Type</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.AssetType
	 * @see #getAssetType()
	 * @generated
	 */
	void setAssetType(AssetType value);

	/**
	 * Returns the value of the '<em><b>Flight Level</b></em>' attribute.
	 * The literals are from the enumeration {@link engineering.schumann.uml.profile.csmn.AssetFlightLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flight Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flight Level</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.AssetFlightLevel
	 * @see #setFlightLevel(AssetFlightLevel)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getAsset_FlightLevel()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AssetFlightLevel getFlightLevel();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.Asset#getFlightLevel <em>Flight Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flight Level</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.AssetFlightLevel
	 * @see #getFlightLevel()
	 * @generated
	 */
	void setFlightLevel(AssetFlightLevel value);

	/**
	 * Returns the value of the '<em><b>Asset Category</b></em>' attribute.
	 * The literals are from the enumeration {@link engineering.schumann.uml.profile.csmn.AssetCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Category</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.AssetCategory
	 * @see #setAssetCategory(AssetCategory)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getAsset_AssetCategory()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AssetCategory getAssetCategory();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.Asset#getAssetCategory <em>Asset Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Category</em>' attribute.
	 * @see engineering.schumann.uml.profile.csmn.AssetCategory
	 * @see #getAssetCategory()
	 * @generated
	 */
	void setAssetCategory(AssetCategory value);

	/**
	 * Returns the value of the '<em><b>Protection Goal</b></em>' attribute list.
	 * The list contents are of type {@link engineering.schumann.uml.profile.csmn.ProtectionGoal}.
	 * The literals are from the enumeration {@link engineering.schumann.uml.profile.csmn.ProtectionGoal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protection Goal</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protection Goal</em>' attribute list.
	 * @see engineering.schumann.uml.profile.csmn.ProtectionGoal
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getAsset_ProtectionGoal()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ProtectionGoal> getProtectionGoal();

	/**
	 * Returns the value of the '<em><b>Stride</b></em>' attribute list.
	 * The list contents are of type {@link engineering.schumann.uml.profile.csmn.STRIDE}.
	 * The literals are from the enumeration {@link engineering.schumann.uml.profile.csmn.STRIDE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stride</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stride</em>' attribute list.
	 * @see engineering.schumann.uml.profile.csmn.STRIDE
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getAsset_Stride()
	 * @model ordered="false"
	 * @generated
	 */
	EList<STRIDE> getStride();

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' reference list.
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getAsset_Comment()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Comment> getComment();

	/**
	 * Returns the value of the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Named Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Named Element</em>' reference.
	 * @see #setBase_NamedElement(NamedElement)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getAsset_Base_NamedElement()
	 * @model ordered="false"
	 * @generated
	 */
	NamedElement getBase_NamedElement();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.Asset#getBase_NamedElement <em>Base Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Named Element</em>' reference.
	 * @see #getBase_NamedElement()
	 * @generated
	 */
	void setBase_NamedElement(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Asset Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset Spec</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset Spec</em>' attribute.
	 * @see #setAssetSpec(String)
	 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getAsset_AssetSpec()
	 * @model ordered="false"
	 * @generated
	 */
	String getAssetSpec();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.profile.csmn.Asset#getAssetSpec <em>Asset Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset Spec</em>' attribute.
	 * @see #getAssetSpec()
	 * @generated
	 */
	void setAssetSpec(String value);

} // Asset
