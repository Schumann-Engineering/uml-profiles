/**
 */
package QWiki.Spice.impl;

import QWiki.Content.ContentPackage;
import QWiki.Content.impl.ContentPackageImpl;
import QWiki.Domain.DomainPackage;

import QWiki.Domain.impl.DomainPackageImpl;

import QWiki.Glossary.GlossaryPackage;

import QWiki.Glossary.impl.GlossaryPackageImpl;

import QWiki.QWikiPackage;

import QWiki.Rasci.RasciPackage;

import QWiki.Rasci.impl.RasciPackageImpl;

import QWiki.References.ReferencesPackage;

import QWiki.References.impl.ReferencesPackageImpl;

import QWiki.Relationships.RelationshipsPackage;

import QWiki.Relationships.impl.RelationshipsPackageImpl;

import QWiki.Spice.BasePractise;
import QWiki.Spice.GenericWorkProduct;
import QWiki.Spice.Outcome;
import QWiki.Spice.ProcessGroup;
import QWiki.Spice.ProcessReferenceModel;
import QWiki.Spice.ProcessReferenceModelDomain;
import QWiki.Spice.SpiceElement;
import QWiki.Spice.SpiceFactory;
import QWiki.Spice.SpicePackage;
import QWiki.Spice.WorkProduct;
import QWiki.Spice.WorkProductRelationship;
import QWiki.Spice.WorkProductRelationshipType;
import QWiki.Spice.WorkProductType;

import QWiki.impl.QWikiPackageImpl;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpicePackageImpl extends EPackageImpl implements SpicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basePractiseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spiceElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processReferenceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outcomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericWorkProductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workProductRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workProductRelationshipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processReferenceModelDomainEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum workProductTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see QWiki.Spice.SpicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpicePackageImpl() {
		super(eNS_URI, SpiceFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SpicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpicePackage init() {
		if (isInited) return (SpicePackage)EPackage.Registry.INSTANCE.getEPackage(SpicePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSpicePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SpicePackageImpl theSpicePackage = registeredSpicePackage instanceof SpicePackageImpl ? (SpicePackageImpl)registeredSpicePackage : new SpicePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		UMLPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(QWikiPackage.eNS_URI);
		QWikiPackageImpl theQWikiPackage = (QWikiPackageImpl)(registeredPackage instanceof QWikiPackageImpl ? registeredPackage : QWikiPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RasciPackage.eNS_URI);
		RasciPackageImpl theRasciPackage = (RasciPackageImpl)(registeredPackage instanceof RasciPackageImpl ? registeredPackage : RasciPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);
		ContentPackageImpl theContentPackage = (ContentPackageImpl)(registeredPackage instanceof ContentPackageImpl ? registeredPackage : ContentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GlossaryPackage.eNS_URI);
		GlossaryPackageImpl theGlossaryPackage = (GlossaryPackageImpl)(registeredPackage instanceof GlossaryPackageImpl ? registeredPackage : GlossaryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);
		ReferencesPackageImpl theReferencesPackage = (ReferencesPackageImpl)(registeredPackage instanceof ReferencesPackageImpl ? registeredPackage : ReferencesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);
		DomainPackageImpl theDomainPackage = (DomainPackageImpl)(registeredPackage instanceof DomainPackageImpl ? registeredPackage : DomainPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RelationshipsPackage.eNS_URI);
		RelationshipsPackageImpl theRelationshipsPackage = (RelationshipsPackageImpl)(registeredPackage instanceof RelationshipsPackageImpl ? registeredPackage : RelationshipsPackage.eINSTANCE);

		// Create package meta-data objects
		theSpicePackage.createPackageContents();
		theQWikiPackage.createPackageContents();
		theRasciPackage.createPackageContents();
		theContentPackage.createPackageContents();
		theGlossaryPackage.createPackageContents();
		theReferencesPackage.createPackageContents();
		theDomainPackage.createPackageContents();
		theRelationshipsPackage.createPackageContents();

		// Initialize created meta-data
		theSpicePackage.initializePackageContents();
		theQWikiPackage.initializePackageContents();
		theRasciPackage.initializePackageContents();
		theContentPackage.initializePackageContents();
		theGlossaryPackage.initializePackageContents();
		theReferencesPackage.initializePackageContents();
		theDomainPackage.initializePackageContents();
		theRelationshipsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSpicePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpicePackage.eNS_URI, theSpicePackage);
		return theSpicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasePractise() {
		return basePractiseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasePractise_OwningProcess() {
		return (EReference)basePractiseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasePractise_FacilitatedOutcome() {
		return (EReference)basePractiseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasePractise_FacilitatedWorkProduct() {
		return (EReference)basePractiseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBasePractise__ObjectId() {
		return basePractiseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpiceElement() {
		return spiceElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpiceElement_OwningProcessReferenceModel() {
		return (EReference)spiceElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpiceElement_Number() {
		return (EAttribute)spiceElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpiceElement_FacilitatedSection() {
		return (EReference)spiceElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpiceElement_OwnerRole() {
		return (EReference)spiceElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpiceElement_ManagerRole() {
		return (EReference)spiceElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpiceElement_ParticipantRole() {
		return (EReference)spiceElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpiceElement_Role() {
		return (EReference)spiceElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessReferenceModel() {
		return processReferenceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessReferenceModel_IsNonStandard() {
		return (EAttribute)processReferenceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessReferenceModel_PrmDomain() {
		return (EAttribute)processReferenceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessReferenceModel_OwnedSpiceElement() {
		return (EReference)processReferenceModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProcessReferenceModel__ObjectIdForDomain() {
		return processReferenceModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProcessReferenceModel__ObjectId() {
		return processReferenceModelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_OwningProcessGroup() {
		return (EReference)processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_OwnedOutcome() {
		return (EReference)processEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_FacilitatingWorkProduct() {
		return (EReference)processEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_FacilitatedWorkProduct() {
		return (EReference)processEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_OwnedBasePractise() {
		return (EReference)processEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProcess__ObjectId() {
		return processEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessGroup() {
		return processGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessGroup_OwnedProcess() {
		return (EReference)processGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProcessGroup__ObjectId() {
		return processGroupEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutcome() {
		return outcomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutcome_FacilitatingBasePractise() {
		return (EReference)outcomeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutcome_RequiredWorkproduct() {
		return (EReference)outcomeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutcome_ResultingWorkproduct() {
		return (EReference)outcomeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutcome_OwningProcess() {
		return (EReference)outcomeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOutcome__ObjectId() {
		return outcomeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkProduct() {
		return workProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkProduct_OwningWorkProductGroup() {
		return (EReference)workProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkProduct_Characteristic() {
		return (EReference)workProductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkProduct_FacilitatingOutcome() {
		return (EReference)workProductEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkProduct_FacilitatedProcess() {
		return (EReference)workProductEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkProduct_FacilitatingProcess() {
		return (EReference)workProductEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkProduct_WorkProductType() {
		return (EAttribute)workProductEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkProduct_ContainedWorkProduct() {
		return (EReference)workProductEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkProduct_ContainingWorkProduct() {
		return (EReference)workProductEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkProduct_LinkedWorkProduct() {
		return (EReference)workProductEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkProduct_Link() {
		return (EReference)workProductEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkProduct_FacilitatedOutcome() {
		return (EReference)workProductEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getWorkProduct__ObjectId() {
		return workProductEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenericWorkProduct() {
		return genericWorkProductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGenericWorkProduct_OwnedWorkProduct() {
		return (EReference)genericWorkProductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkProductRelationship() {
		return workProductRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkProductRelationship_LinkingWorkProduct() {
		return (EReference)workProductRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkProductRelationship_WorkProductRelationshipType() {
		return (EReference)workProductRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkProductRelationship_LinkedWorkProduct() {
		return (EReference)workProductRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkProductRelationshipType() {
		return workProductRelationshipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkProductRelationshipType_WorkProductRelationship() {
		return (EReference)workProductRelationshipTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProcessReferenceModelDomain() {
		return processReferenceModelDomainEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getWorkProductType() {
		return workProductTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpiceFactory getSpiceFactory() {
		return (SpiceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		basePractiseEClass = createEClass(BASE_PRACTISE);
		createEReference(basePractiseEClass, BASE_PRACTISE__OWNING_PROCESS);
		createEReference(basePractiseEClass, BASE_PRACTISE__FACILITATED_OUTCOME);
		createEReference(basePractiseEClass, BASE_PRACTISE__FACILITATED_WORK_PRODUCT);
		createEOperation(basePractiseEClass, BASE_PRACTISE___OBJECT_ID);

		spiceElementEClass = createEClass(SPICE_ELEMENT);
		createEReference(spiceElementEClass, SPICE_ELEMENT__OWNING_PROCESS_REFERENCE_MODEL);
		createEAttribute(spiceElementEClass, SPICE_ELEMENT__NUMBER);
		createEReference(spiceElementEClass, SPICE_ELEMENT__FACILITATED_SECTION);
		createEReference(spiceElementEClass, SPICE_ELEMENT__OWNER_ROLE);
		createEReference(spiceElementEClass, SPICE_ELEMENT__MANAGER_ROLE);
		createEReference(spiceElementEClass, SPICE_ELEMENT__PARTICIPANT_ROLE);
		createEReference(spiceElementEClass, SPICE_ELEMENT__ROLE);

		processReferenceModelEClass = createEClass(PROCESS_REFERENCE_MODEL);
		createEAttribute(processReferenceModelEClass, PROCESS_REFERENCE_MODEL__IS_NON_STANDARD);
		createEAttribute(processReferenceModelEClass, PROCESS_REFERENCE_MODEL__PRM_DOMAIN);
		createEReference(processReferenceModelEClass, PROCESS_REFERENCE_MODEL__OWNED_SPICE_ELEMENT);
		createEOperation(processReferenceModelEClass, PROCESS_REFERENCE_MODEL___OBJECT_ID_FOR_DOMAIN);
		createEOperation(processReferenceModelEClass, PROCESS_REFERENCE_MODEL___OBJECT_ID);

		processEClass = createEClass(PROCESS);
		createEReference(processEClass, PROCESS__OWNING_PROCESS_GROUP);
		createEReference(processEClass, PROCESS__OWNED_OUTCOME);
		createEReference(processEClass, PROCESS__FACILITATING_WORK_PRODUCT);
		createEReference(processEClass, PROCESS__FACILITATED_WORK_PRODUCT);
		createEReference(processEClass, PROCESS__OWNED_BASE_PRACTISE);
		createEOperation(processEClass, PROCESS___OBJECT_ID);

		processGroupEClass = createEClass(PROCESS_GROUP);
		createEReference(processGroupEClass, PROCESS_GROUP__OWNED_PROCESS);
		createEOperation(processGroupEClass, PROCESS_GROUP___OBJECT_ID);

		outcomeEClass = createEClass(OUTCOME);
		createEReference(outcomeEClass, OUTCOME__FACILITATING_BASE_PRACTISE);
		createEReference(outcomeEClass, OUTCOME__REQUIRED_WORKPRODUCT);
		createEReference(outcomeEClass, OUTCOME__RESULTING_WORKPRODUCT);
		createEReference(outcomeEClass, OUTCOME__OWNING_PROCESS);
		createEOperation(outcomeEClass, OUTCOME___OBJECT_ID);

		workProductEClass = createEClass(WORK_PRODUCT);
		createEReference(workProductEClass, WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP);
		createEReference(workProductEClass, WORK_PRODUCT__CHARACTERISTIC);
		createEReference(workProductEClass, WORK_PRODUCT__FACILITATING_OUTCOME);
		createEReference(workProductEClass, WORK_PRODUCT__FACILITATED_PROCESS);
		createEReference(workProductEClass, WORK_PRODUCT__FACILITATING_PROCESS);
		createEAttribute(workProductEClass, WORK_PRODUCT__WORK_PRODUCT_TYPE);
		createEReference(workProductEClass, WORK_PRODUCT__CONTAINED_WORK_PRODUCT);
		createEReference(workProductEClass, WORK_PRODUCT__CONTAINING_WORK_PRODUCT);
		createEReference(workProductEClass, WORK_PRODUCT__LINKED_WORK_PRODUCT);
		createEReference(workProductEClass, WORK_PRODUCT__LINK);
		createEReference(workProductEClass, WORK_PRODUCT__FACILITATED_OUTCOME);
		createEOperation(workProductEClass, WORK_PRODUCT___OBJECT_ID);

		genericWorkProductEClass = createEClass(GENERIC_WORK_PRODUCT);
		createEReference(genericWorkProductEClass, GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT);

		workProductRelationshipEClass = createEClass(WORK_PRODUCT_RELATIONSHIP);
		createEReference(workProductRelationshipEClass, WORK_PRODUCT_RELATIONSHIP__LINKING_WORK_PRODUCT);
		createEReference(workProductRelationshipEClass, WORK_PRODUCT_RELATIONSHIP__WORK_PRODUCT_RELATIONSHIP_TYPE);
		createEReference(workProductRelationshipEClass, WORK_PRODUCT_RELATIONSHIP__LINKED_WORK_PRODUCT);

		workProductRelationshipTypeEClass = createEClass(WORK_PRODUCT_RELATIONSHIP_TYPE);
		createEReference(workProductRelationshipTypeEClass, WORK_PRODUCT_RELATIONSHIP_TYPE__WORK_PRODUCT_RELATIONSHIP);

		// Create enums
		processReferenceModelDomainEEnum = createEEnum(PROCESS_REFERENCE_MODEL_DOMAIN);
		workProductTypeEEnum = createEEnum(WORK_PRODUCT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		QWikiPackage theQWikiPackage = (QWikiPackage)EPackage.Registry.INSTANCE.getEPackage(QWikiPackage.eNS_URI);
		RasciPackage theRasciPackage = (RasciPackage)EPackage.Registry.INSTANCE.getEPackage(RasciPackage.eNS_URI);
		ContentPackage theContentPackage = (ContentPackage)EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		basePractiseEClass.getESuperTypes().add(this.getSpiceElement());
		spiceElementEClass.getESuperTypes().add(theQWikiPackage.getQWikiContainer());
		spiceElementEClass.getESuperTypes().add(theRasciPackage.getRasciElement());
		processReferenceModelEClass.getESuperTypes().add(theQWikiPackage.getQWikiContainer());
		processEClass.getESuperTypes().add(this.getSpiceElement());
		processGroupEClass.getESuperTypes().add(this.getSpiceElement());
		outcomeEClass.getESuperTypes().add(theQWikiPackage.getL10nNamedElement());
		workProductEClass.getESuperTypes().add(this.getSpiceElement());
		genericWorkProductEClass.getESuperTypes().add(this.getWorkProduct());
		workProductRelationshipEClass.getESuperTypes().add(theQWikiPackage.getQWikiRelationship());
		workProductRelationshipTypeEClass.getESuperTypes().add(theQWikiPackage.getQWikiRelationshipType());

		// Initialize classes, features, and operations; add parameters
		initEClass(basePractiseEClass, BasePractise.class, "BasePractise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasePractise_OwningProcess(), this.getProcess(), this.getProcess_OwnedBasePractise(), "owningProcess", null, 0, 1, BasePractise.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBasePractise_FacilitatedOutcome(), this.getOutcome(), this.getOutcome_FacilitatingBasePractise(), "facilitatedOutcome", null, 1, -1, BasePractise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBasePractise_FacilitatedWorkProduct(), this.getWorkProduct(), null, "facilitatedWorkProduct", null, 0, -1, BasePractise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getBasePractise__ObjectId(), ecorePackage.getEString(), "objectId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(spiceElementEClass, SpiceElement.class, "SpiceElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpiceElement_OwningProcessReferenceModel(), this.getProcessReferenceModel(), this.getProcessReferenceModel_OwnedSpiceElement(), "owningProcessReferenceModel", null, 0, 1, SpiceElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSpiceElement_Number(), ecorePackage.getEString(), "number", null, 1, 1, SpiceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpiceElement_FacilitatedSection(), theContentPackage.getSection(), theContentPackage.getSection_FacilitatingSpiceElement(), "facilitatedSection", null, 0, -1, SpiceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpiceElement_OwnerRole(), theRasciPackage.getRole(), null, "ownerRole", null, 0, 1, SpiceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpiceElement_ManagerRole(), theRasciPackage.getRole(), null, "managerRole", null, 0, 1, SpiceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpiceElement_ParticipantRole(), theRasciPackage.getRole(), null, "participantRole", null, 0, -1, SpiceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSpiceElement_Role(), theRasciPackage.getRole(), null, "role", null, 0, -1, SpiceElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(processReferenceModelEClass, ProcessReferenceModel.class, "ProcessReferenceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessReferenceModel_IsNonStandard(), ecorePackage.getEBoolean(), "isNonStandard", "false", 1, 1, ProcessReferenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProcessReferenceModel_PrmDomain(), this.getProcessReferenceModelDomain(), "prmDomain", null, 1, 1, ProcessReferenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcessReferenceModel_OwnedSpiceElement(), this.getSpiceElement(), this.getSpiceElement_OwningProcessReferenceModel(), "ownedSpiceElement", null, 0, -1, ProcessReferenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getProcessReferenceModel__ObjectIdForDomain(), ecorePackage.getEString(), "objectIdForDomain", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getProcessReferenceModel__ObjectId(), ecorePackage.getEString(), "objectId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(processEClass, QWiki.Spice.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcess_OwningProcessGroup(), this.getProcessGroup(), this.getProcessGroup_OwnedProcess(), "owningProcessGroup", null, 0, 1, QWiki.Spice.Process.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcess_OwnedOutcome(), this.getOutcome(), this.getOutcome_OwningProcess(), "ownedOutcome", null, 0, -1, QWiki.Spice.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_FacilitatingWorkProduct(), this.getWorkProduct(), this.getWorkProduct_FacilitatedProcess(), "facilitatingWorkProduct", null, 0, -1, QWiki.Spice.Process.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcess_FacilitatedWorkProduct(), this.getWorkProduct(), this.getWorkProduct_FacilitatingProcess(), "facilitatedWorkProduct", null, 0, -1, QWiki.Spice.Process.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProcess_OwnedBasePractise(), this.getBasePractise(), this.getBasePractise_OwningProcess(), "ownedBasePractise", null, 0, -1, QWiki.Spice.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getProcess__ObjectId(), ecorePackage.getEString(), "objectId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(processGroupEClass, ProcessGroup.class, "ProcessGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessGroup_OwnedProcess(), this.getProcess(), this.getProcess_OwningProcessGroup(), "ownedProcess", null, 0, -1, ProcessGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getProcessGroup__ObjectId(), ecorePackage.getEString(), "objectId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(outcomeEClass, Outcome.class, "Outcome", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutcome_FacilitatingBasePractise(), this.getBasePractise(), this.getBasePractise_FacilitatedOutcome(), "facilitatingBasePractise", null, 1, -1, Outcome.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOutcome_RequiredWorkproduct(), this.getWorkProduct(), this.getWorkProduct_FacilitatedOutcome(), "requiredWorkproduct", null, 0, -1, Outcome.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOutcome_ResultingWorkproduct(), this.getWorkProduct(), this.getWorkProduct_FacilitatingOutcome(), "resultingWorkproduct", null, 0, -1, Outcome.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOutcome_OwningProcess(), this.getProcess(), this.getProcess_OwnedOutcome(), "owningProcess", null, 0, 1, Outcome.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getOutcome__ObjectId(), ecorePackage.getEString(), "objectId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(workProductEClass, WorkProduct.class, "WorkProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkProduct_OwningWorkProductGroup(), this.getGenericWorkProduct(), this.getGenericWorkProduct_OwnedWorkProduct(), "owningWorkProductGroup", null, 0, 1, WorkProduct.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkProduct_Characteristic(), theQWikiPackage.getL10nString(), null, "characteristic", null, 0, 1, WorkProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkProduct_FacilitatingOutcome(), this.getOutcome(), this.getOutcome_ResultingWorkproduct(), "facilitatingOutcome", null, 0, -1, WorkProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkProduct_FacilitatedProcess(), this.getProcess(), this.getProcess_FacilitatingWorkProduct(), "facilitatedProcess", null, 0, -1, WorkProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkProduct_FacilitatingProcess(), this.getProcess(), this.getProcess_FacilitatedWorkProduct(), "facilitatingProcess", null, 0, -1, WorkProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWorkProduct_WorkProductType(), this.getWorkProductType(), "workProductType", null, 1, 1, WorkProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkProduct_ContainedWorkProduct(), this.getWorkProduct(), this.getWorkProduct_ContainingWorkProduct(), "containedWorkProduct", null, 0, -1, WorkProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkProduct_ContainingWorkProduct(), this.getWorkProduct(), this.getWorkProduct_ContainedWorkProduct(), "containingWorkProduct", null, 0, 1, WorkProduct.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkProduct_LinkedWorkProduct(), this.getWorkProduct(), null, "linkedWorkProduct", null, 0, -1, WorkProduct.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkProduct_Link(), this.getWorkProductRelationship(), this.getWorkProductRelationship_LinkedWorkProduct(), "link", null, 0, -1, WorkProduct.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkProduct_FacilitatedOutcome(), this.getOutcome(), this.getOutcome_RequiredWorkproduct(), "facilitatedOutcome", null, 0, -1, WorkProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getWorkProduct__ObjectId(), ecorePackage.getEString(), "objectId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(genericWorkProductEClass, GenericWorkProduct.class, "GenericWorkProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenericWorkProduct_OwnedWorkProduct(), this.getWorkProduct(), this.getWorkProduct_OwningWorkProductGroup(), "ownedWorkProduct", null, 0, -1, GenericWorkProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(workProductRelationshipEClass, WorkProductRelationship.class, "WorkProductRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkProductRelationship_LinkingWorkProduct(), this.getWorkProduct(), null, "linkingWorkProduct", null, 1, 1, WorkProductRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkProductRelationship_WorkProductRelationshipType(), this.getWorkProductRelationshipType(), this.getWorkProductRelationshipType_WorkProductRelationship(), "workProductRelationshipType", null, 0, 1, WorkProductRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkProductRelationship_LinkedWorkProduct(), this.getWorkProduct(), this.getWorkProduct_Link(), "linkedWorkProduct", null, 1, -1, WorkProductRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(workProductRelationshipTypeEClass, WorkProductRelationshipType.class, "WorkProductRelationshipType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkProductRelationshipType_WorkProductRelationship(), this.getWorkProductRelationship(), this.getWorkProductRelationship_WorkProductRelationshipType(), "workProductRelationship", null, 0, -1, WorkProductRelationshipType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(processReferenceModelDomainEEnum, ProcessReferenceModelDomain.class, "ProcessReferenceModelDomain");
		addEEnumLiteral(processReferenceModelDomainEEnum, ProcessReferenceModelDomain.AGILE);
		addEEnumLiteral(processReferenceModelDomainEEnum, ProcessReferenceModelDomain.AUTOMOTIVE);
		addEEnumLiteral(processReferenceModelDomainEEnum, ProcessReferenceModelDomain.CYBERSECURITY);
		addEEnumLiteral(processReferenceModelDomainEEnum, ProcessReferenceModelDomain.DATA_MANAGEMENT);
		addEEnumLiteral(processReferenceModelDomainEEnum, ProcessReferenceModelDomain.HARDWARE);
		addEEnumLiteral(processReferenceModelDomainEEnum, ProcessReferenceModelDomain.IT_SERVICES);
		addEEnumLiteral(processReferenceModelDomainEEnum, ProcessReferenceModelDomain.MECHANICAL);
		addEEnumLiteral(processReferenceModelDomainEEnum, ProcessReferenceModelDomain.MEDICAL);
		addEEnumLiteral(processReferenceModelDomainEEnum, ProcessReferenceModelDomain.ORGANIZATIONAL);
		addEEnumLiteral(processReferenceModelDomainEEnum, ProcessReferenceModelDomain.TEST);

		initEEnum(workProductTypeEEnum, WorkProductType.class, "WorkProductType");
		addEEnumLiteral(workProductTypeEEnum, WorkProductType.ARTEFACT);
		addEEnumLiteral(workProductTypeEEnum, WorkProductType.DOCUMENT);
		addEEnumLiteral(workProductTypeEEnum, WorkProductType.GENERIC);
		addEEnumLiteral(workProductTypeEEnum, WorkProductType.SHIPPABLE);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// redefines
		createRedefinesAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// subsets
		createSubsetsAnnotations();
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
		// union
		createUnionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });
	}

	/**
	 * Initializes the annotations for <b>redefines</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createRedefinesAnnotations() {
		String source = "redefines";
		addAnnotation
		  (getBasePractise__ObjectId(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(QWikiPackage.eNS_URI).appendFragment("//QWikiElement/objectId")
		   });
		addAnnotation
		  (getProcessReferenceModel__ObjectId(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(QWikiPackage.eNS_URI).appendFragment("//QWikiElement/objectId")
		   });
		addAnnotation
		  (getProcess__ObjectId(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(QWikiPackage.eNS_URI).appendFragment("//QWikiElement/objectId")
		   });
		addAnnotation
		  (getProcessGroup__ObjectId(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(QWikiPackage.eNS_URI).appendFragment("//QWikiElement/objectId")
		   });
		addAnnotation
		  (getOutcome__ObjectId(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(QWikiPackage.eNS_URI).appendFragment("//QWikiElement/objectId")
		   });
		addAnnotation
		  (getWorkProduct__ObjectId(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(QWikiPackage.eNS_URI).appendFragment("//QWikiElement/objectId")
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";
		addAnnotation
		  (getBasePractise__ObjectId(),
		   source,
		   new String[] {
			   "body", "\'bp/\' + number + \'@\' + owningProcess.objectId()"
		   });
		addAnnotation
		  (getProcessReferenceModel__ObjectIdForDomain(),
		   source,
		   new String[] {
			   "body", "\tif (prmDomain = ProcessReferenceModelDomain::Agile) then \'Agl\' else\r\nif (prmDomain = ProcessReferenceModelDomain::Automotive) then \'A\' else\r\nif (prmDomain = ProcessReferenceModelDomain::Cybersecurity) then \'CS\' else\r\nif (prmDomain = ProcessReferenceModelDomain::DataManagement) then \'DM\' else\r\nif (prmDomain = ProcessReferenceModelDomain::Hardware) then \'HW\' else\r\nif (prmDomain = ProcessReferenceModelDomain::ITServices) then \'ITS\' else\r\nif (prmDomain = ProcessReferenceModelDomain::Mechanical) then \'ME\' else\r\nif (prmDomain = ProcessReferenceModelDomain::Medical) then \'M\' else\r\nif (prmDomain = ProcessReferenceModelDomain::Organizational) then \'Org\' else\r\nif (prmDomain = ProcessReferenceModelDomain::Test) then \'T\' else\r\n\'?\'\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif\r\nendif"
		   });
		addAnnotation
		  (getProcessReferenceModel__ObjectId(),
		   source,
		   new String[] {
			   "body", "if (isNonStandard = true) then objectIdForDomain() + \'-xt\' else objectIdForDomain() + \'\' endif"
		   });
		addAnnotation
		  (getProcess__ObjectId(),
		   source,
		   new String[] {
			   "body", "owningProcessGroup.objectId() +  \'.\' + number"
		   });
		addAnnotation
		  (getProcessGroup__ObjectId(),
		   source,
		   new String[] {
			   "body", "\'p/\' + number"
		   });
		addAnnotation
		  (getOutcome__ObjectId(),
		   source,
		   new String[] {
			   "body", "\'oc/\' + self.uuid + \'@\' + self.owningProcess.objectId()"
		   });
		addAnnotation
		  (getWorkProduct__ObjectId(),
		   source,
		   new String[] {
			   "body", "\'wp/\'\r\n+\r\nif (owningWorkProductGroup->notEmpty()) then\r\n  owningWorkProductGroup.number + \'-\'\r\nelse\r\n  \'\'\r\nendif\r\n+\r\nnumber + \'/\' + owningProcessReferenceModel.objectId()"
		   });
	}

	/**
	 * Initializes the annotations for <b>subsets</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSubsetsAnnotations() {
		String source = "subsets";
		addAnnotation
		  (getBasePractise_OwningProcess(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(UMLPackage.eNS_URI).appendFragment("//NamedElement/namespace")
		   });
		addAnnotation
		  (getSpiceElement_OwningProcessReferenceModel(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(UMLPackage.eNS_URI).appendFragment("//NamedElement/namespace")
		   });
		addAnnotation
		  (getSpiceElement_OwnerRole(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//SpiceElement/role")
		   });
		addAnnotation
		  (getSpiceElement_ManagerRole(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//SpiceElement/role")
		   });
		addAnnotation
		  (getSpiceElement_ParticipantRole(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//SpiceElement/role")
		   });
		addAnnotation
		  (getProcessReferenceModel_OwnedSpiceElement(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(UMLPackage.eNS_URI).appendFragment("//Namespace/ownedMember")
		   });
		addAnnotation
		  (getProcess_OwningProcessGroup(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(UMLPackage.eNS_URI).appendFragment("//NamedElement/namespace")
		   });
		addAnnotation
		  (getProcess_OwnedOutcome(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(UMLPackage.eNS_URI).appendFragment("//Namespace/ownedMember")
		   });
		addAnnotation
		  (getProcess_OwnedBasePractise(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(UMLPackage.eNS_URI).appendFragment("//Namespace/ownedMember")
		   });
		addAnnotation
		  (getProcessGroup_OwnedProcess(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(UMLPackage.eNS_URI).appendFragment("//Namespace/ownedMember")
		   });
		addAnnotation
		  (getOutcome_OwningProcess(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(UMLPackage.eNS_URI).appendFragment("//NamedElement/namespace")
		   });
		addAnnotation
		  (getWorkProduct_OwningWorkProductGroup(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(UMLPackage.eNS_URI).appendFragment("//NamedElement/namespace")
		   });
		addAnnotation
		  (getWorkProduct_ContainedWorkProduct(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//WorkProduct/linkedWorkProduct")
		   });
		addAnnotation
		  (getWorkProduct_ContainingWorkProduct(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//WorkProduct/linkedWorkProduct")
		   });
		addAnnotation
		  (getGenericWorkProduct_OwnedWorkProduct(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(UMLPackage.eNS_URI).appendFragment("//Namespace/ownedMember")
		   });
		addAnnotation
		  (getWorkProductRelationship_LinkingWorkProduct(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(UMLPackage.eNS_URI).appendFragment("//DirectedRelationship/source")
		   });
		addAnnotation
		  (getWorkProductRelationship_LinkedWorkProduct(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(UMLPackage.eNS_URI).appendFragment("//DirectedRelationship/target")
		   });
		addAnnotation
		  (getWorkProductRelationshipType_WorkProductRelationship(),
		   source,
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(QWikiPackage.eNS_URI).appendFragment("//QWikiRelationshipType/relationship")
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (getBasePractise_OwningProcess(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getBasePractise_FacilitatedOutcome(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getBasePractise_FacilitatedWorkProduct(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getSpiceElement_OwningProcessReferenceModel(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getSpiceElement_Number(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getSpiceElement_FacilitatedSection(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getSpiceElement_OwnerRole(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getSpiceElement_ManagerRole(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getSpiceElement_ParticipantRole(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getSpiceElement_Role(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getProcessReferenceModel_IsNonStandard(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getProcessReferenceModel_OwnedSpiceElement(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getProcess_OwningProcessGroup(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getProcess_OwnedOutcome(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getProcess_FacilitatingWorkProduct(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getProcess_FacilitatedWorkProduct(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getProcess_OwnedBasePractise(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getProcessGroup_OwnedProcess(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getOutcome_FacilitatingBasePractise(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getOutcome_RequiredWorkproduct(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getOutcome_ResultingWorkproduct(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getOutcome_OwningProcess(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getWorkProduct_OwningWorkProductGroup(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getWorkProduct_FacilitatingOutcome(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getWorkProduct_FacilitatedProcess(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getWorkProduct_FacilitatingProcess(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getWorkProduct_ContainedWorkProduct(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getWorkProduct_ContainingWorkProduct(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getWorkProduct_LinkedWorkProduct(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getWorkProduct_Link(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getWorkProduct_FacilitatedOutcome(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getGenericWorkProduct_OwnedWorkProduct(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getWorkProductRelationship_LinkingWorkProduct(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getWorkProductRelationship_WorkProductRelationshipType(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getWorkProductRelationship_LinkedWorkProduct(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getWorkProductRelationshipType_WorkProductRelationship(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEmofAnnotations() {
		String source = "http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName";
		addAnnotation
		  (getBasePractise_FacilitatedWorkProduct(),
		   source,
		   new String[] {
			   "body", "facilitatingBacePractise"
		   });
		addAnnotation
		  (getSpiceElement_OwnerRole(),
		   source,
		   new String[] {
			   "body", "spiceelement"
		   });
		addAnnotation
		  (getSpiceElement_ManagerRole(),
		   source,
		   new String[] {
			   "body", "spiceelement"
		   });
		addAnnotation
		  (getSpiceElement_ParticipantRole(),
		   source,
		   new String[] {
			   "body", "spiceelement"
		   });
		addAnnotation
		  (getSpiceElement_Role(),
		   source,
		   new String[] {
			   "body", "spiceelement"
		   });
		addAnnotation
		  (getWorkProduct_LinkedWorkProduct(),
		   source,
		   new String[] {
			   "body", "workproduct"
		   });
		addAnnotation
		  (getWorkProductRelationship_LinkingWorkProduct(),
		   source,
		   new String[] {
			   "body", "workproductlink"
		   });
	}

	/**
	 * Initializes the annotations for <b>union</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUnionAnnotations() {
		String source = "union";
		addAnnotation
		  (getSpiceElement_Role(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getWorkProduct_LinkedWorkProduct(),
		   source,
		   new String[] {
		   });
	}

} //SpicePackageImpl
