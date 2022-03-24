package com.nttdata.model.symphony;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RefBlock {
    private String id;
    private String cid;

    @JsonCreator
    public RefBlock(@JsonProperty("id") String id,
                    @JsonProperty("cid") String cid) {
        this.id = id;
        this.cid = cid;
    }
}
