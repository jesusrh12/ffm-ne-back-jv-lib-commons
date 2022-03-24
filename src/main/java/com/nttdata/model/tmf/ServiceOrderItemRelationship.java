package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Linked service order item to the one containing this attribute
 */
@ApiModel(description = "Linked service order item to the one containing this attribute")
@JsonTypeName("ServiceOrderItemRelationship")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceOrderItemRelationship extends BaseNode {

    @JsonProperty("relationshipType")
    private String relationshipType;

    @JsonProperty("orderItem")
    private ServiceOrderItemRef orderItem;


}