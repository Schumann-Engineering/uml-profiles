/**
 */
package engineering.schumann.uml.model.sbom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.model.sbom.Component#getOwnedComponent <em>Owned Component</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.Component#getOwner <em>Owner</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.Component#getRequiredComponent <em>Required Component</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.Component#getRequiredBy <em>Required By</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.Component#getType <em>Type</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.Component#isSOUP <em>Is SOUP</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.Component#getClassificationIec81001_5_1 <em>Classification Iec81001 51</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.Component#getClassificationIec62304 <em>Classification Iec62304</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.Component#getOwningSbom <em>Owning Sbom</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends DescribedElement {
	/**
	 * Returns the value of the '<em><b>Owned Component</b></em>' containment reference list.
	 * The list contents are of type {@link engineering.schumann.uml.model.sbom.Component}.
	 * It is bidirectional and its opposite is '{@link engineering.schumann.uml.model.sbom.Component#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Component</em>' containment reference list.
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getComponent_OwnedComponent()
	 * @see engineering.schumann.uml.model.sbom.Component#getOwner
	 * @model opposite="owner" containment="true" ordered="false"
	 * @generated
	 */
	EList<Component> getOwnedComponent();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link engineering.schumann.uml.model.sbom.Component#getOwnedComponent <em>Owned Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Component)
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getComponent_Owner()
	 * @see engineering.schumann.uml.model.sbom.Component#getOwnedComponent
	 * @model opposite="ownedComponent" transient="false" ordered="false"
	 * @generated
	 */
	Component getOwner();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.model.sbom.Component#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Component value);

	/**
	 * Returns the value of the '<em><b>Required Component</b></em>' reference list.
	 * The list contents are of type {@link engineering.schumann.uml.model.sbom.Component}.
	 * It is bidirectional and its opposite is '{@link engineering.schumann.uml.model.sbom.Component#getRequiredBy <em>Required By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Component</em>' reference list.
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getComponent_RequiredComponent()
	 * @see engineering.schumann.uml.model.sbom.Component#getRequiredBy
	 * @model opposite="requiredBy" ordered="false"
	 * @generated
	 */
	EList<Component> getRequiredComponent();

	/**
	 * Returns the value of the '<em><b>Required By</b></em>' reference list.
	 * The list contents are of type {@link engineering.schumann.uml.model.sbom.Component}.
	 * It is bidirectional and its opposite is '{@link engineering.schumann.uml.model.sbom.Component#getRequiredComponent <em>Required Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required By</em>' reference list.
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getComponent_RequiredBy()
	 * @see engineering.schumann.uml.model.sbom.Component#getRequiredComponent
	 * @model opposite="requiredComponent" ordered="false"
	 * @generated
	 */
	EList<Component> getRequiredBy();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link engineering.schumann.uml.model.sbom.ComponentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see engineering.schumann.uml.model.sbom.ComponentType
	 * @see #setType(ComponentType)
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getComponent_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ComponentType getType();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.model.sbom.Component#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see engineering.schumann.uml.model.sbom.ComponentType
	 * @see #getType()
	 * @generated
	 */
	void setType(ComponentType value);

	/**
	 * Returns the value of the '<em><b>Is SOUP</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is SOUP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is SOUP</em>' attribute.
	 * @see #setIsSOUP(boolean)
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getComponent_IsSOUP()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isSOUP();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.model.sbom.Component#isSOUP <em>Is SOUP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is SOUP</em>' attribute.
	 * @see #isSOUP()
	 * @generated
	 */
	void setIsSOUP(boolean value);

	/**
	 * Returns the value of the '<em><b>Classification Iec81001 51</b></em>' attribute.
	 * The literals are from the enumeration {@link engineering.schumann.uml.model.sbom.Iec81001_5_1_Classification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Iec81001 51</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Iec81001 51</em>' attribute.
	 * @see engineering.schumann.uml.model.sbom.Iec81001_5_1_Classification
	 * @see #setClassificationIec81001_5_1(Iec81001_5_1_Classification)
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getComponent_ClassificationIec81001_5_1()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Iec81001_5_1_Classification getClassificationIec81001_5_1();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.model.sbom.Component#getClassificationIec81001_5_1 <em>Classification Iec81001 51</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Iec81001 51</em>' attribute.
	 * @see engineering.schumann.uml.model.sbom.Iec81001_5_1_Classification
	 * @see #getClassificationIec81001_5_1()
	 * @generated
	 */
	void setClassificationIec81001_5_1(Iec81001_5_1_Classification value);

	/**
	 * Returns the value of the '<em><b>Classification Iec62304</b></em>' attribute.
	 * The literals are from the enumeration {@link engineering.schumann.uml.model.sbom.Iec62304_Classification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification Iec62304</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification Iec62304</em>' attribute.
	 * @see engineering.schumann.uml.model.sbom.Iec62304_Classification
	 * @see #setClassificationIec62304(Iec62304_Classification)
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getComponent_ClassificationIec62304()
	 * @model ordered="false"
	 * @generated
	 */
	Iec62304_Classification getClassificationIec62304();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.model.sbom.Component#getClassificationIec62304 <em>Classification Iec62304</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Iec62304</em>' attribute.
	 * @see engineering.schumann.uml.model.sbom.Iec62304_Classification
	 * @see #getClassificationIec62304()
	 * @generated
	 */
	void setClassificationIec62304(Iec62304_Classification value);

	/**
	 * Returns the value of the '<em><b>Owning Sbom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Sbom</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Sbom</em>' reference.
	 * @see #setOwningSbom(Sbom)
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getComponent_OwningSbom()
	 * @model ordered="false"
	 * @generated
	 */
	Sbom getOwningSbom();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.model.sbom.Component#getOwningSbom <em>Owning Sbom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Sbom</em>' reference.
	 * @see #getOwningSbom()
	 * @generated
	 */
	void setOwningSbom(Sbom value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	Sbom getSbom();

} // Component
