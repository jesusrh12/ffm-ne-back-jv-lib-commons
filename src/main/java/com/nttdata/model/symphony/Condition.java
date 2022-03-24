package com.nttdata.model.symphony;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Condition {

    private String expression;
    private List<BlockVariable> blockVariables;

    @JsonCreator
    public Condition(@JsonProperty("expression") String expression,
                     @JsonProperty("blockVariables") List<BlockVariable> blockVariables) {
        this.expression = expression;
        this.blockVariables = blockVariables;
    }
}
