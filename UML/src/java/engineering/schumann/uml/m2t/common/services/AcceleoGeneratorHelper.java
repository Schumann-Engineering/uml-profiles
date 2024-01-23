package engineering.schumann.uml.m2t.common.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

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
    	// Try 1: argument
    	var propertiesFile = new File(propertyFileName);
    	if (!propertiesFile.exists())
    		// Try 2: file relative to model
    		propertiesFile = new File(modelFile.getParent() + File.separator + propertyFileName);
    		
    	/*
    	if (!propertiesFile.toFile().exists())
    		// Try 3: eclipse platform
    		propertiesFile = Paths.get("platform:/resources/", args[i]);
		*/
    	
    	if (!propertiesFile.exists())
        	// === FAIL ===
    		throw new FileNotFoundException(propertyFileName);
    	
    	/*
    	 * add properties file to generator
    	 */
    	registerPropertiesFile(propertiesFile.getCanonicalPath(), generator);
    }
    
    
    public static void registerPropertiesFile(
    		String propertyFileName,
    		AbstractAcceleoGenerator generator
    )
    {
    	generator.addPropertiesFile(propertyFileName);
    	    	
    	// add to Environment Service global instance
    	//EnvironmentServiceImpl.INSTANCE.loadEnvironment(propertyFileName);
    }

    
    public static void registerPropertiesFilesNearModel(
    		AbstractAcceleoGenerator generator
    )
    {
	 	var propertiesFilesNearModel = AcceleoEngineUtils.getPropertiesFilesNearModel(generator.getModel().eResource());
		 	
	 	for (String propertiesFileNearModel : propertiesFilesNearModel)
	 		registerPropertiesFile(propertiesFileNearModel, generator);
    }
}
