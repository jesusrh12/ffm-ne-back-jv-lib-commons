package com.nttdata.model.camunda;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CorrelateMessageResponse {

    private String resultType;
    private ProcessInstance processInstance;
    private Execution execution;
    private Map<String, Variables> variables;
}
