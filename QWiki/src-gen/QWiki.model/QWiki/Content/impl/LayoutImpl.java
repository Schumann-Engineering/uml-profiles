/**
 */
package QWiki.Content.impl;

import QWiki.Content.ContentPackage;
import QWiki.Content.Layout;
import QWiki.Content.LayoutType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Content.impl.LayoutImpl#getLayoutType <em>Layout Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LayoutImpl extends ContentImpl implements Layout {
	/**
	 * The default value of the '{@link #getLayoutType() <em>Layout Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutType()
	 * @generated
	 * @ordered
	 */
	protected static final LayoutType LAYOUT_TYPE_EDEFAULT = LayoutType.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getLayoutType() <em>Layout Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutType()
	 * @generated
	 * @ordered
	 */
	protected LayoutType layoutType = LAYOUT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LayoutType getLayoutType() {
		return layoutType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLayoutType(LayoutType newLayoutType) {
		LayoutType oldLayoutType = layoutType;
		layoutType = newLayoutType == null ? LAYOUT_TYPE_EDEFAULT : newLayoutType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.LAYOUT__LAYOUT_TYPE, oldLayoutType, layoutType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentPackage.LAYOUT__LAYOUT_TYPE:
				return getLayoutType();
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
			case ContentPackage.LAYOUT__LAYOUT_TYPE:
				setLayoutType((LayoutType)newValue);
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
			case ContentPackage.LAYOUT__LAYOUT_TYPE:
				setLayoutType(LAYOUT_TYPE_EDEFAULT);
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
			case ContentPackage.LAYOUT__LAYOUT_TYPE:
				return layoutType != LAYOUT_TYPE_EDEFAULT;
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
		result.append(" (layoutType: ");
		result.append(layoutType);
		result.append(')');
		return result.toString();
	}

} //LayoutImpl
