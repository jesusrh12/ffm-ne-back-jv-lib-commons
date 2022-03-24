package com.nttdata.model.tmf638;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.nttdata.model.tmf.BaseNode;
import com.nttdata.model.tmf.TimePeriod;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Configuration feature
 */
@ApiModel(description = "Configuration feature")
@JsonTypeName("FeatureRelationship")
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class FeatureRelationship /*extends BaseNode*/ {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("relationshipType")
    private String relationshipType;

    @JsonProperty("validFor")
    private TimePeriod validFor;
/*
    @Override
    public String toString() {
        return "class FeatureRelationship {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    name: " + toIndentedString(name) + "\n" +
                "    relationshipType: " + toIndentedString(relationshipType) + "\n" +
                "    validFor: " + toIndentedString(validFor) + "\n" +
                "    atBaseType: " + toIndentedString(_atBaseType) + "\n" +
                "    atSchemaLocation: " + toIndentedString(_atSchemaLocation) + "\n" +
                "    atType: " + toIndentedString(_atType) + "\n" +
                "}";
    }
*/
}