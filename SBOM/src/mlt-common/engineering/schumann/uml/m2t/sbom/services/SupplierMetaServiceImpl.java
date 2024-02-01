package engineering.schumann.uml.m2t.sbom.services;

import engineering.schumann.uml.model.sbom.MetadataLibrary;
import engineering.schumann.uml.model.sbom.SupplierMetadata;

public class SupplierMetaServiceImpl {
	public static SupplierMetadata FindSupplier(
			String supplierName,
			MetadataLibrary metadata
	) {
		for (var supplier : metadata.getSupplierMeta())
		{
			var nameProperty = PropertyServiceImpl.FindProperty("name", supplier.getOwnedProperty(), supplierName);
			if (nameProperty == null)
				nameProperty = PropertyServiceImpl.FindProperty("full name", supplier.getOwnedProperty(), supplierName);
			if (nameProperty == null)
				nameProperty = PropertyServiceImpl.FindProperty("cpe name", supplier.getOwnedProperty(), supplierName);
			if (nameProperty == null)
				continue;

			// === SUCCESS ===
			return supplier;
		}
		
		// === FAIL ===
		return null;
	}
}
