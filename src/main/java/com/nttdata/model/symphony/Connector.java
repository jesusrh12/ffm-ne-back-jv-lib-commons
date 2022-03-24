package com.nttdata.model.symphony;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Connector {
    private Source source;
    private Target target;

    @JsonCreator
    public Connector(@JsonProperty("source") Source source,
                     @JsonProperty("target") Target target) {
        this.source = source;
        this.target = target;
    }
}
