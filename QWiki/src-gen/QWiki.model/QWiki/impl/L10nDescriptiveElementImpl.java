/**
 */
package QWiki.impl;

import QWiki.L10nDescriptiveElement;
import QWiki.L10nString;
import QWiki.QWikiPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>L1 0n Descriptive Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.impl.L10nDescriptiveElementImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link QWiki.impl.L10nDescriptiveElementImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class L10nDescriptiveElementImpl extends L10nNamedElementImpl implements L10nDescriptiveElement {
	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected L10nString purpose;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected L10nString content;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected L10nDescriptiveElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QWikiPackage.Literals.L1_0N_DESCRIPTIVE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public L10nString getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurpose(L10nString newPurpose) {
		L10nString oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public L10nString getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(L10nString newContent) {
		L10nString oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__PURPOSE:
				return getPurpose();
			case QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__CONTENT:
				return getContent();
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
			case QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__PURPOSE:
				setPurpose((L10nString)newValue);
				return;
			case QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__CONTENT:
				setContent((L10nString)newValue);
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
			case QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__PURPOSE:
				setPurpose((L10nString)null);
				return;
			case QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__CONTENT:
				setContent((L10nString)null);
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
			case QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__PURPOSE:
				return purpose != null;
			case QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__CONTENT:
				return content != null;
		}
		return super.eIsSet(featureID);
	}

} //L10nDescriptiveElementImpl
