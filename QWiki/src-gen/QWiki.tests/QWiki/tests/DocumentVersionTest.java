/**
 */
package QWiki.tests;

import QWiki.DocumentVersion;
import QWiki.QWikiFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Document Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link QWiki.DocumentVersion#getSuperseedingRelationship() <em>Superseeding Relationship</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link QWiki.DocumentVersion#oid() <em>Oid</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DocumentVersionTest extends ModelElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DocumentVersionTest.class);
	}

	/**
	 * Constructs a new Document Version test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentVersionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Document Version test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DocumentVersion getFixture() {
		return (DocumentVersion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QWikiFactory.eINSTANCE.createDocumentVersion());
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
	 * Tests the '{@link QWiki.DocumentVersion#getSuperseedingRelationship() <em>Superseeding Relationship</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.DocumentVersion#getSuperseedingRelationship()
	 * @generated
	 */
	public void testGetSuperseedingRelationship() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link QWiki.DocumentVersion#oid() <em>Oid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QWiki.DocumentVersion#oid()
	 * @generated
	 */
	public void testOid() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //DocumentVersionTest
