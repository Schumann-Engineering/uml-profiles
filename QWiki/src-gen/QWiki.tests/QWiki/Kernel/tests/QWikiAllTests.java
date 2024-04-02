/**
 */
package QWiki.Kernel.tests;

import QWiki.Domain.tests.DomainTests;

import QWiki.Glossary.tests.GlossaryTests;

import QWiki.Kernel.Relationships.tests.RelationshipsTests;

import QWiki.Rasci.tests.RASCITests;

import QWiki.References.tests.ReferencesTests;

import QWiki.Spice.tests.SPICETests;

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
		suite.addTest(KernelTests.suite());
		suite.addTest(RelationshipsTests.suite());
		suite.addTest(SPICETests.suite());
		suite.addTest(RASCITests.suite());
		suite.addTest(ReferencesTests.suite());
		suite.addTest(GlossaryTests.suite());
		suite.addTest(DomainTests.suite());
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
