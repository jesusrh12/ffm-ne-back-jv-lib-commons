package com.nttdata.model.camunda;

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
public class ProcessInstance {

    private String id;
    private String definitionId;
    private String businessKey;
    private String caseInstanceId;
    private boolean ended;
    private boolean suspended;
    private String tenantId;
}
