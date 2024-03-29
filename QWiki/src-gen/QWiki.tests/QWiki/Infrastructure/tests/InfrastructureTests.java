/**
 */
package QWiki.Infrastructure.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Infrastructure</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfrastructureTests extends TestSuite {

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
		TestSuite suite = new InfrastructureTests("Infrastructure Tests");
		suite.addTestSuite(UmlAssociationTest.class);
		suite.addTestSuite(UmlCommentTest.class);
		suite.addTestSuite(UmlPackageTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureTests(String name) {
		super(name);
	}

} //InfrastructureTests
