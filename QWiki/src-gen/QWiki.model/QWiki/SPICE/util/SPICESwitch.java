/**
 */
package QWiki.Spice.util;

import QWiki.Kernel.I18nDescriptiveElement;
import QWiki.Kernel.I18nNamedElement;
import QWiki.Kernel.QWikiContainer;
import QWiki.Kernel.QWikiElement;
import QWiki.Kernel.QWikiNamedElement;
import QWiki.Kernel.QWikiNamespace;

import QWiki.Rasci.RasciElement;

import QWiki.Spice.BasePractise;
import QWiki.Spice.GenericWorkProduct;
import QWiki.Spice.Outcome;
import QWiki.Spice.ProcessGroup;
import QWiki.Spice.ProcessReferenceModel;
import QWiki.Spice.SPICEPackage;
import QWiki.Spice.SpiceElement;
import QWiki.Spice.WorkProduct;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;

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
 * @see QWiki.Spice.SPICEPackage
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
			case SPICEPackage.BASE_PRACTISE: {
				BasePractise basePractise = (BasePractise)theEObject;
				T result = caseBasePractise(basePractise);
				if (result == null) result = caseSpiceElement(basePractise);
				if (result == null) result = caseQWikiContainer(basePractise);
				if (result == null) result = caseRasciElement(basePractise);
				if (result == null) result = caseQWikiNamespace(basePractise);
				if (result == null) result = caseI18nDescriptiveElement(basePractise);
				if (result == null) result = caseNamespace(basePractise);
				if (result == null) result = caseI18nNamedElement(basePractise);
				if (result == null) result = caseQWikiNamedElement(basePractise);
				if (result == null) result = caseNamedElement(basePractise);
				if (result == null) result = caseQWikiElement(basePractise);
				if (result == null) result = caseElement(basePractise);
				if (result == null) result = caseEModelElement(basePractise);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SPICEPackage.SPICE_ELEMENT: {
				SpiceElement spiceElement = (SpiceElement)theEObject;
				T result = caseSpiceElement(spiceElement);
				if (result == null) result = caseQWikiContainer(spiceElement);
				if (result == null) result = caseRasciElement(spiceElement);
				if (result == null) result = caseQWikiNamespace(spiceElement);
				if (result == null) result = caseI18nDescriptiveElement(spiceElement);
				if (result == null) result = caseNamespace(spiceElement);
				if (result == null) result = caseI18nNamedElement(spiceElement);
				if (result == null) result = caseQWikiNamedElement(spiceElement);
				if (result == null) result = caseNamedElement(spiceElement);
				if (result == null) result = caseQWikiElement(spiceElement);
				if (result == null) result = caseElement(spiceElement);
				if (result == null) result = caseEModelElement(spiceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SPICEPackage.PROCESS_REFERENCE_MODEL: {
				ProcessReferenceModel processReferenceModel = (ProcessReferenceModel)theEObject;
				T result = caseProcessReferenceModel(processReferenceModel);
				if (result == null) result = caseQWikiContainer(processReferenceModel);
				if (result == null) result = caseQWikiNamespace(processReferenceModel);
				if (result == null) result = caseI18nDescriptiveElement(processReferenceModel);
				if (result == null) result = caseNamespace(processReferenceModel);
				if (result == null) result = caseI18nNamedElement(processReferenceModel);
				if (result == null) result = caseQWikiNamedElement(processReferenceModel);
				if (result == null) result = caseNamedElement(processReferenceModel);
				if (result == null) result = caseQWikiElement(processReferenceModel);
				if (result == null) result = caseElement(processReferenceModel);
				if (result == null) result = caseEModelElement(processReferenceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SPICEPackage.PROCESS: {
				QWiki.Spice.Process process = (QWiki.Spice.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = caseSpiceElement(process);
				if (result == null) result = caseQWikiContainer(process);
				if (result == null) result = caseRasciElement(process);
				if (result == null) result = caseQWikiNamespace(process);
				if (result == null) result = caseI18nDescriptiveElement(process);
				if (result == null) result = caseNamespace(process);
				if (result == null) result = caseI18nNamedElement(process);
				if (result == null) result = caseQWikiNamedElement(process);
				if (result == null) result = caseNamedElement(process);
				if (result == null) result = caseQWikiElement(process);
				if (result == null) result = caseElement(process);
				if (result == null) result = caseEModelElement(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SPICEPackage.PROCESS_GROUP: {
				ProcessGroup processGroup = (ProcessGroup)theEObject;
				T result = caseProcessGroup(processGroup);
				if (result == null) result = caseSpiceElement(processGroup);
				if (result == null) result = caseQWikiContainer(processGroup);
				if (result == null) result = caseRasciElement(processGroup);
				if (result == null) result = caseQWikiNamespace(processGroup);
				if (result == null) result = caseI18nDescriptiveElement(processGroup);
				if (result == null) result = caseNamespace(processGroup);
				if (result == null) result = caseI18nNamedElement(processGroup);
				if (result == null) result = caseQWikiNamedElement(processGroup);
				if (result == null) result = caseNamedElement(processGroup);
				if (result == null) result = caseQWikiElement(processGroup);
				if (result == null) result = caseElement(processGroup);
				if (result == null) result = caseEModelElement(processGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SPICEPackage.OUTCOME: {
				Outcome outcome = (Outcome)theEObject;
				T result = caseOutcome(outcome);
				if (result == null) result = caseI18nNamedElement(outcome);
				if (result == null) result = caseQWikiNamedElement(outcome);
				if (result == null) result = caseNamedElement(outcome);
				if (result == null) result = caseQWikiElement(outcome);
				if (result == null) result = caseElement(outcome);
				if (result == null) result = caseEModelElement(outcome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SPICEPackage.WORK_PRODUCT: {
				WorkProduct workProduct = (WorkProduct)theEObject;
				T result = caseWorkProduct(workProduct);
				if (result == null) result = caseSpiceElement(workProduct);
				if (result == null) result = caseQWikiContainer(workProduct);
				if (result == null) result = caseRasciElement(workProduct);
				if (result == null) result = caseQWikiNamespace(workProduct);
				if (result == null) result = caseI18nDescriptiveElement(workProduct);
				if (result == null) result = caseNamespace(workProduct);
				if (result == null) result = caseI18nNamedElement(workProduct);
				if (result == null) result = caseQWikiNamedElement(workProduct);
				if (result == null) result = caseNamedElement(workProduct);
				if (result == null) result = caseQWikiElement(workProduct);
				if (result == null) result = caseElement(workProduct);
				if (result == null) result = caseEModelElement(workProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SPICEPackage.GENERIC_WORK_PRODUCT: {
				GenericWorkProduct genericWorkProduct = (GenericWorkProduct)theEObject;
				T result = caseGenericWorkProduct(genericWorkProduct);
				if (result == null) result = caseWorkProduct(genericWorkProduct);
				if (result == null) result = caseSpiceElement(genericWorkProduct);
				if (result == null) result = caseQWikiContainer(genericWorkProduct);
				if (result == null) result = caseRasciElement(genericWorkProduct);
				if (result == null) result = caseQWikiNamespace(genericWorkProduct);
				if (result == null) result = caseI18nDescriptiveElement(genericWorkProduct);
				if (result == null) result = caseNamespace(genericWorkProduct);
				if (result == null) result = caseI18nNamedElement(genericWorkProduct);
				if (result == null) result = caseQWikiNamedElement(genericWorkProduct);
				if (result == null) result = caseNamedElement(genericWorkProduct);
				if (result == null) result = caseQWikiElement(genericWorkProduct);
				if (result == null) result = caseElement(genericWorkProduct);
				if (result == null) result = caseEModelElement(genericWorkProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	public T caseProcess(QWiki.Spice.Process object) {
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
