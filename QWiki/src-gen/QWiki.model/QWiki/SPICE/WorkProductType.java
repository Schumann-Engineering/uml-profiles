/**
 */
package QWiki.Spice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Work Product Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see QWiki.Spice.SPICEPackage#getWorkProductType()
 * @model
 * @generated
 */
public enum WorkProductType implements Enumerator {
	/**
	 * The '<em><b>Artefact</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARTEFACT_VALUE
	 * @generated
	 * @ordered
	 */
	ARTEFACT(0, "Artefact", "Artefact"),

	/**
	 * The '<em><b>Document</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENT(1, "Document", "Document"),

	/**
	 * The '<em><b>Generic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC_VALUE
	 * @generated
	 * @ordered
	 */
	GENERIC(2, "Generic", "Generic"),

	/**
	 * The '<em><b>Shippable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHIPPABLE_VALUE
	 * @generated
	 * @ordered
	 */
	SHIPPABLE(3, "Shippable", "Shippable");

	/**
	 * The '<em><b>Artefact</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARTEFACT
	 * @model name="Artefact"
	 * @generated
	 * @ordered
	 */
	public static final int ARTEFACT_VALUE = 0;

	/**
	 * The '<em><b>Document</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENT
	 * @model name="Document"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_VALUE = 1;

	/**
	 * The '<em><b>Generic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC
	 * @model name="Generic"
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_VALUE = 2;

	/**
	 * The '<em><b>Shippable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHIPPABLE
	 * @model name="Shippable"
	 * @generated
	 * @ordered
	 */
	public static final int SHIPPABLE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Work Product Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WorkProductType[] VALUES_ARRAY =
		new WorkProductType[] {
			ARTEFACT,
			DOCUMENT,
			GENERIC,
			SHIPPABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Work Product Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WorkProductType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Work Product Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WorkProductType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WorkProductType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Work Product Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WorkProductType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WorkProductType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Work Product Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WorkProductType get(int value) {
		switch (value) {
			case ARTEFACT_VALUE: return ARTEFACT;
			case DOCUMENT_VALUE: return DOCUMENT;
			case GENERIC_VALUE: return GENERIC;
			case SHIPPABLE_VALUE: return SHIPPABLE;
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
	private WorkProductType(int value, String name, String literal) {
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
	
} //WorkProductType
