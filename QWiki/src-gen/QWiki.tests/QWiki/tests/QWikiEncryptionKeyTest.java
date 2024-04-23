/**
 */
package QWiki.tests;

import QWiki.QWikiEncryptionKey;
import QWiki.QWikiFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Encryption Key</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QWikiEncryptionKeyTest extends QWikiNamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QWikiEncryptionKeyTest.class);
	}

	/**
	 * Constructs a new Encryption Key test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWikiEncryptionKeyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Encryption Key test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected QWikiEncryptionKey getFixture() {
		return (QWikiEncryptionKey)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QWikiFactory.eINSTANCE.createQWikiEncryptionKey());
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

} //QWikiEncryptionKeyTest