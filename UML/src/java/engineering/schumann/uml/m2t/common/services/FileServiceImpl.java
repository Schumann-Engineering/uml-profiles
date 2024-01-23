package engineering.schumann.uml.m2t.common.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileServiceImpl {	
	public final static List<String> EMPTY_PATH_LIST = new ArrayList<String>(); 
	
	
	public static String resolveFilename(
			String		locator,
			Object		pathsObj,
			List<String> fileExtensions,
			Boolean 	throwException
	)
	throws
		IOException,
		Exception
	{
		// === GUARDS ===
		if (locator == null || locator.isBlank())
			throw new Exception("locator not provided");
		if (pathsObj == null)
			throw new Exception("paths not provided");
		
		if (!(pathsObj instanceof ArrayList))
			throw new Exception("List<String> expected as parameter 'pathsObj' Got: " + pathsObj.getClass().getName());
		
		// === BODY ===
		/* -----------
		 * root directors to start search in
		 * ----------- */
		var rootDirs = new String[] {
				EnvironmentServiceImpl.INSTANCE.getEnvironmentVariable(EnvironmentServiceImpl.OUTPUT_DIR),
				new File(EnvironmentServiceImpl.INSTANCE.getEnvironmentVariable(EnvironmentServiceImpl.MODEL_URI)).getParent()
			};

		/* -----------
		 * additional paths passed to method to search in
		 * ----------- */
		@SuppressWarnings("unchecked")
		var searchDirs = (ArrayList<String>)pathsObj;
		
		/* -----------
		 * convert locator
		 * ----------- */
		var cleanName = StringServiceImpl.replaceEachRepeatedly(locator, ">", "|");
		cleanName = StringServiceImpl.replaceEachRepeatedly(cleanName, "/", "|");
		cleanName = StringServiceImpl.replaceEachRepeatedly(cleanName, "\\", "|");
		// no C:/ allowed
		// no file:///
		cleanName = StringServiceImpl.replaceEachRepeatedly(cleanName, ":", "");
		// no .. allowed
		cleanName = StringServiceImpl.replaceEachRepeatedly(cleanName, "\\.\\.", "");
		// lastly: cleanup empty parts in name
		cleanName = StringServiceImpl.replaceEachRepeatedly(cleanName, "| *|", "|");
		
		// trim all whitespaces
		var searchParts = cleanName.split("\\|");
		for (int i=0; i<searchParts.length; i++)
			searchParts[i] = searchParts[i].trim();

		var fileParts = Arrays.asList(
			String.join(File.separator, searchParts)
		);

		var candidates = new ArrayList<String>();
		for (String rootDir : rootDirs)
			for (String filePart : fileParts)
				for (String fileExtension : fileExtensions)
				{
					for (String searchDir : searchDirs)
					{
						if (searchDir.isBlank())
							continue;
				
						candidates.add(rootDir + File.separator + searchDir + File.separator + filePart + fileExtension);
					}

					candidates.add(rootDir + File.separator +                              filePart + fileExtension);
				}
		
		for (int i=0; i<candidates.size(); i++)
		{
			candidates.set(i, StringServiceImpl.replaceEachRepeatedly(candidates.get(i), "%20", " "));
			candidates.set(i, StringServiceImpl.replaceEachRepeatedly(candidates.get(i), "%23", "#"));
		}
		
		
		/* -----------
		 * find file
		 * ----------- */
		for (String candidate : candidates)
		{
			var file = new File(candidate);
			
			if (!file.exists())
				continue;
			
			// === SUCCESS ===
			return file.getCanonicalPath();
		}
		
		// === FAIL ===
		if (throwException)
		{
			// === FAIL ===
			System.err.println("FAIL: include file '" + locator + "' not found");
			throw new FileNotFoundException("'" + locator + "' not found in '" + String.join("; ", searchDirs) + "'");
		}
		else
			return null;
	}
}
