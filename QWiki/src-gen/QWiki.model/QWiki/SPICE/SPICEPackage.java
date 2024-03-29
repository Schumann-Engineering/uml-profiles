/**
 */
package QWiki.SPICE;

import QWiki.I18N.I18NPackage;
import QWiki.RASCI.RASCIPackage;

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
 * @see QWiki.SPICE.SPICEFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface SPICEPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SPICE";

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
	String eNS_PREFIX = "QWiki.SPICE";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SPICEPackage eINSTANCE = QWiki.SPICE.impl.SPICEPackageImpl.init();

	/**
	 * The meta object id for the '{@link QWiki.SPICE.impl.SpiceElementImpl <em>Spice Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.SPICE.impl.SpiceElementImpl
	 * @see QWiki.SPICE.impl.SPICEPackageImpl#getSpiceElement()
	 * @generated
	 */
	int SPICE_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__OWNED_ELEMENT = RASCIPackage.RASCI_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__OWNER = RASCIPackage.RASCI_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__OWNED_COMMENT = RASCIPackage.RASCI_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__DIRECTED_RELATIONSHIP = RASCIPackage.RASCI_ELEMENT__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__RELATIONSHIP = RASCIPackage.RASCI_ELEMENT__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__TAG = RASCIPackage.RASCI_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__CUSTOM_PROPERTY = RASCIPackage.RASCI_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__MODEL = RASCIPackage.RASCI_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__UUID = RASCIPackage.RASCI_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__SUPERSEEDING_RELATIONSHIP = RASCIPackage.RASCI_ELEMENT__SUPERSEEDING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__NAMESPACE = RASCIPackage.RASCI_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__NAME = RASCIPackage.RASCI_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__QUALIFIED_NAME = RASCIPackage.RASCI_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__DISPLAY_NAME = RASCIPackage.RASCI_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__PURPOSE = RASCIPackage.RASCI_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__BODY = RASCIPackage.RASCI_ELEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Responsible Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__RESPONSIBLE_ROLE = RASCIPackage.RASCI_ELEMENT__RESPONSIBLE_ROLE;

	/**
	 * The feature id for the '<em><b>Accountable Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__ACCOUNTABLE_ROLE = RASCIPackage.RASCI_ELEMENT__ACCOUNTABLE_ROLE;

	/**
	 * The feature id for the '<em><b>Supporting Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__SUPPORTING_ROLE = RASCIPackage.RASCI_ELEMENT__SUPPORTING_ROLE;

	/**
	 * The feature id for the '<em><b>Consulting Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__CONSULTING_ROLE = RASCIPackage.RASCI_ELEMENT__CONSULTING_ROLE;

	/**
	 * The feature id for the '<em><b>Informed Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__INFORMED_ROLE = RASCIPackage.RASCI_ELEMENT__INFORMED_ROLE;

	/**
	 * The feature id for the '<em><b>Owning Process Reference Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL = RASCIPackage.RASCI_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__NUMBER = RASCIPackage.RASCI_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Facilitated Section</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__FACILITATED_SECTION = RASCIPackage.RASCI_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owning Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__OWNING_ROLE = RASCIPackage.RASCI_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Managing Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__MANAGING_ROLE = RASCIPackage.RASCI_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Participating Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__PARTICIPATING_ROLE = RASCIPackage.RASCI_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT__ROLE = RASCIPackage.RASCI_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Spice Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT_FEATURE_COUNT = RASCIPackage.RASCI_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___ALL_OWNED_ELEMENTS = RASCIPackage.RASCI_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___MUST_BE_OWNED = RASCIPackage.RASCI_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___MODEL = RASCIPackage.RASCI_ELEMENT___MODEL;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___OID = RASCIPackage.RASCI_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___ALL_NAMESPACES = RASCIPackage.RASCI_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___SEPARATOR = RASCIPackage.RASCI_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT___QUALIFIED_NAME = RASCIPackage.RASCI_ELEMENT___QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Spice Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_ELEMENT_OPERATION_COUNT = RASCIPackage.RASCI_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.SPICE.impl.SpiceBasePractiseImpl <em>Spice Base Practise</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.SPICE.impl.SpiceBasePractiseImpl
	 * @see QWiki.SPICE.impl.SPICEPackageImpl#getSpiceBasePractise()
	 * @generated
	 */
	int SPICE_BASE_PRACTISE = 0;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__OWNED_ELEMENT = SPICE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__OWNER = SPICE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__OWNED_COMMENT = SPICE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__DIRECTED_RELATIONSHIP = SPICE_ELEMENT__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__RELATIONSHIP = SPICE_ELEMENT__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__TAG = SPICE_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__CUSTOM_PROPERTY = SPICE_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__MODEL = SPICE_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__UUID = SPICE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__SUPERSEEDING_RELATIONSHIP = SPICE_ELEMENT__SUPERSEEDING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__NAMESPACE = SPICE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__NAME = SPICE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__QUALIFIED_NAME = SPICE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__DISPLAY_NAME = SPICE_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__PURPOSE = SPICE_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__BODY = SPICE_ELEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Responsible Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__RESPONSIBLE_ROLE = SPICE_ELEMENT__RESPONSIBLE_ROLE;

	/**
	 * The feature id for the '<em><b>Accountable Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__ACCOUNTABLE_ROLE = SPICE_ELEMENT__ACCOUNTABLE_ROLE;

	/**
	 * The feature id for the '<em><b>Supporting Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__SUPPORTING_ROLE = SPICE_ELEMENT__SUPPORTING_ROLE;

	/**
	 * The feature id for the '<em><b>Consulting Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__CONSULTING_ROLE = SPICE_ELEMENT__CONSULTING_ROLE;

	/**
	 * The feature id for the '<em><b>Informed Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__INFORMED_ROLE = SPICE_ELEMENT__INFORMED_ROLE;

	/**
	 * The feature id for the '<em><b>Owning Process Reference Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__OWNING_PROCESS_REFERENCE_MODEL = SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__NUMBER = SPICE_ELEMENT__NUMBER;

	/**
	 * The feature id for the '<em><b>Facilitated Section</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__FACILITATED_SECTION = SPICE_ELEMENT__FACILITATED_SECTION;

	/**
	 * The feature id for the '<em><b>Owning Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__OWNING_ROLE = SPICE_ELEMENT__OWNING_ROLE;

	/**
	 * The feature id for the '<em><b>Managing Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__MANAGING_ROLE = SPICE_ELEMENT__MANAGING_ROLE;

	/**
	 * The feature id for the '<em><b>Participating Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__PARTICIPATING_ROLE = SPICE_ELEMENT__PARTICIPATING_ROLE;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__ROLE = SPICE_ELEMENT__ROLE;

	/**
	 * The feature id for the '<em><b>Owning Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__OWNING_PROCESS = SPICE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Facilitated Outcome</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__FACILITATED_OUTCOME = SPICE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Facilitated Work Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE__FACILITATED_WORK_PRODUCT = SPICE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Spice Base Practise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE_FEATURE_COUNT = SPICE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE___ALL_OWNED_ELEMENTS = SPICE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE___MUST_BE_OWNED = SPICE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE___MODEL = SPICE_ELEMENT___MODEL;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE___OID = SPICE_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE___ALL_NAMESPACES = SPICE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE___SEPARATOR = SPICE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE___QUALIFIED_NAME = SPICE_ELEMENT___QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Spice Base Practise</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPICE_BASE_PRACTISE_OPERATION_COUNT = SPICE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.SPICE.impl.ProcessReferenceModelImpl <em>Process Reference Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.SPICE.impl.ProcessReferenceModelImpl
	 * @see QWiki.SPICE.impl.SPICEPackageImpl#getProcessReferenceModel()
	 * @generated
	 */
	int PROCESS_REFERENCE_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__OWNED_ELEMENT = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__OWNER = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__OWNED_COMMENT = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__DIRECTED_RELATIONSHIP = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__RELATIONSHIP = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__TAG = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__CUSTOM_PROPERTY = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__MODEL = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__UUID = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__SUPERSEEDING_RELATIONSHIP = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__SUPERSEEDING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__NAMESPACE = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__NAME = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__QUALIFIED_NAME = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__DISPLAY_NAME = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__PURPOSE = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__BODY = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Is Non Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__IS_NON_STANDARD = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prm Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__PRM_DOMAIN = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Spice Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL__OWNED_SPICE_ELEMENT = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Process Reference Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL_FEATURE_COUNT = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___ALL_OWNED_ELEMENTS = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___MUST_BE_OWNED = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___MODEL = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT___MODEL;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___OID = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___ALL_NAMESPACES = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___SEPARATOR = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___QUALIFIED_NAME = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT___QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Oid For Domain</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL___OID_FOR_DOMAIN = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Process Reference Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_REFERENCE_MODEL_OPERATION_COUNT = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link QWiki.SPICE.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.SPICE.impl.ProcessImpl
	 * @see QWiki.SPICE.impl.SPICEPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 3;

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
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__DIRECTED_RELATIONSHIP = SPICE_ELEMENT__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__RELATIONSHIP = SPICE_ELEMENT__RELATIONSHIP;

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
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__MODEL = SPICE_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__UUID = SPICE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__SUPERSEEDING_RELATIONSHIP = SPICE_ELEMENT__SUPERSEEDING_RELATIONSHIP;

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
	 * The feature id for the '<em><b>Facilitated Section</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__FACILITATED_SECTION = SPICE_ELEMENT__FACILITATED_SECTION;

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
	 * The meta object id for the '{@link QWiki.SPICE.impl.ProcessGroupImpl <em>Process Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.SPICE.impl.ProcessGroupImpl
	 * @see QWiki.SPICE.impl.SPICEPackageImpl#getProcessGroup()
	 * @generated
	 */
	int PROCESS_GROUP = 4;

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
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__DIRECTED_RELATIONSHIP = SPICE_ELEMENT__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__RELATIONSHIP = SPICE_ELEMENT__RELATIONSHIP;

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
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__MODEL = SPICE_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__UUID = SPICE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__SUPERSEEDING_RELATIONSHIP = SPICE_ELEMENT__SUPERSEEDING_RELATIONSHIP;

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
	 * The feature id for the '<em><b>Facilitated Section</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_GROUP__FACILITATED_SECTION = SPICE_ELEMENT__FACILITATED_SECTION;

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
	 * The meta object id for the '{@link QWiki.SPICE.impl.OutcomeImpl <em>Outcome</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.SPICE.impl.OutcomeImpl
	 * @see QWiki.SPICE.impl.SPICEPackageImpl#getOutcome()
	 * @generated
	 */
	int OUTCOME = 5;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__OWNED_ELEMENT = I18NPackage.I1_8N_NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__OWNER = I18NPackage.I1_8N_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__OWNED_COMMENT = I18NPackage.I1_8N_NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__DIRECTED_RELATIONSHIP = I18NPackage.I1_8N_NAMED_ELEMENT__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__RELATIONSHIP = I18NPackage.I1_8N_NAMED_ELEMENT__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__TAG = I18NPackage.I1_8N_NAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__CUSTOM_PROPERTY = I18NPackage.I1_8N_NAMED_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__MODEL = I18NPackage.I1_8N_NAMED_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__UUID = I18NPackage.I1_8N_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__SUPERSEEDING_RELATIONSHIP = I18NPackage.I1_8N_NAMED_ELEMENT__SUPERSEEDING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__NAMESPACE = I18NPackage.I1_8N_NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__NAME = I18NPackage.I1_8N_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__QUALIFIED_NAME = I18NPackage.I1_8N_NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__DISPLAY_NAME = I18NPackage.I1_8N_NAMED_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Facilitating Base Practise</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__FACILITATING_BASE_PRACTISE = I18NPackage.I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Workproduct</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__REQUIRED_WORKPRODUCT = I18NPackage.I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resulting Workproduct</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__RESULTING_WORKPRODUCT = I18NPackage.I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owning Process</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME__OWNING_PROCESS = I18NPackage.I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Outcome</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME_FEATURE_COUNT = I18NPackage.I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___ALL_OWNED_ELEMENTS = I18NPackage.I1_8N_NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___MUST_BE_OWNED = I18NPackage.I1_8N_NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___MODEL = I18NPackage.I1_8N_NAMED_ELEMENT___MODEL;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___OID = I18NPackage.I1_8N_NAMED_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___ALL_NAMESPACES = I18NPackage.I1_8N_NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___SEPARATOR = I18NPackage.I1_8N_NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME___QUALIFIED_NAME = I18NPackage.I1_8N_NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Outcome</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTCOME_OPERATION_COUNT = I18NPackage.I1_8N_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.SPICE.impl.WorkProductImpl <em>Work Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.SPICE.impl.WorkProductImpl
	 * @see QWiki.SPICE.impl.SPICEPackageImpl#getWorkProduct()
	 * @generated
	 */
	int WORK_PRODUCT = 6;

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
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__DIRECTED_RELATIONSHIP = SPICE_ELEMENT__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__RELATIONSHIP = SPICE_ELEMENT__RELATIONSHIP;

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
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__MODEL = SPICE_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__UUID = SPICE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__SUPERSEEDING_RELATIONSHIP = SPICE_ELEMENT__SUPERSEEDING_RELATIONSHIP;

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
	 * The feature id for the '<em><b>Facilitated Section</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORK_PRODUCT__FACILITATED_SECTION = SPICE_ELEMENT__FACILITATED_SECTION;

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
	 * The meta object id for the '{@link QWiki.SPICE.impl.GenericWorkProductImpl <em>Generic Work Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.SPICE.impl.GenericWorkProductImpl
	 * @see QWiki.SPICE.impl.SPICEPackageImpl#getGenericWorkProduct()
	 * @generated
	 */
	int GENERIC_WORK_PRODUCT = 7;

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
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__DIRECTED_RELATIONSHIP = WORK_PRODUCT__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__RELATIONSHIP = WORK_PRODUCT__RELATIONSHIP;

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
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__MODEL = WORK_PRODUCT__MODEL;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__UUID = WORK_PRODUCT__UUID;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__SUPERSEEDING_RELATIONSHIP = WORK_PRODUCT__SUPERSEEDING_RELATIONSHIP;

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
	 * The feature id for the '<em><b>Facilitated Section</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_WORK_PRODUCT__FACILITATED_SECTION = WORK_PRODUCT__FACILITATED_SECTION;

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
	 * The meta object id for the '{@link QWiki.SPICE.ProcessReferenceModelDomain <em>Process Reference Model Domain</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.SPICE.ProcessReferenceModelDomain
	 * @see QWiki.SPICE.impl.SPICEPackageImpl#getProcessReferenceModelDomain()
	 * @generated
	 */
	int PROCESS_REFERENCE_MODEL_DOMAIN = 8;

	/**
	 * The meta object id for the '{@link QWiki.SPICE.WorkProductType <em>Work Product Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.SPICE.WorkProductType
	 * @see QWiki.SPICE.impl.SPICEPackageImpl#getWorkProductType()
	 * @generated
	 */
	int WORK_PRODUCT_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link QWiki.SPICE.SpiceBasePractise <em>Spice Base Practise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spice Base Practise</em>'.
	 * @see QWiki.SPICE.SpiceBasePractise
	 * @generated
	 */
	EClass getSpiceBasePractise();

	/**
	 * Returns the meta object for the container reference '{@link QWiki.SPICE.SpiceBasePractise#getOwningProcess <em>Owning Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Process</em>'.
	 * @see QWiki.SPICE.SpiceBasePractise#getOwningProcess()
	 * @see #getSpiceBasePractise()
	 * @generated
	 */
	EReference getSpiceBasePractise_OwningProcess();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.SPICE.SpiceBasePractise#getFacilitatedOutcome <em>Facilitated Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitated Outcome</em>'.
	 * @see QWiki.SPICE.SpiceBasePractise#getFacilitatedOutcome()
	 * @see #getSpiceBasePractise()
	 * @generated
	 */
	EReference getSpiceBasePractise_FacilitatedOutcome();

	/**
	 * Returns the meta object for the reference '{@link QWiki.SPICE.SpiceBasePractise#getFacilitatedWorkProduct <em>Facilitated Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facilitated Work Product</em>'.
	 * @see QWiki.SPICE.SpiceBasePractise#getFacilitatedWorkProduct()
	 * @see #getSpiceBasePractise()
	 * @generated
	 */
	EReference getSpiceBasePractise_FacilitatedWorkProduct();

	/**
	 * Returns the meta object for class '{@link QWiki.SPICE.SpiceElement <em>Spice Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spice Element</em>'.
	 * @see QWiki.SPICE.SpiceElement
	 * @generated
	 */
	EClass getSpiceElement();

	/**
	 * Returns the meta object for the container reference '{@link QWiki.SPICE.SpiceElement#getOwningProcessReferenceModel <em>Owning Process Reference Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Process Reference Model</em>'.
	 * @see QWiki.SPICE.SpiceElement#getOwningProcessReferenceModel()
	 * @see #getSpiceElement()
	 * @generated
	 */
	EReference getSpiceElement_OwningProcessReferenceModel();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.SPICE.SpiceElement#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see QWiki.SPICE.SpiceElement#getNumber()
	 * @see #getSpiceElement()
	 * @generated
	 */
	EAttribute getSpiceElement_Number();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.SPICE.SpiceElement#getFacilitatedSection <em>Facilitated Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitated Section</em>'.
	 * @see QWiki.SPICE.SpiceElement#getFacilitatedSection()
	 * @see #getSpiceElement()
	 * @generated
	 */
	EReference getSpiceElement_FacilitatedSection();

	/**
	 * Returns the meta object for the reference '{@link QWiki.SPICE.SpiceElement#getOwningRole <em>Owning Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owning Role</em>'.
	 * @see QWiki.SPICE.SpiceElement#getOwningRole()
	 * @see #getSpiceElement()
	 * @generated
	 */
	EReference getSpiceElement_OwningRole();

	/**
	 * Returns the meta object for the reference '{@link QWiki.SPICE.SpiceElement#getManagingRole <em>Managing Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Managing Role</em>'.
	 * @see QWiki.SPICE.SpiceElement#getManagingRole()
	 * @see #getSpiceElement()
	 * @generated
	 */
	EReference getSpiceElement_ManagingRole();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.SPICE.SpiceElement#getParticipatingRole <em>Participating Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participating Role</em>'.
	 * @see QWiki.SPICE.SpiceElement#getParticipatingRole()
	 * @see #getSpiceElement()
	 * @generated
	 */
	EReference getSpiceElement_ParticipatingRole();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.SPICE.SpiceElement#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Role</em>'.
	 * @see QWiki.SPICE.SpiceElement#getRole()
	 * @see #getSpiceElement()
	 * @generated
	 */
	EReference getSpiceElement_Role();

	/**
	 * Returns the meta object for class '{@link QWiki.SPICE.ProcessReferenceModel <em>Process Reference Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Reference Model</em>'.
	 * @see QWiki.SPICE.ProcessReferenceModel
	 * @generated
	 */
	EClass getProcessReferenceModel();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.SPICE.ProcessReferenceModel#isNonStandard <em>Is Non Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Non Standard</em>'.
	 * @see QWiki.SPICE.ProcessReferenceModel#isNonStandard()
	 * @see #getProcessReferenceModel()
	 * @generated
	 */
	EAttribute getProcessReferenceModel_IsNonStandard();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.SPICE.ProcessReferenceModel#getPrmDomain <em>Prm Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prm Domain</em>'.
	 * @see QWiki.SPICE.ProcessReferenceModel#getPrmDomain()
	 * @see #getProcessReferenceModel()
	 * @generated
	 */
	EAttribute getProcessReferenceModel_PrmDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.SPICE.ProcessReferenceModel#getOwnedSpiceElement <em>Owned Spice Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Spice Element</em>'.
	 * @see QWiki.SPICE.ProcessReferenceModel#getOwnedSpiceElement()
	 * @see #getProcessReferenceModel()
	 * @generated
	 */
	EReference getProcessReferenceModel_OwnedSpiceElement();

	/**
	 * Returns the meta object for the '{@link QWiki.SPICE.ProcessReferenceModel#oidForDomain() <em>Oid For Domain</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Oid For Domain</em>' operation.
	 * @see QWiki.SPICE.ProcessReferenceModel#oidForDomain()
	 * @generated
	 */
	EOperation getProcessReferenceModel__OidForDomain();

	/**
	 * Returns the meta object for class '{@link QWiki.SPICE.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see QWiki.SPICE.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the container reference '{@link QWiki.SPICE.Process#getOwningProcessGroup <em>Owning Process Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Process Group</em>'.
	 * @see QWiki.SPICE.Process#getOwningProcessGroup()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_OwningProcessGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.SPICE.Process#getOwnedOutcome <em>Owned Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Outcome</em>'.
	 * @see QWiki.SPICE.Process#getOwnedOutcome()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_OwnedOutcome();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.SPICE.Process#getFacilitatingWorkProduct <em>Facilitating Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitating Work Product</em>'.
	 * @see QWiki.SPICE.Process#getFacilitatingWorkProduct()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_FacilitatingWorkProduct();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.SPICE.Process#getFacilitatedWorkProduct <em>Facilitated Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitated Work Product</em>'.
	 * @see QWiki.SPICE.Process#getFacilitatedWorkProduct()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_FacilitatedWorkProduct();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.SPICE.Process#getOwnedBasePractise <em>Owned Base Practise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Base Practise</em>'.
	 * @see QWiki.SPICE.Process#getOwnedBasePractise()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_OwnedBasePractise();

	/**
	 * Returns the meta object for class '{@link QWiki.SPICE.ProcessGroup <em>Process Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Group</em>'.
	 * @see QWiki.SPICE.ProcessGroup
	 * @generated
	 */
	EClass getProcessGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.SPICE.ProcessGroup#getOwnedProcess <em>Owned Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Process</em>'.
	 * @see QWiki.SPICE.ProcessGroup#getOwnedProcess()
	 * @see #getProcessGroup()
	 * @generated
	 */
	EReference getProcessGroup_OwnedProcess();

	/**
	 * Returns the meta object for class '{@link QWiki.SPICE.Outcome <em>Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Outcome</em>'.
	 * @see QWiki.SPICE.Outcome
	 * @generated
	 */
	EClass getOutcome();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.SPICE.Outcome#getFacilitatingBasePractise <em>Facilitating Base Practise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitating Base Practise</em>'.
	 * @see QWiki.SPICE.Outcome#getFacilitatingBasePractise()
	 * @see #getOutcome()
	 * @generated
	 */
	EReference getOutcome_FacilitatingBasePractise();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.SPICE.Outcome#getRequiredWorkproduct <em>Required Workproduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required Workproduct</em>'.
	 * @see QWiki.SPICE.Outcome#getRequiredWorkproduct()
	 * @see #getOutcome()
	 * @generated
	 */
	EReference getOutcome_RequiredWorkproduct();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.SPICE.Outcome#getResultingWorkproduct <em>Resulting Workproduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Resulting Workproduct</em>'.
	 * @see QWiki.SPICE.Outcome#getResultingWorkproduct()
	 * @see #getOutcome()
	 * @generated
	 */
	EReference getOutcome_ResultingWorkproduct();

	/**
	 * Returns the meta object for the container reference '{@link QWiki.SPICE.Outcome#getOwningProcess <em>Owning Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Process</em>'.
	 * @see QWiki.SPICE.Outcome#getOwningProcess()
	 * @see #getOutcome()
	 * @generated
	 */
	EReference getOutcome_OwningProcess();

	/**
	 * Returns the meta object for class '{@link QWiki.SPICE.WorkProduct <em>Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Work Product</em>'.
	 * @see QWiki.SPICE.WorkProduct
	 * @generated
	 */
	EClass getWorkProduct();

	/**
	 * Returns the meta object for the container reference '{@link QWiki.SPICE.WorkProduct#getOwningWorkProductGroup <em>Owning Work Product Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Work Product Group</em>'.
	 * @see QWiki.SPICE.WorkProduct#getOwningWorkProductGroup()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_OwningWorkProductGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.SPICE.WorkProduct#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Characteristic</em>'.
	 * @see QWiki.SPICE.WorkProduct#getCharacteristic()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_Characteristic();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.SPICE.WorkProduct#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see QWiki.SPICE.WorkProduct#getContent()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_Content();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.SPICE.WorkProduct#getFacilitatingOutcome <em>Facilitating Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitating Outcome</em>'.
	 * @see QWiki.SPICE.WorkProduct#getFacilitatingOutcome()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_FacilitatingOutcome();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.SPICE.WorkProduct#getFacilitatedProcess <em>Facilitated Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitated Process</em>'.
	 * @see QWiki.SPICE.WorkProduct#getFacilitatedProcess()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_FacilitatedProcess();

	/**
	 * Returns the meta object for the reference '{@link QWiki.SPICE.WorkProduct#getFacilitatingProcess <em>Facilitating Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Facilitating Process</em>'.
	 * @see QWiki.SPICE.WorkProduct#getFacilitatingProcess()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_FacilitatingProcess();

	/**
	 * Returns the meta object for the attribute '{@link QWiki.SPICE.WorkProduct#getWorkProductType <em>Work Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work Product Type</em>'.
	 * @see QWiki.SPICE.WorkProduct#getWorkProductType()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EAttribute getWorkProduct_WorkProductType();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.SPICE.WorkProduct#getFacilitatedOutcome <em>Facilitated Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Facilitated Outcome</em>'.
	 * @see QWiki.SPICE.WorkProduct#getFacilitatedOutcome()
	 * @see #getWorkProduct()
	 * @generated
	 */
	EReference getWorkProduct_FacilitatedOutcome();

	/**
	 * Returns the meta object for class '{@link QWiki.SPICE.GenericWorkProduct <em>Generic Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Work Product</em>'.
	 * @see QWiki.SPICE.GenericWorkProduct
	 * @generated
	 */
	EClass getGenericWorkProduct();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.SPICE.GenericWorkProduct#getOwnedWorkProduct <em>Owned Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Work Product</em>'.
	 * @see QWiki.SPICE.GenericWorkProduct#getOwnedWorkProduct()
	 * @see #getGenericWorkProduct()
	 * @generated
	 */
	EReference getGenericWorkProduct_OwnedWorkProduct();

	/**
	 * Returns the meta object for enum '{@link QWiki.SPICE.ProcessReferenceModelDomain <em>Process Reference Model Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Process Reference Model Domain</em>'.
	 * @see QWiki.SPICE.ProcessReferenceModelDomain
	 * @generated
	 */
	EEnum getProcessReferenceModelDomain();

	/**
	 * Returns the meta object for enum '{@link QWiki.SPICE.WorkProductType <em>Work Product Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Work Product Type</em>'.
	 * @see QWiki.SPICE.WorkProductType
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
	SPICEFactory getSPICEFactory();

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
		 * The meta object literal for the '{@link QWiki.SPICE.impl.SpiceBasePractiseImpl <em>Spice Base Practise</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.SPICE.impl.SpiceBasePractiseImpl
		 * @see QWiki.SPICE.impl.SPICEPackageImpl#getSpiceBasePractise()
		 * @generated
		 */
		EClass SPICE_BASE_PRACTISE = eINSTANCE.getSpiceBasePractise();

		/**
		 * The meta object literal for the '<em><b>Owning Process</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPICE_BASE_PRACTISE__OWNING_PROCESS = eINSTANCE.getSpiceBasePractise_OwningProcess();

		/**
		 * The meta object literal for the '<em><b>Facilitated Outcome</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPICE_BASE_PRACTISE__FACILITATED_OUTCOME = eINSTANCE.getSpiceBasePractise_FacilitatedOutcome();

		/**
		 * The meta object literal for the '<em><b>Facilitated Work Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPICE_BASE_PRACTISE__FACILITATED_WORK_PRODUCT = eINSTANCE.getSpiceBasePractise_FacilitatedWorkProduct();

		/**
		 * The meta object literal for the '{@link QWiki.SPICE.impl.SpiceElementImpl <em>Spice Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.SPICE.impl.SpiceElementImpl
		 * @see QWiki.SPICE.impl.SPICEPackageImpl#getSpiceElement()
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
		 * The meta object literal for the '{@link QWiki.SPICE.impl.ProcessReferenceModelImpl <em>Process Reference Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.SPICE.impl.ProcessReferenceModelImpl
		 * @see QWiki.SPICE.impl.SPICEPackageImpl#getProcessReferenceModel()
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
		 * The meta object literal for the '{@link QWiki.SPICE.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.SPICE.impl.ProcessImpl
		 * @see QWiki.SPICE.impl.SPICEPackageImpl#getProcess()
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
		 * The meta object literal for the '{@link QWiki.SPICE.impl.ProcessGroupImpl <em>Process Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.SPICE.impl.ProcessGroupImpl
		 * @see QWiki.SPICE.impl.SPICEPackageImpl#getProcessGroup()
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
		 * The meta object literal for the '{@link QWiki.SPICE.impl.OutcomeImpl <em>Outcome</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.SPICE.impl.OutcomeImpl
		 * @see QWiki.SPICE.impl.SPICEPackageImpl#getOutcome()
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
		 * The meta object literal for the '{@link QWiki.SPICE.impl.WorkProductImpl <em>Work Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.SPICE.impl.WorkProductImpl
		 * @see QWiki.SPICE.impl.SPICEPackageImpl#getWorkProduct()
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
		 * The meta object literal for the '{@link QWiki.SPICE.impl.GenericWorkProductImpl <em>Generic Work Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.SPICE.impl.GenericWorkProductImpl
		 * @see QWiki.SPICE.impl.SPICEPackageImpl#getGenericWorkProduct()
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
		 * The meta object literal for the '{@link QWiki.SPICE.ProcessReferenceModelDomain <em>Process Reference Model Domain</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.SPICE.ProcessReferenceModelDomain
		 * @see QWiki.SPICE.impl.SPICEPackageImpl#getProcessReferenceModelDomain()
		 * @generated
		 */
		EEnum PROCESS_REFERENCE_MODEL_DOMAIN = eINSTANCE.getProcessReferenceModelDomain();

		/**
		 * The meta object literal for the '{@link QWiki.SPICE.WorkProductType <em>Work Product Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.SPICE.WorkProductType
		 * @see QWiki.SPICE.impl.SPICEPackageImpl#getWorkProductType()
		 * @generated
		 */
		EEnum WORK_PRODUCT_TYPE = eINSTANCE.getWorkProductType();

	}

} //SPICEPackage
