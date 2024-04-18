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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Relationship;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see QWiki.Spice.SpicePackage
 * @generated
 */
public class SpiceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpicePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpiceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SpicePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpiceSwitch<Adapter> modelSwitch =
		new SpiceSwitch<Adapter>() {
			@Override
			public Adapter caseBasePractise(BasePractise object) {
				return createBasePractiseAdapter();
			}
			@Override
			public Adapter caseSpiceElement(SpiceElement object) {
				return createSpiceElementAdapter();
			}
			@Override
			public Adapter caseProcessReferenceModel(ProcessReferenceModel object) {
				return createProcessReferenceModelAdapter();
			}
			@Override
			public Adapter caseProcess(QWiki.Spice.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseProcessGroup(ProcessGroup object) {
				return createProcessGroupAdapter();
			}
			@Override
			public Adapter caseOutcome(Outcome object) {
				return createOutcomeAdapter();
			}
			@Override
			public Adapter caseWorkProduct(WorkProduct object) {
				return createWorkProductAdapter();
			}
			@Override
			public Adapter caseGenericWorkProduct(GenericWorkProduct object) {
				return createGenericWorkProductAdapter();
			}
			@Override
			public Adapter caseWorkProductRelationship(WorkProductRelationship object) {
				return createWorkProductRelationshipAdapter();
			}
			@Override
			public Adapter caseWorkProductRelationshipType(WorkProductRelationshipType object) {
				return createWorkProductRelationshipTypeAdapter();
			}
			@Override
			public Adapter caseEModelElement(EModelElement object) {
				return createEModelElementAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseNamespace(Namespace object) {
				return createNamespaceAdapter();
			}
			@Override
			public Adapter caseQWikiElement(QWikiElement object) {
				return createQWikiElementAdapter();
			}
			@Override
			public Adapter caseQWikiNamedElement(QWikiNamedElement object) {
				return createQWikiNamedElementAdapter();
			}
			@Override
			public Adapter caseL10nNamedElement(L10nNamedElement object) {
				return createL10nNamedElementAdapter();
			}
			@Override
			public Adapter caseQWikiNamespace(QWikiNamespace object) {
				return createQWikiNamespaceAdapter();
			}
			@Override
			public Adapter caseL10nDescriptiveElement(L10nDescriptiveElement object) {
				return createL10nDescriptiveElementAdapter();
			}
			@Override
			public Adapter caseQWikiContainer(QWikiContainer object) {
				return createQWikiContainerAdapter();
			}
			@Override
			public Adapter caseRasciElement(RasciElement object) {
				return createRasciElementAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseDirectedRelationship(DirectedRelationship object) {
				return createDirectedRelationshipAdapter();
			}
			@Override
			public Adapter caseQWikiRelationship(QWikiRelationship object) {
				return createQWikiRelationshipAdapter();
			}
			@Override
			public Adapter caseQWikiRelationshipType(QWikiRelationshipType object) {
				return createQWikiRelationshipTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Spice.BasePractise <em>Base Practise</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Spice.BasePractise
	 * @generated
	 */
	public Adapter createBasePractiseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Spice.SpiceElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Spice.SpiceElement
	 * @generated
	 */
	public Adapter createSpiceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Spice.ProcessReferenceModel <em>Process Reference Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Spice.ProcessReferenceModel
	 * @generated
	 */
	public Adapter createProcessReferenceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Spice.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Spice.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Spice.ProcessGroup <em>Process Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Spice.ProcessGroup
	 * @generated
	 */
	public Adapter createProcessGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Spice.Outcome <em>Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Spice.Outcome
	 * @generated
	 */
	public Adapter createOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Spice.WorkProduct <em>Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Spice.WorkProduct
	 * @generated
	 */
	public Adapter createWorkProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Spice.GenericWorkProduct <em>Generic Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Spice.GenericWorkProduct
	 * @generated
	 */
	public Adapter createGenericWorkProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Spice.WorkProductRelationship <em>Work Product Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Spice.WorkProductRelationship
	 * @generated
	 */
	public Adapter createWorkProductRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Spice.WorkProductRelationshipType <em>Work Product Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Spice.WorkProductRelationshipType
	 * @generated
	 */
	public Adapter createWorkProductRelationshipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.EModelElement
	 * @generated
	 */
	public Adapter createEModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.QWikiElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.QWikiElement
	 * @generated
	 */
	public Adapter createQWikiElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.QWikiNamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.QWikiNamedElement
	 * @generated
	 */
	public Adapter createQWikiNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.L10nNamedElement <em>L1 0n Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.L10nNamedElement
	 * @generated
	 */
	public Adapter createL10nNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.QWikiNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.QWikiNamespace
	 * @generated
	 */
	public Adapter createQWikiNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.L10nDescriptiveElement <em>L1 0n Descriptive Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.L10nDescriptiveElement
	 * @generated
	 */
	public Adapter createL10nDescriptiveElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.QWikiContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.QWikiContainer
	 * @generated
	 */
	public Adapter createQWikiContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Rasci.RasciElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Rasci.RasciElement
	 * @generated
	 */
	public Adapter createRasciElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.DirectedRelationship <em>Directed Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.DirectedRelationship
	 * @generated
	 */
	public Adapter createDirectedRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.QWikiRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.QWikiRelationship
	 * @generated
	 */
	public Adapter createQWikiRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.QWikiRelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.QWikiRelationshipType
	 * @generated
	 */
	public Adapter createQWikiRelationshipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SpiceAdapterFactory
