/**
 */
package QWiki.Glossary.impl;

import QWiki.Bibliography.BibliographyPackage;

import QWiki.Bibliography.impl.BibliographyPackageImpl;

import QWiki.Glossary.GlossaryFactory;
import QWiki.Glossary.GlossaryPackage;
import QWiki.Glossary.GlossaryTerm;
import QWiki.Glossary.GlossaryTermDefinition;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlossaryPackageImpl extends EPackageImpl implements GlossaryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glossaryTermDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glossaryTermEClass = null;

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
	 * @see QWiki.Glossary.GlossaryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GlossaryPackageImpl() {
		super(eNS_URI, GlossaryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GlossaryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GlossaryPackage init() {
		if (isInited) return (GlossaryPackage)EPackage.Registry.INSTANCE.getEPackage(GlossaryPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGlossaryPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GlossaryPackageImpl theGlossaryPackage = registeredGlossaryPackage instanceof GlossaryPackageImpl ? (GlossaryPackageImpl)registeredGlossaryPackage : new GlossaryPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BibliographyPackage.eNS_URI);
		BibliographyPackageImpl theBibliographyPackage = (BibliographyPackageImpl)(registeredPackage instanceof BibliographyPackageImpl ? registeredPackage : BibliographyPackage.eINSTANCE);

		// Create package meta-data objects
		theGlossaryPackage.createPackageContents();
		theInfrastructurePackage.createPackageContents();
		theKernelPackage.createPackageContents();
		theI18NPackage.createPackageContents();
		theSPICEPackage.createPackageContents();
		theRASCIPackage.createPackageContents();
		theBibliographyPackage.createPackageContents();

		// Initialize created meta-data
		theGlossaryPackage.initializePackageContents();
		theInfrastructurePackage.initializePackageContents();
		theKernelPackage.initializePackageContents();
		theI18NPackage.initializePackageContents();
		theSPICEPackage.initializePackageContents();
		theRASCIPackage.initializePackageContents();
		theBibliographyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGlossaryPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GlossaryPackage.eNS_URI, theGlossaryPackage);
		return theGlossaryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlossaryTermDefinition() {
		return glossaryTermDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlossaryTermDefinition_OwningTerm() {
		return (EReference)glossaryTermDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlossaryTerm() {
		return glossaryTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlossaryTerm_OwnedTermDefinition() {
		return (EReference)glossaryTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlossaryTerm_Acronym() {
		return (EReference)glossaryTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlossaryTerm_Synonym() {
		return (EReference)glossaryTermEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlossaryTerm_TermDefinition() {
		return (EReference)glossaryTermEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlossaryTerm_ExternalTermDefinition() {
		return (EReference)glossaryTermEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlossaryFactory getGlossaryFactory() {
		return (GlossaryFactory)getEFactoryInstance();
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
		glossaryTermDefinitionEClass = createEClass(GLOSSARY_TERM_DEFINITION);
		createEReference(glossaryTermDefinitionEClass, GLOSSARY_TERM_DEFINITION__OWNING_TERM);

		glossaryTermEClass = createEClass(GLOSSARY_TERM);
		createEReference(glossaryTermEClass, GLOSSARY_TERM__OWNED_TERM_DEFINITION);
		createEReference(glossaryTermEClass, GLOSSARY_TERM__ACRONYM);
		createEReference(glossaryTermEClass, GLOSSARY_TERM__SYNONYM);
		createEReference(glossaryTermEClass, GLOSSARY_TERM__TERM_DEFINITION);
		createEReference(glossaryTermEClass, GLOSSARY_TERM__EXTERNAL_TERM_DEFINITION);
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
		I18NPackage theI18NPackage = (I18NPackage)EPackage.Registry.INSTANCE.getEPackage(I18NPackage.eNS_URI);
		BibliographyPackage theBibliographyPackage = (BibliographyPackage)EPackage.Registry.INSTANCE.getEPackage(BibliographyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		glossaryTermDefinitionEClass.getESuperTypes().add(theI18NPackage.getI18nDescriptiveElement());
		glossaryTermEClass.getESuperTypes().add(theI18NPackage.getI18nNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(glossaryTermDefinitionEClass, GlossaryTermDefinition.class, "GlossaryTermDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlossaryTermDefinition_OwningTerm(), this.getGlossaryTerm(), this.getGlossaryTerm_OwnedTermDefinition(), "owningTerm", null, 0, 1, GlossaryTermDefinition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(glossaryTermEClass, GlossaryTerm.class, "GlossaryTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlossaryTerm_OwnedTermDefinition(), this.getGlossaryTermDefinition(), this.getGlossaryTermDefinition_OwningTerm(), "ownedTermDefinition", null, 0, -1, GlossaryTerm.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGlossaryTerm_Acronym(), theI18NPackage.getI18nString(), null, "acronym", null, 0, 1, GlossaryTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGlossaryTerm_Synonym(), theI18NPackage.getI18nString(), null, "synonym", null, 0, 1, GlossaryTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGlossaryTerm_TermDefinition(), theI18NPackage.getI18nDescriptiveElement(), null, "termDefinition", null, 0, -1, GlossaryTerm.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getGlossaryTerm_ExternalTermDefinition(), theBibliographyPackage.getSection(), theBibliographyPackage.getSection_Term(), "externalTermDefinition", null, 0, -1, GlossaryTerm.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// subsets
		createSubsetsAnnotations();
		// duplicates
		createDuplicatesAnnotations();
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
	 * Initializes the annotations for <b>subsets</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSubsetsAnnotations() {
		String source = "subsets";
		addAnnotation
		  (getGlossaryTermDefinition_OwningTerm(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(InfrastructurePackage.eNS_URI).appendFragment("//UmlElement/owner")
		   });
		addAnnotation
		  (getGlossaryTerm_OwnedTermDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//GlossaryTerm/termDefinition"),
			 URI.createURI(InfrastructurePackage.eNS_URI).appendFragment("//UmlElement/ownedElement")
		   });
		addAnnotation
		  (getGlossaryTerm_ExternalTermDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//GlossaryTerm/termDefinition")
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
		  (glossaryTermEClass,
		   source,
		   new String[] {
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
		  (getGlossaryTerm_TermDefinition(),
		   source,
		   new String[] {
			   "body", "term"
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
		  (getGlossaryTerm_TermDefinition(),
		   source,
		   new String[] {
		   });
	}

} //GlossaryPackageImpl
