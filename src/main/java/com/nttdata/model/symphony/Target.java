package com.nttdata.model.symphony;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Target {
    private String id;
    private RefBlock parentBlock;

    @JsonCreator
    public Target(@JsonProperty("id") String id,
                  @JsonProperty("parentBlock") RefBlock parentBlock) {
        this.id = id;
        this.parentBlock = parentBlock;
    }
}
