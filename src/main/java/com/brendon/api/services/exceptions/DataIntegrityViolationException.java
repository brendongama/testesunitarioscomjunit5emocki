package com.brendon.api.services.exceptions;

public class DataIntegrityViolationException extends RuntimeException{
	private static final long serialVersionUID = 9196946629588715773L;

	public DataIntegrityViolationException(String message) {
		super(message);
	}
}
