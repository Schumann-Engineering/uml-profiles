/**
 */
package QWiki.Spice.impl;

import QWiki.Spice.SpicePackage;
import QWiki.Spice.WorkProduct;
import QWiki.Spice.WorkProductRelationship;
import QWiki.Spice.WorkProductRelationshipType;

import QWiki.impl.QWikiRelationshipImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Work Product Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Spice.impl.WorkProductRelationshipImpl#getSources <em>Source</em>}</li>
 *   <li>{@link QWiki.Spice.impl.WorkProductRelationshipImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link QWiki.Spice.impl.WorkProductRelationshipImpl#getLinkingWorkProduct <em>Linking Work Product</em>}</li>
 *   <li>{@link QWiki.Spice.impl.WorkProductRelationshipImpl#getWorkProductRelationshipType <em>Work Product Relationship Type</em>}</li>
 *   <li>{@link QWiki.Spice.impl.WorkProductRelationshipImpl#getLinkedWorkProduct <em>Linked Work Product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorkProductRelationshipImpl extends QWikiRelationshipImpl implements WorkProductRelationship {
	/**
	 * The cached value of the '{@link #getLinkingWorkProduct() <em>Linking Work Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkingWorkProduct()
	 * @generated
	 * @ordered
	 */
	protected WorkProduct linkingWorkProduct;

	/**
	 * The cached value of the '{@link #getWorkProductRelationshipType() <em>Work Product Relationship Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkProductRelationshipType()
	 * @generated
	 * @ordered
	 */
	protected WorkProductRelationshipType workProductRelationshipType;

	/**
	 * The cached value of the '{@link #getLinkedWorkProduct() <em>Linked Work Product</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedWorkProduct()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkProduct> linkedWorkProduct;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkProductRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpicePackage.Literals.WORK_PRODUCT_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getSources() {
		return new DerivedUnionEObjectEList<Element>(Element.class, this, SpicePackage.WORK_PRODUCT_RELATIONSHIP__SOURCE, SOURCE_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getSources() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected static final int[] SOURCE_ESUBSETS = new int[] {SpicePackage.WORK_PRODUCT_RELATIONSHIP__LINKING_WORK_PRODUCT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getTargets() {
		return new DerivedUnionEObjectEList<Element>(Element.class, this, SpicePackage.WORK_PRODUCT_RELATIONSHIP__TARGET, TARGET_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getTargets() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected static final int[] TARGET_ESUBSETS = new int[] {SpicePackage.WORK_PRODUCT_RELATIONSHIP__LINKED_WORK_PRODUCT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkProduct getLinkingWorkProduct() {
		return linkingWorkProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkingWorkProduct(WorkProduct newLinkingWorkProduct) {
		WorkProduct oldLinkingWorkProduct = linkingWorkProduct;
		linkingWorkProduct = newLinkingWorkProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.WORK_PRODUCT_RELATIONSHIP__LINKING_WORK_PRODUCT, oldLinkingWorkProduct, linkingWorkProduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkProductRelationshipType getWorkProductRelationshipType() {
		return workProductRelationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkProductRelationshipType(WorkProductRelationshipType newWorkProductRelationshipType, NotificationChain msgs) {
		WorkProductRelationshipType oldWorkProductRelationshipType = workProductRelationshipType;
		workProductRelationshipType = newWorkProductRelationshipType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpicePackage.WORK_PRODUCT_RELATIONSHIP__WORK_PRODUCT_RELATIONSHIP_TYPE, oldWorkProductRelationshipType, newWorkProductRelationshipType);
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
	public void setWorkProductRelationshipType(WorkProductRelationshipType newWorkProductRelationshipType) {
		if (newWorkProductRelationshipType != workProductRelationshipType) {
			NotificationChain msgs = null;
			if (workProductRelationshipType != null)
				msgs = ((InternalEObject)workProductRelationshipType).eInverseRemove(this, SpicePackage.WORK_PRODUCT_RELATIONSHIP_TYPE__WORK_PRODUCT_RELATIONSHIP, WorkProductRelationshipType.class, msgs);
			if (newWorkProductRelationshipType != null)
				msgs = ((InternalEObject)newWorkProductRelationshipType).eInverseAdd(this, SpicePackage.WORK_PRODUCT_RELATIONSHIP_TYPE__WORK_PRODUCT_RELATIONSHIP, WorkProductRelationshipType.class, msgs);
			msgs = basicSetWorkProductRelationshipType(newWorkProductRelationshipType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpicePackage.WORK_PRODUCT_RELATIONSHIP__WORK_PRODUCT_RELATIONSHIP_TYPE, newWorkProductRelationshipType, newWorkProductRelationshipType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WorkProduct> getLinkedWorkProduct() {
		if (linkedWorkProduct == null) {
			linkedWorkProduct = new EObjectWithInverseEList.ManyInverse<WorkProduct>(WorkProduct.class, this, SpicePackage.WORK_PRODUCT_RELATIONSHIP__LINKED_WORK_PRODUCT, SpicePackage.WORK_PRODUCT__LINK);
		}
		return linkedWorkProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProduct getLinkedWorkProduct(String name) {
		return getLinkedWorkProduct(name, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProduct getLinkedWorkProduct(String name, boolean ignoreCase, EClass eClass) {
		linkedWorkProductLoop: for (WorkProduct linkedWorkProduct : getLinkedWorkProduct()) {
			if (eClass != null && !eClass.isInstance(linkedWorkProduct))
				continue linkedWorkProductLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(linkedWorkProduct.getName()) : name.equals(linkedWorkProduct.getName())))
				continue linkedWorkProductLoop;
			return linkedWorkProduct;
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
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP__WORK_PRODUCT_RELATIONSHIP_TYPE:
				if (workProductRelationshipType != null)
					msgs = ((InternalEObject)workProductRelationshipType).eInverseRemove(this, SpicePackage.WORK_PRODUCT_RELATIONSHIP_TYPE__WORK_PRODUCT_RELATIONSHIP, WorkProductRelationshipType.class, msgs);
				return basicSetWorkProductRelationshipType((WorkProductRelationshipType)otherEnd, msgs);
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP__LINKED_WORK_PRODUCT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinkedWorkProduct()).basicAdd(otherEnd, msgs);
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
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP__WORK_PRODUCT_RELATIONSHIP_TYPE:
				return basicSetWorkProductRelationshipType(null, msgs);
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP__LINKED_WORK_PRODUCT:
				return ((InternalEList<?>)getLinkedWorkProduct()).basicRemove(otherEnd, msgs);
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
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP__LINKING_WORK_PRODUCT:
				return getLinkingWorkProduct();
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP__WORK_PRODUCT_RELATIONSHIP_TYPE:
				return getWorkProductRelationshipType();
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP__LINKED_WORK_PRODUCT:
				return getLinkedWorkProduct();
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
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP__LINKING_WORK_PRODUCT:
				setLinkingWorkProduct((WorkProduct)newValue);
				return;
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP__WORK_PRODUCT_RELATIONSHIP_TYPE:
				setWorkProductRelationshipType((WorkProductRelationshipType)newValue);
				return;
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP__LINKED_WORK_PRODUCT:
				getLinkedWorkProduct().clear();
				getLinkedWorkProduct().addAll((Collection<? extends WorkProduct>)newValue);
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
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP__LINKING_WORK_PRODUCT:
				setLinkingWorkProduct((WorkProduct)null);
				return;
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP__WORK_PRODUCT_RELATIONSHIP_TYPE:
				setWorkProductRelationshipType((WorkProductRelationshipType)null);
				return;
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP__LINKED_WORK_PRODUCT:
				getLinkedWorkProduct().clear();
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
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP__SOURCE:
				return isSetSources();
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP__TARGET:
				return isSetTargets();
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP__LINKING_WORK_PRODUCT:
				return linkingWorkProduct != null;
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP__WORK_PRODUCT_RELATIONSHIP_TYPE:
				return workProductRelationshipType != null;
			case SpicePackage.WORK_PRODUCT_RELATIONSHIP__LINKED_WORK_PRODUCT:
				return linkedWorkProduct != null && !linkedWorkProduct.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSources() {
		return super.isSetSources()
			|| eIsSet(SpicePackage.WORK_PRODUCT_RELATIONSHIP__LINKING_WORK_PRODUCT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTargets() {
		return super.isSetTargets()
			|| eIsSet(SpicePackage.WORK_PRODUCT_RELATIONSHIP__LINKED_WORK_PRODUCT);
	}

} //WorkProductRelationshipImpl
