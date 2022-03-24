package com.nttdata.exceptions;

public class BusinessException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6350766674915858152L;

	public BusinessException(String message) {
		super(message);
	}
	
    public BusinessException()
    {
        super();
    }

}
