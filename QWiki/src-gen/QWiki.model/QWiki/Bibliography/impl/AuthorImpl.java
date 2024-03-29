/**
 */
package QWiki.Bibliography.impl;

import QWiki.Bibliography.Author;
import QWiki.Bibliography.AuthorType;
import QWiki.Bibliography.BibliographyPackage;
import QWiki.Bibliography.Document;

import QWiki.Infrastructure.impl.UmlNamedElementImpl;

import QWiki.Kernel.KernelPackage;

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
 *   <li>{@link QWiki.Bibliography.impl.AuthorImpl#getAuthorType <em>Author Type</em>}</li>
 *   <li>{@link QWiki.Bibliography.impl.AuthorImpl#getAbbreviation <em>Abbreviation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthorImpl extends UmlNamedElementImpl implements Author {
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
	 * The default value of the '{@link #getAbbreviation() <em>Abbreviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbreviation()
	 * @generated
	 * @ordered
	 */
	protected static final String ABBREVIATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbbreviation() <em>Abbreviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbreviation()
	 * @generated
	 * @ordered
	 */
	protected String abbreviation = ABBREVIATION_EDEFAULT;

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
		return BibliographyPackage.Literals.AUTHOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BibliographyPackage.AUTHOR__AUTHOR_TYPE, oldAuthorType, authorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAbbreviation() {
		return abbreviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbbreviation(String newAbbreviation) {
		String oldAbbreviation = abbreviation;
		abbreviation = newAbbreviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BibliographyPackage.AUTHOR__ABBREVIATION, oldAbbreviation, abbreviation));
	}

	/**
	 * The cached invocation delegate for the '{@link #authoredDocument() <em>Authored Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #authoredDocument()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate AUTHORED_DOCUMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)BibliographyPackage.Literals.AUTHOR___AUTHORED_DOCUMENT).getInvocationDelegate();

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
	protected static final EOperation.Internal.InvocationDelegate AUTHORED_STANDARD__EINVOCATION_DELEGATE = ((EOperation.Internal)BibliographyPackage.Literals.AUTHOR___AUTHORED_STANDARD).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Document> authoredStandard() {
		try {
			return (EList<Document>)AUTHORED_STANDARD__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #oid() <em>Oid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #oid()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate OID__EINVOCATION_DELEGATE = ((EOperation.Internal)KernelPackage.Literals.MODEL_ELEMENT___OID).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String oid() {
		try {
			return (String)OID__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case BibliographyPackage.AUTHOR__AUTHOR_TYPE:
				return getAuthorType();
			case BibliographyPackage.AUTHOR__ABBREVIATION:
				return getAbbreviation();
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
			case BibliographyPackage.AUTHOR__AUTHOR_TYPE:
				setAuthorType((AuthorType)newValue);
				return;
			case BibliographyPackage.AUTHOR__ABBREVIATION:
				setAbbreviation((String)newValue);
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
			case BibliographyPackage.AUTHOR__AUTHOR_TYPE:
				setAuthorType(AUTHOR_TYPE_EDEFAULT);
				return;
			case BibliographyPackage.AUTHOR__ABBREVIATION:
				setAbbreviation(ABBREVIATION_EDEFAULT);
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
			case BibliographyPackage.AUTHOR__AUTHOR_TYPE:
				return authorType != AUTHOR_TYPE_EDEFAULT;
			case BibliographyPackage.AUTHOR__ABBREVIATION:
				return ABBREVIATION_EDEFAULT == null ? abbreviation != null : !ABBREVIATION_EDEFAULT.equals(abbreviation);
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
			case BibliographyPackage.AUTHOR___AUTHORED_DOCUMENT:
				return authoredDocument();
			case BibliographyPackage.AUTHOR___AUTHORED_STANDARD:
				return authoredStandard();
			case BibliographyPackage.AUTHOR___OID:
				return oid();
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
		result.append(", abbreviation: ");
		result.append(abbreviation);
		result.append(')');
		return result.toString();
	}

} //AuthorImpl
