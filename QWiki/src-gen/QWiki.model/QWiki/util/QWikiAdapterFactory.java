/**
 */
package QWiki.util;

import QWiki.Author;
import QWiki.BasePractise;
import QWiki.DO_NOT_USE_Relationship;
import QWiki.DO_NOT_USE_RelationshipType;
import QWiki.Document;
import QWiki.DocumentVersion;
import QWiki.Domain;
import QWiki.DomainElement;
import QWiki.GenericWorkProduct;
import QWiki.I18nBaseString;
import QWiki.I18nDescriptiveElement;
import QWiki.I18nKeyedString;
import QWiki.I18nNamedElement;
import QWiki.I18nString;
import QWiki.I18nValue;
import QWiki.ModelElement;
import QWiki.Outcome;
import QWiki.ProcessGroup;
import QWiki.ProcessReferenceModel;
import QWiki.QWikiModel;
import QWiki.QWikiPackage;
import QWiki.RasciElement;
import QWiki.Role;
import QWiki.Section;
import QWiki.SpiceElement;
import QWiki.SuperseedingRelationship;
import QWiki.TaggedElement;
import QWiki.Term;
import QWiki.TermDefinition;
import QWiki.UmlAssociation;
import QWiki.UmlComment;
import QWiki.UmlDirectedRelationship;
import QWiki.UmlElement;
import QWiki.UmlNamedElement;
import QWiki.UmlNamespace;
import QWiki.UmlPackage;
import QWiki.UmlPackageableElement;
import QWiki.UmlRelationship;
import QWiki.WorkProduct;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see QWiki.QWikiPackage
 * @generated
 */
public class QWikiAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QWikiPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QWikiAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QWikiPackage.eINSTANCE;
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
	protected QWikiSwitch<Adapter> modelSwitch =
		new QWikiSwitch<Adapter>() {
			@Override
			public Adapter caseAuthor(Author object) {
				return createAuthorAdapter();
			}
			@Override
			public Adapter caseUmlNamedElement(UmlNamedElement object) {
				return createUmlNamedElementAdapter();
			}
			@Override
			public Adapter caseUmlElement(UmlElement object) {
				return createUmlElementAdapter();
			}
			@Override
			public Adapter caseUmlComment(UmlComment object) {
				return createUmlCommentAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseTaggedElement(TaggedElement object) {
				return createTaggedElementAdapter();
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
			public Adapter caseQWikiModel(QWikiModel object) {
				return createQWikiModelAdapter();
			}
			@Override
			public Adapter caseUmlPackage(UmlPackage object) {
				return createUmlPackageAdapter();
			}
			@Override
			public Adapter caseUmlPackageableElement(UmlPackageableElement object) {
				return createUmlPackageableElementAdapter();
			}
			@Override
			public Adapter caseUmlNamespace(UmlNamespace object) {
				return createUmlNamespaceAdapter();
			}
			@Override
			public Adapter caseDocument(Document object) {
				return createDocumentAdapter();
			}
			@Override
			public Adapter caseI18nDescriptiveElement(I18nDescriptiveElement object) {
				return createI18nDescriptiveElementAdapter();
			}
			@Override
			public Adapter caseI18nNamedElement(I18nNamedElement object) {
				return createI18nNamedElementAdapter();
			}
			@Override
			public Adapter caseI18nString(I18nString object) {
				return createI18nStringAdapter();
			}
			@Override
			public Adapter caseDocumentVersion(DocumentVersion object) {
				return createDocumentVersionAdapter();
			}
			@Override
			public Adapter caseSection(Section object) {
				return createSectionAdapter();
			}
			@Override
			public Adapter caseSpiceElement(SpiceElement object) {
				return createSpiceElementAdapter();
			}
			@Override
			public Adapter caseRasciElement(RasciElement object) {
				return createRasciElementAdapter();
			}
			@Override
			public Adapter caseRole(Role object) {
				return createRoleAdapter();
			}
			@Override
			public Adapter caseProcessReferenceModel(ProcessReferenceModel object) {
				return createProcessReferenceModelAdapter();
			}
			@Override
			public Adapter caseSuperseedingRelationship(SuperseedingRelationship object) {
				return createSuperseedingRelationshipAdapter();
			}
			@Override
			public Adapter caseUmlDirectedRelationship(UmlDirectedRelationship object) {
				return createUmlDirectedRelationshipAdapter();
			}
			@Override
			public Adapter caseUmlRelationship(UmlRelationship object) {
				return createUmlRelationshipAdapter();
			}
			@Override
			public Adapter caseTerm(Term object) {
				return createTermAdapter();
			}
			@Override
			public Adapter caseTermDefinition(TermDefinition object) {
				return createTermDefinitionAdapter();
			}
			@Override
			public Adapter caseBasePractise(BasePractise object) {
				return createBasePractiseAdapter();
			}
			@Override
			public Adapter caseProcess(QWiki.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseProcessGroup(ProcessGroup object) {
				return createProcessGroupAdapter();
			}
			@Override
			public Adapter caseOutcome(Outcome object) {
				return createOutcomeAdapter();
			}
			@Override
			public Adapter caseWorkProduct(WorkProduct object) {
				return createWorkProductAdapter();
			}
			@Override
			public Adapter caseGenericWorkProduct(GenericWorkProduct object) {
				return createGenericWorkProductAdapter();
			}
			@Override
			public Adapter caseDomain(Domain object) {
				return createDomainAdapter();
			}
			@Override
			public Adapter caseDomainElement(DomainElement object) {
				return createDomainElementAdapter();
			}
			@Override
			public Adapter caseDO_NOT_USE_Relationship(DO_NOT_USE_Relationship object) {
				return createDO_NOT_USE_RelationshipAdapter();
			}
			@Override
			public Adapter caseDO_NOT_USE_RelationshipType(DO_NOT_USE_RelationshipType object) {
				return createDO_NOT_USE_RelationshipTypeAdapter();
			}
			@Override
			public Adapter caseUmlAssociation(UmlAssociation object) {
				return createUmlAssociationAdapter();
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
	 * Creates a new adapter for an object of class '{@link QWiki.Author <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Author
	 * @generated
	 */
	public Adapter createAuthorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.UmlNamedElement <em>Uml Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.UmlNamedElement
	 * @generated
	 */
	public Adapter createUmlNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.UmlElement <em>Uml Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.UmlElement
	 * @generated
	 */
	public Adapter createUmlElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.UmlComment <em>Uml Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.UmlComment
	 * @generated
	 */
	public Adapter createUmlCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.TaggedElement <em>Tagged Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.TaggedElement
	 * @generated
	 */
	public Adapter createTaggedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.I18nKeyedString <em>I1 8n Keyed String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.I18nKeyedString
	 * @generated
	 */
	public Adapter createI18nKeyedStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.I18nBaseString <em>I1 8n Base String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.I18nBaseString
	 * @generated
	 */
	public Adapter createI18nBaseStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.I18nValue <em>I1 8n Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.I18nValue
	 * @generated
	 */
	public Adapter createI18nValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.QWikiModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.QWikiModel
	 * @generated
	 */
	public Adapter createQWikiModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.UmlPackage <em>Uml Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.UmlPackage
	 * @generated
	 */
	public Adapter createUmlPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.UmlPackageableElement <em>Uml Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.UmlPackageableElement
	 * @generated
	 */
	public Adapter createUmlPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.UmlNamespace <em>Uml Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.UmlNamespace
	 * @generated
	 */
	public Adapter createUmlNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.I18nDescriptiveElement <em>I1 8n Descriptive Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.I18nDescriptiveElement
	 * @generated
	 */
	public Adapter createI18nDescriptiveElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.I18nNamedElement <em>I1 8n Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.I18nNamedElement
	 * @generated
	 */
	public Adapter createI18nNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.I18nString <em>I1 8n String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.I18nString
	 * @generated
	 */
	public Adapter createI18nStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.DocumentVersion <em>Document Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.DocumentVersion
	 * @generated
	 */
	public Adapter createDocumentVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.SpiceElement <em>Spice Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.SpiceElement
	 * @generated
	 */
	public Adapter createSpiceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.RasciElement <em>Rasci Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.RasciElement
	 * @generated
	 */
	public Adapter createRasciElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Role
	 * @generated
	 */
	public Adapter createRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.ProcessReferenceModel <em>Process Reference Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.ProcessReferenceModel
	 * @generated
	 */
	public Adapter createProcessReferenceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.SuperseedingRelationship <em>Superseeding Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.SuperseedingRelationship
	 * @generated
	 */
	public Adapter createSuperseedingRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.UmlDirectedRelationship <em>Uml Directed Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.UmlDirectedRelationship
	 * @generated
	 */
	public Adapter createUmlDirectedRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.UmlRelationship <em>Uml Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.UmlRelationship
	 * @generated
	 */
	public Adapter createUmlRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Term
	 * @generated
	 */
	public Adapter createTermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.TermDefinition <em>Term Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.TermDefinition
	 * @generated
	 */
	public Adapter createTermDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.BasePractise <em>Base Practise</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.BasePractise
	 * @generated
	 */
	public Adapter createBasePractiseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.ProcessGroup <em>Process Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.ProcessGroup
	 * @generated
	 */
	public Adapter createProcessGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Outcome <em>Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Outcome
	 * @generated
	 */
	public Adapter createOutcomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.WorkProduct <em>Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.WorkProduct
	 * @generated
	 */
	public Adapter createWorkProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.GenericWorkProduct <em>Generic Work Product</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.GenericWorkProduct
	 * @generated
	 */
	public Adapter createGenericWorkProductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.Domain
	 * @generated
	 */
	public Adapter createDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.DomainElement <em>Domain Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.DomainElement
	 * @generated
	 */
	public Adapter createDomainElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.DO_NOT_USE_Relationship <em>DO NOT USE Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.DO_NOT_USE_Relationship
	 * @generated
	 */
	public Adapter createDO_NOT_USE_RelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.DO_NOT_USE_RelationshipType <em>DO NOT USE Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.DO_NOT_USE_RelationshipType
	 * @generated
	 */
	public Adapter createDO_NOT_USE_RelationshipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QWiki.UmlAssociation <em>Uml Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QWiki.UmlAssociation
	 * @generated
	 */
	public Adapter createUmlAssociationAdapter() {
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

} //QWikiAdapterFactory
