/**
 */
package QWiki.Glossary.tests;

import QWiki.Glossary.GlossaryFactory;
import QWiki.Glossary.GlossaryTermDefinition;
import QWiki.tests.L10nDescriptiveElementTest;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Term Definition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlossaryTermDefinitionTest extends L10nDescriptiveElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GlossaryTermDefinitionTest.class);
	}

	/**
	 * Constructs a new Term Definition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlossaryTermDefinitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Term Definition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GlossaryTermDefinition getFixture() {
		return (GlossaryTermDefinition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GlossaryFactory.eINSTANCE.createGlossaryTermDefinition());
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

} //GlossaryTermDefinitionTest
