package com.vms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.PRECONDITION_FAILED)
public class ProcessingException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2506006272519634901L;

	public ProcessingException() {
		super();
	}

	public ProcessingException(String message) {
		super(message);
	}

}
