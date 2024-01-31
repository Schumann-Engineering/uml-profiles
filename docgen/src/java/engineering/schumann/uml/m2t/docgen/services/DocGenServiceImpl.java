package engineering.schumann.uml.m2t.docgen.services;

import engineering.schumann.uml.docgen.Context;
import engineering.schumann.uml.docgen.DocGenFactory;
import engineering.schumann.uml.profile.csmn.Product;

public class DocGenServiceImpl {
	public Context createContext(
		Object umlElement,
		Product product,
		String softwareVersion,
		String templateUUID
	)
	{
		// === SETUP ===
		var result = DocGenFactory.eINSTANCE.createContext();
		
		// === BODY ===
		result.setUmlElement(umlElement);
		if (product != null)
		{
			result.setProductModel(product.getModel());
			result.setProductName(product.getProductName());
		}
		result.setSoftwareVersion(softwareVersion);
		result.setTemplateUUID(templateUUID);
		
		System.out.println(String.format(
				"DEBUG: [Context] CREATED: id=%s, template=%s, product=%s, model=%s, sw=%s", 
				result.getUUID(),
				result.getTemplateUUID(),
				result.getProductName(),
				result.getProductModel(),
				result.getSoftwareVersion()
			));
		
		// === RESULT ===
		return result;
	}
}
