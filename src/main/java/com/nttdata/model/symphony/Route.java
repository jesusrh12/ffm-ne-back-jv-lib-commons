package com.nttdata.model.symphony;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Route {
    private ExitPoint exitPoint;

    @JsonCreator
    public Route(@JsonProperty("exitPoint") ExitPoint exitPoint) {
        this.exitPoint = exitPoint;
    }
}
