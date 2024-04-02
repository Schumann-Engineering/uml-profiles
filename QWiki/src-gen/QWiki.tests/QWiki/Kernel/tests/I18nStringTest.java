/**
 */
package QWiki.Kernel.tests;

import QWiki.Kernel.I18nString;
import QWiki.Kernel.KernelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>I1 8n String</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class I18nStringTest extends I18nBaseStringTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(I18nStringTest.class);
	}

	/**
	 * Constructs a new I1 8n String test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I18nStringTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this I1 8n String test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected I18nString getFixture() {
		return (I18nString)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KernelFactory.eINSTANCE.createI18nString());
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

} //I18nStringTest
