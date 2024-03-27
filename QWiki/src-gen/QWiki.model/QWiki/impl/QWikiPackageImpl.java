/**
 */
package QWiki.impl;

import QWiki.Association;
import QWiki.Author;
import QWiki.AuthorType;
import QWiki.BasePractise;
import QWiki.Comment;
import QWiki.DirectedRelationship;
import QWiki.Document;
import QWiki.DocumentType;
import QWiki.DocumentVersion;
import QWiki.DocumentVersionType;
import QWiki.Domain;
import QWiki.Element;
import QWiki.GenericWorkProduct;
import QWiki.I18nBaseString;
import QWiki.I18nDescriptiveElement;
import QWiki.I18nKeyedString;
import QWiki.I18nNamedElement;
import QWiki.I18nString;
import QWiki.I18nValue;
import QWiki.NamedElement;
import QWiki.Outcome;
import QWiki.ProcessGroup;
import QWiki.ProcessReferenceModel;
import QWiki.ProcessReferenceModelDomain;
import QWiki.QWikiFactory;
import QWiki.QWikiModel;
import QWiki.QWikiPackage;
import QWiki.RasciElement;
import QWiki.Relationship;
import QWiki.RelationshipType;
import QWiki.Role;
import QWiki.Section;
import QWiki.SpiceElement;
import QWiki.Standard;
import QWiki.SuperseedingRelationship;
import QWiki.SuperseedingType;
import QWiki.TaggedElement;
import QWiki.Term;
import QWiki.TermDefinition;
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
	private EClass namedElementEClass = null;

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
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

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
	private EClass directedRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipTypeEClass = null;

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
	private EClass i18nKeyedStringEClass = null;

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
	private EClass domainEClass = null;

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
	private EClass standardEClass = null;

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
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_QualifiedName() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamedElement_AssignedDomain() {
		return (EReference)namedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamedElement_Domain() {
		return (EReference)namedElementEClass.getEStructuralFeatures().get(3);
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
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_OwnedComment() {
		return (EReference)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_OwnedElement() {
		return (EReference)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Owner() {
		return (EReference)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Uuid() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Oid() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__AllOwnedElements() {
		return elementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__MustBeOwned() {
		return elementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElement__Model() {
		return elementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComment_Body() {
		return (EReference)commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComment_OwningElement() {
		return (EReference)commentEClass.getEStructuralFeatures().get(1);
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
	public EClass getDirectedRelationship() {
		return directedRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDirectedRelationship_Target() {
		return (EReference)directedRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDirectedRelationship_Source() {
		return (EReference)directedRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationship_RelatedElement() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociation_EndRelationshipType() {
		return (EReference)associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociation_End() {
		return (EReference)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationshipType() {
		return relationshipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationshipType_TypedAssociation() {
		return (EReference)relationshipTypeEClass.getEStructuralFeatures().get(0);
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
	public EClass getQWikiModel() {
		return qWikiModelEClass;
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
	public EAttribute getDocumentVersion_QualifiedNumber() {
		return (EAttribute)documentVersionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentVersion_OwningDocument() {
		return (EReference)documentVersionEClass.getEStructuralFeatures().get(6);
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
	public EAttribute getSection_QualifiedNumber() {
		return (EAttribute)sectionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSection_Term() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSection_OwningDocument() {
		return (EReference)sectionEClass.getEStructuralFeatures().get(8);
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
	public EClass getStandard() {
		return standardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStandard__Sdo() {
		return standardEClass.getEOperations().get(0);
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
	public EReference getProcessGroup_OnwedProcess() {
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
	public EReference getWorkProduct_OwningWorkingGroup() {
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
		createEOperation(authorEClass, AUTHOR___AUTHORED_DOCUMENT);
		createEOperation(authorEClass, AUTHOR___AUTHORED_STANDARD);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__QUALIFIED_NAME);
		createEReference(namedElementEClass, NAMED_ELEMENT__ASSIGNED_DOMAIN);
		createEReference(namedElementEClass, NAMED_ELEMENT__DOMAIN);

		taggedElementEClass = createEClass(TAGGED_ELEMENT);
		createEAttribute(taggedElementEClass, TAGGED_ELEMENT__TAG);
		createEReference(taggedElementEClass, TAGGED_ELEMENT__CUSTOM_PROPERTY);

		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__OWNED_COMMENT);
		createEReference(elementEClass, ELEMENT__OWNED_ELEMENT);
		createEReference(elementEClass, ELEMENT__OWNER);
		createEAttribute(elementEClass, ELEMENT__UUID);
		createEAttribute(elementEClass, ELEMENT__OID);
		createEOperation(elementEClass, ELEMENT___ALL_OWNED_ELEMENTS);
		createEOperation(elementEClass, ELEMENT___MUST_BE_OWNED);
		createEOperation(elementEClass, ELEMENT___MODEL);

		commentEClass = createEClass(COMMENT);
		createEReference(commentEClass, COMMENT__BODY);
		createEReference(commentEClass, COMMENT__OWNING_ELEMENT);

		i18nStringEClass = createEClass(I1_8N_STRING);

		i18nBaseStringEClass = createEClass(I1_8N_BASE_STRING);
		createEReference(i18nBaseStringEClass, I1_8N_BASE_STRING__VALUE);
		createEOperation(i18nBaseStringEClass, I1_8N_BASE_STRING___VALUE__STRING);

		i18nValueEClass = createEClass(I1_8N_VALUE);
		createEAttribute(i18nValueEClass, I1_8N_VALUE__LANGUAGE);
		createEAttribute(i18nValueEClass, I1_8N_VALUE__BODY);

		qWikiModelEClass = createEClass(QWIKI_MODEL);

		i18nKeyedStringEClass = createEClass(I1_8N_KEYED_STRING);
		createEAttribute(i18nKeyedStringEClass, I1_8N_KEYED_STRING__KEY);

		domainEClass = createEClass(DOMAIN);
		createEReference(domainEClass, DOMAIN__DOMAIN_ELEMENT);
		createEOperation(domainEClass, DOMAIN___ALL_DOMAIN_ELEMENT);

		i18nNamedElementEClass = createEClass(I1_8N_NAMED_ELEMENT);
		createEReference(i18nNamedElementEClass, I1_8N_NAMED_ELEMENT__DISPLAY_NAME);

		documentEClass = createEClass(DOCUMENT);
		createEAttribute(documentEClass, DOCUMENT__NUMBER);
		createEReference(documentEClass, DOCUMENT__OWNED_VERSION);
		createEReference(documentEClass, DOCUMENT__SUPERSEEDING_RELATIONSHIP);
		createEAttribute(documentEClass, DOCUMENT__DOCUMENT_TYPE);
		createEReference(documentEClass, DOCUMENT__AUTHOR);

		i18nDescriptiveElementEClass = createEClass(I1_8N_DESCRIPTIVE_ELEMENT);
		createEReference(i18nDescriptiveElementEClass, I1_8N_DESCRIPTIVE_ELEMENT__PURPOSE);
		createEReference(i18nDescriptiveElementEClass, I1_8N_DESCRIPTIVE_ELEMENT__BODY);

		documentVersionEClass = createEClass(DOCUMENT_VERSION);
		createEAttribute(documentVersionEClass, DOCUMENT_VERSION__PUBLICATION_YEAR);
		createEAttribute(documentVersionEClass, DOCUMENT_VERSION__DOCUMENT_VERSION_TYPE);
		createEAttribute(documentVersionEClass, DOCUMENT_VERSION__EDITION);
		createEReference(documentVersionEClass, DOCUMENT_VERSION__OWNED_SECTION);
		createEReference(documentVersionEClass, DOCUMENT_VERSION__SUPERSEEDING_RELATIONSHIP);
		createEAttribute(documentVersionEClass, DOCUMENT_VERSION__QUALIFIED_NUMBER);
		createEReference(documentVersionEClass, DOCUMENT_VERSION__OWNING_DOCUMENT);

		sectionEClass = createEClass(SECTION);
		createEReference(sectionEClass, SECTION__OWNED_SECTION);
		createEReference(sectionEClass, SECTION__OWNING_SECTION);
		createEAttribute(sectionEClass, SECTION__NUMBER);
		createEReference(sectionEClass, SECTION__FACILITATING_SPICE_ELEMENT);
		createEReference(sectionEClass, SECTION__FACILITATING_ELEMENT);
		createEReference(sectionEClass, SECTION__SUPERSEEDING_RELATIONSHIP);
		createEAttribute(sectionEClass, SECTION__QUALIFIED_NUMBER);
		createEReference(sectionEClass, SECTION__TERM);
		createEReference(sectionEClass, SECTION__OWNING_DOCUMENT);

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

		superseedingRelationshipEClass = createEClass(SUPERSEEDING_RELATIONSHIP);
		createEAttribute(superseedingRelationshipEClass, SUPERSEEDING_RELATIONSHIP__SUPERSEEDING_TYPE);

		directedRelationshipEClass = createEClass(DIRECTED_RELATIONSHIP);
		createEReference(directedRelationshipEClass, DIRECTED_RELATIONSHIP__SOURCE);
		createEReference(directedRelationshipEClass, DIRECTED_RELATIONSHIP__TARGET);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__RELATED_ELEMENT);

		termEClass = createEClass(TERM);
		createEReference(termEClass, TERM__ACRONYM);
		createEReference(termEClass, TERM__SYNONYM);
		createEReference(termEClass, TERM__TERM_DEFINITION);
		createEReference(termEClass, TERM__OWNED_TERM_DEFINITION);
		createEReference(termEClass, TERM__EXTERNAL_TERM_DEFINITION);

		termDefinitionEClass = createEClass(TERM_DEFINITION);
		createEReference(termDefinitionEClass, TERM_DEFINITION__OWNING_TERM);

		standardEClass = createEClass(STANDARD);
		createEOperation(standardEClass, STANDARD___SDO);

		associationEClass = createEClass(ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__END);
		createEReference(associationEClass, ASSOCIATION__END_RELATIONSHIP_TYPE);

		relationshipTypeEClass = createEClass(RELATIONSHIP_TYPE);
		createEReference(relationshipTypeEClass, RELATIONSHIP_TYPE__TYPED_ASSOCIATION);

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
		createEReference(processGroupEClass, PROCESS_GROUP__ONWED_PROCESS);

		outcomeEClass = createEClass(OUTCOME);
		createEReference(outcomeEClass, OUTCOME__FACILITATING_BASE_PRACTISE);
		createEReference(outcomeEClass, OUTCOME__REQUIRED_WORKPRODUCT);
		createEReference(outcomeEClass, OUTCOME__RESULTING_WORKPRODUCT);
		createEReference(outcomeEClass, OUTCOME__OWNING_PROCESS);

		workProductEClass = createEClass(WORK_PRODUCT);
		createEReference(workProductEClass, WORK_PRODUCT__OWNING_WORKING_GROUP);
		createEReference(workProductEClass, WORK_PRODUCT__CHARACTERISTIC);
		createEReference(workProductEClass, WORK_PRODUCT__CONTENT);
		createEReference(workProductEClass, WORK_PRODUCT__FACILITATING_OUTCOME);
		createEReference(workProductEClass, WORK_PRODUCT__FACILITATED_PROCESS);
		createEReference(workProductEClass, WORK_PRODUCT__FACILITATING_PROCESS);
		createEAttribute(workProductEClass, WORK_PRODUCT__WORK_PRODUCT_TYPE);
		createEReference(workProductEClass, WORK_PRODUCT__FACILITATED_OUTCOME);

		genericWorkProductEClass = createEClass(GENERIC_WORK_PRODUCT);
		createEReference(genericWorkProductEClass, GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT);

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
		authorEClass.getESuperTypes().add(this.getNamedElement());
		namedElementEClass.getESuperTypes().add(this.getTaggedElement());
		taggedElementEClass.getESuperTypes().add(this.getElement());
		commentEClass.getESuperTypes().add(this.getElement());
		i18nStringEClass.getESuperTypes().add(this.getI18nBaseString());
		qWikiModelEClass.getESuperTypes().add(this.getElement());
		i18nKeyedStringEClass.getESuperTypes().add(this.getI18nBaseString());
		domainEClass.getESuperTypes().add(this.getI18nNamedElement());
		i18nNamedElementEClass.getESuperTypes().add(this.getNamedElement());
		documentEClass.getESuperTypes().add(this.getI18nDescriptiveElement());
		i18nDescriptiveElementEClass.getESuperTypes().add(this.getI18nNamedElement());
		documentVersionEClass.getESuperTypes().add(this.getElement());
		sectionEClass.getESuperTypes().add(this.getI18nDescriptiveElement());
		spiceElementEClass.getESuperTypes().add(this.getRasciElement());
		rasciElementEClass.getESuperTypes().add(this.getI18nDescriptiveElement());
		roleEClass.getESuperTypes().add(this.getI18nDescriptiveElement());
		processReferenceModelEClass.getESuperTypes().add(this.getI18nDescriptiveElement());
		superseedingRelationshipEClass.getESuperTypes().add(this.getDirectedRelationship());
		directedRelationshipEClass.getESuperTypes().add(this.getRelationship());
		relationshipEClass.getESuperTypes().add(this.getElement());
		termEClass.getESuperTypes().add(this.getI18nNamedElement());
		termDefinitionEClass.getESuperTypes().add(this.getI18nDescriptiveElement());
		standardEClass.getESuperTypes().add(this.getDocument());
		associationEClass.getESuperTypes().add(this.getRelationship());
		relationshipTypeEClass.getESuperTypes().add(this.getI18nNamedElement());
		basePractiseEClass.getESuperTypes().add(this.getSpiceElement());
		processEClass.getESuperTypes().add(this.getSpiceElement());
		processGroupEClass.getESuperTypes().add(this.getSpiceElement());
		outcomeEClass.getESuperTypes().add(this.getI18nNamedElement());
		workProductEClass.getESuperTypes().add(this.getSpiceElement());
		genericWorkProductEClass.getESuperTypes().add(this.getWorkProduct());

		// Initialize classes, features, and operations; add parameters
		initEClass(authorEClass, Author.class, "Author", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthor_AuthorType(), this.getAuthorType(), "authorType", "Person", 1, 1, Author.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getAuthor__AuthoredDocument(), this.getDocument(), "authoredDocument", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getAuthor__AuthoredStandard(), this.getStandard(), "authoredStandard", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNamedElement_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, NamedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getNamedElement_AssignedDomain(), this.getDomain(), this.getDomain_DomainElement(), "assignedDomain", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNamedElement_Domain(), this.getDomain(), null, "domain", null, 0, 1, NamedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(taggedElementEClass, TaggedElement.class, "TaggedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaggedElement_Tag(), ecorePackage.getEString(), "tag", null, 0, -1, TaggedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTaggedElement_CustomProperty(), this.getI18nKeyedString(), null, "customProperty", null, 0, -1, TaggedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_OwnedComment(), this.getComment(), this.getComment_OwningElement(), "ownedComment", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_OwnedElement(), this.getElement(), this.getElement_Owner(), "ownedElement", null, 0, -1, Element.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_Owner(), this.getElement(), this.getElement_OwnedElement(), "owner", null, 0, 1, Element.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElement_Uuid(), ecorePackage.getEString(), "uuid", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElement_Oid(), ecorePackage.getEString(), "oid", null, 1, 1, Element.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getElement__AllOwnedElements(), this.getElement(), "allOwnedElements", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getElement__MustBeOwned(), ecorePackage.getEBoolean(), "mustBeOwned", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getElement__Model(), this.getQWikiModel(), "model", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComment_Body(), this.getI18nString(), null, "body", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComment_OwningElement(), this.getElement(), this.getElement_OwnedComment(), "owningElement", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(i18nStringEClass, I18nString.class, "I18nString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(i18nBaseStringEClass, I18nBaseString.class, "I18nBaseString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getI18nBaseString_Value(), this.getI18nValue(), null, "value", null, 0, -1, I18nBaseString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getI18nBaseString__Value__String(), ecorePackage.getEString(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "language", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(i18nValueEClass, I18nValue.class, "I18nValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getI18nValue_Language(), ecorePackage.getEString(), "language", null, 1, 1, I18nValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getI18nValue_Body(), ecorePackage.getEString(), "body", null, 1, 1, I18nValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(qWikiModelEClass, QWikiModel.class, "QWikiModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(i18nKeyedStringEClass, I18nKeyedString.class, "I18nKeyedString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getI18nKeyedString_Key(), ecorePackage.getEString(), "key", null, 1, 1, I18nKeyedString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomain_DomainElement(), this.getNamedElement(), this.getNamedElement_AssignedDomain(), "domainElement", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getDomain__AllDomainElement(), this.getNamedElement(), "allDomainElement", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(i18nNamedElementEClass, I18nNamedElement.class, "I18nNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getI18nNamedElement_DisplayName(), this.getI18nString(), null, "displayName", null, 0, 1, I18nNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocument_Number(), ecorePackage.getEString(), "number", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDocument_OwnedVersion(), this.getDocumentVersion(), this.getDocumentVersion_OwningDocument(), "ownedVersion", null, 0, -1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDocument_SuperseedingRelationship(), this.getSuperseedingRelationship(), null, "superseedingRelationship", null, 0, -1, Document.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDocument_DocumentType(), this.getDocumentType(), "documentType", null, 1, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDocument_Author(), this.getAuthor(), null, "author", null, 1, -1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(i18nDescriptiveElementEClass, I18nDescriptiveElement.class, "I18nDescriptiveElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getI18nDescriptiveElement_Purpose(), this.getI18nString(), null, "purpose", null, 0, 1, I18nDescriptiveElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getI18nDescriptiveElement_Body(), this.getI18nString(), null, "body", null, 0, 1, I18nDescriptiveElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(documentVersionEClass, DocumentVersion.class, "DocumentVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentVersion_PublicationYear(), ecorePackage.getEString(), "publicationYear", null, 1, 1, DocumentVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDocumentVersion_DocumentVersionType(), this.getDocumentVersionType(), "documentVersionType", "FirstEdition", 1, 1, DocumentVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDocumentVersion_Edition(), ecorePackage.getEString(), "edition", null, 0, 1, DocumentVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDocumentVersion_OwnedSection(), this.getSection(), this.getSection_OwningDocument(), "ownedSection", null, 0, -1, DocumentVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDocumentVersion_SuperseedingRelationship(), this.getSuperseedingRelationship(), null, "superseedingRelationship", null, 0, -1, DocumentVersion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDocumentVersion_QualifiedNumber(), ecorePackage.getEString(), "qualifiedNumber", null, 1, 1, DocumentVersion.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDocumentVersion_OwningDocument(), this.getDocument(), this.getDocument_OwnedVersion(), "owningDocument", null, 1, 1, DocumentVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSection_OwnedSection(), this.getSection(), this.getSection_OwningSection(), "ownedSection", null, 0, -1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSection_OwningSection(), this.getSection(), this.getSection_OwnedSection(), "owningSection", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSection_Number(), ecorePackage.getEString(), "number", null, 1, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSection_FacilitatingSpiceElement(), this.getSpiceElement(), this.getSpiceElement_FacilitatedSection(), "facilitatingSpiceElement", null, 0, -1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSection_FacilitatingElement(), this.getElement(), null, "facilitatingElement", null, 0, -1, Section.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getSection_SuperseedingRelationship(), this.getSuperseedingRelationship(), null, "superseedingRelationship", null, 0, -1, Section.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSection_QualifiedNumber(), ecorePackage.getEString(), "qualifiedNumber", null, 1, 1, Section.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getSection_Term(), this.getTerm(), this.getTerm_ExternalTermDefinition(), "term", null, 0, -1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSection_OwningDocument(), this.getDocumentVersion(), this.getDocumentVersion_OwnedSection(), "owningDocument", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(spiceElementEClass, SpiceElement.class, "SpiceElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpiceElement_OwningProcessReferenceModel(), this.getProcessReferenceModel(), this.getProcessReferenceModel_OwnedSpiceElement(), "owningProcessReferenceModel", null, 0, 1, SpiceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSpiceElement_Number(), ecorePackage.getEString(), "number", null, 1, 1, SpiceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpiceElement_OwningRole(), this.getRole(), null, "owningRole", null, 0, 1, SpiceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpiceElement_ManagingRole(), this.getRole(), null, "managingRole", null, 0, 1, SpiceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpiceElement_ParticipatingRole(), this.getRole(), null, "participatingRole", null, 0, -1, SpiceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpiceElement_Role(), this.getRole(), null, "role", null, 0, -1, SpiceElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getSpiceElement_FacilitatedSection(), this.getSection(), this.getSection_FacilitatingSpiceElement(), "facilitatedSection", null, 0, -1, SpiceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(rasciElementEClass, RasciElement.class, "RasciElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRasciElement_ResponsibleRole(), this.getRole(), this.getRole_ResponsibleElement(), "responsibleRole", null, 1, -1, RasciElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRasciElement_AccountableRole(), this.getRole(), this.getRole_AccountableElement(), "accountableRole", null, 1, 1, RasciElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRasciElement_SupportingRole(), this.getRole(), this.getRole_SupportingElement(), "supportingRole", null, 0, -1, RasciElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRasciElement_ConsultingRole(), this.getRole(), this.getRole_ConsultingElement(), "consultingRole", null, 0, -1, RasciElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRasciElement_InformedRole(), this.getRole(), this.getRole_InformedElement(), "informedRole", null, 0, -1, RasciElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRole_Skills(), this.getI18nString(), null, "skills", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRole_AccountableElement(), this.getRasciElement(), this.getRasciElement_AccountableRole(), "accountableElement", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRole_SupportingElement(), this.getRasciElement(), this.getRasciElement_SupportingRole(), "supportingElement", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRole_ConsultingElement(), this.getRasciElement(), this.getRasciElement_ConsultingRole(), "consultingElement", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRole_InformedElement(), this.getRasciElement(), this.getRasciElement_InformedRole(), "informedElement", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRole_ResponsibleElement(), this.getRasciElement(), this.getRasciElement_ResponsibleRole(), "responsibleElement", null, 0, -1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(processReferenceModelEClass, ProcessReferenceModel.class, "ProcessReferenceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessReferenceModel_IsNonStandard(), ecorePackage.getEBoolean(), "isNonStandard", "false", 1, 1, ProcessReferenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProcessReferenceModel_PrmDomain(), this.getProcessReferenceModelDomain(), "prmDomain", null, 1, 1, ProcessReferenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcessReferenceModel_OwnedSpiceElement(), this.getSpiceElement(), this.getSpiceElement_OwningProcessReferenceModel(), "ownedSpiceElement", null, 0, -1, ProcessReferenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(superseedingRelationshipEClass, SuperseedingRelationship.class, "SuperseedingRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSuperseedingRelationship_SuperseedingType(), this.getSuperseedingType(), "superseedingType", "Equal", 1, 1, SuperseedingRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(directedRelationshipEClass, DirectedRelationship.class, "DirectedRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectedRelationship_Source(), this.getElement(), null, "source", null, 1, -1, DirectedRelationship.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDirectedRelationship_Target(), this.getElement(), null, "target", null, 1, -1, DirectedRelationship.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_RelatedElement(), this.getElement(), null, "relatedElement", null, 1, -1, Relationship.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(termEClass, Term.class, "Term", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerm_Acronym(), this.getI18nString(), null, "acronym", null, 0, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTerm_Synonym(), this.getI18nString(), null, "synonym", null, 0, 1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTerm_TermDefinition(), this.getI18nDescriptiveElement(), null, "termDefinition", null, 0, -1, Term.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getTerm_OwnedTermDefinition(), this.getTermDefinition(), this.getTermDefinition_OwningTerm(), "ownedTermDefinition", null, 0, -1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTerm_ExternalTermDefinition(), this.getSection(), this.getSection_Term(), "externalTermDefinition", null, 0, -1, Term.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(termDefinitionEClass, TermDefinition.class, "TermDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTermDefinition_OwningTerm(), this.getTerm(), this.getTerm_OwnedTermDefinition(), "owningTerm", null, 0, 1, TermDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(standardEClass, Standard.class, "Standard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getStandard__Sdo(), this.getAuthor(), "sdo", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociation_End(), this.getElement(), null, "end", null, 2, 2, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociation_EndRelationshipType(), this.getRelationshipType(), this.getRelationshipType_TypedAssociation(), "endRelationshipType", null, 2, 2, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(relationshipTypeEClass, RelationshipType.class, "RelationshipType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationshipType_TypedAssociation(), this.getAssociation(), this.getAssociation_EndRelationshipType(), "typedAssociation", null, 0, -1, RelationshipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(basePractiseEClass, BasePractise.class, "BasePractise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasePractise_OwningProcess(), this.getProcess(), this.getProcess_OwnedBasePractise(), "owningProcess", null, 1, 1, BasePractise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBasePractise_FacilitatedOutcome(), this.getOutcome(), this.getOutcome_FacilitatingBasePractise(), "facilitatedOutcome", null, 1, -1, BasePractise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBasePractise_FacilitatedWorkProduct(), this.getWorkProduct(), null, "facilitatedWorkProduct", null, 0, 1, BasePractise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(processEClass, QWiki.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcess_OwningProcessGroup(), this.getProcessGroup(), this.getProcessGroup_OnwedProcess(), "owningProcessGroup", null, 1, 1, QWiki.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcess_OwnedOutcome(), this.getOutcome(), this.getOutcome_OwningProcess(), "ownedOutcome", null, 0, -1, QWiki.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_FacilitatingWorkProduct(), this.getWorkProduct(), this.getWorkProduct_FacilitatedProcess(), "facilitatingWorkProduct", null, 0, -1, QWiki.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcess_FacilitatedWorkProduct(), this.getWorkProduct(), this.getWorkProduct_FacilitatingProcess(), "facilitatedWorkProduct", null, 0, 1, QWiki.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcess_OwnedBasePractise(), this.getBasePractise(), this.getBasePractise_OwningProcess(), "ownedBasePractise", null, 0, -1, QWiki.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processGroupEClass, ProcessGroup.class, "ProcessGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessGroup_OnwedProcess(), this.getProcess(), this.getProcess_OwningProcessGroup(), "onwedProcess", null, 0, -1, ProcessGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outcomeEClass, Outcome.class, "Outcome", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutcome_FacilitatingBasePractise(), this.getBasePractise(), this.getBasePractise_FacilitatedOutcome(), "facilitatingBasePractise", null, 1, -1, Outcome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOutcome_RequiredWorkproduct(), this.getWorkProduct(), this.getWorkProduct_FacilitatedOutcome(), "requiredWorkproduct", null, 0, -1, Outcome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOutcome_ResultingWorkproduct(), this.getWorkProduct(), this.getWorkProduct_FacilitatingOutcome(), "resultingWorkproduct", null, 0, -1, Outcome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOutcome_OwningProcess(), this.getProcess(), this.getProcess_OwnedOutcome(), "owningProcess", null, 1, 1, Outcome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(workProductEClass, WorkProduct.class, "WorkProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkProduct_OwningWorkingGroup(), this.getGenericWorkProduct(), this.getGenericWorkProduct_OwnedWorkProduct(), "owningWorkingGroup", null, 0, 1, WorkProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkProduct_Characteristic(), this.getI18nString(), null, "characteristic", null, 0, -1, WorkProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkProduct_Content(), this.getI18nString(), null, "content", null, 0, -1, WorkProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkProduct_FacilitatingOutcome(), this.getOutcome(), this.getOutcome_ResultingWorkproduct(), "facilitatingOutcome", null, 0, -1, WorkProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkProduct_FacilitatedProcess(), this.getProcess(), this.getProcess_FacilitatingWorkProduct(), "facilitatedProcess", null, 0, -1, WorkProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkProduct_FacilitatingProcess(), this.getProcess(), this.getProcess_FacilitatedWorkProduct(), "facilitatingProcess", null, 1, 1, WorkProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWorkProduct_WorkProductType(), this.getWorkProductType(), "workProductType", null, 1, 1, WorkProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkProduct_FacilitatedOutcome(), this.getOutcome(), this.getOutcome_RequiredWorkproduct(), "facilitatedOutcome", null, 0, -1, WorkProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(genericWorkProductEClass, GenericWorkProduct.class, "GenericWorkProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenericWorkProduct_OwnedWorkProduct(), this.getWorkProduct(), this.getWorkProduct_OwningWorkingGroup(), "ownedWorkProduct", null, 0, -1, GenericWorkProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

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
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });
		addAnnotation
		  (elementEClass,
		   source,
		   new String[] {
			   "constraints", "not_own_self has_owner"
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
		  (getNamedElement_AssignedDomain(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/domain")
		   });
		addAnnotation
		  (getElement_OwnedComment(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });
		addAnnotation
		  (getComment_OwningElement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });
		addAnnotation
		  (getDocument_OwnedVersion(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });
		addAnnotation
		  (getDocumentVersion_OwnedSection(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });
		addAnnotation
		  (getDocumentVersion_OwningDocument(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });
		addAnnotation
		  (getSection_OwnedSection(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });
		addAnnotation
		  (getSection_OwningSection(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
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
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });
		addAnnotation
		  (getSpiceElement_OwningProcessReferenceModel(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
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
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });
		addAnnotation
		  (getDirectedRelationship_Source(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/relatedElement")
		   });
		addAnnotation
		  (getDirectedRelationship_Target(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/relatedElement")
		   });
		addAnnotation
		  (getTerm_OwnedTermDefinition(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement"),
			 URI.createURI(eNS_URI).appendFragment("//Term/termDefinition")
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
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });
		addAnnotation
		  (getBasePractise_OwningProcess(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });
		addAnnotation
		  (getProcess_OwningProcessGroup(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });
		addAnnotation
		  (getProcess_OwnedOutcome(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });
		addAnnotation
		  (getProcess_OwnedBasePractise(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });
		addAnnotation
		  (getProcessGroup_OnwedProcess(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });
		addAnnotation
		  (getOutcome_OwningProcess(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });
		addAnnotation
		  (getWorkProduct_OwningWorkingGroup(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });
		addAnnotation
		  (getGenericWorkProduct_OwnedWorkProduct(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
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
		  (getNamedElement_Domain(),
		   source,
		   new String[] {
			   "body", "namedelement"
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
		  (getDirectedRelationship_Source(),
		   source,
		   new String[] {
			   "body", "relationshipAsSource"
		   });
		addAnnotation
		  (getDirectedRelationship_Target(),
		   source,
		   new String[] {
			   "body", "relationshipAsTarget"
		   });
		addAnnotation
		  (getRelationship_RelatedElement(),
		   source,
		   new String[] {
			   "body", "relationship"
		   });
		addAnnotation
		  (getTerm_TermDefinition(),
		   source,
		   new String[] {
			   "body", "term"
		   });
		addAnnotation
		  (getAssociation_End(),
		   source,
		   new String[] {
			   "body", "association"
		   });
		addAnnotation
		  (getBasePractise_FacilitatedWorkProduct(),
		   source,
		   new String[] {
			   "body", "facilitatingBacePractise"
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
		  (getNamedElement_Domain(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getElement_OwnedElement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getElement_Owner(),
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
		  (getDirectedRelationship_Source(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getDirectedRelationship_Target(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getRelationship_RelatedElement(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getTerm_TermDefinition(),
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
			   "body", "model.ownedElement->select(oclIsKindOf(QWiki::Document)).oclAsType(QWiki::Document)->select(author->includes(self))->asSet()"
		   });
		addAnnotation
		  (getAuthor__AuthoredStandard(),
		   source,
		   new String[] {
			   "body", "model.ownedElement->select(oclIsKindOf(QWiki::Standard)).oclAsType(QWiki::Standard)->select(author->includes(self))->asSet()"
		   });
		addAnnotation
		  (elementEClass,
		   source,
		   new String[] {
			   "not_own_self", "not self.allOwnedElements()->includes(self)",
			   "has_owner", "self.mustBeOwned() implies owner->notEmpty()"
		   });
		addAnnotation
		  (getElement__AllOwnedElements(),
		   source,
		   new String[] {
			   "body", "ownedElement->union(ownedElement->collect(e | e.allOwnedElements()))->asSet()"
		   });
		addAnnotation
		  (getElement__MustBeOwned(),
		   source,
		   new String[] {
			   "body", "true"
		   });
		addAnnotation
		  (getElement__Model(),
		   source,
		   new String[] {
			   "body", "if (owner = null) then\r\n\tnull\r\nelse if (owner.oclIsKindOf(QWikiModel)) then\r\n  owner.oclAsType(QWikiModel)\r\nelse\r\n  owner.model()\r\nendif\r\nendif\r\n  "
		   });
		addAnnotation
		  (getStandard__Sdo(),
		   source,
		   new String[] {
			   "body", "author->select(authorType = StandardsDevelopmentOrganization)"
		   });
	}

} //QWikiPackageImpl
