/**
 */
package QWiki.impl;

import QWiki.QWikiModel;
import QWiki.QWikiNamedElement;
import QWiki.QWikiPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.impl.QWikiModelImpl#getMembers <em>Member</em>}</li>
 *   <li>{@link QWiki.impl.QWikiModelImpl#getOwnedQwikiElement <em>Owned Qwiki Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QWikiModelImpl extends QWikiContainerImpl implements QWikiModel {
	/**
	 * The cached value of the '{@link #getOwnedQwikiElement() <em>Owned Qwiki Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedQwikiElement()
	 * @generated
	 * @ordered
	 */
	protected EList<QWikiNamedElement> ownedQwikiElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QWikiModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QWikiPackage.Literals.QWIKI_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getMembers() {
		return new DerivedUnionEObjectEList<NamedElement>(NamedElement.class, this, QWikiPackage.QWIKI_MODEL__MEMBER, MEMBER_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getMembers() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] MEMBER_ESUBSETS = new int[] {QWikiPackage.QWIKI_MODEL__OWNED_MEMBER, QWikiPackage.QWIKI_MODEL__IMPORTED_MEMBER, QWikiPackage.QWIKI_MODEL__OWNED_QWIKI_ELEMENT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QWikiNamedElement> getOwnedQwikiElement() {
		if (ownedQwikiElement == null) {
			ownedQwikiElement = new EObjectContainmentEList<QWikiNamedElement>(QWikiNamedElement.class, this, QWikiPackage.QWIKI_MODEL__OWNED_QWIKI_ELEMENT);
		}
		return ownedQwikiElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWikiNamedElement getOwnedQwikiElement(String name) {
		return getOwnedQwikiElement(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWikiNamedElement getOwnedQwikiElement(String name, boolean ignoreCase, EClass eClass) {
		ownedQwikiElementLoop: for (QWikiNamedElement ownedQwikiElement : getOwnedQwikiElement()) {
			if (eClass != null && !eClass.isInstance(ownedQwikiElement))
				continue ownedQwikiElementLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedQwikiElement.getName()) : name.equals(ownedQwikiElement.getName())))
				continue ownedQwikiElementLoop;
			return ownedQwikiElement;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QWikiPackage.QWIKI_MODEL__OWNED_QWIKI_ELEMENT:
				return ((InternalEList<?>)getOwnedQwikiElement()).basicRemove(otherEnd, msgs);
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
			case QWikiPackage.QWIKI_MODEL__OWNED_QWIKI_ELEMENT:
				return getOwnedQwikiElement();
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
			case QWikiPackage.QWIKI_MODEL__OWNED_QWIKI_ELEMENT:
				getOwnedQwikiElement().clear();
				getOwnedQwikiElement().addAll((Collection<? extends QWikiNamedElement>)newValue);
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
			case QWikiPackage.QWIKI_MODEL__OWNED_QWIKI_ELEMENT:
				getOwnedQwikiElement().clear();
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
			case QWikiPackage.QWIKI_MODEL__MEMBER:
				return isSetMembers();
			case QWikiPackage.QWIKI_MODEL__OWNED_QWIKI_ELEMENT:
				return ownedQwikiElement != null && !ownedQwikiElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMembers() {
		return super.isSetMembers()
			|| eIsSet(QWikiPackage.QWIKI_MODEL__OWNED_QWIKI_ELEMENT);
	}

} //QWikiModelImpl
