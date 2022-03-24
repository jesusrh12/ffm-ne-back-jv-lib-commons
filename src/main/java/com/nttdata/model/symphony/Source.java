package com.nttdata.model.symphony;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Source {
    private String id;
    private String cid;
    private RefBlock parentBlock;

    @JsonCreator
    public Source(@JsonProperty("id") String id,
                  @JsonProperty("cid") String cid,
                  @JsonProperty("parentBlock") RefBlock parentBlock) {
        this.id = id;
        this.cid = cid;
        this.parentBlock = parentBlock;
    }
}
