/**
 */
package QWiki.SPICE.util;

import QWiki.I18N.I18nDescriptiveElement;
import QWiki.I18N.I18nNamedElement;

import QWiki.Infrastructure.UmlElement;
import QWiki.Infrastructure.UmlNamedElement;

import QWiki.Kernel.ModelElement;
import QWiki.Kernel.ModelTaggedElement;

import QWiki.RASCI.RasciElement;

import QWiki.SPICE.GenericWorkProduct;
import QWiki.SPICE.Outcome;
import QWiki.SPICE.ProcessGroup;
import QWiki.SPICE.ProcessReferenceModel;
import QWiki.SPICE.SPICEPackage;
import QWiki.SPICE.SpiceBasePractise;
import QWiki.SPICE.SpiceElement;
import QWiki.SPICE.WorkProduct;

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
 * @see QWiki.SPICE.SPICEPackage
 * @generated
 */
public class SPICESwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SPICEPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPICESwitch() {
		if (modelPackage == null) {
			modelPackage = SPICEPackage.eINSTANCE;
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
			case SPICEPackage.SPICE_BASE_PRACTISE: {
				SpiceBasePractise spiceBasePractise = (SpiceBasePractise)theEObject;
				T result = caseSpiceBasePractise(spiceBasePractise);
				if (result == null) result = caseSpiceElement(spiceBasePractise);
				if (result == null) result = caseRasciElement(spiceBasePractise);
				if (result == null) result = caseI18nDescriptiveElement(spiceBasePractise);
				if (result == null) result = caseI18nNamedElement(spiceBasePractise);
				if (result == null) result = caseUmlNamedElement(spiceBasePractise);
				if (result == null) result = caseModelElement(spiceBasePractise);
				if (result == null) result = caseModelTaggedElement(spiceBasePractise);
				if (result == null) result = caseUmlElement(spiceBasePractise);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SPICEPackage.SPICE_ELEMENT: {
				SpiceElement spiceElement = (SpiceElement)theEObject;
				T result = caseSpiceElement(spiceElement);
				if (result == null) result = caseRasciElement(spiceElement);
				if (result == null) result = caseI18nDescriptiveElement(spiceElement);
				if (result == null) result = caseI18nNamedElement(spiceElement);
				if (result == null) result = caseUmlNamedElement(spiceElement);
				if (result == null) result = caseModelElement(spiceElement);
				if (result == null) result = caseModelTaggedElement(spiceElement);
				if (result == null) result = caseUmlElement(spiceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SPICEPackage.PROCESS_REFERENCE_MODEL: {
				ProcessReferenceModel processReferenceModel = (ProcessReferenceModel)theEObject;
				T result = caseProcessReferenceModel(processReferenceModel);
				if (result == null) result = caseI18nDescriptiveElement(processReferenceModel);
				if (result == null) result = caseI18nNamedElement(processReferenceModel);
				if (result == null) result = caseUmlNamedElement(processReferenceModel);
				if (result == null) result = caseModelElement(processReferenceModel);
				if (result == null) result = caseModelTaggedElement(processReferenceModel);
				if (result == null) result = caseUmlElement(processReferenceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SPICEPackage.PROCESS: {
				QWiki.SPICE.Process process = (QWiki.SPICE.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = caseSpiceElement(process);
				if (result == null) result = caseRasciElement(process);
				if (result == null) result = caseI18nDescriptiveElement(process);
				if (result == null) result = caseI18nNamedElement(process);
				if (result == null) result = caseUmlNamedElement(process);
				if (result == null) result = caseModelElement(process);
				if (result == null) result = caseModelTaggedElement(process);
				if (result == null) result = caseUmlElement(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SPICEPackage.PROCESS_GROUP: {
				ProcessGroup processGroup = (ProcessGroup)theEObject;
				T result = caseProcessGroup(processGroup);
				if (result == null) result = caseSpiceElement(processGroup);
				if (result == null) result = caseRasciElement(processGroup);
				if (result == null) result = caseI18nDescriptiveElement(processGroup);
				if (result == null) result = caseI18nNamedElement(processGroup);
				if (result == null) result = caseUmlNamedElement(processGroup);
				if (result == null) result = caseModelElement(processGroup);
				if (result == null) result = caseModelTaggedElement(processGroup);
				if (result == null) result = caseUmlElement(processGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SPICEPackage.OUTCOME: {
				Outcome outcome = (Outcome)theEObject;
				T result = caseOutcome(outcome);
				if (result == null) result = caseI18nNamedElement(outcome);
				if (result == null) result = caseUmlNamedElement(outcome);
				if (result == null) result = caseModelElement(outcome);
				if (result == null) result = caseModelTaggedElement(outcome);
				if (result == null) result = caseUmlElement(outcome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SPICEPackage.WORK_PRODUCT: {
				WorkProduct workProduct = (WorkProduct)theEObject;
				T result = caseWorkProduct(workProduct);
				if (result == null) result = caseSpiceElement(workProduct);
				if (result == null) result = caseRasciElement(workProduct);
				if (result == null) result = caseI18nDescriptiveElement(workProduct);
				if (result == null) result = caseI18nNamedElement(workProduct);
				if (result == null) result = caseUmlNamedElement(workProduct);
				if (result == null) result = caseModelElement(workProduct);
				if (result == null) result = caseModelTaggedElement(workProduct);
				if (result == null) result = caseUmlElement(workProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SPICEPackage.GENERIC_WORK_PRODUCT: {
				GenericWorkProduct genericWorkProduct = (GenericWorkProduct)theEObject;
				T result = caseGenericWorkProduct(genericWorkProduct);
				if (result == null) result = caseWorkProduct(genericWorkProduct);
				if (result == null) result = caseSpiceElement(genericWorkProduct);
				if (result == null) result = caseRasciElement(genericWorkProduct);
				if (result == null) result = caseI18nDescriptiveElement(genericWorkProduct);
				if (result == null) result = caseI18nNamedElement(genericWorkProduct);
				if (result == null) result = caseUmlNamedElement(genericWorkProduct);
				if (result == null) result = caseModelElement(genericWorkProduct);
				if (result == null) result = caseModelTaggedElement(genericWorkProduct);
				if (result == null) result = caseUmlElement(genericWorkProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spice Base Practise</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spice Base Practise</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpiceBasePractise(SpiceBasePractise object) {
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
	public T caseProcess(QWiki.SPICE.Process object) {
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

} //SPICESwitch
