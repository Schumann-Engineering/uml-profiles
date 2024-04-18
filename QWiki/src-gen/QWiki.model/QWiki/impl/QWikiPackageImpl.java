/**
 */
package QWiki.impl;

import QWiki.Content.ContentPackage;
import QWiki.Content.impl.ContentPackageImpl;
import QWiki.Domain.DomainPackage;

import QWiki.Domain.impl.DomainPackageImpl;

import QWiki.Glossary.GlossaryPackage;

import QWiki.Glossary.impl.GlossaryPackageImpl;
import QWiki.L10nBaseString;
import QWiki.L10nDescriptiveElement;
import QWiki.L10nKeyedString;
import QWiki.L10nNamedElement;
import QWiki.L10nString;
import QWiki.L10nText;
import QWiki.QWikiComment;
import QWiki.QWikiContainer;
import QWiki.QWikiElement;
import QWiki.QWikiEncryptionKey;
import QWiki.QWikiFactory;
import QWiki.QWikiModel;
import QWiki.QWikiNamedElement;
import QWiki.QWikiNamespace;
import QWiki.QWikiPackage;
import QWiki.QWikiRelationship;
import QWiki.QWikiRelationshipType;

import QWiki.Rasci.RasciPackage;

import QWiki.Rasci.impl.RasciPackageImpl;

import QWiki.References.ReferencesPackage;

import QWiki.References.impl.ReferencesPackageImpl;

import QWiki.Relationships.RelationshipsPackage;

import QWiki.Relationships.impl.RelationshipsPackageImpl;

import QWiki.Spice.SpicePackage;

import QWiki.Spice.impl.SpicePackageImpl;

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
public class QWikiPackageImpl extends EPackageImpl implements QWikiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass l10nDescriptiveElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass l10nNamedElementEClass = null;

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
	private EClass l10nKeyedStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass l10nBaseStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass l10nTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qWikiEncryptionKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qWikiModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qWikiContainerEClass = null;

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
	private EClass l10nStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qWikiRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qWikiRelationshipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qWikiCommentEClass = null;

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
	 * @see QWiki.QWikiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QWikiPackageImpl() {
		super(eNS_URI, QWikiFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QWikiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QWikiPackage init() {
		if (isInited) return (QWikiPackage)EPackage.Registry.INSTANCE.getEPackage(QWikiPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredQWikiPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		QWikiPackageImpl theQWikiPackage = registeredQWikiPackage instanceof QWikiPackageImpl ? (QWikiPackageImpl)registeredQWikiPackage : new QWikiPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SpicePackage.eNS_URI);
		SpicePackageImpl theSpicePackage = (SpicePackageImpl)(registeredPackage instanceof SpicePackageImpl ? registeredPackage : SpicePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RasciPackage.eNS_URI);
		RasciPackageImpl theRasciPackage = (RasciPackageImpl)(registeredPackage instanceof RasciPackageImpl ? registeredPackage : RasciPackage.eINSTANCE);
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
		theQWikiPackage.createPackageContents();
		theSpicePackage.createPackageContents();
		theRasciPackage.createPackageContents();
		theContentPackage.createPackageContents();
		theGlossaryPackage.createPackageContents();
		theReferencesPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theRelationshipsPackage.createPackageContents();

		// Initialize created meta-data
		theQWikiPackage.initializePackageContents();
		theSpicePackage.initializePackageContents();
		theRasciPackage.initializePackageContents();
		theContentPackage.initializePackageContents();
		theGlossaryPackage.initializePackageContents();
		theReferencesPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theRelationshipsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQWikiPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QWikiPackage.eNS_URI, theQWikiPackage);
		return theQWikiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getL10nDescriptiveElement() {
		return l10nDescriptiveElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getL10nDescriptiveElement_Purpose() {
		return (EReference)l10nDescriptiveElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getL10nDescriptiveElement_Content() {
		return (EReference)l10nDescriptiveElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getL10nNamedElement() {
		return l10nNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getL10nNamedElement_DisplayName() {
		return (EReference)l10nNamedElementEClass.getEStructuralFeatures().get(0);
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
	public EReference getQWikiNamedElement_QwikiNamespace() {
		return (EReference)qWikiNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getQWikiNamedElement__QwikiModel() {
		return qWikiNamedElementEClass.getEOperations().get(0);
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
	public EOperation getQWikiElement__ObjectId() {
		return qWikiElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getL10nKeyedString() {
		return l10nKeyedStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getL10nKeyedString_Key() {
		return (EAttribute)l10nKeyedStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getL10nBaseString() {
		return l10nBaseStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getL10nBaseString_Text() {
		return (EReference)l10nBaseStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getL10nBaseString_EncryptionKey() {
		return (EReference)l10nBaseStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getL10nBaseString__Value__String() {
		return l10nBaseStringEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getL10nBaseString__IsEncrypted() {
		return l10nBaseStringEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getL10nText() {
		return l10nTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getL10nText_Language() {
		return (EAttribute)l10nTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getL10nText_Body() {
		return (EAttribute)l10nTextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQWikiEncryptionKey() {
		return qWikiEncryptionKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQWikiModel() {
		return qWikiModelEClass;
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
	public EClass getQWikiNamespace() {
		return qWikiNamespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQWikiNamespace_QwikiElement() {
		return (EReference)qWikiNamespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getL10nString() {
		return l10nStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQWikiRelationship() {
		return qWikiRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQWikiRelationship_RelationshipType() {
		return (EReference)qWikiRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQWikiRelationshipType() {
		return qWikiRelationshipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQWikiRelationshipType_Relationship() {
		return (EReference)qWikiRelationshipTypeEClass.getEStructuralFeatures().get(0);
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
	public QWikiFactory getQWikiFactory() {
		return (QWikiFactory)getEFactoryInstance();
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
		l10nDescriptiveElementEClass = createEClass(L1_0N_DESCRIPTIVE_ELEMENT);
		createEReference(l10nDescriptiveElementEClass, L1_0N_DESCRIPTIVE_ELEMENT__PURPOSE);
		createEReference(l10nDescriptiveElementEClass, L1_0N_DESCRIPTIVE_ELEMENT__CONTENT);

		l10nNamedElementEClass = createEClass(L1_0N_NAMED_ELEMENT);
		createEReference(l10nNamedElementEClass, L1_0N_NAMED_ELEMENT__DISPLAY_NAME);

		qWikiNamedElementEClass = createEClass(QWIKI_NAMED_ELEMENT);
		createEReference(qWikiNamedElementEClass, QWIKI_NAMED_ELEMENT__QWIKI_NAMESPACE);
		createEOperation(qWikiNamedElementEClass, QWIKI_NAMED_ELEMENT___QWIKI_MODEL);

		qWikiElementEClass = createEClass(QWIKI_ELEMENT);
		createEAttribute(qWikiElementEClass, QWIKI_ELEMENT__UUID);
		createEReference(qWikiElementEClass, QWIKI_ELEMENT__CUSTOM_PROPERTY);
		createEAttribute(qWikiElementEClass, QWIKI_ELEMENT__TAG);
		createEOperation(qWikiElementEClass, QWIKI_ELEMENT___OBJECT_ID);

		l10nKeyedStringEClass = createEClass(L1_0N_KEYED_STRING);
		createEAttribute(l10nKeyedStringEClass, L1_0N_KEYED_STRING__KEY);

		l10nBaseStringEClass = createEClass(L1_0N_BASE_STRING);
		createEReference(l10nBaseStringEClass, L1_0N_BASE_STRING__TEXT);
		createEReference(l10nBaseStringEClass, L1_0N_BASE_STRING__ENCRYPTION_KEY);
		createEOperation(l10nBaseStringEClass, L1_0N_BASE_STRING___VALUE__STRING);
		createEOperation(l10nBaseStringEClass, L1_0N_BASE_STRING___IS_ENCRYPTED);

		l10nTextEClass = createEClass(L1_0N_TEXT);
		createEAttribute(l10nTextEClass, L1_0N_TEXT__LANGUAGE);
		createEAttribute(l10nTextEClass, L1_0N_TEXT__BODY);

		qWikiEncryptionKeyEClass = createEClass(QWIKI_ENCRYPTION_KEY);

		qWikiNamespaceEClass = createEClass(QWIKI_NAMESPACE);
		createEReference(qWikiNamespaceEClass, QWIKI_NAMESPACE__QWIKI_ELEMENT);

		qWikiModelEClass = createEClass(QWIKI_MODEL);

		qWikiContainerEClass = createEClass(QWIKI_CONTAINER);

		l10nStringEClass = createEClass(L1_0N_STRING);

		qWikiRelationshipEClass = createEClass(QWIKI_RELATIONSHIP);
		createEReference(qWikiRelationshipEClass, QWIKI_RELATIONSHIP__RELATIONSHIP_TYPE);

		qWikiRelationshipTypeEClass = createEClass(QWIKI_RELATIONSHIP_TYPE);
		createEReference(qWikiRelationshipTypeEClass, QWIKI_RELATIONSHIP_TYPE__RELATIONSHIP);

		qWikiCommentEClass = createEClass(QWIKI_COMMENT);
		createEReference(qWikiCommentEClass, QWIKI_COMMENT__CONTENT);
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
		SpicePackage theSpicePackage = (SpicePackage)EPackage.Registry.INSTANCE.getEPackage(SpicePackage.eNS_URI);
		RasciPackage theRasciPackage = (RasciPackage)EPackage.Registry.INSTANCE.getEPackage(RasciPackage.eNS_URI);
		ContentPackage theContentPackage = (ContentPackage)EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);
		GlossaryPackage theGlossaryPackage = (GlossaryPackage)EPackage.Registry.INSTANCE.getEPackage(GlossaryPackage.eNS_URI);
		ReferencesPackage theReferencesPackage = (ReferencesPackage)EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);
		DomainPackage theDomainPackage = (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);
		RelationshipsPackage theRelationshipsPackage = (RelationshipsPackage)EPackage.Registry.INSTANCE.getEPackage(RelationshipsPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theSpicePackage);
		getESubpackages().add(theRasciPackage);
		getESubpackages().add(theContentPackage);
		getESubpackages().add(theGlossaryPackage);
		getESubpackages().add(theReferencesPackage);
		getESubpackages().add(theDomainPackage);
		getESubpackages().add(theRelationshipsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		l10nDescriptiveElementEClass.getESuperTypes().add(this.getL10nNamedElement());
		l10nNamedElementEClass.getESuperTypes().add(this.getQWikiNamedElement());
		qWikiNamedElementEClass.getESuperTypes().add(theUMLPackage.getNamedElement());
		qWikiNamedElementEClass.getESuperTypes().add(this.getQWikiElement());
		qWikiElementEClass.getESuperTypes().add(theUMLPackage.getElement());
		l10nKeyedStringEClass.getESuperTypes().add(this.getL10nBaseString());
		qWikiEncryptionKeyEClass.getESuperTypes().add(this.getQWikiNamedElement());
		qWikiNamespaceEClass.getESuperTypes().add(theUMLPackage.getNamespace());
		qWikiNamespaceEClass.getESuperTypes().add(this.getL10nNamedElement());
		qWikiNamespaceEClass.getESuperTypes().add(this.getQWikiElement());
		qWikiModelEClass.getESuperTypes().add(this.getQWikiContainer());
		qWikiContainerEClass.getESuperTypes().add(this.getQWikiNamespace());
		qWikiContainerEClass.getESuperTypes().add(this.getL10nDescriptiveElement());
		l10nStringEClass.getESuperTypes().add(this.getL10nBaseString());
		qWikiRelationshipEClass.getESuperTypes().add(theUMLPackage.getDirectedRelationship());
		qWikiRelationshipEClass.getESuperTypes().add(this.getQWikiElement());
		qWikiRelationshipTypeEClass.getESuperTypes().add(this.getQWikiNamedElement());
		qWikiCommentEClass.getESuperTypes().add(this.getQWikiElement());
		qWikiCommentEClass.getESuperTypes().add(theUMLPackage.getComment());

		// Initialize classes, features, and operations; add parameters
		initEClass(l10nDescriptiveElementEClass, L10nDescriptiveElement.class, "L10nDescriptiveElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getL10nDescriptiveElement_Purpose(), this.getL10nString(), null, "purpose", null, 0, 1, L10nDescriptiveElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getL10nDescriptiveElement_Content(), this.getL10nString(), null, "content", null, 0, 1, L10nDescriptiveElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(l10nNamedElementEClass, L10nNamedElement.class, "L10nNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getL10nNamedElement_DisplayName(), this.getL10nString(), null, "displayName", null, 0, 1, L10nNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(qWikiNamedElementEClass, QWikiNamedElement.class, "QWikiNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQWikiNamedElement_QwikiNamespace(), this.getQWikiNamespace(), this.getQWikiNamespace_QwikiElement(), "qwikiNamespace", null, 0, 1, QWikiNamedElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getQWikiNamedElement__QwikiModel(), this.getQWikiModel(), "qwikiModel", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(qWikiElementEClass, QWikiElement.class, "QWikiElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQWikiElement_Uuid(), ecorePackage.getEString(), "uuid", null, 1, 1, QWikiElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getQWikiElement_CustomProperty(), this.getL10nKeyedString(), null, "customProperty", null, 0, -1, QWikiElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getQWikiElement_Tag(), ecorePackage.getEString(), "tag", null, 0, -1, QWikiElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getQWikiElement__ObjectId(), ecorePackage.getEString(), "objectId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(l10nKeyedStringEClass, L10nKeyedString.class, "L10nKeyedString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getL10nKeyedString_Key(), ecorePackage.getEString(), "key", null, 1, 1, L10nKeyedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(l10nBaseStringEClass, L10nBaseString.class, "L10nBaseString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getL10nBaseString_Text(), this.getL10nText(), null, "text", null, 0, -1, L10nBaseString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getL10nBaseString_EncryptionKey(), this.getQWikiEncryptionKey(), null, "encryptionKey", null, 0, 1, L10nBaseString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getL10nBaseString__Value__String(), ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "language", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getL10nBaseString__IsEncrypted(), ecorePackage.getEBoolean(), "isEncrypted", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(l10nTextEClass, L10nText.class, "L10nText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getL10nText_Language(), ecorePackage.getEString(), "language", null, 1, 1, L10nText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getL10nText_Body(), ecorePackage.getEString(), "body", null, 1, 1, L10nText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(qWikiEncryptionKeyEClass, QWikiEncryptionKey.class, "QWikiEncryptionKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qWikiNamespaceEClass, QWikiNamespace.class, "QWikiNamespace", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQWikiNamespace_QwikiElement(), this.getQWikiNamedElement(), this.getQWikiNamedElement_QwikiNamespace(), "qwikiElement", null, 0, -1, QWikiNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(qWikiModelEClass, QWikiModel.class, "QWikiModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qWikiContainerEClass, QWikiContainer.class, "QWikiContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(l10nStringEClass, L10nString.class, "L10nString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qWikiRelationshipEClass, QWikiRelationship.class, "QWikiRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQWikiRelationship_RelationshipType(), this.getQWikiRelationshipType(), this.getQWikiRelationshipType_Relationship(), "relationshipType", null, 0, 1, QWikiRelationship.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(qWikiRelationshipTypeEClass, QWikiRelationshipType.class, "QWikiRelationshipType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQWikiRelationshipType_Relationship(), this.getQWikiRelationship(), this.getQWikiRelationship_RelationshipType(), "relationship", null, 0, -1, QWikiRelationshipType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(qWikiCommentEClass, QWikiComment.class, "QWikiComment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQWikiComment_Content(), this.getL10nString(), null, "content", null, 0, 1, QWikiComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (getL10nDescriptiveElement_Purpose(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getL10nDescriptiveElement_Content(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getL10nNamedElement_DisplayName(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getQWikiElement_Uuid(),
		   source,
		   new String[] {
			   "kind", "attribute"
		   });
		addAnnotation
		  (getQWikiElement_CustomProperty(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getQWikiElement_Tag(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getL10nKeyedString_Key(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getL10nBaseString_EncryptionKey(),
		   source,
		   new String[] {
			   "kind", "attribute"
		   });
		addAnnotation
		  (l10nTextEClass,
		   source,
		   new String[] {
			   "kind", "simple"
		   });
		addAnnotation
		  (getL10nText_Language(),
		   source,
		   new String[] {
			   "kind", "attribute"
		   });
		addAnnotation
		  (getL10nText_Body(),
		   source,
		   new String[] {
			   "kind", "simple"
		   });
		addAnnotation
		  (getQWikiNamespace_QwikiElement(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getQWikiRelationship_RelationshipType(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getQWikiRelationshipType_Relationship(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getQWikiComment_Content(),
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
		  (getQWikiNamedElement__QwikiModel(),
		   source,
		   new String[] {
			   "body", "let namespaces : OrderedSet(UML::Namespace) = self.allNamespaces()->select(oclIsKindOf(QWiki::QWikiModel)) in\r\nif (namespaces->notEmpty()) then\r\n  namespaces->first().oclAsType(QWiki::QWikiModel)\r\nelse\r\n  null\r\nendif"
		   });
		addAnnotation
		  (getQWikiElement__ObjectId(),
		   source,
		   new String[] {
			   "body", "self.uuid"
		   });
		addAnnotation
		  (getL10nBaseString__IsEncrypted(),
		   source,
		   new String[] {
			   "body", "encryptionKey <> null"
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
		  (getL10nBaseString_Text(),
		   source,
		   new String[] {
			   "body", "owningElement"
		   });
		addAnnotation
		  (getL10nBaseString_EncryptionKey(),
		   source,
		   new String[] {
			   "body", "l10nbasestring"
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
		  (getQWikiNamedElement_QwikiNamespace(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(UMLPackage.eNS_URI).appendFragment("//NamedElement/namespace")
		   });
		addAnnotation
		  (getQWikiNamespace_QwikiElement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(UMLPackage.eNS_URI).appendFragment("//Namespace/ownedMember")
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
		  (getQWikiRelationship_RelationshipType(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getQWikiRelationshipType_Relationship(),
		   source,
		   new String[] {
		   });
	}

} //QWikiPackageImpl
