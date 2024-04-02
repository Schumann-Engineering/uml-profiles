/**
 */
package QWiki.Kernel.Relationships;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see QWiki.Kernel.Relationships.RelationshipsPackage
 * @generated
 */
public interface RelationshipsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RelationshipsFactory eINSTANCE = QWiki.Kernel.Relationships.impl.RelationshipsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DO NOT USE Relationship Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DO NOT USE Relationship Type</em>'.
	 * @generated
	 */
	DO_NOT_USE_RelationshipType createDO_NOT_USE_RelationshipType();

	/**
	 * Returns a new object of class '<em>DO NOT USE Superseeding Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DO NOT USE Superseeding Relationship</em>'.
	 * @generated
	 */
	DO_NOT_USE_SuperseedingRelationship createDO_NOT_USE_SuperseedingRelationship();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RelationshipsPackage getRelationshipsPackage();

} //RelationshipsFactory
