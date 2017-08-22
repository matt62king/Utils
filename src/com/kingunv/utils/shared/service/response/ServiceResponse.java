package com.kingunv.utils.shared.service.response;

import java.io.Serializable;


/**
 * @author Matt
 * @since 0.1
 */
public class ServiceResponse<MODEL, EXCEPTION extends Exception> implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private MODEL model;
	private EXCEPTION exception;
	
	public ServiceResponse() {} // End ServiceResponse()

	/**
	 * @return the model
	 *
	 * @author Matt
	 * @since
	 * @category Getters
	 */
	public MODEL getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 *
	 * @author Matt
	 * @since
	 * @category Setters
	 */
	public void setModel(MODEL model) {
		this.model = model;
	}

	/**
	 * @return the exception
	 *
	 * @author Matt
	 * @since
	 * @category Getters
	 */
	public EXCEPTION getException() {
		return exception;
	}

	/**
	 * @param exception the exception to set
	 *
	 * @author Matt
	 * @since
	 * @category Setters
	 */
	public void setException(EXCEPTION exception) {
		this.exception = exception;
	}
	
	public boolean hasException() {
		if (exception == null) {
			return false;
		}
		return true;
	}
}
