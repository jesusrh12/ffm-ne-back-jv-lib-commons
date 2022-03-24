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
public class StartProcessInstanceRequest {

    private Map<String, Variables> variables;
    private String businessKey;
    private String caseInstanceId;
//    private List<StartInstructions> startInstructions;
    private boolean skipCustomListeners;
    private boolean skipIoMappings;
    private boolean withVariablesInReturn;

}
