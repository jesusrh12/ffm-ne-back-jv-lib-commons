package com.nttdata.model.symphony;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class InputPropertyTypeDefinition {
    private String id;
    private String name;
    private String stringValue;
    private String type;

    @JsonCreator
    public InputPropertyTypeDefinition(@JsonProperty("id") String id,
                                       @JsonProperty("name") String name,
                                       @JsonProperty("stringValue") String stringValue,
                                       @JsonProperty("type") String type) {
        this.id = id;
        this.name = name;
        this.stringValue = stringValue;
        this.type= type;
    }
}
