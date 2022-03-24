package com.nttdata.model.symphony;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class InputVariableDefinition {
    private String key;
    private String type;
    private String name;
    private boolean mandatory;

    @JsonCreator
    public InputVariableDefinition(@JsonProperty("key") String key,
                                   @JsonProperty("type") String type,
                                   @JsonProperty("name") String name,
                                   @JsonProperty("mandatory") boolean mandatory
                                   ) {
        this.key = key;
        this.type = type;
        this.name = name;
        this.mandatory = mandatory;
    }
}
