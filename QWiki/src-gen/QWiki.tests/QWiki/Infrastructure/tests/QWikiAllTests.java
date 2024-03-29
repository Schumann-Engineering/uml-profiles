/**
 */
package QWiki.Infrastructure.tests;

import QWiki.Bibliography.tests.BibliographyTests;

import QWiki.Glossary.tests.GlossaryTests;

import QWiki.I18N.tests.I18NTests;
import QWiki.Kernel.tests.KernelTests;

import QWiki.RASCI.tests.RASCITests;

import QWiki.SPICE.tests.SPICETests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>QWiki</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class QWikiAllTests extends TestSuite {

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
		TestSuite suite = new QWikiAllTests("QWiki Tests");
		suite.addTest(InfrastructureTests.suite());
		suite.addTest(KernelTests.suite());
		suite.addTest(I18NTests.suite());
		suite.addTest(SPICETests.suite());
		suite.addTest(RASCITests.suite());
		suite.addTest(BibliographyTests.suite());
		suite.addTest(GlossaryTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWikiAllTests(String name) {
		super(name);
	}

} //QWikiAllTests
