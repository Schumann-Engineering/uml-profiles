package engineering.schumann.uml.m2t.docgen.services;

import engineering.schumann.uml.docgen.Context;
import engineering.schumann.uml.docgen.DocGenFactory;
import engineering.schumann.uml.profile.csmn.CSMNFactory;
import engineering.schumann.uml.profile.csmn.Product;

public class DocGenServiceImpl {
	public Context createContext(
		Object umlElement,
		Product origProduct,
		String softwareVersion,
		String documentTitle,
		String templateUUID,
		String templateVersion
	)
	{
		// === SETUP ===
		var result = DocGenFactory.eINSTANCE.createContext();
		
		// === BODY ===
		result.setUmlElement(umlElement);
		if (origProduct != null)
		{
			// we have to create a copy of product. Otherwise, the ownership/containment relationship
			// will be automatically changed by EMF
			
			var product = CSMNFactory.eINSTANCE.createProduct();
			product.setModel(origProduct.getModel());
			product.setPlatformType(origProduct.getPlatformType());
			product.setProductName(origProduct.getProductName());
			product.setUdiDi(origProduct.getUdiDi());
			product.setUdiDiBase(origProduct.getUdiDiBase());
			product.setVendorName(origProduct.getVendorName());
			
			result.setProduct(product);
			result.setProductModel(product.getModel());
			result.setProductName(product.getProductName());
		}
		result.setSoftwareVersion(softwareVersion);
		result.setDocumentTitle(documentTitle);
		result.setTemplateUUID(templateUUID);
		result.setTemplateVersion(templateVersion);
		
		System.out.println(String.format(
				"DEBUG: [Context] CREATED: id=%s, title=%s (template=%s; version=%s), product=%s, model=%s, sw=%s", 
				result.getUUID(),
				result.getDocumentTitle(),
				result.getTemplateUUID(),
				result.getTemplateVersion(),
				result.getProductName(),
				result.getProductModel(),
				result.getSoftwareVersion()
			));
		
		// === RESULT ===
		return result;
	}
}
