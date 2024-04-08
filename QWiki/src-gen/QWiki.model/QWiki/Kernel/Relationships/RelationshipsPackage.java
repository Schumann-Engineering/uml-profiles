/**
 */
package QWiki.Kernel.Relationships;

import QWiki.Kernel.KernelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.uml2.uml.UMLPackage;

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
 * @see QWiki.Kernel.Relationships.RelationshipsFactory
 * @model kind="package"
 * @generated
 */
public interface RelationshipsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Relationships";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///QWiki/Kernel/Relationships.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "QWiki.Kernel.Relationships";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RelationshipsPackage eINSTANCE = QWiki.Kernel.Relationships.impl.RelationshipsPackageImpl.init();

	/**
	 * The meta object id for the '{@link QWiki.Kernel.Relationships.impl.DO_NOT_USE_RelationshipImpl <em>DO NOT USE Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Kernel.Relationships.impl.DO_NOT_USE_RelationshipImpl
	 * @see QWiki.Kernel.Relationships.impl.RelationshipsPackageImpl#getDO_NOT_USE_Relationship()
	 * @generated
	 */
	int DO_NOT_USE_RELATIONSHIP = 0;

	/**
	 * The number of structural features of the '<em>DO NOT USE Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>DO NOT USE Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QWiki.Kernel.Relationships.impl.DO_NOT_USE_RelationshipTypeImpl <em>DO NOT USE Relationship Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Kernel.Relationships.impl.DO_NOT_USE_RelationshipTypeImpl
	 * @see QWiki.Kernel.Relationships.impl.RelationshipsPackageImpl#getDO_NOT_USE_RelationshipType()
	 * @generated
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__EANNOTATIONS = KernelPackage.I1_8N_NAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__OWNED_COMMENT = KernelPackage.I1_8N_NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__OWNED_ELEMENT = KernelPackage.I1_8N_NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__OWNER = KernelPackage.I1_8N_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__CLIENT_DEPENDENCY = KernelPackage.I1_8N_NAMED_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__NAME = KernelPackage.I1_8N_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__NAME_EXPRESSION = KernelPackage.I1_8N_NAMED_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__NAMESPACE = KernelPackage.I1_8N_NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__QUALIFIED_NAME = KernelPackage.I1_8N_NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__VISIBILITY = KernelPackage.I1_8N_NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__UUID = KernelPackage.I1_8N_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__CUSTOM_PROPERTY = KernelPackage.I1_8N_NAMED_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__TAG = KernelPackage.I1_8N_NAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__DISPLAY_NAME = KernelPackage.I1_8N_NAMED_ELEMENT__DISPLAY_NAME;

	/**
	 * The number of structural features of the '<em>DO NOT USE Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE_FEATURE_COUNT = KernelPackage.I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___GET_EANNOTATION__STRING = KernelPackage.I1_8N_NAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = KernelPackage.I1_8N_NAMED_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = KernelPackage.I1_8N_NAMED_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___ADD_KEYWORD__STRING = KernelPackage.I1_8N_NAMED_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___APPLY_STEREOTYPE__STEREOTYPE = KernelPackage.I1_8N_NAMED_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___CREATE_EANNOTATION__STRING = KernelPackage.I1_8N_NAMED_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___DESTROY = KernelPackage.I1_8N_NAMED_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___GET_KEYWORDS = KernelPackage.I1_8N_NAMED_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___GET_APPLICABLE_STEREOTYPE__STRING = KernelPackage.I1_8N_NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___GET_APPLICABLE_STEREOTYPES = KernelPackage.I1_8N_NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___GET_APPLIED_STEREOTYPE__STRING = KernelPackage.I1_8N_NAMED_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___GET_APPLIED_STEREOTYPES = KernelPackage.I1_8N_NAMED_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = KernelPackage.I1_8N_NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = KernelPackage.I1_8N_NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___GET_MODEL = KernelPackage.I1_8N_NAMED_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___GET_NEAREST_PACKAGE = KernelPackage.I1_8N_NAMED_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___GET_RELATIONSHIPS = KernelPackage.I1_8N_NAMED_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___GET_RELATIONSHIPS__ECLASS = KernelPackage.I1_8N_NAMED_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___GET_REQUIRED_STEREOTYPE__STRING = KernelPackage.I1_8N_NAMED_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___GET_REQUIRED_STEREOTYPES = KernelPackage.I1_8N_NAMED_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___GET_SOURCE_DIRECTED_RELATIONSHIPS = KernelPackage.I1_8N_NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = KernelPackage.I1_8N_NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___GET_STEREOTYPE_APPLICATION__STEREOTYPE = KernelPackage.I1_8N_NAMED_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___GET_STEREOTYPE_APPLICATIONS = KernelPackage.I1_8N_NAMED_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___GET_TARGET_DIRECTED_RELATIONSHIPS = KernelPackage.I1_8N_NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = KernelPackage.I1_8N_NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___GET_VALUE__STEREOTYPE_STRING = KernelPackage.I1_8N_NAMED_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___HAS_KEYWORD__STRING = KernelPackage.I1_8N_NAMED_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___HAS_VALUE__STEREOTYPE_STRING = KernelPackage.I1_8N_NAMED_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = KernelPackage.I1_8N_NAMED_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___IS_STEREOTYPE_APPLIED__STEREOTYPE = KernelPackage.I1_8N_NAMED_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___IS_STEREOTYPE_REQUIRED__STEREOTYPE = KernelPackage.I1_8N_NAMED_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___REMOVE_KEYWORD__STRING = KernelPackage.I1_8N_NAMED_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___SET_VALUE__STEREOTYPE_STRING_OBJECT = KernelPackage.I1_8N_NAMED_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___UNAPPLY_STEREOTYPE__STEREOTYPE = KernelPackage.I1_8N_NAMED_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___ALL_OWNED_ELEMENTS = KernelPackage.I1_8N_NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___MUST_BE_OWNED = KernelPackage.I1_8N_NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = KernelPackage.I1_8N_NAMED_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = KernelPackage.I1_8N_NAMED_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = KernelPackage.I1_8N_NAMED_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___CREATE_DEPENDENCY__NAMEDELEMENT = KernelPackage.I1_8N_NAMED_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___CREATE_USAGE__NAMEDELEMENT = KernelPackage.I1_8N_NAMED_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___GET_LABEL = KernelPackage.I1_8N_NAMED_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___GET_LABEL__BOOLEAN = KernelPackage.I1_8N_NAMED_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___GET_NAMESPACE = KernelPackage.I1_8N_NAMED_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___ALL_NAMESPACES = KernelPackage.I1_8N_NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___ALL_OWNING_PACKAGES = KernelPackage.I1_8N_NAMED_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = KernelPackage.I1_8N_NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___GET_QUALIFIED_NAME = KernelPackage.I1_8N_NAMED_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___SEPARATOR = KernelPackage.I1_8N_NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___GET_CLIENT_DEPENDENCIES = KernelPackage.I1_8N_NAMED_ELEMENT___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Oid Basic</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___OID_BASIC = KernelPackage.I1_8N_NAMED_ELEMENT___OID_BASIC;

	/**
	 * The number of operations of the '<em>DO NOT USE Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE_OPERATION_COUNT = KernelPackage.I1_8N_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.Kernel.Relationships.impl.DO_NOT_USE_SuperseedingRelationshipImpl <em>DO NOT USE Superseeding Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Kernel.Relationships.impl.DO_NOT_USE_SuperseedingRelationshipImpl
	 * @see QWiki.Kernel.Relationships.impl.RelationshipsPackageImpl#getDO_NOT_USE_SuperseedingRelationship()
	 * @generated
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP = 2;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP__EANNOTATIONS = UMLPackage.DIRECTED_RELATIONSHIP__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP__OWNED_COMMENT = UMLPackage.DIRECTED_RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP__OWNED_ELEMENT = UMLPackage.DIRECTED_RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP__OWNER = UMLPackage.DIRECTED_RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP__RELATED_ELEMENT = UMLPackage.DIRECTED_RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP__SOURCE = UMLPackage.DIRECTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP__TARGET = UMLPackage.DIRECTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Superseeding Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP__SUPERSEEDING_TYPE = UMLPackage.DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DO NOT USE Superseeding Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP_FEATURE_COUNT = UMLPackage.DIRECTED_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___GET_EANNOTATION__STRING = UMLPackage.DIRECTED_RELATIONSHIP___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.DIRECTED_RELATIONSHIP___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.DIRECTED_RELATIONSHIP___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___ADD_KEYWORD__STRING = UMLPackage.DIRECTED_RELATIONSHIP___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.DIRECTED_RELATIONSHIP___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___CREATE_EANNOTATION__STRING = UMLPackage.DIRECTED_RELATIONSHIP___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___DESTROY = UMLPackage.DIRECTED_RELATIONSHIP___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___GET_KEYWORDS = UMLPackage.DIRECTED_RELATIONSHIP___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.DIRECTED_RELATIONSHIP___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___GET_APPLICABLE_STEREOTYPES = UMLPackage.DIRECTED_RELATIONSHIP___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.DIRECTED_RELATIONSHIP___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___GET_APPLIED_STEREOTYPES = UMLPackage.DIRECTED_RELATIONSHIP___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.DIRECTED_RELATIONSHIP___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.DIRECTED_RELATIONSHIP___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___GET_MODEL = UMLPackage.DIRECTED_RELATIONSHIP___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___GET_NEAREST_PACKAGE = UMLPackage.DIRECTED_RELATIONSHIP___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___GET_RELATIONSHIPS = UMLPackage.DIRECTED_RELATIONSHIP___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___GET_RELATIONSHIPS__ECLASS = UMLPackage.DIRECTED_RELATIONSHIP___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.DIRECTED_RELATIONSHIP___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___GET_REQUIRED_STEREOTYPES = UMLPackage.DIRECTED_RELATIONSHIP___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.DIRECTED_RELATIONSHIP___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.DIRECTED_RELATIONSHIP___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.DIRECTED_RELATIONSHIP___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___GET_STEREOTYPE_APPLICATIONS = UMLPackage.DIRECTED_RELATIONSHIP___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.DIRECTED_RELATIONSHIP___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.DIRECTED_RELATIONSHIP___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___GET_VALUE__STEREOTYPE_STRING = UMLPackage.DIRECTED_RELATIONSHIP___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___HAS_KEYWORD__STRING = UMLPackage.DIRECTED_RELATIONSHIP___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.DIRECTED_RELATIONSHIP___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.DIRECTED_RELATIONSHIP___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.DIRECTED_RELATIONSHIP___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.DIRECTED_RELATIONSHIP___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___REMOVE_KEYWORD__STRING = UMLPackage.DIRECTED_RELATIONSHIP___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.DIRECTED_RELATIONSHIP___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.DIRECTED_RELATIONSHIP___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___ALL_OWNED_ELEMENTS = UMLPackage.DIRECTED_RELATIONSHIP___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP___MUST_BE_OWNED = UMLPackage.DIRECTED_RELATIONSHIP___MUST_BE_OWNED;

	/**
	 * The number of operations of the '<em>DO NOT USE Superseeding Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_SUPERSEEDING_RELATIONSHIP_OPERATION_COUNT = UMLPackage.DIRECTED_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.Kernel.Relationships.impl.DO_NOT_USE_ModelElementImpl <em>DO NOT USE Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Kernel.Relationships.impl.DO_NOT_USE_ModelElementImpl
	 * @see QWiki.Kernel.Relationships.impl.RelationshipsPackageImpl#getDO_NOT_USE_ModelElement()
	 * @generated
	 */
	int DO_NOT_USE_MODEL_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_MODEL_ELEMENT__SUPERSEEDING_RELATIONSHIP = 0;

	/**
	 * The number of structural features of the '<em>DO NOT USE Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_MODEL_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>DO NOT USE Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QWiki.Kernel.Relationships.DO_NOT_USE_SuperseedingType <em>DO NOT USE Superseeding Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Kernel.Relationships.DO_NOT_USE_SuperseedingType
	 * @see QWiki.Kernel.Relationships.impl.RelationshipsPackageImpl#getDO_NOT_USE_SuperseedingType()
	 * @generated
	 */
	int DO_NOT_USE_SUPERSEEDING_TYPE = 4;


	/**
	 * Returns the meta object for class '{@link QWiki.Kernel.Relationships.DO_NOT_USE_Relationship <em>DO NOT USE Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DO NOT USE Relationship</em>'.
	 * @see QWiki.Kernel.Relationships.DO_NOT_USE_Relationship
	 * @generated
	 */
	EClass getDO_NOT_USE_Relationship();

	/**
	 * Returns the meta object for class '{@link QWiki.Kernel.Relationships.DO_NOT_USE_RelationshipType <em>DO NOT USE Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DO NOT USE Relationship Type</em>'.
	 * @see QWiki.Kernel.Relationships.DO_NOT_USE_RelationshipType
	 * @generated
	 */
	EClass getDO_NOT_USE_RelationshipType();

	/**
	 * Returns the meta object for class '{@link QWiki.Kernel.Relationships.DO_NOT_USE_SuperseedingRelationship <em>DO NOT USE Superseeding Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DO NOT USE Superseeding Relationship</em>'.
	 * @see QWiki.Kernel.Relationships.DO_NOT_USE_SuperseedingRelationship
	 * @generated
	 */
	EClass getDO_NOT_USE_SuperseedingRelationship();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.Kernel.Relationships.DO_NOT_USE_SuperseedingRelationship#getSuperseedingType <em>Superseeding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Superseeding Type</em>'.
	 * @see QWiki.Kernel.Relationships.DO_NOT_USE_SuperseedingRelationship#getSuperseedingType()
	 * @see #getDO_NOT_USE_SuperseedingRelationship()
	 * @generated
	 */
	EAttribute getDO_NOT_USE_SuperseedingRelationship_SuperseedingType();

	/**
	 * Returns the meta object for class '{@link QWiki.Kernel.Relationships.DO_NOT_USE_ModelElement <em>DO NOT USE Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DO NOT USE Model Element</em>'.
	 * @see QWiki.Kernel.Relationships.DO_NOT_USE_ModelElement
	 * @generated
	 */
	EClass getDO_NOT_USE_ModelElement();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Kernel.Relationships.DO_NOT_USE_ModelElement#getSuperseedingRelationship <em>Superseeding Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Superseeding Relationship</em>'.
	 * @see QWiki.Kernel.Relationships.DO_NOT_USE_ModelElement#getSuperseedingRelationship()
	 * @see #getDO_NOT_USE_ModelElement()
	 * @generated
	 */
	EReference getDO_NOT_USE_ModelElement_SuperseedingRelationship();

	/**
	 * Returns the meta object for enum '{@link QWiki.Kernel.Relationships.DO_NOT_USE_SuperseedingType <em>DO NOT USE Superseeding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DO NOT USE Superseeding Type</em>'.
	 * @see QWiki.Kernel.Relationships.DO_NOT_USE_SuperseedingType
	 * @generated
	 */
	EEnum getDO_NOT_USE_SuperseedingType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RelationshipsFactory getRelationshipsFactory();

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
		 * The meta object literal for the '{@link QWiki.Kernel.Relationships.impl.DO_NOT_USE_RelationshipImpl <em>DO NOT USE Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Kernel.Relationships.impl.DO_NOT_USE_RelationshipImpl
		 * @see QWiki.Kernel.Relationships.impl.RelationshipsPackageImpl#getDO_NOT_USE_Relationship()
		 * @generated
		 */
		EClass DO_NOT_USE_RELATIONSHIP = eINSTANCE.getDO_NOT_USE_Relationship();

		/**
		 * The meta object literal for the '{@link QWiki.Kernel.Relationships.impl.DO_NOT_USE_RelationshipTypeImpl <em>DO NOT USE Relationship Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Kernel.Relationships.impl.DO_NOT_USE_RelationshipTypeImpl
		 * @see QWiki.Kernel.Relationships.impl.RelationshipsPackageImpl#getDO_NOT_USE_RelationshipType()
		 * @generated
		 */
		EClass DO_NOT_USE_RELATIONSHIP_TYPE = eINSTANCE.getDO_NOT_USE_RelationshipType();

		/**
		 * The meta object literal for the '{@link QWiki.Kernel.Relationships.impl.DO_NOT_USE_SuperseedingRelationshipImpl <em>DO NOT USE Superseeding Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Kernel.Relationships.impl.DO_NOT_USE_SuperseedingRelationshipImpl
		 * @see QWiki.Kernel.Relationships.impl.RelationshipsPackageImpl#getDO_NOT_USE_SuperseedingRelationship()
		 * @generated
		 */
		EClass DO_NOT_USE_SUPERSEEDING_RELATIONSHIP = eINSTANCE.getDO_NOT_USE_SuperseedingRelationship();

		/**
		 * The meta object literal for the '<em><b>Superseeding Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DO_NOT_USE_SUPERSEEDING_RELATIONSHIP__SUPERSEEDING_TYPE = eINSTANCE.getDO_NOT_USE_SuperseedingRelationship_SuperseedingType();

		/**
		 * The meta object literal for the '{@link QWiki.Kernel.Relationships.impl.DO_NOT_USE_ModelElementImpl <em>DO NOT USE Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Kernel.Relationships.impl.DO_NOT_USE_ModelElementImpl
		 * @see QWiki.Kernel.Relationships.impl.RelationshipsPackageImpl#getDO_NOT_USE_ModelElement()
		 * @generated
		 */
		EClass DO_NOT_USE_MODEL_ELEMENT = eINSTANCE.getDO_NOT_USE_ModelElement();

		/**
		 * The meta object literal for the '<em><b>Superseeding Relationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DO_NOT_USE_MODEL_ELEMENT__SUPERSEEDING_RELATIONSHIP = eINSTANCE.getDO_NOT_USE_ModelElement_SuperseedingRelationship();

		/**
		 * The meta object literal for the '{@link QWiki.Kernel.Relationships.DO_NOT_USE_SuperseedingType <em>DO NOT USE Superseeding Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Kernel.Relationships.DO_NOT_USE_SuperseedingType
		 * @see QWiki.Kernel.Relationships.impl.RelationshipsPackageImpl#getDO_NOT_USE_SuperseedingType()
		 * @generated
		 */
		EEnum DO_NOT_USE_SUPERSEEDING_TYPE = eINSTANCE.getDO_NOT_USE_SuperseedingType();

	}

} //RelationshipsPackage
