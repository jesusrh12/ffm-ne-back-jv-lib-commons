package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Configuration feature.
 */
@ApiModel(description = "Flow Execution Reference.")
@JsonTypeName("FlowExecutionRef")
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class FlowExecutionRef extends BaseNode {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("domainId")
    private String domainId;

    @JsonProperty("workflowId")
    private String workflowId;

    @JsonProperty("runId")
    private String runId;

    @JsonProperty("projectId")
    private String projectId;
    
    @JsonProperty("baseFlow")
    private String baseFlow;

    @JsonProperty("flowExecutionRef")
    private FlowExecutionRef flowExecutionRef;

    @JsonProperty("creationDate")
    private String creationDate;

    @JsonProperty("executionDate")
    private String executionDate;

    @JsonProperty("endExecutionDate")
    private String endExecutionDate;


    @Override
    public String toString() {
        return "class FlowExecutionRef {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    domainId: " + toIndentedString(domainId) + "\n" +
                "    workflowId: " + toIndentedString(workflowId) + "\n" +
                "    runId: " + toIndentedString(runId) + "\n" +
                "    projectId: " + toIndentedString(projectId) + "\n" +
                "    baseFlow: " + toIndentedString(baseFlow) + "\n" +
                "    flowExecutionRef: " + toIndentedString(flowExecutionRef) + "\n" +
                "    atBaseType: " + toIndentedString(_atBaseType) + "\n" +
                "    atSchemaLocation: " + toIndentedString(_atSchemaLocation) + "\n" +
                "    creationDate: " + toIndentedString(creationDate) + "\n" +
                "    executionDate: " + toIndentedString(executionDate) + "\n" +
                "    endExecutionDate: " + toIndentedString(endExecutionDate) + "\n" +
                "    atType: " + toIndentedString(_atType) + "\n" +
                "}";
    }

}