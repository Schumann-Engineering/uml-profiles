/**
 */
package QWiki.RASCI.impl;

import QWiki.Bibliography.BibliographyPackage;

import QWiki.Bibliography.impl.BibliographyPackageImpl;

import QWiki.Glossary.GlossaryPackage;

import QWiki.Glossary.impl.GlossaryPackageImpl;

import QWiki.I18N.I18NPackage;
import QWiki.I18N.impl.I18NPackageImpl;
import QWiki.Infrastructure.InfrastructurePackage;

import QWiki.Infrastructure.impl.InfrastructurePackageImpl;

import QWiki.Kernel.KernelPackage;

import QWiki.Kernel.impl.KernelPackageImpl;

import QWiki.RASCI.RASCIFactory;
import QWiki.RASCI.RASCIPackage;
import QWiki.RASCI.RasciElement;
import QWiki.RASCI.Role;

import QWiki.SPICE.SPICEPackage;

import QWiki.SPICE.impl.SPICEPackageImpl;

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
public class RASCIPackageImpl extends EPackageImpl implements RASCIPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rasciElementEClass = null;

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
	 * @see QWiki.RASCI.RASCIPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RASCIPackageImpl() {
		super(eNS_URI, RASCIFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RASCIPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RASCIPackage init() {
		if (isInited) return (RASCIPackage)EPackage.Registry.INSTANCE.getEPackage(RASCIPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRASCIPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RASCIPackageImpl theRASCIPackage = registeredRASCIPackage instanceof RASCIPackageImpl ? (RASCIPackageImpl)registeredRASCIPackage : new RASCIPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BibliographyPackage.eNS_URI);
		BibliographyPackageImpl theBibliographyPackage = (BibliographyPackageImpl)(registeredPackage instanceof BibliographyPackageImpl ? registeredPackage : BibliographyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GlossaryPackage.eNS_URI);
		GlossaryPackageImpl theGlossaryPackage = (GlossaryPackageImpl)(registeredPackage instanceof GlossaryPackageImpl ? registeredPackage : GlossaryPackage.eINSTANCE);

		// Create package meta-data objects
		theRASCIPackage.createPackageContents();
		theInfrastructurePackage.createPackageContents();
		theKernelPackage.createPackageContents();
		theI18NPackage.createPackageContents();
		theSPICEPackage.createPackageContents();
		theBibliographyPackage.createPackageContents();
		theGlossaryPackage.createPackageContents();

		// Initialize created meta-data
		theRASCIPackage.initializePackageContents();
		theInfrastructurePackage.initializePackageContents();
		theKernelPackage.initializePackageContents();
		theI18NPackage.initializePackageContents();
		theSPICEPackage.initializePackageContents();
		theBibliographyPackage.initializePackageContents();
		theGlossaryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRASCIPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RASCIPackage.eNS_URI, theRASCIPackage);
		return theRASCIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_Skills() {
		return (EReference)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_ResponsibleElement() {
		return (EReference)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_AccountableElement() {
		return (EReference)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_SupportingElement() {
		return (EReference)roleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_ConsultingElement() {
		return (EReference)roleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_InformedElement() {
		return (EReference)roleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRasciElement() {
		return rasciElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRasciElement_ResponsibleRole() {
		return (EReference)rasciElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRasciElement_AccountableRole() {
		return (EReference)rasciElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRasciElement_SupportingRole() {
		return (EReference)rasciElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRasciElement_ConsultingRole() {
		return (EReference)rasciElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRasciElement_InformedRole() {
		return (EReference)rasciElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RASCIFactory getRASCIFactory() {
		return (RASCIFactory)getEFactoryInstance();
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
		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__SKILLS);
		createEReference(roleEClass, ROLE__RESPONSIBLE_ELEMENT);
		createEReference(roleEClass, ROLE__ACCOUNTABLE_ELEMENT);
		createEReference(roleEClass, ROLE__SUPPORTING_ELEMENT);
		createEReference(roleEClass, ROLE__CONSULTING_ELEMENT);
		createEReference(roleEClass, ROLE__INFORMED_ELEMENT);

		rasciElementEClass = createEClass(RASCI_ELEMENT);
		createEReference(rasciElementEClass, RASCI_ELEMENT__RESPONSIBLE_ROLE);
		createEReference(rasciElementEClass, RASCI_ELEMENT__ACCOUNTABLE_ROLE);
		createEReference(rasciElementEClass, RASCI_ELEMENT__SUPPORTING_ROLE);
		createEReference(rasciElementEClass, RASCI_ELEMENT__CONSULTING_ROLE);
		createEReference(rasciElementEClass, RASCI_ELEMENT__INFORMED_ROLE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		roleEClass.getESuperTypes().add(theI18NPackage.getI18nDescriptiveElement());
		rasciElementEClass.getESuperTypes().add(theI18NPackage.getI18nDescriptiveElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Skills(), theI18NPackage.getI18nString(), null, "skills", null, 0, -1, Role.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRole_ResponsibleElement(), this.getRasciElement(), this.getRasciElement_ResponsibleRole(), "responsibleElement", null, 0, -1, Role.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRole_AccountableElement(), this.getRasciElement(), this.getRasciElement_AccountableRole(), "accountableElement", null, 0, -1, Role.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRole_SupportingElement(), this.getRasciElement(), this.getRasciElement_SupportingRole(), "supportingElement", null, 0, -1, Role.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRole_ConsultingElement(), this.getRasciElement(), this.getRasciElement_ConsultingRole(), "consultingElement", null, 0, -1, Role.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRole_InformedElement(), this.getRasciElement(), this.getRasciElement_InformedRole(), "informedElement", null, 0, -1, Role.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rasciElementEClass, RasciElement.class, "RasciElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRasciElement_ResponsibleRole(), this.getRole(), this.getRole_ResponsibleElement(), "responsibleRole", null, 1, -1, RasciElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRasciElement_AccountableRole(), this.getRole(), this.getRole_AccountableElement(), "accountableRole", null, 0, 1, RasciElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRasciElement_SupportingRole(), this.getRole(), this.getRole_SupportingElement(), "supportingRole", null, 0, -1, RasciElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRasciElement_ConsultingRole(), this.getRole(), this.getRole_ConsultingElement(), "consultingRole", null, 0, -1, RasciElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRasciElement_InformedRole(), this.getRole(), this.getRole_InformedElement(), "informedRole", null, 0, -1, RasciElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// duplicates
		createDuplicatesAnnotations();
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
		  (roleEClass,
		   source,
		   new String[] {
		   });
	}

} //RASCIPackageImpl
