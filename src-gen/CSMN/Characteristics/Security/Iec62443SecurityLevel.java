/**
 */
package CSMN.Characteristics.Security;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Iec62443 Security Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CSMN.Characteristics.Security.SecurityPackage#getIec62443SecurityLevel()
 * @model
 * @generated
 */
public enum Iec62443SecurityLevel implements Enumerator {
	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "Unknown", "Unknown"),

	/**
	 * The '<em><b>Not Applicable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_APPLICABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_APPLICABLE(1, "NotApplicable", "NotApplicable"),

	/**
	 * The '<em><b>Level0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL0_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL0(2, "Level0", "Level0"),

	/**
	 * The '<em><b>Level1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL1_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL1(3, "Level1", "Level1"),

	/**
	 * The '<em><b>Level2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL2_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL2(4, "Level2", "Level2"),

	/**
	 * The '<em><b>Level3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL3_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL3(5, "Level3", "Level3"),

	/**
	 * The '<em><b>Level4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL4_VALUE
	 * @generated
	 * @ordered
	 */
	LEVEL4(6, "Level4", "Level4");

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="Unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>Not Applicable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_APPLICABLE
	 * @model name="NotApplicable"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_APPLICABLE_VALUE = 1;

	/**
	 * The '<em><b>Level0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL0
	 * @model name="Level0"
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL0_VALUE = 2;

	/**
	 * The '<em><b>Level1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL1
	 * @model name="Level1"
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL1_VALUE = 3;

	/**
	 * The '<em><b>Level2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL2
	 * @model name="Level2"
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL2_VALUE = 4;

	/**
	 * The '<em><b>Level3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL3
	 * @model name="Level3"
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL3_VALUE = 5;

	/**
	 * The '<em><b>Level4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEVEL4
	 * @model name="Level4"
	 * @generated
	 * @ordered
	 */
	public static final int LEVEL4_VALUE = 6;

	/**
	 * An array of all the '<em><b>Iec62443 Security Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Iec62443SecurityLevel[] VALUES_ARRAY =
		new Iec62443SecurityLevel[] {
			UNKNOWN,
			NOT_APPLICABLE,
			LEVEL0,
			LEVEL1,
			LEVEL2,
			LEVEL3,
			LEVEL4,
		};

	/**
	 * A public read-only list of all the '<em><b>Iec62443 Security Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Iec62443SecurityLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Iec62443 Security Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Iec62443SecurityLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Iec62443SecurityLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Iec62443 Security Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Iec62443SecurityLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Iec62443SecurityLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Iec62443 Security Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Iec62443SecurityLevel get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case NOT_APPLICABLE_VALUE: return NOT_APPLICABLE;
			case LEVEL0_VALUE: return LEVEL0;
			case LEVEL1_VALUE: return LEVEL1;
			case LEVEL2_VALUE: return LEVEL2;
			case LEVEL3_VALUE: return LEVEL3;
			case LEVEL4_VALUE: return LEVEL4;
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
	private Iec62443SecurityLevel(int value, String name, String literal) {
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
	
} //Iec62443SecurityLevel
