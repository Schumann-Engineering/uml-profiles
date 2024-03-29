/**
 */
package QWiki.Bibliography;

import QWiki.Infrastructure.InfrastructurePackage;

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
 * @see QWiki.Bibliography.BibliographyFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface BibliographyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Bibliography";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schumann.engineering/qwiki/1.0/bibliography";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "QWiki.Bibliography";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BibliographyPackage eINSTANCE = QWiki.Bibliography.impl.BibliographyPackageImpl.init();

	/**
	 * The meta object id for the '{@link QWiki.Bibliography.impl.AuthorImpl <em>Author</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Bibliography.impl.AuthorImpl
	 * @see QWiki.Bibliography.impl.BibliographyPackageImpl#getAuthor()
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
	int AUTHOR__OWNED_ELEMENT = InfrastructurePackage.UML_NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__OWNER = InfrastructurePackage.UML_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__OWNED_COMMENT = InfrastructurePackage.UML_NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__DIRECTED_RELATIONSHIP = InfrastructurePackage.UML_NAMED_ELEMENT__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__RELATIONSHIP = InfrastructurePackage.UML_NAMED_ELEMENT__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__TAG = InfrastructurePackage.UML_NAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__CUSTOM_PROPERTY = InfrastructurePackage.UML_NAMED_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__MODEL = InfrastructurePackage.UML_NAMED_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__UUID = InfrastructurePackage.UML_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__SUPERSEEDING_RELATIONSHIP = InfrastructurePackage.UML_NAMED_ELEMENT__SUPERSEEDING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__NAMESPACE = InfrastructurePackage.UML_NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__NAME = InfrastructurePackage.UML_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__QUALIFIED_NAME = InfrastructurePackage.UML_NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Author Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__AUTHOR_TYPE = InfrastructurePackage.UML_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abbreviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR__ABBREVIATION = InfrastructurePackage.UML_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_FEATURE_COUNT = InfrastructurePackage.UML_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR___ALL_OWNED_ELEMENTS = InfrastructurePackage.UML_NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR___MUST_BE_OWNED = InfrastructurePackage.UML_NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR___MODEL = InfrastructurePackage.UML_NAMED_ELEMENT___MODEL;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR___OID = InfrastructurePackage.UML_NAMED_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR___ALL_NAMESPACES = InfrastructurePackage.UML_NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR___SEPARATOR = InfrastructurePackage.UML_NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR___QUALIFIED_NAME = InfrastructurePackage.UML_NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Authored Document</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR___AUTHORED_DOCUMENT = InfrastructurePackage.UML_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Authored Standard</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR___AUTHORED_STANDARD = InfrastructurePackage.UML_NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Author</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_OPERATION_COUNT = InfrastructurePackage.UML_NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link QWiki.Bibliography.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Bibliography.impl.DocumentImpl
	 * @see QWiki.Bibliography.impl.BibliographyPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__OWNED_ELEMENT = InfrastructurePackage.UML_NAMESPACE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__OWNER = InfrastructurePackage.UML_NAMESPACE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__OWNED_COMMENT = InfrastructurePackage.UML_NAMESPACE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DIRECTED_RELATIONSHIP = InfrastructurePackage.UML_NAMESPACE__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__RELATIONSHIP = InfrastructurePackage.UML_NAMESPACE__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__TAG = InfrastructurePackage.UML_NAMESPACE__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__CUSTOM_PROPERTY = InfrastructurePackage.UML_NAMESPACE__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__MODEL = InfrastructurePackage.UML_NAMESPACE__MODEL;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__UUID = InfrastructurePackage.UML_NAMESPACE__UUID;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__SUPERSEEDING_RELATIONSHIP = InfrastructurePackage.UML_NAMESPACE__SUPERSEEDING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAMESPACE = InfrastructurePackage.UML_NAMESPACE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NAME = InfrastructurePackage.UML_NAMESPACE__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__QUALIFIED_NAME = InfrastructurePackage.UML_NAMESPACE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DISPLAY_NAME = InfrastructurePackage.UML_NAMESPACE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__PURPOSE = InfrastructurePackage.UML_NAMESPACE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__BODY = InfrastructurePackage.UML_NAMESPACE__BODY;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__OWNED_MEMBER = InfrastructurePackage.UML_NAMESPACE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__MEMBER = InfrastructurePackage.UML_NAMESPACE__MEMBER;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__NUMBER = InfrastructurePackage.UML_NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Version</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__OWNED_VERSION = InfrastructurePackage.UML_NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Document Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DOCUMENT_TYPE = InfrastructurePackage.UML_NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__AUTHOR = InfrastructurePackage.UML_NAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = InfrastructurePackage.UML_NAMESPACE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___ALL_OWNED_ELEMENTS = InfrastructurePackage.UML_NAMESPACE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___MUST_BE_OWNED = InfrastructurePackage.UML_NAMESPACE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___MODEL = InfrastructurePackage.UML_NAMESPACE___MODEL;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___OID = InfrastructurePackage.UML_NAMESPACE___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___ALL_NAMESPACES = InfrastructurePackage.UML_NAMESPACE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___SEPARATOR = InfrastructurePackage.UML_NAMESPACE___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___QUALIFIED_NAME = InfrastructurePackage.UML_NAMESPACE___QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = InfrastructurePackage.UML_NAMESPACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.Bibliography.impl.DocumentVersionImpl <em>Document Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Bibliography.impl.DocumentVersionImpl
	 * @see QWiki.Bibliography.impl.BibliographyPackageImpl#getDocumentVersion()
	 * @generated
	 */
	int DOCUMENT_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__OWNED_ELEMENT = InfrastructurePackage.UML_NAMESPACE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__OWNER = InfrastructurePackage.UML_NAMESPACE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__OWNED_COMMENT = InfrastructurePackage.UML_NAMESPACE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__DIRECTED_RELATIONSHIP = InfrastructurePackage.UML_NAMESPACE__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__RELATIONSHIP = InfrastructurePackage.UML_NAMESPACE__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__TAG = InfrastructurePackage.UML_NAMESPACE__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__CUSTOM_PROPERTY = InfrastructurePackage.UML_NAMESPACE__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__MODEL = InfrastructurePackage.UML_NAMESPACE__MODEL;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__UUID = InfrastructurePackage.UML_NAMESPACE__UUID;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__SUPERSEEDING_RELATIONSHIP = InfrastructurePackage.UML_NAMESPACE__SUPERSEEDING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__NAMESPACE = InfrastructurePackage.UML_NAMESPACE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__NAME = InfrastructurePackage.UML_NAMESPACE__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__QUALIFIED_NAME = InfrastructurePackage.UML_NAMESPACE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__DISPLAY_NAME = InfrastructurePackage.UML_NAMESPACE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__PURPOSE = InfrastructurePackage.UML_NAMESPACE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__BODY = InfrastructurePackage.UML_NAMESPACE__BODY;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__OWNED_MEMBER = InfrastructurePackage.UML_NAMESPACE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__MEMBER = InfrastructurePackage.UML_NAMESPACE__MEMBER;

	/**
	 * The feature id for the '<em><b>Publication Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__PUBLICATION_YEAR = InfrastructurePackage.UML_NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Document Version Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__DOCUMENT_VERSION_TYPE = InfrastructurePackage.UML_NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Edition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__EDITION = InfrastructurePackage.UML_NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__OWNED_SECTION = InfrastructurePackage.UML_NAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owning Document</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION__OWNING_DOCUMENT = InfrastructurePackage.UML_NAMESPACE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Document Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION_FEATURE_COUNT = InfrastructurePackage.UML_NAMESPACE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION___ALL_OWNED_ELEMENTS = InfrastructurePackage.UML_NAMESPACE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION___MUST_BE_OWNED = InfrastructurePackage.UML_NAMESPACE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION___MODEL = InfrastructurePackage.UML_NAMESPACE___MODEL;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION___OID = InfrastructurePackage.UML_NAMESPACE___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION___ALL_NAMESPACES = InfrastructurePackage.UML_NAMESPACE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION___SEPARATOR = InfrastructurePackage.UML_NAMESPACE___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION___QUALIFIED_NAME = InfrastructurePackage.UML_NAMESPACE___QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Document Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_VERSION_OPERATION_COUNT = InfrastructurePackage.UML_NAMESPACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.Bibliography.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Bibliography.impl.SectionImpl
	 * @see QWiki.Bibliography.impl.BibliographyPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 3;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__OWNED_ELEMENT = InfrastructurePackage.UML_NAMESPACE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__OWNER = InfrastructurePackage.UML_NAMESPACE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__OWNED_COMMENT = InfrastructurePackage.UML_NAMESPACE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__DIRECTED_RELATIONSHIP = InfrastructurePackage.UML_NAMESPACE__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__RELATIONSHIP = InfrastructurePackage.UML_NAMESPACE__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TAG = InfrastructurePackage.UML_NAMESPACE__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CUSTOM_PROPERTY = InfrastructurePackage.UML_NAMESPACE__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__MODEL = InfrastructurePackage.UML_NAMESPACE__MODEL;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__UUID = InfrastructurePackage.UML_NAMESPACE__UUID;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__SUPERSEEDING_RELATIONSHIP = InfrastructurePackage.UML_NAMESPACE__SUPERSEEDING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NAMESPACE = InfrastructurePackage.UML_NAMESPACE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NAME = InfrastructurePackage.UML_NAMESPACE__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__QUALIFIED_NAME = InfrastructurePackage.UML_NAMESPACE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__DISPLAY_NAME = InfrastructurePackage.UML_NAMESPACE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__PURPOSE = InfrastructurePackage.UML_NAMESPACE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__BODY = InfrastructurePackage.UML_NAMESPACE__BODY;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__OWNED_MEMBER = InfrastructurePackage.UML_NAMESPACE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__MEMBER = InfrastructurePackage.UML_NAMESPACE__MEMBER;

	/**
	 * The feature id for the '<em><b>Owning Document</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__OWNING_DOCUMENT = InfrastructurePackage.UML_NAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__OWNED_SECTION = InfrastructurePackage.UML_NAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owning Section</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__OWNING_SECTION = InfrastructurePackage.UML_NAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NUMBER = InfrastructurePackage.UML_NAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Facilitating Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__FACILITATING_ELEMENT = InfrastructurePackage.UML_NAMESPACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Term</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__TERM = InfrastructurePackage.UML_NAMESPACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Facilitating Spice Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__FACILITATING_SPICE_ELEMENT = InfrastructurePackage.UML_NAMESPACE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = InfrastructurePackage.UML_NAMESPACE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION___ALL_OWNED_ELEMENTS = InfrastructurePackage.UML_NAMESPACE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION___MUST_BE_OWNED = InfrastructurePackage.UML_NAMESPACE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION___MODEL = InfrastructurePackage.UML_NAMESPACE___MODEL;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION___OID = InfrastructurePackage.UML_NAMESPACE___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION___ALL_NAMESPACES = InfrastructurePackage.UML_NAMESPACE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION___SEPARATOR = InfrastructurePackage.UML_NAMESPACE___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION___QUALIFIED_NAME = InfrastructurePackage.UML_NAMESPACE___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Document Version</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION___DOCUMENT_VERSION = InfrastructurePackage.UML_NAMESPACE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Qualified Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION___QUALIFIED_NUMBER = InfrastructurePackage.UML_NAMESPACE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = InfrastructurePackage.UML_NAMESPACE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link QWiki.Bibliography.AuthorType <em>Author Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Bibliography.AuthorType
	 * @see QWiki.Bibliography.impl.BibliographyPackageImpl#getAuthorType()
	 * @generated
	 */
	int AUTHOR_TYPE = 4;

	/**
	 * The meta object id for the '{@link QWiki.Bibliography.DocumentVersionType <em>Document Version Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Bibliography.DocumentVersionType
	 * @see QWiki.Bibliography.impl.BibliographyPackageImpl#getDocumentVersionType()
	 * @generated
	 */
	int DOCUMENT_VERSION_TYPE = 5;

	/**
	 * The meta object id for the '{@link QWiki.Bibliography.DocumentType <em>Document Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Bibliography.DocumentType
	 * @see QWiki.Bibliography.impl.BibliographyPackageImpl#getDocumentType()
	 * @generated
	 */
	int DOCUMENT_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link QWiki.Bibliography.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Author</em>'.
	 * @see QWiki.Bibliography.Author
	 * @generated
	 */
	EClass getAuthor();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.Bibliography.Author#getAuthorType <em>Author Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author Type</em>'.
	 * @see QWiki.Bibliography.Author#getAuthorType()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_AuthorType();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.Bibliography.Author#getAbbreviation <em>Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abbreviation</em>'.
	 * @see QWiki.Bibliography.Author#getAbbreviation()
	 * @see #getAuthor()
	 * @generated
	 */
	EAttribute getAuthor_Abbreviation();

	/**
	 * Returns the meta object for the '{@link QWiki.Bibliography.Author#authoredDocument() <em>Authored Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Authored Document</em>' operation.
	 * @see QWiki.Bibliography.Author#authoredDocument()
	 * @generated
	 */
	EOperation getAuthor__AuthoredDocument();

	/**
	 * Returns the meta object for the '{@link QWiki.Bibliography.Author#authoredStandard() <em>Authored Standard</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Authored Standard</em>' operation.
	 * @see QWiki.Bibliography.Author#authoredStandard()
	 * @generated
	 */
	EOperation getAuthor__AuthoredStandard();

	/**
	 * Returns the meta object for class '{@link QWiki.Bibliography.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see QWiki.Bibliography.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.Bibliography.Document#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see QWiki.Bibliography.Document#getNumber()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_Number();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.Bibliography.Document#getOwnedVersion <em>Owned Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Version</em>'.
	 * @see QWiki.Bibliography.Document#getOwnedVersion()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_OwnedVersion();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.Bibliography.Document#getDocumentType <em>Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Type</em>'.
	 * @see QWiki.Bibliography.Document#getDocumentType()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_DocumentType();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Bibliography.Document#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Author</em>'.
	 * @see QWiki.Bibliography.Document#getAuthor()
	 * @see #getDocument()
	 * @generated
	 */
	EReference getDocument_Author();

	/**
	 * Returns the meta object for class '{@link QWiki.Bibliography.DocumentVersion <em>Document Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Version</em>'.
	 * @see QWiki.Bibliography.DocumentVersion
	 * @generated
	 */
	EClass getDocumentVersion();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.Bibliography.DocumentVersion#getPublicationYear <em>Publication Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publication Year</em>'.
	 * @see QWiki.Bibliography.DocumentVersion#getPublicationYear()
	 * @see #getDocumentVersion()
	 * @generated
	 */
	EAttribute getDocumentVersion_PublicationYear();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.Bibliography.DocumentVersion#getDocumentVersionType <em>Document Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Version Type</em>'.
	 * @see QWiki.Bibliography.DocumentVersion#getDocumentVersionType()
	 * @see #getDocumentVersion()
	 * @generated
	 */
	EAttribute getDocumentVersion_DocumentVersionType();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.Bibliography.DocumentVersion#getEdition <em>Edition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edition</em>'.
	 * @see QWiki.Bibliography.DocumentVersion#getEdition()
	 * @see #getDocumentVersion()
	 * @generated
	 */
	EAttribute getDocumentVersion_Edition();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.Bibliography.DocumentVersion#getOwnedSection <em>Owned Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Section</em>'.
	 * @see QWiki.Bibliography.DocumentVersion#getOwnedSection()
	 * @see #getDocumentVersion()
	 * @generated
	 */
	EReference getDocumentVersion_OwnedSection();

	/**
	 * Returns the meta object for the container reference '{@link QWiki.Bibliography.DocumentVersion#getOwningDocument <em>Owning Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Document</em>'.
	 * @see QWiki.Bibliography.DocumentVersion#getOwningDocument()
	 * @see #getDocumentVersion()
	 * @generated
	 */
	EReference getDocumentVersion_OwningDocument();

	/**
	 * Returns the meta object for class '{@link QWiki.Bibliography.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see QWiki.Bibliography.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the container reference '{@link QWiki.Bibliography.Section#getOwningDocument <em>Owning Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Document</em>'.
	 * @see QWiki.Bibliography.Section#getOwningDocument()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_OwningDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.Bibliography.Section#getOwnedSection <em>Owned Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Section</em>'.
	 * @see QWiki.Bibliography.Section#getOwnedSection()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_OwnedSection();

	/**
	 * Returns the meta object for the container reference '{@link QWiki.Bibliography.Section#getOwningSection <em>Owning Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Section</em>'.
	 * @see QWiki.Bibliography.Section#getOwningSection()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_OwningSection();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.Bibliography.Section#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see QWiki.Bibliography.Section#getNumber()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Number();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Bibliography.Section#getFacilitatingElement <em>Facilitating Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitating Element</em>'.
	 * @see QWiki.Bibliography.Section#getFacilitatingElement()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_FacilitatingElement();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Bibliography.Section#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Term</em>'.
	 * @see QWiki.Bibliography.Section#getTerm()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Term();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Bibliography.Section#getFacilitatingSpiceElement <em>Facilitating Spice Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitating Spice Element</em>'.
	 * @see QWiki.Bibliography.Section#getFacilitatingSpiceElement()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_FacilitatingSpiceElement();

	/**
	 * Returns the meta object for the '{@link QWiki.Bibliography.Section#documentVersion() <em>Document Version</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Document Version</em>' operation.
	 * @see QWiki.Bibliography.Section#documentVersion()
	 * @generated
	 */
	EOperation getSection__DocumentVersion();

	/**
	 * Returns the meta object for the '{@link QWiki.Bibliography.Section#qualifiedNumber() <em>Qualified Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Qualified Number</em>' operation.
	 * @see QWiki.Bibliography.Section#qualifiedNumber()
	 * @generated
	 */
	EOperation getSection__QualifiedNumber();

	/**
	 * Returns the meta object for enum '{@link QWiki.Bibliography.AuthorType <em>Author Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Author Type</em>'.
	 * @see QWiki.Bibliography.AuthorType
	 * @generated
	 */
	EEnum getAuthorType();

	/**
	 * Returns the meta object for enum '{@link QWiki.Bibliography.DocumentVersionType <em>Document Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Version Type</em>'.
	 * @see QWiki.Bibliography.DocumentVersionType
	 * @generated
	 */
	EEnum getDocumentVersionType();

	/**
	 * Returns the meta object for enum '{@link QWiki.Bibliography.DocumentType <em>Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Type</em>'.
	 * @see QWiki.Bibliography.DocumentType
	 * @generated
	 */
	EEnum getDocumentType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BibliographyFactory getBibliographyFactory();

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
		 * The meta object literal for the '{@link QWiki.Bibliography.impl.AuthorImpl <em>Author</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Bibliography.impl.AuthorImpl
		 * @see QWiki.Bibliography.impl.BibliographyPackageImpl#getAuthor()
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
		 * The meta object literal for the '{@link QWiki.Bibliography.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Bibliography.impl.DocumentImpl
		 * @see QWiki.Bibliography.impl.BibliographyPackageImpl#getDocument()
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
		 * The meta object literal for the '{@link QWiki.Bibliography.impl.DocumentVersionImpl <em>Document Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Bibliography.impl.DocumentVersionImpl
		 * @see QWiki.Bibliography.impl.BibliographyPackageImpl#getDocumentVersion()
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
		 * The meta object literal for the '<em><b>Owning Document</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_VERSION__OWNING_DOCUMENT = eINSTANCE.getDocumentVersion_OwningDocument();

		/**
		 * The meta object literal for the '{@link QWiki.Bibliography.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Bibliography.impl.SectionImpl
		 * @see QWiki.Bibliography.impl.BibliographyPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Owning Document</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__OWNING_DOCUMENT = eINSTANCE.getSection_OwningDocument();

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
		 * The meta object literal for the '<em><b>Facilitating Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__FACILITATING_ELEMENT = eINSTANCE.getSection_FacilitatingElement();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__TERM = eINSTANCE.getSection_Term();

		/**
		 * The meta object literal for the '<em><b>Facilitating Spice Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__FACILITATING_SPICE_ELEMENT = eINSTANCE.getSection_FacilitatingSpiceElement();

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
		 * The meta object literal for the '{@link QWiki.Bibliography.AuthorType <em>Author Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Bibliography.AuthorType
		 * @see QWiki.Bibliography.impl.BibliographyPackageImpl#getAuthorType()
		 * @generated
		 */
		EEnum AUTHOR_TYPE = eINSTANCE.getAuthorType();

		/**
		 * The meta object literal for the '{@link QWiki.Bibliography.DocumentVersionType <em>Document Version Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Bibliography.DocumentVersionType
		 * @see QWiki.Bibliography.impl.BibliographyPackageImpl#getDocumentVersionType()
		 * @generated
		 */
		EEnum DOCUMENT_VERSION_TYPE = eINSTANCE.getDocumentVersionType();

		/**
		 * The meta object literal for the '{@link QWiki.Bibliography.DocumentType <em>Document Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Bibliography.DocumentType
		 * @see QWiki.Bibliography.impl.BibliographyPackageImpl#getDocumentType()
		 * @generated
		 */
		EEnum DOCUMENT_TYPE = eINSTANCE.getDocumentType();

	}

} //BibliographyPackage
