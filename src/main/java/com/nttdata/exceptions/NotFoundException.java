package com.nttdata.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Registro no encontrado.")
public class NotFoundException extends RuntimeException {
	
    public NotFoundException()
    {
        super();
    }

    public NotFoundException( String message )
    {
        super( message );
    }
    
}