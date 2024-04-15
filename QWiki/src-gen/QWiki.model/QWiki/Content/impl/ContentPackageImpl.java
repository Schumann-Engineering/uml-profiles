/**
 */
package QWiki.Content.impl;

import QWiki.Content.Block;
import QWiki.Content.BlockType;
import QWiki.Content.Content;
import QWiki.Content.ContentContainer;
import QWiki.Content.ContentFactory;
import QWiki.Content.ContentPackage;
import QWiki.Content.Layout;
import QWiki.Content.LayoutType;
import QWiki.Content.Panel;
import QWiki.Content.PanelType;
import QWiki.Content.Section;
import QWiki.Content.Text;
import QWiki.Content.TextType;

import QWiki.Domain.DomainPackage;

import QWiki.Domain.impl.DomainPackageImpl;

import QWiki.Glossary.GlossaryPackage;

import QWiki.Glossary.impl.GlossaryPackageImpl;

import QWiki.QWikiPackage;

import QWiki.Rasci.RasciPackage;

import QWiki.Rasci.impl.RasciPackageImpl;

import QWiki.References.ReferencesPackage;

import QWiki.References.impl.ReferencesPackageImpl;

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
public class ContentPackageImpl extends EPackageImpl implements ContentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass panelEClass = null;

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
	private EEnum layoutTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum blockTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum panelTypeEEnum = null;

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
	 * @see QWiki.Content.ContentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContentPackageImpl() {
		super(eNS_URI, ContentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ContentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContentPackage init() {
		if (isInited) return (ContentPackage)EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredContentPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ContentPackageImpl theContentPackage = registeredContentPackage instanceof ContentPackageImpl ? (ContentPackageImpl)registeredContentPackage : new ContentPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GlossaryPackage.eNS_URI);
		GlossaryPackageImpl theGlossaryPackage = (GlossaryPackageImpl)(registeredPackage instanceof GlossaryPackageImpl ? registeredPackage : GlossaryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);
		ReferencesPackageImpl theReferencesPackage = (ReferencesPackageImpl)(registeredPackage instanceof ReferencesPackageImpl ? registeredPackage : ReferencesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(registeredPackage instanceof DomainPackageImpl ? registeredPackage : DomainPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RelationshipsPackage.eNS_URI);
		RelationshipsPackageImpl theRelationshipsPackage = (RelationshipsPackageImpl)(registeredPackage instanceof RelationshipsPackageImpl ? registeredPackage : RelationshipsPackage.eINSTANCE);

		// Create package meta-data objects
		theContentPackage.createPackageContents();
		theQWikiPackage.createPackageContents();
		theSpicePackage.createPackageContents();
		theRasciPackage.createPackageContents();
		theGlossaryPackage.createPackageContents();
		theReferencesPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theRelationshipsPackage.createPackageContents();

		// Initialize created meta-data
		theContentPackage.initializePackageContents();
		theQWikiPackage.initializePackageContents();
		theSpicePackage.initializePackageContents();
		theRasciPackage.initializePackageContents();
		theGlossaryPackage.initializePackageContents();
		theReferencesPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theRelationshipsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContentPackage.eNS_URI, theContentPackage);
		return theContentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContent() {
		return contentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContent_OwningContent() {
		return (EReference)contentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentContainer() {
		return contentContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentContainer_Caption() {
		return (EReference)contentContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentContainer_Item() {
		return (EReference)contentContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLayout() {
		return layoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayout_LayoutType() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getText_TextType() {
		return (EAttribute)textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getText_Body() {
		return (EReference)textEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlock_BlockType() {
		return (EAttribute)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPanel() {
		return panelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPanel_PanelType() {
		return (EAttribute)panelEClass.getEStructuralFeatures().get(0);
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
	public EReference getSection_Term() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSection_Number() {
		return (EAttribute)sectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSection_FacilitatingElement() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSection_OwningReferenceVersion() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSection_FacilitatingSpiceElement() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSection__ReferenceVersion() {
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
	public EOperation getSection__ObjectId() {
		return sectionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLayoutType() {
		return layoutTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTextType() {
		return textTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBlockType() {
		return blockTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPanelType() {
		return panelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentFactory getContentFactory() {
		return (ContentFactory)getEFactoryInstance();
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
		contentEClass = createEClass(CONTENT);
		createEReference(contentEClass, CONTENT__OWNING_CONTENT);

		contentContainerEClass = createEClass(CONTENT_CONTAINER);
		createEReference(contentContainerEClass, CONTENT_CONTAINER__CAPTION);
		createEReference(contentContainerEClass, CONTENT_CONTAINER__ITEM);

		layoutEClass = createEClass(LAYOUT);
		createEAttribute(layoutEClass, LAYOUT__LAYOUT_TYPE);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__TEXT_TYPE);
		createEReference(textEClass, TEXT__BODY);

		blockEClass = createEClass(BLOCK);
		createEAttribute(blockEClass, BLOCK__BLOCK_TYPE);

		panelEClass = createEClass(PANEL);
		createEAttribute(panelEClass, PANEL__PANEL_TYPE);

		sectionEClass = createEClass(SECTION);
		createEReference(sectionEClass, SECTION__TERM);
		createEAttribute(sectionEClass, SECTION__NUMBER);
		createEReference(sectionEClass, SECTION__FACILITATING_ELEMENT);
		createEReference(sectionEClass, SECTION__OWNING_REFERENCE_VERSION);
		createEReference(sectionEClass, SECTION__FACILITATING_SPICE_ELEMENT);
		createEOperation(sectionEClass, SECTION___REFERENCE_VERSION);
		createEOperation(sectionEClass, SECTION___QUALIFIED_NUMBER);
		createEOperation(sectionEClass, SECTION___OBJECT_ID);

		// Create enums
		layoutTypeEEnum = createEEnum(LAYOUT_TYPE);
		textTypeEEnum = createEEnum(TEXT_TYPE);
		blockTypeEEnum = createEEnum(BLOCK_TYPE);
		panelTypeEEnum = createEEnum(PANEL_TYPE);
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
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		GlossaryPackage theGlossaryPackage = (GlossaryPackage)EPackage.Registry.INSTANCE.getEPackage(GlossaryPackage.eNS_URI);
		ReferencesPackage theReferencesPackage = (ReferencesPackage)EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);
		SpicePackage theSpicePackage = (SpicePackage)EPackage.Registry.INSTANCE.getEPackage(SpicePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		contentEClass.getESuperTypes().add(theQWikiPackage.getQWikiElement());
		contentContainerEClass.getESuperTypes().add(theUMLPackage.getNamespace());
		contentContainerEClass.getESuperTypes().add(this.getContent());
		layoutEClass.getESuperTypes().add(this.getContent());
		textEClass.getESuperTypes().add(this.getContent());
		blockEClass.getESuperTypes().add(this.getContentContainer());
		panelEClass.getESuperTypes().add(this.getContentContainer());
		sectionEClass.getESuperTypes().add(this.getContentContainer());

		// Initialize classes, features, and operations; add parameters
		initEClass(contentEClass, Content.class, "Content", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContent_OwningContent(), this.getContentContainer(), this.getContentContainer_Item(), "owningContent", null, 0, 1, Content.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(contentContainerEClass, ContentContainer.class, "ContentContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContentContainer_Caption(), theQWikiPackage.getL10nString(), null, "caption", null, 0, 1, ContentContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getContentContainer_Item(), this.getContent(), this.getContent_OwningContent(), "item", null, 0, -1, ContentContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(layoutEClass, Layout.class, "Layout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLayout_LayoutType(), this.getLayoutType(), "layoutType", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_TextType(), this.getTextType(), "textType", null, 1, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getText_Body(), theQWikiPackage.getL10nString(), null, "body", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlock_BlockType(), this.getBlockType(), "blockType", null, 1, 1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(panelEClass, Panel.class, "Panel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPanel_PanelType(), this.getPanelType(), "panelType", null, 1, 1, Panel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSection_Term(), theGlossaryPackage.getGlossaryTerm(), theGlossaryPackage.getGlossaryTerm_ExternalTermDefinition(), "term", null, 0, -1, Section.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSection_Number(), ecorePackage.getEString(), "number", null, 1, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSection_FacilitatingElement(), theQWikiPackage.getQWikiElement(), null, "facilitatingElement", null, 0, -1, Section.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getSection_OwningReferenceVersion(), theReferencesPackage.getReferenceVersion(), theReferencesPackage.getReferenceVersion_OwnedContent(), "owningReferenceVersion", null, 0, 1, Section.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSection_FacilitatingSpiceElement(), theSpicePackage.getSpiceElement(), theSpicePackage.getSpiceElement_FacilitatedSection(), "facilitatingSpiceElement", null, 0, -1, Section.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getSection__ReferenceVersion(), theReferencesPackage.getReferenceVersion(), "referenceVersion", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSection__QualifiedNumber(), ecorePackage.getEString(), "qualifiedNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSection__ObjectId(), ecorePackage.getEString(), "objectId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(layoutTypeEEnum, LayoutType.class, "LayoutType");
		addEEnumLiteral(layoutTypeEEnum, LayoutType.UNSPECIFIED);
		addEEnumLiteral(layoutTypeEEnum, LayoutType.HORIZONTAL_LINE);
		addEEnumLiteral(layoutTypeEEnum, LayoutType.PAGE_BREAK);
		addEEnumLiteral(layoutTypeEEnum, LayoutType.SECTION_BREAK);

		initEEnum(textTypeEEnum, TextType.class, "TextType");
		addEEnumLiteral(textTypeEEnum, TextType.PARAGRAPH);

		initEEnum(blockTypeEEnum, BlockType.class, "BlockType");
		addEEnumLiteral(blockTypeEEnum, BlockType.UNSPECIFIED);
		addEEnumLiteral(blockTypeEEnum, BlockType.BLOCK_QUOTE);
		addEEnumLiteral(blockTypeEEnum, BlockType.DIV);
		addEEnumLiteral(blockTypeEEnum, BlockType.ORDERED_LIST);
		addEEnumLiteral(blockTypeEEnum, BlockType.PAGE);
		addEEnumLiteral(blockTypeEEnum, BlockType.QUOTE);
		addEEnumLiteral(blockTypeEEnum, BlockType.UNORDERED_LIST);

		initEEnum(panelTypeEEnum, PanelType.class, "PanelType");
		addEEnumLiteral(panelTypeEEnum, PanelType.CAUTION);
		addEEnumLiteral(panelTypeEEnum, PanelType.DANGER);
		addEEnumLiteral(panelTypeEEnum, PanelType.EXAMPLE);
		addEEnumLiteral(panelTypeEEnum, PanelType.INFO);
		addEEnumLiteral(panelTypeEEnum, PanelType.NOTE);
		addEEnumLiteral(panelTypeEEnum, PanelType.NOTICE);
		addEEnumLiteral(panelTypeEEnum, PanelType.WARNING);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// subsets
		createSubsetsAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// redefines
		createRedefinesAnnotations();
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
		  (getContent_OwningContent(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(UMLPackage.eNS_URI).appendFragment("//Element/owner")
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
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (layoutEClass,
		   source,
		   new String[] {
			   "kind", "empty"
		   });
		addAnnotation
		  (getLayout_LayoutType(),
		   source,
		   new String[] {
			   "kind", "attribute"
		   });
		addAnnotation
		  (getText_TextType(),
		   source,
		   new String[] {
			   "kind", "attribute"
		   });
		addAnnotation
		  (getBlock_BlockType(),
		   source,
		   new String[] {
			   "kind", "attribute"
		   });
		addAnnotation
		  (getPanel_PanelType(),
		   source,
		   new String[] {
			   "kind", "attribute"
		   });
		addAnnotation
		  (getSection_Term(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getSection_Number(),
		   source,
		   new String[] {
			   "kind", "attribute"
		   });
		addAnnotation
		  (getSection_FacilitatingElement(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getSection_OwningReferenceVersion(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getSection_FacilitatingSpiceElement(),
		   source,
		   new String[] {
			   "kind", "element"
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
		  (getSection__ReferenceVersion(),
		   source,
		   new String[] {
			   "body", "if (owningReferenceVersion->notEmpty()) then owningReferenceVersion else owningSection.referenceVersion() endif"
		   });
		addAnnotation
		  (getSection__QualifiedNumber(),
		   source,
		   new String[] {
			   "body", "if (owningSection->notEmpty()) then\r\n  owningSection.qualifiedNumber() + \'.\' + number\r\nelse\r\n  number\r\nendif"
		   });
		addAnnotation
		  (getSection__ObjectId(),
		   source,
		   new String[] {
			   "body", "qualifiedNumber() + \'@\' + owningReferenceVersion().objectId()"
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
		  (getSection__ObjectId(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(QWikiPackage.eNS_URI).appendFragment("//QWikiElement/objectId")
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
		  (getSection_FacilitatingElement(),
		   source,
		   new String[] {
			   "body", "facilitatedContent"
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

} //ContentPackageImpl
