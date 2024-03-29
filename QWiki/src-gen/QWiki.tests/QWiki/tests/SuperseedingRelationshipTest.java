/**
 */
package QWiki.tests;

import QWiki.QWikiFactory;
import QWiki.SuperseedingRelationship;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Superseeding Relationship</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SuperseedingRelationshipTest extends UmlDirectedRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SuperseedingRelationshipTest.class);
	}

	/**
	 * Constructs a new Superseeding Relationship test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuperseedingRelationshipTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Superseeding Relationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SuperseedingRelationship getFixture() {
		return (SuperseedingRelationship)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QWikiFactory.eINSTANCE.createSuperseedingRelationship());
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

} //SuperseedingRelationshipTest
