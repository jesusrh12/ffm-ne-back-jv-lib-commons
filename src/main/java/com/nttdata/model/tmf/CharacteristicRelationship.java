package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Another Characteristic that is related to the current Characteristic;
 */
@ApiModel(description = "Another Characteristic that is related to the current Characteristic;")
@JsonTypeName("CharacteristicRelationship")
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
public class CharacteristicRelationship extends BaseNode {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("relationshipType")
    private String relationshipType;

    @Override
    public String toString() {
        return "class CharacteristicRelationship {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    relationshipType: " + toIndentedString(relationshipType) + "\n" +
                "    atBaseType: " + toIndentedString(_atBaseType) + "\n" +
                "    atSchemaLocation: " + toIndentedString(_atSchemaLocation) + "\n" +
                "    atType: " + toIndentedString(_atType) + "\n" +
                "}";
    }

}