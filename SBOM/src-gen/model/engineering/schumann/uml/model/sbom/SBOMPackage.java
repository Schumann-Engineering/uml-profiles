/**
 */
package engineering.schumann.uml.model.sbom;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see engineering.schumann.uml.model.sbom.SBOMFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SBOM'"
 * @generated
 */
public interface SBOMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sbom";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schumann.engineering/sbom/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sbom";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SBOMPackage eINSTANCE = engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl.init();

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.model.sbom.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.model.sbom.impl.ElementImpl
	 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TIMESTAMP = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.model.sbom.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.model.sbom.impl.NamedElementImpl
	 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__REFERENCE = ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__TIMESTAMP = ELEMENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__VERSION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__SUPPLIER = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.model.sbom.impl.DescribedElementImpl <em>Described Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.model.sbom.impl.DescribedElementImpl
	 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getDescribedElement()
	 * @generated
	 */
	int DESCRIBED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT__REFERENCE = NAMED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT__TIMESTAMP = NAMED_ELEMENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT__VERSION = NAMED_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT__SUPPLIER = NAMED_ELEMENT__SUPPLIER;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT__SUMMARY = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT__LICENSE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Described Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Described Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.model.sbom.impl.NamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.model.sbom.impl.NamespaceImpl
	 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getNamespace()
	 * @generated
	 */
	int NAMESPACE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__ID = DESCRIBED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__REFERENCE = DESCRIBED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__TIMESTAMP = DESCRIBED_ELEMENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__NAME = DESCRIBED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__VERSION = DESCRIBED_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__SUPPLIER = DESCRIBED_ELEMENT__SUPPLIER;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__SUMMARY = DESCRIBED_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__DESCRIPTION = DESCRIBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__LICENSE = DESCRIBED_ELEMENT__LICENSE;

	/**
	 * The feature id for the '<em><b>Owned Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__OWNED_COMPONENT = DESCRIBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__REQUIRED_COMPONENT = DESCRIBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__OWNED_PROPERTY = DESCRIBED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__TYPE = DESCRIBED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is SOUP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE__IS_SOUP = DESCRIBED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_FEATURE_COUNT = DESCRIBED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_OPERATION_COUNT = DESCRIBED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.model.sbom.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.model.sbom.impl.SystemImpl
	 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 8;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.model.sbom.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.model.sbom.impl.ComponentImpl
	 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = NAMESPACE__ID;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REFERENCE = NAMESPACE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TIMESTAMP = NAMESPACE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = NAMESPACE__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__VERSION = NAMESPACE__VERSION;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SUPPLIER = NAMESPACE__SUPPLIER;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SUMMARY = NAMESPACE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DESCRIPTION = NAMESPACE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__LICENSE = NAMESPACE__LICENSE;

	/**
	 * The feature id for the '<em><b>Owned Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNED_COMPONENT = NAMESPACE__OWNED_COMPONENT;

	/**
	 * The feature id for the '<em><b>Required Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REQUIRED_COMPONENT = NAMESPACE__REQUIRED_COMPONENT;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNED_PROPERTY = NAMESPACE__OWNED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TYPE = NAMESPACE__TYPE;

	/**
	 * The feature id for the '<em><b>Is SOUP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IS_SOUP = NAMESPACE__IS_SOUP;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = NAMESPACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.model.sbom.impl.PropetyImpl <em>Propety</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.model.sbom.impl.PropetyImpl
	 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getPropety()
	 * @generated
	 */
	int PROPETY = 5;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPETY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPETY__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPETY__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Propety</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPETY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Propety</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPETY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.model.sbom.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.model.sbom.impl.RelationshipImpl
	 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.model.sbom.impl.SbomImpl <em>Sbom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.model.sbom.impl.SbomImpl
	 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getSbom()
	 * @generated
	 */
	int SBOM = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBOM__ID = NAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBOM__REFERENCE = NAMED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBOM__TIMESTAMP = NAMED_ELEMENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBOM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBOM__VERSION = NAMED_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBOM__SUPPLIER = NAMED_ELEMENT__SUPPLIER;

	/**
	 * The feature id for the '<em><b>Owned System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBOM__OWNED_SYSTEM = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBOM__OWNED_RELATIONSHIP = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sbom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBOM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sbom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBOM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ID = NAMESPACE__ID;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__REFERENCE = NAMESPACE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__TIMESTAMP = NAMESPACE__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = NAMESPACE__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__VERSION = NAMESPACE__VERSION;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SUPPLIER = NAMESPACE__SUPPLIER;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__SUMMARY = NAMESPACE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__DESCRIPTION = NAMESPACE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__LICENSE = NAMESPACE__LICENSE;

	/**
	 * The feature id for the '<em><b>Owned Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OWNED_COMPONENT = NAMESPACE__OWNED_COMPONENT;

	/**
	 * The feature id for the '<em><b>Required Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__REQUIRED_COMPONENT = NAMESPACE__REQUIRED_COMPONENT;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OWNED_PROPERTY = NAMESPACE__OWNED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__TYPE = NAMESPACE__TYPE;

	/**
	 * The feature id for the '<em><b>Is SOUP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__IS_SOUP = NAMESPACE__IS_SOUP;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OPERATION_COUNT = NAMESPACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.model.sbom.NamespaceType <em>Namespace Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.model.sbom.NamespaceType
	 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getNamespaceType()
	 * @generated
	 */
	int NAMESPACE_TYPE = 9;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.model.sbom.RelationshipType <em>Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.model.sbom.RelationshipType
	 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getRelationshipType()
	 * @generated
	 */
	int RELATIONSHIP_TYPE = 10;


	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.model.sbom.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see engineering.schumann.uml.model.sbom.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.model.sbom.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see engineering.schumann.uml.model.sbom.Namespace
	 * @generated
	 */
	EClass getNamespace();

	/**
	 * Returns the meta object for the containment reference list '{@link engineering.schumann.uml.model.sbom.Namespace#getOwnedComponent <em>Owned Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Component</em>'.
	 * @see engineering.schumann.uml.model.sbom.Namespace#getOwnedComponent()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_OwnedComponent();

	/**
	 * Returns the meta object for the reference list '{@link engineering.schumann.uml.model.sbom.Namespace#getRequiredComponent <em>Required Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Component</em>'.
	 * @see engineering.schumann.uml.model.sbom.Namespace#getRequiredComponent()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_RequiredComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link engineering.schumann.uml.model.sbom.Namespace#getOwnedProperty <em>Owned Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Property</em>'.
	 * @see engineering.schumann.uml.model.sbom.Namespace#getOwnedProperty()
	 * @see #getNamespace()
	 * @generated
	 */
	EReference getNamespace_OwnedProperty();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.model.sbom.Namespace#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see engineering.schumann.uml.model.sbom.Namespace#getType()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_Type();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.model.sbom.Namespace#isSOUP <em>Is SOUP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is SOUP</em>'.
	 * @see engineering.schumann.uml.model.sbom.Namespace#isSOUP()
	 * @see #getNamespace()
	 * @generated
	 */
	EAttribute getNamespace_IsSOUP();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.model.sbom.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see engineering.schumann.uml.model.sbom.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for enum '{@link engineering.schumann.uml.model.sbom.NamespaceType <em>Namespace Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Namespace Type</em>'.
	 * @see engineering.schumann.uml.model.sbom.NamespaceType
	 * @generated
	 */
	EEnum getNamespaceType();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.model.sbom.DescribedElement <em>Described Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Described Element</em>'.
	 * @see engineering.schumann.uml.model.sbom.DescribedElement
	 * @generated
	 */
	EClass getDescribedElement();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.model.sbom.DescribedElement#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see engineering.schumann.uml.model.sbom.DescribedElement#getSummary()
	 * @see #getDescribedElement()
	 * @generated
	 */
	EAttribute getDescribedElement_Summary();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.model.sbom.DescribedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see engineering.schumann.uml.model.sbom.DescribedElement#getDescription()
	 * @see #getDescribedElement()
	 * @generated
	 */
	EAttribute getDescribedElement_Description();

	/**
	 * Returns the meta object for the attribute list '{@link engineering.schumann.uml.model.sbom.DescribedElement#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>License</em>'.
	 * @see engineering.schumann.uml.model.sbom.DescribedElement#getLicense()
	 * @see #getDescribedElement()
	 * @generated
	 */
	EAttribute getDescribedElement_License();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.model.sbom.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see engineering.schumann.uml.model.sbom.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.model.sbom.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see engineering.schumann.uml.model.sbom.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.model.sbom.NamedElement#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see engineering.schumann.uml.model.sbom.NamedElement#getVersion()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Version();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.model.sbom.NamedElement#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier</em>'.
	 * @see engineering.schumann.uml.model.sbom.NamedElement#getSupplier()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Supplier();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.model.sbom.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see engineering.schumann.uml.model.sbom.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.model.sbom.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see engineering.schumann.uml.model.sbom.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.model.sbom.Element#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see engineering.schumann.uml.model.sbom.Element#getTimestamp()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Timestamp();

	/**
	 * Returns the meta object for the attribute list '{@link engineering.schumann.uml.model.sbom.Element#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Reference</em>'.
	 * @see engineering.schumann.uml.model.sbom.Element#getReference()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Reference();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.model.sbom.Propety <em>Propety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Propety</em>'.
	 * @see engineering.schumann.uml.model.sbom.Propety
	 * @generated
	 */
	EClass getPropety();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.model.sbom.Propety#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see engineering.schumann.uml.model.sbom.Propety#getKey()
	 * @see #getPropety()
	 * @generated
	 */
	EAttribute getPropety_Key();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.model.sbom.Propety#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see engineering.schumann.uml.model.sbom.Propety#getValue()
	 * @see #getPropety()
	 * @generated
	 */
	EAttribute getPropety_Value();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.model.sbom.Propety#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see engineering.schumann.uml.model.sbom.Propety#getType()
	 * @see #getPropety()
	 * @generated
	 */
	EAttribute getPropety_Type();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.model.sbom.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see engineering.schumann.uml.model.sbom.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.model.sbom.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see engineering.schumann.uml.model.sbom.Relationship#getSource()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.model.sbom.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see engineering.schumann.uml.model.sbom.Relationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Target();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.model.sbom.Relationship#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see engineering.schumann.uml.model.sbom.Relationship#getType()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Type();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.model.sbom.Sbom <em>Sbom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sbom</em>'.
	 * @see engineering.schumann.uml.model.sbom.Sbom
	 * @generated
	 */
	EClass getSbom();

	/**
	 * Returns the meta object for the containment reference list '{@link engineering.schumann.uml.model.sbom.Sbom#getOwnedSystem <em>Owned System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned System</em>'.
	 * @see engineering.schumann.uml.model.sbom.Sbom#getOwnedSystem()
	 * @see #getSbom()
	 * @generated
	 */
	EReference getSbom_OwnedSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link engineering.schumann.uml.model.sbom.Sbom#getOwnedRelationship <em>Owned Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Relationship</em>'.
	 * @see engineering.schumann.uml.model.sbom.Sbom#getOwnedRelationship()
	 * @see #getSbom()
	 * @generated
	 */
	EReference getSbom_OwnedRelationship();

	/**
	 * Returns the meta object for enum '{@link engineering.schumann.uml.model.sbom.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relationship Type</em>'.
	 * @see engineering.schumann.uml.model.sbom.RelationshipType
	 * @generated
	 */
	EEnum getRelationshipType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SBOMFactory getSBOMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.model.sbom.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.model.sbom.impl.ComponentImpl
		 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.model.sbom.impl.NamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.model.sbom.impl.NamespaceImpl
		 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getNamespace()
		 * @generated
		 */
		EClass NAMESPACE = eINSTANCE.getNamespace();

		/**
		 * The meta object literal for the '<em><b>Owned Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__OWNED_COMPONENT = eINSTANCE.getNamespace_OwnedComponent();

		/**
		 * The meta object literal for the '<em><b>Required Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__REQUIRED_COMPONENT = eINSTANCE.getNamespace_RequiredComponent();

		/**
		 * The meta object literal for the '<em><b>Owned Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMESPACE__OWNED_PROPERTY = eINSTANCE.getNamespace_OwnedProperty();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE__TYPE = eINSTANCE.getNamespace_Type();

		/**
		 * The meta object literal for the '<em><b>Is SOUP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMESPACE__IS_SOUP = eINSTANCE.getNamespace_IsSOUP();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.model.sbom.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.model.sbom.impl.SystemImpl
		 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.model.sbom.NamespaceType <em>Namespace Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.model.sbom.NamespaceType
		 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getNamespaceType()
		 * @generated
		 */
		EEnum NAMESPACE_TYPE = eINSTANCE.getNamespaceType();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.model.sbom.impl.DescribedElementImpl <em>Described Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.model.sbom.impl.DescribedElementImpl
		 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getDescribedElement()
		 * @generated
		 */
		EClass DESCRIBED_ELEMENT = eINSTANCE.getDescribedElement();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBED_ELEMENT__SUMMARY = eINSTANCE.getDescribedElement_Summary();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBED_ELEMENT__DESCRIPTION = eINSTANCE.getDescribedElement_Description();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBED_ELEMENT__LICENSE = eINSTANCE.getDescribedElement_License();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.model.sbom.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.model.sbom.impl.NamedElementImpl
		 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__VERSION = eINSTANCE.getNamedElement_Version();

		/**
		 * The meta object literal for the '<em><b>Supplier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__SUPPLIER = eINSTANCE.getNamedElement_Supplier();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.model.sbom.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.model.sbom.impl.ElementImpl
		 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ID = eINSTANCE.getElement_Id();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TIMESTAMP = eINSTANCE.getElement_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__REFERENCE = eINSTANCE.getElement_Reference();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.model.sbom.impl.PropetyImpl <em>Propety</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.model.sbom.impl.PropetyImpl
		 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getPropety()
		 * @generated
		 */
		EClass PROPETY = eINSTANCE.getPropety();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPETY__KEY = eINSTANCE.getPropety_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPETY__VALUE = eINSTANCE.getPropety_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPETY__TYPE = eINSTANCE.getPropety_Type();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.model.sbom.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.model.sbom.impl.RelationshipImpl
		 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__SOURCE = eINSTANCE.getRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__TYPE = eINSTANCE.getRelationship_Type();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.model.sbom.impl.SbomImpl <em>Sbom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.model.sbom.impl.SbomImpl
		 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getSbom()
		 * @generated
		 */
		EClass SBOM = eINSTANCE.getSbom();

		/**
		 * The meta object literal for the '<em><b>Owned System</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SBOM__OWNED_SYSTEM = eINSTANCE.getSbom_OwnedSystem();

		/**
		 * The meta object literal for the '<em><b>Owned Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SBOM__OWNED_RELATIONSHIP = eINSTANCE.getSbom_OwnedRelationship();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.model.sbom.RelationshipType <em>Relationship Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.model.sbom.RelationshipType
		 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getRelationshipType()
		 * @generated
		 */
		EEnum RELATIONSHIP_TYPE = eINSTANCE.getRelationshipType();

	}

} //SBOMPackage
