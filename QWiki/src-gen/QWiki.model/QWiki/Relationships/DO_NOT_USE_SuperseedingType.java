/**
 */
package QWiki.Relationships;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>DO NOT USE Superseeding Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see QWiki.Relationships.RelationshipsPackage#getDO_NOT_USE_SuperseedingType()
 * @model
 * @generated
 */
public enum DO_NOT_USE_SuperseedingType implements Enumerator {
	/**
	 * The '<em><b>Added</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDED_VALUE
	 * @generated
	 * @ordered
	 */
	ADDED(0, "Added", "Added"),

	/**
	 * The '<em><b>Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL(1, "Equal", "Equal"),

	/**
	 * The '<em><b>Updated Major</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATED_MAJOR_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATED_MAJOR(2, "UpdatedMajor", "UpdatedMajor"),

	/**
	 * The '<em><b>Updated Minor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATED_MINOR_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATED_MINOR(3, "UpdatedMinor", "UpdatedMinor"),

	/**
	 * The '<em><b>Removed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVED_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVED(4, "Removed", "Removed");

	/**
	 * The '<em><b>Added</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDED
	 * @model name="Added"
	 * @generated
	 * @ordered
	 */
	public static final int ADDED_VALUE = 0;

	/**
	 * The '<em><b>Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL
	 * @model name="Equal"
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_VALUE = 1;

	/**
	 * The '<em><b>Updated Major</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATED_MAJOR
	 * @model name="UpdatedMajor"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATED_MAJOR_VALUE = 2;

	/**
	 * The '<em><b>Updated Minor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATED_MINOR
	 * @model name="UpdatedMinor"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATED_MINOR_VALUE = 3;

	/**
	 * The '<em><b>Removed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REMOVED
	 * @model name="Removed"
	 * @generated
	 * @ordered
	 */
	public static final int REMOVED_VALUE = 4;

	/**
	 * An array of all the '<em><b>DO NOT USE Superseeding Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DO_NOT_USE_SuperseedingType[] VALUES_ARRAY =
		new DO_NOT_USE_SuperseedingType[] {
			ADDED,
			EQUAL,
			UPDATED_MAJOR,
			UPDATED_MINOR,
			REMOVED,
		};

	/**
	 * A public read-only list of all the '<em><b>DO NOT USE Superseeding Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DO_NOT_USE_SuperseedingType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>DO NOT USE Superseeding Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DO_NOT_USE_SuperseedingType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DO_NOT_USE_SuperseedingType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DO NOT USE Superseeding Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DO_NOT_USE_SuperseedingType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DO_NOT_USE_SuperseedingType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>DO NOT USE Superseeding Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DO_NOT_USE_SuperseedingType get(int value) {
		switch (value) {
			case ADDED_VALUE: return ADDED;
			case EQUAL_VALUE: return EQUAL;
			case UPDATED_MAJOR_VALUE: return UPDATED_MAJOR;
			case UPDATED_MINOR_VALUE: return UPDATED_MINOR;
			case REMOVED_VALUE: return REMOVED;
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
	private DO_NOT_USE_SuperseedingType(int value, String name, String literal) {
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
	
} //DO_NOT_USE_SuperseedingType
