/**
 */
package engineering.schumann.uml.model.sbom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Relationship Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see engineering.schumann.uml.model.sbom.SBOMPackage#getRelationshipType()
 * @model
 * @generated
 */
public enum RelationshipType implements Enumerator {
	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "Unknown", "Unknown"),

	/**
	 * The '<em><b>Contains</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINS(1, "contains", "contains"),

	/**
	 * The '<em><b>Is Contained By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_CONTAINED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	IS_CONTAINED_BY(2, "isContainedBy", "isContainedBy"),

	/**
	 * The '<em><b>Requires</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIRES_VALUE
	 * @generated
	 * @ordered
	 */
	REQUIRES(3, "requires", "requires"),

	/**
	 * The '<em><b>Is Required By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_REQUIRED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	IS_REQUIRED_BY(4, "isRequiredBy", "isRequiredBy"), /**
	 * The '<em><b>Runs On</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUNS_ON_VALUE
	 * @generated
	 * @ordered
	 */
	RUNS_ON(5, "runsOn", "runsOn"), /**
	 * The '<em><b>Runs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUNS_VALUE
	 * @generated
	 * @ordered
	 */
	RUNS(6, "runs", "runs"), /**
	 * The '<em><b>Describes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCRIBES_VALUE
	 * @generated
	 * @ordered
	 */
	DESCRIBES(7, "describes", "describes"), /**
	 * The '<em><b>Is Described By</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_DESCRIBED_BY_VALUE
	 * @generated
	 * @ordered
	 */
	IS_DESCRIBED_BY(8, "isDescribedBy", "isDescribedBy");

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="Unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>Contains</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINS
	 * @model name="contains"
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINS_VALUE = 1;

	/**
	 * The '<em><b>Is Contained By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_CONTAINED_BY
	 * @model name="isContainedBy"
	 * @generated
	 * @ordered
	 */
	public static final int IS_CONTAINED_BY_VALUE = 2;

	/**
	 * The '<em><b>Requires</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUIRES
	 * @model name="requires"
	 * @generated
	 * @ordered
	 */
	public static final int REQUIRES_VALUE = 3;

	/**
	 * The '<em><b>Is Required By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_REQUIRED_BY
	 * @model name="isRequiredBy"
	 * @generated
	 * @ordered
	 */
	public static final int IS_REQUIRED_BY_VALUE = 4;

	/**
	 * The '<em><b>Runs On</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUNS_ON
	 * @model name="runsOn"
	 * @generated
	 * @ordered
	 */
	public static final int RUNS_ON_VALUE = 5;

	/**
	 * The '<em><b>Runs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUNS
	 * @model name="runs"
	 * @generated
	 * @ordered
	 */
	public static final int RUNS_VALUE = 6;

	/**
	 * The '<em><b>Describes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCRIBES
	 * @model name="describes"
	 * @generated
	 * @ordered
	 */
	public static final int DESCRIBES_VALUE = 7;

	/**
	 * The '<em><b>Is Described By</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_DESCRIBED_BY
	 * @model name="isDescribedBy"
	 * @generated
	 * @ordered
	 */
	public static final int IS_DESCRIBED_BY_VALUE = 8;

	/**
	 * An array of all the '<em><b>Relationship Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RelationshipType[] VALUES_ARRAY =
		new RelationshipType[] {
			UNKNOWN,
			CONTAINS,
			IS_CONTAINED_BY,
			REQUIRES,
			IS_REQUIRED_BY,
			RUNS_ON,
			RUNS,
			DESCRIBES,
			IS_DESCRIBED_BY,
		};

	/**
	 * A public read-only list of all the '<em><b>Relationship Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RelationshipType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Relationship Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationshipType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationshipType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relationship Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationshipType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationshipType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relationship Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RelationshipType get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case CONTAINS_VALUE: return CONTAINS;
			case IS_CONTAINED_BY_VALUE: return IS_CONTAINED_BY;
			case REQUIRES_VALUE: return REQUIRES;
			case IS_REQUIRED_BY_VALUE: return IS_REQUIRED_BY;
			case RUNS_ON_VALUE: return RUNS_ON;
			case RUNS_VALUE: return RUNS;
			case DESCRIBES_VALUE: return DESCRIBES;
			case IS_DESCRIBED_BY_VALUE: return IS_DESCRIBED_BY;
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
	private RelationshipType(int value, String name, String literal) {
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
	
} //RelationshipType
