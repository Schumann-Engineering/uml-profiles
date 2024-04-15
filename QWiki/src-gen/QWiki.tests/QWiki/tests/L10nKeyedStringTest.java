/**
 */
package QWiki.tests;

import QWiki.L10nKeyedString;
import QWiki.QWikiFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>L1 0n Keyed String</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class L10nKeyedStringTest extends L10nBaseStringTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(L10nKeyedStringTest.class);
	}

	/**
	 * Constructs a new L1 0n Keyed String test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public L10nKeyedStringTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this L1 0n Keyed String test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected L10nKeyedString getFixture() {
		return (L10nKeyedString)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QWikiFactory.eINSTANCE.createL10nKeyedString());
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

} //L10nKeyedStringTest
