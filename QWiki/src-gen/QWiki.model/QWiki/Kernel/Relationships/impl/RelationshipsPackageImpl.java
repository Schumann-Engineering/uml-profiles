/**
 */
package QWiki.Kernel.Relationships.impl;

import QWiki.Domain.DomainPackage;

import QWiki.Domain.impl.DomainPackageImpl;

import QWiki.Glossary.GlossaryPackage;

import QWiki.Glossary.impl.GlossaryPackageImpl;

import QWiki.Kernel.KernelPackage;

import QWiki.Kernel.Relationships.DO_NOT_USE_ModelElement;
import QWiki.Kernel.Relationships.DO_NOT_USE_Relationship;
import QWiki.Kernel.Relationships.DO_NOT_USE_RelationshipType;
import QWiki.Kernel.Relationships.DO_NOT_USE_SuperseedingRelationship;
import QWiki.Kernel.Relationships.DO_NOT_USE_SuperseedingType;
import QWiki.Kernel.Relationships.RelationshipsFactory;
import QWiki.Kernel.Relationships.RelationshipsPackage;

import QWiki.Kernel.impl.KernelPackageImpl;

import QWiki.Rasci.RASCIPackage;

import QWiki.Rasci.impl.RASCIPackageImpl;

import QWiki.References.ReferencesPackage;

import QWiki.References.impl.ReferencesPackageImpl;

import QWiki.Spice.SPICEPackage;

import QWiki.Spice.impl.SPICEPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class RelationshipsPackageImpl extends EPackageImpl implements RelationshipsPackage {
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
	private EClass dO_NOT_USE_SuperseedingRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dO_NOT_USE_ModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dO_NOT_USE_SuperseedingTypeEEnum = null;

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
	 * @see QWiki.Kernel.Relationships.RelationshipsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelationshipsPackageImpl() {
		super(eNS_URI, RelationshipsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RelationshipsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelationshipsPackage init() {
		if (isInited) return (RelationshipsPackage)EPackage.Registry.INSTANCE.getEPackage(RelationshipsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelationshipsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelationshipsPackageImpl theRelationshipsPackage = registeredRelationshipsPackage instanceof RelationshipsPackageImpl ? (RelationshipsPackageImpl)registeredRelationshipsPackage : new RelationshipsPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(KernelPackage.eNS_URI);
		KernelPackageImpl theKernelPackage = (KernelPackageImpl)(registeredPackage instanceof KernelPackageImpl ? registeredPackage : KernelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SPICEPackage.eNS_URI);
		SPICEPackageImpl theSPICEPackage = (SPICEPackageImpl)(registeredPackage instanceof SPICEPackageImpl ? registeredPackage : SPICEPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RASCIPackage.eNS_URI);
		RASCIPackageImpl theRASCIPackage = (RASCIPackageImpl)(registeredPackage instanceof RASCIPackageImpl ? registeredPackage : RASCIPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);
		ReferencesPackageImpl theReferencesPackage = (ReferencesPackageImpl)(registeredPackage instanceof ReferencesPackageImpl ? registeredPackage : ReferencesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GlossaryPackage.eNS_URI);
		GlossaryPackageImpl theGlossaryPackage = (GlossaryPackageImpl)(registeredPackage instanceof GlossaryPackageImpl ? registeredPackage : GlossaryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(registeredPackage instanceof DomainPackageImpl ? registeredPackage : DomainPackage.eINSTANCE);

		// Create package meta-data objects
		theRelationshipsPackage.createPackageContents();
		theKernelPackage.createPackageContents();
		theSPICEPackage.createPackageContents();
		theRASCIPackage.createPackageContents();
		theReferencesPackage.createPackageContents();
		theGlossaryPackage.createPackageContents();
		theDomainPackage.createPackageContents();

		// Initialize created meta-data
		theRelationshipsPackage.initializePackageContents();
		theKernelPackage.initializePackageContents();
		theSPICEPackage.initializePackageContents();
		theRASCIPackage.initializePackageContents();
		theReferencesPackage.initializePackageContents();
		theGlossaryPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelationshipsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelationshipsPackage.eNS_URI, theRelationshipsPackage);
		return theRelationshipsPackage;
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
	public EClass getDO_NOT_USE_SuperseedingRelationship() {
		return dO_NOT_USE_SuperseedingRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDO_NOT_USE_SuperseedingRelationship_SuperseedingType() {
		return (EAttribute)dO_NOT_USE_SuperseedingRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDO_NOT_USE_ModelElement() {
		return dO_NOT_USE_ModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDO_NOT_USE_ModelElement_SuperseedingRelationship() {
		return (EReference)dO_NOT_USE_ModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDO_NOT_USE_SuperseedingType() {
		return dO_NOT_USE_SuperseedingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationshipsFactory getRelationshipsFactory() {
		return (RelationshipsFactory)getEFactoryInstance();
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
		dO_NOT_USE_RelationshipEClass = createEClass(DO_NOT_USE_RELATIONSHIP);

		dO_NOT_USE_RelationshipTypeEClass = createEClass(DO_NOT_USE_RELATIONSHIP_TYPE);

		dO_NOT_USE_SuperseedingRelationshipEClass = createEClass(DO_NOT_USE_SUPERSEEDING_RELATIONSHIP);
		createEAttribute(dO_NOT_USE_SuperseedingRelationshipEClass, DO_NOT_USE_SUPERSEEDING_RELATIONSHIP__SUPERSEEDING_TYPE);

		dO_NOT_USE_ModelElementEClass = createEClass(DO_NOT_USE_MODEL_ELEMENT);
		createEReference(dO_NOT_USE_ModelElementEClass, DO_NOT_USE_MODEL_ELEMENT__SUPERSEEDING_RELATIONSHIP);

		// Create enums
		dO_NOT_USE_SuperseedingTypeEEnum = createEEnum(DO_NOT_USE_SUPERSEEDING_TYPE);
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
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dO_NOT_USE_RelationshipTypeEClass.getESuperTypes().add(theKernelPackage.getI18nNamedElement());
		dO_NOT_USE_SuperseedingRelationshipEClass.getESuperTypes().add(theUMLPackage.getDirectedRelationship());

		// Initialize classes, features, and operations; add parameters
		initEClass(dO_NOT_USE_RelationshipEClass, DO_NOT_USE_Relationship.class, "DO_NOT_USE_Relationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dO_NOT_USE_RelationshipTypeEClass, DO_NOT_USE_RelationshipType.class, "DO_NOT_USE_RelationshipType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dO_NOT_USE_SuperseedingRelationshipEClass, DO_NOT_USE_SuperseedingRelationship.class, "DO_NOT_USE_SuperseedingRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDO_NOT_USE_SuperseedingRelationship_SuperseedingType(), this.getDO_NOT_USE_SuperseedingType(), "superseedingType", "Equal", 1, 1, DO_NOT_USE_SuperseedingRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dO_NOT_USE_ModelElementEClass, DO_NOT_USE_ModelElement.class, "DO_NOT_USE_ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDO_NOT_USE_ModelElement_SuperseedingRelationship(), this.getDO_NOT_USE_SuperseedingRelationship(), null, "superseedingRelationship", null, 0, -1, DO_NOT_USE_ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dO_NOT_USE_SuperseedingTypeEEnum, DO_NOT_USE_SuperseedingType.class, "DO_NOT_USE_SuperseedingType");
		addEEnumLiteral(dO_NOT_USE_SuperseedingTypeEEnum, DO_NOT_USE_SuperseedingType.ADDED);
		addEEnumLiteral(dO_NOT_USE_SuperseedingTypeEEnum, DO_NOT_USE_SuperseedingType.EQUAL);
		addEEnumLiteral(dO_NOT_USE_SuperseedingTypeEEnum, DO_NOT_USE_SuperseedingType.UPDATED_MAJOR);
		addEEnumLiteral(dO_NOT_USE_SuperseedingTypeEEnum, DO_NOT_USE_SuperseedingType.UPDATED_MINOR);
		addEEnumLiteral(dO_NOT_USE_SuperseedingTypeEEnum, DO_NOT_USE_SuperseedingType.REMOVED);

		// Create annotations
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
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
		  (getDO_NOT_USE_ModelElement_SuperseedingRelationship(),
		   source,
		   new String[] {
			   "body", "document"
		   });
	}

} //RelationshipsPackageImpl
