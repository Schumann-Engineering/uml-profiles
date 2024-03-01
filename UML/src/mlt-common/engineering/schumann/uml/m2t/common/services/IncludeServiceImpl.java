package engineering.schumann.uml.m2t.common.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.commonmark.ext.gfm.tables.TablesExtension;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

public class IncludeServiceImpl {
	private HashMap<String, String> INCLUDE_CACHE = new HashMap<String, String>();
	
	
	public String include(
			String		name,
			Object		pathsObj,
			Object		extensionsObj
	)
	throws
		IOException,
		Exception
	{
		// === GUARDS ===
		if (name == null)
			return null;
		if (pathsObj == null)
			return null;
		
		if (!(pathsObj instanceof ArrayList))
			throw new Exception("List<String> expected as parameter 'pathsObj' Got: " + pathsObj.getClass().getName());
		if (!(extensionsObj instanceof ArrayList))
			throw new Exception("List<String> expected as parameter 'extensionsObj' Got: " + extensionsObj.getClass().getName());
		
		// === BODY ===
		// resolve filename
		@SuppressWarnings("unchecked")
		var extensions = (ArrayList<String>)extensionsObj;
		var filename = FileServiceImpl.resolveFilename(name, pathsObj, extensions, false);
		
		if (filename == null)
			// === FAIL ===
			return null;

		
		/* -----------
		 * check cache
		 * ----------- */
		if (INCLUDE_CACHE.containsKey(filename))
			return INCLUDE_CACHE.get(filename);
		
			
		/* -----------
		 * read file
		 * ----------- */
		// System.out.println("INFO: including file '" + name + "' (found in '" + filename + "')");
		var result = Files.readString(Path.of(filename));

		/* -----------
		 * convert content
		 * ----------- */
		if (filename.endsWith(".md"))
			result = MarkdownServiceImpl.renderMarkdown(result);
		
		
		/* -----------
		 * update cache
		 * ----------- */
		INCLUDE_CACHE.put(filename, result);
		

		// === SUCCESS ===
		return result;
	}
}
