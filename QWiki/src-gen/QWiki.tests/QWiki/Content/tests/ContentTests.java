/**
 */
package QWiki.Content.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Content</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentTests extends TestSuite {

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
		TestSuite suite = new ContentTests("Content Tests");
		suite.addTestSuite(LayoutTest.class);
		suite.addTestSuite(TextTest.class);
		suite.addTestSuite(BlockTest.class);
		suite.addTestSuite(PanelTest.class);
		suite.addTestSuite(SectionTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentTests(String name) {
		super(name);
	}

} //ContentTests
