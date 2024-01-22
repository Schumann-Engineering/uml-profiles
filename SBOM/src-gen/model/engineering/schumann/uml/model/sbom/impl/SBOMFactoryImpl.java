/**
 */
package engineering.schumann.uml.model.sbom.impl;

import engineering.schumann.uml.model.sbom.Component;
import engineering.schumann.uml.model.sbom.NamespaceType;
import engineering.schumann.uml.model.sbom.Propety;
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
			case SBOMPackage.PROPETY: return createPropety();
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
	@Override
	public Propety createPropety() {
		PropetyImpl propety = new PropetyImpl();
		return propety;
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
