/**
 */
package QWiki.Spice.impl;

import QWiki.QWikiElement;
import QWiki.QWikiNamedElement;
import QWiki.QWikiNamespace;
import QWiki.QWikiPackage;

import QWiki.Spice.ProcessGroup;
import QWiki.Spice.SpicePackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;

import org.eclipse.uml2.uml.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.Spice.impl.ProcessGroupImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link QWiki.Spice.impl.ProcessGroupImpl#getOwnedProcess <em>Owned Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessGroupImpl extends SpiceElementImpl implements ProcessGroup {
	/**
	 * The cached value of the '{@link #getOwnedProcess() <em>Owned Process</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedProcess()
	 * @generated
	 * @ordered
	 */
	protected EList<QWiki.Spice.Process> ownedProcess;

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
		return SpicePackage.Literals.PROCESS_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NamedElement> getOwnedMembers() {
		return new DerivedUnionEObjectEList<NamedElement>(NamedElement.class, this, SpicePackage.PROCESS_GROUP__OWNED_MEMBER, OWNED_MEMBER_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedMembers() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembers()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBER_ESUBSETS = new int[] {SpicePackage.PROCESS_GROUP__OWNED_RULE, SpicePackage.PROCESS_GROUP__OWNED_PROCESS};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QWiki.Spice.Process> getOwnedProcess() {
		if (ownedProcess == null) {
			ownedProcess = new EObjectContainmentWithInverseEList<QWiki.Spice.Process>(QWiki.Spice.Process.class, this, SpicePackage.PROCESS_GROUP__OWNED_PROCESS, SpicePackage.PROCESS__OWNING_PROCESS_GROUP);
		}
		return ownedProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWiki.Spice.Process getOwnedProcess(String name) {
		return getOwnedProcess(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWiki.Spice.Process getOwnedProcess(String name, boolean ignoreCase) {
		ownedProcessLoop: for (QWiki.Spice.Process ownedProcess : getOwnedProcess()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(ownedProcess.getName()) : name.equals(ownedProcess.getName())))
				continue ownedProcessLoop;
			return ownedProcess;
		}
		return null;
	}

	/**
	 * The cached invocation delegate for the '{@link #objectId() <em>Object Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #objectId()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate OBJECT_ID__EINVOCATION_DELEGATE = ((EOperation.Internal)SpicePackage.Literals.PROCESS_GROUP___OBJECT_ID).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String objectId() {
		try {
			return (String)OBJECT_ID__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpicePackage.PROCESS_GROUP__OWNED_PROCESS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedProcess()).basicAdd(otherEnd, msgs);
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
			case SpicePackage.PROCESS_GROUP__OWNED_PROCESS:
				return ((InternalEList<?>)getOwnedProcess()).basicRemove(otherEnd, msgs);
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
			case SpicePackage.PROCESS_GROUP__OWNED_PROCESS:
				return getOwnedProcess();
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
			case SpicePackage.PROCESS_GROUP__OWNED_PROCESS:
				getOwnedProcess().clear();
				getOwnedProcess().addAll((Collection<? extends QWiki.Spice.Process>)newValue);
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
			case SpicePackage.PROCESS_GROUP__OWNED_PROCESS:
				getOwnedProcess().clear();
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
			case SpicePackage.PROCESS_GROUP__OWNED_MEMBER:
				return isSetOwnedMembers();
			case SpicePackage.PROCESS_GROUP__OWNED_PROCESS:
				return ownedProcess != null && !ownedProcess.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == QWikiElement.class) {
			switch (baseOperationID) {
				case QWikiPackage.QWIKI_ELEMENT___OBJECT_ID: return SpicePackage.PROCESS_GROUP___OBJECT_ID;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == QWikiNamedElement.class) {
			switch (baseOperationID) {
				case QWikiPackage.QWIKI_NAMED_ELEMENT___OBJECT_ID: return SpicePackage.PROCESS_GROUP___OBJECT_ID;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == QWikiNamespace.class) {
			switch (baseOperationID) {
				case QWikiPackage.QWIKI_NAMESPACE___OBJECT_ID: return SpicePackage.PROCESS_GROUP___OBJECT_ID;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SpicePackage.PROCESS_GROUP___OBJECT_ID:
				return objectId();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwnedMembers() {
		return super.isSetOwnedMembers()
			|| eIsSet(SpicePackage.PROCESS_GROUP__OWNED_PROCESS);
	}

} //ProcessGroupImpl
