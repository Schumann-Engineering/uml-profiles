package engineering.schumann.uml.m2t.sbom.services;

import org.eclipse.emf.common.util.EList;

import engineering.schumann.uml.m2t.common.services.StringServiceImpl;
import engineering.schumann.uml.model.sbom.Iec62304_Classification;
import engineering.schumann.uml.model.sbom.Iec81001_5_1_Classification;
import engineering.schumann.uml.model.sbom.Namespace;
import engineering.schumann.uml.model.sbom.NamespaceType;
import engineering.schumann.uml.model.sbom.Property;
import engineering.schumann.uml.model.sbom.Relationship;
import engineering.schumann.uml.model.sbom.RelationshipType;
import engineering.schumann.uml.model.sbom.impl.SBOMFactoryImpl;

public class PropertyServiceImpl {
	public static String GetPropertyValue(
			String needle,
			EList<Property> properties,
			String defaultValue
	) {
		var result = FindProperty(needle, properties);
		if (result == null)
			return defaultValue;
		if (result.getValue() == null)
			return defaultValue;
		
		return result.getValue().trim();
	}
	

	public static Property FindProperty(
			String needle,
			EList<Property> properties,
			String searchValue
	) {
		// find property by name first
		var property = FindProperty(needle, properties);
		if (property == null)
			// === FAIL ===
			return null;
		
		// now match the value, too
		var value = property.getValue();
		if (value == null && searchValue == null)
			// === SUCCESS ===
			return property;
		if (value == null)
			// === FAIL ===
			return null;
		
		value = value.trim();
		if (value.equalsIgnoreCase(searchValue))
			// === SUCCESS ===
			return property;
		
		// === RESULT ===
		// === FAIL ===
		return null;
	}
	
	
	public static Property FindProperty(
			String needle,
			EList<Property> properties
	) {
		for (var property : properties)
		{
			// match property
			var key = property.getKey();
			if (key == null)
				continue;
			key = key.trim();
			
			if (!key.equalsIgnoreCase(needle))
				continue;

			// === SUCCESS ===
			return property;
		}

		// === RESULT ===
		return null;
	}
	
	
	public static void SetProperty(
			Namespace	namespace,
			String		propertyStr
	)
	throws
		Exception
	{
		// === GUARDS ===
		if (propertyStr == null || propertyStr.isBlank())
			return;
		
		// === BODY ===
		// split up string into key and value.
		// NOTE: ':' is the delimiter, however it could be part of the value as well.
		var delimiterPosition = propertyStr.indexOf(':');
		
		if (delimiterPosition < 0)
			throw new Exception("couldn't find property key-value delimiter (':') in property: '" + propertyStr + "'");
		
		
		var key = propertyStr.substring(0,  delimiterPosition);
		var value = propertyStr.substring(delimiterPosition+1);
		
		SetProperty(namespace, key, value);
	}

	
	public static void SetProperty(
			Namespace	namespace,
			String		propertyName,
			String		propertyValue
	)
	throws
		Exception
	{
		if (propertyName == null || propertyName.isBlank())
			throw new Exception("property naem is null or empty");
		
		switch (propertyName.trim().toLowerCase())
		{
			case "descr":
			case "description":
				namespace.setDescription(propertyValue);
				break;

			case "issoup":
			case "is-soup":
			case "is_soup":
				namespace.setIsSOUP(StringServiceImpl.IsTrue(propertyValue));
				break;
				

			case "iec 62304":
			case "iec62304":
			case "62304":
				SetIec62304(namespace, propertyValue);
				break;	

			case "iec 81001-5-1":
			case "iec81001-5-1":
			case "81001-5-1":
				SetIec81001_5_1(namespace, propertyValue);
				break;	
				
			case "license":
			case "selected license":
				namespace.setLicense(propertyValue);
				break;
				
			case "name":
				namespace.setName(propertyValue);
				break;
				
			case "ref":
			case "reference":
				namespace.getReference().add(propertyValue);
				break;
				
			case "summary":
			case "title":
				namespace.setSummary(propertyValue);
				break;
				
			case "supplier":
				namespace.setSupplier(propertyValue);
				break;

			case "type":
				SetType(namespace, propertyValue);
				break;	

			case "version":
				namespace.setVersion(propertyValue);
				break;
			
			default:
				// create property
				var genericProperty = SBOMFactoryImpl.eINSTANCE.createProperty();
				genericProperty.setKey(propertyName);
				genericProperty.setValue(propertyValue);
				
				// add to component
				namespace.getOwnedProperty().add(genericProperty);
				break;
		}
	}
	
	
	public static void SetIec62304(
			Namespace namespace,
			String classification
	)
	throws
		Exception
	{
		switch (classification.trim().toLowerCase())
		{
			case "low":
			case "low risk":
			case "lowrisk":
			case "low-risk":
			case "a":
				namespace.setClassificationIec62304(Iec62304_Classification.A);
				break;

			case "medium":
			case "medium risk":
			case "mediumrisk":
			case "medium-risk":
			case "b":
				namespace.setClassificationIec62304(Iec62304_Classification.B);
				break;

			case "high":
			case "high risk":
			case "highrisk":
			case "high-risk":
			case "c":
				namespace.setClassificationIec62304(Iec62304_Classification.C);
				break;

				
			default:
				throw new Exception("unknown IEC 62304 classification '" + classification + "'");
		}		
	}

	
	
	
	public static void SetIec81001_5_1(
			Namespace namespace,
			String classification
	)
	throws
		Exception
	{
		switch (classification.trim().toLowerCase())
		{
			case "vendor":
			case "maintained":
				namespace.setClassificationIec81001_5_1(Iec81001_5_1_Classification.MAINTAINED);
				break;

			case "sup":
			case "supported":
				namespace.setClassificationIec81001_5_1(Iec81001_5_1_Classification.SUPPORTED);
				break;

			case "req":
			case "required":
				namespace.setClassificationIec81001_5_1(Iec81001_5_1_Classification.REQUIRED);
				break;

				
			default:
				throw new Exception("unknown IEC 81001-5-1 classification '" + classification + "'");
		}		
	}

	
	public static void SetType(
			Namespace namespace,
			String typeStr
	)
	throws
		Exception
	{
		switch (typeStr.trim().toLowerCase())
		{
			case "a":
			case "app":
			case "application":
				namespace.setType(NamespaceType.APPLICATION);
				break;
		
			case "f":
			case "firmware":
			case "fw":
			case "devicesoftware":
			case "device software":
			case "device-software":
				namespace.setType(NamespaceType.OPERATING_SYSTEM_DEVICE_SOFTWARE);
				break;

			case "h":
			case "hardware":
			case "hw":
				namespace.setType(NamespaceType.HARDWARE);
				break;

			case "lib":
			case "library":
				namespace.setType(NamespaceType.APPLICATION_LIBRARY);
				break;

			case "o":
			case "os":
			case "operatingsystem":
			case "operating system":
			case "operating-system":
			case "operating_system":
				namespace.setType(NamespaceType.OPERATING_SYSTEM);
				break;
				
			default:
				throw new Exception("unknown namespace type '" + typeStr + "'");
		}		
	}

	
	public static void SetType(
			Relationship relationship,
			String type
	)
	throws
		Exception
	{
		switch (type.trim().toLowerCase())
		{
			case "contains":
				relationship.setType(RelationshipType.CONTAINS);
				break;
			
			case "describes":
				relationship.setType(RelationshipType.DESCRIBES);
				break;
				
			case "containedin":
			case "contained-in":
			case "contained_in":
			case "iscontainedby":
			case "is contained by":
			case "is-contained-by":
			case "is_contained_by":
				relationship.setType(RelationshipType.IS_CONTAINED_BY);
				break;
				
			case "isdescribedby":
			case "is described by":
			case "is-described-by":
			case "is_described_by":
				relationship.setType(RelationshipType.IS_DESCRIBED_BY);
				break;
				
			case "isrequiredby":
			case "is required by":
			case "is-required-by":
			case "is_required_by":
				relationship.setType(RelationshipType.IS_REQUIRED_BY);
				break;
				
			case "requires":
				relationship.setType(RelationshipType.REQUIRES);
				break;
				
			case "runs":
				relationship.setType(RelationshipType.RUNS);
				break;
			
			case "runson":
			case "runs-on":
			case "runs_on":
				relationship.setType(RelationshipType.RUNS_ON);
				break;
				
		
			default:
				throw new Exception("unknown relationship type '" + type + "'");
		}
	}
}
