package com.nttdata.model.tmf;

import java.util.StringJoiner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;

import lombok.Data;

@JsonTypeName("Filter")
@Data
@JsonIgnoreProperties
public class FilterTO {

	private String id;
	
	@Override
	public String toString() {
		StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
		if (id != null) {
			joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
		}
		return joiner.toString();
	}
	
}
