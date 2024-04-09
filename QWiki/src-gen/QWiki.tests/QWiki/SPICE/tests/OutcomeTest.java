/**
 */
package QWiki.Spice.tests;

import QWiki.Kernel.tests.I18nNamedElementTest;

import QWiki.Spice.Outcome;
import QWiki.Spice.SPICEFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Outcome</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link QWiki.Spice.Outcome#oid() <em>Oid</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class OutcomeTest extends I18nNamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OutcomeTest.class);
	}

	/**
	 * Constructs a new Outcome test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutcomeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Outcome test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Outcome getFixture() {
		return (Outcome)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SPICEFactory.eINSTANCE.createOutcome());
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

	/**
	 * Tests the '{@link QWiki.Spice.Outcome#oid() <em>Oid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Spice.Outcome#oid()
	 * @generated
	 */
	public void testOid_1() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //OutcomeTest
