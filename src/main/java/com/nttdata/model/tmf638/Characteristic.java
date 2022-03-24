package com.nttdata.model.tmf638;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.nttdata.model.tmf.BaseNode;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Describes a given characteristic of an object or entity through a name/value pair.
 */
@ApiModel(description = "Describes a given characteristic of an object or entity through a name/value pair.")
@JsonTypeName("characteristic")
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Characteristic extends BaseNode {

    private Long characteristicId;

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("valueType")
    private String valueType;

    @JsonProperty("unitOfMeasure")
    private String unitOfMeasure;

    @JsonProperty("value")
    private String value;
    @JsonProperty("valueUnits")
    private String valueUnits;
}