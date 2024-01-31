package engineering.schumann.uml.m2t.common.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileServiceImpl {	
	public final static List<String> EMPTY_PATH_LIST = new ArrayList<String>(); 
	
	
	private final static String LOCATOR_PART_DELIMITER = "|";
	private final static String LOCATOR_PART_DELIMITER_ESCAPED = "\\|";
	
	
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
		return resolveFilename(locator, pathsObj, fileExtensions, throwException, false);
	}
	
	
	public static String resolveFilename(
			String			locator,
			Object			pathsObj,
			List<String>	inputFileExtensions,
			Boolean 		throwException,
			Boolean			searchInSubdirectories
	)
	throws
		IOException,
		IllegalArgumentException
	{
		// === GUARDS ===
		if (locator == null || locator.isBlank())
			throw new IllegalArgumentException("locator not provided");
		if (pathsObj == null)
			throw new IllegalArgumentException("paths not provided");
		
		if (!(pathsObj instanceof ArrayList))
			throw new IllegalArgumentException("List<String> expected as parameter 'pathsObj' Got: " + pathsObj.getClass().getName());
		
		// === BODY ===
		/* -----------
		 * root directors to start search in
		 * ----------- */
		var rootDirs = getRootDirs();
		

		/* -----------
		 * additional paths passed to method to search in
		 * ----------- */
		@SuppressWarnings("unchecked")
		var searchDirs = (ArrayList<String>)pathsObj;
		
		
		/* -----------
		 * convert locator
		 * ----------- */
		var locatorAsPartialPath = convertLocatorToPartialPath(locator);
		
		
		/*
		 * 
		 */
		var fileExtensions = new ArrayList<String>();
		fileExtensions.addAll(inputFileExtensions);
		fileExtensions.add("");

		/*
		 * search
		 */
		var candidates = new ArrayList<String>();
		for (String rootDir : rootDirs)
			for (String fileExtension : fileExtensions)
			{
				for (String searchDir : searchDirs)
				{
					if (searchDir.isBlank())
						continue;
			
					candidates.add(rootDir + File.separator + searchDir + File.separator + locatorAsPartialPath + fileExtension);
				}

				candidates.add(rootDir + File.separator +                                  locatorAsPartialPath + fileExtension);
			}
		
		for (int i=0; i<candidates.size(); i++)
		{
			candidates.set(i, StringServiceImpl.replaceEachRepeatedly(candidates.get(i), "%20", " "));
			candidates.set(i, StringServiceImpl.replaceEachRepeatedly(candidates.get(i), "%23", "#"));
			candidates.set(i, StringServiceImpl.replaceEachRepeatedly(candidates.get(i), "//", "/"));
			candidates.set(i, StringServiceImpl.replaceEachRepeatedly(candidates.get(i), "(\\)+", "\\"));
			
			if (File.pathSeparator == "\\")
				candidates.set(i, StringServiceImpl.replaceEachRepeatedly(candidates.get(i), "/", "\\"));
		}
		
		for (var candidate : candidates)
		{
			var file = findFile(candidate, searchInSubdirectories);
			
			if (file == null)
				continue;
			
			return file.getCanonicalPath();
		}
	
		
		// === FAIL ===
		if (throwException)
		{
			// === FAIL ===
			System.err.println(String.format(
					"FAIL: could not find file '%s' in '%s'",
					locator,
					String.join("; ", searchDirs)
				));
			throw new FileNotFoundException(String.format(
					"'%s' not found in '%s'",
					locator,
					String.join("; ", searchDirs)
				));
		}
		else
		{
			System.err.println(String.format(
					"WARN: could not find file '%s' in '%s'", 
					locator,
					String.join("; ", searchDirs)
				));
			return null;
		}
	}

	/*
	private static File searchFileReturnFirst(
			File	searchDirectory, 
			String 	fileName
	)
	throws
		IOException
	{
		var result = searchFile(searchDirectory, fileName);
		
		if (result.size() == 0)
			return null;
		
		return result.get(0);		
	}
	
	
	private static List<File> searchFile(
			File	searchDirectory, 
			String 	fileName
	) 
	throws
		IOException
	{
		var result = new ArrayList<File>();
		
		// GUARD: non-null
		if (searchDirectory == null || fileName == null || fileName.trim().length() == 0)
			throw new IOException("arguments are null or empty");
		
		// GUARD: must exists
		if (!searchDirectory.exists())
			return result;
		
		// GUARD: must be a directory
		if (!searchDirectory.isDirectory())
			return result;
		
		// search files
		for (var file : searchDirectory.listFiles())
		{
			if (!file.isFile())
				continue;
			
			var candidate = file.getName();
			if (!candidate.equalsIgnoreCase(fileName))
				continue;
			
			result.add(file);
		}

		
		// search directories
		for (var file : searchDirectory.listFiles())
		{
			if (!file.isDirectory())
				continue;
						
			result.addAll(searchFile(file, fileName));
		}
		
		// === RESULT ===
		return result;
	}
	*/

	
	private static File findFile(
		String fileName,
		Boolean searchSubDirectories
	)
	{
		// System.out.println(String.format("DEBUG: probing for file '%s'", fileName));
		
		/* -----------
		 * find file (DIRECTLY)
		 * ----------- */
		{
			var file = new File(fileName);

			if (!file.exists() || !file.isFile())
				// === FAIL ===
				return null;
			
			// === SUCCESS ===
			try
			{
				return file.getCanonicalFile();
			}
			catch (IOException e)
			{
				return null;
			}
		}		
		
		
		/* -----------
		 * find file (SUB-DIRECTORIES)
		 * ----------- */
		/*
		if (searchInSubdirectories)
			for (String candidate : candidates)
			{
				var file = new File(candidate);
				var searchDirName = file.getCanonicalPath();
				if (!file.isDirectory())
					searchDirName = file.getParent();
				
				// search directory
		    	for (String filePart : fileParts)
					for (String fileExtension : fileExtensions)
					{	
						var needle = searchFileReturnFirst(
							new File(searchDirName),
							filePart + fileExtension
						);
						
						if (needle == null)
							continue;
						
						if (!needle.exists() || !needle.isFile())
							continue;
											        
						// === SUCCESS ===
						return needle.getCanonicalPath();
					}
			}
		*/
	}

	
	private static String convertLocatorToPartialPath(
		String locator
	)
	{
		/*
		 * replace different delimiters to universal delimiter
		 */
		var cleanName = StringServiceImpl.replaceEachRepeatedly(locator, ">", LOCATOR_PART_DELIMITER);
		cleanName = StringServiceImpl.replaceEachRepeatedly(cleanName, "/", LOCATOR_PART_DELIMITER);
		cleanName = StringServiceImpl.replaceEachRepeatedly(cleanName, "\\", LOCATOR_PART_DELIMITER);
		
		/*
		 * remove unallowed characters. this shall also prevent accessing parent directories.
		 */
		// no C:/ allowed
		// no file:///
		cleanName = StringServiceImpl.replaceEachRepeatedly(cleanName, ":", "");
		// no .. allowed
		cleanName = StringServiceImpl.replaceEachRepeatedly(cleanName, "\\.\\.", "");

		/*
		 * cleanup empty parts in name
		 */
		cleanName = StringServiceImpl.replaceEachRepeatedly(cleanName, String.format("%s *%s", LOCATOR_PART_DELIMITER, LOCATOR_PART_DELIMITER), "");
		
		
		/*
		 *  trim whitespaces from each part
		 */
		var searchParts = cleanName.split(LOCATOR_PART_DELIMITER_ESCAPED);
		for (int i=0; i<searchParts.length; i++)
			searchParts[i] = searchParts[i].trim();

		
		// === RESULT ===
		return String.join(File.separator, searchParts);
	}
	
	
	private static List<String> getRootDirs()
	{
		// === SETUP ===
		var result = new ArrayList<String>();
		var outputDir = VariableServiceImpl.INSTANCE.getVariable(VariableServiceImpl.OUTPUT_DIR);
		var modelUri = VariableServiceImpl.INSTANCE.getVariable(VariableServiceImpl.MODEL_URI);
		

		// === BODY ===
		if (outputDir != null && !outputDir.isBlank())
			result.add(outputDir);
		if (modelUri != null && !modelUri.isBlank())
			result.add(new File(modelUri).getParent());
		
		
		// === RESUL ===
		return result;
	}
}
