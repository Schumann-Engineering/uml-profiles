/**
 */
package QWiki.I18N.util;

import QWiki.I18N.*;

import QWiki.Infrastructure.UmlElement;
import QWiki.Infrastructure.UmlNamedElement;

import QWiki.Kernel.ModelElement;
import QWiki.Kernel.ModelTaggedElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see QWiki.I18N._Package
 * @generated
 */
public class _AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = _Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected _Switch<Adapter> modelSwitch =
		new _Switch<Adapter>() {
			@Override
			public Adapter caseI18nBaseString(I18nBaseString object) {
				return createI18nBaseStringAdapter();
			}
			@Override
			public Adapter caseI18nValue(I18nValue object) {
				return createI18nValueAdapter();
			}
			@Override
			public Adapter caseI18nDescriptiveElement(I18nDescriptiveElement object) {
				return createI18nDescriptiveElementAdapter();
			}
			@Override
			public Adapter caseI18nString(I18nString object) {
				return createI18nStringAdapter();
			}
			@Override
			public Adapter caseI18nKeyedString(I18nKeyedString object) {
				return createI18nKeyedStringAdapter();
			}
			@Override
			public Adapter caseI18nNamedElement(I18nNamedElement object) {
				return createI18nNamedElementAdapter();
			}
			@Override
			public Adapter caseUmlElement(UmlElement object) {
				return createUmlElementAdapter();
			}
			@Override
			public Adapter caseModelTaggedElement(ModelTaggedElement object) {
				return createModelTaggedElementAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseUmlNamedElement(UmlNamedElement object) {
				return createUmlNamedElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link QWiki.I18N.I18nBaseString <em>I1 8n Base String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.I18N.I18nBaseString
	 * @generated
	 */
	public Adapter createI18nBaseStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.I18N.I18nValue <em>I1 8n Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.I18N.I18nValue
	 * @generated
	 */
	public Adapter createI18nValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.I18N.I18nDescriptiveElement <em>I1 8n Descriptive Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.I18N.I18nDescriptiveElement
	 * @generated
	 */
	public Adapter createI18nDescriptiveElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.I18N.I18nString <em>I1 8n String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.I18N.I18nString
	 * @generated
	 */
	public Adapter createI18nStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.I18N.I18nKeyedString <em>I1 8n Keyed String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.I18N.I18nKeyedString
	 * @generated
	 */
	public Adapter createI18nKeyedStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.I18N.I18nNamedElement <em>I1 8n Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.I18N.I18nNamedElement
	 * @generated
	 */
	public Adapter createI18nNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Infrastructure.UmlElement <em>Uml Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Infrastructure.UmlElement
	 * @generated
	 */
	public Adapter createUmlElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Kernel.ModelTaggedElement <em>Model Tagged Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Kernel.ModelTaggedElement
	 * @generated
	 */
	public Adapter createModelTaggedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Kernel.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Kernel.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Infrastructure.UmlNamedElement <em>Uml Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Infrastructure.UmlNamedElement
	 * @generated
	 */
	public Adapter createUmlNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //_AdapterFactory
