package com.nttdata.model.tmf;

import com.fasterxml.jackson.annotation.JsonTypeName;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Describes specific values for a given characteristic of an object or entity
 */
@ApiModel(description = "Describes specific values for a given characteristic of an object or entity")
@JsonTypeName("CharacteristicValue")
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CharacteristicValue {

    private String value;

    private String isDefault;

    private String unitOfMeasure;

    private String displayValue;
}
