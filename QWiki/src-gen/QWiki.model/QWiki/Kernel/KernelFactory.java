/**
 */
package QWiki.Kernel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see QWiki.Kernel.KernelPackage
 * @generated
 */
public interface KernelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KernelFactory eINSTANCE = QWiki.Kernel.impl.KernelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Domain</em>'.
	 * @generated
	 */
	ModelDomain createModelDomain();

	/**
	 * Returns a new object of class '<em>Model Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Root</em>'.
	 * @generated
	 */
	ModelRoot createModelRoot();

	/**
	 * Returns a new object of class '<em>DO NOT USE Relationship Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DO NOT USE Relationship Type</em>'.
	 * @generated
	 */
	DO_NOT_USE_RelationshipType createDO_NOT_USE_RelationshipType();

	/**
	 * Returns a new object of class '<em>Superseeding Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Superseeding Relationship</em>'.
	 * @generated
	 */
	SuperseedingRelationship createSuperseedingRelationship();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KernelPackage getKernelPackage();

} //KernelFactory
