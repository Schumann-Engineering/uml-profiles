/**
 */
package engineering.schumann.uml.profile.csmn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Size Unit Of Measure</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getSizeUnitOfMeasure()
 * @model
 * @generated
 */
public enum SizeUnitOfMeasure implements Enumerator {
	/**
	 * The '<em><b>Gigabyte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GIGABYTE_VALUE
	 * @generated
	 * @ordered
	 */
	GIGABYTE(0, "Gigabyte", "Gigabyte"),

	/**
	 * The '<em><b>Megabyte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEGABYTE_VALUE
	 * @generated
	 * @ordered
	 */
	MEGABYTE(1, "Megabyte", "Megabyte"),

	/**
	 * The '<em><b>Kilobyte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KILOBYTE_VALUE
	 * @generated
	 * @ordered
	 */
	KILOBYTE(2, "Kilobyte", "Kilobyte"),

	/**
	 * The '<em><b>Byte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTE_VALUE
	 * @generated
	 * @ordered
	 */
	BYTE(3, "Byte", "Byte");

	/**
	 * The '<em><b>Gigabyte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GIGABYTE
	 * @model name="Gigabyte"
	 * @generated
	 * @ordered
	 */
	public static final int GIGABYTE_VALUE = 0;

	/**
	 * The '<em><b>Megabyte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEGABYTE
	 * @model name="Megabyte"
	 * @generated
	 * @ordered
	 */
	public static final int MEGABYTE_VALUE = 1;

	/**
	 * The '<em><b>Kilobyte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KILOBYTE
	 * @model name="Kilobyte"
	 * @generated
	 * @ordered
	 */
	public static final int KILOBYTE_VALUE = 2;

	/**
	 * The '<em><b>Byte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTE
	 * @model name="Byte"
	 * @generated
	 * @ordered
	 */
	public static final int BYTE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Size Unit Of Measure</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SizeUnitOfMeasure[] VALUES_ARRAY =
		new SizeUnitOfMeasure[] {
			GIGABYTE,
			MEGABYTE,
			KILOBYTE,
			BYTE,
		};

	/**
	 * A public read-only list of all the '<em><b>Size Unit Of Measure</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SizeUnitOfMeasure> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Size Unit Of Measure</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SizeUnitOfMeasure get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SizeUnitOfMeasure result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Size Unit Of Measure</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SizeUnitOfMeasure getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SizeUnitOfMeasure result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Size Unit Of Measure</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SizeUnitOfMeasure get(int value) {
		switch (value) {
			case GIGABYTE_VALUE: return GIGABYTE;
			case MEGABYTE_VALUE: return MEGABYTE;
			case KILOBYTE_VALUE: return KILOBYTE;
			case BYTE_VALUE: return BYTE;
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
	private SizeUnitOfMeasure(int value, String name, String literal) {
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
	
} //SizeUnitOfMeasure
