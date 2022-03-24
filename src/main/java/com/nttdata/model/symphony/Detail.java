package com.nttdata.model.symphony;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Detail {

    private String __typename;
    private List<ParamDefinition> paramDefinitions;
    private List<Route> routes;
    private ActionType actionType;
    private List<Param> params;

    @JsonCreator
    public Detail(@JsonProperty("__typename") String __typename,
                  @JsonProperty("paramDefinitions") List<ParamDefinition> paramDefinitions,
                  @JsonProperty("routes") List<Route> routes,
                  @JsonProperty("actionType") ActionType actionType,
                  @JsonProperty("params") List<Param> params) {
        this.__typename = __typename;
        this.paramDefinitions = paramDefinitions;
        this.routes = routes;
        this.actionType = actionType;
        this.params = params;

    }
}
