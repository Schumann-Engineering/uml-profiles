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
package engineering.schumann.uml.m2t.csmn.markdown;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

import CSMN.CSMNPackage;

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
                	/*
                    generator.addPropertiesFile(
                    		// prefix
                    		"platform:/plugin/" +
                            // pluginName
                    		Activator.PLUGIN_ID +
                    		// packagePath
                    		// - ignore
                    		// fileName 
                    		args[i]
                    );
                    */
                	
                    generator.addPropertiesFile(
                    		args[i]
                    );
                }
                
                
                // If you want to let your users add properties files located in the same folder as the model:
                /*
                if (EMFPlugin.IS_ECLIPSE_RUNNING && model != null && model.eResource() != null) { 
                	 propertiesFiles.addAll(AcceleoEngineUtils.getPropertiesFilesNearModel(model.eResource()));
                }
                */
                
                
                generator.doGenerate(new BasicMonitor());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    @Override
    public void registerPackages(ResourceSet resourceSet) {
        super.registerPackages(resourceSet);

		
		// http:///CSMN/Lifecycle.ecore
        if (!isInWorkspace(CSMNPackage.class))
        {
        	// PROFILE
        	// URI: pathmap://CSMN/CSMN.profile.uml#_Sv9oAKTMEe6ULIx8cDHqqA
			resourceSet.getPackageRegistry().put(
					"pathmap://CSMN/CSMN.profile.uml#_Sv9oAKTMEe6ULIx8cDHqqA",
					CSMNPackage.eINSTANCE
			);
        	
        	
			resourceSet.getPackageRegistry().put(
					CSMNPackage.eNS_URI,
					CSMNPackage.eINSTANCE
			);
			
        }
        
        Map<URI, URI> uriMap = resourceSet.getURIConverter().getURIMap();
        uriMap.put(
        		URI.createURI("pathmap://CSMN/CSMN.profile.uml#_Sv9oAKTMEe6ULIx8cDHqqA"),
        		URI.createURI("http://schumann.engineering/csmn/1#CSMN")
        );
        uriMap.put(
        		URI.createURI("pathmap://CSMN/CSMN.profile.uml"),
        		URI.createURI("http://schumann.engineering/csmn/1")
        );
   }    
    
    @Override
    public void registerResourceFactories(ResourceSet resourceSet) {
        super.registerResourceFactories(resourceSet);
        
        /*
         * Some metamodels require a very complex setup for standalone usage. For example, if you want to use a generator
         * targetting UML models in standalone, you NEED to use the following:
         */
        UMLResourcesUtil.init(resourceSet);
    }
}
