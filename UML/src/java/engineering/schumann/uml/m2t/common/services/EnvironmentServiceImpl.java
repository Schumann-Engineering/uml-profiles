package engineering.schumann.uml.m2t.common.services;

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
	 * Property "Properties" which hold a key-value index of key to property
	 */
	private Properties m_Properties = new Properties();

	
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
		{
			if (!key.startsWith("__"))
			{
				System.out.println(String.format(
					"DEBUG: [Env] retrieved environment variable '%s': %s",
					key,
					m_Properties.getProperty(key)
				));
				System.out.flush();
			}
				
			return m_Properties.getProperty(key);
		}
		
		// check global instance
		if (this != INSTANCE)
			return INSTANCE.getEnvironmentVariable(key, _default);
		
		// nope
		System.out.println(String.format(
				"DEBUG: environment property '%s' is not set. Using provided default '%s'",
				key,
				_default
			));
		
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
			System.out.println("INFO: tyring to load property file '" + fileName + "'");
			
			// open input stream from file name
	        FileInputStream fis = new FileInputStream(fileName);
			
	        // ... and load its content from file
	        m_Properties.load(fis);    
	        
	        // close input stream
	        fis.close();
		}
		catch (IOException e)
		{
			System.err.println("FAIL: loading of property file '" + fileName + "'");
			
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
	
	
	public void setEnvironmentVariable(
		String key,
		String value
	)
	{
		if (key == null)
			return;
		if (key.trim() == "")
			return;
		
		if (!key.startsWith("__"))
		{
			System.out.println(String.format(
					"DEBUG: [Env] setting '%s' to '%s'",
					key,
					value
				));
			System.out.flush();
		}
		m_Properties.setProperty(key, value);		
	}
	
	
	public void setEnvironmentVariableIfNotExists(
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
		String value = getEnvironmentVariable(key, "").trim().toLowerCase();

		// === RETURN ===
		return StringServiceImpl.IsTrue(value);
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
