/**
 */
package CSMN.PrimitiveTypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see CSMN.PrimitiveTypes.PrimitiveTypesFactory
 * @model kind="package"
 * @generated
 */
public interface PrimitiveTypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PrimitiveTypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schumann-engineering/csmn/1/PrimitiveTypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CSMN.PrimitiveTypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PrimitiveTypesPackage eINSTANCE = CSMN.PrimitiveTypes.impl.PrimitiveTypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link CSMN.PrimitiveTypes.impl.Size_TImpl <em>Size T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.PrimitiveTypes.impl.Size_TImpl
	 * @see CSMN.PrimitiveTypes.impl.PrimitiveTypesPackageImpl#getSize_T()
	 * @generated
	 */
	int SIZE_T = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_T__SIZE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_T__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Size T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_T_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Size T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_T_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSMN.PrimitiveTypes.impl.BandwidthImpl <em>Bandwidth</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.PrimitiveTypes.impl.BandwidthImpl
	 * @see CSMN.PrimitiveTypes.impl.PrimitiveTypesPackageImpl#getBandwidth()
	 * @generated
	 */
	int BANDWIDTH = 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH__SIZE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Bandwidth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bandwidth</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANDWIDTH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CSMN.PrimitiveTypes.SizeUnitOfMeasure <em>Size Unit Of Measure</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.PrimitiveTypes.SizeUnitOfMeasure
	 * @see CSMN.PrimitiveTypes.impl.PrimitiveTypesPackageImpl#getSizeUnitOfMeasure()
	 * @generated
	 */
	int SIZE_UNIT_OF_MEASURE = 2;

	/**
	 * The meta object id for the '{@link CSMN.PrimitiveTypes.SpeedUnitOfMeasurement <em>Speed Unit Of Measurement</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CSMN.PrimitiveTypes.SpeedUnitOfMeasurement
	 * @see CSMN.PrimitiveTypes.impl.PrimitiveTypesPackageImpl#getSpeedUnitOfMeasurement()
	 * @generated
	 */
	int SPEED_UNIT_OF_MEASUREMENT = 3;


	/**
	 * Returns the meta object for class '{@link CSMN.PrimitiveTypes.Size_T <em>Size T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Size T</em>'.
	 * @see CSMN.PrimitiveTypes.Size_T
	 * @generated
	 */
	EClass getSize_T();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.PrimitiveTypes.Size_T#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see CSMN.PrimitiveTypes.Size_T#getSize()
	 * @see #getSize_T()
	 * @generated
	 */
	EAttribute getSize_T_Size();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.PrimitiveTypes.Size_T#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see CSMN.PrimitiveTypes.Size_T#getUnit()
	 * @see #getSize_T()
	 * @generated
	 */
	EAttribute getSize_T_Unit();

	/**
	 * Returns the meta object for class '{@link CSMN.PrimitiveTypes.Bandwidth <em>Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bandwidth</em>'.
	 * @see CSMN.PrimitiveTypes.Bandwidth
	 * @generated
	 */
	EClass getBandwidth();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.PrimitiveTypes.Bandwidth#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see CSMN.PrimitiveTypes.Bandwidth#getSize()
	 * @see #getBandwidth()
	 * @generated
	 */
	EAttribute getBandwidth_Size();

	/**
	 * Returns the meta object for the attribute '{@link CSMN.PrimitiveTypes.Bandwidth#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see CSMN.PrimitiveTypes.Bandwidth#getUnit()
	 * @see #getBandwidth()
	 * @generated
	 */
	EAttribute getBandwidth_Unit();

	/**
	 * Returns the meta object for enum '{@link CSMN.PrimitiveTypes.SizeUnitOfMeasure <em>Size Unit Of Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Size Unit Of Measure</em>'.
	 * @see CSMN.PrimitiveTypes.SizeUnitOfMeasure
	 * @generated
	 */
	EEnum getSizeUnitOfMeasure();

	/**
	 * Returns the meta object for enum '{@link CSMN.PrimitiveTypes.SpeedUnitOfMeasurement <em>Speed Unit Of Measurement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Speed Unit Of Measurement</em>'.
	 * @see CSMN.PrimitiveTypes.SpeedUnitOfMeasurement
	 * @generated
	 */
	EEnum getSpeedUnitOfMeasurement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PrimitiveTypesFactory getPrimitiveTypesFactory();

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
		 * The meta object literal for the '{@link CSMN.PrimitiveTypes.impl.Size_TImpl <em>Size T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.PrimitiveTypes.impl.Size_TImpl
		 * @see CSMN.PrimitiveTypes.impl.PrimitiveTypesPackageImpl#getSize_T()
		 * @generated
		 */
		EClass SIZE_T = eINSTANCE.getSize_T();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE_T__SIZE = eINSTANCE.getSize_T_Size();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE_T__UNIT = eINSTANCE.getSize_T_Unit();

		/**
		 * The meta object literal for the '{@link CSMN.PrimitiveTypes.impl.BandwidthImpl <em>Bandwidth</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.PrimitiveTypes.impl.BandwidthImpl
		 * @see CSMN.PrimitiveTypes.impl.PrimitiveTypesPackageImpl#getBandwidth()
		 * @generated
		 */
		EClass BANDWIDTH = eINSTANCE.getBandwidth();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANDWIDTH__SIZE = eINSTANCE.getBandwidth_Size();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANDWIDTH__UNIT = eINSTANCE.getBandwidth_Unit();

		/**
		 * The meta object literal for the '{@link CSMN.PrimitiveTypes.SizeUnitOfMeasure <em>Size Unit Of Measure</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.PrimitiveTypes.SizeUnitOfMeasure
		 * @see CSMN.PrimitiveTypes.impl.PrimitiveTypesPackageImpl#getSizeUnitOfMeasure()
		 * @generated
		 */
		EEnum SIZE_UNIT_OF_MEASURE = eINSTANCE.getSizeUnitOfMeasure();

		/**
		 * The meta object literal for the '{@link CSMN.PrimitiveTypes.SpeedUnitOfMeasurement <em>Speed Unit Of Measurement</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CSMN.PrimitiveTypes.SpeedUnitOfMeasurement
		 * @see CSMN.PrimitiveTypes.impl.PrimitiveTypesPackageImpl#getSpeedUnitOfMeasurement()
		 * @generated
		 */
		EEnum SPEED_UNIT_OF_MEASUREMENT = eINSTANCE.getSpeedUnitOfMeasurement();

	}

} //PrimitiveTypesPackage
