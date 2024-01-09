/**
 */
package CSMN.PrimitiveTypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Speed Unit Of Measurement</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see CSMN.PrimitiveTypes.PrimitiveTypesPackage#getSpeedUnitOfMeasurement()
 * @model
 * @generated
 */
public enum SpeedUnitOfMeasurement implements Enumerator {
	/**
	 * The '<em><b>Gigabit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GIGABIT_VALUE
	 * @generated
	 * @ordered
	 */
	GIGABIT(0, "Gigabit", "Gigabit"),

	/**
	 * The '<em><b>Megabit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEGABIT_VALUE
	 * @generated
	 * @ordered
	 */
	MEGABIT(1, "Megabit", "Megabit"),

	/**
	 * The '<em><b>Kilobit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KILOBIT_VALUE
	 * @generated
	 * @ordered
	 */
	KILOBIT(2, "Kilobit", "Kilobit"),

	/**
	 * The '<em><b>Baud</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAUD_VALUE
	 * @generated
	 * @ordered
	 */
	BAUD(3, "Baud", "Baud");

	/**
	 * The '<em><b>Gigabit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GIGABIT
	 * @model name="Gigabit"
	 * @generated
	 * @ordered
	 */
	public static final int GIGABIT_VALUE = 0;

	/**
	 * The '<em><b>Megabit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEGABIT
	 * @model name="Megabit"
	 * @generated
	 * @ordered
	 */
	public static final int MEGABIT_VALUE = 1;

	/**
	 * The '<em><b>Kilobit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KILOBIT
	 * @model name="Kilobit"
	 * @generated
	 * @ordered
	 */
	public static final int KILOBIT_VALUE = 2;

	/**
	 * The '<em><b>Baud</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAUD
	 * @model name="Baud"
	 * @generated
	 * @ordered
	 */
	public static final int BAUD_VALUE = 3;

	/**
	 * An array of all the '<em><b>Speed Unit Of Measurement</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SpeedUnitOfMeasurement[] VALUES_ARRAY =
		new SpeedUnitOfMeasurement[] {
			GIGABIT,
			MEGABIT,
			KILOBIT,
			BAUD,
		};

	/**
	 * A public read-only list of all the '<em><b>Speed Unit Of Measurement</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SpeedUnitOfMeasurement> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Speed Unit Of Measurement</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpeedUnitOfMeasurement get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpeedUnitOfMeasurement result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Speed Unit Of Measurement</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpeedUnitOfMeasurement getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpeedUnitOfMeasurement result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Speed Unit Of Measurement</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpeedUnitOfMeasurement get(int value) {
		switch (value) {
			case GIGABIT_VALUE: return GIGABIT;
			case MEGABIT_VALUE: return MEGABIT;
			case KILOBIT_VALUE: return KILOBIT;
			case BAUD_VALUE: return BAUD;
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
	private SpeedUnitOfMeasurement(int value, String name, String literal) {
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
	
} //SpeedUnitOfMeasurement
