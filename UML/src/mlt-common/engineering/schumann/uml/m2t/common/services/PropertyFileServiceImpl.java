package engineering.schumann.uml.m2t.common.services;

import org.apache.maven.artifact.versioning.ComparableVersion;

/**
 * The Environment class is used to export environment variables to Acceleo templates
 * 
 * @author Janek Schumann
 * 
 */
public class PropertyFileServiceImpl {
	/**
	 * Default delimiter for property files in Java
	 */
	private static final String DEFAULT_PROPERTY_VALUE_DELIMITER = ",";

	
	public Boolean isContainedInEnvironmentProperty(
			String needle,
			String haystack
	)
	{
		return isContainedInEnvironmentProperty(
				needle, 
				haystack, 
				false,
				DEFAULT_PROPERTY_VALUE_DELIMITER
		);
	}

	
	public Boolean isContainedInEnvironmentProperty(
			String needle,
			String haystack,
			Boolean resultIfNull
	)
	{
		return isContainedInEnvironmentProperty(
				needle, 
				haystack,
				resultIfNull,
				DEFAULT_PROPERTY_VALUE_DELIMITER
		);
	}
	
	
	public Boolean isContainedInEnvironmentProperty(
			String needle,
			String haystack,
			Boolean resultIfNull,
			String delimiter
	) {
		// === GUARDS ===
		if (needle == null)
			return resultIfNull;
		if (haystack == null || haystack.trim() == "")
			return resultIfNull;
		if (delimiter == null)
			return resultIfNull;
		
		// === BODY ===
		// split haystack by delimiter	
		String[] values = haystack.split(delimiter);
		
		// search for needle in haystack values
		for (String value : values)
		{
			if (value == null || value.trim() == "")
				continue;
			
			if (needle.equals(value.trim()))
				return true;
		}
		
		// === RESULT ===
		return false;
	}
	
	
	public Boolean isContainedInEnvironmentPropertyAsVersion(
			String needle,
			String haystack
	) {
		return isContainedInEnvironmentPropertyAsVersion(
				needle,
				haystack,
				false,
				DEFAULT_PROPERTY_VALUE_DELIMITER
		);				
	}
	
	
	public Boolean isContainedInEnvironmentPropertyAsVersion(
			String needle,
			String haystack,
			Boolean resultIfNull
	) {
		return isContainedInEnvironmentPropertyAsVersion(
				needle,
				haystack,
				resultIfNull,
				DEFAULT_PROPERTY_VALUE_DELIMITER
		);				
	}	
	
	public Boolean isContainedInEnvironmentPropertyAsVersion(
			String needle,
			String haystack,
			Boolean resultIfNull,
			String delimiter
	) {
		// === GUARDS ===
		if (needle == null)
			return resultIfNull;
		if (haystack == null)
			return resultIfNull;
		if (delimiter == null)
			return resultIfNull;
		
		// === BODY ===
		// split haystack by delimiter	
		String[] values = haystack.split(delimiter);
		
		// get needle as version
		ComparableVersion needleAsVersion = new ComparableVersion(needle);
		
		// search for needle in haystack values
		for (String value : values)
		{
			if (value == null || value.trim() == "")
				continue;
			
			// get haystack as version
			ComparableVersion valueAsVersion = new ComparableVersion(value.trim());

			// compare the two
			// 0  = equal
			// >0 = A is "later" than B
			// <0 = A is "earlier" than B
			if (needleAsVersion.compareTo(valueAsVersion) >= 0)
				// === SUCCESS ===
				return true;
		}
		
		// === RESULT ===
		return false;
	}
}
