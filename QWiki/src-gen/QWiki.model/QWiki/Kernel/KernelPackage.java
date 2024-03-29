/**
 */
package QWiki.Kernel;

import QWiki.I18N.I18NPackage;
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
 * @see QWiki.Kernel.KernelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface KernelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Kernel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schumann.engineering/qwiki/1.0/kernel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "QWiki.Kernel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KernelPackage eINSTANCE = QWiki.Kernel.impl.KernelPackageImpl.init();

	/**
	 * The meta object id for the '{@link QWiki.Kernel.impl.ModelTaggedElementImpl <em>Model Tagged Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Kernel.impl.ModelTaggedElementImpl
	 * @see QWiki.Kernel.impl.KernelPackageImpl#getModelTaggedElement()
	 * @generated
	 */
	int MODEL_TAGGED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TAGGED_ELEMENT__OWNED_ELEMENT = InfrastructurePackage.UML_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TAGGED_ELEMENT__OWNER = InfrastructurePackage.UML_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TAGGED_ELEMENT__OWNED_COMMENT = InfrastructurePackage.UML_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TAGGED_ELEMENT__DIRECTED_RELATIONSHIP = InfrastructurePackage.UML_ELEMENT__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TAGGED_ELEMENT__RELATIONSHIP = InfrastructurePackage.UML_ELEMENT__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TAGGED_ELEMENT__TAG = InfrastructurePackage.UML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TAGGED_ELEMENT__CUSTOM_PROPERTY = InfrastructurePackage.UML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model Tagged Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TAGGED_ELEMENT_FEATURE_COUNT = InfrastructurePackage.UML_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TAGGED_ELEMENT___ALL_OWNED_ELEMENTS = InfrastructurePackage.UML_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TAGGED_ELEMENT___MUST_BE_OWNED = InfrastructurePackage.UML_ELEMENT___MUST_BE_OWNED;

	/**
	 * The number of operations of the '<em>Model Tagged Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TAGGED_ELEMENT_OPERATION_COUNT = InfrastructurePackage.UML_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.Kernel.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Kernel.impl.ModelElementImpl
	 * @see QWiki.Kernel.impl.KernelPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__OWNED_ELEMENT = MODEL_TAGGED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__OWNER = MODEL_TAGGED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__OWNED_COMMENT = MODEL_TAGGED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DIRECTED_RELATIONSHIP = MODEL_TAGGED_ELEMENT__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__RELATIONSHIP = MODEL_TAGGED_ELEMENT__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__TAG = MODEL_TAGGED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__CUSTOM_PROPERTY = MODEL_TAGGED_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__MODEL = MODEL_TAGGED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__UUID = MODEL_TAGGED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__SUPERSEEDING_RELATIONSHIP = MODEL_TAGGED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = MODEL_TAGGED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT___ALL_OWNED_ELEMENTS = MODEL_TAGGED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT___MUST_BE_OWNED = MODEL_TAGGED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT___MODEL = MODEL_TAGGED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT___OID = MODEL_TAGGED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_OPERATION_COUNT = MODEL_TAGGED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link QWiki.Kernel.impl.ModelDomainImpl <em>Model Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Kernel.impl.ModelDomainImpl
	 * @see QWiki.Kernel.impl.KernelPackageImpl#getModelDomain()
	 * @generated
	 */
	int MODEL_DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN__OWNED_ELEMENT = I18NPackage.I1_8N_NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN__OWNER = I18NPackage.I1_8N_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN__OWNED_COMMENT = I18NPackage.I1_8N_NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN__DIRECTED_RELATIONSHIP = I18NPackage.I1_8N_NAMED_ELEMENT__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN__RELATIONSHIP = I18NPackage.I1_8N_NAMED_ELEMENT__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN__TAG = I18NPackage.I1_8N_NAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN__CUSTOM_PROPERTY = I18NPackage.I1_8N_NAMED_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN__MODEL = I18NPackage.I1_8N_NAMED_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN__UUID = I18NPackage.I1_8N_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN__SUPERSEEDING_RELATIONSHIP = I18NPackage.I1_8N_NAMED_ELEMENT__SUPERSEEDING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN__NAMESPACE = I18NPackage.I1_8N_NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN__NAME = I18NPackage.I1_8N_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN__QUALIFIED_NAME = I18NPackage.I1_8N_NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN__DISPLAY_NAME = I18NPackage.I1_8N_NAMED_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Domain Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN__DOMAIN_ELEMENT = I18NPackage.I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN_FEATURE_COUNT = I18NPackage.I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN___ALL_OWNED_ELEMENTS = I18NPackage.I1_8N_NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN___MUST_BE_OWNED = I18NPackage.I1_8N_NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN___MODEL = I18NPackage.I1_8N_NAMED_ELEMENT___MODEL;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN___OID = I18NPackage.I1_8N_NAMED_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN___ALL_NAMESPACES = I18NPackage.I1_8N_NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN___SEPARATOR = I18NPackage.I1_8N_NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN___QUALIFIED_NAME = I18NPackage.I1_8N_NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>All Domain Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN___ALL_DOMAIN_ELEMENT = I18NPackage.I1_8N_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Model Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN_OPERATION_COUNT = I18NPackage.I1_8N_NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link QWiki.Kernel.impl.ModelDomainElementImpl <em>Model Domain Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Kernel.impl.ModelDomainElementImpl
	 * @see QWiki.Kernel.impl.KernelPackageImpl#getModelDomainElement()
	 * @generated
	 */
	int MODEL_DOMAIN_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN_ELEMENT__OWNED_ELEMENT = InfrastructurePackage.UML_NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN_ELEMENT__OWNER = InfrastructurePackage.UML_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN_ELEMENT__OWNED_COMMENT = InfrastructurePackage.UML_NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN_ELEMENT__DIRECTED_RELATIONSHIP = InfrastructurePackage.UML_NAMED_ELEMENT__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN_ELEMENT__RELATIONSHIP = InfrastructurePackage.UML_NAMED_ELEMENT__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN_ELEMENT__TAG = InfrastructurePackage.UML_NAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN_ELEMENT__CUSTOM_PROPERTY = InfrastructurePackage.UML_NAMED_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN_ELEMENT__MODEL = InfrastructurePackage.UML_NAMED_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN_ELEMENT__UUID = InfrastructurePackage.UML_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN_ELEMENT__SUPERSEEDING_RELATIONSHIP = InfrastructurePackage.UML_NAMED_ELEMENT__SUPERSEEDING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN_ELEMENT__NAMESPACE = InfrastructurePackage.UML_NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN_ELEMENT__NAME = InfrastructurePackage.UML_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN_ELEMENT__QUALIFIED_NAME = InfrastructurePackage.UML_NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN_ELEMENT__DOMAIN = InfrastructurePackage.UML_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assigned Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN_ELEMENT__ASSIGNED_DOMAIN = InfrastructurePackage.UML_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model Domain Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN_ELEMENT_FEATURE_COUNT = InfrastructurePackage.UML_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN_ELEMENT___ALL_OWNED_ELEMENTS = InfrastructurePackage.UML_NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN_ELEMENT___MUST_BE_OWNED = InfrastructurePackage.UML_NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN_ELEMENT___MODEL = InfrastructurePackage.UML_NAMED_ELEMENT___MODEL;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN_ELEMENT___OID = InfrastructurePackage.UML_NAMED_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN_ELEMENT___ALL_NAMESPACES = InfrastructurePackage.UML_NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN_ELEMENT___SEPARATOR = InfrastructurePackage.UML_NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN_ELEMENT___QUALIFIED_NAME = InfrastructurePackage.UML_NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Model Domain Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_DOMAIN_ELEMENT_OPERATION_COUNT = InfrastructurePackage.UML_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.Kernel.impl.ModelRootImpl <em>Model Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Kernel.impl.ModelRootImpl
	 * @see QWiki.Kernel.impl.KernelPackageImpl#getModelRoot()
	 * @generated
	 */
	int MODEL_ROOT = 2;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__OWNED_ELEMENT = InfrastructurePackage.UML_PACKAGE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__OWNER = InfrastructurePackage.UML_PACKAGE__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__OWNED_COMMENT = InfrastructurePackage.UML_PACKAGE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__DIRECTED_RELATIONSHIP = InfrastructurePackage.UML_PACKAGE__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__RELATIONSHIP = InfrastructurePackage.UML_PACKAGE__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__TAG = InfrastructurePackage.UML_PACKAGE__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__CUSTOM_PROPERTY = InfrastructurePackage.UML_PACKAGE__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__MODEL = InfrastructurePackage.UML_PACKAGE__MODEL;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__UUID = InfrastructurePackage.UML_PACKAGE__UUID;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__SUPERSEEDING_RELATIONSHIP = InfrastructurePackage.UML_PACKAGE__SUPERSEEDING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__NAMESPACE = InfrastructurePackage.UML_PACKAGE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__NAME = InfrastructurePackage.UML_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__QUALIFIED_NAME = InfrastructurePackage.UML_PACKAGE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__DISPLAY_NAME = InfrastructurePackage.UML_PACKAGE__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__PURPOSE = InfrastructurePackage.UML_PACKAGE__PURPOSE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__BODY = InfrastructurePackage.UML_PACKAGE__BODY;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__OWNED_MEMBER = InfrastructurePackage.UML_PACKAGE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__MEMBER = InfrastructurePackage.UML_PACKAGE__MEMBER;

	/**
	 * The feature id for the '<em><b>Packaged Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__PACKAGED_ELEMENT = InfrastructurePackage.UML_PACKAGE__PACKAGED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Nested Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__NESTED_PACKAGE = InfrastructurePackage.UML_PACKAGE__NESTED_PACKAGE;

	/**
	 * The feature id for the '<em><b>Nesting Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__NESTING_PACKAGE = InfrastructurePackage.UML_PACKAGE__NESTING_PACKAGE;

	/**
	 * The feature id for the '<em><b>Owned Model Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT__OWNED_MODEL_ELEMENT = InfrastructurePackage.UML_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT_FEATURE_COUNT = InfrastructurePackage.UML_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT___ALL_OWNED_ELEMENTS = InfrastructurePackage.UML_PACKAGE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT___MUST_BE_OWNED = InfrastructurePackage.UML_PACKAGE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT___MODEL = InfrastructurePackage.UML_PACKAGE___MODEL;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT___OID = InfrastructurePackage.UML_PACKAGE___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT___ALL_NAMESPACES = InfrastructurePackage.UML_PACKAGE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT___SEPARATOR = InfrastructurePackage.UML_PACKAGE___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT___QUALIFIED_NAME = InfrastructurePackage.UML_PACKAGE___QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Model Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROOT_OPERATION_COUNT = InfrastructurePackage.UML_PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.Kernel.impl.DO_NOT_USE_RelationshipImpl <em>DO NOT USE Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Kernel.impl.DO_NOT_USE_RelationshipImpl
	 * @see QWiki.Kernel.impl.KernelPackageImpl#getDO_NOT_USE_Relationship()
	 * @generated
	 */
	int DO_NOT_USE_RELATIONSHIP = 4;

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
	 * The meta object id for the '{@link QWiki.Kernel.impl.DO_NOT_USE_RelationshipTypeImpl <em>DO NOT USE Relationship Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Kernel.impl.DO_NOT_USE_RelationshipTypeImpl
	 * @see QWiki.Kernel.impl.KernelPackageImpl#getDO_NOT_USE_RelationshipType()
	 * @generated
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__OWNED_ELEMENT = I18NPackage.I1_8N_NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__OWNER = I18NPackage.I1_8N_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__OWNED_COMMENT = I18NPackage.I1_8N_NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__DIRECTED_RELATIONSHIP = I18NPackage.I1_8N_NAMED_ELEMENT__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__RELATIONSHIP = I18NPackage.I1_8N_NAMED_ELEMENT__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__TAG = I18NPackage.I1_8N_NAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__CUSTOM_PROPERTY = I18NPackage.I1_8N_NAMED_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__MODEL = I18NPackage.I1_8N_NAMED_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__UUID = I18NPackage.I1_8N_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__SUPERSEEDING_RELATIONSHIP = I18NPackage.I1_8N_NAMED_ELEMENT__SUPERSEEDING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__NAMESPACE = I18NPackage.I1_8N_NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__NAME = I18NPackage.I1_8N_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__QUALIFIED_NAME = I18NPackage.I1_8N_NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE__DISPLAY_NAME = I18NPackage.I1_8N_NAMED_ELEMENT__DISPLAY_NAME;

	/**
	 * The number of structural features of the '<em>DO NOT USE Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE_FEATURE_COUNT = I18NPackage.I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___ALL_OWNED_ELEMENTS = I18NPackage.I1_8N_NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___MUST_BE_OWNED = I18NPackage.I1_8N_NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___MODEL = I18NPackage.I1_8N_NAMED_ELEMENT___MODEL;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___OID = I18NPackage.I1_8N_NAMED_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___ALL_NAMESPACES = I18NPackage.I1_8N_NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___SEPARATOR = I18NPackage.I1_8N_NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE___QUALIFIED_NAME = I18NPackage.I1_8N_NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>DO NOT USE Relationship Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_NOT_USE_RELATIONSHIP_TYPE_OPERATION_COUNT = I18NPackage.I1_8N_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.Kernel.impl.SuperseedingRelationshipImpl <em>Superseeding Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Kernel.impl.SuperseedingRelationshipImpl
	 * @see QWiki.Kernel.impl.KernelPackageImpl#getSuperseedingRelationship()
	 * @generated
	 */
	int SUPERSEEDING_RELATIONSHIP = 6;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP__OWNED_ELEMENT = InfrastructurePackage.UML_DIRECTED_RELATIONSHIP__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP__OWNER = InfrastructurePackage.UML_DIRECTED_RELATIONSHIP__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP__OWNED_COMMENT = InfrastructurePackage.UML_DIRECTED_RELATIONSHIP__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP__DIRECTED_RELATIONSHIP = InfrastructurePackage.UML_DIRECTED_RELATIONSHIP__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP__RELATIONSHIP = InfrastructurePackage.UML_DIRECTED_RELATIONSHIP__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Related Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP__RELATED_ELEMENT = InfrastructurePackage.UML_DIRECTED_RELATIONSHIP__RELATED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP__TARGET = InfrastructurePackage.UML_DIRECTED_RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP__SOURCE = InfrastructurePackage.UML_DIRECTED_RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Superseeding Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP__SUPERSEEDING_TYPE = InfrastructurePackage.UML_DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Superseeding Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP_FEATURE_COUNT = InfrastructurePackage.UML_DIRECTED_RELATIONSHIP_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP___ALL_OWNED_ELEMENTS = InfrastructurePackage.UML_DIRECTED_RELATIONSHIP___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP___MUST_BE_OWNED = InfrastructurePackage.UML_DIRECTED_RELATIONSHIP___MUST_BE_OWNED;

	/**
	 * The number of operations of the '<em>Superseeding Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPERSEEDING_RELATIONSHIP_OPERATION_COUNT = InfrastructurePackage.UML_DIRECTED_RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.Kernel.SuperseedingType <em>Superseeding Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Kernel.SuperseedingType
	 * @see QWiki.Kernel.impl.KernelPackageImpl#getSuperseedingType()
	 * @generated
	 */
	int SUPERSEEDING_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link QWiki.Kernel.ModelDomain <em>Model Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Domain</em>'.
	 * @see QWiki.Kernel.ModelDomain
	 * @generated
	 */
	EClass getModelDomain();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Kernel.ModelDomain#getDomainElement <em>Domain Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Domain Element</em>'.
	 * @see QWiki.Kernel.ModelDomain#getDomainElement()
	 * @see #getModelDomain()
	 * @generated
	 */
	EReference getModelDomain_DomainElement();

	/**
	 * Returns the meta object for the '{@link QWiki.Kernel.ModelDomain#allDomainElement() <em>All Domain Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>All Domain Element</em>' operation.
	 * @see QWiki.Kernel.ModelDomain#allDomainElement()
	 * @generated
	 */
	EOperation getModelDomain__AllDomainElement();

	/**
	 * Returns the meta object for class '{@link QWiki.Kernel.ModelDomainElement <em>Model Domain Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Domain Element</em>'.
	 * @see QWiki.Kernel.ModelDomainElement
	 * @generated
	 */
	EClass getModelDomainElement();

	/**
	 * Returns the meta object for the reference '{@link QWiki.Kernel.ModelDomainElement#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see QWiki.Kernel.ModelDomainElement#getDomain()
	 * @see #getModelDomainElement()
	 * @generated
	 */
	EReference getModelDomainElement_Domain();

	/**
	 * Returns the meta object for the reference '{@link QWiki.Kernel.ModelDomainElement#getAssignedDomain <em>Assigned Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assigned Domain</em>'.
	 * @see QWiki.Kernel.ModelDomainElement#getAssignedDomain()
	 * @see #getModelDomainElement()
	 * @generated
	 */
	EReference getModelDomainElement_AssignedDomain();

	/**
	 * Returns the meta object for class '{@link QWiki.Kernel.ModelRoot <em>Model Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Root</em>'.
	 * @see QWiki.Kernel.ModelRoot
	 * @generated
	 */
	EClass getModelRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.Kernel.ModelRoot#getOwnedModelElement <em>Owned Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Model Element</em>'.
	 * @see QWiki.Kernel.ModelRoot#getOwnedModelElement()
	 * @see #getModelRoot()
	 * @generated
	 */
	EReference getModelRoot_OwnedModelElement();

	/**
	 * Returns the meta object for class '{@link QWiki.Kernel.ModelTaggedElement <em>Model Tagged Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Tagged Element</em>'.
	 * @see QWiki.Kernel.ModelTaggedElement
	 * @generated
	 */
	EClass getModelTaggedElement();

	/**
	 * Returns the meta object for the attribute list '{@link QWiki.Kernel.ModelTaggedElement#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tag</em>'.
	 * @see QWiki.Kernel.ModelTaggedElement#getTag()
	 * @see #getModelTaggedElement()
	 * @generated
	 */
	EAttribute getModelTaggedElement_Tag();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.Kernel.ModelTaggedElement#getCustomProperty <em>Custom Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Custom Property</em>'.
	 * @see QWiki.Kernel.ModelTaggedElement#getCustomProperty()
	 * @see #getModelTaggedElement()
	 * @generated
	 */
	EReference getModelTaggedElement_CustomProperty();

	/**
	 * Returns the meta object for class '{@link QWiki.Kernel.DO_NOT_USE_Relationship <em>DO NOT USE Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DO NOT USE Relationship</em>'.
	 * @see QWiki.Kernel.DO_NOT_USE_Relationship
	 * @generated
	 */
	EClass getDO_NOT_USE_Relationship();

	/**
	 * Returns the meta object for class '{@link QWiki.Kernel.DO_NOT_USE_RelationshipType <em>DO NOT USE Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DO NOT USE Relationship Type</em>'.
	 * @see QWiki.Kernel.DO_NOT_USE_RelationshipType
	 * @generated
	 */
	EClass getDO_NOT_USE_RelationshipType();

	/**
	 * Returns the meta object for class '{@link QWiki.Kernel.SuperseedingRelationship <em>Superseeding Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Superseeding Relationship</em>'.
	 * @see QWiki.Kernel.SuperseedingRelationship
	 * @generated
	 */
	EClass getSuperseedingRelationship();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.Kernel.SuperseedingRelationship#getSuperseedingType <em>Superseeding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Superseeding Type</em>'.
	 * @see QWiki.Kernel.SuperseedingRelationship#getSuperseedingType()
	 * @see #getSuperseedingRelationship()
	 * @generated
	 */
	EAttribute getSuperseedingRelationship_SuperseedingType();

	/**
	 * Returns the meta object for class '{@link QWiki.Kernel.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see QWiki.Kernel.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the container reference '{@link QWiki.Kernel.ModelElement#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Model</em>'.
	 * @see QWiki.Kernel.ModelElement#getModel()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_Model();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.Kernel.ModelElement#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see QWiki.Kernel.ModelElement#getUuid()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Uuid();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Kernel.ModelElement#getSuperseedingRelationship <em>Superseeding Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Superseeding Relationship</em>'.
	 * @see QWiki.Kernel.ModelElement#getSuperseedingRelationship()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_SuperseedingRelationship();

	/**
	 * Returns the meta object for the '{@link QWiki.Kernel.ModelElement#model() <em>Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Model</em>' operation.
	 * @see QWiki.Kernel.ModelElement#model()
	 * @generated
	 */
	EOperation getModelElement__Model();

	/**
	 * Returns the meta object for the '{@link QWiki.Kernel.ModelElement#oid() <em>Oid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Oid</em>' operation.
	 * @see QWiki.Kernel.ModelElement#oid()
	 * @generated
	 */
	EOperation getModelElement__Oid();

	/**
	 * Returns the meta object for enum '{@link QWiki.Kernel.SuperseedingType <em>Superseeding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Superseeding Type</em>'.
	 * @see QWiki.Kernel.SuperseedingType
	 * @generated
	 */
	EEnum getSuperseedingType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KernelFactory getKernelFactory();

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
		 * The meta object literal for the '{@link QWiki.Kernel.impl.ModelDomainImpl <em>Model Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Kernel.impl.ModelDomainImpl
		 * @see QWiki.Kernel.impl.KernelPackageImpl#getModelDomain()
		 * @generated
		 */
		EClass MODEL_DOMAIN = eINSTANCE.getModelDomain();

		/**
		 * The meta object literal for the '<em><b>Domain Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_DOMAIN__DOMAIN_ELEMENT = eINSTANCE.getModelDomain_DomainElement();

		/**
		 * The meta object literal for the '<em><b>All Domain Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL_DOMAIN___ALL_DOMAIN_ELEMENT = eINSTANCE.getModelDomain__AllDomainElement();

		/**
		 * The meta object literal for the '{@link QWiki.Kernel.impl.ModelDomainElementImpl <em>Model Domain Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Kernel.impl.ModelDomainElementImpl
		 * @see QWiki.Kernel.impl.KernelPackageImpl#getModelDomainElement()
		 * @generated
		 */
		EClass MODEL_DOMAIN_ELEMENT = eINSTANCE.getModelDomainElement();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_DOMAIN_ELEMENT__DOMAIN = eINSTANCE.getModelDomainElement_Domain();

		/**
		 * The meta object literal for the '<em><b>Assigned Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_DOMAIN_ELEMENT__ASSIGNED_DOMAIN = eINSTANCE.getModelDomainElement_AssignedDomain();

		/**
		 * The meta object literal for the '{@link QWiki.Kernel.impl.ModelRootImpl <em>Model Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Kernel.impl.ModelRootImpl
		 * @see QWiki.Kernel.impl.KernelPackageImpl#getModelRoot()
		 * @generated
		 */
		EClass MODEL_ROOT = eINSTANCE.getModelRoot();

		/**
		 * The meta object literal for the '<em><b>Owned Model Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ROOT__OWNED_MODEL_ELEMENT = eINSTANCE.getModelRoot_OwnedModelElement();

		/**
		 * The meta object literal for the '{@link QWiki.Kernel.impl.ModelTaggedElementImpl <em>Model Tagged Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Kernel.impl.ModelTaggedElementImpl
		 * @see QWiki.Kernel.impl.KernelPackageImpl#getModelTaggedElement()
		 * @generated
		 */
		EClass MODEL_TAGGED_ELEMENT = eINSTANCE.getModelTaggedElement();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_TAGGED_ELEMENT__TAG = eINSTANCE.getModelTaggedElement_Tag();

		/**
		 * The meta object literal for the '<em><b>Custom Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_TAGGED_ELEMENT__CUSTOM_PROPERTY = eINSTANCE.getModelTaggedElement_CustomProperty();

		/**
		 * The meta object literal for the '{@link QWiki.Kernel.impl.DO_NOT_USE_RelationshipImpl <em>DO NOT USE Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Kernel.impl.DO_NOT_USE_RelationshipImpl
		 * @see QWiki.Kernel.impl.KernelPackageImpl#getDO_NOT_USE_Relationship()
		 * @generated
		 */
		EClass DO_NOT_USE_RELATIONSHIP = eINSTANCE.getDO_NOT_USE_Relationship();

		/**
		 * The meta object literal for the '{@link QWiki.Kernel.impl.DO_NOT_USE_RelationshipTypeImpl <em>DO NOT USE Relationship Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Kernel.impl.DO_NOT_USE_RelationshipTypeImpl
		 * @see QWiki.Kernel.impl.KernelPackageImpl#getDO_NOT_USE_RelationshipType()
		 * @generated
		 */
		EClass DO_NOT_USE_RELATIONSHIP_TYPE = eINSTANCE.getDO_NOT_USE_RelationshipType();

		/**
		 * The meta object literal for the '{@link QWiki.Kernel.impl.SuperseedingRelationshipImpl <em>Superseeding Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Kernel.impl.SuperseedingRelationshipImpl
		 * @see QWiki.Kernel.impl.KernelPackageImpl#getSuperseedingRelationship()
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
		 * The meta object literal for the '{@link QWiki.Kernel.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Kernel.impl.ModelElementImpl
		 * @see QWiki.Kernel.impl.KernelPackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__MODEL = eINSTANCE.getModelElement_Model();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__UUID = eINSTANCE.getModelElement_Uuid();

		/**
		 * The meta object literal for the '<em><b>Superseeding Relationship</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__SUPERSEEDING_RELATIONSHIP = eINSTANCE.getModelElement_SuperseedingRelationship();

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
		 * The meta object literal for the '{@link QWiki.Kernel.SuperseedingType <em>Superseeding Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Kernel.SuperseedingType
		 * @see QWiki.Kernel.impl.KernelPackageImpl#getSuperseedingType()
		 * @generated
		 */
		EEnum SUPERSEEDING_TYPE = eINSTANCE.getSuperseedingType();

	}

} //KernelPackage
