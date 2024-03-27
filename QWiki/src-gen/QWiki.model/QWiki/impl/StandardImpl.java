/**
 */
package QWiki.impl;

import QWiki.Author;
import QWiki.QWikiPackage;
import QWiki.Standard;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Standard</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StandardImpl extends DocumentImpl implements Standard {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QWikiPackage.Literals.STANDARD;
	}

	/**
	 * The cached invocation delegate for the '{@link #sdo() <em>Sdo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #sdo()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate SDO__EINVOCATION_DELEGATE = ((EOperation.Internal)QWikiPackage.Literals.STANDARD___SDO).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Author> sdo() {
		try {
			return (EList<Author>)SDO__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case QWikiPackage.STANDARD___SDO:
				return sdo();
		}
		return super.eInvoke(operationID, arguments);
	}

} //StandardImpl
