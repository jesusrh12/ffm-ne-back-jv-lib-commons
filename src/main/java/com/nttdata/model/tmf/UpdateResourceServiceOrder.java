package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@JsonTypeName("UpdateResourceServiceOrder")
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class UpdateResourceServiceOrder extends BaseNode {

	
	 @JsonProperty("id")
	    private Long id;

	    @JsonProperty("requestedUpdateDate")
	    private String requestedUpdateDate;

	   
	    @JsonProperty("resourceData")
	    private String resourceData;
	    
    
	    
	    @JsonProperty("serviceOrder")
	    private ServiceOrder serviceOrder;
	    
	    
	    @Override
	    public String toString() {
	        return "class UpdateResourceServiceOrder {\n" +
	                "    requestedUpdateDate: " + toIndentedString(requestedUpdateDate) + "\n" +
	                "    resourceData: " + toIndentedString(resourceData) + "\n" +
	                "    _atType: " + toIndentedString(_atType) + "\n" +
	                "    serviceOrder: " + toIndentedString(serviceOrder) + "\n" +

	                "}";
	    }
}
