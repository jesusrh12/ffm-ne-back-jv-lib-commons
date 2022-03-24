package com.nttdata.model.symphony;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Param {

    public String type;
    public VariableDefinition variableDefinition;
    public PropertyTypeDefinition propertyTypeDefinition;
    public String expression;
    public List<BlockVariable> blockVariables;

    @JsonCreator
    public Param(@JsonProperty("type") String type,
                 @JsonProperty("variableDefinition") VariableDefinition variableDefinition,
                 @JsonProperty("propertyTypeDefinition") PropertyTypeDefinition propertyTypeDefinition,
                 @JsonProperty("expression") String expression,
                 @JsonProperty("blockVariables") List<BlockVariable> blockVariables) {
        this.type = type;
        this.variableDefinition = variableDefinition;
        this.propertyTypeDefinition = propertyTypeDefinition;
        this.expression = expression;
        this.blockVariables = blockVariables;
    }
}
