package com.nttdata.model.symphony;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class NextBlock {
    private String cid;
    private UIRepresentation uiRepresentation;
    private String id;

    @JsonCreator
    public NextBlock(@JsonProperty("cid") String cid,
                     @JsonProperty("uiRepresentation") UIRepresentation uiRepresentation,
                     @JsonProperty("id") String id) {
        this.cid = cid;
        this.uiRepresentation = uiRepresentation;
        this.id = id;
    }
}
