/**
 */
package QWiki.Spice.util;

import QWiki.L10nDescriptiveElement;
import QWiki.L10nNamedElement;
import QWiki.QWikiContainer;
import QWiki.QWikiElement;
import QWiki.QWikiNamedElement;
import QWiki.QWikiNamespace;
import QWiki.QWikiRelationship;
import QWiki.QWikiRelationshipType;

import QWiki.Rasci.RasciElement;

import QWiki.Spice.BasePractise;
import QWiki.Spice.GenericWorkProduct;
import QWiki.Spice.Outcome;
import QWiki.Spice.ProcessGroup;
import QWiki.Spice.ProcessReferenceModel;
import QWiki.Spice.SpiceElement;
import QWiki.Spice.SpicePackage;
import QWiki.Spice.WorkProduct;
import QWiki.Spice.WorkProductRelationship;
import QWiki.Spice.WorkProductRelationshipType;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see QWiki.Spice.SpicePackage
 * @generated
 */
public class SpiceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpicePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpiceSwitch() {
		if (modelPackage == null) {
			modelPackage = SpicePackage.eINSTANCE;
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
			case SpicePackage.BASE_PRACTISE: {
				BasePractise basePractise = (BasePractise)theEObject;
				T result = caseBasePractise(basePractise);
				if (result == null) result = caseSpiceElement(basePractise);
				if (result == null) result = caseQWikiContainer(basePractise);
				if (result == null) result = caseRasciElement(basePractise);
				if (result == null) result = caseQWikiNamespace(basePractise);
				if (result == null) result = caseL10nDescriptiveElement(basePractise);
				if (result == null) result = caseNamespace(basePractise);
				if (result == null) result = caseL10nNamedElement(basePractise);
				if (result == null) result = caseQWikiNamedElement(basePractise);
				if (result == null) result = caseNamedElement(basePractise);
				if (result == null) result = caseQWikiElement(basePractise);
				if (result == null) result = caseElement(basePractise);
				if (result == null) result = caseEModelElement(basePractise);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpicePackage.SPICE_ELEMENT: {
				SpiceElement spiceElement = (SpiceElement)theEObject;
				T result = caseSpiceElement(spiceElement);
				if (result == null) result = caseQWikiContainer(spiceElement);
				if (result == null) result = caseRasciElement(spiceElement);
				if (result == null) result = caseQWikiNamespace(spiceElement);
				if (result == null) result = caseL10nDescriptiveElement(spiceElement);
				if (result == null) result = caseNamespace(spiceElement);
				if (result == null) result = caseL10nNamedElement(spiceElement);
				if (result == null) result = caseQWikiNamedElement(spiceElement);
				if (result == null) result = caseNamedElement(spiceElement);
				if (result == null) result = caseQWikiElement(spiceElement);
				if (result == null) result = caseElement(spiceElement);
				if (result == null) result = caseEModelElement(spiceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpicePackage.PROCESS_REFERENCE_MODEL: {
				ProcessReferenceModel processReferenceModel = (ProcessReferenceModel)theEObject;
				T result = caseProcessReferenceModel(processReferenceModel);
				if (result == null) result = caseQWikiContainer(processReferenceModel);
				if (result == null) result = caseQWikiNamespace(processReferenceModel);
				if (result == null) result = caseL10nDescriptiveElement(processReferenceModel);
				if (result == null) result = caseNamespace(processReferenceModel);
				if (result == null) result = caseL10nNamedElement(processReferenceModel);
				if (result == null) result = caseQWikiNamedElement(processReferenceModel);
				if (result == null) result = caseNamedElement(processReferenceModel);
				if (result == null) result = caseQWikiElement(processReferenceModel);
				if (result == null) result = caseElement(processReferenceModel);
				if (result == null) result = caseEModelElement(processReferenceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpicePackage.PROCESS: {
				QWiki.Spice.Process process = (QWiki.Spice.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = caseSpiceElement(process);
				if (result == null) result = caseQWikiContainer(process);
				if (result == null) result = caseRasciElement(process);
				if (result == null) result = caseQWikiNamespace(process);
				if (result == null) result = caseL10nDescriptiveElement(process);
				if (result == null) result = caseNamespace(process);
				if (result == null) result = caseL10nNamedElement(process);
				if (result == null) result = caseQWikiNamedElement(process);
				if (result == null) result = caseNamedElement(process);
				if (result == null) result = caseQWikiElement(process);
				if (result == null) result = caseElement(process);
				if (result == null) result = caseEModelElement(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpicePackage.PROCESS_GROUP: {
				ProcessGroup processGroup = (ProcessGroup)theEObject;
				T result = caseProcessGroup(processGroup);
				if (result == null) result = caseSpiceElement(processGroup);
				if (result == null) result = caseQWikiContainer(processGroup);
				if (result == null) result = caseRasciElement(processGroup);
				if (result == null) result = caseQWikiNamespace(processGroup);
				if (result == null) result = caseL10nDescriptiveElement(processGroup);
				if (result == null) result = caseNamespace(processGroup);
				if (result == null) result = caseL10nNamedElement(processGroup);
				if (result == null) result = caseQWikiNamedElement(processGroup);
				if (result == null) result = caseNamedElement(processGroup);
				if (result == null) result = caseQWikiElement(processGroup);
				if (result == null) result = caseElement(processGroup);
				if (result == null) result = caseEModelElement(processGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpicePackage.OUTCOME: {
				Outcome outcome = (Outcome)theEObject;
				T result = caseOutcome(outcome);
				if (result == null) result = caseL10nNamedElement(outcome);
				if (result == null) result = caseQWikiNamedElement(outcome);
				if (result == null) result = caseNamedElement(outcome);
				if (result == null) result = caseQWikiElement(outcome);
				if (result == null) result = caseElement(outcome);
				if (result == null) result = caseEModelElement(outcome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpicePackage.WORK_PRODUCT: {
				WorkProduct workProduct = (WorkProduct)theEObject;
				T result = caseWorkProduct(workProduct);
				if (result == null) result = caseSpiceElement(workProduct);
				if (result == null) result = caseQWikiContainer(workProduct);
				if (result == null) result = caseRasciElement(workProduct);
				if (result == null) result = caseQWikiNamespace(workProduct);
				if (result == null) result = caseL10nDescriptiveElement(workProduct);
				if (result == null) result = caseNamespace(workProduct);
				if (result == null) result = caseL10nNamedElement(workProduct);
				if (result == null) result = caseQWikiNamedElement(workProduct);
				if (result == null) result = caseNamedElement(workProduct);
				if (result == null) result = caseQWikiElement(workProduct);
				if (result == null) result = caseElement(workProduct);
				if (result == null) result = caseEModelElement(workProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpicePackage.GENERIC_WORK_PRODUCT: {
				GenericWorkProduct genericWorkProduct = (GenericWorkProduct)theEObject;
				T result = caseGenericWorkProduct(genericWorkProduct);
				if (result == null) result = caseWorkProduct(genericWorkProduct);
				if (result == null) result = caseSpiceElement(genericWorkProduct);
				if (result == null) result = caseQWikiContainer(genericWorkProduct);
				if (result == null) result = caseRasciElement(genericWorkProduct);
				if (result == null) result = caseQWikiNamespace(genericWorkProduct);
				if (result == null) result = caseL10nDescriptiveElement(genericWorkProduct);
				if (result == null) result = caseNamespace(genericWorkProduct);
				if (result == null) result = caseL10nNamedElement(genericWorkProduct);
				if (result == null) result = caseQWikiNamedElement(genericWorkProduct);
				if (result == null) result = caseNamedElement(genericWorkProduct);
				if (result == null) result = caseQWikiElement(genericWorkProduct);
				if (result == null) result = caseElement(genericWorkProduct);
				if (result == null) result = caseEModelElement(genericWorkProduct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP: {
				WorkProductRelationship workProductRelationship = (WorkProductRelationship)theEObject;
				T result = caseWorkProductRelationship(workProductRelationship);
				if (result == null) result = caseQWikiRelationship(workProductRelationship);
				if (result == null) result = caseDirectedRelationship(workProductRelationship);
				if (result == null) result = caseQWikiElement(workProductRelationship);
				if (result == null) result = caseRelationship(workProductRelationship);
				if (result == null) result = caseElement(workProductRelationship);
				if (result == null) result = caseEModelElement(workProductRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP_TYPE: {
				WorkProductRelationshipType workProductRelationshipType = (WorkProductRelationshipType)theEObject;
				T result = caseWorkProductRelationshipType(workProductRelationshipType);
				if (result == null) result = caseQWikiRelationshipType(workProductRelationshipType);
				if (result == null) result = caseQWikiNamedElement(workProductRelationshipType);
				if (result == null) result = caseNamedElement(workProductRelationshipType);
				if (result == null) result = caseQWikiElement(workProductRelationshipType);
				if (result == null) result = caseElement(workProductRelationshipType);
				if (result == null) result = caseEModelElement(workProductRelationshipType);
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
	 * Returns the result of interpreting the object as an instance of '<em>Work Product Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Product Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkProductRelationship(WorkProductRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Work Product Relationship Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Work Product Relationship Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkProductRelationshipType(WorkProductRelationshipType object) {
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
	public T caseRasciElement(RasciElement object) {
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

} //SpiceSwitch
