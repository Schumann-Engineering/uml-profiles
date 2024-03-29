/**
 */
package QWiki.Kernel.tests;

import QWiki.I18N.tests.I18nNamedElementTest;

import QWiki.Kernel.KernelFactory;
import QWiki.Kernel.ModelDomain;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Model Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link QWiki.Kernel.ModelDomain#allDomainElement() <em>All Domain Element</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class ModelDomainTest extends I18nNamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModelDomainTest.class);
	}

	/**
	 * Constructs a new Model Domain test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelDomainTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Model Domain test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ModelDomain getFixture() {
		return (ModelDomain)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KernelFactory.eINSTANCE.createModelDomain());
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
	 * Tests the '{@link QWiki.Kernel.ModelDomain#allDomainElement() <em>All Domain Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Kernel.ModelDomain#allDomainElement()
	 * @generated
	 */
	public void testAllDomainElement() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //ModelDomainTest
