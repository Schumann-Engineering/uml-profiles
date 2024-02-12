package engineering.schumann.uml.m2t.common.services;

import org.apache.maven.artifact.versioning.ComparableVersion;

/**
 * 
 * @author Janek Schumann
 * 
 */
public class VersionServiceImpl {
	public Boolean isEqual(
			String needle,
			String haystack
	)
	throws
		Exception
	{
		return compareVersions(needle, haystack) == 0;
	}

	
	public Boolean isNewer(
			String needle,
			String haystack
	)
	throws
		Exception
	{
		return compareVersions(needle, haystack) > 0;
	}

	
	public Boolean isOlder(
			String needle,
			String haystack
	)
	throws
		Exception
	{
		return compareVersions(needle, haystack) < 0;
	}
	
	
	// compare the two
	// 0  = equal
	// >0 = A is "later" than B
	// <0 = A is "earlier" than B
	public Integer compareVersions(
			String needle,
			String haystack
	)
	throws
		Exception
	{
		// === GUARDS ===
		if (needle == null || needle.isBlank())
			throw new IllegalArgumentException("needle is null or empty");
		if (haystack == null || haystack.isBlank())
			throw new IllegalArgumentException("haystack is null or empty");
		
		
		// === BODY ===
		// get needle as version
		var needleAsVersion = new ComparableVersion(needle.trim());
		
		// get haystack as version
		var haystackAsVersion = new ComparableVersion(haystack.trim());
		
		
		// === RESULT ===
		return needleAsVersion.compareTo(haystackAsVersion);
	}
}
