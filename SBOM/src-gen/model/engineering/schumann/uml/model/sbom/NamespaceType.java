/**
 */
package engineering.schumann.uml.model.sbom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Namespace Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getNamespaceType()
 * @model
 * @generated
 */
public enum NamespaceType implements Enumerator {
	/**
	 * The '<em><b>Application</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION(0, "Application", "Application"),

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
	 * The '<em><b>Hardware</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARDWARE_VALUE
	 * @generated
	 * @ordered
	 */
	HARDWARE(2, "Hardware", "Hardware"),

	/**
	 * The '<em><b>Library</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIBRARY_VALUE
	 * @generated
	 * @ordered
	 */
	LIBRARY(3, "Library", "Library"),

	/**
	 * The '<em><b>Operating System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATING_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATING_SYSTEM(4, "OperatingSystem", "OperatingSystem");

	/**
	 * The '<em><b>Application</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION
	 * @model name="Application"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_VALUE = 0;

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
	 * The '<em><b>Hardware</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARDWARE
	 * @model name="Hardware"
	 * @generated
	 * @ordered
	 */
	public static final int HARDWARE_VALUE = 2;

	/**
	 * The '<em><b>Library</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIBRARY
	 * @model name="Library"
	 * @generated
	 * @ordered
	 */
	public static final int LIBRARY_VALUE = 3;

	/**
	 * The '<em><b>Operating System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATING_SYSTEM
	 * @model name="OperatingSystem"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATING_SYSTEM_VALUE = 4;

	/**
	 * An array of all the '<em><b>Namespace Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NamespaceType[] VALUES_ARRAY =
		new NamespaceType[] {
			APPLICATION,
			FIRMWARE,
			HARDWARE,
			LIBRARY,
			OPERATING_SYSTEM,
		};

	/**
	 * A public read-only list of all the '<em><b>Namespace Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NamespaceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Namespace Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NamespaceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NamespaceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Namespace Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NamespaceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NamespaceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Namespace Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NamespaceType get(int value) {
		switch (value) {
			case APPLICATION_VALUE: return APPLICATION;
			case FIRMWARE_VALUE: return FIRMWARE;
			case HARDWARE_VALUE: return HARDWARE;
			case LIBRARY_VALUE: return LIBRARY;
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
	private NamespaceType(int value, String name, String literal) {
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
	
} //NamespaceType
