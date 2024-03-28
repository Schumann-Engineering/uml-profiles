/**
 */
package QWiki.impl;

import QWiki.NamedElement;
import QWiki.QWikiPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.impl.PackageImpl#getNestedPackage <em>Nested Package</em>}</li>
 *   <li>{@link QWiki.impl.PackageImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link QWiki.impl.PackageImpl#getOwningPackage <em>Owning Package</em>}</li>
 *   <li>{@link QWiki.impl.PackageImpl#getPackagedElement <em>Packaged Element</em>}</li>
 *   <li>{@link QWiki.impl.PackageImpl#getNestingPackage <em>Nesting Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends NamespaceImpl implements QWiki.Package {
	/**
	 * The cached value of the '{@link #getPackagedElement() <em>Packaged Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> packagedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QWikiPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QWiki.Package> getNestedPackage() {
		return new DerivedUnionEObjectEList<QWiki.Package>(QWiki.Package.class, this, QWikiPackage.PACKAGE__NESTED_PACKAGE, null);
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getNestedPackage() <em>Nested Package</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedPackage()
	 * @generated
	 * @ordered
	 */
	protected static final int[] NESTED_PACKAGE_ESUPERSETS = new int[] {QWikiPackage.PACKAGE__PACKAGED_ELEMENT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getOwnedMember() {
		return new DerivedUnionEObjectEList<NamedElement>(NamedElement.class, this, QWikiPackage.PACKAGE__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMember() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMember()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[] {QWikiPackage.PACKAGE__PACKAGED_ELEMENT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QWiki.Package getOwningPackage() {
		if (eContainerFeatureID() != QWikiPackage.PACKAGE__OWNING_PACKAGE) return null;
		return (QWiki.Package)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningPackage(QWiki.Package newOwningPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningPackage, QWikiPackage.PACKAGE__OWNING_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningPackage(QWiki.Package newOwningPackage) {
		if (newOwningPackage != eInternalContainer() || (eContainerFeatureID() != QWikiPackage.PACKAGE__OWNING_PACKAGE && newOwningPackage != null)) {
			if (EcoreUtil.isAncestor(this, newOwningPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningPackage != null)
				msgs = ((InternalEObject)newOwningPackage).eInverseAdd(this, QWikiPackage.PACKAGE__PACKAGED_ELEMENT, QWiki.Package.class, msgs);
			msgs = basicSetOwningPackage(newOwningPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.PACKAGE__OWNING_PACKAGE, newOwningPackage, newOwningPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getPackagedElement() {
		if (packagedElement == null) {
			packagedElement = new EObjectContainmentWithInverseEList<NamedElement>(NamedElement.class, this, QWikiPackage.PACKAGE__PACKAGED_ELEMENT, QWikiPackage.NAMED_ELEMENT__OWNING_PACKAGE);
		}
		return packagedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QWiki.Package getNestingPackage() {
		QWiki.Package nestingPackage = basicGetNestingPackage();
		return nestingPackage != null && nestingPackage.eIsProxy() ? (QWiki.Package)eResolveProxy((InternalEObject)nestingPackage) : nestingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWiki.Package basicGetNestingPackage() {
		// TODO: implement this method to return the 'Nesting Package' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNestingPackage(QWiki.Package newNestingPackage) {
		// TODO: implement this method to set the 'Nesting Package' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QWikiPackage.PACKAGE__OWNING_PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningPackage((QWiki.Package)otherEnd, msgs);
			case QWikiPackage.PACKAGE__PACKAGED_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackagedElement()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QWikiPackage.PACKAGE__OWNING_PACKAGE:
				return basicSetOwningPackage(null, msgs);
			case QWikiPackage.PACKAGE__PACKAGED_ELEMENT:
				return ((InternalEList<?>)getPackagedElement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case QWikiPackage.PACKAGE__OWNING_PACKAGE:
				return eInternalContainer().eInverseRemove(this, QWikiPackage.PACKAGE__PACKAGED_ELEMENT, QWiki.Package.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QWikiPackage.PACKAGE__NESTED_PACKAGE:
				return getNestedPackage();
			case QWikiPackage.PACKAGE__PACKAGED_ELEMENT:
				return getPackagedElement();
			case QWikiPackage.PACKAGE__NESTING_PACKAGE:
				if (resolve) return getNestingPackage();
				return basicGetNestingPackage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QWikiPackage.PACKAGE__PACKAGED_ELEMENT:
				getPackagedElement().clear();
				getPackagedElement().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case QWikiPackage.PACKAGE__NESTING_PACKAGE:
				setNestingPackage((QWiki.Package)newValue);
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
			case QWikiPackage.PACKAGE__PACKAGED_ELEMENT:
				getPackagedElement().clear();
				return;
			case QWikiPackage.PACKAGE__NESTING_PACKAGE:
				setNestingPackage((QWiki.Package)null);
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
			case QWikiPackage.PACKAGE__NESTED_PACKAGE:
				return isSetNestedPackage();
			case QWikiPackage.PACKAGE__OWNED_MEMBER:
				return isSetOwnedMember();
			case QWikiPackage.PACKAGE__OWNING_PACKAGE:
				return getOwningPackage() != null;
			case QWikiPackage.PACKAGE__PACKAGED_ELEMENT:
				return packagedElement != null && !packagedElement.isEmpty();
			case QWikiPackage.PACKAGE__NESTING_PACKAGE:
				return basicGetNestingPackage() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNestedPackage() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedMember() {
		return super.isSetOwnedMember()
			|| eIsSet(QWikiPackage.PACKAGE__PACKAGED_ELEMENT);
	}

} //PackageImpl
