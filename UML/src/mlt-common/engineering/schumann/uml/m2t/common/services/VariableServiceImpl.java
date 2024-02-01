package engineering.schumann.uml.m2t.common.services;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * The Environment class is used to export environment variables to Acceleo templates
 * 
 * @author Janek Schumann
 * 
 */
public class VariableServiceImpl {
	public static final VariableServiceImpl INSTANCE = new VariableServiceImpl();
	
	public static final String MODEL_URI = "__GLOBAL__.MODEL_URI";
	
	public static final String OUTPUT_DIR = "__GLOBAL__.OUTPUT_FOLDER";
	
	/**
	 * Constant "Last Error Key" (key in properties map which stores last error which occured)
	 */
	private static final String LAST_ERROR_KEY = "__LAST_ERROR__";
	
	
	private List<String> m_ErrorList = new ArrayList<String>();

	
	/**
	 * Property "Properties" which hold a key-value index of key to property
	 */
	private Properties m_Properties = new Properties();

	
	public void clearErrors()
	{
		m_ErrorList.clear();
	}

	
	public void addError(
			String errorMessage
	)
	{
		m_ErrorList.add(errorMessage);
		m_Properties.put(LAST_ERROR_KEY, errorMessage);
		System.out.println(String.format(
				"DEBUG: [Env] an error was logged: %s",
				errorMessage
		));
		
		
		System.out.println(String.format(
				"DEBUG: [Env] %d errors logged so far",
				m_ErrorList.size()
			));
		System.out.flush();
	}
	
	
	public String getVariable(
			String key
	) throws IndexOutOfBoundsException
	{
		return getVariable(key, null, null);
	}

	
	public String getVariable(
			String key,
			String _default
	) throws IndexOutOfBoundsException
	{
		return getVariable(key, _default, null);
	}
	
	
	/**
	 * Returns the environment variable defined by key. Throws an exception if no such variable exists.  
	 * 
	 * @param key
	 * @return Value of environment variable defined by key. 
	 */
	public String getVariable(
			String key,
			String _default,
			Object paramsObj
	)
	throws
		IndexOutOfBoundsException,
		IllegalArgumentException
	{
		// === SETUP ===
		String result = null;
		
		// === BODY ===
		// check if key exists locally
		if (m_Properties.containsKey(key))
		{
			if (!key.startsWith("__"))
			{
				System.out.println(String.format(
					"DEBUG: [Variable] FOUND: '%s' is %s",
					key,
					m_Properties.getProperty(key)
				));
				System.out.flush();
			}
				
			result = m_Properties.getProperty(key);
		}
		// check global instance
		else if (this != INSTANCE)
			result = INSTANCE.getVariable(key, _default);
		
		
		/*
		 * use default
		 */
		if (result == null)
		{
			if (!key.startsWith("__"))
				System.out.println(String.format(
						"DEBUG: [Variable] DEFAULT: '%s' is '%s'",
						key,
						_default
					));
			
			result = _default;
		}
		
		
		/*
		 * replace parameter, if any
		 */
		if (paramsObj != null)
		{
			if (!(paramsObj instanceof ArrayList))
				throw new IllegalArgumentException("List<String> expected as parameter 'params' Got: " + paramsObj.getClass().getName());
			@SuppressWarnings("unchecked")
			var params = (ArrayList<String>)paramsObj;
			
			result = MessageFormat.format(result, params.toArray(new Object[0]));
		}
		
		// === RESULT ===
		return result;
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
			
			addError(String.format(
					"Couldn't load properties from file '%s'. Error: %s",
					fileName,
					e.getMessage()
			));
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
	
	
	public void setVariable(
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
					"DEBUG: [Variable] SET: '%s' to '%s'",
					key,
					value
				));
			System.out.flush();
		}
		m_Properties.setProperty(key, value);		
	}
	
	
	public void setVariableIfNotExists(
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
		return !m_ErrorList.isEmpty();
	}
	
	
	public String lastError()
	{
		if (!hasError())
			return null;
		
		return m_ErrorList.get(m_ErrorList.size() - 1);
	}
	
	
	public List<String> getErrors()
	{
		return m_ErrorList;
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
		String value = getVariable(key, "").trim().toLowerCase();

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
