package engineering.schumann.uml.m2t.sbom.services;

import java.util.Arrays;
import java.util.List;

import engineering.schumann.uml.m2t.common.services.FileServiceImpl;
import engineering.schumann.uml.model.sbom.Sbom;

public class SbomServiceImpl {
	public static final List<String> SBOM_EXTENSIONS = Arrays.asList(".sbom");
	
	public static Boolean hasSbom(
			String		locator
	) throws Exception
	{
		return hasSbom(locator, FileServiceImpl.EMPTY_PATH_LIST);
	}
	
	
	public static Boolean hasSbom(
			String		locator,
			Object		pathsObj
	) throws Exception
	{
		// === BODY ===
		// try manifest
		if (ManifestParserServiceImpl.hasSbomManifest(locator, pathsObj))
			return true;
		
		// === FAIL ===
		return false;
	}

	
	public static Sbom loadSbom(
			String		locator
	) throws Exception
	{
		return loadSbom(locator, FileServiceImpl.EMPTY_PATH_LIST);
	}
	
	
	public static Sbom loadSbom(
			String		locator,
			Object		pathsObj
	) throws Exception
	{
		// === BODY ===
		// try manifest
		if (ManifestParserServiceImpl.hasSbomManifest(locator, pathsObj))
			return ManifestParserServiceImpl.loadSbomManifest(locator, pathsObj);
			
		// === FAIL ===
		return null;
	}	
}
