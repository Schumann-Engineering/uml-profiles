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
	 * The meta object id for the '{@link QWiki.impl.UmlElementImpl <em>Uml Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.UmlElementImpl
	 * @see QWiki.impl.QWikiPackageImpl#getUmlElement()
	 * @generated
	 */
	int UML_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT__OWNED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT__OWNER = 1;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT__OWNED_COMMENT = 2;

	/**
	 * The number of structural features of the '<em>Uml Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT___ALL_OWNED_ELEMENTS = 0;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT___MUST_BE_OWNED = 1;

	/**
	 * The number of operations of the '<em>Uml Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link QWiki.impl.TaggedElementImpl <em>Tagged Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.TaggedElementImpl
	 * @see QWiki.impl.QWikiPackageImpl#getTaggedElement()
	 * @generated
	 */
	int TAGGED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_ELEMENT__OWNED_ELEMENT = UML_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_ELEMENT__OWNER = UML_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_ELEMENT__OWNED_COMMENT = UML_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_ELEMENT__TAG = UML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_ELEMENT__CUSTOM_PROPERTY = UML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tagged Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_ELEMENT_FEATURE_COUNT = UML_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_ELEMENT___ALL_OWNED_ELEMENTS = UML_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_ELEMENT___MUST_BE_OWNED = UML_ELEMENT___MUST_BE_OWNED;

	/**
	 * The number of operations of the '<em>Tagged Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_ELEMENT_OPERATION_COUNT = UML_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.ModelElementImpl
	 * @see QWiki.impl.QWikiPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__OWNED_ELEMENT = TAGGED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__OWNER = TAGGED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__OWNED_COMMENT = TAGGED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__TAG = TAGGED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__CUSTOM_PROPERTY = TAGGED_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__UUID = TAGGED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__MODEL = TAGGED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = TAGGED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT___ALL_OWNED_ELEMENTS = TAGGED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT___MUST_BE_OWNED = TAGGED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT___MODEL = TAGGED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT___OID = TAGGED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = TAGGED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link QWiki.impl.UmlNamedElementImpl <em>Uml Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.UmlNamedElementImpl
	 * @see QWiki.impl.QWikiPackageImpl#getUmlNamedElement()
	 * @generated
	 */
	int UML_NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT__OWNED_ELEMENT = MODEL_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT__OWNER = MODEL_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT__OWNED_COMMENT = MODEL_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT__TAG = MODEL_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT__CUSTOM_PROPERTY = MODEL_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT__UUID = MODEL_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT__MODEL = MODEL_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT__NAMESPACE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT__NAME = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT__QUALIFIED_NAME = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Uml Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT___ALL_OWNED_ELEMENTS = MODEL_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT___MUST_BE_OWNED = MODEL_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT___MODEL = MODEL_ELEMENT___MODEL;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT___OID = MODEL_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT___ALL_NAMESPACES = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT___SEPARATOR = MODEL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT___QUALIFIED_NAME = MODEL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Uml Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 3;

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
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__OWNED_ELEMENT = UML_NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__OWNER = UML_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__OWNED_COMMENT = UML_NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__TAG = UML_NAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__CUSTOM_PROPERTY = UML_NAMED_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__UUID = UML_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__MODEL = UML_NAMED_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__NAMESPACE = UML_NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__NAME = UML_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__QUALIFIED_NAME = UML_NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Author Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__AUTHOR_TYPE = UML_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abbreviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__ABBREVIATION = UML_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_FEATURE_COUNT = UML_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR___ALL_OWNED_ELEMENTS = UML_NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR___MUST_BE_OWNED = UML_NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR___MODEL = UML_NAMED_ELEMENT___MODEL;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR___OID = UML_NAMED_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR___ALL_NAMESPACES = UML_NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR___SEPARATOR = UML_NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR___QUALIFIED_NAME = UML_NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Authored Document</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR___AUTHORED_DOCUMENT = UML_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Authored Standard</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR___AUTHORED_STANDARD = UML_NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_OPERATION_COUNT = UML_NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link QWiki.impl.UmlCommentImpl <em>Uml Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.UmlCommentImpl
	 * @see QWiki.impl.QWikiPackageImpl#getUmlComment()
	 * @generated
	 */
	int UML_COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_COMMENT__OWNED_ELEMENT = UML_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_COMMENT__OWNER = UML_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_COMMENT__OWNED_COMMENT = UML_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_COMMENT__BODY = UML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotated Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_COMMENT__ANNOTATED_ELEMENT = UML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Uml Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_COMMENT_FEATURE_COUNT = UML_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_COMMENT___ALL_OWNED_ELEMENTS = UML_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_COMMENT___MUST_BE_OWNED = UML_ELEMENT___MUST_BE_OWNED;

	/**
	 * The number of operations of the '<em>Uml Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_COMMENT_OPERATION_COUNT = UML_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.I18nBaseStringImpl <em>I1 8n Base String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.I18nBaseStringImpl
	 * @see QWiki.impl.QWikiPackageImpl#getI18nBaseString()
	 * @generated
	 */
	int I1_8N_BASE_STRING = 7;

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
	 * The meta object id for the '{@link QWiki.impl.I18nKeyedStringImpl <em>I1 8n Keyed String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.I18nKeyedStringImpl
	 * @see QWiki.impl.QWikiPackageImpl#getI18nKeyedString()
	 * @generated
	 */
	int I1_8N_KEYED_STRING = 6;

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
	 * The meta object id for the '{@link QWiki.impl.I18nValueImpl <em>I1 8n Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.I18nValueImpl
	 * @see QWiki.impl.QWikiPackageImpl#getI18nValue()
	 * @generated
	 */
	int I1_8N_VALUE = 8;

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
	 * The meta object id for the '{@link QWiki.impl.UmlNamespaceImpl <em>Uml Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.UmlNamespaceImpl
	 * @see QWiki.impl.QWikiPackageImpl#getUmlNamespace()
	 * @generated
	 */
	int UML_NAMESPACE = 12;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__OWNED_ELEMENT = UML_NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__OWNER = UML_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__OWNED_COMMENT = UML_NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__TAG = UML_NAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__CUSTOM_PROPERTY = UML_NAMED_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__UUID = UML_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__MODEL = UML_NAMED_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__NAMESPACE = UML_NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__NAME = UML_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__QUALIFIED_NAME = UML_NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__IMPORTED_MEMBER = UML_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__OWNED_MEMBER = UML_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__MEMBER = UML_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Uml Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE_FEATURE_COUNT = UML_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE___ALL_OWNED_ELEMENTS = UML_NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE___MUST_BE_OWNED = UML_NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE___MODEL = UML_NAMED_ELEMENT___MODEL;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE___OID = UML_NAMED_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE___ALL_NAMESPACES = UML_NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE___SEPARATOR = UML_NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE___QUALIFIED_NAME = UML_NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Uml Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE_OPERATION_COUNT = UML_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.UmlPackageImpl <em>Uml Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.UmlPackageImpl
	 * @see QWiki.impl.QWikiPackageImpl#getUmlPackage()
	 * @generated
	 */
	int UML_PACKAGE = 10;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE__OWNED_ELEMENT = UML_NAMESPACE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE__OWNER = UML_NAMESPACE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE__OWNED_COMMENT = UML_NAMESPACE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE__TAG = UML_NAMESPACE__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE__CUSTOM_PROPERTY = UML_NAMESPACE__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE__UUID = UML_NAMESPACE__UUID;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE__MODEL = UML_NAMESPACE__MODEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE__NAMESPACE = UML_NAMESPACE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE__NAME = UML_NAMESPACE__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE__QUALIFIED_NAME = UML_NAMESPACE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE__IMPORTED_MEMBER = UML_NAMESPACE__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE__OWNED_MEMBER = UML_NAMESPACE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE__MEMBER = UML_NAMESPACE__MEMBER;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE__PACKAGED_ELEMENT = UML_NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE__NESTED_PACKAGE = UML_NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE__NESTING_PACKAGE = UML_NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Uml Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE_FEATURE_COUNT = UML_NAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE___ALL_OWNED_ELEMENTS = UML_NAMESPACE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE___MUST_BE_OWNED = UML_NAMESPACE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE___MODEL = UML_NAMESPACE___MODEL;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE___OID = UML_NAMESPACE___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE___ALL_NAMESPACES = UML_NAMESPACE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE___SEPARATOR = UML_NAMESPACE___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE___QUALIFIED_NAME = UML_NAMESPACE___QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Uml Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE_OPERATION_COUNT = UML_NAMESPACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.QWikiModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.QWikiModelImpl
	 * @see QWiki.impl.QWikiPackageImpl#getQWikiModel()
	 * @generated
	 */
	int QWIKI_MODEL = 9;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL__OWNED_ELEMENT = UML_PACKAGE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL__OWNER = UML_PACKAGE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL__OWNED_COMMENT = UML_PACKAGE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL__TAG = UML_PACKAGE__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL__CUSTOM_PROPERTY = UML_PACKAGE__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL__UUID = UML_PACKAGE__UUID;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL__MODEL = UML_PACKAGE__MODEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL__NAMESPACE = UML_PACKAGE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL__NAME = UML_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL__QUALIFIED_NAME = UML_PACKAGE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL__IMPORTED_MEMBER = UML_PACKAGE__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL__OWNED_MEMBER = UML_PACKAGE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL__MEMBER = UML_PACKAGE__MEMBER;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL__PACKAGED_ELEMENT = UML_PACKAGE__PACKAGED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL__NESTED_PACKAGE = UML_PACKAGE__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL__NESTING_PACKAGE = UML_PACKAGE__NESTING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Model Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL__OWNED_MODEL_ELEMENT = UML_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL_FEATURE_COUNT = UML_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL___ALL_OWNED_ELEMENTS = UML_PACKAGE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL___MUST_BE_OWNED = UML_PACKAGE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL___MODEL = UML_PACKAGE___MODEL;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL___OID = UML_PACKAGE___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL___ALL_NAMESPACES = UML_PACKAGE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL___SEPARATOR = UML_PACKAGE___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL___QUALIFIED_NAME = UML_PACKAGE___QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QWIKI_MODEL_OPERATION_COUNT = UML_PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.UmlPackageableElementImpl <em>Uml Packageable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.UmlPackageableElementImpl
	 * @see QWiki.impl.QWikiPackageImpl#getUmlPackageableElement()
	 * @generated
	 */
	int UML_PACKAGEABLE_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGEABLE_ELEMENT__OWNED_ELEMENT = UML_NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGEABLE_ELEMENT__OWNER = UML_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGEABLE_ELEMENT__OWNED_COMMENT = UML_NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGEABLE_ELEMENT__TAG = UML_NAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGEABLE_ELEMENT__CUSTOM_PROPERTY = UML_NAMED_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGEABLE_ELEMENT__UUID = UML_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGEABLE_ELEMENT__MODEL = UML_NAMED_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGEABLE_ELEMENT__NAMESPACE = UML_NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGEABLE_ELEMENT__NAME = UML_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGEABLE_ELEMENT__QUALIFIED_NAME = UML_NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The number of structural features of the '<em>Uml Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGEABLE_ELEMENT_FEATURE_COUNT = UML_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGEABLE_ELEMENT___ALL_OWNED_ELEMENTS = UML_NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGEABLE_ELEMENT___MUST_BE_OWNED = UML_NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGEABLE_ELEMENT___MODEL = UML_NAMED_ELEMENT___MODEL;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGEABLE_ELEMENT___OID = UML_NAMED_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGEABLE_ELEMENT___ALL_NAMESPACES = UML_NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGEABLE_ELEMENT___SEPARATOR = UML_NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGEABLE_ELEMENT___QUALIFIED_NAME = UML_NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Uml Packageable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGEABLE_ELEMENT_OPERATION_COUNT = UML_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.I18nNamedElementImpl <em>I1 8n Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.I18nNamedElementImpl
	 * @see QWiki.impl.QWikiPackageImpl#getI18nNamedElement()
	 * @generated
	 */
	int I1_8N_NAMED_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__OWNED_ELEMENT = UML_NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__OWNER = UML_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__OWNED_COMMENT = UML_NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__TAG = UML_NAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__CUSTOM_PROPERTY = UML_NAMED_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__UUID = UML_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__MODEL = UML_NAMED_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__NAMESPACE = UML_NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__NAME = UML_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__QUALIFIED_NAME = UML_NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT__DISPLAY_NAME = UML_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>I1 8n Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT_FEATURE_COUNT = UML_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT___ALL_OWNED_ELEMENTS = UML_NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT___MUST_BE_OWNED = UML_NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT___MODEL = UML_NAMED_ELEMENT___MODEL;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT___OID = UML_NAMED_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT___ALL_NAMESPACES = UML_NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT___SEPARATOR = UML_NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT___QUALIFIED_NAME = UML_NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>I1 8n Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_NAMED_ELEMENT_OPERATION_COUNT = UML_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.I18nDescriptiveElementImpl <em>I1 8n Descriptive Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.I18nDescriptiveElementImpl
	 * @see QWiki.impl.QWikiPackageImpl#getI18nDescriptiveElement()
	 * @generated
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT = 14;

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
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT__UUID = I1_8N_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int I1_8N_DESCRIPTIVE_ELEMENT__MODEL = I1_8N_NAMED_ELEMENT__MODEL;

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
	 * The meta object id for the '{@link QWiki.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.DocumentImpl
	 * @see QWiki.impl.QWikiPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 13;

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
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__OWNED_COMMENT = I1_8N_DESCRIPTIVE_ELEMENT__OWNED_COMMENT;

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
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__UUID = I1_8N_DESCRIPTIVE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__MODEL = I1_8N_DESCRIPTIVE_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAMESPACE = I1_8N_DESCRIPTIVE_ELEMENT__NAMESPACE;

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
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___OID = I1_8N_DESCRIPTIVE_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___ALL_NAMESPACES = I1_8N_DESCRIPTIVE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___SEPARATOR = I1_8N_DESCRIPTIVE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___QUALIFIED_NAME = I1_8N_DESCRIPTIVE_ELEMENT___QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = I1_8N_DESCRIPTIVE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.I18nStringImpl <em>I1 8n String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.I18nStringImpl
	 * @see QWiki.impl.QWikiPackageImpl#getI18nString()
	 * @generated
	 */
	int I1_8N_STRING = 16;

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
	 * The meta object id for the '{@link QWiki.impl.DocumentVersionImpl <em>Document Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.DocumentVersionImpl
	 * @see QWiki.impl.QWikiPackageImpl#getDocumentVersion()
	 * @generated
	 */
	int DOCUMENT_VERSION = 17;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__OWNED_ELEMENT = MODEL_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__OWNER = MODEL_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__OWNED_COMMENT = MODEL_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__TAG = MODEL_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__CUSTOM_PROPERTY = MODEL_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__UUID = MODEL_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__MODEL = MODEL_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Publication Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__PUBLICATION_YEAR = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document Version Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__DOCUMENT_VERSION_TYPE = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Edition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__EDITION = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__OWNED_SECTION = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__SUPERSEEDING_RELATIONSHIP = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owning Document</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__OWNING_DOCUMENT = MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Document Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION___ALL_OWNED_ELEMENTS = MODEL_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION___MUST_BE_OWNED = MODEL_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION___MODEL = MODEL_ELEMENT___MODEL;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION___OID = MODEL_ELEMENT___OID;

	/**
	 * The number of operations of the '<em>Document Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION_OPERATION_COUNT = MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.SectionImpl
	 * @see QWiki.impl.QWikiPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 18;

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
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__OWNED_COMMENT = I1_8N_DESCRIPTIVE_ELEMENT__OWNED_COMMENT;

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
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__UUID = I1_8N_DESCRIPTIVE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__MODEL = I1_8N_DESCRIPTIVE_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NAMESPACE = I1_8N_DESCRIPTIVE_ELEMENT__NAMESPACE;

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
	 * The feature id for the '<em><b>Term</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TERM = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Owning Document</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__OWNING_DOCUMENT = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 8;

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
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION___OID = I1_8N_DESCRIPTIVE_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION___ALL_NAMESPACES = I1_8N_DESCRIPTIVE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION___SEPARATOR = I1_8N_DESCRIPTIVE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION___QUALIFIED_NAME = I1_8N_DESCRIPTIVE_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Document Version</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION___DOCUMENT_VERSION = I1_8N_DESCRIPTIVE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Qualified Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION___QUALIFIED_NUMBER = I1_8N_DESCRIPTIVE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = I1_8N_DESCRIPTIVE_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link QWiki.impl.RasciElementImpl <em>Rasci Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.RasciElementImpl
	 * @see QWiki.impl.QWikiPackageImpl#getRasciElement()
	 * @generated
	 */
	int RASCI_ELEMENT = 20;

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
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__OWNED_COMMENT = I1_8N_DESCRIPTIVE_ELEMENT__OWNED_COMMENT;

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
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__UUID = I1_8N_DESCRIPTIVE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__MODEL = I1_8N_DESCRIPTIVE_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT__NAMESPACE = I1_8N_DESCRIPTIVE_ELEMENT__NAMESPACE;

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
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___OID = I1_8N_DESCRIPTIVE_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___ALL_NAMESPACES = I1_8N_DESCRIPTIVE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___SEPARATOR = I1_8N_DESCRIPTIVE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RASCI_ELEMENT___QUALIFIED_NAME = I1_8N_DESCRIPTIVE_ELEMENT___QUALIFIED_NAME;

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
	int SPICE_ELEMENT = 19;

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
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__OWNED_COMMENT = RASCI_ELEMENT__OWNED_COMMENT;

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
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__UUID = RASCI_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__MODEL = RASCI_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__NAMESPACE = RASCI_ELEMENT__NAMESPACE;

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
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___OID = RASCI_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___ALL_NAMESPACES = RASCI_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___SEPARATOR = RASCI_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___QUALIFIED_NAME = RASCI_ELEMENT___QUALIFIED_NAME;

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
	int ROLE = 21;

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
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__OWNED_COMMENT = I1_8N_DESCRIPTIVE_ELEMENT__OWNED_COMMENT;

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
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__UUID = I1_8N_DESCRIPTIVE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__MODEL = I1_8N_DESCRIPTIVE_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAMESPACE = I1_8N_DESCRIPTIVE_ELEMENT__NAMESPACE;

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
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___OID = I1_8N_DESCRIPTIVE_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___ALL_NAMESPACES = I1_8N_DESCRIPTIVE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___SEPARATOR = I1_8N_DESCRIPTIVE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE___QUALIFIED_NAME = I1_8N_DESCRIPTIVE_ELEMENT___QUALIFIED_NAME;

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
	int PROCESS_REFERENCE_MODEL = 22;

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
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__OWNED_COMMENT = I1_8N_DESCRIPTIVE_ELEMENT__OWNED_COMMENT;

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
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__UUID = I1_8N_DESCRIPTIVE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__MODEL = I1_8N_DESCRIPTIVE_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__NAMESPACE = I1_8N_DESCRIPTIVE_ELEMENT__NAMESPACE;

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
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___OID = I1_8N_DESCRIPTIVE_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___ALL_NAMESPACES = I1_8N_DESCRIPTIVE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___SEPARATOR = I1_8N_DESCRIPTIVE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___QUALIFIED_NAME = I1_8N_DESCRIPTIVE_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Oid For Domain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___OID_FOR_DOMAIN = I1_8N_DESCRIPTIVE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Process Reference Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL_OPERATION_COUNT = I1_8N_DESCRIPTIVE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link QWiki.impl.UmlRelationshipImpl <em>Uml Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.UmlRelationshipImpl
	 * @see QWiki.impl.QWikiPackageImpl#getUmlRelationship()
	 * @generated
	 */
	int UML_RELATIONSHIP = 25;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_RELATIONSHIP__OWNED_ELEMENT = UML_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_RELATIONSHIP__OWNER = UML_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_RELATIONSHIP__OWNED_COMMENT = UML_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_RELATIONSHIP__RELATED_ELEMENT = UML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uml Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_RELATIONSHIP_FEATURE_COUNT = UML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_RELATIONSHIP___ALL_OWNED_ELEMENTS = UML_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_RELATIONSHIP___MUST_BE_OWNED = UML_ELEMENT___MUST_BE_OWNED;

	/**
	 * The number of operations of the '<em>Uml Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_RELATIONSHIP_OPERATION_COUNT = UML_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.UmlDirectedRelationshipImpl <em>Uml Directed Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.UmlDirectedRelationshipImpl
	 * @see QWiki.impl.QWikiPackageImpl#getUmlDirectedRelationship()
	 * @generated
	 */
	int UML_DIRECTED_RELATIONSHIP = 24;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIRECTED_RELATIONSHIP__OWNED_ELEMENT = UML_RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIRECTED_RELATIONSHIP__OWNER = UML_RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIRECTED_RELATIONSHIP__OWNED_COMMENT = UML_RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIRECTED_RELATIONSHIP__RELATED_ELEMENT = UML_RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIRECTED_RELATIONSHIP__SOURCE = UML_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIRECTED_RELATIONSHIP__TARGET = UML_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Uml Directed Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIRECTED_RELATIONSHIP_FEATURE_COUNT = UML_RELATIONSHIP_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIRECTED_RELATIONSHIP___ALL_OWNED_ELEMENTS = UML_RELATIONSHIP___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIRECTED_RELATIONSHIP___MUST_BE_OWNED = UML_RELATIONSHIP___MUST_BE_OWNED;

	/**
	 * The number of operations of the '<em>Uml Directed Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIRECTED_RELATIONSHIP_OPERATION_COUNT = UML_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.SuperseedingRelationshipImpl <em>Superseeding Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.SuperseedingRelationshipImpl
	 * @see QWiki.impl.QWikiPackageImpl#getSuperseedingRelationship()
	 * @generated
	 */
	int SUPERSEEDING_RELATIONSHIP = 23;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP__OWNED_ELEMENT = UML_DIRECTED_RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP__OWNER = UML_DIRECTED_RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP__OWNED_COMMENT = UML_DIRECTED_RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP__RELATED_ELEMENT = UML_DIRECTED_RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP__SOURCE = UML_DIRECTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP__TARGET = UML_DIRECTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Superseeding Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP__SUPERSEEDING_TYPE = UML_DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Superseeding Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP_FEATURE_COUNT = UML_DIRECTED_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP___ALL_OWNED_ELEMENTS = UML_DIRECTED_RELATIONSHIP___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP___MUST_BE_OWNED = UML_DIRECTED_RELATIONSHIP___MUST_BE_OWNED;

	/**
	 * The number of operations of the '<em>Superseeding Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP_OPERATION_COUNT = UML_DIRECTED_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.TermImpl
	 * @see QWiki.impl.QWikiPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 26;

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
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__OWNED_COMMENT = I1_8N_NAMED_ELEMENT__OWNED_COMMENT;

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
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__UUID = I1_8N_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__MODEL = I1_8N_NAMED_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__NAMESPACE = I1_8N_NAMED_ELEMENT__NAMESPACE;

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
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM___OID = I1_8N_NAMED_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM___ALL_NAMESPACES = I1_8N_NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM___SEPARATOR = I1_8N_NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM___QUALIFIED_NAME = I1_8N_NAMED_ELEMENT___QUALIFIED_NAME;

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
	int TERM_DEFINITION = 27;

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
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__OWNED_COMMENT = I1_8N_DESCRIPTIVE_ELEMENT__OWNED_COMMENT;

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
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__UUID = I1_8N_DESCRIPTIVE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__MODEL = I1_8N_DESCRIPTIVE_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION__NAMESPACE = I1_8N_DESCRIPTIVE_ELEMENT__NAMESPACE;

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
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION___OID = I1_8N_DESCRIPTIVE_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION___ALL_NAMESPACES = I1_8N_DESCRIPTIVE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION___SEPARATOR = I1_8N_DESCRIPTIVE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION___QUALIFIED_NAME = I1_8N_DESCRIPTIVE_ELEMENT___QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Term Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DEFINITION_OPERATION_COUNT = I1_8N_DESCRIPTIVE_ELEMENT_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__OWNED_COMMENT = SPICE_ELEMENT__OWNED_COMMENT;

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
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__UUID = SPICE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__MODEL = SPICE_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE__NAMESPACE = SPICE_ELEMENT__NAMESPACE;

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
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___OID = SPICE_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___ALL_NAMESPACES = SPICE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___SEPARATOR = SPICE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_PRACTISE___QUALIFIED_NAME = SPICE_ELEMENT___QUALIFIED_NAME;

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
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__OWNED_COMMENT = SPICE_ELEMENT__OWNED_COMMENT;

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
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__UUID = SPICE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__MODEL = SPICE_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAMESPACE = SPICE_ELEMENT__NAMESPACE;

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
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___OID = SPICE_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___ALL_NAMESPACES = SPICE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___SEPARATOR = SPICE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS___QUALIFIED_NAME = SPICE_ELEMENT___QUALIFIED_NAME;

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
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__OWNED_COMMENT = SPICE_ELEMENT__OWNED_COMMENT;

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
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__UUID = SPICE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__MODEL = SPICE_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__NAMESPACE = SPICE_ELEMENT__NAMESPACE;

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
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___OID = SPICE_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___ALL_NAMESPACES = SPICE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___SEPARATOR = SPICE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP___QUALIFIED_NAME = SPICE_ELEMENT___QUALIFIED_NAME;

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
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__OWNED_COMMENT = I1_8N_NAMED_ELEMENT__OWNED_COMMENT;

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
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__UUID = I1_8N_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__MODEL = I1_8N_NAMED_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__NAMESPACE = I1_8N_NAMED_ELEMENT__NAMESPACE;

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
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___OID = I1_8N_NAMED_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___ALL_NAMESPACES = I1_8N_NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___SEPARATOR = I1_8N_NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___QUALIFIED_NAME = I1_8N_NAMED_ELEMENT___QUALIFIED_NAME;

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
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__OWNED_COMMENT = SPICE_ELEMENT__OWNED_COMMENT;

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
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__UUID = SPICE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__MODEL = SPICE_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__NAMESPACE = SPICE_ELEMENT__NAMESPACE;

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
	 * The feature id for the '<em><b>Owning Work Product Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP = SPICE_ELEMENT_FEATURE_COUNT + 0;

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
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___OID = SPICE_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___ALL_NAMESPACES = SPICE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___SEPARATOR = SPICE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT___QUALIFIED_NAME = SPICE_ELEMENT___QUALIFIED_NAME;

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
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__OWNED_COMMENT = WORK_PRODUCT__OWNED_COMMENT;

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
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__UUID = WORK_PRODUCT__UUID;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__MODEL = WORK_PRODUCT__MODEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__NAMESPACE = WORK_PRODUCT__NAMESPACE;

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
	 * The feature id for the '<em><b>Owning Work Product Group</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP = WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP;

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
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___OID = WORK_PRODUCT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___ALL_NAMESPACES = WORK_PRODUCT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___SEPARATOR = WORK_PRODUCT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT___QUALIFIED_NAME = WORK_PRODUCT___QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Generic Work Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT_OPERATION_COUNT = WORK_PRODUCT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.DomainImpl
	 * @see QWiki.impl.QWikiPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 34;

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
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__OWNED_COMMENT = I1_8N_NAMED_ELEMENT__OWNED_COMMENT;

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
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__UUID = I1_8N_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__MODEL = I1_8N_NAMED_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAMESPACE = I1_8N_NAMED_ELEMENT__NAMESPACE;

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
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___OID = I1_8N_NAMED_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___ALL_NAMESPACES = I1_8N_NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___SEPARATOR = I1_8N_NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN___QUALIFIED_NAME = I1_8N_NAMED_ELEMENT___QUALIFIED_NAME;

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
	 * The meta object id for the '{@link QWiki.impl.DomainElementImpl <em>Domain Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.DomainElementImpl
	 * @see QWiki.impl.QWikiPackageImpl#getDomainElement()
	 * @generated
	 */
	int DOMAIN_ELEMENT = 35;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__OWNED_ELEMENT = UML_NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__OWNER = UML_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__OWNED_COMMENT = UML_NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__TAG = UML_NAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__CUSTOM_PROPERTY = UML_NAMED_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__UUID = UML_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__MODEL = UML_NAMED_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__NAMESPACE = UML_NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__NAME = UML_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__QUALIFIED_NAME = UML_NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__DOMAIN = UML_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assigned Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT__ASSIGNED_DOMAIN = UML_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Domain Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT_FEATURE_COUNT = UML_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___ALL_OWNED_ELEMENTS = UML_NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___MUST_BE_OWNED = UML_NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___MODEL = UML_NAMED_ELEMENT___MODEL;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___OID = UML_NAMED_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___ALL_NAMESPACES = UML_NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___SEPARATOR = UML_NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT___QUALIFIED_NAME = UML_NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Domain Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_ELEMENT_OPERATION_COUNT = UML_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.DO_NOT_USE_RelationshipImpl <em>DO NOT USE Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.DO_NOT_USE_RelationshipImpl
	 * @see QWiki.impl.QWikiPackageImpl#getDO_NOT_USE_Relationship()
	 * @generated
	 */
	int DO_NOT_USE_RELATIONSHIP = 36;

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
	 * The meta object id for the '{@link QWiki.impl.DO_NOT_USE_RelationshipTypeImpl <em>DO NOT USE Relationship Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.DO_NOT_USE_RelationshipTypeImpl
	 * @see QWiki.impl.QWikiPackageImpl#getDO_NOT_USE_RelationshipType()
	 * @generated
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__OWNED_ELEMENT = I1_8N_NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__OWNER = I1_8N_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__OWNED_COMMENT = I1_8N_NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__TAG = I1_8N_NAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__CUSTOM_PROPERTY = I1_8N_NAMED_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__UUID = I1_8N_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__MODEL = I1_8N_NAMED_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__NAMESPACE = I1_8N_NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__NAME = I1_8N_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__QUALIFIED_NAME = I1_8N_NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__DISPLAY_NAME = I1_8N_NAMED_ELEMENT__DISPLAY_NAME;

	/**
	 * The number of structural features of the '<em>DO NOT USE Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE_FEATURE_COUNT = I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___ALL_OWNED_ELEMENTS = I1_8N_NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___MUST_BE_OWNED = I1_8N_NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___MODEL = I1_8N_NAMED_ELEMENT___MODEL;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___OID = I1_8N_NAMED_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___ALL_NAMESPACES = I1_8N_NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___SEPARATOR = I1_8N_NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___QUALIFIED_NAME = I1_8N_NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>DO NOT USE Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE_OPERATION_COUNT = I1_8N_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.impl.UmlAssociationImpl <em>Uml Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.impl.UmlAssociationImpl
	 * @see QWiki.impl.QWikiPackageImpl#getUmlAssociation()
	 * @generated
	 */
	int UML_ASSOCIATION = 38;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOCIATION__OWNED_ELEMENT = UML_RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOCIATION__OWNER = UML_RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOCIATION__OWNED_COMMENT = UML_RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOCIATION__RELATED_ELEMENT = UML_RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Derived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOCIATION__IS_DERIVED = UML_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uml Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOCIATION_FEATURE_COUNT = UML_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOCIATION___ALL_OWNED_ELEMENTS = UML_RELATIONSHIP___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOCIATION___MUST_BE_OWNED = UML_RELATIONSHIP___MUST_BE_OWNED;

	/**
	 * The number of operations of the '<em>Uml Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOCIATION_OPERATION_COUNT = UML_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.AuthorType <em>Author Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.AuthorType
	 * @see QWiki.impl.QWikiPackageImpl#getAuthorType()
	 * @generated
	 */
	int AUTHOR_TYPE = 39;

	/**
	 * The meta object id for the '{@link QWiki.DocumentVersionType <em>Document Version Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.DocumentVersionType
	 * @see QWiki.impl.QWikiPackageImpl#getDocumentVersionType()
	 * @generated
	 */
	int DOCUMENT_VERSION_TYPE = 40;

	/**
	 * The meta object id for the '{@link QWiki.ProcessReferenceModelDomain <em>Process Reference Model Domain</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.ProcessReferenceModelDomain
	 * @see QWiki.impl.QWikiPackageImpl#getProcessReferenceModelDomain()
	 * @generated
	 */
	int PROCESS_REFERENCE_MODEL_DOMAIN = 41;

	/**
	 * The meta object id for the '{@link QWiki.SuperseedingType <em>Superseeding Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.SuperseedingType
	 * @see QWiki.impl.QWikiPackageImpl#getSuperseedingType()
	 * @generated
	 */
	int SUPERSEEDING_TYPE = 42;

	/**
	 * The meta object id for the '{@link QWiki.DocumentType <em>Document Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.DocumentType
	 * @see QWiki.impl.QWikiPackageImpl#getDocumentType()
	 * @generated
	 */
	int DOCUMENT_TYPE = 43;

	/**
	 * The meta object id for the '{@link QWiki.WorkProductType <em>Work Product Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.WorkProductType
	 * @see QWiki.impl.QWikiPackageImpl#getWorkProductType()
	 * @generated
	 */
	int WORK_PRODUCT_TYPE = 44;


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
	 * Returns the meta object for the attribute '{@link QWiki.Author#getAbbreviation <em>Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abbreviation</em>'.
	 * @see QWiki.Author#getAbbreviation()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Abbreviation();

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
	 * Returns the meta object for class '{@link QWiki.UmlNamedElement <em>Uml Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Named Element</em>'.
	 * @see QWiki.UmlNamedElement
	 * @generated
	 */
	EClass getUmlNamedElement();

	/**
	 * Returns the meta object for the reference '{@link QWiki.UmlNamedElement#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Namespace</em>'.
	 * @see QWiki.UmlNamedElement#getNamespace()
	 * @see #getUmlNamedElement()
	 * @generated
	 */
	EReference getUmlNamedElement_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.UmlNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QWiki.UmlNamedElement#getName()
	 * @see #getUmlNamedElement()
	 * @generated
	 */
	EAttribute getUmlNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.UmlNamedElement#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see QWiki.UmlNamedElement#getQualifiedName()
	 * @see #getUmlNamedElement()
	 * @generated
	 */
	EAttribute getUmlNamedElement_QualifiedName();

	/**
	 * Returns the meta object for the '{@link QWiki.UmlNamedElement#allNamespaces() <em>All Namespaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Namespaces</em>' operation.
	 * @see QWiki.UmlNamedElement#allNamespaces()
	 * @generated
	 */
	EOperation getUmlNamedElement__AllNamespaces();

	/**
	 * Returns the meta object for the '{@link QWiki.UmlNamedElement#separator() <em>Separator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Separator</em>' operation.
	 * @see QWiki.UmlNamedElement#separator()
	 * @generated
	 */
	EOperation getUmlNamedElement__Separator();

	/**
	 * Returns the meta object for the '{@link QWiki.UmlNamedElement#qualifiedName() <em>Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Qualified Name</em>' operation.
	 * @see QWiki.UmlNamedElement#qualifiedName()
	 * @generated
	 */
	EOperation getUmlNamedElement__QualifiedName();

	/**
	 * Returns the meta object for class '{@link QWiki.UmlElement <em>Uml Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Element</em>'.
	 * @see QWiki.UmlElement
	 * @generated
	 */
	EClass getUmlElement();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.UmlElement#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Element</em>'.
	 * @see QWiki.UmlElement#getOwnedElement()
	 * @see #getUmlElement()
	 * @generated
	 */
	EReference getUmlElement_OwnedElement();

	/**
	 * Returns the meta object for the reference '{@link QWiki.UmlElement#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see QWiki.UmlElement#getOwner()
	 * @see #getUmlElement()
	 * @generated
	 */
	EReference getUmlElement_Owner();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.UmlElement#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Comment</em>'.
	 * @see QWiki.UmlElement#getOwnedComment()
	 * @see #getUmlElement()
	 * @generated
	 */
	EReference getUmlElement_OwnedComment();

	/**
	 * Returns the meta object for the '{@link QWiki.UmlElement#allOwnedElements() <em>All Owned Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Owned Elements</em>' operation.
	 * @see QWiki.UmlElement#allOwnedElements()
	 * @generated
	 */
	EOperation getUmlElement__AllOwnedElements();

	/**
	 * Returns the meta object for the '{@link QWiki.UmlElement#mustBeOwned() <em>Must Be Owned</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Must Be Owned</em>' operation.
	 * @see QWiki.UmlElement#mustBeOwned()
	 * @generated
	 */
	EOperation getUmlElement__MustBeOwned();

	/**
	 * Returns the meta object for class '{@link QWiki.UmlComment <em>Uml Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Comment</em>'.
	 * @see QWiki.UmlComment
	 * @generated
	 */
	EClass getUmlComment();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.UmlComment#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see QWiki.UmlComment#getBody()
	 * @see #getUmlComment()
	 * @generated
	 */
	EAttribute getUmlComment_Body();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.UmlComment#getAnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotated Element</em>'.
	 * @see QWiki.UmlComment#getAnnotatedElement()
	 * @see #getUmlComment()
	 * @generated
	 */
	EReference getUmlComment_AnnotatedElement();

	/**
	 * Returns the meta object for class '{@link QWiki.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see QWiki.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.ModelElement#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see QWiki.ModelElement#getUuid()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Uuid();

	/**
	 * Returns the meta object for the container reference '{@link QWiki.ModelElement#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see QWiki.ModelElement#getModel()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Model();

	/**
	 * Returns the meta object for the '{@link QWiki.ModelElement#model() <em>Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Model</em>' operation.
	 * @see QWiki.ModelElement#model()
	 * @generated
	 */
	EOperation getModelElement__Model();

	/**
	 * Returns the meta object for the '{@link QWiki.ModelElement#oid() <em>Oid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Oid</em>' operation.
	 * @see QWiki.ModelElement#oid()
	 * @generated
	 */
	EOperation getModelElement__Oid();

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
	 * Returns the meta object for class '{@link QWiki.QWikiModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see QWiki.QWikiModel
	 * @generated
	 */
	EClass getQWikiModel();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.QWikiModel#getOwnedModelElement <em>Owned Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Model Element</em>'.
	 * @see QWiki.QWikiModel#getOwnedModelElement()
	 * @see #getQWikiModel()
	 * @generated
	 */
	EReference getQWikiModel_OwnedModelElement();

	/**
	 * Returns the meta object for class '{@link QWiki.UmlPackage <em>Uml Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Package</em>'.
	 * @see QWiki.UmlPackage
	 * @generated
	 */
	EClass getUmlPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.UmlPackage#getPackagedElement <em>Packaged Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packaged Element</em>'.
	 * @see QWiki.UmlPackage#getPackagedElement()
	 * @see #getUmlPackage()
	 * @generated
	 */
	EReference getUmlPackage_PackagedElement();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.UmlPackage#getNestedPackage <em>Nested Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nested Package</em>'.
	 * @see QWiki.UmlPackage#getNestedPackage()
	 * @see #getUmlPackage()
	 * @generated
	 */
	EReference getUmlPackage_NestedPackage();

	/**
	 * Returns the meta object for the reference '{@link QWiki.UmlPackage#getNestingPackage <em>Nesting Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nesting Package</em>'.
	 * @see QWiki.UmlPackage#getNestingPackage()
	 * @see #getUmlPackage()
	 * @generated
	 */
	EReference getUmlPackage_NestingPackage();

	/**
	 * Returns the meta object for class '{@link QWiki.UmlPackageableElement <em>Uml Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Packageable Element</em>'.
	 * @see QWiki.UmlPackageableElement
	 * @generated
	 */
	EClass getUmlPackageableElement();

	/**
	 * Returns the meta object for class '{@link QWiki.UmlNamespace <em>Uml Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Namespace</em>'.
	 * @see QWiki.UmlNamespace
	 * @generated
	 */
	EClass getUmlNamespace();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.UmlNamespace#getImportedMember <em>Imported Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imported Member</em>'.
	 * @see QWiki.UmlNamespace#getImportedMember()
	 * @see #getUmlNamespace()
	 * @generated
	 */
	EReference getUmlNamespace_ImportedMember();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.UmlNamespace#getOwnedMember <em>Owned Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Member</em>'.
	 * @see QWiki.UmlNamespace#getOwnedMember()
	 * @see #getUmlNamespace()
	 * @generated
	 */
	EReference getUmlNamespace_OwnedMember();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.UmlNamespace#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member</em>'.
	 * @see QWiki.UmlNamespace#getMember()
	 * @see #getUmlNamespace()
	 * @generated
	 */
	EReference getUmlNamespace_Member();

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
	 * Returns the meta object for class '{@link QWiki.I18nString <em>I1 8n String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>I1 8n String</em>'.
	 * @see QWiki.I18nString
	 * @generated
	 */
	EClass getI18nString();

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
	 * Returns the meta object for the '{@link QWiki.Section#documentVersion() <em>Document Version</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Document Version</em>' operation.
	 * @see QWiki.Section#documentVersion()
	 * @generated
	 */
	EOperation getSection__DocumentVersion();

	/**
	 * Returns the meta object for the '{@link QWiki.Section#qualifiedNumber() <em>Qualified Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Qualified Number</em>' operation.
	 * @see QWiki.Section#qualifiedNumber()
	 * @generated
	 */
	EOperation getSection__QualifiedNumber();

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
	 * Returns the meta object for the '{@link QWiki.ProcessReferenceModel#oidForDomain() <em>Oid For Domain</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Oid For Domain</em>' operation.
	 * @see QWiki.ProcessReferenceModel#oidForDomain()
	 * @generated
	 */
	EOperation getProcessReferenceModel__OidForDomain();

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
	 * Returns the meta object for class '{@link QWiki.UmlDirectedRelationship <em>Uml Directed Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Directed Relationship</em>'.
	 * @see QWiki.UmlDirectedRelationship
	 * @generated
	 */
	EClass getUmlDirectedRelationship();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.UmlDirectedRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see QWiki.UmlDirectedRelationship#getSource()
	 * @see #getUmlDirectedRelationship()
	 * @generated
	 */
	EReference getUmlDirectedRelationship_Source();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.UmlDirectedRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see QWiki.UmlDirectedRelationship#getTarget()
	 * @see #getUmlDirectedRelationship()
	 * @generated
	 */
	EReference getUmlDirectedRelationship_Target();

	/**
	 * Returns the meta object for class '{@link QWiki.UmlRelationship <em>Uml Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Relationship</em>'.
	 * @see QWiki.UmlRelationship
	 * @generated
	 */
	EClass getUmlRelationship();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.UmlRelationship#getRelatedElement <em>Related Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Element</em>'.
	 * @see QWiki.UmlRelationship#getRelatedElement()
	 * @see #getUmlRelationship()
	 * @generated
	 */
	EReference getUmlRelationship_RelatedElement();

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
	 * Returns the meta object for the reference list '{@link QWiki.Process#getFacilitatedWorkProduct <em>Facilitated Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitated Work Product</em>'.
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
	 * Returns the meta object for the containment reference list '{@link QWiki.ProcessGroup#getOwnedProcess <em>Owned Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Process</em>'.
	 * @see QWiki.ProcessGroup#getOwnedProcess()
	 * @see #getProcessGroup()
	 * @generated
	 */
	EReference getProcessGroup_OwnedProcess();

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
	 * Returns the meta object for the container reference '{@link QWiki.WorkProduct#getOwningWorkProductGroup <em>Owning Work Product Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Work Product Group</em>'.
	 * @see QWiki.WorkProduct#getOwningWorkProductGroup()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_OwningWorkProductGroup();

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
	 * Returns the meta object for class '{@link QWiki.DomainElement <em>Domain Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Element</em>'.
	 * @see QWiki.DomainElement
	 * @generated
	 */
	EClass getDomainElement();

	/**
	 * Returns the meta object for the reference '{@link QWiki.DomainElement#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see QWiki.DomainElement#getDomain()
	 * @see #getDomainElement()
	 * @generated
	 */
	EReference getDomainElement_Domain();

	/**
	 * Returns the meta object for the reference '{@link QWiki.DomainElement#getAssignedDomain <em>Assigned Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assigned Domain</em>'.
	 * @see QWiki.DomainElement#getAssignedDomain()
	 * @see #getDomainElement()
	 * @generated
	 */
	EReference getDomainElement_AssignedDomain();

	/**
	 * Returns the meta object for class '{@link QWiki.DO_NOT_USE_Relationship <em>DO NOT USE Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DO NOT USE Relationship</em>'.
	 * @see QWiki.DO_NOT_USE_Relationship
	 * @generated
	 */
	EClass getDO_NOT_USE_Relationship();

	/**
	 * Returns the meta object for class '{@link QWiki.DO_NOT_USE_RelationshipType <em>DO NOT USE Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DO NOT USE Relationship Type</em>'.
	 * @see QWiki.DO_NOT_USE_RelationshipType
	 * @generated
	 */
	EClass getDO_NOT_USE_RelationshipType();

	/**
	 * Returns the meta object for class '{@link QWiki.UmlAssociation <em>Uml Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Association</em>'.
	 * @see QWiki.UmlAssociation
	 * @generated
	 */
	EClass getUmlAssociation();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.UmlAssociation#isDerived <em>Is Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Derived</em>'.
	 * @see QWiki.UmlAssociation#isDerived()
	 * @see #getUmlAssociation()
	 * @generated
	 */
	EAttribute getUmlAssociation_IsDerived();

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
		 * The meta object literal for the '<em><b>Abbreviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR__ABBREVIATION = eINSTANCE.getAuthor_Abbreviation();

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
		 * The meta object literal for the '{@link QWiki.impl.UmlNamedElementImpl <em>Uml Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.UmlNamedElementImpl
		 * @see QWiki.impl.QWikiPackageImpl#getUmlNamedElement()
		 * @generated
		 */
		EClass UML_NAMED_ELEMENT = eINSTANCE.getUmlNamedElement();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_NAMED_ELEMENT__NAMESPACE = eINSTANCE.getUmlNamedElement_Namespace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_NAMED_ELEMENT__NAME = eINSTANCE.getUmlNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_NAMED_ELEMENT__QUALIFIED_NAME = eINSTANCE.getUmlNamedElement_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>All Namespaces</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_NAMED_ELEMENT___ALL_NAMESPACES = eINSTANCE.getUmlNamedElement__AllNamespaces();

		/**
		 * The meta object literal for the '<em><b>Separator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_NAMED_ELEMENT___SEPARATOR = eINSTANCE.getUmlNamedElement__Separator();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_NAMED_ELEMENT___QUALIFIED_NAME = eINSTANCE.getUmlNamedElement__QualifiedName();

		/**
		 * The meta object literal for the '{@link QWiki.impl.UmlElementImpl <em>Uml Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.UmlElementImpl
		 * @see QWiki.impl.QWikiPackageImpl#getUmlElement()
		 * @generated
		 */
		EClass UML_ELEMENT = eINSTANCE.getUmlElement();

		/**
		 * The meta object literal for the '<em><b>Owned Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ELEMENT__OWNED_ELEMENT = eINSTANCE.getUmlElement_OwnedElement();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ELEMENT__OWNER = eINSTANCE.getUmlElement_Owner();

		/**
		 * The meta object literal for the '<em><b>Owned Comment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ELEMENT__OWNED_COMMENT = eINSTANCE.getUmlElement_OwnedComment();

		/**
		 * The meta object literal for the '<em><b>All Owned Elements</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_ELEMENT___ALL_OWNED_ELEMENTS = eINSTANCE.getUmlElement__AllOwnedElements();

		/**
		 * The meta object literal for the '<em><b>Must Be Owned</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UML_ELEMENT___MUST_BE_OWNED = eINSTANCE.getUmlElement__MustBeOwned();

		/**
		 * The meta object literal for the '{@link QWiki.impl.UmlCommentImpl <em>Uml Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.UmlCommentImpl
		 * @see QWiki.impl.QWikiPackageImpl#getUmlComment()
		 * @generated
		 */
		EClass UML_COMMENT = eINSTANCE.getUmlComment();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_COMMENT__BODY = eINSTANCE.getUmlComment_Body();

		/**
		 * The meta object literal for the '<em><b>Annotated Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_COMMENT__ANNOTATED_ELEMENT = eINSTANCE.getUmlComment_AnnotatedElement();

		/**
		 * The meta object literal for the '{@link QWiki.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.ModelElementImpl
		 * @see QWiki.impl.QWikiPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__UUID = eINSTANCE.getModelElement_Uuid();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__MODEL = eINSTANCE.getModelElement_Model();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_ELEMENT___MODEL = eINSTANCE.getModelElement__Model();

		/**
		 * The meta object literal for the '<em><b>Oid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_ELEMENT___OID = eINSTANCE.getModelElement__Oid();

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
		 * The meta object literal for the '{@link QWiki.impl.QWikiModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.QWikiModelImpl
		 * @see QWiki.impl.QWikiPackageImpl#getQWikiModel()
		 * @generated
		 */
		EClass QWIKI_MODEL = eINSTANCE.getQWikiModel();

		/**
		 * The meta object literal for the '<em><b>Owned Model Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QWIKI_MODEL__OWNED_MODEL_ELEMENT = eINSTANCE.getQWikiModel_OwnedModelElement();

		/**
		 * The meta object literal for the '{@link QWiki.impl.UmlPackageImpl <em>Uml Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.UmlPackageImpl
		 * @see QWiki.impl.QWikiPackageImpl#getUmlPackage()
		 * @generated
		 */
		EClass UML_PACKAGE = eINSTANCE.getUmlPackage();

		/**
		 * The meta object literal for the '<em><b>Packaged Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_PACKAGE__PACKAGED_ELEMENT = eINSTANCE.getUmlPackage_PackagedElement();

		/**
		 * The meta object literal for the '<em><b>Nested Package</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_PACKAGE__NESTED_PACKAGE = eINSTANCE.getUmlPackage_NestedPackage();

		/**
		 * The meta object literal for the '<em><b>Nesting Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_PACKAGE__NESTING_PACKAGE = eINSTANCE.getUmlPackage_NestingPackage();

		/**
		 * The meta object literal for the '{@link QWiki.impl.UmlPackageableElementImpl <em>Uml Packageable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.UmlPackageableElementImpl
		 * @see QWiki.impl.QWikiPackageImpl#getUmlPackageableElement()
		 * @generated
		 */
		EClass UML_PACKAGEABLE_ELEMENT = eINSTANCE.getUmlPackageableElement();

		/**
		 * The meta object literal for the '{@link QWiki.impl.UmlNamespaceImpl <em>Uml Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.UmlNamespaceImpl
		 * @see QWiki.impl.QWikiPackageImpl#getUmlNamespace()
		 * @generated
		 */
		EClass UML_NAMESPACE = eINSTANCE.getUmlNamespace();

		/**
		 * The meta object literal for the '<em><b>Imported Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_NAMESPACE__IMPORTED_MEMBER = eINSTANCE.getUmlNamespace_ImportedMember();

		/**
		 * The meta object literal for the '<em><b>Owned Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_NAMESPACE__OWNED_MEMBER = eINSTANCE.getUmlNamespace_OwnedMember();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_NAMESPACE__MEMBER = eINSTANCE.getUmlNamespace_Member();

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
		 * The meta object literal for the '{@link QWiki.impl.I18nStringImpl <em>I1 8n String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.I18nStringImpl
		 * @see QWiki.impl.QWikiPackageImpl#getI18nString()
		 * @generated
		 */
		EClass I1_8N_STRING = eINSTANCE.getI18nString();

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
		 * The meta object literal for the '<em><b>Document Version</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SECTION___DOCUMENT_VERSION = eINSTANCE.getSection__DocumentVersion();

		/**
		 * The meta object literal for the '<em><b>Qualified Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SECTION___QUALIFIED_NUMBER = eINSTANCE.getSection__QualifiedNumber();

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
		 * The meta object literal for the '<em><b>Oid For Domain</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROCESS_REFERENCE_MODEL___OID_FOR_DOMAIN = eINSTANCE.getProcessReferenceModel__OidForDomain();

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
		 * The meta object literal for the '{@link QWiki.impl.UmlDirectedRelationshipImpl <em>Uml Directed Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.UmlDirectedRelationshipImpl
		 * @see QWiki.impl.QWikiPackageImpl#getUmlDirectedRelationship()
		 * @generated
		 */
		EClass UML_DIRECTED_RELATIONSHIP = eINSTANCE.getUmlDirectedRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_DIRECTED_RELATIONSHIP__SOURCE = eINSTANCE.getUmlDirectedRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_DIRECTED_RELATIONSHIP__TARGET = eINSTANCE.getUmlDirectedRelationship_Target();

		/**
		 * The meta object literal for the '{@link QWiki.impl.UmlRelationshipImpl <em>Uml Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.UmlRelationshipImpl
		 * @see QWiki.impl.QWikiPackageImpl#getUmlRelationship()
		 * @generated
		 */
		EClass UML_RELATIONSHIP = eINSTANCE.getUmlRelationship();

		/**
		 * The meta object literal for the '<em><b>Related Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_RELATIONSHIP__RELATED_ELEMENT = eINSTANCE.getUmlRelationship_RelatedElement();

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
		 * The meta object literal for the '{@link QWiki.impl.ProcessGroupImpl <em>Process Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.ProcessGroupImpl
		 * @see QWiki.impl.QWikiPackageImpl#getProcessGroup()
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
		 * The meta object literal for the '<em><b>Owning Work Product Group</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP = eINSTANCE.getWorkProduct_OwningWorkProductGroup();

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
		 * The meta object literal for the '{@link QWiki.impl.DomainElementImpl <em>Domain Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.DomainElementImpl
		 * @see QWiki.impl.QWikiPackageImpl#getDomainElement()
		 * @generated
		 */
		EClass DOMAIN_ELEMENT = eINSTANCE.getDomainElement();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ELEMENT__DOMAIN = eINSTANCE.getDomainElement_Domain();

		/**
		 * The meta object literal for the '<em><b>Assigned Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_ELEMENT__ASSIGNED_DOMAIN = eINSTANCE.getDomainElement_AssignedDomain();

		/**
		 * The meta object literal for the '{@link QWiki.impl.DO_NOT_USE_RelationshipImpl <em>DO NOT USE Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.DO_NOT_USE_RelationshipImpl
		 * @see QWiki.impl.QWikiPackageImpl#getDO_NOT_USE_Relationship()
		 * @generated
		 */
		EClass DO_NOT_USE_RELATIONSHIP = eINSTANCE.getDO_NOT_USE_Relationship();

		/**
		 * The meta object literal for the '{@link QWiki.impl.DO_NOT_USE_RelationshipTypeImpl <em>DO NOT USE Relationship Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.DO_NOT_USE_RelationshipTypeImpl
		 * @see QWiki.impl.QWikiPackageImpl#getDO_NOT_USE_RelationshipType()
		 * @generated
		 */
		EClass DO_NOT_USE_RELATIONSHIP_TYPE = eINSTANCE.getDO_NOT_USE_RelationshipType();

		/**
		 * The meta object literal for the '{@link QWiki.impl.UmlAssociationImpl <em>Uml Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.impl.UmlAssociationImpl
		 * @see QWiki.impl.QWikiPackageImpl#getUmlAssociation()
		 * @generated
		 */
		EClass UML_ASSOCIATION = eINSTANCE.getUmlAssociation();

		/**
		 * The meta object literal for the '<em><b>Is Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_ASSOCIATION__IS_DERIVED = eINSTANCE.getUmlAssociation_IsDerived();

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
