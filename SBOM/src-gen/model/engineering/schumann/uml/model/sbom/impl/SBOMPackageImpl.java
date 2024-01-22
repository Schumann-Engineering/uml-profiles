/**
 */
package engineering.schumann.uml.model.sbom.impl;

import engineering.schumann.uml.model.sbom.Component;
import engineering.schumann.uml.model.sbom.DescribedElement;
import engineering.schumann.uml.model.sbom.Element;
import engineering.schumann.uml.model.sbom.NamedElement;
import engineering.schumann.uml.model.sbom.Namespace;
import engineering.schumann.uml.model.sbom.NamespaceType;
import engineering.schumann.uml.model.sbom.Propety;
import engineering.schumann.uml.model.sbom.Relationship;
import engineering.schumann.uml.model.sbom.RelationshipType;
import engineering.schumann.uml.model.sbom.SBOMFactory;
import engineering.schumann.uml.model.sbom.SBOMPackage;
import engineering.schumann.uml.model.sbom.Sbom;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SBOMPackageImpl extends EPackageImpl implements SBOMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum namespaceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass describedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propetyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sbomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationshipTypeEEnum = null;

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
	 * @see engineering.schumann.uml.model.sbom.SBOMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SBOMPackageImpl() {
		super(eNS_URI, SBOMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SBOMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SBOMPackage init() {
		if (isInited) return (SBOMPackage)EPackage.Registry.INSTANCE.getEPackage(SBOMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSBOMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SBOMPackageImpl theSBOMPackage = registeredSBOMPackage instanceof SBOMPackageImpl ? (SBOMPackageImpl)registeredSBOMPackage : new SBOMPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSBOMPackage.createPackageContents();

		// Initialize created meta-data
		theSBOMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSBOMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SBOMPackage.eNS_URI, theSBOMPackage);
		return theSBOMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamespace() {
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamespace_OwnedComponent() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamespace_RequiredComponent() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamespace_OwnedProperty() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamespace_Type() {
		return (EAttribute)namespaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamespace_IsSOUP() {
		return (EAttribute)namespaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNamespaceType() {
		return namespaceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDescribedElement() {
		return describedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDescribedElement_Summary() {
		return (EAttribute)describedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDescribedElement_Description() {
		return (EAttribute)describedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDescribedElement_License() {
		return (EAttribute)describedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Version() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Supplier() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Id() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Timestamp() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Reference() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropety() {
		return propetyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropety_Key() {
		return (EAttribute)propetyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropety_Value() {
		return (EAttribute)propetyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropety_Type() {
		return (EAttribute)propetyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationship_Source() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationship_Target() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationship_Type() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSbom() {
		return sbomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSbom_OwnedSystem() {
		return (EReference)sbomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSbom_OwnedRelationship() {
		return (EReference)sbomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRelationshipType() {
		return relationshipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SBOMFactory getSBOMFactory() {
		return (SBOMFactory)getEFactoryInstance();
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
		componentEClass = createEClass(COMPONENT);

		namespaceEClass = createEClass(NAMESPACE);
		createEReference(namespaceEClass, NAMESPACE__OWNED_COMPONENT);
		createEReference(namespaceEClass, NAMESPACE__REQUIRED_COMPONENT);
		createEReference(namespaceEClass, NAMESPACE__OWNED_PROPERTY);
		createEAttribute(namespaceEClass, NAMESPACE__TYPE);
		createEAttribute(namespaceEClass, NAMESPACE__IS_SOUP);

		describedElementEClass = createEClass(DESCRIBED_ELEMENT);
		createEAttribute(describedElementEClass, DESCRIBED_ELEMENT__SUMMARY);
		createEAttribute(describedElementEClass, DESCRIBED_ELEMENT__DESCRIPTION);
		createEAttribute(describedElementEClass, DESCRIBED_ELEMENT__LICENSE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__VERSION);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__SUPPLIER);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__ID);
		createEAttribute(elementEClass, ELEMENT__REFERENCE);
		createEAttribute(elementEClass, ELEMENT__TIMESTAMP);

		propetyEClass = createEClass(PROPETY);
		createEAttribute(propetyEClass, PROPETY__KEY);
		createEAttribute(propetyEClass, PROPETY__VALUE);
		createEAttribute(propetyEClass, PROPETY__TYPE);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__SOURCE);
		createEReference(relationshipEClass, RELATIONSHIP__TARGET);
		createEAttribute(relationshipEClass, RELATIONSHIP__TYPE);

		sbomEClass = createEClass(SBOM);
		createEReference(sbomEClass, SBOM__OWNED_SYSTEM);
		createEReference(sbomEClass, SBOM__OWNED_RELATIONSHIP);

		systemEClass = createEClass(SYSTEM);

		// Create enums
		namespaceTypeEEnum = createEEnum(NAMESPACE_TYPE);
		relationshipTypeEEnum = createEEnum(RELATIONSHIP_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentEClass.getESuperTypes().add(this.getNamespace());
		namespaceEClass.getESuperTypes().add(this.getDescribedElement());
		describedElementEClass.getESuperTypes().add(this.getNamedElement());
		namedElementEClass.getESuperTypes().add(this.getElement());
		sbomEClass.getESuperTypes().add(this.getNamedElement());
		systemEClass.getESuperTypes().add(this.getNamespace());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namespaceEClass, Namespace.class, "Namespace", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamespace_OwnedComponent(), this.getComponent(), null, "ownedComponent", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNamespace_RequiredComponent(), this.getComponent(), null, "requiredComponent", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNamespace_OwnedProperty(), this.getPropety(), null, "ownedProperty", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNamespace_Type(), this.getNamespaceType(), "type", null, 1, 1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNamespace_IsSOUP(), ecorePackage.getEBoolean(), "isSOUP", "true", 1, 1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(describedElementEClass, DescribedElement.class, "DescribedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescribedElement_Summary(), ecorePackage.getEString(), "summary", null, 0, 1, DescribedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDescribedElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, DescribedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDescribedElement_License(), ecorePackage.getEString(), "license", null, 0, -1, DescribedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNamedElement_Version(), ecorePackage.getEString(), "version", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNamedElement_Supplier(), ecorePackage.getEString(), "supplier", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElement_Reference(), ecorePackage.getEString(), "reference", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElement_Timestamp(), ecorePackage.getEString(), "timestamp", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(propetyEClass, Propety.class, "Propety", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropety_Key(), ecorePackage.getEString(), "key", null, 1, 1, Propety.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPropety_Value(), ecorePackage.getEString(), "value", null, 1, 1, Propety.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPropety_Type(), ecorePackage.getEString(), "type", null, 0, 1, Propety.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_Source(), this.getNamedElement(), null, "source", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRelationship_Target(), this.getNamedElement(), null, "target", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRelationship_Type(), this.getRelationshipType(), "type", null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sbomEClass, Sbom.class, "Sbom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSbom_OwnedSystem(), this.getSystem(), null, "ownedSystem", null, 1, -1, Sbom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSbom_OwnedRelationship(), this.getRelationship(), null, "ownedRelationship", null, 0, -1, Sbom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(systemEClass, engineering.schumann.uml.model.sbom.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(namespaceTypeEEnum, NamespaceType.class, "NamespaceType");
		addEEnumLiteral(namespaceTypeEEnum, NamespaceType.APPLICATION);
		addEEnumLiteral(namespaceTypeEEnum, NamespaceType.FIRMWARE);
		addEEnumLiteral(namespaceTypeEEnum, NamespaceType.HARDWARE);
		addEEnumLiteral(namespaceTypeEEnum, NamespaceType.LIBRARY);
		addEEnumLiteral(namespaceTypeEEnum, NamespaceType.OPERATING_SYSTEM);

		initEEnum(relationshipTypeEEnum, RelationshipType.class, "RelationshipType");
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.UNKNOWN);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.CONTAINS);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.IS_CONTAINED_BY);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.REQUIRES);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.IS_REQUIRED_BY);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.RUNS_ON);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.RUNS);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.DESCRIBES);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.IS_DESCRIBED_BY);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "originalName", "SBOM"
		   });
	}

} //SBOMPackageImpl
