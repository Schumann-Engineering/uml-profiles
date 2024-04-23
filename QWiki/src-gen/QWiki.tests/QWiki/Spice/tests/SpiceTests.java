/**
 */
package QWiki.Spice.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Spice</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpiceTests extends TestSuite {

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
		TestSuite suite = new SpiceTests("Spice Tests");
		suite.addTestSuite(BasePractiseTest.class);
		suite.addTestSuite(ProcessReferenceModelTest.class);
		suite.addTestSuite(ProcessTest.class);
		suite.addTestSuite(ProcessGroupTest.class);
		suite.addTestSuite(OutcomeTest.class);
		suite.addTestSuite(WorkProductTest.class);
		suite.addTestSuite(GenericWorkProductTest.class);
		suite.addTestSuite(WorkProductRelationshipTest.class);
		suite.addTestSuite(WorkProductRelationshipTypeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpiceTests(String name) {
		super(name);
	}

} //SpiceTests