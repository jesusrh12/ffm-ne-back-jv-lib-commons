package com.nttdata.model.symphony;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UIRepresentation {

    private String name;
    private int xPosition;
    private int yPosition;

    @JsonCreator
    public UIRepresentation(@JsonProperty("name") String name,
                            @JsonProperty("xPosition") int xPosition,
                            @JsonProperty("yPosition") int yPosition) {
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }
}
