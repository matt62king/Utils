package com.shaelabs.utils.shared.bean;

import java.io.Serializable;

import com.shaelabs.utils.shared.bean.types.AddressType;


/**
 * @author Matt
 * @since 0.1
 */
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;

	public static class AddressKeys {
		public static String STORE_NAME = 	"Address";
		public static String USER_KEY = 	"userKey";
		public static String ADDRESS =		"address";
		public static String CITY =			"city";
		public static String STATE = 		"state";
		public static String ZIP_CODE =		"zipCode";
		public static String TYPE =			"type";
	}
	
	private String key;
	private String userKey;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private AddressType type;
	
	public Address() {}

	/**
	 * @return the key
	 *
	 * @author Matt
	 * @since
	 * @category Getters
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key the key to set
	 *
	 * @author Matt
	 * @since
	 * @category Setters
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * @return the userKey
	 *
	 * @author Matt
	 * @since
	 * @category Getters
	 */
	public String getUserKey() {
		return userKey;
	}

	/**
	 * @param userKey the userKey to set
	 *
	 * @author Matt
	 * @since
	 * @category Setters
	 */
	public void setUserKey(String userKey) {
		this.userKey = userKey;
	}

	/**
	 * @return the address
	 *
	 * @author Matt
	 * @since
	 * @category Getters
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 *
	 * @author Matt
	 * @since
	 * @category Setters
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 *
	 * @author Matt
	 * @since
	 * @category Getters
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 *
	 * @author Matt
	 * @since
	 * @category Setters
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 *
	 * @author Matt
	 * @since
	 * @category Getters
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 *
	 * @author Matt
	 * @since
	 * @category Setters
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zipCode
	 *
	 * @author Matt
	 * @since
	 * @category Getters
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode the zipCode to set
	 *
	 * @author Matt
	 * @since
	 * @category Setters
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @return the type
	 *
	 * @author Matt
	 * @since
	 * @category Getters
	 */
	public AddressType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 *
	 * @author Matt
	 * @since
	 * @category Setters
	 */
	public void setType(AddressType type) {
		this.type = type;
	}
	
	
}
