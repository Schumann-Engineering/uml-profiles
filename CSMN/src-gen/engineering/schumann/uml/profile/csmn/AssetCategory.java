/**
 */
package engineering.schumann.uml.profile.csmn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Asset Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getAssetCategory()
 * @model
 * @generated
 */
public enum AssetCategory implements Enumerator {
	/**
	 * The '<em><b>UNSPECIFIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	UNSPECIFIED(0, "UNSPECIFIED", "UNSPECIFIED"), /**
	 * The '<em><b>Accessory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESSORY_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESSORY(1, "Accessory", "Accessory"),

	/**
	 * The '<em><b>Architecture Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARCHITECTURE_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	ARCHITECTURE_COMPONENT(2, "ArchitectureComponent", "ArchitectureComponent"), /**
	 * The '<em><b>Compliance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLIANCE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLIANCE(3, "Compliance", "Compliance"),

	/**
	 * The '<em><b>Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_VALUE
	 * @generated
	 * @ordered
	 */
	DATA(4, "Data", "Data"), /**
	 * The '<em><b>Environment And Resource</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENVIRONMENT_AND_RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	ENVIRONMENT_AND_RESOURCE(5, "EnvironmentAndResource", "EnvironmentAndResource"), /**
	 * The '<em><b>Essential Performance Feature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESSENTIAL_PERFORMANCE_FEATURE_VALUE
	 * @generated
	 * @ordered
	 */
	ESSENTIAL_PERFORMANCE_FEATURE(6, "EssentialPerformanceFeature", "EssentialPerformanceFeature"), /**
	 * The '<em><b>Feature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEATURE_VALUE
	 * @generated
	 * @ordered
	 */
	FEATURE(7, "Feature", "Feature"),

	/**
	 * The '<em><b>Hardware</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARDWARE_VALUE
	 * @generated
	 * @ordered
	 */
	HARDWARE(8, "Hardware", "Hardware"), /**
	 * The '<em><b>Infrastructure And Network</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFRASTRUCTURE_AND_NETWORK_VALUE
	 * @generated
	 * @ordered
	 */
	INFRASTRUCTURE_AND_NETWORK(9, "InfrastructureAndNetwork", "InfrastructureAndNetwork"), /**
	 * The '<em><b>Intellectual Property</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTELLECTUAL_PROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	INTELLECTUAL_PROPERTY(10, "IntellectualProperty", "IntellectualProperty"), /**
	 * The '<em><b>Interface</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERFACE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERFACE(11, "Interface", "Interface"), /**
	 * The '<em><b>Interfaces And Access</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERFACES_AND_ACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	INTERFACES_AND_ACCESS(12, "InterfacesAndAccess", "InterfacesAndAccess"), /**
	 * The '<em><b>Manufacturing Process</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUFACTURING_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	MANUFACTURING_PROCESS(13, "ManufacturingProcess", "ManufacturingProcess"), /**
	 * The '<em><b>People</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PEOPLE_VALUE
	 * @generated
	 * @ordered
	 */
	PEOPLE(14, "People", "People"), /**
	 * The '<em><b>Primary Operating Function</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIMARY_OPERATING_FUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	PRIMARY_OPERATING_FUNCTION(15, "PrimaryOperatingFunction", "PrimaryOperatingFunction"), /**
	 * The '<em><b>Property</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPERTY_VALUE
	 * @generated
	 * @ordered
	 */
	PROPERTY(16, "Property", "Property"), /**
	 * The '<em><b>Reputation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPUTATION_VALUE
	 * @generated
	 * @ordered
	 */
	REPUTATION(17, "Reputation", "Reputation");

	/**
	 * The '<em><b>UNSPECIFIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSPECIFIED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNSPECIFIED_VALUE = 0;

	/**
	 * The '<em><b>Accessory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESSORY
	 * @model name="Accessory"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESSORY_VALUE = 1;

	/**
	 * The '<em><b>Architecture Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARCHITECTURE_COMPONENT
	 * @model name="ArchitectureComponent"
	 * @generated
	 * @ordered
	 */
	public static final int ARCHITECTURE_COMPONENT_VALUE = 2;

	/**
	 * The '<em><b>Compliance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLIANCE
	 * @model name="Compliance"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLIANCE_VALUE = 3;

	/**
	 * The '<em><b>Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA
	 * @model name="Data"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_VALUE = 4;

	/**
	 * The '<em><b>Environment And Resource</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENVIRONMENT_AND_RESOURCE
	 * @model name="EnvironmentAndResource"
	 * @generated
	 * @ordered
	 */
	public static final int ENVIRONMENT_AND_RESOURCE_VALUE = 5;

	/**
	 * The '<em><b>Essential Performance Feature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESSENTIAL_PERFORMANCE_FEATURE
	 * @model name="EssentialPerformanceFeature"
	 * @generated
	 * @ordered
	 */
	public static final int ESSENTIAL_PERFORMANCE_FEATURE_VALUE = 6;

	/**
	 * The '<em><b>Feature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEATURE
	 * @model name="Feature"
	 * @generated
	 * @ordered
	 */
	public static final int FEATURE_VALUE = 7;

	/**
	 * The '<em><b>Hardware</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARDWARE
	 * @model name="Hardware"
	 * @generated
	 * @ordered
	 */
	public static final int HARDWARE_VALUE = 8;

	/**
	 * The '<em><b>Infrastructure And Network</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFRASTRUCTURE_AND_NETWORK
	 * @model name="InfrastructureAndNetwork"
	 * @generated
	 * @ordered
	 */
	public static final int INFRASTRUCTURE_AND_NETWORK_VALUE = 9;

	/**
	 * The '<em><b>Intellectual Property</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTELLECTUAL_PROPERTY
	 * @model name="IntellectualProperty"
	 * @generated
	 * @ordered
	 */
	public static final int INTELLECTUAL_PROPERTY_VALUE = 10;

	/**
	 * The '<em><b>Interface</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERFACE
	 * @model name="Interface"
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACE_VALUE = 11;

	/**
	 * The '<em><b>Interfaces And Access</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERFACES_AND_ACCESS
	 * @model name="InterfacesAndAccess"
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACES_AND_ACCESS_VALUE = 12;

	/**
	 * The '<em><b>Manufacturing Process</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUFACTURING_PROCESS
	 * @model name="ManufacturingProcess"
	 * @generated
	 * @ordered
	 */
	public static final int MANUFACTURING_PROCESS_VALUE = 13;

	/**
	 * The '<em><b>People</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PEOPLE
	 * @model name="People"
	 * @generated
	 * @ordered
	 */
	public static final int PEOPLE_VALUE = 14;

	/**
	 * The '<em><b>Primary Operating Function</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIMARY_OPERATING_FUNCTION
	 * @model name="PrimaryOperatingFunction"
	 * @generated
	 * @ordered
	 */
	public static final int PRIMARY_OPERATING_FUNCTION_VALUE = 15;

	/**
	 * The '<em><b>Property</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPERTY
	 * @model name="Property"
	 * @generated
	 * @ordered
	 */
	public static final int PROPERTY_VALUE = 16;

	/**
	 * The '<em><b>Reputation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPUTATION
	 * @model name="Reputation"
	 * @generated
	 * @ordered
	 */
	public static final int REPUTATION_VALUE = 17;

	/**
	 * An array of all the '<em><b>Asset Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AssetCategory[] VALUES_ARRAY =
		new AssetCategory[] {
			UNSPECIFIED,
			ACCESSORY,
			ARCHITECTURE_COMPONENT,
			COMPLIANCE,
			DATA,
			ENVIRONMENT_AND_RESOURCE,
			ESSENTIAL_PERFORMANCE_FEATURE,
			FEATURE,
			HARDWARE,
			INFRASTRUCTURE_AND_NETWORK,
			INTELLECTUAL_PROPERTY,
			INTERFACE,
			INTERFACES_AND_ACCESS,
			MANUFACTURING_PROCESS,
			PEOPLE,
			PRIMARY_OPERATING_FUNCTION,
			PROPERTY,
			REPUTATION,
		};

	/**
	 * A public read-only list of all the '<em><b>Asset Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AssetCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Asset Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssetCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssetCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Asset Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssetCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssetCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Asset Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssetCategory get(int value) {
		switch (value) {
			case UNSPECIFIED_VALUE: return UNSPECIFIED;
			case ACCESSORY_VALUE: return ACCESSORY;
			case ARCHITECTURE_COMPONENT_VALUE: return ARCHITECTURE_COMPONENT;
			case COMPLIANCE_VALUE: return COMPLIANCE;
			case DATA_VALUE: return DATA;
			case ENVIRONMENT_AND_RESOURCE_VALUE: return ENVIRONMENT_AND_RESOURCE;
			case ESSENTIAL_PERFORMANCE_FEATURE_VALUE: return ESSENTIAL_PERFORMANCE_FEATURE;
			case FEATURE_VALUE: return FEATURE;
			case HARDWARE_VALUE: return HARDWARE;
			case INFRASTRUCTURE_AND_NETWORK_VALUE: return INFRASTRUCTURE_AND_NETWORK;
			case INTELLECTUAL_PROPERTY_VALUE: return INTELLECTUAL_PROPERTY;
			case INTERFACE_VALUE: return INTERFACE;
			case INTERFACES_AND_ACCESS_VALUE: return INTERFACES_AND_ACCESS;
			case MANUFACTURING_PROCESS_VALUE: return MANUFACTURING_PROCESS;
			case PEOPLE_VALUE: return PEOPLE;
			case PRIMARY_OPERATING_FUNCTION_VALUE: return PRIMARY_OPERATING_FUNCTION;
			case PROPERTY_VALUE: return PROPERTY;
			case REPUTATION_VALUE: return REPUTATION;
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
	private AssetCategory(int value, String name, String literal) {
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
	
} //AssetCategory
