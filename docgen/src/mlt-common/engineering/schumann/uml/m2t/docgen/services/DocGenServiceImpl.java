package engineering.schumann.uml.m2t.docgen.services;

import engineering.schumann.uml.docgen.Context;
import engineering.schumann.uml.docgen.DocGenFactory;
import engineering.schumann.uml.profile.csmn.Product;

public class DocGenServiceImpl {
	public Context createContext(
		Object umlElement,
		Product product,
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
		if (product != null)
		{
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
