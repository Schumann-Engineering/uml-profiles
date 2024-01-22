/**
 */
package engineering.schumann.uml.model.sbom.impl;

import engineering.schumann.uml.model.sbom.Component;
import engineering.schumann.uml.model.sbom.Namespace;
import engineering.schumann.uml.model.sbom.NamespaceType;
import engineering.schumann.uml.model.sbom.Propety;
import engineering.schumann.uml.model.sbom.SBOMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.model.sbom.impl.NamespaceImpl#getOwnedComponent <em>Owned Component</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.impl.NamespaceImpl#getRequiredComponent <em>Required Component</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.impl.NamespaceImpl#getOwnedProperty <em>Owned Property</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.impl.NamespaceImpl#getType <em>Type</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.impl.NamespaceImpl#isSOUP <em>Is SOUP</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NamespaceImpl extends DescribedElementImpl implements Namespace {
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
	 * The cached value of the '{@link #getOwnedProperty() <em>Owned Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Propety> ownedProperty;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final NamespaceType TYPE_EDEFAULT = NamespaceType.APPLICATION;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NamespaceType type = TYPE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SBOMPackage.Literals.NAMESPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getOwnedComponent() {
		if (ownedComponent == null) {
			ownedComponent = new EObjectContainmentEList<Component>(Component.class, this, SBOMPackage.NAMESPACE__OWNED_COMPONENT);
		}
		return ownedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Component> getRequiredComponent() {
		if (requiredComponent == null) {
			requiredComponent = new EObjectResolvingEList<Component>(Component.class, this, SBOMPackage.NAMESPACE__REQUIRED_COMPONENT);
		}
		return requiredComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Propety> getOwnedProperty() {
		if (ownedProperty == null) {
			ownedProperty = new EObjectContainmentEList<Propety>(Propety.class, this, SBOMPackage.NAMESPACE__OWNED_PROPERTY);
		}
		return ownedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamespaceType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(NamespaceType newType) {
		NamespaceType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SBOMPackage.NAMESPACE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SBOMPackage.NAMESPACE__IS_SOUP, oldIsSOUP, isSOUP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SBOMPackage.NAMESPACE__OWNED_COMPONENT:
				return ((InternalEList<?>)getOwnedComponent()).basicRemove(otherEnd, msgs);
			case SBOMPackage.NAMESPACE__OWNED_PROPERTY:
				return ((InternalEList<?>)getOwnedProperty()).basicRemove(otherEnd, msgs);
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
			case SBOMPackage.NAMESPACE__OWNED_COMPONENT:
				return getOwnedComponent();
			case SBOMPackage.NAMESPACE__REQUIRED_COMPONENT:
				return getRequiredComponent();
			case SBOMPackage.NAMESPACE__OWNED_PROPERTY:
				return getOwnedProperty();
			case SBOMPackage.NAMESPACE__TYPE:
				return getType();
			case SBOMPackage.NAMESPACE__IS_SOUP:
				return isSOUP();
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
			case SBOMPackage.NAMESPACE__OWNED_COMPONENT:
				getOwnedComponent().clear();
				getOwnedComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case SBOMPackage.NAMESPACE__REQUIRED_COMPONENT:
				getRequiredComponent().clear();
				getRequiredComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case SBOMPackage.NAMESPACE__OWNED_PROPERTY:
				getOwnedProperty().clear();
				getOwnedProperty().addAll((Collection<? extends Propety>)newValue);
				return;
			case SBOMPackage.NAMESPACE__TYPE:
				setType((NamespaceType)newValue);
				return;
			case SBOMPackage.NAMESPACE__IS_SOUP:
				setIsSOUP((Boolean)newValue);
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
			case SBOMPackage.NAMESPACE__OWNED_COMPONENT:
				getOwnedComponent().clear();
				return;
			case SBOMPackage.NAMESPACE__REQUIRED_COMPONENT:
				getRequiredComponent().clear();
				return;
			case SBOMPackage.NAMESPACE__OWNED_PROPERTY:
				getOwnedProperty().clear();
				return;
			case SBOMPackage.NAMESPACE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SBOMPackage.NAMESPACE__IS_SOUP:
				setIsSOUP(IS_SOUP_EDEFAULT);
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
			case SBOMPackage.NAMESPACE__OWNED_COMPONENT:
				return ownedComponent != null && !ownedComponent.isEmpty();
			case SBOMPackage.NAMESPACE__REQUIRED_COMPONENT:
				return requiredComponent != null && !requiredComponent.isEmpty();
			case SBOMPackage.NAMESPACE__OWNED_PROPERTY:
				return ownedProperty != null && !ownedProperty.isEmpty();
			case SBOMPackage.NAMESPACE__TYPE:
				return type != TYPE_EDEFAULT;
			case SBOMPackage.NAMESPACE__IS_SOUP:
				return isSOUP != IS_SOUP_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", isSOUP: ");
		result.append(isSOUP);
		result.append(')');
		return result.toString();
	}

} //NamespaceImpl
