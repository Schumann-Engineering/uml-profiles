/**
 */
package QWiki.I18N.util;

import QWiki.I18N.*;

import QWiki.Infrastructure.UmlElement;
import QWiki.Infrastructure.UmlNamedElement;

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
 * @see QWiki.I18N.I18NPackage
 * @generated
 */
public class I18NSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static I18NPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I18NSwitch() {
		if (modelPackage == null) {
			modelPackage = I18NPackage.eINSTANCE;
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
			case I18NPackage.I1_8N_BASE_STRING: {
				I18nBaseString i18nBaseString = (I18nBaseString)theEObject;
				T result = caseI18nBaseString(i18nBaseString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case I18NPackage.I1_8N_VALUE: {
				I18nValue i18nValue = (I18nValue)theEObject;
				T result = caseI18nValue(i18nValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT: {
				I18nDescriptiveElement i18nDescriptiveElement = (I18nDescriptiveElement)theEObject;
				T result = caseI18nDescriptiveElement(i18nDescriptiveElement);
				if (result == null) result = caseI18nNamedElement(i18nDescriptiveElement);
				if (result == null) result = caseUmlNamedElement(i18nDescriptiveElement);
				if (result == null) result = caseModelElement(i18nDescriptiveElement);
				if (result == null) result = caseModelTaggedElement(i18nDescriptiveElement);
				if (result == null) result = caseUmlElement(i18nDescriptiveElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case I18NPackage.I1_8N_STRING: {
				I18nString i18nString = (I18nString)theEObject;
				T result = caseI18nString(i18nString);
				if (result == null) result = caseI18nBaseString(i18nString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case I18NPackage.I1_8N_KEYED_STRING: {
				I18nKeyedString i18nKeyedString = (I18nKeyedString)theEObject;
				T result = caseI18nKeyedString(i18nKeyedString);
				if (result == null) result = caseI18nBaseString(i18nKeyedString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case I18NPackage.I1_8N_NAMED_ELEMENT: {
				I18nNamedElement i18nNamedElement = (I18nNamedElement)theEObject;
				T result = caseI18nNamedElement(i18nNamedElement);
				if (result == null) result = caseUmlNamedElement(i18nNamedElement);
				if (result == null) result = caseModelElement(i18nNamedElement);
				if (result == null) result = caseModelTaggedElement(i18nNamedElement);
				if (result == null) result = caseUmlElement(i18nNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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

} //I18NSwitch
