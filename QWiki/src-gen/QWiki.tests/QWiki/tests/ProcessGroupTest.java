/**
 */
package QWiki.tests;

import QWiki.ProcessGroup;
import QWiki.QWikiFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Process Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link QWiki.ProcessGroup#oid() <em>Oid</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ProcessGroupTest extends SpiceElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcessGroupTest.class);
	}

	/**
	 * Constructs a new Process Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessGroupTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Process Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProcessGroup getFixture() {
		return (ProcessGroup)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QWikiFactory.eINSTANCE.createProcessGroup());
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
	 * Tests the '{@link QWiki.ProcessGroup#oid() <em>Oid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.ProcessGroup#oid()
	 * @generated
	 */
	public void testOid() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //ProcessGroupTest
