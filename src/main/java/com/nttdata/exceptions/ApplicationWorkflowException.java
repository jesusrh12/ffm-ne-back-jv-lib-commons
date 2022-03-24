package com.nttdata.exceptions;

import java.util.List;

import com.nttdata.model.symphony.ParamDefinition;

public class ApplicationWorkflowException extends ApplicationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5296239031191966998L;
	
	public ApplicationWorkflowException(String message, List<ParamDefinition> paramDefinitions){
		super(message);
	}

}
