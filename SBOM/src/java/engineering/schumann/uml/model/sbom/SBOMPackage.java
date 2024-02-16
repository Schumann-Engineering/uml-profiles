/**
 */
package engineering.schumann.uml.model.sbom;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
	int ELEMENT = 2;

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
	 * The feature id for the '<em><b>Owned Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OWNED_PROPERTY = 3;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 4;

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
	int NAMED_ELEMENT = 1;

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
	 * The feature id for the '<em><b>Owned Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__OWNED_PROPERTY = ELEMENT__OWNED_PROPERTY;

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
	int DESCRIBED_ELEMENT = 0;

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
	 * The feature id for the '<em><b>Owned Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT__OWNED_PROPERTY = NAMED_ELEMENT__OWNED_PROPERTY;

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
	 * The feature id for the '<em><b>License</b></em>' attribute.
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
	 * The meta object id for the '{@link engineering.schumann.uml.model.sbom.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.model.sbom.impl.PropertyImpl
	 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.model.sbom.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.model.sbom.impl.ComponentImpl
	 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ID = DESCRIBED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REFERENCE = DESCRIBED_ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TIMESTAMP = DESCRIBED_ELEMENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNED_PROPERTY = DESCRIBED_ELEMENT__OWNED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = DESCRIBED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__VERSION = DESCRIBED_ELEMENT__VERSION;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SUPPLIER = DESCRIBED_ELEMENT__SUPPLIER;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__SUMMARY = DESCRIBED_ELEMENT__SUMMARY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DESCRIPTION = DESCRIBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__LICENSE = DESCRIBED_ELEMENT__LICENSE;

	/**
	 * The feature id for the '<em><b>Owned Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNED_COMPONENT = DESCRIBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNER = DESCRIBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REQUIRED_COMPONENT = DESCRIBED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Required By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__REQUIRED_BY = DESCRIBED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TYPE = DESCRIBED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is SOUP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IS_SOUP = DESCRIBED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Classification Iec81001 51</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CLASSIFICATION_IEC81001_51 = DESCRIBED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Classification Iec62304</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CLASSIFICATION_IEC62304 = DESCRIBED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owning Sbom</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__OWNING_SBOM = DESCRIBED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = DESCRIBED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Sbom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT___GET_SBOM = DESCRIBED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = DESCRIBED_ELEMENT_OPERATION_COUNT + 1;

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
	 * The meta object id for the '{@link engineering.schumann.uml.model.sbom.impl.SbomImpl <em>Sbom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.model.sbom.impl.SbomImpl
	 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getSbom()
	 * @generated
	 */
	int SBOM = 5;

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
	 * The feature id for the '<em><b>Owned Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBOM__OWNED_PROPERTY = NAMED_ELEMENT__OWNED_PROPERTY;

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
	 * The feature id for the '<em><b>Owned Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBOM__OWNED_RELATIONSHIP = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SBOM__OWNED_COMPONENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link engineering.schumann.uml.model.sbom.impl.MetadataLibraryImpl <em>Metadata Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.model.sbom.impl.MetadataLibraryImpl
	 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getMetadataLibrary()
	 * @generated
	 */
	int METADATA_LIBRARY = 7;

	/**
	 * The feature id for the '<em><b>Artifact Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_LIBRARY__ARTIFACT_META = 0;

	/**
	 * The feature id for the '<em><b>Supplier Meta</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_LIBRARY__SUPPLIER_META = 1;

	/**
	 * The number of structural features of the '<em>Metadata Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_LIBRARY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Metadata Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.model.sbom.impl.ArtifactMetadataImpl <em>Artifact Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.model.sbom.impl.ArtifactMetadataImpl
	 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getArtifactMetadata()
	 * @generated
	 */
	int ARTIFACT_METADATA = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_METADATA__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_METADATA__REFERENCE = ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_METADATA__TIMESTAMP = ELEMENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_METADATA__OWNED_PROPERTY = ELEMENT__OWNED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Supplier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_METADATA__SUPPLIER = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Library</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_METADATA__LIBRARY = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Artifact Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_METADATA_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Artifact Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_METADATA_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.model.sbom.impl.SupplierMetadataImpl <em>Supplier Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.model.sbom.impl.SupplierMetadataImpl
	 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getSupplierMetadata()
	 * @generated
	 */
	int SUPPLIER_METADATA = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_METADATA__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_METADATA__REFERENCE = ELEMENT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_METADATA__TIMESTAMP = ELEMENT__TIMESTAMP;

	/**
	 * The feature id for the '<em><b>Owned Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_METADATA__OWNED_PROPERTY = ELEMENT__OWNED_PROPERTY;

	/**
	 * The feature id for the '<em><b>Library</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_METADATA__LIBRARY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_METADATA__COMPONENT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Supplier Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_METADATA_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Supplier Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_METADATA_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.model.sbom.ComponentType <em>Component Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.model.sbom.ComponentType
	 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getComponentType()
	 * @generated
	 */
	int COMPONENT_TYPE = 10;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.model.sbom.Iec81001_5_1_Classification <em>Iec81001 51Classification</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.model.sbom.Iec81001_5_1_Classification
	 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getIec81001_5_1_Classification()
	 * @generated
	 */
	int IEC81001_51CLASSIFICATION = 11;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.model.sbom.Iec62304_Classification <em>Iec62304 Classification</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.model.sbom.Iec62304_Classification
	 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getIec62304_Classification()
	 * @generated
	 */
	int IEC62304_CLASSIFICATION = 12;

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.model.sbom.RelationshipType <em>Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.model.sbom.RelationshipType
	 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getRelationshipType()
	 * @generated
	 */
	int RELATIONSHIP_TYPE = 13;


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
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.model.sbom.DescribedElement#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
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
	 * Returns the meta object for the containment reference list '{@link engineering.schumann.uml.model.sbom.Element#getOwnedProperty <em>Owned Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Property</em>'.
	 * @see engineering.schumann.uml.model.sbom.Element#getOwnedProperty()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_OwnedProperty();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.model.sbom.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see engineering.schumann.uml.model.sbom.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.model.sbom.Property#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see engineering.schumann.uml.model.sbom.Property#getKey()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Key();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.model.sbom.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see engineering.schumann.uml.model.sbom.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.model.sbom.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see engineering.schumann.uml.model.sbom.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Type();

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
	 * Returns the meta object for the containment reference list '{@link engineering.schumann.uml.model.sbom.Component#getOwnedComponent <em>Owned Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Component</em>'.
	 * @see engineering.schumann.uml.model.sbom.Component#getOwnedComponent()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_OwnedComponent();

	/**
	 * Returns the meta object for the container reference '{@link engineering.schumann.uml.model.sbom.Component#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see engineering.schumann.uml.model.sbom.Component#getOwner()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Owner();

	/**
	 * Returns the meta object for the reference list '{@link engineering.schumann.uml.model.sbom.Component#getRequiredComponent <em>Required Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Component</em>'.
	 * @see engineering.schumann.uml.model.sbom.Component#getRequiredComponent()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_RequiredComponent();

	/**
	 * Returns the meta object for the reference list '{@link engineering.schumann.uml.model.sbom.Component#getRequiredBy <em>Required By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required By</em>'.
	 * @see engineering.schumann.uml.model.sbom.Component#getRequiredBy()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_RequiredBy();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.model.sbom.Component#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see engineering.schumann.uml.model.sbom.Component#getType()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Type();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.model.sbom.Component#isSOUP <em>Is SOUP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is SOUP</em>'.
	 * @see engineering.schumann.uml.model.sbom.Component#isSOUP()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_IsSOUP();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.model.sbom.Component#getClassificationIec81001_5_1 <em>Classification Iec81001 51</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification Iec81001 51</em>'.
	 * @see engineering.schumann.uml.model.sbom.Component#getClassificationIec81001_5_1()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ClassificationIec81001_5_1();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.model.sbom.Component#getClassificationIec62304 <em>Classification Iec62304</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classification Iec62304</em>'.
	 * @see engineering.schumann.uml.model.sbom.Component#getClassificationIec62304()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_ClassificationIec62304();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.model.sbom.Component#getOwningSbom <em>Owning Sbom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owning Sbom</em>'.
	 * @see engineering.schumann.uml.model.sbom.Component#getOwningSbom()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_OwningSbom();

	/**
	 * Returns the meta object for the '{@link engineering.schumann.uml.model.sbom.Component#getSbom() <em>Get Sbom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Sbom</em>' operation.
	 * @see engineering.schumann.uml.model.sbom.Component#getSbom()
	 * @generated
	 */
	EOperation getComponent__GetSbom();

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
	 * Returns the meta object for the containment reference list '{@link engineering.schumann.uml.model.sbom.Sbom#getOwnedComponent <em>Owned Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Component</em>'.
	 * @see engineering.schumann.uml.model.sbom.Sbom#getOwnedComponent()
	 * @see #getSbom()
	 * @generated
	 */
	EReference getSbom_OwnedComponent();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.model.sbom.MetadataLibrary <em>Metadata Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata Library</em>'.
	 * @see engineering.schumann.uml.model.sbom.MetadataLibrary
	 * @generated
	 */
	EClass getMetadataLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link engineering.schumann.uml.model.sbom.MetadataLibrary#getArtifactMeta <em>Artifact Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact Meta</em>'.
	 * @see engineering.schumann.uml.model.sbom.MetadataLibrary#getArtifactMeta()
	 * @see #getMetadataLibrary()
	 * @generated
	 */
	EReference getMetadataLibrary_ArtifactMeta();

	/**
	 * Returns the meta object for the containment reference list '{@link engineering.schumann.uml.model.sbom.MetadataLibrary#getSupplierMeta <em>Supplier Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supplier Meta</em>'.
	 * @see engineering.schumann.uml.model.sbom.MetadataLibrary#getSupplierMeta()
	 * @see #getMetadataLibrary()
	 * @generated
	 */
	EReference getMetadataLibrary_SupplierMeta();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.model.sbom.ArtifactMetadata <em>Artifact Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact Metadata</em>'.
	 * @see engineering.schumann.uml.model.sbom.ArtifactMetadata
	 * @generated
	 */
	EClass getArtifactMetadata();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.model.sbom.ArtifactMetadata#getSupplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supplier</em>'.
	 * @see engineering.schumann.uml.model.sbom.ArtifactMetadata#getSupplier()
	 * @see #getArtifactMetadata()
	 * @generated
	 */
	EReference getArtifactMetadata_Supplier();

	/**
	 * Returns the meta object for the container reference '{@link engineering.schumann.uml.model.sbom.ArtifactMetadata#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Library</em>'.
	 * @see engineering.schumann.uml.model.sbom.ArtifactMetadata#getLibrary()
	 * @see #getArtifactMetadata()
	 * @generated
	 */
	EReference getArtifactMetadata_Library();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.model.sbom.SupplierMetadata <em>Supplier Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supplier Metadata</em>'.
	 * @see engineering.schumann.uml.model.sbom.SupplierMetadata
	 * @generated
	 */
	EClass getSupplierMetadata();

	/**
	 * Returns the meta object for the container reference '{@link engineering.schumann.uml.model.sbom.SupplierMetadata#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Library</em>'.
	 * @see engineering.schumann.uml.model.sbom.SupplierMetadata#getLibrary()
	 * @see #getSupplierMetadata()
	 * @generated
	 */
	EReference getSupplierMetadata_Library();

	/**
	 * Returns the meta object for the reference list '{@link engineering.schumann.uml.model.sbom.SupplierMetadata#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Component</em>'.
	 * @see engineering.schumann.uml.model.sbom.SupplierMetadata#getComponent()
	 * @see #getSupplierMetadata()
	 * @generated
	 */
	EReference getSupplierMetadata_Component();

	/**
	 * Returns the meta object for enum '{@link engineering.schumann.uml.model.sbom.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Component Type</em>'.
	 * @see engineering.schumann.uml.model.sbom.ComponentType
	 * @generated
	 */
	EEnum getComponentType();

	/**
	 * Returns the meta object for enum '{@link engineering.schumann.uml.model.sbom.Iec81001_5_1_Classification <em>Iec81001 51Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Iec81001 51Classification</em>'.
	 * @see engineering.schumann.uml.model.sbom.Iec81001_5_1_Classification
	 * @generated
	 */
	EEnum getIec81001_5_1_Classification();

	/**
	 * Returns the meta object for enum '{@link engineering.schumann.uml.model.sbom.Iec62304_Classification <em>Iec62304 Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Iec62304 Classification</em>'.
	 * @see engineering.schumann.uml.model.sbom.Iec62304_Classification
	 * @generated
	 */
	EEnum getIec62304_Classification();

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
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
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
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__REFERENCE = eINSTANCE.getElement_Reference();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TIMESTAMP = eINSTANCE.getElement_Timestamp();

		/**
		 * The meta object literal for the '<em><b>Owned Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__OWNED_PROPERTY = eINSTANCE.getElement_OwnedProperty();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.model.sbom.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.model.sbom.impl.PropertyImpl
		 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__KEY = eINSTANCE.getProperty_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TYPE = eINSTANCE.getProperty_Type();

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
		 * The meta object literal for the '<em><b>Owned Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__OWNED_COMPONENT = eINSTANCE.getComponent_OwnedComponent();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__OWNER = eINSTANCE.getComponent_Owner();

		/**
		 * The meta object literal for the '<em><b>Required Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__REQUIRED_COMPONENT = eINSTANCE.getComponent_RequiredComponent();

		/**
		 * The meta object literal for the '<em><b>Required By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__REQUIRED_BY = eINSTANCE.getComponent_RequiredBy();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__TYPE = eINSTANCE.getComponent_Type();

		/**
		 * The meta object literal for the '<em><b>Is SOUP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__IS_SOUP = eINSTANCE.getComponent_IsSOUP();

		/**
		 * The meta object literal for the '<em><b>Classification Iec81001 51</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__CLASSIFICATION_IEC81001_51 = eINSTANCE.getComponent_ClassificationIec81001_5_1();

		/**
		 * The meta object literal for the '<em><b>Classification Iec62304</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__CLASSIFICATION_IEC62304 = eINSTANCE.getComponent_ClassificationIec62304();

		/**
		 * The meta object literal for the '<em><b>Owning Sbom</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__OWNING_SBOM = eINSTANCE.getComponent_OwningSbom();

		/**
		 * The meta object literal for the '<em><b>Get Sbom</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPONENT___GET_SBOM = eINSTANCE.getComponent__GetSbom();

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
		 * The meta object literal for the '<em><b>Owned Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SBOM__OWNED_RELATIONSHIP = eINSTANCE.getSbom_OwnedRelationship();

		/**
		 * The meta object literal for the '<em><b>Owned Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SBOM__OWNED_COMPONENT = eINSTANCE.getSbom_OwnedComponent();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.model.sbom.impl.MetadataLibraryImpl <em>Metadata Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.model.sbom.impl.MetadataLibraryImpl
		 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getMetadataLibrary()
		 * @generated
		 */
		EClass METADATA_LIBRARY = eINSTANCE.getMetadataLibrary();

		/**
		 * The meta object literal for the '<em><b>Artifact Meta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA_LIBRARY__ARTIFACT_META = eINSTANCE.getMetadataLibrary_ArtifactMeta();

		/**
		 * The meta object literal for the '<em><b>Supplier Meta</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METADATA_LIBRARY__SUPPLIER_META = eINSTANCE.getMetadataLibrary_SupplierMeta();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.model.sbom.impl.ArtifactMetadataImpl <em>Artifact Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.model.sbom.impl.ArtifactMetadataImpl
		 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getArtifactMetadata()
		 * @generated
		 */
		EClass ARTIFACT_METADATA = eINSTANCE.getArtifactMetadata();

		/**
		 * The meta object literal for the '<em><b>Supplier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_METADATA__SUPPLIER = eINSTANCE.getArtifactMetadata_Supplier();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACT_METADATA__LIBRARY = eINSTANCE.getArtifactMetadata_Library();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.model.sbom.impl.SupplierMetadataImpl <em>Supplier Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.model.sbom.impl.SupplierMetadataImpl
		 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getSupplierMetadata()
		 * @generated
		 */
		EClass SUPPLIER_METADATA = eINSTANCE.getSupplierMetadata();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER_METADATA__LIBRARY = eINSTANCE.getSupplierMetadata_Library();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER_METADATA__COMPONENT = eINSTANCE.getSupplierMetadata_Component();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.model.sbom.ComponentType <em>Component Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.model.sbom.ComponentType
		 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getComponentType()
		 * @generated
		 */
		EEnum COMPONENT_TYPE = eINSTANCE.getComponentType();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.model.sbom.Iec81001_5_1_Classification <em>Iec81001 51Classification</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.model.sbom.Iec81001_5_1_Classification
		 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getIec81001_5_1_Classification()
		 * @generated
		 */
		EEnum IEC81001_51CLASSIFICATION = eINSTANCE.getIec81001_5_1_Classification();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.model.sbom.Iec62304_Classification <em>Iec62304 Classification</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.model.sbom.Iec62304_Classification
		 * @see engineering.schumann.uml.model.sbom.impl.SBOMPackageImpl#getIec62304_Classification()
		 * @generated
		 */
		EEnum IEC62304_CLASSIFICATION = eINSTANCE.getIec62304_Classification();

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
