package engineering.schumann.uml.m2t.common.services;

import org.apache.commons.lang.StringUtils;

public class StringServiceImpl {

	/**
	 * Constant "True Values" (strings which are used to represent boolean true)
	 */
	private static final String[] TRUE_VALUES = { "1", "on" ,"yes" , "true" };


	/**
	 * Checks if a given string is true.
	 * 
	 * @param str
	 * @return True if str is boolean true.
	 */
	public static Boolean IsTrue(String str)
	{		
		// check for true cases
		for (String trueValue : TRUE_VALUES)
			if (trueValue.equals(str))
				return true;
		
		// otherwise it's false
		return false;
	}
	

	/**
	 * Checks if a given string is false. (= not true)
	 * 
	 * @param str
	 * @return True if str is boolean false.
	 */
	public static Boolean IsFalse(String str)
	{
		return !IsTrue(str);		
	}
	
	
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
	public static String comment(
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
	public static String getUChars(
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
	 public static String trim(
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
	public static String padLeft(
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
	public static String padRight(
			String input,
			Integer length,
			String paddingChar
	)
	{
		return StringUtils.rightPad(input, length, paddingChar);
	}

	
	public static String replaceEachRepeatedly(
			String input,
			String pattern,
			String replacement
	)
	{
		// === BODY ===
		var result = input;
		while (result.contains(pattern))
			result = result.replaceAll(pattern, replacement);
		
		// === RESULT
		return result;
	}
}
