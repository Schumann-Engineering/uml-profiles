/**
 */
package QWiki.Infrastructure;

import QWiki.I18N.I18NPackage;
import QWiki.Kernel.KernelPackage;

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
 * @see QWiki.Infrastructure.InfrastructureFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL' invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface InfrastructurePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Infrastructure";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schumann.engineering/qwiki/1.0/infrastructure";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "QWiki.Infrastructure";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InfrastructurePackage eINSTANCE = QWiki.Infrastructure.impl.InfrastructurePackageImpl.init();

	/**
	 * The meta object id for the '{@link QWiki.Infrastructure.impl.UmlElementImpl <em>Uml Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Infrastructure.impl.UmlElementImpl
	 * @see QWiki.Infrastructure.impl.InfrastructurePackageImpl#getUmlElement()
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
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT__DIRECTED_RELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT__RELATIONSHIP = 4;

	/**
	 * The number of structural features of the '<em>Uml Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ELEMENT_FEATURE_COUNT = 5;

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
	 * The meta object id for the '{@link QWiki.Infrastructure.impl.UmlRelationshipImpl <em>Uml Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Infrastructure.impl.UmlRelationshipImpl
	 * @see QWiki.Infrastructure.impl.InfrastructurePackageImpl#getUmlRelationship()
	 * @generated
	 */
	int UML_RELATIONSHIP = 1;

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
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_RELATIONSHIP__DIRECTED_RELATIONSHIP = UML_ELEMENT__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_RELATIONSHIP__RELATIONSHIP = UML_ELEMENT__RELATIONSHIP;

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
	 * The meta object id for the '{@link QWiki.Infrastructure.impl.UmlAssociationImpl <em>Uml Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Infrastructure.impl.UmlAssociationImpl
	 * @see QWiki.Infrastructure.impl.InfrastructurePackageImpl#getUmlAssociation()
	 * @generated
	 */
	int UML_ASSOCIATION = 0;

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
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOCIATION__DIRECTED_RELATIONSHIP = UML_RELATIONSHIP__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_ASSOCIATION__RELATIONSHIP = UML_RELATIONSHIP__RELATIONSHIP;

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
	 * The meta object id for the '{@link QWiki.Infrastructure.impl.UmlCommentImpl <em>Uml Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Infrastructure.impl.UmlCommentImpl
	 * @see QWiki.Infrastructure.impl.InfrastructurePackageImpl#getUmlComment()
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
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_COMMENT__DIRECTED_RELATIONSHIP = UML_ELEMENT__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_COMMENT__RELATIONSHIP = UML_ELEMENT__RELATIONSHIP;

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
	 * The meta object id for the '{@link QWiki.Infrastructure.impl.UmlDirectedRelationshipImpl <em>Uml Directed Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Infrastructure.impl.UmlDirectedRelationshipImpl
	 * @see QWiki.Infrastructure.impl.InfrastructurePackageImpl#getUmlDirectedRelationship()
	 * @generated
	 */
	int UML_DIRECTED_RELATIONSHIP = 4;

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
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIRECTED_RELATIONSHIP__DIRECTED_RELATIONSHIP = UML_RELATIONSHIP__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIRECTED_RELATIONSHIP__RELATIONSHIP = UML_RELATIONSHIP__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIRECTED_RELATIONSHIP__RELATED_ELEMENT = UML_RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIRECTED_RELATIONSHIP__TARGET = UML_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_DIRECTED_RELATIONSHIP__SOURCE = UML_RELATIONSHIP_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link QWiki.Infrastructure.impl.UmlNamedElementImpl <em>Uml Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Infrastructure.impl.UmlNamedElementImpl
	 * @see QWiki.Infrastructure.impl.InfrastructurePackageImpl#getUmlNamedElement()
	 * @generated
	 */
	int UML_NAMED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT__OWNED_ELEMENT = KernelPackage.MODEL_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT__OWNER = KernelPackage.MODEL_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT__OWNED_COMMENT = KernelPackage.MODEL_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT__DIRECTED_RELATIONSHIP = KernelPackage.MODEL_ELEMENT__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT__RELATIONSHIP = KernelPackage.MODEL_ELEMENT__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT__TAG = KernelPackage.MODEL_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT__CUSTOM_PROPERTY = KernelPackage.MODEL_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT__MODEL = KernelPackage.MODEL_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT__UUID = KernelPackage.MODEL_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT__SUPERSEEDING_RELATIONSHIP = KernelPackage.MODEL_ELEMENT__SUPERSEEDING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT__NAMESPACE = KernelPackage.MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT__NAME = KernelPackage.MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT__QUALIFIED_NAME = KernelPackage.MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Uml Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT_FEATURE_COUNT = KernelPackage.MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT___ALL_OWNED_ELEMENTS = KernelPackage.MODEL_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT___MUST_BE_OWNED = KernelPackage.MODEL_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT___MODEL = KernelPackage.MODEL_ELEMENT___MODEL;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT___OID = KernelPackage.MODEL_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT___ALL_NAMESPACES = KernelPackage.MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT___SEPARATOR = KernelPackage.MODEL_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT___QUALIFIED_NAME = KernelPackage.MODEL_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Uml Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMED_ELEMENT_OPERATION_COUNT = KernelPackage.MODEL_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link QWiki.Infrastructure.impl.UmlNamespaceImpl <em>Uml Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Infrastructure.impl.UmlNamespaceImpl
	 * @see QWiki.Infrastructure.impl.InfrastructurePackageImpl#getUmlNamespace()
	 * @generated
	 */
	int UML_NAMESPACE = 8;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__OWNED_ELEMENT = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__OWNER = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__OWNED_COMMENT = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__DIRECTED_RELATIONSHIP = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__RELATIONSHIP = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__TAG = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__CUSTOM_PROPERTY = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__MODEL = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__UUID = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__SUPERSEEDING_RELATIONSHIP = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__SUPERSEEDING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__NAMESPACE = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__NAME = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__QUALIFIED_NAME = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__DISPLAY_NAME = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__PURPOSE = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__BODY = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__OWNED_MEMBER = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE__MEMBER = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Uml Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE_FEATURE_COUNT = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE___ALL_OWNED_ELEMENTS = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE___MUST_BE_OWNED = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE___MODEL = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT___MODEL;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE___OID = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE___ALL_NAMESPACES = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE___SEPARATOR = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE___QUALIFIED_NAME = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT___QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Uml Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_NAMESPACE_OPERATION_COUNT = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.Infrastructure.impl.UmlPackageImpl <em>Uml Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Infrastructure.impl.UmlPackageImpl
	 * @see QWiki.Infrastructure.impl.InfrastructurePackageImpl#getUmlPackage()
	 * @generated
	 */
	int UML_PACKAGE = 6;

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
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE__DIRECTED_RELATIONSHIP = UML_NAMESPACE__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE__RELATIONSHIP = UML_NAMESPACE__RELATIONSHIP;

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
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE__MODEL = UML_NAMESPACE__MODEL;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE__UUID = UML_NAMESPACE__UUID;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE__SUPERSEEDING_RELATIONSHIP = UML_NAMESPACE__SUPERSEEDING_RELATIONSHIP;

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
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE__DISPLAY_NAME = UML_NAMESPACE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE__PURPOSE = UML_NAMESPACE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGE__BODY = UML_NAMESPACE__BODY;

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
	 * The meta object id for the '{@link QWiki.Infrastructure.impl.UmlPackageableElementImpl <em>Uml Packageable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Infrastructure.impl.UmlPackageableElementImpl
	 * @see QWiki.Infrastructure.impl.InfrastructurePackageImpl#getUmlPackageableElement()
	 * @generated
	 */
	int UML_PACKAGEABLE_ELEMENT = 7;

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
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGEABLE_ELEMENT__DIRECTED_RELATIONSHIP = UML_NAMED_ELEMENT__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGEABLE_ELEMENT__RELATIONSHIP = UML_NAMED_ELEMENT__RELATIONSHIP;

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
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGEABLE_ELEMENT__MODEL = UML_NAMED_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGEABLE_ELEMENT__UUID = UML_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_PACKAGEABLE_ELEMENT__SUPERSEEDING_RELATIONSHIP = UML_NAMED_ELEMENT__SUPERSEEDING_RELATIONSHIP;

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
	 * Returns the meta object for class '{@link QWiki.Infrastructure.UmlAssociation <em>Uml Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Association</em>'.
	 * @see QWiki.Infrastructure.UmlAssociation
	 * @generated
	 */
	EClass getUmlAssociation();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.Infrastructure.UmlAssociation#isDerived <em>Is Derived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Derived</em>'.
	 * @see QWiki.Infrastructure.UmlAssociation#isDerived()
	 * @see #getUmlAssociation()
	 * @generated
	 */
	EAttribute getUmlAssociation_IsDerived();

	/**
	 * Returns the meta object for class '{@link QWiki.Infrastructure.UmlRelationship <em>Uml Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Relationship</em>'.
	 * @see QWiki.Infrastructure.UmlRelationship
	 * @generated
	 */
	EClass getUmlRelationship();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Infrastructure.UmlRelationship#getRelatedElement <em>Related Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Element</em>'.
	 * @see QWiki.Infrastructure.UmlRelationship#getRelatedElement()
	 * @see #getUmlRelationship()
	 * @generated
	 */
	EReference getUmlRelationship_RelatedElement();

	/**
	 * Returns the meta object for class '{@link QWiki.Infrastructure.UmlElement <em>Uml Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Element</em>'.
	 * @see QWiki.Infrastructure.UmlElement
	 * @generated
	 */
	EClass getUmlElement();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Infrastructure.UmlElement#getOwnedElement <em>Owned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Element</em>'.
	 * @see QWiki.Infrastructure.UmlElement#getOwnedElement()
	 * @see #getUmlElement()
	 * @generated
	 */
	EReference getUmlElement_OwnedElement();

	/**
	 * Returns the meta object for the reference '{@link QWiki.Infrastructure.UmlElement#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see QWiki.Infrastructure.UmlElement#getOwner()
	 * @see #getUmlElement()
	 * @generated
	 */
	EReference getUmlElement_Owner();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.Infrastructure.UmlElement#getOwnedComment <em>Owned Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Comment</em>'.
	 * @see QWiki.Infrastructure.UmlElement#getOwnedComment()
	 * @see #getUmlElement()
	 * @generated
	 */
	EReference getUmlElement_OwnedComment();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Infrastructure.UmlElement#getDirectedRelationship <em>Directed Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Directed Relationship</em>'.
	 * @see QWiki.Infrastructure.UmlElement#getDirectedRelationship()
	 * @see #getUmlElement()
	 * @generated
	 */
	EReference getUmlElement_DirectedRelationship();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Infrastructure.UmlElement#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relationship</em>'.
	 * @see QWiki.Infrastructure.UmlElement#getRelationship()
	 * @see #getUmlElement()
	 * @generated
	 */
	EReference getUmlElement_Relationship();

	/**
	 * Returns the meta object for the '{@link QWiki.Infrastructure.UmlElement#allOwnedElements() <em>All Owned Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Owned Elements</em>' operation.
	 * @see QWiki.Infrastructure.UmlElement#allOwnedElements()
	 * @generated
	 */
	EOperation getUmlElement__AllOwnedElements();

	/**
	 * Returns the meta object for the '{@link QWiki.Infrastructure.UmlElement#mustBeOwned() <em>Must Be Owned</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Must Be Owned</em>' operation.
	 * @see QWiki.Infrastructure.UmlElement#mustBeOwned()
	 * @generated
	 */
	EOperation getUmlElement__MustBeOwned();

	/**
	 * Returns the meta object for class '{@link QWiki.Infrastructure.UmlComment <em>Uml Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Comment</em>'.
	 * @see QWiki.Infrastructure.UmlComment
	 * @generated
	 */
	EClass getUmlComment();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.Infrastructure.UmlComment#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see QWiki.Infrastructure.UmlComment#getBody()
	 * @see #getUmlComment()
	 * @generated
	 */
	EAttribute getUmlComment_Body();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Infrastructure.UmlComment#getAnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotated Element</em>'.
	 * @see QWiki.Infrastructure.UmlComment#getAnnotatedElement()
	 * @see #getUmlComment()
	 * @generated
	 */
	EReference getUmlComment_AnnotatedElement();

	/**
	 * Returns the meta object for class '{@link QWiki.Infrastructure.UmlDirectedRelationship <em>Uml Directed Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Directed Relationship</em>'.
	 * @see QWiki.Infrastructure.UmlDirectedRelationship
	 * @generated
	 */
	EClass getUmlDirectedRelationship();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Infrastructure.UmlDirectedRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see QWiki.Infrastructure.UmlDirectedRelationship#getTarget()
	 * @see #getUmlDirectedRelationship()
	 * @generated
	 */
	EReference getUmlDirectedRelationship_Target();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Infrastructure.UmlDirectedRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see QWiki.Infrastructure.UmlDirectedRelationship#getSource()
	 * @see #getUmlDirectedRelationship()
	 * @generated
	 */
	EReference getUmlDirectedRelationship_Source();

	/**
	 * Returns the meta object for class '{@link QWiki.Infrastructure.UmlNamedElement <em>Uml Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Named Element</em>'.
	 * @see QWiki.Infrastructure.UmlNamedElement
	 * @generated
	 */
	EClass getUmlNamedElement();

	/**
	 * Returns the meta object for the reference '{@link QWiki.Infrastructure.UmlNamedElement#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Namespace</em>'.
	 * @see QWiki.Infrastructure.UmlNamedElement#getNamespace()
	 * @see #getUmlNamedElement()
	 * @generated
	 */
	EReference getUmlNamedElement_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.Infrastructure.UmlNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QWiki.Infrastructure.UmlNamedElement#getName()
	 * @see #getUmlNamedElement()
	 * @generated
	 */
	EAttribute getUmlNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.Infrastructure.UmlNamedElement#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see QWiki.Infrastructure.UmlNamedElement#getQualifiedName()
	 * @see #getUmlNamedElement()
	 * @generated
	 */
	EAttribute getUmlNamedElement_QualifiedName();

	/**
	 * Returns the meta object for the '{@link QWiki.Infrastructure.UmlNamedElement#allNamespaces() <em>All Namespaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Namespaces</em>' operation.
	 * @see QWiki.Infrastructure.UmlNamedElement#allNamespaces()
	 * @generated
	 */
	EOperation getUmlNamedElement__AllNamespaces();

	/**
	 * Returns the meta object for the '{@link QWiki.Infrastructure.UmlNamedElement#separator() <em>Separator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Separator</em>' operation.
	 * @see QWiki.Infrastructure.UmlNamedElement#separator()
	 * @generated
	 */
	EOperation getUmlNamedElement__Separator();

	/**
	 * Returns the meta object for the '{@link QWiki.Infrastructure.UmlNamedElement#qualifiedName() <em>Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Qualified Name</em>' operation.
	 * @see QWiki.Infrastructure.UmlNamedElement#qualifiedName()
	 * @generated
	 */
	EOperation getUmlNamedElement__QualifiedName();

	/**
	 * Returns the meta object for class '{@link QWiki.Infrastructure.UmlPackage <em>Uml Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Package</em>'.
	 * @see QWiki.Infrastructure.UmlPackage
	 * @generated
	 */
	EClass getUmlPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.Infrastructure.UmlPackage#getPackagedElement <em>Packaged Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Packaged Element</em>'.
	 * @see QWiki.Infrastructure.UmlPackage#getPackagedElement()
	 * @see #getUmlPackage()
	 * @generated
	 */
	EReference getUmlPackage_PackagedElement();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Infrastructure.UmlPackage#getNestedPackage <em>Nested Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nested Package</em>'.
	 * @see QWiki.Infrastructure.UmlPackage#getNestedPackage()
	 * @see #getUmlPackage()
	 * @generated
	 */
	EReference getUmlPackage_NestedPackage();

	/**
	 * Returns the meta object for the reference '{@link QWiki.Infrastructure.UmlPackage#getNestingPackage <em>Nesting Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nesting Package</em>'.
	 * @see QWiki.Infrastructure.UmlPackage#getNestingPackage()
	 * @see #getUmlPackage()
	 * @generated
	 */
	EReference getUmlPackage_NestingPackage();

	/**
	 * Returns the meta object for class '{@link QWiki.Infrastructure.UmlPackageableElement <em>Uml Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Packageable Element</em>'.
	 * @see QWiki.Infrastructure.UmlPackageableElement
	 * @generated
	 */
	EClass getUmlPackageableElement();

	/**
	 * Returns the meta object for class '{@link QWiki.Infrastructure.UmlNamespace <em>Uml Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uml Namespace</em>'.
	 * @see QWiki.Infrastructure.UmlNamespace
	 * @generated
	 */
	EClass getUmlNamespace();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Infrastructure.UmlNamespace#getOwnedMember <em>Owned Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Member</em>'.
	 * @see QWiki.Infrastructure.UmlNamespace#getOwnedMember()
	 * @see #getUmlNamespace()
	 * @generated
	 */
	EReference getUmlNamespace_OwnedMember();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Infrastructure.UmlNamespace#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Member</em>'.
	 * @see QWiki.Infrastructure.UmlNamespace#getMember()
	 * @see #getUmlNamespace()
	 * @generated
	 */
	EReference getUmlNamespace_Member();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InfrastructureFactory getInfrastructureFactory();

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
		 * The meta object literal for the '{@link QWiki.Infrastructure.impl.UmlAssociationImpl <em>Uml Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Infrastructure.impl.UmlAssociationImpl
		 * @see QWiki.Infrastructure.impl.InfrastructurePackageImpl#getUmlAssociation()
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
		 * The meta object literal for the '{@link QWiki.Infrastructure.impl.UmlRelationshipImpl <em>Uml Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Infrastructure.impl.UmlRelationshipImpl
		 * @see QWiki.Infrastructure.impl.InfrastructurePackageImpl#getUmlRelationship()
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
		 * The meta object literal for the '{@link QWiki.Infrastructure.impl.UmlElementImpl <em>Uml Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Infrastructure.impl.UmlElementImpl
		 * @see QWiki.Infrastructure.impl.InfrastructurePackageImpl#getUmlElement()
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
		 * The meta object literal for the '<em><b>Directed Relationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ELEMENT__DIRECTED_RELATIONSHIP = eINSTANCE.getUmlElement_DirectedRelationship();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_ELEMENT__RELATIONSHIP = eINSTANCE.getUmlElement_Relationship();

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
		 * The meta object literal for the '{@link QWiki.Infrastructure.impl.UmlCommentImpl <em>Uml Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Infrastructure.impl.UmlCommentImpl
		 * @see QWiki.Infrastructure.impl.InfrastructurePackageImpl#getUmlComment()
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
		 * The meta object literal for the '{@link QWiki.Infrastructure.impl.UmlDirectedRelationshipImpl <em>Uml Directed Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Infrastructure.impl.UmlDirectedRelationshipImpl
		 * @see QWiki.Infrastructure.impl.InfrastructurePackageImpl#getUmlDirectedRelationship()
		 * @generated
		 */
		EClass UML_DIRECTED_RELATIONSHIP = eINSTANCE.getUmlDirectedRelationship();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_DIRECTED_RELATIONSHIP__TARGET = eINSTANCE.getUmlDirectedRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_DIRECTED_RELATIONSHIP__SOURCE = eINSTANCE.getUmlDirectedRelationship_Source();

		/**
		 * The meta object literal for the '{@link QWiki.Infrastructure.impl.UmlNamedElementImpl <em>Uml Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Infrastructure.impl.UmlNamedElementImpl
		 * @see QWiki.Infrastructure.impl.InfrastructurePackageImpl#getUmlNamedElement()
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
		 * The meta object literal for the '{@link QWiki.Infrastructure.impl.UmlPackageImpl <em>Uml Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Infrastructure.impl.UmlPackageImpl
		 * @see QWiki.Infrastructure.impl.InfrastructurePackageImpl#getUmlPackage()
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
		 * The meta object literal for the '{@link QWiki.Infrastructure.impl.UmlPackageableElementImpl <em>Uml Packageable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Infrastructure.impl.UmlPackageableElementImpl
		 * @see QWiki.Infrastructure.impl.InfrastructurePackageImpl#getUmlPackageableElement()
		 * @generated
		 */
		EClass UML_PACKAGEABLE_ELEMENT = eINSTANCE.getUmlPackageableElement();

		/**
		 * The meta object literal for the '{@link QWiki.Infrastructure.impl.UmlNamespaceImpl <em>Uml Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Infrastructure.impl.UmlNamespaceImpl
		 * @see QWiki.Infrastructure.impl.InfrastructurePackageImpl#getUmlNamespace()
		 * @generated
		 */
		EClass UML_NAMESPACE = eINSTANCE.getUmlNamespace();

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

	}

} //InfrastructurePackage
