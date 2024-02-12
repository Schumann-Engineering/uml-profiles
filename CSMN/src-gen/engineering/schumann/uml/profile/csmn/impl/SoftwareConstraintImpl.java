/**
 */
package engineering.schumann.uml.profile.csmn.impl;

import engineering.schumann.uml.profile.csmn.CSMNPackage;
import engineering.schumann.uml.profile.csmn.SoftwareConstraint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.profile.csmn.impl.SoftwareConstraintImpl#getSoftwareVersion <em>Software Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftwareConstraintImpl extends MinimalEObjectImpl.Container implements SoftwareConstraint {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CSMNPackage.Literals.SOFTWARE_CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CSMNPackage.SOFTWARE_CONSTRAINT__SOFTWARE_VERSION, oldSoftwareVersion, softwareVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CSMNPackage.SOFTWARE_CONSTRAINT__SOFTWARE_VERSION:
				return getSoftwareVersion();
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
			case CSMNPackage.SOFTWARE_CONSTRAINT__SOFTWARE_VERSION:
				setSoftwareVersion((String)newValue);
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
			case CSMNPackage.SOFTWARE_CONSTRAINT__SOFTWARE_VERSION:
				setSoftwareVersion(SOFTWARE_VERSION_EDEFAULT);
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
			case CSMNPackage.SOFTWARE_CONSTRAINT__SOFTWARE_VERSION:
				return SOFTWARE_VERSION_EDEFAULT == null ? softwareVersion != null : !SOFTWARE_VERSION_EDEFAULT.equals(softwareVersion);
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
		result.append(" (softwareVersion: ");
		result.append(softwareVersion);
		result.append(')');
		return result.toString();
	}

} //SoftwareConstraintImpl
