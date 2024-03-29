/**
 */
package QWiki.Infrastructure.util;

import QWiki.I18N.I18nDescriptiveElement;
import QWiki.I18N.I18nNamedElement;

import QWiki.Infrastructure.*;

import QWiki.Kernel.ModelElement;
import QWiki.Kernel.ModelTaggedElement;

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
 * @see QWiki.Infrastructure.InfrastructurePackage
 * @generated
 */
public class InfrastructureSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InfrastructurePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureSwitch() {
		if (modelPackage == null) {
			modelPackage = InfrastructurePackage.eINSTANCE;
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
			case InfrastructurePackage.UML_ASSOCIATION: {
				UmlAssociation umlAssociation = (UmlAssociation)theEObject;
				T result = caseUmlAssociation(umlAssociation);
				if (result == null) result = caseUmlRelationship(umlAssociation);
				if (result == null) result = caseUmlElement(umlAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.UML_RELATIONSHIP: {
				UmlRelationship umlRelationship = (UmlRelationship)theEObject;
				T result = caseUmlRelationship(umlRelationship);
				if (result == null) result = caseUmlElement(umlRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.UML_ELEMENT: {
				UmlElement umlElement = (UmlElement)theEObject;
				T result = caseUmlElement(umlElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.UML_COMMENT: {
				UmlComment umlComment = (UmlComment)theEObject;
				T result = caseUmlComment(umlComment);
				if (result == null) result = caseUmlElement(umlComment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.UML_DIRECTED_RELATIONSHIP: {
				UmlDirectedRelationship umlDirectedRelationship = (UmlDirectedRelationship)theEObject;
				T result = caseUmlDirectedRelationship(umlDirectedRelationship);
				if (result == null) result = caseUmlRelationship(umlDirectedRelationship);
				if (result == null) result = caseUmlElement(umlDirectedRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.UML_NAMED_ELEMENT: {
				UmlNamedElement umlNamedElement = (UmlNamedElement)theEObject;
				T result = caseUmlNamedElement(umlNamedElement);
				if (result == null) result = caseModelElement(umlNamedElement);
				if (result == null) result = caseModelTaggedElement(umlNamedElement);
				if (result == null) result = caseUmlElement(umlNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.UML_PACKAGE: {
				UmlPackage umlPackage = (UmlPackage)theEObject;
				T result = caseUmlPackage(umlPackage);
				if (result == null) result = caseUmlNamespace(umlPackage);
				if (result == null) result = caseUmlPackageableElement(umlPackage);
				if (result == null) result = caseI18nDescriptiveElement(umlPackage);
				if (result == null) result = caseI18nNamedElement(umlPackage);
				if (result == null) result = caseUmlNamedElement(umlPackage);
				if (result == null) result = caseModelElement(umlPackage);
				if (result == null) result = caseModelTaggedElement(umlPackage);
				if (result == null) result = caseUmlElement(umlPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.UML_PACKAGEABLE_ELEMENT: {
				UmlPackageableElement umlPackageableElement = (UmlPackageableElement)theEObject;
				T result = caseUmlPackageableElement(umlPackageableElement);
				if (result == null) result = caseUmlNamedElement(umlPackageableElement);
				if (result == null) result = caseModelElement(umlPackageableElement);
				if (result == null) result = caseModelTaggedElement(umlPackageableElement);
				if (result == null) result = caseUmlElement(umlPackageableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InfrastructurePackage.UML_NAMESPACE: {
				UmlNamespace umlNamespace = (UmlNamespace)theEObject;
				T result = caseUmlNamespace(umlNamespace);
				if (result == null) result = caseI18nDescriptiveElement(umlNamespace);
				if (result == null) result = caseI18nNamedElement(umlNamespace);
				if (result == null) result = caseUmlNamedElement(umlNamespace);
				if (result == null) result = caseModelElement(umlNamespace);
				if (result == null) result = caseModelTaggedElement(umlNamespace);
				if (result == null) result = caseUmlElement(umlNamespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Model Tagged Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Tagged Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelTaggedElement(ModelTaggedElement object) {
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

} //InfrastructureSwitch
