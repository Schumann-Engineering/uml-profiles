/**
 */
package engineering.schumann.uml.profile.csmn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Energy Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getEnergyType()
 * @model
 * @generated
 */
public enum EnergyType implements Enumerator {
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
	 * The '<em><b>Force</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORCE_VALUE
	 * @generated
	 * @ordered
	 */
	FORCE(1, "Force", "Force"),

	/**
	 * The '<em><b>Heat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAT_VALUE
	 * @generated
	 * @ordered
	 */
	HEAT(2, "Heat", "Heat"), /**
	 * The '<em><b>Kinetic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KINETIC_VALUE
	 * @generated
	 * @ordered
	 */
	KINETIC(3, "Kinetic", "Kinetic"),

	/**
	 * The '<em><b>Light</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHT(4, "Light", "Light"),

	/**
	 * The '<em><b>Power</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_VALUE
	 * @generated
	 * @ordered
	 */
	POWER(5, "Power", "Power"),

	/**
	 * The '<em><b>Sound</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUND_VALUE
	 * @generated
	 * @ordered
	 */
	SOUND(6, "Sound", "Sound"),

	/**
	 * The '<em><b>Vibration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIBRATION_VALUE
	 * @generated
	 * @ordered
	 */
	VIBRATION(7, "Vibration", "Vibration");

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
	 * The '<em><b>Force</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORCE
	 * @model name="Force"
	 * @generated
	 * @ordered
	 */
	public static final int FORCE_VALUE = 1;

	/**
	 * The '<em><b>Heat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEAT
	 * @model name="Heat"
	 * @generated
	 * @ordered
	 */
	public static final int HEAT_VALUE = 2;

	/**
	 * The '<em><b>Kinetic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KINETIC
	 * @model name="Kinetic"
	 * @generated
	 * @ordered
	 */
	public static final int KINETIC_VALUE = 3;

	/**
	 * The '<em><b>Light</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHT
	 * @model name="Light"
	 * @generated
	 * @ordered
	 */
	public static final int LIGHT_VALUE = 4;

	/**
	 * The '<em><b>Power</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER
	 * @model name="Power"
	 * @generated
	 * @ordered
	 */
	public static final int POWER_VALUE = 5;

	/**
	 * The '<em><b>Sound</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOUND
	 * @model name="Sound"
	 * @generated
	 * @ordered
	 */
	public static final int SOUND_VALUE = 6;

	/**
	 * The '<em><b>Vibration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIBRATION
	 * @model name="Vibration"
	 * @generated
	 * @ordered
	 */
	public static final int VIBRATION_VALUE = 7;

	/**
	 * An array of all the '<em><b>Energy Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EnergyType[] VALUES_ARRAY =
		new EnergyType[] {
			UNSPECIFIED,
			FORCE,
			HEAT,
			KINETIC,
			LIGHT,
			POWER,
			SOUND,
			VIBRATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Energy Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EnergyType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Energy Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnergyType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnergyType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Energy Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnergyType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EnergyType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Energy Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EnergyType get(int value) {
		switch (value) {
			case UNSPECIFIED_VALUE: return UNSPECIFIED;
			case FORCE_VALUE: return FORCE;
			case HEAT_VALUE: return HEAT;
			case KINETIC_VALUE: return KINETIC;
			case LIGHT_VALUE: return LIGHT;
			case POWER_VALUE: return POWER;
			case SOUND_VALUE: return SOUND;
			case VIBRATION_VALUE: return VIBRATION;
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
	private EnergyType(int value, String name, String literal) {
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
	
} //EnergyType
