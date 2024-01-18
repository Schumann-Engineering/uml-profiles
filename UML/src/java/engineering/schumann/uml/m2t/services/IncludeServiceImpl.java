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
			String name,
			String root
	)
	throws
		IOException
	{
		// === GUARDS ===
		if (name == null)
			return null;
		if (root == null)
			return null;
		
		// === BODY ===
		var extensions = new String[] { ".md", ".html", ".txt" };
		
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
		var rootPath = new File(root);

		var candidates = new ArrayList<String>();
		for (String extension : extensions)
		{
			candidates.add(outputPath + File.separator + rootPath + File.separator + String.join(File.separator, parts));
			candidates.add(outputPath + File.separator + rootPath + File.separator + String.join(File.separator, parts) + extension);

			candidates.add(outputPath + File.separator + rootPath.getParent() + File.separator + String.join(File.separator, parts));
			candidates.add(outputPath + File.separator + rootPath.getParent() + File.separator + String.join(File.separator, parts) + extension);
			
			candidates.add(outputPath + File.separator + String.join(File.separator, parts));
			candidates.add(outputPath + File.separator + String.join(File.separator, parts) + extension);
			

			candidates.add(outputPath + File.separator + rootPath + File.separator + String.join(".", parts));
			candidates.add(outputPath + File.separator + rootPath + File.separator + String.join(".", parts) + extension);

			candidates.add(outputPath + File.separator + rootPath.getParent() + File.separator + String.join(".", parts));
			candidates.add(outputPath + File.separator + rootPath.getParent() + File.separator + String.join(".", parts) + extension);

			candidates.add(outputPath + File.separator + String.join(".", parts));
			candidates.add(outputPath + File.separator + String.join(".", parts) + extension);
		};
		
		
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
			var result = Files.readString(Path.of(candidate));

			/* -----------
			 * convert content
			 * ----------- */
			if (file.getName().endsWith(".md"))
			{
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
		throw new FileNotFoundException("'" + name + "' not found in '" + root + "'");
	}
}
