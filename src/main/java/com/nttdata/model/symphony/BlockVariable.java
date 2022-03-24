package com.nttdata.model.symphony;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BlockVariable {
    private String type;
    private RefBlock refBlock;
    private InputVariableDefinition inputVariableDefinition;
    private InputPropertyTypeDefinition inputPropertyTypeDefinition;
    private Object variableDefinition;
    private PropertyTypeDefinition propertyTypeDefinition;
    private String expression;
    private Object blockVariables;

    @JsonCreator
    public BlockVariable(@JsonProperty("type") String type,
                         @JsonProperty("block") RefBlock refBlock,
                         @JsonProperty("inputVariableDefinition") InputVariableDefinition inputVariableDefinition,
                         @JsonProperty("inputPropertyTypeDefinition") InputPropertyTypeDefinition inputPropertyTypeDefinition,
                         @JsonProperty("variableDefinition") Object variableDefinition,
                         @JsonProperty("propertyTypeDefinition") PropertyTypeDefinition propertyTypeDefinition,
                         @JsonProperty("expression") String expression,
                         @JsonProperty("blockVariables") Object blockVariables) {
        this.type = type;
        this.refBlock = refBlock;
        this.inputVariableDefinition = inputVariableDefinition;
        this.inputPropertyTypeDefinition = inputPropertyTypeDefinition;
        this.variableDefinition = variableDefinition;
        this.propertyTypeDefinition = propertyTypeDefinition;
        this.expression = expression;
        this.blockVariables = blockVariables;
    }
}
