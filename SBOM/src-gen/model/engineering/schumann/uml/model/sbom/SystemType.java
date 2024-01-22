/**
 */
package engineering.schumann.uml.model.sbom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>System Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getSystemType()
 * @model
 * @generated
 */
public enum SystemType implements Enumerator {
	/**
	 * The '<em><b>Hardware</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARDWARE_VALUE
	 * @generated
	 * @ordered
	 */
	HARDWARE(0, "Hardware", "Hardware"),

	/**
	 * The '<em><b>Firmware</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRMWARE_VALUE
	 * @generated
	 * @ordered
	 */
	FIRMWARE(1, "Firmware", "Firmware"),

	/**
	 * The '<em><b>Application</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION(2, "Application", "Application"),

	/**
	 * The '<em><b>Operating System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATING_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATING_SYSTEM(3, "OperatingSystem", "OperatingSystem");

	/**
	 * The '<em><b>Hardware</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARDWARE
	 * @model name="Hardware"
	 * @generated
	 * @ordered
	 */
	public static final int HARDWARE_VALUE = 0;

	/**
	 * The '<em><b>Firmware</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRMWARE
	 * @model name="Firmware"
	 * @generated
	 * @ordered
	 */
	public static final int FIRMWARE_VALUE = 1;

	/**
	 * The '<em><b>Application</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION
	 * @model name="Application"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_VALUE = 2;

	/**
	 * The '<em><b>Operating System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATING_SYSTEM
	 * @model name="OperatingSystem"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATING_SYSTEM_VALUE = 3;

	/**
	 * An array of all the '<em><b>System Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SystemType[] VALUES_ARRAY =
		new SystemType[] {
			HARDWARE,
			FIRMWARE,
			APPLICATION,
			OPERATING_SYSTEM,
		};

	/**
	 * A public read-only list of all the '<em><b>System Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SystemType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>System Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SystemType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SystemType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>System Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SystemType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SystemType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>System Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SystemType get(int value) {
		switch (value) {
			case HARDWARE_VALUE: return HARDWARE;
			case FIRMWARE_VALUE: return FIRMWARE;
			case APPLICATION_VALUE: return APPLICATION;
			case OPERATING_SYSTEM_VALUE: return OPERATING_SYSTEM;
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
	private SystemType(int value, String name, String literal) {
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
	
} //SystemType
