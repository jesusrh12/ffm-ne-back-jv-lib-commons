package com.nttdata.model.tmf638;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.Data;

/**
 * Constraint reference. The Constraint resource represents a policy/rule applied to an entity or entity spec.
 */
@JsonTypeName("ConstraintRef")
@Data
public class ConstraintRef {

    private Long id;
    private String name;

    private String href;
    private String version;
    @JsonProperty("@schemaLocation")
    private String schemaLocation;
    @JsonProperty("@baseType")
    private String baseType;
    @JsonProperty("@type")
    private String type;

}
