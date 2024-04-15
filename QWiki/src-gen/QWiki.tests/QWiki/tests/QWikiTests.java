/**
 */
package QWiki.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>QWiki</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class QWikiTests extends TestSuite {

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
		TestSuite suite = new QWikiTests("QWiki Tests");
		suite.addTestSuite(L10nKeyedStringTest.class);
		suite.addTestSuite(QWikiEncryptionKeyTest.class);
		suite.addTestSuite(QWikiModelTest.class);
		suite.addTestSuite(QWikiContainerTest.class);
		suite.addTestSuite(L10nStringTest.class);
		suite.addTestSuite(QWikiCommentTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWikiTests(String name) {
		super(name);
	}

} //QWikiTests
