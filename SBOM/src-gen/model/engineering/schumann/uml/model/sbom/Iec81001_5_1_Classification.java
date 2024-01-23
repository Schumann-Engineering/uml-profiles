/**
 */
package engineering.schumann.uml.model.sbom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Iec81001 51Classification</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getIec81001_5_1_Classification()
 * @model
 * @generated
 */
public enum Iec81001_5_1_Classification implements Enumerator {
	/**
	 * The '<em><b>MAINTAINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAINTAINED_VALUE
	 * @generated
	 * @ordered
	 */
	MAINTAINED(0, "MAINTAINED", "MAINTAINED"),

	/**
	 * The '<em><b>SUPPORTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPORTED_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPORTED(1, "SUPPORTED", "SUPPORTED"),

	/**
	 * The '<em><b>REQUIRED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIRED(2, "REQUIRED", "REQUIRED");

	/**
	 * The '<em><b>MAINTAINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAINTAINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAINTAINED_VALUE = 0;

	/**
	 * The '<em><b>SUPPORTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPORTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUPPORTED_VALUE = 1;

	/**
	 * The '<em><b>REQUIRED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIRED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Iec81001 51Classification</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Iec81001_5_1_Classification[] VALUES_ARRAY =
		new Iec81001_5_1_Classification[] {
			MAINTAINED,
			SUPPORTED,
			REQUIRED,
		};

	/**
	 * A public read-only list of all the '<em><b>Iec81001 51Classification</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Iec81001_5_1_Classification> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Iec81001 51Classification</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Iec81001_5_1_Classification get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Iec81001_5_1_Classification result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Iec81001 51Classification</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Iec81001_5_1_Classification getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Iec81001_5_1_Classification result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Iec81001 51Classification</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Iec81001_5_1_Classification get(int value) {
		switch (value) {
			case MAINTAINED_VALUE: return MAINTAINED;
			case SUPPORTED_VALUE: return SUPPORTED;
			case REQUIRED_VALUE: return REQUIRED;
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
	private Iec81001_5_1_Classification(int value, String name, String literal) {
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
	
} //Iec81001_5_1_Classification
