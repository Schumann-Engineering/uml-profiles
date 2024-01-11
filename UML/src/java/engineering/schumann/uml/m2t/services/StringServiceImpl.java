package engineering.schumann.uml.m2t.services;

import org.apache.commons.lang.StringUtils;

public class StringServiceImpl {
	/**
	 * ================================================
	 * escape 
	 * ================================================
	 **/
	/**
	 * Escapes characters if needed
	 * 
	 * @param String input
	 * @return String
	**/
	public static String escape(
			String input)
	{
		return input.replaceAll("\\.", "\\\\.");
	}
	
	
	/**
	 * indentSpace
	 */
	/**
	 * Indents a node by a numer of spaces.
	 * Acceleo String Service only provides a method to indent
	 * by one space or one tab, but not n spaces.
	 * 
	 * @param ENode node
	 * @param short numberOfSpaces
	 * @return the indented string
	 */
	/*
	public ENode indentSpace(
			short numberOfSpaces) 
	{
		for (int i=0; i<numberOfSpaces; i++)
			node.stringCall("indentSpace", -1, -1); //$NON-NLS-1$
		
		return node;
	}
	*/
	
	
	/**
	 * comment
	 */
	/**
	 * creates a comment block out of a string
	 * 
	 * @param String input
	 * @param String commentSign
	 * @return
	 */
	public String comment(
			String input,
			String commentSign
	)
	{
		return commentSign + input.replaceAll("\n", "\n" + commentSign);
		
	}
	
	/**
	 * getUChars
	 */
	/**
	 * returns just the upper case characters from a string
	 * 
	 * @param String input
	 * @return
	 */
	public String getUChars(
			String input
	)
	{
		if (input == null)
			return null;
		
		String result = "";
		
		// iterate over characters
		for (int i=0; i<input.length(); i++)
		{
			// get character
			char ch = input.charAt( i );
			
			// check if character is upper case
			if (!Character.isUpperCase(ch))
				continue;
			
			// add character to result
			result += ch;
		}
		
		return result;
	}
	
	
	/**
	 * trim
	 */
	/**
	 * trims a string by looking for a certain string
	 * 
	 * @param string to trim
	 * @param string to trim with
	 * @return
	 */
	 public String trim(
			 String input,
			 String trimChars)
	 {
		 String result = input;
		 
		 // trim begin
		 while (result.startsWith(trimChars))
			 result = result.substring(trimChars.length());
		 
		 // trim end
		 while (result.endsWith(trimChars))
			 result = result.substring(-trimChars.length());
		 
		 return result;	 
	 }
	 
	 
	/**
	 * padding
	 */
	/**
	 * pads a string to the left
	 * 
	 * @param input
	 * @param length
	 * @param paddingChar
	 * @return
	 */
	public String padLeft(
			String input,
			Integer length,
			String paddingChar
	)
	{
		return StringUtils.leftPad(input, length, paddingChar);
	}

	/**
	 * pads a string to the right
	 * 
	 * @param input
	 * @param length
	 * @param paddingChar
	 * @return
	 */
	public String padRight(
			String input,
			Integer length,
			String paddingChar
	)
	{
		return StringUtils.rightPad(input, length, paddingChar);
	}

}
