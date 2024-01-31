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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

import engineering.schumann.uml.m2t.common.services.AcceleoGeneratorHelper;
import engineering.schumann.uml.m2t.common.services.EnvironmentServiceImpl;
import engineering.schumann.uml.model.sbom.SBOMFactory;
import engineering.schumann.uml.model.sbom.SBOMPackage;
import engineering.schumann.uml.profile.csmn.CSMNFactory;
import engineering.schumann.uml.profile.csmn.CSMNPackage;

/**
 * Entry point of the 'Generate' generation module.
 *
 * @generated
 */
public class Main2htmlStandalone extends Main2html { // extends AbstractAcceleoGenerator {
    /**
     * The name of the module.
     *
     * @generated
     */
    public static final String MODULE_FILE_NAME = Main2html.MODULE_FILE_NAME;
    
    /**
     * The name of the templates that are to be generated.
     *
     * @generated
     */
    public static final String[] TEMPLATE_NAMES = Main2html.TEMPLATE_NAMES;

    
    public Main2htmlStandalone()
    {
    	super();
        // Empty implementation
    }

    public Main2htmlStandalone(URI modelURI, File targetFolder,
            List<? extends Object> arguments) throws IOException {
    	super(modelURI, targetFolder, arguments);
        initialize(modelURI, targetFolder, arguments);
    }

    
    public Main2htmlStandalone(EObject model, File targetFolder,
            List<? extends Object> arguments) throws IOException {
    	super(model, targetFolder, arguments);
        initialize(model, targetFolder, arguments);
    }

    
	public void initialize(URI modelURI, File folder, List<?> arguments)
			throws IOException 
	{
		super.initialize(modelURI, folder, arguments);
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
                
                Main2html generator = new Main2htmlStandalone(modelURI, folder, arguments);
                
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
                    // generator.addPropertiesFile(args[i]);
                	AcceleoGeneratorHelper.registerPropertiesFile(modelURI, args[i], generator);
                }
                
                // If you want to let your users add properties files located in the same folder as the model:
                AcceleoGeneratorHelper.registerPropertiesFilesNearModel(generator);
                
                // NASTY HACK: this does not work in multi-threaded environments
                // the main issue: accessing generator settings from a template is not possible. :(
                EnvironmentServiceImpl.INSTANCE.setEnvironmentVariable(EnvironmentServiceImpl.MODEL_URI, modelURI.devicePath());
                EnvironmentServiceImpl.INSTANCE.setEnvironmentVariable(EnvironmentServiceImpl.OUTPUT_DIR, folder.getCanonicalPath());
                
   			 	// GO TIME!
                generator.doGenerate(new BasicMonitor());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    @Override
    public void registerPackages(ResourceSet resourceSet) {
        super.registerPackages(resourceSet);


        /* ====================
         * CSMN
         * ==================== */
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

		
        /* ====================
         * SBOM
         * ==================== */
		resourceSet.getPackageRegistry().putIfAbsent(
				SBOMPackage.eINSTANCE.getNsURI(),
				SBOMPackage.eINSTANCE
		);			
		
		
        /* ====================
         * init
         * ==================== */
        UMLResourcesUtil.init(resourceSet);
   }    
    
    @Override
    public void registerResourceFactories(ResourceSet resourceSet) {
        super.registerResourceFactories(resourceSet);
        
        resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().putIfAbsent(
        		"csmn",
        		CSMNFactory.eINSTANCE
        );

        resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().putIfAbsent(
        		"sbom",
        		SBOMFactory.eINSTANCE
        );		
        
        /*
         * Some metamodels require a very complex setup for standalone usage. For example, if you want to use a generator
         * targetting UML models in standalone, you NEED to use the following:
         */
        UMLResourcesUtil.init(resourceSet);
    }
    
    @Override
    public void doGenerate(Monitor monitor) throws IOException {
    	// resolve all proxies
    	// this should ensure that all profiles are loaded correctly.
        org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(model);

    	super.doGenerate(monitor);
    }
}
