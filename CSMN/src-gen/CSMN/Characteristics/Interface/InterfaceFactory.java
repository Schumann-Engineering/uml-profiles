/**
 */
package CSMN.Characteristics.Interface;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CSMN.Characteristics.Interface.InterfacePackage
 * @generated
 */
public interface InterfaceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InterfaceFactory eINSTANCE = CSMN.Characteristics.Interface.impl.InterfaceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Characteristic</em>'.
	 * @generated
	 */
	InterfaceCharacteristic createInterfaceCharacteristic();

	/**
	 * Returns a new object of class '<em>Bandwidth Characteristics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bandwidth Characteristics</em>'.
	 * @generated
	 */
	BandwidthCharacteristics createBandwidthCharacteristics();

	/**
	 * Returns a new object of class '<em>Firewall Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Firewall Characteristic</em>'.
	 * @generated
	 */
	FirewallCharacteristic createFirewallCharacteristic();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InterfacePackage getInterfacePackage();

} //InterfaceFactory
