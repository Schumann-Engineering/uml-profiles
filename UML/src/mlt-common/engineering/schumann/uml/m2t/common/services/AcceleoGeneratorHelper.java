package engineering.schumann.uml.m2t.common.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.acceleo.engine.service.AbstractAcceleoGenerator;
import org.eclipse.acceleo.engine.utils.AcceleoEngineUtils;
import org.eclipse.emf.common.util.URI;

/**
 * 
 * 
 * @author Janek Schumann
 * 
 */
public class AcceleoGeneratorHelper {
    public static void registerPropertiesFile(
    		URI modelURI,
    		String propertyFileName,
    		AbstractAcceleoGenerator generator
    )
    throws IOException
    {
    	var modelFile = new File(modelURI.toFileString());
    	
    	/*
    	 * resolve properties file path
    	 */
    	var candidates = Arrays.asList(
    			// = absolut path
    			propertyFileName,
    			// = relative to model
    			modelFile.getParent() + File.separator + propertyFileName
    	);
    	
    	
    	for (var candidate : candidates)
    	{
        	var propertiesFile = new File(candidate);
	    	
	    	/*
	    	// TRY as Eclipse platform
	    	if (!propertiesFile.toFile().exists())
	    		propertiesFile = Paths.get("platform:/resources/", args[i]);
			*/

	    	if (!propertiesFile.exists())
	    		continue;
	    	
	    	/*
	    	 * add properties file to generator
	    	 */
	    	registerPropertiesFile(propertiesFile.getCanonicalPath(), generator);
	    	
	    	// === SUCCESS ===
	    	return;
    	}
    	
    	// === FAIL ===
		throw new FileNotFoundException(propertyFileName);
    }
    
    
    public static void registerPropertiesFile(
    		String propertyFileName,
    		AbstractAcceleoGenerator generator
    )
    throws
    	IOException
    {
    	var propertiesFile = new File(propertyFileName);
    	
    	// TRY as directory
    	if (propertiesFile.isDirectory())
    	{
    		// load all properties files from directory
    		for (var file : propertiesFile.listFiles())
    		{
    			// GUARD: only inspect files
    			if (!file.isFile())
    				continue;
    			
    			// GUARD: check extension
    			var fileName = file.getCanonicalPath();
    			var fileExtension = FilenameUtils.getExtension(fileName);
    			if (!fileExtension.equalsIgnoreCase("properties"))
    				continue;
    			
    			// yay!
    			registerPropertiesFile(fileName, generator);
    		}
    		
    		// === SUCCESS ===
    		return;
    	}
    	
    	
    	System.out.println(String.format(
    			"INFO: reading properties file '%s'",
    			propertyFileName
    	));
    	
    	generator.addPropertiesFile(propertyFileName);
    	    	
    	// add to Environment Service global instance
    	//EnvironmentServiceImpl.INSTANCE.loadEnvironment(propertyFileName);
    }

    
    public static void registerPropertiesFilesNearModel(
    		AbstractAcceleoGenerator generator
    )
    throws
    	IOException
    {
	 	var propertiesFilesNearModel = AcceleoEngineUtils.getPropertiesFilesNearModel(generator.getModel().eResource());
		 	
	 	for (String propertiesFileNearModel : propertiesFilesNearModel)
	 		registerPropertiesFile(propertiesFileNearModel, generator);
    }
}
