/**
 */
package QWiki.Kernel.tests;

import QWiki.Kernel.KernelFactory;
import QWiki.Kernel.QWikiContainer;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>QWiki Container</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QWikiContainerTest extends QWikiNamespaceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QWikiContainerTest.class);
	}

	/**
	 * Constructs a new QWiki Container test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWikiContainerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this QWiki Container test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected QWikiContainer getFixture() {
		return (QWikiContainer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(KernelFactory.eINSTANCE.createQWikiContainer());
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

} //QWikiContainerTest
