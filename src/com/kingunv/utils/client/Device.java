package com.kingunv.utils.client;

import com.google.gwt.user.client.Window;
import com.kingunv.utils.client.types.DeviceType;

/**
 * Methods for accessing device types
 * 
 * @author Matt
 * @since 0.1
 */
public class Device {
	
	public static DeviceType TYPE = type();
	
	/**
	 * Returns the device type based on screen
	 * width.
	 * @return DeviceType 
	 *
	 * @author Matt
	 * @since 0.1
	 * @category Types
	 */
	private static DeviceType type() {
		if (Window.getClientWidth() < 721) {
			return DeviceType.PHONE;
		}
		else if (Window.getClientWidth() > 959) {
			return DeviceType.DESKTOP;
		}
		
		return DeviceType.TABLET;
	} // End type()
}
