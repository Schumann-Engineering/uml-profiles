/**
 */
package QWiki.Infrastructure.impl;

import QWiki.Bibliography.BibliographyPackage;

import QWiki.Bibliography.impl.BibliographyPackageImpl;

import QWiki.Glossary.GlossaryPackage;

import QWiki.Glossary.impl.GlossaryPackageImpl;

import QWiki.I18N.I18NPackage;
import QWiki.I18N.impl.I18NPackageImpl;
import QWiki.Infrastructure.InfrastructureFactory;
import QWiki.Infrastructure.InfrastructurePackage;
import QWiki.Infrastructure.UmlAssociation;
import QWiki.Infrastructure.UmlComment;
import QWiki.Infrastructure.UmlDirectedRelationship;
import QWiki.Infrastructure.UmlElement;
import QWiki.Infrastructure.UmlNamedElement;
import QWiki.Infrastructure.UmlNamespace;
import QWiki.Infrastructure.UmlPackage;
import QWiki.Infrastructure.UmlPackageableElement;
import QWiki.Infrastructure.UmlRelationship;

import QWiki.Infrastructure.util.InfrastructureValidator;

import QWiki.Kernel.KernelPackage;

import QWiki.Kernel.impl.KernelPackageImpl;

import QWiki.RASCI.RASCIPackage;

import QWiki.RASCI.impl.RASCIPackageImpl;

import QWiki.SPICE.SPICEPackage;

import QWiki.SPICE.impl.SPICEPackageImpl;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfrastructurePackageImpl extends EPackageImpl implements InfrastructurePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlCommentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlDirectedRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlPackageableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlNamespaceEClass = null;

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
	 * @see QWiki.Infrastructure.InfrastructurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InfrastructurePackageImpl() {
		super(eNS_URI, InfrastructureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InfrastructurePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InfrastructurePackage init() {
		if (isInited) return (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredInfrastructurePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		InfrastructurePackageImpl theInfrastructurePackage = registeredInfrastructurePackage instanceof InfrastructurePackageImpl ? (InfrastructurePackageImpl)registeredInfrastructurePackage : new InfrastructurePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI);
		KernelPackageImpl theKernelPackage = (KernelPackageImpl)(registeredPackage instanceof KernelPackageImpl ? registeredPackage : KernelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(I18NPackage.eNS_URI);
		I18NPackageImpl theI18NPackage = (I18NPackageImpl)(registeredPackage instanceof I18NPackageImpl ? registeredPackage : I18NPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SPICEPackage.eNS_URI);
		SPICEPackageImpl theSPICEPackage = (SPICEPackageImpl)(registeredPackage instanceof SPICEPackageImpl ? registeredPackage : SPICEPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RASCIPackage.eNS_URI);
		RASCIPackageImpl theRASCIPackage = (RASCIPackageImpl)(registeredPackage instanceof RASCIPackageImpl ? registeredPackage : RASCIPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BibliographyPackage.eNS_URI);
		BibliographyPackageImpl theBibliographyPackage = (BibliographyPackageImpl)(registeredPackage instanceof BibliographyPackageImpl ? registeredPackage : BibliographyPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GlossaryPackage.eNS_URI);
		GlossaryPackageImpl theGlossaryPackage = (GlossaryPackageImpl)(registeredPackage instanceof GlossaryPackageImpl ? registeredPackage : GlossaryPackage.eINSTANCE);

		// Create package meta-data objects
		theInfrastructurePackage.createPackageContents();
		theKernelPackage.createPackageContents();
		theI18NPackage.createPackageContents();
		theSPICEPackage.createPackageContents();
		theRASCIPackage.createPackageContents();
		theBibliographyPackage.createPackageContents();
		theGlossaryPackage.createPackageContents();

		// Initialize created meta-data
		theInfrastructurePackage.initializePackageContents();
		theKernelPackage.initializePackageContents();
		theI18NPackage.initializePackageContents();
		theSPICEPackage.initializePackageContents();
		theRASCIPackage.initializePackageContents();
		theBibliographyPackage.initializePackageContents();
		theGlossaryPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theInfrastructurePackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return InfrastructureValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theInfrastructurePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InfrastructurePackage.eNS_URI, theInfrastructurePackage);
		return theInfrastructurePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUmlAssociation() {
		return umlAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUmlAssociation_IsDerived() {
		return (EAttribute)umlAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUmlRelationship() {
		return umlRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUmlRelationship_RelatedElement() {
		return (EReference)umlRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUmlElement() {
		return umlElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUmlElement_OwnedElement() {
		return (EReference)umlElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUmlElement_Owner() {
		return (EReference)umlElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUmlElement_OwnedComment() {
		return (EReference)umlElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUmlElement_DirectedRelationship() {
		return (EReference)umlElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUmlElement_Relationship() {
		return (EReference)umlElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUmlElement__AllOwnedElements() {
		return umlElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUmlElement__MustBeOwned() {
		return umlElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUmlComment() {
		return umlCommentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUmlComment_Body() {
		return (EAttribute)umlCommentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUmlComment_AnnotatedElement() {
		return (EReference)umlCommentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUmlDirectedRelationship() {
		return umlDirectedRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUmlDirectedRelationship_Target() {
		return (EReference)umlDirectedRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUmlDirectedRelationship_Source() {
		return (EReference)umlDirectedRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUmlNamedElement() {
		return umlNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUmlNamedElement_Namespace() {
		return (EReference)umlNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUmlNamedElement_Name() {
		return (EAttribute)umlNamedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUmlNamedElement_QualifiedName() {
		return (EAttribute)umlNamedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUmlNamedElement__AllNamespaces() {
		return umlNamedElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUmlNamedElement__Separator() {
		return umlNamedElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUmlNamedElement__QualifiedName() {
		return umlNamedElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUmlPackage() {
		return umlPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUmlPackage_PackagedElement() {
		return (EReference)umlPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUmlPackage_NestedPackage() {
		return (EReference)umlPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUmlPackage_NestingPackage() {
		return (EReference)umlPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUmlPackageableElement() {
		return umlPackageableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUmlNamespace() {
		return umlNamespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUmlNamespace_OwnedMember() {
		return (EReference)umlNamespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUmlNamespace_Member() {
		return (EReference)umlNamespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfrastructureFactory getInfrastructureFactory() {
		return (InfrastructureFactory)getEFactoryInstance();
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
		umlAssociationEClass = createEClass(UML_ASSOCIATION);
		createEAttribute(umlAssociationEClass, UML_ASSOCIATION__IS_DERIVED);

		umlRelationshipEClass = createEClass(UML_RELATIONSHIP);
		createEReference(umlRelationshipEClass, UML_RELATIONSHIP__RELATED_ELEMENT);

		umlElementEClass = createEClass(UML_ELEMENT);
		createEReference(umlElementEClass, UML_ELEMENT__OWNED_ELEMENT);
		createEReference(umlElementEClass, UML_ELEMENT__OWNER);
		createEReference(umlElementEClass, UML_ELEMENT__OWNED_COMMENT);
		createEReference(umlElementEClass, UML_ELEMENT__DIRECTED_RELATIONSHIP);
		createEReference(umlElementEClass, UML_ELEMENT__RELATIONSHIP);
		createEOperation(umlElementEClass, UML_ELEMENT___ALL_OWNED_ELEMENTS);
		createEOperation(umlElementEClass, UML_ELEMENT___MUST_BE_OWNED);

		umlCommentEClass = createEClass(UML_COMMENT);
		createEAttribute(umlCommentEClass, UML_COMMENT__BODY);
		createEReference(umlCommentEClass, UML_COMMENT__ANNOTATED_ELEMENT);

		umlDirectedRelationshipEClass = createEClass(UML_DIRECTED_RELATIONSHIP);
		createEReference(umlDirectedRelationshipEClass, UML_DIRECTED_RELATIONSHIP__TARGET);
		createEReference(umlDirectedRelationshipEClass, UML_DIRECTED_RELATIONSHIP__SOURCE);

		umlNamedElementEClass = createEClass(UML_NAMED_ELEMENT);
		createEReference(umlNamedElementEClass, UML_NAMED_ELEMENT__NAMESPACE);
		createEAttribute(umlNamedElementEClass, UML_NAMED_ELEMENT__NAME);
		createEAttribute(umlNamedElementEClass, UML_NAMED_ELEMENT__QUALIFIED_NAME);
		createEOperation(umlNamedElementEClass, UML_NAMED_ELEMENT___ALL_NAMESPACES);
		createEOperation(umlNamedElementEClass, UML_NAMED_ELEMENT___SEPARATOR);
		createEOperation(umlNamedElementEClass, UML_NAMED_ELEMENT___QUALIFIED_NAME);

		umlPackageEClass = createEClass(UML_PACKAGE);
		createEReference(umlPackageEClass, UML_PACKAGE__PACKAGED_ELEMENT);
		createEReference(umlPackageEClass, UML_PACKAGE__NESTED_PACKAGE);
		createEReference(umlPackageEClass, UML_PACKAGE__NESTING_PACKAGE);

		umlPackageableElementEClass = createEClass(UML_PACKAGEABLE_ELEMENT);

		umlNamespaceEClass = createEClass(UML_NAMESPACE);
		createEReference(umlNamespaceEClass, UML_NAMESPACE__OWNED_MEMBER);
		createEReference(umlNamespaceEClass, UML_NAMESPACE__MEMBER);
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
		I18NPackage theI18NPackage = (I18NPackage)EPackage.Registry.INSTANCE.getEPackage(I18NPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		umlAssociationEClass.getESuperTypes().add(this.getUmlRelationship());
		umlRelationshipEClass.getESuperTypes().add(this.getUmlElement());
		umlCommentEClass.getESuperTypes().add(this.getUmlElement());
		umlDirectedRelationshipEClass.getESuperTypes().add(this.getUmlRelationship());
		umlNamedElementEClass.getESuperTypes().add(theKernelPackage.getModelElement());
		umlNamedElementEClass.getESuperTypes().add(this.getUmlElement());
		umlPackageEClass.getESuperTypes().add(this.getUmlNamespace());
		umlPackageEClass.getESuperTypes().add(this.getUmlPackageableElement());
		umlPackageableElementEClass.getESuperTypes().add(this.getUmlNamedElement());
		umlNamespaceEClass.getESuperTypes().add(theI18NPackage.getI18nDescriptiveElement());
		umlNamespaceEClass.getESuperTypes().add(this.getUmlNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(umlAssociationEClass, UmlAssociation.class, "UmlAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUmlAssociation_IsDerived(), ecorePackage.getEBoolean(), "isDerived", "false", 1, 1, UmlAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(umlRelationshipEClass, UmlRelationship.class, "UmlRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUmlRelationship_RelatedElement(), this.getUmlElement(), this.getUmlElement_Relationship(), "relatedElement", null, 1, -1, UmlRelationship.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(umlElementEClass, UmlElement.class, "UmlElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUmlElement_OwnedElement(), this.getUmlElement(), this.getUmlElement_Owner(), "ownedElement", null, 0, -1, UmlElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUmlElement_Owner(), this.getUmlElement(), this.getUmlElement_OwnedElement(), "owner", null, 0, 1, UmlElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUmlElement_OwnedComment(), this.getUmlComment(), null, "ownedComment", null, 0, -1, UmlElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUmlElement_DirectedRelationship(), this.getUmlDirectedRelationship(), this.getUmlDirectedRelationship_Source(), "directedRelationship", null, 0, -1, UmlElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUmlElement_Relationship(), this.getUmlRelationship(), this.getUmlRelationship_RelatedElement(), "relationship", null, 0, -1, UmlElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getUmlElement__AllOwnedElements(), this.getUmlElement(), "allOwnedElements", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getUmlElement__MustBeOwned(), ecorePackage.getEBoolean(), "mustBeOwned", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(umlCommentEClass, UmlComment.class, "UmlComment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUmlComment_Body(), ecorePackage.getEString(), "body", null, 0, 1, UmlComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUmlComment_AnnotatedElement(), this.getUmlElement(), null, "annotatedElement", null, 0, -1, UmlComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(umlDirectedRelationshipEClass, UmlDirectedRelationship.class, "UmlDirectedRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUmlDirectedRelationship_Target(), this.getUmlElement(), null, "target", null, 1, -1, UmlDirectedRelationship.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUmlDirectedRelationship_Source(), this.getUmlElement(), this.getUmlElement_DirectedRelationship(), "source", null, 1, -1, UmlDirectedRelationship.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(umlNamedElementEClass, UmlNamedElement.class, "UmlNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUmlNamedElement_Namespace(), this.getUmlNamespace(), this.getUmlNamespace_OwnedMember(), "namespace", null, 0, 1, UmlNamedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUmlNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, UmlNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUmlNamedElement_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, UmlNamedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getUmlNamedElement__AllNamespaces(), this.getUmlNamespace(), "allNamespaces", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getUmlNamedElement__Separator(), ecorePackage.getEString(), "separator", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getUmlNamedElement__QualifiedName(), ecorePackage.getEString(), "qualifiedName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(umlPackageEClass, UmlPackage.class, "UmlPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUmlPackage_PackagedElement(), this.getUmlPackageableElement(), null, "packagedElement", null, 0, -1, UmlPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUmlPackage_NestedPackage(), this.getUmlPackage(), this.getUmlPackage_NestingPackage(), "nestedPackage", null, 0, -1, UmlPackage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUmlPackage_NestingPackage(), this.getUmlPackage(), this.getUmlPackage_NestedPackage(), "nestingPackage", null, 0, 1, UmlPackage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(umlPackageableElementEClass, UmlPackageableElement.class, "UmlPackageableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(umlNamespaceEClass, UmlNamespace.class, "UmlNamespace", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUmlNamespace_OwnedMember(), this.getUmlNamedElement(), this.getUmlNamedElement_Namespace(), "ownedMember", null, 0, -1, UmlNamespace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUmlNamespace_Member(), this.getUmlNamedElement(), null, "member", null, 0, -1, UmlNamespace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// union
		createUnionAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
		// subsets
		createSubsetsAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });
		addAnnotation
		  (umlElementEClass,
		   source,
		   new String[] {
			   "constraints", "not_own_self has_owner"
		   });
		addAnnotation
		  (umlNamedElementEClass,
		   source,
		   new String[] {
			   "constraints", "has_no_qualified_name has_qualified_name"
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
		  (getUmlRelationship_RelatedElement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUmlElement_OwnedElement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUmlElement_Owner(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUmlElement_DirectedRelationship(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUmlElement_Relationship(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUmlDirectedRelationship_Target(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUmlDirectedRelationship_Source(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUmlNamedElement_Namespace(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUmlNamespace_OwnedMember(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUmlNamespace_Member(),
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
		  (umlElementEClass,
		   source,
		   new String[] {
			   "not_own_self", "not self.allOwnedElements()->includes(self)",
			   "has_owner", "self.mustBeOwned() implies owner->notEmpty()"
		   });
		addAnnotation
		  (getUmlElement__AllOwnedElements(),
		   source,
		   new String[] {
			   "body", "ownedElement->union(ownedElement->collect(e | e.allOwnedElements()))->asSet()"
		   });
		addAnnotation
		  (getUmlElement__MustBeOwned(),
		   source,
		   new String[] {
			   "body", "true"
		   });
		addAnnotation
		  (umlNamedElementEClass,
		   source,
		   new String[] {
			   "has_no_qualified_name", "(self.name->isEmpty() or self.allNamespaces()->select(ns | ns.name->isEmpty())->notEmpty())\r\n  implies self.qualifiedName->isEmpty()",
			   "has_qualified_name", "(self.name->notEmpty() and self.allNamespaces()->select(ns | ns.name->isEmpty())->isEmpty()) implies\n  self.qualifiedName = self.allNamespaces()->iterate( ns : UmlNamespace; result: String = self.name | ns.name + self.separator() + result)"
		   });
		addAnnotation
		  (getUmlNamedElement__AllNamespaces(),
		   source,
		   new String[] {
			   "body", "if self.namespace->isEmpty()\nthen Sequence{}\nelse self.namespace.allNamespaces()->prepend(self.namespace)\nendif"
		   });
		addAnnotation
		  (getUmlNamedElement__Separator(),
		   source,
		   new String[] {
			   "body", "\'::\'"
		   });
		addAnnotation
		  (getUmlNamedElement__QualifiedName(),
		   source,
		   new String[] {
			   "body", "if (self.name->notEmpty() and self.allNamespaces()->select(ns | ns.name <> null)->isEmpty()) then \n    self.allNamespaces()->iterate( ns : UmlNamespace; result: String = self.name | ns.name + self.separator() + result)\nelse\n    null\nendif"
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
		  (getUmlElement_OwnedComment(),
		   source,
		   new String[] {
			   "body", "owningElement"
		   });
		addAnnotation
		  (getUmlComment_AnnotatedElement(),
		   source,
		   new String[] {
			   "body", "comment"
		   });
		addAnnotation
		  (getUmlDirectedRelationship_Target(),
		   source,
		   new String[] {
			   "body", "directedRelationship"
		   });
		addAnnotation
		  (getUmlPackage_PackagedElement(),
		   source,
		   new String[] {
			   "body", "owningPackage"
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
		  (getUmlElement_OwnedComment(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlElement/ownedElement")
		   });
		addAnnotation
		  (getUmlElement_DirectedRelationship(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlElement/relationship")
		   });
		addAnnotation
		  (getUmlDirectedRelationship_Target(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlRelationship/relatedElement")
		   });
		addAnnotation
		  (getUmlDirectedRelationship_Source(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlRelationship/relatedElement")
		   });
		addAnnotation
		  (getUmlNamedElement_Namespace(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlElement/owner")
		   });
		addAnnotation
		  (getUmlPackage_PackagedElement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlNamespace/ownedMember")
		   });
		addAnnotation
		  (getUmlPackage_NestedPackage(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlPackage/packagedElement")
		   });
		addAnnotation
		  (getUmlPackage_NestingPackage(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlNamedElement/namespace")
		   });
		addAnnotation
		  (getUmlNamespace_OwnedMember(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlNamespace/member"),
			 URI.createURI(eNS_URI).appendFragment("//UmlElement/ownedElement")
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
		  (getUmlElement_DirectedRelationship(),
		   source,
		   new String[] {
			   "kind", "element"
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
		  (umlPackageEClass,
		   source,
		   new String[] {
		   });
	}

} //InfrastructurePackageImpl
