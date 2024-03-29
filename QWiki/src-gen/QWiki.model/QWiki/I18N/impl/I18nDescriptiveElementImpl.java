/**
 */
package QWiki.I18N.impl;

import QWiki.I18N.I18NPackage;
import QWiki.I18N.I18nDescriptiveElement;
import QWiki.I18N.I18nString;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>I1 8n Descriptive Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.I18N.impl.I18nDescriptiveElementImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link QWiki.I18N.impl.I18nDescriptiveElementImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class I18nDescriptiveElementImpl extends I18nNamedElementImpl implements I18nDescriptiveElement {
	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected I18nString purpose;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected I18nString body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected I18nDescriptiveElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return I18NPackage.Literals.I1_8N_DESCRIPTIVE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public I18nString getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPurpose(I18nString newPurpose, NotificationChain msgs) {
		I18nString oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__PURPOSE, oldPurpose, newPurpose);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurpose(I18nString newPurpose) {
		if (newPurpose != purpose) {
			NotificationChain msgs = null;
			if (purpose != null)
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__PURPOSE, newPurpose, newPurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public I18nString getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(I18nString newBody, NotificationChain msgs) {
		I18nString oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBody(I18nString newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__PURPOSE:
				return basicSetPurpose(null, msgs);
			case I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__BODY:
				return basicSetBody(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__PURPOSE:
				return getPurpose();
			case I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__BODY:
				return getBody();
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
			case I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__PURPOSE:
				setPurpose((I18nString)newValue);
				return;
			case I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__BODY:
				setBody((I18nString)newValue);
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
			case I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__PURPOSE:
				setPurpose((I18nString)null);
				return;
			case I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__BODY:
				setBody((I18nString)null);
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
			case I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__PURPOSE:
				return purpose != null;
			case I18NPackage.I1_8N_DESCRIPTIVE_ELEMENT__BODY:
				return body != null;
		}
		return super.eIsSet(featureID);
	}

} //I18nDescriptiveElementImpl
