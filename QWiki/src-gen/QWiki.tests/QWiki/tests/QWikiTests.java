/**
 */
package QWiki.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>QWiki</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class QWikiTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new QWikiTests("QWiki Tests");
		suite.addTestSuite(AuthorTest.class);
		suite.addTestSuite(CommentTest.class);
		suite.addTestSuite(I18nStringTest.class);
		suite.addTestSuite(I18nBaseStringTest.class);
		suite.addTestSuite(QWikiModelTest.class);
		suite.addTestSuite(I18nKeyedStringTest.class);
		suite.addTestSuite(DomainTest.class);
		suite.addTestSuite(PackageTest.class);
		suite.addTestSuite(DocumentTest.class);
		suite.addTestSuite(DocumentVersionTest.class);
		suite.addTestSuite(SectionTest.class);
		suite.addTestSuite(RoleTest.class);
		suite.addTestSuite(ProcessReferenceModelTest.class);
		suite.addTestSuite(SuperseedingRelationshipTest.class);
		suite.addTestSuite(TermTest.class);
		suite.addTestSuite(TermDefinitionTest.class);
		suite.addTestSuite(AssociationTest.class);
		suite.addTestSuite(RelationshipTypeTest.class);
		suite.addTestSuite(BasePractiseTest.class);
		suite.addTestSuite(ProcessTest.class);
		suite.addTestSuite(ProcessGroupTest.class);
		suite.addTestSuite(OutcomeTest.class);
		suite.addTestSuite(WorkProductTest.class);
		suite.addTestSuite(GenericWorkProductTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWikiTests(String name) {
		super(name);
	}

} //QWikiTests
