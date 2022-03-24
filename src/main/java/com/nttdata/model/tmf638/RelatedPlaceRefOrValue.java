package com.nttdata.model.tmf638;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.Data;

@Data
@JsonTypeName("ReletedPleaceRefOrValue")
public class RelatedPlaceRefOrValue{

	private String href;
	private Long id;
	private String name;
	private String role;
	
	@JsonProperty("@baseType")
    private String _atBaseType;

    @JsonProperty("@referredType")
    private String _atReferredType;
    
    @JsonProperty("@schemaLocation")
    private String _atSchemaLocation;

    @JsonProperty("@type")
    private String _atType;
}
