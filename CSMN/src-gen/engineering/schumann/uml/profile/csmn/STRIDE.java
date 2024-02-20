/**
 */
package engineering.schumann.uml.profile.csmn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>STRIDE</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getSTRIDE()
 * @model
 * @generated
 */
public enum STRIDE implements Enumerator {
	/**
	 * The '<em><b>Spoofing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPOOFING_VALUE
	 * @generated
	 * @ordered
	 */
	SPOOFING(0, "Spoofing", "Spoofing"),

	/**
	 * The '<em><b>Tampering</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAMPERING_VALUE
	 * @generated
	 * @ordered
	 */
	TAMPERING(1, "Tampering", "Tampering"),

	/**
	 * The '<em><b>Repudiation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPUDIATION_VALUE
	 * @generated
	 * @ordered
	 */
	REPUDIATION(2, "Repudiation", "Repudiation"),

	/**
	 * The '<em><b>Information Disclosure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATION_DISCLOSURE_VALUE
	 * @generated
	 * @ordered
	 */
	INFORMATION_DISCLOSURE(3, "InformationDisclosure", "InformationDisclosure"),

	/**
	 * The '<em><b>Denial Of Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DENIAL_OF_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	DENIAL_OF_SERVICE(4, "DenialOfService", "DenialOfService"),

	/**
	 * The '<em><b>Elevation Of Privilege</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELEVATION_OF_PRIVILEGE_VALUE
	 * @generated
	 * @ordered
	 */
	ELEVATION_OF_PRIVILEGE(5, "ElevationOfPrivilege", "ElevationOfPrivilege");

	/**
	 * The '<em><b>Spoofing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPOOFING
	 * @model name="Spoofing"
	 * @generated
	 * @ordered
	 */
	public static final int SPOOFING_VALUE = 0;

	/**
	 * The '<em><b>Tampering</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAMPERING
	 * @model name="Tampering"
	 * @generated
	 * @ordered
	 */
	public static final int TAMPERING_VALUE = 1;

	/**
	 * The '<em><b>Repudiation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPUDIATION
	 * @model name="Repudiation"
	 * @generated
	 * @ordered
	 */
	public static final int REPUDIATION_VALUE = 2;

	/**
	 * The '<em><b>Information Disclosure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMATION_DISCLOSURE
	 * @model name="InformationDisclosure"
	 * @generated
	 * @ordered
	 */
	public static final int INFORMATION_DISCLOSURE_VALUE = 3;

	/**
	 * The '<em><b>Denial Of Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DENIAL_OF_SERVICE
	 * @model name="DenialOfService"
	 * @generated
	 * @ordered
	 */
	public static final int DENIAL_OF_SERVICE_VALUE = 4;

	/**
	 * The '<em><b>Elevation Of Privilege</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELEVATION_OF_PRIVILEGE
	 * @model name="ElevationOfPrivilege"
	 * @generated
	 * @ordered
	 */
	public static final int ELEVATION_OF_PRIVILEGE_VALUE = 5;

	/**
	 * An array of all the '<em><b>STRIDE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final STRIDE[] VALUES_ARRAY =
		new STRIDE[] {
			SPOOFING,
			TAMPERING,
			REPUDIATION,
			INFORMATION_DISCLOSURE,
			DENIAL_OF_SERVICE,
			ELEVATION_OF_PRIVILEGE,
		};

	/**
	 * A public read-only list of all the '<em><b>STRIDE</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<STRIDE> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>STRIDE</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static STRIDE get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			STRIDE result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>STRIDE</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static STRIDE getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			STRIDE result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>STRIDE</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static STRIDE get(int value) {
		switch (value) {
			case SPOOFING_VALUE: return SPOOFING;
			case TAMPERING_VALUE: return TAMPERING;
			case REPUDIATION_VALUE: return REPUDIATION;
			case INFORMATION_DISCLOSURE_VALUE: return INFORMATION_DISCLOSURE;
			case DENIAL_OF_SERVICE_VALUE: return DENIAL_OF_SERVICE;
			case ELEVATION_OF_PRIVILEGE_VALUE: return ELEVATION_OF_PRIVILEGE;
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
	private STRIDE(int value, String name, String literal) {
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
	
} //STRIDE
