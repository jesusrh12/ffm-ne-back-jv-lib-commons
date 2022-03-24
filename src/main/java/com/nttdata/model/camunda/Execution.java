package com.nttdata.model.camunda;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Execution {

    private String id;
    private String processInstanceId;
    private boolean ended;
    private String tenantId;
}
