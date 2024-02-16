/**
 */
package engineering.schumann.uml.model.sbom.impl;

import engineering.schumann.uml.model.sbom.Component;
import engineering.schumann.uml.model.sbom.ComponentType;
import engineering.schumann.uml.model.sbom.Iec62304_Classification;
import engineering.schumann.uml.model.sbom.Iec81001_5_1_Classification;
import engineering.schumann.uml.model.sbom.SBOMPackage;

import engineering.schumann.uml.model.sbom.Sbom;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.model.sbom.impl.ComponentImpl#getOwnedComponent <em>Owned Component</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.impl.ComponentImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.impl.ComponentImpl#getRequiredComponent <em>Required Component</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.impl.ComponentImpl#getRequiredBy <em>Required By</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.impl.ComponentImpl#getType <em>Type</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.impl.ComponentImpl#isSOUP <em>Is SOUP</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.impl.ComponentImpl#getClassificationIec81001_5_1 <em>Classification Iec81001 51</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.impl.ComponentImpl#getClassificationIec62304 <em>Classification Iec62304</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.impl.ComponentImpl#getOwningSbom <em>Owning Sbom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends DescribedElementImpl implements Component {
	/**
	 * The cached value of the '{@link #getOwnedComponent() <em>Owned Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> ownedComponent;

	/**
	 * The cached value of the '{@link #getRequiredComponent() <em>Required Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> requiredComponent;

	/**
	 * The cached value of the '{@link #getRequiredBy() <em>Required By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> requiredBy;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ComponentType TYPE_EDEFAULT = ComponentType.APPLICATION;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ComponentType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSOUP() <em>Is SOUP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSOUP()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SOUP_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSOUP() <em>Is SOUP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSOUP()
	 * @generated
	 * @ordered
	 */
	protected boolean isSOUP = IS_SOUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassificationIec81001_5_1() <em>Classification Iec81001 51</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationIec81001_5_1()
	 * @generated
	 * @ordered
	 */
	protected static final Iec81001_5_1_Classification CLASSIFICATION_IEC81001_51_EDEFAULT = Iec81001_5_1_Classification.MAINTAINED;

	/**
	 * The cached value of the '{@link #getClassificationIec81001_5_1() <em>Classification Iec81001 51</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationIec81001_5_1()
	 * @generated
	 * @ordered
	 */
	protected Iec81001_5_1_Classification classificationIec81001_5_1 = CLASSIFICATION_IEC81001_51_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassificationIec62304() <em>Classification Iec62304</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationIec62304()
	 * @generated
	 * @ordered
	 */
	protected static final Iec62304_Classification CLASSIFICATION_IEC62304_EDEFAULT = Iec62304_Classification.C;

	/**
	 * The cached value of the '{@link #getClassificationIec62304() <em>Classification Iec62304</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationIec62304()
	 * @generated
	 * @ordered
	 */
	protected Iec62304_Classification classificationIec62304 = CLASSIFICATION_IEC62304_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwningSbom() <em>Owning Sbom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningSbom()
	 * @generated
	 * @ordered
	 */
	protected Sbom owningSbom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBOMPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getOwnedComponent() {
		if (ownedComponent == null) {
			ownedComponent = new EObjectContainmentWithInverseEList<Component>(Component.class, this, SBOMPackage.COMPONENT__OWNED_COMPONENT, SBOMPackage.COMPONENT__OWNER);
		}
		return ownedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component getOwner() {
		if (eContainerFeatureID() != SBOMPackage.COMPONENT__OWNER) return null;
		return (Component)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Component newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, SBOMPackage.COMPONENT__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(Component newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != SBOMPackage.COMPONENT__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, SBOMPackage.COMPONENT__OWNED_COMPONENT, Component.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBOMPackage.COMPONENT__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getRequiredComponent() {
		if (requiredComponent == null) {
			requiredComponent = new EObjectWithInverseResolvingEList.ManyInverse<Component>(Component.class, this, SBOMPackage.COMPONENT__REQUIRED_COMPONENT, SBOMPackage.COMPONENT__REQUIRED_BY);
		}
		return requiredComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getRequiredBy() {
		if (requiredBy == null) {
			requiredBy = new EObjectWithInverseResolvingEList.ManyInverse<Component>(Component.class, this, SBOMPackage.COMPONENT__REQUIRED_BY, SBOMPackage.COMPONENT__REQUIRED_COMPONENT);
		}
		return requiredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(ComponentType newType) {
		ComponentType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBOMPackage.COMPONENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSOUP() {
		return isSOUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSOUP(boolean newIsSOUP) {
		boolean oldIsSOUP = isSOUP;
		isSOUP = newIsSOUP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBOMPackage.COMPONENT__IS_SOUP, oldIsSOUP, isSOUP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Iec81001_5_1_Classification getClassificationIec81001_5_1() {
		return classificationIec81001_5_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassificationIec81001_5_1(Iec81001_5_1_Classification newClassificationIec81001_5_1) {
		Iec81001_5_1_Classification oldClassificationIec81001_5_1 = classificationIec81001_5_1;
		classificationIec81001_5_1 = newClassificationIec81001_5_1 == null ? CLASSIFICATION_IEC81001_51_EDEFAULT : newClassificationIec81001_5_1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBOMPackage.COMPONENT__CLASSIFICATION_IEC81001_51, oldClassificationIec81001_5_1, classificationIec81001_5_1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Iec62304_Classification getClassificationIec62304() {
		return classificationIec62304;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassificationIec62304(Iec62304_Classification newClassificationIec62304) {
		Iec62304_Classification oldClassificationIec62304 = classificationIec62304;
		classificationIec62304 = newClassificationIec62304 == null ? CLASSIFICATION_IEC62304_EDEFAULT : newClassificationIec62304;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBOMPackage.COMPONENT__CLASSIFICATION_IEC62304, oldClassificationIec62304, classificationIec62304));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sbom getOwningSbom() {
		if (owningSbom != null && owningSbom.eIsProxy()) {
			InternalEObject oldOwningSbom = (InternalEObject)owningSbom;
			owningSbom = (Sbom)eResolveProxy(oldOwningSbom);
			if (owningSbom != oldOwningSbom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SBOMPackage.COMPONENT__OWNING_SBOM, oldOwningSbom, owningSbom));
			}
		}
		return owningSbom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sbom basicGetOwningSbom() {
		return owningSbom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningSbom(Sbom newOwningSbom) {
		Sbom oldOwningSbom = owningSbom;
		owningSbom = newOwningSbom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBOMPackage.COMPONENT__OWNING_SBOM, oldOwningSbom, owningSbom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Sbom getSbom() 
	{
		if (getOwningSbom() != null)
			return getOwningSbom();
		
		if (getOwner() != null)
			return getOwner().getSbom();
				
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
			case SBOMPackage.COMPONENT__OWNED_COMPONENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedComponent()).basicAdd(otherEnd, msgs);
			case SBOMPackage.COMPONENT__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((Component)otherEnd, msgs);
			case SBOMPackage.COMPONENT__REQUIRED_COMPONENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredComponent()).basicAdd(otherEnd, msgs);
			case SBOMPackage.COMPONENT__REQUIRED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredBy()).basicAdd(otherEnd, msgs);
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
			case SBOMPackage.COMPONENT__OWNED_COMPONENT:
				return ((InternalEList<?>)getOwnedComponent()).basicRemove(otherEnd, msgs);
			case SBOMPackage.COMPONENT__OWNER:
				return basicSetOwner(null, msgs);
			case SBOMPackage.COMPONENT__REQUIRED_COMPONENT:
				return ((InternalEList<?>)getRequiredComponent()).basicRemove(otherEnd, msgs);
			case SBOMPackage.COMPONENT__REQUIRED_BY:
				return ((InternalEList<?>)getRequiredBy()).basicRemove(otherEnd, msgs);
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
			case SBOMPackage.COMPONENT__OWNER:
				return eInternalContainer().eInverseRemove(this, SBOMPackage.COMPONENT__OWNED_COMPONENT, Component.class, msgs);
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
			case SBOMPackage.COMPONENT__OWNED_COMPONENT:
				return getOwnedComponent();
			case SBOMPackage.COMPONENT__OWNER:
				return getOwner();
			case SBOMPackage.COMPONENT__REQUIRED_COMPONENT:
				return getRequiredComponent();
			case SBOMPackage.COMPONENT__REQUIRED_BY:
				return getRequiredBy();
			case SBOMPackage.COMPONENT__TYPE:
				return getType();
			case SBOMPackage.COMPONENT__IS_SOUP:
				return isSOUP();
			case SBOMPackage.COMPONENT__CLASSIFICATION_IEC81001_51:
				return getClassificationIec81001_5_1();
			case SBOMPackage.COMPONENT__CLASSIFICATION_IEC62304:
				return getClassificationIec62304();
			case SBOMPackage.COMPONENT__OWNING_SBOM:
				if (resolve) return getOwningSbom();
				return basicGetOwningSbom();
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
			case SBOMPackage.COMPONENT__OWNED_COMPONENT:
				getOwnedComponent().clear();
				getOwnedComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case SBOMPackage.COMPONENT__OWNER:
				setOwner((Component)newValue);
				return;
			case SBOMPackage.COMPONENT__REQUIRED_COMPONENT:
				getRequiredComponent().clear();
				getRequiredComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case SBOMPackage.COMPONENT__REQUIRED_BY:
				getRequiredBy().clear();
				getRequiredBy().addAll((Collection<? extends Component>)newValue);
				return;
			case SBOMPackage.COMPONENT__TYPE:
				setType((ComponentType)newValue);
				return;
			case SBOMPackage.COMPONENT__IS_SOUP:
				setIsSOUP((Boolean)newValue);
				return;
			case SBOMPackage.COMPONENT__CLASSIFICATION_IEC81001_51:
				setClassificationIec81001_5_1((Iec81001_5_1_Classification)newValue);
				return;
			case SBOMPackage.COMPONENT__CLASSIFICATION_IEC62304:
				setClassificationIec62304((Iec62304_Classification)newValue);
				return;
			case SBOMPackage.COMPONENT__OWNING_SBOM:
				setOwningSbom((Sbom)newValue);
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
			case SBOMPackage.COMPONENT__OWNED_COMPONENT:
				getOwnedComponent().clear();
				return;
			case SBOMPackage.COMPONENT__OWNER:
				setOwner((Component)null);
				return;
			case SBOMPackage.COMPONENT__REQUIRED_COMPONENT:
				getRequiredComponent().clear();
				return;
			case SBOMPackage.COMPONENT__REQUIRED_BY:
				getRequiredBy().clear();
				return;
			case SBOMPackage.COMPONENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SBOMPackage.COMPONENT__IS_SOUP:
				setIsSOUP(IS_SOUP_EDEFAULT);
				return;
			case SBOMPackage.COMPONENT__CLASSIFICATION_IEC81001_51:
				setClassificationIec81001_5_1(CLASSIFICATION_IEC81001_51_EDEFAULT);
				return;
			case SBOMPackage.COMPONENT__CLASSIFICATION_IEC62304:
				setClassificationIec62304(CLASSIFICATION_IEC62304_EDEFAULT);
				return;
			case SBOMPackage.COMPONENT__OWNING_SBOM:
				setOwningSbom((Sbom)null);
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
			case SBOMPackage.COMPONENT__OWNED_COMPONENT:
				return ownedComponent != null && !ownedComponent.isEmpty();
			case SBOMPackage.COMPONENT__OWNER:
				return getOwner() != null;
			case SBOMPackage.COMPONENT__REQUIRED_COMPONENT:
				return requiredComponent != null && !requiredComponent.isEmpty();
			case SBOMPackage.COMPONENT__REQUIRED_BY:
				return requiredBy != null && !requiredBy.isEmpty();
			case SBOMPackage.COMPONENT__TYPE:
				return type != TYPE_EDEFAULT;
			case SBOMPackage.COMPONENT__IS_SOUP:
				return isSOUP != IS_SOUP_EDEFAULT;
			case SBOMPackage.COMPONENT__CLASSIFICATION_IEC81001_51:
				return classificationIec81001_5_1 != CLASSIFICATION_IEC81001_51_EDEFAULT;
			case SBOMPackage.COMPONENT__CLASSIFICATION_IEC62304:
				return classificationIec62304 != CLASSIFICATION_IEC62304_EDEFAULT;
			case SBOMPackage.COMPONENT__OWNING_SBOM:
				return owningSbom != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SBOMPackage.COMPONENT___GET_SBOM:
				return getSbom();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", isSOUP: ");
		result.append(isSOUP);
		result.append(", classificationIec81001_5_1: ");
		result.append(classificationIec81001_5_1);
		result.append(", classificationIec62304: ");
		result.append(classificationIec62304);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
