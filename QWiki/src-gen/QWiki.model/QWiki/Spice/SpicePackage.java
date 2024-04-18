/**
 */
package QWiki.Spice;

import QWiki.QWikiPackage;

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
 * @see QWiki.Spice.SpiceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface SpicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Spice";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schumann.engineering/qwiki/1.0/spice";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "QWiki.Spice";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpicePackage eINSTANCE = QWiki.Spice.impl.SpicePackageImpl.init();

	/**
	 * The meta object id for the '{@link QWiki.Spice.impl.SpiceElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Spice.impl.SpiceElementImpl
	 * @see QWiki.Spice.impl.SpicePackageImpl#getSpiceElement()
	 * @generated
	 */
	int SPICE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__EANNOTATIONS = QWikiPackage.QWIKI_CONTAINER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__OWNED_COMMENT = QWikiPackage.QWIKI_CONTAINER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__OWNED_ELEMENT = QWikiPackage.QWIKI_CONTAINER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__OWNER = QWikiPackage.QWIKI_CONTAINER__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__CLIENT_DEPENDENCY = QWikiPackage.QWIKI_CONTAINER__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__NAME = QWikiPackage.QWIKI_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__NAME_EXPRESSION = QWikiPackage.QWIKI_CONTAINER__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__NAMESPACE = QWikiPackage.QWIKI_CONTAINER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__QUALIFIED_NAME = QWikiPackage.QWIKI_CONTAINER__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__VISIBILITY = QWikiPackage.QWIKI_CONTAINER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__OWNED_RULE = QWikiPackage.QWIKI_CONTAINER__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__ELEMENT_IMPORT = QWikiPackage.QWIKI_CONTAINER__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__PACKAGE_IMPORT = QWikiPackage.QWIKI_CONTAINER__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__OWNED_MEMBER = QWikiPackage.QWIKI_CONTAINER__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__IMPORTED_MEMBER = QWikiPackage.QWIKI_CONTAINER__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__MEMBER = QWikiPackage.QWIKI_CONTAINER__MEMBER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__UUID = QWikiPackage.QWIKI_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__CUSTOM_PROPERTY = QWikiPackage.QWIKI_CONTAINER__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__TAG = QWikiPackage.QWIKI_CONTAINER__TAG;

	/**
	 * The feature id for the '<em><b>Qwiki Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__QWIKI_NAMESPACE = QWikiPackage.QWIKI_CONTAINER__QWIKI_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__DISPLAY_NAME = QWikiPackage.QWIKI_CONTAINER__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Qwiki Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__QWIKI_ELEMENT = QWikiPackage.QWIKI_CONTAINER__QWIKI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__PURPOSE = QWikiPackage.QWIKI_CONTAINER__PURPOSE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__CONTENT = QWikiPackage.QWIKI_CONTAINER__CONTENT;

	/**
	 * The feature id for the '<em><b>Responsible Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__RESPONSIBLE_ROLE = QWikiPackage.QWIKI_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accountable Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__ACCOUNTABLE_ROLE = QWikiPackage.QWIKI_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Support Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__SUPPORT_ROLE = QWikiPackage.QWIKI_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Consulted Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__CONSULTED_ROLE = QWikiPackage.QWIKI_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Informed Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__INFORMED_ROLE = QWikiPackage.QWIKI_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owning Process Reference Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL = QWikiPackage.QWIKI_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__NUMBER = QWikiPackage.QWIKI_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Facilitated Section</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__FACILITATED_SECTION = QWikiPackage.QWIKI_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owner Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__OWNER_ROLE = QWikiPackage.QWIKI_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Manager Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__MANAGER_ROLE = QWikiPackage.QWIKI_CONTAINER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Participant Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__PARTICIPANT_ROLE = QWikiPackage.QWIKI_CONTAINER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__ROLE = QWikiPackage.QWIKI_CONTAINER_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT_FEATURE_COUNT = QWikiPackage.QWIKI_CONTAINER_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_EANNOTATION__STRING = QWikiPackage.QWIKI_CONTAINER___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = QWikiPackage.QWIKI_CONTAINER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = QWikiPackage.QWIKI_CONTAINER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___ADD_KEYWORD__STRING = QWikiPackage.QWIKI_CONTAINER___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE = QWikiPackage.QWIKI_CONTAINER___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___CREATE_EANNOTATION__STRING = QWikiPackage.QWIKI_CONTAINER___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___DESTROY = QWikiPackage.QWIKI_CONTAINER___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_KEYWORDS = QWikiPackage.QWIKI_CONTAINER___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING = QWikiPackage.QWIKI_CONTAINER___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_APPLICABLE_STEREOTYPES = QWikiPackage.QWIKI_CONTAINER___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_APPLIED_STEREOTYPE__STRING = QWikiPackage.QWIKI_CONTAINER___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_APPLIED_STEREOTYPES = QWikiPackage.QWIKI_CONTAINER___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = QWikiPackage.QWIKI_CONTAINER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = QWikiPackage.QWIKI_CONTAINER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_MODEL = QWikiPackage.QWIKI_CONTAINER___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_NEAREST_PACKAGE = QWikiPackage.QWIKI_CONTAINER___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_RELATIONSHIPS = QWikiPackage.QWIKI_CONTAINER___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_RELATIONSHIPS__ECLASS = QWikiPackage.QWIKI_CONTAINER___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING = QWikiPackage.QWIKI_CONTAINER___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_REQUIRED_STEREOTYPES = QWikiPackage.QWIKI_CONTAINER___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS = QWikiPackage.QWIKI_CONTAINER___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = QWikiPackage.QWIKI_CONTAINER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = QWikiPackage.QWIKI_CONTAINER___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_STEREOTYPE_APPLICATIONS = QWikiPackage.QWIKI_CONTAINER___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS = QWikiPackage.QWIKI_CONTAINER___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = QWikiPackage.QWIKI_CONTAINER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_VALUE__STEREOTYPE_STRING = QWikiPackage.QWIKI_CONTAINER___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___HAS_KEYWORD__STRING = QWikiPackage.QWIKI_CONTAINER___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___HAS_VALUE__STEREOTYPE_STRING = QWikiPackage.QWIKI_CONTAINER___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = QWikiPackage.QWIKI_CONTAINER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE = QWikiPackage.QWIKI_CONTAINER___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = QWikiPackage.QWIKI_CONTAINER___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___REMOVE_KEYWORD__STRING = QWikiPackage.QWIKI_CONTAINER___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT = QWikiPackage.QWIKI_CONTAINER___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE = QWikiPackage.QWIKI_CONTAINER___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___ALL_OWNED_ELEMENTS = QWikiPackage.QWIKI_CONTAINER___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___MUST_BE_OWNED = QWikiPackage.QWIKI_CONTAINER___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = QWikiPackage.QWIKI_CONTAINER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = QWikiPackage.QWIKI_CONTAINER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = QWikiPackage.QWIKI_CONTAINER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT = QWikiPackage.QWIKI_CONTAINER___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___CREATE_USAGE__NAMEDELEMENT = QWikiPackage.QWIKI_CONTAINER___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_LABEL = QWikiPackage.QWIKI_CONTAINER___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_LABEL__BOOLEAN = QWikiPackage.QWIKI_CONTAINER___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_NAMESPACE = QWikiPackage.QWIKI_CONTAINER___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___ALL_NAMESPACES = QWikiPackage.QWIKI_CONTAINER___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___ALL_OWNING_PACKAGES = QWikiPackage.QWIKI_CONTAINER___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = QWikiPackage.QWIKI_CONTAINER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_QUALIFIED_NAME = QWikiPackage.QWIKI_CONTAINER___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___SEPARATOR = QWikiPackage.QWIKI_CONTAINER___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_CLIENT_DEPENDENCIES = QWikiPackage.QWIKI_CONTAINER___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = QWikiPackage.QWIKI_CONTAINER___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP = QWikiPackage.QWIKI_CONTAINER___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP = QWikiPackage.QWIKI_CONTAINER___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Element Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = QWikiPackage.QWIKI_CONTAINER___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Create Package Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = QWikiPackage.QWIKI_CONTAINER___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Get Imported Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_IMPORTED_ELEMENTS = QWikiPackage.QWIKI_CONTAINER___GET_IMPORTED_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Imported Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_IMPORTED_PACKAGES = QWikiPackage.QWIKI_CONTAINER___GET_IMPORTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_OWNED_MEMBERS = QWikiPackage.QWIKI_CONTAINER___GET_OWNED_MEMBERS;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___EXCLUDE_COLLISIONS__ELIST = QWikiPackage.QWIKI_CONTAINER___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_NAMES_OF_MEMBER__NAMEDELEMENT = QWikiPackage.QWIKI_CONTAINER___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___IMPORT_MEMBERS__ELIST = QWikiPackage.QWIKI_CONTAINER___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Get Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___GET_IMPORTED_MEMBERS = QWikiPackage.QWIKI_CONTAINER___GET_IMPORTED_MEMBERS;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___MEMBERS_ARE_DISTINGUISHABLE = QWikiPackage.QWIKI_CONTAINER___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Object Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___OBJECT_ID = QWikiPackage.QWIKI_CONTAINER___OBJECT_ID;

	/**
	 * The operation id for the '<em>Qwiki Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___QWIKI_MODEL = QWikiPackage.QWIKI_CONTAINER___QWIKI_MODEL;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT_OPERATION_COUNT = QWikiPackage.QWIKI_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.Spice.impl.BasePractiseImpl <em>Base Practise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Spice.impl.BasePractiseImpl
	 * @see QWiki.Spice.impl.SpicePackageImpl#getBasePractise()
	 * @generated
	 */
	int BASE_PRACTISE = 0;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__EANNOTATIONS = SPICE_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__OWNED_COMMENT = SPICE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__OWNED_ELEMENT = SPICE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__OWNER = SPICE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__CLIENT_DEPENDENCY = SPICE_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__NAME = SPICE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__NAME_EXPRESSION = SPICE_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__NAMESPACE = SPICE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__QUALIFIED_NAME = SPICE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__VISIBILITY = SPICE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__OWNED_RULE = SPICE_ELEMENT__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__ELEMENT_IMPORT = SPICE_ELEMENT__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__PACKAGE_IMPORT = SPICE_ELEMENT__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__OWNED_MEMBER = SPICE_ELEMENT__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__IMPORTED_MEMBER = SPICE_ELEMENT__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__MEMBER = SPICE_ELEMENT__MEMBER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__UUID = SPICE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__CUSTOM_PROPERTY = SPICE_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__TAG = SPICE_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Qwiki Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__QWIKI_NAMESPACE = SPICE_ELEMENT__QWIKI_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__DISPLAY_NAME = SPICE_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Qwiki Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__QWIKI_ELEMENT = SPICE_ELEMENT__QWIKI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__PURPOSE = SPICE_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__CONTENT = SPICE_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Responsible Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__RESPONSIBLE_ROLE = SPICE_ELEMENT__RESPONSIBLE_ROLE;

	/**
	 * The feature id for the '<em><b>Accountable Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__ACCOUNTABLE_ROLE = SPICE_ELEMENT__ACCOUNTABLE_ROLE;

	/**
	 * The feature id for the '<em><b>Support Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__SUPPORT_ROLE = SPICE_ELEMENT__SUPPORT_ROLE;

	/**
	 * The feature id for the '<em><b>Consulted Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__CONSULTED_ROLE = SPICE_ELEMENT__CONSULTED_ROLE;

	/**
	 * The feature id for the '<em><b>Informed Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__INFORMED_ROLE = SPICE_ELEMENT__INFORMED_ROLE;

	/**
	 * The feature id for the '<em><b>Owning Process Reference Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__OWNING_PROCESS_REFERENCE_MODEL = SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__NUMBER = SPICE_ELEMENT__NUMBER;

	/**
	 * The feature id for the '<em><b>Facilitated Section</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__FACILITATED_SECTION = SPICE_ELEMENT__FACILITATED_SECTION;

	/**
	 * The feature id for the '<em><b>Owner Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__OWNER_ROLE = SPICE_ELEMENT__OWNER_ROLE;

	/**
	 * The feature id for the '<em><b>Manager Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__MANAGER_ROLE = SPICE_ELEMENT__MANAGER_ROLE;

	/**
	 * The feature id for the '<em><b>Participant Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__PARTICIPANT_ROLE = SPICE_ELEMENT__PARTICIPANT_ROLE;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__ROLE = SPICE_ELEMENT__ROLE;

	/**
	 * The feature id for the '<em><b>Owning Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__OWNING_PROCESS = SPICE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facilitated Outcome</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__FACILITATED_OUTCOME = SPICE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Facilitated Work Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__FACILITATED_WORK_PRODUCT = SPICE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Base Practise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE_FEATURE_COUNT = SPICE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_EANNOTATION__STRING = SPICE_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___ADD_KEYWORD__STRING = SPICE_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___APPLY_STEREOTYPE__STEREOTYPE = SPICE_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___CREATE_EANNOTATION__STRING = SPICE_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___DESTROY = SPICE_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_KEYWORDS = SPICE_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_APPLICABLE_STEREOTYPE__STRING = SPICE_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_APPLICABLE_STEREOTYPES = SPICE_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_APPLIED_STEREOTYPE__STRING = SPICE_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_APPLIED_STEREOTYPES = SPICE_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = SPICE_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = SPICE_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_MODEL = SPICE_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_NEAREST_PACKAGE = SPICE_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_RELATIONSHIPS = SPICE_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_RELATIONSHIPS__ECLASS = SPICE_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_REQUIRED_STEREOTYPE__STRING = SPICE_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_REQUIRED_STEREOTYPES = SPICE_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_SOURCE_DIRECTED_RELATIONSHIPS = SPICE_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = SPICE_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_STEREOTYPE_APPLICATION__STEREOTYPE = SPICE_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_STEREOTYPE_APPLICATIONS = SPICE_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_TARGET_DIRECTED_RELATIONSHIPS = SPICE_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = SPICE_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_VALUE__STEREOTYPE_STRING = SPICE_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___HAS_KEYWORD__STRING = SPICE_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___HAS_VALUE__STEREOTYPE_STRING = SPICE_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = SPICE_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___IS_STEREOTYPE_APPLIED__STEREOTYPE = SPICE_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___IS_STEREOTYPE_REQUIRED__STEREOTYPE = SPICE_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___REMOVE_KEYWORD__STRING = SPICE_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___SET_VALUE__STEREOTYPE_STRING_OBJECT = SPICE_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___UNAPPLY_STEREOTYPE__STEREOTYPE = SPICE_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___ALL_OWNED_ELEMENTS = SPICE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___MUST_BE_OWNED = SPICE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___CREATE_DEPENDENCY__NAMEDELEMENT = SPICE_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___CREATE_USAGE__NAMEDELEMENT = SPICE_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_LABEL = SPICE_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_LABEL__BOOLEAN = SPICE_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_NAMESPACE = SPICE_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___ALL_NAMESPACES = SPICE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___ALL_OWNING_PACKAGES = SPICE_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = SPICE_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_QUALIFIED_NAME = SPICE_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___SEPARATOR = SPICE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_CLIENT_DEPENDENCIES = SPICE_ELEMENT___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Element Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = SPICE_ELEMENT___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Create Package Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = SPICE_ELEMENT___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Get Imported Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_IMPORTED_ELEMENTS = SPICE_ELEMENT___GET_IMPORTED_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Imported Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_IMPORTED_PACKAGES = SPICE_ELEMENT___GET_IMPORTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_OWNED_MEMBERS = SPICE_ELEMENT___GET_OWNED_MEMBERS;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___EXCLUDE_COLLISIONS__ELIST = SPICE_ELEMENT___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_NAMES_OF_MEMBER__NAMEDELEMENT = SPICE_ELEMENT___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___IMPORT_MEMBERS__ELIST = SPICE_ELEMENT___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Get Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___GET_IMPORTED_MEMBERS = SPICE_ELEMENT___GET_IMPORTED_MEMBERS;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___MEMBERS_ARE_DISTINGUISHABLE = SPICE_ELEMENT___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Qwiki Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___QWIKI_MODEL = SPICE_ELEMENT___QWIKI_MODEL;

	/**
	 * The operation id for the '<em>Object Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___OBJECT_ID = SPICE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Base Practise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE_OPERATION_COUNT = SPICE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link QWiki.Spice.impl.ProcessReferenceModelImpl <em>Process Reference Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Spice.impl.ProcessReferenceModelImpl
	 * @see QWiki.Spice.impl.SpicePackageImpl#getProcessReferenceModel()
	 * @generated
	 */
	int PROCESS_REFERENCE_MODEL = 2;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__EANNOTATIONS = QWikiPackage.QWIKI_CONTAINER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__OWNED_COMMENT = QWikiPackage.QWIKI_CONTAINER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__OWNED_ELEMENT = QWikiPackage.QWIKI_CONTAINER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__OWNER = QWikiPackage.QWIKI_CONTAINER__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__CLIENT_DEPENDENCY = QWikiPackage.QWIKI_CONTAINER__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__NAME = QWikiPackage.QWIKI_CONTAINER__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__NAME_EXPRESSION = QWikiPackage.QWIKI_CONTAINER__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__NAMESPACE = QWikiPackage.QWIKI_CONTAINER__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__QUALIFIED_NAME = QWikiPackage.QWIKI_CONTAINER__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__VISIBILITY = QWikiPackage.QWIKI_CONTAINER__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__OWNED_RULE = QWikiPackage.QWIKI_CONTAINER__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__ELEMENT_IMPORT = QWikiPackage.QWIKI_CONTAINER__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__PACKAGE_IMPORT = QWikiPackage.QWIKI_CONTAINER__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__OWNED_MEMBER = QWikiPackage.QWIKI_CONTAINER__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__IMPORTED_MEMBER = QWikiPackage.QWIKI_CONTAINER__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__MEMBER = QWikiPackage.QWIKI_CONTAINER__MEMBER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__UUID = QWikiPackage.QWIKI_CONTAINER__UUID;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__CUSTOM_PROPERTY = QWikiPackage.QWIKI_CONTAINER__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__TAG = QWikiPackage.QWIKI_CONTAINER__TAG;

	/**
	 * The feature id for the '<em><b>Qwiki Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__QWIKI_NAMESPACE = QWikiPackage.QWIKI_CONTAINER__QWIKI_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__DISPLAY_NAME = QWikiPackage.QWIKI_CONTAINER__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Qwiki Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__QWIKI_ELEMENT = QWikiPackage.QWIKI_CONTAINER__QWIKI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__PURPOSE = QWikiPackage.QWIKI_CONTAINER__PURPOSE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__CONTENT = QWikiPackage.QWIKI_CONTAINER__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Non Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__IS_NON_STANDARD = QWikiPackage.QWIKI_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prm Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__PRM_DOMAIN = QWikiPackage.QWIKI_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Spice Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__OWNED_SPICE_ELEMENT = QWikiPackage.QWIKI_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Process Reference Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL_FEATURE_COUNT = QWikiPackage.QWIKI_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_EANNOTATION__STRING = QWikiPackage.QWIKI_CONTAINER___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = QWikiPackage.QWIKI_CONTAINER___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = QWikiPackage.QWIKI_CONTAINER___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___ADD_KEYWORD__STRING = QWikiPackage.QWIKI_CONTAINER___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___APPLY_STEREOTYPE__STEREOTYPE = QWikiPackage.QWIKI_CONTAINER___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___CREATE_EANNOTATION__STRING = QWikiPackage.QWIKI_CONTAINER___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___DESTROY = QWikiPackage.QWIKI_CONTAINER___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_KEYWORDS = QWikiPackage.QWIKI_CONTAINER___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_APPLICABLE_STEREOTYPE__STRING = QWikiPackage.QWIKI_CONTAINER___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_APPLICABLE_STEREOTYPES = QWikiPackage.QWIKI_CONTAINER___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_APPLIED_STEREOTYPE__STRING = QWikiPackage.QWIKI_CONTAINER___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_APPLIED_STEREOTYPES = QWikiPackage.QWIKI_CONTAINER___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = QWikiPackage.QWIKI_CONTAINER___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = QWikiPackage.QWIKI_CONTAINER___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_MODEL = QWikiPackage.QWIKI_CONTAINER___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_NEAREST_PACKAGE = QWikiPackage.QWIKI_CONTAINER___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_RELATIONSHIPS = QWikiPackage.QWIKI_CONTAINER___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_RELATIONSHIPS__ECLASS = QWikiPackage.QWIKI_CONTAINER___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_REQUIRED_STEREOTYPE__STRING = QWikiPackage.QWIKI_CONTAINER___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_REQUIRED_STEREOTYPES = QWikiPackage.QWIKI_CONTAINER___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_SOURCE_DIRECTED_RELATIONSHIPS = QWikiPackage.QWIKI_CONTAINER___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = QWikiPackage.QWIKI_CONTAINER___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_STEREOTYPE_APPLICATION__STEREOTYPE = QWikiPackage.QWIKI_CONTAINER___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_STEREOTYPE_APPLICATIONS = QWikiPackage.QWIKI_CONTAINER___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_TARGET_DIRECTED_RELATIONSHIPS = QWikiPackage.QWIKI_CONTAINER___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = QWikiPackage.QWIKI_CONTAINER___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_VALUE__STEREOTYPE_STRING = QWikiPackage.QWIKI_CONTAINER___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___HAS_KEYWORD__STRING = QWikiPackage.QWIKI_CONTAINER___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___HAS_VALUE__STEREOTYPE_STRING = QWikiPackage.QWIKI_CONTAINER___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = QWikiPackage.QWIKI_CONTAINER___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___IS_STEREOTYPE_APPLIED__STEREOTYPE = QWikiPackage.QWIKI_CONTAINER___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___IS_STEREOTYPE_REQUIRED__STEREOTYPE = QWikiPackage.QWIKI_CONTAINER___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___REMOVE_KEYWORD__STRING = QWikiPackage.QWIKI_CONTAINER___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___SET_VALUE__STEREOTYPE_STRING_OBJECT = QWikiPackage.QWIKI_CONTAINER___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___UNAPPLY_STEREOTYPE__STEREOTYPE = QWikiPackage.QWIKI_CONTAINER___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___ALL_OWNED_ELEMENTS = QWikiPackage.QWIKI_CONTAINER___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___MUST_BE_OWNED = QWikiPackage.QWIKI_CONTAINER___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = QWikiPackage.QWIKI_CONTAINER___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = QWikiPackage.QWIKI_CONTAINER___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = QWikiPackage.QWIKI_CONTAINER___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___CREATE_DEPENDENCY__NAMEDELEMENT = QWikiPackage.QWIKI_CONTAINER___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___CREATE_USAGE__NAMEDELEMENT = QWikiPackage.QWIKI_CONTAINER___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_LABEL = QWikiPackage.QWIKI_CONTAINER___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_LABEL__BOOLEAN = QWikiPackage.QWIKI_CONTAINER___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_NAMESPACE = QWikiPackage.QWIKI_CONTAINER___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___ALL_NAMESPACES = QWikiPackage.QWIKI_CONTAINER___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___ALL_OWNING_PACKAGES = QWikiPackage.QWIKI_CONTAINER___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = QWikiPackage.QWIKI_CONTAINER___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_QUALIFIED_NAME = QWikiPackage.QWIKI_CONTAINER___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___SEPARATOR = QWikiPackage.QWIKI_CONTAINER___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_CLIENT_DEPENDENCIES = QWikiPackage.QWIKI_CONTAINER___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = QWikiPackage.QWIKI_CONTAINER___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP = QWikiPackage.QWIKI_CONTAINER___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP = QWikiPackage.QWIKI_CONTAINER___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Element Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = QWikiPackage.QWIKI_CONTAINER___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Create Package Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = QWikiPackage.QWIKI_CONTAINER___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Get Imported Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_IMPORTED_ELEMENTS = QWikiPackage.QWIKI_CONTAINER___GET_IMPORTED_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Imported Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_IMPORTED_PACKAGES = QWikiPackage.QWIKI_CONTAINER___GET_IMPORTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_OWNED_MEMBERS = QWikiPackage.QWIKI_CONTAINER___GET_OWNED_MEMBERS;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___EXCLUDE_COLLISIONS__ELIST = QWikiPackage.QWIKI_CONTAINER___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_NAMES_OF_MEMBER__NAMEDELEMENT = QWikiPackage.QWIKI_CONTAINER___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___IMPORT_MEMBERS__ELIST = QWikiPackage.QWIKI_CONTAINER___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Get Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___GET_IMPORTED_MEMBERS = QWikiPackage.QWIKI_CONTAINER___GET_IMPORTED_MEMBERS;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___MEMBERS_ARE_DISTINGUISHABLE = QWikiPackage.QWIKI_CONTAINER___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Qwiki Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___QWIKI_MODEL = QWikiPackage.QWIKI_CONTAINER___QWIKI_MODEL;

	/**
	 * The operation id for the '<em>Object Id For Domain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___OBJECT_ID_FOR_DOMAIN = QWikiPackage.QWIKI_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Object Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___OBJECT_ID = QWikiPackage.QWIKI_CONTAINER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Process Reference Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL_OPERATION_COUNT = QWikiPackage.QWIKI_CONTAINER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link QWiki.Spice.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Spice.impl.ProcessImpl
	 * @see QWiki.Spice.impl.SpicePackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 3;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__EANNOTATIONS = SPICE_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OWNED_COMMENT = SPICE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OWNED_ELEMENT = SPICE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OWNER = SPICE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CLIENT_DEPENDENCY = SPICE_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = SPICE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME_EXPRESSION = SPICE_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAMESPACE = SPICE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__QUALIFIED_NAME = SPICE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__VISIBILITY = SPICE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OWNED_RULE = SPICE_ELEMENT__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ELEMENT_IMPORT = SPICE_ELEMENT__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PACKAGE_IMPORT = SPICE_ELEMENT__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OWNED_MEMBER = SPICE_ELEMENT__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__IMPORTED_MEMBER = SPICE_ELEMENT__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__MEMBER = SPICE_ELEMENT__MEMBER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__UUID = SPICE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CUSTOM_PROPERTY = SPICE_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__TAG = SPICE_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Qwiki Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__QWIKI_NAMESPACE = SPICE_ELEMENT__QWIKI_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DISPLAY_NAME = SPICE_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Qwiki Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__QWIKI_ELEMENT = SPICE_ELEMENT__QWIKI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PURPOSE = SPICE_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CONTENT = SPICE_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Responsible Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__RESPONSIBLE_ROLE = SPICE_ELEMENT__RESPONSIBLE_ROLE;

	/**
	 * The feature id for the '<em><b>Accountable Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ACCOUNTABLE_ROLE = SPICE_ELEMENT__ACCOUNTABLE_ROLE;

	/**
	 * The feature id for the '<em><b>Support Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SUPPORT_ROLE = SPICE_ELEMENT__SUPPORT_ROLE;

	/**
	 * The feature id for the '<em><b>Consulted Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CONSULTED_ROLE = SPICE_ELEMENT__CONSULTED_ROLE;

	/**
	 * The feature id for the '<em><b>Informed Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__INFORMED_ROLE = SPICE_ELEMENT__INFORMED_ROLE;

	/**
	 * The feature id for the '<em><b>Owning Process Reference Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OWNING_PROCESS_REFERENCE_MODEL = SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NUMBER = SPICE_ELEMENT__NUMBER;

	/**
	 * The feature id for the '<em><b>Facilitated Section</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__FACILITATED_SECTION = SPICE_ELEMENT__FACILITATED_SECTION;

	/**
	 * The feature id for the '<em><b>Owner Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OWNER_ROLE = SPICE_ELEMENT__OWNER_ROLE;

	/**
	 * The feature id for the '<em><b>Manager Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__MANAGER_ROLE = SPICE_ELEMENT__MANAGER_ROLE;

	/**
	 * The feature id for the '<em><b>Participant Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PARTICIPANT_ROLE = SPICE_ELEMENT__PARTICIPANT_ROLE;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ROLE = SPICE_ELEMENT__ROLE;

	/**
	 * The feature id for the '<em><b>Owning Process Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OWNING_PROCESS_GROUP = SPICE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Outcome</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OWNED_OUTCOME = SPICE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Facilitating Work Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__FACILITATING_WORK_PRODUCT = SPICE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Facilitated Work Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__FACILITATED_WORK_PRODUCT = SPICE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Base Practise</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OWNED_BASE_PRACTISE = SPICE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = SPICE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_EANNOTATION__STRING = SPICE_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___ADD_KEYWORD__STRING = SPICE_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___APPLY_STEREOTYPE__STEREOTYPE = SPICE_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___CREATE_EANNOTATION__STRING = SPICE_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___DESTROY = SPICE_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_KEYWORDS = SPICE_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_APPLICABLE_STEREOTYPE__STRING = SPICE_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_APPLICABLE_STEREOTYPES = SPICE_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_APPLIED_STEREOTYPE__STRING = SPICE_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_APPLIED_STEREOTYPES = SPICE_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = SPICE_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = SPICE_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_MODEL = SPICE_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_NEAREST_PACKAGE = SPICE_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_RELATIONSHIPS = SPICE_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_RELATIONSHIPS__ECLASS = SPICE_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_REQUIRED_STEREOTYPE__STRING = SPICE_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_REQUIRED_STEREOTYPES = SPICE_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_SOURCE_DIRECTED_RELATIONSHIPS = SPICE_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = SPICE_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_STEREOTYPE_APPLICATION__STEREOTYPE = SPICE_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_STEREOTYPE_APPLICATIONS = SPICE_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_TARGET_DIRECTED_RELATIONSHIPS = SPICE_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = SPICE_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_VALUE__STEREOTYPE_STRING = SPICE_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___HAS_KEYWORD__STRING = SPICE_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___HAS_VALUE__STEREOTYPE_STRING = SPICE_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = SPICE_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___IS_STEREOTYPE_APPLIED__STEREOTYPE = SPICE_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___IS_STEREOTYPE_REQUIRED__STEREOTYPE = SPICE_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___REMOVE_KEYWORD__STRING = SPICE_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___SET_VALUE__STEREOTYPE_STRING_OBJECT = SPICE_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___UNAPPLY_STEREOTYPE__STEREOTYPE = SPICE_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___ALL_OWNED_ELEMENTS = SPICE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___MUST_BE_OWNED = SPICE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___CREATE_DEPENDENCY__NAMEDELEMENT = SPICE_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___CREATE_USAGE__NAMEDELEMENT = SPICE_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_LABEL = SPICE_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_LABEL__BOOLEAN = SPICE_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_NAMESPACE = SPICE_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___ALL_NAMESPACES = SPICE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___ALL_OWNING_PACKAGES = SPICE_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = SPICE_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_QUALIFIED_NAME = SPICE_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___SEPARATOR = SPICE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_CLIENT_DEPENDENCIES = SPICE_ELEMENT___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Element Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = SPICE_ELEMENT___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Create Package Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = SPICE_ELEMENT___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Get Imported Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_IMPORTED_ELEMENTS = SPICE_ELEMENT___GET_IMPORTED_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Imported Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_IMPORTED_PACKAGES = SPICE_ELEMENT___GET_IMPORTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_OWNED_MEMBERS = SPICE_ELEMENT___GET_OWNED_MEMBERS;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___EXCLUDE_COLLISIONS__ELIST = SPICE_ELEMENT___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_NAMES_OF_MEMBER__NAMEDELEMENT = SPICE_ELEMENT___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___IMPORT_MEMBERS__ELIST = SPICE_ELEMENT___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Get Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___GET_IMPORTED_MEMBERS = SPICE_ELEMENT___GET_IMPORTED_MEMBERS;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___MEMBERS_ARE_DISTINGUISHABLE = SPICE_ELEMENT___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Qwiki Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___QWIKI_MODEL = SPICE_ELEMENT___QWIKI_MODEL;

	/**
	 * The operation id for the '<em>Object Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___OBJECT_ID = SPICE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = SPICE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link QWiki.Spice.impl.ProcessGroupImpl <em>Process Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Spice.impl.ProcessGroupImpl
	 * @see QWiki.Spice.impl.SpicePackageImpl#getProcessGroup()
	 * @generated
	 */
	int PROCESS_GROUP = 4;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__EANNOTATIONS = SPICE_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__OWNED_COMMENT = SPICE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__OWNED_ELEMENT = SPICE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__OWNER = SPICE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__CLIENT_DEPENDENCY = SPICE_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__NAME = SPICE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__NAME_EXPRESSION = SPICE_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__NAMESPACE = SPICE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__QUALIFIED_NAME = SPICE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__VISIBILITY = SPICE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__OWNED_RULE = SPICE_ELEMENT__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__ELEMENT_IMPORT = SPICE_ELEMENT__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__PACKAGE_IMPORT = SPICE_ELEMENT__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__OWNED_MEMBER = SPICE_ELEMENT__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__IMPORTED_MEMBER = SPICE_ELEMENT__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__MEMBER = SPICE_ELEMENT__MEMBER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__UUID = SPICE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__CUSTOM_PROPERTY = SPICE_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__TAG = SPICE_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Qwiki Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__QWIKI_NAMESPACE = SPICE_ELEMENT__QWIKI_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__DISPLAY_NAME = SPICE_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Qwiki Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__QWIKI_ELEMENT = SPICE_ELEMENT__QWIKI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__PURPOSE = SPICE_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__CONTENT = SPICE_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Responsible Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__RESPONSIBLE_ROLE = SPICE_ELEMENT__RESPONSIBLE_ROLE;

	/**
	 * The feature id for the '<em><b>Accountable Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__ACCOUNTABLE_ROLE = SPICE_ELEMENT__ACCOUNTABLE_ROLE;

	/**
	 * The feature id for the '<em><b>Support Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__SUPPORT_ROLE = SPICE_ELEMENT__SUPPORT_ROLE;

	/**
	 * The feature id for the '<em><b>Consulted Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__CONSULTED_ROLE = SPICE_ELEMENT__CONSULTED_ROLE;

	/**
	 * The feature id for the '<em><b>Informed Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__INFORMED_ROLE = SPICE_ELEMENT__INFORMED_ROLE;

	/**
	 * The feature id for the '<em><b>Owning Process Reference Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__OWNING_PROCESS_REFERENCE_MODEL = SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__NUMBER = SPICE_ELEMENT__NUMBER;

	/**
	 * The feature id for the '<em><b>Facilitated Section</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__FACILITATED_SECTION = SPICE_ELEMENT__FACILITATED_SECTION;

	/**
	 * The feature id for the '<em><b>Owner Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__OWNER_ROLE = SPICE_ELEMENT__OWNER_ROLE;

	/**
	 * The feature id for the '<em><b>Manager Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__MANAGER_ROLE = SPICE_ELEMENT__MANAGER_ROLE;

	/**
	 * The feature id for the '<em><b>Participant Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__PARTICIPANT_ROLE = SPICE_ELEMENT__PARTICIPANT_ROLE;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__ROLE = SPICE_ELEMENT__ROLE;

	/**
	 * The feature id for the '<em><b>Owned Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__OWNED_PROCESS = SPICE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Process Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP_FEATURE_COUNT = SPICE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_EANNOTATION__STRING = SPICE_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___ADD_KEYWORD__STRING = SPICE_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___APPLY_STEREOTYPE__STEREOTYPE = SPICE_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___CREATE_EANNOTATION__STRING = SPICE_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___DESTROY = SPICE_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_KEYWORDS = SPICE_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_APPLICABLE_STEREOTYPE__STRING = SPICE_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_APPLICABLE_STEREOTYPES = SPICE_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_APPLIED_STEREOTYPE__STRING = SPICE_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_APPLIED_STEREOTYPES = SPICE_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = SPICE_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = SPICE_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_MODEL = SPICE_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_NEAREST_PACKAGE = SPICE_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_RELATIONSHIPS = SPICE_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_RELATIONSHIPS__ECLASS = SPICE_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_REQUIRED_STEREOTYPE__STRING = SPICE_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_REQUIRED_STEREOTYPES = SPICE_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_SOURCE_DIRECTED_RELATIONSHIPS = SPICE_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = SPICE_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_STEREOTYPE_APPLICATION__STEREOTYPE = SPICE_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_STEREOTYPE_APPLICATIONS = SPICE_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_TARGET_DIRECTED_RELATIONSHIPS = SPICE_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = SPICE_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_VALUE__STEREOTYPE_STRING = SPICE_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___HAS_KEYWORD__STRING = SPICE_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___HAS_VALUE__STEREOTYPE_STRING = SPICE_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = SPICE_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___IS_STEREOTYPE_APPLIED__STEREOTYPE = SPICE_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___IS_STEREOTYPE_REQUIRED__STEREOTYPE = SPICE_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___REMOVE_KEYWORD__STRING = SPICE_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___SET_VALUE__STEREOTYPE_STRING_OBJECT = SPICE_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___UNAPPLY_STEREOTYPE__STEREOTYPE = SPICE_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___ALL_OWNED_ELEMENTS = SPICE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___MUST_BE_OWNED = SPICE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___CREATE_DEPENDENCY__NAMEDELEMENT = SPICE_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___CREATE_USAGE__NAMEDELEMENT = SPICE_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_LABEL = SPICE_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_LABEL__BOOLEAN = SPICE_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_NAMESPACE = SPICE_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___ALL_NAMESPACES = SPICE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___ALL_OWNING_PACKAGES = SPICE_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = SPICE_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_QUALIFIED_NAME = SPICE_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___SEPARATOR = SPICE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_CLIENT_DEPENDENCIES = SPICE_ELEMENT___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Element Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = SPICE_ELEMENT___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Create Package Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = SPICE_ELEMENT___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Get Imported Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_IMPORTED_ELEMENTS = SPICE_ELEMENT___GET_IMPORTED_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Imported Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_IMPORTED_PACKAGES = SPICE_ELEMENT___GET_IMPORTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_OWNED_MEMBERS = SPICE_ELEMENT___GET_OWNED_MEMBERS;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___EXCLUDE_COLLISIONS__ELIST = SPICE_ELEMENT___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_NAMES_OF_MEMBER__NAMEDELEMENT = SPICE_ELEMENT___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___IMPORT_MEMBERS__ELIST = SPICE_ELEMENT___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Get Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___GET_IMPORTED_MEMBERS = SPICE_ELEMENT___GET_IMPORTED_MEMBERS;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___MEMBERS_ARE_DISTINGUISHABLE = SPICE_ELEMENT___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Qwiki Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___QWIKI_MODEL = SPICE_ELEMENT___QWIKI_MODEL;

	/**
	 * The operation id for the '<em>Object Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___OBJECT_ID = SPICE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Process Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP_OPERATION_COUNT = SPICE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link QWiki.Spice.impl.OutcomeImpl <em>Outcome</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Spice.impl.OutcomeImpl
	 * @see QWiki.Spice.impl.SpicePackageImpl#getOutcome()
	 * @generated
	 */
	int OUTCOME = 5;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__EANNOTATIONS = QWikiPackage.L1_0N_NAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__OWNED_COMMENT = QWikiPackage.L1_0N_NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__OWNED_ELEMENT = QWikiPackage.L1_0N_NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__OWNER = QWikiPackage.L1_0N_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__CLIENT_DEPENDENCY = QWikiPackage.L1_0N_NAMED_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__NAME = QWikiPackage.L1_0N_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__NAME_EXPRESSION = QWikiPackage.L1_0N_NAMED_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__NAMESPACE = QWikiPackage.L1_0N_NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__QUALIFIED_NAME = QWikiPackage.L1_0N_NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__VISIBILITY = QWikiPackage.L1_0N_NAMED_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__UUID = QWikiPackage.L1_0N_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__CUSTOM_PROPERTY = QWikiPackage.L1_0N_NAMED_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__TAG = QWikiPackage.L1_0N_NAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Qwiki Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__QWIKI_NAMESPACE = QWikiPackage.L1_0N_NAMED_ELEMENT__QWIKI_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__DISPLAY_NAME = QWikiPackage.L1_0N_NAMED_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Facilitating Base Practise</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__FACILITATING_BASE_PRACTISE = QWikiPackage.L1_0N_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Workproduct</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__REQUIRED_WORKPRODUCT = QWikiPackage.L1_0N_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resulting Workproduct</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__RESULTING_WORKPRODUCT = QWikiPackage.L1_0N_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owning Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__OWNING_PROCESS = QWikiPackage.L1_0N_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Outcome</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME_FEATURE_COUNT = QWikiPackage.L1_0N_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___GET_EANNOTATION__STRING = QWikiPackage.L1_0N_NAMED_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = QWikiPackage.L1_0N_NAMED_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = QWikiPackage.L1_0N_NAMED_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___ADD_KEYWORD__STRING = QWikiPackage.L1_0N_NAMED_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___APPLY_STEREOTYPE__STEREOTYPE = QWikiPackage.L1_0N_NAMED_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___CREATE_EANNOTATION__STRING = QWikiPackage.L1_0N_NAMED_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___DESTROY = QWikiPackage.L1_0N_NAMED_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___GET_KEYWORDS = QWikiPackage.L1_0N_NAMED_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___GET_APPLICABLE_STEREOTYPE__STRING = QWikiPackage.L1_0N_NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___GET_APPLICABLE_STEREOTYPES = QWikiPackage.L1_0N_NAMED_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___GET_APPLIED_STEREOTYPE__STRING = QWikiPackage.L1_0N_NAMED_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___GET_APPLIED_STEREOTYPES = QWikiPackage.L1_0N_NAMED_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = QWikiPackage.L1_0N_NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = QWikiPackage.L1_0N_NAMED_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___GET_MODEL = QWikiPackage.L1_0N_NAMED_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___GET_NEAREST_PACKAGE = QWikiPackage.L1_0N_NAMED_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___GET_RELATIONSHIPS = QWikiPackage.L1_0N_NAMED_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___GET_RELATIONSHIPS__ECLASS = QWikiPackage.L1_0N_NAMED_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___GET_REQUIRED_STEREOTYPE__STRING = QWikiPackage.L1_0N_NAMED_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___GET_REQUIRED_STEREOTYPES = QWikiPackage.L1_0N_NAMED_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___GET_SOURCE_DIRECTED_RELATIONSHIPS = QWikiPackage.L1_0N_NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = QWikiPackage.L1_0N_NAMED_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___GET_STEREOTYPE_APPLICATION__STEREOTYPE = QWikiPackage.L1_0N_NAMED_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___GET_STEREOTYPE_APPLICATIONS = QWikiPackage.L1_0N_NAMED_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___GET_TARGET_DIRECTED_RELATIONSHIPS = QWikiPackage.L1_0N_NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = QWikiPackage.L1_0N_NAMED_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___GET_VALUE__STEREOTYPE_STRING = QWikiPackage.L1_0N_NAMED_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___HAS_KEYWORD__STRING = QWikiPackage.L1_0N_NAMED_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___HAS_VALUE__STEREOTYPE_STRING = QWikiPackage.L1_0N_NAMED_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = QWikiPackage.L1_0N_NAMED_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___IS_STEREOTYPE_APPLIED__STEREOTYPE = QWikiPackage.L1_0N_NAMED_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___IS_STEREOTYPE_REQUIRED__STEREOTYPE = QWikiPackage.L1_0N_NAMED_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___REMOVE_KEYWORD__STRING = QWikiPackage.L1_0N_NAMED_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___SET_VALUE__STEREOTYPE_STRING_OBJECT = QWikiPackage.L1_0N_NAMED_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___UNAPPLY_STEREOTYPE__STEREOTYPE = QWikiPackage.L1_0N_NAMED_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___ALL_OWNED_ELEMENTS = QWikiPackage.L1_0N_NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___MUST_BE_OWNED = QWikiPackage.L1_0N_NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = QWikiPackage.L1_0N_NAMED_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = QWikiPackage.L1_0N_NAMED_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = QWikiPackage.L1_0N_NAMED_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___CREATE_DEPENDENCY__NAMEDELEMENT = QWikiPackage.L1_0N_NAMED_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___CREATE_USAGE__NAMEDELEMENT = QWikiPackage.L1_0N_NAMED_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___GET_LABEL = QWikiPackage.L1_0N_NAMED_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___GET_LABEL__BOOLEAN = QWikiPackage.L1_0N_NAMED_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___GET_NAMESPACE = QWikiPackage.L1_0N_NAMED_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___ALL_NAMESPACES = QWikiPackage.L1_0N_NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___ALL_OWNING_PACKAGES = QWikiPackage.L1_0N_NAMED_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = QWikiPackage.L1_0N_NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___GET_QUALIFIED_NAME = QWikiPackage.L1_0N_NAMED_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___SEPARATOR = QWikiPackage.L1_0N_NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___GET_CLIENT_DEPENDENCIES = QWikiPackage.L1_0N_NAMED_ELEMENT___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Qwiki Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___QWIKI_MODEL = QWikiPackage.L1_0N_NAMED_ELEMENT___QWIKI_MODEL;

	/**
	 * The operation id for the '<em>Object Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___OBJECT_ID = QWikiPackage.L1_0N_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Outcome</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME_OPERATION_COUNT = QWikiPackage.L1_0N_NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link QWiki.Spice.impl.WorkProductImpl <em>Work Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Spice.impl.WorkProductImpl
	 * @see QWiki.Spice.impl.SpicePackageImpl#getWorkProduct()
	 * @generated
	 */
	int WORK_PRODUCT = 6;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__EANNOTATIONS = SPICE_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__OWNED_COMMENT = SPICE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__OWNED_ELEMENT = SPICE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__OWNER = SPICE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__CLIENT_DEPENDENCY = SPICE_ELEMENT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__NAME = SPICE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__NAME_EXPRESSION = SPICE_ELEMENT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__NAMESPACE = SPICE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__QUALIFIED_NAME = SPICE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__VISIBILITY = SPICE_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__OWNED_RULE = SPICE_ELEMENT__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__ELEMENT_IMPORT = SPICE_ELEMENT__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__PACKAGE_IMPORT = SPICE_ELEMENT__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__OWNED_MEMBER = SPICE_ELEMENT__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__IMPORTED_MEMBER = SPICE_ELEMENT__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__MEMBER = SPICE_ELEMENT__MEMBER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__UUID = SPICE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__CUSTOM_PROPERTY = SPICE_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__TAG = SPICE_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Qwiki Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__QWIKI_NAMESPACE = SPICE_ELEMENT__QWIKI_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__DISPLAY_NAME = SPICE_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Qwiki Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__QWIKI_ELEMENT = SPICE_ELEMENT__QWIKI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__PURPOSE = SPICE_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__CONTENT = SPICE_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Responsible Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__RESPONSIBLE_ROLE = SPICE_ELEMENT__RESPONSIBLE_ROLE;

	/**
	 * The feature id for the '<em><b>Accountable Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__ACCOUNTABLE_ROLE = SPICE_ELEMENT__ACCOUNTABLE_ROLE;

	/**
	 * The feature id for the '<em><b>Support Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__SUPPORT_ROLE = SPICE_ELEMENT__SUPPORT_ROLE;

	/**
	 * The feature id for the '<em><b>Consulted Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__CONSULTED_ROLE = SPICE_ELEMENT__CONSULTED_ROLE;

	/**
	 * The feature id for the '<em><b>Informed Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__INFORMED_ROLE = SPICE_ELEMENT__INFORMED_ROLE;

	/**
	 * The feature id for the '<em><b>Owning Process Reference Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__OWNING_PROCESS_REFERENCE_MODEL = SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__NUMBER = SPICE_ELEMENT__NUMBER;

	/**
	 * The feature id for the '<em><b>Facilitated Section</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__FACILITATED_SECTION = SPICE_ELEMENT__FACILITATED_SECTION;

	/**
	 * The feature id for the '<em><b>Owner Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__OWNER_ROLE = SPICE_ELEMENT__OWNER_ROLE;

	/**
	 * The feature id for the '<em><b>Manager Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__MANAGER_ROLE = SPICE_ELEMENT__MANAGER_ROLE;

	/**
	 * The feature id for the '<em><b>Participant Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__PARTICIPANT_ROLE = SPICE_ELEMENT__PARTICIPANT_ROLE;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__ROLE = SPICE_ELEMENT__ROLE;

	/**
	 * The feature id for the '<em><b>Owning Work Product Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP = SPICE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__CHARACTERISTIC = SPICE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Facilitating Outcome</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__FACILITATING_OUTCOME = SPICE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Facilitated Process</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__FACILITATED_PROCESS = SPICE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Facilitating Process</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__FACILITATING_PROCESS = SPICE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Work Product Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__WORK_PRODUCT_TYPE = SPICE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Contained Work Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__CONTAINED_WORK_PRODUCT = SPICE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Containing Work Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__CONTAINING_WORK_PRODUCT = SPICE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Linked Work Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__LINKED_WORK_PRODUCT = SPICE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__LINK = SPICE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Facilitated Outcome</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__FACILITATED_OUTCOME = SPICE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Work Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_FEATURE_COUNT = SPICE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_EANNOTATION__STRING = SPICE_ELEMENT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___ADD_KEYWORD__STRING = SPICE_ELEMENT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___APPLY_STEREOTYPE__STEREOTYPE = SPICE_ELEMENT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___CREATE_EANNOTATION__STRING = SPICE_ELEMENT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___DESTROY = SPICE_ELEMENT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_KEYWORDS = SPICE_ELEMENT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_APPLICABLE_STEREOTYPE__STRING = SPICE_ELEMENT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_APPLICABLE_STEREOTYPES = SPICE_ELEMENT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_APPLIED_STEREOTYPE__STRING = SPICE_ELEMENT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_APPLIED_STEREOTYPES = SPICE_ELEMENT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = SPICE_ELEMENT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = SPICE_ELEMENT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_MODEL = SPICE_ELEMENT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_NEAREST_PACKAGE = SPICE_ELEMENT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_RELATIONSHIPS = SPICE_ELEMENT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_RELATIONSHIPS__ECLASS = SPICE_ELEMENT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_REQUIRED_STEREOTYPE__STRING = SPICE_ELEMENT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_REQUIRED_STEREOTYPES = SPICE_ELEMENT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_SOURCE_DIRECTED_RELATIONSHIPS = SPICE_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = SPICE_ELEMENT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = SPICE_ELEMENT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_STEREOTYPE_APPLICATIONS = SPICE_ELEMENT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_TARGET_DIRECTED_RELATIONSHIPS = SPICE_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = SPICE_ELEMENT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_VALUE__STEREOTYPE_STRING = SPICE_ELEMENT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___HAS_KEYWORD__STRING = SPICE_ELEMENT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___HAS_VALUE__STEREOTYPE_STRING = SPICE_ELEMENT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = SPICE_ELEMENT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___IS_STEREOTYPE_APPLIED__STEREOTYPE = SPICE_ELEMENT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = SPICE_ELEMENT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___REMOVE_KEYWORD__STRING = SPICE_ELEMENT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___SET_VALUE__STEREOTYPE_STRING_OBJECT = SPICE_ELEMENT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___UNAPPLY_STEREOTYPE__STEREOTYPE = SPICE_ELEMENT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___ALL_OWNED_ELEMENTS = SPICE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___MUST_BE_OWNED = SPICE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___CREATE_DEPENDENCY__NAMEDELEMENT = SPICE_ELEMENT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___CREATE_USAGE__NAMEDELEMENT = SPICE_ELEMENT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_LABEL = SPICE_ELEMENT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_LABEL__BOOLEAN = SPICE_ELEMENT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_NAMESPACE = SPICE_ELEMENT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___ALL_NAMESPACES = SPICE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___ALL_OWNING_PACKAGES = SPICE_ELEMENT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = SPICE_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_QUALIFIED_NAME = SPICE_ELEMENT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___SEPARATOR = SPICE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_CLIENT_DEPENDENCIES = SPICE_ELEMENT___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP = SPICE_ELEMENT___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Element Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = SPICE_ELEMENT___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Create Package Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = SPICE_ELEMENT___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Get Imported Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_IMPORTED_ELEMENTS = SPICE_ELEMENT___GET_IMPORTED_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Imported Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_IMPORTED_PACKAGES = SPICE_ELEMENT___GET_IMPORTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_OWNED_MEMBERS = SPICE_ELEMENT___GET_OWNED_MEMBERS;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___EXCLUDE_COLLISIONS__ELIST = SPICE_ELEMENT___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_NAMES_OF_MEMBER__NAMEDELEMENT = SPICE_ELEMENT___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___IMPORT_MEMBERS__ELIST = SPICE_ELEMENT___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Get Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___GET_IMPORTED_MEMBERS = SPICE_ELEMENT___GET_IMPORTED_MEMBERS;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___MEMBERS_ARE_DISTINGUISHABLE = SPICE_ELEMENT___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Qwiki Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___QWIKI_MODEL = SPICE_ELEMENT___QWIKI_MODEL;

	/**
	 * The operation id for the '<em>Object Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___OBJECT_ID = SPICE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Work Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_OPERATION_COUNT = SPICE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link QWiki.Spice.impl.GenericWorkProductImpl <em>Generic Work Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Spice.impl.GenericWorkProductImpl
	 * @see QWiki.Spice.impl.SpicePackageImpl#getGenericWorkProduct()
	 * @generated
	 */
	int GENERIC_WORK_PRODUCT = 7;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__EANNOTATIONS = WORK_PRODUCT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__OWNED_COMMENT = WORK_PRODUCT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__OWNED_ELEMENT = WORK_PRODUCT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__OWNER = WORK_PRODUCT__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__CLIENT_DEPENDENCY = WORK_PRODUCT__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__NAME = WORK_PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__NAME_EXPRESSION = WORK_PRODUCT__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__NAMESPACE = WORK_PRODUCT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__QUALIFIED_NAME = WORK_PRODUCT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__VISIBILITY = WORK_PRODUCT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__OWNED_RULE = WORK_PRODUCT__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__ELEMENT_IMPORT = WORK_PRODUCT__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__PACKAGE_IMPORT = WORK_PRODUCT__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__OWNED_MEMBER = WORK_PRODUCT__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__IMPORTED_MEMBER = WORK_PRODUCT__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__MEMBER = WORK_PRODUCT__MEMBER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__UUID = WORK_PRODUCT__UUID;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__CUSTOM_PROPERTY = WORK_PRODUCT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__TAG = WORK_PRODUCT__TAG;

	/**
	 * The feature id for the '<em><b>Qwiki Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__QWIKI_NAMESPACE = WORK_PRODUCT__QWIKI_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__DISPLAY_NAME = WORK_PRODUCT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Qwiki Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__QWIKI_ELEMENT = WORK_PRODUCT__QWIKI_ELEMENT;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__PURPOSE = WORK_PRODUCT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__CONTENT = WORK_PRODUCT__CONTENT;

	/**
	 * The feature id for the '<em><b>Responsible Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__RESPONSIBLE_ROLE = WORK_PRODUCT__RESPONSIBLE_ROLE;

	/**
	 * The feature id for the '<em><b>Accountable Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__ACCOUNTABLE_ROLE = WORK_PRODUCT__ACCOUNTABLE_ROLE;

	/**
	 * The feature id for the '<em><b>Support Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__SUPPORT_ROLE = WORK_PRODUCT__SUPPORT_ROLE;

	/**
	 * The feature id for the '<em><b>Consulted Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__CONSULTED_ROLE = WORK_PRODUCT__CONSULTED_ROLE;

	/**
	 * The feature id for the '<em><b>Informed Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__INFORMED_ROLE = WORK_PRODUCT__INFORMED_ROLE;

	/**
	 * The feature id for the '<em><b>Owning Process Reference Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__OWNING_PROCESS_REFERENCE_MODEL = WORK_PRODUCT__OWNING_PROCESS_REFERENCE_MODEL;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__NUMBER = WORK_PRODUCT__NUMBER;

	/**
	 * The feature id for the '<em><b>Facilitated Section</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__FACILITATED_SECTION = WORK_PRODUCT__FACILITATED_SECTION;

	/**
	 * The feature id for the '<em><b>Owner Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__OWNER_ROLE = WORK_PRODUCT__OWNER_ROLE;

	/**
	 * The feature id for the '<em><b>Manager Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__MANAGER_ROLE = WORK_PRODUCT__MANAGER_ROLE;

	/**
	 * The feature id for the '<em><b>Participant Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__PARTICIPANT_ROLE = WORK_PRODUCT__PARTICIPANT_ROLE;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__ROLE = WORK_PRODUCT__ROLE;

	/**
	 * The feature id for the '<em><b>Owning Work Product Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP = WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__CHARACTERISTIC = WORK_PRODUCT__CHARACTERISTIC;

	/**
	 * The feature id for the '<em><b>Facilitating Outcome</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__FACILITATING_OUTCOME = WORK_PRODUCT__FACILITATING_OUTCOME;

	/**
	 * The feature id for the '<em><b>Facilitated Process</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__FACILITATED_PROCESS = WORK_PRODUCT__FACILITATED_PROCESS;

	/**
	 * The feature id for the '<em><b>Facilitating Process</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__FACILITATING_PROCESS = WORK_PRODUCT__FACILITATING_PROCESS;

	/**
	 * The feature id for the '<em><b>Work Product Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__WORK_PRODUCT_TYPE = WORK_PRODUCT__WORK_PRODUCT_TYPE;

	/**
	 * The feature id for the '<em><b>Contained Work Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__CONTAINED_WORK_PRODUCT = WORK_PRODUCT__CONTAINED_WORK_PRODUCT;

	/**
	 * The feature id for the '<em><b>Containing Work Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__CONTAINING_WORK_PRODUCT = WORK_PRODUCT__CONTAINING_WORK_PRODUCT;

	/**
	 * The feature id for the '<em><b>Linked Work Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__LINKED_WORK_PRODUCT = WORK_PRODUCT__LINKED_WORK_PRODUCT;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__LINK = WORK_PRODUCT__LINK;

	/**
	 * The feature id for the '<em><b>Facilitated Outcome</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__FACILITATED_OUTCOME = WORK_PRODUCT__FACILITATED_OUTCOME;

	/**
	 * The feature id for the '<em><b>Owned Work Product</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT = WORK_PRODUCT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generic Work Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT_FEATURE_COUNT = WORK_PRODUCT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_EANNOTATION__STRING = WORK_PRODUCT___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = WORK_PRODUCT___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = WORK_PRODUCT___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___ADD_KEYWORD__STRING = WORK_PRODUCT___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___APPLY_STEREOTYPE__STEREOTYPE = WORK_PRODUCT___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___CREATE_EANNOTATION__STRING = WORK_PRODUCT___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___DESTROY = WORK_PRODUCT___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_KEYWORDS = WORK_PRODUCT___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_APPLICABLE_STEREOTYPE__STRING = WORK_PRODUCT___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_APPLICABLE_STEREOTYPES = WORK_PRODUCT___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_APPLIED_STEREOTYPE__STRING = WORK_PRODUCT___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_APPLIED_STEREOTYPES = WORK_PRODUCT___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = WORK_PRODUCT___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = WORK_PRODUCT___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_MODEL = WORK_PRODUCT___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_NEAREST_PACKAGE = WORK_PRODUCT___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_RELATIONSHIPS = WORK_PRODUCT___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_RELATIONSHIPS__ECLASS = WORK_PRODUCT___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_REQUIRED_STEREOTYPE__STRING = WORK_PRODUCT___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_REQUIRED_STEREOTYPES = WORK_PRODUCT___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_SOURCE_DIRECTED_RELATIONSHIPS = WORK_PRODUCT___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = WORK_PRODUCT___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_STEREOTYPE_APPLICATION__STEREOTYPE = WORK_PRODUCT___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_STEREOTYPE_APPLICATIONS = WORK_PRODUCT___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_TARGET_DIRECTED_RELATIONSHIPS = WORK_PRODUCT___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = WORK_PRODUCT___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_VALUE__STEREOTYPE_STRING = WORK_PRODUCT___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___HAS_KEYWORD__STRING = WORK_PRODUCT___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___HAS_VALUE__STEREOTYPE_STRING = WORK_PRODUCT___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = WORK_PRODUCT___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___IS_STEREOTYPE_APPLIED__STEREOTYPE = WORK_PRODUCT___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___IS_STEREOTYPE_REQUIRED__STEREOTYPE = WORK_PRODUCT___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___REMOVE_KEYWORD__STRING = WORK_PRODUCT___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___SET_VALUE__STEREOTYPE_STRING_OBJECT = WORK_PRODUCT___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___UNAPPLY_STEREOTYPE__STEREOTYPE = WORK_PRODUCT___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___ALL_OWNED_ELEMENTS = WORK_PRODUCT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___MUST_BE_OWNED = WORK_PRODUCT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = WORK_PRODUCT___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = WORK_PRODUCT___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = WORK_PRODUCT___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___CREATE_DEPENDENCY__NAMEDELEMENT = WORK_PRODUCT___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___CREATE_USAGE__NAMEDELEMENT = WORK_PRODUCT___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_LABEL = WORK_PRODUCT___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_LABEL__BOOLEAN = WORK_PRODUCT___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_NAMESPACE = WORK_PRODUCT___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___ALL_NAMESPACES = WORK_PRODUCT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___ALL_OWNING_PACKAGES = WORK_PRODUCT___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = WORK_PRODUCT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_QUALIFIED_NAME = WORK_PRODUCT___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___SEPARATOR = WORK_PRODUCT___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_CLIENT_DEPENDENCIES = WORK_PRODUCT___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = WORK_PRODUCT___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP = WORK_PRODUCT___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP = WORK_PRODUCT___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Element Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = WORK_PRODUCT___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Create Package Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = WORK_PRODUCT___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Get Imported Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_IMPORTED_ELEMENTS = WORK_PRODUCT___GET_IMPORTED_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Imported Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_IMPORTED_PACKAGES = WORK_PRODUCT___GET_IMPORTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_OWNED_MEMBERS = WORK_PRODUCT___GET_OWNED_MEMBERS;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___EXCLUDE_COLLISIONS__ELIST = WORK_PRODUCT___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_NAMES_OF_MEMBER__NAMEDELEMENT = WORK_PRODUCT___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___IMPORT_MEMBERS__ELIST = WORK_PRODUCT___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Get Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___GET_IMPORTED_MEMBERS = WORK_PRODUCT___GET_IMPORTED_MEMBERS;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___MEMBERS_ARE_DISTINGUISHABLE = WORK_PRODUCT___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Qwiki Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___QWIKI_MODEL = WORK_PRODUCT___QWIKI_MODEL;

	/**
	 * The operation id for the '<em>Object Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___OBJECT_ID = WORK_PRODUCT___OBJECT_ID;

	/**
	 * The number of operations of the '<em>Generic Work Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT_OPERATION_COUNT = WORK_PRODUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.Spice.impl.WorkProductRelationshipImpl <em>Work Product Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Spice.impl.WorkProductRelationshipImpl
	 * @see QWiki.Spice.impl.SpicePackageImpl#getWorkProductRelationship()
	 * @generated
	 */
	int WORK_PRODUCT_RELATIONSHIP = 8;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP__EANNOTATIONS = QWikiPackage.QWIKI_RELATIONSHIP__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP__OWNED_COMMENT = QWikiPackage.QWIKI_RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP__OWNED_ELEMENT = QWikiPackage.QWIKI_RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP__OWNER = QWikiPackage.QWIKI_RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP__RELATED_ELEMENT = QWikiPackage.QWIKI_RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP__SOURCE = QWikiPackage.QWIKI_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP__TARGET = QWikiPackage.QWIKI_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP__UUID = QWikiPackage.QWIKI_RELATIONSHIP__UUID;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP__CUSTOM_PROPERTY = QWikiPackage.QWIKI_RELATIONSHIP__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP__TAG = QWikiPackage.QWIKI_RELATIONSHIP__TAG;

	/**
	 * The feature id for the '<em><b>Relationship Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP__RELATIONSHIP_TYPE = QWikiPackage.QWIKI_RELATIONSHIP__RELATIONSHIP_TYPE;

	/**
	 * The feature id for the '<em><b>Linking Work Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP__LINKING_WORK_PRODUCT = QWikiPackage.QWIKI_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Work Product Relationship Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP__WORK_PRODUCT_RELATIONSHIP_TYPE = QWikiPackage.QWIKI_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Linked Work Product</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP__LINKED_WORK_PRODUCT = QWikiPackage.QWIKI_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Work Product Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_FEATURE_COUNT = QWikiPackage.QWIKI_RELATIONSHIP_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___GET_EANNOTATION__STRING = QWikiPackage.QWIKI_RELATIONSHIP___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = QWikiPackage.QWIKI_RELATIONSHIP___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = QWikiPackage.QWIKI_RELATIONSHIP___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___ADD_KEYWORD__STRING = QWikiPackage.QWIKI_RELATIONSHIP___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___APPLY_STEREOTYPE__STEREOTYPE = QWikiPackage.QWIKI_RELATIONSHIP___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___CREATE_EANNOTATION__STRING = QWikiPackage.QWIKI_RELATIONSHIP___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___DESTROY = QWikiPackage.QWIKI_RELATIONSHIP___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___GET_KEYWORDS = QWikiPackage.QWIKI_RELATIONSHIP___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___GET_APPLICABLE_STEREOTYPE__STRING = QWikiPackage.QWIKI_RELATIONSHIP___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___GET_APPLICABLE_STEREOTYPES = QWikiPackage.QWIKI_RELATIONSHIP___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___GET_APPLIED_STEREOTYPE__STRING = QWikiPackage.QWIKI_RELATIONSHIP___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___GET_APPLIED_STEREOTYPES = QWikiPackage.QWIKI_RELATIONSHIP___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = QWikiPackage.QWIKI_RELATIONSHIP___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = QWikiPackage.QWIKI_RELATIONSHIP___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___GET_MODEL = QWikiPackage.QWIKI_RELATIONSHIP___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___GET_NEAREST_PACKAGE = QWikiPackage.QWIKI_RELATIONSHIP___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___GET_RELATIONSHIPS = QWikiPackage.QWIKI_RELATIONSHIP___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___GET_RELATIONSHIPS__ECLASS = QWikiPackage.QWIKI_RELATIONSHIP___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___GET_REQUIRED_STEREOTYPE__STRING = QWikiPackage.QWIKI_RELATIONSHIP___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___GET_REQUIRED_STEREOTYPES = QWikiPackage.QWIKI_RELATIONSHIP___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___GET_SOURCE_DIRECTED_RELATIONSHIPS = QWikiPackage.QWIKI_RELATIONSHIP___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = QWikiPackage.QWIKI_RELATIONSHIP___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___GET_STEREOTYPE_APPLICATION__STEREOTYPE = QWikiPackage.QWIKI_RELATIONSHIP___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___GET_STEREOTYPE_APPLICATIONS = QWikiPackage.QWIKI_RELATIONSHIP___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___GET_TARGET_DIRECTED_RELATIONSHIPS = QWikiPackage.QWIKI_RELATIONSHIP___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = QWikiPackage.QWIKI_RELATIONSHIP___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___GET_VALUE__STEREOTYPE_STRING = QWikiPackage.QWIKI_RELATIONSHIP___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___HAS_KEYWORD__STRING = QWikiPackage.QWIKI_RELATIONSHIP___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___HAS_VALUE__STEREOTYPE_STRING = QWikiPackage.QWIKI_RELATIONSHIP___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = QWikiPackage.QWIKI_RELATIONSHIP___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___IS_STEREOTYPE_APPLIED__STEREOTYPE = QWikiPackage.QWIKI_RELATIONSHIP___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___IS_STEREOTYPE_REQUIRED__STEREOTYPE = QWikiPackage.QWIKI_RELATIONSHIP___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___REMOVE_KEYWORD__STRING = QWikiPackage.QWIKI_RELATIONSHIP___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___SET_VALUE__STEREOTYPE_STRING_OBJECT = QWikiPackage.QWIKI_RELATIONSHIP___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___UNAPPLY_STEREOTYPE__STEREOTYPE = QWikiPackage.QWIKI_RELATIONSHIP___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___ALL_OWNED_ELEMENTS = QWikiPackage.QWIKI_RELATIONSHIP___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___MUST_BE_OWNED = QWikiPackage.QWIKI_RELATIONSHIP___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Object Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP___OBJECT_ID = QWikiPackage.QWIKI_RELATIONSHIP___OBJECT_ID;

	/**
	 * The number of operations of the '<em>Work Product Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_OPERATION_COUNT = QWikiPackage.QWIKI_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.Spice.impl.WorkProductRelationshipTypeImpl <em>Work Product Relationship Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Spice.impl.WorkProductRelationshipTypeImpl
	 * @see QWiki.Spice.impl.SpicePackageImpl#getWorkProductRelationshipType()
	 * @generated
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE = 9;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE__EANNOTATIONS = QWikiPackage.QWIKI_RELATIONSHIP_TYPE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE__OWNED_COMMENT = QWikiPackage.QWIKI_RELATIONSHIP_TYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE__OWNED_ELEMENT = QWikiPackage.QWIKI_RELATIONSHIP_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE__OWNER = QWikiPackage.QWIKI_RELATIONSHIP_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE__CLIENT_DEPENDENCY = QWikiPackage.QWIKI_RELATIONSHIP_TYPE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE__NAME = QWikiPackage.QWIKI_RELATIONSHIP_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE__NAME_EXPRESSION = QWikiPackage.QWIKI_RELATIONSHIP_TYPE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE__NAMESPACE = QWikiPackage.QWIKI_RELATIONSHIP_TYPE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE__QUALIFIED_NAME = QWikiPackage.QWIKI_RELATIONSHIP_TYPE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE__VISIBILITY = QWikiPackage.QWIKI_RELATIONSHIP_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE__UUID = QWikiPackage.QWIKI_RELATIONSHIP_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE__CUSTOM_PROPERTY = QWikiPackage.QWIKI_RELATIONSHIP_TYPE__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE__TAG = QWikiPackage.QWIKI_RELATIONSHIP_TYPE__TAG;

	/**
	 * The feature id for the '<em><b>Qwiki Namespace</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE__QWIKI_NAMESPACE = QWikiPackage.QWIKI_RELATIONSHIP_TYPE__QWIKI_NAMESPACE;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE__RELATIONSHIP = QWikiPackage.QWIKI_RELATIONSHIP_TYPE__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Work Product Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE__WORK_PRODUCT_RELATIONSHIP = QWikiPackage.QWIKI_RELATIONSHIP_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Work Product Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE_FEATURE_COUNT = QWikiPackage.QWIKI_RELATIONSHIP_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___GET_EANNOTATION__STRING = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___ADD_KEYWORD__STRING = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___APPLY_STEREOTYPE__STEREOTYPE = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___CREATE_EANNOTATION__STRING = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___DESTROY = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___GET_KEYWORDS = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___GET_APPLICABLE_STEREOTYPE__STRING = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___GET_APPLICABLE_STEREOTYPES = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___GET_APPLIED_STEREOTYPE__STRING = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___GET_APPLIED_STEREOTYPES = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___GET_MODEL = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___GET_NEAREST_PACKAGE = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___GET_RELATIONSHIPS = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___GET_RELATIONSHIPS__ECLASS = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___GET_REQUIRED_STEREOTYPE__STRING = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___GET_REQUIRED_STEREOTYPES = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___GET_SOURCE_DIRECTED_RELATIONSHIPS = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___GET_STEREOTYPE_APPLICATION__STEREOTYPE = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___GET_STEREOTYPE_APPLICATIONS = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___GET_TARGET_DIRECTED_RELATIONSHIPS = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___GET_VALUE__STEREOTYPE_STRING = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___HAS_KEYWORD__STRING = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___HAS_VALUE__STEREOTYPE_STRING = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___IS_STEREOTYPE_APPLIED__STEREOTYPE = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___IS_STEREOTYPE_REQUIRED__STEREOTYPE = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___REMOVE_KEYWORD__STRING = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___SET_VALUE__STEREOTYPE_STRING_OBJECT = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___UNAPPLY_STEREOTYPE__STEREOTYPE = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___ALL_OWNED_ELEMENTS = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___MUST_BE_OWNED = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___CREATE_DEPENDENCY__NAMEDELEMENT = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___CREATE_USAGE__NAMEDELEMENT = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___GET_LABEL = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___GET_LABEL__BOOLEAN = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___GET_NAMESPACE = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___ALL_NAMESPACES = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___ALL_OWNING_PACKAGES = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___GET_QUALIFIED_NAME = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___SEPARATOR = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___GET_CLIENT_DEPENDENCIES = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Object Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___OBJECT_ID = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___OBJECT_ID;

	/**
	 * The operation id for the '<em>Qwiki Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE___QWIKI_MODEL = QWikiPackage.QWIKI_RELATIONSHIP_TYPE___QWIKI_MODEL;

	/**
	 * The number of operations of the '<em>Work Product Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_RELATIONSHIP_TYPE_OPERATION_COUNT = QWikiPackage.QWIKI_RELATIONSHIP_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.Spice.ProcessReferenceModelDomain <em>Process Reference Model Domain</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Spice.ProcessReferenceModelDomain
	 * @see QWiki.Spice.impl.SpicePackageImpl#getProcessReferenceModelDomain()
	 * @generated
	 */
	int PROCESS_REFERENCE_MODEL_DOMAIN = 10;

	/**
	 * The meta object id for the '{@link QWiki.Spice.WorkProductType <em>Work Product Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Spice.WorkProductType
	 * @see QWiki.Spice.impl.SpicePackageImpl#getWorkProductType()
	 * @generated
	 */
	int WORK_PRODUCT_TYPE = 11;


	/**
	 * Returns the meta object for class '{@link QWiki.Spice.BasePractise <em>Base Practise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Practise</em>'.
	 * @see QWiki.Spice.BasePractise
	 * @generated
	 */
	EClass getBasePractise();

	/**
	 * Returns the meta object for the container reference '{@link QWiki.Spice.BasePractise#getOwningProcess <em>Owning Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Process</em>'.
	 * @see QWiki.Spice.BasePractise#getOwningProcess()
	 * @see #getBasePractise()
	 * @generated
	 */
	EReference getBasePractise_OwningProcess();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Spice.BasePractise#getFacilitatedOutcome <em>Facilitated Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitated Outcome</em>'.
	 * @see QWiki.Spice.BasePractise#getFacilitatedOutcome()
	 * @see #getBasePractise()
	 * @generated
	 */
	EReference getBasePractise_FacilitatedOutcome();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Spice.BasePractise#getFacilitatedWorkProduct <em>Facilitated Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitated Work Product</em>'.
	 * @see QWiki.Spice.BasePractise#getFacilitatedWorkProduct()
	 * @see #getBasePractise()
	 * @generated
	 */
	EReference getBasePractise_FacilitatedWorkProduct();

	/**
	 * Returns the meta object for the '{@link QWiki.Spice.BasePractise#objectId() <em>Object Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Object Id</em>' operation.
	 * @see QWiki.Spice.BasePractise#objectId()
	 * @generated
	 */
	EOperation getBasePractise__ObjectId();

	/**
	 * Returns the meta object for class '{@link QWiki.Spice.SpiceElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see QWiki.Spice.SpiceElement
	 * @generated
	 */
	EClass getSpiceElement();

	/**
	 * Returns the meta object for the container reference '{@link QWiki.Spice.SpiceElement#getOwningProcessReferenceModel <em>Owning Process Reference Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Process Reference Model</em>'.
	 * @see QWiki.Spice.SpiceElement#getOwningProcessReferenceModel()
	 * @see #getSpiceElement()
	 * @generated
	 */
	EReference getSpiceElement_OwningProcessReferenceModel();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.Spice.SpiceElement#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see QWiki.Spice.SpiceElement#getNumber()
	 * @see #getSpiceElement()
	 * @generated
	 */
	EAttribute getSpiceElement_Number();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Spice.SpiceElement#getFacilitatedSection <em>Facilitated Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitated Section</em>'.
	 * @see QWiki.Spice.SpiceElement#getFacilitatedSection()
	 * @see #getSpiceElement()
	 * @generated
	 */
	EReference getSpiceElement_FacilitatedSection();

	/**
	 * Returns the meta object for the reference '{@link QWiki.Spice.SpiceElement#getOwnerRole <em>Owner Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner Role</em>'.
	 * @see QWiki.Spice.SpiceElement#getOwnerRole()
	 * @see #getSpiceElement()
	 * @generated
	 */
	EReference getSpiceElement_OwnerRole();

	/**
	 * Returns the meta object for the reference '{@link QWiki.Spice.SpiceElement#getManagerRole <em>Manager Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Manager Role</em>'.
	 * @see QWiki.Spice.SpiceElement#getManagerRole()
	 * @see #getSpiceElement()
	 * @generated
	 */
	EReference getSpiceElement_ManagerRole();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Spice.SpiceElement#getParticipantRole <em>Participant Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant Role</em>'.
	 * @see QWiki.Spice.SpiceElement#getParticipantRole()
	 * @see #getSpiceElement()
	 * @generated
	 */
	EReference getSpiceElement_ParticipantRole();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Spice.SpiceElement#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role</em>'.
	 * @see QWiki.Spice.SpiceElement#getRole()
	 * @see #getSpiceElement()
	 * @generated
	 */
	EReference getSpiceElement_Role();

	/**
	 * Returns the meta object for class '{@link QWiki.Spice.ProcessReferenceModel <em>Process Reference Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Reference Model</em>'.
	 * @see QWiki.Spice.ProcessReferenceModel
	 * @generated
	 */
	EClass getProcessReferenceModel();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.Spice.ProcessReferenceModel#isNonStandard <em>Is Non Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Non Standard</em>'.
	 * @see QWiki.Spice.ProcessReferenceModel#isNonStandard()
	 * @see #getProcessReferenceModel()
	 * @generated
	 */
	EAttribute getProcessReferenceModel_IsNonStandard();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.Spice.ProcessReferenceModel#getPrmDomain <em>Prm Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prm Domain</em>'.
	 * @see QWiki.Spice.ProcessReferenceModel#getPrmDomain()
	 * @see #getProcessReferenceModel()
	 * @generated
	 */
	EAttribute getProcessReferenceModel_PrmDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.Spice.ProcessReferenceModel#getOwnedSpiceElement <em>Owned Spice Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Spice Element</em>'.
	 * @see QWiki.Spice.ProcessReferenceModel#getOwnedSpiceElement()
	 * @see #getProcessReferenceModel()
	 * @generated
	 */
	EReference getProcessReferenceModel_OwnedSpiceElement();

	/**
	 * Returns the meta object for the '{@link QWiki.Spice.ProcessReferenceModel#objectIdForDomain() <em>Object Id For Domain</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Object Id For Domain</em>' operation.
	 * @see QWiki.Spice.ProcessReferenceModel#objectIdForDomain()
	 * @generated
	 */
	EOperation getProcessReferenceModel__ObjectIdForDomain();

	/**
	 * Returns the meta object for the '{@link QWiki.Spice.ProcessReferenceModel#objectId() <em>Object Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Object Id</em>' operation.
	 * @see QWiki.Spice.ProcessReferenceModel#objectId()
	 * @generated
	 */
	EOperation getProcessReferenceModel__ObjectId();

	/**
	 * Returns the meta object for class '{@link QWiki.Spice.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see QWiki.Spice.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the container reference '{@link QWiki.Spice.Process#getOwningProcessGroup <em>Owning Process Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Process Group</em>'.
	 * @see QWiki.Spice.Process#getOwningProcessGroup()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_OwningProcessGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.Spice.Process#getOwnedOutcome <em>Owned Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Outcome</em>'.
	 * @see QWiki.Spice.Process#getOwnedOutcome()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_OwnedOutcome();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Spice.Process#getFacilitatingWorkProduct <em>Facilitating Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitating Work Product</em>'.
	 * @see QWiki.Spice.Process#getFacilitatingWorkProduct()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_FacilitatingWorkProduct();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Spice.Process#getFacilitatedWorkProduct <em>Facilitated Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitated Work Product</em>'.
	 * @see QWiki.Spice.Process#getFacilitatedWorkProduct()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_FacilitatedWorkProduct();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.Spice.Process#getOwnedBasePractise <em>Owned Base Practise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Base Practise</em>'.
	 * @see QWiki.Spice.Process#getOwnedBasePractise()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_OwnedBasePractise();

	/**
	 * Returns the meta object for the '{@link QWiki.Spice.Process#objectId() <em>Object Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Object Id</em>' operation.
	 * @see QWiki.Spice.Process#objectId()
	 * @generated
	 */
	EOperation getProcess__ObjectId();

	/**
	 * Returns the meta object for class '{@link QWiki.Spice.ProcessGroup <em>Process Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Group</em>'.
	 * @see QWiki.Spice.ProcessGroup
	 * @generated
	 */
	EClass getProcessGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.Spice.ProcessGroup#getOwnedProcess <em>Owned Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Process</em>'.
	 * @see QWiki.Spice.ProcessGroup#getOwnedProcess()
	 * @see #getProcessGroup()
	 * @generated
	 */
	EReference getProcessGroup_OwnedProcess();

	/**
	 * Returns the meta object for the '{@link QWiki.Spice.ProcessGroup#objectId() <em>Object Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Object Id</em>' operation.
	 * @see QWiki.Spice.ProcessGroup#objectId()
	 * @generated
	 */
	EOperation getProcessGroup__ObjectId();

	/**
	 * Returns the meta object for class '{@link QWiki.Spice.Outcome <em>Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outcome</em>'.
	 * @see QWiki.Spice.Outcome
	 * @generated
	 */
	EClass getOutcome();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Spice.Outcome#getFacilitatingBasePractise <em>Facilitating Base Practise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitating Base Practise</em>'.
	 * @see QWiki.Spice.Outcome#getFacilitatingBasePractise()
	 * @see #getOutcome()
	 * @generated
	 */
	EReference getOutcome_FacilitatingBasePractise();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Spice.Outcome#getRequiredWorkproduct <em>Required Workproduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Workproduct</em>'.
	 * @see QWiki.Spice.Outcome#getRequiredWorkproduct()
	 * @see #getOutcome()
	 * @generated
	 */
	EReference getOutcome_RequiredWorkproduct();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Spice.Outcome#getResultingWorkproduct <em>Resulting Workproduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resulting Workproduct</em>'.
	 * @see QWiki.Spice.Outcome#getResultingWorkproduct()
	 * @see #getOutcome()
	 * @generated
	 */
	EReference getOutcome_ResultingWorkproduct();

	/**
	 * Returns the meta object for the container reference '{@link QWiki.Spice.Outcome#getOwningProcess <em>Owning Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Process</em>'.
	 * @see QWiki.Spice.Outcome#getOwningProcess()
	 * @see #getOutcome()
	 * @generated
	 */
	EReference getOutcome_OwningProcess();

	/**
	 * Returns the meta object for the '{@link QWiki.Spice.Outcome#objectId() <em>Object Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Object Id</em>' operation.
	 * @see QWiki.Spice.Outcome#objectId()
	 * @generated
	 */
	EOperation getOutcome__ObjectId();

	/**
	 * Returns the meta object for class '{@link QWiki.Spice.WorkProduct <em>Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Product</em>'.
	 * @see QWiki.Spice.WorkProduct
	 * @generated
	 */
	EClass getWorkProduct();

	/**
	 * Returns the meta object for the container reference '{@link QWiki.Spice.WorkProduct#getOwningWorkProductGroup <em>Owning Work Product Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Work Product Group</em>'.
	 * @see QWiki.Spice.WorkProduct#getOwningWorkProductGroup()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_OwningWorkProductGroup();

	/**
	 * Returns the meta object for the containment reference '{@link QWiki.Spice.WorkProduct#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Characteristic</em>'.
	 * @see QWiki.Spice.WorkProduct#getCharacteristic()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_Characteristic();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Spice.WorkProduct#getFacilitatingOutcome <em>Facilitating Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitating Outcome</em>'.
	 * @see QWiki.Spice.WorkProduct#getFacilitatingOutcome()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_FacilitatingOutcome();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Spice.WorkProduct#getFacilitatedProcess <em>Facilitated Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitated Process</em>'.
	 * @see QWiki.Spice.WorkProduct#getFacilitatedProcess()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_FacilitatedProcess();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Spice.WorkProduct#getFacilitatingProcess <em>Facilitating Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitating Process</em>'.
	 * @see QWiki.Spice.WorkProduct#getFacilitatingProcess()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_FacilitatingProcess();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.Spice.WorkProduct#getWorkProductType <em>Work Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Product Type</em>'.
	 * @see QWiki.Spice.WorkProduct#getWorkProductType()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EAttribute getWorkProduct_WorkProductType();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Spice.WorkProduct#getContainedWorkProduct <em>Contained Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contained Work Product</em>'.
	 * @see QWiki.Spice.WorkProduct#getContainedWorkProduct()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_ContainedWorkProduct();

	/**
	 * Returns the meta object for the reference '{@link QWiki.Spice.WorkProduct#getContainingWorkProduct <em>Containing Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containing Work Product</em>'.
	 * @see QWiki.Spice.WorkProduct#getContainingWorkProduct()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_ContainingWorkProduct();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Spice.WorkProduct#getLinkedWorkProduct <em>Linked Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Work Product</em>'.
	 * @see QWiki.Spice.WorkProduct#getLinkedWorkProduct()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_LinkedWorkProduct();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Spice.WorkProduct#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Link</em>'.
	 * @see QWiki.Spice.WorkProduct#getLink()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_Link();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Spice.WorkProduct#getFacilitatedOutcome <em>Facilitated Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitated Outcome</em>'.
	 * @see QWiki.Spice.WorkProduct#getFacilitatedOutcome()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_FacilitatedOutcome();

	/**
	 * Returns the meta object for the '{@link QWiki.Spice.WorkProduct#objectId() <em>Object Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Object Id</em>' operation.
	 * @see QWiki.Spice.WorkProduct#objectId()
	 * @generated
	 */
	EOperation getWorkProduct__ObjectId();

	/**
	 * Returns the meta object for class '{@link QWiki.Spice.GenericWorkProduct <em>Generic Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Work Product</em>'.
	 * @see QWiki.Spice.GenericWorkProduct
	 * @generated
	 */
	EClass getGenericWorkProduct();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.Spice.GenericWorkProduct#getOwnedWorkProduct <em>Owned Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Work Product</em>'.
	 * @see QWiki.Spice.GenericWorkProduct#getOwnedWorkProduct()
	 * @see #getGenericWorkProduct()
	 * @generated
	 */
	EReference getGenericWorkProduct_OwnedWorkProduct();

	/**
	 * Returns the meta object for class '{@link QWiki.Spice.WorkProductRelationship <em>Work Product Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Product Relationship</em>'.
	 * @see QWiki.Spice.WorkProductRelationship
	 * @generated
	 */
	EClass getWorkProductRelationship();

	/**
	 * Returns the meta object for the reference '{@link QWiki.Spice.WorkProductRelationship#getLinkingWorkProduct <em>Linking Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linking Work Product</em>'.
	 * @see QWiki.Spice.WorkProductRelationship#getLinkingWorkProduct()
	 * @see #getWorkProductRelationship()
	 * @generated
	 */
	EReference getWorkProductRelationship_LinkingWorkProduct();

	/**
	 * Returns the meta object for the reference '{@link QWiki.Spice.WorkProductRelationship#getWorkProductRelationshipType <em>Work Product Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Work Product Relationship Type</em>'.
	 * @see QWiki.Spice.WorkProductRelationship#getWorkProductRelationshipType()
	 * @see #getWorkProductRelationship()
	 * @generated
	 */
	EReference getWorkProductRelationship_WorkProductRelationshipType();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Spice.WorkProductRelationship#getLinkedWorkProduct <em>Linked Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Linked Work Product</em>'.
	 * @see QWiki.Spice.WorkProductRelationship#getLinkedWorkProduct()
	 * @see #getWorkProductRelationship()
	 * @generated
	 */
	EReference getWorkProductRelationship_LinkedWorkProduct();

	/**
	 * Returns the meta object for class '{@link QWiki.Spice.WorkProductRelationshipType <em>Work Product Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Product Relationship Type</em>'.
	 * @see QWiki.Spice.WorkProductRelationshipType
	 * @generated
	 */
	EClass getWorkProductRelationshipType();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Spice.WorkProductRelationshipType#getWorkProductRelationship <em>Work Product Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Work Product Relationship</em>'.
	 * @see QWiki.Spice.WorkProductRelationshipType#getWorkProductRelationship()
	 * @see #getWorkProductRelationshipType()
	 * @generated
	 */
	EReference getWorkProductRelationshipType_WorkProductRelationship();

	/**
	 * Returns the meta object for enum '{@link QWiki.Spice.ProcessReferenceModelDomain <em>Process Reference Model Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Process Reference Model Domain</em>'.
	 * @see QWiki.Spice.ProcessReferenceModelDomain
	 * @generated
	 */
	EEnum getProcessReferenceModelDomain();

	/**
	 * Returns the meta object for enum '{@link QWiki.Spice.WorkProductType <em>Work Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Work Product Type</em>'.
	 * @see QWiki.Spice.WorkProductType
	 * @generated
	 */
	EEnum getWorkProductType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpiceFactory getSpiceFactory();

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
		 * The meta object literal for the '{@link QWiki.Spice.impl.BasePractiseImpl <em>Base Practise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Spice.impl.BasePractiseImpl
		 * @see QWiki.Spice.impl.SpicePackageImpl#getBasePractise()
		 * @generated
		 */
		EClass BASE_PRACTISE = eINSTANCE.getBasePractise();

		/**
		 * The meta object literal for the '<em><b>Owning Process</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_PRACTISE__OWNING_PROCESS = eINSTANCE.getBasePractise_OwningProcess();

		/**
		 * The meta object literal for the '<em><b>Facilitated Outcome</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_PRACTISE__FACILITATED_OUTCOME = eINSTANCE.getBasePractise_FacilitatedOutcome();

		/**
		 * The meta object literal for the '<em><b>Facilitated Work Product</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_PRACTISE__FACILITATED_WORK_PRODUCT = eINSTANCE.getBasePractise_FacilitatedWorkProduct();

		/**
		 * The meta object literal for the '<em><b>Object Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BASE_PRACTISE___OBJECT_ID = eINSTANCE.getBasePractise__ObjectId();

		/**
		 * The meta object literal for the '{@link QWiki.Spice.impl.SpiceElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Spice.impl.SpiceElementImpl
		 * @see QWiki.Spice.impl.SpicePackageImpl#getSpiceElement()
		 * @generated
		 */
		EClass SPICE_ELEMENT = eINSTANCE.getSpiceElement();

		/**
		 * The meta object literal for the '<em><b>Owning Process Reference Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL = eINSTANCE.getSpiceElement_OwningProcessReferenceModel();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPICE_ELEMENT__NUMBER = eINSTANCE.getSpiceElement_Number();

		/**
		 * The meta object literal for the '<em><b>Facilitated Section</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPICE_ELEMENT__FACILITATED_SECTION = eINSTANCE.getSpiceElement_FacilitatedSection();

		/**
		 * The meta object literal for the '<em><b>Owner Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPICE_ELEMENT__OWNER_ROLE = eINSTANCE.getSpiceElement_OwnerRole();

		/**
		 * The meta object literal for the '<em><b>Manager Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPICE_ELEMENT__MANAGER_ROLE = eINSTANCE.getSpiceElement_ManagerRole();

		/**
		 * The meta object literal for the '<em><b>Participant Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPICE_ELEMENT__PARTICIPANT_ROLE = eINSTANCE.getSpiceElement_ParticipantRole();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPICE_ELEMENT__ROLE = eINSTANCE.getSpiceElement_Role();

		/**
		 * The meta object literal for the '{@link QWiki.Spice.impl.ProcessReferenceModelImpl <em>Process Reference Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Spice.impl.ProcessReferenceModelImpl
		 * @see QWiki.Spice.impl.SpicePackageImpl#getProcessReferenceModel()
		 * @generated
		 */
		EClass PROCESS_REFERENCE_MODEL = eINSTANCE.getProcessReferenceModel();

		/**
		 * The meta object literal for the '<em><b>Is Non Standard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_REFERENCE_MODEL__IS_NON_STANDARD = eINSTANCE.getProcessReferenceModel_IsNonStandard();

		/**
		 * The meta object literal for the '<em><b>Prm Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESS_REFERENCE_MODEL__PRM_DOMAIN = eINSTANCE.getProcessReferenceModel_PrmDomain();

		/**
		 * The meta object literal for the '<em><b>Owned Spice Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_REFERENCE_MODEL__OWNED_SPICE_ELEMENT = eINSTANCE.getProcessReferenceModel_OwnedSpiceElement();

		/**
		 * The meta object literal for the '<em><b>Object Id For Domain</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESS_REFERENCE_MODEL___OBJECT_ID_FOR_DOMAIN = eINSTANCE.getProcessReferenceModel__ObjectIdForDomain();

		/**
		 * The meta object literal for the '<em><b>Object Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESS_REFERENCE_MODEL___OBJECT_ID = eINSTANCE.getProcessReferenceModel__ObjectId();

		/**
		 * The meta object literal for the '{@link QWiki.Spice.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Spice.impl.ProcessImpl
		 * @see QWiki.Spice.impl.SpicePackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Owning Process Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__OWNING_PROCESS_GROUP = eINSTANCE.getProcess_OwningProcessGroup();

		/**
		 * The meta object literal for the '<em><b>Owned Outcome</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__OWNED_OUTCOME = eINSTANCE.getProcess_OwnedOutcome();

		/**
		 * The meta object literal for the '<em><b>Facilitating Work Product</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__FACILITATING_WORK_PRODUCT = eINSTANCE.getProcess_FacilitatingWorkProduct();

		/**
		 * The meta object literal for the '<em><b>Facilitated Work Product</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__FACILITATED_WORK_PRODUCT = eINSTANCE.getProcess_FacilitatedWorkProduct();

		/**
		 * The meta object literal for the '<em><b>Owned Base Practise</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__OWNED_BASE_PRACTISE = eINSTANCE.getProcess_OwnedBasePractise();

		/**
		 * The meta object literal for the '<em><b>Object Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESS___OBJECT_ID = eINSTANCE.getProcess__ObjectId();

		/**
		 * The meta object literal for the '{@link QWiki.Spice.impl.ProcessGroupImpl <em>Process Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Spice.impl.ProcessGroupImpl
		 * @see QWiki.Spice.impl.SpicePackageImpl#getProcessGroup()
		 * @generated
		 */
		EClass PROCESS_GROUP = eINSTANCE.getProcessGroup();

		/**
		 * The meta object literal for the '<em><b>Owned Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_GROUP__OWNED_PROCESS = eINSTANCE.getProcessGroup_OwnedProcess();

		/**
		 * The meta object literal for the '<em><b>Object Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESS_GROUP___OBJECT_ID = eINSTANCE.getProcessGroup__ObjectId();

		/**
		 * The meta object literal for the '{@link QWiki.Spice.impl.OutcomeImpl <em>Outcome</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Spice.impl.OutcomeImpl
		 * @see QWiki.Spice.impl.SpicePackageImpl#getOutcome()
		 * @generated
		 */
		EClass OUTCOME = eINSTANCE.getOutcome();

		/**
		 * The meta object literal for the '<em><b>Facilitating Base Practise</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTCOME__FACILITATING_BASE_PRACTISE = eINSTANCE.getOutcome_FacilitatingBasePractise();

		/**
		 * The meta object literal for the '<em><b>Required Workproduct</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTCOME__REQUIRED_WORKPRODUCT = eINSTANCE.getOutcome_RequiredWorkproduct();

		/**
		 * The meta object literal for the '<em><b>Resulting Workproduct</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTCOME__RESULTING_WORKPRODUCT = eINSTANCE.getOutcome_ResultingWorkproduct();

		/**
		 * The meta object literal for the '<em><b>Owning Process</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTCOME__OWNING_PROCESS = eINSTANCE.getOutcome_OwningProcess();

		/**
		 * The meta object literal for the '<em><b>Object Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OUTCOME___OBJECT_ID = eINSTANCE.getOutcome__ObjectId();

		/**
		 * The meta object literal for the '{@link QWiki.Spice.impl.WorkProductImpl <em>Work Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Spice.impl.WorkProductImpl
		 * @see QWiki.Spice.impl.SpicePackageImpl#getWorkProduct()
		 * @generated
		 */
		EClass WORK_PRODUCT = eINSTANCE.getWorkProduct();

		/**
		 * The meta object literal for the '<em><b>Owning Work Product Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP = eINSTANCE.getWorkProduct_OwningWorkProductGroup();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT__CHARACTERISTIC = eINSTANCE.getWorkProduct_Characteristic();

		/**
		 * The meta object literal for the '<em><b>Facilitating Outcome</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT__FACILITATING_OUTCOME = eINSTANCE.getWorkProduct_FacilitatingOutcome();

		/**
		 * The meta object literal for the '<em><b>Facilitated Process</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT__FACILITATED_PROCESS = eINSTANCE.getWorkProduct_FacilitatedProcess();

		/**
		 * The meta object literal for the '<em><b>Facilitating Process</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT__FACILITATING_PROCESS = eINSTANCE.getWorkProduct_FacilitatingProcess();

		/**
		 * The meta object literal for the '<em><b>Work Product Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORK_PRODUCT__WORK_PRODUCT_TYPE = eINSTANCE.getWorkProduct_WorkProductType();

		/**
		 * The meta object literal for the '<em><b>Contained Work Product</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT__CONTAINED_WORK_PRODUCT = eINSTANCE.getWorkProduct_ContainedWorkProduct();

		/**
		 * The meta object literal for the '<em><b>Containing Work Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT__CONTAINING_WORK_PRODUCT = eINSTANCE.getWorkProduct_ContainingWorkProduct();

		/**
		 * The meta object literal for the '<em><b>Linked Work Product</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT__LINKED_WORK_PRODUCT = eINSTANCE.getWorkProduct_LinkedWorkProduct();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT__LINK = eINSTANCE.getWorkProduct_Link();

		/**
		 * The meta object literal for the '<em><b>Facilitated Outcome</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT__FACILITATED_OUTCOME = eINSTANCE.getWorkProduct_FacilitatedOutcome();

		/**
		 * The meta object literal for the '<em><b>Object Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation WORK_PRODUCT___OBJECT_ID = eINSTANCE.getWorkProduct__ObjectId();

		/**
		 * The meta object literal for the '{@link QWiki.Spice.impl.GenericWorkProductImpl <em>Generic Work Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Spice.impl.GenericWorkProductImpl
		 * @see QWiki.Spice.impl.SpicePackageImpl#getGenericWorkProduct()
		 * @generated
		 */
		EClass GENERIC_WORK_PRODUCT = eINSTANCE.getGenericWorkProduct();

		/**
		 * The meta object literal for the '<em><b>Owned Work Product</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT = eINSTANCE.getGenericWorkProduct_OwnedWorkProduct();

		/**
		 * The meta object literal for the '{@link QWiki.Spice.impl.WorkProductRelationshipImpl <em>Work Product Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Spice.impl.WorkProductRelationshipImpl
		 * @see QWiki.Spice.impl.SpicePackageImpl#getWorkProductRelationship()
		 * @generated
		 */
		EClass WORK_PRODUCT_RELATIONSHIP = eINSTANCE.getWorkProductRelationship();

		/**
		 * The meta object literal for the '<em><b>Linking Work Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT_RELATIONSHIP__LINKING_WORK_PRODUCT = eINSTANCE.getWorkProductRelationship_LinkingWorkProduct();

		/**
		 * The meta object literal for the '<em><b>Work Product Relationship Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT_RELATIONSHIP__WORK_PRODUCT_RELATIONSHIP_TYPE = eINSTANCE.getWorkProductRelationship_WorkProductRelationshipType();

		/**
		 * The meta object literal for the '<em><b>Linked Work Product</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT_RELATIONSHIP__LINKED_WORK_PRODUCT = eINSTANCE.getWorkProductRelationship_LinkedWorkProduct();

		/**
		 * The meta object literal for the '{@link QWiki.Spice.impl.WorkProductRelationshipTypeImpl <em>Work Product Relationship Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Spice.impl.WorkProductRelationshipTypeImpl
		 * @see QWiki.Spice.impl.SpicePackageImpl#getWorkProductRelationshipType()
		 * @generated
		 */
		EClass WORK_PRODUCT_RELATIONSHIP_TYPE = eINSTANCE.getWorkProductRelationshipType();

		/**
		 * The meta object literal for the '<em><b>Work Product Relationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT_RELATIONSHIP_TYPE__WORK_PRODUCT_RELATIONSHIP = eINSTANCE.getWorkProductRelationshipType_WorkProductRelationship();

		/**
		 * The meta object literal for the '{@link QWiki.Spice.ProcessReferenceModelDomain <em>Process Reference Model Domain</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Spice.ProcessReferenceModelDomain
		 * @see QWiki.Spice.impl.SpicePackageImpl#getProcessReferenceModelDomain()
		 * @generated
		 */
		EEnum PROCESS_REFERENCE_MODEL_DOMAIN = eINSTANCE.getProcessReferenceModelDomain();

		/**
		 * The meta object literal for the '{@link QWiki.Spice.WorkProductType <em>Work Product Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Spice.WorkProductType
		 * @see QWiki.Spice.impl.SpicePackageImpl#getWorkProductType()
		 * @generated
		 */
		EEnum WORK_PRODUCT_TYPE = eINSTANCE.getWorkProductType();

	}

} //SpicePackage
