/**
 */
package QWiki.tests;

import QWiki.I18nKeyedString;
import QWiki.QWikiFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>I1 8n Keyed String</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class I18nKeyedStringTest extends I18nBaseStringTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(I18nKeyedStringTest.class);
	}

	/**
	 * Constructs a new I1 8n Keyed String test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I18nKeyedStringTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this I1 8n Keyed String test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected I18nKeyedString getFixture() {
		return (I18nKeyedString)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QWikiFactory.eINSTANCE.createI18nKeyedString());
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

} //I18nKeyedStringTest
