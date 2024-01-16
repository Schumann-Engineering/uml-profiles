/**
 */
package engineering.schumann.uml.profile.csmn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Usage Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getUsageType()
 * @model
 * @generated
 */
public enum UsageType implements Enumerator {
	/**
	 * The '<em><b>Unspecified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	UNSPECIFIED(0, "Unspecified", "Unspecified"),

	/**
	 * The '<em><b>Everytime</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVERYTIME_VALUE
	 * @generated
	 * @ordered
	 */
	EVERYTIME(1, "Everytime", "Everytime"),

	/**
	 * The '<em><b>Mosttime</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOSTTIME_VALUE
	 * @generated
	 * @ordered
	 */
	MOSTTIME(2, "Mosttime", "Mosttime"),

	/**
	 * The '<em><b>Sometimes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOMETIMES_VALUE
	 * @generated
	 * @ordered
	 */
	SOMETIMES(3, "Sometimes", "Sometimes"),

	/**
	 * The '<em><b>Setup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SETUP_VALUE
	 * @generated
	 * @ordered
	 */
	SETUP(4, "Setup", "Setup"),

	/**
	 * The '<em><b>Maintenance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAINTENANCE_VALUE
	 * @generated
	 * @ordered
	 */
	MAINTENANCE(5, "Maintenance", "Maintenance"),

	/**
	 * The '<em><b>Manufacturing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUFACTURING_VALUE
	 * @generated
	 * @ordered
	 */
	MANUFACTURING(6, "Manufacturing", "Manufacturing");

	/**
	 * The '<em><b>Unspecified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSPECIFIED
	 * @model name="Unspecified"
	 * @generated
	 * @ordered
	 */
	public static final int UNSPECIFIED_VALUE = 0;

	/**
	 * The '<em><b>Everytime</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVERYTIME
	 * @model name="Everytime"
	 * @generated
	 * @ordered
	 */
	public static final int EVERYTIME_VALUE = 1;

	/**
	 * The '<em><b>Mosttime</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOSTTIME
	 * @model name="Mosttime"
	 * @generated
	 * @ordered
	 */
	public static final int MOSTTIME_VALUE = 2;

	/**
	 * The '<em><b>Sometimes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOMETIMES
	 * @model name="Sometimes"
	 * @generated
	 * @ordered
	 */
	public static final int SOMETIMES_VALUE = 3;

	/**
	 * The '<em><b>Setup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SETUP
	 * @model name="Setup"
	 * @generated
	 * @ordered
	 */
	public static final int SETUP_VALUE = 4;

	/**
	 * The '<em><b>Maintenance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAINTENANCE
	 * @model name="Maintenance"
	 * @generated
	 * @ordered
	 */
	public static final int MAINTENANCE_VALUE = 5;

	/**
	 * The '<em><b>Manufacturing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUFACTURING
	 * @model name="Manufacturing"
	 * @generated
	 * @ordered
	 */
	public static final int MANUFACTURING_VALUE = 6;

	/**
	 * An array of all the '<em><b>Usage Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UsageType[] VALUES_ARRAY =
		new UsageType[] {
			UNSPECIFIED,
			EVERYTIME,
			MOSTTIME,
			SOMETIMES,
			SETUP,
			MAINTENANCE,
			MANUFACTURING,
		};

	/**
	 * A public read-only list of all the '<em><b>Usage Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UsageType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Usage Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UsageType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UsageType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Usage Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UsageType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UsageType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Usage Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UsageType get(int value) {
		switch (value) {
			case UNSPECIFIED_VALUE: return UNSPECIFIED;
			case EVERYTIME_VALUE: return EVERYTIME;
			case MOSTTIME_VALUE: return MOSTTIME;
			case SOMETIMES_VALUE: return SOMETIMES;
			case SETUP_VALUE: return SETUP;
			case MAINTENANCE_VALUE: return MAINTENANCE;
			case MANUFACTURING_VALUE: return MANUFACTURING;
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
	private UsageType(int value, String name, String literal) {
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
	
} //UsageType
