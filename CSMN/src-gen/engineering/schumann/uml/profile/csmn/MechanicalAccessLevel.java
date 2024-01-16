/**
 */
package engineering.schumann.uml.profile.csmn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Mechanical Access Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getMechanicalAccessLevel()
 * @model
 * @generated
 */
public enum MechanicalAccessLevel implements Enumerator {
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
	 * The '<em><b>Open</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN(1, "Open", "Open"),

	/**
	 * The '<em><b>Covered No Tools</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COVERED_NO_TOOLS_VALUE
	 * @generated
	 * @ordered
	 */
	COVERED_NO_TOOLS(2, "CoveredNoTools", "CoveredNoTools"),

	/**
	 * The '<em><b>Covered Simple Tools</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COVERED_SIMPLE_TOOLS_VALUE
	 * @generated
	 * @ordered
	 */
	COVERED_SIMPLE_TOOLS(3, "CoveredSimpleTools", "CoveredSimpleTools"),

	/**
	 * The '<em><b>Dismantle Required</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISMANTLE_REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	DISMANTLE_REQUIRED(4, "DismantleRequired", "DismantleRequired"),

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(5, "None", "None");

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
	 * The '<em><b>Open</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN
	 * @model name="Open"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_VALUE = 1;

	/**
	 * The '<em><b>Covered No Tools</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COVERED_NO_TOOLS
	 * @model name="CoveredNoTools"
	 * @generated
	 * @ordered
	 */
	public static final int COVERED_NO_TOOLS_VALUE = 2;

	/**
	 * The '<em><b>Covered Simple Tools</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COVERED_SIMPLE_TOOLS
	 * @model name="CoveredSimpleTools"
	 * @generated
	 * @ordered
	 */
	public static final int COVERED_SIMPLE_TOOLS_VALUE = 3;

	/**
	 * The '<em><b>Dismantle Required</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISMANTLE_REQUIRED
	 * @model name="DismantleRequired"
	 * @generated
	 * @ordered
	 */
	public static final int DISMANTLE_REQUIRED_VALUE = 4;

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Mechanical Access Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MechanicalAccessLevel[] VALUES_ARRAY =
		new MechanicalAccessLevel[] {
			UNSPECIFIED,
			OPEN,
			COVERED_NO_TOOLS,
			COVERED_SIMPLE_TOOLS,
			DISMANTLE_REQUIRED,
			NONE,
		};

	/**
	 * A public read-only list of all the '<em><b>Mechanical Access Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MechanicalAccessLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mechanical Access Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MechanicalAccessLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MechanicalAccessLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mechanical Access Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MechanicalAccessLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MechanicalAccessLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mechanical Access Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MechanicalAccessLevel get(int value) {
		switch (value) {
			case UNSPECIFIED_VALUE: return UNSPECIFIED;
			case OPEN_VALUE: return OPEN;
			case COVERED_NO_TOOLS_VALUE: return COVERED_NO_TOOLS;
			case COVERED_SIMPLE_TOOLS_VALUE: return COVERED_SIMPLE_TOOLS;
			case DISMANTLE_REQUIRED_VALUE: return DISMANTLE_REQUIRED;
			case NONE_VALUE: return NONE;
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
	private MechanicalAccessLevel(int value, String name, String literal) {
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
	
} //MechanicalAccessLevel
