package com.shaelabs.utils.shared.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Matt
 * @since
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public static class UserKeys {
		public static String STORE_NAME = 	"User";
		public static String EMAIL = 		"Email";
		public static String PASSWORD = 	"Password";
		public static String FIRST_NAME =	"FirstName";
		public static String LAST_NAME =	"LastName";
		public static String JOIN_DATE =	"JoinDate";
		public static String VERIFIED =		"Verified";
	}
	
	private String key;
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private Date joinDate;
	private boolean verified;
	
	public User() {}
	
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
	 * @return the email
	 *
	 * @author Matt
	 * @since
	 * @category Getters
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 *
	 * @author Matt
	 * @since
	 * @category Setters
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 *
	 * @author Matt
	 * @since
	 * @category Getters
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 *
	 * @author Matt
	 * @since
	 * @category Setters
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the firstName
	 *
	 * @author Matt
	 * @since
	 * @category Getters
	 */
	public String getName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 *
	 * @author Matt
	 * @since
	 * @category Setters
	 */
	public void setName(String name) {
		this.firstName = name;
	}
	/**
	 * @return the verified
	 *
	 * @author Matt
	 * @since
	 * @category Getters
	 */
	public boolean isVerified() {
		return verified;
	}
	/**
	 * @param verified the verified to set
	 *
	 * @author Matt
	 * @since
	 * @category Setters
	 */
	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	/**
	 * @return the lastName
	 *
	 * @author Matt
	 * @since
	 * @category Getters
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 *
	 * @author Matt
	 * @since
	 * @category Setters
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * @return the joinDate
	 *
	 * @author Matt
	 * @since
	 * @category Getters
	 */
	public Date getJoinDate() {
		return joinDate;
	}

	/**
	 * @param joinDate the joinDate to set
	 *
	 * @author Matt
	 * @since
	 * @category Setters
	 */
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Key: " + key + "\n");
		sb.append("E-mail: " + email);
		
		return sb.toString();
	} // End toString()

}
