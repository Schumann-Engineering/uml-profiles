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
public class _Tests extends TestSuite {

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
		TestSuite suite = new _Tests("I18N Tests");
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
	public _Tests(String name) {
		super(name);
	}

} //_Tests
