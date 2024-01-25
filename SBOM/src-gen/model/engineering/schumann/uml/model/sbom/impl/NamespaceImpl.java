/**
 */
package engineering.schumann.uml.model.sbom.impl;

import engineering.schumann.uml.model.sbom.Component;
import engineering.schumann.uml.model.sbom.Iec62304_Classification;
import engineering.schumann.uml.model.sbom.Iec81001_5_1_Classification;
import engineering.schumann.uml.model.sbom.Namespace;
import engineering.schumann.uml.model.sbom.NamespaceType;
import engineering.schumann.uml.model.sbom.SBOMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
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
 *   <li>{@link engineering.schumann.uml.model.sbom.impl.NamespaceImpl#getType <em>Type</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.impl.NamespaceImpl#isSOUP <em>Is SOUP</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.impl.NamespaceImpl#getClassificationIec81001_5_1 <em>Classification Iec81001 51</em>}</li>
 *   <li>{@link engineering.schumann.uml.model.sbom.impl.NamespaceImpl#getClassificationIec62304 <em>Classification Iec62304</em>}</li>
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
			ownedComponent = new EObjectContainmentWithInverseEList<Component>(Component.class, this, SBOMPackage.NAMESPACE__OWNED_COMPONENT, SBOMPackage.COMPONENT__OWNER);
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
			requiredComponent = new EObjectWithInverseResolvingEList.ManyInverse<Component>(Component.class, this, SBOMPackage.NAMESPACE__REQUIRED_COMPONENT, SBOMPackage.COMPONENT__REQUIRED_BY);
		}
		return requiredComponent;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SBOMPackage.NAMESPACE__CLASSIFICATION_IEC81001_51, oldClassificationIec81001_5_1, classificationIec81001_5_1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SBOMPackage.NAMESPACE__CLASSIFICATION_IEC62304, oldClassificationIec62304, classificationIec62304));
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
			case SBOMPackage.NAMESPACE__OWNED_COMPONENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedComponent()).basicAdd(otherEnd, msgs);
			case SBOMPackage.NAMESPACE__REQUIRED_COMPONENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequiredComponent()).basicAdd(otherEnd, msgs);
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
			case SBOMPackage.NAMESPACE__OWNED_COMPONENT:
				return ((InternalEList<?>)getOwnedComponent()).basicRemove(otherEnd, msgs);
			case SBOMPackage.NAMESPACE__REQUIRED_COMPONENT:
				return ((InternalEList<?>)getRequiredComponent()).basicRemove(otherEnd, msgs);
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
			case SBOMPackage.NAMESPACE__TYPE:
				return getType();
			case SBOMPackage.NAMESPACE__IS_SOUP:
				return isSOUP();
			case SBOMPackage.NAMESPACE__CLASSIFICATION_IEC81001_51:
				return getClassificationIec81001_5_1();
			case SBOMPackage.NAMESPACE__CLASSIFICATION_IEC62304:
				return getClassificationIec62304();
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
			case SBOMPackage.NAMESPACE__TYPE:
				setType((NamespaceType)newValue);
				return;
			case SBOMPackage.NAMESPACE__IS_SOUP:
				setIsSOUP((Boolean)newValue);
				return;
			case SBOMPackage.NAMESPACE__CLASSIFICATION_IEC81001_51:
				setClassificationIec81001_5_1((Iec81001_5_1_Classification)newValue);
				return;
			case SBOMPackage.NAMESPACE__CLASSIFICATION_IEC62304:
				setClassificationIec62304((Iec62304_Classification)newValue);
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
			case SBOMPackage.NAMESPACE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SBOMPackage.NAMESPACE__IS_SOUP:
				setIsSOUP(IS_SOUP_EDEFAULT);
				return;
			case SBOMPackage.NAMESPACE__CLASSIFICATION_IEC81001_51:
				setClassificationIec81001_5_1(CLASSIFICATION_IEC81001_51_EDEFAULT);
				return;
			case SBOMPackage.NAMESPACE__CLASSIFICATION_IEC62304:
				setClassificationIec62304(CLASSIFICATION_IEC62304_EDEFAULT);
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
			case SBOMPackage.NAMESPACE__TYPE:
				return type != TYPE_EDEFAULT;
			case SBOMPackage.NAMESPACE__IS_SOUP:
				return isSOUP != IS_SOUP_EDEFAULT;
			case SBOMPackage.NAMESPACE__CLASSIFICATION_IEC81001_51:
				return classificationIec81001_5_1 != CLASSIFICATION_IEC81001_51_EDEFAULT;
			case SBOMPackage.NAMESPACE__CLASSIFICATION_IEC62304:
				return classificationIec62304 != CLASSIFICATION_IEC62304_EDEFAULT;
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
		result.append(", classificationIec81001_5_1: ");
		result.append(classificationIec81001_5_1);
		result.append(", classificationIec62304: ");
		result.append(classificationIec62304);
		result.append(')');
		return result.toString();
	}

} //NamespaceImpl
