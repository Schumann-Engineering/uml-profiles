/**
 */
package QWiki.Bibliography.impl;

import QWiki.Bibliography.Author;
import QWiki.Bibliography.AuthorType;
import QWiki.Bibliography.BibliographyFactory;
import QWiki.Bibliography.BibliographyPackage;
import QWiki.Bibliography.Document;
import QWiki.Bibliography.DocumentType;
import QWiki.Bibliography.DocumentVersion;
import QWiki.Bibliography.DocumentVersionType;
import QWiki.Bibliography.Section;

import QWiki.Glossary.GlossaryPackage;

import QWiki.Glossary.impl.GlossaryPackageImpl;

import QWiki.I18N.I18NPackage;
import QWiki.I18N.impl.I18NPackageImpl;
import QWiki.Infrastructure.InfrastructurePackage;

import QWiki.Infrastructure.impl.InfrastructurePackageImpl;

import QWiki.Kernel.KernelPackage;

import QWiki.Kernel.impl.KernelPackageImpl;

import QWiki.RASCI.RASCIPackage;

import QWiki.RASCI.impl.RASCIPackageImpl;

import QWiki.SPICE.SPICEPackage;

import QWiki.SPICE.impl.SPICEPackageImpl;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BibliographyPackageImpl extends EPackageImpl implements BibliographyPackage {
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
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentVersionEClass = null;

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
	private EEnum documentVersionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum documentTypeEEnum = null;

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
	 * @see QWiki.Bibliography.BibliographyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BibliographyPackageImpl() {
		super(eNS_URI, BibliographyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BibliographyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BibliographyPackage init() {
		if (isInited) return (BibliographyPackage)EPackage.Registry.INSTANCE.getEPackage(BibliographyPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBibliographyPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BibliographyPackageImpl theBibliographyPackage = registeredBibliographyPackage instanceof BibliographyPackageImpl ? (BibliographyPackageImpl)registeredBibliographyPackage : new BibliographyPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);
		InfrastructurePackageImpl theInfrastructurePackage = (InfrastructurePackageImpl)(registeredPackage instanceof InfrastructurePackageImpl ? registeredPackage : InfrastructurePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI);
		KernelPackageImpl theKernelPackage = (KernelPackageImpl)(registeredPackage instanceof KernelPackageImpl ? registeredPackage : KernelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(I18NPackage.eNS_URI);
		I18NPackageImpl theI18NPackage = (I18NPackageImpl)(registeredPackage instanceof I18NPackageImpl ? registeredPackage : I18NPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SPICEPackage.eNS_URI);
		SPICEPackageImpl theSPICEPackage = (SPICEPackageImpl)(registeredPackage instanceof SPICEPackageImpl ? registeredPackage : SPICEPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RASCIPackage.eNS_URI);
		RASCIPackageImpl theRASCIPackage = (RASCIPackageImpl)(registeredPackage instanceof RASCIPackageImpl ? registeredPackage : RASCIPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GlossaryPackage.eNS_URI);
		GlossaryPackageImpl theGlossaryPackage = (GlossaryPackageImpl)(registeredPackage instanceof GlossaryPackageImpl ? registeredPackage : GlossaryPackage.eINSTANCE);

		// Create package meta-data objects
		theBibliographyPackage.createPackageContents();
		theInfrastructurePackage.createPackageContents();
		theKernelPackage.createPackageContents();
		theI18NPackage.createPackageContents();
		theSPICEPackage.createPackageContents();
		theRASCIPackage.createPackageContents();
		theGlossaryPackage.createPackageContents();

		// Initialize created meta-data
		theBibliographyPackage.initializePackageContents();
		theInfrastructurePackage.initializePackageContents();
		theKernelPackage.initializePackageContents();
		theI18NPackage.initializePackageContents();
		theSPICEPackage.initializePackageContents();
		theRASCIPackage.initializePackageContents();
		theGlossaryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBibliographyPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BibliographyPackage.eNS_URI, theBibliographyPackage);
		return theBibliographyPackage;
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
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocument_Number() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocument_OwnedVersion() {
		return (EReference)documentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocument_DocumentType() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocument_Author() {
		return (EReference)documentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentVersion() {
		return documentVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentVersion_PublicationYear() {
		return (EAttribute)documentVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentVersion_DocumentVersionType() {
		return (EAttribute)documentVersionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentVersion_Edition() {
		return (EAttribute)documentVersionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentVersion_OwnedSection() {
		return (EReference)documentVersionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentVersion_OwningDocument() {
		return (EReference)documentVersionEClass.getEStructuralFeatures().get(4);
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
	public EReference getSection_OwningDocument() {
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
	public EOperation getSection__QualifiedNumber() {
		return sectionEClass.getEOperations().get(1);
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
	public EEnum getDocumentVersionType() {
		return documentVersionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDocumentType() {
		return documentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BibliographyFactory getBibliographyFactory() {
		return (BibliographyFactory)getEFactoryInstance();
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

		documentEClass = createEClass(DOCUMENT);
		createEAttribute(documentEClass, DOCUMENT__NUMBER);
		createEReference(documentEClass, DOCUMENT__OWNED_VERSION);
		createEAttribute(documentEClass, DOCUMENT__DOCUMENT_TYPE);
		createEReference(documentEClass, DOCUMENT__AUTHOR);

		documentVersionEClass = createEClass(DOCUMENT_VERSION);
		createEAttribute(documentVersionEClass, DOCUMENT_VERSION__PUBLICATION_YEAR);
		createEAttribute(documentVersionEClass, DOCUMENT_VERSION__DOCUMENT_VERSION_TYPE);
		createEAttribute(documentVersionEClass, DOCUMENT_VERSION__EDITION);
		createEReference(documentVersionEClass, DOCUMENT_VERSION__OWNED_SECTION);
		createEReference(documentVersionEClass, DOCUMENT_VERSION__OWNING_DOCUMENT);

		sectionEClass = createEClass(SECTION);
		createEReference(sectionEClass, SECTION__OWNING_DOCUMENT);
		createEReference(sectionEClass, SECTION__OWNED_SECTION);
		createEReference(sectionEClass, SECTION__OWNING_SECTION);
		createEAttribute(sectionEClass, SECTION__NUMBER);
		createEReference(sectionEClass, SECTION__FACILITATING_ELEMENT);
		createEReference(sectionEClass, SECTION__TERM);
		createEReference(sectionEClass, SECTION__FACILITATING_SPICE_ELEMENT);
		createEOperation(sectionEClass, SECTION___DOCUMENT_VERSION);
		createEOperation(sectionEClass, SECTION___QUALIFIED_NUMBER);

		// Create enums
		authorTypeEEnum = createEEnum(AUTHOR_TYPE);
		documentVersionTypeEEnum = createEEnum(DOCUMENT_VERSION_TYPE);
		documentTypeEEnum = createEEnum(DOCUMENT_TYPE);
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
		InfrastructurePackage theInfrastructurePackage = (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);
		GlossaryPackage theGlossaryPackage = (GlossaryPackage)EPackage.Registry.INSTANCE.getEPackage(GlossaryPackage.eNS_URI);
		SPICEPackage theSPICEPackage = (SPICEPackage)EPackage.Registry.INSTANCE.getEPackage(SPICEPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		authorEClass.getESuperTypes().add(theInfrastructurePackage.getUmlNamedElement());
		documentEClass.getESuperTypes().add(theInfrastructurePackage.getUmlNamespace());
		documentVersionEClass.getESuperTypes().add(theInfrastructurePackage.getUmlNamespace());
		documentVersionEClass.getESuperTypes().add(theInfrastructurePackage.getUmlNamedElement());
		sectionEClass.getESuperTypes().add(theInfrastructurePackage.getUmlNamespace());

		// Initialize classes, features, and operations; add parameters
		initEClass(authorEClass, Author.class, "Author", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthor_AuthorType(), this.getAuthorType(), "authorType", "Person", 1, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthor_Abbreviation(), ecorePackage.getEString(), "abbreviation", null, 0, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getAuthor__AuthoredDocument(), this.getDocument(), "authoredDocument", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAuthor__AuthoredStandard(), this.getDocument(), "authoredStandard", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocument_Number(), ecorePackage.getEString(), "number", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDocument_OwnedVersion(), this.getDocumentVersion(), this.getDocumentVersion_OwningDocument(), "ownedVersion", null, 0, -1, Document.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDocument_DocumentType(), this.getDocumentType(), "documentType", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDocument_Author(), this.getAuthor(), null, "author", null, 1, -1, Document.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(documentVersionEClass, DocumentVersion.class, "DocumentVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentVersion_PublicationYear(), ecorePackage.getEString(), "publicationYear", null, 1, 1, DocumentVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDocumentVersion_DocumentVersionType(), this.getDocumentVersionType(), "documentVersionType", "FirstEdition", 1, 1, DocumentVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDocumentVersion_Edition(), ecorePackage.getEString(), "edition", null, 0, 1, DocumentVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDocumentVersion_OwnedSection(), this.getSection(), this.getSection_OwningDocument(), "ownedSection", null, 0, -1, DocumentVersion.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDocumentVersion_OwningDocument(), this.getDocument(), this.getDocument_OwnedVersion(), "owningDocument", null, 0, 1, DocumentVersion.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSection_OwningDocument(), this.getDocumentVersion(), this.getDocumentVersion_OwnedSection(), "owningDocument", null, 0, 1, Section.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSection_OwnedSection(), this.getSection(), this.getSection_OwningSection(), "ownedSection", null, 0, -1, Section.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSection_OwningSection(), this.getSection(), this.getSection_OwnedSection(), "owningSection", null, 0, 1, Section.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSection_Number(), ecorePackage.getEString(), "number", null, 1, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSection_FacilitatingElement(), theInfrastructurePackage.getUmlElement(), null, "facilitatingElement", null, 0, -1, Section.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getSection_Term(), theGlossaryPackage.getGlossaryTerm(), theGlossaryPackage.getGlossaryTerm_ExternalTermDefinition(), "term", null, 0, -1, Section.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSection_FacilitatingSpiceElement(), theSPICEPackage.getSpiceElement(), theSPICEPackage.getSpiceElement_FacilitatedSection(), "facilitatingSpiceElement", null, 0, -1, Section.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getSection__DocumentVersion(), this.getDocumentVersion(), "documentVersion", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSection__QualifiedNumber(), ecorePackage.getEString(), "qualifiedNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(authorTypeEEnum, AuthorType.class, "AuthorType");
		addEEnumLiteral(authorTypeEEnum, AuthorType.PERSON);
		addEEnumLiteral(authorTypeEEnum, AuthorType.ORGANIZATION);
		addEEnumLiteral(authorTypeEEnum, AuthorType.STANDARDS_DEVELOPMENT_ORGANIZATION);

		initEEnum(documentVersionTypeEEnum, DocumentVersionType.class, "DocumentVersionType");
		addEEnumLiteral(documentVersionTypeEEnum, DocumentVersionType.ADDENDUM);
		addEEnumLiteral(documentVersionTypeEEnum, DocumentVersionType.AMENDMENT);
		addEEnumLiteral(documentVersionTypeEEnum, DocumentVersionType.CORRIGENDUM);
		addEEnumLiteral(documentVersionTypeEEnum, DocumentVersionType.FIRST_EDITION);

		initEEnum(documentTypeEEnum, DocumentType.class, "DocumentType");
		addEEnumLiteral(documentTypeEEnum, DocumentType.DOCUMENT);
		addEEnumLiteral(documentTypeEEnum, DocumentType.GUIDELINE);
		addEEnumLiteral(documentTypeEEnum, DocumentType.HYPERLINK);
		addEEnumLiteral(documentTypeEEnum, DocumentType.LEGISLATION);
		addEEnumLiteral(documentTypeEEnum, DocumentType.PROCESS);
		addEEnumLiteral(documentTypeEEnum, DocumentType.STANDARD);
		addEEnumLiteral(documentTypeEEnum, DocumentType.TECHNICAL_REPORT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// duplicates
		createDuplicatesAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// subsets
		createSubsetsAnnotations();
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
		// union
		createUnionAnnotations();
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
	 * Initializes the annotations for <b>duplicates</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDuplicatesAnnotations() {
		String source = "duplicates";
		addAnnotation
		  (authorEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (documentEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (documentVersionEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (sectionEClass,
		   source,
		   new String[] {
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
		  (getSection__DocumentVersion(),
		   source,
		   new String[] {
			   "body", "if (owningDocument->notEmpty()) then owningDocument else owningSection.documentVersion() endif"
		   });
		addAnnotation
		  (getSection__QualifiedNumber(),
		   source,
		   new String[] {
			   "body", "if (owningSection->notEmpty()) then\r\n  owningSection.qualifiedNumber() + \'.\' + number\r\nelse\r\n  number\r\nendif"
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
		  (getDocument_OwnedVersion(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(InfrastructurePackage.eNS_URI).appendFragment("//UmlNamespace/ownedMember")
		   });
		addAnnotation
		  (getDocumentVersion_OwnedSection(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(InfrastructurePackage.eNS_URI).appendFragment("//UmlNamespace/ownedMember")
		   });
		addAnnotation
		  (getDocumentVersion_OwningDocument(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(InfrastructurePackage.eNS_URI).appendFragment("//UmlNamedElement/namespace")
		   });
		addAnnotation
		  (getSection_OwningDocument(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(InfrastructurePackage.eNS_URI).appendFragment("//UmlNamedElement/namespace")
		   });
		addAnnotation
		  (getSection_OwnedSection(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(InfrastructurePackage.eNS_URI).appendFragment("//UmlNamespace/ownedMember")
		   });
		addAnnotation
		  (getSection_OwningSection(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(InfrastructurePackage.eNS_URI).appendFragment("//UmlElement/owner")
		   });
		addAnnotation
		  (getSection_FacilitatingSpiceElement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Section/facilitatingElement")
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
		  (getDocument_Author(),
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

} //BibliographyPackageImpl
