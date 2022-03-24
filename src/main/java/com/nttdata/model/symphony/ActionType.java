package com.nttdata.model.symphony;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ActionType {
    private String id;
    private String description;

    @JsonCreator
    public ActionType(@JsonProperty("id") String id,
                      @JsonProperty("description") String description) {
        this.id = id;
        this.description = description;
    }
}
