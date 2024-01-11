/**
 */
package engineering.schumann.uml.profile.csmn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>User Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getUserType()
 * @model
 * @generated
 */
public enum UserType implements Enumerator {
	/**
	 * The '<em><b>Generic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC_VALUE
	 * @generated
	 * @ordered
	 */
	GENERIC(0, "Generic", "Generic"),

	/**
	 * The '<em><b>Administrator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMINISTRATOR_VALUE
	 * @generated
	 * @ordered
	 */
	ADMINISTRATOR(1, "Administrator", "Administrator"),

	/**
	 * The '<em><b>Attacker</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTACKER_VALUE
	 * @generated
	 * @ordered
	 */
	ATTACKER(2, "Attacker", "Attacker"),

	/**
	 * The '<em><b>Auditor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDITOR_VALUE
	 * @generated
	 * @ordered
	 */
	AUDITOR(3, "Auditor", "Auditor"),

	/**
	 * The '<em><b>Authority</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHORITY_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHORITY(4, "Authority", "Authority"),

	/**
	 * The '<em><b>Ethical Hacker</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETHICAL_HACKER_VALUE
	 * @generated
	 * @ordered
	 */
	ETHICAL_HACKER(5, "EthicalHacker", "EthicalHacker"),

	/**
	 * The '<em><b>Operator</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATOR_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATOR(6, "Operator", "Operator"),

	/**
	 * The '<em><b>Operator Educated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATOR_EDUCATED_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATOR_EDUCATED(7, "OperatorEducated", "OperatorEducated"),

	/**
	 * The '<em><b>Owner</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OWNER_VALUE
	 * @generated
	 * @ordered
	 */
	OWNER(8, "Owner", "Owner"),

	/**
	 * The '<em><b>Patient</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENT_VALUE
	 * @generated
	 * @ordered
	 */
	PATIENT(9, "Patient", "Patient"),

	/**
	 * The '<em><b>Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE(10, "Service", "Service"),

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(11, "UNKNOWN", "UNKNOWN"),

	/**
	 * The '<em><b>Vendor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VENDOR_VALUE
	 * @generated
	 * @ordered
	 */
	VENDOR(12, "Vendor", "Vendor");

	/**
	 * The '<em><b>Generic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC
	 * @model name="Generic"
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_VALUE = 0;

	/**
	 * The '<em><b>Administrator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMINISTRATOR
	 * @model name="Administrator"
	 * @generated
	 * @ordered
	 */
	public static final int ADMINISTRATOR_VALUE = 1;

	/**
	 * The '<em><b>Attacker</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTACKER
	 * @model name="Attacker"
	 * @generated
	 * @ordered
	 */
	public static final int ATTACKER_VALUE = 2;

	/**
	 * The '<em><b>Auditor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDITOR
	 * @model name="Auditor"
	 * @generated
	 * @ordered
	 */
	public static final int AUDITOR_VALUE = 3;

	/**
	 * The '<em><b>Authority</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHORITY
	 * @model name="Authority"
	 * @generated
	 * @ordered
	 */
	public static final int AUTHORITY_VALUE = 4;

	/**
	 * The '<em><b>Ethical Hacker</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETHICAL_HACKER
	 * @model name="EthicalHacker"
	 * @generated
	 * @ordered
	 */
	public static final int ETHICAL_HACKER_VALUE = 5;

	/**
	 * The '<em><b>Operator</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATOR
	 * @model name="Operator"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATOR_VALUE = 6;

	/**
	 * The '<em><b>Operator Educated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATOR_EDUCATED
	 * @model name="OperatorEducated"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATOR_EDUCATED_VALUE = 7;

	/**
	 * The '<em><b>Owner</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OWNER
	 * @model name="Owner"
	 * @generated
	 * @ordered
	 */
	public static final int OWNER_VALUE = 8;

	/**
	 * The '<em><b>Patient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENT
	 * @model name="Patient"
	 * @generated
	 * @ordered
	 */
	public static final int PATIENT_VALUE = 9;

	/**
	 * The '<em><b>Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE
	 * @model name="Service"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_VALUE = 10;

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 11;

	/**
	 * The '<em><b>Vendor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VENDOR
	 * @model name="Vendor"
	 * @generated
	 * @ordered
	 */
	public static final int VENDOR_VALUE = 12;

	/**
	 * An array of all the '<em><b>User Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UserType[] VALUES_ARRAY =
		new UserType[] {
			GENERIC,
			ADMINISTRATOR,
			ATTACKER,
			AUDITOR,
			AUTHORITY,
			ETHICAL_HACKER,
			OPERATOR,
			OPERATOR_EDUCATED,
			OWNER,
			PATIENT,
			SERVICE,
			UNKNOWN,
			VENDOR,
		};

	/**
	 * A public read-only list of all the '<em><b>User Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UserType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>User Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UserType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UserType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>User Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UserType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UserType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>User Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UserType get(int value) {
		switch (value) {
			case GENERIC_VALUE: return GENERIC;
			case ADMINISTRATOR_VALUE: return ADMINISTRATOR;
			case ATTACKER_VALUE: return ATTACKER;
			case AUDITOR_VALUE: return AUDITOR;
			case AUTHORITY_VALUE: return AUTHORITY;
			case ETHICAL_HACKER_VALUE: return ETHICAL_HACKER;
			case OPERATOR_VALUE: return OPERATOR;
			case OPERATOR_EDUCATED_VALUE: return OPERATOR_EDUCATED;
			case OWNER_VALUE: return OWNER;
			case PATIENT_VALUE: return PATIENT;
			case SERVICE_VALUE: return SERVICE;
			case UNKNOWN_VALUE: return UNKNOWN;
			case VENDOR_VALUE: return VENDOR;
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
	private UserType(int value, String name, String literal) {
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
	
} //UserType
