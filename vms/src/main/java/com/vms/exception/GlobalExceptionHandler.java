package com.vms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.vms.model.ErrorMessage;

@ControllerAdvice
public class GlobalExceptionHandler {
	private final static String STATUS = "fail";

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> resourceNotFoundException(ResourceNotFoundException ex) {
		ErrorMessage errorMessage = new ErrorMessage(STATUS, ex.getMessage());
		return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(ProcessingException.class)
	public ResponseEntity<?> processingException(ProcessingException ex) {
		ErrorMessage errorMessage = new ErrorMessage(STATUS, ex.getMessage());
		return new ResponseEntity<>(errorMessage, HttpStatus.PRECONDITION_FAILED);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> globleExcpetionHandler(Exception ex) {
		ErrorMessage errorMessage = new ErrorMessage(STATUS, ex.getMessage());
		return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
