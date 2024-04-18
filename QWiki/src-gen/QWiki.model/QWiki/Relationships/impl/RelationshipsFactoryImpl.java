/**
 */
package QWiki.Relationships.impl;

import QWiki.Relationships.*;

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
public class RelationshipsFactoryImpl extends EFactoryImpl implements RelationshipsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationshipsFactory init() {
		try {
			RelationshipsFactory theRelationshipsFactory = (RelationshipsFactory)EPackage.Registry.INSTANCE.getEFactory(RelationshipsPackage.eNS_URI);
			if (theRelationshipsFactory != null) {
				return theRelationshipsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RelationshipsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipsFactoryImpl() {
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
			case RelationshipsPackage.DO_NOT_USE_RELATIONSHIP_TYPE: return createDO_NOT_USE_RelationshipType();
			case RelationshipsPackage.DO_NOT_USE_SUPERSEEDING_RELATIONSHIP: return createDO_NOT_USE_SuperseedingRelationship();
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
			case RelationshipsPackage.DO_NOT_USE_SUPERSEEDING_TYPE:
				return createDO_NOT_USE_SuperseedingTypeFromString(eDataType, initialValue);
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
			case RelationshipsPackage.DO_NOT_USE_SUPERSEEDING_TYPE:
				return convertDO_NOT_USE_SuperseedingTypeToString(eDataType, instanceValue);
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
	public DO_NOT_USE_RelationshipType createDO_NOT_USE_RelationshipType() {
		DO_NOT_USE_RelationshipTypeImpl dO_NOT_USE_RelationshipType = new DO_NOT_USE_RelationshipTypeImpl();
		return dO_NOT_USE_RelationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DO_NOT_USE_SuperseedingRelationship createDO_NOT_USE_SuperseedingRelationship() {
		DO_NOT_USE_SuperseedingRelationshipImpl dO_NOT_USE_SuperseedingRelationship = new DO_NOT_USE_SuperseedingRelationshipImpl();
		return dO_NOT_USE_SuperseedingRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DO_NOT_USE_SuperseedingType createDO_NOT_USE_SuperseedingTypeFromString(EDataType eDataType, String initialValue) {
		DO_NOT_USE_SuperseedingType result = DO_NOT_USE_SuperseedingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDO_NOT_USE_SuperseedingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationshipsPackage getRelationshipsPackage() {
		return (RelationshipsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RelationshipsPackage getPackage() {
		return RelationshipsPackage.eINSTANCE;
	}

} //RelationshipsFactoryImpl
