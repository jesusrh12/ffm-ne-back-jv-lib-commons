package com.nttdata.model.tmf;

import java.util.StringJoiner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import lombok.Data;

@JsonTypeName("PatchService")
@Data
@JsonIgnoreProperties
public class PatchService {

	private String filter;
	private String serviceSOM;
	
	@Override
	public String toString() {
		StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
		joiner.add("filter: "+filter);
		joiner.add("set: "+serviceSOM);
		
		return joiner.toString();
	}

}
