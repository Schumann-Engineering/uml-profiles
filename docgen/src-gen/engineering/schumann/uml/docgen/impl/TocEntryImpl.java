/**
 */
package engineering.schumann.uml.docgen.impl;

import engineering.schumann.uml.docgen.DocGenPackage;
import engineering.schumann.uml.docgen.TocEntry;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Toc Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link engineering.schumann.uml.docgen.impl.TocEntryImpl#getId <em>Id</em>}</li>
 *   <li>{@link engineering.schumann.uml.docgen.impl.TocEntryImpl#getDisplayText <em>Display Text</em>}</li>
 *   <li>{@link engineering.schumann.uml.docgen.impl.TocEntryImpl#getChild <em>Child</em>}</li>
 *   <li>{@link engineering.schumann.uml.docgen.impl.TocEntryImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TocEntryImpl extends MinimalEObjectImpl.Container implements TocEntry {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayText() <em>Display Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayText()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayText() <em>Display Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayText()
	 * @generated
	 * @ordered
	 */
	protected String displayText = DISPLAY_TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected EList<TocEntry> child;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TocEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocGenPackage.Literals.TOC_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getId() {
		if (id == null)
			return getDisplayText();
		else
			return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocGenPackage.TOC_ENTRY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDisplayText() {
		return displayText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDisplayText(String newDisplayText) {
		String oldDisplayText = displayText;
		displayText = newDisplayText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocGenPackage.TOC_ENTRY__DISPLAY_TEXT, oldDisplayText, displayText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TocEntry> getChild() {
		if (child == null) {
			child = new EObjectContainmentWithInverseEList<TocEntry>(TocEntry.class, this, DocGenPackage.TOC_ENTRY__CHILD, DocGenPackage.TOC_ENTRY__PARENT);
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TocEntry getParent() {
		if (eContainerFeatureID() != DocGenPackage.TOC_ENTRY__PARENT) return null;
		return (TocEntry)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TocEntry newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, DocGenPackage.TOC_ENTRY__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(TocEntry newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != DocGenPackage.TOC_ENTRY__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, DocGenPackage.TOC_ENTRY__CHILD, TocEntry.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocGenPackage.TOC_ENTRY__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int depth() {
		if (getParent() == null)
			return 1;
		else
			return getParent().depth() + 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String id(String delimiter) {
		if (getParent() != null)
			return getParent().id(delimiter) + delimiter + getId();
		else
			return getId();
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
			case DocGenPackage.TOC_ENTRY__CHILD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChild()).basicAdd(otherEnd, msgs);
			case DocGenPackage.TOC_ENTRY__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TocEntry)otherEnd, msgs);
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
			case DocGenPackage.TOC_ENTRY__CHILD:
				return ((InternalEList<?>)getChild()).basicRemove(otherEnd, msgs);
			case DocGenPackage.TOC_ENTRY__PARENT:
				return basicSetParent(null, msgs);
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
			case DocGenPackage.TOC_ENTRY__PARENT:
				return eInternalContainer().eInverseRemove(this, DocGenPackage.TOC_ENTRY__CHILD, TocEntry.class, msgs);
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
			case DocGenPackage.TOC_ENTRY__ID:
				return getId();
			case DocGenPackage.TOC_ENTRY__DISPLAY_TEXT:
				return getDisplayText();
			case DocGenPackage.TOC_ENTRY__CHILD:
				return getChild();
			case DocGenPackage.TOC_ENTRY__PARENT:
				return getParent();
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
			case DocGenPackage.TOC_ENTRY__ID:
				setId((String)newValue);
				return;
			case DocGenPackage.TOC_ENTRY__DISPLAY_TEXT:
				setDisplayText((String)newValue);
				return;
			case DocGenPackage.TOC_ENTRY__CHILD:
				getChild().clear();
				getChild().addAll((Collection<? extends TocEntry>)newValue);
				return;
			case DocGenPackage.TOC_ENTRY__PARENT:
				setParent((TocEntry)newValue);
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
			case DocGenPackage.TOC_ENTRY__ID:
				setId(ID_EDEFAULT);
				return;
			case DocGenPackage.TOC_ENTRY__DISPLAY_TEXT:
				setDisplayText(DISPLAY_TEXT_EDEFAULT);
				return;
			case DocGenPackage.TOC_ENTRY__CHILD:
				getChild().clear();
				return;
			case DocGenPackage.TOC_ENTRY__PARENT:
				setParent((TocEntry)null);
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
			case DocGenPackage.TOC_ENTRY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DocGenPackage.TOC_ENTRY__DISPLAY_TEXT:
				return DISPLAY_TEXT_EDEFAULT == null ? displayText != null : !DISPLAY_TEXT_EDEFAULT.equals(displayText);
			case DocGenPackage.TOC_ENTRY__CHILD:
				return child != null && !child.isEmpty();
			case DocGenPackage.TOC_ENTRY__PARENT:
				return getParent() != null;
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
			case DocGenPackage.TOC_ENTRY___DEPTH:
				return depth();
			case DocGenPackage.TOC_ENTRY___ID__STRING:
				return id((String)arguments.get(0));
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
		result.append(" (id: ");
		result.append(id);
		result.append(", displayText: ");
		result.append(displayText);
		result.append(')');
		return result.toString();
	}

} //TocEntryImpl
