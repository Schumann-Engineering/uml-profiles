/**
 */
package QWiki.Infrastructure.tests;

import QWiki.Infrastructure.InfrastructureFactory;
import QWiki.Infrastructure.UmlAssociation;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Uml Association</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlAssociationTest extends UmlRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UmlAssociationTest.class);
	}

	/**
	 * Constructs a new Uml Association test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlAssociationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Uml Association test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UmlAssociation getFixture() {
		return (UmlAssociation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InfrastructureFactory.eINSTANCE.createUmlAssociation());
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

} //UmlAssociationTest
