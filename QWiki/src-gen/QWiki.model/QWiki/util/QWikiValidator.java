/**
 */
package QWiki.util;

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

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see QWiki.QWikiPackage
 * @generated
 */
public class QWikiValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final QWikiValidator INSTANCE = new QWikiValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "QWiki";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWikiValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return QWikiPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case QWikiPackage.AUTHOR:
				return validateAuthor((Author)value, diagnostics, context);
			case QWikiPackage.UML_NAMED_ELEMENT:
				return validateUmlNamedElement((UmlNamedElement)value, diagnostics, context);
			case QWikiPackage.UML_ELEMENT:
				return validateUmlElement((UmlElement)value, diagnostics, context);
			case QWikiPackage.UML_COMMENT:
				return validateUmlComment((UmlComment)value, diagnostics, context);
			case QWikiPackage.MODEL_ELEMENT:
				return validateModelElement((ModelElement)value, diagnostics, context);
			case QWikiPackage.TAGGED_ELEMENT:
				return validateTaggedElement((TaggedElement)value, diagnostics, context);
			case QWikiPackage.I1_8N_KEYED_STRING:
				return validateI18nKeyedString((I18nKeyedString)value, diagnostics, context);
			case QWikiPackage.I1_8N_BASE_STRING:
				return validateI18nBaseString((I18nBaseString)value, diagnostics, context);
			case QWikiPackage.I1_8N_VALUE:
				return validateI18nValue((I18nValue)value, diagnostics, context);
			case QWikiPackage.QWIKI_MODEL:
				return validateQWikiModel((QWikiModel)value, diagnostics, context);
			case QWikiPackage.UML_PACKAGE:
				return validateUmlPackage((UmlPackage)value, diagnostics, context);
			case QWikiPackage.UML_PACKAGEABLE_ELEMENT:
				return validateUmlPackageableElement((UmlPackageableElement)value, diagnostics, context);
			case QWikiPackage.UML_NAMESPACE:
				return validateUmlNamespace((UmlNamespace)value, diagnostics, context);
			case QWikiPackage.DOCUMENT:
				return validateDocument((Document)value, diagnostics, context);
			case QWikiPackage.I1_8N_DESCRIPTIVE_ELEMENT:
				return validateI18nDescriptiveElement((I18nDescriptiveElement)value, diagnostics, context);
			case QWikiPackage.I1_8N_NAMED_ELEMENT:
				return validateI18nNamedElement((I18nNamedElement)value, diagnostics, context);
			case QWikiPackage.I1_8N_STRING:
				return validateI18nString((I18nString)value, diagnostics, context);
			case QWikiPackage.DOCUMENT_VERSION:
				return validateDocumentVersion((DocumentVersion)value, diagnostics, context);
			case QWikiPackage.SECTION:
				return validateSection((Section)value, diagnostics, context);
			case QWikiPackage.SPICE_ELEMENT:
				return validateSpiceElement((SpiceElement)value, diagnostics, context);
			case QWikiPackage.RASCI_ELEMENT:
				return validateRasciElement((RasciElement)value, diagnostics, context);
			case QWikiPackage.ROLE:
				return validateRole((Role)value, diagnostics, context);
			case QWikiPackage.PROCESS_REFERENCE_MODEL:
				return validateProcessReferenceModel((ProcessReferenceModel)value, diagnostics, context);
			case QWikiPackage.SUPERSEEDING_RELATIONSHIP:
				return validateSuperseedingRelationship((SuperseedingRelationship)value, diagnostics, context);
			case QWikiPackage.UML_DIRECTED_RELATIONSHIP:
				return validateUmlDirectedRelationship((UmlDirectedRelationship)value, diagnostics, context);
			case QWikiPackage.UML_RELATIONSHIP:
				return validateUmlRelationship((UmlRelationship)value, diagnostics, context);
			case QWikiPackage.TERM:
				return validateTerm((Term)value, diagnostics, context);
			case QWikiPackage.TERM_DEFINITION:
				return validateTermDefinition((TermDefinition)value, diagnostics, context);
			case QWikiPackage.BASE_PRACTISE:
				return validateBasePractise((BasePractise)value, diagnostics, context);
			case QWikiPackage.PROCESS:
				return validateProcess((QWiki.Process)value, diagnostics, context);
			case QWikiPackage.PROCESS_GROUP:
				return validateProcessGroup((ProcessGroup)value, diagnostics, context);
			case QWikiPackage.OUTCOME:
				return validateOutcome((Outcome)value, diagnostics, context);
			case QWikiPackage.WORK_PRODUCT:
				return validateWorkProduct((WorkProduct)value, diagnostics, context);
			case QWikiPackage.GENERIC_WORK_PRODUCT:
				return validateGenericWorkProduct((GenericWorkProduct)value, diagnostics, context);
			case QWikiPackage.DOMAIN:
				return validateDomain((Domain)value, diagnostics, context);
			case QWikiPackage.DOMAIN_ELEMENT:
				return validateDomainElement((DomainElement)value, diagnostics, context);
			case QWikiPackage.DO_NOT_USE_RELATIONSHIP:
				return validateDO_NOT_USE_Relationship((DO_NOT_USE_Relationship)value, diagnostics, context);
			case QWikiPackage.DO_NOT_USE_RELATIONSHIP_TYPE:
				return validateDO_NOT_USE_RelationshipType((DO_NOT_USE_RelationshipType)value, diagnostics, context);
			case QWikiPackage.UML_ASSOCIATION:
				return validateUmlAssociation((UmlAssociation)value, diagnostics, context);
			case QWikiPackage.AUTHOR_TYPE:
				return validateAuthorType((AuthorType)value, diagnostics, context);
			case QWikiPackage.DOCUMENT_VERSION_TYPE:
				return validateDocumentVersionType((DocumentVersionType)value, diagnostics, context);
			case QWikiPackage.PROCESS_REFERENCE_MODEL_DOMAIN:
				return validateProcessReferenceModelDomain((ProcessReferenceModelDomain)value, diagnostics, context);
			case QWikiPackage.SUPERSEEDING_TYPE:
				return validateSuperseedingType((SuperseedingType)value, diagnostics, context);
			case QWikiPackage.DOCUMENT_TYPE:
				return validateDocumentType((DocumentType)value, diagnostics, context);
			case QWikiPackage.WORK_PRODUCT_TYPE:
				return validateWorkProductType((WorkProductType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthor(Author author, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(author, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(author, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(author, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(author, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(author, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(author, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(author, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(author, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(author, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(author, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(author, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(author, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(author, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUmlNamedElement(UmlNamedElement umlNamedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(umlNamedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(umlNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(umlNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(umlNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(umlNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(umlNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(umlNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(umlNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(umlNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(umlNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(umlNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(umlNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(umlNamedElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the has_no_qualified_name constraint of '<em>Uml Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UML_NAMED_ELEMENT__HAS_NO_QUALIFIED_NAME__EEXPRESSION = "(self.name->isEmpty() or self.allNamespaces()->select(ns | ns.name->isEmpty())->notEmpty())\r\n" +
		"  implies self.qualifiedName->isEmpty()";

	/**
	 * Validates the has_no_qualified_name constraint of '<em>Uml Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUmlNamedElement_has_no_qualified_name(UmlNamedElement umlNamedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(QWikiPackage.Literals.UML_NAMED_ELEMENT,
				 umlNamedElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "has_no_qualified_name",
				 UML_NAMED_ELEMENT__HAS_NO_QUALIFIED_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the has_qualified_name constraint of '<em>Uml Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UML_NAMED_ELEMENT__HAS_QUALIFIED_NAME__EEXPRESSION = "(self.name->notEmpty() and self.allNamespaces()->select(ns | ns.name->isEmpty())->isEmpty()) implies\n" +
		"  self.qualifiedName = self.allNamespaces()->iterate( ns : UmlNamespace; result: String = self.name | ns.name + self.separator() + result)";

	/**
	 * Validates the has_qualified_name constraint of '<em>Uml Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUmlNamedElement_has_qualified_name(UmlNamedElement umlNamedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(QWikiPackage.Literals.UML_NAMED_ELEMENT,
				 umlNamedElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "has_qualified_name",
				 UML_NAMED_ELEMENT__HAS_QUALIFIED_NAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUmlElement(UmlElement umlElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(umlElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(umlElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(umlElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(umlElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(umlElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(umlElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(umlElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(umlElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(umlElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(umlElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(umlElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the not_own_self constraint of '<em>Uml Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UML_ELEMENT__NOT_OWN_SELF__EEXPRESSION = "not self.allOwnedElements()->includes(self)";

	/**
	 * Validates the not_own_self constraint of '<em>Uml Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUmlElement_not_own_self(UmlElement umlElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(QWikiPackage.Literals.UML_ELEMENT,
				 umlElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "not_own_self",
				 UML_ELEMENT__NOT_OWN_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the has_owner constraint of '<em>Uml Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String UML_ELEMENT__HAS_OWNER__EEXPRESSION = "self.mustBeOwned() implies owner->notEmpty()";

	/**
	 * Validates the has_owner constraint of '<em>Uml Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUmlElement_has_owner(UmlElement umlElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(QWikiPackage.Literals.UML_ELEMENT,
				 umlElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "has_owner",
				 UML_ELEMENT__HAS_OWNER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUmlComment(UmlComment umlComment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(umlComment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(umlComment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(umlComment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(umlComment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(umlComment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(umlComment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(umlComment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(umlComment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(umlComment, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(umlComment, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(umlComment, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelElement(ModelElement modelElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(modelElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(modelElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(modelElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaggedElement(TaggedElement taggedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(taggedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(taggedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(taggedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(taggedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(taggedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(taggedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(taggedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(taggedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(taggedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(taggedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(taggedElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI18nKeyedString(I18nKeyedString i18nKeyedString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(i18nKeyedString, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI18nBaseString(I18nBaseString i18nBaseString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(i18nBaseString, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI18nValue(I18nValue i18nValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(i18nValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQWikiModel(QWikiModel qWikiModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(qWikiModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(qWikiModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(qWikiModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(qWikiModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(qWikiModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(qWikiModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(qWikiModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(qWikiModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(qWikiModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(qWikiModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(qWikiModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(qWikiModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(qWikiModel, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUmlPackage(UmlPackage umlPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(umlPackage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(umlPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(umlPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(umlPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(umlPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(umlPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(umlPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(umlPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(umlPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(umlPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(umlPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(umlPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(umlPackage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUmlPackageableElement(UmlPackageableElement umlPackageableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(umlPackageableElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(umlPackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(umlPackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(umlPackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(umlPackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(umlPackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(umlPackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(umlPackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(umlPackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(umlPackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(umlPackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(umlPackageableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(umlPackageableElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUmlNamespace(UmlNamespace umlNamespace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(umlNamespace, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(umlNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(umlNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(umlNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(umlNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(umlNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(umlNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(umlNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(umlNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(umlNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(umlNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(umlNamespace, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(umlNamespace, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocument(Document document, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(document, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(document, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(document, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(document, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(document, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(document, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(document, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(document, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(document, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(document, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(document, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(document, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(document, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI18nDescriptiveElement(I18nDescriptiveElement i18nDescriptiveElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(i18nDescriptiveElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(i18nDescriptiveElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(i18nDescriptiveElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(i18nDescriptiveElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(i18nDescriptiveElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(i18nDescriptiveElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(i18nDescriptiveElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(i18nDescriptiveElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(i18nDescriptiveElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(i18nDescriptiveElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(i18nDescriptiveElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(i18nDescriptiveElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(i18nDescriptiveElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI18nNamedElement(I18nNamedElement i18nNamedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(i18nNamedElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(i18nNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(i18nNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(i18nNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(i18nNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(i18nNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(i18nNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(i18nNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(i18nNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(i18nNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(i18nNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(i18nNamedElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(i18nNamedElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI18nString(I18nString i18nString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(i18nString, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentVersion(DocumentVersion documentVersion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(documentVersion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(documentVersion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(documentVersion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(documentVersion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(documentVersion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(documentVersion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(documentVersion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(documentVersion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(documentVersion, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(documentVersion, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(documentVersion, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSection(Section section, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(section, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(section, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(section, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(section, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(section, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(section, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(section, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(section, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(section, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(section, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(section, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(section, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(section, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpiceElement(SpiceElement spiceElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(spiceElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(spiceElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(spiceElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(spiceElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(spiceElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(spiceElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(spiceElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(spiceElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(spiceElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(spiceElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(spiceElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(spiceElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(spiceElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRasciElement(RasciElement rasciElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rasciElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rasciElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rasciElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rasciElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rasciElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rasciElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rasciElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rasciElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rasciElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(rasciElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(rasciElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(rasciElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(rasciElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRole(Role role, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(role, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(role, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(role, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(role, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(role, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(role, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(role, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessReferenceModel(ProcessReferenceModel processReferenceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processReferenceModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processReferenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processReferenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processReferenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processReferenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processReferenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processReferenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processReferenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processReferenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(processReferenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(processReferenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(processReferenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(processReferenceModel, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuperseedingRelationship(SuperseedingRelationship superseedingRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(superseedingRelationship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(superseedingRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(superseedingRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(superseedingRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(superseedingRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(superseedingRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(superseedingRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(superseedingRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(superseedingRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(superseedingRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(superseedingRelationship, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUmlDirectedRelationship(UmlDirectedRelationship umlDirectedRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(umlDirectedRelationship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(umlDirectedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(umlDirectedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(umlDirectedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(umlDirectedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(umlDirectedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(umlDirectedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(umlDirectedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(umlDirectedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(umlDirectedRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(umlDirectedRelationship, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUmlRelationship(UmlRelationship umlRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(umlRelationship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(umlRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(umlRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(umlRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(umlRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(umlRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(umlRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(umlRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(umlRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(umlRelationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(umlRelationship, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerm(Term term, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(term, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(term, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(term, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(term, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(term, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(term, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(term, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(term, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(term, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(term, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(term, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(term, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(term, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTermDefinition(TermDefinition termDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(termDefinition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(termDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(termDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(termDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(termDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(termDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(termDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(termDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(termDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(termDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(termDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(termDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(termDefinition, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasePractise(BasePractise basePractise, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(basePractise, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(basePractise, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(basePractise, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(basePractise, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(basePractise, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(basePractise, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(basePractise, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(basePractise, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(basePractise, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(basePractise, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(basePractise, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(basePractise, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(basePractise, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcess(QWiki.Process process, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(process, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(process, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(process, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(process, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessGroup(ProcessGroup processGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(processGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(processGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(processGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(processGroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutcome(Outcome outcome, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(outcome, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(outcome, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(outcome, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(outcome, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(outcome, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(outcome, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(outcome, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(outcome, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(outcome, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(outcome, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(outcome, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(outcome, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(outcome, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkProduct(WorkProduct workProduct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(workProduct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(workProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(workProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(workProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(workProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(workProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(workProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(workProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(workProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(workProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(workProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(workProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(workProduct, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericWorkProduct(GenericWorkProduct genericWorkProduct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(genericWorkProduct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(genericWorkProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(genericWorkProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(genericWorkProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(genericWorkProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(genericWorkProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(genericWorkProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(genericWorkProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(genericWorkProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(genericWorkProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(genericWorkProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(genericWorkProduct, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(genericWorkProduct, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomain(Domain domain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(domain, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(domain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(domain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(domain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(domain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(domain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(domain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(domain, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(domain, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(domain, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(domain, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(domain, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(domain, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainElement(DomainElement domainElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(domainElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(domainElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(domainElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(domainElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(domainElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(domainElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(domainElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(domainElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(domainElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(domainElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(domainElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(domainElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(domainElement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDO_NOT_USE_Relationship(DO_NOT_USE_Relationship dO_NOT_USE_Relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dO_NOT_USE_Relationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDO_NOT_USE_RelationshipType(DO_NOT_USE_RelationshipType dO_NOT_USE_RelationshipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dO_NOT_USE_RelationshipType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dO_NOT_USE_RelationshipType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dO_NOT_USE_RelationshipType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dO_NOT_USE_RelationshipType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dO_NOT_USE_RelationshipType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dO_NOT_USE_RelationshipType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dO_NOT_USE_RelationshipType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dO_NOT_USE_RelationshipType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dO_NOT_USE_RelationshipType, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(dO_NOT_USE_RelationshipType, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(dO_NOT_USE_RelationshipType, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_no_qualified_name(dO_NOT_USE_RelationshipType, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlNamedElement_has_qualified_name(dO_NOT_USE_RelationshipType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUmlAssociation(UmlAssociation umlAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(umlAssociation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(umlAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(umlAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(umlAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(umlAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(umlAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(umlAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(umlAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(umlAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_not_own_self(umlAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateUmlElement_has_owner(umlAssociation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorType(AuthorType authorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentVersionType(DocumentVersionType documentVersionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessReferenceModelDomain(ProcessReferenceModelDomain processReferenceModelDomain, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSuperseedingType(SuperseedingType superseedingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentType(DocumentType documentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkProductType(WorkProductType workProductType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //QWikiValidator
