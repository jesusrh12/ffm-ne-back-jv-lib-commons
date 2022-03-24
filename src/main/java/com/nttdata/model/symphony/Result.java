package com.nttdata.model.symphony;

import lombok.Data;

import java.util.List;

import com.nttdata.model.symphony.ParamDefinition;

@Data
public class Result {
	private List<ParamDefinition> resultList;
	private String cid;
}