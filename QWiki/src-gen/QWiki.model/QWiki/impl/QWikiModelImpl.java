/**
 */
package QWiki.impl;

import QWiki.Element;
import QWiki.QWikiModel;
import QWiki.QWikiPackage;
import java.lang.reflect.InvocationTargetException;
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
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.impl.QWikiModelImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link QWiki.impl.QWikiModelImpl#getOwnedModelElement <em>Owned Model Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QWikiModelImpl extends ElementImpl implements QWikiModel {
	/**
	 * The cached value of the '{@link #getOwnedModelElement() <em>Owned Model Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedModelElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> ownedModelElement;

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
	public EList<Element> getOwnedElement() {
		return new DerivedUnionEObjectEList<Element>(Element.class, this, QWikiPackage.QWIKI_MODEL__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElement() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {QWikiPackage.QWIKI_MODEL__OWNED_COMMENT, QWikiPackage.QWIKI_MODEL__OWNED_MODEL_ELEMENT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedModelElement() {
		if (ownedModelElement == null) {
			ownedModelElement = new EObjectContainmentWithInverseEList<Element>(Element.class, this, QWikiPackage.QWIKI_MODEL__OWNED_MODEL_ELEMENT, QWikiPackage.ELEMENT__MODEL);
		}
		return ownedModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean mustBeOwned() {
		// TODO: implement this method
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
			case QWikiPackage.QWIKI_MODEL__OWNED_MODEL_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedModelElement()).basicAdd(otherEnd, msgs);
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
			case QWikiPackage.QWIKI_MODEL__OWNED_MODEL_ELEMENT:
				return ((InternalEList<?>)getOwnedModelElement()).basicRemove(otherEnd, msgs);
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
			case QWikiPackage.QWIKI_MODEL__OWNED_MODEL_ELEMENT:
				return getOwnedModelElement();
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
			case QWikiPackage.QWIKI_MODEL__OWNED_MODEL_ELEMENT:
				getOwnedModelElement().clear();
				getOwnedModelElement().addAll((Collection<? extends Element>)newValue);
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
			case QWikiPackage.QWIKI_MODEL__OWNED_MODEL_ELEMENT:
				getOwnedModelElement().clear();
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
			case QWikiPackage.QWIKI_MODEL__OWNED_ELEMENT:
				return isSetOwnedElement();
			case QWikiPackage.QWIKI_MODEL__OWNED_MODEL_ELEMENT:
				return ownedModelElement != null && !ownedModelElement.isEmpty();
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
			case QWikiPackage.QWIKI_MODEL___MUST_BE_OWNED:
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
	public boolean isSetOwnedElement() {
		return super.isSetOwnedElement()
			|| eIsSet(QWikiPackage.QWIKI_MODEL__OWNED_MODEL_ELEMENT);
	}

} //QWikiModelImpl
