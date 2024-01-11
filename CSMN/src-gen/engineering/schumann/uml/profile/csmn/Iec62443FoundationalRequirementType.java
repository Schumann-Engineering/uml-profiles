/**
 */
package engineering.schumann.uml.profile.csmn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Iec62443 Foundational Requirement Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getIec62443FoundationalRequirementType()
 * @model
 * @generated
 */
public enum Iec62443FoundationalRequirementType implements Enumerator {
	/**
	 * The '<em><b>IAC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identification and AUTHENTICATION control (IAC)
	 * <!-- end-model-doc -->
	 * @see #IAC_VALUE
	 * @generated
	 * @ordered
	 */
	IAC(0, "IAC", "IAC"),

	/**
	 * The '<em><b>UC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use control (UC)
	 * <!-- end-model-doc -->
	 * @see #UC_VALUE
	 * @generated
	 * @ordered
	 */
	UC(1, "UC", "UC"),

	/**
	 * The '<em><b>SI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * System integrity (SI)
	 * <!-- end-model-doc -->
	 * @see #SI_VALUE
	 * @generated
	 * @ordered
	 */
	SI(2, "SI", "SI"),

	/**
	 * The '<em><b>DC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data confidentiality (DC)
	 * <!-- end-model-doc -->
	 * @see #DC_VALUE
	 * @generated
	 * @ordered
	 */
	DC(3, "DC", "DC"),

	/**
	 * The '<em><b>RDF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restricted data flow (RDF)
	 * <!-- end-model-doc -->
	 * @see #RDF_VALUE
	 * @generated
	 * @ordered
	 */
	RDF(4, "RDF", "RDF"),

	/**
	 * The '<em><b>TRE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Timely response to events (TRE)
	 * <!-- end-model-doc -->
	 * @see #TRE_VALUE
	 * @generated
	 * @ordered
	 */
	TRE(5, "TRE", "TRE"),

	/**
	 * The '<em><b>RA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource availability (RA)
	 * <!-- end-model-doc -->
	 * @see #RA_VALUE
	 * @generated
	 * @ordered
	 */
	RA(6, "RA", "RA");

	/**
	 * The '<em><b>IAC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identification and AUTHENTICATION control (IAC)
	 * <!-- end-model-doc -->
	 * @see #IAC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IAC_VALUE = 0;

	/**
	 * The '<em><b>UC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use control (UC)
	 * <!-- end-model-doc -->
	 * @see #UC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UC_VALUE = 1;

	/**
	 * The '<em><b>SI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * System integrity (SI)
	 * <!-- end-model-doc -->
	 * @see #SI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SI_VALUE = 2;

	/**
	 * The '<em><b>DC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data confidentiality (DC)
	 * <!-- end-model-doc -->
	 * @see #DC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DC_VALUE = 3;

	/**
	 * The '<em><b>RDF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restricted data flow (RDF)
	 * <!-- end-model-doc -->
	 * @see #RDF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RDF_VALUE = 4;

	/**
	 * The '<em><b>TRE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Timely response to events (TRE)
	 * <!-- end-model-doc -->
	 * @see #TRE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRE_VALUE = 5;

	/**
	 * The '<em><b>RA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource availability (RA)
	 * <!-- end-model-doc -->
	 * @see #RA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RA_VALUE = 6;

	/**
	 * An array of all the '<em><b>Iec62443 Foundational Requirement Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Iec62443FoundationalRequirementType[] VALUES_ARRAY =
		new Iec62443FoundationalRequirementType[] {
			IAC,
			UC,
			SI,
			DC,
			RDF,
			TRE,
			RA,
		};

	/**
	 * A public read-only list of all the '<em><b>Iec62443 Foundational Requirement Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Iec62443FoundationalRequirementType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Iec62443 Foundational Requirement Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Iec62443FoundationalRequirementType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Iec62443FoundationalRequirementType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Iec62443 Foundational Requirement Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Iec62443FoundationalRequirementType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Iec62443FoundationalRequirementType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Iec62443 Foundational Requirement Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Iec62443FoundationalRequirementType get(int value) {
		switch (value) {
			case IAC_VALUE: return IAC;
			case UC_VALUE: return UC;
			case SI_VALUE: return SI;
			case DC_VALUE: return DC;
			case RDF_VALUE: return RDF;
			case TRE_VALUE: return TRE;
			case RA_VALUE: return RA;
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
	private Iec62443FoundationalRequirementType(int value, String name, String literal) {
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
	
} //Iec62443FoundationalRequirementType
