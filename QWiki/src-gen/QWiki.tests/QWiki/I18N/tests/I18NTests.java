/**
 */
package QWiki.I18N.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>I18N</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class I18NTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new I18NTests("I18N Tests");
		suite.addTestSuite(I18nBaseStringTest.class);
		suite.addTestSuite(I18nStringTest.class);
		suite.addTestSuite(I18nKeyedStringTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public I18NTests(String name) {
		super(name);
	}

} //I18NTests
