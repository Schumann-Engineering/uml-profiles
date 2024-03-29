/**
 */
package QWiki.impl;

import QWiki.Author;
import QWiki.AuthorType;
import QWiki.BasePractise;
import QWiki.DO_NOT_USE_Relationship;
import QWiki.DO_NOT_USE_RelationshipType;
import QWiki.Document;
import QWiki.DocumentType;
import QWiki.DocumentVersion;
import QWiki.DocumentVersionType;
import QWiki.Domain;
import QWiki.DomainElement;
import QWiki.GenericWorkProduct;
import QWiki.I18nBaseString;
import QWiki.I18nDescriptiveElement;
import QWiki.I18nKeyedString;
import QWiki.I18nNamedElement;
import QWiki.I18nString;
import QWiki.I18nValue;
import QWiki.ModelElement;
import QWiki.Outcome;
import QWiki.ProcessGroup;
import QWiki.ProcessReferenceModel;
import QWiki.ProcessReferenceModelDomain;
import QWiki.QWikiFactory;
import QWiki.QWikiModel;
import QWiki.QWikiPackage;
import QWiki.RasciElement;
import QWiki.Role;
import QWiki.Section;
import QWiki.SpiceElement;
import QWiki.SuperseedingRelationship;
import QWiki.SuperseedingType;
import QWiki.TaggedElement;
import QWiki.Term;
import QWiki.TermDefinition;
import QWiki.UmlAssociation;
import QWiki.UmlComment;
import QWiki.UmlDirectedRelationship;
import QWiki.UmlElement;
import QWiki.UmlNamedElement;
import QWiki.UmlNamespace;
import QWiki.UmlPackage;
import QWiki.UmlPackageableElement;
import QWiki.UmlRelationship;
import QWiki.WorkProduct;
import QWiki.WorkProductType;

import QWiki.util.QWikiValidator;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class QWikiPackageImpl extends EPackageImpl implements QWikiPackage {
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
	private EClass umlNamedElementEClass = null;

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
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taggedElementEClass = null;

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
	private EClass qWikiModelEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

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
	private EClass i18nNamedElementEClass = null;

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
	private EClass documentVersionEClass = null;

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
	private EClass spiceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rasciElementEClass = null;

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
	private EClass processReferenceModelEClass = null;

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
	private EClass umlDirectedRelationshipEClass = null;

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
	private EClass termEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basePractiseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outcomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericWorkProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainElementEClass = null;

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
	private EClass umlAssociationEClass = null;

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
	private EEnum documentVersionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processReferenceModelDomainEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum superseedingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum documentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum workProductTypeEEnum = null;

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

		// Create package meta-data objects
		theQWikiPackage.createPackageContents();

		// Initialize created meta-data
		theQWikiPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theQWikiPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return QWikiValidator.INSTANCE;
				 }
			 });

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
	public EOperation getAuthor__AuthoredDocument() {
		return authorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAuthor__AuthoredStandard() {
		return authorEClass.getEOperations().get(1);
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
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelElement_Uuid() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelElement_Model() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(1);
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
	public EClass getTaggedElement() {
		return taggedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaggedElement_Tag() {
		return (EAttribute)taggedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaggedElement_CustomProperty() {
		return (EReference)taggedElementEClass.getEStructuralFeatures().get(1);
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
	public EClass getQWikiModel() {
		return qWikiModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQWikiModel_OwnedModelElement() {
		return (EReference)qWikiModelEClass.getEStructuralFeatures().get(0);
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
	public EReference getUmlNamespace_ImportedMember() {
		return (EReference)umlNamespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUmlNamespace_OwnedMember() {
		return (EReference)umlNamespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUmlNamespace_Member() {
		return (EReference)umlNamespaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocument_Number() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocument_OwnedVersion() {
		return (EReference)documentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocument_SuperseedingRelationship() {
		return (EReference)documentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocument_DocumentType() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocument_Author() {
		return (EReference)documentEClass.getEStructuralFeatures().get(4);
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
	public EReference getI18nDescriptiveElement_Body() {
		return (EReference)i18nDescriptiveElementEClass.getEStructuralFeatures().get(1);
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
	public EClass getI18nString() {
		return i18nStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentVersion() {
		return documentVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentVersion_PublicationYear() {
		return (EAttribute)documentVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentVersion_DocumentVersionType() {
		return (EAttribute)documentVersionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentVersion_Edition() {
		return (EAttribute)documentVersionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentVersion_OwnedSection() {
		return (EReference)documentVersionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentVersion_SuperseedingRelationship() {
		return (EReference)documentVersionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentVersion_OwningDocument() {
		return (EReference)documentVersionEClass.getEStructuralFeatures().get(5);
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
	public EReference getSection_OwnedSection() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSection_OwningSection() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSection_Number() {
		return (EAttribute)sectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSection_FacilitatingSpiceElement() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSection_FacilitatingElement() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSection_SuperseedingRelationship() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSection_Term() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSection_OwningDocument() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSection__DocumentVersion() {
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
	public EClass getSpiceElement() {
		return spiceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpiceElement_OwningProcessReferenceModel() {
		return (EReference)spiceElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpiceElement_Number() {
		return (EAttribute)spiceElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpiceElement_OwningRole() {
		return (EReference)spiceElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpiceElement_ManagingRole() {
		return (EReference)spiceElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpiceElement_ParticipatingRole() {
		return (EReference)spiceElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpiceElement_Role() {
		return (EReference)spiceElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpiceElement_FacilitatedSection() {
		return (EReference)spiceElementEClass.getEStructuralFeatures().get(6);
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
	public EReference getRole_AccountableElement() {
		return (EReference)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_SupportingElement() {
		return (EReference)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_ConsultingElement() {
		return (EReference)roleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_InformedElement() {
		return (EReference)roleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRole_ResponsibleElement() {
		return (EReference)roleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessReferenceModel() {
		return processReferenceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessReferenceModel_IsNonStandard() {
		return (EAttribute)processReferenceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessReferenceModel_PrmDomain() {
		return (EAttribute)processReferenceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessReferenceModel_OwnedSpiceElement() {
		return (EReference)processReferenceModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProcessReferenceModel__OidForDomain() {
		return processReferenceModelEClass.getEOperations().get(0);
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
	public EClass getUmlDirectedRelationship() {
		return umlDirectedRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUmlDirectedRelationship_Source() {
		return (EReference)umlDirectedRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUmlDirectedRelationship_Target() {
		return (EReference)umlDirectedRelationshipEClass.getEStructuralFeatures().get(1);
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
	public EClass getTerm() {
		return termEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTerm_Acronym() {
		return (EReference)termEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTerm_Synonym() {
		return (EReference)termEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTerm_TermDefinition() {
		return (EReference)termEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTerm_OwnedTermDefinition() {
		return (EReference)termEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTerm_ExternalTermDefinition() {
		return (EReference)termEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTermDefinition() {
		return termDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTermDefinition_OwningTerm() {
		return (EReference)termDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasePractise() {
		return basePractiseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasePractise_OwningProcess() {
		return (EReference)basePractiseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasePractise_FacilitatedOutcome() {
		return (EReference)basePractiseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasePractise_FacilitatedWorkProduct() {
		return (EReference)basePractiseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_OwningProcessGroup() {
		return (EReference)processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_OwnedOutcome() {
		return (EReference)processEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_FacilitatingWorkProduct() {
		return (EReference)processEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_FacilitatedWorkProduct() {
		return (EReference)processEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_OwnedBasePractise() {
		return (EReference)processEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessGroup() {
		return processGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessGroup_OwnedProcess() {
		return (EReference)processGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutcome() {
		return outcomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutcome_FacilitatingBasePractise() {
		return (EReference)outcomeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutcome_RequiredWorkproduct() {
		return (EReference)outcomeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutcome_ResultingWorkproduct() {
		return (EReference)outcomeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutcome_OwningProcess() {
		return (EReference)outcomeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkProduct() {
		return workProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkProduct_OwningWorkProductGroup() {
		return (EReference)workProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkProduct_Characteristic() {
		return (EReference)workProductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkProduct_Content() {
		return (EReference)workProductEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkProduct_FacilitatingOutcome() {
		return (EReference)workProductEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkProduct_FacilitatedProcess() {
		return (EReference)workProductEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkProduct_FacilitatingProcess() {
		return (EReference)workProductEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkProduct_WorkProductType() {
		return (EAttribute)workProductEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkProduct_FacilitatedOutcome() {
		return (EReference)workProductEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenericWorkProduct() {
		return genericWorkProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGenericWorkProduct_OwnedWorkProduct() {
		return (EReference)genericWorkProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomain() {
		return domainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomain_DomainElement() {
		return (EReference)domainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDomain__AllDomainElement() {
		return domainEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainElement() {
		return domainElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainElement_Domain() {
		return (EReference)domainElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainElement_AssignedDomain() {
		return (EReference)domainElementEClass.getEStructuralFeatures().get(1);
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
	public EEnum getAuthorType() {
		return authorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDocumentVersionType() {
		return documentVersionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProcessReferenceModelDomain() {
		return processReferenceModelDomainEEnum;
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
	public EEnum getDocumentType() {
		return documentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getWorkProductType() {
		return workProductTypeEEnum;
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
		authorEClass = createEClass(AUTHOR);
		createEAttribute(authorEClass, AUTHOR__AUTHOR_TYPE);
		createEAttribute(authorEClass, AUTHOR__ABBREVIATION);
		createEOperation(authorEClass, AUTHOR___AUTHORED_DOCUMENT);
		createEOperation(authorEClass, AUTHOR___AUTHORED_STANDARD);

		umlNamedElementEClass = createEClass(UML_NAMED_ELEMENT);
		createEReference(umlNamedElementEClass, UML_NAMED_ELEMENT__NAMESPACE);
		createEAttribute(umlNamedElementEClass, UML_NAMED_ELEMENT__NAME);
		createEAttribute(umlNamedElementEClass, UML_NAMED_ELEMENT__QUALIFIED_NAME);
		createEOperation(umlNamedElementEClass, UML_NAMED_ELEMENT___ALL_NAMESPACES);
		createEOperation(umlNamedElementEClass, UML_NAMED_ELEMENT___SEPARATOR);
		createEOperation(umlNamedElementEClass, UML_NAMED_ELEMENT___QUALIFIED_NAME);

		umlElementEClass = createEClass(UML_ELEMENT);
		createEReference(umlElementEClass, UML_ELEMENT__OWNED_ELEMENT);
		createEReference(umlElementEClass, UML_ELEMENT__OWNER);
		createEReference(umlElementEClass, UML_ELEMENT__OWNED_COMMENT);
		createEOperation(umlElementEClass, UML_ELEMENT___ALL_OWNED_ELEMENTS);
		createEOperation(umlElementEClass, UML_ELEMENT___MUST_BE_OWNED);

		umlCommentEClass = createEClass(UML_COMMENT);
		createEAttribute(umlCommentEClass, UML_COMMENT__BODY);
		createEReference(umlCommentEClass, UML_COMMENT__ANNOTATED_ELEMENT);

		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__UUID);
		createEReference(modelElementEClass, MODEL_ELEMENT__MODEL);
		createEOperation(modelElementEClass, MODEL_ELEMENT___MODEL);
		createEOperation(modelElementEClass, MODEL_ELEMENT___OID);

		taggedElementEClass = createEClass(TAGGED_ELEMENT);
		createEAttribute(taggedElementEClass, TAGGED_ELEMENT__TAG);
		createEReference(taggedElementEClass, TAGGED_ELEMENT__CUSTOM_PROPERTY);

		i18nKeyedStringEClass = createEClass(I1_8N_KEYED_STRING);
		createEAttribute(i18nKeyedStringEClass, I1_8N_KEYED_STRING__KEY);

		i18nBaseStringEClass = createEClass(I1_8N_BASE_STRING);
		createEReference(i18nBaseStringEClass, I1_8N_BASE_STRING__VALUE);
		createEOperation(i18nBaseStringEClass, I1_8N_BASE_STRING___VALUE__STRING);

		i18nValueEClass = createEClass(I1_8N_VALUE);
		createEAttribute(i18nValueEClass, I1_8N_VALUE__LANGUAGE);
		createEAttribute(i18nValueEClass, I1_8N_VALUE__BODY);

		qWikiModelEClass = createEClass(QWIKI_MODEL);
		createEReference(qWikiModelEClass, QWIKI_MODEL__OWNED_MODEL_ELEMENT);

		umlPackageEClass = createEClass(UML_PACKAGE);
		createEReference(umlPackageEClass, UML_PACKAGE__PACKAGED_ELEMENT);
		createEReference(umlPackageEClass, UML_PACKAGE__NESTED_PACKAGE);
		createEReference(umlPackageEClass, UML_PACKAGE__NESTING_PACKAGE);

		umlPackageableElementEClass = createEClass(UML_PACKAGEABLE_ELEMENT);

		umlNamespaceEClass = createEClass(UML_NAMESPACE);
		createEReference(umlNamespaceEClass, UML_NAMESPACE__IMPORTED_MEMBER);
		createEReference(umlNamespaceEClass, UML_NAMESPACE__OWNED_MEMBER);
		createEReference(umlNamespaceEClass, UML_NAMESPACE__MEMBER);

		documentEClass = createEClass(DOCUMENT);
		createEAttribute(documentEClass, DOCUMENT__NUMBER);
		createEReference(documentEClass, DOCUMENT__OWNED_VERSION);
		createEReference(documentEClass, DOCUMENT__SUPERSEEDING_RELATIONSHIP);
		createEAttribute(documentEClass, DOCUMENT__DOCUMENT_TYPE);
		createEReference(documentEClass, DOCUMENT__AUTHOR);

		i18nDescriptiveElementEClass = createEClass(I1_8N_DESCRIPTIVE_ELEMENT);
		createEReference(i18nDescriptiveElementEClass, I1_8N_DESCRIPTIVE_ELEMENT__PURPOSE);
		createEReference(i18nDescriptiveElementEClass, I1_8N_DESCRIPTIVE_ELEMENT__BODY);

		i18nNamedElementEClass = createEClass(I1_8N_NAMED_ELEMENT);
		createEReference(i18nNamedElementEClass, I1_8N_NAMED_ELEMENT__DISPLAY_NAME);

		i18nStringEClass = createEClass(I1_8N_STRING);

		documentVersionEClass = createEClass(DOCUMENT_VERSION);
		createEAttribute(documentVersionEClass, DOCUMENT_VERSION__PUBLICATION_YEAR);
		createEAttribute(documentVersionEClass, DOCUMENT_VERSION__DOCUMENT_VERSION_TYPE);
		createEAttribute(documentVersionEClass, DOCUMENT_VERSION__EDITION);
		createEReference(documentVersionEClass, DOCUMENT_VERSION__OWNED_SECTION);
		createEReference(documentVersionEClass, DOCUMENT_VERSION__SUPERSEEDING_RELATIONSHIP);
		createEReference(documentVersionEClass, DOCUMENT_VERSION__OWNING_DOCUMENT);

		sectionEClass = createEClass(SECTION);
		createEReference(sectionEClass, SECTION__OWNED_SECTION);
		createEReference(sectionEClass, SECTION__OWNING_SECTION);
		createEAttribute(sectionEClass, SECTION__NUMBER);
		createEReference(sectionEClass, SECTION__FACILITATING_SPICE_ELEMENT);
		createEReference(sectionEClass, SECTION__FACILITATING_ELEMENT);
		createEReference(sectionEClass, SECTION__SUPERSEEDING_RELATIONSHIP);
		createEReference(sectionEClass, SECTION__TERM);
		createEReference(sectionEClass, SECTION__OWNING_DOCUMENT);
		createEOperation(sectionEClass, SECTION___DOCUMENT_VERSION);
		createEOperation(sectionEClass, SECTION___QUALIFIED_NUMBER);

		spiceElementEClass = createEClass(SPICE_ELEMENT);
		createEReference(spiceElementEClass, SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL);
		createEAttribute(spiceElementEClass, SPICE_ELEMENT__NUMBER);
		createEReference(spiceElementEClass, SPICE_ELEMENT__OWNING_ROLE);
		createEReference(spiceElementEClass, SPICE_ELEMENT__MANAGING_ROLE);
		createEReference(spiceElementEClass, SPICE_ELEMENT__PARTICIPATING_ROLE);
		createEReference(spiceElementEClass, SPICE_ELEMENT__ROLE);
		createEReference(spiceElementEClass, SPICE_ELEMENT__FACILITATED_SECTION);

		rasciElementEClass = createEClass(RASCI_ELEMENT);
		createEReference(rasciElementEClass, RASCI_ELEMENT__RESPONSIBLE_ROLE);
		createEReference(rasciElementEClass, RASCI_ELEMENT__ACCOUNTABLE_ROLE);
		createEReference(rasciElementEClass, RASCI_ELEMENT__SUPPORTING_ROLE);
		createEReference(rasciElementEClass, RASCI_ELEMENT__CONSULTING_ROLE);
		createEReference(rasciElementEClass, RASCI_ELEMENT__INFORMED_ROLE);

		roleEClass = createEClass(ROLE);
		createEReference(roleEClass, ROLE__SKILLS);
		createEReference(roleEClass, ROLE__ACCOUNTABLE_ELEMENT);
		createEReference(roleEClass, ROLE__SUPPORTING_ELEMENT);
		createEReference(roleEClass, ROLE__CONSULTING_ELEMENT);
		createEReference(roleEClass, ROLE__INFORMED_ELEMENT);
		createEReference(roleEClass, ROLE__RESPONSIBLE_ELEMENT);

		processReferenceModelEClass = createEClass(PROCESS_REFERENCE_MODEL);
		createEAttribute(processReferenceModelEClass, PROCESS_REFERENCE_MODEL__IS_NON_STANDARD);
		createEAttribute(processReferenceModelEClass, PROCESS_REFERENCE_MODEL__PRM_DOMAIN);
		createEReference(processReferenceModelEClass, PROCESS_REFERENCE_MODEL__OWNED_SPICE_ELEMENT);
		createEOperation(processReferenceModelEClass, PROCESS_REFERENCE_MODEL___OID_FOR_DOMAIN);

		superseedingRelationshipEClass = createEClass(SUPERSEEDING_RELATIONSHIP);
		createEAttribute(superseedingRelationshipEClass, SUPERSEEDING_RELATIONSHIP__SUPERSEEDING_TYPE);

		umlDirectedRelationshipEClass = createEClass(UML_DIRECTED_RELATIONSHIP);
		createEReference(umlDirectedRelationshipEClass, UML_DIRECTED_RELATIONSHIP__SOURCE);
		createEReference(umlDirectedRelationshipEClass, UML_DIRECTED_RELATIONSHIP__TARGET);

		umlRelationshipEClass = createEClass(UML_RELATIONSHIP);
		createEReference(umlRelationshipEClass, UML_RELATIONSHIP__RELATED_ELEMENT);

		termEClass = createEClass(TERM);
		createEReference(termEClass, TERM__ACRONYM);
		createEReference(termEClass, TERM__SYNONYM);
		createEReference(termEClass, TERM__TERM_DEFINITION);
		createEReference(termEClass, TERM__OWNED_TERM_DEFINITION);
		createEReference(termEClass, TERM__EXTERNAL_TERM_DEFINITION);

		termDefinitionEClass = createEClass(TERM_DEFINITION);
		createEReference(termDefinitionEClass, TERM_DEFINITION__OWNING_TERM);

		basePractiseEClass = createEClass(BASE_PRACTISE);
		createEReference(basePractiseEClass, BASE_PRACTISE__OWNING_PROCESS);
		createEReference(basePractiseEClass, BASE_PRACTISE__FACILITATED_OUTCOME);
		createEReference(basePractiseEClass, BASE_PRACTISE__FACILITATED_WORK_PRODUCT);

		processEClass = createEClass(PROCESS);
		createEReference(processEClass, PROCESS__OWNING_PROCESS_GROUP);
		createEReference(processEClass, PROCESS__OWNED_OUTCOME);
		createEReference(processEClass, PROCESS__FACILITATING_WORK_PRODUCT);
		createEReference(processEClass, PROCESS__FACILITATED_WORK_PRODUCT);
		createEReference(processEClass, PROCESS__OWNED_BASE_PRACTISE);

		processGroupEClass = createEClass(PROCESS_GROUP);
		createEReference(processGroupEClass, PROCESS_GROUP__OWNED_PROCESS);

		outcomeEClass = createEClass(OUTCOME);
		createEReference(outcomeEClass, OUTCOME__FACILITATING_BASE_PRACTISE);
		createEReference(outcomeEClass, OUTCOME__REQUIRED_WORKPRODUCT);
		createEReference(outcomeEClass, OUTCOME__RESULTING_WORKPRODUCT);
		createEReference(outcomeEClass, OUTCOME__OWNING_PROCESS);

		workProductEClass = createEClass(WORK_PRODUCT);
		createEReference(workProductEClass, WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP);
		createEReference(workProductEClass, WORK_PRODUCT__CHARACTERISTIC);
		createEReference(workProductEClass, WORK_PRODUCT__CONTENT);
		createEReference(workProductEClass, WORK_PRODUCT__FACILITATING_OUTCOME);
		createEReference(workProductEClass, WORK_PRODUCT__FACILITATED_PROCESS);
		createEReference(workProductEClass, WORK_PRODUCT__FACILITATING_PROCESS);
		createEAttribute(workProductEClass, WORK_PRODUCT__WORK_PRODUCT_TYPE);
		createEReference(workProductEClass, WORK_PRODUCT__FACILITATED_OUTCOME);

		genericWorkProductEClass = createEClass(GENERIC_WORK_PRODUCT);
		createEReference(genericWorkProductEClass, GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT);

		domainEClass = createEClass(DOMAIN);
		createEReference(domainEClass, DOMAIN__DOMAIN_ELEMENT);
		createEOperation(domainEClass, DOMAIN___ALL_DOMAIN_ELEMENT);

		domainElementEClass = createEClass(DOMAIN_ELEMENT);
		createEReference(domainElementEClass, DOMAIN_ELEMENT__DOMAIN);
		createEReference(domainElementEClass, DOMAIN_ELEMENT__ASSIGNED_DOMAIN);

		dO_NOT_USE_RelationshipEClass = createEClass(DO_NOT_USE_RELATIONSHIP);

		dO_NOT_USE_RelationshipTypeEClass = createEClass(DO_NOT_USE_RELATIONSHIP_TYPE);

		umlAssociationEClass = createEClass(UML_ASSOCIATION);
		createEAttribute(umlAssociationEClass, UML_ASSOCIATION__IS_DERIVED);

		// Create enums
		authorTypeEEnum = createEEnum(AUTHOR_TYPE);
		documentVersionTypeEEnum = createEEnum(DOCUMENT_VERSION_TYPE);
		processReferenceModelDomainEEnum = createEEnum(PROCESS_REFERENCE_MODEL_DOMAIN);
		superseedingTypeEEnum = createEEnum(SUPERSEEDING_TYPE);
		documentTypeEEnum = createEEnum(DOCUMENT_TYPE);
		workProductTypeEEnum = createEEnum(WORK_PRODUCT_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		authorEClass.getESuperTypes().add(this.getUmlNamedElement());
		umlNamedElementEClass.getESuperTypes().add(this.getModelElement());
		umlNamedElementEClass.getESuperTypes().add(this.getUmlElement());
		umlCommentEClass.getESuperTypes().add(this.getUmlElement());
		modelElementEClass.getESuperTypes().add(this.getTaggedElement());
		taggedElementEClass.getESuperTypes().add(this.getUmlElement());
		i18nKeyedStringEClass.getESuperTypes().add(this.getI18nBaseString());
		qWikiModelEClass.getESuperTypes().add(this.getUmlPackage());
		umlPackageEClass.getESuperTypes().add(this.getUmlNamespace());
		umlPackageEClass.getESuperTypes().add(this.getUmlPackageableElement());
		umlPackageableElementEClass.getESuperTypes().add(this.getUmlNamedElement());
		umlNamespaceEClass.getESuperTypes().add(this.getUmlNamedElement());
		documentEClass.getESuperTypes().add(this.getI18nDescriptiveElement());
		i18nDescriptiveElementEClass.getESuperTypes().add(this.getI18nNamedElement());
		i18nNamedElementEClass.getESuperTypes().add(this.getUmlNamedElement());
		i18nStringEClass.getESuperTypes().add(this.getI18nBaseString());
		documentVersionEClass.getESuperTypes().add(this.getModelElement());
		sectionEClass.getESuperTypes().add(this.getI18nDescriptiveElement());
		spiceElementEClass.getESuperTypes().add(this.getRasciElement());
		rasciElementEClass.getESuperTypes().add(this.getI18nDescriptiveElement());
		roleEClass.getESuperTypes().add(this.getI18nDescriptiveElement());
		processReferenceModelEClass.getESuperTypes().add(this.getI18nDescriptiveElement());
		superseedingRelationshipEClass.getESuperTypes().add(this.getUmlDirectedRelationship());
		umlDirectedRelationshipEClass.getESuperTypes().add(this.getUmlRelationship());
		umlRelationshipEClass.getESuperTypes().add(this.getUmlElement());
		termEClass.getESuperTypes().add(this.getI18nNamedElement());
		termDefinitionEClass.getESuperTypes().add(this.getI18nDescriptiveElement());
		basePractiseEClass.getESuperTypes().add(this.getSpiceElement());
		processEClass.getESuperTypes().add(this.getSpiceElement());
		processGroupEClass.getESuperTypes().add(this.getSpiceElement());
		outcomeEClass.getESuperTypes().add(this.getI18nNamedElement());
		workProductEClass.getESuperTypes().add(this.getSpiceElement());
		genericWorkProductEClass.getESuperTypes().add(this.getWorkProduct());
		domainEClass.getESuperTypes().add(this.getI18nNamedElement());
		domainElementEClass.getESuperTypes().add(this.getUmlNamedElement());
		dO_NOT_USE_RelationshipTypeEClass.getESuperTypes().add(this.getI18nNamedElement());
		umlAssociationEClass.getESuperTypes().add(this.getUmlRelationship());

		// Initialize classes, features, and operations; add parameters
		initEClass(authorEClass, Author.class, "Author", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthor_AuthorType(), this.getAuthorType(), "authorType", "Person", 1, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAuthor_Abbreviation(), ecorePackage.getEString(), "abbreviation", null, 0, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getAuthor__AuthoredDocument(), this.getDocument(), "authoredDocument", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAuthor__AuthoredStandard(), this.getDocument(), "authoredStandard", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(umlNamedElementEClass, UmlNamedElement.class, "UmlNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUmlNamedElement_Namespace(), this.getUmlNamespace(), this.getUmlNamespace_OwnedMember(), "namespace", null, 0, 1, UmlNamedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUmlNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, UmlNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUmlNamedElement_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, UmlNamedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getUmlNamedElement__AllNamespaces(), this.getUmlNamespace(), "allNamespaces", 0, -1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getUmlNamedElement__Separator(), ecorePackage.getEString(), "separator", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getUmlNamedElement__QualifiedName(), ecorePackage.getEString(), "qualifiedName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(umlElementEClass, UmlElement.class, "UmlElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUmlElement_OwnedElement(), this.getUmlElement(), this.getUmlElement_Owner(), "ownedElement", null, 0, -1, UmlElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUmlElement_Owner(), this.getUmlElement(), this.getUmlElement_OwnedElement(), "owner", null, 0, 1, UmlElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUmlElement_OwnedComment(), this.getUmlComment(), null, "ownedComment", null, 0, -1, UmlElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getUmlElement__AllOwnedElements(), this.getUmlElement(), "allOwnedElements", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getUmlElement__MustBeOwned(), ecorePackage.getEBoolean(), "mustBeOwned", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(umlCommentEClass, UmlComment.class, "UmlComment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUmlComment_Body(), ecorePackage.getEString(), "body", null, 0, 1, UmlComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUmlComment_AnnotatedElement(), this.getUmlElement(), null, "annotatedElement", null, 0, -1, UmlComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Uuid(), ecorePackage.getEString(), "uuid", null, 1, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModelElement_Model(), this.getQWikiModel(), this.getQWikiModel_OwnedModelElement(), "model", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getModelElement__Model(), this.getQWikiModel(), "model", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getModelElement__Oid(), ecorePackage.getEString(), "oid", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(taggedElementEClass, TaggedElement.class, "TaggedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaggedElement_Tag(), ecorePackage.getEString(), "tag", null, 0, -1, TaggedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTaggedElement_CustomProperty(), this.getI18nKeyedString(), null, "customProperty", null, 0, -1, TaggedElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(i18nKeyedStringEClass, I18nKeyedString.class, "I18nKeyedString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getI18nKeyedString_Key(), ecorePackage.getEString(), "key", null, 1, 1, I18nKeyedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(i18nBaseStringEClass, I18nBaseString.class, "I18nBaseString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getI18nBaseString_Value(), this.getI18nValue(), null, "value", null, 0, -1, I18nBaseString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getI18nBaseString__Value__String(), ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "language", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(i18nValueEClass, I18nValue.class, "I18nValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getI18nValue_Language(), ecorePackage.getEString(), "language", null, 1, 1, I18nValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getI18nValue_Body(), ecorePackage.getEString(), "body", null, 1, 1, I18nValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(qWikiModelEClass, QWikiModel.class, "QWikiModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQWikiModel_OwnedModelElement(), this.getModelElement(), this.getModelElement_Model(), "ownedModelElement", null, 0, -1, QWikiModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(umlPackageEClass, UmlPackage.class, "UmlPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUmlPackage_PackagedElement(), this.getUmlPackageableElement(), null, "packagedElement", null, 0, -1, UmlPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUmlPackage_NestedPackage(), this.getUmlPackage(), this.getUmlPackage_NestingPackage(), "nestedPackage", null, 0, -1, UmlPackage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUmlPackage_NestingPackage(), this.getUmlPackage(), this.getUmlPackage_NestedPackage(), "nestingPackage", null, 0, 1, UmlPackage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(umlPackageableElementEClass, UmlPackageableElement.class, "UmlPackageableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(umlNamespaceEClass, UmlNamespace.class, "UmlNamespace", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUmlNamespace_ImportedMember(), this.getUmlPackageableElement(), null, "importedMember", null, 0, -1, UmlNamespace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUmlNamespace_OwnedMember(), this.getUmlNamedElement(), this.getUmlNamedElement_Namespace(), "ownedMember", null, 0, -1, UmlNamespace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUmlNamespace_Member(), this.getUmlNamedElement(), null, "member", null, 0, -1, UmlNamespace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocument_Number(), ecorePackage.getEString(), "number", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDocument_OwnedVersion(), this.getDocumentVersion(), this.getDocumentVersion_OwningDocument(), "ownedVersion", null, 0, -1, Document.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDocument_SuperseedingRelationship(), this.getSuperseedingRelationship(), null, "superseedingRelationship", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDocument_DocumentType(), this.getDocumentType(), "documentType", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDocument_Author(), this.getAuthor(), null, "author", null, 1, -1, Document.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(i18nDescriptiveElementEClass, I18nDescriptiveElement.class, "I18nDescriptiveElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getI18nDescriptiveElement_Purpose(), this.getI18nString(), null, "purpose", null, 0, 1, I18nDescriptiveElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getI18nDescriptiveElement_Body(), this.getI18nString(), null, "body", null, 0, 1, I18nDescriptiveElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(i18nNamedElementEClass, I18nNamedElement.class, "I18nNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getI18nNamedElement_DisplayName(), this.getI18nString(), null, "displayName", null, 0, 1, I18nNamedElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(i18nStringEClass, I18nString.class, "I18nString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(documentVersionEClass, DocumentVersion.class, "DocumentVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentVersion_PublicationYear(), ecorePackage.getEString(), "publicationYear", null, 1, 1, DocumentVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDocumentVersion_DocumentVersionType(), this.getDocumentVersionType(), "documentVersionType", "FirstEdition", 1, 1, DocumentVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDocumentVersion_Edition(), ecorePackage.getEString(), "edition", null, 0, 1, DocumentVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDocumentVersion_OwnedSection(), this.getSection(), this.getSection_OwningDocument(), "ownedSection", null, 0, -1, DocumentVersion.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDocumentVersion_SuperseedingRelationship(), this.getSuperseedingRelationship(), null, "superseedingRelationship", null, 0, -1, DocumentVersion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDocumentVersion_OwningDocument(), this.getDocument(), this.getDocument_OwnedVersion(), "owningDocument", null, 0, 1, DocumentVersion.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSection_OwnedSection(), this.getSection(), this.getSection_OwningSection(), "ownedSection", null, 0, -1, Section.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSection_OwningSection(), this.getSection(), this.getSection_OwnedSection(), "owningSection", null, 0, 1, Section.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSection_Number(), ecorePackage.getEString(), "number", null, 1, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSection_FacilitatingSpiceElement(), this.getSpiceElement(), this.getSpiceElement_FacilitatedSection(), "facilitatingSpiceElement", null, 0, -1, Section.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSection_FacilitatingElement(), this.getUmlElement(), null, "facilitatingElement", null, 0, -1, Section.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getSection_SuperseedingRelationship(), this.getSuperseedingRelationship(), null, "superseedingRelationship", null, 0, -1, Section.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getSection_Term(), this.getTerm(), this.getTerm_ExternalTermDefinition(), "term", null, 0, -1, Section.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSection_OwningDocument(), this.getDocumentVersion(), this.getDocumentVersion_OwnedSection(), "owningDocument", null, 0, 1, Section.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getSection__DocumentVersion(), this.getDocumentVersion(), "documentVersion", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSection__QualifiedNumber(), ecorePackage.getEString(), "qualifiedNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(spiceElementEClass, SpiceElement.class, "SpiceElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpiceElement_OwningProcessReferenceModel(), this.getProcessReferenceModel(), this.getProcessReferenceModel_OwnedSpiceElement(), "owningProcessReferenceModel", null, 0, 1, SpiceElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSpiceElement_Number(), ecorePackage.getEString(), "number", null, 1, 1, SpiceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpiceElement_OwningRole(), this.getRole(), null, "owningRole", null, 0, 1, SpiceElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpiceElement_ManagingRole(), this.getRole(), null, "managingRole", null, 0, 1, SpiceElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpiceElement_ParticipatingRole(), this.getRole(), null, "participatingRole", null, 0, -1, SpiceElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpiceElement_Role(), this.getRole(), null, "role", null, 0, -1, SpiceElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getSpiceElement_FacilitatedSection(), this.getSection(), this.getSection_FacilitatingSpiceElement(), "facilitatedSection", null, 0, -1, SpiceElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rasciElementEClass, RasciElement.class, "RasciElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRasciElement_ResponsibleRole(), this.getRole(), this.getRole_ResponsibleElement(), "responsibleRole", null, 1, -1, RasciElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRasciElement_AccountableRole(), this.getRole(), this.getRole_AccountableElement(), "accountableRole", null, 0, 1, RasciElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRasciElement_SupportingRole(), this.getRole(), this.getRole_SupportingElement(), "supportingRole", null, 0, -1, RasciElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRasciElement_ConsultingRole(), this.getRole(), this.getRole_ConsultingElement(), "consultingRole", null, 0, -1, RasciElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRasciElement_InformedRole(), this.getRole(), this.getRole_InformedElement(), "informedRole", null, 0, -1, RasciElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Skills(), this.getI18nString(), null, "skills", null, 0, -1, Role.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRole_AccountableElement(), this.getRasciElement(), this.getRasciElement_AccountableRole(), "accountableElement", null, 0, -1, Role.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRole_SupportingElement(), this.getRasciElement(), this.getRasciElement_SupportingRole(), "supportingElement", null, 0, -1, Role.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRole_ConsultingElement(), this.getRasciElement(), this.getRasciElement_ConsultingRole(), "consultingElement", null, 0, -1, Role.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRole_InformedElement(), this.getRasciElement(), this.getRasciElement_InformedRole(), "informedElement", null, 0, -1, Role.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRole_ResponsibleElement(), this.getRasciElement(), this.getRasciElement_ResponsibleRole(), "responsibleElement", null, 0, -1, Role.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(processReferenceModelEClass, ProcessReferenceModel.class, "ProcessReferenceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessReferenceModel_IsNonStandard(), ecorePackage.getEBoolean(), "isNonStandard", "false", 1, 1, ProcessReferenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProcessReferenceModel_PrmDomain(), this.getProcessReferenceModelDomain(), "prmDomain", null, 1, 1, ProcessReferenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcessReferenceModel_OwnedSpiceElement(), this.getSpiceElement(), this.getSpiceElement_OwningProcessReferenceModel(), "ownedSpiceElement", null, 0, -1, ProcessReferenceModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getProcessReferenceModel__OidForDomain(), ecorePackage.getEString(), "oidForDomain", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(superseedingRelationshipEClass, SuperseedingRelationship.class, "SuperseedingRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSuperseedingRelationship_SuperseedingType(), this.getSuperseedingType(), "superseedingType", "Equal", 1, 1, SuperseedingRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(umlDirectedRelationshipEClass, UmlDirectedRelationship.class, "UmlDirectedRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUmlDirectedRelationship_Source(), this.getUmlElement(), null, "source", null, 1, -1, UmlDirectedRelationship.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getUmlDirectedRelationship_Target(), this.getUmlElement(), null, "target", null, 1, -1, UmlDirectedRelationship.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(umlRelationshipEClass, UmlRelationship.class, "UmlRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUmlRelationship_RelatedElement(), this.getUmlElement(), null, "relatedElement", null, 1, -1, UmlRelationship.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(termEClass, Term.class, "Term", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerm_Acronym(), this.getI18nString(), null, "acronym", null, 0, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTerm_Synonym(), this.getI18nString(), null, "synonym", null, 0, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTerm_TermDefinition(), this.getI18nDescriptiveElement(), null, "termDefinition", null, 0, -1, Term.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getTerm_OwnedTermDefinition(), this.getTermDefinition(), this.getTermDefinition_OwningTerm(), "ownedTermDefinition", null, 0, -1, Term.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTerm_ExternalTermDefinition(), this.getSection(), this.getSection_Term(), "externalTermDefinition", null, 0, -1, Term.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(termDefinitionEClass, TermDefinition.class, "TermDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTermDefinition_OwningTerm(), this.getTerm(), this.getTerm_OwnedTermDefinition(), "owningTerm", null, 0, 1, TermDefinition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(basePractiseEClass, BasePractise.class, "BasePractise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasePractise_OwningProcess(), this.getProcess(), this.getProcess_OwnedBasePractise(), "owningProcess", null, 1, 1, BasePractise.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBasePractise_FacilitatedOutcome(), this.getOutcome(), this.getOutcome_FacilitatingBasePractise(), "facilitatedOutcome", null, 1, -1, BasePractise.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBasePractise_FacilitatedWorkProduct(), this.getWorkProduct(), null, "facilitatedWorkProduct", null, 0, 1, BasePractise.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(processEClass, QWiki.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcess_OwningProcessGroup(), this.getProcessGroup(), this.getProcessGroup_OwnedProcess(), "owningProcessGroup", null, 0, 1, QWiki.Process.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcess_OwnedOutcome(), this.getOutcome(), this.getOutcome_OwningProcess(), "ownedOutcome", null, 0, -1, QWiki.Process.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_FacilitatingWorkProduct(), this.getWorkProduct(), this.getWorkProduct_FacilitatedProcess(), "facilitatingWorkProduct", null, 0, -1, QWiki.Process.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcess_FacilitatedWorkProduct(), this.getWorkProduct(), this.getWorkProduct_FacilitatingProcess(), "facilitatedWorkProduct", null, 0, -1, QWiki.Process.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcess_OwnedBasePractise(), this.getBasePractise(), this.getBasePractise_OwningProcess(), "ownedBasePractise", null, 0, -1, QWiki.Process.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processGroupEClass, ProcessGroup.class, "ProcessGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessGroup_OwnedProcess(), this.getProcess(), this.getProcess_OwningProcessGroup(), "ownedProcess", null, 0, -1, ProcessGroup.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outcomeEClass, Outcome.class, "Outcome", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutcome_FacilitatingBasePractise(), this.getBasePractise(), this.getBasePractise_FacilitatedOutcome(), "facilitatingBasePractise", null, 1, -1, Outcome.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOutcome_RequiredWorkproduct(), this.getWorkProduct(), this.getWorkProduct_FacilitatedOutcome(), "requiredWorkproduct", null, 0, -1, Outcome.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOutcome_ResultingWorkproduct(), this.getWorkProduct(), this.getWorkProduct_FacilitatingOutcome(), "resultingWorkproduct", null, 0, -1, Outcome.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOutcome_OwningProcess(), this.getProcess(), this.getProcess_OwnedOutcome(), "owningProcess", null, 0, 1, Outcome.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(workProductEClass, WorkProduct.class, "WorkProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkProduct_OwningWorkProductGroup(), this.getGenericWorkProduct(), this.getGenericWorkProduct_OwnedWorkProduct(), "owningWorkProductGroup", null, 0, 1, WorkProduct.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkProduct_Characteristic(), this.getI18nString(), null, "characteristic", null, 0, -1, WorkProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkProduct_Content(), this.getI18nString(), null, "content", null, 0, -1, WorkProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkProduct_FacilitatingOutcome(), this.getOutcome(), this.getOutcome_ResultingWorkproduct(), "facilitatingOutcome", null, 0, -1, WorkProduct.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkProduct_FacilitatedProcess(), this.getProcess(), this.getProcess_FacilitatingWorkProduct(), "facilitatedProcess", null, 0, -1, WorkProduct.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkProduct_FacilitatingProcess(), this.getProcess(), this.getProcess_FacilitatedWorkProduct(), "facilitatingProcess", null, 0, 1, WorkProduct.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWorkProduct_WorkProductType(), this.getWorkProductType(), "workProductType", null, 1, 1, WorkProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkProduct_FacilitatedOutcome(), this.getOutcome(), this.getOutcome_RequiredWorkproduct(), "facilitatedOutcome", null, 0, -1, WorkProduct.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genericWorkProductEClass, GenericWorkProduct.class, "GenericWorkProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenericWorkProduct_OwnedWorkProduct(), this.getWorkProduct(), this.getWorkProduct_OwningWorkProductGroup(), "ownedWorkProduct", null, 0, -1, GenericWorkProduct.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_DomainElement(), this.getDomainElement(), this.getDomainElement_AssignedDomain(), "domainElement", null, 0, -1, Domain.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getDomain__AllDomainElement(), this.getDomainElement(), "allDomainElement", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(domainElementEClass, DomainElement.class, "DomainElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainElement_Domain(), this.getDomain(), null, "domain", null, 0, 1, DomainElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDomainElement_AssignedDomain(), this.getDomain(), this.getDomain_DomainElement(), "assignedDomain", null, 0, 1, DomainElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dO_NOT_USE_RelationshipEClass, DO_NOT_USE_Relationship.class, "DO_NOT_USE_Relationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dO_NOT_USE_RelationshipTypeEClass, DO_NOT_USE_RelationshipType.class, "DO_NOT_USE_RelationshipType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(umlAssociationEClass, UmlAssociation.class, "UmlAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUmlAssociation_IsDerived(), ecorePackage.getEBoolean(), "isDerived", "false", 1, 1, UmlAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(authorTypeEEnum, AuthorType.class, "AuthorType");
		addEEnumLiteral(authorTypeEEnum, AuthorType.PERSON);
		addEEnumLiteral(authorTypeEEnum, AuthorType.ORGANIZATION);
		addEEnumLiteral(authorTypeEEnum, AuthorType.STANDARDS_DEVELOPMENT_ORGANIZATION);

		initEEnum(documentVersionTypeEEnum, DocumentVersionType.class, "DocumentVersionType");
		addEEnumLiteral(documentVersionTypeEEnum, DocumentVersionType.ADDENDUM);
		addEEnumLiteral(documentVersionTypeEEnum, DocumentVersionType.AMENDMENT);
		addEEnumLiteral(documentVersionTypeEEnum, DocumentVersionType.CORRIGENDUM);
		addEEnumLiteral(documentVersionTypeEEnum, DocumentVersionType.FIRST_EDITION);

		initEEnum(processReferenceModelDomainEEnum, ProcessReferenceModelDomain.class, "ProcessReferenceModelDomain");
		addEEnumLiteral(processReferenceModelDomainEEnum, ProcessReferenceModelDomain.AGILE);
		addEEnumLiteral(processReferenceModelDomainEEnum, ProcessReferenceModelDomain.AUTOMOTIVE);
		addEEnumLiteral(processReferenceModelDomainEEnum, ProcessReferenceModelDomain.CYBERSECURITY);
		addEEnumLiteral(processReferenceModelDomainEEnum, ProcessReferenceModelDomain.DATA_MANAGEMENT);
		addEEnumLiteral(processReferenceModelDomainEEnum, ProcessReferenceModelDomain.HARDWARE);
		addEEnumLiteral(processReferenceModelDomainEEnum, ProcessReferenceModelDomain.IT_SERVICES);
		addEEnumLiteral(processReferenceModelDomainEEnum, ProcessReferenceModelDomain.MECHANICAL);
		addEEnumLiteral(processReferenceModelDomainEEnum, ProcessReferenceModelDomain.MEDICAL);
		addEEnumLiteral(processReferenceModelDomainEEnum, ProcessReferenceModelDomain.ORGANIZATIONAL);
		addEEnumLiteral(processReferenceModelDomainEEnum, ProcessReferenceModelDomain.TEST);

		initEEnum(superseedingTypeEEnum, SuperseedingType.class, "SuperseedingType");
		addEEnumLiteral(superseedingTypeEEnum, SuperseedingType.ADDED);
		addEEnumLiteral(superseedingTypeEEnum, SuperseedingType.EQUAL);
		addEEnumLiteral(superseedingTypeEEnum, SuperseedingType.UPDATED_MAJOR);
		addEEnumLiteral(superseedingTypeEEnum, SuperseedingType.UPDATED_MINOR);
		addEEnumLiteral(superseedingTypeEEnum, SuperseedingType.REMOVED);

		initEEnum(documentTypeEEnum, DocumentType.class, "DocumentType");
		addEEnumLiteral(documentTypeEEnum, DocumentType.DOCUMENT);
		addEEnumLiteral(documentTypeEEnum, DocumentType.GUIDELINE);
		addEEnumLiteral(documentTypeEEnum, DocumentType.HYPERLINK);
		addEEnumLiteral(documentTypeEEnum, DocumentType.LEGISLATION);
		addEEnumLiteral(documentTypeEEnum, DocumentType.PROCESS);
		addEEnumLiteral(documentTypeEEnum, DocumentType.STANDARD);
		addEEnumLiteral(documentTypeEEnum, DocumentType.TECHNICAL_REPORT);

		initEEnum(workProductTypeEEnum, WorkProductType.class, "WorkProductType");
		addEEnumLiteral(workProductTypeEEnum, WorkProductType.ARTEFACT);
		addEEnumLiteral(workProductTypeEEnum, WorkProductType.DOCUMENT);
		addEEnumLiteral(workProductTypeEEnum, WorkProductType.GENERIC);
		addEEnumLiteral(workProductTypeEEnum, WorkProductType.SHIPPABLE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// duplicates
		createDuplicatesAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// union
		createUnionAnnotations();
		// subsets
		createSubsetsAnnotations();
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
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });
		addAnnotation
		  (umlNamedElementEClass,
		   source,
		   new String[] {
			   "constraints", "has_no_qualified_name has_qualified_name"
		   });
		addAnnotation
		  (umlElementEClass,
		   source,
		   new String[] {
			   "constraints", "not_own_self has_owner"
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
		  (authorEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (qWikiModelEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (umlPackageEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (documentEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (documentVersionEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (sectionEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (roleEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (processReferenceModelEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (termEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (basePractiseEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (processEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (processGroupEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (outcomeEClass,
		   source,
		   new String[] {
		   });
		addAnnotation
		  (workProductEClass,
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
		  (getAuthor__AuthoredDocument(),
		   source,
		   new String[] {
			   "body", "model().ownedElement->select(oclIsKindOf(QWiki::Document)).oclAsType(QWiki::Document)->select(author->includes(self))->asSet()"
		   });
		addAnnotation
		  (getAuthor__AuthoredStandard(),
		   source,
		   new String[] {
			   "body", "authoredDocument()->select(documentType = DocumentType::Standard)"
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
		addAnnotation
		  (getSection__DocumentVersion(),
		   source,
		   new String[] {
			   "body", "if (owningDocument->notEmpty()) then owningDocument else owningSection.documentVersion() endif"
		   });
		addAnnotation
		  (getSection__QualifiedNumber(),
		   source,
		   new String[] {
			   "body", "if (owningSection->notEmpty()) then\r\n  owningSection.qualifiedNumber() + \'.\' + number\r\nelse\r\n  number\r\nendif"
		   });
		addAnnotation
		  (getProcessReferenceModel__OidForDomain(),
		   source,
		   new String[] {
			   "body", "\tif (prmDomain = ProcessReferenceModelDomain::Agile) then \'Agl\' else\r\nif (prmDomain = ProcessReferenceModelDomain::Automotive) then \'A\' else\r\nif (prmDomain = ProcessReferenceModelDomain::Cybersecurity) then \'CS\' else\r\nif (prmDomain = ProcessReferenceModelDomain::DataManagement) then \'DM\' else\r\nif (prmDomain = ProcessReferenceModelDomain::Hardware) then \'HW\' else\r\nif (prmDomain = ProcessReferenceModelDomain::ITServices) then \'ITS\' else\r\nif (prmDomain = ProcessReferenceModelDomain::Mechanical) then \'ME\' else\r\nif (prmDomain = ProcessReferenceModelDomain::Medical) then \'M\' else\r\nif (prmDomain = ProcessReferenceModelDomain::Organizational) then \'Org\' else\r\nif (prmDomain = ProcessReferenceModelDomain::Test) then \'T\' else\r\n\'?\'\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif"
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
		  (getUmlNamedElement_Namespace(),
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
		  (getUmlNamespace_OwnedMember(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUmlNamespace_Member(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getSection_FacilitatingElement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getSpiceElement_Role(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUmlDirectedRelationship_Source(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUmlDirectedRelationship_Target(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getUmlRelationship_RelatedElement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getTerm_TermDefinition(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDomainElement_Domain(),
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
		  (getUmlNamedElement_Namespace(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlElement/owner")
		   });
		addAnnotation
		  (getUmlElement_OwnedComment(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlElement/ownedElement")
		   });
		addAnnotation
		  (getModelElement_Model(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlElement/owner")
		   });
		addAnnotation
		  (getQWikiModel_OwnedModelElement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlElement/ownedElement")
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
		  (getUmlNamespace_ImportedMember(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlNamespace/member")
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
		addAnnotation
		  (getDocument_OwnedVersion(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlElement/ownedElement")
		   });
		addAnnotation
		  (getDocumentVersion_OwnedSection(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlElement/ownedElement")
		   });
		addAnnotation
		  (getDocumentVersion_OwningDocument(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlElement/owner")
		   });
		addAnnotation
		  (getSection_OwnedSection(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlElement/ownedElement")
		   });
		addAnnotation
		  (getSection_OwningSection(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlElement/owner")
		   });
		addAnnotation
		  (getSection_FacilitatingSpiceElement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Section/facilitatingElement")
		   });
		addAnnotation
		  (getSection_OwningDocument(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlElement/owner")
		   });
		addAnnotation
		  (getSpiceElement_OwningProcessReferenceModel(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlElement/owner")
		   });
		addAnnotation
		  (getSpiceElement_OwningRole(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//SpiceElement/role")
		   });
		addAnnotation
		  (getSpiceElement_ManagingRole(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//SpiceElement/role")
		   });
		addAnnotation
		  (getSpiceElement_ParticipatingRole(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//SpiceElement/role")
		   });
		addAnnotation
		  (getProcessReferenceModel_OwnedSpiceElement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlElement/ownedElement")
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
		  (getUmlDirectedRelationship_Target(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlRelationship/relatedElement")
		   });
		addAnnotation
		  (getTerm_OwnedTermDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Term/termDefinition"),
			 URI.createURI(eNS_URI).appendFragment("//UmlElement/ownedElement")
		   });
		addAnnotation
		  (getTerm_ExternalTermDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Term/termDefinition")
		   });
		addAnnotation
		  (getTermDefinition_OwningTerm(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlElement/owner")
		   });
		addAnnotation
		  (getBasePractise_OwningProcess(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlElement/owner")
		   });
		addAnnotation
		  (getProcess_OwningProcessGroup(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlElement/owner")
		   });
		addAnnotation
		  (getProcess_OwnedOutcome(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlElement/ownedElement")
		   });
		addAnnotation
		  (getProcess_OwnedBasePractise(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlElement/ownedElement")
		   });
		addAnnotation
		  (getProcessGroup_OwnedProcess(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlElement/ownedElement")
		   });
		addAnnotation
		  (getOutcome_OwningProcess(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlElement/owner")
		   });
		addAnnotation
		  (getWorkProduct_OwningWorkProductGroup(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlElement/owner")
		   });
		addAnnotation
		  (getGenericWorkProduct_OwnedWorkProduct(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//UmlElement/ownedElement")
		   });
		addAnnotation
		  (getDomainElement_AssignedDomain(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DomainElement/domain")
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
		  (getTaggedElement_CustomProperty(),
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
		addAnnotation
		  (getUmlPackage_PackagedElement(),
		   source,
		   new String[] {
			   "body", "owningPackage"
		   });
		addAnnotation
		  (getDocument_SuperseedingRelationship(),
		   source,
		   new String[] {
			   "body", "document"
		   });
		addAnnotation
		  (getDocument_Author(),
		   source,
		   new String[] {
			   "body", "authoredDocument"
		   });
		addAnnotation
		  (getDocumentVersion_SuperseedingRelationship(),
		   source,
		   new String[] {
			   "body", "documentversion"
		   });
		addAnnotation
		  (getSection_FacilitatingElement(),
		   source,
		   new String[] {
			   "body", "facilitatedSection"
		   });
		addAnnotation
		  (getSection_SuperseedingRelationship(),
		   source,
		   new String[] {
			   "body", "section"
		   });
		addAnnotation
		  (getSpiceElement_OwningRole(),
		   source,
		   new String[] {
			   "body", "spiceelement"
		   });
		addAnnotation
		  (getSpiceElement_ManagingRole(),
		   source,
		   new String[] {
			   "body", "spiceelement"
		   });
		addAnnotation
		  (getSpiceElement_ParticipatingRole(),
		   source,
		   new String[] {
			   "body", "spiceelement"
		   });
		addAnnotation
		  (getSpiceElement_Role(),
		   source,
		   new String[] {
			   "body", "spiceelement"
		   });
		addAnnotation
		  (getUmlDirectedRelationship_Source(),
		   source,
		   new String[] {
			   "body", "directedRelationship"
		   });
		addAnnotation
		  (getUmlDirectedRelationship_Target(),
		   source,
		   new String[] {
			   "body", "directedRelationship"
		   });
		addAnnotation
		  (getTerm_TermDefinition(),
		   source,
		   new String[] {
			   "body", "term"
		   });
		addAnnotation
		  (getBasePractise_FacilitatedWorkProduct(),
		   source,
		   new String[] {
			   "body", "facilitatingBacePractise"
		   });
		addAnnotation
		  (getDomainElement_Domain(),
		   source,
		   new String[] {
			   "body", "namedelement"
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
		  (getWorkProduct_OwningWorkProductGroup(),
		   source,
		   new String[] {
			   "kind", "attribute"
		   });
		addAnnotation
		  (getWorkProduct_FacilitatingOutcome(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getWorkProduct_FacilitatedProcess(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getWorkProduct_FacilitatingProcess(),
		   source,
		   new String[] {
			   "kind", "attribute"
		   });
		addAnnotation
		  (getWorkProduct_FacilitatedOutcome(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
	}

} //QWikiPackageImpl
