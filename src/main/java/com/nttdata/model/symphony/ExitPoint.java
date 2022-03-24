package com.nttdata.model.symphony;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ExitPoint {

    private String id;
    private String cid;
    private Condition condition;

    @JsonCreator
    public ExitPoint(@JsonProperty("id") String id,
                     @JsonProperty("cid") String cid,
                     @JsonProperty("condition") Condition condition) {
        this.id = id;
        this.cid = cid;
        this.condition = condition;
    }
}
