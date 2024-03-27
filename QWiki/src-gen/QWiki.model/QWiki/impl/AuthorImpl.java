/**
 */
package QWiki.impl;

import QWiki.Author;
import QWiki.AuthorType;
import QWiki.Document;
import QWiki.QWikiPackage;
import QWiki.Standard;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Author</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.impl.AuthorImpl#getAuthorType <em>Author Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthorImpl extends NamedElementImpl implements Author {
	/**
	 * The default value of the '{@link #getAuthorType() <em>Author Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorType()
	 * @generated
	 * @ordered
	 */
	protected static final AuthorType AUTHOR_TYPE_EDEFAULT = AuthorType.PERSON;

	/**
	 * The cached value of the '{@link #getAuthorType() <em>Author Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorType()
	 * @generated
	 * @ordered
	 */
	protected AuthorType authorType = AUTHOR_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QWikiPackage.Literals.AUTHOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorType getAuthorType() {
		return authorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorType(AuthorType newAuthorType) {
		AuthorType oldAuthorType = authorType;
		authorType = newAuthorType == null ? AUTHOR_TYPE_EDEFAULT : newAuthorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.AUTHOR__AUTHOR_TYPE, oldAuthorType, authorType));
	}

	/**
	 * The cached invocation delegate for the '{@link #authoredDocument() <em>Authored Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #authoredDocument()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate AUTHORED_DOCUMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)QWikiPackage.Literals.AUTHOR___AUTHORED_DOCUMENT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Document> authoredDocument() {
		try {
			return (EList<Document>)AUTHORED_DOCUMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #authoredStandard() <em>Authored Standard</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #authoredStandard()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate AUTHORED_STANDARD__EINVOCATION_DELEGATE = ((EOperation.Internal)QWikiPackage.Literals.AUTHOR___AUTHORED_STANDARD).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Standard> authoredStandard() {
		try {
			return (EList<Standard>)AUTHORED_STANDARD__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QWikiPackage.AUTHOR__AUTHOR_TYPE:
				return getAuthorType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QWikiPackage.AUTHOR__AUTHOR_TYPE:
				setAuthorType((AuthorType)newValue);
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
			case QWikiPackage.AUTHOR__AUTHOR_TYPE:
				setAuthorType(AUTHOR_TYPE_EDEFAULT);
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
			case QWikiPackage.AUTHOR__AUTHOR_TYPE:
				return authorType != AUTHOR_TYPE_EDEFAULT;
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
			case QWikiPackage.AUTHOR___AUTHORED_DOCUMENT:
				return authoredDocument();
			case QWikiPackage.AUTHOR___AUTHORED_STANDARD:
				return authoredStandard();
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
		result.append(" (authorType: ");
		result.append(authorType);
		result.append(')');
		return result.toString();
	}

} //AuthorImpl
