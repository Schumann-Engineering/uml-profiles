/**
 */
package QWiki.impl;

import QWiki.Element;
import QWiki.GenericWorkProduct;
import QWiki.QWikiPackage;
import QWiki.WorkProduct;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Work Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.impl.GenericWorkProductImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link QWiki.impl.GenericWorkProductImpl#getOwnedWorkProduct <em>Owned Work Product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericWorkProductImpl extends WorkProductImpl implements GenericWorkProduct {
	/**
	 * The cached value of the '{@link #getOwnedWorkProduct() <em>Owned Work Product</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedWorkProduct()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProduct> ownedWorkProduct;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericWorkProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QWikiPackage.Literals.GENERIC_WORK_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedElement() {
		return new DerivedUnionEObjectEList<Element>(Element.class, this, QWikiPackage.GENERIC_WORK_PRODUCT__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElement() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {QWikiPackage.GENERIC_WORK_PRODUCT__OWNED_COMMENT, QWikiPackage.GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkProduct> getOwnedWorkProduct() {
		if (ownedWorkProduct == null) {
			ownedWorkProduct = new EObjectContainmentWithInverseEList<WorkProduct>(WorkProduct.class, this, QWikiPackage.GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT, QWikiPackage.WORK_PRODUCT__OWNING_WORKING_GROUP);
		}
		return ownedWorkProduct;
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
			case QWikiPackage.GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedWorkProduct()).basicAdd(otherEnd, msgs);
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
			case QWikiPackage.GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT:
				return ((InternalEList<?>)getOwnedWorkProduct()).basicRemove(otherEnd, msgs);
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
			case QWikiPackage.GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT:
				return getOwnedWorkProduct();
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
			case QWikiPackage.GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT:
				getOwnedWorkProduct().clear();
				getOwnedWorkProduct().addAll((Collection<? extends WorkProduct>)newValue);
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
			case QWikiPackage.GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT:
				getOwnedWorkProduct().clear();
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
			case QWikiPackage.GENERIC_WORK_PRODUCT__OWNED_ELEMENT:
				return isSetOwnedElement();
			case QWikiPackage.GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT:
				return ownedWorkProduct != null && !ownedWorkProduct.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedElement() {
		return super.isSetOwnedElement()
			|| eIsSet(QWikiPackage.GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT);
	}

} //GenericWorkProductImpl
