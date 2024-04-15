/**
 */
package QWiki.impl;

import QWiki.L10nDescriptiveElement;
import QWiki.L10nString;
import QWiki.QWikiContainer;
import QWiki.QWikiPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.impl.QWikiContainerImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link QWiki.impl.QWikiContainerImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QWikiContainerImpl extends QWikiNamespaceImpl implements QWikiContainer {
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
	protected QWikiContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QWikiPackage.Literals.QWIKI_CONTAINER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.QWIKI_CONTAINER__PURPOSE, oldPurpose, purpose));
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
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.QWIKI_CONTAINER__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QWikiPackage.QWIKI_CONTAINER__PURPOSE:
				return getPurpose();
			case QWikiPackage.QWIKI_CONTAINER__CONTENT:
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
			case QWikiPackage.QWIKI_CONTAINER__PURPOSE:
				setPurpose((L10nString)newValue);
				return;
			case QWikiPackage.QWIKI_CONTAINER__CONTENT:
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
			case QWikiPackage.QWIKI_CONTAINER__PURPOSE:
				setPurpose((L10nString)null);
				return;
			case QWikiPackage.QWIKI_CONTAINER__CONTENT:
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
			case QWikiPackage.QWIKI_CONTAINER__PURPOSE:
				return purpose != null;
			case QWikiPackage.QWIKI_CONTAINER__CONTENT:
				return content != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == L10nDescriptiveElement.class) {
			switch (derivedFeatureID) {
				case QWikiPackage.QWIKI_CONTAINER__PURPOSE: return QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__PURPOSE;
				case QWikiPackage.QWIKI_CONTAINER__CONTENT: return QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__CONTENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == L10nDescriptiveElement.class) {
			switch (baseFeatureID) {
				case QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__PURPOSE: return QWikiPackage.QWIKI_CONTAINER__PURPOSE;
				case QWikiPackage.L1_0N_DESCRIPTIVE_ELEMENT__CONTENT: return QWikiPackage.QWIKI_CONTAINER__CONTENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //QWikiContainerImpl
