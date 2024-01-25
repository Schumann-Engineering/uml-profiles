package engineering.schumann.uml.m2t.uml.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.Comment;


public class CommentServiceImpl {
	/**
	 * Constant "Maximum characters per line" (defines where to wrap the line)
	 */
	public static final int MAX_CHARS_PER_LINE = 80;
	
	
	/**
	 * 
	 **/
	public List<String> stripComment( Comment comment )
	{
		// create result
		List<String> result = new ArrayList<String>();
		
		if ( comment == null )
			return result;

		return stripComment( comment.getBody() );
	}

	
	/**
	 * 
	 **/
	public List<String> stripComment( String comment )
	{		
		// create result
		List<String> result = new ArrayList<String>();
		
		if ( comment == null )
			return result;
		
		// strip comment into lines of MAX_CHARS_PER_LINE chars max
		String line = "";
		for (String word : comment.split( " " )  )
		{
			// check number of character in the line 
			if ( (line.length() + word.length() + 1 > MAX_CHARS_PER_LINE) && (line.length() > 0) )
			{
				// ok, not enough room for this
				result.add( line );
				
				line = word;				
			}
				
			else
				
				line += (line.length() == 0 ? "" : " ") + word;
		}
		
		// check line a last time
		if ( line.length() > 0 )
			result.add( line );
		
		
		// return striped comment
		return result;
	}
}
