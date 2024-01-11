/**
 */
package engineering.schumann.uml.profile.csmn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Storage Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Defines constants for drive types, including CDRom, Fixed, Network, NoRootDirectory, Ram, Removable, and Unknown.
 * <!-- end-model-doc -->
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getStorageType()
 * @model
 * @generated
 */
public enum StorageType implements Enumerator {
	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of storage is unknown.
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "Unknown", "Unknown"),

	/**
	 * The '<em><b>Removable By Operator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The storage is a removable storage device, such as a USB flash drive.
	 * The storage can be removed by an operator, either tool less or with simple tools.
	 * <!-- end-model-doc -->
	 * @see #REMOVABLE_BY_OPERATOR_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVABLE_BY_OPERATOR(1, "RemovableByOperator", "RemovableByOperator"),

	/**
	 * The '<em><b>Removable By Technician</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The storage is a removable storage device, such as a USB flash drive.
	 * The storage can not be removed by an operator. A technician has to open up the device using tools to access the storage.
	 * <!-- end-model-doc -->
	 * @see #REMOVABLE_BY_TECHNICIAN_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVABLE_BY_TECHNICIAN(2, "RemovableByTechnician", "RemovableByTechnician"),

	/**
	 * The '<em><b>Fixed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The storage is a fixed disk.
	 * <!-- end-model-doc -->
	 * @see #FIXED_VALUE
	 * @generated
	 * @ordered
	 */
	FIXED(3, "Fixed", "Fixed"),

	/**
	 * The '<em><b>Network</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The storage is a network drive.
	 * <!-- end-model-doc -->
	 * @see #NETWORK_VALUE
	 * @generated
	 * @ordered
	 */
	NETWORK(4, "Network", "Network"),

	/**
	 * The '<em><b>Cd Rom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The storage is an optical disc device, such as a CD or DVD-ROM.
	 * <!-- end-model-doc -->
	 * @see #CD_ROM_VALUE
	 * @generated
	 * @ordered
	 */
	CD_ROM(5, "CdRom", "CdRom"),

	/**
	 * The '<em><b>Ram</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The drive is a RAM disk.
	 * <!-- end-model-doc -->
	 * @see #RAM_VALUE
	 * @generated
	 * @ordered
	 */
	RAM(6, "Ram", "Ram");

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of storage is unknown.
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN
	 * @model name="Unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>Removable By Operator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The storage is a removable storage device, such as a USB flash drive.
	 * The storage can be removed by an operator, either tool less or with simple tools.
	 * <!-- end-model-doc -->
	 * @see #REMOVABLE_BY_OPERATOR
	 * @model name="RemovableByOperator"
	 * @generated
	 * @ordered
	 */
	public static final int REMOVABLE_BY_OPERATOR_VALUE = 1;

	/**
	 * The '<em><b>Removable By Technician</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The storage is a removable storage device, such as a USB flash drive.
	 * The storage can not be removed by an operator. A technician has to open up the device using tools to access the storage.
	 * <!-- end-model-doc -->
	 * @see #REMOVABLE_BY_TECHNICIAN
	 * @model name="RemovableByTechnician"
	 * @generated
	 * @ordered
	 */
	public static final int REMOVABLE_BY_TECHNICIAN_VALUE = 2;

	/**
	 * The '<em><b>Fixed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The storage is a fixed disk.
	 * <!-- end-model-doc -->
	 * @see #FIXED
	 * @model name="Fixed"
	 * @generated
	 * @ordered
	 */
	public static final int FIXED_VALUE = 3;

	/**
	 * The '<em><b>Network</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The storage is a network drive.
	 * <!-- end-model-doc -->
	 * @see #NETWORK
	 * @model name="Network"
	 * @generated
	 * @ordered
	 */
	public static final int NETWORK_VALUE = 4;

	/**
	 * The '<em><b>Cd Rom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The storage is an optical disc device, such as a CD or DVD-ROM.
	 * <!-- end-model-doc -->
	 * @see #CD_ROM
	 * @model name="CdRom"
	 * @generated
	 * @ordered
	 */
	public static final int CD_ROM_VALUE = 5;

	/**
	 * The '<em><b>Ram</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The drive is a RAM disk.
	 * <!-- end-model-doc -->
	 * @see #RAM
	 * @model name="Ram"
	 * @generated
	 * @ordered
	 */
	public static final int RAM_VALUE = 6;

	/**
	 * An array of all the '<em><b>Storage Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StorageType[] VALUES_ARRAY =
		new StorageType[] {
			UNKNOWN,
			REMOVABLE_BY_OPERATOR,
			REMOVABLE_BY_TECHNICIAN,
			FIXED,
			NETWORK,
			CD_ROM,
			RAM,
		};

	/**
	 * A public read-only list of all the '<em><b>Storage Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StorageType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Storage Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StorageType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StorageType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Storage Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StorageType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StorageType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Storage Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StorageType get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case REMOVABLE_BY_OPERATOR_VALUE: return REMOVABLE_BY_OPERATOR;
			case REMOVABLE_BY_TECHNICIAN_VALUE: return REMOVABLE_BY_TECHNICIAN;
			case FIXED_VALUE: return FIXED;
			case NETWORK_VALUE: return NETWORK;
			case CD_ROM_VALUE: return CD_ROM;
			case RAM_VALUE: return RAM;
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
	private StorageType(int value, String name, String literal) {
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
	
} //StorageType
