/**
 */
package QWiki.tests;

import QWiki.ProcessReferenceModel;
import QWiki.QWikiFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Process Reference Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessReferenceModelTest extends I18nDescriptiveElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcessReferenceModelTest.class);
	}

	/**
	 * Constructs a new Process Reference Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessReferenceModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Process Reference Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProcessReferenceModel getFixture() {
		return (ProcessReferenceModel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QWikiFactory.eINSTANCE.createProcessReferenceModel());
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

} //ProcessReferenceModelTest
