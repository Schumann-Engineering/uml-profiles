/**
 */
package engineering.schumann.uml.model.sbom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.model.sbom.Namespace#getOwnedComponent <em>Owned Component</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.Namespace#getRequiredComponent <em>Required Component</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.Namespace#getType <em>Type</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.Namespace#isSOUP <em>Is SOUP</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.Namespace#getClassificationIec81001_5_1 <em>Classification Iec81001 51</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.Namespace#getClassificationIec62304 <em>Classification Iec62304</em>}</li>
 * </ul>
 *
 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getNamespace()
 * @model abstract="true"
 * @generated
 */
public interface Namespace extends DescribedElement {
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
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getNamespace_OwnedComponent()
	 * @see engineering.schumann.uml.model.sbom.Component#getOwner
	 * @model opposite="owner" containment="true" ordered="false"
	 * @generated
	 */
	EList<Component> getOwnedComponent();

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
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getNamespace_RequiredComponent()
	 * @see engineering.schumann.uml.model.sbom.Component#getRequiredBy
	 * @model opposite="requiredBy" ordered="false"
	 * @generated
	 */
	EList<Component> getRequiredComponent();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link engineering.schumann.uml.model.sbom.NamespaceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see engineering.schumann.uml.model.sbom.NamespaceType
	 * @see #setType(NamespaceType)
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getNamespace_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	NamespaceType getType();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.model.sbom.Namespace#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see engineering.schumann.uml.model.sbom.NamespaceType
	 * @see #getType()
	 * @generated
	 */
	void setType(NamespaceType value);

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
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getNamespace_IsSOUP()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isSOUP();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.model.sbom.Namespace#isSOUP <em>Is SOUP</em>}' attribute.
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
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getNamespace_ClassificationIec81001_5_1()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Iec81001_5_1_Classification getClassificationIec81001_5_1();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.model.sbom.Namespace#getClassificationIec81001_5_1 <em>Classification Iec81001 51</em>}' attribute.
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
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getNamespace_ClassificationIec62304()
	 * @model ordered="false"
	 * @generated
	 */
	Iec62304_Classification getClassificationIec62304();

	/**
	 * Sets the value of the '{@link engineering.schumann.uml.model.sbom.Namespace#getClassificationIec62304 <em>Classification Iec62304</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification Iec62304</em>' attribute.
	 * @see engineering.schumann.uml.model.sbom.Iec62304_Classification
	 * @see #getClassificationIec62304()
	 * @generated
	 */
	void setClassificationIec62304(Iec62304_Classification value);

} // Namespace
