package com.nttdata.model.symphony;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class VariableDefinition {

    private String key;
    private String name;
    private String type;
    private boolean mandatory;

    @JsonCreator
    public VariableDefinition(@JsonProperty("key") String key,
                              @JsonProperty("name") String name,
                              @JsonProperty("type") String type,
                              @JsonProperty("mandatory") boolean mandatory) {
        this.key = key;
        this.name = name;
        this.type = type;
        this.mandatory = mandatory;
    }
}
