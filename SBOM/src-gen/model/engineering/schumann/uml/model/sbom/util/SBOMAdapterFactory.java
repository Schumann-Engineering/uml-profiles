/**
 */
package engineering.schumann.uml.model.sbom.util;

import engineering.schumann.uml.model.sbom.ArtifactMetadata;
import engineering.schumann.uml.model.sbom.Component;
import engineering.schumann.uml.model.sbom.DescribedElement;
import engineering.schumann.uml.model.sbom.Element;
import engineering.schumann.uml.model.sbom.MetadataLibrary;
import engineering.schumann.uml.model.sbom.NamedElement;
import engineering.schumann.uml.model.sbom.Namespace;
import engineering.schumann.uml.model.sbom.Property;
import engineering.schumann.uml.model.sbom.Relationship;
import engineering.schumann.uml.model.sbom.SBOMPackage;
import engineering.schumann.uml.model.sbom.Sbom;
import engineering.schumann.uml.model.sbom.SupplierMetadata;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see engineering.schumann.uml.model.sbom.SBOMPackage
 * @generated
 */
public class SBOMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SBOMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SBOMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SBOMPackage.eINSTANCE;
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
	protected SBOMSwitch<Adapter> modelSwitch =
		new SBOMSwitch<Adapter>() {
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseNamespace(Namespace object) {
				return createNamespaceAdapter();
			}
			@Override
			public Adapter caseDescribedElement(DescribedElement object) {
				return createDescribedElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseSbom(Sbom object) {
				return createSbomAdapter();
			}
			@Override
			public Adapter caseSystem(engineering.schumann.uml.model.sbom.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseMetadataLibrary(MetadataLibrary object) {
				return createMetadataLibraryAdapter();
			}
			@Override
			public Adapter caseArtifactMetadata(ArtifactMetadata object) {
				return createArtifactMetadataAdapter();
			}
			@Override
			public Adapter caseSupplierMetadata(SupplierMetadata object) {
				return createSupplierMetadataAdapter();
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
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.model.sbom.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.model.sbom.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.model.sbom.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.model.sbom.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.model.sbom.DescribedElement <em>Described Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.model.sbom.DescribedElement
	 * @generated
	 */
	public Adapter createDescribedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.model.sbom.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.model.sbom.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.model.sbom.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.model.sbom.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.model.sbom.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.model.sbom.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.model.sbom.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.model.sbom.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.model.sbom.Sbom <em>Sbom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.model.sbom.Sbom
	 * @generated
	 */
	public Adapter createSbomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.model.sbom.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.model.sbom.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.model.sbom.MetadataLibrary <em>Metadata Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.model.sbom.MetadataLibrary
	 * @generated
	 */
	public Adapter createMetadataLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.model.sbom.ArtifactMetadata <em>Artifact Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.model.sbom.ArtifactMetadata
	 * @generated
	 */
	public Adapter createArtifactMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link engineering.schumann.uml.model.sbom.SupplierMetadata <em>Supplier Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see engineering.schumann.uml.model.sbom.SupplierMetadata
	 * @generated
	 */
	public Adapter createSupplierMetadataAdapter() {
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

} //SBOMAdapterFactory
