package com.nttdata.model.tmf;

import java.util.List;

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
@JsonTypeName("SpecCharacteristic")
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SpecCharacteristic {

    private String name;

    private String description;

    private String valueType;

    private String configurable;

    private String  valueRangeFrom;

    private String valueRangeTo;

    private String valueRangeStep;

    private String valueRangeInterval;

    private String mandatory;

    private String regex;

    private String regexExample;

    private List<CharacteristicValue> characteristicValues;

    private List<String> domains;

    
}
