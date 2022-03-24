package com.nttdata.model.tmf638;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.nttdata.model.tmf.BaseNode;
import com.nttdata.model.tmf.OrderItemActionType;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * RelatedServiceOrderItem (a ServiceOrder item) .The service order item which triggered service
 * creation/change/termination.
 */
@ApiModel(description = "RelatedServiceOrderItem (a ServiceOrder item) .The service order item which triggered" +
        "service creation/change/termination.")
@JsonTypeName("RelatedServiceOrderItem")
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class RelatedServiceOrderItem /*extends BaseNode*/ {

    @JsonProperty("itemId")
    private String itemId;

    @JsonProperty("role")
    private String role;

    @JsonProperty("serviceOrderHref")
    private String serviceOrderHref;

    @JsonProperty("serviceOrderId")
    private String serviceOrderId;

    @JsonProperty("itemAction")
    private OrderItemActionType itemAction;
/*
    @Override
    public String toString() {
        return "class RelatedServiceOrderItem {\n" +
                "    itemId: " + toIndentedString(itemId) + "\n" +
                "    role: " + toIndentedString(role) + "\n" +
                "    serviceOrderHref: " + toIndentedString(serviceOrderHref) + "\n" +
                "    serviceOrderId: " + toIndentedString(serviceOrderId) + "\n" +
                "    itemAction: " + toIndentedString(itemAction) + "\n" +
                "    atBaseType: " + toIndentedString(_atBaseType) + "\n" +
                "    atSchemaLocation: " + toIndentedString(_atSchemaLocation) + "\n" +
                "    atType: " + toIndentedString(_atType) + "\n" +
                "    atReferredType: " + toIndentedString(_atReferredType) + "\n" +
                "}";
    }
*/
}