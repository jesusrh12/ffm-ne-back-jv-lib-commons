package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.net.URI;

/**
 * ServiceOrderItemRef
 */
@JsonTypeName("ServiceOrderItemRef")
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class ServiceOrderItemRef extends BaseNode {

    @JsonProperty("itemId")
    private String itemId;

    @JsonProperty("serviceOrderHref")
    private URI serviceOrderHref;

    @JsonProperty("serviceOrderId")
    private String serviceOrderId;

    @Override
    public String toString() {
        return "class ServiceOrderItemRef {\n" +
                "    itemId: " + toIndentedString(itemId) + "\n" +
                "    serviceOrderHref: " + toIndentedString(serviceOrderHref) + "\n" +
                "    serviceOrderId: " + toIndentedString(serviceOrderId) + "\n" +
                "    atBaseType: " + toIndentedString(_atBaseType) + "\n" +
                "    atSchemaLocation: " + toIndentedString(_atSchemaLocation) + "\n" +
                "    atType: " + toIndentedString(_atType) + "\n" +
                "    atReferredType: " + toIndentedString(_atReferredType) + "\n" +
                "}";
    }

}