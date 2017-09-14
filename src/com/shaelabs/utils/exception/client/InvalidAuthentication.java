package com.shaelabs.utils.exception.client;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * @author Matt
 * @since
 */
public class InvalidAuthentication extends Exception implements IsSerializable, ExceptionProxy {

	private static final long serialVersionUID = 1L;
	
	public InvalidAuthentication() {
		
	}
	
	private InvalidAuthentication(String message) {
		super(message);
	}
	
	public static InvalidAuthentication create() {
		return new InvalidAuthentication("The user name and password you provided do not match");
	}
}
