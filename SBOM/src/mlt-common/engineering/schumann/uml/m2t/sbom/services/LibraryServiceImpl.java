package engineering.schumann.uml.m2t.sbom.services;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

import engineering.schumann.uml.m2t.common.services.FileServiceImpl;
import engineering.schumann.uml.model.sbom.MetadataLibrary;
import engineering.schumann.uml.model.sbom.SBOMFactory;



public class LibraryServiceImpl {
	public final static String SHEET_NAME_ARTIFACT = "Artifact";

	
	public final static String SHEET_NAME_SUPPLIER = "Supplier";
	
	
	public final static List<String> LIBRARY_FILE_EXTENSIONS = Arrays.asList( ".xlsx" );

	
	public final static String DEFAULT_METADATA_LIBRARY_NAME = "sbom-metadata-database";

	public static MetadataLibrary LIBRARY = null;
	
	
	public static void LoadSbomLibrary()
	{
		try
		{
			LIBRARY = ReadSbomLibrary();
			
			// === SUCCESS ===
			System.out.println("INFO: loaded SBOM library");
		}
		catch (Exception e)
		{
			// === SUCCESS ===
			System.err.println(String.format(
					"ERROR: failed to load SBOM library: %s",
					e.getMessage()
				));
		}
	}
	
	public static MetadataLibrary ReadSbomLibrary(
	) 
	throws
		Exception
	{		
		if (LIBRARY != null)
			return LIBRARY;
		
		return ReadSbomLibrary(DEFAULT_METADATA_LIBRARY_NAME, FileServiceImpl.EMPTY_PATH_LIST);
	}

	
	public static MetadataLibrary ReadSbomLibrary(
			String	name
	) 
	throws
		Exception
	{				
		return ReadSbomLibrary(name, FileServiceImpl.EMPTY_PATH_LIST);
	}
	
	
	public static MetadataLibrary ReadSbomLibrary(
			String	name,
			Object	pathsObj
	) 
	throws
		Exception
	{		
        /*
         * read file
         */
		// resolve filename
		var filename = FileServiceImpl.resolveFilename(name, pathsObj, LIBRARY_FILE_EXTENSIONS, false);
		if (filename == null)
			filename = FileServiceImpl.resolveFilename(DEFAULT_METADATA_LIBRARY_NAME, pathsObj, LIBRARY_FILE_EXTENSIONS, false);
		if (filename == null)
			throw new Exception(String.format(
					"Could not find SBOM Metadata Library file for '%s'",
					name
				));
		
		// read workbook from file
		var factory = new XSSFWorkbookFactory();
		var workbook = factory.create(new File(filename), null, true);
	
		
        /*
         * create library
         */
		try
		{
			// library first to add as back-reference
			var library = SBOMFactory.eINSTANCE.createMetadataLibrary();
			
			// read suppliers next, because they get referenced by artifacts
			ReadSuppliers(library, workbook);
			
			// read artifacts next
			ReadArtifacts(library, workbook);
			
	        // === SUCCESS ===
	        return library;
		}
        /*
         * done
         */
		finally
		{
	        workbook.close();
		}

		// === RESULT ===
		// nothing, early return in try
	}
	
	
	private static void ReadArtifacts(
		MetadataLibrary library,
		XSSFWorkbook workbook
	)
	{
		// === SETUP ===
		var metadata = new Object() {
			List<String> header = null;
		};
		
		// === BODY ===
        ReadSheet(workbook, SHEET_NAME_ARTIFACT,
        	// header
        	new Consumer<List<String>>() {
        		@Override
        		public void accept(java.util.List<String> t) {
        			// store header for later lookup of column index
        			metadata.header = t;
        		};
        	},
        	// data row
	    	new Consumer<List<String>>() {
	    		@Override
	    		public void accept(java.util.List<String> t) {
	    			// create new artifact metadata to fill in values
	    			var artifact = SBOMFactory.eINSTANCE.createArtifactMetadata();
	    			
	    			// add it to the library
	    			// NOTE: EMF takes care of back-reference handling
	    			artifact.setLibrary(library);
	    			
	    			// store anything from the worksheet as key:value => property
	    			for (int i=0; i<t.size(); i++)
	    			{
	    				// GUARD: header needs column, too
	    				if (i >= metadata.header.size())
	    				{
	    					if (t.get(i) != null)
		    					System.err.println(String.format(
		    						"WARN: [SBOM] found entry without header column for '%s': #%d with value '%s'",
		    						t.get(0),
		    						i,
		    						t.get(i)
		    					));
	    					continue;
	    				}
	    				
	    				var key = metadata.header.get(i);
	    				var value = t.get(i);
	    				
	    				if (key == null)
	    					continue;
	    				key = key.trim();
	    				
	    				switch (key.toLowerCase())
	    				{
	    					case "supplier":
	    						// try to find supplier
	    						for (var supplier : library.getSupplierMeta())
	    						{
	    							for (var property : supplier.getOwnedProperty())
	    							{
	    								if (property.getKey() == null || !property.getKey().equalsIgnoreCase("name"))
	    									continue;
	    								
	    								if (property.getValue() == null || !property.getValue().trim().equalsIgnoreCase(value))
	    									continue;
	    								
	    								artifact.setSupplier(supplier);
	    								
	    								break;
	    							};
	    							
	    							if (artifact.getSupplier() != null)
	    								break;
	    						}
	    				
	    				
	    					// store EVERYTHING as property, even though it was processed earlier
	    					// this gives us the chance to debug, search by key, etc. in Acceleo templates
	    					default:
	    	    				var property = SBOMFactory.eINSTANCE.createProperty();
	    	    				property.setKey(key);
	    	    				property.setValue(value);
	    	    				artifact.getOwnedProperty().add(property);
	    	    				break;
	    				}	    				
	    			}
	    		};
	    	}
        );
		
		// === RESULT ===
		// nothing
	}

	
	
	private static void ReadSuppliers(
		MetadataLibrary library,
		XSSFWorkbook workbook
	)
	{
		// === SETUP ===
		var metadata = new Object() {
			List<String> header = null;
		};
		
		// === BODY ===
        ReadSheet(workbook, SHEET_NAME_SUPPLIER,
        	// header
        	new Consumer<List<String>>() {
        		@Override
        		public void accept(java.util.List<String> t) {
        			// store header for later lookup of column index
        			metadata.header = t;
        		};
        	},
        	// data row
	    	new Consumer<List<String>>() {
	    		@Override
	    		public void accept(java.util.List<String> t) {
	    			// create new supplier metadata to fill in values
	    			var supplier = SBOMFactory.eINSTANCE.createSupplierMetadata();
	    			
	    			// add it to the library
	    			// NOTE: EMF takes care of back-reference handling
	    			supplier.setLibrary(library);
	    			
	    			// store anything from the worksheet as key:value => property
	    			for (int i=0; i<t.size(); i++)
	    			{
	    				// GUARD: header needs column, too
	    				if (i >= metadata.header.size())
	    				{
	    					if (t.get(i) != null)
		    					System.err.println(String.format(
			    						"WARN: [SBOM] found entry without header column for '%s': #%d with value '%s'",
			    						t.get(0),
			    						i,
			    						t.get(i)
			    					));
	    					continue;
	    				}
	    				
	    				var property = SBOMFactory.eINSTANCE.createProperty();
	    				property.setKey(metadata.header.get(i));
	    				property.setValue(t.get(i));
	    				supplier.getOwnedProperty().add(property);
	    			}
	    		};
	    	}
        );
		
		// === RESULT ===
		// nothing
	}

	
	
	
	private static void ReadSheet(
		XSSFWorkbook workbook,
		String worksheetName,
		Consumer<List<String>> headerRowProcessor,
		Consumer<List<String>> dataRowProcessor
	)
	{
		// === BODY ===
        var sheet = workbook.getSheet(worksheetName);
        
        /*
         * read lines
         */
        var rowIterator = sheet.iterator();
        var isHeader = true;
        var evaluator = workbook.getCreationHelper().createFormulaEvaluator();
        while (rowIterator.hasNext()) 
        {
            /*
             * read row
             */
            var row = rowIterator.next();            
            var values = new ArrayList<String>();
            var lastCellNum = row.getLastCellNum();
            
            
            for (int i=0; i<lastCellNum; i++)
            {
            	var cell = row.getCell(i, MissingCellPolicy.RETURN_BLANK_AS_NULL);
            	
            	if (cell == null)
            	{
            		values.add(null);
            		continue;
            	}

                var cellValue = evaluator.evaluate(cell);
                
                if (cellValue == null)
                {
            		values.add(null);
            		continue;
                }
                
                // Check the cell type and format accordingly
                switch (cellValue.getCellType()) 
                {
                    case NUMERIC:
                        values.add(Double.toString(cellValue.getNumberValue()));
                        break;
                        
                    case STRING:
                        values.add(cellValue.getStringValue());
                        break;
                        
                    case BLANK:
                    	values.add(null);
                    	break;
                    	
                    case BOOLEAN:
                    	values.add(Boolean.toString(cellValue.getBooleanValue()));
                    	
                    case ERROR:
                    	values.add("ERROR: " + cellValue.getErrorValue());
                    	break;
                    	
                    default:
                    	break;
                }
            }

            
            /*
             * parse row as header
             */
            if (isHeader)
            {
            	headerRowProcessor.accept(values);
            
            	isHeader = false;
            	continue;
            }

            /*
             * parse row as data row
             */
        	dataRowProcessor.accept(values);            
        }
		
		// === RESULT ===
        // nothing
	}	
}
