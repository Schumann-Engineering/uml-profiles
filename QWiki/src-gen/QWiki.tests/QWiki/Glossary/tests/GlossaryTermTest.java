/**
 */
package QWiki.Glossary.tests;

import QWiki.Glossary.GlossaryFactory;
import QWiki.Glossary.GlossaryTerm;
import QWiki.tests.L10nNamedElementTest;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link QWiki.Glossary.GlossaryTerm#objectId() <em>Object Id</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class GlossaryTermTest extends L10nNamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GlossaryTermTest.class);
	}

	/**
	 * Constructs a new Term test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlossaryTermTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Term test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GlossaryTerm getFixture() {
		return (GlossaryTerm)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GlossaryFactory.eINSTANCE.createGlossaryTerm());
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

	/**
	 * Tests the '{@link QWiki.Glossary.GlossaryTerm#objectId() <em>Object Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Glossary.GlossaryTerm#objectId()
	 * @generated
	 */
	public void testObjectId() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //GlossaryTermTest
