/**
 */
package QWiki.Kernel.impl;

import QWiki.Bibliography.BibliographyPackage;

import QWiki.Bibliography.impl.BibliographyPackageImpl;

import QWiki.Glossary.GlossaryPackage;

import QWiki.Glossary.impl.GlossaryPackageImpl;

import QWiki.I18N.I18NPackage;
import QWiki.I18N.impl.I18NPackageImpl;
import QWiki.Infrastructure.InfrastructurePackage;

import QWiki.Infrastructure.impl.InfrastructurePackageImpl;

import QWiki.Kernel.DO_NOT_USE_Relationship;
import QWiki.Kernel.DO_NOT_USE_RelationshipType;
import QWiki.Kernel.KernelFactory;
import QWiki.Kernel.KernelPackage;
import QWiki.Kernel.ModelDomain;
import QWiki.Kernel.ModelDomainElement;
import QWiki.Kernel.ModelElement;
import QWiki.Kernel.ModelRoot;
import QWiki.Kernel.ModelTaggedElement;
import QWiki.Kernel.SuperseedingRelationship;
import QWiki.Kernel.SuperseedingType;

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
public class KernelPackageImpl extends EPackageImpl implements KernelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelDomainElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelTaggedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dO_NOT_USE_RelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dO_NOT_USE_RelationshipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superseedingRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum superseedingTypeEEnum = null;

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
	 * @see QWiki.Kernel.KernelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KernelPackageImpl() {
		super(eNS_URI, KernelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link KernelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KernelPackage init() {
		if (isInited) return (KernelPackage)EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredKernelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		KernelPackageImpl theKernelPackage = registeredKernelPackage instanceof KernelPackageImpl ? (KernelPackageImpl)registeredKernelPackage : new KernelPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);
		InfrastructurePackageImpl theInfrastructurePackage = (InfrastructurePackageImpl)(registeredPackage instanceof InfrastructurePackageImpl ? registeredPackage : InfrastructurePackage.eINSTANCE);
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
		theKernelPackage.createPackageContents();
		theInfrastructurePackage.createPackageContents();
		theI18NPackage.createPackageContents();
		theSPICEPackage.createPackageContents();
		theRASCIPackage.createPackageContents();
		theBibliographyPackage.createPackageContents();
		theGlossaryPackage.createPackageContents();

		// Initialize created meta-data
		theKernelPackage.initializePackageContents();
		theInfrastructurePackage.initializePackageContents();
		theI18NPackage.initializePackageContents();
		theSPICEPackage.initializePackageContents();
		theRASCIPackage.initializePackageContents();
		theBibliographyPackage.initializePackageContents();
		theGlossaryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKernelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KernelPackage.eNS_URI, theKernelPackage);
		return theKernelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelDomain() {
		return modelDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelDomain_DomainElement() {
		return (EReference)modelDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelDomain__AllDomainElement() {
		return modelDomainEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelDomainElement() {
		return modelDomainElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelDomainElement_Domain() {
		return (EReference)modelDomainElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelDomainElement_AssignedDomain() {
		return (EReference)modelDomainElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelRoot() {
		return modelRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelRoot_OwnedModelElement() {
		return (EReference)modelRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelTaggedElement() {
		return modelTaggedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelTaggedElement_Tag() {
		return (EAttribute)modelTaggedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelTaggedElement_CustomProperty() {
		return (EReference)modelTaggedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDO_NOT_USE_Relationship() {
		return dO_NOT_USE_RelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDO_NOT_USE_RelationshipType() {
		return dO_NOT_USE_RelationshipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSuperseedingRelationship() {
		return superseedingRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSuperseedingRelationship_SuperseedingType() {
		return (EAttribute)superseedingRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelElement_Model() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Uuid() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelElement_SuperseedingRelationship() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelElement__Model() {
		return modelElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModelElement__Oid() {
		return modelElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSuperseedingType() {
		return superseedingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KernelFactory getKernelFactory() {
		return (KernelFactory)getEFactoryInstance();
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
		modelDomainEClass = createEClass(MODEL_DOMAIN);
		createEReference(modelDomainEClass, MODEL_DOMAIN__DOMAIN_ELEMENT);
		createEOperation(modelDomainEClass, MODEL_DOMAIN___ALL_DOMAIN_ELEMENT);

		modelDomainElementEClass = createEClass(MODEL_DOMAIN_ELEMENT);
		createEReference(modelDomainElementEClass, MODEL_DOMAIN_ELEMENT__DOMAIN);
		createEReference(modelDomainElementEClass, MODEL_DOMAIN_ELEMENT__ASSIGNED_DOMAIN);

		modelRootEClass = createEClass(MODEL_ROOT);
		createEReference(modelRootEClass, MODEL_ROOT__OWNED_MODEL_ELEMENT);

		modelTaggedElementEClass = createEClass(MODEL_TAGGED_ELEMENT);
		createEAttribute(modelTaggedElementEClass, MODEL_TAGGED_ELEMENT__TAG);
		createEReference(modelTaggedElementEClass, MODEL_TAGGED_ELEMENT__CUSTOM_PROPERTY);

		dO_NOT_USE_RelationshipEClass = createEClass(DO_NOT_USE_RELATIONSHIP);

		dO_NOT_USE_RelationshipTypeEClass = createEClass(DO_NOT_USE_RELATIONSHIP_TYPE);

		superseedingRelationshipEClass = createEClass(SUPERSEEDING_RELATIONSHIP);
		createEAttribute(superseedingRelationshipEClass, SUPERSEEDING_RELATIONSHIP__SUPERSEEDING_TYPE);

		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEReference(modelElementEClass, MODEL_ELEMENT__MODEL);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__UUID);
		createEReference(modelElementEClass, MODEL_ELEMENT__SUPERSEEDING_RELATIONSHIP);
		createEOperation(modelElementEClass, MODEL_ELEMENT___MODEL);
		createEOperation(modelElementEClass, MODEL_ELEMENT___OID);

		// Create enums
		superseedingTypeEEnum = createEEnum(SUPERSEEDING_TYPE);
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
		InfrastructurePackage theInfrastructurePackage = (InfrastructurePackage)EPackage.Registry.INSTANCE.getEPackage(InfrastructurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		modelDomainEClass.getESuperTypes().add(theI18NPackage.getI18nNamedElement());
		modelDomainElementEClass.getESuperTypes().add(theInfrastructurePackage.getUmlNamedElement());
		modelRootEClass.getESuperTypes().add(theInfrastructurePackage.getUmlPackage());
		modelTaggedElementEClass.getESuperTypes().add(theInfrastructurePackage.getUmlElement());
		dO_NOT_USE_RelationshipTypeEClass.getESuperTypes().add(theI18NPackage.getI18nNamedElement());
		superseedingRelationshipEClass.getESuperTypes().add(theInfrastructurePackage.getUmlDirectedRelationship());
		modelElementEClass.getESuperTypes().add(this.getModelTaggedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelDomainEClass, ModelDomain.class, "ModelDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelDomain_DomainElement(), this.getModelDomainElement(), this.getModelDomainElement_AssignedDomain(), "domainElement", null, 0, -1, ModelDomain.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getModelDomain__AllDomainElement(), this.getModelDomainElement(), "allDomainElement", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(modelDomainElementEClass, ModelDomainElement.class, "ModelDomainElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelDomainElement_Domain(), this.getModelDomain(), null, "domain", null, 0, 1, ModelDomainElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getModelDomainElement_AssignedDomain(), this.getModelDomain(), this.getModelDomain_DomainElement(), "assignedDomain", null, 0, 1, ModelDomainElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modelRootEClass, ModelRoot.class, "ModelRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelRoot_OwnedModelElement(), this.getModelElement(), this.getModelElement_Model(), "ownedModelElement", null, 0, -1, ModelRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modelTaggedElementEClass, ModelTaggedElement.class, "ModelTaggedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelTaggedElement_Tag(), ecorePackage.getEString(), "tag", null, 0, -1, ModelTaggedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModelTaggedElement_CustomProperty(), theI18NPackage.getI18nKeyedString(), null, "customProperty", null, 0, -1, ModelTaggedElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dO_NOT_USE_RelationshipEClass, DO_NOT_USE_Relationship.class, "DO_NOT_USE_Relationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dO_NOT_USE_RelationshipTypeEClass, DO_NOT_USE_RelationshipType.class, "DO_NOT_USE_RelationshipType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(superseedingRelationshipEClass, SuperseedingRelationship.class, "SuperseedingRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSuperseedingRelationship_SuperseedingType(), this.getSuperseedingType(), "superseedingType", "Equal", 1, 1, SuperseedingRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelElement_Model(), this.getModelRoot(), this.getModelRoot_OwnedModelElement(), "model", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getModelElement_Uuid(), ecorePackage.getEString(), "uuid", null, 1, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModelElement_SuperseedingRelationship(), this.getSuperseedingRelationship(), null, "superseedingRelationship", null, 0, -1, ModelElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getModelElement__Model(), this.getModelRoot(), "model", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getModelElement__Oid(), ecorePackage.getEString(), "oid", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(superseedingTypeEEnum, SuperseedingType.class, "SuperseedingType");
		addEEnumLiteral(superseedingTypeEEnum, SuperseedingType.ADDED);
		addEEnumLiteral(superseedingTypeEEnum, SuperseedingType.EQUAL);
		addEEnumLiteral(superseedingTypeEEnum, SuperseedingType.UPDATED_MAJOR);
		addEEnumLiteral(superseedingTypeEEnum, SuperseedingType.UPDATED_MINOR);
		addEEnumLiteral(superseedingTypeEEnum, SuperseedingType.REMOVED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
		// union
		createUnionAnnotations();
		// subsets
		createSubsetsAnnotations();
		// duplicates
		createDuplicatesAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
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
	 * Initializes the annotations for <b>http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEmofAnnotations() {
		String source = "http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName";
		addAnnotation
		  (getModelDomainElement_Domain(),
		   source,
		   new String[] {
			   "body", "namedelement"
		   });
		addAnnotation
		  (getModelTaggedElement_CustomProperty(),
		   source,
		   new String[] {
			   "body", "owningElement"
		   });
		addAnnotation
		  (getModelElement_SuperseedingRelationship(),
		   source,
		   new String[] {
			   "body", "document"
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
		  (getModelDomainElement_Domain(),
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
		  (getModelDomainElement_AssignedDomain(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ModelDomainElement/domain")
		   });
		addAnnotation
		  (getModelRoot_OwnedModelElement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(InfrastructurePackage.eNS_URI).appendFragment("//UmlElement/ownedElement")
		   });
		addAnnotation
		  (getModelElement_Model(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(InfrastructurePackage.eNS_URI).appendFragment("//UmlElement/owner")
		   });
		addAnnotation
		  (getModelElement_SuperseedingRelationship(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(InfrastructurePackage.eNS_URI).appendFragment("//UmlElement/relationship")
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
		  (modelRootEClass,
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
		  (getModelElement__Model(),
		   source,
		   new String[] {
			   "body", "if (model->notEmpty()) then\r\n  model\r\nelse if (owner->notEmpty() and owner->oclIsKindOf(ModelElement)) then\r\n  owner.oclAsType(ModelElement).model()\r\nelse\r\n  null\r\nendif\r\nendif"
		   });
		addAnnotation
		  (getModelElement__Oid(),
		   source,
		   new String[] {
			   "body", "uuid"
		   });
	}

} //KernelPackageImpl
