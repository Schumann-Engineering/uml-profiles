/**
 */
package QWiki.Glossary;

import QWiki.I18N.I18NPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see QWiki.Glossary.GlossaryFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface GlossaryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Glossary";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schumann.engineering/qwiki/1.0/glossary";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "QWiki.Glossary";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GlossaryPackage eINSTANCE = QWiki.Glossary.impl.GlossaryPackageImpl.init();

	/**
	 * The meta object id for the '{@link QWiki.Glossary.impl.GlossaryTermDefinitionImpl <em>Term Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Glossary.impl.GlossaryTermDefinitionImpl
	 * @see QWiki.Glossary.impl.GlossaryPackageImpl#getGlossaryTermDefinition()
	 * @generated
	 */
	int GLOSSARY_TERM_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_DEFINITION__OWNED_ELEMENT = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_DEFINITION__OWNER = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_DEFINITION__OWNED_COMMENT = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_DEFINITION__DIRECTED_RELATIONSHIP = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_DEFINITION__RELATIONSHIP = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_DEFINITION__TAG = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_DEFINITION__CUSTOM_PROPERTY = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_DEFINITION__MODEL = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_DEFINITION__UUID = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_DEFINITION__SUPERSEEDING_RELATIONSHIP = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__SUPERSEEDING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_DEFINITION__NAMESPACE = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_DEFINITION__NAME = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_DEFINITION__QUALIFIED_NAME = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_DEFINITION__DISPLAY_NAME = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_DEFINITION__PURPOSE = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__PURPOSE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_DEFINITION__BODY = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__BODY;

	/**
	 * The feature id for the '<em><b>Owning Term</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_DEFINITION__OWNING_TERM = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Term Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_DEFINITION_FEATURE_COUNT = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_DEFINITION___ALL_OWNED_ELEMENTS = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_DEFINITION___MUST_BE_OWNED = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_DEFINITION___MODEL = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT___MODEL;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_DEFINITION___OID = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_DEFINITION___ALL_NAMESPACES = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_DEFINITION___SEPARATOR = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_DEFINITION___QUALIFIED_NAME = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT___QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Term Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_DEFINITION_OPERATION_COUNT = I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QWiki.Glossary.impl.GlossaryTermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Glossary.impl.GlossaryTermImpl
	 * @see QWiki.Glossary.impl.GlossaryPackageImpl#getGlossaryTerm()
	 * @generated
	 */
	int GLOSSARY_TERM = 1;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM__OWNED_ELEMENT = I18NPackage.I1_8N_NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM__OWNER = I18NPackage.I1_8N_NAMED_ELEMENT__OWNER;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM__OWNED_COMMENT = I18NPackage.I1_8N_NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Directed Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM__DIRECTED_RELATIONSHIP = I18NPackage.I1_8N_NAMED_ELEMENT__DIRECTED_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM__RELATIONSHIP = I18NPackage.I1_8N_NAMED_ELEMENT__RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM__TAG = I18NPackage.I1_8N_NAMED_ELEMENT__TAG;

	/**
	 * The feature id for the '<em><b>Custom Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM__CUSTOM_PROPERTY = I18NPackage.I1_8N_NAMED_ELEMENT__CUSTOM_PROPERTY;

	/**
	 * The feature id for the '<em><b>Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM__MODEL = I18NPackage.I1_8N_NAMED_ELEMENT__MODEL;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM__UUID = I18NPackage.I1_8N_NAMED_ELEMENT__UUID;

	/**
	 * The feature id for the '<em><b>Superseeding Relationship</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM__SUPERSEEDING_RELATIONSHIP = I18NPackage.I1_8N_NAMED_ELEMENT__SUPERSEEDING_RELATIONSHIP;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM__NAMESPACE = I18NPackage.I1_8N_NAMED_ELEMENT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM__NAME = I18NPackage.I1_8N_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM__QUALIFIED_NAME = I18NPackage.I1_8N_NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM__DISPLAY_NAME = I18NPackage.I1_8N_NAMED_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Owned Term Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM__OWNED_TERM_DEFINITION = I18NPackage.I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM__ACRONYM = I18NPackage.I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Synonym</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM__SYNONYM = I18NPackage.I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Term Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM__TERM_DEFINITION = I18NPackage.I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>External Term Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM__EXTERNAL_TERM_DEFINITION = I18NPackage.I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_FEATURE_COUNT = I18NPackage.I1_8N_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM___ALL_OWNED_ELEMENTS = I18NPackage.I1_8N_NAMED_ELEMENT___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM___MUST_BE_OWNED = I18NPackage.I1_8N_NAMED_ELEMENT___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM___MODEL = I18NPackage.I1_8N_NAMED_ELEMENT___MODEL;

	/**
	 * The operation id for the '<em>Oid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM___OID = I18NPackage.I1_8N_NAMED_ELEMENT___OID;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM___ALL_NAMESPACES = I18NPackage.I1_8N_NAMED_ELEMENT___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM___SEPARATOR = I18NPackage.I1_8N_NAMED_ELEMENT___SEPARATOR;

	/**
	 * The operation id for the '<em>Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM___QUALIFIED_NAME = I18NPackage.I1_8N_NAMED_ELEMENT___QUALIFIED_NAME;

	/**
	 * The number of operations of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_TERM_OPERATION_COUNT = I18NPackage.I1_8N_NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link QWiki.Glossary.GlossaryTermDefinition <em>Term Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Definition</em>'.
	 * @see QWiki.Glossary.GlossaryTermDefinition
	 * @generated
	 */
	EClass getGlossaryTermDefinition();

	/**
	 * Returns the meta object for the container reference '{@link QWiki.Glossary.GlossaryTermDefinition#getOwningTerm <em>Owning Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning Term</em>'.
	 * @see QWiki.Glossary.GlossaryTermDefinition#getOwningTerm()
	 * @see #getGlossaryTermDefinition()
	 * @generated
	 */
	EReference getGlossaryTermDefinition_OwningTerm();

	/**
	 * Returns the meta object for class '{@link QWiki.Glossary.GlossaryTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see QWiki.Glossary.GlossaryTerm
	 * @generated
	 */
	EClass getGlossaryTerm();

	/**
	 * Returns the meta object for the containment reference list '{@link QWiki.Glossary.GlossaryTerm#getOwnedTermDefinition <em>Owned Term Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Term Definition</em>'.
	 * @see QWiki.Glossary.GlossaryTerm#getOwnedTermDefinition()
	 * @see #getGlossaryTerm()
	 * @generated
	 */
	EReference getGlossaryTerm_OwnedTermDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link QWiki.Glossary.GlossaryTerm#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Acronym</em>'.
	 * @see QWiki.Glossary.GlossaryTerm#getAcronym()
	 * @see #getGlossaryTerm()
	 * @generated
	 */
	EReference getGlossaryTerm_Acronym();

	/**
	 * Returns the meta object for the containment reference '{@link QWiki.Glossary.GlossaryTerm#getSynonym <em>Synonym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Synonym</em>'.
	 * @see QWiki.Glossary.GlossaryTerm#getSynonym()
	 * @see #getGlossaryTerm()
	 * @generated
	 */
	EReference getGlossaryTerm_Synonym();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Glossary.GlossaryTerm#getTermDefinition <em>Term Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Term Definition</em>'.
	 * @see QWiki.Glossary.GlossaryTerm#getTermDefinition()
	 * @see #getGlossaryTerm()
	 * @generated
	 */
	EReference getGlossaryTerm_TermDefinition();

	/**
	 * Returns the meta object for the reference list '{@link QWiki.Glossary.GlossaryTerm#getExternalTermDefinition <em>External Term Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>External Term Definition</em>'.
	 * @see QWiki.Glossary.GlossaryTerm#getExternalTermDefinition()
	 * @see #getGlossaryTerm()
	 * @generated
	 */
	EReference getGlossaryTerm_ExternalTermDefinition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GlossaryFactory getGlossaryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link QWiki.Glossary.impl.GlossaryTermDefinitionImpl <em>Term Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Glossary.impl.GlossaryTermDefinitionImpl
		 * @see QWiki.Glossary.impl.GlossaryPackageImpl#getGlossaryTermDefinition()
		 * @generated
		 */
		EClass GLOSSARY_TERM_DEFINITION = eINSTANCE.getGlossaryTermDefinition();

		/**
		 * The meta object literal for the '<em><b>Owning Term</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSSARY_TERM_DEFINITION__OWNING_TERM = eINSTANCE.getGlossaryTermDefinition_OwningTerm();

		/**
		 * The meta object literal for the '{@link QWiki.Glossary.impl.GlossaryTermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QWiki.Glossary.impl.GlossaryTermImpl
		 * @see QWiki.Glossary.impl.GlossaryPackageImpl#getGlossaryTerm()
		 * @generated
		 */
		EClass GLOSSARY_TERM = eINSTANCE.getGlossaryTerm();

		/**
		 * The meta object literal for the '<em><b>Owned Term Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSSARY_TERM__OWNED_TERM_DEFINITION = eINSTANCE.getGlossaryTerm_OwnedTermDefinition();

		/**
		 * The meta object literal for the '<em><b>Acronym</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSSARY_TERM__ACRONYM = eINSTANCE.getGlossaryTerm_Acronym();

		/**
		 * The meta object literal for the '<em><b>Synonym</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSSARY_TERM__SYNONYM = eINSTANCE.getGlossaryTerm_Synonym();

		/**
		 * The meta object literal for the '<em><b>Term Definition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSSARY_TERM__TERM_DEFINITION = eINSTANCE.getGlossaryTerm_TermDefinition();

		/**
		 * The meta object literal for the '<em><b>External Term Definition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSSARY_TERM__EXTERNAL_TERM_DEFINITION = eINSTANCE.getGlossaryTerm_ExternalTermDefinition();

	}

} //GlossaryPackage
