/**
 */
package QWiki.Kernel.util;

import QWiki.Kernel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Relationship;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see QWiki.Kernel.KernelPackage
 * @generated
 */
public class KernelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KernelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KernelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = KernelPackage.eINSTANCE;
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
	protected KernelSwitch<Adapter> modelSwitch =
		new KernelSwitch<Adapter>() {
			@Override
			public Adapter caseI18nNamedElement(I18nNamedElement object) {
				return createI18nNamedElementAdapter();
			}
			@Override
			public Adapter caseQWikiNamedElement(QWikiNamedElement object) {
				return createQWikiNamedElementAdapter();
			}
			@Override
			public Adapter caseQWikiElement(QWikiElement object) {
				return createQWikiElementAdapter();
			}
			@Override
			public Adapter caseI18nKeyedString(I18nKeyedString object) {
				return createI18nKeyedStringAdapter();
			}
			@Override
			public Adapter caseI18nBaseString(I18nBaseString object) {
				return createI18nBaseStringAdapter();
			}
			@Override
			public Adapter caseI18nValue(I18nValue object) {
				return createI18nValueAdapter();
			}
			@Override
			public Adapter caseI18nString(I18nString object) {
				return createI18nStringAdapter();
			}
			@Override
			public Adapter caseQWikiComment(QWikiComment object) {
				return createQWikiCommentAdapter();
			}
			@Override
			public Adapter caseI18nDescriptiveElement(I18nDescriptiveElement object) {
				return createI18nDescriptiveElementAdapter();
			}
			@Override
			public Adapter caseQWikiNamespace(QWikiNamespace object) {
				return createQWikiNamespaceAdapter();
			}
			@Override
			public Adapter caseQWikiContainer(QWikiContainer object) {
				return createQWikiContainerAdapter();
			}
			@Override
			public Adapter caseQWikiRelationship(QWikiRelationship object) {
				return createQWikiRelationshipAdapter();
			}
			@Override
			public Adapter caseQWikiRelationshipType(QWikiRelationshipType object) {
				return createQWikiRelationshipTypeAdapter();
			}
			@Override
			public Adapter caseEModelElement(EModelElement object) {
				return createEModelElementAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseComment(Comment object) {
				return createCommentAdapter();
			}
			@Override
			public Adapter caseNamespace(Namespace object) {
				return createNamespaceAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseDirectedRelationship(DirectedRelationship object) {
				return createDirectedRelationshipAdapter();
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
	 * Creates a new adapter for an object of class '{@link QWiki.Kernel.I18nNamedElement <em>I1 8n Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Kernel.I18nNamedElement
	 * @generated
	 */
	public Adapter createI18nNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Kernel.QWikiNamedElement <em>QWiki Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Kernel.QWikiNamedElement
	 * @generated
	 */
	public Adapter createQWikiNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Kernel.QWikiElement <em>QWiki Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Kernel.QWikiElement
	 * @generated
	 */
	public Adapter createQWikiElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Kernel.I18nKeyedString <em>I1 8n Keyed String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Kernel.I18nKeyedString
	 * @generated
	 */
	public Adapter createI18nKeyedStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Kernel.I18nBaseString <em>I1 8n Base String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Kernel.I18nBaseString
	 * @generated
	 */
	public Adapter createI18nBaseStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Kernel.I18nValue <em>I1 8n Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Kernel.I18nValue
	 * @generated
	 */
	public Adapter createI18nValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Kernel.I18nString <em>I1 8n String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Kernel.I18nString
	 * @generated
	 */
	public Adapter createI18nStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Kernel.QWikiComment <em>QWiki Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Kernel.QWikiComment
	 * @generated
	 */
	public Adapter createQWikiCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Kernel.I18nDescriptiveElement <em>I1 8n Descriptive Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Kernel.I18nDescriptiveElement
	 * @generated
	 */
	public Adapter createI18nDescriptiveElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Kernel.QWikiNamespace <em>QWiki Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Kernel.QWikiNamespace
	 * @generated
	 */
	public Adapter createQWikiNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Kernel.QWikiContainer <em>QWiki Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Kernel.QWikiContainer
	 * @generated
	 */
	public Adapter createQWikiContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Kernel.QWikiRelationship <em>QWiki Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Kernel.QWikiRelationship
	 * @generated
	 */
	public Adapter createQWikiRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Kernel.QWikiRelationshipType <em>QWiki Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Kernel.QWikiRelationshipType
	 * @generated
	 */
	public Adapter createQWikiRelationshipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.EModelElement
	 * @generated
	 */
	public Adapter createEModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.DirectedRelationship <em>Directed Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.DirectedRelationship
	 * @generated
	 */
	public Adapter createDirectedRelationshipAdapter() {
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

} //KernelAdapterFactory
