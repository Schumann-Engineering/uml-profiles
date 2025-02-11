/**
 */
package QWiki.Rasci.impl;

import QWiki.Content.ContentPackage;
import QWiki.Content.impl.ContentPackageImpl;
import QWiki.Domain.DomainPackage;

import QWiki.Domain.impl.DomainPackageImpl;

import QWiki.Glossary.GlossaryPackage;

import QWiki.Glossary.impl.GlossaryPackageImpl;

import QWiki.QWikiPackage;

import QWiki.Rasci.RasciElement;
import QWiki.Rasci.RasciFactory;
import QWiki.Rasci.RasciPackage;
import QWiki.Rasci.Role;

import QWiki.References.ReferencesPackage;

import QWiki.References.impl.ReferencesPackageImpl;

import QWiki.Relationships.RelationshipsPackage;

import QWiki.Relationships.impl.RelationshipsPackageImpl;

import QWiki.Spice.SpicePackage;

import QWiki.Spice.impl.SpicePackageImpl;

import QWiki.impl.QWikiPackageImpl;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EClass;
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
public class RasciPackageImpl extends EPackageImpl implements RasciPackage {
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
	 * @see QWiki.Rasci.RasciPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RasciPackageImpl() {
		super(eNS_URI, RasciFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RasciPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RasciPackage init() {
		if (isInited) return (RasciPackage)EPackage.Registry.INSTANCE.getEPackage(RasciPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRasciPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RasciPackageImpl theRasciPackage = registeredRasciPackage instanceof RasciPackageImpl ? (RasciPackageImpl)registeredRasciPackage : new RasciPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);
		ContentPackageImpl theContentPackage = (ContentPackageImpl)(registeredPackage instanceof ContentPackageImpl ? registeredPackage : ContentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GlossaryPackage.eNS_URI);
		GlossaryPackageImpl theGlossaryPackage = (GlossaryPackageImpl)(registeredPackage instanceof GlossaryPackageImpl ? registeredPackage : GlossaryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);
		ReferencesPackageImpl theReferencesPackage = (ReferencesPackageImpl)(registeredPackage instanceof ReferencesPackageImpl ? registeredPackage : ReferencesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(registeredPackage instanceof DomainPackageImpl ? registeredPackage : DomainPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RelationshipsPackage.eNS_URI);
		RelationshipsPackageImpl theRelationshipsPackage = (RelationshipsPackageImpl)(registeredPackage instanceof RelationshipsPackageImpl ? registeredPackage : RelationshipsPackage.eINSTANCE);

		// Create package meta-data objects
		theRasciPackage.createPackageContents();
		theQWikiPackage.createPackageContents();
		theSpicePackage.createPackageContents();
		theContentPackage.createPackageContents();
		theGlossaryPackage.createPackageContents();
		theReferencesPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theRelationshipsPackage.createPackageContents();

		// Initialize created meta-data
		theRasciPackage.initializePackageContents();
		theQWikiPackage.initializePackageContents();
		theSpicePackage.initializePackageContents();
		theContentPackage.initializePackageContents();
		theGlossaryPackage.initializePackageContents();
		theReferencesPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theRelationshipsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRasciPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RasciPackage.eNS_URI, theRasciPackage);
		return theRasciPackage;
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
	public EOperation getRole__ObjectId() {
		return roleEClass.getEOperations().get(0);
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
	public EReference getRasciElement_SupportRole() {
		return (EReference)rasciElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRasciElement_ConsultedRole() {
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
	public RasciFactory getRasciFactory() {
		return (RasciFactory)getEFactoryInstance();
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
		createEOperation(roleEClass, ROLE___OBJECT_ID);

		rasciElementEClass = createEClass(RASCI_ELEMENT);
		createEReference(rasciElementEClass, RASCI_ELEMENT__RESPONSIBLE_ROLE);
		createEReference(rasciElementEClass, RASCI_ELEMENT__ACCOUNTABLE_ROLE);
		createEReference(rasciElementEClass, RASCI_ELEMENT__SUPPORT_ROLE);
		createEReference(rasciElementEClass, RASCI_ELEMENT__CONSULTED_ROLE);
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
		QWikiPackage theQWikiPackage = (QWikiPackage)EPackage.Registry.INSTANCE.getEPackage(QWikiPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		roleEClass.getESuperTypes().add(theQWikiPackage.getL10nDescriptiveElement());
		rasciElementEClass.getESuperTypes().add(theQWikiPackage.getL10nDescriptiveElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Skills(), theQWikiPackage.getL10nString(), null, "skills", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRole_ResponsibleElement(), this.getRasciElement(), this.getRasciElement_ResponsibleRole(), "responsibleElement", null, 0, -1, Role.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRole_AccountableElement(), this.getRasciElement(), this.getRasciElement_AccountableRole(), "accountableElement", null, 0, -1, Role.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRole_SupportingElement(), this.getRasciElement(), this.getRasciElement_SupportRole(), "supportingElement", null, 0, -1, Role.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRole_ConsultingElement(), this.getRasciElement(), this.getRasciElement_ConsultedRole(), "consultingElement", null, 0, -1, Role.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRole_InformedElement(), this.getRasciElement(), this.getRasciElement_InformedRole(), "informedElement", null, 0, -1, Role.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getRole__ObjectId(), ecorePackage.getEString(), "objectId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(rasciElementEClass, RasciElement.class, "RasciElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRasciElement_ResponsibleRole(), this.getRole(), this.getRole_ResponsibleElement(), "responsibleRole", null, 1, -1, RasciElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRasciElement_AccountableRole(), this.getRole(), this.getRole_AccountableElement(), "accountableRole", null, 0, 1, RasciElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRasciElement_SupportRole(), this.getRole(), this.getRole_SupportingElement(), "supportRole", null, 0, -1, RasciElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRasciElement_ConsultedRole(), this.getRole(), this.getRole_ConsultingElement(), "consultedRole", null, 0, -1, RasciElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRasciElement_InformedRole(), this.getRole(), this.getRole_InformedElement(), "informedRole", null, 0, -1, RasciElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// redefines
		createRedefinesAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
		  (getRole__ObjectId(),
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
		  (getRole__ObjectId(),
		   source,
		   new String[] {
			   "body", "\'r/\' + name"
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
		  (getRole_Skills(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getRole_ResponsibleElement(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getRole_AccountableElement(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getRole_SupportingElement(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getRole_ConsultingElement(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getRole_InformedElement(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getRasciElement_ResponsibleRole(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getRasciElement_AccountableRole(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getRasciElement_SupportRole(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getRasciElement_ConsultedRole(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getRasciElement_InformedRole(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
	}

} //RasciPackageImpl
