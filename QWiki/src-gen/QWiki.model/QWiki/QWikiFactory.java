/**
 */
package QWiki;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see QWiki.QWikiPackage
 * @generated
 */
public interface QWikiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QWikiFactory eINSTANCE = QWiki.impl.QWikiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Author</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Author</em>'.
	 * @generated
	 */
	Author createAuthor();

	/**
	 * Returns a new object of class '<em>Uml Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uml Comment</em>'.
	 * @generated
	 */
	UmlComment createUmlComment();

	/**
	 * Returns a new object of class '<em>I1 8n Keyed String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>I1 8n Keyed String</em>'.
	 * @generated
	 */
	I18nKeyedString createI18nKeyedString();

	/**
	 * Returns a new object of class '<em>I1 8n Base String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>I1 8n Base String</em>'.
	 * @generated
	 */
	I18nBaseString createI18nBaseString();

	/**
	 * Returns a new object of class '<em>I1 8n Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>I1 8n Value</em>'.
	 * @generated
	 */
	I18nValue createI18nValue();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	QWikiModel createQWikiModel();

	/**
	 * Returns a new object of class '<em>Uml Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uml Package</em>'.
	 * @generated
	 */
	UmlPackage createUmlPackage();

	/**
	 * Returns a new object of class '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document</em>'.
	 * @generated
	 */
	Document createDocument();

	/**
	 * Returns a new object of class '<em>I1 8n String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>I1 8n String</em>'.
	 * @generated
	 */
	I18nString createI18nString();

	/**
	 * Returns a new object of class '<em>Document Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Version</em>'.
	 * @generated
	 */
	DocumentVersion createDocumentVersion();

	/**
	 * Returns a new object of class '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section</em>'.
	 * @generated
	 */
	Section createSection();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Process Reference Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Reference Model</em>'.
	 * @generated
	 */
	ProcessReferenceModel createProcessReferenceModel();

	/**
	 * Returns a new object of class '<em>Superseeding Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Superseeding Relationship</em>'.
	 * @generated
	 */
	SuperseedingRelationship createSuperseedingRelationship();

	/**
	 * Returns a new object of class '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term</em>'.
	 * @generated
	 */
	Term createTerm();

	/**
	 * Returns a new object of class '<em>Term Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term Definition</em>'.
	 * @generated
	 */
	TermDefinition createTermDefinition();

	/**
	 * Returns a new object of class '<em>Base Practise</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Base Practise</em>'.
	 * @generated
	 */
	BasePractise createBasePractise();

	/**
	 * Returns a new object of class '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process</em>'.
	 * @generated
	 */
	Process createProcess();

	/**
	 * Returns a new object of class '<em>Process Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Group</em>'.
	 * @generated
	 */
	ProcessGroup createProcessGroup();

	/**
	 * Returns a new object of class '<em>Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outcome</em>'.
	 * @generated
	 */
	Outcome createOutcome();

	/**
	 * Returns a new object of class '<em>Work Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Work Product</em>'.
	 * @generated
	 */
	WorkProduct createWorkProduct();

	/**
	 * Returns a new object of class '<em>Generic Work Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Work Product</em>'.
	 * @generated
	 */
	GenericWorkProduct createGenericWorkProduct();

	/**
	 * Returns a new object of class '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain</em>'.
	 * @generated
	 */
	Domain createDomain();

	/**
	 * Returns a new object of class '<em>DO NOT USE Relationship Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DO NOT USE Relationship Type</em>'.
	 * @generated
	 */
	DO_NOT_USE_RelationshipType createDO_NOT_USE_RelationshipType();

	/**
	 * Returns a new object of class '<em>Uml Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uml Association</em>'.
	 * @generated
	 */
	UmlAssociation createUmlAssociation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QWikiPackage getQWikiPackage();

} //QWikiFactory
