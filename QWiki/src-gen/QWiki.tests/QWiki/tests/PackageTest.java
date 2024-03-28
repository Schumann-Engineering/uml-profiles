/**
 */
package QWiki.tests;

import QWiki.QWikiFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link QWiki.Package#getNestingPackage() <em>Nesting Package</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PackageTest extends NamespaceTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PackageTest.class);
	}

	/**
	 * Constructs a new Package test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Package test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected QWiki.Package getFixture() {
		return (QWiki.Package)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QWikiFactory.eINSTANCE.createPackage());
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
	 * Tests the '{@link QWiki.Package#getNestingPackage() <em>Nesting Package</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Package#getNestingPackage()
	 * @generated
	 */
	public void testGetNestingPackage() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link QWiki.Package#setNestingPackage(QWiki.Package) <em>Nesting Package</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.Package#setNestingPackage(QWiki.Package)
	 * @generated
	 */
	public void testSetNestingPackage() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //PackageTest
