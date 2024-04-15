/**
 */
package QWiki.Relationships.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Relationships</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationshipsTests extends TestSuite {

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
		TestSuite suite = new RelationshipsTests("Relationships Tests");
		suite.addTestSuite(DO_NOT_USE_RelationshipTypeTest.class);
		suite.addTestSuite(DO_NOT_USE_SuperseedingRelationshipTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipsTests(String name) {
		super(name);
	}

} //RelationshipsTests
