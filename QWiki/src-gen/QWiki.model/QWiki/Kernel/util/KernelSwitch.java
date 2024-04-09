/**
 */
package QWiki.Kernel.util;

import QWiki.Kernel.*;

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
 * @see QWiki.Kernel.KernelPackage
 * @generated
 */
public class KernelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KernelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KernelSwitch() {
		if (modelPackage == null) {
			modelPackage = KernelPackage.eINSTANCE;
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
			case KernelPackage.I1_8N_NAMED_ELEMENT: {
				I18nNamedElement i18nNamedElement = (I18nNamedElement)theEObject;
				T result = caseI18nNamedElement(i18nNamedElement);
				if (result == null) result = caseQWikiNamedElement(i18nNamedElement);
				if (result == null) result = caseNamedElement(i18nNamedElement);
				if (result == null) result = caseQWikiElement(i18nNamedElement);
				if (result == null) result = caseElement(i18nNamedElement);
				if (result == null) result = caseEModelElement(i18nNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.QWIKI_NAMED_ELEMENT: {
				QWikiNamedElement qWikiNamedElement = (QWikiNamedElement)theEObject;
				T result = caseQWikiNamedElement(qWikiNamedElement);
				if (result == null) result = caseNamedElement(qWikiNamedElement);
				if (result == null) result = caseQWikiElement(qWikiNamedElement);
				if (result == null) result = caseElement(qWikiNamedElement);
				if (result == null) result = caseEModelElement(qWikiNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.QWIKI_ELEMENT: {
				QWikiElement qWikiElement = (QWikiElement)theEObject;
				T result = caseQWikiElement(qWikiElement);
				if (result == null) result = caseElement(qWikiElement);
				if (result == null) result = caseEModelElement(qWikiElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.I1_8N_KEYED_STRING: {
				I18nKeyedString i18nKeyedString = (I18nKeyedString)theEObject;
				T result = caseI18nKeyedString(i18nKeyedString);
				if (result == null) result = caseI18nBaseString(i18nKeyedString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.I1_8N_BASE_STRING: {
				I18nBaseString i18nBaseString = (I18nBaseString)theEObject;
				T result = caseI18nBaseString(i18nBaseString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.I1_8N_VALUE: {
				I18nValue i18nValue = (I18nValue)theEObject;
				T result = caseI18nValue(i18nValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.I1_8N_STRING: {
				I18nString i18nString = (I18nString)theEObject;
				T result = caseI18nString(i18nString);
				if (result == null) result = caseI18nBaseString(i18nString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.QWIKI_COMMENT: {
				QWikiComment qWikiComment = (QWikiComment)theEObject;
				T result = caseQWikiComment(qWikiComment);
				if (result == null) result = caseQWikiElement(qWikiComment);
				if (result == null) result = caseComment(qWikiComment);
				if (result == null) result = caseElement(qWikiComment);
				if (result == null) result = caseEModelElement(qWikiComment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.I1_8N_DESCRIPTIVE_ELEMENT: {
				I18nDescriptiveElement i18nDescriptiveElement = (I18nDescriptiveElement)theEObject;
				T result = caseI18nDescriptiveElement(i18nDescriptiveElement);
				if (result == null) result = caseI18nNamedElement(i18nDescriptiveElement);
				if (result == null) result = caseQWikiNamedElement(i18nDescriptiveElement);
				if (result == null) result = caseNamedElement(i18nDescriptiveElement);
				if (result == null) result = caseQWikiElement(i18nDescriptiveElement);
				if (result == null) result = caseElement(i18nDescriptiveElement);
				if (result == null) result = caseEModelElement(i18nDescriptiveElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.QWIKI_NAMESPACE: {
				QWikiNamespace qWikiNamespace = (QWikiNamespace)theEObject;
				T result = caseQWikiNamespace(qWikiNamespace);
				if (result == null) result = caseNamespace(qWikiNamespace);
				if (result == null) result = caseI18nNamedElement(qWikiNamespace);
				if (result == null) result = caseQWikiNamedElement(qWikiNamespace);
				if (result == null) result = caseNamedElement(qWikiNamespace);
				if (result == null) result = caseQWikiElement(qWikiNamespace);
				if (result == null) result = caseElement(qWikiNamespace);
				if (result == null) result = caseEModelElement(qWikiNamespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.QWIKI_CONTAINER: {
				QWikiContainer qWikiContainer = (QWikiContainer)theEObject;
				T result = caseQWikiContainer(qWikiContainer);
				if (result == null) result = caseQWikiNamespace(qWikiContainer);
				if (result == null) result = caseI18nDescriptiveElement(qWikiContainer);
				if (result == null) result = caseNamespace(qWikiContainer);
				if (result == null) result = caseI18nNamedElement(qWikiContainer);
				if (result == null) result = caseQWikiNamedElement(qWikiContainer);
				if (result == null) result = caseNamedElement(qWikiContainer);
				if (result == null) result = caseQWikiElement(qWikiContainer);
				if (result == null) result = caseElement(qWikiContainer);
				if (result == null) result = caseEModelElement(qWikiContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.QWIKI_RELATIONSHIP: {
				QWikiRelationship qWikiRelationship = (QWikiRelationship)theEObject;
				T result = caseQWikiRelationship(qWikiRelationship);
				if (result == null) result = caseDirectedRelationship(qWikiRelationship);
				if (result == null) result = caseRelationship(qWikiRelationship);
				if (result == null) result = caseElement(qWikiRelationship);
				if (result == null) result = caseEModelElement(qWikiRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case KernelPackage.QWIKI_RELATIONSHIP_TYPE: {
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
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>QWiki Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QWiki Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQWikiNamedElement(QWikiNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QWiki Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QWiki Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQWikiElement(QWikiElement object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>QWiki Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QWiki Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQWikiComment(QWikiComment object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>QWiki Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QWiki Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQWikiNamespace(QWikiNamespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QWiki Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QWiki Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQWikiContainer(QWikiContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QWiki Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QWiki Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQWikiRelationship(QWikiRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QWiki Relationship Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QWiki Relationship Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQWikiRelationshipType(QWikiRelationshipType object) {
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

} //KernelSwitch
