/**
 */
package QWiki.tests;

import QWiki.Content.tests.ContentTests;
import QWiki.Domain.tests.DomainTests;

import QWiki.Glossary.tests.GlossaryTests;

import QWiki.Rasci.tests.RasciTests;

import QWiki.References.tests.ReferencesTests;

import QWiki.Relationships.tests.RelationshipsTests;

import QWiki.Spice.tests.SpiceTests;

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
		suite.addTest(QWikiTests.suite());
		suite.addTest(SpiceTests.suite());
		suite.addTest(RasciTests.suite());
		suite.addTest(ContentTests.suite());
		suite.addTest(GlossaryTests.suite());
		suite.addTest(ReferencesTests.suite());
		suite.addTest(DomainTests.suite());
		suite.addTest(RelationshipsTests.suite());
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
