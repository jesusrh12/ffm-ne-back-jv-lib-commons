package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.URI;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseNode {
    @JsonProperty("@baseType")
    String _atBaseType;

    @JsonProperty("@schemaLocation")
    URI _atSchemaLocation;

    @JsonProperty("@type")
    String _atType;

    @JsonProperty("@referredType")
    String _atReferredType;

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    public String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}