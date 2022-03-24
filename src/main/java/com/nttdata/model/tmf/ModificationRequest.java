package com.nttdata.model.tmf;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@JsonTypeName("ModifyDateServiceOrder")
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class ModificationRequest extends BaseNode {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("modifyReason")
    private String modifyReason;

    @JsonProperty("externalId")
    private String externalId;

    @JsonProperty("completionDate")
    private Date completionDate;

    @JsonProperty("requestedCompletionDate")
    private Date requestedCompletionDate;

    @JsonProperty("serviceOrder")
    private ServiceOrder serviceOrder;

    @Override
    public String toString() {
        return "class ModifyDateServiceOrder {\n" +
                "    modifyReason: " + toIndentedString(modifyReason) + "\n" +
                "    externalId: " + toIndentedString(externalId) + "\n" +
                "    completionDate: " + toIndentedString(completionDate) + "\n" +
                "    requestedCompletionDate: " + toIndentedString(requestedCompletionDate) + "\n" +
                "    serviceOrder: " + toIndentedString(serviceOrder) + "\n" +
                "    atBaseType: " + toIndentedString(_atBaseType) + "\n" +
                "    atSchemaLocation: " + toIndentedString(_atSchemaLocation) + "\n" +
                "    atType: " + toIndentedString(_atType) + "\n" +
                "}";
    }

}