/**
 */
package QWiki.impl;

import QWiki.Element;
import QWiki.ProcessGroup;
import QWiki.QWikiPackage;

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
 * An implementation of the model object '<em><b>Process Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.impl.ProcessGroupImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link QWiki.impl.ProcessGroupImpl#getOnwedProcess <em>Onwed Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessGroupImpl extends SpiceElementImpl implements ProcessGroup {
	/**
	 * The cached value of the '{@link #getOnwedProcess() <em>Onwed Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnwedProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<QWiki.Process> onwedProcess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QWikiPackage.Literals.PROCESS_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedElement() {
		return new DerivedUnionEObjectEList<Element>(Element.class, this, QWikiPackage.PROCESS_GROUP__OWNED_ELEMENT, OWNED_ELEMENT_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElement() <em>Owned Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {QWikiPackage.PROCESS_GROUP__OWNED_COMMENT, QWikiPackage.PROCESS_GROUP__ONWED_PROCESS};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QWiki.Process> getOnwedProcess() {
		if (onwedProcess == null) {
			onwedProcess = new EObjectContainmentWithInverseEList<QWiki.Process>(QWiki.Process.class, this, QWikiPackage.PROCESS_GROUP__ONWED_PROCESS, QWikiPackage.PROCESS__OWNING_PROCESS_GROUP);
		}
		return onwedProcess;
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
			case QWikiPackage.PROCESS_GROUP__ONWED_PROCESS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOnwedProcess()).basicAdd(otherEnd, msgs);
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
			case QWikiPackage.PROCESS_GROUP__ONWED_PROCESS:
				return ((InternalEList<?>)getOnwedProcess()).basicRemove(otherEnd, msgs);
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
			case QWikiPackage.PROCESS_GROUP__ONWED_PROCESS:
				return getOnwedProcess();
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
			case QWikiPackage.PROCESS_GROUP__ONWED_PROCESS:
				getOnwedProcess().clear();
				getOnwedProcess().addAll((Collection<? extends QWiki.Process>)newValue);
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
			case QWikiPackage.PROCESS_GROUP__ONWED_PROCESS:
				getOnwedProcess().clear();
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
			case QWikiPackage.PROCESS_GROUP__OWNED_ELEMENT:
				return isSetOwnedElement();
			case QWikiPackage.PROCESS_GROUP__ONWED_PROCESS:
				return onwedProcess != null && !onwedProcess.isEmpty();
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
			|| eIsSet(QWikiPackage.PROCESS_GROUP__ONWED_PROCESS);
	}

} //ProcessGroupImpl
