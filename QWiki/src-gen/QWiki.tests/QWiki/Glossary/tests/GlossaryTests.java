/**
 */
package QWiki.Glossary.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Glossary</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlossaryTests extends TestSuite {

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
		TestSuite suite = new GlossaryTests("Glossary Tests");
		suite.addTestSuite(GlossaryTermDefinitionTest.class);
		suite.addTestSuite(GlossaryTermTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlossaryTests(String name) {
		super(name);
	}

} //GlossaryTests
