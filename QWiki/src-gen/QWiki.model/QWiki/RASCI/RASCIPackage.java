/**
 */
package QWiki.Rasci;

import QWiki.QWikiPackage;

import org.eclipse.emf.ecore.EClass;
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
 * @see QWiki.Rasci.RasciFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface RasciPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Rasci";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schumann.engineering/qwiki/1.0/rasci";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "QWiki.Rasci";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RasciPackage eINSTANCE = QWiki.Rasci.impl.RasciPackageImpl.init();

	/**
	 * The meta object id for the '{@link QWiki.Rasci.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Rasci.impl.RoleImpl
	 * @see QWiki.Rasci.impl.RasciPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__EANNOTATIONS = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__OWNED_COMMENT = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__OWNED_ELEMENT = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__OWNER = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CLIENT_DEPENDENCY = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME_EXPRESSION = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAMESPACE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__QUALIFIED_NAME = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__VISIBILITY = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__UUID = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CUSTOM_PROPERTY = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__TAG = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DISPLAY_NAME = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PURPOSE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CONTENT = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SKILLS = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Responsible Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__RESPONSIBLE_ELEMENT = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Accountable Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ACCOUNTABLE_ELEMENT = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Supporting Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SUPPORTING_ELEMENT = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Consulting Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CONSULTING_ELEMENT = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Informed Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__INFORMED_ELEMENT = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_EANNOTATION__STRING = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___ADD_KEYWORD__STRING = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___APPLY_STEREOTYPE__STEREOTYPE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___CREATE_EANNOTATION__STRING = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___DESTROY = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_KEYWORDS = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_APPLICABLE_STEREOTYPE__STRING = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_APPLICABLE_STEREOTYPES = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_APPLIED_STEREOTYPE__STRING = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_APPLIED_STEREOTYPES = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_MODEL = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_NEAREST_PACKAGE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_RELATIONSHIPS = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_RELATIONSHIPS__ECLASS = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_REQUIRED_STEREOTYPE__STRING = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_REQUIRED_STEREOTYPES = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_SOURCE_DIRECTED_RELATIONSHIPS = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_STEREOTYPE_APPLICATION__STEREOTYPE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_STEREOTYPE_APPLICATIONS = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_TARGET_DIRECTED_RELATIONSHIPS = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_VALUE__STEREOTYPE_STRING = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___HAS_KEYWORD__STRING = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___HAS_VALUE__STEREOTYPE_STRING = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___IS_STEREOTYPE_APPLIED__STEREOTYPE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___IS_STEREOTYPE_REQUIRED__STEREOTYPE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___REMOVE_KEYWORD__STRING = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___SET_VALUE__STEREOTYPE_STRING_OBJECT = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___UNAPPLY_STEREOTYPE__STEREOTYPE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___ALL_OWNED_ELEMENTS = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___MUST_BE_OWNED = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___CREATE_DEPENDENCY__NAMEDELEMENT = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___CREATE_USAGE__NAMEDELEMENT = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_LABEL = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_LABEL__BOOLEAN = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_NAMESPACE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___ALL_NAMESPACES = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___ALL_OWNING_PACKAGES = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_QUALIFIED_NAME = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___SEPARATOR = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___GET_CLIENT_DEPENDENCIES = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Qwiki Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___QWIKI_MODEL = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___QWIKI_MODEL;

	/**
	 * The operation id for the '<em>Object Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___OBJECT_ID = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link QWiki.Rasci.impl.RasciElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Rasci.impl.RasciElementImpl
	 * @see QWiki.Rasci.impl.RasciPackageImpl#getRasciElement()
	 * @generated
	 */
	int RASCI_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__EANNOTATIONS = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__OWNED_COMMENT = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__OWNED_ELEMENT = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__OWNER = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__CLIENT_DEPENDENCY = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__NAME = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__NAME_EXPRESSION = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__NAMESPACE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__QUALIFIED_NAME = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__VISIBILITY = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__UUID = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__CUSTOM_PROPERTY = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__TAG = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__DISPLAY_NAME = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__PURPOSE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__CONTENT = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Responsible Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__RESPONSIBLE_ROLE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accountable Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__ACCOUNTABLE_ROLE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Support Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__SUPPORT_ROLE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Consulted Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__CONSULTED_ROLE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Informed Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__INFORMED_ROLE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT_FEATURE_COUNT = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___GET_EANNOTATION__STRING = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___ADD_KEYWORD__STRING = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___CREATE_EANNOTATION__STRING = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___DESTROY = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___GET_KEYWORDS = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___GET_APPLICABLE_STEREOTYPES = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___GET_APPLIED_STEREOTYPE__STRING = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___GET_APPLIED_STEREOTYPES = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___GET_MODEL = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___GET_NEAREST_PACKAGE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___GET_RELATIONSHIPS = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___GET_RELATIONSHIPS__ECLASS = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___GET_REQUIRED_STEREOTYPES = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___GET_STEREOTYPE_APPLICATIONS = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___GET_VALUE__STEREOTYPE_STRING = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___HAS_KEYWORD__STRING = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___HAS_VALUE__STEREOTYPE_STRING = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___REMOVE_KEYWORD__STRING = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___ALL_OWNED_ELEMENTS = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___MUST_BE_OWNED = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___CREATE_USAGE__NAMEDELEMENT = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___GET_LABEL = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___GET_LABEL__BOOLEAN = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___GET_NAMESPACE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___ALL_NAMESPACES = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___ALL_OWNING_PACKAGES = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___GET_QUALIFIED_NAME = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___SEPARATOR = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___GET_CLIENT_DEPENDENCIES = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Object Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___OBJECT_ID = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___OBJECT_ID;

	/**
	 * The operation id for the '<em>Qwiki Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___QWIKI_MODEL = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT___QWIKI_MODEL;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT_OPERATION_COUNT = QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link QWiki.Rasci.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see QWiki.Rasci.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the containment reference '{@link QWiki.Rasci.Role#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Skills</em>'.
	 * @see QWiki.Rasci.Role#getSkills()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Skills();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Rasci.Role#getResponsibleElement <em>Responsible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsible Element</em>'.
	 * @see QWiki.Rasci.Role#getResponsibleElement()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_ResponsibleElement();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Rasci.Role#getAccountableElement <em>Accountable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accountable Element</em>'.
	 * @see QWiki.Rasci.Role#getAccountableElement()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_AccountableElement();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Rasci.Role#getSupportingElement <em>Supporting Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supporting Element</em>'.
	 * @see QWiki.Rasci.Role#getSupportingElement()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_SupportingElement();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Rasci.Role#getConsultingElement <em>Consulting Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consulting Element</em>'.
	 * @see QWiki.Rasci.Role#getConsultingElement()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_ConsultingElement();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Rasci.Role#getInformedElement <em>Informed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Informed Element</em>'.
	 * @see QWiki.Rasci.Role#getInformedElement()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_InformedElement();

	/**
	 * Returns the meta object for the '{@link QWiki.Rasci.Role#objectId() <em>Object Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Object Id</em>' operation.
	 * @see QWiki.Rasci.Role#objectId()
	 * @generated
	 */
	EOperation getRole__ObjectId();

	/**
	 * Returns the meta object for class '{@link QWiki.Rasci.RasciElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see QWiki.Rasci.RasciElement
	 * @generated
	 */
	EClass getRasciElement();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Rasci.RasciElement#getResponsibleRole <em>Responsible Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsible Role</em>'.
	 * @see QWiki.Rasci.RasciElement#getResponsibleRole()
	 * @see #getRasciElement()
	 * @generated
	 */
	EReference getRasciElement_ResponsibleRole();

	/**
	 * Returns the meta object for the reference '{@link QWiki.Rasci.RasciElement#getAccountableRole <em>Accountable Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Accountable Role</em>'.
	 * @see QWiki.Rasci.RasciElement#getAccountableRole()
	 * @see #getRasciElement()
	 * @generated
	 */
	EReference getRasciElement_AccountableRole();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Rasci.RasciElement#getSupportRole <em>Support Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Support Role</em>'.
	 * @see QWiki.Rasci.RasciElement#getSupportRole()
	 * @see #getRasciElement()
	 * @generated
	 */
	EReference getRasciElement_SupportRole();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Rasci.RasciElement#getConsultedRole <em>Consulted Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consulted Role</em>'.
	 * @see QWiki.Rasci.RasciElement#getConsultedRole()
	 * @see #getRasciElement()
	 * @generated
	 */
	EReference getRasciElement_ConsultedRole();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Rasci.RasciElement#getInformedRole <em>Informed Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Informed Role</em>'.
	 * @see QWiki.Rasci.RasciElement#getInformedRole()
	 * @see #getRasciElement()
	 * @generated
	 */
	EReference getRasciElement_InformedRole();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RasciFactory getRasciFactory();

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
		 * The meta object literal for the '{@link QWiki.Rasci.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Rasci.impl.RoleImpl
		 * @see QWiki.Rasci.impl.RasciPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__SKILLS = eINSTANCE.getRole_Skills();

		/**
		 * The meta object literal for the '<em><b>Responsible Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__RESPONSIBLE_ELEMENT = eINSTANCE.getRole_ResponsibleElement();

		/**
		 * The meta object literal for the '<em><b>Accountable Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__ACCOUNTABLE_ELEMENT = eINSTANCE.getRole_AccountableElement();

		/**
		 * The meta object literal for the '<em><b>Supporting Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__SUPPORTING_ELEMENT = eINSTANCE.getRole_SupportingElement();

		/**
		 * The meta object literal for the '<em><b>Consulting Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__CONSULTING_ELEMENT = eINSTANCE.getRole_ConsultingElement();

		/**
		 * The meta object literal for the '<em><b>Informed Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__INFORMED_ELEMENT = eINSTANCE.getRole_InformedElement();

		/**
		 * The meta object literal for the '<em><b>Object Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROLE___OBJECT_ID = eINSTANCE.getRole__ObjectId();

		/**
		 * The meta object literal for the '{@link QWiki.Rasci.impl.RasciElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Rasci.impl.RasciElementImpl
		 * @see QWiki.Rasci.impl.RasciPackageImpl#getRasciElement()
		 * @generated
		 */
		EClass RASCI_ELEMENT = eINSTANCE.getRasciElement();

		/**
		 * The meta object literal for the '<em><b>Responsible Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RASCI_ELEMENT__RESPONSIBLE_ROLE = eINSTANCE.getRasciElement_ResponsibleRole();

		/**
		 * The meta object literal for the '<em><b>Accountable Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RASCI_ELEMENT__ACCOUNTABLE_ROLE = eINSTANCE.getRasciElement_AccountableRole();

		/**
		 * The meta object literal for the '<em><b>Support Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RASCI_ELEMENT__SUPPORT_ROLE = eINSTANCE.getRasciElement_SupportRole();

		/**
		 * The meta object literal for the '<em><b>Consulted Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RASCI_ELEMENT__CONSULTED_ROLE = eINSTANCE.getRasciElement_ConsultedRole();

		/**
		 * The meta object literal for the '<em><b>Informed Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RASCI_ELEMENT__INFORMED_ROLE = eINSTANCE.getRasciElement_InformedRole();

	}

} //RasciPackage
