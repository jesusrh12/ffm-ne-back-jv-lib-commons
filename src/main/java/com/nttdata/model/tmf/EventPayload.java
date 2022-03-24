package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * The event data structure
 */
@ApiModel(description = "The event data structure")
@JsonTypeName("EventPayload")
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class EventPayload extends BaseNode {

    @JsonProperty("serviceOrder")
    private ServiceOrder serviceOrder;

    @Override
    public String toString() {
        return "class ConstraintRef {\n" +
                "    serviceOrder: " + toIndentedString(serviceOrder) + "\n" +
                "}";
    }

}