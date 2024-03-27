/**
 */
package QWiki.util;

import QWiki.Association;
import QWiki.Author;
import QWiki.BasePractise;
import QWiki.Comment;
import QWiki.DirectedRelationship;
import QWiki.Document;
import QWiki.DocumentVersion;
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
import QWiki.TaggedElement;
import QWiki.Term;
import QWiki.TermDefinition;
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
				if (result == null) result = caseNamedElement(author);
				if (result == null) result = caseTaggedElement(author);
				if (result == null) result = caseElement(author);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = caseTaggedElement(namedElement);
				if (result == null) result = caseElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.TAGGED_ELEMENT: {
				TaggedElement taggedElement = (TaggedElement)theEObject;
				T result = caseTaggedElement(taggedElement);
				if (result == null) result = caseElement(taggedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.COMMENT: {
				Comment comment = (Comment)theEObject;
				T result = caseComment(comment);
				if (result == null) result = caseElement(comment);
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
				if (result == null) result = caseElement(qWikiModel);
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
			case QWikiPackage.DOMAIN: {
				Domain domain = (Domain)theEObject;
				T result = caseDomain(domain);
				if (result == null) result = caseI18nNamedElement(domain);
				if (result == null) result = caseNamedElement(domain);
				if (result == null) result = caseTaggedElement(domain);
				if (result == null) result = caseElement(domain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.I1_8N_NAMED_ELEMENT: {
				I18nNamedElement i18nNamedElement = (I18nNamedElement)theEObject;
				T result = caseI18nNamedElement(i18nNamedElement);
				if (result == null) result = caseNamedElement(i18nNamedElement);
				if (result == null) result = caseTaggedElement(i18nNamedElement);
				if (result == null) result = caseElement(i18nNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.DOCUMENT: {
				Document document = (Document)theEObject;
				T result = caseDocument(document);
				if (result == null) result = caseI18nDescriptiveElement(document);
				if (result == null) result = caseI18nNamedElement(document);
				if (result == null) result = caseNamedElement(document);
				if (result == null) result = caseTaggedElement(document);
				if (result == null) result = caseElement(document);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.I1_8N_DESCRIPTIVE_ELEMENT: {
				I18nDescriptiveElement i18nDescriptiveElement = (I18nDescriptiveElement)theEObject;
				T result = caseI18nDescriptiveElement(i18nDescriptiveElement);
				if (result == null) result = caseI18nNamedElement(i18nDescriptiveElement);
				if (result == null) result = caseNamedElement(i18nDescriptiveElement);
				if (result == null) result = caseTaggedElement(i18nDescriptiveElement);
				if (result == null) result = caseElement(i18nDescriptiveElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.DOCUMENT_VERSION: {
				DocumentVersion documentVersion = (DocumentVersion)theEObject;
				T result = caseDocumentVersion(documentVersion);
				if (result == null) result = caseElement(documentVersion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.SECTION: {
				Section section = (Section)theEObject;
				T result = caseSection(section);
				if (result == null) result = caseI18nDescriptiveElement(section);
				if (result == null) result = caseI18nNamedElement(section);
				if (result == null) result = caseNamedElement(section);
				if (result == null) result = caseTaggedElement(section);
				if (result == null) result = caseElement(section);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.SPICE_ELEMENT: {
				SpiceElement spiceElement = (SpiceElement)theEObject;
				T result = caseSpiceElement(spiceElement);
				if (result == null) result = caseRasciElement(spiceElement);
				if (result == null) result = caseI18nDescriptiveElement(spiceElement);
				if (result == null) result = caseI18nNamedElement(spiceElement);
				if (result == null) result = caseNamedElement(spiceElement);
				if (result == null) result = caseTaggedElement(spiceElement);
				if (result == null) result = caseElement(spiceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.RASCI_ELEMENT: {
				RasciElement rasciElement = (RasciElement)theEObject;
				T result = caseRasciElement(rasciElement);
				if (result == null) result = caseI18nDescriptiveElement(rasciElement);
				if (result == null) result = caseI18nNamedElement(rasciElement);
				if (result == null) result = caseNamedElement(rasciElement);
				if (result == null) result = caseTaggedElement(rasciElement);
				if (result == null) result = caseElement(rasciElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.ROLE: {
				Role role = (Role)theEObject;
				T result = caseRole(role);
				if (result == null) result = caseI18nDescriptiveElement(role);
				if (result == null) result = caseI18nNamedElement(role);
				if (result == null) result = caseNamedElement(role);
				if (result == null) result = caseTaggedElement(role);
				if (result == null) result = caseElement(role);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.PROCESS_REFERENCE_MODEL: {
				ProcessReferenceModel processReferenceModel = (ProcessReferenceModel)theEObject;
				T result = caseProcessReferenceModel(processReferenceModel);
				if (result == null) result = caseI18nDescriptiveElement(processReferenceModel);
				if (result == null) result = caseI18nNamedElement(processReferenceModel);
				if (result == null) result = caseNamedElement(processReferenceModel);
				if (result == null) result = caseTaggedElement(processReferenceModel);
				if (result == null) result = caseElement(processReferenceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.SUPERSEEDING_RELATIONSHIP: {
				SuperseedingRelationship superseedingRelationship = (SuperseedingRelationship)theEObject;
				T result = caseSuperseedingRelationship(superseedingRelationship);
				if (result == null) result = caseDirectedRelationship(superseedingRelationship);
				if (result == null) result = caseRelationship(superseedingRelationship);
				if (result == null) result = caseElement(superseedingRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.DIRECTED_RELATIONSHIP: {
				DirectedRelationship directedRelationship = (DirectedRelationship)theEObject;
				T result = caseDirectedRelationship(directedRelationship);
				if (result == null) result = caseRelationship(directedRelationship);
				if (result == null) result = caseElement(directedRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.RELATIONSHIP: {
				Relationship relationship = (Relationship)theEObject;
				T result = caseRelationship(relationship);
				if (result == null) result = caseElement(relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.TERM: {
				Term term = (Term)theEObject;
				T result = caseTerm(term);
				if (result == null) result = caseI18nNamedElement(term);
				if (result == null) result = caseNamedElement(term);
				if (result == null) result = caseTaggedElement(term);
				if (result == null) result = caseElement(term);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.TERM_DEFINITION: {
				TermDefinition termDefinition = (TermDefinition)theEObject;
				T result = caseTermDefinition(termDefinition);
				if (result == null) result = caseI18nDescriptiveElement(termDefinition);
				if (result == null) result = caseI18nNamedElement(termDefinition);
				if (result == null) result = caseNamedElement(termDefinition);
				if (result == null) result = caseTaggedElement(termDefinition);
				if (result == null) result = caseElement(termDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.STANDARD: {
				Standard standard = (Standard)theEObject;
				T result = caseStandard(standard);
				if (result == null) result = caseDocument(standard);
				if (result == null) result = caseI18nDescriptiveElement(standard);
				if (result == null) result = caseI18nNamedElement(standard);
				if (result == null) result = caseNamedElement(standard);
				if (result == null) result = caseTaggedElement(standard);
				if (result == null) result = caseElement(standard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				T result = caseAssociation(association);
				if (result == null) result = caseRelationship(association);
				if (result == null) result = caseElement(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.RELATIONSHIP_TYPE: {
				RelationshipType relationshipType = (RelationshipType)theEObject;
				T result = caseRelationshipType(relationshipType);
				if (result == null) result = caseI18nNamedElement(relationshipType);
				if (result == null) result = caseNamedElement(relationshipType);
				if (result == null) result = caseTaggedElement(relationshipType);
				if (result == null) result = caseElement(relationshipType);
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
				if (result == null) result = caseNamedElement(basePractise);
				if (result == null) result = caseTaggedElement(basePractise);
				if (result == null) result = caseElement(basePractise);
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
				if (result == null) result = caseNamedElement(process);
				if (result == null) result = caseTaggedElement(process);
				if (result == null) result = caseElement(process);
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
				if (result == null) result = caseNamedElement(processGroup);
				if (result == null) result = caseTaggedElement(processGroup);
				if (result == null) result = caseElement(processGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.OUTCOME: {
				Outcome outcome = (Outcome)theEObject;
				T result = caseOutcome(outcome);
				if (result == null) result = caseI18nNamedElement(outcome);
				if (result == null) result = caseNamedElement(outcome);
				if (result == null) result = caseTaggedElement(outcome);
				if (result == null) result = caseElement(outcome);
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
				if (result == null) result = caseNamedElement(workProduct);
				if (result == null) result = caseTaggedElement(workProduct);
				if (result == null) result = caseElement(workProduct);
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
				if (result == null) result = caseNamedElement(genericWorkProduct);
				if (result == null) result = caseTaggedElement(genericWorkProduct);
				if (result == null) result = caseElement(genericWorkProduct);
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
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Directed Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directed Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectedRelationship(DirectedRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipType(RelationshipType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Standard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandard(Standard object) {
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
