/**
 */
package QWiki.Infrastructure.impl;

import QWiki.Infrastructure.InfrastructurePackage;
import QWiki.Infrastructure.UmlNamedElement;
import QWiki.Infrastructure.UmlNamespace;
import QWiki.Infrastructure.UmlPackage;
import QWiki.Infrastructure.UmlPackageableElement;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uml Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Infrastructure.impl.UmlPackageImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link QWiki.Infrastructure.impl.UmlPackageImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link QWiki.Infrastructure.impl.UmlPackageImpl#getPackagedElement <em>Packaged Element</em>}</li>
 *   <li>{@link QWiki.Infrastructure.impl.UmlPackageImpl#getNestedPackage <em>Nested Package</em>}</li>
 *   <li>{@link QWiki.Infrastructure.impl.UmlPackageImpl#getNestingPackage <em>Nesting Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UmlPackageImpl extends UmlNamespaceImpl implements UmlPackage {
	/**
	 * The cached value of the '{@link #getPackagedElement() <em>Packaged Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<UmlPackageableElement> packagedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UmlPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.UML_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UmlNamedElement> getOwnedMember() {
		return new DerivedUnionEObjectEList<UmlNamedElement>(UmlNamedElement.class, this, InfrastructurePackage.UML_PACKAGE__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMember() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMember()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[] {InfrastructurePackage.UML_PACKAGE__PACKAGED_ELEMENT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UmlNamespace getNamespace() {
		UmlNamespace namespace = basicGetNamespace();
		return namespace != null && namespace.eIsProxy() ? (UmlNamespace)eResolveProxy((InternalEObject)namespace) : namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UmlNamespace basicGetNamespace() {
		UmlPackage nestingPackage = basicGetNestingPackage();			
		if (nestingPackage != null) {
			return nestingPackage;
		}
		return super.basicGetNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UmlPackageableElement> getPackagedElement() {
		if (packagedElement == null) {
			packagedElement = new EObjectContainmentEList<UmlPackageableElement>(UmlPackageableElement.class, this, InfrastructurePackage.UML_PACKAGE__PACKAGED_ELEMENT);
		}
		return packagedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UmlPackage> getNestedPackage() {
		// TODO: implement this method to return the 'Nested Package' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getNestedPackage() <em>Nested Package</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedPackage()
	 * @generated
	 * @ordered
	 */
	protected static final int[] NESTED_PACKAGE_ESUPERSETS = new int[] {InfrastructurePackage.UML_PACKAGE__PACKAGED_ELEMENT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UmlPackage getNestingPackage() {
		UmlPackage nestingPackage = basicGetNestingPackage();
		return nestingPackage != null && nestingPackage.eIsProxy() ? (UmlPackage)eResolveProxy((InternalEObject)nestingPackage) : nestingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlPackage basicGetNestingPackage() {
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
	public void setNestingPackage(UmlPackage newNestingPackage) {
		// TODO: implement this method to set the 'Nesting Package' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached invocation delegate for the '{@link #mustBeOwned() <em>Must Be Owned</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #mustBeOwned()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate MUST_BE_OWNED__EINVOCATION_DELEGATE = ((EOperation.Internal)InfrastructurePackage.Literals.UML_ELEMENT___MUST_BE_OWNED).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean mustBeOwned() {
		try {
			return (Boolean)MUST_BE_OWNED__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InfrastructurePackage.UML_PACKAGE__PACKAGED_ELEMENT:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InfrastructurePackage.UML_PACKAGE__PACKAGED_ELEMENT:
				return getPackagedElement();
			case InfrastructurePackage.UML_PACKAGE__NESTED_PACKAGE:
				return getNestedPackage();
			case InfrastructurePackage.UML_PACKAGE__NESTING_PACKAGE:
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
			case InfrastructurePackage.UML_PACKAGE__PACKAGED_ELEMENT:
				getPackagedElement().clear();
				getPackagedElement().addAll((Collection<? extends UmlPackageableElement>)newValue);
				return;
			case InfrastructurePackage.UML_PACKAGE__NESTED_PACKAGE:
				getNestedPackage().clear();
				getNestedPackage().addAll((Collection<? extends UmlPackage>)newValue);
				return;
			case InfrastructurePackage.UML_PACKAGE__NESTING_PACKAGE:
				setNestingPackage((UmlPackage)newValue);
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
			case InfrastructurePackage.UML_PACKAGE__PACKAGED_ELEMENT:
				getPackagedElement().clear();
				return;
			case InfrastructurePackage.UML_PACKAGE__NESTED_PACKAGE:
				getNestedPackage().clear();
				return;
			case InfrastructurePackage.UML_PACKAGE__NESTING_PACKAGE:
				setNestingPackage((UmlPackage)null);
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
			case InfrastructurePackage.UML_PACKAGE__OWNED_MEMBER:
				return isSetOwnedMember();
			case InfrastructurePackage.UML_PACKAGE__NAMESPACE:
				return isSetNamespace();
			case InfrastructurePackage.UML_PACKAGE__PACKAGED_ELEMENT:
				return packagedElement != null && !packagedElement.isEmpty();
			case InfrastructurePackage.UML_PACKAGE__NESTED_PACKAGE:
				return !getNestedPackage().isEmpty();
			case InfrastructurePackage.UML_PACKAGE__NESTING_PACKAGE:
				return basicGetNestingPackage() != null;
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
			case InfrastructurePackage.UML_PACKAGE___MUST_BE_OWNED:
				return mustBeOwned();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedMember() {
		return super.isSetOwnedMember()
			|| eIsSet(InfrastructurePackage.UML_PACKAGE__PACKAGED_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNamespace() {
		return super.isSetNamespace()
			|| eIsSet(InfrastructurePackage.UML_PACKAGE__NESTING_PACKAGE);
	}

} //UmlPackageImpl
