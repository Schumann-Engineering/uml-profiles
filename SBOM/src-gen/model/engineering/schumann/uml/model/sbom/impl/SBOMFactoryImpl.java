/**
 */
package engineering.schumann.uml.model.sbom.impl;

import engineering.schumann.uml.model.sbom.Component;
import engineering.schumann.uml.model.sbom.Iec62304_Classification;
import engineering.schumann.uml.model.sbom.Iec81001_5_1_Classification;
import engineering.schumann.uml.model.sbom.NamespaceType;
import engineering.schumann.uml.model.sbom.Property;
import engineering.schumann.uml.model.sbom.Relationship;
import engineering.schumann.uml.model.sbom.RelationshipType;
import engineering.schumann.uml.model.sbom.SBOMFactory;
import engineering.schumann.uml.model.sbom.SBOMPackage;
import engineering.schumann.uml.model.sbom.Sbom;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SBOMFactoryImpl extends EFactoryImpl implements SBOMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SBOMFactory init() {
		try {
			SBOMFactory theSBOMFactory = (SBOMFactory)EPackage.Registry.INSTANCE.getEFactory(SBOMPackage.eNS_URI);
			if (theSBOMFactory != null) {
				return theSBOMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SBOMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SBOMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SBOMPackage.COMPONENT: return createComponent();
			case SBOMPackage.PROPERTY: return createProperty();
			case SBOMPackage.RELATIONSHIP: return createRelationship();
			case SBOMPackage.SBOM: return createSbom();
			case SBOMPackage.SYSTEM: return createSystem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SBOMPackage.NAMESPACE_TYPE:
				return createNamespaceTypeFromString(eDataType, initialValue);
			case SBOMPackage.IEC81001_51CLASSIFICATION:
				return createIec81001_5_1_ClassificationFromString(eDataType, initialValue);
			case SBOMPackage.IEC62304_CLASSIFICATION:
				return createIec62304_ClassificationFromString(eDataType, initialValue);
			case SBOMPackage.RELATIONSHIP_TYPE:
				return createRelationshipTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SBOMPackage.NAMESPACE_TYPE:
				return convertNamespaceTypeToString(eDataType, instanceValue);
			case SBOMPackage.IEC81001_51CLASSIFICATION:
				return convertIec81001_5_1_ClassificationToString(eDataType, instanceValue);
			case SBOMPackage.IEC62304_CLASSIFICATION:
				return convertIec62304_ClassificationToString(eDataType, instanceValue);
			case SBOMPackage.RELATIONSHIP_TYPE:
				return convertRelationshipTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sbom createSbom() {
		SbomImpl sbom = new SbomImpl();
		return sbom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public engineering.schumann.uml.model.sbom.System createSystem() {
		SystemImpl system = new SystemImpl();
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceType createNamespaceTypeFromString(EDataType eDataType, String initialValue) {
		NamespaceType result = NamespaceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNamespaceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iec81001_5_1_Classification createIec81001_5_1_ClassificationFromString(EDataType eDataType, String initialValue) {
		Iec81001_5_1_Classification result = Iec81001_5_1_Classification.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIec81001_5_1_ClassificationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Iec62304_Classification createIec62304_ClassificationFromString(EDataType eDataType, String initialValue) {
		Iec62304_Classification result = Iec62304_Classification.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIec62304_ClassificationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipType createRelationshipTypeFromString(EDataType eDataType, String initialValue) {
		RelationshipType result = RelationshipType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SBOMPackage getSBOMPackage() {
		return (SBOMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SBOMPackage getPackage() {
		return SBOMPackage.eINSTANCE;
	}

} //SBOMFactoryImpl
