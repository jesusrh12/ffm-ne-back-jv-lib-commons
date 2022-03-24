package com.nttdata.exceptions;


import java.util.List;

import com.nttdata.model.symphony.ParamDefinition;

public class BusinessWorkflowException extends BusinessException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6350766674915858152L;

	public BusinessWorkflowException(String message, List<ParamDefinition> paramDefinitions){

		super(message);
	}
}
