package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Linked service order to the one containing this attribute
 */
@ApiModel(description = "Linked service order to the one containing this attribute")
@JsonTypeName("ServiceOrderRelationship")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceOrderRelationship extends BaseNode {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("href")
    private String href;

    @JsonProperty("relationshipType")
    private String relationshipType;


}