/**
 */
package QWiki.impl;

import QWiki.Association;
import QWiki.Author;
import QWiki.AuthorType;
import QWiki.BasePractise;
import QWiki.Comment;
import QWiki.Document;
import QWiki.DocumentType;
import QWiki.DocumentVersion;
import QWiki.DocumentVersionType;
import QWiki.Domain;
import QWiki.GenericWorkProduct;
import QWiki.I18nBaseString;
import QWiki.I18nKeyedString;
import QWiki.I18nString;
import QWiki.I18nValue;
import QWiki.Outcome;
import QWiki.ProcessGroup;
import QWiki.ProcessReferenceModel;
import QWiki.ProcessReferenceModelDomain;
import QWiki.QWikiFactory;
import QWiki.QWikiModel;
import QWiki.QWikiPackage;
import QWiki.RelationshipType;
import QWiki.Role;
import QWiki.Section;
import QWiki.Standard;
import QWiki.SuperseedingRelationship;
import QWiki.SuperseedingType;
import QWiki.Term;
import QWiki.TermDefinition;
import QWiki.WorkProduct;
import QWiki.WorkProductType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QWikiFactoryImpl extends EFactoryImpl implements QWikiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QWikiFactory init() {
		try {
			QWikiFactory theQWikiFactory = (QWikiFactory)EPackage.Registry.INSTANCE.getEFactory(QWikiPackage.eNS_URI);
			if (theQWikiFactory != null) {
				return theQWikiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QWikiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWikiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case QWikiPackage.AUTHOR: return createAuthor();
			case QWikiPackage.COMMENT: return createComment();
			case QWikiPackage.I1_8N_STRING: return createI18nString();
			case QWikiPackage.I1_8N_BASE_STRING: return createI18nBaseString();
			case QWikiPackage.I1_8N_VALUE: return createI18nValue();
			case QWikiPackage.QWIKI_MODEL: return createQWikiModel();
			case QWikiPackage.I1_8N_KEYED_STRING: return createI18nKeyedString();
			case QWikiPackage.DOMAIN: return createDomain();
			case QWikiPackage.DOCUMENT: return createDocument();
			case QWikiPackage.DOCUMENT_VERSION: return createDocumentVersion();
			case QWikiPackage.SECTION: return createSection();
			case QWikiPackage.ROLE: return createRole();
			case QWikiPackage.PROCESS_REFERENCE_MODEL: return createProcessReferenceModel();
			case QWikiPackage.SUPERSEEDING_RELATIONSHIP: return createSuperseedingRelationship();
			case QWikiPackage.TERM: return createTerm();
			case QWikiPackage.TERM_DEFINITION: return createTermDefinition();
			case QWikiPackage.STANDARD: return createStandard();
			case QWikiPackage.ASSOCIATION: return createAssociation();
			case QWikiPackage.RELATIONSHIP_TYPE: return createRelationshipType();
			case QWikiPackage.BASE_PRACTISE: return createBasePractise();
			case QWikiPackage.PROCESS: return createProcess();
			case QWikiPackage.PROCESS_GROUP: return createProcessGroup();
			case QWikiPackage.OUTCOME: return createOutcome();
			case QWikiPackage.WORK_PRODUCT: return createWorkProduct();
			case QWikiPackage.GENERIC_WORK_PRODUCT: return createGenericWorkProduct();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case QWikiPackage.AUTHOR_TYPE:
				return createAuthorTypeFromString(eDataType, initialValue);
			case QWikiPackage.DOCUMENT_VERSION_TYPE:
				return createDocumentVersionTypeFromString(eDataType, initialValue);
			case QWikiPackage.PROCESS_REFERENCE_MODEL_DOMAIN:
				return createProcessReferenceModelDomainFromString(eDataType, initialValue);
			case QWikiPackage.SUPERSEEDING_TYPE:
				return createSuperseedingTypeFromString(eDataType, initialValue);
			case QWikiPackage.DOCUMENT_TYPE:
				return createDocumentTypeFromString(eDataType, initialValue);
			case QWikiPackage.WORK_PRODUCT_TYPE:
				return createWorkProductTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case QWikiPackage.AUTHOR_TYPE:
				return convertAuthorTypeToString(eDataType, instanceValue);
			case QWikiPackage.DOCUMENT_VERSION_TYPE:
				return convertDocumentVersionTypeToString(eDataType, instanceValue);
			case QWikiPackage.PROCESS_REFERENCE_MODEL_DOMAIN:
				return convertProcessReferenceModelDomainToString(eDataType, instanceValue);
			case QWikiPackage.SUPERSEEDING_TYPE:
				return convertSuperseedingTypeToString(eDataType, instanceValue);
			case QWikiPackage.DOCUMENT_TYPE:
				return convertDocumentTypeToString(eDataType, instanceValue);
			case QWikiPackage.WORK_PRODUCT_TYPE:
				return convertWorkProductTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Author createAuthor() {
		AuthorImpl author = new AuthorImpl();
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Comment createComment() {
		CommentImpl comment = new CommentImpl();
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public I18nString createI18nString() {
		I18nStringImpl i18nString = new I18nStringImpl();
		return i18nString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public I18nBaseString createI18nBaseString() {
		I18nBaseStringImpl i18nBaseString = new I18nBaseStringImpl();
		return i18nBaseString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public I18nValue createI18nValue() {
		I18nValueImpl i18nValue = new I18nValueImpl();
		return i18nValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationshipType createRelationshipType() {
		RelationshipTypeImpl relationshipType = new RelationshipTypeImpl();
		return relationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public I18nKeyedString createI18nKeyedString() {
		I18nKeyedStringImpl i18nKeyedString = new I18nKeyedStringImpl();
		return i18nKeyedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QWikiModel createQWikiModel() {
		QWikiModelImpl qWikiModel = new QWikiModelImpl();
		return qWikiModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Domain createDomain() {
		DomainImpl domain = new DomainImpl();
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentVersion createDocumentVersion() {
		DocumentVersionImpl documentVersion = new DocumentVersionImpl();
		return documentVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessReferenceModel createProcessReferenceModel() {
		ProcessReferenceModelImpl processReferenceModel = new ProcessReferenceModelImpl();
		return processReferenceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SuperseedingRelationship createSuperseedingRelationship() {
		SuperseedingRelationshipImpl superseedingRelationship = new SuperseedingRelationshipImpl();
		return superseedingRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Term createTerm() {
		TermImpl term = new TermImpl();
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TermDefinition createTermDefinition() {
		TermDefinitionImpl termDefinition = new TermDefinitionImpl();
		return termDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Standard createStandard() {
		StandardImpl standard = new StandardImpl();
		return standard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasePractise createBasePractise() {
		BasePractiseImpl basePractise = new BasePractiseImpl();
		return basePractise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QWiki.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessGroup createProcessGroup() {
		ProcessGroupImpl processGroup = new ProcessGroupImpl();
		return processGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Outcome createOutcome() {
		OutcomeImpl outcome = new OutcomeImpl();
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkProduct createWorkProduct() {
		WorkProductImpl workProduct = new WorkProductImpl();
		return workProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericWorkProduct createGenericWorkProduct() {
		GenericWorkProductImpl genericWorkProduct = new GenericWorkProductImpl();
		return genericWorkProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorType createAuthorTypeFromString(EDataType eDataType, String initialValue) {
		AuthorType result = AuthorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuthorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentVersionType createDocumentVersionTypeFromString(EDataType eDataType, String initialValue) {
		DocumentVersionType result = DocumentVersionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentVersionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessReferenceModelDomain createProcessReferenceModelDomainFromString(EDataType eDataType, String initialValue) {
		ProcessReferenceModelDomain result = ProcessReferenceModelDomain.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessReferenceModelDomainToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperseedingType createSuperseedingTypeFromString(EDataType eDataType, String initialValue) {
		SuperseedingType result = SuperseedingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSuperseedingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentType createDocumentTypeFromString(EDataType eDataType, String initialValue) {
		DocumentType result = DocumentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductType createWorkProductTypeFromString(EDataType eDataType, String initialValue) {
		WorkProductType result = WorkProductType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkProductTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QWikiPackage getQWikiPackage() {
		return (QWikiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QWikiPackage getPackage() {
		return QWikiPackage.eINSTANCE;
	}

} //QWikiFactoryImpl
