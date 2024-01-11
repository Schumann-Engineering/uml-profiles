/**
 */
package engineering.schumann.uml.profile.csmn;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Interface Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see engineering.schumann.uml.profile.csmn.CSMNPackage#getInterfaceType()
 * @model
 * @generated
 */
public enum InterfaceType implements Enumerator {
	/**
	 * The '<em><b>Unspecified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	UNSPECIFIED(0, "Unspecified", "Unspecified"),

	/**
	 * The '<em><b>Air By Fan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIR_BY_FAN_VALUE
	 * @generated
	 * @ordered
	 */
	AIR_BY_FAN(1, "AirByFan", "AirByFan"),

	/**
	 * The '<em><b>Air By Turbine</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIR_BY_TURBINE_VALUE
	 * @generated
	 * @ordered
	 */
	AIR_BY_TURBINE(2, "AirByTurbine", "AirByTurbine"),

	/**
	 * The '<em><b>Alarm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALARM_VALUE
	 * @generated
	 * @ordered
	 */
	ALARM(3, "Alarm", "Alarm"),

	/**
	 * The '<em><b>Bluetooth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUETOOTH_VALUE
	 * @generated
	 * @ordered
	 */
	BLUETOOTH(4, "Bluetooth", "Bluetooth"),

	/**
	 * The '<em><b>Cellular</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CELLULAR_VALUE
	 * @generated
	 * @ordered
	 */
	CELLULAR(5, "Cellular", "Cellular"),

	/**
	 * The '<em><b>Cellular2 G</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CELLULAR2_G_VALUE
	 * @generated
	 * @ordered
	 */
	CELLULAR2_G(6, "Cellular2G", "Cellular2G"),

	/**
	 * The '<em><b>Cellular3 G</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CELLULAR3_G_VALUE
	 * @generated
	 * @ordered
	 */
	CELLULAR3_G(7, "Cellular3G", "Cellular3G"),

	/**
	 * The '<em><b>Cellular4 G</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CELLULAR4_G_VALUE
	 * @generated
	 * @ordered
	 */
	CELLULAR4_G(8, "Cellular4G", "Cellular4G"),

	/**
	 * The '<em><b>Cellular5 G</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CELLULAR5_G_VALUE
	 * @generated
	 * @ordered
	 */
	CELLULAR5_G(9, "Cellular5G", "Cellular5G"),

	/**
	 * The '<em><b>Display</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPLAY_VALUE
	 * @generated
	 * @ordered
	 */
	DISPLAY(10, "Display", "Display"),

	/**
	 * The '<em><b>Display Small</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPLAY_SMALL_VALUE
	 * @generated
	 * @ordered
	 */
	DISPLAY_SMALL(11, "DisplaySmall", "DisplaySmall"),

	/**
	 * The '<em><b>Ethernet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETHERNET_VALUE
	 * @generated
	 * @ordered
	 */
	ETHERNET(12, "Ethernet", "Ethernet"),

	/**
	 * The '<em><b>Hardwired</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARDWIRED_VALUE
	 * @generated
	 * @ordered
	 */
	HARDWIRED(13, "Hardwired", "Hardwired"),

	/**
	 * The '<em><b>Hdmi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HDMI_VALUE
	 * @generated
	 * @ordered
	 */
	HDMI(14, "Hdmi", "Hdmi"),

	/**
	 * The '<em><b>Knob</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNOB_VALUE
	 * @generated
	 * @ordered
	 */
	KNOB(15, "Knob", "Knob"),

	/**
	 * The '<em><b>Nfc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NFC_VALUE
	 * @generated
	 * @ordered
	 */
	NFC(16, "Nfc", "Nfc"),

	/**
	 * The '<em><b>Optical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTICAL_VALUE
	 * @generated
	 * @ordered
	 */
	OPTICAL(17, "Optical", "Optical"),

	/**
	 * The '<em><b>Proprietary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPRIETARY_VALUE
	 * @generated
	 * @ordered
	 */
	PROPRIETARY(18, "Proprietary", "Proprietary"),

	/**
	 * The '<em><b>Power Battery</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_BATTERY_VALUE
	 * @generated
	 * @ordered
	 */
	POWER_BATTERY(19, "PowerBattery", "PowerBattery"),

	/**
	 * The '<em><b>Power Plug</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_PLUG_VALUE
	 * @generated
	 * @ordered
	 */
	POWER_PLUG(20, "PowerPlug", "PowerPlug"),

	/**
	 * The '<em><b>Power Socket</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_SOCKET_VALUE
	 * @generated
	 * @ordered
	 */
	POWER_SOCKET(21, "PowerSocket", "PowerSocket"),

	/**
	 * The '<em><b>Sd Card</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SD_CARD_VALUE
	 * @generated
	 * @ordered
	 */
	SD_CARD(22, "SdCard", "SdCard"),

	/**
	 * The '<em><b>Serial</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERIAL_VALUE
	 * @generated
	 * @ordered
	 */
	SERIAL(23, "Serial", "Serial"),

	/**
	 * The '<em><b>Speaker</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPEAKER_VALUE
	 * @generated
	 * @ordered
	 */
	SPEAKER(24, "Speaker", "Speaker"),

	/**
	 * The '<em><b>Touch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOUCH_VALUE
	 * @generated
	 * @ordered
	 */
	TOUCH(25, "Touch", "Touch"),

	/**
	 * The '<em><b>Usb</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USB_VALUE
	 * @generated
	 * @ordered
	 */
	USB(26, "Usb", "Usb"),

	/**
	 * The '<em><b>Usb A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USB_A_VALUE
	 * @generated
	 * @ordered
	 */
	USB_A(27, "UsbA", "UsbA"),

	/**
	 * The '<em><b>Usb C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USB_C_VALUE
	 * @generated
	 * @ordered
	 */
	USB_C(28, "UsbC", "UsbC"),

	/**
	 * The '<em><b>Usb Flash</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USB_FLASH_VALUE
	 * @generated
	 * @ordered
	 */
	USB_FLASH(29, "UsbFlash", "UsbFlash"),

	/**
	 * The '<em><b>Wifi Access Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIFI_ACCESS_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	WIFI_ACCESS_POINT(30, "WifiAccessPoint", "WifiAccessPoint"),

	/**
	 * The '<em><b>Wifi Client</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIFI_CLIENT_VALUE
	 * @generated
	 * @ordered
	 */
	WIFI_CLIENT(31, "WifiClient", "WifiClient"),

	/**
	 * The '<em><b>Zigbee</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZIGBEE_VALUE
	 * @generated
	 * @ordered
	 */
	ZIGBEE(32, "Zigbee", "Zigbee");

	/**
	 * The '<em><b>Unspecified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSPECIFIED
	 * @model name="Unspecified"
	 * @generated
	 * @ordered
	 */
	public static final int UNSPECIFIED_VALUE = 0;

	/**
	 * The '<em><b>Air By Fan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIR_BY_FAN
	 * @model name="AirByFan"
	 * @generated
	 * @ordered
	 */
	public static final int AIR_BY_FAN_VALUE = 1;

	/**
	 * The '<em><b>Air By Turbine</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AIR_BY_TURBINE
	 * @model name="AirByTurbine"
	 * @generated
	 * @ordered
	 */
	public static final int AIR_BY_TURBINE_VALUE = 2;

	/**
	 * The '<em><b>Alarm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALARM
	 * @model name="Alarm"
	 * @generated
	 * @ordered
	 */
	public static final int ALARM_VALUE = 3;

	/**
	 * The '<em><b>Bluetooth</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLUETOOTH
	 * @model name="Bluetooth"
	 * @generated
	 * @ordered
	 */
	public static final int BLUETOOTH_VALUE = 4;

	/**
	 * The '<em><b>Cellular</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CELLULAR
	 * @model name="Cellular"
	 * @generated
	 * @ordered
	 */
	public static final int CELLULAR_VALUE = 5;

	/**
	 * The '<em><b>Cellular2 G</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CELLULAR2_G
	 * @model name="Cellular2G"
	 * @generated
	 * @ordered
	 */
	public static final int CELLULAR2_G_VALUE = 6;

	/**
	 * The '<em><b>Cellular3 G</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CELLULAR3_G
	 * @model name="Cellular3G"
	 * @generated
	 * @ordered
	 */
	public static final int CELLULAR3_G_VALUE = 7;

	/**
	 * The '<em><b>Cellular4 G</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CELLULAR4_G
	 * @model name="Cellular4G"
	 * @generated
	 * @ordered
	 */
	public static final int CELLULAR4_G_VALUE = 8;

	/**
	 * The '<em><b>Cellular5 G</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CELLULAR5_G
	 * @model name="Cellular5G"
	 * @generated
	 * @ordered
	 */
	public static final int CELLULAR5_G_VALUE = 9;

	/**
	 * The '<em><b>Display</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPLAY
	 * @model name="Display"
	 * @generated
	 * @ordered
	 */
	public static final int DISPLAY_VALUE = 10;

	/**
	 * The '<em><b>Display Small</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPLAY_SMALL
	 * @model name="DisplaySmall"
	 * @generated
	 * @ordered
	 */
	public static final int DISPLAY_SMALL_VALUE = 11;

	/**
	 * The '<em><b>Ethernet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETHERNET
	 * @model name="Ethernet"
	 * @generated
	 * @ordered
	 */
	public static final int ETHERNET_VALUE = 12;

	/**
	 * The '<em><b>Hardwired</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARDWIRED
	 * @model name="Hardwired"
	 * @generated
	 * @ordered
	 */
	public static final int HARDWIRED_VALUE = 13;

	/**
	 * The '<em><b>Hdmi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HDMI
	 * @model name="Hdmi"
	 * @generated
	 * @ordered
	 */
	public static final int HDMI_VALUE = 14;

	/**
	 * The '<em><b>Knob</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KNOB
	 * @model name="Knob"
	 * @generated
	 * @ordered
	 */
	public static final int KNOB_VALUE = 15;

	/**
	 * The '<em><b>Nfc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NFC
	 * @model name="Nfc"
	 * @generated
	 * @ordered
	 */
	public static final int NFC_VALUE = 16;

	/**
	 * The '<em><b>Optical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTICAL
	 * @model name="Optical"
	 * @generated
	 * @ordered
	 */
	public static final int OPTICAL_VALUE = 17;

	/**
	 * The '<em><b>Proprietary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPRIETARY
	 * @model name="Proprietary"
	 * @generated
	 * @ordered
	 */
	public static final int PROPRIETARY_VALUE = 18;

	/**
	 * The '<em><b>Power Battery</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_BATTERY
	 * @model name="PowerBattery"
	 * @generated
	 * @ordered
	 */
	public static final int POWER_BATTERY_VALUE = 19;

	/**
	 * The '<em><b>Power Plug</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_PLUG
	 * @model name="PowerPlug"
	 * @generated
	 * @ordered
	 */
	public static final int POWER_PLUG_VALUE = 20;

	/**
	 * The '<em><b>Power Socket</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POWER_SOCKET
	 * @model name="PowerSocket"
	 * @generated
	 * @ordered
	 */
	public static final int POWER_SOCKET_VALUE = 21;

	/**
	 * The '<em><b>Sd Card</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SD_CARD
	 * @model name="SdCard"
	 * @generated
	 * @ordered
	 */
	public static final int SD_CARD_VALUE = 22;

	/**
	 * The '<em><b>Serial</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERIAL
	 * @model name="Serial"
	 * @generated
	 * @ordered
	 */
	public static final int SERIAL_VALUE = 23;

	/**
	 * The '<em><b>Speaker</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPEAKER
	 * @model name="Speaker"
	 * @generated
	 * @ordered
	 */
	public static final int SPEAKER_VALUE = 24;

	/**
	 * The '<em><b>Touch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOUCH
	 * @model name="Touch"
	 * @generated
	 * @ordered
	 */
	public static final int TOUCH_VALUE = 25;

	/**
	 * The '<em><b>Usb</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USB
	 * @model name="Usb"
	 * @generated
	 * @ordered
	 */
	public static final int USB_VALUE = 26;

	/**
	 * The '<em><b>Usb A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USB_A
	 * @model name="UsbA"
	 * @generated
	 * @ordered
	 */
	public static final int USB_A_VALUE = 27;

	/**
	 * The '<em><b>Usb C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USB_C
	 * @model name="UsbC"
	 * @generated
	 * @ordered
	 */
	public static final int USB_C_VALUE = 28;

	/**
	 * The '<em><b>Usb Flash</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USB_FLASH
	 * @model name="UsbFlash"
	 * @generated
	 * @ordered
	 */
	public static final int USB_FLASH_VALUE = 29;

	/**
	 * The '<em><b>Wifi Access Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIFI_ACCESS_POINT
	 * @model name="WifiAccessPoint"
	 * @generated
	 * @ordered
	 */
	public static final int WIFI_ACCESS_POINT_VALUE = 30;

	/**
	 * The '<em><b>Wifi Client</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIFI_CLIENT
	 * @model name="WifiClient"
	 * @generated
	 * @ordered
	 */
	public static final int WIFI_CLIENT_VALUE = 31;

	/**
	 * The '<em><b>Zigbee</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZIGBEE
	 * @model name="Zigbee"
	 * @generated
	 * @ordered
	 */
	public static final int ZIGBEE_VALUE = 32;

	/**
	 * An array of all the '<em><b>Interface Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InterfaceType[] VALUES_ARRAY =
		new InterfaceType[] {
			UNSPECIFIED,
			AIR_BY_FAN,
			AIR_BY_TURBINE,
			ALARM,
			BLUETOOTH,
			CELLULAR,
			CELLULAR2_G,
			CELLULAR3_G,
			CELLULAR4_G,
			CELLULAR5_G,
			DISPLAY,
			DISPLAY_SMALL,
			ETHERNET,
			HARDWIRED,
			HDMI,
			KNOB,
			NFC,
			OPTICAL,
			PROPRIETARY,
			POWER_BATTERY,
			POWER_PLUG,
			POWER_SOCKET,
			SD_CARD,
			SERIAL,
			SPEAKER,
			TOUCH,
			USB,
			USB_A,
			USB_C,
			USB_FLASH,
			WIFI_ACCESS_POINT,
			WIFI_CLIENT,
			ZIGBEE,
		};

	/**
	 * A public read-only list of all the '<em><b>Interface Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InterfaceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Interface Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InterfaceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InterfaceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interface Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InterfaceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InterfaceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interface Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static InterfaceType get(int value) {
		switch (value) {
			case UNSPECIFIED_VALUE: return UNSPECIFIED;
			case AIR_BY_FAN_VALUE: return AIR_BY_FAN;
			case AIR_BY_TURBINE_VALUE: return AIR_BY_TURBINE;
			case ALARM_VALUE: return ALARM;
			case BLUETOOTH_VALUE: return BLUETOOTH;
			case CELLULAR_VALUE: return CELLULAR;
			case CELLULAR2_G_VALUE: return CELLULAR2_G;
			case CELLULAR3_G_VALUE: return CELLULAR3_G;
			case CELLULAR4_G_VALUE: return CELLULAR4_G;
			case CELLULAR5_G_VALUE: return CELLULAR5_G;
			case DISPLAY_VALUE: return DISPLAY;
			case DISPLAY_SMALL_VALUE: return DISPLAY_SMALL;
			case ETHERNET_VALUE: return ETHERNET;
			case HARDWIRED_VALUE: return HARDWIRED;
			case HDMI_VALUE: return HDMI;
			case KNOB_VALUE: return KNOB;
			case NFC_VALUE: return NFC;
			case OPTICAL_VALUE: return OPTICAL;
			case PROPRIETARY_VALUE: return PROPRIETARY;
			case POWER_BATTERY_VALUE: return POWER_BATTERY;
			case POWER_PLUG_VALUE: return POWER_PLUG;
			case POWER_SOCKET_VALUE: return POWER_SOCKET;
			case SD_CARD_VALUE: return SD_CARD;
			case SERIAL_VALUE: return SERIAL;
			case SPEAKER_VALUE: return SPEAKER;
			case TOUCH_VALUE: return TOUCH;
			case USB_VALUE: return USB;
			case USB_A_VALUE: return USB_A;
			case USB_C_VALUE: return USB_C;
			case USB_FLASH_VALUE: return USB_FLASH;
			case WIFI_ACCESS_POINT_VALUE: return WIFI_ACCESS_POINT;
			case WIFI_CLIENT_VALUE: return WIFI_CLIENT;
			case ZIGBEE_VALUE: return ZIGBEE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InterfaceType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //InterfaceType
