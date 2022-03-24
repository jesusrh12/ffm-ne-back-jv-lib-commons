package com.nttdata.model.tmf;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Request for cancellation an existing Service order
 */
@ApiModel(description = "Request for cancellation an existing Service order")
@JsonTypeName("CancelServiceOrder")
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class CancellationRequest extends BaseNode {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("externalId")
    private String externalId;

    @JsonProperty("href")
    private String href;

    @JsonProperty("cancellationReason")
    private String cancellationReason;

    @JsonProperty("effectiveCancellationDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date effectiveCancellationDate;

    @JsonProperty("requestedCancellationDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private Date requestedCancellationDate;

    @JsonProperty("serviceOrder")
    private ServiceOrder serviceOrder;

    @JsonProperty("state")
    private TaskStateType state;

    @JsonProperty("flowExecutionRef")
    private FlowExecutionRef flowExecutionRef;

    @Override
    public String toString() {
        return "class CancelServiceOrder {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    href: " + toIndentedString(href) + "\n" +
                "    cancellationReason: " + toIndentedString(cancellationReason) + "\n" +
                "    effectiveCancellationDate: " + toIndentedString(effectiveCancellationDate) + "\n" +
                "    requestedCancellationDate: " + toIndentedString(requestedCancellationDate) + "\n" +
                "    serviceOrder: " + toIndentedString(serviceOrder) + "\n" +
                "    state: " + toIndentedString(state) + "\n" +
                "    flowExecutionRef: " + toIndentedString(flowExecutionRef) + "\n" +
                "    atBaseType: " + toIndentedString(_atBaseType) + "\n" +
                "    atSchemaLocation: " + toIndentedString(_atSchemaLocation) + "\n" +
                "    atType: " + toIndentedString(_atType) + "\n" +
                "}";
    }

}