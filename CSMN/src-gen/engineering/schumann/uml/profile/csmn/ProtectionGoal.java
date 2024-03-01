/**
 */
package engineering.schumann.uml.profile.csmn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Protection Goal</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getProtectionGoal()
 * @model
 * @generated
 */
public enum ProtectionGoal implements Enumerator {
	/**
	 * The '<em><b>Confidentiality</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIDENTIALITY_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIDENTIALITY(0, "Confidentiality", "Confidentiality"),

	/**
	 * The '<em><b>Integrity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRITY_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGRITY(1, "Integrity", "Integrity"),

	/**
	 * The '<em><b>Availability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVAILABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	AVAILABILITY(2, "Availability", "Availability"),

	/**
	 * The '<em><b>Usability</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USABILITY_VALUE
	 * @generated
	 * @ordered
	 */
	USABILITY(3, "Usability", "Usability"),

	/**
	 * The '<em><b>Money</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONEY_VALUE
	 * @generated
	 * @ordered
	 */
	MONEY(4, "Money", "Money"),

	/**
	 * The '<em><b>Legal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGAL_VALUE
	 * @generated
	 * @ordered
	 */
	LEGAL(5, "Legal", "Legal"), /**
	 * The '<em><b>Authenticity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHENTICITY_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHENTICITY(6, "Authenticity", "Authenticity"), /**
	 * The '<em><b>Non Repudiation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_REPUDIATION_VALUE
	 * @generated
	 * @ordered
	 */
	NON_REPUDIATION(7, "NonRepudiation", "NonRepudiation");

	/**
	 * The '<em><b>Confidentiality</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIDENTIALITY
	 * @model name="Confidentiality"
	 * @generated
	 * @ordered
	 */
	public static final int CONFIDENTIALITY_VALUE = 0;

	/**
	 * The '<em><b>Integrity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGRITY
	 * @model name="Integrity"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGRITY_VALUE = 1;

	/**
	 * The '<em><b>Availability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVAILABILITY
	 * @model name="Availability"
	 * @generated
	 * @ordered
	 */
	public static final int AVAILABILITY_VALUE = 2;

	/**
	 * The '<em><b>Usability</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USABILITY
	 * @model name="Usability"
	 * @generated
	 * @ordered
	 */
	public static final int USABILITY_VALUE = 3;

	/**
	 * The '<em><b>Money</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONEY
	 * @model name="Money"
	 * @generated
	 * @ordered
	 */
	public static final int MONEY_VALUE = 4;

	/**
	 * The '<em><b>Legal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGAL
	 * @model name="Legal"
	 * @generated
	 * @ordered
	 */
	public static final int LEGAL_VALUE = 5;

	/**
	 * The '<em><b>Authenticity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHENTICITY
	 * @model name="Authenticity"
	 * @generated
	 * @ordered
	 */
	public static final int AUTHENTICITY_VALUE = 6;

	/**
	 * The '<em><b>Non Repudiation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_REPUDIATION
	 * @model name="NonRepudiation"
	 * @generated
	 * @ordered
	 */
	public static final int NON_REPUDIATION_VALUE = 7;

	/**
	 * An array of all the '<em><b>Protection Goal</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProtectionGoal[] VALUES_ARRAY =
		new ProtectionGoal[] {
			CONFIDENTIALITY,
			INTEGRITY,
			AVAILABILITY,
			USABILITY,
			MONEY,
			LEGAL,
			AUTHENTICITY,
			NON_REPUDIATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Protection Goal</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProtectionGoal> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Protection Goal</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtectionGoal get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProtectionGoal result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Protection Goal</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtectionGoal getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProtectionGoal result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Protection Goal</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtectionGoal get(int value) {
		switch (value) {
			case CONFIDENTIALITY_VALUE: return CONFIDENTIALITY;
			case INTEGRITY_VALUE: return INTEGRITY;
			case AVAILABILITY_VALUE: return AVAILABILITY;
			case USABILITY_VALUE: return USABILITY;
			case MONEY_VALUE: return MONEY;
			case LEGAL_VALUE: return LEGAL;
			case AUTHENTICITY_VALUE: return AUTHENTICITY;
			case NON_REPUDIATION_VALUE: return NON_REPUDIATION;
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
	private ProtectionGoal(int value, String name, String literal) {
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
	
} //ProtectionGoal
