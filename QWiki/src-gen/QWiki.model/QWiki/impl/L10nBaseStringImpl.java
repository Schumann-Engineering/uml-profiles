/**
 */
package QWiki.impl;

import QWiki.L10nBaseString;
import QWiki.L10nText;
import QWiki.QWikiEncryptionKey;
import QWiki.QWikiPackage;

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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>L1 0n Base String</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.impl.L10nBaseStringImpl#getText <em>Text</em>}</li>
 *   <li>{@link QWiki.impl.L10nBaseStringImpl#getEncryptionKey <em>Encryption Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class L10nBaseStringImpl extends MinimalEObjectImpl.Container implements L10nBaseString {
	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected EList<L10nText> text;

	/**
	 * The cached value of the '{@link #getEncryptionKey() <em>Encryption Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptionKey()
	 * @generated
	 * @ordered
	 */
	protected QWikiEncryptionKey encryptionKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected L10nBaseStringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QWikiPackage.Literals.L1_0N_BASE_STRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<L10nText> getText() {
		if (text == null) {
			text = new EObjectContainmentEList<L10nText>(L10nText.class, this, QWikiPackage.L1_0N_BASE_STRING__TEXT);
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QWikiEncryptionKey getEncryptionKey() {
		return encryptionKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncryptionKey(QWikiEncryptionKey newEncryptionKey) {
		QWikiEncryptionKey oldEncryptionKey = encryptionKey;
		encryptionKey = newEncryptionKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.L1_0N_BASE_STRING__ENCRYPTION_KEY, oldEncryptionKey, encryptionKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String value(String language) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached invocation delegate for the '{@link #isEncrypted() <em>Is Encrypted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEncrypted()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_ENCRYPTED__EINVOCATION_DELEGATE = ((EOperation.Internal)QWikiPackage.Literals.L1_0N_BASE_STRING___IS_ENCRYPTED).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEncrypted() {
		try {
			return (Boolean)IS_ENCRYPTED__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case QWikiPackage.L1_0N_BASE_STRING__TEXT:
				return ((InternalEList<?>)getText()).basicRemove(otherEnd, msgs);
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
			case QWikiPackage.L1_0N_BASE_STRING__TEXT:
				return getText();
			case QWikiPackage.L1_0N_BASE_STRING__ENCRYPTION_KEY:
				return getEncryptionKey();
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
			case QWikiPackage.L1_0N_BASE_STRING__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends L10nText>)newValue);
				return;
			case QWikiPackage.L1_0N_BASE_STRING__ENCRYPTION_KEY:
				setEncryptionKey((QWikiEncryptionKey)newValue);
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
			case QWikiPackage.L1_0N_BASE_STRING__TEXT:
				getText().clear();
				return;
			case QWikiPackage.L1_0N_BASE_STRING__ENCRYPTION_KEY:
				setEncryptionKey((QWikiEncryptionKey)null);
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
			case QWikiPackage.L1_0N_BASE_STRING__TEXT:
				return text != null && !text.isEmpty();
			case QWikiPackage.L1_0N_BASE_STRING__ENCRYPTION_KEY:
				return encryptionKey != null;
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
			case QWikiPackage.L1_0N_BASE_STRING___VALUE__STRING:
				return value((String)arguments.get(0));
			case QWikiPackage.L1_0N_BASE_STRING___IS_ENCRYPTED:
				return isEncrypted();
		}
		return super.eInvoke(operationID, arguments);
	}

} //L10nBaseStringImpl
