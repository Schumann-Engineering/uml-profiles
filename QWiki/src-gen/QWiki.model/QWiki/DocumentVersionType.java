/**
 */
package QWiki;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Document Version Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see QWiki.QWikiPackage#getDocumentVersionType()
 * @model
 * @generated
 */
public enum DocumentVersionType implements Enumerator {
	/**
	 * The '<em><b>Addendum</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDENDUM_VALUE
	 * @generated
	 * @ordered
	 */
	ADDENDUM(0, "Addendum", "Addendum"),

	/**
	 * The '<em><b>Amendment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMENDMENT_VALUE
	 * @generated
	 * @ordered
	 */
	AMENDMENT(1, "Amendment", "Amendment"),

	/**
	 * The '<em><b>Corrigendum</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORRIGENDUM_VALUE
	 * @generated
	 * @ordered
	 */
	CORRIGENDUM(2, "Corrigendum", "Corrigendum"),

	/**
	 * The '<em><b>First Edition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_EDITION_VALUE
	 * @generated
	 * @ordered
	 */
	FIRST_EDITION(3, "FirstEdition", "FirstEdition");

	/**
	 * The '<em><b>Addendum</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDENDUM
	 * @model name="Addendum"
	 * @generated
	 * @ordered
	 */
	public static final int ADDENDUM_VALUE = 0;

	/**
	 * The '<em><b>Amendment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMENDMENT
	 * @model name="Amendment"
	 * @generated
	 * @ordered
	 */
	public static final int AMENDMENT_VALUE = 1;

	/**
	 * The '<em><b>Corrigendum</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORRIGENDUM
	 * @model name="Corrigendum"
	 * @generated
	 * @ordered
	 */
	public static final int CORRIGENDUM_VALUE = 2;

	/**
	 * The '<em><b>First Edition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_EDITION
	 * @model name="FirstEdition"
	 * @generated
	 * @ordered
	 */
	public static final int FIRST_EDITION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Document Version Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DocumentVersionType[] VALUES_ARRAY =
		new DocumentVersionType[] {
			ADDENDUM,
			AMENDMENT,
			CORRIGENDUM,
			FIRST_EDITION,
		};

	/**
	 * A public read-only list of all the '<em><b>Document Version Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DocumentVersionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Document Version Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DocumentVersionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DocumentVersionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Document Version Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DocumentVersionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DocumentVersionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Document Version Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DocumentVersionType get(int value) {
		switch (value) {
			case ADDENDUM_VALUE: return ADDENDUM;
			case AMENDMENT_VALUE: return AMENDMENT;
			case CORRIGENDUM_VALUE: return CORRIGENDUM;
			case FIRST_EDITION_VALUE: return FIRST_EDITION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DocumentVersionType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //DocumentVersionType
