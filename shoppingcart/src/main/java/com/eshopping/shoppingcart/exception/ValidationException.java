package com.eshopping.shoppingcart.exception;

/**
 * custom validation exception
 * @author suresh
 *
 */
@SuppressWarnings("serial")
public class ValidationException extends RuntimeException {
	
	public ValidationException(){};
	
	public ValidationException(String message) {
		super(message);
	}
}
