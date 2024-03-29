/**
 */
package QWiki.Bibliography.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Bibliography</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class BibliographyTests extends TestSuite {

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
		TestSuite suite = new BibliographyTests("Bibliography Tests");
		suite.addTestSuite(AuthorTest.class);
		suite.addTestSuite(DocumentTest.class);
		suite.addTestSuite(DocumentVersionTest.class);
		suite.addTestSuite(SectionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BibliographyTests(String name) {
		super(name);
	}

} //BibliographyTests
