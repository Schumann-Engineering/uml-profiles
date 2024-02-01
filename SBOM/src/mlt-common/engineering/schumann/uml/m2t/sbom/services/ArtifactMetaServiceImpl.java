package engineering.schumann.uml.m2t.sbom.services;

import engineering.schumann.uml.model.sbom.ArtifactMetadata;
import engineering.schumann.uml.model.sbom.MetadataLibrary;
import engineering.schumann.uml.model.sbom.NamedElement;

public class ArtifactMetaServiceImpl {
	public static ArtifactMetadata FindArtifact(
			NamedElement element,
			MetadataLibrary metadata
	) {
		ArtifactMetadata result = null;
		
		for (var artifact : metadata.getArtifactMeta())
		{
			// try to match name against properties			
			var namePropert = PropertyServiceImpl.FindProperty("name", artifact.getOwnedProperty(), element.getName());
			if (namePropert == null)
				namePropert = PropertyServiceImpl.FindProperty("alias", artifact.getOwnedProperty(), element.getName());
			if (namePropert == null)
				namePropert = PropertyServiceImpl.FindProperty("full name", artifact.getOwnedProperty(), element.getName());
			if (namePropert == null)
				continue;
			// at least we have a partial match = candidate
			result = artifact;

			// try to match version as well
			var versionProperty = PropertyServiceImpl.FindProperty("version", artifact.getOwnedProperty(), element.getVersion());
			if (versionProperty == null)
				continue;
			
			// === SUCCESS ===
			// name + version matches
			return artifact;
		}

		// === RESULT ===
		// MAYBE name matched
		return result;
	}
}
