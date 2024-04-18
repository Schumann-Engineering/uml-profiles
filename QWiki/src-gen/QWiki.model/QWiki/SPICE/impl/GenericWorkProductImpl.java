/**
 */
package QWiki.Spice.impl;

import QWiki.Spice.GenericWorkProduct;
import QWiki.Spice.SpicePackage;
import QWiki.Spice.WorkProduct;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Work Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Spice.impl.GenericWorkProductImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link QWiki.Spice.impl.GenericWorkProductImpl#getOwnedWorkProduct <em>Owned Work Product</em>}</li>
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
		return SpicePackage.Literals.GENERIC_WORK_PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getOwnedMembers() {
		return new DerivedUnionEObjectEList<NamedElement>(NamedElement.class, this, SpicePackage.GENERIC_WORK_PRODUCT__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[] {SpicePackage.GENERIC_WORK_PRODUCT__OWNED_RULE, SpicePackage.GENERIC_WORK_PRODUCT__QWIKI_ELEMENT, SpicePackage.GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkProduct> getOwnedWorkProduct() {
		if (ownedWorkProduct == null) {
			ownedWorkProduct = new EObjectContainmentWithInverseEList<WorkProduct>(WorkProduct.class, this, SpicePackage.GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT, SpicePackage.WORK_PRODUCT__OWNING_WORK_PRODUCT_GROUP);
		}
		return ownedWorkProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProduct getOwnedWorkProduct(String name) {
		return getOwnedWorkProduct(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProduct getOwnedWorkProduct(String name, boolean ignoreCase, EClass eClass) {
		ownedWorkProductLoop: for (WorkProduct ownedWorkProduct : getOwnedWorkProduct()) {
			if (eClass != null && !eClass.isInstance(ownedWorkProduct))
				continue ownedWorkProductLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedWorkProduct.getName()) : name.equals(ownedWorkProduct.getName())))
				continue ownedWorkProductLoop;
			return ownedWorkProduct;
		}
		return null;
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
			case SpicePackage.GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT:
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
			case SpicePackage.GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT:
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
			case SpicePackage.GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT:
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
			case SpicePackage.GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT:
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
			case SpicePackage.GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT:
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
			case SpicePackage.GENERIC_WORK_PRODUCT__OWNED_MEMBER:
				return isSetOwnedMembers();
			case SpicePackage.GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT:
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
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(SpicePackage.GENERIC_WORK_PRODUCT__OWNED_WORK_PRODUCT);
	}

} //GenericWorkProductImpl
