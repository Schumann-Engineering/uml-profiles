/**
 */
package QWiki.Infrastructure.impl;

import QWiki.Infrastructure.InfrastructurePackage;
import QWiki.Infrastructure.UmlComment;
import QWiki.Infrastructure.UmlDirectedRelationship;
import QWiki.Infrastructure.UmlElement;
import QWiki.Infrastructure.UmlRelationship;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uml Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Infrastructure.impl.UmlElementImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link QWiki.Infrastructure.impl.UmlElementImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link QWiki.Infrastructure.impl.UmlElementImpl#getDirectedRelationship <em>Directed Relationship</em>}</li>
 *   <li>{@link QWiki.Infrastructure.impl.UmlElementImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link QWiki.Infrastructure.impl.UmlElementImpl#getOwnedComment <em>Owned Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UmlElementImpl extends MinimalEObjectImpl.Container implements UmlElement {
	/**
	 * The cached value of the '{@link #getOwnedComment() <em>Owned Comment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComment()
	 * @generated
	 * @ordered
	 */
	protected EList<UmlComment> ownedComment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UmlElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InfrastructurePackage.Literals.UML_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UmlElement> getOwnedElement() {
		return new DerivedUnionEObjectEList<UmlElement>(UmlElement.class, this, InfrastructurePackage.UML_ELEMENT__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElement() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {InfrastructurePackage.UML_ELEMENT__OWNED_COMMENT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UmlElement getOwner() {
		UmlElement owner = basicGetOwner();
		return owner != null && owner.eIsProxy() ? (UmlElement)eResolveProxy((InternalEObject)owner) : owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlElement basicGetOwner() {
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UmlDirectedRelationship> getDirectedRelationship() {
		return new DerivedUnionEObjectEList<UmlDirectedRelationship>(UmlDirectedRelationship.class, this, InfrastructurePackage.UML_ELEMENT__DIRECTED_RELATIONSHIP, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UmlRelationship> getRelationship() {
		return new DerivedUnionEObjectEList<UmlRelationship>(UmlRelationship.class, this, InfrastructurePackage.UML_ELEMENT__RELATIONSHIP, RELATIONSHIP_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRelationship() <em>Relationship</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected static final int[] RELATIONSHIP_ESUBSETS = new int[] {InfrastructurePackage.UML_ELEMENT__DIRECTED_RELATIONSHIP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UmlComment> getOwnedComment() {
		if (ownedComment == null) {
			ownedComment = new EObjectContainmentEList<UmlComment>(UmlComment.class, this, InfrastructurePackage.UML_ELEMENT__OWNED_COMMENT);
		}
		return ownedComment;
	}

	/**
	 * The cached invocation delegate for the '{@link #allOwnedElements() <em>All Owned Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #allOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ALL_OWNED_ELEMENTS__EINVOCATION_DELEGATE = ((EOperation.Internal)InfrastructurePackage.Literals.UML_ELEMENT___ALL_OWNED_ELEMENTS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UmlElement> allOwnedElements() {
		try {
			return (EList<UmlElement>)ALL_OWNED_ELEMENTS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
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
			case InfrastructurePackage.UML_ELEMENT__OWNED_COMMENT:
				return ((InternalEList<?>)getOwnedComment()).basicRemove(otherEnd, msgs);
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
			case InfrastructurePackage.UML_ELEMENT__OWNED_ELEMENT:
				return getOwnedElement();
			case InfrastructurePackage.UML_ELEMENT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case InfrastructurePackage.UML_ELEMENT__DIRECTED_RELATIONSHIP:
				return getDirectedRelationship();
			case InfrastructurePackage.UML_ELEMENT__RELATIONSHIP:
				return getRelationship();
			case InfrastructurePackage.UML_ELEMENT__OWNED_COMMENT:
				return getOwnedComment();
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
			case InfrastructurePackage.UML_ELEMENT__OWNED_COMMENT:
				getOwnedComment().clear();
				getOwnedComment().addAll((Collection<? extends UmlComment>)newValue);
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
			case InfrastructurePackage.UML_ELEMENT__OWNED_COMMENT:
				getOwnedComment().clear();
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
			case InfrastructurePackage.UML_ELEMENT__OWNED_ELEMENT:
				return isSetOwnedElement();
			case InfrastructurePackage.UML_ELEMENT__OWNER:
				return isSetOwner();
			case InfrastructurePackage.UML_ELEMENT__DIRECTED_RELATIONSHIP:
				return isSetDirectedRelationship();
			case InfrastructurePackage.UML_ELEMENT__RELATIONSHIP:
				return isSetRelationship();
			case InfrastructurePackage.UML_ELEMENT__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
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
			case InfrastructurePackage.UML_ELEMENT___ALL_OWNED_ELEMENTS:
				return allOwnedElements();
			case InfrastructurePackage.UML_ELEMENT___MUST_BE_OWNED:
				return mustBeOwned();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedElement() {
		return eIsSet(InfrastructurePackage.UML_ELEMENT__OWNED_COMMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwner() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDirectedRelationship() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelationship() {
		return isSetDirectedRelationship();
	}

} //UmlElementImpl
