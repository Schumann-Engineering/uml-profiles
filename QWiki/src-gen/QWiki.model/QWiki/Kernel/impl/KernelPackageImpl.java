/**
 */
package QWiki.Kernel.impl;

import QWiki.Domain.DomainPackage;

import QWiki.Domain.impl.DomainPackageImpl;

import QWiki.Glossary.GlossaryPackage;

import QWiki.Glossary.impl.GlossaryPackageImpl;

import QWiki.Kernel.I18nBaseString;
import QWiki.Kernel.I18nDescriptiveElement;
import QWiki.Kernel.I18nKeyedString;
import QWiki.Kernel.I18nNamedElement;
import QWiki.Kernel.I18nString;
import QWiki.Kernel.I18nValue;
import QWiki.Kernel.KernelFactory;
import QWiki.Kernel.KernelPackage;
import QWiki.Kernel.QWikiComment;
import QWiki.Kernel.QWikiContainer;
import QWiki.Kernel.QWikiElement;
import QWiki.Kernel.QWikiNamedElement;
import QWiki.Kernel.QWikiNamespace;

import QWiki.Kernel.Relationships.RelationshipsPackage;

import QWiki.Kernel.Relationships.impl.RelationshipsPackageImpl;

import QWiki.Rasci.RASCIPackage;

import QWiki.Rasci.impl.RASCIPackageImpl;

import QWiki.References.ReferencesPackage;

import QWiki.References.impl.ReferencesPackageImpl;

import QWiki.Spice.SPICEPackage;

import QWiki.Spice.impl.SPICEPackageImpl;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
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
public class KernelPackageImpl extends EPackageImpl implements KernelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass i18nNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qWikiNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qWikiElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass i18nKeyedStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass i18nBaseStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass i18nValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass i18nStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qWikiCommentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass i18nDescriptiveElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qWikiNamespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qWikiContainerEClass = null;

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

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RelationshipsPackage.eNS_URI);
		RelationshipsPackageImpl theRelationshipsPackage = (RelationshipsPackageImpl)(registeredPackage instanceof RelationshipsPackageImpl ? registeredPackage : RelationshipsPackage.eINSTANCE);
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
		theKernelPackage.createPackageContents();
		theRelationshipsPackage.createPackageContents();
		theSPICEPackage.createPackageContents();
		theRASCIPackage.createPackageContents();
		theReferencesPackage.createPackageContents();
		theGlossaryPackage.createPackageContents();
		theDomainPackage.createPackageContents();

		// Initialize created meta-data
		theKernelPackage.initializePackageContents();
		theRelationshipsPackage.initializePackageContents();
		theSPICEPackage.initializePackageContents();
		theRASCIPackage.initializePackageContents();
		theReferencesPackage.initializePackageContents();
		theGlossaryPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();

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
	public EClass getI18nNamedElement() {
		return i18nNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getI18nNamedElement_DisplayName() {
		return (EReference)i18nNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQWikiNamedElement() {
		return qWikiNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQWikiElement() {
		return qWikiElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQWikiElement_Uuid() {
		return (EAttribute)qWikiElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQWikiElement_CustomProperty() {
		return (EReference)qWikiElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQWikiElement_Tag() {
		return (EAttribute)qWikiElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getQWikiElement__Oid() {
		return qWikiElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getI18nKeyedString() {
		return i18nKeyedStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getI18nKeyedString_Key() {
		return (EAttribute)i18nKeyedStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getI18nBaseString() {
		return i18nBaseStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getI18nBaseString_Value() {
		return (EReference)i18nBaseStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getI18nBaseString__Value__String() {
		return i18nBaseStringEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getI18nValue() {
		return i18nValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getI18nValue_Language() {
		return (EAttribute)i18nValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getI18nValue_Body() {
		return (EAttribute)i18nValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getI18nString() {
		return i18nStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQWikiComment() {
		return qWikiCommentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQWikiComment_Content() {
		return (EReference)qWikiCommentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getI18nDescriptiveElement() {
		return i18nDescriptiveElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getI18nDescriptiveElement_Purpose() {
		return (EReference)i18nDescriptiveElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getI18nDescriptiveElement_Content() {
		return (EReference)i18nDescriptiveElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQWikiNamespace() {
		return qWikiNamespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQWikiContainer() {
		return qWikiContainerEClass;
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
		i18nNamedElementEClass = createEClass(I1_8N_NAMED_ELEMENT);
		createEReference(i18nNamedElementEClass, I1_8N_NAMED_ELEMENT__DISPLAY_NAME);

		qWikiNamedElementEClass = createEClass(QWIKI_NAMED_ELEMENT);

		qWikiElementEClass = createEClass(QWIKI_ELEMENT);
		createEAttribute(qWikiElementEClass, QWIKI_ELEMENT__UUID);
		createEReference(qWikiElementEClass, QWIKI_ELEMENT__CUSTOM_PROPERTY);
		createEAttribute(qWikiElementEClass, QWIKI_ELEMENT__TAG);
		createEOperation(qWikiElementEClass, QWIKI_ELEMENT___OID);

		i18nKeyedStringEClass = createEClass(I1_8N_KEYED_STRING);
		createEAttribute(i18nKeyedStringEClass, I1_8N_KEYED_STRING__KEY);

		i18nBaseStringEClass = createEClass(I1_8N_BASE_STRING);
		createEReference(i18nBaseStringEClass, I1_8N_BASE_STRING__VALUE);
		createEOperation(i18nBaseStringEClass, I1_8N_BASE_STRING___VALUE__STRING);

		i18nValueEClass = createEClass(I1_8N_VALUE);
		createEAttribute(i18nValueEClass, I1_8N_VALUE__LANGUAGE);
		createEAttribute(i18nValueEClass, I1_8N_VALUE__BODY);

		i18nStringEClass = createEClass(I1_8N_STRING);

		qWikiCommentEClass = createEClass(QWIKI_COMMENT);
		createEReference(qWikiCommentEClass, QWIKI_COMMENT__CONTENT);

		i18nDescriptiveElementEClass = createEClass(I1_8N_DESCRIPTIVE_ELEMENT);
		createEReference(i18nDescriptiveElementEClass, I1_8N_DESCRIPTIVE_ELEMENT__PURPOSE);
		createEReference(i18nDescriptiveElementEClass, I1_8N_DESCRIPTIVE_ELEMENT__CONTENT);

		qWikiNamespaceEClass = createEClass(QWIKI_NAMESPACE);

		qWikiContainerEClass = createEClass(QWIKI_CONTAINER);
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
		RelationshipsPackage theRelationshipsPackage = (RelationshipsPackage)EPackage.Registry.INSTANCE.getEPackage(RelationshipsPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theRelationshipsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		i18nNamedElementEClass.getESuperTypes().add(this.getQWikiNamedElement());
		qWikiNamedElementEClass.getESuperTypes().add(theUMLPackage.getNamedElement());
		qWikiNamedElementEClass.getESuperTypes().add(this.getQWikiElement());
		qWikiElementEClass.getESuperTypes().add(theUMLPackage.getElement());
		i18nKeyedStringEClass.getESuperTypes().add(this.getI18nBaseString());
		i18nStringEClass.getESuperTypes().add(this.getI18nBaseString());
		qWikiCommentEClass.getESuperTypes().add(this.getQWikiElement());
		qWikiCommentEClass.getESuperTypes().add(theUMLPackage.getComment());
		i18nDescriptiveElementEClass.getESuperTypes().add(this.getI18nNamedElement());
		qWikiNamespaceEClass.getESuperTypes().add(theUMLPackage.getNamespace());
		qWikiNamespaceEClass.getESuperTypes().add(this.getI18nNamedElement());
		qWikiNamespaceEClass.getESuperTypes().add(this.getQWikiElement());
		qWikiContainerEClass.getESuperTypes().add(this.getQWikiNamespace());
		qWikiContainerEClass.getESuperTypes().add(this.getI18nDescriptiveElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(i18nNamedElementEClass, I18nNamedElement.class, "I18nNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getI18nNamedElement_DisplayName(), this.getI18nString(), null, "displayName", null, 0, 1, I18nNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(qWikiNamedElementEClass, QWikiNamedElement.class, "QWikiNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qWikiElementEClass, QWikiElement.class, "QWikiElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQWikiElement_Uuid(), ecorePackage.getEString(), "uuid", null, 0, 1, QWikiElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getQWikiElement_CustomProperty(), this.getI18nKeyedString(), null, "customProperty", null, 0, -1, QWikiElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getQWikiElement_Tag(), ecorePackage.getEString(), "tag", null, 0, -1, QWikiElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getQWikiElement__Oid(), ecorePackage.getEString(), "oid", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(i18nKeyedStringEClass, I18nKeyedString.class, "I18nKeyedString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getI18nKeyedString_Key(), ecorePackage.getEString(), "key", null, 1, 1, I18nKeyedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(i18nBaseStringEClass, I18nBaseString.class, "I18nBaseString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getI18nBaseString_Value(), this.getI18nValue(), null, "value", null, 0, -1, I18nBaseString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getI18nBaseString__Value__String(), ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "language", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(i18nValueEClass, I18nValue.class, "I18nValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getI18nValue_Language(), ecorePackage.getEString(), "language", null, 1, 1, I18nValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getI18nValue_Body(), ecorePackage.getEString(), "body", null, 1, 1, I18nValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(i18nStringEClass, I18nString.class, "I18nString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qWikiCommentEClass, QWikiComment.class, "QWikiComment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQWikiComment_Content(), this.getI18nString(), null, "content", null, 0, 1, QWikiComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(i18nDescriptiveElementEClass, I18nDescriptiveElement.class, "I18nDescriptiveElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getI18nDescriptiveElement_Purpose(), this.getI18nString(), null, "purpose", null, 0, 1, I18nDescriptiveElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getI18nDescriptiveElement_Content(), this.getI18nString(), null, "content", null, 0, 1, I18nDescriptiveElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(qWikiNamespaceEClass, QWikiNamespace.class, "QWikiNamespace", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qWikiContainerEClass, QWikiContainer.class, "QWikiContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// redefines
		createRedefinesAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
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
		  (getQWikiElement__Oid(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//QWikiElement/oid")
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
		  (getQWikiElement__Oid(),
		   source,
		   new String[] {
			   "body", "uuid"
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
		  (getQWikiElement_CustomProperty(),
		   source,
		   new String[] {
			   "body", "owningElement"
		   });
		addAnnotation
		  (getI18nBaseString_Value(),
		   source,
		   new String[] {
			   "body", "owningElement"
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
		  (getQWikiElement_CustomProperty(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
	}

} //KernelPackageImpl
