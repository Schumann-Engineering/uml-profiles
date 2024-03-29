/**
 */
package QWiki.util;

import QWiki.Author;
import QWiki.BasePractise;
import QWiki.DO_NOT_USE_Relationship;
import QWiki.DO_NOT_USE_RelationshipType;
import QWiki.Document;
import QWiki.DocumentVersion;
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
import QWiki.QWikiModel;
import QWiki.QWikiPackage;
import QWiki.RasciElement;
import QWiki.Role;
import QWiki.Section;
import QWiki.SpiceElement;
import QWiki.SuperseedingRelationship;
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see QWiki.QWikiPackage
 * @generated
 */
public class QWikiSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QWikiPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWikiSwitch() {
		if (modelPackage == null) {
			modelPackage = QWikiPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case QWikiPackage.AUTHOR: {
				Author author = (Author)theEObject;
				T result = caseAuthor(author);
				if (result == null) result = caseUmlNamedElement(author);
				if (result == null) result = caseModelElement(author);
				if (result == null) result = caseTaggedElement(author);
				if (result == null) result = caseUmlElement(author);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.UML_NAMED_ELEMENT: {
				UmlNamedElement umlNamedElement = (UmlNamedElement)theEObject;
				T result = caseUmlNamedElement(umlNamedElement);
				if (result == null) result = caseModelElement(umlNamedElement);
				if (result == null) result = caseTaggedElement(umlNamedElement);
				if (result == null) result = caseUmlElement(umlNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.UML_ELEMENT: {
				UmlElement umlElement = (UmlElement)theEObject;
				T result = caseUmlElement(umlElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.UML_COMMENT: {
				UmlComment umlComment = (UmlComment)theEObject;
				T result = caseUmlComment(umlComment);
				if (result == null) result = caseUmlElement(umlComment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.MODEL_ELEMENT: {
				ModelElement modelElement = (ModelElement)theEObject;
				T result = caseModelElement(modelElement);
				if (result == null) result = caseTaggedElement(modelElement);
				if (result == null) result = caseUmlElement(modelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.TAGGED_ELEMENT: {
				TaggedElement taggedElement = (TaggedElement)theEObject;
				T result = caseTaggedElement(taggedElement);
				if (result == null) result = caseUmlElement(taggedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.I1_8N_KEYED_STRING: {
				I18nKeyedString i18nKeyedString = (I18nKeyedString)theEObject;
				T result = caseI18nKeyedString(i18nKeyedString);
				if (result == null) result = caseI18nBaseString(i18nKeyedString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.I1_8N_BASE_STRING: {
				I18nBaseString i18nBaseString = (I18nBaseString)theEObject;
				T result = caseI18nBaseString(i18nBaseString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.I1_8N_VALUE: {
				I18nValue i18nValue = (I18nValue)theEObject;
				T result = caseI18nValue(i18nValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.QWIKI_MODEL: {
				QWikiModel qWikiModel = (QWikiModel)theEObject;
				T result = caseQWikiModel(qWikiModel);
				if (result == null) result = caseUmlPackage(qWikiModel);
				if (result == null) result = caseUmlNamespace(qWikiModel);
				if (result == null) result = caseUmlPackageableElement(qWikiModel);
				if (result == null) result = caseUmlNamedElement(qWikiModel);
				if (result == null) result = caseModelElement(qWikiModel);
				if (result == null) result = caseTaggedElement(qWikiModel);
				if (result == null) result = caseUmlElement(qWikiModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.UML_PACKAGE: {
				UmlPackage umlPackage = (UmlPackage)theEObject;
				T result = caseUmlPackage(umlPackage);
				if (result == null) result = caseUmlNamespace(umlPackage);
				if (result == null) result = caseUmlPackageableElement(umlPackage);
				if (result == null) result = caseUmlNamedElement(umlPackage);
				if (result == null) result = caseModelElement(umlPackage);
				if (result == null) result = caseTaggedElement(umlPackage);
				if (result == null) result = caseUmlElement(umlPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.UML_PACKAGEABLE_ELEMENT: {
				UmlPackageableElement umlPackageableElement = (UmlPackageableElement)theEObject;
				T result = caseUmlPackageableElement(umlPackageableElement);
				if (result == null) result = caseUmlNamedElement(umlPackageableElement);
				if (result == null) result = caseModelElement(umlPackageableElement);
				if (result == null) result = caseTaggedElement(umlPackageableElement);
				if (result == null) result = caseUmlElement(umlPackageableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.UML_NAMESPACE: {
				UmlNamespace umlNamespace = (UmlNamespace)theEObject;
				T result = caseUmlNamespace(umlNamespace);
				if (result == null) result = caseUmlNamedElement(umlNamespace);
				if (result == null) result = caseModelElement(umlNamespace);
				if (result == null) result = caseTaggedElement(umlNamespace);
				if (result == null) result = caseUmlElement(umlNamespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.DOCUMENT: {
				Document document = (Document)theEObject;
				T result = caseDocument(document);
				if (result == null) result = caseI18nDescriptiveElement(document);
				if (result == null) result = caseI18nNamedElement(document);
				if (result == null) result = caseUmlNamedElement(document);
				if (result == null) result = caseModelElement(document);
				if (result == null) result = caseTaggedElement(document);
				if (result == null) result = caseUmlElement(document);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.I1_8N_DESCRIPTIVE_ELEMENT: {
				I18nDescriptiveElement i18nDescriptiveElement = (I18nDescriptiveElement)theEObject;
				T result = caseI18nDescriptiveElement(i18nDescriptiveElement);
				if (result == null) result = caseI18nNamedElement(i18nDescriptiveElement);
				if (result == null) result = caseUmlNamedElement(i18nDescriptiveElement);
				if (result == null) result = caseModelElement(i18nDescriptiveElement);
				if (result == null) result = caseTaggedElement(i18nDescriptiveElement);
				if (result == null) result = caseUmlElement(i18nDescriptiveElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.I1_8N_NAMED_ELEMENT: {
				I18nNamedElement i18nNamedElement = (I18nNamedElement)theEObject;
				T result = caseI18nNamedElement(i18nNamedElement);
				if (result == null) result = caseUmlNamedElement(i18nNamedElement);
				if (result == null) result = caseModelElement(i18nNamedElement);
				if (result == null) result = caseTaggedElement(i18nNamedElement);
				if (result == null) result = caseUmlElement(i18nNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.I1_8N_STRING: {
				I18nString i18nString = (I18nString)theEObject;
				T result = caseI18nString(i18nString);
				if (result == null) result = caseI18nBaseString(i18nString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.DOCUMENT_VERSION: {
				DocumentVersion documentVersion = (DocumentVersion)theEObject;
				T result = caseDocumentVersion(documentVersion);
				if (result == null) result = caseModelElement(documentVersion);
				if (result == null) result = caseTaggedElement(documentVersion);
				if (result == null) result = caseUmlElement(documentVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.SECTION: {
				Section section = (Section)theEObject;
				T result = caseSection(section);
				if (result == null) result = caseI18nDescriptiveElement(section);
				if (result == null) result = caseI18nNamedElement(section);
				if (result == null) result = caseUmlNamedElement(section);
				if (result == null) result = caseModelElement(section);
				if (result == null) result = caseTaggedElement(section);
				if (result == null) result = caseUmlElement(section);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.SPICE_ELEMENT: {
				SpiceElement spiceElement = (SpiceElement)theEObject;
				T result = caseSpiceElement(spiceElement);
				if (result == null) result = caseRasciElement(spiceElement);
				if (result == null) result = caseI18nDescriptiveElement(spiceElement);
				if (result == null) result = caseI18nNamedElement(spiceElement);
				if (result == null) result = caseUmlNamedElement(spiceElement);
				if (result == null) result = caseModelElement(spiceElement);
				if (result == null) result = caseTaggedElement(spiceElement);
				if (result == null) result = caseUmlElement(spiceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.RASCI_ELEMENT: {
				RasciElement rasciElement = (RasciElement)theEObject;
				T result = caseRasciElement(rasciElement);
				if (result == null) result = caseI18nDescriptiveElement(rasciElement);
				if (result == null) result = caseI18nNamedElement(rasciElement);
				if (result == null) result = caseUmlNamedElement(rasciElement);
				if (result == null) result = caseModelElement(rasciElement);
				if (result == null) result = caseTaggedElement(rasciElement);
				if (result == null) result = caseUmlElement(rasciElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = caseI18nDescriptiveElement(role);
				if (result == null) result = caseI18nNamedElement(role);
				if (result == null) result = caseUmlNamedElement(role);
				if (result == null) result = caseModelElement(role);
				if (result == null) result = caseTaggedElement(role);
				if (result == null) result = caseUmlElement(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.PROCESS_REFERENCE_MODEL: {
				ProcessReferenceModel processReferenceModel = (ProcessReferenceModel)theEObject;
				T result = caseProcessReferenceModel(processReferenceModel);
				if (result == null) result = caseI18nDescriptiveElement(processReferenceModel);
				if (result == null) result = caseI18nNamedElement(processReferenceModel);
				if (result == null) result = caseUmlNamedElement(processReferenceModel);
				if (result == null) result = caseModelElement(processReferenceModel);
				if (result == null) result = caseTaggedElement(processReferenceModel);
				if (result == null) result = caseUmlElement(processReferenceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.SUPERSEEDING_RELATIONSHIP: {
				SuperseedingRelationship superseedingRelationship = (SuperseedingRelationship)theEObject;
				T result = caseSuperseedingRelationship(superseedingRelationship);
				if (result == null) result = caseUmlDirectedRelationship(superseedingRelationship);
				if (result == null) result = caseUmlRelationship(superseedingRelationship);
				if (result == null) result = caseUmlElement(superseedingRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.UML_DIRECTED_RELATIONSHIP: {
				UmlDirectedRelationship umlDirectedRelationship = (UmlDirectedRelationship)theEObject;
				T result = caseUmlDirectedRelationship(umlDirectedRelationship);
				if (result == null) result = caseUmlRelationship(umlDirectedRelationship);
				if (result == null) result = caseUmlElement(umlDirectedRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.UML_RELATIONSHIP: {
				UmlRelationship umlRelationship = (UmlRelationship)theEObject;
				T result = caseUmlRelationship(umlRelationship);
				if (result == null) result = caseUmlElement(umlRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.TERM: {
				Term term = (Term)theEObject;
				T result = caseTerm(term);
				if (result == null) result = caseI18nNamedElement(term);
				if (result == null) result = caseUmlNamedElement(term);
				if (result == null) result = caseModelElement(term);
				if (result == null) result = caseTaggedElement(term);
				if (result == null) result = caseUmlElement(term);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.TERM_DEFINITION: {
				TermDefinition termDefinition = (TermDefinition)theEObject;
				T result = caseTermDefinition(termDefinition);
				if (result == null) result = caseI18nDescriptiveElement(termDefinition);
				if (result == null) result = caseI18nNamedElement(termDefinition);
				if (result == null) result = caseUmlNamedElement(termDefinition);
				if (result == null) result = caseModelElement(termDefinition);
				if (result == null) result = caseTaggedElement(termDefinition);
				if (result == null) result = caseUmlElement(termDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.BASE_PRACTISE: {
				BasePractise basePractise = (BasePractise)theEObject;
				T result = caseBasePractise(basePractise);
				if (result == null) result = caseSpiceElement(basePractise);
				if (result == null) result = caseRasciElement(basePractise);
				if (result == null) result = caseI18nDescriptiveElement(basePractise);
				if (result == null) result = caseI18nNamedElement(basePractise);
				if (result == null) result = caseUmlNamedElement(basePractise);
				if (result == null) result = caseModelElement(basePractise);
				if (result == null) result = caseTaggedElement(basePractise);
				if (result == null) result = caseUmlElement(basePractise);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.PROCESS: {
				QWiki.Process process = (QWiki.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = caseSpiceElement(process);
				if (result == null) result = caseRasciElement(process);
				if (result == null) result = caseI18nDescriptiveElement(process);
				if (result == null) result = caseI18nNamedElement(process);
				if (result == null) result = caseUmlNamedElement(process);
				if (result == null) result = caseModelElement(process);
				if (result == null) result = caseTaggedElement(process);
				if (result == null) result = caseUmlElement(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.PROCESS_GROUP: {
				ProcessGroup processGroup = (ProcessGroup)theEObject;
				T result = caseProcessGroup(processGroup);
				if (result == null) result = caseSpiceElement(processGroup);
				if (result == null) result = caseRasciElement(processGroup);
				if (result == null) result = caseI18nDescriptiveElement(processGroup);
				if (result == null) result = caseI18nNamedElement(processGroup);
				if (result == null) result = caseUmlNamedElement(processGroup);
				if (result == null) result = caseModelElement(processGroup);
				if (result == null) result = caseTaggedElement(processGroup);
				if (result == null) result = caseUmlElement(processGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.OUTCOME: {
				Outcome outcome = (Outcome)theEObject;
				T result = caseOutcome(outcome);
				if (result == null) result = caseI18nNamedElement(outcome);
				if (result == null) result = caseUmlNamedElement(outcome);
				if (result == null) result = caseModelElement(outcome);
				if (result == null) result = caseTaggedElement(outcome);
				if (result == null) result = caseUmlElement(outcome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.WORK_PRODUCT: {
				WorkProduct workProduct = (WorkProduct)theEObject;
				T result = caseWorkProduct(workProduct);
				if (result == null) result = caseSpiceElement(workProduct);
				if (result == null) result = caseRasciElement(workProduct);
				if (result == null) result = caseI18nDescriptiveElement(workProduct);
				if (result == null) result = caseI18nNamedElement(workProduct);
				if (result == null) result = caseUmlNamedElement(workProduct);
				if (result == null) result = caseModelElement(workProduct);
				if (result == null) result = caseTaggedElement(workProduct);
				if (result == null) result = caseUmlElement(workProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.GENERIC_WORK_PRODUCT: {
				GenericWorkProduct genericWorkProduct = (GenericWorkProduct)theEObject;
				T result = caseGenericWorkProduct(genericWorkProduct);
				if (result == null) result = caseWorkProduct(genericWorkProduct);
				if (result == null) result = caseSpiceElement(genericWorkProduct);
				if (result == null) result = caseRasciElement(genericWorkProduct);
				if (result == null) result = caseI18nDescriptiveElement(genericWorkProduct);
				if (result == null) result = caseI18nNamedElement(genericWorkProduct);
				if (result == null) result = caseUmlNamedElement(genericWorkProduct);
				if (result == null) result = caseModelElement(genericWorkProduct);
				if (result == null) result = caseTaggedElement(genericWorkProduct);
				if (result == null) result = caseUmlElement(genericWorkProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.DOMAIN: {
				Domain domain = (Domain)theEObject;
				T result = caseDomain(domain);
				if (result == null) result = caseI18nNamedElement(domain);
				if (result == null) result = caseUmlNamedElement(domain);
				if (result == null) result = caseModelElement(domain);
				if (result == null) result = caseTaggedElement(domain);
				if (result == null) result = caseUmlElement(domain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.DOMAIN_ELEMENT: {
				DomainElement domainElement = (DomainElement)theEObject;
				T result = caseDomainElement(domainElement);
				if (result == null) result = caseUmlNamedElement(domainElement);
				if (result == null) result = caseModelElement(domainElement);
				if (result == null) result = caseTaggedElement(domainElement);
				if (result == null) result = caseUmlElement(domainElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.DO_NOT_USE_RELATIONSHIP: {
				DO_NOT_USE_Relationship dO_NOT_USE_Relationship = (DO_NOT_USE_Relationship)theEObject;
				T result = caseDO_NOT_USE_Relationship(dO_NOT_USE_Relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.DO_NOT_USE_RELATIONSHIP_TYPE: {
				DO_NOT_USE_RelationshipType dO_NOT_USE_RelationshipType = (DO_NOT_USE_RelationshipType)theEObject;
				T result = caseDO_NOT_USE_RelationshipType(dO_NOT_USE_RelationshipType);
				if (result == null) result = caseI18nNamedElement(dO_NOT_USE_RelationshipType);
				if (result == null) result = caseUmlNamedElement(dO_NOT_USE_RelationshipType);
				if (result == null) result = caseModelElement(dO_NOT_USE_RelationshipType);
				if (result == null) result = caseTaggedElement(dO_NOT_USE_RelationshipType);
				if (result == null) result = caseUmlElement(dO_NOT_USE_RelationshipType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.UML_ASSOCIATION: {
				UmlAssociation umlAssociation = (UmlAssociation)theEObject;
				T result = caseUmlAssociation(umlAssociation);
				if (result == null) result = caseUmlRelationship(umlAssociation);
				if (result == null) result = caseUmlElement(umlAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Author</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Author</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthor(Author object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uml Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uml Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUmlNamedElement(UmlNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uml Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uml Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUmlElement(UmlElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uml Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uml Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUmlComment(UmlComment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tagged Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tagged Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaggedElement(TaggedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>I1 8n Keyed String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>I1 8n Keyed String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseI18nKeyedString(I18nKeyedString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>I1 8n Base String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>I1 8n Base String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseI18nBaseString(I18nBaseString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>I1 8n Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>I1 8n Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseI18nValue(I18nValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQWikiModel(QWikiModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uml Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uml Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUmlPackage(UmlPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uml Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uml Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUmlPackageableElement(UmlPackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uml Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uml Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUmlNamespace(UmlNamespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>I1 8n Descriptive Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>I1 8n Descriptive Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseI18nDescriptiveElement(I18nDescriptiveElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>I1 8n Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>I1 8n Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseI18nNamedElement(I18nNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>I1 8n String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>I1 8n String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseI18nString(I18nString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Version</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Version</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentVersion(DocumentVersion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spice Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spice Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpiceElement(SpiceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rasci Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rasci Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRasciElement(RasciElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Reference Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Reference Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessReferenceModel(ProcessReferenceModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Superseeding Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Superseeding Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuperseedingRelationship(SuperseedingRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uml Directed Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uml Directed Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUmlDirectedRelationship(UmlDirectedRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uml Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uml Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUmlRelationship(UmlRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerm(Term object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermDefinition(TermDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Practise</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Practise</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasePractise(BasePractise object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcess(QWiki.Process object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessGroup(ProcessGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outcome</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutcome(Outcome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkProduct(WorkProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Work Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Work Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericWorkProduct(GenericWorkProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomain(Domain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainElement(DomainElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DO NOT USE Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DO NOT USE Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDO_NOT_USE_Relationship(DO_NOT_USE_Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DO NOT USE Relationship Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DO NOT USE Relationship Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDO_NOT_USE_RelationshipType(DO_NOT_USE_RelationshipType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uml Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uml Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUmlAssociation(UmlAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //QWikiSwitch
