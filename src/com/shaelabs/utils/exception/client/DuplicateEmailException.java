package com.shaelabs.utils.exception.client;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * @author Matt
 * @since
 */
public class DuplicateEmailException extends Exception implements IsSerializable, ExceptionProxy {

	private static final long serialVersionUID = 1L;
	
	private static String messageTemp = "The email {s} already matches a user in our database.";
	
	public DuplicateEmailException() {}
	
	private DuplicateEmailException(String message) {
		super(message);
	}
	
	public static DuplicateEmailException exceptionWithEmail(String email) {
		String message = messageTemp.replaceFirst("{s}", email);
		return new DuplicateEmailException(message);
	}
}
