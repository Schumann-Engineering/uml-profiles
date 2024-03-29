/**
 */
package QWiki.I18N;

import QWiki.Infrastructure.InfrastructurePackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see QWiki.I18N.I18NFactory
 * @model kind="package"
 * @generated
 */
public interface I18NPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "I18N";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schumann.engineering/qwiki/1.0/i18n";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "QWiki.I18N";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	I18NPackage eINSTANCE = QWiki.I18N.impl.I18NPackageImpl.init();

	/**
	 * The meta object id for the '{@link QWiki.I18N.impl.I18nBaseStringImpl <em>I1 8n Base String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.I18N.impl.I18nBaseStringImpl
	 * @see QWiki.I18N.impl.I18NPackageImpl#getI18nBaseString()
	 * @generated
	 */
	int I1_8N_BASE_STRING = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_BASE_STRING__VALUE = 0;

	/**
	 * The number of structural features of the '<em>I1 8n Base String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_BASE_STRING_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_BASE_STRING___VALUE__STRING = 0;

	/**
	 * The number of operations of the '<em>I1 8n Base String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_BASE_STRING_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link QWiki.I18N.impl.I18nValueImpl <em>I1 8n Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.I18N.impl.I18nValueImpl
	 * @see QWiki.I18N.impl.I18NPackageImpl#getI18nValue()
	 * @generated
	 */
	int I1_8N_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_VALUE__LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_VALUE__BODY = 1;

	/**
	 * The number of structural features of the '<em>I1 8n Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>I1 8n Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QWiki.I18N.impl.I18nNamedElementImpl <em>I1 8n Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.I18N.impl.I18nNamedElementImpl
	 * @see QWiki.I18N.impl.I18NPackageImpl#getI18nNamedElement()
	 * @generated
	 */
	int I1_8N_NAMED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__OWNED_ELEMENT = InfrastructurePackage.UML_NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__OWNER = InfrastructurePackage.UML_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__OWNED_COMMENT = InfrastructurePackage.UML_NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__DIRECTED_RELATIONSHIP = InfrastructurePackage.UML_NAMED_ELEMENT__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__RELATIONSHIP = InfrastructurePackage.UML_NAMED_ELEMENT__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__TAG = InfrastructurePackage.UML_NAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__CUSTOM_PROPERTY = InfrastructurePackage.UML_NAMED_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__MODEL = InfrastructurePackage.UML_NAMED_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__UUID = InfrastructurePackage.UML_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__SUPERSEEDING_RELATIONSHIP = InfrastructurePackage.UML_NAMED_ELEMENT__SUPERSEEDING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__NAMESPACE = InfrastructurePackage.UML_NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__NAME = InfrastructurePackage.UML_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__QUALIFIED_NAME = InfrastructurePackage.UML_NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__DISPLAY_NAME = InfrastructurePackage.UML_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>I1 8n Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT_FEATURE_COUNT = InfrastructurePackage.UML_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT___ALL_OWNED_ELEMENTS = InfrastructurePackage.UML_NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT___MUST_BE_OWNED = InfrastructurePackage.UML_NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT___MODEL = InfrastructurePackage.UML_NAMED_ELEMENT___MODEL;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT___OID = InfrastructurePackage.UML_NAMED_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT___ALL_NAMESPACES = InfrastructurePackage.UML_NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT___SEPARATOR = InfrastructurePackage.UML_NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT___QUALIFIED_NAME = InfrastructurePackage.UML_NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>I1 8n Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT_OPERATION_COUNT = InfrastructurePackage.UML_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.I18N.impl.I18nDescriptiveElementImpl <em>I1 8n Descriptive Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.I18N.impl.I18nDescriptiveElementImpl
	 * @see QWiki.I18N.impl.I18NPackageImpl#getI18nDescriptiveElement()
	 * @generated
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT__OWNED_ELEMENT = I1_8N_NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT__OWNER = I1_8N_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT__OWNED_COMMENT = I1_8N_NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT__DIRECTED_RELATIONSHIP = I1_8N_NAMED_ELEMENT__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT__RELATIONSHIP = I1_8N_NAMED_ELEMENT__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT__TAG = I1_8N_NAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT__CUSTOM_PROPERTY = I1_8N_NAMED_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT__MODEL = I1_8N_NAMED_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT__UUID = I1_8N_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT__SUPERSEEDING_RELATIONSHIP = I1_8N_NAMED_ELEMENT__SUPERSEEDING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT__NAMESPACE = I1_8N_NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT__NAME = I1_8N_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT__QUALIFIED_NAME = I1_8N_NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT__DISPLAY_NAME = I1_8N_NAMED_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT__PURPOSE = I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT__BODY = I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>I1 8n Descriptive Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT = I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT___ALL_OWNED_ELEMENTS = I1_8N_NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT___MUST_BE_OWNED = I1_8N_NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT___MODEL = I1_8N_NAMED_ELEMENT___MODEL;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT___OID = I1_8N_NAMED_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT___ALL_NAMESPACES = I1_8N_NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT___SEPARATOR = I1_8N_NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT___QUALIFIED_NAME = I1_8N_NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>I1 8n Descriptive Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT_OPERATION_COUNT = I1_8N_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.I18N.impl.I18nStringImpl <em>I1 8n String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.I18N.impl.I18nStringImpl
	 * @see QWiki.I18N.impl.I18NPackageImpl#getI18nString()
	 * @generated
	 */
	int I1_8N_STRING = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_STRING__VALUE = I1_8N_BASE_STRING__VALUE;

	/**
	 * The number of structural features of the '<em>I1 8n String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_STRING_FEATURE_COUNT = I1_8N_BASE_STRING_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_STRING___VALUE__STRING = I1_8N_BASE_STRING___VALUE__STRING;

	/**
	 * The number of operations of the '<em>I1 8n String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_STRING_OPERATION_COUNT = I1_8N_BASE_STRING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.I18N.impl.I18nKeyedStringImpl <em>I1 8n Keyed String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.I18N.impl.I18nKeyedStringImpl
	 * @see QWiki.I18N.impl.I18NPackageImpl#getI18nKeyedString()
	 * @generated
	 */
	int I1_8N_KEYED_STRING = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_KEYED_STRING__VALUE = I1_8N_BASE_STRING__VALUE;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_KEYED_STRING__KEY = I1_8N_BASE_STRING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>I1 8n Keyed String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_KEYED_STRING_FEATURE_COUNT = I1_8N_BASE_STRING_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_KEYED_STRING___VALUE__STRING = I1_8N_BASE_STRING___VALUE__STRING;

	/**
	 * The number of operations of the '<em>I1 8n Keyed String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_KEYED_STRING_OPERATION_COUNT = I1_8N_BASE_STRING_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link QWiki.I18N.I18nBaseString <em>I1 8n Base String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I1 8n Base String</em>'.
	 * @see QWiki.I18N.I18nBaseString
	 * @generated
	 */
	EClass getI18nBaseString();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.I18N.I18nBaseString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see QWiki.I18N.I18nBaseString#getValue()
	 * @see #getI18nBaseString()
	 * @generated
	 */
	EReference getI18nBaseString_Value();

	/**
	 * Returns the meta object for the '{@link QWiki.I18N.I18nBaseString#value(java.lang.String) <em>Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Value</em>' operation.
	 * @see QWiki.I18N.I18nBaseString#value(java.lang.String)
	 * @generated
	 */
	EOperation getI18nBaseString__Value__String();

	/**
	 * Returns the meta object for class '{@link QWiki.I18N.I18nValue <em>I1 8n Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I1 8n Value</em>'.
	 * @see QWiki.I18N.I18nValue
	 * @generated
	 */
	EClass getI18nValue();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.I18N.I18nValue#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see QWiki.I18N.I18nValue#getLanguage()
	 * @see #getI18nValue()
	 * @generated
	 */
	EAttribute getI18nValue_Language();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.I18N.I18nValue#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see QWiki.I18N.I18nValue#getBody()
	 * @see #getI18nValue()
	 * @generated
	 */
	EAttribute getI18nValue_Body();

	/**
	 * Returns the meta object for class '{@link QWiki.I18N.I18nDescriptiveElement <em>I1 8n Descriptive Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I1 8n Descriptive Element</em>'.
	 * @see QWiki.I18N.I18nDescriptiveElement
	 * @generated
	 */
	EClass getI18nDescriptiveElement();

	/**
	 * Returns the meta object for the containment reference '{@link QWiki.I18N.I18nDescriptiveElement#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Purpose</em>'.
	 * @see QWiki.I18N.I18nDescriptiveElement#getPurpose()
	 * @see #getI18nDescriptiveElement()
	 * @generated
	 */
	EReference getI18nDescriptiveElement_Purpose();

	/**
	 * Returns the meta object for the containment reference '{@link QWiki.I18N.I18nDescriptiveElement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see QWiki.I18N.I18nDescriptiveElement#getBody()
	 * @see #getI18nDescriptiveElement()
	 * @generated
	 */
	EReference getI18nDescriptiveElement_Body();

	/**
	 * Returns the meta object for class '{@link QWiki.I18N.I18nString <em>I1 8n String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I1 8n String</em>'.
	 * @see QWiki.I18N.I18nString
	 * @generated
	 */
	EClass getI18nString();

	/**
	 * Returns the meta object for class '{@link QWiki.I18N.I18nKeyedString <em>I1 8n Keyed String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I1 8n Keyed String</em>'.
	 * @see QWiki.I18N.I18nKeyedString
	 * @generated
	 */
	EClass getI18nKeyedString();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.I18N.I18nKeyedString#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see QWiki.I18N.I18nKeyedString#getKey()
	 * @see #getI18nKeyedString()
	 * @generated
	 */
	EAttribute getI18nKeyedString_Key();

	/**
	 * Returns the meta object for class '{@link QWiki.I18N.I18nNamedElement <em>I1 8n Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I1 8n Named Element</em>'.
	 * @see QWiki.I18N.I18nNamedElement
	 * @generated
	 */
	EClass getI18nNamedElement();

	/**
	 * Returns the meta object for the containment reference '{@link QWiki.I18N.I18nNamedElement#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Name</em>'.
	 * @see QWiki.I18N.I18nNamedElement#getDisplayName()
	 * @see #getI18nNamedElement()
	 * @generated
	 */
	EReference getI18nNamedElement_DisplayName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	I18NFactory getI18NFactory();

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
		 * The meta object literal for the '{@link QWiki.I18N.impl.I18nBaseStringImpl <em>I1 8n Base String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.I18N.impl.I18nBaseStringImpl
		 * @see QWiki.I18N.impl.I18NPackageImpl#getI18nBaseString()
		 * @generated
		 */
		EClass I1_8N_BASE_STRING = eINSTANCE.getI18nBaseString();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference I1_8N_BASE_STRING__VALUE = eINSTANCE.getI18nBaseString_Value();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation I1_8N_BASE_STRING___VALUE__STRING = eINSTANCE.getI18nBaseString__Value__String();

		/**
		 * The meta object literal for the '{@link QWiki.I18N.impl.I18nValueImpl <em>I1 8n Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.I18N.impl.I18nValueImpl
		 * @see QWiki.I18N.impl.I18NPackageImpl#getI18nValue()
		 * @generated
		 */
		EClass I1_8N_VALUE = eINSTANCE.getI18nValue();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I1_8N_VALUE__LANGUAGE = eINSTANCE.getI18nValue_Language();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I1_8N_VALUE__BODY = eINSTANCE.getI18nValue_Body();

		/**
		 * The meta object literal for the '{@link QWiki.I18N.impl.I18nDescriptiveElementImpl <em>I1 8n Descriptive Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.I18N.impl.I18nDescriptiveElementImpl
		 * @see QWiki.I18N.impl.I18NPackageImpl#getI18nDescriptiveElement()
		 * @generated
		 */
		EClass I1_8N_DESCRIPTIVE_ELEMENT = eINSTANCE.getI18nDescriptiveElement();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference I1_8N_DESCRIPTIVE_ELEMENT__PURPOSE = eINSTANCE.getI18nDescriptiveElement_Purpose();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference I1_8N_DESCRIPTIVE_ELEMENT__BODY = eINSTANCE.getI18nDescriptiveElement_Body();

		/**
		 * The meta object literal for the '{@link QWiki.I18N.impl.I18nStringImpl <em>I1 8n String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.I18N.impl.I18nStringImpl
		 * @see QWiki.I18N.impl.I18NPackageImpl#getI18nString()
		 * @generated
		 */
		EClass I1_8N_STRING = eINSTANCE.getI18nString();

		/**
		 * The meta object literal for the '{@link QWiki.I18N.impl.I18nKeyedStringImpl <em>I1 8n Keyed String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.I18N.impl.I18nKeyedStringImpl
		 * @see QWiki.I18N.impl.I18NPackageImpl#getI18nKeyedString()
		 * @generated
		 */
		EClass I1_8N_KEYED_STRING = eINSTANCE.getI18nKeyedString();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute I1_8N_KEYED_STRING__KEY = eINSTANCE.getI18nKeyedString_Key();

		/**
		 * The meta object literal for the '{@link QWiki.I18N.impl.I18nNamedElementImpl <em>I1 8n Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.I18N.impl.I18nNamedElementImpl
		 * @see QWiki.I18N.impl.I18NPackageImpl#getI18nNamedElement()
		 * @generated
		 */
		EClass I1_8N_NAMED_ELEMENT = eINSTANCE.getI18nNamedElement();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference I1_8N_NAMED_ELEMENT__DISPLAY_NAME = eINSTANCE.getI18nNamedElement_DisplayName();

	}

} //I18NPackage
