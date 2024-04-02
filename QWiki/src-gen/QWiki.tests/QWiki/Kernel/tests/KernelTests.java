/**
 */
package QWiki.Kernel.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Kernel</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class KernelTests extends TestSuite {

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
		TestSuite suite = new KernelTests("Kernel Tests");
		suite.addTestSuite(I18nKeyedStringTest.class);
		suite.addTestSuite(I18nBaseStringTest.class);
		suite.addTestSuite(I18nStringTest.class);
		suite.addTestSuite(QWikiCommentTest.class);
		suite.addTestSuite(QWikiContainerTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KernelTests(String name) {
		super(name);
	}

} //KernelTests
