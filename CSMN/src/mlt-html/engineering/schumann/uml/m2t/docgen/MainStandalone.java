/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package engineering.schumann.uml.m2t.docgen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.acceleo.engine.utils.AcceleoEngineUtils;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

import engineering.schumann.uml.m2t.services.EnvironmentServiceImpl;
import engineering.schumann.uml.profile.csmn.CSMNFactory;
import engineering.schumann.uml.profile.csmn.CSMNPackage;

/**
 * Entry point of the 'Generate' generation module.
 *
 * @generated
 */
public class MainStandalone extends Main { // extends AbstractAcceleoGenerator {
    /**
     * The name of the module.
     *
     * @generated
     */
    public static final String MODULE_FILE_NAME = Main.MODULE_FILE_NAME;
    
    /**
     * The name of the templates that are to be generated.
     *
     * @generated
     */
    public static final String[] TEMPLATE_NAMES = Main.TEMPLATE_NAMES;

    
    public MainStandalone()
    {
    	super();
        // Empty implementation
    }

    public MainStandalone(URI modelURI, File targetFolder,
            List<? extends Object> arguments) throws IOException {
    	super(modelURI, targetFolder, arguments);
        initialize(modelURI, targetFolder, arguments);
    }

    
    public MainStandalone(EObject model, File targetFolder,
            List<? extends Object> arguments) throws IOException {
    	super(model, targetFolder, arguments);
        initialize(model, targetFolder, arguments);
    }

    
	public void initialize(URI modelURI, File folder, List<?> arguments)
			throws IOException 
	{
		super.initialize(modelURI, folder, arguments);
		
		EnvironmentServiceImpl.INSTANCE.setProperty(EnvironmentServiceImpl.MODEL_URI, modelURI.devicePath());
		EnvironmentServiceImpl.INSTANCE.setProperty(EnvironmentServiceImpl.OUTPUT_DIR, folder.getAbsolutePath());
	}    
    
    /**
     * This can be used to launch the generation from a standalone application.
     * 
     * @param args
     *            Arguments of the generation.
     * @generated
     */
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                System.out.println("Arguments not valid : {model, folder}.");
            } else {
                URI modelURI = URI.createFileURI(args[0]);
                File folder = new File(args[1]);
                
                List<String> arguments = new ArrayList<String>();
                
                /*
                 * If you want to change the content of this method, do NOT forget to change the "@generated"
                 * tag in the Javadoc of this method to "@generated NOT". Without this new tag, any compilation
                 * of the Acceleo module with the main template that has caused the creation of this class will
                 * revert your modifications.
                 */

                /*
                 * Add in this list all the arguments used by the starting point of the generation
                 * If your main template is called on an element of your model and a String, you can
                 * add in "arguments" this "String" attribute.
                 */
                
                Main generator = new MainStandalone(modelURI, folder, arguments);
                
                /*
                 * Add the properties from the launch arguments.
                 * If you want to programmatically add new properties, add them in "propertiesFiles"
                 * You can add the absolute path of a properties files, or even a project relative path.
                 * If you want to add another "protocol" for your properties files, please override 
                 * "getPropertiesLoaderService(AcceleoService)" in order to return a new property loader.
                 * The behavior of the properties loader service is explained in the Acceleo documentation
                 * (Help -> Help Contents).
                 */
                 
                for (int i = 2; i < args.length; i++) {
                	var modelFile = new File(modelURI.toFileString());
                	
                	/*
                	 * resolve properties file path
                	 */
                	// Try 1: argument
                	var propertiesFile = new File(args[i]);
                	if (!propertiesFile.exists())
                		// Try 2: file relative to model
                		propertiesFile = new File(modelFile.getParent() + File.separator + args[i]);
                		
                	/*
                	if (!propertiesFile.toFile().exists())
                		// Try 3: eclipse platform
                		propertiesFile = Paths.get("platform:/resources/", args[i]);
					*/
                	
                	if (!propertiesFile.exists())
                    	// === FAIL ===
                		throw new FileNotFoundException(args[i]);
                	
                	/*
                	 * add properties file to generator
                	 */
                    generator.addPropertiesFile(
                    	propertiesFile.getAbsolutePath()
                    );
                }
                
                
                // If you want to let your users add properties files located in the same folder as the model:
   			 	var propertiesFilesNearModel = AcceleoEngineUtils.getPropertiesFilesNearModel(generator.getModel().eResource());
   			 	
   			 	for (String propertiesFileNearModel : propertiesFilesNearModel)
   			 		generator.addPropertiesFile(propertiesFileNearModel);
                
                
                generator.doGenerate(new BasicMonitor());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    @Override
    public void registerPackages(ResourceSet resourceSet) {
        super.registerPackages(resourceSet);

		
		resourceSet.getPackageRegistry().putIfAbsent(
				CSMNPackage.eINSTANCE.getNsURI(),
				CSMNPackage.eINSTANCE
		);			

		// pathmap://CSMN/profile/CSMN.profile.uml#_Sv9oAKTMEe6ULIx8cDHqqA
		URIConverter.URI_MAP.put(
	    		URI.createURI("pathmap://CSMN/profile/CSMN.profile.uml"), 
	    		URI.createFileURI("C:\\_repos\\schumann.engineering\\uml-profiles\\CSMN\\src\\uml\\CSMN.profile.uml")
	    );

		URIConverter.URI_MAP.put(
	    		URI.createURI("platform:/plugin/engineering.schumann.uml.profile.csmn/src/uml/CSMN.profile.uml"), 
	    		URI.createFileURI("C:\\_repos\\schumann.engineering\\uml-profiles\\CSMN\\src\\uml\\CSMN.profile.uml")
	    );

		
/*
		URI uri = URI.createURI("file:///anonymous.uml");
	    URIConverter.URI_MAP.put(
	    		URI.createURI(UMLResource.LIBRARIES_PATHMAP), 
	    		uri.appendSegment("libraries").appendSegment("")
	    );
	    _Sv9oAKTMEe6ULIx8cDHqqA
	    URIConverter.URI_MAP.put(URI.createURI(UMLResource.METAMODELS_PATHMAP), uri.appendSegment("metamodels").appendSegment(""));
	    URIConverter.URI_MAP.put(URI.createURI(UMLResource.PROFILES_PATHMAP), uri.appendSegment("profiles").appendSegment(""));
	    URIConverter.URI_MAP.put(URI.createURI(UMLResource.ECORE_PRIMITIVE_TYPES_LIBRARY_URI), uri.appendSegment("ecore_primitive_types").appendSegment(""));
	    URIConverter.URI_MAP.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP),  URI.createFileURI(library));
*/		
        // platform:/plugin/engineering.schumann.uml.profile.csmn/src/uml/CSMN.profile.uml#_Sv9oAKTMEe6ULIx8cDHqqA

		/*
        UMLResourcesUtil.init(resourceSet);

        URI profileURI  = URI.createURI("platform:/plugin/engineering.schumann.uml.profile.csmn/src/uml/CSMN.profile.uml#_Sv9oAKTMEe6ULIx8cDHqqA"); // URI.createFileURI(*** your profile file location *** );
        Resource profileResource = resourceSet.getResource(profileURI, true);
        EList<EObject> profileContent = profileResource.getContents();
        Profile profile = (Profile)EcoreUtil.getObjectByType(profileContent, UMLPackage.Literals.PROFILE);

        EPackage definitionPackage = (EPackage) profile.getDefinition();
        resourceSet.getPackageRegistry().put(definitionPackage.getNsURI(), definitionPackage);
        
        UMLPlugin.getEPackageNsURIToProfileLocationMap().putIfAbsent(
        		CSMNPackage.eINSTANCE.getNsURI(),
        		EcoreUtil.getURI(profile)
        );
        */
		
        UMLResourcesUtil.init(resourceSet);
   }    
    
    @Override
    public void registerResourceFactories(ResourceSet resourceSet) {
        super.registerResourceFactories(resourceSet);
        
        resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().putIfAbsent(
        		"csmn",
        		CSMNFactory.eINSTANCE
        );
        
        
        /*
         * Some metamodels require a very complex setup for standalone usage. For example, if you want to use a generator
         * targetting UML models in standalone, you NEED to use the following:
         */
        UMLResourcesUtil.init(resourceSet);
    }
}