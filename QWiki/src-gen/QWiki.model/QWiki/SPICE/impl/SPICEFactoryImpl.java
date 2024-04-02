/**
 */
package QWiki.Spice.impl;

import QWiki.Spice.BasePractise;
import QWiki.Spice.GenericWorkProduct;
import QWiki.Spice.Outcome;
import QWiki.Spice.ProcessGroup;
import QWiki.Spice.ProcessReferenceModel;
import QWiki.Spice.ProcessReferenceModelDomain;
import QWiki.Spice.SPICEFactory;
import QWiki.Spice.SPICEPackage;
import QWiki.Spice.WorkProduct;
import QWiki.Spice.WorkProductType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SPICEFactoryImpl extends EFactoryImpl implements SPICEFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SPICEFactory init() {
		try {
			SPICEFactory theSPICEFactory = (SPICEFactory)EPackage.Registry.INSTANCE.getEFactory(SPICEPackage.eNS_URI);
			if (theSPICEFactory != null) {
				return theSPICEFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SPICEFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPICEFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SPICEPackage.BASE_PRACTISE: return createBasePractise();
			case SPICEPackage.PROCESS_REFERENCE_MODEL: return createProcessReferenceModel();
			case SPICEPackage.PROCESS: return createProcess();
			case SPICEPackage.PROCESS_GROUP: return createProcessGroup();
			case SPICEPackage.OUTCOME: return createOutcome();
			case SPICEPackage.WORK_PRODUCT: return createWorkProduct();
			case SPICEPackage.GENERIC_WORK_PRODUCT: return createGenericWorkProduct();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SPICEPackage.PROCESS_REFERENCE_MODEL_DOMAIN:
				return createProcessReferenceModelDomainFromString(eDataType, initialValue);
			case SPICEPackage.WORK_PRODUCT_TYPE:
				return createWorkProductTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SPICEPackage.PROCESS_REFERENCE_MODEL_DOMAIN:
				return convertProcessReferenceModelDomainToString(eDataType, instanceValue);
			case SPICEPackage.WORK_PRODUCT_TYPE:
				return convertWorkProductTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasePractise createBasePractise() {
		BasePractiseImpl basePractise = new BasePractiseImpl();
		return basePractise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessReferenceModel createProcessReferenceModel() {
		ProcessReferenceModelImpl processReferenceModel = new ProcessReferenceModelImpl();
		return processReferenceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QWiki.Spice.Process createProcess() {
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessGroup createProcessGroup() {
		ProcessGroupImpl processGroup = new ProcessGroupImpl();
		return processGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Outcome createOutcome() {
		OutcomeImpl outcome = new OutcomeImpl();
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkProduct createWorkProduct() {
		WorkProductImpl workProduct = new WorkProductImpl();
		return workProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericWorkProduct createGenericWorkProduct() {
		GenericWorkProductImpl genericWorkProduct = new GenericWorkProductImpl();
		return genericWorkProduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessReferenceModelDomain createProcessReferenceModelDomainFromString(EDataType eDataType, String initialValue) {
		ProcessReferenceModelDomain result = ProcessReferenceModelDomain.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessReferenceModelDomainToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkProductType createWorkProductTypeFromString(EDataType eDataType, String initialValue) {
		WorkProductType result = WorkProductType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkProductTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SPICEPackage getSPICEPackage() {
		return (SPICEPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SPICEPackage getPackage() {
		return SPICEPackage.eINSTANCE;
	}

} //SPICEFactoryImpl
