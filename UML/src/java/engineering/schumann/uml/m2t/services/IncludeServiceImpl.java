package engineering.schumann.uml.m2t.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

import org.commonmark.ext.gfm.tables.TablesExtension;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

public class IncludeServiceImpl {	
	public static String include(
			String	name,
			Object	pathsObj
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
		
		// === BODY ===
		var extensions = new String[] { ".md", ".html", ".txt" };
		
		@SuppressWarnings("unchecked")
		var paths = (ArrayList<String>)pathsObj;
		
		/* -----------
		 * convert name
		 * ----------- */
		var cleanName = StringServiceImpl.replaceEachRepeatedly(name, ">", "|");
		cleanName = StringServiceImpl.replaceEachRepeatedly(cleanName, "-", "|");
		cleanName = StringServiceImpl.replaceEachRepeatedly(cleanName, "/", "|");
		cleanName = StringServiceImpl.replaceEachRepeatedly(cleanName, "\\", "|");
		// no C:/ allowed
		// no file:///
		cleanName = StringServiceImpl.replaceEachRepeatedly(cleanName, ":", "");
		// no .. allowed
		cleanName = StringServiceImpl.replaceEachRepeatedly(cleanName, "..", "");
		// lastly: cleanup empty parts in name
		cleanName = StringServiceImpl.replaceEachRepeatedly(cleanName, "| *|", "|");
		
		// trim all whitespaces
		var parts = cleanName.split("\\|");
		for (int i=0; i<parts.length; i++)
			parts[i] = parts[i].trim();

		var outputPath = EnvironmentServiceImpl.INSTANCE.getEnvironmentVariable(EnvironmentServiceImpl.OUTPUT_DIR);

		var candidates = new ArrayList<String>();
		for (String extension : extensions)
		{
			for (String root : paths)
			{
				var rootPath = new File(root);
				
				// OUTPUT + ROOT
				candidates.add(outputPath + File.separator + rootPath+ File.separator + String.join(File.separator, parts));
				candidates.add(outputPath + File.separator + rootPath + File.separator + String.join(File.separator, parts) + extension);
	
				// OUTPUT + ROOT-parent
				candidates.add(outputPath + File.separator + rootPath.getParent() + File.separator + String.join(File.separator, parts));
				candidates.add(outputPath + File.separator + rootPath.getParent() + File.separator + String.join(File.separator, parts) + extension);
				
				// OUTPUT + ROOT
				candidates.add(outputPath + File.separator + rootPath + File.separator + String.join(".", parts));
				candidates.add(outputPath + File.separator + rootPath + File.separator + String.join(".", parts) + extension);
	
				// OUTPUT + ROOT-parent
				candidates.add(outputPath + File.separator + rootPath.getParent() + File.separator + String.join(".", parts));
				candidates.add(outputPath + File.separator + rootPath.getParent() + File.separator + String.join(".", parts) + extension);
			};
			
			// OUTPUT only
			candidates.add(outputPath + File.separator + String.join(File.separator, parts));
			candidates.add(outputPath + File.separator + String.join(File.separator, parts) + extension);
			
			// OUTPUT only
			candidates.add(outputPath + File.separator + String.join(".", parts));
			candidates.add(outputPath + File.separator + String.join(".", parts) + extension);
		}
		
		
		/* -----------
		 * find file
		 * ----------- */
		for (String candidate : candidates)
		{
			var file = new File(candidate);
			
			if (!file.exists())
				continue;
			
			/* -----------
			 * read file
			 * ----------- */
			System.out.println("INFO: including file '" + name + "' (found in '" + candidate + "')");
			var result = Files.readString(Path.of(candidate));

			/* -----------
			 * convert content
			 * ----------- */
			if (file.getName().endsWith(".md"))
			{
				System.out.println("INFO: rendering file '" + name + "' (found in '" + candidate + "') as markdown");
				
				var renderExtensions = Arrays.asList(TablesExtension.create());
				
				// parse markdown
				var markdownParser = Parser.builder()
				        .extensions(renderExtensions)
				        .build();
				var markdown = markdownParser.parse(result);
				
				// render markdown -> HTML
				var htmlRenderer = HtmlRenderer.builder()
				        .extensions(renderExtensions)
				        .build();
				result = htmlRenderer.render(markdown);
				
			}

			// === SUCCESS ===
			return result;
		}
		
		// === FAIL ===
		System.err.println("FAIL: include file '" + name + "' not found");
		throw new FileNotFoundException("'" + name + "' not found in " + String.join("; ", paths));
	}
}
