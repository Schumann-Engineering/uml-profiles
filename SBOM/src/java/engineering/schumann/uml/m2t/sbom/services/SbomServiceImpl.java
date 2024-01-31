package engineering.schumann.uml.m2t.sbom.services;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import engineering.schumann.uml.model.sbom.Sbom;

public class SbomServiceImpl {
	public static final List<String> SBOM_EXTENSIONS = Arrays.asList(".sbom");
	
	
	public static String findSbomFileName(
			String		locator,
			Object		pathsObj
	)
	throws
		Exception
	{
		// === BODY ===
		// try manifest
		var result = ManifestParserServiceImpl.findSbomFileName(locator, pathsObj);
		if (result != null)
		{
			// === SUCCESS ===
			System.out.println(String.format(
					"INFO: found SBOM file for '%s'",
					locator
			));
			return result;
		}
		
		// === FAIL ===
		System.err.println(String.format(
				"WARN: couldn't find SBOM file for '%s'",
				locator
		));
		return null;
	}

	
	public static Sbom loadSbom(
			String		sbomFileName
	)
	{
		// === GUARDS ===
		if (sbomFileName == null)
			throw new IllegalArgumentException("filename was not provided = null");

		var sbomFile = new File(sbomFileName);
		if (!sbomFile.exists())
			throw new IllegalArgumentException(String.format(
					"filename '%s' does not exist",
					sbomFileName
			));
		if (!sbomFile.isFile())
			throw new IllegalArgumentException(String.format(
					"filename '%s' is not a file",
					sbomFileName
			));
		
		// === SETUP ===
		Sbom result = null;
		
		// === BODY ===
		// try manifest
		if (ManifestParserServiceImpl.canHandle(sbomFile))
		{
			// === SUCCESS ===
			System.out.println(String.format(
					"INFO: reading SBOM (Manifest) file '%s'",
					sbomFileName
				));
			
			result = ManifestParserServiceImpl.loadSbomManifest(sbomFile);
		}
		
		// GUARD: didn't find anything
		if (result == null)
		{				
			// === FAIL ===
			System.err.println(String.format(
					"ERROR: could not find SBOM file '%s'",
					sbomFileName
				));
			return null;
		}
		
		// enrich
		SbomEnrichmentServiceImpl.EnrichSbom(result);
		
		
		// === RESULT ===
		return result;
	}
}
