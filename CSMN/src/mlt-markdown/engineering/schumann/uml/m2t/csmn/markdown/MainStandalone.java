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

import org.eclipse.acceleo.engine.utils.AcceleoEngineUtils;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;

import engineering.schumann.uml.m2t.csmn.Activator;

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

        // UML 2.5.0
        if (!isInWorkspace(org.eclipse.uml2.uml.UMLPackage.class)) {
            resourceSet.getPackageRegistry().put(org.eclipse.uml2.uml.UMLPackage.eINSTANCE.getNsURI(), org.eclipse.uml2.uml.UMLPackage.eINSTANCE);
        }
        
        
		// http:///CSMN/Characteristics/Asset.ecore 
        if (!isInWorkspace(CSMN.Characteristics.Asset.AssetPackage.class))
        resourceSet.getPackageRegistry().put(
        		CSMN.Characteristics.Asset.AssetPackage.eNS_URI,
        		CSMN.Characteristics.Asset.AssetPackage.eINSTANCE        		
		);
		
		// http:///CSMN/Characteristics/Energy.ecore 
        if (!isInWorkspace(CSMN.Characteristics.Energy.EnergyPackage.class))
		resourceSet.getPackageRegistry().put(
				CSMN.Characteristics.Energy.EnergyPackage.eNS_URI,
        		CSMN.Characteristics.Energy.EnergyPackage.eINSTANCE
		);
		
		// http:///CSMN/Characteristics/Flow.ecore
        if (!isInWorkspace(CSMN.Characteristics.Flow.FlowPackage.class))
		resourceSet.getPackageRegistry().put(
				CSMN.Characteristics.Flow.FlowPackage.eNS_URI,
        		CSMN.Characteristics.Flow.FlowPackage.eINSTANCE
		);
		
		// http:///CSMN/Characteristics/Interface.ecore
        if (!isInWorkspace(CSMN.Characteristics.Interface.InterfacePackage.class))
		resourceSet.getPackageRegistry().put(
				CSMN.Characteristics.Interface.InterfacePackage.eNS_URI,
				CSMN.Characteristics.Interface.InterfacePackage.eINSTANCE
		);
		
		// http:///CSMN/Characteristics/Material.ecore
        if (!isInWorkspace(CSMN.Characteristics.Material.MaterialPackage.class))
		resourceSet.getPackageRegistry().put(
				CSMN.Characteristics.Material.MaterialPackage.eNS_URI,
        		CSMN.Characteristics.Material.MaterialPackage.eINSTANCE
		);
		
		// http:///CSMN/Characteristics/Storage.ecore
        if (!isInWorkspace(CSMN.Characteristics.Storage.StoragePackage.class))
		resourceSet.getPackageRegistry().put(
				CSMN.Characteristics.Storage.StoragePackage.eNS_URI,
        		CSMN.Characteristics.Storage.StoragePackage.eINSTANCE
		);
		
		// http:///CSMN/Connections.ecore		
        if (!isInWorkspace(CSMN.Connections.ConnectionsPackage.class))
		resourceSet.getPackageRegistry().put(
				CSMN.Connections.ConnectionsPackage.eNS_URI,
        		CSMN.Connections.ConnectionsPackage.eINSTANCE
		);
		
		// http:///CSMN/Elements.ecore
        if (!isInWorkspace(CSMN.Elements.ElementsPackage.class))
		resourceSet.getPackageRegistry().put(
				CSMN.Elements.ElementsPackage.eNS_URI,
        		CSMN.Elements.ElementsPackage.eINSTANCE
		);
		
		// http:///CSMN/Lifecycle.ecore
        if (!isInWorkspace(CSMN.Lifecycle.LifecyclePackage.class))
		resourceSet.getPackageRegistry().put(
				CSMN.Lifecycle.LifecyclePackage.eNS_URI,
				CSMN.Lifecycle.LifecyclePackage.eINSTANCE
		);
		
		// http:///CSMN/PrimitiveTypes.ecore
        if (!isInWorkspace(CSMN.PrimitiveTypes.PrimitiveTypesPackage.class))
		resourceSet.getPackageRegistry().put(
				CSMN.PrimitiveTypes.PrimitiveTypesPackage.eNS_URI,
				CSMN.PrimitiveTypes.PrimitiveTypesPackage.eINSTANCE
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
