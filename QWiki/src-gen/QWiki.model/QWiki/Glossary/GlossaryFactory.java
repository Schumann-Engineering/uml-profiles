/**
 */
package QWiki.Glossary;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see QWiki.Glossary.GlossaryPackage
 * @generated
 */
public interface GlossaryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GlossaryFactory eINSTANCE = QWiki.Glossary.impl.GlossaryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Term Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term Definition</em>'.
	 * @generated
	 */
	GlossaryTermDefinition createGlossaryTermDefinition();

	/**
	 * Returns a new object of class '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term</em>'.
	 * @generated
	 */
	GlossaryTerm createGlossaryTerm();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GlossaryPackage getGlossaryPackage();

} //GlossaryFactory
