/**
 */
package QWiki.Rasci.tests;

import QWiki.Rasci.RasciFactory;
import QWiki.Rasci.Role;
import QWiki.tests.L10nDescriptiveElementTest;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link QWiki.Rasci.Role#objectId() <em>Object Id</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class RoleTest extends L10nDescriptiveElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RoleTest.class);
	}

	/**
	 * Constructs a new Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Role getFixture() {
		return (Role)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RasciFactory.eINSTANCE.createRole());
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
	 * Tests the '{@link QWiki.Rasci.Role#objectId() <em>Object Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Rasci.Role#objectId()
	 * @generated
	 */
	public void testObjectId() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //RoleTest
