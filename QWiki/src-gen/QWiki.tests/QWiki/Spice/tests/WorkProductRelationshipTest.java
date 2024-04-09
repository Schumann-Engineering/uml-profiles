/**
 */
package QWiki.Spice.tests;

import QWiki.Kernel.tests.QWikiRelationshipTest;

import QWiki.Spice.SPICEFactory;
import QWiki.Spice.WorkProductRelationship;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Work Product Relationship</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkProductRelationshipTest extends QWikiRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorkProductRelationshipTest.class);
	}

	/**
	 * Constructs a new Work Product Relationship test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductRelationshipTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Work Product Relationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WorkProductRelationship getFixture() {
		return (WorkProductRelationship)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SPICEFactory.eINSTANCE.createWorkProductRelationship());
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

} //WorkProductRelationshipTest
