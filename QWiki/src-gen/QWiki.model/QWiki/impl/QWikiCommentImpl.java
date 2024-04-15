/**
 */
package QWiki.impl;

import QWiki.L10nString;
import QWiki.QWikiComment;
import QWiki.QWikiPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QWiki.impl.QWikiCommentImpl#getAnnotatedElements <em>Annotated Element</em>}</li>
 *   <li>{@link QWiki.impl.QWikiCommentImpl#getBody <em>Body</em>}</li>
 *   <li>{@link QWiki.impl.QWikiCommentImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QWikiCommentImpl extends QWikiElementImpl implements QWikiComment {
	/**
	 * The cached value of the '{@link #getAnnotatedElements() <em>Annotated Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> annotatedElements;

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * This is true if the Body attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bodyESet;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected L10nString content;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QWikiCommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QWikiPackage.Literals.QWIKI_COMMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getAnnotatedElements() {
		if (annotatedElements == null) {
			annotatedElements = new EObjectResolvingEList<Element>(Element.class, this, QWikiPackage.QWIKI_COMMENT__ANNOTATED_ELEMENT);
		}
		return annotatedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		boolean oldBodyESet = bodyESet;
		bodyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.QWIKI_COMMENT__BODY, oldBody, body, !oldBodyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBody() {
		String oldBody = body;
		boolean oldBodyESet = bodyESet;
		body = BODY_EDEFAULT;
		bodyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, QWikiPackage.QWIKI_COMMENT__BODY, oldBody, BODY_EDEFAULT, oldBodyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBody() {
		return bodyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public L10nString getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(L10nString newContent) {
		L10nString oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QWikiPackage.QWIKI_COMMENT__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QWikiPackage.QWIKI_COMMENT__ANNOTATED_ELEMENT:
				return getAnnotatedElements();
			case QWikiPackage.QWIKI_COMMENT__BODY:
				return getBody();
			case QWikiPackage.QWIKI_COMMENT__CONTENT:
				return getContent();
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
			case QWikiPackage.QWIKI_COMMENT__ANNOTATED_ELEMENT:
				getAnnotatedElements().clear();
				getAnnotatedElements().addAll((Collection<? extends Element>)newValue);
				return;
			case QWikiPackage.QWIKI_COMMENT__BODY:
				setBody((String)newValue);
				return;
			case QWikiPackage.QWIKI_COMMENT__CONTENT:
				setContent((L10nString)newValue);
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
			case QWikiPackage.QWIKI_COMMENT__ANNOTATED_ELEMENT:
				getAnnotatedElements().clear();
				return;
			case QWikiPackage.QWIKI_COMMENT__BODY:
				unsetBody();
				return;
			case QWikiPackage.QWIKI_COMMENT__CONTENT:
				setContent((L10nString)null);
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
			case QWikiPackage.QWIKI_COMMENT__ANNOTATED_ELEMENT:
				return annotatedElements != null && !annotatedElements.isEmpty();
			case QWikiPackage.QWIKI_COMMENT__BODY:
				return isSetBody();
			case QWikiPackage.QWIKI_COMMENT__CONTENT:
				return content != null;
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
		if (baseClass == Comment.class) {
			switch (derivedFeatureID) {
				case QWikiPackage.QWIKI_COMMENT__ANNOTATED_ELEMENT: return UMLPackage.COMMENT__ANNOTATED_ELEMENT;
				case QWikiPackage.QWIKI_COMMENT__BODY: return UMLPackage.COMMENT__BODY;
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
		if (baseClass == Comment.class) {
			switch (baseFeatureID) {
				case UMLPackage.COMMENT__ANNOTATED_ELEMENT: return QWikiPackage.QWIKI_COMMENT__ANNOTATED_ELEMENT;
				case UMLPackage.COMMENT__BODY: return QWikiPackage.QWIKI_COMMENT__BODY;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (body: ");
		if (bodyESet) result.append(body); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //QWikiCommentImpl
