/**
 */
package QWiki.Spice.tests;

import QWiki.Spice.SpiceFactory;
import QWiki.Spice.WorkProductRelationshipType;

import QWiki.tests.QWikiRelationshipTypeTest;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Work Product Relationship Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkProductRelationshipTypeTest extends QWikiRelationshipTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorkProductRelationshipTypeTest.class);
	}

	/**
	 * Constructs a new Work Product Relationship Type test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductRelationshipTypeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Work Product Relationship Type test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WorkProductRelationshipType getFixture() {
		return (WorkProductRelationshipType)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SpiceFactory.eINSTANCE.createWorkProductRelationshipType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //WorkProductRelationshipTypeTest
