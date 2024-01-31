/**
 */
package engineering.schumann.uml.docgen.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import engineering.schumann.uml.docgen.Context;
import engineering.schumann.uml.docgen.DocGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.docgen.impl.ContextImpl#getUmlElement <em>Uml Element</em>}</li>
 *   <li>{@link engineering.schumann.uml.docgen.impl.ContextImpl#getProductName <em>Product Name</em>}</li>
 *   <li>{@link engineering.schumann.uml.docgen.impl.ContextImpl#getProductModel <em>Product Model</em>}</li>
 *   <li>{@link engineering.schumann.uml.docgen.impl.ContextImpl#getSoftwareVersion <em>Software Version</em>}</li>
 *   <li>{@link engineering.schumann.uml.docgen.impl.ContextImpl#getTemplateUUID <em>Template UUID</em>}</li>
 *   <li>{@link engineering.schumann.uml.docgen.impl.ContextImpl#getUUID <em>UUID</em>}</li>
 *   <li>{@link engineering.schumann.uml.docgen.impl.ContextImpl#getDocumentTitle <em>Document Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContextImpl extends MinimalEObjectImpl.Container implements Context {
	/**
	 * The default value of the '{@link #getUmlElement() <em>Uml Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlElement()
	 * @generated
	 * @ordered
	 */
	protected static final Object UML_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUmlElement() <em>Uml Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlElement()
	 * @generated
	 * @ordered
	 */
	protected Object umlElement = UML_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductName() <em>Product Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected String productName = PRODUCT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getProductModel() <em>Product Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductModel()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCT_MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProductModel() <em>Product Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductModel()
	 * @generated
	 * @ordered
	 */
	protected String productModel = PRODUCT_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSoftwareVersion() <em>Software Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String SOFTWARE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSoftwareVersion() <em>Software Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareVersion()
	 * @generated
	 * @ordered
	 */
	protected String softwareVersion = SOFTWARE_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplateUUID() <em>Template UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateUUID()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateUUID() <em>Template UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateUUID()
	 * @generated
	 * @ordered
	 */
	protected String templateUUID = TEMPLATE_UUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getUUID() <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUUID() <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUUID()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentTitle() <em>Document Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentTitle() <em>Document Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentTitle()
	 * @generated
	 * @ordered
	 */
	protected String documentTitle = DOCUMENT_TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocGenPackage.Literals.CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getUmlElement() {
		return umlElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUmlElement(Object newUmlElement) {
		Object oldUmlElement = umlElement;
		umlElement = newUmlElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocGenPackage.CONTEXT__UML_ELEMENT, oldUmlElement, umlElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductName() {
		return productName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductName(String newProductName) {
		String oldProductName = productName;
		productName = newProductName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocGenPackage.CONTEXT__PRODUCT_NAME, oldProductName, productName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProductModel() {
		return productModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductModel(String newProductModel) {
		String oldProductModel = productModel;
		productModel = newProductModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocGenPackage.CONTEXT__PRODUCT_MODEL, oldProductModel, productModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSoftwareVersion() {
		return softwareVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSoftwareVersion(String newSoftwareVersion) {
		String oldSoftwareVersion = softwareVersion;
		softwareVersion = newSoftwareVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocGenPackage.CONTEXT__SOFTWARE_VERSION, oldSoftwareVersion, softwareVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTemplateUUID() {
		return templateUUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemplateUUID(String newTemplateUUID) {
		String oldTemplateUUID = templateUUID;
		templateUUID = newTemplateUUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocGenPackage.CONTEXT__TEMPLATE_UUID, oldTemplateUUID, templateUUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getUUID() {
		if (uuid == null)
			setUUID( org.eclipse.emf.ecore.util.EcoreUtil.generateUUID());
		
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUUID(String newUUID) {
		String oldUUID = uuid;
		uuid = newUUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocGenPackage.CONTEXT__UUID, oldUUID, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentTitle() {
		return documentTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentTitle(String newDocumentTitle) {
		String oldDocumentTitle = documentTitle;
		documentTitle = newDocumentTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocGenPackage.CONTEXT__DOCUMENT_TITLE, oldDocumentTitle, documentTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DocGenPackage.CONTEXT__UML_ELEMENT:
				return getUmlElement();
			case DocGenPackage.CONTEXT__PRODUCT_NAME:
				return getProductName();
			case DocGenPackage.CONTEXT__PRODUCT_MODEL:
				return getProductModel();
			case DocGenPackage.CONTEXT__SOFTWARE_VERSION:
				return getSoftwareVersion();
			case DocGenPackage.CONTEXT__TEMPLATE_UUID:
				return getTemplateUUID();
			case DocGenPackage.CONTEXT__UUID:
				return getUUID();
			case DocGenPackage.CONTEXT__DOCUMENT_TITLE:
				return getDocumentTitle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DocGenPackage.CONTEXT__UML_ELEMENT:
				setUmlElement(newValue);
				return;
			case DocGenPackage.CONTEXT__PRODUCT_NAME:
				setProductName((String)newValue);
				return;
			case DocGenPackage.CONTEXT__PRODUCT_MODEL:
				setProductModel((String)newValue);
				return;
			case DocGenPackage.CONTEXT__SOFTWARE_VERSION:
				setSoftwareVersion((String)newValue);
				return;
			case DocGenPackage.CONTEXT__TEMPLATE_UUID:
				setTemplateUUID((String)newValue);
				return;
			case DocGenPackage.CONTEXT__UUID:
				setUUID((String)newValue);
				return;
			case DocGenPackage.CONTEXT__DOCUMENT_TITLE:
				setDocumentTitle((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DocGenPackage.CONTEXT__UML_ELEMENT:
				setUmlElement(UML_ELEMENT_EDEFAULT);
				return;
			case DocGenPackage.CONTEXT__PRODUCT_NAME:
				setProductName(PRODUCT_NAME_EDEFAULT);
				return;
			case DocGenPackage.CONTEXT__PRODUCT_MODEL:
				setProductModel(PRODUCT_MODEL_EDEFAULT);
				return;
			case DocGenPackage.CONTEXT__SOFTWARE_VERSION:
				setSoftwareVersion(SOFTWARE_VERSION_EDEFAULT);
				return;
			case DocGenPackage.CONTEXT__TEMPLATE_UUID:
				setTemplateUUID(TEMPLATE_UUID_EDEFAULT);
				return;
			case DocGenPackage.CONTEXT__UUID:
				setUUID(UUID_EDEFAULT);
				return;
			case DocGenPackage.CONTEXT__DOCUMENT_TITLE:
				setDocumentTitle(DOCUMENT_TITLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DocGenPackage.CONTEXT__UML_ELEMENT:
				return UML_ELEMENT_EDEFAULT == null ? umlElement != null : !UML_ELEMENT_EDEFAULT.equals(umlElement);
			case DocGenPackage.CONTEXT__PRODUCT_NAME:
				return PRODUCT_NAME_EDEFAULT == null ? productName != null : !PRODUCT_NAME_EDEFAULT.equals(productName);
			case DocGenPackage.CONTEXT__PRODUCT_MODEL:
				return PRODUCT_MODEL_EDEFAULT == null ? productModel != null : !PRODUCT_MODEL_EDEFAULT.equals(productModel);
			case DocGenPackage.CONTEXT__SOFTWARE_VERSION:
				return SOFTWARE_VERSION_EDEFAULT == null ? softwareVersion != null : !SOFTWARE_VERSION_EDEFAULT.equals(softwareVersion);
			case DocGenPackage.CONTEXT__TEMPLATE_UUID:
				return TEMPLATE_UUID_EDEFAULT == null ? templateUUID != null : !TEMPLATE_UUID_EDEFAULT.equals(templateUUID);
			case DocGenPackage.CONTEXT__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case DocGenPackage.CONTEXT__DOCUMENT_TITLE:
				return DOCUMENT_TITLE_EDEFAULT == null ? documentTitle != null : !DOCUMENT_TITLE_EDEFAULT.equals(documentTitle);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (umlElement: ");
		result.append(umlElement);
		result.append(", productName: ");
		result.append(productName);
		result.append(", productModel: ");
		result.append(productModel);
		result.append(", softwareVersion: ");
		result.append(softwareVersion);
		result.append(", templateUUID: ");
		result.append(templateUUID);
		result.append(", UUID: ");
		result.append(uuid);
		result.append(", documentTitle: ");
		result.append(documentTitle);
		result.append(')');
		return result.toString();
	}

} //ContextImpl
