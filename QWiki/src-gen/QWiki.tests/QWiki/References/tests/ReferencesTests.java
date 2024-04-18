/**
 */
package QWiki.References.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>References</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReferencesTests extends TestSuite {

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
		TestSuite suite = new ReferencesTests("References Tests");
		suite.addTestSuite(AuthorTest.class);
		suite.addTestSuite(ReferenceTest.class);
		suite.addTestSuite(ReferenceVersionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencesTests(String name) {
		super(name);
	}

} //ReferencesTests
