/**
 */
package engineering.schumann.uml.docgen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see engineering.schumann.uml.docgen.DocGenFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DocGen'"
 * @generated
 */
public interface DocGenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "docgen";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schumann.engineering/docgen/1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "docgen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DocGenPackage eINSTANCE = engineering.schumann.uml.docgen.impl.DocGenPackageImpl.init();

	/**
	 * The meta object id for the '{@link engineering.schumann.uml.docgen.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.docgen.impl.ContextImpl
	 * @see engineering.schumann.uml.docgen.impl.DocGenPackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Uml Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__UML_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Product Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__PRODUCT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Product Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__PRODUCT_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Software Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__SOFTWARE_VERSION = 3;

	/**
	 * The feature id for the '<em><b>Template UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__TEMPLATE_UUID = 4;

	/**
	 * The feature id for the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__UUID = 5;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link engineering.schumann.uml.docgen.impl.TocEntryImpl <em>Toc Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see engineering.schumann.uml.docgen.impl.TocEntryImpl
	 * @see engineering.schumann.uml.docgen.impl.DocGenPackageImpl#getTocEntry()
	 * @generated
	 */
	int TOC_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC_ENTRY__ID = 0;

	/**
	 * The feature id for the '<em><b>Display Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC_ENTRY__DISPLAY_TEXT = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC_ENTRY__PARENT = 2;

	/**
	 * The number of structural features of the '<em>Toc Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Toc Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOC_ENTRY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.docgen.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see engineering.schumann.uml.docgen.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.docgen.Context#getUmlElement <em>Uml Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uml Element</em>'.
	 * @see engineering.schumann.uml.docgen.Context#getUmlElement()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_UmlElement();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.docgen.Context#getProductName <em>Product Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Name</em>'.
	 * @see engineering.schumann.uml.docgen.Context#getProductName()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_ProductName();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.docgen.Context#getProductModel <em>Product Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Product Model</em>'.
	 * @see engineering.schumann.uml.docgen.Context#getProductModel()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_ProductModel();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.docgen.Context#getSoftwareVersion <em>Software Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Software Version</em>'.
	 * @see engineering.schumann.uml.docgen.Context#getSoftwareVersion()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_SoftwareVersion();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.docgen.Context#getTemplateUUID <em>Template UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template UUID</em>'.
	 * @see engineering.schumann.uml.docgen.Context#getTemplateUUID()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_TemplateUUID();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.docgen.Context#getUUID <em>UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>UUID</em>'.
	 * @see engineering.schumann.uml.docgen.Context#getUUID()
	 * @see #getContext()
	 * @generated
	 */
	EAttribute getContext_UUID();

	/**
	 * Returns the meta object for class '{@link engineering.schumann.uml.docgen.TocEntry <em>Toc Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Toc Entry</em>'.
	 * @see engineering.schumann.uml.docgen.TocEntry
	 * @generated
	 */
	EClass getTocEntry();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.docgen.TocEntry#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see engineering.schumann.uml.docgen.TocEntry#getId()
	 * @see #getTocEntry()
	 * @generated
	 */
	EAttribute getTocEntry_Id();

	/**
	 * Returns the meta object for the attribute '{@link engineering.schumann.uml.docgen.TocEntry#getDisplayText <em>Display Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Text</em>'.
	 * @see engineering.schumann.uml.docgen.TocEntry#getDisplayText()
	 * @see #getTocEntry()
	 * @generated
	 */
	EAttribute getTocEntry_DisplayText();

	/**
	 * Returns the meta object for the reference '{@link engineering.schumann.uml.docgen.TocEntry#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see engineering.schumann.uml.docgen.TocEntry#getParent()
	 * @see #getTocEntry()
	 * @generated
	 */
	EReference getTocEntry_Parent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DocGenFactory getDocGenFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.docgen.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.docgen.impl.ContextImpl
		 * @see engineering.schumann.uml.docgen.impl.DocGenPackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Uml Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__UML_ELEMENT = eINSTANCE.getContext_UmlElement();

		/**
		 * The meta object literal for the '<em><b>Product Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__PRODUCT_NAME = eINSTANCE.getContext_ProductName();

		/**
		 * The meta object literal for the '<em><b>Product Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__PRODUCT_MODEL = eINSTANCE.getContext_ProductModel();

		/**
		 * The meta object literal for the '<em><b>Software Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__SOFTWARE_VERSION = eINSTANCE.getContext_SoftwareVersion();

		/**
		 * The meta object literal for the '<em><b>Template UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__TEMPLATE_UUID = eINSTANCE.getContext_TemplateUUID();

		/**
		 * The meta object literal for the '<em><b>UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT__UUID = eINSTANCE.getContext_UUID();

		/**
		 * The meta object literal for the '{@link engineering.schumann.uml.docgen.impl.TocEntryImpl <em>Toc Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see engineering.schumann.uml.docgen.impl.TocEntryImpl
		 * @see engineering.schumann.uml.docgen.impl.DocGenPackageImpl#getTocEntry()
		 * @generated
		 */
		EClass TOC_ENTRY = eINSTANCE.getTocEntry();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOC_ENTRY__ID = eINSTANCE.getTocEntry_Id();

		/**
		 * The meta object literal for the '<em><b>Display Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOC_ENTRY__DISPLAY_TEXT = eINSTANCE.getTocEntry_DisplayText();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOC_ENTRY__PARENT = eINSTANCE.getTocEntry_Parent();

	}

} //DocGenPackage
