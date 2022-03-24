package com.nttdata.model.tmf638;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.Data;

@Data
@JsonTypeName("RelatedEntityRefOrValue")
public class RelatedEntityRefOrValue {

	private String href;
	private Long id;
	private String name;
	private String role;
	
	@JsonProperty("@baseType")
    private String baseType;

	@JsonProperty("@referredType")
	private String referredType;
	
    @JsonProperty("@schemaLocation")
    private String schemaLocation;

    @JsonProperty("@type")
    private String type;
		
}
