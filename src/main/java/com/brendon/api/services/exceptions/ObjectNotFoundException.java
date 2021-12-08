package com.brendon.api.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 9196946629588715773L;

	public ObjectNotFoundException(String message) {
		super(message);
	}
}
