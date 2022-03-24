package com.nttdata.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.fasterxml.jackson.core.JsonProcessingException;


public class ExceptionHelper extends ResponseEntityExceptionHandler{
	
	
	private static final String TIME_STAMP = "timestamp";
	private static final String STATUS = "status";
	private static final String ERROR = "error";
	private static final String MESSAGE = "message";
	private static final String TRACE = "trace detail";
	
	
	protected Map<String, Object> body = new LinkedHashMap<>();
	
//    @ExceptionHandler(value = { com.nttdata.exceptions.NotFoundException.class })
//    protected ResponseEntity<Object> handleNotFoundException(com.nttdata.exceptions.NotFoundException ex) {
//    	 body.put(TIME_STAMP, LocalDateTime.now());
//    	 body.put(STATUS, HttpStatus.NOT_FOUND);
//    	 body.put(ERROR, "No data found");
//         body.put(MESSAGE, ex.getMessage() );
//         body.put(TRACE,  Arrays.toString(ex.getStackTrace()));
//    	return new ResponseEntity<>(body ,HttpStatus.NOT_FOUND);
//
//    }
	
    @ExceptionHandler(value = { NullPointerException.class })
    protected ResponseEntity<Object> handleNullPointerException(NullPointerException ex) {
   	 	body.put(TIME_STAMP, LocalDateTime.now());
   	 	body.put(STATUS, HttpStatus.INTERNAL_SERVER_ERROR);
   	 	body.put(ERROR, "Null pointer exception");
        body.put(MESSAGE, ex.getMessage() );
        body.put(TRACE,   Arrays.toString(ex.getStackTrace()));
    	return new ResponseEntity<Object>( body, HttpStatus.INTERNAL_SERVER_ERROR);

    }
    @ExceptionHandler(value = { JsonProcessingException.class })
    protected ResponseEntity<Object> handleJsonProcessingException(JsonProcessingException ex) {
   	 	body.put(TIME_STAMP, LocalDateTime.now());
   	 	body.put(STATUS, HttpStatus.INTERNAL_SERVER_ERROR);
   	 	body.put(ERROR, "Data conversion error");
        body.put(MESSAGE, ex.getMessage() );
        body.put(TRACE,  Arrays.toString(ex.getStackTrace()));
    	return new ResponseEntity<Object>( body , HttpStatus.INTERNAL_SERVER_ERROR);

    }
    
    @ExceptionHandler(value = { BadRequestException.class })
    protected ResponseEntity<Object> handleBadRequestException(BadRequestException ex) {
   	 	body.put(TIME_STAMP, LocalDateTime.now());
   	 	body.put(STATUS, HttpStatus.BAD_REQUEST);
   	 	body.put(ERROR, "Data conversion error");
        body.put(MESSAGE, ex.getMessage() );
        body.put(TRACE,  Arrays.toString(ex.getStackTrace()));
    	return new ResponseEntity<Object>( body , HttpStatus.BAD_REQUEST);

    }
    
    @ExceptionHandler(value = { UnprocessableEntityException.class })
    protected ResponseEntity<Object> handleUnprocessableEntityException(UnprocessableEntityException ex) {
   	 	body.put(TIME_STAMP, LocalDateTime.now());
   	 	body.put(STATUS, HttpStatus.BAD_REQUEST);
   	 	body.put(ERROR, "Input data error");
        body.put(MESSAGE, ex.getMessage() );
        body.put(TRACE,   Arrays.toString(ex.getStackTrace()));
    	return new ResponseEntity<Object>( body , HttpStatus.BAD_REQUEST);

    }
    
    @ExceptionHandler(value = { HttpClientErrorException.class })
    protected ResponseEntity<Object> handleHttpClientErrorException(HttpClientErrorException ex) {
   	 	body.put(TIME_STAMP, LocalDateTime.now());
   	 	body.put(STATUS, HttpStatus.NOT_FOUND);
   	 	body.put(ERROR, "Mistake towards the legacy");
        body.put(MESSAGE, ex.getMessage() );
        body.put(TRACE,   Arrays.toString(ex.getStackTrace()));
    	return new ResponseEntity<Object>( body , HttpStatus.NOT_FOUND);

    }
    
    @ExceptionHandler(value = { ResourceAccessException.class })
    protected ResponseEntity<Object> handleResourceAccessException(ResourceAccessException ex) {
   	 	body.put(TIME_STAMP, LocalDateTime.now());
   	 	body.put(STATUS, HttpStatus.INTERNAL_SERVER_ERROR);
   	 	body.put(ERROR, "I/O error");
        body.put(MESSAGE, ex.getMessage() );
        body.put(TRACE,  Arrays.toString(ex.getStackTrace()));
    	return new ResponseEntity<Object>( body , HttpStatus.INTERNAL_SERVER_ERROR);

    }
    
    
    @ExceptionHandler(value = { FileNotFoundException.class })
    protected ResponseEntity<Object> handleFileNotFoundException(FileNotFoundException ex) {
   	 	body.put(TIME_STAMP, LocalDateTime.now());
   	 	body.put(STATUS, HttpStatus.NOT_FOUND);
   	 	body.put(ERROR, "file not exist on disk fails ");
        body.put(MESSAGE, ex.getMessage() );
        body.put(TRACE,   Arrays.toString(ex.getStackTrace()));
    	return new ResponseEntity<Object>( body , HttpStatus.NOT_FOUND);

    }
    
    @ExceptionHandler(value = { IOException.class })
    protected ResponseEntity<Object> handleIOException(IOException ex) {
   	 	body.put(TIME_STAMP, LocalDateTime.now());
   	 	body.put(STATUS, HttpStatus.NOT_FOUND);
   	 	body.put(ERROR, "Exceptions produced by failed or interrupted I/O operations");
        body.put(MESSAGE, ex.getMessage() );
        body.put(TRACE,   Arrays.toString(ex.getStackTrace()));
    	return new ResponseEntity<Object>( body , HttpStatus.NOT_FOUND);

    }
    
    @ExceptionHandler(value = { InterruptedException.class })
    protected ResponseEntity<Object> handleInterruptedException(InterruptedException ex) {
   	 	body.put(TIME_STAMP, LocalDateTime.now());
   	 	body.put(STATUS, HttpStatus.INTERNAL_SERVER_ERROR);
   	 	body.put(ERROR, "Thread is waiting, sleeping, or otherwise occupied, and the thread is interrupted, either before or during the activity");
        body.put(MESSAGE, ex.getMessage()  );
        body.put(TRACE,   Arrays.toString(ex.getStackTrace()));
    	return new ResponseEntity<Object>( body , HttpStatus.INTERNAL_SERVER_ERROR);

    }  
    
    @ExceptionHandler(value = { NotFoundException.class })
    protected ResponseEntity<Object> handleNotFoundExceptionGraph(NotFoundException ex) {
   	 	body.put(TIME_STAMP, LocalDateTime.now());
   	 	body.put(STATUS, HttpStatus.NOT_FOUND);
   	 	body.put(ERROR, "Not found");
        body.put(MESSAGE, ex.getMessage() );
        body.put(TRACE,   Arrays.toString(ex.getStackTrace()));
    	return new ResponseEntity<Object>( body , HttpStatus.NOT_FOUND);

    } 
    
    @ExceptionHandler(value = { Exception.class })
    protected ResponseEntity<Object> handleException(Exception ex) {
   	 	body.put(TIME_STAMP, LocalDateTime.now());
   	 	body.put(STATUS, HttpStatus.INTERNAL_SERVER_ERROR);
   	 	body.put(ERROR, "General Exception");
        body.put(MESSAGE, ex.getMessage() );
        body.put(TRACE,   Arrays.toString(ex.getStackTrace()));
    	return new ResponseEntity<Object>( body , HttpStatus.INTERNAL_SERVER_ERROR);

    } 
    
   
    
    @ExceptionHandler(value = { KeyManagementException.class })
    protected ResponseEntity<Object> handleKeyManagementException(KeyManagementException ex) {
   	 	body.put(TIME_STAMP, LocalDateTime.now());
   	 	body.put(STATUS, HttpStatus.INTERNAL_SERVER_ERROR);
   	 	body.put(ERROR, "General key management exception for all operations dealing with key management");
        body.put(MESSAGE, ex.getMessage() );
        body.put(TRACE,   Arrays.toString(ex.getStackTrace()));
    	return new ResponseEntity<Object>( body , HttpStatus.INTERNAL_SERVER_ERROR);

    } 
    
    @ExceptionHandler(value = { KeyStoreException.class })
    protected ResponseEntity<Object> handleKeyStoreException(KeyStoreException ex) {
   	 	body.put(TIME_STAMP, LocalDateTime.now());
   	 	body.put(STATUS, HttpStatus.INTERNAL_SERVER_ERROR);
   	 	body.put(ERROR, "Generic KeyStore exception");
        body.put(MESSAGE, ex.getMessage() );
        body.put(TRACE,   Arrays.toString(ex.getStackTrace()));
    	return new ResponseEntity<Object>( body , HttpStatus.INTERNAL_SERVER_ERROR);
    } 

    @ExceptionHandler(value = { NoSuchAlgorithmException.class })
    protected ResponseEntity<Object> handleNoSuchAlgorithmException(NoSuchAlgorithmException ex) {
   	 	body.put(TIME_STAMP, LocalDateTime.now());
   	 	body.put(STATUS, HttpStatus.INTERNAL_SERVER_ERROR);
   	 	body.put(ERROR, "Cryptographic algorithm is requested but is not available in the environment");
        body.put(MESSAGE, ex.getMessage() );
        body.put(TRACE,   Arrays.toString(ex.getStackTrace()));
    	return new ResponseEntity<Object>( body , HttpStatus.INTERNAL_SERVER_ERROR);

    } 
    
    
}
