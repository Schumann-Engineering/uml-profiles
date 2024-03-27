/**
 */
package QWiki;

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
 * @see QWiki.QWikiFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface QWikiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "QWiki";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schumann.engineering/qwiki/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "QWiki";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QWikiPackage eINSTANCE = QWiki.impl.QWikiPackageImpl.init();

	/**
	 * The meta object id for the '{@link QWiki.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.ElementImpl
	 * @see QWiki.impl.QWikiPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OWNED_COMMENT = 0;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OWNED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OWNER = 2;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UUID = 3;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__OID = 4;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___ALL_OWNED_ELEMENTS = 0;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___MUST_BE_OWNED = 1;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___MODEL = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link QWiki.impl.TaggedElementImpl <em>Tagged Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.TaggedElementImpl
	 * @see QWiki.impl.QWikiPackageImpl#getTaggedElement()
	 * @generated
	 */
	int TAGGED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_ELEMENT__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_ELEMENT__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_ELEMENT__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_ELEMENT__UUID = ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_ELEMENT__OID = ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_ELEMENT__TAG = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_ELEMENT__CUSTOM_PROPERTY = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tagged Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_ELEMENT___ALL_OWNED_ELEMENTS = ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_ELEMENT___MUST_BE_OWNED = ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_ELEMENT___MODEL = ELEMENT___MODEL;

	/**
	 * The number of operations of the '<em>Tagged Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.NamedElementImpl
	 * @see QWiki.impl.QWikiPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__OWNED_COMMENT = TAGGED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__OWNED_ELEMENT = TAGGED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__OWNER = TAGGED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__UUID = TAGGED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__OID = TAGGED_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__TAG = TAGGED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__CUSTOM_PROPERTY = TAGGED_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = TAGGED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__QUALIFIED_NAME = TAGGED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Assigned Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__ASSIGNED_DOMAIN = TAGGED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__DOMAIN = TAGGED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = TAGGED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___ALL_OWNED_ELEMENTS = TAGGED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___MUST_BE_OWNED = TAGGED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT___MODEL = TAGGED_ELEMENT___MODEL;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = TAGGED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.AuthorImpl <em>Author</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.AuthorImpl
	 * @see QWiki.impl.QWikiPackageImpl#getAuthor()
	 * @generated
	 */
	int AUTHOR = 0;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__OWNED_ELEMENT = NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__OWNER = NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__UUID = NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__OID = NAMED_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__TAG = NAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__CUSTOM_PROPERTY = NAMED_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__QUALIFIED_NAME = NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Assigned Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__ASSIGNED_DOMAIN = NAMED_ELEMENT__ASSIGNED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__DOMAIN = NAMED_ELEMENT__DOMAIN;

	/**
	 * The feature id for the '<em><b>Author Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__AUTHOR_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR___ALL_OWNED_ELEMENTS = NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR___MUST_BE_OWNED = NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR___MODEL = NAMED_ELEMENT___MODEL;

	/**
	 * The operation id for the '<em>Authored Document</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR___AUTHORED_DOCUMENT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Authored Standard</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR___AUTHORED_STANDARD = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link QWiki.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.CommentImpl
	 * @see QWiki.impl.QWikiPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 4;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__UUID = ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__OID = ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__BODY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__OWNING_ELEMENT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT___ALL_OWNED_ELEMENTS = ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT___MUST_BE_OWNED = ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT___MODEL = ELEMENT___MODEL;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.I18nBaseStringImpl <em>I1 8n Base String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.I18nBaseStringImpl
	 * @see QWiki.impl.QWikiPackageImpl#getI18nBaseString()
	 * @generated
	 */
	int I1_8N_BASE_STRING = 6;

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
	 * The meta object id for the '{@link QWiki.impl.I18nStringImpl <em>I1 8n String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.I18nStringImpl
	 * @see QWiki.impl.QWikiPackageImpl#getI18nString()
	 * @generated
	 */
	int I1_8N_STRING = 5;

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
	 * The meta object id for the '{@link QWiki.impl.I18nValueImpl <em>I1 8n Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.I18nValueImpl
	 * @see QWiki.impl.QWikiPackageImpl#getI18nValue()
	 * @generated
	 */
	int I1_8N_VALUE = 7;

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
	 * The meta object id for the '{@link QWiki.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.RelationshipImpl
	 * @see QWiki.impl.QWikiPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 22;

	/**
	 * The meta object id for the '{@link QWiki.impl.DirectedRelationshipImpl <em>Directed Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.DirectedRelationshipImpl
	 * @see QWiki.impl.QWikiPackageImpl#getDirectedRelationship()
	 * @generated
	 */
	int DIRECTED_RELATIONSHIP = 21;

	/**
	 * The meta object id for the '{@link QWiki.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.AssociationImpl
	 * @see QWiki.impl.QWikiPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 26;

	/**
	 * The meta object id for the '{@link QWiki.impl.I18nNamedElementImpl <em>I1 8n Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.I18nNamedElementImpl
	 * @see QWiki.impl.QWikiPackageImpl#getI18nNamedElement()
	 * @generated
	 */
	int I1_8N_NAMED_ELEMENT = 11;

	/**
	 * The meta object id for the '{@link QWiki.impl.RelationshipTypeImpl <em>Relationship Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.RelationshipTypeImpl
	 * @see QWiki.impl.QWikiPackageImpl#getRelationshipType()
	 * @generated
	 */
	int RELATIONSHIP_TYPE = 27;

	/**
	 * The meta object id for the '{@link QWiki.impl.I18nKeyedStringImpl <em>I1 8n Keyed String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.I18nKeyedStringImpl
	 * @see QWiki.impl.QWikiPackageImpl#getI18nKeyedString()
	 * @generated
	 */
	int I1_8N_KEYED_STRING = 9;

	/**
	 * The meta object id for the '{@link QWiki.impl.QWikiModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.QWikiModelImpl
	 * @see QWiki.impl.QWikiPackageImpl#getQWikiModel()
	 * @generated
	 */
	int QWIKI_MODEL = 8;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL__UUID = ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL__OID = ELEMENT__OID;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL___ALL_OWNED_ELEMENTS = ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL___MUST_BE_OWNED = ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL___MODEL = ELEMENT___MODEL;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__OWNED_ELEMENT = NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__OWNER = NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__UUID = NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__OID = NAMED_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__TAG = NAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__CUSTOM_PROPERTY = NAMED_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__QUALIFIED_NAME = NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Assigned Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__ASSIGNED_DOMAIN = NAMED_ELEMENT__ASSIGNED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__DOMAIN = NAMED_ELEMENT__DOMAIN;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__DISPLAY_NAME = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>I1 8n Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT___ALL_OWNED_ELEMENTS = NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT___MUST_BE_OWNED = NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT___MODEL = NAMED_ELEMENT___MODEL;

	/**
	 * The number of operations of the '<em>I1 8n Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.DomainImpl
	 * @see QWiki.impl.QWikiPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 10;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__OWNED_COMMENT = I1_8N_NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__OWNED_ELEMENT = I1_8N_NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__OWNER = I1_8N_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__UUID = I1_8N_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__OID = I1_8N_NAMED_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__TAG = I1_8N_NAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__CUSTOM_PROPERTY = I1_8N_NAMED_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = I1_8N_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__QUALIFIED_NAME = I1_8N_NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Assigned Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__ASSIGNED_DOMAIN = I1_8N_NAMED_ELEMENT__ASSIGNED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DOMAIN = I1_8N_NAMED_ELEMENT__DOMAIN;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DISPLAY_NAME = I1_8N_NAMED_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Domain Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DOMAIN_ELEMENT = I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___ALL_OWNED_ELEMENTS = I1_8N_NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___MUST_BE_OWNED = I1_8N_NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___MODEL = I1_8N_NAMED_ELEMENT___MODEL;

	/**
	 * The operation id for the '<em>All Domain Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___ALL_DOMAIN_ELEMENT = I1_8N_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_OPERATION_COUNT = I1_8N_NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link QWiki.impl.I18nDescriptiveElementImpl <em>I1 8n Descriptive Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.I18nDescriptiveElementImpl
	 * @see QWiki.impl.QWikiPackageImpl#getI18nDescriptiveElement()
	 * @generated
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT__OWNED_COMMENT = I1_8N_NAMED_ELEMENT__OWNED_COMMENT;

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
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT__UUID = I1_8N_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT__OID = I1_8N_NAMED_ELEMENT__OID;

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
	 * The feature id for the '<em><b>Assigned Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT__ASSIGNED_DOMAIN = I1_8N_NAMED_ELEMENT__ASSIGNED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT__DOMAIN = I1_8N_NAMED_ELEMENT__DOMAIN;

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
	 * The number of operations of the '<em>I1 8n Descriptive Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT_OPERATION_COUNT = I1_8N_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.DocumentImpl
	 * @see QWiki.impl.QWikiPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 12;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__OWNED_COMMENT = I1_8N_DESCRIPTIVE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__OWNED_ELEMENT = I1_8N_DESCRIPTIVE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__OWNER = I1_8N_DESCRIPTIVE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__UUID = I1_8N_DESCRIPTIVE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__OID = I1_8N_DESCRIPTIVE_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TAG = I1_8N_DESCRIPTIVE_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CUSTOM_PROPERTY = I1_8N_DESCRIPTIVE_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = I1_8N_DESCRIPTIVE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__QUALIFIED_NAME = I1_8N_DESCRIPTIVE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Assigned Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ASSIGNED_DOMAIN = I1_8N_DESCRIPTIVE_ELEMENT__ASSIGNED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DOMAIN = I1_8N_DESCRIPTIVE_ELEMENT__DOMAIN;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DISPLAY_NAME = I1_8N_DESCRIPTIVE_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__PURPOSE = I1_8N_DESCRIPTIVE_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__BODY = I1_8N_DESCRIPTIVE_ELEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NUMBER = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Version</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__OWNED_VERSION = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__SUPERSEEDING_RELATIONSHIP = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Document Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DOCUMENT_TYPE = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__AUTHOR = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___ALL_OWNED_ELEMENTS = I1_8N_DESCRIPTIVE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___MUST_BE_OWNED = I1_8N_DESCRIPTIVE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___MODEL = I1_8N_DESCRIPTIVE_ELEMENT___MODEL;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = I1_8N_DESCRIPTIVE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.DocumentVersionImpl <em>Document Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.DocumentVersionImpl
	 * @see QWiki.impl.QWikiPackageImpl#getDocumentVersion()
	 * @generated
	 */
	int DOCUMENT_VERSION = 14;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__UUID = ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__OID = ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Publication Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__PUBLICATION_YEAR = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document Version Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__DOCUMENT_VERSION_TYPE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Edition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__EDITION = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__OWNED_SECTION = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__SUPERSEEDING_RELATIONSHIP = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Qualified Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__QUALIFIED_NUMBER = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owning Document</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__OWNING_DOCUMENT = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Document Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION___ALL_OWNED_ELEMENTS = ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION___MUST_BE_OWNED = ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION___MODEL = ELEMENT___MODEL;

	/**
	 * The number of operations of the '<em>Document Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.SectionImpl
	 * @see QWiki.impl.QWikiPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 15;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__OWNED_COMMENT = I1_8N_DESCRIPTIVE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__OWNED_ELEMENT = I1_8N_DESCRIPTIVE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__OWNER = I1_8N_DESCRIPTIVE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__UUID = I1_8N_DESCRIPTIVE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__OID = I1_8N_DESCRIPTIVE_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TAG = I1_8N_DESCRIPTIVE_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CUSTOM_PROPERTY = I1_8N_DESCRIPTIVE_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NAME = I1_8N_DESCRIPTIVE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__QUALIFIED_NAME = I1_8N_DESCRIPTIVE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Assigned Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__ASSIGNED_DOMAIN = I1_8N_DESCRIPTIVE_ELEMENT__ASSIGNED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__DOMAIN = I1_8N_DESCRIPTIVE_ELEMENT__DOMAIN;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__DISPLAY_NAME = I1_8N_DESCRIPTIVE_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__PURPOSE = I1_8N_DESCRIPTIVE_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__BODY = I1_8N_DESCRIPTIVE_ELEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Owned Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__OWNED_SECTION = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owning Section</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__OWNING_SECTION = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NUMBER = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Facilitating Spice Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__FACILITATING_SPICE_ELEMENT = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Facilitating Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__FACILITATING_ELEMENT = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__SUPERSEEDING_RELATIONSHIP = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Qualified Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__QUALIFIED_NUMBER = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Term</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TERM = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owning Document</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__OWNING_DOCUMENT = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION___ALL_OWNED_ELEMENTS = I1_8N_DESCRIPTIVE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION___MUST_BE_OWNED = I1_8N_DESCRIPTIVE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION___MODEL = I1_8N_DESCRIPTIVE_ELEMENT___MODEL;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = I1_8N_DESCRIPTIVE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.RasciElementImpl <em>Rasci Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.RasciElementImpl
	 * @see QWiki.impl.QWikiPackageImpl#getRasciElement()
	 * @generated
	 */
	int RASCI_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__OWNED_COMMENT = I1_8N_DESCRIPTIVE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__OWNED_ELEMENT = I1_8N_DESCRIPTIVE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__OWNER = I1_8N_DESCRIPTIVE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__UUID = I1_8N_DESCRIPTIVE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__OID = I1_8N_DESCRIPTIVE_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__TAG = I1_8N_DESCRIPTIVE_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__CUSTOM_PROPERTY = I1_8N_DESCRIPTIVE_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__NAME = I1_8N_DESCRIPTIVE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__QUALIFIED_NAME = I1_8N_DESCRIPTIVE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Assigned Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__ASSIGNED_DOMAIN = I1_8N_DESCRIPTIVE_ELEMENT__ASSIGNED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__DOMAIN = I1_8N_DESCRIPTIVE_ELEMENT__DOMAIN;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__DISPLAY_NAME = I1_8N_DESCRIPTIVE_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__PURPOSE = I1_8N_DESCRIPTIVE_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__BODY = I1_8N_DESCRIPTIVE_ELEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Responsible Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__RESPONSIBLE_ROLE = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accountable Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__ACCOUNTABLE_ROLE = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Supporting Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__SUPPORTING_ROLE = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Consulting Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__CONSULTING_ROLE = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Informed Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__INFORMED_ROLE = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Rasci Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT_FEATURE_COUNT = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___ALL_OWNED_ELEMENTS = I1_8N_DESCRIPTIVE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___MUST_BE_OWNED = I1_8N_DESCRIPTIVE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___MODEL = I1_8N_DESCRIPTIVE_ELEMENT___MODEL;

	/**
	 * The number of operations of the '<em>Rasci Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT_OPERATION_COUNT = I1_8N_DESCRIPTIVE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.SpiceElementImpl <em>Spice Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.SpiceElementImpl
	 * @see QWiki.impl.QWikiPackageImpl#getSpiceElement()
	 * @generated
	 */
	int SPICE_ELEMENT = 16;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__OWNED_COMMENT = RASCI_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__OWNED_ELEMENT = RASCI_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__OWNER = RASCI_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__UUID = RASCI_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__OID = RASCI_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__TAG = RASCI_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__CUSTOM_PROPERTY = RASCI_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__NAME = RASCI_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__QUALIFIED_NAME = RASCI_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Assigned Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__ASSIGNED_DOMAIN = RASCI_ELEMENT__ASSIGNED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__DOMAIN = RASCI_ELEMENT__DOMAIN;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__DISPLAY_NAME = RASCI_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__PURPOSE = RASCI_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__BODY = RASCI_ELEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Responsible Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__RESPONSIBLE_ROLE = RASCI_ELEMENT__RESPONSIBLE_ROLE;

	/**
	 * The feature id for the '<em><b>Accountable Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__ACCOUNTABLE_ROLE = RASCI_ELEMENT__ACCOUNTABLE_ROLE;

	/**
	 * The feature id for the '<em><b>Supporting Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__SUPPORTING_ROLE = RASCI_ELEMENT__SUPPORTING_ROLE;

	/**
	 * The feature id for the '<em><b>Consulting Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__CONSULTING_ROLE = RASCI_ELEMENT__CONSULTING_ROLE;

	/**
	 * The feature id for the '<em><b>Informed Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__INFORMED_ROLE = RASCI_ELEMENT__INFORMED_ROLE;

	/**
	 * The feature id for the '<em><b>Owning Process Reference Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL = RASCI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__NUMBER = RASCI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__OWNING_ROLE = RASCI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Managing Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__MANAGING_ROLE = RASCI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Participating Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__PARTICIPATING_ROLE = RASCI_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__ROLE = RASCI_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Facilitated Section</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__FACILITATED_SECTION = RASCI_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Spice Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT_FEATURE_COUNT = RASCI_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___ALL_OWNED_ELEMENTS = RASCI_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___MUST_BE_OWNED = RASCI_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___MODEL = RASCI_ELEMENT___MODEL;

	/**
	 * The number of operations of the '<em>Spice Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT_OPERATION_COUNT = RASCI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.RoleImpl
	 * @see QWiki.impl.QWikiPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 18;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__OWNED_COMMENT = I1_8N_DESCRIPTIVE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__OWNED_ELEMENT = I1_8N_DESCRIPTIVE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__OWNER = I1_8N_DESCRIPTIVE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__UUID = I1_8N_DESCRIPTIVE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__OID = I1_8N_DESCRIPTIVE_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__TAG = I1_8N_DESCRIPTIVE_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CUSTOM_PROPERTY = I1_8N_DESCRIPTIVE_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = I1_8N_DESCRIPTIVE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__QUALIFIED_NAME = I1_8N_DESCRIPTIVE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Assigned Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ASSIGNED_DOMAIN = I1_8N_DESCRIPTIVE_ELEMENT__ASSIGNED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DOMAIN = I1_8N_DESCRIPTIVE_ELEMENT__DOMAIN;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DISPLAY_NAME = I1_8N_DESCRIPTIVE_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__PURPOSE = I1_8N_DESCRIPTIVE_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__BODY = I1_8N_DESCRIPTIVE_ELEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SKILLS = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Accountable Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ACCOUNTABLE_ELEMENT = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Supporting Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__SUPPORTING_ELEMENT = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Consulting Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__CONSULTING_ELEMENT = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Informed Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__INFORMED_ELEMENT = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Responsible Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__RESPONSIBLE_ELEMENT = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___ALL_OWNED_ELEMENTS = I1_8N_DESCRIPTIVE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___MUST_BE_OWNED = I1_8N_DESCRIPTIVE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___MODEL = I1_8N_DESCRIPTIVE_ELEMENT___MODEL;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = I1_8N_DESCRIPTIVE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.ProcessReferenceModelImpl <em>Process Reference Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.ProcessReferenceModelImpl
	 * @see QWiki.impl.QWikiPackageImpl#getProcessReferenceModel()
	 * @generated
	 */
	int PROCESS_REFERENCE_MODEL = 19;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__OWNED_COMMENT = I1_8N_DESCRIPTIVE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__OWNED_ELEMENT = I1_8N_DESCRIPTIVE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__OWNER = I1_8N_DESCRIPTIVE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__UUID = I1_8N_DESCRIPTIVE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__OID = I1_8N_DESCRIPTIVE_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__TAG = I1_8N_DESCRIPTIVE_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__CUSTOM_PROPERTY = I1_8N_DESCRIPTIVE_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__NAME = I1_8N_DESCRIPTIVE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__QUALIFIED_NAME = I1_8N_DESCRIPTIVE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Assigned Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__ASSIGNED_DOMAIN = I1_8N_DESCRIPTIVE_ELEMENT__ASSIGNED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__DOMAIN = I1_8N_DESCRIPTIVE_ELEMENT__DOMAIN;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__DISPLAY_NAME = I1_8N_DESCRIPTIVE_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__PURPOSE = I1_8N_DESCRIPTIVE_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__BODY = I1_8N_DESCRIPTIVE_ELEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Is Non Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__IS_NON_STANDARD = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prm Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__PRM_DOMAIN = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Spice Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__OWNED_SPICE_ELEMENT = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Process Reference Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL_FEATURE_COUNT = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___ALL_OWNED_ELEMENTS = I1_8N_DESCRIPTIVE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___MUST_BE_OWNED = I1_8N_DESCRIPTIVE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___MODEL = I1_8N_DESCRIPTIVE_ELEMENT___MODEL;

	/**
	 * The number of operations of the '<em>Process Reference Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL_OPERATION_COUNT = I1_8N_DESCRIPTIVE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OWNER = ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__UUID = ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OID = ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__RELATED_ELEMENT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___ALL_OWNED_ELEMENTS = ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___MUST_BE_OWNED = ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP___MODEL = ELEMENT___MODEL;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__OWNED_COMMENT = RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__OWNED_ELEMENT = RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__OWNER = RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__UUID = RELATIONSHIP__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__OID = RELATIONSHIP__OID;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__RELATED_ELEMENT = RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__SOURCE = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP__TARGET = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Directed Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP___ALL_OWNED_ELEMENTS = RELATIONSHIP___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP___MUST_BE_OWNED = RELATIONSHIP___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP___MODEL = RELATIONSHIP___MODEL;

	/**
	 * The number of operations of the '<em>Directed Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTED_RELATIONSHIP_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.SuperseedingRelationshipImpl <em>Superseeding Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.SuperseedingRelationshipImpl
	 * @see QWiki.impl.QWikiPackageImpl#getSuperseedingRelationship()
	 * @generated
	 */
	int SUPERSEEDING_RELATIONSHIP = 20;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP__OWNED_COMMENT = DIRECTED_RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP__OWNED_ELEMENT = DIRECTED_RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP__OWNER = DIRECTED_RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP__UUID = DIRECTED_RELATIONSHIP__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP__OID = DIRECTED_RELATIONSHIP__OID;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP__RELATED_ELEMENT = DIRECTED_RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP__SOURCE = DIRECTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP__TARGET = DIRECTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Superseeding Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP__SUPERSEEDING_TYPE = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Superseeding Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP_FEATURE_COUNT = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP___ALL_OWNED_ELEMENTS = DIRECTED_RELATIONSHIP___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP___MUST_BE_OWNED = DIRECTED_RELATIONSHIP___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP___MODEL = DIRECTED_RELATIONSHIP___MODEL;

	/**
	 * The number of operations of the '<em>Superseeding Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP_OPERATION_COUNT = DIRECTED_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.TermImpl
	 * @see QWiki.impl.QWikiPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 23;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__OWNED_COMMENT = I1_8N_NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__OWNED_ELEMENT = I1_8N_NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__OWNER = I1_8N_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__UUID = I1_8N_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__OID = I1_8N_NAMED_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__TAG = I1_8N_NAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__CUSTOM_PROPERTY = I1_8N_NAMED_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__NAME = I1_8N_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__QUALIFIED_NAME = I1_8N_NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Assigned Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__ASSIGNED_DOMAIN = I1_8N_NAMED_ELEMENT__ASSIGNED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__DOMAIN = I1_8N_NAMED_ELEMENT__DOMAIN;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__DISPLAY_NAME = I1_8N_NAMED_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__ACRONYM = I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Synonym</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__SYNONYM = I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Term Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__TERM_DEFINITION = I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Term Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__OWNED_TERM_DEFINITION = I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>External Term Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__EXTERNAL_TERM_DEFINITION = I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM___ALL_OWNED_ELEMENTS = I1_8N_NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM___MUST_BE_OWNED = I1_8N_NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM___MODEL = I1_8N_NAMED_ELEMENT___MODEL;

	/**
	 * The number of operations of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_OPERATION_COUNT = I1_8N_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.TermDefinitionImpl <em>Term Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.TermDefinitionImpl
	 * @see QWiki.impl.QWikiPackageImpl#getTermDefinition()
	 * @generated
	 */
	int TERM_DEFINITION = 24;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__OWNED_COMMENT = I1_8N_DESCRIPTIVE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__OWNED_ELEMENT = I1_8N_DESCRIPTIVE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__OWNER = I1_8N_DESCRIPTIVE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__UUID = I1_8N_DESCRIPTIVE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__OID = I1_8N_DESCRIPTIVE_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__TAG = I1_8N_DESCRIPTIVE_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__CUSTOM_PROPERTY = I1_8N_DESCRIPTIVE_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__NAME = I1_8N_DESCRIPTIVE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__QUALIFIED_NAME = I1_8N_DESCRIPTIVE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Assigned Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__ASSIGNED_DOMAIN = I1_8N_DESCRIPTIVE_ELEMENT__ASSIGNED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__DOMAIN = I1_8N_DESCRIPTIVE_ELEMENT__DOMAIN;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__DISPLAY_NAME = I1_8N_DESCRIPTIVE_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__PURPOSE = I1_8N_DESCRIPTIVE_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__BODY = I1_8N_DESCRIPTIVE_ELEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Owning Term</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__OWNING_TERM = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Term Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION_FEATURE_COUNT = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION___ALL_OWNED_ELEMENTS = I1_8N_DESCRIPTIVE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION___MUST_BE_OWNED = I1_8N_DESCRIPTIVE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION___MODEL = I1_8N_DESCRIPTIVE_ELEMENT___MODEL;

	/**
	 * The number of operations of the '<em>Term Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION_OPERATION_COUNT = I1_8N_DESCRIPTIVE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.StandardImpl <em>Standard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.StandardImpl
	 * @see QWiki.impl.QWikiPackageImpl#getStandard()
	 * @generated
	 */
	int STANDARD = 25;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__OWNED_COMMENT = DOCUMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__OWNED_ELEMENT = DOCUMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__OWNER = DOCUMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__UUID = DOCUMENT__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__OID = DOCUMENT__OID;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__TAG = DOCUMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__CUSTOM_PROPERTY = DOCUMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__NAME = DOCUMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__QUALIFIED_NAME = DOCUMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Assigned Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__ASSIGNED_DOMAIN = DOCUMENT__ASSIGNED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__DOMAIN = DOCUMENT__DOMAIN;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__DISPLAY_NAME = DOCUMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__PURPOSE = DOCUMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__BODY = DOCUMENT__BODY;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__NUMBER = DOCUMENT__NUMBER;

	/**
	 * The feature id for the '<em><b>Owned Version</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__OWNED_VERSION = DOCUMENT__OWNED_VERSION;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__SUPERSEEDING_RELATIONSHIP = DOCUMENT__SUPERSEEDING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Document Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__DOCUMENT_TYPE = DOCUMENT__DOCUMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD__AUTHOR = DOCUMENT__AUTHOR;

	/**
	 * The number of structural features of the '<em>Standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_FEATURE_COUNT = DOCUMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD___ALL_OWNED_ELEMENTS = DOCUMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD___MUST_BE_OWNED = DOCUMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD___MODEL = DOCUMENT___MODEL;

	/**
	 * The operation id for the '<em>Sdo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD___SDO = DOCUMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Standard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STANDARD_OPERATION_COUNT = DOCUMENT_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_COMMENT = RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNED_ELEMENT = RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OWNER = RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__UUID = RELATIONSHIP__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OID = RELATIONSHIP__OID;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__RELATED_ELEMENT = RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__END = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Relationship Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__END_RELATIONSHIP_TYPE = RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION___ALL_OWNED_ELEMENTS = RELATIONSHIP___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION___MUST_BE_OWNED = RELATIONSHIP___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION___MODEL = RELATIONSHIP___MODEL;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__OWNED_COMMENT = I1_8N_NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__OWNED_ELEMENT = I1_8N_NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__OWNER = I1_8N_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__UUID = I1_8N_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__OID = I1_8N_NAMED_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__TAG = I1_8N_NAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__CUSTOM_PROPERTY = I1_8N_NAMED_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__NAME = I1_8N_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__QUALIFIED_NAME = I1_8N_NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Assigned Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__ASSIGNED_DOMAIN = I1_8N_NAMED_ELEMENT__ASSIGNED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__DOMAIN = I1_8N_NAMED_ELEMENT__DOMAIN;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__DISPLAY_NAME = I1_8N_NAMED_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Typed Association</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE__TYPED_ASSOCIATION = I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE_FEATURE_COUNT = I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE___ALL_OWNED_ELEMENTS = I1_8N_NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE___MUST_BE_OWNED = I1_8N_NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE___MODEL = I1_8N_NAMED_ELEMENT___MODEL;

	/**
	 * The number of operations of the '<em>Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TYPE_OPERATION_COUNT = I1_8N_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.BasePractiseImpl <em>Base Practise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.BasePractiseImpl
	 * @see QWiki.impl.QWikiPackageImpl#getBasePractise()
	 * @generated
	 */
	int BASE_PRACTISE = 28;

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
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__UUID = SPICE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__OID = SPICE_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__TAG = SPICE_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__CUSTOM_PROPERTY = SPICE_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__NAME = SPICE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__QUALIFIED_NAME = SPICE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Assigned Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__ASSIGNED_DOMAIN = SPICE_ELEMENT__ASSIGNED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__DOMAIN = SPICE_ELEMENT__DOMAIN;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__DISPLAY_NAME = SPICE_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__PURPOSE = SPICE_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__BODY = SPICE_ELEMENT__BODY;

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
	 * The feature id for the '<em><b>Supporting Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__SUPPORTING_ROLE = SPICE_ELEMENT__SUPPORTING_ROLE;

	/**
	 * The feature id for the '<em><b>Consulting Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__CONSULTING_ROLE = SPICE_ELEMENT__CONSULTING_ROLE;

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
	 * The feature id for the '<em><b>Owning Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__OWNING_ROLE = SPICE_ELEMENT__OWNING_ROLE;

	/**
	 * The feature id for the '<em><b>Managing Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__MANAGING_ROLE = SPICE_ELEMENT__MANAGING_ROLE;

	/**
	 * The feature id for the '<em><b>Participating Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__PARTICIPATING_ROLE = SPICE_ELEMENT__PARTICIPATING_ROLE;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__ROLE = SPICE_ELEMENT__ROLE;

	/**
	 * The feature id for the '<em><b>Facilitated Section</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__FACILITATED_SECTION = SPICE_ELEMENT__FACILITATED_SECTION;

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
	 * The feature id for the '<em><b>Facilitated Work Product</b></em>' reference.
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
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___MODEL = SPICE_ELEMENT___MODEL;

	/**
	 * The number of operations of the '<em>Base Practise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE_OPERATION_COUNT = SPICE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.ProcessImpl
	 * @see QWiki.impl.QWikiPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 29;

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
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__UUID = SPICE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OID = SPICE_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__TAG = SPICE_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CUSTOM_PROPERTY = SPICE_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = SPICE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__QUALIFIED_NAME = SPICE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Assigned Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ASSIGNED_DOMAIN = SPICE_ELEMENT__ASSIGNED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DOMAIN = SPICE_ELEMENT__DOMAIN;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DISPLAY_NAME = SPICE_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PURPOSE = SPICE_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__BODY = SPICE_ELEMENT__BODY;

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
	 * The feature id for the '<em><b>Supporting Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SUPPORTING_ROLE = SPICE_ELEMENT__SUPPORTING_ROLE;

	/**
	 * The feature id for the '<em><b>Consulting Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__CONSULTING_ROLE = SPICE_ELEMENT__CONSULTING_ROLE;

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
	 * The feature id for the '<em><b>Owning Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OWNING_ROLE = SPICE_ELEMENT__OWNING_ROLE;

	/**
	 * The feature id for the '<em><b>Managing Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__MANAGING_ROLE = SPICE_ELEMENT__MANAGING_ROLE;

	/**
	 * The feature id for the '<em><b>Participating Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PARTICIPATING_ROLE = SPICE_ELEMENT__PARTICIPATING_ROLE;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__ROLE = SPICE_ELEMENT__ROLE;

	/**
	 * The feature id for the '<em><b>Facilitated Section</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__FACILITATED_SECTION = SPICE_ELEMENT__FACILITATED_SECTION;

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
	 * The feature id for the '<em><b>Facilitated Work Product</b></em>' reference.
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
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___MODEL = SPICE_ELEMENT___MODEL;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_OPERATION_COUNT = SPICE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.ProcessGroupImpl <em>Process Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.ProcessGroupImpl
	 * @see QWiki.impl.QWikiPackageImpl#getProcessGroup()
	 * @generated
	 */
	int PROCESS_GROUP = 30;

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
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__UUID = SPICE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__OID = SPICE_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__TAG = SPICE_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__CUSTOM_PROPERTY = SPICE_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__NAME = SPICE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__QUALIFIED_NAME = SPICE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Assigned Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__ASSIGNED_DOMAIN = SPICE_ELEMENT__ASSIGNED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__DOMAIN = SPICE_ELEMENT__DOMAIN;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__DISPLAY_NAME = SPICE_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__PURPOSE = SPICE_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__BODY = SPICE_ELEMENT__BODY;

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
	 * The feature id for the '<em><b>Supporting Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__SUPPORTING_ROLE = SPICE_ELEMENT__SUPPORTING_ROLE;

	/**
	 * The feature id for the '<em><b>Consulting Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__CONSULTING_ROLE = SPICE_ELEMENT__CONSULTING_ROLE;

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
	 * The feature id for the '<em><b>Owning Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__OWNING_ROLE = SPICE_ELEMENT__OWNING_ROLE;

	/**
	 * The feature id for the '<em><b>Managing Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__MANAGING_ROLE = SPICE_ELEMENT__MANAGING_ROLE;

	/**
	 * The feature id for the '<em><b>Participating Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__PARTICIPATING_ROLE = SPICE_ELEMENT__PARTICIPATING_ROLE;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__ROLE = SPICE_ELEMENT__ROLE;

	/**
	 * The feature id for the '<em><b>Facilitated Section</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__FACILITATED_SECTION = SPICE_ELEMENT__FACILITATED_SECTION;

	/**
	 * The feature id for the '<em><b>Onwed Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__ONWED_PROCESS = SPICE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Process Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP_FEATURE_COUNT = SPICE_ELEMENT_FEATURE_COUNT + 1;

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
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___MODEL = SPICE_ELEMENT___MODEL;

	/**
	 * The number of operations of the '<em>Process Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP_OPERATION_COUNT = SPICE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.OutcomeImpl <em>Outcome</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.OutcomeImpl
	 * @see QWiki.impl.QWikiPackageImpl#getOutcome()
	 * @generated
	 */
	int OUTCOME = 31;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__OWNED_COMMENT = I1_8N_NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__OWNED_ELEMENT = I1_8N_NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__OWNER = I1_8N_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__UUID = I1_8N_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__OID = I1_8N_NAMED_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__TAG = I1_8N_NAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__CUSTOM_PROPERTY = I1_8N_NAMED_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__NAME = I1_8N_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__QUALIFIED_NAME = I1_8N_NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Assigned Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__ASSIGNED_DOMAIN = I1_8N_NAMED_ELEMENT__ASSIGNED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__DOMAIN = I1_8N_NAMED_ELEMENT__DOMAIN;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__DISPLAY_NAME = I1_8N_NAMED_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Facilitating Base Practise</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__FACILITATING_BASE_PRACTISE = I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Workproduct</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__REQUIRED_WORKPRODUCT = I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resulting Workproduct</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__RESULTING_WORKPRODUCT = I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owning Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__OWNING_PROCESS = I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Outcome</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME_FEATURE_COUNT = I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___ALL_OWNED_ELEMENTS = I1_8N_NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___MUST_BE_OWNED = I1_8N_NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___MODEL = I1_8N_NAMED_ELEMENT___MODEL;

	/**
	 * The number of operations of the '<em>Outcome</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME_OPERATION_COUNT = I1_8N_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.WorkProductImpl <em>Work Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.WorkProductImpl
	 * @see QWiki.impl.QWikiPackageImpl#getWorkProduct()
	 * @generated
	 */
	int WORK_PRODUCT = 32;

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
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__UUID = SPICE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__OID = SPICE_ELEMENT__OID;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__TAG = SPICE_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__CUSTOM_PROPERTY = SPICE_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__NAME = SPICE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__QUALIFIED_NAME = SPICE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Assigned Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__ASSIGNED_DOMAIN = SPICE_ELEMENT__ASSIGNED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__DOMAIN = SPICE_ELEMENT__DOMAIN;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__DISPLAY_NAME = SPICE_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__PURPOSE = SPICE_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__BODY = SPICE_ELEMENT__BODY;

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
	 * The feature id for the '<em><b>Supporting Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__SUPPORTING_ROLE = SPICE_ELEMENT__SUPPORTING_ROLE;

	/**
	 * The feature id for the '<em><b>Consulting Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__CONSULTING_ROLE = SPICE_ELEMENT__CONSULTING_ROLE;

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
	 * The feature id for the '<em><b>Owning Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__OWNING_ROLE = SPICE_ELEMENT__OWNING_ROLE;

	/**
	 * The feature id for the '<em><b>Managing Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__MANAGING_ROLE = SPICE_ELEMENT__MANAGING_ROLE;

	/**
	 * The feature id for the '<em><b>Participating Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__PARTICIPATING_ROLE = SPICE_ELEMENT__PARTICIPATING_ROLE;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__ROLE = SPICE_ELEMENT__ROLE;

	/**
	 * The feature id for the '<em><b>Facilitated Section</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__FACILITATED_SECTION = SPICE_ELEMENT__FACILITATED_SECTION;

	/**
	 * The feature id for the '<em><b>Owning Working Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__OWNING_WORKING_GROUP = SPICE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__CHARACTERISTIC = SPICE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__CONTENT = SPICE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Facilitating Outcome</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__FACILITATING_OUTCOME = SPICE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Facilitated Process</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__FACILITATED_PROCESS = SPICE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Facilitating Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__FACILITATING_PROCESS = SPICE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Work Product Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__WORK_PRODUCT_TYPE = SPICE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Facilitated Outcome</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__FACILITATED_OUTCOME = SPICE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Work Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_FEATURE_COUNT = SPICE_ELEMENT_FEATURE_COUNT + 8;

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
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___MODEL = SPICE_ELEMENT___MODEL;

	/**
	 * The number of operations of the '<em>Work Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT_OPERATION_COUNT = SPICE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.GenericWorkProductImpl <em>Generic Work Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.GenericWorkProductImpl
	 * @see QWiki.impl.QWikiPackageImpl#getGenericWorkProduct()
	 * @generated
	 */
	int GENERIC_WORK_PRODUCT = 33;

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
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__UUID = WORK_PRODUCT__UUID;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__OID = WORK_PRODUCT__OID;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__TAG = WORK_PRODUCT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__CUSTOM_PROPERTY = WORK_PRODUCT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__NAME = WORK_PRODUCT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__QUALIFIED_NAME = WORK_PRODUCT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Assigned Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__ASSIGNED_DOMAIN = WORK_PRODUCT__ASSIGNED_DOMAIN;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__DOMAIN = WORK_PRODUCT__DOMAIN;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__DISPLAY_NAME = WORK_PRODUCT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__PURPOSE = WORK_PRODUCT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__BODY = WORK_PRODUCT__BODY;

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
	 * The feature id for the '<em><b>Supporting Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__SUPPORTING_ROLE = WORK_PRODUCT__SUPPORTING_ROLE;

	/**
	 * The feature id for the '<em><b>Consulting Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__CONSULTING_ROLE = WORK_PRODUCT__CONSULTING_ROLE;

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
	 * The feature id for the '<em><b>Owning Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__OWNING_ROLE = WORK_PRODUCT__OWNING_ROLE;

	/**
	 * The feature id for the '<em><b>Managing Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__MANAGING_ROLE = WORK_PRODUCT__MANAGING_ROLE;

	/**
	 * The feature id for the '<em><b>Participating Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__PARTICIPATING_ROLE = WORK_PRODUCT__PARTICIPATING_ROLE;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__ROLE = WORK_PRODUCT__ROLE;

	/**
	 * The feature id for the '<em><b>Facilitated Section</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__FACILITATED_SECTION = WORK_PRODUCT__FACILITATED_SECTION;

	/**
	 * The feature id for the '<em><b>Owning Working Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__OWNING_WORKING_GROUP = WORK_PRODUCT__OWNING_WORKING_GROUP;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__CHARACTERISTIC = WORK_PRODUCT__CHARACTERISTIC;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__CONTENT = WORK_PRODUCT__CONTENT;

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
	 * The feature id for the '<em><b>Facilitating Process</b></em>' reference.
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
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___MODEL = WORK_PRODUCT___MODEL;

	/**
	 * The number of operations of the '<em>Generic Work Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT_OPERATION_COUNT = WORK_PRODUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.AuthorType <em>Author Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.AuthorType
	 * @see QWiki.impl.QWikiPackageImpl#getAuthorType()
	 * @generated
	 */
	int AUTHOR_TYPE = 34;

	/**
	 * The meta object id for the '{@link QWiki.DocumentVersionType <em>Document Version Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.DocumentVersionType
	 * @see QWiki.impl.QWikiPackageImpl#getDocumentVersionType()
	 * @generated
	 */
	int DOCUMENT_VERSION_TYPE = 35;

	/**
	 * The meta object id for the '{@link QWiki.ProcessReferenceModelDomain <em>Process Reference Model Domain</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.ProcessReferenceModelDomain
	 * @see QWiki.impl.QWikiPackageImpl#getProcessReferenceModelDomain()
	 * @generated
	 */
	int PROCESS_REFERENCE_MODEL_DOMAIN = 36;

	/**
	 * The meta object id for the '{@link QWiki.SuperseedingType <em>Superseeding Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.SuperseedingType
	 * @see QWiki.impl.QWikiPackageImpl#getSuperseedingType()
	 * @generated
	 */
	int SUPERSEEDING_TYPE = 37;

	/**
	 * The meta object id for the '{@link QWiki.DocumentType <em>Document Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.DocumentType
	 * @see QWiki.impl.QWikiPackageImpl#getDocumentType()
	 * @generated
	 */
	int DOCUMENT_TYPE = 38;

	/**
	 * The meta object id for the '{@link QWiki.WorkProductType <em>Work Product Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.WorkProductType
	 * @see QWiki.impl.QWikiPackageImpl#getWorkProductType()
	 * @generated
	 */
	int WORK_PRODUCT_TYPE = 39;


	/**
	 * Returns the meta object for class '{@link QWiki.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Author</em>'.
	 * @see QWiki.Author
	 * @generated
	 */
	EClass getAuthor();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.Author#getAuthorType <em>Author Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author Type</em>'.
	 * @see QWiki.Author#getAuthorType()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_AuthorType();

	/**
	 * Returns the meta object for the '{@link QWiki.Author#authoredDocument() <em>Authored Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Authored Document</em>' operation.
	 * @see QWiki.Author#authoredDocument()
	 * @generated
	 */
	EOperation getAuthor__AuthoredDocument();

	/**
	 * Returns the meta object for the '{@link QWiki.Author#authoredStandard() <em>Authored Standard</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Authored Standard</em>' operation.
	 * @see QWiki.Author#authoredStandard()
	 * @generated
	 */
	EOperation getAuthor__AuthoredStandard();

	/**
	 * Returns the meta object for class '{@link QWiki.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see QWiki.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QWiki.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.NamedElement#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see QWiki.NamedElement#getQualifiedName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_QualifiedName();

	/**
	 * Returns the meta object for the reference '{@link QWiki.NamedElement#getAssignedDomain <em>Assigned Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assigned Domain</em>'.
	 * @see QWiki.NamedElement#getAssignedDomain()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_AssignedDomain();

	/**
	 * Returns the meta object for the reference '{@link QWiki.NamedElement#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see QWiki.NamedElement#getDomain()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_Domain();

	/**
	 * Returns the meta object for class '{@link QWiki.TaggedElement <em>Tagged Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tagged Element</em>'.
	 * @see QWiki.TaggedElement
	 * @generated
	 */
	EClass getTaggedElement();

	/**
	 * Returns the meta object for the attribute list '{@link QWiki.TaggedElement#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tag</em>'.
	 * @see QWiki.TaggedElement#getTag()
	 * @see #getTaggedElement()
	 * @generated
	 */
	EAttribute getTaggedElement_Tag();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.TaggedElement#getCustomProperty <em>Custom Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Property</em>'.
	 * @see QWiki.TaggedElement#getCustomProperty()
	 * @see #getTaggedElement()
	 * @generated
	 */
	EReference getTaggedElement_CustomProperty();

	/**
	 * Returns the meta object for class '{@link QWiki.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see QWiki.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.Element#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Comment</em>'.
	 * @see QWiki.Element#getOwnedComment()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_OwnedComment();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Element#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Element</em>'.
	 * @see QWiki.Element#getOwnedElement()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_OwnedElement();

	/**
	 * Returns the meta object for the reference '{@link QWiki.Element#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see QWiki.Element#getOwner()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Owner();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.Element#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see QWiki.Element#getUuid()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Uuid();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.Element#getOid <em>Oid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oid</em>'.
	 * @see QWiki.Element#getOid()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Oid();

	/**
	 * Returns the meta object for the '{@link QWiki.Element#allOwnedElements() <em>All Owned Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Owned Elements</em>' operation.
	 * @see QWiki.Element#allOwnedElements()
	 * @generated
	 */
	EOperation getElement__AllOwnedElements();

	/**
	 * Returns the meta object for the '{@link QWiki.Element#mustBeOwned() <em>Must Be Owned</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Must Be Owned</em>' operation.
	 * @see QWiki.Element#mustBeOwned()
	 * @generated
	 */
	EOperation getElement__MustBeOwned();

	/**
	 * Returns the meta object for the '{@link QWiki.Element#model() <em>Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Model</em>' operation.
	 * @see QWiki.Element#model()
	 * @generated
	 */
	EOperation getElement__Model();

	/**
	 * Returns the meta object for class '{@link QWiki.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see QWiki.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the containment reference '{@link QWiki.Comment#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see QWiki.Comment#getBody()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_Body();

	/**
	 * Returns the meta object for the container reference '{@link QWiki.Comment#getOwningElement <em>Owning Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Element</em>'.
	 * @see QWiki.Comment#getOwningElement()
	 * @see #getComment()
	 * @generated
	 */
	EReference getComment_OwningElement();

	/**
	 * Returns the meta object for class '{@link QWiki.I18nString <em>I1 8n String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I1 8n String</em>'.
	 * @see QWiki.I18nString
	 * @generated
	 */
	EClass getI18nString();

	/**
	 * Returns the meta object for class '{@link QWiki.I18nBaseString <em>I1 8n Base String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I1 8n Base String</em>'.
	 * @see QWiki.I18nBaseString
	 * @generated
	 */
	EClass getI18nBaseString();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.I18nBaseString#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see QWiki.I18nBaseString#getValue()
	 * @see #getI18nBaseString()
	 * @generated
	 */
	EReference getI18nBaseString_Value();

	/**
	 * Returns the meta object for the '{@link QWiki.I18nBaseString#value(java.lang.String) <em>Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Value</em>' operation.
	 * @see QWiki.I18nBaseString#value(java.lang.String)
	 * @generated
	 */
	EOperation getI18nBaseString__Value__String();

	/**
	 * Returns the meta object for class '{@link QWiki.I18nValue <em>I1 8n Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I1 8n Value</em>'.
	 * @see QWiki.I18nValue
	 * @generated
	 */
	EClass getI18nValue();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.I18nValue#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see QWiki.I18nValue#getLanguage()
	 * @see #getI18nValue()
	 * @generated
	 */
	EAttribute getI18nValue_Language();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.I18nValue#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see QWiki.I18nValue#getBody()
	 * @see #getI18nValue()
	 * @generated
	 */
	EAttribute getI18nValue_Body();

	/**
	 * Returns the meta object for class '{@link QWiki.DirectedRelationship <em>Directed Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directed Relationship</em>'.
	 * @see QWiki.DirectedRelationship
	 * @generated
	 */
	EClass getDirectedRelationship();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.DirectedRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see QWiki.DirectedRelationship#getTarget()
	 * @see #getDirectedRelationship()
	 * @generated
	 */
	EReference getDirectedRelationship_Target();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.DirectedRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see QWiki.DirectedRelationship#getSource()
	 * @see #getDirectedRelationship()
	 * @generated
	 */
	EReference getDirectedRelationship_Source();

	/**
	 * Returns the meta object for class '{@link QWiki.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see QWiki.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Relationship#getRelatedElement <em>Related Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Element</em>'.
	 * @see QWiki.Relationship#getRelatedElement()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_RelatedElement();

	/**
	 * Returns the meta object for class '{@link QWiki.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see QWiki.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Association#getEndRelationshipType <em>End Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End Relationship Type</em>'.
	 * @see QWiki.Association#getEndRelationshipType()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_EndRelationshipType();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Association#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>End</em>'.
	 * @see QWiki.Association#getEnd()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_End();

	/**
	 * Returns the meta object for class '{@link QWiki.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Type</em>'.
	 * @see QWiki.RelationshipType
	 * @generated
	 */
	EClass getRelationshipType();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.RelationshipType#getTypedAssociation <em>Typed Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Typed Association</em>'.
	 * @see QWiki.RelationshipType#getTypedAssociation()
	 * @see #getRelationshipType()
	 * @generated
	 */
	EReference getRelationshipType_TypedAssociation();

	/**
	 * Returns the meta object for class '{@link QWiki.I18nNamedElement <em>I1 8n Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I1 8n Named Element</em>'.
	 * @see QWiki.I18nNamedElement
	 * @generated
	 */
	EClass getI18nNamedElement();

	/**
	 * Returns the meta object for the containment reference '{@link QWiki.I18nNamedElement#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Display Name</em>'.
	 * @see QWiki.I18nNamedElement#getDisplayName()
	 * @see #getI18nNamedElement()
	 * @generated
	 */
	EReference getI18nNamedElement_DisplayName();

	/**
	 * Returns the meta object for class '{@link QWiki.I18nKeyedString <em>I1 8n Keyed String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I1 8n Keyed String</em>'.
	 * @see QWiki.I18nKeyedString
	 * @generated
	 */
	EClass getI18nKeyedString();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.I18nKeyedString#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see QWiki.I18nKeyedString#getKey()
	 * @see #getI18nKeyedString()
	 * @generated
	 */
	EAttribute getI18nKeyedString_Key();

	/**
	 * Returns the meta object for class '{@link QWiki.QWikiModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see QWiki.QWikiModel
	 * @generated
	 */
	EClass getQWikiModel();

	/**
	 * Returns the meta object for class '{@link QWiki.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see QWiki.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Domain#getDomainElement <em>Domain Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Element</em>'.
	 * @see QWiki.Domain#getDomainElement()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_DomainElement();

	/**
	 * Returns the meta object for the '{@link QWiki.Domain#allDomainElement() <em>All Domain Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Domain Element</em>' operation.
	 * @see QWiki.Domain#allDomainElement()
	 * @generated
	 */
	EOperation getDomain__AllDomainElement();

	/**
	 * Returns the meta object for class '{@link QWiki.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see QWiki.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.Document#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see QWiki.Document#getNumber()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Number();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.Document#getOwnedVersion <em>Owned Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Version</em>'.
	 * @see QWiki.Document#getOwnedVersion()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_OwnedVersion();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Document#getSuperseedingRelationship <em>Superseeding Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Superseeding Relationship</em>'.
	 * @see QWiki.Document#getSuperseedingRelationship()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_SuperseedingRelationship();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.Document#getDocumentType <em>Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Type</em>'.
	 * @see QWiki.Document#getDocumentType()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_DocumentType();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Document#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Author</em>'.
	 * @see QWiki.Document#getAuthor()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Author();

	/**
	 * Returns the meta object for class '{@link QWiki.I18nDescriptiveElement <em>I1 8n Descriptive Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I1 8n Descriptive Element</em>'.
	 * @see QWiki.I18nDescriptiveElement
	 * @generated
	 */
	EClass getI18nDescriptiveElement();

	/**
	 * Returns the meta object for the containment reference '{@link QWiki.I18nDescriptiveElement#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Purpose</em>'.
	 * @see QWiki.I18nDescriptiveElement#getPurpose()
	 * @see #getI18nDescriptiveElement()
	 * @generated
	 */
	EReference getI18nDescriptiveElement_Purpose();

	/**
	 * Returns the meta object for the containment reference '{@link QWiki.I18nDescriptiveElement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see QWiki.I18nDescriptiveElement#getBody()
	 * @see #getI18nDescriptiveElement()
	 * @generated
	 */
	EReference getI18nDescriptiveElement_Body();

	/**
	 * Returns the meta object for class '{@link QWiki.DocumentVersion <em>Document Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Version</em>'.
	 * @see QWiki.DocumentVersion
	 * @generated
	 */
	EClass getDocumentVersion();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.DocumentVersion#getPublicationYear <em>Publication Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publication Year</em>'.
	 * @see QWiki.DocumentVersion#getPublicationYear()
	 * @see #getDocumentVersion()
	 * @generated
	 */
	EAttribute getDocumentVersion_PublicationYear();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.DocumentVersion#getDocumentVersionType <em>Document Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Version Type</em>'.
	 * @see QWiki.DocumentVersion#getDocumentVersionType()
	 * @see #getDocumentVersion()
	 * @generated
	 */
	EAttribute getDocumentVersion_DocumentVersionType();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.DocumentVersion#getEdition <em>Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edition</em>'.
	 * @see QWiki.DocumentVersion#getEdition()
	 * @see #getDocumentVersion()
	 * @generated
	 */
	EAttribute getDocumentVersion_Edition();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.DocumentVersion#getOwnedSection <em>Owned Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Section</em>'.
	 * @see QWiki.DocumentVersion#getOwnedSection()
	 * @see #getDocumentVersion()
	 * @generated
	 */
	EReference getDocumentVersion_OwnedSection();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.DocumentVersion#getSuperseedingRelationship <em>Superseeding Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Superseeding Relationship</em>'.
	 * @see QWiki.DocumentVersion#getSuperseedingRelationship()
	 * @see #getDocumentVersion()
	 * @generated
	 */
	EReference getDocumentVersion_SuperseedingRelationship();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.DocumentVersion#getQualifiedNumber <em>Qualified Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Number</em>'.
	 * @see QWiki.DocumentVersion#getQualifiedNumber()
	 * @see #getDocumentVersion()
	 * @generated
	 */
	EAttribute getDocumentVersion_QualifiedNumber();

	/**
	 * Returns the meta object for the container reference '{@link QWiki.DocumentVersion#getOwningDocument <em>Owning Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Document</em>'.
	 * @see QWiki.DocumentVersion#getOwningDocument()
	 * @see #getDocumentVersion()
	 * @generated
	 */
	EReference getDocumentVersion_OwningDocument();

	/**
	 * Returns the meta object for class '{@link QWiki.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see QWiki.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.Section#getOwnedSection <em>Owned Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Section</em>'.
	 * @see QWiki.Section#getOwnedSection()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_OwnedSection();

	/**
	 * Returns the meta object for the container reference '{@link QWiki.Section#getOwningSection <em>Owning Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Section</em>'.
	 * @see QWiki.Section#getOwningSection()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_OwningSection();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.Section#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see QWiki.Section#getNumber()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Number();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Section#getFacilitatingSpiceElement <em>Facilitating Spice Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitating Spice Element</em>'.
	 * @see QWiki.Section#getFacilitatingSpiceElement()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_FacilitatingSpiceElement();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Section#getFacilitatingElement <em>Facilitating Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitating Element</em>'.
	 * @see QWiki.Section#getFacilitatingElement()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_FacilitatingElement();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Section#getSuperseedingRelationship <em>Superseeding Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Superseeding Relationship</em>'.
	 * @see QWiki.Section#getSuperseedingRelationship()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_SuperseedingRelationship();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.Section#getQualifiedNumber <em>Qualified Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Number</em>'.
	 * @see QWiki.Section#getQualifiedNumber()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_QualifiedNumber();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Section#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Term</em>'.
	 * @see QWiki.Section#getTerm()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Term();

	/**
	 * Returns the meta object for the container reference '{@link QWiki.Section#getOwningDocument <em>Owning Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Document</em>'.
	 * @see QWiki.Section#getOwningDocument()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_OwningDocument();

	/**
	 * Returns the meta object for class '{@link QWiki.SpiceElement <em>Spice Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spice Element</em>'.
	 * @see QWiki.SpiceElement
	 * @generated
	 */
	EClass getSpiceElement();

	/**
	 * Returns the meta object for the container reference '{@link QWiki.SpiceElement#getOwningProcessReferenceModel <em>Owning Process Reference Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Process Reference Model</em>'.
	 * @see QWiki.SpiceElement#getOwningProcessReferenceModel()
	 * @see #getSpiceElement()
	 * @generated
	 */
	EReference getSpiceElement_OwningProcessReferenceModel();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.SpiceElement#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see QWiki.SpiceElement#getNumber()
	 * @see #getSpiceElement()
	 * @generated
	 */
	EAttribute getSpiceElement_Number();

	/**
	 * Returns the meta object for the reference '{@link QWiki.SpiceElement#getOwningRole <em>Owning Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owning Role</em>'.
	 * @see QWiki.SpiceElement#getOwningRole()
	 * @see #getSpiceElement()
	 * @generated
	 */
	EReference getSpiceElement_OwningRole();

	/**
	 * Returns the meta object for the reference '{@link QWiki.SpiceElement#getManagingRole <em>Managing Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Managing Role</em>'.
	 * @see QWiki.SpiceElement#getManagingRole()
	 * @see #getSpiceElement()
	 * @generated
	 */
	EReference getSpiceElement_ManagingRole();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.SpiceElement#getParticipatingRole <em>Participating Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participating Role</em>'.
	 * @see QWiki.SpiceElement#getParticipatingRole()
	 * @see #getSpiceElement()
	 * @generated
	 */
	EReference getSpiceElement_ParticipatingRole();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.SpiceElement#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role</em>'.
	 * @see QWiki.SpiceElement#getRole()
	 * @see #getSpiceElement()
	 * @generated
	 */
	EReference getSpiceElement_Role();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.SpiceElement#getFacilitatedSection <em>Facilitated Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitated Section</em>'.
	 * @see QWiki.SpiceElement#getFacilitatedSection()
	 * @see #getSpiceElement()
	 * @generated
	 */
	EReference getSpiceElement_FacilitatedSection();

	/**
	 * Returns the meta object for class '{@link QWiki.RasciElement <em>Rasci Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rasci Element</em>'.
	 * @see QWiki.RasciElement
	 * @generated
	 */
	EClass getRasciElement();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.RasciElement#getResponsibleRole <em>Responsible Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsible Role</em>'.
	 * @see QWiki.RasciElement#getResponsibleRole()
	 * @see #getRasciElement()
	 * @generated
	 */
	EReference getRasciElement_ResponsibleRole();

	/**
	 * Returns the meta object for the reference '{@link QWiki.RasciElement#getAccountableRole <em>Accountable Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Accountable Role</em>'.
	 * @see QWiki.RasciElement#getAccountableRole()
	 * @see #getRasciElement()
	 * @generated
	 */
	EReference getRasciElement_AccountableRole();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.RasciElement#getSupportingRole <em>Supporting Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supporting Role</em>'.
	 * @see QWiki.RasciElement#getSupportingRole()
	 * @see #getRasciElement()
	 * @generated
	 */
	EReference getRasciElement_SupportingRole();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.RasciElement#getConsultingRole <em>Consulting Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consulting Role</em>'.
	 * @see QWiki.RasciElement#getConsultingRole()
	 * @see #getRasciElement()
	 * @generated
	 */
	EReference getRasciElement_ConsultingRole();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.RasciElement#getInformedRole <em>Informed Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Informed Role</em>'.
	 * @see QWiki.RasciElement#getInformedRole()
	 * @see #getRasciElement()
	 * @generated
	 */
	EReference getRasciElement_InformedRole();

	/**
	 * Returns the meta object for class '{@link QWiki.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see QWiki.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.Role#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Skills</em>'.
	 * @see QWiki.Role#getSkills()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_Skills();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Role#getAccountableElement <em>Accountable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accountable Element</em>'.
	 * @see QWiki.Role#getAccountableElement()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_AccountableElement();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Role#getSupportingElement <em>Supporting Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supporting Element</em>'.
	 * @see QWiki.Role#getSupportingElement()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_SupportingElement();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Role#getConsultingElement <em>Consulting Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Consulting Element</em>'.
	 * @see QWiki.Role#getConsultingElement()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_ConsultingElement();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Role#getInformedElement <em>Informed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Informed Element</em>'.
	 * @see QWiki.Role#getInformedElement()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_InformedElement();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Role#getResponsibleElement <em>Responsible Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsible Element</em>'.
	 * @see QWiki.Role#getResponsibleElement()
	 * @see #getRole()
	 * @generated
	 */
	EReference getRole_ResponsibleElement();

	/**
	 * Returns the meta object for class '{@link QWiki.ProcessReferenceModel <em>Process Reference Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Reference Model</em>'.
	 * @see QWiki.ProcessReferenceModel
	 * @generated
	 */
	EClass getProcessReferenceModel();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.ProcessReferenceModel#isNonStandard <em>Is Non Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Non Standard</em>'.
	 * @see QWiki.ProcessReferenceModel#isNonStandard()
	 * @see #getProcessReferenceModel()
	 * @generated
	 */
	EAttribute getProcessReferenceModel_IsNonStandard();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.ProcessReferenceModel#getPrmDomain <em>Prm Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prm Domain</em>'.
	 * @see QWiki.ProcessReferenceModel#getPrmDomain()
	 * @see #getProcessReferenceModel()
	 * @generated
	 */
	EAttribute getProcessReferenceModel_PrmDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.ProcessReferenceModel#getOwnedSpiceElement <em>Owned Spice Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Spice Element</em>'.
	 * @see QWiki.ProcessReferenceModel#getOwnedSpiceElement()
	 * @see #getProcessReferenceModel()
	 * @generated
	 */
	EReference getProcessReferenceModel_OwnedSpiceElement();

	/**
	 * Returns the meta object for class '{@link QWiki.SuperseedingRelationship <em>Superseeding Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Superseeding Relationship</em>'.
	 * @see QWiki.SuperseedingRelationship
	 * @generated
	 */
	EClass getSuperseedingRelationship();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.SuperseedingRelationship#getSuperseedingType <em>Superseeding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Superseeding Type</em>'.
	 * @see QWiki.SuperseedingRelationship#getSuperseedingType()
	 * @see #getSuperseedingRelationship()
	 * @generated
	 */
	EAttribute getSuperseedingRelationship_SuperseedingType();

	/**
	 * Returns the meta object for class '{@link QWiki.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see QWiki.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for the containment reference '{@link QWiki.Term#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Acronym</em>'.
	 * @see QWiki.Term#getAcronym()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Acronym();

	/**
	 * Returns the meta object for the containment reference '{@link QWiki.Term#getSynonym <em>Synonym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Synonym</em>'.
	 * @see QWiki.Term#getSynonym()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_Synonym();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Term#getTermDefinition <em>Term Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Term Definition</em>'.
	 * @see QWiki.Term#getTermDefinition()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_TermDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.Term#getOwnedTermDefinition <em>Owned Term Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Term Definition</em>'.
	 * @see QWiki.Term#getOwnedTermDefinition()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_OwnedTermDefinition();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Term#getExternalTermDefinition <em>External Term Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>External Term Definition</em>'.
	 * @see QWiki.Term#getExternalTermDefinition()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_ExternalTermDefinition();

	/**
	 * Returns the meta object for class '{@link QWiki.TermDefinition <em>Term Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Definition</em>'.
	 * @see QWiki.TermDefinition
	 * @generated
	 */
	EClass getTermDefinition();

	/**
	 * Returns the meta object for the container reference '{@link QWiki.TermDefinition#getOwningTerm <em>Owning Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Term</em>'.
	 * @see QWiki.TermDefinition#getOwningTerm()
	 * @see #getTermDefinition()
	 * @generated
	 */
	EReference getTermDefinition_OwningTerm();

	/**
	 * Returns the meta object for class '{@link QWiki.Standard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Standard</em>'.
	 * @see QWiki.Standard
	 * @generated
	 */
	EClass getStandard();

	/**
	 * Returns the meta object for the '{@link QWiki.Standard#sdo() <em>Sdo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sdo</em>' operation.
	 * @see QWiki.Standard#sdo()
	 * @generated
	 */
	EOperation getStandard__Sdo();

	/**
	 * Returns the meta object for class '{@link QWiki.BasePractise <em>Base Practise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Practise</em>'.
	 * @see QWiki.BasePractise
	 * @generated
	 */
	EClass getBasePractise();

	/**
	 * Returns the meta object for the container reference '{@link QWiki.BasePractise#getOwningProcess <em>Owning Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Process</em>'.
	 * @see QWiki.BasePractise#getOwningProcess()
	 * @see #getBasePractise()
	 * @generated
	 */
	EReference getBasePractise_OwningProcess();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.BasePractise#getFacilitatedOutcome <em>Facilitated Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitated Outcome</em>'.
	 * @see QWiki.BasePractise#getFacilitatedOutcome()
	 * @see #getBasePractise()
	 * @generated
	 */
	EReference getBasePractise_FacilitatedOutcome();

	/**
	 * Returns the meta object for the reference '{@link QWiki.BasePractise#getFacilitatedWorkProduct <em>Facilitated Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facilitated Work Product</em>'.
	 * @see QWiki.BasePractise#getFacilitatedWorkProduct()
	 * @see #getBasePractise()
	 * @generated
	 */
	EReference getBasePractise_FacilitatedWorkProduct();

	/**
	 * Returns the meta object for class '{@link QWiki.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see QWiki.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the container reference '{@link QWiki.Process#getOwningProcessGroup <em>Owning Process Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Process Group</em>'.
	 * @see QWiki.Process#getOwningProcessGroup()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_OwningProcessGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.Process#getOwnedOutcome <em>Owned Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Outcome</em>'.
	 * @see QWiki.Process#getOwnedOutcome()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_OwnedOutcome();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Process#getFacilitatingWorkProduct <em>Facilitating Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitating Work Product</em>'.
	 * @see QWiki.Process#getFacilitatingWorkProduct()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_FacilitatingWorkProduct();

	/**
	 * Returns the meta object for the reference '{@link QWiki.Process#getFacilitatedWorkProduct <em>Facilitated Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facilitated Work Product</em>'.
	 * @see QWiki.Process#getFacilitatedWorkProduct()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_FacilitatedWorkProduct();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.Process#getOwnedBasePractise <em>Owned Base Practise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Base Practise</em>'.
	 * @see QWiki.Process#getOwnedBasePractise()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_OwnedBasePractise();

	/**
	 * Returns the meta object for class '{@link QWiki.ProcessGroup <em>Process Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Group</em>'.
	 * @see QWiki.ProcessGroup
	 * @generated
	 */
	EClass getProcessGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.ProcessGroup#getOnwedProcess <em>Onwed Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Onwed Process</em>'.
	 * @see QWiki.ProcessGroup#getOnwedProcess()
	 * @see #getProcessGroup()
	 * @generated
	 */
	EReference getProcessGroup_OnwedProcess();

	/**
	 * Returns the meta object for class '{@link QWiki.Outcome <em>Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outcome</em>'.
	 * @see QWiki.Outcome
	 * @generated
	 */
	EClass getOutcome();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Outcome#getFacilitatingBasePractise <em>Facilitating Base Practise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitating Base Practise</em>'.
	 * @see QWiki.Outcome#getFacilitatingBasePractise()
	 * @see #getOutcome()
	 * @generated
	 */
	EReference getOutcome_FacilitatingBasePractise();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Outcome#getRequiredWorkproduct <em>Required Workproduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Workproduct</em>'.
	 * @see QWiki.Outcome#getRequiredWorkproduct()
	 * @see #getOutcome()
	 * @generated
	 */
	EReference getOutcome_RequiredWorkproduct();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Outcome#getResultingWorkproduct <em>Resulting Workproduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resulting Workproduct</em>'.
	 * @see QWiki.Outcome#getResultingWorkproduct()
	 * @see #getOutcome()
	 * @generated
	 */
	EReference getOutcome_ResultingWorkproduct();

	/**
	 * Returns the meta object for the container reference '{@link QWiki.Outcome#getOwningProcess <em>Owning Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Process</em>'.
	 * @see QWiki.Outcome#getOwningProcess()
	 * @see #getOutcome()
	 * @generated
	 */
	EReference getOutcome_OwningProcess();

	/**
	 * Returns the meta object for class '{@link QWiki.WorkProduct <em>Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Product</em>'.
	 * @see QWiki.WorkProduct
	 * @generated
	 */
	EClass getWorkProduct();

	/**
	 * Returns the meta object for the container reference '{@link QWiki.WorkProduct#getOwningWorkingGroup <em>Owning Working Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Working Group</em>'.
	 * @see QWiki.WorkProduct#getOwningWorkingGroup()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_OwningWorkingGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.WorkProduct#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Characteristic</em>'.
	 * @see QWiki.WorkProduct#getCharacteristic()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_Characteristic();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.WorkProduct#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see QWiki.WorkProduct#getContent()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_Content();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.WorkProduct#getFacilitatingOutcome <em>Facilitating Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitating Outcome</em>'.
	 * @see QWiki.WorkProduct#getFacilitatingOutcome()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_FacilitatingOutcome();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.WorkProduct#getFacilitatedProcess <em>Facilitated Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitated Process</em>'.
	 * @see QWiki.WorkProduct#getFacilitatedProcess()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_FacilitatedProcess();

	/**
	 * Returns the meta object for the reference '{@link QWiki.WorkProduct#getFacilitatingProcess <em>Facilitating Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facilitating Process</em>'.
	 * @see QWiki.WorkProduct#getFacilitatingProcess()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_FacilitatingProcess();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.WorkProduct#getWorkProductType <em>Work Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Product Type</em>'.
	 * @see QWiki.WorkProduct#getWorkProductType()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EAttribute getWorkProduct_WorkProductType();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.WorkProduct#getFacilitatedOutcome <em>Facilitated Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitated Outcome</em>'.
	 * @see QWiki.WorkProduct#getFacilitatedOutcome()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_FacilitatedOutcome();

	/**
	 * Returns the meta object for class '{@link QWiki.GenericWorkProduct <em>Generic Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Work Product</em>'.
	 * @see QWiki.GenericWorkProduct
	 * @generated
	 */
	EClass getGenericWorkProduct();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.GenericWorkProduct#getOwnedWorkProduct <em>Owned Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Work Product</em>'.
	 * @see QWiki.GenericWorkProduct#getOwnedWorkProduct()
	 * @see #getGenericWorkProduct()
	 * @generated
	 */
	EReference getGenericWorkProduct_OwnedWorkProduct();

	/**
	 * Returns the meta object for enum '{@link QWiki.AuthorType <em>Author Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Author Type</em>'.
	 * @see QWiki.AuthorType
	 * @generated
	 */
	EEnum getAuthorType();

	/**
	 * Returns the meta object for enum '{@link QWiki.DocumentVersionType <em>Document Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Version Type</em>'.
	 * @see QWiki.DocumentVersionType
	 * @generated
	 */
	EEnum getDocumentVersionType();

	/**
	 * Returns the meta object for enum '{@link QWiki.ProcessReferenceModelDomain <em>Process Reference Model Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Process Reference Model Domain</em>'.
	 * @see QWiki.ProcessReferenceModelDomain
	 * @generated
	 */
	EEnum getProcessReferenceModelDomain();

	/**
	 * Returns the meta object for enum '{@link QWiki.SuperseedingType <em>Superseeding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Superseeding Type</em>'.
	 * @see QWiki.SuperseedingType
	 * @generated
	 */
	EEnum getSuperseedingType();

	/**
	 * Returns the meta object for enum '{@link QWiki.DocumentType <em>Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Type</em>'.
	 * @see QWiki.DocumentType
	 * @generated
	 */
	EEnum getDocumentType();

	/**
	 * Returns the meta object for enum '{@link QWiki.WorkProductType <em>Work Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Work Product Type</em>'.
	 * @see QWiki.WorkProductType
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
	QWikiFactory getQWikiFactory();

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
		 * The meta object literal for the '{@link QWiki.impl.AuthorImpl <em>Author</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.AuthorImpl
		 * @see QWiki.impl.QWikiPackageImpl#getAuthor()
		 * @generated
		 */
		EClass AUTHOR = eINSTANCE.getAuthor();

		/**
		 * The meta object literal for the '<em><b>Author Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__AUTHOR_TYPE = eINSTANCE.getAuthor_AuthorType();

		/**
		 * The meta object literal for the '<em><b>Authored Document</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTHOR___AUTHORED_DOCUMENT = eINSTANCE.getAuthor__AuthoredDocument();

		/**
		 * The meta object literal for the '<em><b>Authored Standard</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTHOR___AUTHORED_STANDARD = eINSTANCE.getAuthor__AuthoredStandard();

		/**
		 * The meta object literal for the '{@link QWiki.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.NamedElementImpl
		 * @see QWiki.impl.QWikiPackageImpl#getNamedElement()
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
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__QUALIFIED_NAME = eINSTANCE.getNamedElement_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Assigned Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__ASSIGNED_DOMAIN = eINSTANCE.getNamedElement_AssignedDomain();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__DOMAIN = eINSTANCE.getNamedElement_Domain();

		/**
		 * The meta object literal for the '{@link QWiki.impl.TaggedElementImpl <em>Tagged Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.TaggedElementImpl
		 * @see QWiki.impl.QWikiPackageImpl#getTaggedElement()
		 * @generated
		 */
		EClass TAGGED_ELEMENT = eINSTANCE.getTaggedElement();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_ELEMENT__TAG = eINSTANCE.getTaggedElement_Tag();

		/**
		 * The meta object literal for the '<em><b>Custom Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAGGED_ELEMENT__CUSTOM_PROPERTY = eINSTANCE.getTaggedElement_CustomProperty();

		/**
		 * The meta object literal for the '{@link QWiki.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.ElementImpl
		 * @see QWiki.impl.QWikiPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Owned Comment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__OWNED_COMMENT = eINSTANCE.getElement_OwnedComment();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__OWNED_ELEMENT = eINSTANCE.getElement_OwnedElement();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__OWNER = eINSTANCE.getElement_Owner();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__UUID = eINSTANCE.getElement_Uuid();

		/**
		 * The meta object literal for the '<em><b>Oid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__OID = eINSTANCE.getElement_Oid();

		/**
		 * The meta object literal for the '<em><b>All Owned Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___ALL_OWNED_ELEMENTS = eINSTANCE.getElement__AllOwnedElements();

		/**
		 * The meta object literal for the '<em><b>Must Be Owned</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___MUST_BE_OWNED = eINSTANCE.getElement__MustBeOwned();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENT___MODEL = eINSTANCE.getElement__Model();

		/**
		 * The meta object literal for the '{@link QWiki.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.CommentImpl
		 * @see QWiki.impl.QWikiPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__BODY = eINSTANCE.getComment_Body();

		/**
		 * The meta object literal for the '<em><b>Owning Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENT__OWNING_ELEMENT = eINSTANCE.getComment_OwningElement();

		/**
		 * The meta object literal for the '{@link QWiki.impl.I18nStringImpl <em>I1 8n String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.I18nStringImpl
		 * @see QWiki.impl.QWikiPackageImpl#getI18nString()
		 * @generated
		 */
		EClass I1_8N_STRING = eINSTANCE.getI18nString();

		/**
		 * The meta object literal for the '{@link QWiki.impl.I18nBaseStringImpl <em>I1 8n Base String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.I18nBaseStringImpl
		 * @see QWiki.impl.QWikiPackageImpl#getI18nBaseString()
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
		 * The meta object literal for the '{@link QWiki.impl.I18nValueImpl <em>I1 8n Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.I18nValueImpl
		 * @see QWiki.impl.QWikiPackageImpl#getI18nValue()
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
		 * The meta object literal for the '{@link QWiki.impl.DirectedRelationshipImpl <em>Directed Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.DirectedRelationshipImpl
		 * @see QWiki.impl.QWikiPackageImpl#getDirectedRelationship()
		 * @generated
		 */
		EClass DIRECTED_RELATIONSHIP = eINSTANCE.getDirectedRelationship();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_RELATIONSHIP__TARGET = eINSTANCE.getDirectedRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTED_RELATIONSHIP__SOURCE = eINSTANCE.getDirectedRelationship_Source();

		/**
		 * The meta object literal for the '{@link QWiki.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.RelationshipImpl
		 * @see QWiki.impl.QWikiPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Related Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__RELATED_ELEMENT = eINSTANCE.getRelationship_RelatedElement();

		/**
		 * The meta object literal for the '{@link QWiki.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.AssociationImpl
		 * @see QWiki.impl.QWikiPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>End Relationship Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__END_RELATIONSHIP_TYPE = eINSTANCE.getAssociation_EndRelationshipType();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__END = eINSTANCE.getAssociation_End();

		/**
		 * The meta object literal for the '{@link QWiki.impl.RelationshipTypeImpl <em>Relationship Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.RelationshipTypeImpl
		 * @see QWiki.impl.QWikiPackageImpl#getRelationshipType()
		 * @generated
		 */
		EClass RELATIONSHIP_TYPE = eINSTANCE.getRelationshipType();

		/**
		 * The meta object literal for the '<em><b>Typed Association</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_TYPE__TYPED_ASSOCIATION = eINSTANCE.getRelationshipType_TypedAssociation();

		/**
		 * The meta object literal for the '{@link QWiki.impl.I18nNamedElementImpl <em>I1 8n Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.I18nNamedElementImpl
		 * @see QWiki.impl.QWikiPackageImpl#getI18nNamedElement()
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

		/**
		 * The meta object literal for the '{@link QWiki.impl.I18nKeyedStringImpl <em>I1 8n Keyed String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.I18nKeyedStringImpl
		 * @see QWiki.impl.QWikiPackageImpl#getI18nKeyedString()
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
		 * The meta object literal for the '{@link QWiki.impl.QWikiModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.QWikiModelImpl
		 * @see QWiki.impl.QWikiPackageImpl#getQWikiModel()
		 * @generated
		 */
		EClass QWIKI_MODEL = eINSTANCE.getQWikiModel();

		/**
		 * The meta object literal for the '{@link QWiki.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.DomainImpl
		 * @see QWiki.impl.QWikiPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Domain Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__DOMAIN_ELEMENT = eINSTANCE.getDomain_DomainElement();

		/**
		 * The meta object literal for the '<em><b>All Domain Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOMAIN___ALL_DOMAIN_ELEMENT = eINSTANCE.getDomain__AllDomainElement();

		/**
		 * The meta object literal for the '{@link QWiki.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.DocumentImpl
		 * @see QWiki.impl.QWikiPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__NUMBER = eINSTANCE.getDocument_Number();

		/**
		 * The meta object literal for the '<em><b>Owned Version</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__OWNED_VERSION = eINSTANCE.getDocument_OwnedVersion();

		/**
		 * The meta object literal for the '<em><b>Superseeding Relationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__SUPERSEEDING_RELATIONSHIP = eINSTANCE.getDocument_SuperseedingRelationship();

		/**
		 * The meta object literal for the '<em><b>Document Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__DOCUMENT_TYPE = eINSTANCE.getDocument_DocumentType();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT__AUTHOR = eINSTANCE.getDocument_Author();

		/**
		 * The meta object literal for the '{@link QWiki.impl.I18nDescriptiveElementImpl <em>I1 8n Descriptive Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.I18nDescriptiveElementImpl
		 * @see QWiki.impl.QWikiPackageImpl#getI18nDescriptiveElement()
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
		 * The meta object literal for the '{@link QWiki.impl.DocumentVersionImpl <em>Document Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.DocumentVersionImpl
		 * @see QWiki.impl.QWikiPackageImpl#getDocumentVersion()
		 * @generated
		 */
		EClass DOCUMENT_VERSION = eINSTANCE.getDocumentVersion();

		/**
		 * The meta object literal for the '<em><b>Publication Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_VERSION__PUBLICATION_YEAR = eINSTANCE.getDocumentVersion_PublicationYear();

		/**
		 * The meta object literal for the '<em><b>Document Version Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_VERSION__DOCUMENT_VERSION_TYPE = eINSTANCE.getDocumentVersion_DocumentVersionType();

		/**
		 * The meta object literal for the '<em><b>Edition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_VERSION__EDITION = eINSTANCE.getDocumentVersion_Edition();

		/**
		 * The meta object literal for the '<em><b>Owned Section</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_VERSION__OWNED_SECTION = eINSTANCE.getDocumentVersion_OwnedSection();

		/**
		 * The meta object literal for the '<em><b>Superseeding Relationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_VERSION__SUPERSEEDING_RELATIONSHIP = eINSTANCE.getDocumentVersion_SuperseedingRelationship();

		/**
		 * The meta object literal for the '<em><b>Qualified Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_VERSION__QUALIFIED_NUMBER = eINSTANCE.getDocumentVersion_QualifiedNumber();

		/**
		 * The meta object literal for the '<em><b>Owning Document</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_VERSION__OWNING_DOCUMENT = eINSTANCE.getDocumentVersion_OwningDocument();

		/**
		 * The meta object literal for the '{@link QWiki.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.SectionImpl
		 * @see QWiki.impl.QWikiPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Owned Section</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__OWNED_SECTION = eINSTANCE.getSection_OwnedSection();

		/**
		 * The meta object literal for the '<em><b>Owning Section</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__OWNING_SECTION = eINSTANCE.getSection_OwningSection();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__NUMBER = eINSTANCE.getSection_Number();

		/**
		 * The meta object literal for the '<em><b>Facilitating Spice Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__FACILITATING_SPICE_ELEMENT = eINSTANCE.getSection_FacilitatingSpiceElement();

		/**
		 * The meta object literal for the '<em><b>Facilitating Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__FACILITATING_ELEMENT = eINSTANCE.getSection_FacilitatingElement();

		/**
		 * The meta object literal for the '<em><b>Superseeding Relationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__SUPERSEEDING_RELATIONSHIP = eINSTANCE.getSection_SuperseedingRelationship();

		/**
		 * The meta object literal for the '<em><b>Qualified Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__QUALIFIED_NUMBER = eINSTANCE.getSection_QualifiedNumber();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__TERM = eINSTANCE.getSection_Term();

		/**
		 * The meta object literal for the '<em><b>Owning Document</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__OWNING_DOCUMENT = eINSTANCE.getSection_OwningDocument();

		/**
		 * The meta object literal for the '{@link QWiki.impl.SpiceElementImpl <em>Spice Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.SpiceElementImpl
		 * @see QWiki.impl.QWikiPackageImpl#getSpiceElement()
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
		 * The meta object literal for the '<em><b>Owning Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPICE_ELEMENT__OWNING_ROLE = eINSTANCE.getSpiceElement_OwningRole();

		/**
		 * The meta object literal for the '<em><b>Managing Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPICE_ELEMENT__MANAGING_ROLE = eINSTANCE.getSpiceElement_ManagingRole();

		/**
		 * The meta object literal for the '<em><b>Participating Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPICE_ELEMENT__PARTICIPATING_ROLE = eINSTANCE.getSpiceElement_ParticipatingRole();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPICE_ELEMENT__ROLE = eINSTANCE.getSpiceElement_Role();

		/**
		 * The meta object literal for the '<em><b>Facilitated Section</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPICE_ELEMENT__FACILITATED_SECTION = eINSTANCE.getSpiceElement_FacilitatedSection();

		/**
		 * The meta object literal for the '{@link QWiki.impl.RasciElementImpl <em>Rasci Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.RasciElementImpl
		 * @see QWiki.impl.QWikiPackageImpl#getRasciElement()
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
		 * The meta object literal for the '<em><b>Supporting Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RASCI_ELEMENT__SUPPORTING_ROLE = eINSTANCE.getRasciElement_SupportingRole();

		/**
		 * The meta object literal for the '<em><b>Consulting Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RASCI_ELEMENT__CONSULTING_ROLE = eINSTANCE.getRasciElement_ConsultingRole();

		/**
		 * The meta object literal for the '<em><b>Informed Role</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RASCI_ELEMENT__INFORMED_ROLE = eINSTANCE.getRasciElement_InformedRole();

		/**
		 * The meta object literal for the '{@link QWiki.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.RoleImpl
		 * @see QWiki.impl.QWikiPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__SKILLS = eINSTANCE.getRole_Skills();

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
		 * The meta object literal for the '<em><b>Responsible Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE__RESPONSIBLE_ELEMENT = eINSTANCE.getRole_ResponsibleElement();

		/**
		 * The meta object literal for the '{@link QWiki.impl.ProcessReferenceModelImpl <em>Process Reference Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.ProcessReferenceModelImpl
		 * @see QWiki.impl.QWikiPackageImpl#getProcessReferenceModel()
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
		 * The meta object literal for the '{@link QWiki.impl.SuperseedingRelationshipImpl <em>Superseeding Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.SuperseedingRelationshipImpl
		 * @see QWiki.impl.QWikiPackageImpl#getSuperseedingRelationship()
		 * @generated
		 */
		EClass SUPERSEEDING_RELATIONSHIP = eINSTANCE.getSuperseedingRelationship();

		/**
		 * The meta object literal for the '<em><b>Superseeding Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPERSEEDING_RELATIONSHIP__SUPERSEEDING_TYPE = eINSTANCE.getSuperseedingRelationship_SuperseedingType();

		/**
		 * The meta object literal for the '{@link QWiki.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.TermImpl
		 * @see QWiki.impl.QWikiPackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '<em><b>Acronym</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__ACRONYM = eINSTANCE.getTerm_Acronym();

		/**
		 * The meta object literal for the '<em><b>Synonym</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__SYNONYM = eINSTANCE.getTerm_Synonym();

		/**
		 * The meta object literal for the '<em><b>Term Definition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__TERM_DEFINITION = eINSTANCE.getTerm_TermDefinition();

		/**
		 * The meta object literal for the '<em><b>Owned Term Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__OWNED_TERM_DEFINITION = eINSTANCE.getTerm_OwnedTermDefinition();

		/**
		 * The meta object literal for the '<em><b>External Term Definition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__EXTERNAL_TERM_DEFINITION = eINSTANCE.getTerm_ExternalTermDefinition();

		/**
		 * The meta object literal for the '{@link QWiki.impl.TermDefinitionImpl <em>Term Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.TermDefinitionImpl
		 * @see QWiki.impl.QWikiPackageImpl#getTermDefinition()
		 * @generated
		 */
		EClass TERM_DEFINITION = eINSTANCE.getTermDefinition();

		/**
		 * The meta object literal for the '<em><b>Owning Term</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM_DEFINITION__OWNING_TERM = eINSTANCE.getTermDefinition_OwningTerm();

		/**
		 * The meta object literal for the '{@link QWiki.impl.StandardImpl <em>Standard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.StandardImpl
		 * @see QWiki.impl.QWikiPackageImpl#getStandard()
		 * @generated
		 */
		EClass STANDARD = eINSTANCE.getStandard();

		/**
		 * The meta object literal for the '<em><b>Sdo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STANDARD___SDO = eINSTANCE.getStandard__Sdo();

		/**
		 * The meta object literal for the '{@link QWiki.impl.BasePractiseImpl <em>Base Practise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.BasePractiseImpl
		 * @see QWiki.impl.QWikiPackageImpl#getBasePractise()
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
		 * The meta object literal for the '<em><b>Facilitated Work Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASE_PRACTISE__FACILITATED_WORK_PRODUCT = eINSTANCE.getBasePractise_FacilitatedWorkProduct();

		/**
		 * The meta object literal for the '{@link QWiki.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.ProcessImpl
		 * @see QWiki.impl.QWikiPackageImpl#getProcess()
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
		 * The meta object literal for the '<em><b>Facilitated Work Product</b></em>' reference feature.
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
		 * The meta object literal for the '{@link QWiki.impl.ProcessGroupImpl <em>Process Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.ProcessGroupImpl
		 * @see QWiki.impl.QWikiPackageImpl#getProcessGroup()
		 * @generated
		 */
		EClass PROCESS_GROUP = eINSTANCE.getProcessGroup();

		/**
		 * The meta object literal for the '<em><b>Onwed Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_GROUP__ONWED_PROCESS = eINSTANCE.getProcessGroup_OnwedProcess();

		/**
		 * The meta object literal for the '{@link QWiki.impl.OutcomeImpl <em>Outcome</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.OutcomeImpl
		 * @see QWiki.impl.QWikiPackageImpl#getOutcome()
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
		 * The meta object literal for the '{@link QWiki.impl.WorkProductImpl <em>Work Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.WorkProductImpl
		 * @see QWiki.impl.QWikiPackageImpl#getWorkProduct()
		 * @generated
		 */
		EClass WORK_PRODUCT = eINSTANCE.getWorkProduct();

		/**
		 * The meta object literal for the '<em><b>Owning Working Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT__OWNING_WORKING_GROUP = eINSTANCE.getWorkProduct_OwningWorkingGroup();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT__CHARACTERISTIC = eINSTANCE.getWorkProduct_Characteristic();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT__CONTENT = eINSTANCE.getWorkProduct_Content();

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
		 * The meta object literal for the '<em><b>Facilitating Process</b></em>' reference feature.
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
		 * The meta object literal for the '<em><b>Facilitated Outcome</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT__FACILITATED_OUTCOME = eINSTANCE.getWorkProduct_FacilitatedOutcome();

		/**
		 * The meta object literal for the '{@link QWiki.impl.GenericWorkProductImpl <em>Generic Work Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.GenericWorkProductImpl
		 * @see QWiki.impl.QWikiPackageImpl#getGenericWorkProduct()
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
		 * The meta object literal for the '{@link QWiki.AuthorType <em>Author Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.AuthorType
		 * @see QWiki.impl.QWikiPackageImpl#getAuthorType()
		 * @generated
		 */
		EEnum AUTHOR_TYPE = eINSTANCE.getAuthorType();

		/**
		 * The meta object literal for the '{@link QWiki.DocumentVersionType <em>Document Version Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.DocumentVersionType
		 * @see QWiki.impl.QWikiPackageImpl#getDocumentVersionType()
		 * @generated
		 */
		EEnum DOCUMENT_VERSION_TYPE = eINSTANCE.getDocumentVersionType();

		/**
		 * The meta object literal for the '{@link QWiki.ProcessReferenceModelDomain <em>Process Reference Model Domain</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.ProcessReferenceModelDomain
		 * @see QWiki.impl.QWikiPackageImpl#getProcessReferenceModelDomain()
		 * @generated
		 */
		EEnum PROCESS_REFERENCE_MODEL_DOMAIN = eINSTANCE.getProcessReferenceModelDomain();

		/**
		 * The meta object literal for the '{@link QWiki.SuperseedingType <em>Superseeding Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.SuperseedingType
		 * @see QWiki.impl.QWikiPackageImpl#getSuperseedingType()
		 * @generated
		 */
		EEnum SUPERSEEDING_TYPE = eINSTANCE.getSuperseedingType();

		/**
		 * The meta object literal for the '{@link QWiki.DocumentType <em>Document Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.DocumentType
		 * @see QWiki.impl.QWikiPackageImpl#getDocumentType()
		 * @generated
		 */
		EEnum DOCUMENT_TYPE = eINSTANCE.getDocumentType();

		/**
		 * The meta object literal for the '{@link QWiki.WorkProductType <em>Work Product Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.WorkProductType
		 * @see QWiki.impl.QWikiPackageImpl#getWorkProductType()
		 * @generated
		 */
		EEnum WORK_PRODUCT_TYPE = eINSTANCE.getWorkProductType();

	}

} //QWikiPackage
