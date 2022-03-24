package com.nttdata.model.camunda;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StartProcessInstanceResponse {

    private String id;
    private String definitionId;
    private String businessKey;
    private String caseInstanceId;
    private String tenantId;
    private boolean ended;
    private boolean suspended;
//    private List<Links> links;
    private Map<String, Variables> variables;
}
