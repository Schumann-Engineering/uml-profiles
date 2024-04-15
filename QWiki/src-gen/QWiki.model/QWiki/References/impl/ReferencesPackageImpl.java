/**
 */
package QWiki.References.impl;

import QWiki.Content.ContentPackage;
import QWiki.Content.impl.ContentPackageImpl;
import QWiki.Domain.DomainPackage;

import QWiki.Domain.impl.DomainPackageImpl;

import QWiki.Glossary.GlossaryPackage;

import QWiki.Glossary.impl.GlossaryPackageImpl;

import QWiki.QWikiPackage;

import QWiki.Rasci.RasciPackage;

import QWiki.Rasci.impl.RasciPackageImpl;

import QWiki.References.Author;
import QWiki.References.AuthorType;
import QWiki.References.Reference;
import QWiki.References.ReferenceType;
import QWiki.References.ReferenceVersion;
import QWiki.References.ReferenceVersionType;
import QWiki.References.ReferencesFactory;
import QWiki.References.ReferencesPackage;
import QWiki.Relationships.RelationshipsPackage;

import QWiki.Relationships.impl.RelationshipsPackageImpl;

import QWiki.Spice.SpicePackage;

import QWiki.Spice.impl.SpicePackageImpl;

import QWiki.impl.QWikiPackageImpl;

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
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(QWikiPackage.eNS_URI);
		QWikiPackageImpl theQWikiPackage = (QWikiPackageImpl)(registeredPackage instanceof QWikiPackageImpl ? registeredPackage : QWikiPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SpicePackage.eNS_URI);
		SpicePackageImpl theSpicePackage = (SpicePackageImpl)(registeredPackage instanceof SpicePackageImpl ? registeredPackage : SpicePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RasciPackage.eNS_URI);
		RasciPackageImpl theRasciPackage = (RasciPackageImpl)(registeredPackage instanceof RasciPackageImpl ? registeredPackage : RasciPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);
		ContentPackageImpl theContentPackage = (ContentPackageImpl)(registeredPackage instanceof ContentPackageImpl ? registeredPackage : ContentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GlossaryPackage.eNS_URI);
		GlossaryPackageImpl theGlossaryPackage = (GlossaryPackageImpl)(registeredPackage instanceof GlossaryPackageImpl ? registeredPackage : GlossaryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(registeredPackage instanceof DomainPackageImpl ? registeredPackage : DomainPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RelationshipsPackage.eNS_URI);
		RelationshipsPackageImpl theRelationshipsPackage = (RelationshipsPackageImpl)(registeredPackage instanceof RelationshipsPackageImpl ? registeredPackage : RelationshipsPackage.eINSTANCE);

		// Create package meta-data objects
		theReferencesPackage.createPackageContents();
		theQWikiPackage.createPackageContents();
		theSpicePackage.createPackageContents();
		theRasciPackage.createPackageContents();
		theContentPackage.createPackageContents();
		theGlossaryPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theRelationshipsPackage.createPackageContents();

		// Initialize created meta-data
		theReferencesPackage.initializePackageContents();
		theQWikiPackage.initializePackageContents();
		theSpicePackage.initializePackageContents();
		theRasciPackage.initializePackageContents();
		theContentPackage.initializePackageContents();
		theGlossaryPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theRelationshipsPackage.initializePackageContents();

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
	public EOperation getAuthor__ObjectId() {
		return authorEClass.getEOperations().get(0);
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
	public EOperation getReference__ObjectId() {
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
		return (EAttribute)referenceVersionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenceVersion_ReferenceVersionType() {
		return (EAttribute)referenceVersionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenceVersion_Edition() {
		return (EAttribute)referenceVersionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceVersion_OwnedContent() {
		return (EReference)referenceVersionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceVersion_OwningReference() {
		return (EReference)referenceVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReferenceVersion__ObjectId() {
		return referenceVersionEClass.getEOperations().get(0);
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
		createEOperation(authorEClass, AUTHOR___OBJECT_ID);

		referenceEClass = createEClass(REFERENCE);
		createEAttribute(referenceEClass, REFERENCE__NUMBER);
		createEReference(referenceEClass, REFERENCE__OWNED_VERSION);
		createEAttribute(referenceEClass, REFERENCE__REFERENCE_TYPE);
		createEReference(referenceEClass, REFERENCE__AUTHOR);
		createEOperation(referenceEClass, REFERENCE___OBJECT_ID);

		referenceVersionEClass = createEClass(REFERENCE_VERSION);
		createEReference(referenceVersionEClass, REFERENCE_VERSION__OWNING_REFERENCE);
		createEAttribute(referenceVersionEClass, REFERENCE_VERSION__PUBLICATION_YEAR);
		createEAttribute(referenceVersionEClass, REFERENCE_VERSION__REFERENCE_VERSION_TYPE);
		createEAttribute(referenceVersionEClass, REFERENCE_VERSION__EDITION);
		createEReference(referenceVersionEClass, REFERENCE_VERSION__OWNED_CONTENT);
		createEOperation(referenceVersionEClass, REFERENCE_VERSION___OBJECT_ID);

		// Create enums
		authorTypeEEnum = createEEnum(AUTHOR_TYPE);
		referenceTypeEEnum = createEEnum(REFERENCE_TYPE);
		referenceVersionTypeEEnum = createEEnum(REFERENCE_VERSION_TYPE);
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
		QWikiPackage theQWikiPackage = (QWikiPackage)EPackage.Registry.INSTANCE.getEPackage(QWikiPackage.eNS_URI);
		ContentPackage theContentPackage = (ContentPackage)EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		authorEClass.getESuperTypes().add(theQWikiPackage.getQWikiNamedElement());
		referenceEClass.getESuperTypes().add(theQWikiPackage.getQWikiContainer());
		referenceVersionEClass.getESuperTypes().add(theQWikiPackage.getQWikiNamespace());

		// Initialize classes, features, and operations; add parameters
		initEClass(authorEClass, Author.class, "Author", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthor_AuthorType(), this.getAuthorType(), "authorType", "Person", 1, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthor_Abbreviation(), ecorePackage.getEString(), "abbreviation", null, 0, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getAuthor__ObjectId(), ecorePackage.getEString(), "objectId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReference_Number(), ecorePackage.getEString(), "number", null, 1, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReference_OwnedVersion(), this.getReferenceVersion(), this.getReferenceVersion_OwningReference(), "ownedVersion", null, 0, -1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReference_ReferenceType(), this.getReferenceType(), "referenceType", null, 1, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReference_Author(), this.getAuthor(), null, "author", null, 1, -1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getReference__ObjectId(), ecorePackage.getEString(), "objectId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(referenceVersionEClass, ReferenceVersion.class, "ReferenceVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceVersion_OwningReference(), this.getReference(), this.getReference_OwnedVersion(), "owningReference", null, 0, 1, ReferenceVersion.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReferenceVersion_PublicationYear(), ecorePackage.getEString(), "publicationYear", null, 1, 1, ReferenceVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReferenceVersion_ReferenceVersionType(), this.getReferenceVersionType(), "referenceVersionType", "FirstEdition", 1, 1, ReferenceVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReferenceVersion_Edition(), ecorePackage.getEString(), "edition", null, 0, 1, ReferenceVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReferenceVersion_OwnedContent(), theContentPackage.getSection(), theContentPackage.getSection_OwningReferenceVersion(), "ownedContent", null, 0, -1, ReferenceVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getReferenceVersion__ObjectId(), ecorePackage.getEString(), "objectId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(authorTypeEEnum, AuthorType.class, "AuthorType");
		addEEnumLiteral(authorTypeEEnum, AuthorType.PERSON);
		addEEnumLiteral(authorTypeEEnum, AuthorType.ORGANIZATION);
		addEEnumLiteral(authorTypeEEnum, AuthorType.STANDARDS_DEVELOPMENT_ORGANIZATION);

		initEEnum(referenceTypeEEnum, ReferenceType.class, "ReferenceType");
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.DOCUMENT);
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.GUIDELINE);
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.HYPERLINK);
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.LEGISLATION);
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.PROCESS);
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.STANDARD);
		addEEnumLiteral(referenceTypeEEnum, ReferenceType.TECHNICAL_REPORT);

		initEEnum(referenceVersionTypeEEnum, ReferenceVersionType.class, "ReferenceVersionType");
		addEEnumLiteral(referenceVersionTypeEEnum, ReferenceVersionType.ADDENDUM);
		addEEnumLiteral(referenceVersionTypeEEnum, ReferenceVersionType.AMENDMENT);
		addEEnumLiteral(referenceVersionTypeEEnum, ReferenceVersionType.CORRIGENDUM);
		addEEnumLiteral(referenceVersionTypeEEnum, ReferenceVersionType.FIRST_EDITION);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// redefines
		createRedefinesAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
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
	 * Initializes the annotations for <b>redefines</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createRedefinesAnnotations() {
		String source = "redefines";
		addAnnotation
		  (getAuthor__ObjectId(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(QWikiPackage.eNS_URI).appendFragment("//QWikiElement/objectId")
		   });
		addAnnotation
		  (getReference__ObjectId(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(QWikiPackage.eNS_URI).appendFragment("//QWikiElement/objectId")
		   });
		addAnnotation
		  (getReferenceVersion__ObjectId(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(QWikiPackage.eNS_URI).appendFragment("//QWikiElement/objectId")
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
		  (getAuthor__ObjectId(),
		   source,
		   new String[] {
			   "body", "if (abbreviation->notEmpty()) then \'a/\' + abbreviation else \'a/\' + uuid endif"
		   });
		addAnnotation
		  (getReference__ObjectId(),
		   source,
		   new String[] {
			   "body", "if (referenceType = ReferenceType::Document) then \'d/\' + number else \r\nif (referenceType = ReferenceType::Guideline) then \'g/\' + number else\r\nif (referenceType = ReferenceType::Hyperlink) then \'href/\' + number else\r\nif (referenceType = ReferenceType::Legislation) then \'l/\' + number else\r\nif (referenceType = ReferenceType::Process) then \'p/\' + number else\r\nif (referenceType = ReferenceType::Standard) then \'s/\' + number else\r\nif (referenceType = ReferenceType::TechnicalReport) then \'tr/\' + number else \r\n\'?\'\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif"
		   });
		addAnnotation
		  (getReferenceVersion__ObjectId(),
		   source,
		   new String[] {
			   "body", "owningReference.objectId() + \'/\' + edition + if (owningReference.referenceType = ReferenceType::Standard) then \'<SDO-TBD>\' else \'\' endif"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (getAuthor_AuthorType(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getAuthor_Abbreviation(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getReference_Number(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getReference_OwnedVersion(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getReference_ReferenceType(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getReference_Author(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getReferenceVersion_OwningReference(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getReferenceVersion_PublicationYear(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getReferenceVersion_ReferenceVersionType(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getReferenceVersion_Edition(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getReferenceVersion_OwnedContent(),
		   source,
		   new String[] {
			   "kind", "element"
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
	}

} //ReferencesPackageImpl
