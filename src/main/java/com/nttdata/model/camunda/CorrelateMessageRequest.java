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
public class CorrelateMessageRequest {

    private String messageName;
    private String businessKey;
    private String tenantId;
    private boolean withoutTenantId;
    private String processInstanceId;
    private Map<String, Variables> correlationKeys;
    private Map<String, Variables> processVariables;
    private Map<String, Variables> processVariablesLocal;
    private boolean all;
    private boolean resultEnabled;
    private boolean variablesInResultEnabled;

}
