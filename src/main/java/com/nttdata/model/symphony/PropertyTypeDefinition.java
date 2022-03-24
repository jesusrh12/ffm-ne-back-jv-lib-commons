package com.nttdata.model.symphony;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PropertyTypeDefinition {
    public String id;
    public String name;
    public Object stringValue;
    private String type;

    @JsonCreator
    public PropertyTypeDefinition(@JsonProperty("id") String id,
                                  @JsonProperty("name") String name,
                                  @JsonProperty("stringValue") Object stringValue,
                                  @JsonProperty("type") String type) {
        this.id = id;
        this.name = name;
        this.stringValue = stringValue;
        this.type = type;
    }
}
