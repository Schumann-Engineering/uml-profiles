/**
 */
package QWiki.util;

import QWiki.*;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Relationship;

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
			case QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT: {
				L10nDescriptiveElement l10nDescriptiveElement = (L10nDescriptiveElement)theEObject;
				T result = caseL10nDescriptiveElement(l10nDescriptiveElement);
				if (result == null) result = caseL10nNamedElement(l10nDescriptiveElement);
				if (result == null) result = caseQWikiNamedElement(l10nDescriptiveElement);
				if (result == null) result = caseNamedElement(l10nDescriptiveElement);
				if (result == null) result = caseQWikiElement(l10nDescriptiveElement);
				if (result == null) result = caseElement(l10nDescriptiveElement);
				if (result == null) result = caseEModelElement(l10nDescriptiveElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.L1_0N_NAMED_ELEMENT: {
				L10nNamedElement l10nNamedElement = (L10nNamedElement)theEObject;
				T result = caseL10nNamedElement(l10nNamedElement);
				if (result == null) result = caseQWikiNamedElement(l10nNamedElement);
				if (result == null) result = caseNamedElement(l10nNamedElement);
				if (result == null) result = caseQWikiElement(l10nNamedElement);
				if (result == null) result = caseElement(l10nNamedElement);
				if (result == null) result = caseEModelElement(l10nNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.QWIKI_NAMED_ELEMENT: {
				QWikiNamedElement qWikiNamedElement = (QWikiNamedElement)theEObject;
				T result = caseQWikiNamedElement(qWikiNamedElement);
				if (result == null) result = caseNamedElement(qWikiNamedElement);
				if (result == null) result = caseQWikiElement(qWikiNamedElement);
				if (result == null) result = caseElement(qWikiNamedElement);
				if (result == null) result = caseEModelElement(qWikiNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.QWIKI_ELEMENT: {
				QWikiElement qWikiElement = (QWikiElement)theEObject;
				T result = caseQWikiElement(qWikiElement);
				if (result == null) result = caseElement(qWikiElement);
				if (result == null) result = caseEModelElement(qWikiElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.L1_0N_KEYED_STRING: {
				L10nKeyedString l10nKeyedString = (L10nKeyedString)theEObject;
				T result = caseL10nKeyedString(l10nKeyedString);
				if (result == null) result = caseL10nBaseString(l10nKeyedString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.L1_0N_BASE_STRING: {
				L10nBaseString l10nBaseString = (L10nBaseString)theEObject;
				T result = caseL10nBaseString(l10nBaseString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.L1_0N_TEXT: {
				L10nText l10nText = (L10nText)theEObject;
				T result = caseL10nText(l10nText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.QWIKI_ENCRYPTION_KEY: {
				QWikiEncryptionKey qWikiEncryptionKey = (QWikiEncryptionKey)theEObject;
				T result = caseQWikiEncryptionKey(qWikiEncryptionKey);
				if (result == null) result = caseQWikiNamedElement(qWikiEncryptionKey);
				if (result == null) result = caseNamedElement(qWikiEncryptionKey);
				if (result == null) result = caseQWikiElement(qWikiEncryptionKey);
				if (result == null) result = caseElement(qWikiEncryptionKey);
				if (result == null) result = caseEModelElement(qWikiEncryptionKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.QWIKI_NAMESPACE: {
				QWikiNamespace qWikiNamespace = (QWikiNamespace)theEObject;
				T result = caseQWikiNamespace(qWikiNamespace);
				if (result == null) result = caseNamespace(qWikiNamespace);
				if (result == null) result = caseL10nNamedElement(qWikiNamespace);
				if (result == null) result = caseQWikiNamedElement(qWikiNamespace);
				if (result == null) result = caseNamedElement(qWikiNamespace);
				if (result == null) result = caseQWikiElement(qWikiNamespace);
				if (result == null) result = caseElement(qWikiNamespace);
				if (result == null) result = caseEModelElement(qWikiNamespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.QWIKI_MODEL: {
				QWikiModel qWikiModel = (QWikiModel)theEObject;
				T result = caseQWikiModel(qWikiModel);
				if (result == null) result = caseQWikiContainer(qWikiModel);
				if (result == null) result = caseQWikiNamespace(qWikiModel);
				if (result == null) result = caseL10nDescriptiveElement(qWikiModel);
				if (result == null) result = caseNamespace(qWikiModel);
				if (result == null) result = caseL10nNamedElement(qWikiModel);
				if (result == null) result = caseQWikiNamedElement(qWikiModel);
				if (result == null) result = caseNamedElement(qWikiModel);
				if (result == null) result = caseQWikiElement(qWikiModel);
				if (result == null) result = caseElement(qWikiModel);
				if (result == null) result = caseEModelElement(qWikiModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.QWIKI_CONTAINER: {
				QWikiContainer qWikiContainer = (QWikiContainer)theEObject;
				T result = caseQWikiContainer(qWikiContainer);
				if (result == null) result = caseQWikiNamespace(qWikiContainer);
				if (result == null) result = caseL10nDescriptiveElement(qWikiContainer);
				if (result == null) result = caseNamespace(qWikiContainer);
				if (result == null) result = caseL10nNamedElement(qWikiContainer);
				if (result == null) result = caseQWikiNamedElement(qWikiContainer);
				if (result == null) result = caseNamedElement(qWikiContainer);
				if (result == null) result = caseQWikiElement(qWikiContainer);
				if (result == null) result = caseElement(qWikiContainer);
				if (result == null) result = caseEModelElement(qWikiContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.L1_0N_STRING: {
				L10nString l10nString = (L10nString)theEObject;
				T result = caseL10nString(l10nString);
				if (result == null) result = caseL10nBaseString(l10nString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.QWIKI_RELATIONSHIP: {
				QWikiRelationship qWikiRelationship = (QWikiRelationship)theEObject;
				T result = caseQWikiRelationship(qWikiRelationship);
				if (result == null) result = caseDirectedRelationship(qWikiRelationship);
				if (result == null) result = caseQWikiElement(qWikiRelationship);
				if (result == null) result = caseRelationship(qWikiRelationship);
				if (result == null) result = caseElement(qWikiRelationship);
				if (result == null) result = caseEModelElement(qWikiRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.QWIKI_RELATIONSHIP_TYPE: {
				QWikiRelationshipType qWikiRelationshipType = (QWikiRelationshipType)theEObject;
				T result = caseQWikiRelationshipType(qWikiRelationshipType);
				if (result == null) result = caseQWikiNamedElement(qWikiRelationshipType);
				if (result == null) result = caseNamedElement(qWikiRelationshipType);
				if (result == null) result = caseQWikiElement(qWikiRelationshipType);
				if (result == null) result = caseElement(qWikiRelationshipType);
				if (result == null) result = caseEModelElement(qWikiRelationshipType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QWikiPackage.QWIKI_COMMENT: {
				QWikiComment qWikiComment = (QWikiComment)theEObject;
				T result = caseQWikiComment(qWikiComment);
				if (result == null) result = caseQWikiElement(qWikiComment);
				if (result == null) result = caseComment(qWikiComment);
				if (result == null) result = caseElement(qWikiComment);
				if (result == null) result = caseEModelElement(qWikiComment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>L1 0n Descriptive Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>L1 0n Descriptive Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseL10nDescriptiveElement(L10nDescriptiveElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>L1 0n Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>L1 0n Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseL10nNamedElement(L10nNamedElement object) {
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
	public T caseQWikiNamedElement(QWikiNamedElement object) {
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
	public T caseQWikiElement(QWikiElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>L1 0n Keyed String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>L1 0n Keyed String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseL10nKeyedString(L10nKeyedString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>L1 0n Base String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>L1 0n Base String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseL10nBaseString(L10nBaseString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>L1 0n Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>L1 0n Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseL10nText(L10nText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encryption Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encryption Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQWikiEncryptionKey(QWikiEncryptionKey object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQWikiContainer(QWikiContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQWikiNamespace(QWikiNamespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>L1 0n String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>L1 0n String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseL10nString(L10nString object) {
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
	public T caseQWikiRelationship(QWikiRelationship object) {
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
	public T caseQWikiRelationshipType(QWikiRelationshipType object) {
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
	public T caseQWikiComment(QWikiComment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEModelElement(EModelElement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
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
