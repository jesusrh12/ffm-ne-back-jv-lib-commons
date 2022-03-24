package com.nttdata.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.UNPROCESSABLE_ENTITY, reason = "No se puede procesar la petición.")
public class UnprocessableEntityException extends RuntimeException {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnprocessableEntityException(String message) {

        super(String.format(message));
    }
    
}
