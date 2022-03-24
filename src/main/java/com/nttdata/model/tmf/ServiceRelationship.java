package com.nttdata.model.tmf;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.nttdata.model.tmf638.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * ServiceRelationship
 */

@JsonTypeName("ServiceRelationship")
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class ServiceRelationship extends BaseNode {

    @JsonProperty("relationshipType")
    private String relationshipType;

    @JsonProperty("service")
    private Service service;

    @JsonProperty("serviceRelationshipCharacteristic")
    private List<Characteristic> serviceRelationshipCharacteristic;


}