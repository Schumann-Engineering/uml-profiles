package engineering.schumann.uml.m2t.services;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * The Environment class is used to export environment variables to Acceleo templates
 * 
 * @author Janek Schumann
 * 
 */
public class EnvironmentServiceImpl {
	public static final EnvironmentServiceImpl INSTANCE = new EnvironmentServiceImpl();
	
	public static final String MODEL_URI = "__GLOBAL__.MODEL_URI";
	
	public static final String OUTPUT_DIR = "__GLOBAL__.OUTPUT_FOLDER";
	
	/**
	 * Constant "Last Error Key" (key in properties map which stores last error which occured)
	 */
	private static final String LAST_ERROR_KEY = "__LAST_ERROR__";

	/**
	 * Constant "True Values" (strings which are used to represent boolean true)
	 */
	private static final String[] TRUE_VALUES = { "1", "on" ,"yes" , "true" };

	
	/**
	 * Property "Properties" which hold a key-value index of key to property
	 */
	private Properties m_Properties = new Properties();
	
	
	public String getEnvironmentVariable(
			String key
	) throws IndexOutOfBoundsException
	{
		return getEnvironmentVariable(key, null);
	}	
	
	/**
	 * Returns the environment variable defined by key. Throws an exception if no such variable exists.  
	 * 
	 * @param key
	 * @return Value of environment variable defined by key. 
	 */
	public String getEnvironmentVariable(
			String key,
			String _default
	) throws IndexOutOfBoundsException
	{
		// check if key exists locally
		if (m_Properties.containsKey(key))
			return m_Properties.getProperty(key);
		
		// check global instance
		if (this != INSTANCE)
			return INSTANCE.getEnvironmentVariable(key, _default);
		
		// nope
		return _default;
	}
	
	
	/**
	 * Loads a property file
	 * 
	 * @param fileName
	 */
	public void loadEnvironment(
			String fileName
	) throws IOException
	{
		try
		{
			// open input stream from file name
	        FileInputStream fis = new FileInputStream(fileName);
			
	        // ... and load its content from file
	        m_Properties.load(fis);    
	        
	        // close input stream
	        fis.close();
		}
		catch (IOException e)
		{
			m_Properties.put(
					LAST_ERROR_KEY, 
					"Couldn't load properties from file '" + fileName + "'. Error: " + e.getMessage()
			);
		}
		
		
		/*
		 * special handling for keywords
		 */
		if (m_Properties.containsKey( "KEYWORDS" ))
		{
			// get value
			String keywordsStr = (String) m_Properties.get( "KEYWORDS" );
			
			// split keywords at ','
			String[] keywords = keywordsStr.split( "," );
			
			// add each keyword as "true"
			for (String keyword : keywords)
			{
				// construct key
				String key = "KEYWORD_" + keyword.trim();
				
				// set property to "true"
				m_Properties.setProperty( key, "true" );
			}
		}
	}
	
	
	public void setProperty(
		String key,
		String value
	)
	{
		m_Properties.setProperty(key, value);		
	}
	
	
	public void setPropertyIfNotExist(
		String key,
		String value
	)
	{
		// check local instance
		if (m_Properties.containsKey(key))
			return;
		
		m_Properties.setProperty(key, value);		
	}	
	
	
	/**
	 * Query if an error occured or not.
	 * 
	 * @return True if an error exists otherwise false.
	 */
	public Boolean hasError()
	{
		return m_Properties.containsKey(LAST_ERROR_KEY);
	}
	
	
	public String lastError()
	{
		if (!hasError())
			return null;
		
		return m_Properties.getProperty( LAST_ERROR_KEY );
	}
	

	/**
	 * Checks if a given key is true.
	 * 
	 * @param key
	 * @return True if key exists and its value is [on|true|1|yes]. False otherwise.
	 */
	public Boolean isTrue(String key)
	{		
		// first check if key exists
		if (!exists(key))
			return false;
		
		// get value
		String value = getEnvironmentVariable(key).trim().toLowerCase();

		// check for true cases
		for (String trueValue : TRUE_VALUES)
			if (trueValue.equals(value))
				return true;
		
		// otherwise it's false
		return false;
	}
	

	/**
	 * Checks if a given key is false. (= not true)
	 * 
	 * @param key
	 * @return True if key exists and its value is *not* [on|true|1|yes]. False otherwise.
	 */
	public Boolean isFalse(String key)
	{
		return !isTrue(key);		
	}
	
	
	/**
	 * Checks if a given key exists.
	 * 
	 * @param key
	 * @return True if key exists, false otherwise.
	 */
	public Boolean exists(String key)
	{
		// check local instance
		if (m_Properties.containsKey(key))
			return true;
		
		// check global instance
		if (this != INSTANCE)
			return INSTANCE.exists(key);
		
		// nope
		return false;
	}
}
