/**
 */
package QWiki.References.impl;

import QWiki.Domain.DomainPackage;

import QWiki.Domain.impl.DomainPackageImpl;

import QWiki.Glossary.GlossaryPackage;

import QWiki.Glossary.impl.GlossaryPackageImpl;

import QWiki.Kernel.KernelPackage;

import QWiki.Kernel.Relationships.RelationshipsPackage;

import QWiki.Kernel.Relationships.impl.RelationshipsPackageImpl;

import QWiki.Kernel.impl.KernelPackageImpl;

import QWiki.Rasci.RASCIPackage;

import QWiki.Rasci.impl.RASCIPackageImpl;

import QWiki.References.Author;
import QWiki.References.AuthorType;
import QWiki.References.Reference;
import QWiki.References.ReferenceType;
import QWiki.References.ReferenceVersion;
import QWiki.References.ReferenceVersionType;
import QWiki.References.ReferencesFactory;
import QWiki.References.ReferencesPackage;
import QWiki.References.Section;

import QWiki.Spice.SPICEPackage;

import QWiki.Spice.impl.SPICEPackageImpl;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReferencesPackageImpl extends EPackageImpl implements ReferencesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum authorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referenceVersionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referenceTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see QWiki.References.ReferencesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReferencesPackageImpl() {
		super(eNS_URI, ReferencesFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ReferencesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReferencesPackage init() {
		if (isInited) return (ReferencesPackage)EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredReferencesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ReferencesPackageImpl theReferencesPackage = registeredReferencesPackage instanceof ReferencesPackageImpl ? (ReferencesPackageImpl)registeredReferencesPackage : new ReferencesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI);
		KernelPackageImpl theKernelPackage = (KernelPackageImpl)(registeredPackage instanceof KernelPackageImpl ? registeredPackage : KernelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RelationshipsPackage.eNS_URI);
		RelationshipsPackageImpl theRelationshipsPackage = (RelationshipsPackageImpl)(registeredPackage instanceof RelationshipsPackageImpl ? registeredPackage : RelationshipsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SPICEPackage.eNS_URI);
		SPICEPackageImpl theSPICEPackage = (SPICEPackageImpl)(registeredPackage instanceof SPICEPackageImpl ? registeredPackage : SPICEPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RASCIPackage.eNS_URI);
		RASCIPackageImpl theRASCIPackage = (RASCIPackageImpl)(registeredPackage instanceof RASCIPackageImpl ? registeredPackage : RASCIPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GlossaryPackage.eNS_URI);
		GlossaryPackageImpl theGlossaryPackage = (GlossaryPackageImpl)(registeredPackage instanceof GlossaryPackageImpl ? registeredPackage : GlossaryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(registeredPackage instanceof DomainPackageImpl ? registeredPackage : DomainPackage.eINSTANCE);

		// Create package meta-data objects
		theReferencesPackage.createPackageContents();
		theKernelPackage.createPackageContents();
		theRelationshipsPackage.createPackageContents();
		theSPICEPackage.createPackageContents();
		theRASCIPackage.createPackageContents();
		theGlossaryPackage.createPackageContents();
		theDomainPackage.createPackageContents();

		// Initialize created meta-data
		theReferencesPackage.initializePackageContents();
		theKernelPackage.initializePackageContents();
		theRelationshipsPackage.initializePackageContents();
		theSPICEPackage.initializePackageContents();
		theRASCIPackage.initializePackageContents();
		theGlossaryPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReferencesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReferencesPackage.eNS_URI, theReferencesPackage);
		return theReferencesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthor() {
		return authorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthor_AuthorType() {
		return (EAttribute)authorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthor_Abbreviation() {
		return (EAttribute)authorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAuthor__AuthoredDocument() {
		return authorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAuthor__AuthoredStandard() {
		return authorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAuthor__Oid_1() {
		return authorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReference_Number() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReference_OwnedVersion() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReference_ReferenceType() {
		return (EAttribute)referenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReference_Author() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReference__Oid_1() {
		return referenceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceVersion() {
		return referenceVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenceVersion_PublicationYear() {
		return (EAttribute)referenceVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenceVersion_ReferenceVersionType() {
		return (EAttribute)referenceVersionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenceVersion_Edition() {
		return (EAttribute)referenceVersionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceVersion_OwnedSection() {
		return (EReference)referenceVersionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceVersion_OwningReference() {
		return (EReference)referenceVersionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReferenceVersion__Oid_1() {
		return referenceVersionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSection() {
		return sectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSection_OwningReferenceVersion() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSection_OwnedSection() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSection_OwningSection() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSection_Number() {
		return (EAttribute)sectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSection_FacilitatingElement() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSection_Term() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSection_FacilitatingSpiceElement() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSection__DocumentVersion() {
		return sectionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSection__Oid_1() {
		return sectionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSection__QualifiedNumber() {
		return sectionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAuthorType() {
		return authorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getReferenceVersionType() {
		return referenceVersionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getReferenceType() {
		return referenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferencesFactory getReferencesFactory() {
		return (ReferencesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		authorEClass = createEClass(AUTHOR);
		createEAttribute(authorEClass, AUTHOR__AUTHOR_TYPE);
		createEAttribute(authorEClass, AUTHOR__ABBREVIATION);
		createEOperation(authorEClass, AUTHOR___AUTHORED_DOCUMENT);
		createEOperation(authorEClass, AUTHOR___AUTHORED_STANDARD);
		createEOperation(authorEClass, AUTHOR___OID);

		referenceEClass = createEClass(REFERENCE);
		createEAttribute(referenceEClass, REFERENCE__NUMBER);
		createEReference(referenceEClass, REFERENCE__OWNED_VERSION);
		createEAttribute(referenceEClass, REFERENCE__REFERENCE_TYPE);
		createEReference(referenceEClass, REFERENCE__AUTHOR);
		createEOperation(referenceEClass, REFERENCE___OID);

		referenceVersionEClass = createEClass(REFERENCE_VERSION);
		createEAttribute(referenceVersionEClass, REFERENCE_VERSION__PUBLICATION_YEAR);
		createEAttribute(referenceVersionEClass, REFERENCE_VERSION__REFERENCE_VERSION_TYPE);
		createEAttribute(referenceVersionEClass, REFERENCE_VERSION__EDITION);
		createEReference(referenceVersionEClass, REFERENCE_VERSION__OWNED_SECTION);
		createEReference(referenceVersionEClass, REFERENCE_VERSION__OWNING_REFERENCE);
		createEOperation(referenceVersionEClass, REFERENCE_VERSION___OID);

		sectionEClass = createEClass(SECTION);
		createEReference(sectionEClass, SECTION__OWNING_REFERENCE_VERSION);
		createEReference(sectionEClass, SECTION__OWNED_SECTION);
		createEReference(sectionEClass, SECTION__OWNING_SECTION);
		createEAttribute(sectionEClass, SECTION__NUMBER);
		createEReference(sectionEClass, SECTION__FACILITATING_ELEMENT);
		createEReference(sectionEClass, SECTION__TERM);
		createEReference(sectionEClass, SECTION__FACILITATING_SPICE_ELEMENT);
		createEOperation(sectionEClass, SECTION___DOCUMENT_VERSION);
		createEOperation(sectionEClass, SECTION___OID);
		createEOperation(sectionEClass, SECTION___QUALIFIED_NUMBER);

		// Create enums
		authorTypeEEnum = createEEnum(AUTHOR_TYPE);
		referenceVersionTypeEEnum = createEEnum(REFERENCE_VERSION_TYPE);
		referenceTypeEEnum = createEEnum(REFERENCE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		KernelPackage theKernelPackage = (KernelPackage)EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI);
		GlossaryPackage theGlossaryPackage = (GlossaryPackage)EPackage.Registry.INSTANCE.getEPackage(GlossaryPackage.eNS_URI);
		SPICEPackage theSPICEPackage = (SPICEPackage)EPackage.Registry.INSTANCE.getEPackage(SPICEPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		authorEClass.getESuperTypes().add(theKernelPackage.getQWikiNamedElement());
		referenceEClass.getESuperTypes().add(theKernelPackage.getQWikiContainer());
		referenceVersionEClass.getESuperTypes().add(theKernelPackage.getQWikiNamespace());
		sectionEClass.getESuperTypes().add(theKernelPackage.getQWikiNamespace());

		// Initialize classes, features, and operations; add parameters
		initEClass(authorEClass, Author.class, "Author", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthor_AuthorType(), this.getAuthorType(), "authorType", "Person", 1, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthor_Abbreviation(), ecorePackage.getEString(), "abbreviation", null, 0, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getAuthor__AuthoredDocument(), this.getReference(), "authoredDocument", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAuthor__AuthoredStandard(), this.getReference(), "authoredStandard", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAuthor__Oid_1(), ecorePackage.getEString(), "oid", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReference_Number(), ecorePackage.getEString(), "number", null, 1, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReference_OwnedVersion(), this.getReferenceVersion(), this.getReferenceVersion_OwningReference(), "ownedVersion", null, 0, -1, Reference.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReference_ReferenceType(), this.getReferenceType(), "referenceType", null, 1, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReference_Author(), this.getAuthor(), null, "author", null, 1, -1, Reference.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getReference__Oid_1(), ecorePackage.getEString(), "oid", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(referenceVersionEClass, ReferenceVersion.class, "ReferenceVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenceVersion_PublicationYear(), ecorePackage.getEString(), "publicationYear", null, 1, 1, ReferenceVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReferenceVersion_ReferenceVersionType(), this.getReferenceVersionType(), "referenceVersionType", "FirstEdition", 1, 1, ReferenceVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReferenceVersion_Edition(), ecorePackage.getEString(), "edition", null, 0, 1, ReferenceVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReferenceVersion_OwnedSection(), this.getSection(), this.getSection_OwningReferenceVersion(), "ownedSection", null, 0, -1, ReferenceVersion.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReferenceVersion_OwningReference(), this.getReference(), this.getReference_OwnedVersion(), "owningReference", null, 0, 1, ReferenceVersion.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getReferenceVersion__Oid_1(), ecorePackage.getEString(), "oid", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSection_OwningReferenceVersion(), this.getReferenceVersion(), this.getReferenceVersion_OwnedSection(), "owningReferenceVersion", null, 0, 1, Section.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSection_OwnedSection(), this.getSection(), this.getSection_OwningSection(), "ownedSection", null, 0, -1, Section.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSection_OwningSection(), this.getSection(), this.getSection_OwnedSection(), "owningSection", null, 0, 1, Section.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSection_Number(), ecorePackage.getEString(), "number", null, 1, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSection_FacilitatingElement(), theKernelPackage.getQWikiElement(), null, "facilitatingElement", null, 0, -1, Section.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getSection_Term(), theGlossaryPackage.getGlossaryTerm(), theGlossaryPackage.getGlossaryTerm_ExternalTermDefinition(), "term", null, 0, -1, Section.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSection_FacilitatingSpiceElement(), theSPICEPackage.getSpiceElement(), theSPICEPackage.getSpiceElement_FacilitatedSection(), "facilitatingSpiceElement", null, 0, -1, Section.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getSection__DocumentVersion(), this.getReferenceVersion(), "documentVersion", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSection__Oid_1(), ecorePackage.getEString(), "oid", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSection__QualifiedNumber(), ecorePackage.getEString(), "qualifiedNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(authorTypeEEnum, AuthorType.class, "AuthorType");
		addEEnumLiteral(authorTypeEEnum, AuthorType.PERSON);
		addEEnumLiteral(authorTypeEEnum, AuthorType.ORGANIZATION);
		addEEnumLiteral(authorTypeEEnum, AuthorType.STANDARDS_DEVELOPMENT_ORGANIZATION);

		initEEnum(referenceVersionTypeEEnum, ReferenceVersionType.class, "ReferenceVersionType");
		addEEnumLiteral(referenceVersionTypeEEnum, ReferenceVersionType.ADDENDUM);
		addEEnumLiteral(referenceVersionTypeEEnum, ReferenceVersionType.AMENDMENT);
		addEEnumLiteral(referenceVersionTypeEEnum, ReferenceVersionType.CORRIGENDUM);
		addEEnumLiteral(referenceVersionTypeEEnum, ReferenceVersionType.FIRST_EDITION);

		initEEnum(referenceTypeEEnum, ReferenceType.class, "ReferenceType");
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.DOCUMENT);
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.GUIDELINE);
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.HYPERLINK);
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.LEGISLATION);
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.PROCESS);
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.STANDARD);
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.TECHNICAL_REPORT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
		// union
		createUnionAnnotations();
		// subsets
		createSubsetsAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";
		addAnnotation
		  (getAuthor__AuthoredDocument(),
		   source,
		   new String[] {
			   "body", "model().ownedElement->select(oclIsKindOf(QWiki::Bibliography::Document)).oclAsType(QWiki::Bibliography::Document)->select(author->includes(self))->asSet()"
		   });
		addAnnotation
		  (getAuthor__AuthoredStandard(),
		   source,
		   new String[] {
			   "body", "authoredDocument()->select(documentType = DocumentType::Standard)"
		   });
		addAnnotation
		  (getAuthor__Oid_1(),
		   source,
		   new String[] {
			   "body", "if (abbreviation->notEmpty()) then \'a/\' + abbreviation else \'a/\' + uuid endif"
		   });
		addAnnotation
		  (getReference__Oid_1(),
		   source,
		   new String[] {
			   "body", "if (documentType = DocumentType::Document) then \'d/\' + number else \r\nif (documentType = DocumentType::Guideline) then \'g/\' + number else\r\nif (documentType = DocumentType::Hyperlink) then \'href/\' + number else\r\nif (documentType = DocumentType::Legislation) then \'l/\' + number else\r\nif (documentType = DocumentType::Process) then \'p/\' + number else\r\nif (documentType = DocumentType::Standard) then \'s/\' + number else\r\nif (documentType = DocumentType::TechnicalReport) then \'tr/\' + number else \r\n\'?\'\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif"
		   });
		addAnnotation
		  (getReferenceVersion__Oid_1(),
		   source,
		   new String[] {
			   "body", "owningDocument.oid() + \'/\' + edition + if (owningDocument.documentType = DocumentType::Standard) then \'<SDO-TBD>\' else \'\' endif"
		   });
		addAnnotation
		  (getSection__DocumentVersion(),
		   source,
		   new String[] {
			   "body", "if (owningDocument->notEmpty()) then owningDocument else owningSection.documentVersion() endif"
		   });
		addAnnotation
		  (getSection__Oid_1(),
		   source,
		   new String[] {
			   "body", "qualifiedNumber() + \'@\' + documentVersion().oid()"
		   });
		addAnnotation
		  (getSection__QualifiedNumber(),
		   source,
		   new String[] {
			   "body", "if (owningSection->notEmpty()) then\r\n  owningSection.qualifiedNumber() + \'.\' + number\r\nelse\r\n  number\r\nendif"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEmofAnnotations() {
		String source = "http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName";
		addAnnotation
		  (getReference_Author(),
		   source,
		   new String[] {
			   "body", "authoredDocument"
		   });
		addAnnotation
		  (getSection_FacilitatingElement(),
		   source,
		   new String[] {
			   "body", "facilitatedSection"
		   });
	}

	/**
	 * Initializes the annotations for <b>union</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUnionAnnotations() {
		String source = "union";
		addAnnotation
		  (getSection_FacilitatingElement(),
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>subsets</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSubsetsAnnotations() {
		String source = "subsets";
		addAnnotation
		  (getSection_FacilitatingSpiceElement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Section/facilitatingElement")
		   });
	}

} //ReferencesPackageImpl
