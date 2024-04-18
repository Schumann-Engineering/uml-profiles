/**
 */
package QWiki.Kernel.impl;

import java.util.UUID;

public abstract class QWikiElementImplCustom extends QWikiElementImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public String getUuid() {
		if (uuid == null)
			setUuid(UUID.randomUUID().toString());
		
		return super.getUuid();
	}
} //QWikiElementImplCustom
