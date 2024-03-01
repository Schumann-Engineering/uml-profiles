package engineering.schumann.uml.m2t.common.services;

import java.util.Arrays;
import java.util.List;

import org.commonmark.Extension;
import org.commonmark.ext.gfm.tables.TablesExtension;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

public class MarkdownServiceImpl {
	private static final List<Extension> MARKDOWN_RENDER_EXTENSIONS = Arrays.asList(TablesExtension.create());

	
	public static String renderMarkdown(
			String input
	)
	{
		// === GUARDS ===
		if (input == null)
			return null;
		
		// === BODY ===

		// parse markdown
		var markdownParser = Parser.builder()
		        .extensions(MARKDOWN_RENDER_EXTENSIONS)
		        .build();
		var markdown = markdownParser.parse(input);
		
		// render markdown -> HTML
		var htmlRenderer = HtmlRenderer.builder()
		        .extensions(MARKDOWN_RENDER_EXTENSIONS)
		        .build();
		var result = htmlRenderer.render(markdown); 
		
		// beautify
		result = result
				.replaceAll("<br>", "<br/>")
				.replaceAll("&quot;", "\"")
				;
		
		// === RESULT ===
		return result;
	}
}
