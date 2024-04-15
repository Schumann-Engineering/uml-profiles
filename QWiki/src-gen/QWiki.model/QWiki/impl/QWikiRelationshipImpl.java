/**
 */
package QWiki.impl;

import QWiki.L10nKeyedString;
import QWiki.QWikiElement;
import QWiki.QWikiPackage;
import QWiki.QWikiRelationship;
import QWiki.QWikiRelationshipType;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.internal.impl.DirectedRelationshipImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.impl.QWikiRelationshipImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link QWiki.impl.QWikiRelationshipImpl#getCustomProperty <em>Custom Property</em>}</li>
 *   <li>{@link QWiki.impl.QWikiRelationshipImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link QWiki.impl.QWikiRelationshipImpl#getRelationshipType <em>Relationship Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class QWikiRelationshipImpl extends DirectedRelationshipImpl implements QWikiRelationship {
	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomProperty() <em>Custom Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<L10nKeyedString> customProperty;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tag;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QWikiRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QWikiPackage.Literals.QWIKI_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getUuid() {
		if (uuid == null)
			setUuid(java.util.UUID.randomUUID().toString());		
			
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.QWIKI_RELATIONSHIP__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<L10nKeyedString> getCustomProperty() {
		if (customProperty == null) {
			customProperty = new EObjectContainmentEList<L10nKeyedString>(L10nKeyedString.class, this, QWikiPackage.QWIKI_RELATIONSHIP__CUSTOM_PROPERTY);
		}
		return customProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTag() {
		if (tag == null) {
			tag = new EDataTypeUniqueEList<String>(String.class, this, QWikiPackage.QWIKI_RELATIONSHIP__TAG);
		}
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QWikiRelationshipType getRelationshipType() {
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
	protected static final EOperation.Internal.InvocationDelegate OBJECT_ID__EINVOCATION_DELEGATE = ((EOperation.Internal)QWikiPackage.Literals.QWIKI_ELEMENT___OBJECT_ID).getInvocationDelegate();

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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QWikiPackage.QWIKI_RELATIONSHIP__CUSTOM_PROPERTY:
				return ((InternalEList<?>)getCustomProperty()).basicRemove(otherEnd, msgs);
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
			case QWikiPackage.QWIKI_RELATIONSHIP__UUID:
				return getUuid();
			case QWikiPackage.QWIKI_RELATIONSHIP__CUSTOM_PROPERTY:
				return getCustomProperty();
			case QWikiPackage.QWIKI_RELATIONSHIP__TAG:
				return getTag();
			case QWikiPackage.QWIKI_RELATIONSHIP__RELATIONSHIP_TYPE:
				return getRelationshipType();
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
			case QWikiPackage.QWIKI_RELATIONSHIP__UUID:
				setUuid((String)newValue);
				return;
			case QWikiPackage.QWIKI_RELATIONSHIP__CUSTOM_PROPERTY:
				getCustomProperty().clear();
				getCustomProperty().addAll((Collection<? extends L10nKeyedString>)newValue);
				return;
			case QWikiPackage.QWIKI_RELATIONSHIP__TAG:
				getTag().clear();
				getTag().addAll((Collection<? extends String>)newValue);
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
			case QWikiPackage.QWIKI_RELATIONSHIP__UUID:
				setUuid(UUID_EDEFAULT);
				return;
			case QWikiPackage.QWIKI_RELATIONSHIP__CUSTOM_PROPERTY:
				getCustomProperty().clear();
				return;
			case QWikiPackage.QWIKI_RELATIONSHIP__TAG:
				getTag().clear();
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
			case QWikiPackage.QWIKI_RELATIONSHIP__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case QWikiPackage.QWIKI_RELATIONSHIP__CUSTOM_PROPERTY:
				return customProperty != null && !customProperty.isEmpty();
			case QWikiPackage.QWIKI_RELATIONSHIP__TAG:
				return tag != null && !tag.isEmpty();
			case QWikiPackage.QWIKI_RELATIONSHIP__RELATIONSHIP_TYPE:
				return isSetRelationshipType();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == QWikiElement.class) {
			switch (derivedFeatureID) {
				case QWikiPackage.QWIKI_RELATIONSHIP__UUID: return QWikiPackage.QWIKI_ELEMENT__UUID;
				case QWikiPackage.QWIKI_RELATIONSHIP__CUSTOM_PROPERTY: return QWikiPackage.QWIKI_ELEMENT__CUSTOM_PROPERTY;
				case QWikiPackage.QWIKI_RELATIONSHIP__TAG: return QWikiPackage.QWIKI_ELEMENT__TAG;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == QWikiElement.class) {
			switch (baseFeatureID) {
				case QWikiPackage.QWIKI_ELEMENT__UUID: return QWikiPackage.QWIKI_RELATIONSHIP__UUID;
				case QWikiPackage.QWIKI_ELEMENT__CUSTOM_PROPERTY: return QWikiPackage.QWIKI_RELATIONSHIP__CUSTOM_PROPERTY;
				case QWikiPackage.QWIKI_ELEMENT__TAG: return QWikiPackage.QWIKI_RELATIONSHIP__TAG;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
				case QWikiPackage.QWIKI_ELEMENT___OBJECT_ID: return QWikiPackage.QWIKI_RELATIONSHIP___OBJECT_ID;
				default: return -1;
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
			case QWikiPackage.QWIKI_RELATIONSHIP___OBJECT_ID:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uuid: ");
		result.append(uuid);
		result.append(", tag: ");
		result.append(tag);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelationshipType() {
		return false;
	}

} //QWikiRelationshipImpl
