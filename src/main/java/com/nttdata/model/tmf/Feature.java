package com.nttdata.model.tmf;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.Data;

/**
 * Configuration feature.
 */
@JsonTypeName("Feature")
@Data
public class Feature {

    private Long id;
    private boolean isBundle;
    private boolean isEnabled;
    private String name;
    @JsonProperty("@schemaLocation")
    private String schemaLocation;
    @JsonProperty("@baseType")
    private String baseType;
    @JsonProperty("@type")
    private String type;

    private List<Feature> featureBindsTo = new ArrayList<>();
    private List<ConstraintRef> constraintRefs = new ArrayList<>();
    private List<Characteristic> featureCharacteritic = new ArrayList<>();


}
