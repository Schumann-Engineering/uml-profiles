/**
 */
package QWiki.Kernel.tests;

import QWiki.Kernel.KernelFactory;
import QWiki.Kernel.QWikiComment;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>QWiki Comment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QWikiCommentTest extends QWikiElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QWikiCommentTest.class);
	}

	/**
	 * Constructs a new QWiki Comment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWikiCommentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this QWiki Comment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected QWikiComment getFixture() {
		return (QWikiComment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KernelFactory.eINSTANCE.createQWikiComment());
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

} //QWikiCommentTest
