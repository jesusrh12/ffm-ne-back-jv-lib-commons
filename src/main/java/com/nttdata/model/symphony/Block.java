package com.nttdata.model.symphony;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Block {
    private String cid;
    private String id;
    private Detail detail;
    private UIRepresentation uiRepresentation;
    private String serviceOrderId;
    private List<NextBlock> nextBlocks;

    @JsonCreator
    public Block(@JsonProperty("cid") String cid,
                 @JsonProperty("id") String id,
                 @JsonProperty("details") Detail detail,
                 @JsonProperty("uiRepresentation") UIRepresentation uiRepresentation,
                 @JsonProperty("nextBlocks") List<NextBlock> nextBlocks) {
        this.cid = cid;
        this.id = id;
        this.detail = detail;
        this.uiRepresentation = uiRepresentation;
        this.nextBlocks = nextBlocks;
    }
}
